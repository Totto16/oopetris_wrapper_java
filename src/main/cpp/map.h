
#pragma once

#include "./helper.h"
#include "./jni_cpp.h"
#include "./stacktrace.h"

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

    /**
     * returns the previous value (might be null) 
     */
    Value::native_type put(JNIEnv* env, Key::native_type key, Value::native_type value, bool allow_replace) {
        STACK_TRACE_ADD(JAVA_MAP_CLASS, _stack_scope)

        std::string types =
                std::string{ JObjectDescprition::java_type } + METHOD_DECL_SEPERATOR + JObjectDescprition::java_type;

        const auto [IGNORE_THIS, map_put_function] =
                get_method_for_class(env, m_class_impl, "put", method_type(types, JObjectDescprition::java_type));

        static_assert(std::is_same_v<typename Value::native_type, jobject>);
        jobject result = env->CallObjectMethod(m_instance, map_put_function, key, value);

        if (env->ExceptionCheck() == JNI_TRUE) {
            throw JavaExceptionAlreadyThrown();
        }

        // the result is the previous value, which we we report as error, if replace is off
        if (result != nullptr && not allow_replace) {
            throw JavaException(
                    IllegalStateException,
                    "Error in call to Map::put, replace is not allowed, but the put replaced a value"
            );
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
