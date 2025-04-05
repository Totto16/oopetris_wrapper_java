#!/usr/bin/bash

set -e
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

## get dynamically

OOPETRIS_INSTALL_ROOT="/usr/local/oopetris_root"

export LD_LIBRARY_PATH="${OOPETRIS_INSTALL_ROOT}/lib/x86_64-linux-gnu/"
export PKG_CONFIG_PATH="${OOPETRIS_INSTALL_ROOT}/lib/x86_64-linux-gnu/pkgconfig"

C_FLAGS="$(pkg-config oopetris-recordings --cflags)"
LIBS="$(pkg-config oopetris-recordings --libs)"

function compile_single_cpp_file() {

    CPP_BASE_NAME="$1"

    "$CXX" "-std=c++23" -c -fPIC "-I${JAVA_ROOT}/include" "-I${JAVA_ROOT}/include/linux" "${CPP_CODE_ROOT}/${CPP_BASE_NAME}.cpp" -o "${BUILD_DIR}/${CPP_BASE_NAME}.o" $C_FLAGS

}

function build_cpp_code() {

    mkdir -p "$BUILD_DIR"

    compile_single_cpp_file "com_github_oopetris_Recordings"

    compile_single_cpp_file "convert"

    compile_single_cpp_file "helper"

    # link
    "$CXX_LD" -shared -fPIC -o "${BUILD_DIR}/liboopetris_recordings_java_native.so" "${BUILD_DIR}/com_github_oopetris_Recordings.o" "${BUILD_DIR}/convert.o" "${BUILD_DIR}/helper.o" $LIBS

}

function compile_single_java_source_file() {

    JAVA_BASE_NAME="$1"

    javac -cp "${JAVA_CODE_ROOT}:${LIBS_PATHS}" "${JAVA_CODE_ROOT}/$JAVA_PACKAGE_NAME/${JAVA_BASE_NAME}.java"

}

LIBS_PATHS="./src/libs/joou-0.9.4.jar"

function build_java_code() {

    # source files
    compile_single_java_source_file "AdditionalInformationValue"
    compile_single_java_source_file "GridProperties"
    compile_single_java_source_file "InputEvent"
    compile_single_java_source_file "Mino"
    compile_single_java_source_file "MinoPosition"
    compile_single_java_source_file "RecordingInformation"
    compile_single_java_source_file "RecordingProperties"
    compile_single_java_source_file "Recordings"
    compile_single_java_source_file "TetrionHeader"
    compile_single_java_source_file "TetrionSnapshot"
    compile_single_java_source_file "TetrominoType"
    compile_single_java_source_file "VariantType"
    compile_single_java_source_file "VariantTypeMismatch"

    # test files
    javac -cp "${JAVA_TEST_ROOT}:${JAVA_CODE_ROOT}:${LIBS_PATHS}" "${JAVA_TEST_ROOT}/$JAVA_PACKAGE_NAME/RecordingsTest.java"

}

function run_tests() {

    java -cp "${JAVA_TEST_ROOT}:${JAVA_CODE_ROOT}:${LIBS_PATHS}" "-Djava.library.path=$(realpath "${BUILD_DIR}")" "com.github.oopetris.RecordingsTest"

}

function main() {

    # build_cpp_code
    build_java_code
    run_tests

}

main
