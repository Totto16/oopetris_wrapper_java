

#include "./helper.h"
#include "./exceptions.h"

#include <core/helper/utils.hpp>


//JNI DOCS: https://docs.oracle.com/en/java/javase/21/docs/specs/jni/functions.html

[[noreturn]] void JNI_fatal_error(JNIEnv* env, std::string message) {
    env->FatalError(message.c_str());
    UNREACHABLE();
}

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


[[nodiscard]] static jstring _impl_JNI_get_jstring(JNIEnv* env, const char* c_str) {
    jstring result = env->NewStringUTF(c_str);

    if (result == nullptr) {
        throw JavaException(ExceptionInInitializerError, "Could not construct jstring");
    }

    if (env->ExceptionCheck() == JNI_TRUE) {
        throw JavaExceptionAlreadyThrown();
    }

    return result;
}

jstring JNI_get_jstring(JNIEnv* env, std::string str) {
    return _impl_JNI_get_jstring(env, str.c_str());
}

[[nodiscard]] jstring JNI_get_jstring(JNIEnv* env, const char* c_str) {
    return _impl_JNI_get_jstring(env, c_str);
}


std::pair<jclass, jmethodID>
get_constructor_for_class(JNIEnv* env, std::string class_name, std::string constructor_signature) {

    return get_method_for_class(env, class_name, JAVA_CONSTRUCTOR_NAME, constructor_signature);
}

[[nodiscard]] std::pair<jclass, jmethodID>
get_method_for_class(JNIEnv* env, jclass clazz, std::string method_name, std::string method_signature) {

    jmethodID found_method = env->GetMethodID(clazz, method_name.c_str(), method_signature.c_str());

    if (found_method == nullptr) {
        throw JavaException(
                NoSuchMethodError,
                "No method with the name '" + method_name + "' and signature '" + method_signature + "' found!"
        );
    }

    if (env->ExceptionCheck() == JNI_TRUE) {
        throw JavaExceptionAlreadyThrown();
    }

    return std::make_pair(clazz, found_method);
}

std::pair<jclass, jmethodID>
get_method_for_class(JNIEnv* env, std::string class_name, std::string method_name, std::string method_signature) {

    jclass found_class = env->FindClass(class_name.c_str());

    if (found_class == nullptr) {
        throw JavaException(NoClassDefFoundError, "No class with the name '" + class_name + "' found");
    }

    if (env->ExceptionCheck() == JNI_TRUE) {
        throw JavaExceptionAlreadyThrown();
    }

    return get_method_for_class(env, found_class, method_name, method_signature);
}


[[nodiscard]] std::pair<jclass, jfieldID>
get_static_field_for_class(JNIEnv* env, std::string class_name, std::string field_name, std::string field_type) {


    jclass found_class = env->FindClass(class_name.c_str());

    if (found_class == nullptr) {
        throw JavaException(NoClassDefFoundError, "No class with the name '" + class_name + "' found");
    }

    if (env->ExceptionCheck() == JNI_TRUE) {
        throw JavaExceptionAlreadyThrown();
    }


    jfieldID found_field_id = env->GetStaticFieldID(found_class, field_name.c_str(), field_type.c_str());

    if (found_field_id == nullptr) {
        throw JavaException(
                NoSuchMethodError, "No static field with the name '" + field_name + "' and type '" + field_type
                                           + "' found for the class: " + class_name
        );
    }

    if (env->ExceptionCheck() == JNI_TRUE) {
        throw JavaExceptionAlreadyThrown();
    }

    return std::make_pair(found_class, found_field_id);
}


std::pair<jclass, jmethodID> get_static_method_for_class(
        JNIEnv* env,
        std::string class_name,
        std::string method_name,
        std::string method_signature
) {

    jclass found_class = env->FindClass(class_name.c_str());

    if (found_class == nullptr) {
        throw JavaException(NoClassDefFoundError, "No class with the name '" + class_name + "' found");
    }

    if (env->ExceptionCheck() == JNI_TRUE) {
        throw JavaExceptionAlreadyThrown();
    }


    jmethodID found_method = env->GetStaticMethodID(found_class, method_name.c_str(), method_signature.c_str());

    if (found_method == nullptr) {
        throw JavaException(
                NoSuchMethodError, "No static method with the name '" + method_name + "' and signature '"
                                           + method_signature + "' found for the class: " + class_name
        );
    }

    if (env->ExceptionCheck() == JNI_TRUE) {
        throw JavaExceptionAlreadyThrown();
    }

    return std::make_pair(found_class, found_method);
}


jobject construct_u8(JNIEnv* env, u8 value) {

    const auto [u8_class, u8_static_create_function] =
            get_static_method_for_class(env, U8_JAVA_CLASS, "valueOf", METHOD_TYPE(BYTE_LITERAL_TYPE, U8_JAVA_TYPE));

    auto u8_value = static_cast<jbyte>(value);

    jobject u8_object = env->CallStaticObjectMethod(u8_class, u8_static_create_function, u8_value);

    if (u8_object == nullptr) {
        throw JavaException(ExceptionInInitializerError, "Could not construct u8");
    }

    if (env->ExceptionCheck() == JNI_TRUE) {
        throw JavaExceptionAlreadyThrown();
    }

    return u8_object;
}

jobject construct_u32(JNIEnv* env, u32 value) {

    const auto [u32_class, u32_static_create_function] = get_static_method_for_class(
            env, U32_JAVA_CLASS, "valueOf", METHOD_TYPE(INTEGER_LITERAL_TYPE, U32_JAVA_TYPE)
    );

    auto u32_value = static_cast<jint>(value);

    jobject u32_object = env->CallStaticObjectMethod(u32_class, u32_static_create_function, u32_value);

    if (u32_object == nullptr) {
        throw JavaException(ExceptionInInitializerError, "Could not construct u32");
    }

    if (env->ExceptionCheck() == JNI_TRUE) {
        throw JavaExceptionAlreadyThrown();
    }

    return u32_object;
}

jobject construct_u64(JNIEnv* env, u64 value) {

    const auto [u64_class, u64_static_create_function] =
            get_static_method_for_class(env, U64_JAVA_CLASS, "valueOf", METHOD_TYPE(LONG_LITERAL_TYPE, U64_JAVA_TYPE));

    auto u64_value = static_cast<jlong>(value);

    jobject u64_object = env->CallStaticObjectMethod(u64_class, u64_static_create_function, u64_value);

    if (u64_object == nullptr) {
        throw JavaException(ExceptionInInitializerError, "Could not construct u64");
    }

    if (env->ExceptionCheck() == JNI_TRUE) {
        throw JavaExceptionAlreadyThrown();
    }

    return u64_object;
}
