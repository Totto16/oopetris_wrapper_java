package com.github.oopetris;

import org.joou.Unsigned.UInteger;
import org.joou.Unsigned.ULong;

public class TetrionHeader {
    public ULong seed;
    public UInteger startingLevel;

    public TetrionHeader(ULong seed, UInteger startingLevel) {
        this.seed = seed;
        this.startingLevel = startingLevel;
    }
}
