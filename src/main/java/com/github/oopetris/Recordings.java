package com.github.oopetris;

import java.io.File;

public class Recordings {

    private Recordings() { }

    static {
        System.loadLibrary("oopetris_java_wrapper_native");
    }

    public static native boolean isRecordingFile(String path);

    public static native RecordingInformation getInformation(String path);

    public static boolean isRecordingFile(File file) {
        if (file == null) {
            return false;
        }

        return isRecordingFile(file.getAbsolutePath());
    }

    public static RecordingInformation getInformation(File file) {
        if (file == null) {
            throw new NullPointerException("File was null");
        }

        return getInformation(file.getAbsolutePath());
    }

    public static native RecordingProperties getProperties();

    public static native String getVersion();
}
