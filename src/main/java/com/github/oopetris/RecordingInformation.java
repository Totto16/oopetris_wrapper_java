package com.github.oopetris;

import com.github.oopetris.AdditionalInformationValue;
import com.github.oopetris.TetrionHeader;
import com.github.oopetris.TetrionRecord;
import com.github.oopetris.TetrionSnapshot;

import java.util.List;
import java.util.Map;
import org.joou.Unsigned.UByte

        public class RecordingInformation {
    public List<Map<String, AdditionalInformationValue>> information;
    public List<TetrionRecord> records;
    public List<TetrionSnapshot> snapshots;
    public List<TetrionHeader> tetrionHeaders;
    public UByte version;

    public RecordingInformation(
            List<AdditionalInformation> information, List<TetrionRecord> records, List<TetrionSnapshot> snapshots,
            List<TetrionHeader> tetrionHeaders, UByte version
    ) {
        this.information = information;
        this.records = records;
        this.snapshots = snapshots;
        this.tetrionHeaders = tetrionHeaders;
        this.version = version;
    }
}
