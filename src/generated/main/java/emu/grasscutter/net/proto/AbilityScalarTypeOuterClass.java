// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AbilityScalarType.proto

package emu.grasscutter.net.proto;

public final class AbilityScalarTypeOuterClass {
  private AbilityScalarTypeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code AbilityScalarType}
   */
  public enum AbilityScalarType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNKNOW = 0;</code>
     */
    UNKNOW(0),
    /**
     * <code>FLOAT = 1;</code>
     */
    FLOAT(1),
    /**
     * <code>INT = 2;</code>
     */
    INT(2),
    /**
     * <code>BOOL = 3;</code>
     */
    BOOL(3),
    /**
     * <code>TRIGGER = 4;</code>
     */
    TRIGGER(4),
    /**
     * <code>STRING = 5;</code>
     */
    STRING(5),
    /**
     * <code>UINT = 6;</code>
     */
    UINT(6),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>UNKNOW = 0;</code>
     */
    public static final int UNKNOW_VALUE = 0;
    /**
     * <code>FLOAT = 1;</code>
     */
    public static final int FLOAT_VALUE = 1;
    /**
     * <code>INT = 2;</code>
     */
    public static final int INT_VALUE = 2;
    /**
     * <code>BOOL = 3;</code>
     */
    public static final int BOOL_VALUE = 3;
    /**
     * <code>TRIGGER = 4;</code>
     */
    public static final int TRIGGER_VALUE = 4;
    /**
     * <code>STRING = 5;</code>
     */
    public static final int STRING_VALUE = 5;
    /**
     * <code>UINT = 6;</code>
     */
    public static final int UINT_VALUE = 6;


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
    public static AbilityScalarType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static AbilityScalarType forNumber(int value) {
      switch (value) {
        case 0: return UNKNOW;
        case 1: return FLOAT;
        case 2: return INT;
        case 3: return BOOL;
        case 4: return TRIGGER;
        case 5: return STRING;
        case 6: return UINT;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<AbilityScalarType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        AbilityScalarType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<AbilityScalarType>() {
            public AbilityScalarType findValueByNumber(int number) {
              return AbilityScalarType.forNumber(number);
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
      return emu.grasscutter.net.proto.AbilityScalarTypeOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final AbilityScalarType[] VALUES = values();

    public static AbilityScalarType valueOf(
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

    private AbilityScalarType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:AbilityScalarType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027AbilityScalarType.proto*`\n\021AbilityScal" +
      "arType\022\n\n\006UNKNOW\020\000\022\t\n\005FLOAT\020\001\022\007\n\003INT\020\002\022\010" +
      "\n\004BOOL\020\003\022\013\n\007TRIGGER\020\004\022\n\n\006STRING\020\005\022\010\n\004UIN" +
      "T\020\006B\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}