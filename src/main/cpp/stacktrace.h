

#pragma once

// JNI java stacktrace support, see https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/StackTraceElement.html


#include "./helper.h"
#include "./jni_cpp.h"

// stack trace helkper macros

#ifdef NDEBUG
#define STACK_TRACE_ADD_CUSTOM(CLASS_NAME, METHOD_NAME, local_name)
#else
#define STACK_TRACE_ADD_CUSTOM(CLASS_NAME, METHOD_NAME, local_name)       \
    RAAIStackTraceEntry local_name{                                       \
        CPPStackTraceEntry{ CLASS_NAME, METHOD_NAME, __FILE__, __LINE__ } \
    };
#endif

#define STACK_TRACE_ADD(CLASS_NAME, local_name) STACK_TRACE_ADD_CUSTOM(CLASS_NAME, __PRETTY_FUNCTION__, local_name)

// java desxcriptions

#define JAVA_STACKTRACE_ELEMENT_CLASS JAVA_LANG_BASE_PACKAGE JAVA_CLASS_NAME_SEPERATOR "StackTraceElement"

#define JAVA_THROWABLE_CLASS JAVA_LANG_BASE_PACKAGE JAVA_CLASS_NAME_SEPERATOR "Throwable"

struct JStackTraceElement {
    static constexpr const char* java_class = JAVA_STACKTRACE_ELEMENT_CLASS;
    static constexpr const char* java_type = TYPE_FOR_CLASS(JAVA_STACKTRACE_ELEMENT_CLASS);

    using native_type = jobject;

    using constructor = struct {
        using inner = std::tuple<
                JStringDescription,
                JStringDescription,
                JStringDescription,
                JStringDescription,
                JStringDescription,
                JStringDescription,
                JIntLiteralDescription>;
    };
};

static_assert(IsJavaTypeDescriptionForObject<JStackTraceElement>);
static_assert(JavaDescriptionHasConstructorType<JStackTraceElement>);

struct JThrowable {
    static constexpr const char* java_class = JAVA_THROWABLE_CLASS;
    static constexpr const char* java_type = TYPE_FOR_CLASS(JAVA_THROWABLE_CLASS);

    using native_type = jthrowable;
};

static_assert(IsJavaTypeDescriptionForObject<JThrowable>);


struct CPPStackTraceEntry {
private:
    std::string m_class_name;
    std::string m_method_name;
    std::string m_file_name;
    int m_line_number;

public:
    CPPStackTraceEntry(std::string class_name, std::string method_name, std::string file_name, int line_number);

    [[nodiscard]] jobject to_java_stack_trace_element(JNIEnv* env) const;

    static void add_stack_trace_to_throwable(JNIEnv* env, jthrowable throwable);
};


struct RAAIStackTraceEntry {
private:
    std::size_t m_stack_size_on_add;

    static void add_stack_trace_element(CPPStackTraceEntry&& entry);
    void remove_stack_trace_element();

public:
    RAAIStackTraceEntry(CPPStackTraceEntry&& entry);
    ~RAAIStackTraceEntry();
};
