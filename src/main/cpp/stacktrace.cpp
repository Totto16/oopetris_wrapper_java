

#include "./stacktrace.h"

#include <optional>
#include <vector>

[[nodiscard]] jobject CPPStackTraceEntry::to_java_stack_trace_element(JNIEnv* env) const {

    // see https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/StackTraceElement.html#%3Cinit%3E(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,int)

    jstring classLoaderName = JNI_get_jstring(env, JAVA_OOPETRIS_CLASS("Recordings"));

    jstring moduleName = JNI_get_jstring(env, JAVA_OOPETRIS_CLASS_NAME);

    jstring moduleVersion = nullptr;

    jstring declaringClass = JNI_get_jstring(env, m_class_name);

    jstring methodName = JNI_get_jstring(env, m_method_name);

    jstring fileName = JNI_get_jstring(env, m_file_name);

    jint lineNumber = static_cast<jint>(m_line_number);

    const auto [_, jstacktrace_element] = construct_new_java_object<JStackTraceElement>(
            env, classLoaderName, moduleName, moduleVersion, declaringClass, methodName, fileName, lineNumber
    );

    return jstacktrace_element;
}

namespace {
    struct CppStackTraceObect {
    private:
        std::vector<CPPStackTraceEntry> m_entries{};

        // with this mark we support self cleanup of stack frames, that might be needed by the exception catch body, but the body recovers everything and we need a partial stack frame, that remains, but the old one needs to be present, so that the body can use the stack frame of the place, hwere the exception was thrown
        std::optional<std::size_t> m_mark = std::nullopt;

        void clean_up_orphaned_entries() {
            while (m_entries.size() > m_mark.value()) {
                m_entries.pop_back();
            }

            m_mark = std::nullopt;
        }

    public:
        CppStackTraceObect() = default;

        [[nodiscard]] const std::vector<CPPStackTraceEntry>& entries() const {
            return m_entries;
        }

        [[nodiscard]] std::vector<CPPStackTraceEntry>& entries() {
            return m_entries;
        }

        void mark_relevant_for_exception_index(std::size_t index) {
            m_mark = index;
        }

        void clean_up_orphaned_entries_if_necessary() {
            if (m_mark.has_value()) {
                clean_up_orphaned_entries();
            }
        }

        void add_new_entry(CPPStackTraceEntry&& entry) {
            // if the user doesn't clean up orphaned entries after an excprion was thrown, do it here
            if (m_mark.has_value()) {
                clean_up_orphaned_entries();
            }

            m_entries.emplace_back(std::move(entry));
        }
    };

} // namespace


// global thread local c++ stack trace storage, is used when we throw a java exception, to setup the stack trace of that Throwable!
thread_local CppStackTraceObect _g_cpp_stack_trace_local = {};


jthrowable CPPStackTraceEntry::add_stack_trace_to_throwable(JNIEnv* env, jthrowable throwable) {

    try {

        // see e.g. https://stackoverflow.com/questions/39712695/how-to-dynamically-generate-a-stack-frame-with-debug-log-information
        // and docs at: https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Throwable.html

    std::string stack_trace_element_array_type = std::string{TYPE_FOR_ARRAY(})+JStackTraceElement::java_type;

    const auto [jthrowable_class, get_stack_trace_function] = get_method_for_class(
            env, JThrowable::java_class, "getStackTrace", method_type("", stack_trace_element_array_type)
    );

    jobject current_stack_trace = env->CallObjectMethod(throwable, get_stack_trace_function);

    jobjectArray current_stack_trace_array = static_cast<jobjectArray>(current_stack_trace);

    if (env->ExceptionCheck() == JNI_TRUE) {
        throw JavaExceptionAlreadyThrown();
    }

    if (current_stack_trace == nullptr) {
        throw JavaException(RuntimeException, "Error in call to Throwable::getStackTrace");
    }

    jclass stack_trace_element_class = env->FindClass(JStackTraceElement::java_class);

    if (env->ExceptionCheck() == JNI_TRUE) {
        throw JavaExceptionAlreadyThrown();
    }

    if (stack_trace_element_class == nullptr) {
        std::string error = "No class with the name '";
        error += JStackTraceElement::java_class;
        error += "' found";

        throw JavaException(NoClassDefFoundError, error);
    }

    jsize array_length = env->GetArrayLength(current_stack_trace_array);

    const auto& entries = _g_cpp_stack_trace_local.entries();

    jsize entries_length = static_cast<jsize>(entries.size());

    jsize new_length = array_length + entries_length;

    jobjectArray new_stack_trace_array = env->NewObjectArray(new_length, stack_trace_element_class, nullptr);

    // add the entries in reverse order
    for (jsize i = 0; i < entries_length; ++i) {
        const auto& cpp_stack_trace = entries.at(i);

        jobject java_stack_trace_element = cpp_stack_trace.to_java_stack_trace_element(env);

        env->SetObjectArrayElement(new_stack_trace_array, entries_length - i - 1, java_stack_trace_element);
    }


    // add them entries_length later, since they are already in the correct order
    for (jsize i = 0; i < array_length; ++i) {
        jobject old_value = env->GetObjectArrayElement(current_stack_trace_array, i);

        env->SetObjectArrayElement(new_stack_trace_array, i + entries_length, old_value);
    }

    // set the value

    const auto [_2, set_stack_trace_function] = get_method_for_class(
            env, jthrowable_class, "setStackTrace", method_type(stack_trace_element_array_type, VOID_LITERAL_TYPE)
    );

    env->CallVoidMethod(throwable, set_stack_trace_function, new_stack_trace_array);

    if (env->ExceptionCheck() == JNI_TRUE) {
        throw JavaExceptionAlreadyThrown();
    }

    // clean up the now no more needed entries
    _g_cpp_stack_trace_local.clean_up_orphaned_entries_if_necessary();

    return throwable;

    // if such exception happen, just report them as Fatal, as this function should enver fail in any way!
    } catch (const std::runtime_error& raw_exception) {
        std::string fatal_error = "While adding a stack trace to a exception, another exception was thrown: ";
        fatal_error += raw_exception.what();

        JNI_fatal_error(env, fatal_error);
    }
}


void RAAIStackTraceEntry::add_stack_trace_element(CPPStackTraceEntry&& entry) {
    _g_cpp_stack_trace_local.add_new_entry(std::move(entry));
}

void RAAIStackTraceEntry::remove_stack_trace_element() {

    while (_g_cpp_stack_trace_local.entries().size() > m_stack_size_on_add) {
        _g_cpp_stack_trace_local.entries().pop_back();
    }
}


void RAAIStackTraceEntry::mark_stack_trace_element_as_relevant_for_exception() {
    _g_cpp_stack_trace_local.mark_relevant_for_exception_index(m_stack_size_on_add);
}


RAAIStackTraceEntry::RAAIStackTraceEntry(CPPStackTraceEntry&& entry)
    : m_stack_size_on_add{ _g_cpp_stack_trace_local.entries().size() } {
    RAAIStackTraceEntry::add_stack_trace_element(std::move(entry));
}

RAAIStackTraceEntry::~RAAIStackTraceEntry() {
    if (std::uncaught_exceptions() > 0) {
        mark_stack_trace_element_as_relevant_for_exception();
        return;
    }
    remove_stack_trace_element();
}

CPPStackTraceEntry::CPPStackTraceEntry(
        std::string class_name,
        std::string method_name,
        std::string file_name,
        int line_number
)
    : m_class_name{ class_name },
      m_method_name{ method_name },
      m_file_name{ file_name },
      m_line_number{ line_number } { }
