

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
*/
static jobject information_to_java(JNIEnv* env, const recorder::AdditionalInformation& information) {
    /* 
    pybind11::dict result{};

    for (const auto& [key, raw_value] : information) {
        auto value = information_value_to_java(raw_value);
        result[pybind11::str(key)] = value;
    }
    return result;
    */

    //TODO
    UNUSED(env);
    UNUSED(information);
    return nullptr;
}

/*
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
*/
static jobject records_to_java(JNIEnv* env, const std::vector<recorder::Record>& records) {
    /*  pybind11::list array{};

    for (auto& record : records) {
        array.append(record_to_java(record));
    }

    return array; */
    //TODO
    UNUSED(env);
    UNUSED(records);
    return nullptr;
}
/*

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


*/
static jobject headers_to_java(JNIEnv* env, const std::vector<recorder::TetrionHeader>& headers) {
    /*  pybind11::list array{};

    for (auto& header : headers) {
        array.append(header_to_java(header));
    }

    return array; */

    //TODO
    UNUSED(env);
    UNUSED(headers);
    return nullptr;
}


struct JMinoPosition {

    static constexpr const char* java_class = JAVA_OOPETRIS_CLASS("MinoPosition");
    static constexpr const char* java_type = TYPE_FOR_CLASS(JAVA_OOPETRIS_CLASS("MinoPosition"));

    using native_type = jobject;

    using constructor = struct {
        using inner = std::tuple<JU8Description, JU8Description>;
    };
};

static_assert(IsJavaTypeDescriptionForObject<JMinoPosition>);
static_assert(JavaDescriptionHasConstructorType<JMinoPosition>);


static jobject mino_position_to_java(JNIEnv* env, const grid::GridPoint& mino_position) {


    auto mino_pos = mino_position.cast<uint8_t>();

    jobject java_x = construct_u8(env, mino_pos.x);

    jobject java_y = construct_u8(env, mino_pos.y);

    const auto [_, jmino_position] = construct_new_java_object<JMinoPosition>(env, java_x, java_y);

    return jmino_position;
}


struct JTetrominoType {

    static constexpr const char* java_class = JAVA_OOPETRIS_CLASS("TetrominoType");
    static constexpr const char* java_type = TYPE_FOR_CLASS(JAVA_OOPETRIS_CLASS("TetrominoType"));

    using native_type = jobject;

    using enum_type = struct {
        using enum_type = helper::TetrominoType;
        static std::string value_to_string(helper::TetrominoType type) {
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
    };
};

static_assert(IsJavaTypeDescriptionForEnum<JTetrominoType>);


static jobject tetromino_type_to_java(JNIEnv* env, helper::TetrominoType type) {

    return construct_new_java_enum<JTetrominoType>(env, type);
}

struct JMino {

    static constexpr const char* java_class = JAVA_OOPETRIS_CLASS("Mino");
    static constexpr const char* java_type = TYPE_FOR_CLASS(JAVA_OOPETRIS_CLASS("Mino"));

    using native_type = jobject;

    using constructor = struct {
        using inner = std::tuple<JMinoPosition, JTetrominoType>;
    };
};

static_assert(IsJavaTypeDescriptionForObject<JMino>);
static_assert(JavaDescriptionHasConstructorType<JMino>);


static jobject mino_to_java(JNIEnv* env, const Mino& mino) {


    jobject java_position = mino_position_to_java(env, mino.position());

    jobject java_type = tetromino_type_to_java(env, mino.type());

    const auto [_, jmino] = construct_new_java_object<JMino>(env, java_position, java_type);

    return jmino;
}


static jobject mino_stack_to_java(JNIEnv* env, const std::vector<Mino>& mino_stack) {
    JArrayList<JMino> list{ env, static_cast<jint>(mino_stack.size()) };


    for (auto& mino : mino_stack) {
        jboolean append_result = list.append(env, mino_to_java(env, mino));
        if (append_result == JNI_FALSE) {
            throw JavaException(ExceptionInInitializerError, "Error in appending to List<Mino>");
        }
    }

    return list.get_result();
}


struct JTetrionSnapshot {

    static constexpr const char* java_class = JAVA_OOPETRIS_CLASS("TetrionSnapshot");
    static constexpr const char* java_type = TYPE_FOR_CLASS(JAVA_OOPETRIS_CLASS("TetrionSnapshot"));

    using native_type = jobject;

    using constructor = struct {
        using inner = std::tuple<
                JU32Description,
                JU32Description,
                JListDescription,
                JU64Description,
                JU64Description,
                JU8Description>;
    };
};

static_assert(IsJavaTypeDescriptionForObject<JTetrionSnapshot>);
static_assert(JavaDescriptionHasConstructorType<JTetrionSnapshot>);


static jobject snapshot_to_java(JNIEnv* env, const TetrionSnapshot& snapshot) {

    auto jlevel = construct_u32(env, snapshot.level());

    auto jlines_cleared = construct_u32(env, snapshot.lines_cleared());

    auto jmino_stack = mino_stack_to_java(env, snapshot.mino_stack().minos());

    auto jscore = construct_u64(env, snapshot.score());

    auto jsimulation_step_index = construct_u64(env, snapshot.simulation_step_index());

    auto jtetrion_index = construct_u8(env, snapshot.tetrion_index());


    const auto [_, recording_information] = construct_new_java_object<JTetrionSnapshot>(
            env, jlevel, jlines_cleared, jmino_stack, jscore, jsimulation_step_index, jtetrion_index
    );

    return recording_information;
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

struct JRecordingInformation {

    static constexpr const char* java_class = JAVA_OOPETRIS_CLASS("RecordingInformation");
    static constexpr const char* java_type = TYPE_FOR_CLASS(JAVA_OOPETRIS_CLASS("RecordingInformation"));

    using native_type = jobject;


    using constructor = struct {
        using inner = std::tuple<JMapDescription, JListDescription, JListDescription, JListDescription, JU8Description>;
    };
};

static_assert(IsJavaTypeDescriptionForObject<JRecordingInformation>);
static_assert(JavaDescriptionHasConstructorType<JRecordingInformation>);


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

    const auto [_, recording_information] = construct_new_java_object<JRecordingInformation>(
            env, jinformation, jrecords, jsnapshots, jtetrion_headers, jversion
    );


    return recording_information;
}


struct JGridProperties {

    static constexpr const char* java_class = JAVA_OOPETRIS_CLASS("GridProperties");
    static constexpr const char* java_type = TYPE_FOR_CLASS(JAVA_OOPETRIS_CLASS("GridProperties"));

    using native_type = jobject;

    using constructor = struct {
        using inner = std::tuple<JU8Description, JU8Description>;
    };
};

static_assert(IsJavaTypeDescriptionForObject<JGridProperties>);
static_assert(JavaDescriptionHasConstructorType<JGridProperties>);


struct JRecordingProperties {

    static constexpr const char* java_class = JAVA_OOPETRIS_CLASS("RecordingProperties");
    static constexpr const char* java_type = TYPE_FOR_CLASS(JAVA_OOPETRIS_CLASS("RecordingProperties"));

    using native_type = jobject;

    using constructor = struct {
        using inner = std::tuple<JGridProperties>;
    };
};

static_assert(IsJavaTypeDescriptionForObject<JRecordingProperties>);
static_assert(JavaDescriptionHasConstructorType<JRecordingProperties>);


jobject properties_to_java(JNIEnv* env) {

    jobject jheight = construct_u8(env, grid::height_in_tiles);

    jobject jwidth = construct_u8(env, grid::width_in_tiles);

    const auto [_, grid_properties] = construct_new_java_object<JGridProperties>(env, jheight, jwidth);

    const auto [_2, recording_properties] = construct_new_java_object<JRecordingProperties>(env, grid_properties);

    return recording_properties;
}
