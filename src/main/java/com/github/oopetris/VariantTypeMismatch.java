package com.github.oopetris;

public class VariantTypeMismatch extends RuntimeException {

    public VariantType expectedType;
    public VariantType actualType;


    public VariantTypeMismatch(VariantType expectedType, VariantType actualType) {
        super("VariantTypeMismatch");

        this.expectedType = expectedType;
        this.actualType=actualType;
    }

    @Override
    public String getMessage() {
        return String.format("Expected type %s but got %s", this.expectedType.getName(), this.actualType.getName());
    }
}
