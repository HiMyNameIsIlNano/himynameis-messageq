// <auto-generated>
//     Generated by the protocol buffer compiler.  DO NOT EDIT!
//     source: manageQueue.proto
// </auto-generated>
#pragma warning disable 1591, 0612, 3021
#region Designer generated code

using pb = global::Google.Protobuf;
using pbc = global::Google.Protobuf.Collections;
using pbr = global::Google.Protobuf.Reflection;
using scg = global::System.Collections.Generic;
/// <summary>Holder for reflection information generated from manageQueue.proto</summary>
public static partial class ManageQueueReflection {

  #region Descriptor
  /// <summary>File descriptor for manageQueue.proto</summary>
  public static pbr::FileDescriptor Descriptor {
    get { return descriptor; }
  }
  private static pbr::FileDescriptor descriptor;

  static ManageQueueReflection() {
    byte[] descriptorData = global::System.Convert.FromBase64String(
        string.Concat(
          "ChFtYW5hZ2VRdWV1ZS5wcm90byIvChdFeGNoYW5nZUNyZWF0aW9uUmVxdWVz",
          "dBIUCgxleGNoYW5nZU5hbWUYASABKAkiVwoYRXhjaGFuZ2VDcmVhdGlvblJl",
          "c3BvbnNlEhQKDGV4Y2hhbmdlTmFtZRgBIAEoCRIPCgdjcmVhdGVkGAIgASgI",
          "EhQKDGVycm9yTWVzc2FnZRgDIAEoCSJpChhDcmVhdGVQbGF5ZXJRdWV1ZVJl",
          "cXVlc3QSFAoMZXhjaGFuZ2VOYW1lGAEgASgJEhEKCXF1ZXVlTmFtZRgCIAEo",
          "CRIQCghwbGF5ZXJJZBgDIAEoBRISCgpyb3V0aW5nS2V5GAQgASgJIn0KGUNy",
          "ZWF0ZVBsYXllclF1ZXVlUmVzcG9uc2USFAoMZXhjaGFuZ2VOYW1lGAEgASgJ",
          "EhEKCXF1ZXVlTmFtZRgCIAEoCRIQCghwbGF5ZXJJZBgDIAEoBRIPCgdjcmVh",
          "dGVkGAQgASgIEhQKDGVycm9yTWVzc2FnZRgFIAEoCTKyAQoWTWFuYWdlUXVl",
          "dWVHcnBjU2VydmljZRJHCg5DcmVhdGVFeGNoYW5nZRIYLkV4Y2hhbmdlQ3Jl",
          "YXRpb25SZXF1ZXN0GhkuRXhjaGFuZ2VDcmVhdGlvblJlc3BvbnNlIgASTwoU",
          "Q29ubmVjdFBsYXllclRvUXVldWUSGS5DcmVhdGVQbGF5ZXJRdWV1ZVJlcXVl",
          "c3QaGi5DcmVhdGVQbGF5ZXJRdWV1ZVJlc3BvbnNlIgBCFwoTY29tLm1lc3Nh",
          "Z2VxLmNvbmZpZ1ABYgZwcm90bzM="));
    descriptor = pbr::FileDescriptor.FromGeneratedCode(descriptorData,
        new pbr::FileDescriptor[] { },
        new pbr::GeneratedClrTypeInfo(null, null, new pbr::GeneratedClrTypeInfo[] {
          new pbr::GeneratedClrTypeInfo(typeof(global::ExchangeCreationRequest), global::ExchangeCreationRequest.Parser, new[]{ "ExchangeName" }, null, null, null, null),
          new pbr::GeneratedClrTypeInfo(typeof(global::ExchangeCreationResponse), global::ExchangeCreationResponse.Parser, new[]{ "ExchangeName", "Created", "ErrorMessage" }, null, null, null, null),
          new pbr::GeneratedClrTypeInfo(typeof(global::CreatePlayerQueueRequest), global::CreatePlayerQueueRequest.Parser, new[]{ "ExchangeName", "QueueName", "PlayerId", "RoutingKey" }, null, null, null, null),
          new pbr::GeneratedClrTypeInfo(typeof(global::CreatePlayerQueueResponse), global::CreatePlayerQueueResponse.Parser, new[]{ "ExchangeName", "QueueName", "PlayerId", "Created", "ErrorMessage" }, null, null, null, null)
        }));
  }
  #endregion

}
#region Messages
public sealed partial class ExchangeCreationRequest : pb::IMessage<ExchangeCreationRequest>
#if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
    , pb::IBufferMessage
#endif
{
  private static readonly pb::MessageParser<ExchangeCreationRequest> _parser = new pb::MessageParser<ExchangeCreationRequest>(() => new ExchangeCreationRequest());
  private pb::UnknownFieldSet _unknownFields;
  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public static pb::MessageParser<ExchangeCreationRequest> Parser { get { return _parser; } }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public static pbr::MessageDescriptor Descriptor {
    get { return global::ManageQueueReflection.Descriptor.MessageTypes[0]; }
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  pbr::MessageDescriptor pb::IMessage.Descriptor {
    get { return Descriptor; }
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public ExchangeCreationRequest() {
    OnConstruction();
  }

  partial void OnConstruction();

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public ExchangeCreationRequest(ExchangeCreationRequest other) : this() {
    exchangeName_ = other.exchangeName_;
    _unknownFields = pb::UnknownFieldSet.Clone(other._unknownFields);
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public ExchangeCreationRequest Clone() {
    return new ExchangeCreationRequest(this);
  }

  /// <summary>Field number for the "exchangeName" field.</summary>
  public const int ExchangeNameFieldNumber = 1;
  private string exchangeName_ = "";
  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public string ExchangeName {
    get { return exchangeName_; }
    set {
      exchangeName_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
    }
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public override bool Equals(object other) {
    return Equals(other as ExchangeCreationRequest);
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public bool Equals(ExchangeCreationRequest other) {
    if (ReferenceEquals(other, null)) {
      return false;
    }
    if (ReferenceEquals(other, this)) {
      return true;
    }
    if (ExchangeName != other.ExchangeName) return false;
    return Equals(_unknownFields, other._unknownFields);
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public override int GetHashCode() {
    int hash = 1;
    if (ExchangeName.Length != 0) hash ^= ExchangeName.GetHashCode();
    if (_unknownFields != null) {
      hash ^= _unknownFields.GetHashCode();
    }
    return hash;
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public override string ToString() {
    return pb::JsonFormatter.ToDiagnosticString(this);
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public void WriteTo(pb::CodedOutputStream output) {
  #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
    output.WriteRawMessage(this);
  #else
    if (ExchangeName.Length != 0) {
      output.WriteRawTag(10);
      output.WriteString(ExchangeName);
    }
    if (_unknownFields != null) {
      _unknownFields.WriteTo(output);
    }
  #endif
  }

  #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  void pb::IBufferMessage.InternalWriteTo(ref pb::WriteContext output) {
    if (ExchangeName.Length != 0) {
      output.WriteRawTag(10);
      output.WriteString(ExchangeName);
    }
    if (_unknownFields != null) {
      _unknownFields.WriteTo(ref output);
    }
  }
  #endif

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public int CalculateSize() {
    int size = 0;
    if (ExchangeName.Length != 0) {
      size += 1 + pb::CodedOutputStream.ComputeStringSize(ExchangeName);
    }
    if (_unknownFields != null) {
      size += _unknownFields.CalculateSize();
    }
    return size;
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public void MergeFrom(ExchangeCreationRequest other) {
    if (other == null) {
      return;
    }
    if (other.ExchangeName.Length != 0) {
      ExchangeName = other.ExchangeName;
    }
    _unknownFields = pb::UnknownFieldSet.MergeFrom(_unknownFields, other._unknownFields);
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public void MergeFrom(pb::CodedInputStream input) {
  #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
    input.ReadRawMessage(this);
  #else
    uint tag;
    while ((tag = input.ReadTag()) != 0) {
      switch(tag) {
        default:
          _unknownFields = pb::UnknownFieldSet.MergeFieldFrom(_unknownFields, input);
          break;
        case 10: {
          ExchangeName = input.ReadString();
          break;
        }
      }
    }
  #endif
  }

  #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  void pb::IBufferMessage.InternalMergeFrom(ref pb::ParseContext input) {
    uint tag;
    while ((tag = input.ReadTag()) != 0) {
      switch(tag) {
        default:
          _unknownFields = pb::UnknownFieldSet.MergeFieldFrom(_unknownFields, ref input);
          break;
        case 10: {
          ExchangeName = input.ReadString();
          break;
        }
      }
    }
  }
  #endif

}

public sealed partial class ExchangeCreationResponse : pb::IMessage<ExchangeCreationResponse>
#if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
    , pb::IBufferMessage
#endif
{
  private static readonly pb::MessageParser<ExchangeCreationResponse> _parser = new pb::MessageParser<ExchangeCreationResponse>(() => new ExchangeCreationResponse());
  private pb::UnknownFieldSet _unknownFields;
  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public static pb::MessageParser<ExchangeCreationResponse> Parser { get { return _parser; } }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public static pbr::MessageDescriptor Descriptor {
    get { return global::ManageQueueReflection.Descriptor.MessageTypes[1]; }
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  pbr::MessageDescriptor pb::IMessage.Descriptor {
    get { return Descriptor; }
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public ExchangeCreationResponse() {
    OnConstruction();
  }

  partial void OnConstruction();

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public ExchangeCreationResponse(ExchangeCreationResponse other) : this() {
    exchangeName_ = other.exchangeName_;
    created_ = other.created_;
    errorMessage_ = other.errorMessage_;
    _unknownFields = pb::UnknownFieldSet.Clone(other._unknownFields);
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public ExchangeCreationResponse Clone() {
    return new ExchangeCreationResponse(this);
  }

  /// <summary>Field number for the "exchangeName" field.</summary>
  public const int ExchangeNameFieldNumber = 1;
  private string exchangeName_ = "";
  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public string ExchangeName {
    get { return exchangeName_; }
    set {
      exchangeName_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
    }
  }

  /// <summary>Field number for the "created" field.</summary>
  public const int CreatedFieldNumber = 2;
  private bool created_;
  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public bool Created {
    get { return created_; }
    set {
      created_ = value;
    }
  }

  /// <summary>Field number for the "errorMessage" field.</summary>
  public const int ErrorMessageFieldNumber = 3;
  private string errorMessage_ = "";
  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public string ErrorMessage {
    get { return errorMessage_; }
    set {
      errorMessage_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
    }
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public override bool Equals(object other) {
    return Equals(other as ExchangeCreationResponse);
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public bool Equals(ExchangeCreationResponse other) {
    if (ReferenceEquals(other, null)) {
      return false;
    }
    if (ReferenceEquals(other, this)) {
      return true;
    }
    if (ExchangeName != other.ExchangeName) return false;
    if (Created != other.Created) return false;
    if (ErrorMessage != other.ErrorMessage) return false;
    return Equals(_unknownFields, other._unknownFields);
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public override int GetHashCode() {
    int hash = 1;
    if (ExchangeName.Length != 0) hash ^= ExchangeName.GetHashCode();
    if (Created != false) hash ^= Created.GetHashCode();
    if (ErrorMessage.Length != 0) hash ^= ErrorMessage.GetHashCode();
    if (_unknownFields != null) {
      hash ^= _unknownFields.GetHashCode();
    }
    return hash;
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public override string ToString() {
    return pb::JsonFormatter.ToDiagnosticString(this);
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public void WriteTo(pb::CodedOutputStream output) {
  #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
    output.WriteRawMessage(this);
  #else
    if (ExchangeName.Length != 0) {
      output.WriteRawTag(10);
      output.WriteString(ExchangeName);
    }
    if (Created != false) {
      output.WriteRawTag(16);
      output.WriteBool(Created);
    }
    if (ErrorMessage.Length != 0) {
      output.WriteRawTag(26);
      output.WriteString(ErrorMessage);
    }
    if (_unknownFields != null) {
      _unknownFields.WriteTo(output);
    }
  #endif
  }

  #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  void pb::IBufferMessage.InternalWriteTo(ref pb::WriteContext output) {
    if (ExchangeName.Length != 0) {
      output.WriteRawTag(10);
      output.WriteString(ExchangeName);
    }
    if (Created != false) {
      output.WriteRawTag(16);
      output.WriteBool(Created);
    }
    if (ErrorMessage.Length != 0) {
      output.WriteRawTag(26);
      output.WriteString(ErrorMessage);
    }
    if (_unknownFields != null) {
      _unknownFields.WriteTo(ref output);
    }
  }
  #endif

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public int CalculateSize() {
    int size = 0;
    if (ExchangeName.Length != 0) {
      size += 1 + pb::CodedOutputStream.ComputeStringSize(ExchangeName);
    }
    if (Created != false) {
      size += 1 + 1;
    }
    if (ErrorMessage.Length != 0) {
      size += 1 + pb::CodedOutputStream.ComputeStringSize(ErrorMessage);
    }
    if (_unknownFields != null) {
      size += _unknownFields.CalculateSize();
    }
    return size;
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public void MergeFrom(ExchangeCreationResponse other) {
    if (other == null) {
      return;
    }
    if (other.ExchangeName.Length != 0) {
      ExchangeName = other.ExchangeName;
    }
    if (other.Created != false) {
      Created = other.Created;
    }
    if (other.ErrorMessage.Length != 0) {
      ErrorMessage = other.ErrorMessage;
    }
    _unknownFields = pb::UnknownFieldSet.MergeFrom(_unknownFields, other._unknownFields);
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public void MergeFrom(pb::CodedInputStream input) {
  #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
    input.ReadRawMessage(this);
  #else
    uint tag;
    while ((tag = input.ReadTag()) != 0) {
      switch(tag) {
        default:
          _unknownFields = pb::UnknownFieldSet.MergeFieldFrom(_unknownFields, input);
          break;
        case 10: {
          ExchangeName = input.ReadString();
          break;
        }
        case 16: {
          Created = input.ReadBool();
          break;
        }
        case 26: {
          ErrorMessage = input.ReadString();
          break;
        }
      }
    }
  #endif
  }

  #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  void pb::IBufferMessage.InternalMergeFrom(ref pb::ParseContext input) {
    uint tag;
    while ((tag = input.ReadTag()) != 0) {
      switch(tag) {
        default:
          _unknownFields = pb::UnknownFieldSet.MergeFieldFrom(_unknownFields, ref input);
          break;
        case 10: {
          ExchangeName = input.ReadString();
          break;
        }
        case 16: {
          Created = input.ReadBool();
          break;
        }
        case 26: {
          ErrorMessage = input.ReadString();
          break;
        }
      }
    }
  }
  #endif

}

public sealed partial class CreatePlayerQueueRequest : pb::IMessage<CreatePlayerQueueRequest>
#if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
    , pb::IBufferMessage
#endif
{
  private static readonly pb::MessageParser<CreatePlayerQueueRequest> _parser = new pb::MessageParser<CreatePlayerQueueRequest>(() => new CreatePlayerQueueRequest());
  private pb::UnknownFieldSet _unknownFields;
  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public static pb::MessageParser<CreatePlayerQueueRequest> Parser { get { return _parser; } }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public static pbr::MessageDescriptor Descriptor {
    get { return global::ManageQueueReflection.Descriptor.MessageTypes[2]; }
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  pbr::MessageDescriptor pb::IMessage.Descriptor {
    get { return Descriptor; }
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public CreatePlayerQueueRequest() {
    OnConstruction();
  }

  partial void OnConstruction();

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public CreatePlayerQueueRequest(CreatePlayerQueueRequest other) : this() {
    exchangeName_ = other.exchangeName_;
    queueName_ = other.queueName_;
    playerId_ = other.playerId_;
    routingKey_ = other.routingKey_;
    _unknownFields = pb::UnknownFieldSet.Clone(other._unknownFields);
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public CreatePlayerQueueRequest Clone() {
    return new CreatePlayerQueueRequest(this);
  }

  /// <summary>Field number for the "exchangeName" field.</summary>
  public const int ExchangeNameFieldNumber = 1;
  private string exchangeName_ = "";
  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public string ExchangeName {
    get { return exchangeName_; }
    set {
      exchangeName_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
    }
  }

  /// <summary>Field number for the "queueName" field.</summary>
  public const int QueueNameFieldNumber = 2;
  private string queueName_ = "";
  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public string QueueName {
    get { return queueName_; }
    set {
      queueName_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
    }
  }

  /// <summary>Field number for the "playerId" field.</summary>
  public const int PlayerIdFieldNumber = 3;
  private int playerId_;
  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public int PlayerId {
    get { return playerId_; }
    set {
      playerId_ = value;
    }
  }

  /// <summary>Field number for the "routingKey" field.</summary>
  public const int RoutingKeyFieldNumber = 4;
  private string routingKey_ = "";
  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public string RoutingKey {
    get { return routingKey_; }
    set {
      routingKey_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
    }
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public override bool Equals(object other) {
    return Equals(other as CreatePlayerQueueRequest);
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public bool Equals(CreatePlayerQueueRequest other) {
    if (ReferenceEquals(other, null)) {
      return false;
    }
    if (ReferenceEquals(other, this)) {
      return true;
    }
    if (ExchangeName != other.ExchangeName) return false;
    if (QueueName != other.QueueName) return false;
    if (PlayerId != other.PlayerId) return false;
    if (RoutingKey != other.RoutingKey) return false;
    return Equals(_unknownFields, other._unknownFields);
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public override int GetHashCode() {
    int hash = 1;
    if (ExchangeName.Length != 0) hash ^= ExchangeName.GetHashCode();
    if (QueueName.Length != 0) hash ^= QueueName.GetHashCode();
    if (PlayerId != 0) hash ^= PlayerId.GetHashCode();
    if (RoutingKey.Length != 0) hash ^= RoutingKey.GetHashCode();
    if (_unknownFields != null) {
      hash ^= _unknownFields.GetHashCode();
    }
    return hash;
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public override string ToString() {
    return pb::JsonFormatter.ToDiagnosticString(this);
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public void WriteTo(pb::CodedOutputStream output) {
  #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
    output.WriteRawMessage(this);
  #else
    if (ExchangeName.Length != 0) {
      output.WriteRawTag(10);
      output.WriteString(ExchangeName);
    }
    if (QueueName.Length != 0) {
      output.WriteRawTag(18);
      output.WriteString(QueueName);
    }
    if (PlayerId != 0) {
      output.WriteRawTag(24);
      output.WriteInt32(PlayerId);
    }
    if (RoutingKey.Length != 0) {
      output.WriteRawTag(34);
      output.WriteString(RoutingKey);
    }
    if (_unknownFields != null) {
      _unknownFields.WriteTo(output);
    }
  #endif
  }

  #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  void pb::IBufferMessage.InternalWriteTo(ref pb::WriteContext output) {
    if (ExchangeName.Length != 0) {
      output.WriteRawTag(10);
      output.WriteString(ExchangeName);
    }
    if (QueueName.Length != 0) {
      output.WriteRawTag(18);
      output.WriteString(QueueName);
    }
    if (PlayerId != 0) {
      output.WriteRawTag(24);
      output.WriteInt32(PlayerId);
    }
    if (RoutingKey.Length != 0) {
      output.WriteRawTag(34);
      output.WriteString(RoutingKey);
    }
    if (_unknownFields != null) {
      _unknownFields.WriteTo(ref output);
    }
  }
  #endif

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public int CalculateSize() {
    int size = 0;
    if (ExchangeName.Length != 0) {
      size += 1 + pb::CodedOutputStream.ComputeStringSize(ExchangeName);
    }
    if (QueueName.Length != 0) {
      size += 1 + pb::CodedOutputStream.ComputeStringSize(QueueName);
    }
    if (PlayerId != 0) {
      size += 1 + pb::CodedOutputStream.ComputeInt32Size(PlayerId);
    }
    if (RoutingKey.Length != 0) {
      size += 1 + pb::CodedOutputStream.ComputeStringSize(RoutingKey);
    }
    if (_unknownFields != null) {
      size += _unknownFields.CalculateSize();
    }
    return size;
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public void MergeFrom(CreatePlayerQueueRequest other) {
    if (other == null) {
      return;
    }
    if (other.ExchangeName.Length != 0) {
      ExchangeName = other.ExchangeName;
    }
    if (other.QueueName.Length != 0) {
      QueueName = other.QueueName;
    }
    if (other.PlayerId != 0) {
      PlayerId = other.PlayerId;
    }
    if (other.RoutingKey.Length != 0) {
      RoutingKey = other.RoutingKey;
    }
    _unknownFields = pb::UnknownFieldSet.MergeFrom(_unknownFields, other._unknownFields);
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public void MergeFrom(pb::CodedInputStream input) {
  #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
    input.ReadRawMessage(this);
  #else
    uint tag;
    while ((tag = input.ReadTag()) != 0) {
      switch(tag) {
        default:
          _unknownFields = pb::UnknownFieldSet.MergeFieldFrom(_unknownFields, input);
          break;
        case 10: {
          ExchangeName = input.ReadString();
          break;
        }
        case 18: {
          QueueName = input.ReadString();
          break;
        }
        case 24: {
          PlayerId = input.ReadInt32();
          break;
        }
        case 34: {
          RoutingKey = input.ReadString();
          break;
        }
      }
    }
  #endif
  }

  #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  void pb::IBufferMessage.InternalMergeFrom(ref pb::ParseContext input) {
    uint tag;
    while ((tag = input.ReadTag()) != 0) {
      switch(tag) {
        default:
          _unknownFields = pb::UnknownFieldSet.MergeFieldFrom(_unknownFields, ref input);
          break;
        case 10: {
          ExchangeName = input.ReadString();
          break;
        }
        case 18: {
          QueueName = input.ReadString();
          break;
        }
        case 24: {
          PlayerId = input.ReadInt32();
          break;
        }
        case 34: {
          RoutingKey = input.ReadString();
          break;
        }
      }
    }
  }
  #endif

}

public sealed partial class CreatePlayerQueueResponse : pb::IMessage<CreatePlayerQueueResponse>
#if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
    , pb::IBufferMessage
#endif
{
  private static readonly pb::MessageParser<CreatePlayerQueueResponse> _parser = new pb::MessageParser<CreatePlayerQueueResponse>(() => new CreatePlayerQueueResponse());
  private pb::UnknownFieldSet _unknownFields;
  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public static pb::MessageParser<CreatePlayerQueueResponse> Parser { get { return _parser; } }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public static pbr::MessageDescriptor Descriptor {
    get { return global::ManageQueueReflection.Descriptor.MessageTypes[3]; }
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  pbr::MessageDescriptor pb::IMessage.Descriptor {
    get { return Descriptor; }
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public CreatePlayerQueueResponse() {
    OnConstruction();
  }

  partial void OnConstruction();

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public CreatePlayerQueueResponse(CreatePlayerQueueResponse other) : this() {
    exchangeName_ = other.exchangeName_;
    queueName_ = other.queueName_;
    playerId_ = other.playerId_;
    created_ = other.created_;
    errorMessage_ = other.errorMessage_;
    _unknownFields = pb::UnknownFieldSet.Clone(other._unknownFields);
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public CreatePlayerQueueResponse Clone() {
    return new CreatePlayerQueueResponse(this);
  }

  /// <summary>Field number for the "exchangeName" field.</summary>
  public const int ExchangeNameFieldNumber = 1;
  private string exchangeName_ = "";
  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public string ExchangeName {
    get { return exchangeName_; }
    set {
      exchangeName_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
    }
  }

  /// <summary>Field number for the "queueName" field.</summary>
  public const int QueueNameFieldNumber = 2;
  private string queueName_ = "";
  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public string QueueName {
    get { return queueName_; }
    set {
      queueName_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
    }
  }

  /// <summary>Field number for the "playerId" field.</summary>
  public const int PlayerIdFieldNumber = 3;
  private int playerId_;
  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public int PlayerId {
    get { return playerId_; }
    set {
      playerId_ = value;
    }
  }

  /// <summary>Field number for the "created" field.</summary>
  public const int CreatedFieldNumber = 4;
  private bool created_;
  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public bool Created {
    get { return created_; }
    set {
      created_ = value;
    }
  }

  /// <summary>Field number for the "errorMessage" field.</summary>
  public const int ErrorMessageFieldNumber = 5;
  private string errorMessage_ = "";
  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public string ErrorMessage {
    get { return errorMessage_; }
    set {
      errorMessage_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
    }
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public override bool Equals(object other) {
    return Equals(other as CreatePlayerQueueResponse);
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public bool Equals(CreatePlayerQueueResponse other) {
    if (ReferenceEquals(other, null)) {
      return false;
    }
    if (ReferenceEquals(other, this)) {
      return true;
    }
    if (ExchangeName != other.ExchangeName) return false;
    if (QueueName != other.QueueName) return false;
    if (PlayerId != other.PlayerId) return false;
    if (Created != other.Created) return false;
    if (ErrorMessage != other.ErrorMessage) return false;
    return Equals(_unknownFields, other._unknownFields);
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public override int GetHashCode() {
    int hash = 1;
    if (ExchangeName.Length != 0) hash ^= ExchangeName.GetHashCode();
    if (QueueName.Length != 0) hash ^= QueueName.GetHashCode();
    if (PlayerId != 0) hash ^= PlayerId.GetHashCode();
    if (Created != false) hash ^= Created.GetHashCode();
    if (ErrorMessage.Length != 0) hash ^= ErrorMessage.GetHashCode();
    if (_unknownFields != null) {
      hash ^= _unknownFields.GetHashCode();
    }
    return hash;
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public override string ToString() {
    return pb::JsonFormatter.ToDiagnosticString(this);
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public void WriteTo(pb::CodedOutputStream output) {
  #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
    output.WriteRawMessage(this);
  #else
    if (ExchangeName.Length != 0) {
      output.WriteRawTag(10);
      output.WriteString(ExchangeName);
    }
    if (QueueName.Length != 0) {
      output.WriteRawTag(18);
      output.WriteString(QueueName);
    }
    if (PlayerId != 0) {
      output.WriteRawTag(24);
      output.WriteInt32(PlayerId);
    }
    if (Created != false) {
      output.WriteRawTag(32);
      output.WriteBool(Created);
    }
    if (ErrorMessage.Length != 0) {
      output.WriteRawTag(42);
      output.WriteString(ErrorMessage);
    }
    if (_unknownFields != null) {
      _unknownFields.WriteTo(output);
    }
  #endif
  }

  #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  void pb::IBufferMessage.InternalWriteTo(ref pb::WriteContext output) {
    if (ExchangeName.Length != 0) {
      output.WriteRawTag(10);
      output.WriteString(ExchangeName);
    }
    if (QueueName.Length != 0) {
      output.WriteRawTag(18);
      output.WriteString(QueueName);
    }
    if (PlayerId != 0) {
      output.WriteRawTag(24);
      output.WriteInt32(PlayerId);
    }
    if (Created != false) {
      output.WriteRawTag(32);
      output.WriteBool(Created);
    }
    if (ErrorMessage.Length != 0) {
      output.WriteRawTag(42);
      output.WriteString(ErrorMessage);
    }
    if (_unknownFields != null) {
      _unknownFields.WriteTo(ref output);
    }
  }
  #endif

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public int CalculateSize() {
    int size = 0;
    if (ExchangeName.Length != 0) {
      size += 1 + pb::CodedOutputStream.ComputeStringSize(ExchangeName);
    }
    if (QueueName.Length != 0) {
      size += 1 + pb::CodedOutputStream.ComputeStringSize(QueueName);
    }
    if (PlayerId != 0) {
      size += 1 + pb::CodedOutputStream.ComputeInt32Size(PlayerId);
    }
    if (Created != false) {
      size += 1 + 1;
    }
    if (ErrorMessage.Length != 0) {
      size += 1 + pb::CodedOutputStream.ComputeStringSize(ErrorMessage);
    }
    if (_unknownFields != null) {
      size += _unknownFields.CalculateSize();
    }
    return size;
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public void MergeFrom(CreatePlayerQueueResponse other) {
    if (other == null) {
      return;
    }
    if (other.ExchangeName.Length != 0) {
      ExchangeName = other.ExchangeName;
    }
    if (other.QueueName.Length != 0) {
      QueueName = other.QueueName;
    }
    if (other.PlayerId != 0) {
      PlayerId = other.PlayerId;
    }
    if (other.Created != false) {
      Created = other.Created;
    }
    if (other.ErrorMessage.Length != 0) {
      ErrorMessage = other.ErrorMessage;
    }
    _unknownFields = pb::UnknownFieldSet.MergeFrom(_unknownFields, other._unknownFields);
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public void MergeFrom(pb::CodedInputStream input) {
  #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
    input.ReadRawMessage(this);
  #else
    uint tag;
    while ((tag = input.ReadTag()) != 0) {
      switch(tag) {
        default:
          _unknownFields = pb::UnknownFieldSet.MergeFieldFrom(_unknownFields, input);
          break;
        case 10: {
          ExchangeName = input.ReadString();
          break;
        }
        case 18: {
          QueueName = input.ReadString();
          break;
        }
        case 24: {
          PlayerId = input.ReadInt32();
          break;
        }
        case 32: {
          Created = input.ReadBool();
          break;
        }
        case 42: {
          ErrorMessage = input.ReadString();
          break;
        }
      }
    }
  #endif
  }

  #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  void pb::IBufferMessage.InternalMergeFrom(ref pb::ParseContext input) {
    uint tag;
    while ((tag = input.ReadTag()) != 0) {
      switch(tag) {
        default:
          _unknownFields = pb::UnknownFieldSet.MergeFieldFrom(_unknownFields, ref input);
          break;
        case 10: {
          ExchangeName = input.ReadString();
          break;
        }
        case 18: {
          QueueName = input.ReadString();
          break;
        }
        case 24: {
          PlayerId = input.ReadInt32();
          break;
        }
        case 32: {
          Created = input.ReadBool();
          break;
        }
        case 42: {
          ErrorMessage = input.ReadString();
          break;
        }
      }
    }
  }
  #endif

}

#endregion


#endregion Designer generated code
