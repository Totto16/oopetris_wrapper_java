
#pragma once
/* Header for class com_github_oopetris_Recordings */

#include <jni.h>


#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     com_github_oopetris_Recordings
 * Method:    isRecordingFile
 * Signature: (Ljava/lang/String;)Z
 */
JNIEXPORT jboolean JNICALL Java_com_github_oopetris_Recordings_isRecordingFile(JNIEnv*, jclass, jstring);

#ifdef __cplusplus
}
#endif
