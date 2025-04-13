package com.github.oopetris;


public enum TetrominoType {
    I("I"),
    J("J"),
    L("L"),
    O("O"),
    S("S"),
    T("T"),
    Z("Z");


    public final String nameString;

    private TetrominoType(String name) {
        this.nameString = name;
    }

    @Override
    public String toString() {
        return "TetrominoType." + nameString;
    }
}
