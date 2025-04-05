package com.github.oopetris;

import org.joou.UByte;
import org.joou.UInteger;
import org.joou.ULong;

import java.util.ArrayList;
import java.util.List;


public class AdditionalInformationValue {


    private final VariantType type;
    private final Object value;


    public AdditionalInformationValue(String value) {
        this.type = VariantType.Type_Str;
        this.value = value;
    }

    public AdditionalInformationValue(Float value) {
        this.type = VariantType.Type_Float;
        this.value = value;
    }

    public AdditionalInformationValue(Double value) {
        this.type = VariantType.Type_Double;
        this.value = value;
    }

    public AdditionalInformationValue(UByte value) {
        this.type = VariantType.Type_U8;
        this.value = value;
    }

    public AdditionalInformationValue(Byte value) {
        this.type = VariantType.Type_I8;
        this.value = value;
    }

    public AdditionalInformationValue(UInteger value) {
        this.type = VariantType.Type_U32;
        this.value = value;
    }

    public AdditionalInformationValue(Integer value) {
        this.type = VariantType.Type_I32;
        this.value = value;
    }

    public AdditionalInformationValue(ULong value) {
        this.type = VariantType.Type_U64;
        this.value = value;
    }

    public AdditionalInformationValue(Long value) {
        this.type = VariantType.Type_I64;
        this.value = value;
    }

    public AdditionalInformationValue(List<AdditionalInformationValue> value) {
        this.type = VariantType.Type_List;
        this.value = value;
    }

    public VariantType getType() {
        return this.type;
    }

    public Object getRawValue() {
        return this.value;
    }

    public String getStringValue() {
        if (this.type != VariantType.Type_Str) {
            throw new VariantTypeMismatch(VariantType.Type_Str, this.type);
        }

        if (this.value instanceof String result) {
            return result;
        }

        throw new ClassCastException("Invalid Variant Implementation, wrong object assigned: " + this.type.getName());
    }

    public Float getFloatValue() {
        if (this.type != VariantType.Type_Float) {
            throw new VariantTypeMismatch(VariantType.Type_Float, this.type);
        }

        if (this.value instanceof Float result) {
            return result;
        }

        throw new ClassCastException("Invalid Variant Implementation, wrong object assigned: " + this.type.getName());
    }

    public Double getDoubleValue() {
        if (this.type != VariantType.Type_Double) {
            throw new VariantTypeMismatch(VariantType.Type_Double, this.type);
        }

        if (this.value instanceof Double result) {
            return result;
        }

        throw new ClassCastException("Invalid Variant Implementation, wrong object assigned: " + this.type.getName());
    }

    public UByte getUByteValue() {
        if (this.type != VariantType.Type_U8) {
            throw new VariantTypeMismatch(VariantType.Type_U8, this.type);
        }

        if (this.value instanceof UByte result) {
            return result;
        }

        throw new ClassCastException("Invalid Variant Implementation, wrong object assigned: " + this.type.getName());
    }

    public Byte getByteValue() {
        if (this.type != VariantType.Type_I8) {
            throw new VariantTypeMismatch(VariantType.Type_I8, this.type);
        }

        if (this.value instanceof Byte result) {
            return result;
        }

        throw new ClassCastException("Invalid Variant Implementation, wrong object assigned: " + this.type.getName());
    }

    public UInteger getUIntegerValue() {
        if (this.type != VariantType.Type_U32) {
            throw new VariantTypeMismatch(VariantType.Type_U32, this.type);
        }

        if (this.value instanceof UInteger result) {
            return result;
        }

        throw new ClassCastException("Invalid Variant Implementation, wrong object assigned: " + this.type.getName());
    }

    public Integer getIntegerValue() {
        if (this.type != VariantType.Type_I32) {
            throw new VariantTypeMismatch(VariantType.Type_I32, this.type);
        }

        if (this.value instanceof Integer result) {
            return result;
        }

        throw new ClassCastException("Invalid Variant Implementation, wrong object assigned: " + this.type.getName());
    }

    public ULong getULongValue() {
        if (this.type != VariantType.Type_U64) {
            throw new VariantTypeMismatch(VariantType.Type_U64, this.type);
        }

        if (this.value instanceof ULong result) {
            return result;
        }

        throw new ClassCastException("Invalid Variant Implementation, wrong object assigned: " + this.type.getName());
    }

    public Long getLongValue() {
        if (this.type != VariantType.Type_I64) {
            throw new VariantTypeMismatch(VariantType.Type_I64, this.type);
        }

        if (this.value instanceof Long result) {
            return result;
        }

        throw new ClassCastException("Invalid Variant Implementation, wrong object assigned: " + this.type.getName());
    }

    @SuppressWarnings("unchecked")
    public List<AdditionalInformationValue> getListValue() {
        if (this.type != VariantType.Type_I64) {
            throw new VariantTypeMismatch(VariantType.Type_I64, this.type);
        }

        if (this.value instanceof List<?> result) {
            if (result.isEmpty()) {
                return new ArrayList<>();
            }

            if (result.get(0) instanceof AdditionalInformationValue) {
                return (List<AdditionalInformationValue>) result;
            }

            throw new ClassCastException("Invalid Variant Implementation, List has invalid elements in it");
        }

        throw new ClassCastException("Invalid Variant Implementation, wrong object assigned: " + this.type.getName());
    }
}
