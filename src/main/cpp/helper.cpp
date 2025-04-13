

#include "./helper.h"


std::string JNI_jstring_to_string(JNIEnv* env, jstring j_str) {
    if (!j_str) {
        return "";
    }

    const char* cstr = env->GetStringUTFChars(j_str, nullptr);

    if (cstr == nullptr) {
        throw JavaException(RuntimeException, "Could not get bytes from jstring");
    }

    std::string str{ cstr };

    env->ReleaseStringUTFChars(j_str, cstr);

    return str;
}


std::unique_ptr<std::pair<jclass, jmethodID>> get_constructor_for_class_without_execxption(
        JNIEnv* env,
        std::string class_name,
        std::string constructor_signature
) noexcept {

    jclass found_class = env->FindClass(class_name.c_str());

    if (found_class == nullptr) {
        return nullptr;
    }

    if (env->ExceptionOccurred() != nullptr) {
        return nullptr;
    }


    jmethodID found_constructor = env->GetMethodID(found_class, "<init>", constructor_signature.c_str());

    if (found_constructor == nullptr) {
        return nullptr;
    }

    if (env->ExceptionOccurred() != nullptr) {
        return nullptr;
    }


    return std::make_unique<std::pair<jclass, jmethodID>>(found_class, found_constructor);
}

std::pair<jclass, jmethodID>
get_constructor_for_class(JNIEnv* env, std::string class_name, std::string constructor_signature) {

    return get_method_for_class(env, class_name, "<init>", constructor_signature);
}

std::pair<jclass, jmethodID>
get_method_for_class(JNIEnv* env, std::string class_name, std::string method_name, std::string method_signature) {

    jclass found_class = env->FindClass(class_name.c_str());

    if (found_class == nullptr) {
        throw JavaException(NoClassDefFoundError, "No class with the name '" + class_name + "' found");
    }

    if (env->ExceptionOccurred() != nullptr) {
        throw JavaExceptionAlreadyThrown();
    }


    jmethodID found_constructor = env->GetMethodID(found_class, method_name.c_str(), method_signature.c_str());

    if (found_constructor == nullptr) {
        throw JavaException(
                NoSuchMethodError, "No method with the name '" + method_name + "' and signature '" + method_signature
                                           + "' found for the class: " + class_name
        );
    }

    if (env->ExceptionOccurred() != nullptr) {
        throw JavaExceptionAlreadyThrown();
    }

    return std::make_pair(found_class, found_constructor);
}


jobject construct_u8(JNIEnv* env, u8 value) {

    const auto [u8_class, u8_construct_function] =
            get_method_for_class(env, U8_JAVA_CLASS, "valueOf", METHOD_TYPE(BYTE_LITERAL_TYPE, U8_JAVA_CLASS));

    auto u8_value = static_cast<jbyte>(value);

    jobject u8_object = env->NewObject(u8_class, u8_construct_function, u8_value);

    if (u8_object == nullptr) {
        throw JavaException(ExceptionInInitializerError, "Could not construct u8");
    }

    if (env->ExceptionOccurred() != nullptr) {
        throw JavaExceptionAlreadyThrown();
    }

    return u8_object;
}

jobject construct_u32(JNIEnv* env, u32 value) {

    const auto [u32_class, u32_construct_function] =
            get_method_for_class(env, U32_JAVA_CLASS, "valueOf", METHOD_TYPE(INTEGER_LITERAL_TYPE, U32_JAVA_CLASS));

    auto u32_value = static_cast<jint>(value);

    jobject u32_object = env->NewObject(u32_class, u32_construct_function, u32_value);

    if (u32_object == nullptr) {
        throw JavaException(ExceptionInInitializerError, "Could not construct u32");
    }

    if (env->ExceptionOccurred() != nullptr) {
        throw JavaExceptionAlreadyThrown();
    }

    return u32_object;
}

jobject construct_u64(JNIEnv* env, u64 value) {

    const auto [u64_class, u64_construct_function] =
            get_method_for_class(env, U64_JAVA_CLASS, "valueOf", METHOD_TYPE(LONG_LITERAL_TYPE, U64_JAVA_CLASS));

    auto u64_value = static_cast<jlong>(value);

    jobject u64_object = env->NewObject(u64_class, u64_construct_function, u64_value);

    if (u64_object == nullptr) {
        throw JavaException(ExceptionInInitializerError, "Could not construct u64");
    }

    if (env->ExceptionOccurred() != nullptr) {
        throw JavaExceptionAlreadyThrown();
    }

    return u64_object;
}


JavaException::JavaException(std::string class_name)
    : std::runtime_error{ "JavaException" },
      m_class_name{ class_name },
      m_message{ "" } { }

JavaException::JavaException(std::string class_name, std::string message)
    : std::runtime_error{ "JavaException" },
      m_class_name{ class_name },
      m_message{ message } { }

void JavaException::throw_java_exception(JNIEnv* env) const {

    //TODO
    (void) env;
}


JavaExceptionAlreadyThrown::JavaExceptionAlreadyThrown() : std::runtime_error{ "JavaExceptionAlreadyThrown" } { }


// https://docs.oracle.com/en/java/javase/21/docs/specs/jni/functions.html#exceptions
// https://www.baeldung.com/jni
// https://github.com/gkubisa/jni-maven/blob/master/pom.xml
// https://junit.org/junit4/javadoc/4.13/org/junit/Assert.html
// https://stackoverflow.com/questions/44636567/android-jni-call-java-constructor-in-c
// https://stackoverflow.com/questions/230689/best-way-to-throw-exceptions-in-jni-code
// https://programming.guide/java/list-of-java-exceptions.html
