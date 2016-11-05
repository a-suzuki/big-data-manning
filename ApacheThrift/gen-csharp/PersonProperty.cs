/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
using System;
using System.Collections;
using System.Collections.Generic;
using System.Text;
using System.IO;
using Thrift;
using Thrift.Collections;
using System.Runtime.Serialization;
using Thrift.Protocol;
using Thrift.Transport;


#if !SILVERLIGHT
[Serializable]
#endif
public partial class PersonProperty : TBase
{

  public PersonID Id { get; set; }

  public PersonPropertyValue Property { get; set; }

  public PersonProperty() {
  }

  public PersonProperty(PersonID id, PersonPropertyValue property) : this() {
    this.Id = id;
    this.Property = property;
  }

  public void Read (TProtocol iprot)
  {
    iprot.IncrementRecursionDepth();
    try
    {
      bool isset_id = false;
      bool isset_property = false;
      TField field;
      iprot.ReadStructBegin();
      while (true)
      {
        field = iprot.ReadFieldBegin();
        if (field.Type == TType.Stop) { 
          break;
        }
        switch (field.ID)
        {
          case 1:
            if (field.Type == TType.Struct) {
              Id = new PersonID();
              Id.Read(iprot);
              isset_id = true;
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.Struct) {
              Property = new PersonPropertyValue();
              Property.Read(iprot);
              isset_property = true;
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          default: 
            TProtocolUtil.Skip(iprot, field.Type);
            break;
        }
        iprot.ReadFieldEnd();
      }
      iprot.ReadStructEnd();
      if (!isset_id)
        throw new TProtocolException(TProtocolException.INVALID_DATA);
      if (!isset_property)
        throw new TProtocolException(TProtocolException.INVALID_DATA);
    }
    finally
    {
      iprot.DecrementRecursionDepth();
    }
  }

  public void Write(TProtocol oprot) {
    oprot.IncrementRecursionDepth();
    try
    {
      TStruct struc = new TStruct("PersonProperty");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      field.Name = "id";
      field.Type = TType.Struct;
      field.ID = 1;
      oprot.WriteFieldBegin(field);
      Id.Write(oprot);
      oprot.WriteFieldEnd();
      field.Name = "property";
      field.Type = TType.Struct;
      field.ID = 2;
      oprot.WriteFieldBegin(field);
      Property.Write(oprot);
      oprot.WriteFieldEnd();
      oprot.WriteFieldStop();
      oprot.WriteStructEnd();
    }
    finally
    {
      oprot.DecrementRecursionDepth();
    }
  }

  public override string ToString() {
    StringBuilder __sb = new StringBuilder("PersonProperty(");
    __sb.Append(", Id: ");
    __sb.Append(Id== null ? "<null>" : Id.ToString());
    __sb.Append(", Property: ");
    __sb.Append(Property== null ? "<null>" : Property.ToString());
    __sb.Append(")");
    return __sb.ToString();
  }

}

