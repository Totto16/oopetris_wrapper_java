package com.github.oopetris;

import java.io.File;

public class Recordings {

	private Recordings() {
        
	}

	static {
		System.loadLibrary("oopetris_recordings_java_native");
	}

	public static native boolean isRecordingFile(String path);

	public static native RecordingInformation getInformation(String path);

	public static boolean isRecordingFile(File file) {
		return isRecordingFile(file.getAbsolutePath());
	}

	public static RecordingInformation getInformation(File file) {
		return getInformation(file.getAbsolutePath());
	}

	public static native RecordingProperties getProperties();

	public static native String getVersion();
}
