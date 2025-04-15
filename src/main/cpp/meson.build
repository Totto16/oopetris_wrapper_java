project(
    'oopetris_java_wrapper_native_part',
    'cpp',
    'c',
    meson_version: '>=1.3.0',
    default_options: {
        'buildtype': 'debug',
        'optimization': '3',
        'strip': true,
        'cpp_std': ['c++23', 'c++latest', 'vc++latest', 'c++20'],
        'c_std': ['c11'],
        'b_ndebug': 'if-release',

    },
    version: '0.5.6',
)

deps = []

src_files = []

src_files += files(
    'com_github_oopetris_Recordings.cpp',
    'com_github_oopetris_Recordings.h',
    'convert.cpp',
    'convert.h',
    'exceptions.cpp',
    'exceptions.h',
    'helper.cpp',
    'helper.h',
    'jni_cpp.h',
    'list.h',
    'map.h',
    'stacktrace.cpp',
    'stacktrace.h',
)

subdir('tools')

liboopetris_java_wrapper_native = library(
    'oopetris_java_wrapper_native',
    src_files,
    dependencies: deps,
    cpp_shared_args: ['-DOOPETRIS_LIBRARY_C_WRAPPER_EXPORT'],
    override_options: {
        'warning_level': '3',
        'werror': true,
    },
    version: meson.project_version(),
    install: true,
)
