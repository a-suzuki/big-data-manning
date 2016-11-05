#
# Autogenerated by Thrift Compiler (0.9.3)
#
# DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
#

require 'thrift'

module GenderType
  MALE = 1
  FEMALE = 2
  VALUE_MAP = {1 => "MALE", 2 => "FEMALE"}
  VALID_VALUES = Set.new([MALE, FEMALE]).freeze
end

class PersonID < ::Thrift::Union
  include ::Thrift::Struct_Union
  class << self
    def cookie(val)
      PersonID.new(:cookie, val)
    end

    def user_id(val)
      PersonID.new(:user_id, val)
    end
  end

  COOKIE = 1
  USER_ID = 2

  FIELDS = {
    COOKIE => {:type => ::Thrift::Types::STRING, :name => 'cookie'},
    USER_ID => {:type => ::Thrift::Types::I64, :name => 'user_id'}
  }

  def struct_fields; FIELDS; end

  def validate
    raise(StandardError, 'Union fields are not set.') if get_set_field.nil? || get_value.nil?
  end

  ::Thrift::Union.generate_accessors self
end

class PageID < ::Thrift::Union
  include ::Thrift::Struct_Union
  class << self
    def url(val)
      PageID.new(:url, val)
    end
  end

  URL = 1

  FIELDS = {
    URL => {:type => ::Thrift::Types::STRING, :name => 'url'}
  }

  def struct_fields; FIELDS; end

  def validate
    raise(StandardError, 'Union fields are not set.') if get_set_field.nil? || get_value.nil?
  end

  ::Thrift::Union.generate_accessors self
end

class Location
  include ::Thrift::Struct, ::Thrift::Struct_Union
  CITY = 1
  STATE = 2
  COUNTRY = 3

  FIELDS = {
    CITY => {:type => ::Thrift::Types::STRING, :name => 'city', :optional => true},
    STATE => {:type => ::Thrift::Types::STRING, :name => 'state', :optional => true},
    COUNTRY => {:type => ::Thrift::Types::STRING, :name => 'country', :optional => true}
  }

  def struct_fields; FIELDS; end

  def validate
  end

  ::Thrift::Struct.generate_accessors self
end

class PersonPropertyValue < ::Thrift::Union
  include ::Thrift::Struct_Union
  class << self
    def full_name(val)
      PersonPropertyValue.new(:full_name, val)
    end

    def gender(val)
      PersonPropertyValue.new(:gender, val)
    end

    def location(val)
      PersonPropertyValue.new(:location, val)
    end
  end

  FULL_NAME = 1
  GENDER = 2
  LOCATION = 3

  FIELDS = {
    FULL_NAME => {:type => ::Thrift::Types::STRING, :name => 'full_name'},
    GENDER => {:type => ::Thrift::Types::I32, :name => 'gender', :enum_class => ::GenderType},
    LOCATION => {:type => ::Thrift::Types::STRUCT, :name => 'location', :class => ::Location}
  }

  def struct_fields; FIELDS; end

  def validate
    raise(StandardError, 'Union fields are not set.') if get_set_field.nil? || get_value.nil?
    if get_set_field == :gender
      raise ::Thrift::ProtocolException.new(::Thrift::ProtocolException::UNKNOWN, 'Invalid value of field gender!') unless ::GenderType::VALID_VALUES.include?(get_value)
    end
  end

  ::Thrift::Union.generate_accessors self
end

class PersonProperty
  include ::Thrift::Struct, ::Thrift::Struct_Union
  ID = 1
  PROPERTY = 2

  FIELDS = {
    ID => {:type => ::Thrift::Types::STRUCT, :name => 'id', :class => ::PersonID},
    PROPERTY => {:type => ::Thrift::Types::STRUCT, :name => 'property', :class => ::PersonPropertyValue}
  }

  def struct_fields; FIELDS; end

  def validate
    raise ::Thrift::ProtocolException.new(::Thrift::ProtocolException::UNKNOWN, 'Required field id is unset!') unless @id
    raise ::Thrift::ProtocolException.new(::Thrift::ProtocolException::UNKNOWN, 'Required field property is unset!') unless @property
  end

  ::Thrift::Struct.generate_accessors self
end

class PagePropertyValue < ::Thrift::Union
  include ::Thrift::Struct_Union
  class << self
    def page_views(val)
      PagePropertyValue.new(:page_views, val)
    end
  end

  PAGE_VIEWS = 1

  FIELDS = {
    PAGE_VIEWS => {:type => ::Thrift::Types::I32, :name => 'page_views'}
  }

  def struct_fields; FIELDS; end

  def validate
    raise(StandardError, 'Union fields are not set.') if get_set_field.nil? || get_value.nil?
  end

  ::Thrift::Union.generate_accessors self
end

class PageProperty
  include ::Thrift::Struct, ::Thrift::Struct_Union
  ID = 1
  PROPERTY = 2

  FIELDS = {
    ID => {:type => ::Thrift::Types::STRUCT, :name => 'id', :class => ::PageID},
    PROPERTY => {:type => ::Thrift::Types::STRUCT, :name => 'property', :class => ::PagePropertyValue}
  }

  def struct_fields; FIELDS; end

  def validate
    raise ::Thrift::ProtocolException.new(::Thrift::ProtocolException::UNKNOWN, 'Required field id is unset!') unless @id
    raise ::Thrift::ProtocolException.new(::Thrift::ProtocolException::UNKNOWN, 'Required field property is unset!') unless @property
  end

  ::Thrift::Struct.generate_accessors self
end

class EquivEdge
  include ::Thrift::Struct, ::Thrift::Struct_Union
  ID1 = 1
  ID2 = 2

  FIELDS = {
    ID1 => {:type => ::Thrift::Types::STRUCT, :name => 'id1', :class => ::PersonID},
    ID2 => {:type => ::Thrift::Types::STRUCT, :name => 'id2', :class => ::PersonID}
  }

  def struct_fields; FIELDS; end

  def validate
    raise ::Thrift::ProtocolException.new(::Thrift::ProtocolException::UNKNOWN, 'Required field id1 is unset!') unless @id1
    raise ::Thrift::ProtocolException.new(::Thrift::ProtocolException::UNKNOWN, 'Required field id2 is unset!') unless @id2
  end

  ::Thrift::Struct.generate_accessors self
end

class PageViewEdge
  include ::Thrift::Struct, ::Thrift::Struct_Union
  PERSON = 1
  PAGE = 2
  NONCE = 3

  FIELDS = {
    PERSON => {:type => ::Thrift::Types::STRUCT, :name => 'person', :class => ::PersonID},
    PAGE => {:type => ::Thrift::Types::STRUCT, :name => 'page', :class => ::PageID},
    NONCE => {:type => ::Thrift::Types::I64, :name => 'nonce'}
  }

  def struct_fields; FIELDS; end

  def validate
    raise ::Thrift::ProtocolException.new(::Thrift::ProtocolException::UNKNOWN, 'Required field person is unset!') unless @person
    raise ::Thrift::ProtocolException.new(::Thrift::ProtocolException::UNKNOWN, 'Required field page is unset!') unless @page
    raise ::Thrift::ProtocolException.new(::Thrift::ProtocolException::UNKNOWN, 'Required field nonce is unset!') unless @nonce
  end

  ::Thrift::Struct.generate_accessors self
end

class DataUnit < ::Thrift::Union
  include ::Thrift::Struct_Union
  class << self
    def person_property(val)
      DataUnit.new(:person_property, val)
    end

    def page_property(val)
      DataUnit.new(:page_property, val)
    end

    def equiv(val)
      DataUnit.new(:equiv, val)
    end

    def page_view(val)
      DataUnit.new(:page_view, val)
    end
  end

  PERSON_PROPERTY = 1
  PAGE_PROPERTY = 2
  EQUIV = 3
  PAGE_VIEW = 4

  FIELDS = {
    PERSON_PROPERTY => {:type => ::Thrift::Types::STRUCT, :name => 'person_property', :class => ::PersonProperty},
    PAGE_PROPERTY => {:type => ::Thrift::Types::STRUCT, :name => 'page_property', :class => ::PageProperty},
    EQUIV => {:type => ::Thrift::Types::STRUCT, :name => 'equiv', :class => ::EquivEdge},
    PAGE_VIEW => {:type => ::Thrift::Types::STRUCT, :name => 'page_view', :class => ::PageViewEdge}
  }

  def struct_fields; FIELDS; end

  def validate
    raise(StandardError, 'Union fields are not set.') if get_set_field.nil? || get_value.nil?
  end

  ::Thrift::Union.generate_accessors self
end

class Pedigree
  include ::Thrift::Struct, ::Thrift::Struct_Union
  TRUE_AS_OF_SECS = 1

  FIELDS = {
    TRUE_AS_OF_SECS => {:type => ::Thrift::Types::I32, :name => 'true_as_of_secs'}
  }

  def struct_fields; FIELDS; end

  def validate
    raise ::Thrift::ProtocolException.new(::Thrift::ProtocolException::UNKNOWN, 'Required field true_as_of_secs is unset!') unless @true_as_of_secs
  end

  ::Thrift::Struct.generate_accessors self
end

class Data
  include ::Thrift::Struct, ::Thrift::Struct_Union
  PEDIGREE = 1
  DATAUNIT = 2

  FIELDS = {
    PEDIGREE => {:type => ::Thrift::Types::STRUCT, :name => 'pedigree', :class => ::Pedigree},
    DATAUNIT => {:type => ::Thrift::Types::STRUCT, :name => 'dataunit', :class => ::DataUnit}
  }

  def struct_fields; FIELDS; end

  def validate
    raise ::Thrift::ProtocolException.new(::Thrift::ProtocolException::UNKNOWN, 'Required field pedigree is unset!') unless @pedigree
    raise ::Thrift::ProtocolException.new(::Thrift::ProtocolException::UNKNOWN, 'Required field dataunit is unset!') unless @dataunit
  end

  ::Thrift::Struct.generate_accessors self
end

