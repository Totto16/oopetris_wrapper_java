
#pragma once

#include <jni.h>

#include <string>


std::string JNI_jstring_to_string(JNIEnv *env, jstring j_str);
