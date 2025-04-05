package com.github.oopetris;

import org.joou.UByte;
import org.joou.ULong;


public class TetrionRecord {
    public InputEvent event;
    public ULong simulationStepIndex;
    public UByte tetrionIndex;


    public TetrionRecord(InputEvent event, ULong simulationStepIndex, UByte tetrionIndex) {
        this.event = event;
        this.simulationStepIndex = simulationStepIndex;
        this.tetrionIndex = tetrionIndex;
    }
}
