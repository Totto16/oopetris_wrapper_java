package com.github.oopetris;


public enum InputEvent {
    RotateLeftPressed("RotateLeftPressed"),
    RotateRightPressed("RotateRightPressed"),
    MoveLeftPressed("MoveLeftPressed"),
    MoveRightPressed("MoveRightPressed"),
    MoveDownPressed("MoveDownPressed"),
    DropPressed("DropPressed"),
    HoldPressed("HoldPressed"),

    RotateLeftReleased("RotateLeftReleased"),
    RotateRightReleased("RotateRightReleased"),
    MoveLeftReleased("MoveLeftReleased"),
    MoveRightReleased("MoveRightReleased"),
    MoveDownReleased("MoveDownReleased"),
    DropReleased("DropReleased"),
    HoldReleased("HoldReleased");


    public final String nameString;

    private InputEvent(String name) {
        this.nameString = name;
    }

    @Override
    public String toString() {
        return "InputEvent." + nameString;
    }
}
