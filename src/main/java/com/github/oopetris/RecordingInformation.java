package com.github.oopetris;

import org.joou.UByte;

import java.util.List;
import java.util.Map;
import java.util.Objects;

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

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof RecordingInformation that)) {
            return false;
        }

        return Objects.equals(information, that.information) &&
                Objects.equals(records, that.records) &&
                Objects.equals(snapshots, that.snapshots) &&
                Objects.equals(tetrionHeaders, that.tetrionHeaders) &&
                Objects.equals(version, that.version);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(information);
        result = 31 * result + Objects.hashCode(records);
        result = 31 * result + Objects.hashCode(snapshots);
        result = 31 * result + Objects.hashCode(tetrionHeaders);
        result = 31 * result + Objects.hashCode(version);
        return result;
    }
}
