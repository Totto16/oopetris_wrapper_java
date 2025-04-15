#!/usr/bin/bash

set -e
set -o pipefail

## folder constants
CODE_ROOT="./src/main"
JAVA_CODE_ROOT="$CODE_ROOT/java"
CPP_CODE_ROOT="$CODE_ROOT/cpp"

JAVA_PACKAGE_NAME="com/github/oopetris"
JAVA_TEST_ROOT="./src/test/java"

BUILD_DIR="$(realpath ./build)"

#program constants
CXX="${CXX:-g++}"
CXX_LD="${CXX_LD:-ld}"

## get dynamically

OOPETRIS_INSTALL_ROOT="/usr/local/oopetris_root"

export LD_LIBRARY_PATH="${OOPETRIS_INSTALL_ROOT}/lib/x86_64-linux-gnu/"
export PKG_CONFIG_PATH="${OOPETRIS_INSTALL_ROOT}/lib/x86_64-linux-gnu/pkgconfig"

function build_cpp_code() {

    L_CWD="$(pwd)"

    cd "${CPP_CODE_ROOT}"

    meson setup build -Dprefix="${BUILD_DIR}"

    meson compile -C build

    meson install -C build

    sudo cp "${BUILD_DIR}/lib/x86_64-linux-gnu/liboopetris_java_wrapper_native.so" "/usr/lib/x86_64-linux-gnu/jni/"

    cd "${L_CWD}"
}

function compile_single_java_source_file() {

    JAVA_BASE_NAME="$1"

    javac -cp "${JAVA_CODE_ROOT}:${LIBS_PATHS}" "${JAVA_CODE_ROOT}/$JAVA_PACKAGE_NAME/${JAVA_BASE_NAME}.java"

}

MAVEN_REPO="${HOME}/.m2/repository"

MAVEN_LIBS="${MAVEN_REPO}/org/junit/jupiter/junit-jupiter/5.9.2/junit-jupiter-5.9.2.jar:${MAVEN_REPO}/org/junit/jupiter/junit-jupiter-api/5.9.2/junit-jupiter-api-5.9.2.jar"

LIBS_PATHS="./src/libs/joou-0.9.4.jar:${MAVEN_LIBS}"

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
    
    #javac -cp "${JAVA_TEST_ROOT}:${JAVA_CODE_ROOT}:${LIBS_PATHS}" "${JAVA_TEST_ROOT}/$JAVA_PACKAGE_NAME/Correct.java"

}

function run_tests() {

    java -cp "${JAVA_TEST_ROOT}:${JAVA_CODE_ROOT}:${LIBS_PATHS}" "-Djava.library.path=${BUILD_DIR}/lib/x86_64-linux-gnu/" "com.github.oopetris.Manual"

}

function main() {

    build_cpp_code
    #build_java_code
    #run_tests

}

main
