package com.github.oopetris;

import org.joou.UByte;

import java.util.Objects;

public class MinoPosition {
    public UByte x;
    public UByte y;

    public MinoPosition(UByte x, UByte y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof MinoPosition that)) {
            return false;
        }

        return Objects.equals(x, that.x) && Objects.equals(y, that.y);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(x);
        result = 31 * result + Objects.hashCode(y);
        return result;
    }

    @Override
    public String toString() {
        return "MinoPosition{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
