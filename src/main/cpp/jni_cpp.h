

#pragma once


#include "./exceptions.h"
#include "./helper.h"

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

    if (env->ExceptionCheck() == JNI_TRUE) {
        throw JavaExceptionAlreadyThrown();
    }

    if (_object_instance == nullptr) {
        std::string error = "Could not construct '";
        error += T::java_class;
        error += "'";

        throw JavaException(ExceptionInInitializerError, error);
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

    const auto [_t_class, _t_field_id] = get_static_field_for_class(env, T::java_class, field_name, T::java_type);

    static_assert(std::is_same_v<typename T::native_type, jobject>);
    jobject _t_field_value = env->GetStaticObjectField(_t_class, _t_field_id);

    if (env->ExceptionCheck() == JNI_TRUE) {
        throw JavaExceptionAlreadyThrown();
    }

    if (_t_field_value == nullptr) {
        std::string error = "Could not get static field '";
        error += field_name;
        error += "' for class '";
        error += T::java_class;
        error += "'";

        throw JavaException(RuntimeException, error);
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


struct JObjectDescprition {
    static constexpr const char* java_type = TYPE_FOR_CLASS(JAVA_OBJECT_CLASS);
    static constexpr const char* java_class = JAVA_OBJECT_CLASS;

    using native_type = jobject;
};

static_assert(IsJavaTypeDescription<JObjectDescprition>);


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
