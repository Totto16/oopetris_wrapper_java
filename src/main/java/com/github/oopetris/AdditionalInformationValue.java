package com.github.oopetris;

import org.joou.UByte;
import org.joou.UInteger;
import org.joou.ULong;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class AdditionalInformationValue {


    private final VariantType type;
    private final Object value;


    public AdditionalInformationValue(String value) {
        this.type = VariantType.Type_Str;
        this.value = value;
    }

    public AdditionalInformationValue(Boolean value) {
        this.type = VariantType.Type_Bool;
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

    public Boolean getBoolValue() {
        if (this.type != VariantType.Type_Bool) {
            throw new VariantTypeMismatch(VariantType.Type_Bool, this.type);
        }

        if (this.value instanceof Boolean result) {
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

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof AdditionalInformationValue that)) {
            return false;
        }

        return getType() == that.getType() && Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        int result = getType().hashCode();
        result = 31 * result + Objects.hashCode(value);
        return result;
    }

    public String getValueAsString() {

        switch (this.type) {
            case Type_I8 -> {
                return getByteValue().toString();
            }
            case Type_U8 -> {
                return getUByteValue().toString();
            }
            case Type_I32 -> {
                return getIntegerValue().toString();
            }
            case Type_U32 -> {
                return getUIntegerValue().toString();
            }
            case Type_I64 -> {
                return getLongValue().toString();
            }
            case Type_U64 -> {
                return getULongValue().toString();
            }
            case Type_Str -> {
                return getStringValue();
            }
            case Type_Bool -> {
                return getBoolValue().toString();
            }
            case Type_Float -> {
                return getFloatValue().toString();
            }
            case Type_Double -> {
                return getDoubleValue().toString();
            }
            case Type_List -> {
                List<AdditionalInformationValue> list = getListValue();

                List<String> strList = list.stream().map(AdditionalInformationValue::toString).toList();
                return String.join(" : ", strList);

            }
            default -> {
                throw new RuntimeException("getValueAsString: Unhandled type: " + this.type);
            }

        }

    }

    @Override
    public String toString() {
        return "AdditionalInformationValue{" +
                "type=" + type +
                ", value=" + this.getValueAsString() +
                '}';
    }
}
