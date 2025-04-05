package com.github.oopetris;

import com.github.oopetris.MinoPosition;
import com.github.oopetris.TetrominoType;

public class Mino {
    public MinoPosition position;
    public TetrominoType type;


    public Mino(MinoPosition position, TetrominoType type) {
        this.position = position;
        this.type = type;
    }
}
