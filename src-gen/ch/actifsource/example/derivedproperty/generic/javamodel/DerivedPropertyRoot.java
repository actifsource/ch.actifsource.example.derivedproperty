package ch.actifsource.example.derivedproperty.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class DerivedPropertyRoot extends DynamicResource implements IDerivedPropertyRoot {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDerivedPropertyRoot> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDerivedPropertyRoot>() {
    
    @Override
    public IDerivedPropertyRoot create() {
      return new DerivedPropertyRoot();
    }
    
    @Override
    public IDerivedPropertyRoot create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new DerivedPropertyRoot(resourceRepository, resource);
    }
  
  };

  public DerivedPropertyRoot() {
    super(IDerivedPropertyRoot.TYPE_ID);
  }
  
  public DerivedPropertyRoot(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IDerivedPropertyRoot.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.Boolean selectBooleanDerivedAttribute() {
    return _getSingleAttribute(java.lang.Boolean.class, ch.actifsource.example.derivedproperty.generic.GenericPackage.DerivedPropertyRoot_booleanDerivedAttribute);
  }
    
  public void setBooleanDerivedAttribute(java.lang.Boolean booleanDerivedAttribute) {
     _setSingleAttribute(ch.actifsource.example.derivedproperty.generic.GenericPackage.DerivedPropertyRoot_booleanDerivedAttribute, booleanDerivedAttribute);
  }

  @Override
  public java.lang.Integer selectIntegerDerivedAttribute() {
    return _getSingleAttribute(java.lang.Integer.class, ch.actifsource.example.derivedproperty.generic.GenericPackage.DerivedPropertyRoot_integerDerivedAttribute);
  }
    
  public void setIntegerDerivedAttribute(java.lang.Integer integerDerivedAttribute) {
     _setSingleAttribute(ch.actifsource.example.derivedproperty.generic.GenericPackage.DerivedPropertyRoot_integerDerivedAttribute, integerDerivedAttribute);
  }

  @Override
  public java.util.List<java.lang.String> selectMultiDerivedAttribute() {
    return _getListAttribute(java.lang.String.class, ch.actifsource.example.derivedproperty.generic.GenericPackage.DerivedPropertyRoot_multiDerivedAttribute);
  }
    
  public void setMultiDerivedAttribute(java.util.List<java.lang.String> multiDerivedAttribute) {
     _setListAttribute(ch.actifsource.example.derivedproperty.generic.GenericPackage.DerivedPropertyRoot_multiDerivedAttribute, multiDerivedAttribute);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.lang.String selectSingleDerivedAttribute() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.example.derivedproperty.generic.GenericPackage.DerivedPropertyRoot_singleDerivedAttribute);
  }
    
  public void setSingleDerivedAttribute(java.lang.String singleDerivedAttribute) {
     _setSingleAttribute(ch.actifsource.example.derivedproperty.generic.GenericPackage.DerivedPropertyRoot_singleDerivedAttribute, singleDerivedAttribute);
  }

  @Override
  public java.lang.String selectTemplateDerivedAttribute() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.example.derivedproperty.generic.GenericPackage.DerivedPropertyRoot_templateDerivedAttribute);
  }
    
  public void setTemplateDerivedAttribute(java.lang.String templateDerivedAttribute) {
     _setSingleAttribute(ch.actifsource.example.derivedproperty.generic.GenericPackage.DerivedPropertyRoot_templateDerivedAttribute, templateDerivedAttribute);
  }

  @Override
  public java.lang.String selectTextDerivedAttribute() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.example.derivedproperty.generic.GenericPackage.DerivedPropertyRoot_textDerivedAttribute);
  }
    
  public void setTextDerivedAttribute(java.lang.String textDerivedAttribute) {
     _setSingleAttribute(ch.actifsource.example.derivedproperty.generic.GenericPackage.DerivedPropertyRoot_textDerivedAttribute, textDerivedAttribute);
  }

  // relations
  
  @Override
  public java.util.List<? extends ch.actifsource.example.derivedproperty.generic.javamodel.IDerivedObject> selectMultiDerivedRelation() {
    return _getList(ch.actifsource.example.derivedproperty.generic.javamodel.IDerivedObject.class, ch.actifsource.example.derivedproperty.generic.GenericPackage.DerivedPropertyRoot_multiDerivedRelation);
  }

  public DerivedPropertyRoot setMultiDerivedRelation(java.util.List<? extends ch.actifsource.example.derivedproperty.generic.javamodel.IDerivedObject> multiDerivedRelation) {
    _setList(ch.actifsource.example.derivedproperty.generic.GenericPackage.DerivedPropertyRoot_multiDerivedRelation, multiDerivedRelation);
    return this;
  }
    
  @Override
  public ch.actifsource.example.derivedproperty.generic.javamodel.IDerivedObject selectSingleDerivedRelation() {
    return _getSingle(ch.actifsource.example.derivedproperty.generic.javamodel.IDerivedObject.class, ch.actifsource.example.derivedproperty.generic.GenericPackage.DerivedPropertyRoot_singleDerivedRelation);
  }

  public DerivedPropertyRoot setSingleDerivedRelation(ch.actifsource.example.derivedproperty.generic.javamodel.IDerivedObject singleDerivedRelation) {
    _setSingle(ch.actifsource.example.derivedproperty.generic.GenericPackage.DerivedPropertyRoot_singleDerivedRelation, singleDerivedRelation);
    return this;
  }
    
  @Override
  public java.util.List<? extends ch.actifsource.example.derivedproperty.generic.javamodel.IDerivedObject> selectTargetObject() {
    return _getList(ch.actifsource.example.derivedproperty.generic.javamodel.IDerivedObject.class, ch.actifsource.example.derivedproperty.generic.GenericPackage.DerivedPropertyRoot_targetObject);
  }

  public DerivedPropertyRoot setTargetObject(java.util.List<? extends ch.actifsource.example.derivedproperty.generic.javamodel.IDerivedObject> targetObject) {
    _setList(ch.actifsource.example.derivedproperty.generic.GenericPackage.DerivedPropertyRoot_targetObject, targetObject);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public DerivedPropertyRoot setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Boolean.class, ch.actifsource.example.derivedproperty.generic.GenericPackage.DerivedPropertyRoot_booleanDerivedAttribute, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, ch.actifsource.example.derivedproperty.generic.GenericPackage.DerivedPropertyRoot_integerDerivedAttribute, visitor);
    _acceptListAttribute(java.lang.String.class, ch.actifsource.example.derivedproperty.generic.GenericPackage.DerivedPropertyRoot_multiDerivedAttribute, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.example.derivedproperty.generic.GenericPackage.DerivedPropertyRoot_singleDerivedAttribute, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.example.derivedproperty.generic.GenericPackage.DerivedPropertyRoot_templateDerivedAttribute, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.example.derivedproperty.generic.GenericPackage.DerivedPropertyRoot_textDerivedAttribute, visitor);
    // relations
    _acceptList(ch.actifsource.example.derivedproperty.generic.javamodel.IDerivedObject.class, ch.actifsource.example.derivedproperty.generic.GenericPackage.DerivedPropertyRoot_multiDerivedRelation, visitor);
    _acceptSingle(ch.actifsource.example.derivedproperty.generic.javamodel.IDerivedObject.class, ch.actifsource.example.derivedproperty.generic.GenericPackage.DerivedPropertyRoot_singleDerivedRelation, visitor);
    _acceptList(ch.actifsource.example.derivedproperty.generic.javamodel.IDerivedObject.class, ch.actifsource.example.derivedproperty.generic.GenericPackage.DerivedPropertyRoot_targetObject, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<ch.actifsource.example.derivedproperty.generic.javamodel.IDerivedPropertyRoot> selectToMeMultiDerivedRelation(ch.actifsource.example.derivedproperty.generic.javamodel.IDerivedObject object) {
    return _getToMeList(object.getRepository(), ch.actifsource.example.derivedproperty.generic.javamodel.IDerivedPropertyRoot.class, ch.actifsource.example.derivedproperty.generic.GenericPackage.DerivedPropertyRoot_multiDerivedRelation, object.getResource());
  }
  
  public static java.util.List<ch.actifsource.example.derivedproperty.generic.javamodel.IDerivedPropertyRoot> selectToMeSingleDerivedRelation(ch.actifsource.example.derivedproperty.generic.javamodel.IDerivedObject object) {
    return _getToMeList(object.getRepository(), ch.actifsource.example.derivedproperty.generic.javamodel.IDerivedPropertyRoot.class, ch.actifsource.example.derivedproperty.generic.GenericPackage.DerivedPropertyRoot_singleDerivedRelation, object.getResource());
  }
  
  public static ch.actifsource.example.derivedproperty.generic.javamodel.IDerivedPropertyRoot selectToMeTargetObject(ch.actifsource.example.derivedproperty.generic.javamodel.IDerivedObject object) {
    return _getToMeSingle(object.getRepository(), ch.actifsource.example.derivedproperty.generic.javamodel.IDerivedPropertyRoot.class, ch.actifsource.example.derivedproperty.generic.GenericPackage.DerivedPropertyRoot_targetObject, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,3638a5fc-becc-11eb-a569-918f3c9a692e,7HYVPa9XJiKNZ54GMn+KKIiU0e8=] */
