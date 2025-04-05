package com.github.oopetris;

import org.joou.Unsigned.UByte;

public class GridProperties {
    public UByte height;
    public UByte width;


    public GridProperties(UByte height, UByte width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }
}
