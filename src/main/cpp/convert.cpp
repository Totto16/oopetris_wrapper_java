

#include "./convert.h"

#include "./helper.h"
#include "./jni_cpp.h"
#include "./list.h"
#include "./map.h"

struct JAdditionalInformationValue {

    static constexpr const char* java_class = JAVA_OOPETRIS_CLASS("AdditionalInformationValue");
    static constexpr const char* java_type = TYPE_FOR_CLASS(JAVA_OOPETRIS_CLASS("AdditionalInformationValue"));

    using native_type = jobject;
};

static_assert(IsJavaTypeDescriptionForObject<JAdditionalInformationValue>);
static_assert(not JavaDescriptionHasConstructorType<JAdditionalInformationValue>);

struct JAdditionalInformationValueConstructorString {
    using inner = std::tuple<JStringDescription>;
};

static_assert(IsJavaConstructor<JAdditionalInformationValueConstructorString>);

struct JAdditionalInformationValueConstructorBoolean {
    using inner = std::tuple<JBooleanDescription>;
};

static_assert(IsJavaConstructor<JAdditionalInformationValueConstructorBoolean>);

struct JAdditionalInformationValueConstructorFloat {
    using inner = std::tuple<JFloatDescription>;
};

static_assert(IsJavaConstructor<JAdditionalInformationValueConstructorFloat>);

struct JAdditionalInformationValueConstructorDouble {
    using inner = std::tuple<JDoubleDescription>;
};

static_assert(IsJavaConstructor<JAdditionalInformationValueConstructorDouble>);

struct JAdditionalInformationValueConstructorU8 {
    using inner = std::tuple<JU8Description>;
};

static_assert(IsJavaConstructor<JAdditionalInformationValueConstructorU8>);

struct JAdditionalInformationValueConstructorI8 {
    using inner = std::tuple<JByteDescription>;
};

static_assert(IsJavaConstructor<JAdditionalInformationValueConstructorI8>);

struct JAdditionalInformationValueConstructorU32 {
    using inner = std::tuple<JU32Description>;
};

static_assert(IsJavaConstructor<JAdditionalInformationValueConstructorU32>);

struct JAdditionalInformationValueConstructorI32 {
    using inner = std::tuple<JIntegerDescription>;
};

static_assert(IsJavaConstructor<JAdditionalInformationValueConstructorI32>);

struct JAdditionalInformationValueConstructorU64 {
    using inner = std::tuple<JU64Description>;
};

static_assert(IsJavaConstructor<JAdditionalInformationValueConstructorU64>);

struct JAdditionalInformationValueConstructorI64 {
    using inner = std::tuple<JLongDescription>;
};

static_assert(IsJavaConstructor<JAdditionalInformationValueConstructorI64>);

struct JAdditionalInformationValueConstructorList {
    using inner = std::tuple<JListDescription>;
};

static_assert(IsJavaConstructor<JAdditionalInformationValueConstructorList>);

static jobject information_value_to_java(JNIEnv* env, const recorder::InformationValue& information_value) {

    return std::visit(
            helper::Overloaded{
                    [&env](const std::string& value) -> jobject {
                        jstring jstr = JNI_get_jstring(env, value);

                        const auto [_, jinformation_value] = construct_new_java_object_extended<
                                JAdditionalInformationValue, JAdditionalInformationValueConstructorString>(env, jstr);

                        return jinformation_value;
                    },
                    [&env](const float& value) -> jobject {
                        const auto [_, jvalue] =
                                construct_new_java_object<JFloatDescription>(env, static_cast<jfloat>(value));

                        const auto [_2, jinformation_value] = construct_new_java_object_extended<
                                JAdditionalInformationValue, JAdditionalInformationValueConstructorFloat>(env, jvalue);

                        return jinformation_value;
                    },
                    [&env](const double& value) -> jobject {
                        const auto [_, jvalue] =
                                construct_new_java_object<JDoubleDescription>(env, static_cast<jdouble>(value));

                        const auto [_2, jinformation_value] = construct_new_java_object_extended<
                                JAdditionalInformationValue, JAdditionalInformationValueConstructorDouble>(env, jvalue);

                        return jinformation_value;
                    },
                    [&env](const bool& value) -> jobject {
                        const auto [_, jvalue] =
                                construct_new_java_object<JBooleanDescription>(env, static_cast<jboolean>(value));

                        const auto [_2, jinformation_value] = construct_new_java_object_extended<
                                JAdditionalInformationValue, JAdditionalInformationValueConstructorBoolean>(
                                env, jvalue
                        );

                        return jinformation_value;
                    },
                    [&env](const u8& value) -> jobject {
                        jobject u8_value = construct_u8(env, value);

                        const auto [_, jinformation_value] = construct_new_java_object_extended<
                                JAdditionalInformationValue, JAdditionalInformationValueConstructorU8>(env, u8_value);

                        return jinformation_value;
                    },
                    [&env](const i8& value) -> jobject {
                        const auto [_, jvalue] =
                                construct_new_java_object<JByteDescription>(env, static_cast<jbyte>(value));

                        const auto [_2, jinformation_value] = construct_new_java_object_extended<
                                JAdditionalInformationValue, JAdditionalInformationValueConstructorI8>(env, jvalue);

                        return jinformation_value;
                    },
                    [&env](const u32& value) -> jobject {
                        jobject u32_value = construct_u32(env, value);

                        const auto [_, jinformation_value] = construct_new_java_object_extended<
                                JAdditionalInformationValue, JAdditionalInformationValueConstructorU32>(env, u32_value);

                        return jinformation_value;
                    },
                    [&env](const i32& value) -> jobject {
                        const auto [_, jvalue] =
                                construct_new_java_object<JIntegerDescription>(env, static_cast<jint>(value));

                        const auto [_2, jinformation_value] = construct_new_java_object_extended<
                                JAdditionalInformationValue, JAdditionalInformationValueConstructorI32>(env, jvalue);

                        return jinformation_value;
                    },
                    [&env](const u64& value) -> jobject {
                        jobject u64_value = construct_u64(env, value);

                        const auto [_, jinformation_value] = construct_new_java_object_extended<
                                JAdditionalInformationValue, JAdditionalInformationValueConstructorU64>(env, u64_value);

                        return jinformation_value;
                    },
                    [&env](const i64& value) -> jobject {
                        const auto [_, jvalue] =
                                construct_new_java_object<JLongDescription>(env, static_cast<jlong>(value));

                        const auto [_2, jinformation_value] = construct_new_java_object_extended<
                                JAdditionalInformationValue, JAdditionalInformationValueConstructorI64>(env, jvalue);

                        return jinformation_value;
                    },
                    [&env](const std::vector<recorder::InformationValue>& values) -> jobject {
                        JArrayList<JAdditionalInformationValue> list{ env, static_cast<jint>(values.size()) };

                        for (auto& value : values) {
                            jboolean append_result = list.append(env, information_value_to_java(env, value));
                            if (append_result == JNI_FALSE) {
                                throw JavaException(
                                        ExceptionInInitializerError,
                                        "Error in appending to List<AdditionalInformationValue>"
                                );
                            }
                        }

                        return list.get_result();
                    } },
            information_value.underlying()
    );
}

static jobject information_to_java(JNIEnv* env, const recorder::AdditionalInformation& information) {
    JHashMap<JStringDescription, JAdditionalInformationValue> map{ env };

    for (const auto& [key, raw_value] : information) {
        auto jvalue = information_value_to_java(env, raw_value);

        jstring jkey = JNI_get_jstring(env, key);

        // ignore return value, as it is already checked for null and otherwise just the same as jvalue
        map.put(env, jkey, jvalue);
    }


    return map.get_result();
}


struct JInputEvent {

    static constexpr const char* java_class = JAVA_OOPETRIS_CLASS("InputEvent");
    static constexpr const char* java_type = TYPE_FOR_CLASS(JAVA_OOPETRIS_CLASS("InputEvent"));

    using native_type = jobject;

    using enum_type = struct {
        using enum_type = InputEvent;
        static std::string value_to_string(InputEvent event) {
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
    };
};

static_assert(IsJavaTypeDescriptionForEnum<JInputEvent>);

static jobject event_to_java(JNIEnv* env, InputEvent event) {
    return construct_new_java_enum<JInputEvent>(env, event);
}


struct JTetrionRecord {

    static constexpr const char* java_class = JAVA_OOPETRIS_CLASS("TetrionRecord");
    static constexpr const char* java_type = TYPE_FOR_CLASS(JAVA_OOPETRIS_CLASS("TetrionRecord"));

    using native_type = jobject;

    using constructor = struct {
        using inner = std::tuple<JInputEvent, JU64Description, JU8Description>;
    };
};

static_assert(IsJavaTypeDescriptionForObject<JTetrionRecord>);
static_assert(JavaDescriptionHasConstructorType<JTetrionRecord>);


static jobject record_to_java(JNIEnv* env, const recorder::Record& record) {


    jobject java_event = event_to_java(env, record.event);

    jobject java_simulation_step_index = construct_u64(env, record.simulation_step_index);

    jobject java_tetrion_index = construct_u8(env, record.tetrion_index);

    const auto [_, jrecord] =
            construct_new_java_object<JTetrionRecord>(env, java_event, java_simulation_step_index, java_tetrion_index);

    return jrecord;
}


static jobject records_to_java(JNIEnv* env, const std::vector<recorder::Record>& records) {
    JArrayList<JTetrionRecord> list{ env, static_cast<jint>(records.size()) };

    for (auto& record : records) {
        jboolean append_result = list.append(env, record_to_java(env, record));
        if (append_result == JNI_FALSE) {
            throw JavaException(ExceptionInInitializerError, "Error in appending to List<TetrionRecord>");
        }
    }

    return list.get_result();
}


struct JTetrionHeader {

    static constexpr const char* java_class = JAVA_OOPETRIS_CLASS("TetrionHeader");
    static constexpr const char* java_type = TYPE_FOR_CLASS(JAVA_OOPETRIS_CLASS("TetrionHeader"));

    using native_type = jobject;

    using constructor = struct {
        using inner = std::tuple<JU64Description, JU32Description>;
    };
};

static_assert(IsJavaTypeDescriptionForObject<JTetrionHeader>);
static_assert(JavaDescriptionHasConstructorType<JTetrionHeader>);


static jobject header_to_java(JNIEnv* env, const recorder::TetrionHeader& header) {

    jobject java_seed = construct_u64(env, header.seed);

    jobject java_starting_level = construct_u32(env, header.starting_level);

    const auto [_, jheader] = construct_new_java_object<JTetrionHeader>(env, java_seed, java_starting_level);

    return jheader;
}


static jobject headers_to_java(JNIEnv* env, const std::vector<recorder::TetrionHeader>& headers) {
    JArrayList<JTetrionHeader> list{ env, static_cast<jint>(headers.size()) };

    for (auto& header : headers) {
        jboolean append_result = list.append(env, header_to_java(env, header));
        if (append_result == JNI_FALSE) {
            throw JavaException(ExceptionInInitializerError, "Error in appending to List<TetrionHeader>");
        }
    }

    return list.get_result();
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
