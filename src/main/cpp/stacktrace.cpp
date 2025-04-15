

#include "./stacktrace.h"

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


// global thread local c++ stack trace storage, is used when we throw a java exception, to setup the stack trace of that Throwable!
thread_local std::vector<CPPStackTraceEntry> _g_cpp_stack_trace_local = {};


void CPPStackTraceEntry::add_stack_trace_to_throwable(JNIEnv* env, jthrowable throwable) {

    // ATTENTION: can't check for thrown exceptions, as there might already one pendnign, when invoking this method

    // see e.g. https://stackoverflow.com/questions/39712695/how-to-dynamically-generate-a-stack-frame-with-debug-log-information
    // and docs at: https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Throwable.html

    std::string stack_trace_element_array_type = std::string{TYPE_FOR_ARRAY(})+JStackTraceElement::java_type;


    jclass jthrowable_class = env->FindClass(JThrowable::java_class);

    if (jthrowable_class == nullptr) {
        throw JavaException(
                NoClassDefFoundError, std::string{ "No class with the name '" } + JThrowable::java_class + "' found"
        );
    }

    //TODO: compare previous with curretn exception, if thy are the same, no new one was thrown!
    /*  if (env->ExceptionCheck() == JNI_TRUE) {
        throw JavaExceptionAlreadyThrown();
    } */

    std::string get_stack_trace_function_name = "getStackTrace";

    std::string get_stack_trace_function_signature = method_type("", stack_trace_element_array_type);

    jmethodID get_stack_trace_function = env->GetMethodID(
            jthrowable_class, get_stack_trace_function_name.c_str(), get_stack_trace_function_signature.c_str()
    );

    if (get_stack_trace_function == nullptr) {
        throw JavaException(
                NoSuchMethodError, "No method with the name '" + get_stack_trace_function_name + "' and signature '"
                                           + get_stack_trace_function_signature + "' found!"
        );
    }

    //TODO: same as above
    /*   if (env->ExceptionCheck() == JNI_TRUE) {
        throw JavaExceptionAlreadyThrown();
    } */

    jobject current_stack_trace = env->CallObjectMethod(throwable, get_stack_trace_function);

    jobjectArray current_stack_trace_array = static_cast<jobjectArray>(current_stack_trace);

    if (current_stack_trace == nullptr) {
        throw JavaException(RuntimeException, "Error in call to Throwable::getStackTrace");
    }

    //TODO: same as above
    /*  if (env->ExceptionCheck() == JNI_TRUE) {
        throw JavaExceptionAlreadyThrown();
    } */

    jclass stack_trace_element_class = env->FindClass(JStackTraceElement::java_class);

    if (stack_trace_element_class == nullptr) {
        std::string error = "No class with the name '";
        error += JStackTraceElement::java_class;
        error += "' found";

        throw JavaException(NoClassDefFoundError, error);
    }

    //TODO: same as above
    /*  if (env->ExceptionCheck() == JNI_TRUE) {
        throw JavaExceptionAlreadyThrown();
    } */

    jsize array_length = env->GetArrayLength(current_stack_trace_array);

    jsize new_length = array_length + static_cast<jsize>(_g_cpp_stack_trace_local.size());

    jobjectArray new_stack_trace_array = env->NewObjectArray(new_length, stack_trace_element_class, nullptr);

    for (jsize i = 0; i < array_length; ++i) {
        jobject old_value = env->GetObjectArrayElement(current_stack_trace_array, i);

        env->SetObjectArrayElement(new_stack_trace_array, i, old_value);
    }


    for (jsize i = 0; i < static_cast<jsize>(_g_cpp_stack_trace_local.size()); ++i) {
        auto& cpp_stack_trace = _g_cpp_stack_trace_local.at(i);

        jobject java_stack_trace_element = cpp_stack_trace.to_java_stack_trace_element(env);

        env->SetObjectArrayElement(new_stack_trace_array, i + array_length, java_stack_trace_element);
    }


    // set the value


    std::string set_stack_trace_function_name = "setStackTrace";

    std::string set_stack_trace_function_signature = method_type(stack_trace_element_array_type, VOID_LITERAL_TYPE);

    jmethodID set_stack_trace_function = env->GetMethodID(
            jthrowable_class, set_stack_trace_function_name.c_str(), set_stack_trace_function_signature.c_str()
    );

    if (set_stack_trace_function == nullptr) {
        throw JavaException(
                NoSuchMethodError, "No method with the name '" + set_stack_trace_function_name + "' and signature '"
                                           + set_stack_trace_function_signature + "' found!"
        );
    }

    //TODO: same as above
    /*  if (env->ExceptionCheck() == JNI_TRUE) {
        throw JavaExceptionAlreadyThrown();
    } */

    env->CallVoidMethod(throwable, set_stack_trace_function, new_stack_trace_array);

    //TODO: same as above
    /* if (env->ExceptionCheck() == JNI_TRUE) {
        throw JavaExceptionAlreadyThrown();
    } */
}

void RAAIStackTraceEntry::add_stack_trace_element(CPPStackTraceEntry&& entry) {
    _g_cpp_stack_trace_local.emplace_back(std::move(entry));
}

void RAAIStackTraceEntry::remove_stack_trace_element() {

    while (_g_cpp_stack_trace_local.size() > m_stack_size_on_add) {
        _g_cpp_stack_trace_local.pop_back();
    }
}

RAAIStackTraceEntry::RAAIStackTraceEntry(CPPStackTraceEntry&& entry)
    : m_stack_size_on_add{ _g_cpp_stack_trace_local.size() } {
    RAAIStackTraceEntry::add_stack_trace_element(std::move(entry));
}

RAAIStackTraceEntry::~RAAIStackTraceEntry() {
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
