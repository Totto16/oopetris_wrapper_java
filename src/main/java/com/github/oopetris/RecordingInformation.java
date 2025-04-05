package com.github.oopetris;

import org.joou.UByte;

import java.util.List;
import java.util.Map;

public class RecordingInformation {
    public Map<String, AdditionalInformationValue> information;
    public List<TetrionRecord> records;
    public List<TetrionSnapshot> snapshots;
    public List<TetrionHeader> tetrionHeaders;
    public UByte version;

    public RecordingInformation(
            Map<String, AdditionalInformationValue> information, List<TetrionRecord> records,
            List<TetrionSnapshot> snapshots, List<TetrionHeader> tetrionHeaders, UByte version
    ) {
        this.information = information;
        this.records = records;
        this.snapshots = snapshots;
        this.tetrionHeaders = tetrionHeaders;
        this.version = version;
    }
}
