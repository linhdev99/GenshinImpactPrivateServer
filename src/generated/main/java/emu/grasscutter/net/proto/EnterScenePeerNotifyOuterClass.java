// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EnterScenePeerNotify.proto

package emu.grasscutter.net.proto;

public final class EnterScenePeerNotifyOuterClass {
  private EnterScenePeerNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EnterScenePeerNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EnterScenePeerNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 dest_scene_id = 1;</code>
     * @return The destSceneId.
     */
    int getDestSceneId();

    /**
     * <code>uint32 peer_id = 2;</code>
     * @return The peerId.
     */
    int getPeerId();

    /**
     * <code>uint32 host_peer_id = 3;</code>
     * @return The hostPeerId.
     */
    int getHostPeerId();

    /**
     * <code>uint32 enter_scene_token = 4;</code>
     * @return The enterSceneToken.
     */
    int getEnterSceneToken();
  }
  /**
   * Protobuf type {@code EnterScenePeerNotify}
   */
  public static final class EnterScenePeerNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EnterScenePeerNotify)
      EnterScenePeerNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EnterScenePeerNotify.newBuilder() to construct.
    private EnterScenePeerNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EnterScenePeerNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EnterScenePeerNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private EnterScenePeerNotify(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 8: {

              destSceneId_ = input.readUInt32();
              break;
            }
            case 16: {

              peerId_ = input.readUInt32();
              break;
            }
            case 24: {

              hostPeerId_ = input.readUInt32();
              break;
            }
            case 32: {

              enterSceneToken_ = input.readUInt32();
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
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.EnterScenePeerNotifyOuterClass.internal_static_EnterScenePeerNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.EnterScenePeerNotifyOuterClass.internal_static_EnterScenePeerNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.EnterScenePeerNotifyOuterClass.EnterScenePeerNotify.class, emu.grasscutter.net.proto.EnterScenePeerNotifyOuterClass.EnterScenePeerNotify.Builder.class);
    }

    /**
     * Protobuf enum {@code EnterScenePeerNotify.CmdId}
     */
    public enum CmdId
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>ENET_IS_RELIABLE = 1;</code>
       */
      ENET_IS_RELIABLE(2, 1),
      /**
       * <code>CMD_ID = 223;</code>
       */
      CMD_ID(3, 223),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>ENET_CHANNEL_ID = 0;</code>
       */
      public static final CmdId ENET_CHANNEL_ID = NONE;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>ENET_CHANNEL_ID = 0;</code>
       */
      public static final int ENET_CHANNEL_ID_VALUE = 0;
      /**
       * <code>ENET_IS_RELIABLE = 1;</code>
       */
      public static final int ENET_IS_RELIABLE_VALUE = 1;
      /**
       * <code>CMD_ID = 223;</code>
       */
      public static final int CMD_ID_VALUE = 223;


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
          case 0: return NONE;
          case 1: return ENET_IS_RELIABLE;
          case 223: return CMD_ID;
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
        return emu.grasscutter.net.proto.EnterScenePeerNotifyOuterClass.EnterScenePeerNotify.getDescriptor().getEnumTypes().get(0);
      }

      private static final CmdId[] VALUES = getStaticValuesArray();
      private static CmdId[] getStaticValuesArray() {
        return new CmdId[] {
          NONE, ENET_CHANNEL_ID, ENET_IS_RELIABLE, CMD_ID, 
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

      // @@protoc_insertion_point(enum_scope:EnterScenePeerNotify.CmdId)
    }

    public static final int DEST_SCENE_ID_FIELD_NUMBER = 1;
    private int destSceneId_;
    /**
     * <code>uint32 dest_scene_id = 1;</code>
     * @return The destSceneId.
     */
    @java.lang.Override
    public int getDestSceneId() {
      return destSceneId_;
    }

    public static final int PEER_ID_FIELD_NUMBER = 2;
    private int peerId_;
    /**
     * <code>uint32 peer_id = 2;</code>
     * @return The peerId.
     */
    @java.lang.Override
    public int getPeerId() {
      return peerId_;
    }

    public static final int HOST_PEER_ID_FIELD_NUMBER = 3;
    private int hostPeerId_;
    /**
     * <code>uint32 host_peer_id = 3;</code>
     * @return The hostPeerId.
     */
    @java.lang.Override
    public int getHostPeerId() {
      return hostPeerId_;
    }

    public static final int ENTER_SCENE_TOKEN_FIELD_NUMBER = 4;
    private int enterSceneToken_;
    /**
     * <code>uint32 enter_scene_token = 4;</code>
     * @return The enterSceneToken.
     */
    @java.lang.Override
    public int getEnterSceneToken() {
      return enterSceneToken_;
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
      if (destSceneId_ != 0) {
        output.writeUInt32(1, destSceneId_);
      }
      if (peerId_ != 0) {
        output.writeUInt32(2, peerId_);
      }
      if (hostPeerId_ != 0) {
        output.writeUInt32(3, hostPeerId_);
      }
      if (enterSceneToken_ != 0) {
        output.writeUInt32(4, enterSceneToken_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (destSceneId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, destSceneId_);
      }
      if (peerId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, peerId_);
      }
      if (hostPeerId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, hostPeerId_);
      }
      if (enterSceneToken_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, enterSceneToken_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.EnterScenePeerNotifyOuterClass.EnterScenePeerNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.EnterScenePeerNotifyOuterClass.EnterScenePeerNotify other = (emu.grasscutter.net.proto.EnterScenePeerNotifyOuterClass.EnterScenePeerNotify) obj;

      if (getDestSceneId()
          != other.getDestSceneId()) return false;
      if (getPeerId()
          != other.getPeerId()) return false;
      if (getHostPeerId()
          != other.getHostPeerId()) return false;
      if (getEnterSceneToken()
          != other.getEnterSceneToken()) return false;
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
      hash = (37 * hash) + DEST_SCENE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getDestSceneId();
      hash = (37 * hash) + PEER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getPeerId();
      hash = (37 * hash) + HOST_PEER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getHostPeerId();
      hash = (37 * hash) + ENTER_SCENE_TOKEN_FIELD_NUMBER;
      hash = (53 * hash) + getEnterSceneToken();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.EnterScenePeerNotifyOuterClass.EnterScenePeerNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EnterScenePeerNotifyOuterClass.EnterScenePeerNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EnterScenePeerNotifyOuterClass.EnterScenePeerNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EnterScenePeerNotifyOuterClass.EnterScenePeerNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EnterScenePeerNotifyOuterClass.EnterScenePeerNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EnterScenePeerNotifyOuterClass.EnterScenePeerNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EnterScenePeerNotifyOuterClass.EnterScenePeerNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EnterScenePeerNotifyOuterClass.EnterScenePeerNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EnterScenePeerNotifyOuterClass.EnterScenePeerNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EnterScenePeerNotifyOuterClass.EnterScenePeerNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EnterScenePeerNotifyOuterClass.EnterScenePeerNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EnterScenePeerNotifyOuterClass.EnterScenePeerNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.EnterScenePeerNotifyOuterClass.EnterScenePeerNotify prototype) {
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
     * Protobuf type {@code EnterScenePeerNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EnterScenePeerNotify)
        emu.grasscutter.net.proto.EnterScenePeerNotifyOuterClass.EnterScenePeerNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.EnterScenePeerNotifyOuterClass.internal_static_EnterScenePeerNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.EnterScenePeerNotifyOuterClass.internal_static_EnterScenePeerNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.EnterScenePeerNotifyOuterClass.EnterScenePeerNotify.class, emu.grasscutter.net.proto.EnterScenePeerNotifyOuterClass.EnterScenePeerNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.EnterScenePeerNotifyOuterClass.EnterScenePeerNotify.newBuilder()
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
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        destSceneId_ = 0;

        peerId_ = 0;

        hostPeerId_ = 0;

        enterSceneToken_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.EnterScenePeerNotifyOuterClass.internal_static_EnterScenePeerNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EnterScenePeerNotifyOuterClass.EnterScenePeerNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.EnterScenePeerNotifyOuterClass.EnterScenePeerNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EnterScenePeerNotifyOuterClass.EnterScenePeerNotify build() {
        emu.grasscutter.net.proto.EnterScenePeerNotifyOuterClass.EnterScenePeerNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EnterScenePeerNotifyOuterClass.EnterScenePeerNotify buildPartial() {
        emu.grasscutter.net.proto.EnterScenePeerNotifyOuterClass.EnterScenePeerNotify result = new emu.grasscutter.net.proto.EnterScenePeerNotifyOuterClass.EnterScenePeerNotify(this);
        result.destSceneId_ = destSceneId_;
        result.peerId_ = peerId_;
        result.hostPeerId_ = hostPeerId_;
        result.enterSceneToken_ = enterSceneToken_;
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
        if (other instanceof emu.grasscutter.net.proto.EnterScenePeerNotifyOuterClass.EnterScenePeerNotify) {
          return mergeFrom((emu.grasscutter.net.proto.EnterScenePeerNotifyOuterClass.EnterScenePeerNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.EnterScenePeerNotifyOuterClass.EnterScenePeerNotify other) {
        if (other == emu.grasscutter.net.proto.EnterScenePeerNotifyOuterClass.EnterScenePeerNotify.getDefaultInstance()) return this;
        if (other.getDestSceneId() != 0) {
          setDestSceneId(other.getDestSceneId());
        }
        if (other.getPeerId() != 0) {
          setPeerId(other.getPeerId());
        }
        if (other.getHostPeerId() != 0) {
          setHostPeerId(other.getHostPeerId());
        }
        if (other.getEnterSceneToken() != 0) {
          setEnterSceneToken(other.getEnterSceneToken());
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
        emu.grasscutter.net.proto.EnterScenePeerNotifyOuterClass.EnterScenePeerNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.EnterScenePeerNotifyOuterClass.EnterScenePeerNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int destSceneId_ ;
      /**
       * <code>uint32 dest_scene_id = 1;</code>
       * @return The destSceneId.
       */
      @java.lang.Override
      public int getDestSceneId() {
        return destSceneId_;
      }
      /**
       * <code>uint32 dest_scene_id = 1;</code>
       * @param value The destSceneId to set.
       * @return This builder for chaining.
       */
      public Builder setDestSceneId(int value) {
        
        destSceneId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 dest_scene_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearDestSceneId() {
        
        destSceneId_ = 0;
        onChanged();
        return this;
      }

      private int peerId_ ;
      /**
       * <code>uint32 peer_id = 2;</code>
       * @return The peerId.
       */
      @java.lang.Override
      public int getPeerId() {
        return peerId_;
      }
      /**
       * <code>uint32 peer_id = 2;</code>
       * @param value The peerId to set.
       * @return This builder for chaining.
       */
      public Builder setPeerId(int value) {
        
        peerId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 peer_id = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearPeerId() {
        
        peerId_ = 0;
        onChanged();
        return this;
      }

      private int hostPeerId_ ;
      /**
       * <code>uint32 host_peer_id = 3;</code>
       * @return The hostPeerId.
       */
      @java.lang.Override
      public int getHostPeerId() {
        return hostPeerId_;
      }
      /**
       * <code>uint32 host_peer_id = 3;</code>
       * @param value The hostPeerId to set.
       * @return This builder for chaining.
       */
      public Builder setHostPeerId(int value) {
        
        hostPeerId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 host_peer_id = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearHostPeerId() {
        
        hostPeerId_ = 0;
        onChanged();
        return this;
      }

      private int enterSceneToken_ ;
      /**
       * <code>uint32 enter_scene_token = 4;</code>
       * @return The enterSceneToken.
       */
      @java.lang.Override
      public int getEnterSceneToken() {
        return enterSceneToken_;
      }
      /**
       * <code>uint32 enter_scene_token = 4;</code>
       * @param value The enterSceneToken to set.
       * @return This builder for chaining.
       */
      public Builder setEnterSceneToken(int value) {
        
        enterSceneToken_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 enter_scene_token = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearEnterSceneToken() {
        
        enterSceneToken_ = 0;
        onChanged();
        return this;
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


      // @@protoc_insertion_point(builder_scope:EnterScenePeerNotify)
    }

    // @@protoc_insertion_point(class_scope:EnterScenePeerNotify)
    private static final emu.grasscutter.net.proto.EnterScenePeerNotifyOuterClass.EnterScenePeerNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.EnterScenePeerNotifyOuterClass.EnterScenePeerNotify();
    }

    public static emu.grasscutter.net.proto.EnterScenePeerNotifyOuterClass.EnterScenePeerNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EnterScenePeerNotify>
        PARSER = new com.google.protobuf.AbstractParser<EnterScenePeerNotify>() {
      @java.lang.Override
      public EnterScenePeerNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new EnterScenePeerNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<EnterScenePeerNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EnterScenePeerNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.EnterScenePeerNotifyOuterClass.EnterScenePeerNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EnterScenePeerNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EnterScenePeerNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032EnterScenePeerNotify.proto\"\276\001\n\024EnterSc" +
      "enePeerNotify\022\025\n\rdest_scene_id\030\001 \001(\r\022\017\n\007" +
      "peer_id\030\002 \001(\r\022\024\n\014host_peer_id\030\003 \001(\r\022\031\n\021e" +
      "nter_scene_token\030\004 \001(\r\"M\n\005CmdId\022\010\n\004NONE\020" +
      "\000\022\023\n\017ENET_CHANNEL_ID\020\000\022\024\n\020ENET_IS_RELIAB" +
      "LE\020\001\022\013\n\006CMD_ID\020\337\001\032\002\020\001B\033\n\031emu.grasscutter" +
      ".net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_EnterScenePeerNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EnterScenePeerNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EnterScenePeerNotify_descriptor,
        new java.lang.String[] { "DestSceneId", "PeerId", "HostPeerId", "EnterSceneToken", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}