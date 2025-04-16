oopetris_recordings_dep = dependency('oopetris-recordings')

dep_compiler = oopetris_recordings_dep.get_variable(
    pkgconfig: 'compiler',
    internal: 'pkg_cpp_compiler',
    default_value: cpp.get_id(),
)

if dep_compiler != cpp.get_id()
    error(
        'Dependency compiler and current compiler don\'t match: \''
        + dep_compiler
        + '\' != \''
        + cpp.get_id()
        + '\'',
    )
endif

if cpp.get_id() == 'clang'

    dep_cpp_stdlib = oopetris_recordings_dep.get_variable(
        pkgconfig: 'cpp_stdlib',
        internal: 'pkg_cpp_stdlib',
    )

    expected_cpp_stdlib = build_with_libcpp ? 'libc++' : 'libstdc++'

    if dep_cpp_stdlib != expected_cpp_stdlib
        error(
            'Dependency and current project not build with the same c++ stdlib: current project is build with \''
            + expected_cpp_stdlib
            + '\' but dependency is build with \''
            + dep_cpp_stdlib
            + '\'',
        )
    endif

endif

deps += oopetris_recordings_dep

## java pseudo dependency

java = find_program('java')

java_properties = run_command(
    java,
    '-XshowSettings:properties',
    '-version',
    check: true,
).stderr().strip().split('\n')

java_home = ''

foreach java_property : java_properties

    java_property_stripped = java_property.strip()

    if java_property_stripped.startswith('java.version')
        java_version = java_property_stripped.split('=')[1].strip()

        java_version_range = get_option('version_range_for_java')

        if not java_version.version_compare(java_version_range)
            error(
                'Expected java version to be \''
                + java_version_range
                + '\' but got version: '
                + java_version,
            )
        endif

    elif java_property_stripped.startswith('java.home')
        java_home = java_property_stripped.split('=')[1].strip()
    endif

endforeach

if java_home == ''
    error('java home could not be found!')
endif

fs = import('fs')

if not fs.is_dir(java_home)
    error('java home \'' + java_home + '\' doesn\'t exist!')
endif

java_include_dirs = [include_directories(java_home / 'include')]

test_folders = ['win32', 'darwin', 'linux']

foreach test_folder : test_folders

    test_folder_path = java_home / 'include' / test_folder

    if fs.exists(test_folder_path)
        java_include_dirs += include_directories(test_folder_path)
    endif

endforeach

java_pseudo_dep = declare_dependency(include_directories: java_include_dirs)

deps += java_pseudo_dep
