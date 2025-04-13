

#pragma once

#include <jni.h>


#include <core/core.hpp>
#include <recordings/recordings.hpp>


jobject recording_reader_to_java(JNIEnv* env, const recorder::RecordingReader& reader);

jobject properties_to_java(JNIEnv* env);
