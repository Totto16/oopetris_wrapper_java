package com.github.oopetris;

import org.joou.UInteger;
import org.joou.ULong;
import org.joou.UByte;

import java.util.List;
import java.util.Objects;


public class TetrionSnapshot {
    public UInteger level;
    public UInteger linesCleared;
    public List<Mino> minoStack;
    public ULong score;
    public ULong simulationStepIndex;
    public UByte tetrionIndex;

    public TetrionSnapshot(
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

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof TetrionSnapshot that)) return false;

        return Objects.equals(level, that.level) &&
                Objects.equals(linesCleared, that.linesCleared) &&
                Objects.equals(minoStack, that.minoStack) &&
                Objects.equals(score, that.score) &&
                Objects.equals(simulationStepIndex, that.simulationStepIndex) &&
                Objects.equals(tetrionIndex, that.tetrionIndex);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(level);
        result = 31 * result + Objects.hashCode(linesCleared);
        result = 31 * result + Objects.hashCode(minoStack);
        result = 31 * result + Objects.hashCode(score);
        result = 31 * result + Objects.hashCode(simulationStepIndex);
        result = 31 * result + Objects.hashCode(tetrionIndex);
        return result;
    }

    @Override
    public String toString() {
        return "TetrionSnapshot{" +
                "level=" + level +
                ", linesCleared=" + linesCleared +
                ", minoStack=" + minoStack +
                ", score=" + score +
                ", simulationStepIndex=" + simulationStepIndex +
                ", tetrionIndex=" + tetrionIndex +
                '}';
    }
}
