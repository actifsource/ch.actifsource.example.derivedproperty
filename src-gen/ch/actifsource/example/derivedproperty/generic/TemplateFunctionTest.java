package ch.actifsource.example.derivedproperty.generic;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[3a9c3cab-bece-11eb-a569-918f3c9a692e,imports]] */

/* End Protected Region   [[3a9c3cab-bece-11eb-a569-918f3c9a692e,imports]] */

public class TemplateFunctionTest {

  /* Begin Protected Region [[3a9c3cab-bece-11eb-a569-918f3c9a692e]] */
  
  /* End Protected Region   [[3a9c3cab-bece-11eb-a569-918f3c9a692e]] */


  public static interface IDerivedPropertyRootFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("4520f3f0-bece-11eb-a569-918f3c9a692e")
    public java.lang.String derivedAttributeValueTest();

    @IDynamicResourceExtension.MethodId("fc6d48f8-7d0d-11ec-add8-e3a868e74a53")
    public java.lang.String derivedAttributeTargetText();

  }
  
  public static interface IDerivedPropertyRootFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DerivedPropertyRootFunctionsImpl implements IDerivedPropertyRootFunctionsImpl {

    public static final IDerivedPropertyRootFunctionsImpl INSTANCE = new DerivedPropertyRootFunctionsImpl();

    private DerivedPropertyRootFunctionsImpl() {}

  }
  
  public static class DerivedPropertyRootFunctions {

    private DerivedPropertyRootFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,3a9c3cab-bece-11eb-a569-918f3c9a692e,0VlOuJgSqPtQlzhyuGQeN2AqXqk=] */
