package com.github.oopetris;

import org.joou.UByte;
import org.joou.UInteger;
import org.joou.ULong;

import java.util.List;


public enum VariantType {
    Type_Str("String", String.class),
    Type_Float("Float", Float.class),
    Type_Double("Double", Double.class),
    Type_Bool("Boolean", Boolean.class),
    Type_U8("U8", UByte.class),
    Type_I8("I8", Byte.class),
    Type_U32("U32", UInteger.class),
    Type_I32("I32", Integer.class),
    Type_U64("U64", ULong.class),
    Type_I64("I64", Long.class),
    Type_List("List", List.class);

    private final String nameString;

    public final Class<?> typeInstance;

    private VariantType(String name, Class<?> typeInstance) {
        this.nameString = name;
        this.typeInstance = typeInstance;
    }

    public String getName(){
        return this.nameString;
    }

}
