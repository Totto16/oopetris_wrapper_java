

#include "./com_github_oopetris_Recordings.h"
#include "./convert.h"
#include "./helper.h"
#include "./jni_cpp.h"

#include <core/core.hpp>
#include <recordings/recordings.hpp>


#include <filesystem>
#include <string>

#define JAVA_EXCEPTION_GUARD_START() try {


#define JAVA_EXCEPTION_GUARD_END(error_return_value)                           \
    }                                                                          \
    catch (const JavaException& exception) {                                   \
        exception.throw_java_exception(env);                                   \
        return error_return_value;                                             \
    }                                                                          \
    catch (const JavaExceptionAlreadyThrown&) {                                \
        JNI_add_stack_trace_to_exception(env);                                 \
        return error_return_value;                                             \
    }                                                                          \
    catch (const std::runtime_error& raw_exception) {                          \
        JNI_throw_java_exception(env, RuntimeException, raw_exception.what()); \
        return error_return_value;                                             \
    }


static jboolean _cpp_impl_is_recording_file(JNIEnv* env, jstring jpath) {
    JAVA_EXCEPTION_GUARD_START()

    std::string path = JNI_jstring_to_string(env, jpath);


    if (not std::filesystem::exists(path)) {
        return JNI_FALSE;
    }

    auto parsed = recorder::RecordingReader::from_path(path);

    return parsed.has_value() ? JNI_TRUE : JNI_FALSE;

    JAVA_EXCEPTION_GUARD_END(JNI_FALSE)
}


static jobject _cpp_impl_get_information(JNIEnv* env, jstring jpath) {
    JAVA_EXCEPTION_GUARD_START()

    std::string path = JNI_jstring_to_string(env, jpath);

    if (not std::filesystem::exists(path)) {
        throw JavaException(FileNotFoundException, "File '" + path + "' not found!");
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

    JAVA_EXCEPTION_GUARD_END(nullptr)
}


static jobject _cpp_impl_get_properties(JNIEnv* env) {
    JAVA_EXCEPTION_GUARD_START()

    return properties_to_java(env);

    JAVA_EXCEPTION_GUARD_END(nullptr)
}

static jstring _cpp_impl_get_version(JNIEnv* env) {
    JAVA_EXCEPTION_GUARD_START()

    const std::string str = utils::version();

    jstring jversion = JNI_get_jstring(env, str);

    return jversion;

    JAVA_EXCEPTION_GUARD_END(nullptr)
}

#ifdef __cplusplus
extern "C" {
#endif


JNIEXPORT jboolean JNICALL Java_com_github_oopetris_Recordings_isRecordingFile(JNIEnv* env, jclass, jstring jpath) {
    return _cpp_impl_is_recording_file(env, jpath);
}

JNIEXPORT jobject JNICALL Java_com_github_oopetris_Recordings_getInformation(JNIEnv* env, jclass, jstring jpath) {
    return _cpp_impl_get_information(env, jpath);
}


JNIEXPORT jobject JNICALL Java_com_github_oopetris_Recordings_getProperties(JNIEnv* env, jclass) {
    return _cpp_impl_get_properties(env);
}


JNIEXPORT jstring JNICALL Java_com_github_oopetris_Recordings_getVersion(JNIEnv* env, jclass) {
    return _cpp_impl_get_version(env);
}


#ifdef __cplusplus
}
#endif
