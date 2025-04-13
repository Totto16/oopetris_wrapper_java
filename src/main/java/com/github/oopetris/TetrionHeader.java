package com.github.oopetris;

import org.joou.UInteger;
import org.joou.ULong;

import java.util.Objects;

public class TetrionHeader {
    public ULong seed;
    public UInteger startingLevel;

    public TetrionHeader(ULong seed, UInteger startingLevel) {
        this.seed = seed;
        this.startingLevel = startingLevel;
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof TetrionHeader that)) {
            return false;
        }

        return Objects.equals(seed, that.seed) && Objects.equals(startingLevel, that.startingLevel);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(seed);
        result = 31 * result + Objects.hashCode(startingLevel);
        return result;
    }
}
