package ch.actifsource.example.derivedproperty.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class DerivedObject extends DynamicResource implements IDerivedObject {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDerivedObject> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDerivedObject>() {
    
    @Override
    public IDerivedObject create() {
      return new DerivedObject();
    }
    
    @Override
    public IDerivedObject create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new DerivedObject(resourceRepository, resource);
    }
  
  };

  public DerivedObject() {
    super(IDerivedObject.TYPE_ID);
  }
  
  public DerivedObject(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IDerivedObject.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.Boolean selectBoolean() {
    return _getSingleAttribute(java.lang.Boolean.class, ch.actifsource.example.derivedproperty.generic.GenericPackage.DerivedObject_boolean);
  }
    
  public void setBoolean(java.lang.Boolean boolean_) {
     _setSingleAttribute(ch.actifsource.example.derivedproperty.generic.GenericPackage.DerivedObject_boolean, boolean_);
  }

  @Override
  public java.lang.Integer selectInteger() {
    return _getSingleAttribute(java.lang.Integer.class, ch.actifsource.example.derivedproperty.generic.GenericPackage.DerivedObject_integer);
  }
    
  public void setInteger(java.lang.Integer integer) {
     _setSingleAttribute(ch.actifsource.example.derivedproperty.generic.GenericPackage.DerivedObject_integer, integer);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.lang.String selectText() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.example.derivedproperty.generic.GenericPackage.DerivedObject_text);
  }
    
  public void setText(java.lang.String text) {
     _setSingleAttribute(ch.actifsource.example.derivedproperty.generic.GenericPackage.DerivedObject_text, text);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public DerivedObject setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Boolean.class, ch.actifsource.example.derivedproperty.generic.GenericPackage.DerivedObject_boolean, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, ch.actifsource.example.derivedproperty.generic.GenericPackage.DerivedObject_integer, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.example.derivedproperty.generic.GenericPackage.DerivedObject_text, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,19bfd472-becc-11eb-a569-918f3c9a692e,bl4dpwlosrB9tqPMJJ18VpNN6Lk=] */
