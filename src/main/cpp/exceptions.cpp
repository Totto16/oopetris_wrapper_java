

#include "./exceptions.h"
#include "./stacktrace.h"

JavaException::JavaException(std::string class_name)
    : std::runtime_error{ "JavaException" },
      m_class_name{ class_name },
      m_message{ "" } { }

JavaException::JavaException(std::string class_name, std::string message)
    : std::runtime_error{ "JavaException" },
      m_class_name{ class_name },
      m_message{ message } { }

void JavaException::throw_java_exception(JNIEnv* env) const {
    JNI_throw_java_exception(env, this->m_class_name, this->m_message);
}

static void JNI_throw_java_exception_impl(
        JNIEnv* env,
        std::string class_name,
        std::string message,
        bool fatal_on_error,
        bool add_cpp_stacktrace
) {


    jclass found_class = env->FindClass(class_name.c_str());

    if (found_class == nullptr || env->ExceptionCheck() == JNI_TRUE) {
        if (fatal_on_error) {
            std::string fatal_error = "FATAL: Couldn't find class '";
            fatal_error += class_name;
            fatal_error += "' to throw a native Java exception!";

            JNI_fatal_error(env, fatal_error);
        }

        JNI_throw_java_exception_impl(env, RuntimeException, message, true, true);
        return;
    }


    jint result = env->ThrowNew(found_class, message.c_str());
    if (result != JNI_OK) {
        if (fatal_on_error) {
            std::string fatal_error = "FATAL: Couldn't throw a native Java exception: ThrowNew failed with code";
            fatal_error += result;

            JNI_fatal_error(env, fatal_error);
        }

        JNI_throw_java_exception_impl(env, RuntimeException, message, true, true);
        return;
    }


#ifndef NDEBUG
    if (add_cpp_stacktrace) {
        // do this additional work only in debug mode
        jthrowable thrown_exception = env->ExceptionOccurred();


        if (thrown_exception != nullptr) {
            // reset this exception
            env->ExceptionClear();

            // add stacktrace
            jthrowable new_throwable = CPPStackTraceEntry::add_stack_trace_to_throwable(env, thrown_exception);

            jint result = env->Throw(new_throwable);

            if (result != JNI_OK) {
                std::string fatal_error = "FATAL: Couldn't throw a native Java exception: Throw failed with code";
                fatal_error += result;

                JNI_fatal_error(env, fatal_error);
            }
        }
    }
#endif
}

void JNI_throw_java_exception(JNIEnv* env, std::string class_name, std::string message) {
    JNI_throw_java_exception_impl(env, class_name, message, false, true);
}


JavaExceptionAlreadyThrown::JavaExceptionAlreadyThrown() : std::runtime_error{ "JavaExceptionAlreadyThrown" } { }
