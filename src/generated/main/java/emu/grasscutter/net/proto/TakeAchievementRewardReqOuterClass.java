// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TakeAchievementRewardReq.proto

package emu.grasscutter.net.proto;

public final class TakeAchievementRewardReqOuterClass {
  private TakeAchievementRewardReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TakeAchievementRewardReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TakeAchievementRewardReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .AchievementInfo a_list = 1;</code>
     */
    java.util.List<emu.grasscutter.net.proto.AchievementInfoOuterClass.AchievementInfo> 
        getAListList();
    /**
     * <code>repeated .AchievementInfo a_list = 1;</code>
     */
    emu.grasscutter.net.proto.AchievementInfoOuterClass.AchievementInfo getAList(int index);
    /**
     * <code>repeated .AchievementInfo a_list = 1;</code>
     */
    int getAListCount();
    /**
     * <code>repeated .AchievementInfo a_list = 1;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.AchievementInfoOuterClass.AchievementInfoOrBuilder> 
        getAListOrBuilderList();
    /**
     * <code>repeated .AchievementInfo a_list = 1;</code>
     */
    emu.grasscutter.net.proto.AchievementInfoOuterClass.AchievementInfoOrBuilder getAListOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code TakeAchievementRewardReq}
   */
  public static final class TakeAchievementRewardReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TakeAchievementRewardReq)
      TakeAchievementRewardReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TakeAchievementRewardReq.newBuilder() to construct.
    private TakeAchievementRewardReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TakeAchievementRewardReq() {
      aList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TakeAchievementRewardReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private TakeAchievementRewardReq(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                aList_ = new java.util.ArrayList<emu.grasscutter.net.proto.AchievementInfoOuterClass.AchievementInfo>();
                mutable_bitField0_ |= 0x00000001;
              }
              aList_.add(
                  input.readMessage(emu.grasscutter.net.proto.AchievementInfoOuterClass.AchievementInfo.parser(), extensionRegistry));
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          aList_ = java.util.Collections.unmodifiableList(aList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.TakeAchievementRewardReqOuterClass.internal_static_TakeAchievementRewardReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.TakeAchievementRewardReqOuterClass.internal_static_TakeAchievementRewardReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.TakeAchievementRewardReqOuterClass.TakeAchievementRewardReq.class, emu.grasscutter.net.proto.TakeAchievementRewardReqOuterClass.TakeAchievementRewardReq.Builder.class);
    }

    /**
     * Protobuf enum {@code TakeAchievementRewardReq.CmdId}
     */
    public enum CmdId
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>ENET_CHANNEL_ID = 0;</code>
       */
      ENET_CHANNEL_ID(0, 0),
      /**
       * <code>ENET_IS_RELIABLE = 1;</code>
       */
      ENET_IS_RELIABLE(2, 1),
      /**
       * <code>CMD_ID = 2677;</code>
       */
      CMD_ID(4, 2677),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>NONE = 0;</code>
       */
      public static final CmdId NONE = ENET_CHANNEL_ID;
      /**
       * <code>IS_ALLOW_CLIENT = 1;</code>
       */
      public static final CmdId IS_ALLOW_CLIENT = ENET_IS_RELIABLE;
      /**
       * <code>ENET_CHANNEL_ID = 0;</code>
       */
      public static final int ENET_CHANNEL_ID_VALUE = 0;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>ENET_IS_RELIABLE = 1;</code>
       */
      public static final int ENET_IS_RELIABLE_VALUE = 1;
      /**
       * <code>IS_ALLOW_CLIENT = 1;</code>
       */
      public static final int IS_ALLOW_CLIENT_VALUE = 1;
      /**
       * <code>CMD_ID = 2677;</code>
       */
      public static final int CMD_ID_VALUE = 2677;


      public final int getNumber() {
        if (index == -1) {
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
      public static CmdId valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static CmdId forNumber(int value) {
        switch (value) {
          case 0: return ENET_CHANNEL_ID;
          case 1: return ENET_IS_RELIABLE;
          case 2677: return CMD_ID;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<CmdId>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          CmdId> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<CmdId>() {
              public CmdId findValueByNumber(int number) {
                return CmdId.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        if (index == -1) {
          throw new java.lang.IllegalStateException(
              "Can't get the descriptor of an unrecognized enum value.");
        }
        return getDescriptor().getValues().get(index);
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.TakeAchievementRewardReqOuterClass.TakeAchievementRewardReq.getDescriptor().getEnumTypes().get(0);
      }

      private static final CmdId[] VALUES = getStaticValuesArray();
      private static CmdId[] getStaticValuesArray() {
        return new CmdId[] {
          ENET_CHANNEL_ID, NONE, ENET_IS_RELIABLE, IS_ALLOW_CLIENT, CMD_ID, 
        };
      }
      public static CmdId valueOf(
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

      private final int index;
      private final int value;

      private CmdId(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:TakeAchievementRewardReq.CmdId)
    }

    public static final int A_LIST_FIELD_NUMBER = 1;
    private java.util.List<emu.grasscutter.net.proto.AchievementInfoOuterClass.AchievementInfo> aList_;
    /**
     * <code>repeated .AchievementInfo a_list = 1;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.AchievementInfoOuterClass.AchievementInfo> getAListList() {
      return aList_;
    }
    /**
     * <code>repeated .AchievementInfo a_list = 1;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.AchievementInfoOuterClass.AchievementInfoOrBuilder> 
        getAListOrBuilderList() {
      return aList_;
    }
    /**
     * <code>repeated .AchievementInfo a_list = 1;</code>
     */
    @java.lang.Override
    public int getAListCount() {
      return aList_.size();
    }
    /**
     * <code>repeated .AchievementInfo a_list = 1;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.AchievementInfoOuterClass.AchievementInfo getAList(int index) {
      return aList_.get(index);
    }
    /**
     * <code>repeated .AchievementInfo a_list = 1;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.AchievementInfoOuterClass.AchievementInfoOrBuilder getAListOrBuilder(
        int index) {
      return aList_.get(index);
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      for (int i = 0; i < aList_.size(); i++) {
        output.writeMessage(1, aList_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < aList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, aList_.get(i));
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.TakeAchievementRewardReqOuterClass.TakeAchievementRewardReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.TakeAchievementRewardReqOuterClass.TakeAchievementRewardReq other = (emu.grasscutter.net.proto.TakeAchievementRewardReqOuterClass.TakeAchievementRewardReq) obj;

      if (!getAListList()
          .equals(other.getAListList())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (getAListCount() > 0) {
        hash = (37 * hash) + A_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getAListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.TakeAchievementRewardReqOuterClass.TakeAchievementRewardReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TakeAchievementRewardReqOuterClass.TakeAchievementRewardReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TakeAchievementRewardReqOuterClass.TakeAchievementRewardReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TakeAchievementRewardReqOuterClass.TakeAchievementRewardReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TakeAchievementRewardReqOuterClass.TakeAchievementRewardReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TakeAchievementRewardReqOuterClass.TakeAchievementRewardReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TakeAchievementRewardReqOuterClass.TakeAchievementRewardReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TakeAchievementRewardReqOuterClass.TakeAchievementRewardReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TakeAchievementRewardReqOuterClass.TakeAchievementRewardReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TakeAchievementRewardReqOuterClass.TakeAchievementRewardReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TakeAchievementRewardReqOuterClass.TakeAchievementRewardReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TakeAchievementRewardReqOuterClass.TakeAchievementRewardReq parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.TakeAchievementRewardReqOuterClass.TakeAchievementRewardReq prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code TakeAchievementRewardReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TakeAchievementRewardReq)
        emu.grasscutter.net.proto.TakeAchievementRewardReqOuterClass.TakeAchievementRewardReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.TakeAchievementRewardReqOuterClass.internal_static_TakeAchievementRewardReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.TakeAchievementRewardReqOuterClass.internal_static_TakeAchievementRewardReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.TakeAchievementRewardReqOuterClass.TakeAchievementRewardReq.class, emu.grasscutter.net.proto.TakeAchievementRewardReqOuterClass.TakeAchievementRewardReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.TakeAchievementRewardReqOuterClass.TakeAchievementRewardReq.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
          getAListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (aListBuilder_ == null) {
          aList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          aListBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.TakeAchievementRewardReqOuterClass.internal_static_TakeAchievementRewardReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TakeAchievementRewardReqOuterClass.TakeAchievementRewardReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.TakeAchievementRewardReqOuterClass.TakeAchievementRewardReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TakeAchievementRewardReqOuterClass.TakeAchievementRewardReq build() {
        emu.grasscutter.net.proto.TakeAchievementRewardReqOuterClass.TakeAchievementRewardReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TakeAchievementRewardReqOuterClass.TakeAchievementRewardReq buildPartial() {
        emu.grasscutter.net.proto.TakeAchievementRewardReqOuterClass.TakeAchievementRewardReq result = new emu.grasscutter.net.proto.TakeAchievementRewardReqOuterClass.TakeAchievementRewardReq(this);
        int from_bitField0_ = bitField0_;
        if (aListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            aList_ = java.util.Collections.unmodifiableList(aList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.aList_ = aList_;
        } else {
          result.aList_ = aListBuilder_.build();
        }
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.TakeAchievementRewardReqOuterClass.TakeAchievementRewardReq) {
          return mergeFrom((emu.grasscutter.net.proto.TakeAchievementRewardReqOuterClass.TakeAchievementRewardReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.TakeAchievementRewardReqOuterClass.TakeAchievementRewardReq other) {
        if (other == emu.grasscutter.net.proto.TakeAchievementRewardReqOuterClass.TakeAchievementRewardReq.getDefaultInstance()) return this;
        if (aListBuilder_ == null) {
          if (!other.aList_.isEmpty()) {
            if (aList_.isEmpty()) {
              aList_ = other.aList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureAListIsMutable();
              aList_.addAll(other.aList_);
            }
            onChanged();
          }
        } else {
          if (!other.aList_.isEmpty()) {
            if (aListBuilder_.isEmpty()) {
              aListBuilder_.dispose();
              aListBuilder_ = null;
              aList_ = other.aList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              aListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getAListFieldBuilder() : null;
            } else {
              aListBuilder_.addAllMessages(other.aList_);
            }
          }
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.TakeAchievementRewardReqOuterClass.TakeAchievementRewardReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.TakeAchievementRewardReqOuterClass.TakeAchievementRewardReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<emu.grasscutter.net.proto.AchievementInfoOuterClass.AchievementInfo> aList_ =
        java.util.Collections.emptyList();
      private void ensureAListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          aList_ = new java.util.ArrayList<emu.grasscutter.net.proto.AchievementInfoOuterClass.AchievementInfo>(aList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.AchievementInfoOuterClass.AchievementInfo, emu.grasscutter.net.proto.AchievementInfoOuterClass.AchievementInfo.Builder, emu.grasscutter.net.proto.AchievementInfoOuterClass.AchievementInfoOrBuilder> aListBuilder_;

      /**
       * <code>repeated .AchievementInfo a_list = 1;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.AchievementInfoOuterClass.AchievementInfo> getAListList() {
        if (aListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(aList_);
        } else {
          return aListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .AchievementInfo a_list = 1;</code>
       */
      public int getAListCount() {
        if (aListBuilder_ == null) {
          return aList_.size();
        } else {
          return aListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .AchievementInfo a_list = 1;</code>
       */
      public emu.grasscutter.net.proto.AchievementInfoOuterClass.AchievementInfo getAList(int index) {
        if (aListBuilder_ == null) {
          return aList_.get(index);
        } else {
          return aListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .AchievementInfo a_list = 1;</code>
       */
      public Builder setAList(
          int index, emu.grasscutter.net.proto.AchievementInfoOuterClass.AchievementInfo value) {
        if (aListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAListIsMutable();
          aList_.set(index, value);
          onChanged();
        } else {
          aListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .AchievementInfo a_list = 1;</code>
       */
      public Builder setAList(
          int index, emu.grasscutter.net.proto.AchievementInfoOuterClass.AchievementInfo.Builder builderForValue) {
        if (aListBuilder_ == null) {
          ensureAListIsMutable();
          aList_.set(index, builderForValue.build());
          onChanged();
        } else {
          aListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .AchievementInfo a_list = 1;</code>
       */
      public Builder addAList(emu.grasscutter.net.proto.AchievementInfoOuterClass.AchievementInfo value) {
        if (aListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAListIsMutable();
          aList_.add(value);
          onChanged();
        } else {
          aListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .AchievementInfo a_list = 1;</code>
       */
      public Builder addAList(
          int index, emu.grasscutter.net.proto.AchievementInfoOuterClass.AchievementInfo value) {
        if (aListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAListIsMutable();
          aList_.add(index, value);
          onChanged();
        } else {
          aListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .AchievementInfo a_list = 1;</code>
       */
      public Builder addAList(
          emu.grasscutter.net.proto.AchievementInfoOuterClass.AchievementInfo.Builder builderForValue) {
        if (aListBuilder_ == null) {
          ensureAListIsMutable();
          aList_.add(builderForValue.build());
          onChanged();
        } else {
          aListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .AchievementInfo a_list = 1;</code>
       */
      public Builder addAList(
          int index, emu.grasscutter.net.proto.AchievementInfoOuterClass.AchievementInfo.Builder builderForValue) {
        if (aListBuilder_ == null) {
          ensureAListIsMutable();
          aList_.add(index, builderForValue.build());
          onChanged();
        } else {
          aListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .AchievementInfo a_list = 1;</code>
       */
      public Builder addAllAList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.AchievementInfoOuterClass.AchievementInfo> values) {
        if (aListBuilder_ == null) {
          ensureAListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, aList_);
          onChanged();
        } else {
          aListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .AchievementInfo a_list = 1;</code>
       */
      public Builder clearAList() {
        if (aListBuilder_ == null) {
          aList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          aListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .AchievementInfo a_list = 1;</code>
       */
      public Builder removeAList(int index) {
        if (aListBuilder_ == null) {
          ensureAListIsMutable();
          aList_.remove(index);
          onChanged();
        } else {
          aListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .AchievementInfo a_list = 1;</code>
       */
      public emu.grasscutter.net.proto.AchievementInfoOuterClass.AchievementInfo.Builder getAListBuilder(
          int index) {
        return getAListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .AchievementInfo a_list = 1;</code>
       */
      public emu.grasscutter.net.proto.AchievementInfoOuterClass.AchievementInfoOrBuilder getAListOrBuilder(
          int index) {
        if (aListBuilder_ == null) {
          return aList_.get(index);  } else {
          return aListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .AchievementInfo a_list = 1;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.AchievementInfoOuterClass.AchievementInfoOrBuilder> 
           getAListOrBuilderList() {
        if (aListBuilder_ != null) {
          return aListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(aList_);
        }
      }
      /**
       * <code>repeated .AchievementInfo a_list = 1;</code>
       */
      public emu.grasscutter.net.proto.AchievementInfoOuterClass.AchievementInfo.Builder addAListBuilder() {
        return getAListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.AchievementInfoOuterClass.AchievementInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .AchievementInfo a_list = 1;</code>
       */
      public emu.grasscutter.net.proto.AchievementInfoOuterClass.AchievementInfo.Builder addAListBuilder(
          int index) {
        return getAListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.AchievementInfoOuterClass.AchievementInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .AchievementInfo a_list = 1;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.AchievementInfoOuterClass.AchievementInfo.Builder> 
           getAListBuilderList() {
        return getAListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.AchievementInfoOuterClass.AchievementInfo, emu.grasscutter.net.proto.AchievementInfoOuterClass.AchievementInfo.Builder, emu.grasscutter.net.proto.AchievementInfoOuterClass.AchievementInfoOrBuilder> 
          getAListFieldBuilder() {
        if (aListBuilder_ == null) {
          aListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.AchievementInfoOuterClass.AchievementInfo, emu.grasscutter.net.proto.AchievementInfoOuterClass.AchievementInfo.Builder, emu.grasscutter.net.proto.AchievementInfoOuterClass.AchievementInfoOrBuilder>(
                  aList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          aList_ = null;
        }
        return aListBuilder_;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:TakeAchievementRewardReq)
    }

    // @@protoc_insertion_point(class_scope:TakeAchievementRewardReq)
    private static final emu.grasscutter.net.proto.TakeAchievementRewardReqOuterClass.TakeAchievementRewardReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.TakeAchievementRewardReqOuterClass.TakeAchievementRewardReq();
    }

    public static emu.grasscutter.net.proto.TakeAchievementRewardReqOuterClass.TakeAchievementRewardReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TakeAchievementRewardReq>
        PARSER = new com.google.protobuf.AbstractParser<TakeAchievementRewardReq>() {
      @java.lang.Override
      public TakeAchievementRewardReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new TakeAchievementRewardReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<TakeAchievementRewardReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TakeAchievementRewardReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.TakeAchievementRewardReqOuterClass.TakeAchievementRewardReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TakeAchievementRewardReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TakeAchievementRewardReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036TakeAchievementRewardReq.proto\032\025Achiev" +
      "ementInfo.proto\"\240\001\n\030TakeAchievementRewar" +
      "dReq\022 \n\006a_list\030\001 \003(\0132\020.AchievementInfo\"b" +
      "\n\005CmdId\022\023\n\017ENET_CHANNEL_ID\020\000\022\010\n\004NONE\020\000\022\024" +
      "\n\020ENET_IS_RELIABLE\020\001\022\023\n\017IS_ALLOW_CLIENT\020" +
      "\001\022\013\n\006CMD_ID\020\365\024\032\002\020\001B\033\n\031emu.grasscutter.ne" +
      "t.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.AchievementInfoOuterClass.getDescriptor(),
        });
    internal_static_TakeAchievementRewardReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TakeAchievementRewardReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TakeAchievementRewardReq_descriptor,
        new java.lang.String[] { "AList", });
    emu.grasscutter.net.proto.AchievementInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}