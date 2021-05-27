package ch.actifsource.example.derivedproperty.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IDerivedPropertyRoot extends ch.actifsource.core.javamodel.INamedResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("3638a5fc-becc-11eb-a569-918f3c9a692e");
  
  public java.util.List<java.lang.String> selectMultiDerivedAttribute();
  
  public java.lang.String selectSingleDerivedAttribute();
  
  public java.lang.Boolean selectBooleanDerivedAttribute();
  
  public java.lang.Integer selectIntegerDerivedAttribute();
  
  public java.lang.String selectTextDerivedAttribute();
  
  public java.lang.String selectTemplateDerivedAttribute();
  
  // relations
  
  public java.util.List<? extends ch.actifsource.example.derivedproperty.generic.javamodel.IDerivedObject> selectMultiDerivedRelation();
  
  public ch.actifsource.example.derivedproperty.generic.javamodel.IDerivedObject selectSingleDerivedRelation();
  
  public java.util.List<? extends ch.actifsource.example.derivedproperty.generic.javamodel.IDerivedObject> selectTargetObject();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,3638a5fc-becc-11eb-a569-918f3c9a692e,Sr2PpV8NHfzJXdS6vrGHpUR0m8o=] */
