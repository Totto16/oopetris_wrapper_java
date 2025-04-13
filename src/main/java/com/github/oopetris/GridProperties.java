package com.github.oopetris;

import org.joou.UByte;

import java.util.Objects;

public class GridProperties {
    public UByte height;
    public UByte width;

    public GridProperties(UByte height, UByte width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof GridProperties that)) {
            return false;
        }

        return Objects.equals(height, that.height) && Objects.equals(width, that.width);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(height);
        result = 31 * result + Objects.hashCode(width);
        return result;
    }

    @Override
    public String toString() {
        return "GridProperties{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }
}
