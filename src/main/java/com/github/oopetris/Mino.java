package com.github.oopetris;

public class Mino {
    public MinoPosition position;
    public TetrominoType type;


    public Mino(MinoPosition position, TetrominoType type) {
        this.position = position;
        this.type = type;
    }
}
