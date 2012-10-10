/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.patterns.expressions.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.storydriven.modeling.SDMPackage;
import org.storydriven.modeling.activities.ActivitiesPackage;
import org.storydriven.modeling.activities.impl.ActivitiesPackageImpl;
import org.storydriven.modeling.calls.CallsPackage;
import org.storydriven.modeling.calls.impl.CallsPackageImpl;
import org.storydriven.modeling.impl.SDMPackageImpl;
import org.storydriven.modeling.patterns.PatternsPackage;
import org.storydriven.modeling.patterns.expressions.AttributeValueExpression;
import org.storydriven.modeling.patterns.expressions.ExpressionsFactory;
import org.storydriven.modeling.patterns.expressions.ExpressionsPackage;
import org.storydriven.modeling.patterns.expressions.ObjectSetSizeExpression;
import org.storydriven.modeling.patterns.expressions.ObjectVariableExpression;
import org.storydriven.modeling.patterns.expressions.PrimitiveVariableExpression;
import org.storydriven.modeling.patterns.impl.PatternsPackageImpl;
import org.storydriven.modeling.templates.TemplatesPackage;
import org.storydriven.modeling.templates.impl.TemplatesPackageImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 * @generated
 */
public class ExpressionsPackageImpl extends EPackageImpl implements ExpressionsPackage
{
   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   private EClass attributeValueExpressionEClass = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   private EClass objectVariableExpressionEClass = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   private EClass objectSetSizeExpressionEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass primitiveVariableExpressionEClass = null;

   /**
    * Creates an instance of the model <b>Package</b>, registered with
    * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
    * package URI value.
    * <p>Note: the correct way to create the package is via the static
    * factory method {@link #init init()}, which also performs
    * initialization of the package, or returns the registered package,
    * if one already exists.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see org.eclipse.emf.ecore.EPackage.Registry
    * @see org.storydriven.modeling.patterns.expressions.ExpressionsPackage#eNS_URI
    * @see #init()
    * @generated
    */
   private ExpressionsPackageImpl ()
   {
      super(eNS_URI, ExpressionsFactory.eINSTANCE);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   private static boolean isInited = false;

   /**
    * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
    * 
    * <p>This method is used to initialize {@link ExpressionsPackage#eINSTANCE} when that field is accessed.
    * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #eNS_URI
    * @see #createPackageContents()
    * @see #initializePackageContents()
    * @generated
    */
   public static ExpressionsPackage init ()
   {
      if (isInited)
         return (ExpressionsPackage) EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI);

      // Obtain or create and register package
      ExpressionsPackageImpl theExpressionsPackage = (ExpressionsPackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ExpressionsPackageImpl
         ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ExpressionsPackageImpl());

      isInited = true;

      // Initialize simple dependencies
      EcorePackage.eINSTANCE.eClass();

      // Obtain or create and register interdependencies
      SDMPackageImpl theSDMPackage = (SDMPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(SDMPackage.eNS_URI) instanceof SDMPackageImpl
         ? EPackage.Registry.INSTANCE.getEPackage(SDMPackage.eNS_URI) : SDMPackage.eINSTANCE);
      ActivitiesPackageImpl theActivitiesPackage = (ActivitiesPackageImpl) (EPackage.Registry.INSTANCE
         .getEPackage(ActivitiesPackage.eNS_URI) instanceof ActivitiesPackageImpl ? EPackage.Registry.INSTANCE
         .getEPackage(ActivitiesPackage.eNS_URI) : ActivitiesPackage.eINSTANCE);
      org.storydriven.modeling.activities.expressions.impl.ExpressionsPackageImpl theExpressionsPackage_1 = (org.storydriven.modeling.activities.expressions.impl.ExpressionsPackageImpl) (EPackage.Registry.INSTANCE
         .getEPackage(org.storydriven.modeling.activities.expressions.ExpressionsPackage.eNS_URI) instanceof org.storydriven.modeling.activities.expressions.impl.ExpressionsPackageImpl
         ? EPackage.Registry.INSTANCE
            .getEPackage(org.storydriven.modeling.activities.expressions.ExpressionsPackage.eNS_URI)
         : org.storydriven.modeling.activities.expressions.ExpressionsPackage.eINSTANCE);
      org.storydriven.modeling.expressions.impl.ExpressionsPackageImpl theExpressionsPackage_2 = (org.storydriven.modeling.expressions.impl.ExpressionsPackageImpl) (EPackage.Registry.INSTANCE
         .getEPackage(org.storydriven.modeling.expressions.ExpressionsPackage.eNS_URI) instanceof org.storydriven.modeling.expressions.impl.ExpressionsPackageImpl
         ? EPackage.Registry.INSTANCE.getEPackage(org.storydriven.modeling.expressions.ExpressionsPackage.eNS_URI)
         : org.storydriven.modeling.expressions.ExpressionsPackage.eINSTANCE);
      CallsPackageImpl theCallsPackage = (CallsPackageImpl) (EPackage.Registry.INSTANCE
         .getEPackage(CallsPackage.eNS_URI) instanceof CallsPackageImpl ? EPackage.Registry.INSTANCE
         .getEPackage(CallsPackage.eNS_URI) : CallsPackage.eINSTANCE);
      org.storydriven.modeling.calls.expressions.impl.ExpressionsPackageImpl theExpressionsPackage_3 = (org.storydriven.modeling.calls.expressions.impl.ExpressionsPackageImpl) (EPackage.Registry.INSTANCE
         .getEPackage(org.storydriven.modeling.calls.expressions.ExpressionsPackage.eNS_URI) instanceof org.storydriven.modeling.calls.expressions.impl.ExpressionsPackageImpl
         ? EPackage.Registry.INSTANCE
            .getEPackage(org.storydriven.modeling.calls.expressions.ExpressionsPackage.eNS_URI)
         : org.storydriven.modeling.calls.expressions.ExpressionsPackage.eINSTANCE);
      PatternsPackageImpl thePatternsPackage = (PatternsPackageImpl) (EPackage.Registry.INSTANCE
         .getEPackage(PatternsPackage.eNS_URI) instanceof PatternsPackageImpl ? EPackage.Registry.INSTANCE
         .getEPackage(PatternsPackage.eNS_URI) : PatternsPackage.eINSTANCE);
      TemplatesPackageImpl theTemplatesPackage = (TemplatesPackageImpl) (EPackage.Registry.INSTANCE
         .getEPackage(TemplatesPackage.eNS_URI) instanceof TemplatesPackageImpl ? EPackage.Registry.INSTANCE
         .getEPackage(TemplatesPackage.eNS_URI) : TemplatesPackage.eINSTANCE);

      // Create package meta-data objects
      theExpressionsPackage.createPackageContents();
      theSDMPackage.createPackageContents();
      theActivitiesPackage.createPackageContents();
      theExpressionsPackage_1.createPackageContents();
      theExpressionsPackage_2.createPackageContents();
      theCallsPackage.createPackageContents();
      theExpressionsPackage_3.createPackageContents();
      thePatternsPackage.createPackageContents();
      theTemplatesPackage.createPackageContents();

      // Initialize created meta-data
      theExpressionsPackage.initializePackageContents();
      theSDMPackage.initializePackageContents();
      theActivitiesPackage.initializePackageContents();
      theExpressionsPackage_1.initializePackageContents();
      theExpressionsPackage_2.initializePackageContents();
      theCallsPackage.initializePackageContents();
      theExpressionsPackage_3.initializePackageContents();
      thePatternsPackage.initializePackageContents();
      theTemplatesPackage.initializePackageContents();

      // Mark meta-data to indicate it can't be changed
      theExpressionsPackage.freeze();

      // Update the registry and return the package
      EPackage.Registry.INSTANCE.put(ExpressionsPackage.eNS_URI, theExpressionsPackage);
      return theExpressionsPackage;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EClass getAttributeValueExpression ()
   {
      return attributeValueExpressionEClass;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getAttributeValueExpression_Object ()
   {
      return (EReference) attributeValueExpressionEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getAttributeValueExpression_Attribute ()
   {
      return (EReference) attributeValueExpressionEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EClass getObjectVariableExpression ()
   {
      return objectVariableExpressionEClass;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getObjectVariableExpression_Object ()
   {
      return (EReference) objectVariableExpressionEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EClass getObjectSetSizeExpression ()
   {
      return objectSetSizeExpressionEClass;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getObjectSetSizeExpression_Set ()
   {
      return (EReference) objectSetSizeExpressionEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getPrimitiveVariableExpression ()
   {
      return primitiveVariableExpressionEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getPrimitiveVariableExpression_PrimitiveVariable ()
   {
      return (EReference) primitiveVariableExpressionEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public ExpressionsFactory getExpressionsFactory ()
   {
      return (ExpressionsFactory) getEFactoryInstance();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   private boolean isCreated = false;

   /**
    * Creates the meta-model objects for the package.  This method is
    * guarded to have no affect on any invocation but its first.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public void createPackageContents ()
   {
      if (isCreated)
         return;
      isCreated = true;

      // Create classes and their features
      attributeValueExpressionEClass = createEClass(ATTRIBUTE_VALUE_EXPRESSION);
      createEReference(attributeValueExpressionEClass, ATTRIBUTE_VALUE_EXPRESSION__OBJECT);
      createEReference(attributeValueExpressionEClass, ATTRIBUTE_VALUE_EXPRESSION__ATTRIBUTE);

      objectVariableExpressionEClass = createEClass(OBJECT_VARIABLE_EXPRESSION);
      createEReference(objectVariableExpressionEClass, OBJECT_VARIABLE_EXPRESSION__OBJECT);

      objectSetSizeExpressionEClass = createEClass(OBJECT_SET_SIZE_EXPRESSION);
      createEReference(objectSetSizeExpressionEClass, OBJECT_SET_SIZE_EXPRESSION__SET);

      primitiveVariableExpressionEClass = createEClass(PRIMITIVE_VARIABLE_EXPRESSION);
      createEReference(primitiveVariableExpressionEClass, PRIMITIVE_VARIABLE_EXPRESSION__PRIMITIVE_VARIABLE);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   private boolean isInitialized = false;

   /**
    * Complete the initialization of the package and its meta-model.  This
    * method is guarded to have no affect on any invocation but its first.
    * <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * @generated
    */
   public void initializePackageContents ()
   {
      if (isInitialized)
         return;
      isInitialized = true;

      // Initialize package
      setName(eNAME);
      setNsPrefix(eNS_PREFIX);
      setNsURI(eNS_URI);

      // Obtain other dependent packages
      org.storydriven.modeling.expressions.ExpressionsPackage theExpressionsPackage_2 = (org.storydriven.modeling.expressions.ExpressionsPackage) EPackage.Registry.INSTANCE
         .getEPackage(org.storydriven.modeling.expressions.ExpressionsPackage.eNS_URI);
      PatternsPackage thePatternsPackage = (PatternsPackage) EPackage.Registry.INSTANCE
         .getEPackage(PatternsPackage.eNS_URI);
      EcorePackage theEcorePackage = (EcorePackage) EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

      // Create type parameters

      // Set bounds for type parameters

      // Add supertypes to classes
      attributeValueExpressionEClass.getESuperTypes().add(theExpressionsPackage_2.getExpression());
      objectVariableExpressionEClass.getESuperTypes().add(theExpressionsPackage_2.getExpression());
      objectSetSizeExpressionEClass.getESuperTypes().add(theExpressionsPackage_2.getExpression());
      primitiveVariableExpressionEClass.getESuperTypes().add(theExpressionsPackage_2.getExpression());

      // Initialize classes, features, and operations; add parameters
      initEClass(attributeValueExpressionEClass, AttributeValueExpression.class, "AttributeValueExpression",
         !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getAttributeValueExpression_Object(), thePatternsPackage.getObjectVariable(), null, "object",
         null, 1, 1, AttributeValueExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
         IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getAttributeValueExpression_Attribute(), theEcorePackage.getEAttribute(), null, "attribute", null,
         1, 1, AttributeValueExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
         IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(objectVariableExpressionEClass, ObjectVariableExpression.class, "ObjectVariableExpression",
         !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getObjectVariableExpression_Object(), thePatternsPackage.getObjectVariable(), null, "object",
         null, 1, 1, ObjectVariableExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
         IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(objectSetSizeExpressionEClass, ObjectSetSizeExpression.class, "ObjectSetSizeExpression", !IS_ABSTRACT,
         !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getObjectSetSizeExpression_Set(), thePatternsPackage.getObjectSetVariable(), null, "set", null, 1,
         1, ObjectSetSizeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
         IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(primitiveVariableExpressionEClass, PrimitiveVariableExpression.class, "PrimitiveVariableExpression",
         !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getPrimitiveVariableExpression_PrimitiveVariable(), thePatternsPackage.getPrimitiveVariable(),
         null, "primitiveVariable", null, 1, 1, PrimitiveVariableExpression.class, !IS_TRANSIENT, !IS_VOLATILE,
         IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      // Create annotations
      // http://www.eclipse.org/emf/2002/GenModel
      createGenModelAnnotations();
   }

   /**
    * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   protected void createGenModelAnnotations ()
   {
      String source = "http://www.eclipse.org/emf/2002/GenModel";
      addAnnotation(attributeValueExpressionEClass, source, new String[] {"documentation",
            "Represents the value of an object\'s attribute, e.g. obj.attr for an object obj and an attribute attr."});
      addAnnotation(getAttributeValueExpression_Object(), source, new String[] {"documentation",
            "Specifies the object variable whose attribute value is represented by this expression."});
      addAnnotation(getAttributeValueExpression_Attribute(), source, new String[] {"documentation",
            "Specifies the object\'s attribute whose attribute value is represented by this expression."});
      addAnnotation(objectVariableExpressionEClass, source, new String[] {"documentation",
            "Represents the reference to an object in an expression, i.e. the value of an object variable."});
      addAnnotation(getObjectVariableExpression_Object(), source, new String[] {"documentation",
            "Specifies the object variable that holds the reference to be represented by this expression."});
      addAnnotation(
         objectSetSizeExpressionEClass,
         source,
         new String[] {
               "documentation",
               "Represents the number of elements in the set of objects that is represented by an object set variable. For example, if you have an object set variable mySet, then this expression would represent something like mySet.size(). The expression can be used to constrain the pattern application, e.g., to only a apply the pattern when at least two objects can be matched for the set."});
      addAnnotation(getObjectSetSizeExpression_Set(), source, new String[] {"documentation",
            "Specifies the object set variable whose number of set elements is to be represented by this expression."});
      addAnnotation(primitiveVariableExpressionEClass, source, new String[] {"documentation",
            "Represents the value of a primitive variable, e.g., 5 or \"MyName\"."});
   }

} // ExpressionsPackageImpl
