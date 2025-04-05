#!/usr/bin/bash

set -ex
set -o pipefail

## folder constants
JAVA_ROOT="/usr/lib/jvm/java-21-openjdk-amd64"
CODE_ROOT="./src/main"
JAVA_CODE_ROOT="$CODE_ROOT/java"
CPP_CODE_ROOT="$CODE_ROOT/cpp"

JAVA_PACKAGE_NAME="com/github/oopetris"
JAVA_TEST_ROOT="./src/test/java"

BUILD_DIR="./build"

#program constants
CXX="${CXX:-g++}"
CXX_LD="${CXX_LD:-ld}"

function build_cpp_code() {

    OOPETRIS_INSTALL_ROOT="/usr/local/oopetris_root"

    export LD_LIBRARY_PATH="${OOPETRIS_INSTALL_ROOT}/lib/x86_64-linux-gnu/"
    export PKG_CONFIG_PATH="${OOPETRIS_INSTALL_ROOT}/lib/x86_64-linux-gnu/pkgconfig"

    C_FLAGS="$(pkg-config oopetris-recordings --cflags)"
    LIBS="$(pkg-config oopetris-recordings --libs)"

    mkdir -p "$BUILD_DIR"

    "$CXX" "-std=c++23" -c -fPIC "-I${JAVA_ROOT}/include" "-I${JAVA_ROOT}/include/linux" "${CPP_CODE_ROOT}/com_github_oopetris_Recordings.cpp" -o "${BUILD_DIR}/com_github_oopetris_Recordings.o" $C_FLAGS

    "$CXX" "-std=c++23" -c -fPIC "-I${JAVA_ROOT}/include" "-I${JAVA_ROOT}/include/linux" "${CPP_CODE_ROOT}/convert.cpp" -o "${BUILD_DIR}/convert.o" $C_FLAGS

    "$CXX" "-std=c++23" -c -fPIC "-I${JAVA_ROOT}/include" "-I${JAVA_ROOT}/include/linux" "${CPP_CODE_ROOT}/helper.cpp" -o "${BUILD_DIR}/helper.o" $C_FLAGS

    # link
    "$CXX_LD" -shared -fPIC -o "${BUILD_DIR}/liboopetris_recordings_java_native.so" "${BUILD_DIR}/com_github_oopetris_Recordings.o" "${BUILD_DIR}/convert.o" "${BUILD_DIR}/helper.o" $LIBS

}

function build_java_code() {

    # source files
    javac -cp "${JAVA_CODE_ROOT}" "${JAVA_CODE_ROOT}/$JAVA_PACKAGE_NAME/Recordings.java"

    # test files
    javac -cp "${JAVA_TEST_ROOT}:${JAVA_CODE_ROOT}" "${JAVA_TEST_ROOT}/$JAVA_PACKAGE_NAME/RecordingsTest.java"

}

function run_tests() {

    java -cp "${JAVA_TEST_ROOT}:${JAVA_CODE_ROOT}" "-Djava.library.path=$(realpath "${BUILD_DIR}")" "com.github.oopetris.RecordingsTest"

}

function main() {

    build_cpp_code
    build_java_code
    run_tests

}

main
