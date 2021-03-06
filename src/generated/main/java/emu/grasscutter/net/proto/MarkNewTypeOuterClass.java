// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MarkNewType.proto

package emu.grasscutter.net.proto;

public final class MarkNewTypeOuterClass {
  private MarkNewTypeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code MarkNewType}
   */
  public enum MarkNewType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>_NONE = 0;</code>
     */
    _NONE(0),
    /**
     * <code>COMBINE = 1;</code>
     */
    COMBINE(1),
    /**
     * <code>FORGE = 2;</code>
     */
    FORGE(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>_NONE = 0;</code>
     */
    public static final int _NONE_VALUE = 0;
    /**
     * <code>COMBINE = 1;</code>
     */
    public static final int COMBINE_VALUE = 1;
    /**
     * <code>FORGE = 2;</code>
     */
    public static final int FORGE_VALUE = 2;


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
    public static MarkNewType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static MarkNewType forNumber(int value) {
      switch (value) {
        case 0: return _NONE;
        case 1: return COMBINE;
        case 2: return FORGE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<MarkNewType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        MarkNewType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<MarkNewType>() {
            public MarkNewType findValueByNumber(int number) {
              return MarkNewType.forNumber(number);
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
      return emu.grasscutter.net.proto.MarkNewTypeOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final MarkNewType[] VALUES = values();

    public static MarkNewType valueOf(
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

    private MarkNewType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:MarkNewType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021MarkNewType.proto*0\n\013MarkNewType\022\t\n\005_N" +
      "ONE\020\000\022\013\n\007COMBINE\020\001\022\t\n\005FORGE\020\002B\033\n\031emu.gra" +
      "sscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
