

#pragma once

#include "./helper.h"
#include "./jni_cpp.h"
#include "./stacktrace.h"

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
        STACK_TRACE_ADD(JAVA_LIST_CLASS, _stack_scope)

        const auto [_, list_add_function] =
                get_method_for_class(env, m_class_impl, "add", method_type(T::java_type, BOOLEAN_LITERAL_TYPE));


        jboolean result = env->CallBooleanMethod(m_instance, list_add_function, elem);

        if (env->ExceptionCheck() == JNI_TRUE) {
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
