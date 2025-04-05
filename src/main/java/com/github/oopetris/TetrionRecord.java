package com.github.oopetris;

import com.github.oopetris.InputEvent;

import org.joou.Unsigned.UByte;
import org.joou.Unsigned.ULong;


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
