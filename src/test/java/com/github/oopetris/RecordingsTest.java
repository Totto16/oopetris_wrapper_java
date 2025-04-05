package com.github.oopetris;

import com.github.oopetris.Recordings;

public class RecordingsTest {
    Recordings recordings;

    public RecordingsTest() {
        this.recordings = new Recordings();
    }

    private String getFilePath(String name) {
        //TODO
        String path = name;

        return name;
    }


    public void test() {
        Recordings.isRecordingFile(this.getFilePath("test"));
    }

    public static void main(String[] args) {
        RecordingsTest test = new RecordingsTest();

        test.test();
    }
}
