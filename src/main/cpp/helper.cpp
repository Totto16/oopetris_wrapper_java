

#include "./helper.h"


std::string JNI_jstring_to_string(JNIEnv* env, jstring j_str) {
    if (!j_str) {
        return "";
    }

    const char* cstr = env->GetStringUTFChars(j_str, nullptr);
    std::string str{ cstr };

    env->ReleaseStringUTFChars(j_str, cstr);

    return str;
}
