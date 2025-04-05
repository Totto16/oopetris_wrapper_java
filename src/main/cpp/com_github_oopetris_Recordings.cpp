

#include "./com_github_oopetris_Recordings.h"
#include "./helper.h"

#include <core/core.hpp>
#include <recordings/recordings.hpp>


#include <filesystem>
#include <string>


bool is_recording_file(std::string path) {


    if (not std::filesystem::exists(path)) {

        return false;
    }

    auto parsed = recorder::RecordingReader::from_path(path);

    return parsed.has_value();
}


#ifdef __cplusplus
extern "C" {
#endif


JNIEXPORT jboolean JNICALL Java_com_github_oopetris_Recordings_isRecordingFile(JNIEnv* env, jclass _clazz, jstring jpath) {

    std::string path = JNI_jstring_to_string(env, jpath);

    const auto result = is_recording_file(path);

    return result ? JNI_TRUE : JNI_FALSE;
}


#ifdef __cplusplus
}
#endif
