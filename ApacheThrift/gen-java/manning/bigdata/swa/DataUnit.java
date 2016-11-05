/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package manning.bigdata.swa;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
public class DataUnit extends org.apache.thrift.TUnion<DataUnit, DataUnit._Fields> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("DataUnit");
  private static final org.apache.thrift.protocol.TField PERSON_PROPERTY_FIELD_DESC = new org.apache.thrift.protocol.TField("person_property", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField PAGE_PROPERTY_FIELD_DESC = new org.apache.thrift.protocol.TField("page_property", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField EQUIV_FIELD_DESC = new org.apache.thrift.protocol.TField("equiv", org.apache.thrift.protocol.TType.STRUCT, (short)3);
  private static final org.apache.thrift.protocol.TField PAGE_VIEW_FIELD_DESC = new org.apache.thrift.protocol.TField("page_view", org.apache.thrift.protocol.TType.STRUCT, (short)4);

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PERSON_PROPERTY((short)1, "person_property"),
    PAGE_PROPERTY((short)2, "page_property"),
    EQUIV((short)3, "equiv"),
    PAGE_VIEW((short)4, "page_view");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // PERSON_PROPERTY
          return PERSON_PROPERTY;
        case 2: // PAGE_PROPERTY
          return PAGE_PROPERTY;
        case 3: // EQUIV
          return EQUIV;
        case 4: // PAGE_VIEW
          return PAGE_VIEW;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PERSON_PROPERTY, new org.apache.thrift.meta_data.FieldMetaData("person_property", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, PersonProperty.class)));
    tmpMap.put(_Fields.PAGE_PROPERTY, new org.apache.thrift.meta_data.FieldMetaData("page_property", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, PageProperty.class)));
    tmpMap.put(_Fields.EQUIV, new org.apache.thrift.meta_data.FieldMetaData("equiv", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, EquivEdge.class)));
    tmpMap.put(_Fields.PAGE_VIEW, new org.apache.thrift.meta_data.FieldMetaData("page_view", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, PageViewEdge.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(DataUnit.class, metaDataMap);
  }

  public DataUnit() {
    super();
  }

  public DataUnit(_Fields setField, Object value) {
    super(setField, value);
  }

  public DataUnit(DataUnit other) {
    super(other);
  }
  public DataUnit deepCopy() {
    return new DataUnit(this);
  }

  public static DataUnit person_property(PersonProperty value) {
    DataUnit x = new DataUnit();
    x.setPerson_property(value);
    return x;
  }

  public static DataUnit page_property(PageProperty value) {
    DataUnit x = new DataUnit();
    x.setPage_property(value);
    return x;
  }

  public static DataUnit equiv(EquivEdge value) {
    DataUnit x = new DataUnit();
    x.setEquiv(value);
    return x;
  }

  public static DataUnit page_view(PageViewEdge value) {
    DataUnit x = new DataUnit();
    x.setPage_view(value);
    return x;
  }


  @Override
  protected void checkType(_Fields setField, Object value) throws ClassCastException {
    switch (setField) {
      case PERSON_PROPERTY:
        if (value instanceof PersonProperty) {
          break;
        }
        throw new ClassCastException("Was expecting value of type PersonProperty for field 'person_property', but got " + value.getClass().getSimpleName());
      case PAGE_PROPERTY:
        if (value instanceof PageProperty) {
          break;
        }
        throw new ClassCastException("Was expecting value of type PageProperty for field 'page_property', but got " + value.getClass().getSimpleName());
      case EQUIV:
        if (value instanceof EquivEdge) {
          break;
        }
        throw new ClassCastException("Was expecting value of type EquivEdge for field 'equiv', but got " + value.getClass().getSimpleName());
      case PAGE_VIEW:
        if (value instanceof PageViewEdge) {
          break;
        }
        throw new ClassCastException("Was expecting value of type PageViewEdge for field 'page_view', but got " + value.getClass().getSimpleName());
      default:
        throw new IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected Object standardSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TField field) throws org.apache.thrift.TException {
    _Fields setField = _Fields.findByThriftId(field.id);
    if (setField != null) {
      switch (setField) {
        case PERSON_PROPERTY:
          if (field.type == PERSON_PROPERTY_FIELD_DESC.type) {
            PersonProperty person_property;
            person_property = new PersonProperty();
            person_property.read(iprot);
            return person_property;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case PAGE_PROPERTY:
          if (field.type == PAGE_PROPERTY_FIELD_DESC.type) {
            PageProperty page_property;
            page_property = new PageProperty();
            page_property.read(iprot);
            return page_property;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case EQUIV:
          if (field.type == EQUIV_FIELD_DESC.type) {
            EquivEdge equiv;
            equiv = new EquivEdge();
            equiv.read(iprot);
            return equiv;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case PAGE_VIEW:
          if (field.type == PAGE_VIEW_FIELD_DESC.type) {
            PageViewEdge page_view;
            page_view = new PageViewEdge();
            page_view.read(iprot);
            return page_view;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        default:
          throw new IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
      }
    } else {
      org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
      return null;
    }
  }

  @Override
  protected void standardSchemeWriteValue(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    switch (setField_) {
      case PERSON_PROPERTY:
        PersonProperty person_property = (PersonProperty)value_;
        person_property.write(oprot);
        return;
      case PAGE_PROPERTY:
        PageProperty page_property = (PageProperty)value_;
        page_property.write(oprot);
        return;
      case EQUIV:
        EquivEdge equiv = (EquivEdge)value_;
        equiv.write(oprot);
        return;
      case PAGE_VIEW:
        PageViewEdge page_view = (PageViewEdge)value_;
        page_view.write(oprot);
        return;
      default:
        throw new IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected Object tupleSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, short fieldID) throws org.apache.thrift.TException {
    _Fields setField = _Fields.findByThriftId(fieldID);
    if (setField != null) {
      switch (setField) {
        case PERSON_PROPERTY:
          PersonProperty person_property;
          person_property = new PersonProperty();
          person_property.read(iprot);
          return person_property;
        case PAGE_PROPERTY:
          PageProperty page_property;
          page_property = new PageProperty();
          page_property.read(iprot);
          return page_property;
        case EQUIV:
          EquivEdge equiv;
          equiv = new EquivEdge();
          equiv.read(iprot);
          return equiv;
        case PAGE_VIEW:
          PageViewEdge page_view;
          page_view = new PageViewEdge();
          page_view.read(iprot);
          return page_view;
        default:
          throw new IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
      }
    } else {
      throw new TProtocolException("Couldn't find a field with field id " + fieldID);
    }
  }

  @Override
  protected void tupleSchemeWriteValue(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    switch (setField_) {
      case PERSON_PROPERTY:
        PersonProperty person_property = (PersonProperty)value_;
        person_property.write(oprot);
        return;
      case PAGE_PROPERTY:
        PageProperty page_property = (PageProperty)value_;
        page_property.write(oprot);
        return;
      case EQUIV:
        EquivEdge equiv = (EquivEdge)value_;
        equiv.write(oprot);
        return;
      case PAGE_VIEW:
        PageViewEdge page_view = (PageViewEdge)value_;
        page_view.write(oprot);
        return;
      default:
        throw new IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected org.apache.thrift.protocol.TField getFieldDesc(_Fields setField) {
    switch (setField) {
      case PERSON_PROPERTY:
        return PERSON_PROPERTY_FIELD_DESC;
      case PAGE_PROPERTY:
        return PAGE_PROPERTY_FIELD_DESC;
      case EQUIV:
        return EQUIV_FIELD_DESC;
      case PAGE_VIEW:
        return PAGE_VIEW_FIELD_DESC;
      default:
        throw new IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected org.apache.thrift.protocol.TStruct getStructDesc() {
    return STRUCT_DESC;
  }

  @Override
  protected _Fields enumForId(short id) {
    return _Fields.findByThriftIdOrThrow(id);
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }


  public PersonProperty getPerson_property() {
    if (getSetField() == _Fields.PERSON_PROPERTY) {
      return (PersonProperty)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'person_property' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setPerson_property(PersonProperty value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.PERSON_PROPERTY;
    value_ = value;
  }

  public PageProperty getPage_property() {
    if (getSetField() == _Fields.PAGE_PROPERTY) {
      return (PageProperty)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'page_property' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setPage_property(PageProperty value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.PAGE_PROPERTY;
    value_ = value;
  }

  public EquivEdge getEquiv() {
    if (getSetField() == _Fields.EQUIV) {
      return (EquivEdge)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'equiv' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setEquiv(EquivEdge value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.EQUIV;
    value_ = value;
  }

  public PageViewEdge getPage_view() {
    if (getSetField() == _Fields.PAGE_VIEW) {
      return (PageViewEdge)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'page_view' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setPage_view(PageViewEdge value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.PAGE_VIEW;
    value_ = value;
  }

  public boolean isSetPerson_property() {
    return setField_ == _Fields.PERSON_PROPERTY;
  }


  public boolean isSetPage_property() {
    return setField_ == _Fields.PAGE_PROPERTY;
  }


  public boolean isSetEquiv() {
    return setField_ == _Fields.EQUIV;
  }


  public boolean isSetPage_view() {
    return setField_ == _Fields.PAGE_VIEW;
  }


  public boolean equals(Object other) {
    if (other instanceof DataUnit) {
      return equals((DataUnit)other);
    } else {
      return false;
    }
  }

  public boolean equals(DataUnit other) {
    return other != null && getSetField() == other.getSetField() && getFieldValue().equals(other.getFieldValue());
  }

  @Override
  public int compareTo(DataUnit other) {
    int lastComparison = org.apache.thrift.TBaseHelper.compareTo(getSetField(), other.getSetField());
    if (lastComparison == 0) {
      return org.apache.thrift.TBaseHelper.compareTo(getFieldValue(), other.getFieldValue());
    }
    return lastComparison;
  }


  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();
    list.add(this.getClass().getName());
    org.apache.thrift.TFieldIdEnum setField = getSetField();
    if (setField != null) {
      list.add(setField.getThriftFieldId());
      Object value = getFieldValue();
      if (value instanceof org.apache.thrift.TEnum) {
        list.add(((org.apache.thrift.TEnum)getFieldValue()).getValue());
      } else {
        list.add(value);
      }
    }
    return list.hashCode();
  }
  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }


  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }


}
