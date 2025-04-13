
#pragma once

#include <jni.h>

#include <memory>
#include <string>
#include <utility>

#include <core/helper/types.hpp>

// oopetris specific names

#define JAVA_OOPETRIS_CLASS_NAME "com/github/oopetris"

#define JAVA_OOPETRIS_CLASS(name) JAVA_OOPETRIS_CLASS_NAME "/" name

// helper

#define METHOD_TYPE(types, return_type) "(" types ")" return_type

#define CONSTRUCTOR_TYPE(types) METHOD_TYPE(types, "V")

#define TYPE_FOR_CLASS(name) "L" name ";"

#define JAVA_CONSTRUCTOR_NAME "<init>"

// no seperator
#define METHOD_DECL_SEPERATOR ""

// base names

#define JAVA_LANG_BASE_PACKAGE "java/lang"

#define JAVA_IO_BASE_PACKAGE "java/io"

#define JOOU_BASE_PACKAGE "org/joou"

// literal types

// type docs: https://docs.oracle.com/en/java/javase/21/docs/specs/jni/types.html

#define BOOLEAN_LITERAL_TYPE "Z"
#define BYTE_LITERAL_TYPE "B"
#define CHAR_LITERAL_TYPE "C"
#define SHORT_LITERAL_TYPE "S"
#define INTEGER_LITERAL_TYPE "I"
#define LONG_LITERAL_TYPE "J"
#define FLOAT_LITERAL_TYPE "F"
#define DOUBLE_LITERAL_TYPE "D"

// JOOU types

#define U8_JAVA_CLASS JOOU_BASE_PACKAGE "/UByte"

#define U8_JAVA_TYPE TYPE_FOR_CLASS(U8_JAVA_CLASS)

#define U32_JAVA_CLASS JOOU_BASE_PACKAGE "/UInteger"

#define U32_JAVA_TYPE TYPE_FOR_CLASS(U32_JAVA_CLASS)

#define U64_JAVA_CLASS JOOU_BASE_PACKAGE "/ULong"

#define U64_JAVA_TYPE TYPE_FOR_CLASS(U64_JAVA_CLASS)


// error codes

#define NoClassDefFoundError JAVA_LANG_BASE_PACKAGE "/NoClassDefFoundError"

#define NoSuchMethodError JAVA_LANG_BASE_PACKAGE "/NoSuchMethodError"

#define ExceptionInInitializerError JAVA_LANG_BASE_PACKAGE "/ExceptionInInitializerError"

#define RuntimeException JAVA_LANG_BASE_PACKAGE "/RuntimeException"

#define FileNotFoundException JAVA_IO_BASE_PACKAGE "/FileNotFoundException"


// functions

std::string JNI_jstring_to_string(JNIEnv* env, jstring j_str);

std::pair<jclass, jmethodID>
get_constructor_for_class(JNIEnv* env, std::string class_name, std::string constructor_signature);

std::pair<jclass, jmethodID>
get_method_for_class(JNIEnv* env, std::string class_name, std::string method_name, std::string method_signature);

std::pair<jclass, jmethodID>
get_static_method_for_class(JNIEnv* env, std::string class_name, std::string method_name, std::string method_signature);

jobject construct_u8(JNIEnv* env, u8 value);

jobject construct_u32(JNIEnv* env, u32 value);

jobject construct_u64(JNIEnv* env, u64 value);

class JavaException : std::runtime_error {
private:
    std::string m_class_name;
    std::string m_message;

public:
    explicit JavaException(std::string class_name);
    explicit JavaException(std::string class_name, std::string message);

    void throw_java_exception(JNIEnv* env) const;
};

void JNI_throw_java_exception(JNIEnv* env, std::string class_name, std::string message);


class JavaExceptionAlreadyThrown : std::runtime_error {
public:
    explicit JavaExceptionAlreadyThrown();
};
