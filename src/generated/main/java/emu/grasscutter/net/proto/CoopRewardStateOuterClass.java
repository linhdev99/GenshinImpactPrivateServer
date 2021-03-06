// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CoopRewardState.proto

package emu.grasscutter.net.proto;

public final class CoopRewardStateOuterClass {
  private CoopRewardStateOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code CoopRewardState}
   */
  public enum CoopRewardState
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>Unlock = 0;</code>
     */
    Unlock(0),
    /**
     * <code>Lock = 1;</code>
     */
    Lock(1),
    /**
     * <code>Taken = 2;</code>
     */
    Taken(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>Unlock = 0;</code>
     */
    public static final int Unlock_VALUE = 0;
    /**
     * <code>Lock = 1;</code>
     */
    public static final int Lock_VALUE = 1;
    /**
     * <code>Taken = 2;</code>
     */
    public static final int Taken_VALUE = 2;


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
    public static CoopRewardState valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static CoopRewardState forNumber(int value) {
      switch (value) {
        case 0: return Unlock;
        case 1: return Lock;
        case 2: return Taken;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<CoopRewardState>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        CoopRewardState> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<CoopRewardState>() {
            public CoopRewardState findValueByNumber(int number) {
              return CoopRewardState.forNumber(number);
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
      return emu.grasscutter.net.proto.CoopRewardStateOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final CoopRewardState[] VALUES = values();

    public static CoopRewardState valueOf(
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

    private CoopRewardState(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:CoopRewardState)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025CoopRewardState.proto*2\n\017CoopRewardSta" +
      "te\022\n\n\006Unlock\020\000\022\010\n\004Lock\020\001\022\t\n\005Taken\020\002B\033\n\031e" +
      "mu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
