package com.github.oopetris;

public class VariantTypeMismatch extends RuntimeException {

    public VariantType expectedType;
    public VariantType actualType;


    public VariantTypeMismatch(VariantType expectedType, VariantType actualType) {
        super("VariantTypeMismatch");
    }

    @Override
    public String getMessage() {
        return String.format("Expected type %s but got %s", this.expectedType.name, this.actualType.name);
    }
}
