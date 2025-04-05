package com.github.oopetris;

//import com.github.oopetris.RecordingInformation;

public class Recordings {

    static {
        System.loadLibrary("oopetris_recordings_java_native");
    }

    public static native boolean isRecordingFile(String path);

    // private static native RecordingInformation getInformation(String path);
}
