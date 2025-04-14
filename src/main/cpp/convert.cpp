

#include "./convert.h"

#include "./helper.h"

/* 
static jobject information_value_to_java(const recorder::InformationValue& information_value) {

    return std::visit(
            helper::Overloaded{
                    [](const std::string& value) -> jobject { return TODO; },
                    [](const float& value) -> jobject { return TODO; },
                    [](const double& value) -> jobject { return TODO; },
                    [](const bool& value) -> jobject { return TODO; }, [](const u8& value) -> jobject { return TODO; },
                    [](const i8& value) -> jobject { return TODO; }, [](const u32& value) -> jobject { return TODO; },
                    [](const i32& value) -> jobject { return TODO; }, [](const u64& value) -> jobject { return TODO; },
                    [](const i64& value) -> jobject { return TODO; },
                    [](const std::vector<recorder::InformationValue>& values) -> jobject {
                        pybind11::list array{};

                        for (auto& value : values) {
                            array.append(value);
                        }

                        return array;
                    } },
            information_value.underlying()
    );
}

static pybind11::dict information_to_java(const recorder::AdditionalInformation& information) {

    pybind11::dict result{};

    for (const auto& [key, raw_value] : information) {
        auto value = information_value_to_java(raw_value);
        result[pybind11::str(key)] = value;
    }

    return result;
}

const char* event_to_string(InputEvent event) {
    switch (event) {
        case InputEvent::RotateLeftPressed:
            return "RotateLeftPressed";
        case InputEvent::RotateRightPressed:
            return "RotateRightPressed";
        case InputEvent::MoveLeftPressed:
            return "MoveLeftPressed";
        case InputEvent::MoveRightPressed:
            return "MoveRightPressed";
        case InputEvent::MoveDownPressed:
            return "MoveDownPressed";
        case InputEvent::DropPressed:
            return "DropPressed";
        case InputEvent::HoldPressed:
            return "HoldPressed";
        case InputEvent::RotateLeftReleased:
            return "RotateLeftReleased";
        case InputEvent::RotateRightReleased:
            return "RotateRightReleased";
        case InputEvent::MoveLeftReleased:
            return "MoveLeftReleased";
        case InputEvent::MoveRightReleased:
            return "MoveRightReleased";
        case InputEvent::MoveDownReleased:
            return "MoveDownReleased";
        case InputEvent::DropReleased:
            return "DropReleased";
        case InputEvent::HoldReleased:
            return "HoldReleased";
        default:
            throw new std::runtime_error("UNREACHABLE");
    }
}

static inline pybind11::str event_to_java_string(InputEvent event) {
    return pybind11::str(event_to_string(event));
}


static pybind11::dict record_to_java(const recorder::Record& record) {

    pybind11::dict result{};

    auto python_event = event_to_java_string(record.event);

    auto python_simulation_step_index = pybind11::int_(record.simulation_step_index);

    auto python_tetrion_index = pybind11::int_(record.tetrion_index);

    std::vector<std::pair<std::string, pybind11::object>> properties_vector{
        {                 "event",                 python_event },
        { "simulation_step_index", python_simulation_step_index },
        {         "tetrion_index",         python_tetrion_index }
    };

    for (const auto& [key, value] : properties_vector) {
        result[pybind11::str(key)] = value;
    }

    return result;
}

static pybind11::list records_to_java(const std::vector<recorder::Record>& records) {
    pybind11::list array{};

    for (auto& record : records) {
        array.append(record_to_java(record));
    }

    return array;
}


static pybind11::dict header_to_java(const recorder::TetrionHeader& header) {

    pybind11::dict result{};

    auto python_seed = pybind11::int_(header.seed);

    auto python_starting_level = pybind11::int_(header.starting_level);

    std::vector<std::pair<std::string, pybind11::object>> properties_vector{
        {           "seed",           python_seed },
        { "starting_level", python_starting_level },
    };

    for (const auto& [key, value] : properties_vector) {
        result[pybind11::str(key)] = value;
    }

    return result;
}


static pybind11::list headers_to_java(const std::vector<recorder::TetrionHeader>& headers) {
    pybind11::list array{};

    for (auto& header : headers) {
        array.append(header_to_java(header));
    }

    return array;
}


static pybind11::dict mino_position_to_java(const grid::GridPoint& mino_position) {

    pybind11::dict result{};

    auto mino_pos = mino_position.cast<uint8_t>();

    auto python_x = pybind11::int_(mino_pos.x);

    auto python_y = pybind11::int_(mino_pos.y);

    std::vector<std::pair<std::string, pybind11::object>> properties_vector{
        { "x", python_x },
        { "y", python_y }
    };

    for (const auto& [key, value] : properties_vector) {
        result[pybind11::str(key)] = value;
    }

    return result;
}

*/
static const char* tetromino_type_to_string(helper::TetrominoType type) {
    switch (type) {
        case helper::TetrominoType::I: {
            return "I";
        }
        case helper::TetrominoType::J: {
            return "J";
        }
        case helper::TetrominoType::L: {
            return "L";
        }
        case helper::TetrominoType::O: {
            return "O";
        }
        case helper::TetrominoType::S: {
            return "S";
        }
        case helper::TetrominoType::T: {
            return "T";
        }
        case helper::TetrominoType::Z: {
            return "Z";
        }
        default:
            throw new std::runtime_error("UNREACHABLE");
    }
}

static inline jstring tetromino_type_to_java_string(JNIEnv* env, helper::TetrominoType type) {
    return JNI_get_jstring(env, tetromino_type_to_string(type));
}

/*

static pybind11::dict mino_to_java(const Mino& mino) {

    pybind11::dict result{};

    auto python_position = mino_position_to_java(mino.position());

    auto python_type = tetromino_type_to_java_string(mino.type());

    std::vector<std::pair<std::string, pybind11::object>> properties_vector{
        { "position", python_position },
        {     "type",     python_type }
    };

    for (const auto& [key, value] : properties_vector) {
        result[pybind11::str(key)] = value;
    }

    return result;
}


static pybind11::list mino_stack_to_java(const std::vector<Mino>& mino_stack) {
    pybind11::list array{};

    for (auto& mino : mino_stack) {
        array.append(mino_to_java(mino));
    }

    return array;
}

*/

struct JTetrionSnapshot {

    static constexpr const char* java_class = JAVA_OOPETRIS_CLASS("TetrionSnapshot");
    static constexpr const char* java_type = TYPE_FOR_CLASS(JAVA_OOPETRIS_CLASS("TetrionSnapshot"));

    using native_type = jobject;
};


static jobject snapshot_to_java(JNIEnv* env, const TetrionSnapshot& snapshot) {

    pybind11::dict result{};

    auto python_level = pybind11::int_(snapshot.level());

    auto python_lines_cleared = pybind11::int_(snapshot.lines_cleared());

    auto python_mino_stack = mino_stack_to_java(snapshot.mino_stack().minos());

    auto python_score = pybind11::int_(snapshot.score());

    auto python_simulation_step_index = pybind11::int_(snapshot.simulation_step_index());

    auto python_tetrion_index = pybind11::int_(snapshot.tetrion_index());

    std::vector<std::pair<std::string, pybind11::object>> properties_vector{
        {                 "level",                 python_level },
        {         "lines_cleared",         python_lines_cleared },
        {            "mino_stack",            python_mino_stack },
        {                 "score",                 python_score },
        { "simulation_step_index", python_simulation_step_index },
        {         "tetrion_index",         python_tetrion_index },
    };

    for (const auto& [key, value] : properties_vector) {
        result[pybind11::str(key)] = value;
    }

    return result;
}


static_assert(IsJavaTypeDescriptionForObject<JTetrionSnapshot>);

static jobject snapshots_to_java(JNIEnv* env, const std::vector<TetrionSnapshot>& snapshots) {
    JArrayList<JTetrionSnapshot> list{ env, static_cast<jint>(snapshots.size()) };


    for (auto& snapshot : snapshots) {
        jboolean append_result = list.append(env, snapshot_to_java(env, snapshot));
        if (append_result == JNI_FALSE) {
            throw JavaException(ExceptionInInitializerError, "Error in appending to List<TetrionSnapshot>");
        }
    }

    return list.get_result();
}


jobject recording_reader_to_java(JNIEnv* env, const recorder::RecordingReader& reader) {

    //TODO
    /*    Map<String, AdditionalInformationValue> information;
    List<TetrionRecord> records;
    List<TetrionHeader> tetrionHeaders;
 */

    auto jinformation = information_to_java(env, reader.information());

    auto jrecords = records_to_java(env, reader.records());

    auto jsnapshots = snapshots_to_java(env, reader.snapshots());

    auto jtetrion_headers = headers_to_java(env, reader.tetrion_headers());


    jobject jversion = construct_u8(env, recorder::Recording::current_supported_version_number);

    // call the correct constructor

    const auto [recording_information_class, recording_information_constructor] = get_constructor_for_class(
            env, JAVA_OOPETRIS_CLASS("RecordingInformation"),
            CONSTRUCTOR_TYPE(TYPE_FOR_CLASS(JAVA_MAP_CLASS) METHOD_DECL_SEPERATOR TYPE_FOR_CLASS(JAVA_LIST_CLASS)
                                     METHOD_DECL_SEPERATOR TYPE_FOR_CLASS(JAVA_LIST_CLASS)
                                             METHOD_DECL_SEPERATOR TYPE_FOR_CLASS(JAVA_LIST_CLASS)
                                                     METHOD_DECL_SEPERATOR U8_JAVA_TYPE)
    );

    jobject recording_information = env->NewObject(
            recording_information_class, recording_information_constructor, jinformation, jrecords, jsnapshots,
            jtetrion_headers, jversion
    );


    if (recording_information == nullptr) {
        throw JavaException(ExceptionInInitializerError, "Could not construct 'RecordingInformation'");
    }

    if (env->ExceptionOccurred() != nullptr) {
        throw JavaExceptionAlreadyThrown();
    }


    return recording_information;
}

jobject properties_to_java(JNIEnv* env) {

    jobject jheight = construct_u8(env, grid::height_in_tiles);

    jobject jwidth = construct_u8(env, grid::width_in_tiles);

    const auto [grid_properties_class, grid_properties_constructor] = get_constructor_for_class(
            env, JAVA_OOPETRIS_CLASS("GridProperties"),
            CONSTRUCTOR_TYPE(U8_JAVA_TYPE METHOD_DECL_SEPERATOR U8_JAVA_TYPE)
    );

    jobject grid_properties = env->NewObject(grid_properties_class, grid_properties_constructor, jheight, jwidth);

    if (grid_properties == nullptr) {
        throw JavaException(ExceptionInInitializerError, "Could not construct 'GridProperties'");
    }

    if (env->ExceptionOccurred() != nullptr) {
        throw JavaExceptionAlreadyThrown();
    }


    const auto [recording_properties_class, recording_properties_constructor] = get_constructor_for_class(
            env, JAVA_OOPETRIS_CLASS("RecordingProperties"),
            CONSTRUCTOR_TYPE(TYPE_FOR_CLASS(JAVA_OOPETRIS_CLASS("GridProperties")))
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
