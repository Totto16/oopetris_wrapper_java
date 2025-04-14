
#pragma once

#include <jni.h>

#include <memory>
#include <string>
#include <utility>

#include <core/helper/types.hpp>


// helper

#define JAVA_CLASS_NAME_SEPERATOR "/"

// method decl have an empty seperator
#define METHOD_DECL_SEPERATOR ""

#define METHOD_TYPE(types, return_type) "(" types ")" return_type

#define CONSTRUCTOR_TYPE(types) METHOD_TYPE(types, "V")

#define TYPE_FOR_CLASS(name) "L" name ";"

#define JAVA_CONSTRUCTOR_NAME "<init>"

// oopetris specific names

#define JAVA_OOPETRIS_CLASS_NAME "com" JAVA_CLASS_NAME_SEPERATOR "github" JAVA_CLASS_NAME_SEPERATOR "oopetris"

#define JAVA_OOPETRIS_CLASS(name) JAVA_OOPETRIS_CLASS_NAME "/" name


// base names

#define JAVA_LANG_BASE_PACKAGE "java" JAVA_CLASS_NAME_SEPERATOR "lang"

#define JAVA_UTIL_BASE_PACKAGE "java" JAVA_CLASS_NAME_SEPERATOR "util"

#define JAVA_IO_BASE_PACKAGE "java" JAVA_CLASS_NAME_SEPERATOR "io"

#define JOOU_BASE_PACKAGE "org" JAVA_CLASS_NAME_SEPERATOR "joou"

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

#define U8_JAVA_CLASS JOOU_BASE_PACKAGE JAVA_CLASS_NAME_SEPERATOR "UByte"

#define U8_JAVA_TYPE TYPE_FOR_CLASS(U8_JAVA_CLASS)

#define U32_JAVA_CLASS JOOU_BASE_PACKAGE JAVA_CLASS_NAME_SEPERATOR "UInteger"

#define U32_JAVA_TYPE TYPE_FOR_CLASS(U32_JAVA_CLASS)

#define U64_JAVA_CLASS JOOU_BASE_PACKAGE JAVA_CLASS_NAME_SEPERATOR "ULong"

#define U64_JAVA_TYPE TYPE_FOR_CLASS(U64_JAVA_CLASS)


// error codes

#define NoClassDefFoundError JAVA_LANG_BASE_PACKAGE JAVA_CLASS_NAME_SEPERATOR "NoClassDefFoundError"

#define NoSuchMethodError JAVA_LANG_BASE_PACKAGE JAVA_CLASS_NAME_SEPERATOR "NoSuchMethodError"

#define ExceptionInInitializerError JAVA_LANG_BASE_PACKAGE JAVA_CLASS_NAME_SEPERATOR "ExceptionInInitializerError"

#define RuntimeException JAVA_LANG_BASE_PACKAGE JAVA_CLASS_NAME_SEPERATOR "RuntimeException"

#define FileNotFoundException JAVA_IO_BASE_PACKAGE JAVA_CLASS_NAME_SEPERATOR "FileNotFoundException"

// classes

#define JAVA_LIST_CLASS JAVA_UTIL_BASE_PACKAGE JAVA_CLASS_NAME_SEPERATOR "List"

#define JAVA_ARRAYLIST_CLASS JAVA_UTIL_BASE_PACKAGE JAVA_CLASS_NAME_SEPERATOR "ArrayList"

#define JAVA_MAP_CLASS JAVA_UTIL_BASE_PACKAGE JAVA_CLASS_NAME_SEPERATOR "Map"


// functions

[[nodiscard]] std::string JNI_jstring_to_string(JNIEnv* env, jstring j_str);

[[nodiscard]] jstring JNI_get_jstring(JNIEnv* env, std::string str);

[[nodiscard]] jstring JNI_get_jstring(JNIEnv* env, const char* c_str);

[[nodiscard]] std::pair<jclass, jmethodID>
get_constructor_for_class(JNIEnv* env, std::string class_name, std::string constructor_signature);

[[nodiscard]] std::pair<jclass, jmethodID>
get_method_for_class(JNIEnv* env, jclass clazz, std::string method_name, std::string method_signature);

[[nodiscard]] std::pair<jclass, jmethodID>
get_method_for_class(JNIEnv* env, std::string class_name, std::string method_name, std::string method_signature);


[[nodiscard]] std::pair<jclass, jmethodID>
get_static_method_for_class(JNIEnv* env, std::string class_name, std::string method_name, std::string method_signature);

[[nodiscard]] jobject construct_u8(JNIEnv* env, u8 value);

[[nodiscard]] jobject construct_u32(JNIEnv* env, u32 value);

[[nodiscard]] jobject construct_u64(JNIEnv* env, u64 value);

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

template<typename T>
concept IsJavaTypeDescription = requires(T) {
    { T::java_class } -> std::convertible_to<const char*>;
    { T::java_type } -> std::convertible_to<const char*>;
    typename T::native_type;
};

static_assert(not IsJavaTypeDescription<bool>);

template<typename T>
concept IsJavaTypeDescriptionForObject = IsJavaTypeDescription<T> && requires(T) { std::is_same_v<typename T::native_type, jobject>; };

static_assert(not IsJavaTypeDescriptionForObject<bool>);

template<typename T>
concept IsJavaListImpl = IsJavaTypeDescription<T> && requires(T) {
    { T::has_initial_capacity_constructor } -> std::convertible_to<bool>;
};


// see: https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/ArrayList.html
struct ArrayListImpl {
    static constexpr const char* java_class = JAVA_ARRAYLIST_CLASS;
    static constexpr const char* java_type = TYPE_FOR_CLASS(JAVA_ARRAYLIST_CLASS);

    static constexpr bool has_initial_capacity_constructor = true;

    using native_type = jobject;
};


static_assert(IsJavaListImpl<ArrayListImpl>);

// see https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/List.html
template<typename ListImpl, typename T>
    requires IsJavaListImpl<ListImpl> && IsJavaTypeDescriptionForObject<T>
class JList {
private:
    jobject m_instance;
    jclass m_class_impl;

public:
    explicit JList(JNIEnv* env) {

        const auto [list_class, list_constructor] =
                get_constructor_for_class(env, ListImpl::java_class, CONSTRUCTOR_TYPE(""));

        m_class_impl = list_class;

        jobject list_instance = env->NewObject(list_class, list_constructor);


        if (list_instance == nullptr) {
            throw JavaException(ExceptionInInitializerError, "Could not construct '" + ListImpl::java_class + "'");
        }

        if (env->ExceptionOccurred() != nullptr) {
            throw JavaExceptionAlreadyThrown();
        }

        m_instance = list_instance;
    }


    explicit JList(JNIEnv* env, jint initial_capacity)
        requires ListImpl::has_initial_capacity_constructor
    {

        const auto [list_class, list_constructor] =
                get_constructor_for_class(env, ListImpl::java_class, CONSTRUCTOR_TYPE(INTEGER_LITERAL_TYPE));

        m_class_impl = list_class;

        jobject list_instance = env->NewObject(list_class, list_constructor, initial_capacity);


        if (list_instance == nullptr) {
            throw JavaException(ExceptionInInitializerError, "Could not construct '" + ListImpl::java_class + "'");
        }

        if (env->ExceptionOccurred() != nullptr) {
            throw JavaExceptionAlreadyThrown();
        }

        m_instance = list_instance;
    }

    [[nodiscard]] jboolean append(JNIEnv* env, T::native_type elem) {


        const auto [_, list_add_function] =
                get_method_for_class(env, m_class_impl, "add", METHOD_TYPE(+T::java_type +, BOOLEAN_LITERAL_TYPE));


        jboolean result = env->CallBooleanMethod(m_instance, list_add_function, elem);

        if (env->ExceptionOccurred() != nullptr) {
            throw JavaExceptionAlreadyThrown();
        }

        return result;
    }

    [[nodiscard]] jobject get_result() const {
        return m_instance;
    }
};

template<typename T>
    requires IsJavaTypeDescription<T>
using JArrayList = JList<ArrayListImpl, T>;
