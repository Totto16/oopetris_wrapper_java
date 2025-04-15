
#pragma once

#include <jni.h>

#include <sstream>
#include <string>
#include <utility>

#include <core/helper/types.hpp>


// helper

#define JAVA_CLASS_NAME_SEPERATOR "/"

// method decl have an empty seperator
#define METHOD_DECL_SEPERATOR ""

#define METHOD_TYPE(types, return_type) "(" types ")" return_type

[[nodiscard]] static constexpr std::string method_type(std::string types, std::string return_type) {
    return "(" + types + ")" + return_type;
}

#define VOID_LITERAL_TYPE "V"

#define CONSTRUCTOR_TYPE(types) METHOD_TYPE(types, VOID_LITERAL_TYPE)

[[nodiscard]] static constexpr std::string constructor_type(std::string types) {
    return method_type(types, VOID_LITERAL_TYPE);
}

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

#define JAVA_HASHMAP_CLASS JAVA_UTIL_BASE_PACKAGE JAVA_CLASS_NAME_SEPERATOR "HashMap"

#define JAVA_STRING_CLASS JAVA_LANG_BASE_PACKAGE JAVA_CLASS_NAME_SEPERATOR "String"

#define JAVA_BOOLEAN_CLASS JAVA_LANG_BASE_PACKAGE JAVA_CLASS_NAME_SEPERATOR "Boolean"

#define JAVA_FLOAT_CLASS JAVA_LANG_BASE_PACKAGE JAVA_CLASS_NAME_SEPERATOR "Float"

#define JAVA_DOUBLE_CLASS JAVA_LANG_BASE_PACKAGE JAVA_CLASS_NAME_SEPERATOR "Double"

#define JAVA_BYTE_CLASS JAVA_LANG_BASE_PACKAGE JAVA_CLASS_NAME_SEPERATOR "Byte"

#define JAVA_INTEGER_CLASS JAVA_LANG_BASE_PACKAGE JAVA_CLASS_NAME_SEPERATOR "Integer"

#define JAVA_LONG_CLASS JAVA_LANG_BASE_PACKAGE JAVA_CLASS_NAME_SEPERATOR "Long"


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

[[nodiscard]] std::pair<jclass, jfieldID>
get_static_field_for_class(JNIEnv* env, std::string class_name, std::string field_name, std::string field_type);

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

// concepts and templates

namespace details {


    template<typename T>
    concept HasJavaClass = requires(T) {
        { T::java_class } -> std::convertible_to<const char*>;
    };

    template<typename T>
    concept IsJavaLiteralTypeDescription = requires(T) {
        { T::java_type } -> std::convertible_to<const char*>;
        typename T::native_type;
        not std::is_same_v<typename T::native_type, jobject>;
    } and not HasJavaClass<T>;


    template<typename T>
    concept IsJavaClassTypeDescription = requires(T) {
        { T::java_type } -> std::convertible_to<const char*>;
        typename T::native_type;
        std::is_same_v<typename T::native_type, jobject>;
    } and HasJavaClass<T>;


} // namespace details


template<typename T>
concept IsJavaTypeDescription = details::IsJavaLiteralTypeDescription<T> || details::IsJavaClassTypeDescription<T>;


static_assert(not IsJavaTypeDescription<bool>);


template<typename T>
concept IsJavaTypeDescriptionForObject = IsJavaTypeDescription<T> && requires(T) {
    std::is_same_v<typename T::native_type, jobject>;
} && details::IsJavaClassTypeDescription<T>;

static_assert(not IsJavaTypeDescriptionForObject<bool>);

namespace details {

    // some concepts are from https://stackoverflow.com/questions/76223849/how-to-write-a-concept-that-checks-for-an-inner-type-in-all-the-types-of-a-std


    template<typename>
    struct is_tuple : std::false_type { };

    template<typename... T>
    struct is_tuple<std::tuple<T...>> : std::true_type { };

    // Helper for checking that all template parameters satisfy Inner
    // concept and all pairs satisfy SameInner.
    template<typename>
    struct inner_container_impl : std::false_type { };

    template<template<typename...> class Tp, IsJavaTypeDescription T>
    struct inner_container_impl<Tp<T>> {
        static constexpr bool value = true;
    };


    // Do T and U have same inner type.
    template<class T, class U>
    concept _helper_impl_1 = IsJavaTypeDescription<T> and IsJavaTypeDescription<U>;

    template<template<typename...> class Tp, IsJavaTypeDescription T, IsJavaTypeDescription... Ts>
    struct inner_container_impl<Tp<T, Ts...>> {
        static constexpr bool value = (_helper_impl_1<T, Ts> and ...);
    };

    // The concept just use the helper.
    template<class T>
    concept InnerContainer = inner_container_impl<T>::value;

} // namespace details

template<typename T>
concept IsJavaConstructor = requires(T) {
    typename T::inner;
    details::is_tuple<typename T::inner>::value;
};

static_assert(not IsJavaTypeDescription<bool>);

template<typename T>
concept JavaDescriptionHasConstructorType =
        requires(T) { typename T::constructor; } && IsJavaConstructor<typename T::constructor>;


static_assert(not JavaDescriptionHasConstructorType<bool>);

namespace details {

    // See https://stackoverflow.com/questions/64212450/iterate-over-types-of-tuple-in-c
    template<typename T, typename FUNC>
    static inline constexpr void for_each_type(FUNC&& func) {
        auto __hander = []<typename S, typename F2, size_t... I>(F2&& func, std::index_sequence<I...>) {
            (func.template operator()<std::tuple_element_t<I, S>>(), ...);
        };
        __hander.template operator(
        )<T>(std::forward<FUNC>(func), std::make_index_sequence<std::tuple_size<T>::value>{});
    }

    template<typename C>
        requires IsJavaConstructor<C>
    constexpr std::string java_get_string_for_constructor() {

        std::stringstream result{};

        for_each_type<typename C::inner>([&result]<typename T>() { result << std::string{ T::java_type }; });

        return constructor_type(result.str());
    }

    template<typename>
    struct map_to_expected_types_impl {
        using value = std::tuple<>;
    };

    template<typename Tuple>
    struct map_to_expected_types_impl;

    template<typename T>
    using extract_type = T::native_type;

    template<class... Values>
    struct map_to_expected_types_impl<std::tuple<Values...>> {
        using value = std::tuple<extract_type<Values>...>;
    };

    template<typename C>
        requires IsJavaConstructor<C>
    using map_to_expected_types = map_to_expected_types_impl<typename C::inner>::value;


    template<typename C>
    struct CWrapper {
        using constructor = C;
    };

} // namespace details

template<typename T, typename C, typename... Args>
    requires IsJavaTypeDescriptionForObject<T> && (IsJavaConstructor<C> || JavaDescriptionHasConstructorType<T>)
std::pair<jclass, typename T::native_type> construct_new_java_object_extended(JNIEnv* env, Args... args) {

    using ConstructorToUse = std::conditional_t<IsJavaConstructor<C>, details::CWrapper<C>, T>::constructor;

    // assert that the passed values are the same, that we excpect, I would like to get this error prettier, but it is better than nothing
    static_assert(std::is_same_v<std::tuple<Args...>, details::map_to_expected_types<ConstructorToUse>>);


    const auto [_t_class, _t_constructor] =
            get_constructor_for_class(env, T::java_class, details::java_get_string_for_constructor<ConstructorToUse>());


    jobject _object_instance = env->NewObject(_t_class, _t_constructor, args...);

    if (_object_instance == nullptr) {
        std::string error = "Could not construct '";
        error += T::java_class;
        error += "'";

        throw JavaException(ExceptionInInitializerError, error);
    }

    if (env->ExceptionOccurred() != nullptr) {
        throw JavaExceptionAlreadyThrown();
    }

    return std::make_pair(_t_class, _object_instance);
}

template<typename T, typename... Args>
    requires IsJavaTypeDescriptionForObject<T> && JavaDescriptionHasConstructorType<T>
std::pair<jclass, typename T::native_type> construct_new_java_object(JNIEnv* env, Args... args) {
    return construct_new_java_object_extended<T, bool, Args...>(env, args...);
}


template<typename T>
concept IsJavaEnum = requires(T) {
    typename T::enum_type;
    std::is_enum_v<typename T::enum_type>;
    requires requires(T::enum_type val) {
        { T::value_to_string(val) } -> std::convertible_to<std::string>;
    };
};


template<typename T>
concept IsJavaTypeDescriptionForEnum =
        IsJavaTypeDescriptionForObject<T> && requires { typename T::enum_type; } && IsJavaEnum<typename T::enum_type>;

static_assert(not IsJavaTypeDescriptionForEnum<bool>);


template<typename T>
    requires IsJavaTypeDescriptionForEnum<T>
T::native_type construct_new_java_enum(JNIEnv* env, typename T::enum_type::enum_type value) {

    using EnumType = T::enum_type;
    static_assert(IsJavaEnum<EnumType>);

    std::string field_name = EnumType::value_to_string(value);

    const auto [_t_class, _t_field_id] = get_static_field_for_class(env, T::java_class, field_name, "");


    static_assert(std::is_same_v<typename T::native_type, jobject>);
    jobject _t_field_value = env->GetStaticObjectField(_t_class, _t_field_id);

    if (_t_field_value == nullptr) {
        std::string error = "Could not get static field '";
        error += field_name;
        error += "' for class '";
        error += T::java_class;
        error += "'";

        throw JavaException(RuntimeException, error);
    }

    if (env->ExceptionOccurred() != nullptr) {
        throw JavaExceptionAlreadyThrown();
    }

    return _t_field_value;
}


// basic java type descriptions


struct JBoolLiteralDescription {
    static constexpr const char* java_type = BOOLEAN_LITERAL_TYPE;
    using native_type = jboolean;
};

static_assert(IsJavaTypeDescription<JBoolLiteralDescription>);


struct JFloatLiteralDescription {
    static constexpr const char* java_type = FLOAT_LITERAL_TYPE;
    using native_type = jfloat;
};

static_assert(IsJavaTypeDescription<JFloatLiteralDescription>);

struct JDoubleLiteralDescription {
    static constexpr const char* java_type = FLOAT_LITERAL_TYPE;
    using native_type = jdouble;
};

static_assert(IsJavaTypeDescription<JDoubleLiteralDescription>);

struct JByteLiteralDescription {
    static constexpr const char* java_type = BYTE_LITERAL_TYPE;
    using native_type = jbyte;
};

static_assert(IsJavaTypeDescription<JByteLiteralDescription>);

struct JIntLiteralDescription {
    static constexpr const char* java_type = INTEGER_LITERAL_TYPE;
    using native_type = jint;
};

static_assert(IsJavaTypeDescription<JIntLiteralDescription>);

struct JLongLiteralDescription {
    static constexpr const char* java_type = LONG_LITERAL_TYPE;
    using native_type = jlong;
};

static_assert(IsJavaTypeDescription<JLongLiteralDescription>);


struct JStringDescription {
    static constexpr const char* java_type = TYPE_FOR_CLASS(JAVA_STRING_CLASS);
    static constexpr const char* java_class = JAVA_STRING_CLASS;

    using native_type = jstring;
};

static_assert(IsJavaTypeDescription<JStringDescription>);

// TODO: use valueOF static getter instead of Constructor() see e.g. https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Double.html#valueOf(double)
struct JBooleanDescription {
    static constexpr const char* java_type = TYPE_FOR_CLASS(JAVA_BOOLEAN_CLASS);
    static constexpr const char* java_class = JAVA_BOOLEAN_CLASS;

    using native_type = jobject;

    using constructor = struct {
        using inner = std::tuple<JBoolLiteralDescription>;
    };
};

static_assert(IsJavaTypeDescription<JBooleanDescription>);
static_assert(JavaDescriptionHasConstructorType<JBooleanDescription>);

struct JFloatDescription {
    static constexpr const char* java_type = TYPE_FOR_CLASS(JAVA_FLOAT_CLASS);
    static constexpr const char* java_class = JAVA_FLOAT_CLASS;

    using native_type = jobject;

    using constructor = struct {
        using inner = std::tuple<JFloatLiteralDescription>;
    };
};

static_assert(IsJavaTypeDescription<JFloatDescription>);
static_assert(JavaDescriptionHasConstructorType<JFloatDescription>);

struct JDoubleDescription {
    static constexpr const char* java_type = TYPE_FOR_CLASS(JAVA_DOUBLE_CLASS);
    static constexpr const char* java_class = JAVA_DOUBLE_CLASS;

    using native_type = jobject;

    using constructor = struct {
        using inner = std::tuple<JDoubleLiteralDescription>;
    };
};

static_assert(IsJavaTypeDescription<JDoubleDescription>);
static_assert(JavaDescriptionHasConstructorType<JDoubleDescription>);

struct JByteDescription {
    static constexpr const char* java_type = TYPE_FOR_CLASS(JAVA_BYTE_CLASS);
    static constexpr const char* java_class = JAVA_BYTE_CLASS;

    using native_type = jobject;

    using constructor = struct {
        using inner = std::tuple<JByteLiteralDescription>;
    };
};

static_assert(IsJavaTypeDescription<JByteDescription>);
static_assert(JavaDescriptionHasConstructorType<JByteDescription>);

struct JIntegerDescription {
    static constexpr const char* java_type = TYPE_FOR_CLASS(JAVA_INTEGER_CLASS);
    static constexpr const char* java_class = JAVA_INTEGER_CLASS;

    using native_type = jobject;

    using constructor = struct {
        using inner = std::tuple<JIntLiteralDescription>;
    };
};

static_assert(IsJavaTypeDescription<JIntegerDescription>);
static_assert(JavaDescriptionHasConstructorType<JIntegerDescription>);

struct JLongDescription {
    static constexpr const char* java_type = TYPE_FOR_CLASS(JAVA_LONG_CLASS);
    static constexpr const char* java_class = JAVA_LONG_CLASS;

    using native_type = jobject;

    using constructor = struct {
        using inner = std::tuple<JLongLiteralDescription>;
    };
};

static_assert(IsJavaTypeDescription<JLongDescription>);
static_assert(JavaDescriptionHasConstructorType<JLongDescription>);

struct JU8Description {

    static constexpr const char* java_class = U8_JAVA_CLASS;
    static constexpr const char* java_type = U8_JAVA_TYPE;

    using native_type = jobject;
};

static_assert(IsJavaTypeDescriptionForObject<JU8Description>);

struct JU32Description {

    static constexpr const char* java_class = U32_JAVA_CLASS;
    static constexpr const char* java_type = U32_JAVA_TYPE;

    using native_type = jobject;
};

static_assert(IsJavaTypeDescriptionForObject<JU32Description>);

struct JU64Description {

    static constexpr const char* java_class = U64_JAVA_CLASS;
    static constexpr const char* java_type = U64_JAVA_TYPE;

    using native_type = jobject;
};

static_assert(IsJavaTypeDescriptionForObject<JU64Description>);


// list specific stuff

template<typename T>
concept IsJavaListImpl = IsJavaTypeDescriptionForObject<T> && requires(T) {
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


struct ListConstructorEmpty {
    using inner = std::tuple<>;
};

static_assert(IsJavaConstructor<ListConstructorEmpty>);


struct ListConstructorWithCapacity {
    using inner = std::tuple<JIntLiteralDescription>;
};

static_assert(IsJavaConstructor<ListConstructorWithCapacity>);

struct JListDescription {
    static constexpr const char* java_class = JAVA_LIST_CLASS;
    static constexpr const char* java_type = TYPE_FOR_CLASS(JAVA_LIST_CLASS);

    using native_type = jobject;
};

static_assert(IsJavaTypeDescription<JListDescription>);


// see https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/List.html
template<typename ListImpl, typename T>
    requires IsJavaListImpl<ListImpl> && IsJavaTypeDescriptionForObject<T>
class JList {
private:
    jobject m_instance;
    jclass m_class_impl;

public:
    explicit JList(JNIEnv* env) {


        const auto [list_class, list_instance] =
                construct_new_java_object_extended<ListImpl, ListConstructorEmpty>(env);

        m_class_impl = list_class;
        m_instance = list_instance;
    }


    explicit JList(JNIEnv* env, jint initial_capacity)
        requires ListImpl::has_initial_capacity_constructor
    {

        const auto [list_class, list_instance] =
                construct_new_java_object_extended<ListImpl, ListConstructorWithCapacity>(env, initial_capacity);

        m_class_impl = list_class;
        m_instance = list_instance;
    }

    [[nodiscard]] jboolean append(JNIEnv* env, T::native_type elem) {


        const auto [_, list_add_function] =
                get_method_for_class(env, m_class_impl, "add", method_type(T::java_type, BOOLEAN_LITERAL_TYPE));


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


// map specific stuff


template<typename T>
concept IsJavaMapImpl = IsJavaTypeDescriptionForObject<T> && requires(T) {
    { T::has_initial_capacity_constructor } -> std::convertible_to<bool>;
};


// see: https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/HashMap.html
struct HashMapImpl {
    static constexpr const char* java_class = JAVA_HASHMAP_CLASS;
    static constexpr const char* java_type = TYPE_FOR_CLASS(JAVA_HASHMAP_CLASS);

    static constexpr bool has_initial_capacity_constructor = true;

    using native_type = jobject;
};


static_assert(IsJavaMapImpl<HashMapImpl>);


struct MapConstructorEmpty {
    using inner = std::tuple<>;
};

static_assert(IsJavaConstructor<MapConstructorEmpty>);


struct MapConstructorWithCapacity {
    using inner = std::tuple<JIntLiteralDescription>;
};

static_assert(IsJavaConstructor<MapConstructorWithCapacity>);

struct JMapDescription {
    static constexpr const char* java_class = JAVA_MAP_CLASS;
    static constexpr const char* java_type = TYPE_FOR_CLASS(JAVA_MAP_CLASS);

    using native_type = jobject;
};

static_assert(IsJavaTypeDescription<JMapDescription>);


// see https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Map.html
template<typename MapImpl, typename Key, typename Value>
    requires IsJavaMapImpl<MapImpl> && IsJavaTypeDescriptionForObject<Key> && IsJavaTypeDescriptionForObject<Value>
class JMap {
private:
    jobject m_instance;
    jclass m_class_impl;

public:
    explicit JMap(JNIEnv* env) {


        const auto [map_class, map_instance] = construct_new_java_object_extended<MapImpl, MapConstructorEmpty>(env);

        m_class_impl = map_class;
        m_instance = map_instance;
    }


    explicit JMap(JNIEnv* env, jint initial_capacity)
        requires MapImpl::has_initial_capacity_constructor
    {

        const auto [map_class, map_instance] =
                construct_new_java_object_extended<MapImpl, MapConstructorWithCapacity>(env, initial_capacity);

        m_class_impl = map_class;
        m_instance = map_instance;
    }

    Value::native_type put(JNIEnv* env, Key::native_type key, Value::native_type value) {

        std::string types = std::string{ Key::java_type } + METHOD_DECL_SEPERATOR + Value::java_type;

        const auto [_, map_put_function] =
                get_method_for_class(env, m_class_impl, "put", method_type(types, Value::java_type));

        static_assert(std::is_same_v<typename Value::native_type, jobject>);
        jobject result = env->CallObjectMethod(m_instance, map_put_function, key, value);

        if (result == nullptr) {
            throw JavaException(RuntimeException, "Error in call to Map::put");
        }

        if (env->ExceptionOccurred() != nullptr) {
            throw JavaExceptionAlreadyThrown();
        }

        return result;
    }

    [[nodiscard]] jobject get_result() const {
        return m_instance;
    }
};

template<typename Key, typename Value>
    requires IsJavaTypeDescriptionForObject<Key> && IsJavaTypeDescriptionForObject<Value>
using JHashMap = JMap<HashMapImpl, Key, Value>;
