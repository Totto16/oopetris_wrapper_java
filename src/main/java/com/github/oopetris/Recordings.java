package com.github.oopetris;

import com.github.oopetris.RecordingInformation;
import com.github.oopetris.RecordingProperties;

public class Recordings {

    static {
        System.loadLibrary("oopetris_recordings_java_native");
    }

    public static native boolean isRecordingFile(String path);

    public static native RecordingInformation getInformation(String path);

    public static native RecordingsProperties getProperties();

    public static native String getVersion();
}
