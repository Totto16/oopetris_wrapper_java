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

        return path;
    }


    //TODO: use proper unit testing framework
    
    public void test() {
        boolean result = Recordings.isRecordingFile(this.getFilePath("test"));

        System.out.printf("Result is %b%n",result);
    }

    public static void main(String[] args) {
        RecordingsTest test = new RecordingsTest();

        test.test();
    }
}
