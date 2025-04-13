package com.github.oopetris;

import org.joou.UByte;
import org.joou.ULong;

import java.util.Objects;


public class TetrionRecord {
    public InputEvent event;
    public ULong simulationStepIndex;
    public UByte tetrionIndex;


    public TetrionRecord(InputEvent event, ULong simulationStepIndex, UByte tetrionIndex) {
        this.event = event;
        this.simulationStepIndex = simulationStepIndex;
        this.tetrionIndex = tetrionIndex;
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof TetrionRecord that)) {
            return false;
        }

        return event == that.event && Objects.equals(simulationStepIndex, that.simulationStepIndex) && Objects.equals(tetrionIndex, that.tetrionIndex);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(event);
        result = 31 * result + Objects.hashCode(simulationStepIndex);
        result = 31 * result + Objects.hashCode(tetrionIndex);
        return result;
    }

    @Override
    public String toString() {
        return "TetrionRecord{" +
                "event=" + event +
                ", simulationStepIndex=" + simulationStepIndex +
                ", tetrionIndex=" + tetrionIndex +
                '}';
    }
}
