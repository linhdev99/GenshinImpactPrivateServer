// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlayerWorldSceneInfoListNotify.proto

package emu.grasscutter.net.proto;

public final class PlayerWorldSceneInfoListNotifyOuterClass {
  private PlayerWorldSceneInfoListNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PlayerWorldSceneInfoListNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PlayerWorldSceneInfoListNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .SceneUnlockInfo unlockInfos = 1;</code>
     */
    java.util.List<emu.grasscutter.net.proto.SceneUnlockInfoOuterClass.SceneUnlockInfo> 
        getUnlockInfosList();
    /**
     * <code>repeated .SceneUnlockInfo unlockInfos = 1;</code>
     */
    emu.grasscutter.net.proto.SceneUnlockInfoOuterClass.SceneUnlockInfo getUnlockInfos(int index);
    /**
     * <code>repeated .SceneUnlockInfo unlockInfos = 1;</code>
     */
    int getUnlockInfosCount();
    /**
     * <code>repeated .SceneUnlockInfo unlockInfos = 1;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.SceneUnlockInfoOuterClass.SceneUnlockInfoOrBuilder> 
        getUnlockInfosOrBuilderList();
    /**
     * <code>repeated .SceneUnlockInfo unlockInfos = 1;</code>
     */
    emu.grasscutter.net.proto.SceneUnlockInfoOuterClass.SceneUnlockInfoOrBuilder getUnlockInfosOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code PlayerWorldSceneInfoListNotify}
   */
  public static final class PlayerWorldSceneInfoListNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PlayerWorldSceneInfoListNotify)
      PlayerWorldSceneInfoListNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PlayerWorldSceneInfoListNotify.newBuilder() to construct.
    private PlayerWorldSceneInfoListNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PlayerWorldSceneInfoListNotify() {
      unlockInfos_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PlayerWorldSceneInfoListNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private PlayerWorldSceneInfoListNotify(
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
                unlockInfos_ = new java.util.ArrayList<emu.grasscutter.net.proto.SceneUnlockInfoOuterClass.SceneUnlockInfo>();
                mutable_bitField0_ |= 0x00000001;
              }
              unlockInfos_.add(
                  input.readMessage(emu.grasscutter.net.proto.SceneUnlockInfoOuterClass.SceneUnlockInfo.parser(), extensionRegistry));
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
          unlockInfos_ = java.util.Collections.unmodifiableList(unlockInfos_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.PlayerWorldSceneInfoListNotifyOuterClass.internal_static_PlayerWorldSceneInfoListNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.PlayerWorldSceneInfoListNotifyOuterClass.internal_static_PlayerWorldSceneInfoListNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.PlayerWorldSceneInfoListNotifyOuterClass.PlayerWorldSceneInfoListNotify.class, emu.grasscutter.net.proto.PlayerWorldSceneInfoListNotifyOuterClass.PlayerWorldSceneInfoListNotify.Builder.class);
    }

    public static final int UNLOCKINFOS_FIELD_NUMBER = 1;
    private java.util.List<emu.grasscutter.net.proto.SceneUnlockInfoOuterClass.SceneUnlockInfo> unlockInfos_;
    /**
     * <code>repeated .SceneUnlockInfo unlockInfos = 1;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.SceneUnlockInfoOuterClass.SceneUnlockInfo> getUnlockInfosList() {
      return unlockInfos_;
    }
    /**
     * <code>repeated .SceneUnlockInfo unlockInfos = 1;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.SceneUnlockInfoOuterClass.SceneUnlockInfoOrBuilder> 
        getUnlockInfosOrBuilderList() {
      return unlockInfos_;
    }
    /**
     * <code>repeated .SceneUnlockInfo unlockInfos = 1;</code>
     */
    @java.lang.Override
    public int getUnlockInfosCount() {
      return unlockInfos_.size();
    }
    /**
     * <code>repeated .SceneUnlockInfo unlockInfos = 1;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.SceneUnlockInfoOuterClass.SceneUnlockInfo getUnlockInfos(int index) {
      return unlockInfos_.get(index);
    }
    /**
     * <code>repeated .SceneUnlockInfo unlockInfos = 1;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.SceneUnlockInfoOuterClass.SceneUnlockInfoOrBuilder getUnlockInfosOrBuilder(
        int index) {
      return unlockInfos_.get(index);
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
      for (int i = 0; i < unlockInfos_.size(); i++) {
        output.writeMessage(1, unlockInfos_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < unlockInfos_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, unlockInfos_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.proto.PlayerWorldSceneInfoListNotifyOuterClass.PlayerWorldSceneInfoListNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.PlayerWorldSceneInfoListNotifyOuterClass.PlayerWorldSceneInfoListNotify other = (emu.grasscutter.net.proto.PlayerWorldSceneInfoListNotifyOuterClass.PlayerWorldSceneInfoListNotify) obj;

      if (!getUnlockInfosList()
          .equals(other.getUnlockInfosList())) return false;
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
      if (getUnlockInfosCount() > 0) {
        hash = (37 * hash) + UNLOCKINFOS_FIELD_NUMBER;
        hash = (53 * hash) + getUnlockInfosList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.PlayerWorldSceneInfoListNotifyOuterClass.PlayerWorldSceneInfoListNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerWorldSceneInfoListNotifyOuterClass.PlayerWorldSceneInfoListNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerWorldSceneInfoListNotifyOuterClass.PlayerWorldSceneInfoListNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerWorldSceneInfoListNotifyOuterClass.PlayerWorldSceneInfoListNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerWorldSceneInfoListNotifyOuterClass.PlayerWorldSceneInfoListNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerWorldSceneInfoListNotifyOuterClass.PlayerWorldSceneInfoListNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerWorldSceneInfoListNotifyOuterClass.PlayerWorldSceneInfoListNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerWorldSceneInfoListNotifyOuterClass.PlayerWorldSceneInfoListNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerWorldSceneInfoListNotifyOuterClass.PlayerWorldSceneInfoListNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerWorldSceneInfoListNotifyOuterClass.PlayerWorldSceneInfoListNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerWorldSceneInfoListNotifyOuterClass.PlayerWorldSceneInfoListNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerWorldSceneInfoListNotifyOuterClass.PlayerWorldSceneInfoListNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.PlayerWorldSceneInfoListNotifyOuterClass.PlayerWorldSceneInfoListNotify prototype) {
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
     * Protobuf type {@code PlayerWorldSceneInfoListNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PlayerWorldSceneInfoListNotify)
        emu.grasscutter.net.proto.PlayerWorldSceneInfoListNotifyOuterClass.PlayerWorldSceneInfoListNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.PlayerWorldSceneInfoListNotifyOuterClass.internal_static_PlayerWorldSceneInfoListNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.PlayerWorldSceneInfoListNotifyOuterClass.internal_static_PlayerWorldSceneInfoListNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.PlayerWorldSceneInfoListNotifyOuterClass.PlayerWorldSceneInfoListNotify.class, emu.grasscutter.net.proto.PlayerWorldSceneInfoListNotifyOuterClass.PlayerWorldSceneInfoListNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.PlayerWorldSceneInfoListNotifyOuterClass.PlayerWorldSceneInfoListNotify.newBuilder()
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
          getUnlockInfosFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (unlockInfosBuilder_ == null) {
          unlockInfos_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          unlockInfosBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.PlayerWorldSceneInfoListNotifyOuterClass.internal_static_PlayerWorldSceneInfoListNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerWorldSceneInfoListNotifyOuterClass.PlayerWorldSceneInfoListNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.PlayerWorldSceneInfoListNotifyOuterClass.PlayerWorldSceneInfoListNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerWorldSceneInfoListNotifyOuterClass.PlayerWorldSceneInfoListNotify build() {
        emu.grasscutter.net.proto.PlayerWorldSceneInfoListNotifyOuterClass.PlayerWorldSceneInfoListNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerWorldSceneInfoListNotifyOuterClass.PlayerWorldSceneInfoListNotify buildPartial() {
        emu.grasscutter.net.proto.PlayerWorldSceneInfoListNotifyOuterClass.PlayerWorldSceneInfoListNotify result = new emu.grasscutter.net.proto.PlayerWorldSceneInfoListNotifyOuterClass.PlayerWorldSceneInfoListNotify(this);
        int from_bitField0_ = bitField0_;
        if (unlockInfosBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            unlockInfos_ = java.util.Collections.unmodifiableList(unlockInfos_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.unlockInfos_ = unlockInfos_;
        } else {
          result.unlockInfos_ = unlockInfosBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.PlayerWorldSceneInfoListNotifyOuterClass.PlayerWorldSceneInfoListNotify) {
          return mergeFrom((emu.grasscutter.net.proto.PlayerWorldSceneInfoListNotifyOuterClass.PlayerWorldSceneInfoListNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.PlayerWorldSceneInfoListNotifyOuterClass.PlayerWorldSceneInfoListNotify other) {
        if (other == emu.grasscutter.net.proto.PlayerWorldSceneInfoListNotifyOuterClass.PlayerWorldSceneInfoListNotify.getDefaultInstance()) return this;
        if (unlockInfosBuilder_ == null) {
          if (!other.unlockInfos_.isEmpty()) {
            if (unlockInfos_.isEmpty()) {
              unlockInfos_ = other.unlockInfos_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureUnlockInfosIsMutable();
              unlockInfos_.addAll(other.unlockInfos_);
            }
            onChanged();
          }
        } else {
          if (!other.unlockInfos_.isEmpty()) {
            if (unlockInfosBuilder_.isEmpty()) {
              unlockInfosBuilder_.dispose();
              unlockInfosBuilder_ = null;
              unlockInfos_ = other.unlockInfos_;
              bitField0_ = (bitField0_ & ~0x00000001);
              unlockInfosBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getUnlockInfosFieldBuilder() : null;
            } else {
              unlockInfosBuilder_.addAllMessages(other.unlockInfos_);
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
        emu.grasscutter.net.proto.PlayerWorldSceneInfoListNotifyOuterClass.PlayerWorldSceneInfoListNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.PlayerWorldSceneInfoListNotifyOuterClass.PlayerWorldSceneInfoListNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<emu.grasscutter.net.proto.SceneUnlockInfoOuterClass.SceneUnlockInfo> unlockInfos_ =
        java.util.Collections.emptyList();
      private void ensureUnlockInfosIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          unlockInfos_ = new java.util.ArrayList<emu.grasscutter.net.proto.SceneUnlockInfoOuterClass.SceneUnlockInfo>(unlockInfos_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.SceneUnlockInfoOuterClass.SceneUnlockInfo, emu.grasscutter.net.proto.SceneUnlockInfoOuterClass.SceneUnlockInfo.Builder, emu.grasscutter.net.proto.SceneUnlockInfoOuterClass.SceneUnlockInfoOrBuilder> unlockInfosBuilder_;

      /**
       * <code>repeated .SceneUnlockInfo unlockInfos = 1;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.SceneUnlockInfoOuterClass.SceneUnlockInfo> getUnlockInfosList() {
        if (unlockInfosBuilder_ == null) {
          return java.util.Collections.unmodifiableList(unlockInfos_);
        } else {
          return unlockInfosBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .SceneUnlockInfo unlockInfos = 1;</code>
       */
      public int getUnlockInfosCount() {
        if (unlockInfosBuilder_ == null) {
          return unlockInfos_.size();
        } else {
          return unlockInfosBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .SceneUnlockInfo unlockInfos = 1;</code>
       */
      public emu.grasscutter.net.proto.SceneUnlockInfoOuterClass.SceneUnlockInfo getUnlockInfos(int index) {
        if (unlockInfosBuilder_ == null) {
          return unlockInfos_.get(index);
        } else {
          return unlockInfosBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .SceneUnlockInfo unlockInfos = 1;</code>
       */
      public Builder setUnlockInfos(
          int index, emu.grasscutter.net.proto.SceneUnlockInfoOuterClass.SceneUnlockInfo value) {
        if (unlockInfosBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureUnlockInfosIsMutable();
          unlockInfos_.set(index, value);
          onChanged();
        } else {
          unlockInfosBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .SceneUnlockInfo unlockInfos = 1;</code>
       */
      public Builder setUnlockInfos(
          int index, emu.grasscutter.net.proto.SceneUnlockInfoOuterClass.SceneUnlockInfo.Builder builderForValue) {
        if (unlockInfosBuilder_ == null) {
          ensureUnlockInfosIsMutable();
          unlockInfos_.set(index, builderForValue.build());
          onChanged();
        } else {
          unlockInfosBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .SceneUnlockInfo unlockInfos = 1;</code>
       */
      public Builder addUnlockInfos(emu.grasscutter.net.proto.SceneUnlockInfoOuterClass.SceneUnlockInfo value) {
        if (unlockInfosBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureUnlockInfosIsMutable();
          unlockInfos_.add(value);
          onChanged();
        } else {
          unlockInfosBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .SceneUnlockInfo unlockInfos = 1;</code>
       */
      public Builder addUnlockInfos(
          int index, emu.grasscutter.net.proto.SceneUnlockInfoOuterClass.SceneUnlockInfo value) {
        if (unlockInfosBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureUnlockInfosIsMutable();
          unlockInfos_.add(index, value);
          onChanged();
        } else {
          unlockInfosBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .SceneUnlockInfo unlockInfos = 1;</code>
       */
      public Builder addUnlockInfos(
          emu.grasscutter.net.proto.SceneUnlockInfoOuterClass.SceneUnlockInfo.Builder builderForValue) {
        if (unlockInfosBuilder_ == null) {
          ensureUnlockInfosIsMutable();
          unlockInfos_.add(builderForValue.build());
          onChanged();
        } else {
          unlockInfosBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .SceneUnlockInfo unlockInfos = 1;</code>
       */
      public Builder addUnlockInfos(
          int index, emu.grasscutter.net.proto.SceneUnlockInfoOuterClass.SceneUnlockInfo.Builder builderForValue) {
        if (unlockInfosBuilder_ == null) {
          ensureUnlockInfosIsMutable();
          unlockInfos_.add(index, builderForValue.build());
          onChanged();
        } else {
          unlockInfosBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .SceneUnlockInfo unlockInfos = 1;</code>
       */
      public Builder addAllUnlockInfos(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.SceneUnlockInfoOuterClass.SceneUnlockInfo> values) {
        if (unlockInfosBuilder_ == null) {
          ensureUnlockInfosIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, unlockInfos_);
          onChanged();
        } else {
          unlockInfosBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .SceneUnlockInfo unlockInfos = 1;</code>
       */
      public Builder clearUnlockInfos() {
        if (unlockInfosBuilder_ == null) {
          unlockInfos_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          unlockInfosBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .SceneUnlockInfo unlockInfos = 1;</code>
       */
      public Builder removeUnlockInfos(int index) {
        if (unlockInfosBuilder_ == null) {
          ensureUnlockInfosIsMutable();
          unlockInfos_.remove(index);
          onChanged();
        } else {
          unlockInfosBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .SceneUnlockInfo unlockInfos = 1;</code>
       */
      public emu.grasscutter.net.proto.SceneUnlockInfoOuterClass.SceneUnlockInfo.Builder getUnlockInfosBuilder(
          int index) {
        return getUnlockInfosFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .SceneUnlockInfo unlockInfos = 1;</code>
       */
      public emu.grasscutter.net.proto.SceneUnlockInfoOuterClass.SceneUnlockInfoOrBuilder getUnlockInfosOrBuilder(
          int index) {
        if (unlockInfosBuilder_ == null) {
          return unlockInfos_.get(index);  } else {
          return unlockInfosBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .SceneUnlockInfo unlockInfos = 1;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.SceneUnlockInfoOuterClass.SceneUnlockInfoOrBuilder> 
           getUnlockInfosOrBuilderList() {
        if (unlockInfosBuilder_ != null) {
          return unlockInfosBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(unlockInfos_);
        }
      }
      /**
       * <code>repeated .SceneUnlockInfo unlockInfos = 1;</code>
       */
      public emu.grasscutter.net.proto.SceneUnlockInfoOuterClass.SceneUnlockInfo.Builder addUnlockInfosBuilder() {
        return getUnlockInfosFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.SceneUnlockInfoOuterClass.SceneUnlockInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .SceneUnlockInfo unlockInfos = 1;</code>
       */
      public emu.grasscutter.net.proto.SceneUnlockInfoOuterClass.SceneUnlockInfo.Builder addUnlockInfosBuilder(
          int index) {
        return getUnlockInfosFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.SceneUnlockInfoOuterClass.SceneUnlockInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .SceneUnlockInfo unlockInfos = 1;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.SceneUnlockInfoOuterClass.SceneUnlockInfo.Builder> 
           getUnlockInfosBuilderList() {
        return getUnlockInfosFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.SceneUnlockInfoOuterClass.SceneUnlockInfo, emu.grasscutter.net.proto.SceneUnlockInfoOuterClass.SceneUnlockInfo.Builder, emu.grasscutter.net.proto.SceneUnlockInfoOuterClass.SceneUnlockInfoOrBuilder> 
          getUnlockInfosFieldBuilder() {
        if (unlockInfosBuilder_ == null) {
          unlockInfosBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.SceneUnlockInfoOuterClass.SceneUnlockInfo, emu.grasscutter.net.proto.SceneUnlockInfoOuterClass.SceneUnlockInfo.Builder, emu.grasscutter.net.proto.SceneUnlockInfoOuterClass.SceneUnlockInfoOrBuilder>(
                  unlockInfos_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          unlockInfos_ = null;
        }
        return unlockInfosBuilder_;
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


      // @@protoc_insertion_point(builder_scope:PlayerWorldSceneInfoListNotify)
    }

    // @@protoc_insertion_point(class_scope:PlayerWorldSceneInfoListNotify)
    private static final emu.grasscutter.net.proto.PlayerWorldSceneInfoListNotifyOuterClass.PlayerWorldSceneInfoListNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.PlayerWorldSceneInfoListNotifyOuterClass.PlayerWorldSceneInfoListNotify();
    }

    public static emu.grasscutter.net.proto.PlayerWorldSceneInfoListNotifyOuterClass.PlayerWorldSceneInfoListNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PlayerWorldSceneInfoListNotify>
        PARSER = new com.google.protobuf.AbstractParser<PlayerWorldSceneInfoListNotify>() {
      @java.lang.Override
      public PlayerWorldSceneInfoListNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PlayerWorldSceneInfoListNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PlayerWorldSceneInfoListNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PlayerWorldSceneInfoListNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.PlayerWorldSceneInfoListNotifyOuterClass.PlayerWorldSceneInfoListNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PlayerWorldSceneInfoListNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PlayerWorldSceneInfoListNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$PlayerWorldSceneInfoListNotify.proto\032\025" +
      "SceneUnlockInfo.proto\"G\n\036PlayerWorldScen" +
      "eInfoListNotify\022%\n\013unlockInfos\030\001 \003(\0132\020.S" +
      "ceneUnlockInfoB\033\n\031emu.grasscutter.net.pr" +
      "otob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.SceneUnlockInfoOuterClass.getDescriptor(),
        });
    internal_static_PlayerWorldSceneInfoListNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PlayerWorldSceneInfoListNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PlayerWorldSceneInfoListNotify_descriptor,
        new java.lang.String[] { "UnlockInfos", });
    emu.grasscutter.net.proto.SceneUnlockInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
