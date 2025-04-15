

#pragma once

#include <stdexcept>

#include "./helper.h"


struct JavaException : public std::runtime_error {
private:
    std::string m_class_name;
    std::string m_message;

public:
    explicit JavaException(std::string class_name);
    explicit JavaException(std::string class_name, std::string message);

    void throw_java_exception(JNIEnv* env) const;
};

void JNI_throw_java_exception(JNIEnv* env, std::string class_name, std::string message);


struct JavaExceptionAlreadyThrown : public  std::runtime_error {
public:
    explicit JavaExceptionAlreadyThrown();
};
