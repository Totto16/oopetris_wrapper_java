package com.github.oopetris;

import com.github.oopetris.Mino;

import org.joou.Unsigned.UInteger;
import org.joou.Unsigned.ULong;

import java.util.List;


public class TetrionSnapshot {
    public UInteger level;
    public UInteger linesCleared;
    public List<Mino> minoStack;
    public ULong score;
    public ULong simulationStepIndex;
    public UByte tetrionIndex;

    public TetrionHeader(
            UInteger level, UInteger linesCleared, List<Mino> minoStack, ULong score, ULong simulationStepIndex,
            UByte tetrionIndex
    ) {
        this.level = level;
        this.linesCleared = linesCleared;
        this.minoStack = minoStack;
        this.score = score;
        this.simulationStepIndex = simulationStepIndex;
        this.tetrionIndex = tetrionIndex;
    }
}
