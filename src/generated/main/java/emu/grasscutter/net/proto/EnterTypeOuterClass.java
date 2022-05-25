// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EnterType.proto

package emu.grasscutter.net.proto;

public final class EnterTypeOuterClass {
  private EnterTypeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code EnterType}
   */
  public enum EnterType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>ENTER_NONE = 0;</code>
     */
    ENTER_NONE(0),
    /**
     * <code>ENTER_SELF = 1;</code>
     */
    ENTER_SELF(1),
    /**
     * <code>ENTER_GOTO = 2;</code>
     */
    ENTER_GOTO(2),
    /**
     * <code>ENTER_JUMP = 3;</code>
     */
    ENTER_JUMP(3),
    /**
     * <code>ENTER_OTHER = 4;</code>
     */
    ENTER_OTHER(4),
    /**
     * <code>ENTER_BACK = 5;</code>
     */
    ENTER_BACK(5),
    /**
     * <code>ENTER_DUNGEON = 6;</code>
     */
    ENTER_DUNGEON(6),
    /**
     * <code>ENTER_DUNGEON_REPLAY = 7;</code>
     */
    ENTER_DUNGEON_REPLAY(7),
    /**
     * <code>ENTER_GOTO_BY_PORTAL = 8;</code>
     */
    ENTER_GOTO_BY_PORTAL(8),
    /**
     * <code>ENTER_SELF_HOME = 9;</code>
     */
    ENTER_SELF_HOME(9),
    /**
     * <code>ENTER_OTHER_HOME = 10;</code>
     */
    ENTER_OTHER_HOME(10),
    /**
     * <code>ENTER_GOTO_RECREATE = 11;</code>
     */
    ENTER_GOTO_RECREATE(11),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>ENTER_NONE = 0;</code>
     */
    public static final int ENTER_NONE_VALUE = 0;
    /**
     * <code>ENTER_SELF = 1;</code>
     */
    public static final int ENTER_SELF_VALUE = 1;
    /**
     * <code>ENTER_GOTO = 2;</code>
     */
    public static final int ENTER_GOTO_VALUE = 2;
    /**
     * <code>ENTER_JUMP = 3;</code>
     */
    public static final int ENTER_JUMP_VALUE = 3;
    /**
     * <code>ENTER_OTHER = 4;</code>
     */
    public static final int ENTER_OTHER_VALUE = 4;
    /**
     * <code>ENTER_BACK = 5;</code>
     */
    public static final int ENTER_BACK_VALUE = 5;
    /**
     * <code>ENTER_DUNGEON = 6;</code>
     */
    public static final int ENTER_DUNGEON_VALUE = 6;
    /**
     * <code>ENTER_DUNGEON_REPLAY = 7;</code>
     */
    public static final int ENTER_DUNGEON_REPLAY_VALUE = 7;
    /**
     * <code>ENTER_GOTO_BY_PORTAL = 8;</code>
     */
    public static final int ENTER_GOTO_BY_PORTAL_VALUE = 8;
    /**
     * <code>ENTER_SELF_HOME = 9;</code>
     */
    public static final int ENTER_SELF_HOME_VALUE = 9;
    /**
     * <code>ENTER_OTHER_HOME = 10;</code>
     */
    public static final int ENTER_OTHER_HOME_VALUE = 10;
    /**
     * <code>ENTER_GOTO_RECREATE = 11;</code>
     */
    public static final int ENTER_GOTO_RECREATE_VALUE = 11;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static EnterType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static EnterType forNumber(int value) {
      switch (value) {
        case 0: return ENTER_NONE;
        case 1: return ENTER_SELF;
        case 2: return ENTER_GOTO;
        case 3: return ENTER_JUMP;
        case 4: return ENTER_OTHER;
        case 5: return ENTER_BACK;
        case 6: return ENTER_DUNGEON;
        case 7: return ENTER_DUNGEON_REPLAY;
        case 8: return ENTER_GOTO_BY_PORTAL;
        case 9: return ENTER_SELF_HOME;
        case 10: return ENTER_OTHER_HOME;
        case 11: return ENTER_GOTO_RECREATE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<EnterType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        EnterType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<EnterType>() {
            public EnterType findValueByNumber(int number) {
              return EnterType.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.EnterTypeOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final EnterType[] VALUES = values();

    public static EnterType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private EnterType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:EnterType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017EnterType.proto*\367\001\n\tEnterType\022\016\n\nENTER" +
      "_NONE\020\000\022\016\n\nENTER_SELF\020\001\022\016\n\nENTER_GOTO\020\002\022" +
      "\016\n\nENTER_JUMP\020\003\022\017\n\013ENTER_OTHER\020\004\022\016\n\nENTE" +
      "R_BACK\020\005\022\021\n\rENTER_DUNGEON\020\006\022\030\n\024ENTER_DUN" +
      "GEON_REPLAY\020\007\022\030\n\024ENTER_GOTO_BY_PORTAL\020\010\022" +
      "\023\n\017ENTER_SELF_HOME\020\t\022\024\n\020ENTER_OTHER_HOME" +
      "\020\n\022\027\n\023ENTER_GOTO_RECREATE\020\013B\033\n\031emu.grass" +
      "cutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}