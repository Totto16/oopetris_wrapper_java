
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
 JNIEXPORT jboolean JNICALL Java_com_github_oopetris_Recordings_isRecordingFile
 (JNIEnv *, jclass, jstring);

/*
* Class:     com_github_oopetris_Recordings
* Method:    getInformation
* Signature: (Ljava/lang/String;)Lcom/github/oopetris/RecordingInformation;
*/
JNIEXPORT jobject JNICALL Java_com_github_oopetris_Recordings_getInformation
 (JNIEnv *, jclass, jstring);

/*
* Class:     com_github_oopetris_Recordings
* Method:    getProperties
* Signature: ()Lcom/github/oopetris/RecordingProperties;
*/
JNIEXPORT jobject JNICALL Java_com_github_oopetris_Recordings_getProperties
 (JNIEnv *, jclass);

/*
* Class:     com_github_oopetris_Recordings
* Method:    getVersion
* Signature: ()Ljava/lang/String;
*/
JNIEXPORT jstring JNICALL Java_com_github_oopetris_Recordings_getVersion
 (JNIEnv *, jclass);

#ifdef __cplusplus
}
#endif
