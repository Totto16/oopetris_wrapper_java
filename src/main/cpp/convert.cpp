

#include "./convert.h"

#include "./helper.h"


jobject recording_reader_to_java(JNIEnv* env, const recorder::RecordingReader& reader) {

    (void) env;
    (void) reader;
    throw JavaException(RuntimeException, "Not Implemented: recording_reader_to_java");
}

jobject properties_to_java(JNIEnv* env) {

    jobject jheight = construct_u8(env, grid::height_in_tiles);

    jobject jwidth = construct_u8(env, grid::width_in_tiles);

    const auto [grid_properties_class, grid_properties_constructor] = get_constructor_for_class(
            env, JAVA_OOPETRIS_CLASS("GridProperties"), CONSTRUCTOR_TYPE(U8_JAVA_TYPE METHOD_DECL_SEPERATOR U8_JAVA_TYPE)
    );

    jobject grid_properties = env->NewObject(grid_properties_class, grid_properties_constructor, jheight, jwidth);

    if (grid_properties == nullptr) {
        throw JavaException(ExceptionInInitializerError, "Could not construct 'GridProperties'");
    }

    if (env->ExceptionOccurred() != nullptr) {
        throw JavaExceptionAlreadyThrown();
    }


    const auto [recording_properties_class, recording_properties_constructor] = get_constructor_for_class(
            env, JAVA_OOPETRIS_CLASS("RecordingProperties"), CONSTRUCTOR_TYPE(TYPE_FOR_CLASS("GridProperties"))
    );


    jobject recording_properties =
            env->NewObject(recording_properties_class, recording_properties_constructor, grid_properties);


    if (recording_properties == nullptr) {
        throw JavaException(ExceptionInInitializerError, "Could not construct 'RecordingProperties'");
    }

    if (env->ExceptionOccurred() != nullptr) {
        throw JavaExceptionAlreadyThrown();
    }


    return recording_properties;
}
