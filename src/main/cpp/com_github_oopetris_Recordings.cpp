

#include "./com_github_oopetris_Recordings.h"
#include "./convert.h"
#include "./helper.h"

#include <core/core.hpp>
#include <recordings/recordings.hpp>


#include <filesystem>
#include <string>


static jboolean is_recording_file(JNIEnv* env, jstring jpath) {


    std::string path = JNI_jstring_to_string(env, jpath);


    if (not std::filesystem::exists(path)) {

        return JNI_FALSE;
    }

    auto parsed = recorder::RecordingReader::from_path(path);

    return parsed.has_value() ? JNI_TRUE : JNI_FALSE;
    ;
}


static jobject get_information(JNIEnv* env, jstring jpath) {

    std::string path = JNI_jstring_to_string(env, jpath);


    if (not std::filesystem::exists(path)) {
        //TODO throw exception in java
    }

    auto parsed = recorder::RecordingReader::from_path(path);

    if (not parsed.has_value()) {

        std::string error = "An error occurred during parsing of the recording file '";
        error += path;
        error += "': ";
        error += parsed.error();

        throw JavaException(RuntimeException, error);
    }

    auto recording_reader = std::move(parsed.value());


    jobject val = recording_reader_to_java(env, recording_reader);

    return val;
}


static jobject get_properties(JNIEnv* env) {
    return properties_to_java(env);
}

static jstring get_version(JNIEnv* env) {

    const std::string str = utils::version();

    jstring jversion = env->NewStringUTF(str.c_str());

    if (jversion == nullptr) {
        throw JavaException(ExceptionInInitializerError, "Could not construct version string");
    }

    return jversion;
}

#ifdef __cplusplus
extern "C" {
#endif


JNIEXPORT jboolean JNICALL Java_com_github_oopetris_Recordings_isRecordingFile(JNIEnv* env, jclass, jstring jpath) {
    return is_recording_file(env, jpath);
}

JNIEXPORT jobject JNICALL Java_com_github_oopetris_Recordings_getInformation(JNIEnv* env, jclass, jstring jpath) {
    return get_information(env, jpath);
}


JNIEXPORT jobject JNICALL Java_com_github_oopetris_Recordings_getProperties(JNIEnv* env, jclass) {
    return get_properties(env);
}


JNIEXPORT jstring JNICALL Java_com_github_oopetris_Recordings_getVersion(JNIEnv* env, jclass) {
    return get_version(env);
}


#ifdef __cplusplus
}
#endif
