package com.github.oopetris;

import java.util.Objects;

public class Mino {
    public MinoPosition position;
    public TetrominoType type;

    public Mino(MinoPosition position, TetrominoType type) {
        this.position = position;
        this.type = type;
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Mino mino)) {
            return false;
        }

        return Objects.equals(position, mino.position) && type == mino.type;
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(position);
        result = 31 * result + Objects.hashCode(type);
        return result;
    }
}
