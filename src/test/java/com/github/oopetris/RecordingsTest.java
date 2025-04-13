package com.github.oopetris;

import static org.joou.Unsigned.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;

public class RecordingsTest {

    protected File getFilePath(String name) {
        ClassLoader classLoader = getClass().getClassLoader();
        URL resource = classLoader.getResource(name);

        if (resource == null) {
            return null;
        }
        return new File(resource.getFile());
    }

    protected String getFilePathAsStr(String name) {
        ClassLoader classLoader = getClass().getClassLoader();
        URL otherResource = classLoader.getResource("correct.rec");

        if (otherResource == null) {
            throw new IllegalStateException("getFilePathAsStr Implementation error");
        }
        File otherFile = new File(otherResource.getFile());

        File resourcesFolder = otherFile.getParentFile();

        return resourcesFolder.getAbsolutePath() + File.separator + name;
    }

    protected boolean fileExists(File file) {
        if (file == null) {
            return false;
        }

        return file.exists();
    }

    protected boolean fileExists(String fileStr) {
        if (fileStr == null) {
            return false;
        }

        return fileExists(new File(fileStr));
    }


    @Nested
    class isRecordingFileTests {

        @Test
        void nonExistentFile() {
            File file = getFilePath("NON-EXISTENT.rec");

            assertFalse(fileExists(file));

            assertFalse(Recordings.isRecordingFile(file), "should return false for non existent file");
        }

        @Test
        void incorrectFile() {
            File file = getFilePath("incorrect.rec");

            assertTrue(fileExists(file));

            assertFalse(Recordings.isRecordingFile(file), "should return false for incorrect file");
        }

        @Test
        void correctFile() {
            File file = getFilePath("correct.rec");

            assertTrue(fileExists(file));

            assertTrue(Recordings.isRecordingFile(file), "should return true for correct file");
        }
    }

    @Nested
    class getInformationTests {


        @Test
        void nonExistentFile() {

            File file = getFilePath("NON-EXISTENT.rec");

            assertFalse(fileExists(file));


            Throwable exception = assertThrows(NullPointerException.class, () -> {
                Recordings.getInformation(file);
            }, "should raise an error for non existent file");

            assertTrue(exception.getMessage().matches("^File was null$"));
        }

        @Test
        void nonExistentFileRaw() {

            String file = getFilePathAsStr("NON-EXISTENT.rec");

            assertFalse(fileExists(file));


            Throwable exception = assertThrows(FileNotFoundException.class, () -> {
                Recordings.getInformation(file);
            }, "should raise an error for non existent file");

            assertTrue(exception.getMessage().matches("^File '.*NON-EXISTENT.rec' not found!$"));
        }

        @Test
        void incorrectFile() {

            File file = getFilePath("incorrect.rec");

            assertTrue(fileExists(file));


            Throwable exception = assertThrows(RuntimeException.class, () -> {
                Recordings.getInformation(file);
            }, "should raise an error for incorrect file");

            assertTrue(exception.getMessage().matches(
                    "^An error occurred during parsing of the recording file '.*incorrect.rec': magic file bytes are "
                    + "not correct, this is either an old format or no recording at all$"
            ));
        }

        @Test
        void correctFileIsCorrectType() {

            File file = getFilePath("correct.rec");

            assertTrue(fileExists(file));


            RecordingInformation information = Recordings.getInformation(file);

            assertInstanceOf(RecordingInformation.class, information);
        }

        @Test
        void correctFileIsValid() {

            File file = getFilePath("correct.rec");

            assertTrue(fileExists(file));

            RecordingInformation information = Recordings.getInformation(file);

            RecordingInformation correctRecordings = Correct.getCorrectRecordings();

            assertEquals(correctRecordings, information);
        }
    }

    @Nested
    class OtherTests {


        @Test
        void getProperties() {
            RecordingProperties expectedProperties = new RecordingProperties(new GridProperties(ubyte(20), ubyte(10)));

            RecordingProperties actualProperties = Recordings.getProperties();

            assertEquals(expectedProperties, actualProperties);
        }

        @Test
        void getVersion() {
            String expectedVersion = "0.5.6";

            String actualVersion = Recordings.getVersion();

            assertEquals(expectedVersion, actualVersion);
        }
    }
}
