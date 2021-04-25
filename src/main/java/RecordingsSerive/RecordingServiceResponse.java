// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RecordingService.proto

package RecordingsSerive;

/**
 * Protobuf type {@code RecordingsSerive.RecordingServiceResponse}
 */
public  final class RecordingServiceResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:RecordingsSerive.RecordingServiceResponse)
    RecordingServiceResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RecordingServiceResponse.newBuilder() to construct.
  private RecordingServiceResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RecordingServiceResponse() {
    status_ = 0;
    medicalRecords_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RecordingServiceResponse(
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
          case 24: {
            int rawValue = input.readEnum();

            status_ = rawValue;
            break;
          }
          case 34: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              medicalRecords_ = new java.util.ArrayList<RecordingsSerive.MedicalRecord>();
              mutable_bitField0_ |= 0x00000002;
            }
            medicalRecords_.add(
                input.readMessage(RecordingsSerive.MedicalRecord.parser(), extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
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
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        medicalRecords_ = java.util.Collections.unmodifiableList(medicalRecords_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return RecordingsSerive.RecordServiceImpl.internal_static_RecordingsSerive_RecordingServiceResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return RecordingsSerive.RecordServiceImpl.internal_static_RecordingsSerive_RecordingServiceResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            RecordingsSerive.RecordingServiceResponse.class, RecordingsSerive.RecordingServiceResponse.Builder.class);
  }

  /**
   * Protobuf enum {@code RecordingsSerive.RecordingServiceResponse.Status}
   */
  public enum Status
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>FAILURE = 0;</code>
     */
    FAILURE(0),
    /**
     * <code>SUCCESSFUL = 1;</code>
     */
    SUCCESSFUL(1),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>FAILURE = 0;</code>
     */
    public static final int FAILURE_VALUE = 0;
    /**
     * <code>SUCCESSFUL = 1;</code>
     */
    public static final int SUCCESSFUL_VALUE = 1;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Status valueOf(int value) {
      return forNumber(value);
    }

    public static Status forNumber(int value) {
      switch (value) {
        case 0: return FAILURE;
        case 1: return SUCCESSFUL;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Status>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Status> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Status>() {
            public Status findValueByNumber(int number) {
              return Status.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return RecordingsSerive.RecordingServiceResponse.getDescriptor().getEnumTypes().get(0);
    }

    private static final Status[] VALUES = values();

    public static Status valueOf(
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

    private Status(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:RecordingsSerive.RecordingServiceResponse.Status)
  }

  private int bitField0_;
  public static final int STATUS_FIELD_NUMBER = 3;
  private int status_;
  /**
   * <code>.RecordingsSerive.RecordingServiceResponse.Status status = 3;</code>
   */
  public int getStatusValue() {
    return status_;
  }
  /**
   * <code>.RecordingsSerive.RecordingServiceResponse.Status status = 3;</code>
   */
  public RecordingsSerive.RecordingServiceResponse.Status getStatus() {
    @SuppressWarnings("deprecation")
    RecordingsSerive.RecordingServiceResponse.Status result = RecordingsSerive.RecordingServiceResponse.Status.valueOf(status_);
    return result == null ? RecordingsSerive.RecordingServiceResponse.Status.UNRECOGNIZED : result;
  }

  public static final int MEDICALRECORDS_FIELD_NUMBER = 4;
  private java.util.List<RecordingsSerive.MedicalRecord> medicalRecords_;
  /**
   * <pre>
   *list medical records
   * </pre>
   *
   * <code>repeated .RecordingsSerive.MedicalRecord medicalRecords = 4;</code>
   */
  public java.util.List<RecordingsSerive.MedicalRecord> getMedicalRecordsList() {
    return medicalRecords_;
  }
  /**
   * <pre>
   *list medical records
   * </pre>
   *
   * <code>repeated .RecordingsSerive.MedicalRecord medicalRecords = 4;</code>
   */
  public java.util.List<? extends RecordingsSerive.MedicalRecordOrBuilder> 
      getMedicalRecordsOrBuilderList() {
    return medicalRecords_;
  }
  /**
   * <pre>
   *list medical records
   * </pre>
   *
   * <code>repeated .RecordingsSerive.MedicalRecord medicalRecords = 4;</code>
   */
  public int getMedicalRecordsCount() {
    return medicalRecords_.size();
  }
  /**
   * <pre>
   *list medical records
   * </pre>
   *
   * <code>repeated .RecordingsSerive.MedicalRecord medicalRecords = 4;</code>
   */
  public RecordingsSerive.MedicalRecord getMedicalRecords(int index) {
    return medicalRecords_.get(index);
  }
  /**
   * <pre>
   *list medical records
   * </pre>
   *
   * <code>repeated .RecordingsSerive.MedicalRecord medicalRecords = 4;</code>
   */
  public RecordingsSerive.MedicalRecordOrBuilder getMedicalRecordsOrBuilder(
      int index) {
    return medicalRecords_.get(index);
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
    if (status_ != RecordingsSerive.RecordingServiceResponse.Status.FAILURE.getNumber()) {
      output.writeEnum(3, status_);
    }
    for (int i = 0; i < medicalRecords_.size(); i++) {
      output.writeMessage(4, medicalRecords_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (status_ != RecordingsSerive.RecordingServiceResponse.Status.FAILURE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, status_);
    }
    for (int i = 0; i < medicalRecords_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, medicalRecords_.get(i));
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
    if (!(obj instanceof RecordingsSerive.RecordingServiceResponse)) {
      return super.equals(obj);
    }
    RecordingsSerive.RecordingServiceResponse other = (RecordingsSerive.RecordingServiceResponse) obj;

    boolean result = true;
    result = result && status_ == other.status_;
    result = result && getMedicalRecordsList()
        .equals(other.getMedicalRecordsList());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + status_;
    if (getMedicalRecordsCount() > 0) {
      hash = (37 * hash) + MEDICALRECORDS_FIELD_NUMBER;
      hash = (53 * hash) + getMedicalRecordsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static RecordingsSerive.RecordingServiceResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static RecordingsSerive.RecordingServiceResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static RecordingsSerive.RecordingServiceResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static RecordingsSerive.RecordingServiceResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static RecordingsSerive.RecordingServiceResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static RecordingsSerive.RecordingServiceResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static RecordingsSerive.RecordingServiceResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static RecordingsSerive.RecordingServiceResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static RecordingsSerive.RecordingServiceResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static RecordingsSerive.RecordingServiceResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static RecordingsSerive.RecordingServiceResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static RecordingsSerive.RecordingServiceResponse parseFrom(
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
  public static Builder newBuilder(RecordingsSerive.RecordingServiceResponse prototype) {
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
   * Protobuf type {@code RecordingsSerive.RecordingServiceResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:RecordingsSerive.RecordingServiceResponse)
      RecordingsSerive.RecordingServiceResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return RecordingsSerive.RecordServiceImpl.internal_static_RecordingsSerive_RecordingServiceResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return RecordingsSerive.RecordServiceImpl.internal_static_RecordingsSerive_RecordingServiceResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              RecordingsSerive.RecordingServiceResponse.class, RecordingsSerive.RecordingServiceResponse.Builder.class);
    }

    // Construct using RecordingsSerive.RecordingServiceResponse.newBuilder()
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
        getMedicalRecordsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      status_ = 0;

      if (medicalRecordsBuilder_ == null) {
        medicalRecords_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        medicalRecordsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return RecordingsSerive.RecordServiceImpl.internal_static_RecordingsSerive_RecordingServiceResponse_descriptor;
    }

    @java.lang.Override
    public RecordingsSerive.RecordingServiceResponse getDefaultInstanceForType() {
      return RecordingsSerive.RecordingServiceResponse.getDefaultInstance();
    }

    @java.lang.Override
    public RecordingsSerive.RecordingServiceResponse build() {
      RecordingsSerive.RecordingServiceResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public RecordingsSerive.RecordingServiceResponse buildPartial() {
      RecordingsSerive.RecordingServiceResponse result = new RecordingsSerive.RecordingServiceResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.status_ = status_;
      if (medicalRecordsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          medicalRecords_ = java.util.Collections.unmodifiableList(medicalRecords_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.medicalRecords_ = medicalRecords_;
      } else {
        result.medicalRecords_ = medicalRecordsBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof RecordingsSerive.RecordingServiceResponse) {
        return mergeFrom((RecordingsSerive.RecordingServiceResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(RecordingsSerive.RecordingServiceResponse other) {
      if (other == RecordingsSerive.RecordingServiceResponse.getDefaultInstance()) return this;
      if (other.status_ != 0) {
        setStatusValue(other.getStatusValue());
      }
      if (medicalRecordsBuilder_ == null) {
        if (!other.medicalRecords_.isEmpty()) {
          if (medicalRecords_.isEmpty()) {
            medicalRecords_ = other.medicalRecords_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureMedicalRecordsIsMutable();
            medicalRecords_.addAll(other.medicalRecords_);
          }
          onChanged();
        }
      } else {
        if (!other.medicalRecords_.isEmpty()) {
          if (medicalRecordsBuilder_.isEmpty()) {
            medicalRecordsBuilder_.dispose();
            medicalRecordsBuilder_ = null;
            medicalRecords_ = other.medicalRecords_;
            bitField0_ = (bitField0_ & ~0x00000002);
            medicalRecordsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getMedicalRecordsFieldBuilder() : null;
          } else {
            medicalRecordsBuilder_.addAllMessages(other.medicalRecords_);
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
      RecordingsSerive.RecordingServiceResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (RecordingsSerive.RecordingServiceResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int status_ = 0;
    /**
     * <code>.RecordingsSerive.RecordingServiceResponse.Status status = 3;</code>
     */
    public int getStatusValue() {
      return status_;
    }
    /**
     * <code>.RecordingsSerive.RecordingServiceResponse.Status status = 3;</code>
     */
    public Builder setStatusValue(int value) {
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.RecordingsSerive.RecordingServiceResponse.Status status = 3;</code>
     */
    public RecordingsSerive.RecordingServiceResponse.Status getStatus() {
      @SuppressWarnings("deprecation")
      RecordingsSerive.RecordingServiceResponse.Status result = RecordingsSerive.RecordingServiceResponse.Status.valueOf(status_);
      return result == null ? RecordingsSerive.RecordingServiceResponse.Status.UNRECOGNIZED : result;
    }
    /**
     * <code>.RecordingsSerive.RecordingServiceResponse.Status status = 3;</code>
     */
    public Builder setStatus(RecordingsSerive.RecordingServiceResponse.Status value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      status_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.RecordingsSerive.RecordingServiceResponse.Status status = 3;</code>
     */
    public Builder clearStatus() {
      
      status_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<RecordingsSerive.MedicalRecord> medicalRecords_ =
      java.util.Collections.emptyList();
    private void ensureMedicalRecordsIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        medicalRecords_ = new java.util.ArrayList<RecordingsSerive.MedicalRecord>(medicalRecords_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        RecordingsSerive.MedicalRecord, RecordingsSerive.MedicalRecord.Builder, RecordingsSerive.MedicalRecordOrBuilder> medicalRecordsBuilder_;

    /**
     * <pre>
     *list medical records
     * </pre>
     *
     * <code>repeated .RecordingsSerive.MedicalRecord medicalRecords = 4;</code>
     */
    public java.util.List<RecordingsSerive.MedicalRecord> getMedicalRecordsList() {
      if (medicalRecordsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(medicalRecords_);
      } else {
        return medicalRecordsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     *list medical records
     * </pre>
     *
     * <code>repeated .RecordingsSerive.MedicalRecord medicalRecords = 4;</code>
     */
    public int getMedicalRecordsCount() {
      if (medicalRecordsBuilder_ == null) {
        return medicalRecords_.size();
      } else {
        return medicalRecordsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     *list medical records
     * </pre>
     *
     * <code>repeated .RecordingsSerive.MedicalRecord medicalRecords = 4;</code>
     */
    public RecordingsSerive.MedicalRecord getMedicalRecords(int index) {
      if (medicalRecordsBuilder_ == null) {
        return medicalRecords_.get(index);
      } else {
        return medicalRecordsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     *list medical records
     * </pre>
     *
     * <code>repeated .RecordingsSerive.MedicalRecord medicalRecords = 4;</code>
     */
    public Builder setMedicalRecords(
        int index, RecordingsSerive.MedicalRecord value) {
      if (medicalRecordsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMedicalRecordsIsMutable();
        medicalRecords_.set(index, value);
        onChanged();
      } else {
        medicalRecordsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     *list medical records
     * </pre>
     *
     * <code>repeated .RecordingsSerive.MedicalRecord medicalRecords = 4;</code>
     */
    public Builder setMedicalRecords(
        int index, RecordingsSerive.MedicalRecord.Builder builderForValue) {
      if (medicalRecordsBuilder_ == null) {
        ensureMedicalRecordsIsMutable();
        medicalRecords_.set(index, builderForValue.build());
        onChanged();
      } else {
        medicalRecordsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     *list medical records
     * </pre>
     *
     * <code>repeated .RecordingsSerive.MedicalRecord medicalRecords = 4;</code>
     */
    public Builder addMedicalRecords(RecordingsSerive.MedicalRecord value) {
      if (medicalRecordsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMedicalRecordsIsMutable();
        medicalRecords_.add(value);
        onChanged();
      } else {
        medicalRecordsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     *list medical records
     * </pre>
     *
     * <code>repeated .RecordingsSerive.MedicalRecord medicalRecords = 4;</code>
     */
    public Builder addMedicalRecords(
        int index, RecordingsSerive.MedicalRecord value) {
      if (medicalRecordsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMedicalRecordsIsMutable();
        medicalRecords_.add(index, value);
        onChanged();
      } else {
        medicalRecordsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     *list medical records
     * </pre>
     *
     * <code>repeated .RecordingsSerive.MedicalRecord medicalRecords = 4;</code>
     */
    public Builder addMedicalRecords(
        RecordingsSerive.MedicalRecord.Builder builderForValue) {
      if (medicalRecordsBuilder_ == null) {
        ensureMedicalRecordsIsMutable();
        medicalRecords_.add(builderForValue.build());
        onChanged();
      } else {
        medicalRecordsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     *list medical records
     * </pre>
     *
     * <code>repeated .RecordingsSerive.MedicalRecord medicalRecords = 4;</code>
     */
    public Builder addMedicalRecords(
        int index, RecordingsSerive.MedicalRecord.Builder builderForValue) {
      if (medicalRecordsBuilder_ == null) {
        ensureMedicalRecordsIsMutable();
        medicalRecords_.add(index, builderForValue.build());
        onChanged();
      } else {
        medicalRecordsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     *list medical records
     * </pre>
     *
     * <code>repeated .RecordingsSerive.MedicalRecord medicalRecords = 4;</code>
     */
    public Builder addAllMedicalRecords(
        java.lang.Iterable<? extends RecordingsSerive.MedicalRecord> values) {
      if (medicalRecordsBuilder_ == null) {
        ensureMedicalRecordsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, medicalRecords_);
        onChanged();
      } else {
        medicalRecordsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     *list medical records
     * </pre>
     *
     * <code>repeated .RecordingsSerive.MedicalRecord medicalRecords = 4;</code>
     */
    public Builder clearMedicalRecords() {
      if (medicalRecordsBuilder_ == null) {
        medicalRecords_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        medicalRecordsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     *list medical records
     * </pre>
     *
     * <code>repeated .RecordingsSerive.MedicalRecord medicalRecords = 4;</code>
     */
    public Builder removeMedicalRecords(int index) {
      if (medicalRecordsBuilder_ == null) {
        ensureMedicalRecordsIsMutable();
        medicalRecords_.remove(index);
        onChanged();
      } else {
        medicalRecordsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     *list medical records
     * </pre>
     *
     * <code>repeated .RecordingsSerive.MedicalRecord medicalRecords = 4;</code>
     */
    public RecordingsSerive.MedicalRecord.Builder getMedicalRecordsBuilder(
        int index) {
      return getMedicalRecordsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     *list medical records
     * </pre>
     *
     * <code>repeated .RecordingsSerive.MedicalRecord medicalRecords = 4;</code>
     */
    public RecordingsSerive.MedicalRecordOrBuilder getMedicalRecordsOrBuilder(
        int index) {
      if (medicalRecordsBuilder_ == null) {
        return medicalRecords_.get(index);  } else {
        return medicalRecordsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     *list medical records
     * </pre>
     *
     * <code>repeated .RecordingsSerive.MedicalRecord medicalRecords = 4;</code>
     */
    public java.util.List<? extends RecordingsSerive.MedicalRecordOrBuilder> 
         getMedicalRecordsOrBuilderList() {
      if (medicalRecordsBuilder_ != null) {
        return medicalRecordsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(medicalRecords_);
      }
    }
    /**
     * <pre>
     *list medical records
     * </pre>
     *
     * <code>repeated .RecordingsSerive.MedicalRecord medicalRecords = 4;</code>
     */
    public RecordingsSerive.MedicalRecord.Builder addMedicalRecordsBuilder() {
      return getMedicalRecordsFieldBuilder().addBuilder(
          RecordingsSerive.MedicalRecord.getDefaultInstance());
    }
    /**
     * <pre>
     *list medical records
     * </pre>
     *
     * <code>repeated .RecordingsSerive.MedicalRecord medicalRecords = 4;</code>
     */
    public RecordingsSerive.MedicalRecord.Builder addMedicalRecordsBuilder(
        int index) {
      return getMedicalRecordsFieldBuilder().addBuilder(
          index, RecordingsSerive.MedicalRecord.getDefaultInstance());
    }
    /**
     * <pre>
     *list medical records
     * </pre>
     *
     * <code>repeated .RecordingsSerive.MedicalRecord medicalRecords = 4;</code>
     */
    public java.util.List<RecordingsSerive.MedicalRecord.Builder> 
         getMedicalRecordsBuilderList() {
      return getMedicalRecordsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        RecordingsSerive.MedicalRecord, RecordingsSerive.MedicalRecord.Builder, RecordingsSerive.MedicalRecordOrBuilder> 
        getMedicalRecordsFieldBuilder() {
      if (medicalRecordsBuilder_ == null) {
        medicalRecordsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            RecordingsSerive.MedicalRecord, RecordingsSerive.MedicalRecord.Builder, RecordingsSerive.MedicalRecordOrBuilder>(
                medicalRecords_,
                ((bitField0_ & 0x00000002) == 0x00000002),
                getParentForChildren(),
                isClean());
        medicalRecords_ = null;
      }
      return medicalRecordsBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:RecordingsSerive.RecordingServiceResponse)
  }

  // @@protoc_insertion_point(class_scope:RecordingsSerive.RecordingServiceResponse)
  private static final RecordingsSerive.RecordingServiceResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new RecordingsSerive.RecordingServiceResponse();
  }

  public static RecordingsSerive.RecordingServiceResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RecordingServiceResponse>
      PARSER = new com.google.protobuf.AbstractParser<RecordingServiceResponse>() {
    @java.lang.Override
    public RecordingServiceResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RecordingServiceResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RecordingServiceResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RecordingServiceResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public RecordingsSerive.RecordingServiceResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

