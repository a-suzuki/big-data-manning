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
public partial class PersonPropertyValue : TBase
{
  private string _full_name;
  private GenderType _gender;
  private Location _location;

  public string Full_name
  {
    get
    {
      return _full_name;
    }
    set
    {
      __isset.full_name = true;
      this._full_name = value;
    }
  }

  /// <summary>
  /// 
  /// <seealso cref="GenderType"/>
  /// </summary>
  public GenderType Gender
  {
    get
    {
      return _gender;
    }
    set
    {
      __isset.gender = true;
      this._gender = value;
    }
  }

  public Location Location
  {
    get
    {
      return _location;
    }
    set
    {
      __isset.location = true;
      this._location = value;
    }
  }


  public Isset __isset;
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public struct Isset {
    public bool full_name;
    public bool gender;
    public bool location;
  }

  public PersonPropertyValue() {
  }

  public void Read (TProtocol iprot)
  {
    iprot.IncrementRecursionDepth();
    try
    {
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
            if (field.Type == TType.String) {
              Full_name = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.I32) {
              Gender = (GenderType)iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 3:
            if (field.Type == TType.Struct) {
              Location = new Location();
              Location.Read(iprot);
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
      TStruct struc = new TStruct("PersonPropertyValue");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (Full_name != null && __isset.full_name) {
        field.Name = "full_name";
        field.Type = TType.String;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(Full_name);
        oprot.WriteFieldEnd();
      }
      if (__isset.gender) {
        field.Name = "gender";
        field.Type = TType.I32;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32((int)Gender);
        oprot.WriteFieldEnd();
      }
      if (Location != null && __isset.location) {
        field.Name = "location";
        field.Type = TType.Struct;
        field.ID = 3;
        oprot.WriteFieldBegin(field);
        Location.Write(oprot);
        oprot.WriteFieldEnd();
      }
      oprot.WriteFieldStop();
      oprot.WriteStructEnd();
    }
    finally
    {
      oprot.DecrementRecursionDepth();
    }
  }

  public override string ToString() {
    StringBuilder __sb = new StringBuilder("PersonPropertyValue(");
    bool __first = true;
    if (Full_name != null && __isset.full_name) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Full_name: ");
      __sb.Append(Full_name);
    }
    if (__isset.gender) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Gender: ");
      __sb.Append(Gender);
    }
    if (Location != null && __isset.location) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Location: ");
      __sb.Append(Location== null ? "<null>" : Location.ToString());
    }
    __sb.Append(")");
    return __sb.ToString();
  }

}
