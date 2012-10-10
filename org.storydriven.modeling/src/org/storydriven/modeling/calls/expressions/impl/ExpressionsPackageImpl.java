/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.calls.expressions.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.storydriven.modeling.SDMPackage;
import org.storydriven.modeling.activities.ActivitiesPackage;
import org.storydriven.modeling.activities.impl.ActivitiesPackageImpl;
import org.storydriven.modeling.calls.CallsPackage;
import org.storydriven.modeling.calls.expressions.ExpressionsFactory;
import org.storydriven.modeling.calls.expressions.ExpressionsPackage;
import org.storydriven.modeling.calls.expressions.MethodCallExpression;
import org.storydriven.modeling.calls.expressions.ParameterExpression;
import org.storydriven.modeling.calls.impl.CallsPackageImpl;
import org.storydriven.modeling.impl.SDMPackageImpl;
import org.storydriven.modeling.patterns.PatternsPackage;
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
   private EClass methodCallExpressionEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass parameterExpressionEClass = null;

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
    * @see org.storydriven.modeling.calls.expressions.ExpressionsPackage#eNS_URI
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
      PatternsPackageImpl thePatternsPackage = (PatternsPackageImpl) (EPackage.Registry.INSTANCE
         .getEPackage(PatternsPackage.eNS_URI) instanceof PatternsPackageImpl ? EPackage.Registry.INSTANCE
         .getEPackage(PatternsPackage.eNS_URI) : PatternsPackage.eINSTANCE);
      org.storydriven.modeling.patterns.expressions.impl.ExpressionsPackageImpl theExpressionsPackage_3 = (org.storydriven.modeling.patterns.expressions.impl.ExpressionsPackageImpl) (EPackage.Registry.INSTANCE
         .getEPackage(org.storydriven.modeling.patterns.expressions.ExpressionsPackage.eNS_URI) instanceof org.storydriven.modeling.patterns.expressions.impl.ExpressionsPackageImpl
         ? EPackage.Registry.INSTANCE
            .getEPackage(org.storydriven.modeling.patterns.expressions.ExpressionsPackage.eNS_URI)
         : org.storydriven.modeling.patterns.expressions.ExpressionsPackage.eINSTANCE);
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
      thePatternsPackage.createPackageContents();
      theExpressionsPackage_3.createPackageContents();
      theTemplatesPackage.createPackageContents();

      // Initialize created meta-data
      theExpressionsPackage.initializePackageContents();
      theSDMPackage.initializePackageContents();
      theActivitiesPackage.initializePackageContents();
      theExpressionsPackage_1.initializePackageContents();
      theExpressionsPackage_2.initializePackageContents();
      theCallsPackage.initializePackageContents();
      thePatternsPackage.initializePackageContents();
      theExpressionsPackage_3.initializePackageContents();
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
   public EClass getMethodCallExpression ()
   {
      return methodCallExpressionEClass;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getMethodCallExpression_Target ()
   {
      return (EReference) methodCallExpressionEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getMethodCallExpression_OpaqueCallable ()
   {
      return (EReference) methodCallExpressionEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getParameterExpression ()
   {
      return parameterExpressionEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getParameterExpression_Parameter ()
   {
      return (EReference) parameterExpressionEClass.getEStructuralFeatures().get(0);
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
      methodCallExpressionEClass = createEClass(METHOD_CALL_EXPRESSION);
      createEReference(methodCallExpressionEClass, METHOD_CALL_EXPRESSION__TARGET);
      createEReference(methodCallExpressionEClass, METHOD_CALL_EXPRESSION__OPAQUE_CALLABLE);

      parameterExpressionEClass = createEClass(PARAMETER_EXPRESSION);
      createEReference(parameterExpressionEClass, PARAMETER_EXPRESSION__PARAMETER);
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
      CallsPackage theCallsPackage = (CallsPackage) EPackage.Registry.INSTANCE.getEPackage(CallsPackage.eNS_URI);

      // Create type parameters

      // Set bounds for type parameters

      // Add supertypes to classes
      methodCallExpressionEClass.getESuperTypes().add(theExpressionsPackage_2.getExpression());
      methodCallExpressionEClass.getESuperTypes().add(theCallsPackage.getInvocation());
      parameterExpressionEClass.getESuperTypes().add(theExpressionsPackage_2.getExpression());

      // Initialize classes, features, and operations; add parameters
      initEClass(methodCallExpressionEClass, MethodCallExpression.class, "MethodCallExpression", !IS_ABSTRACT,
         !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getMethodCallExpression_Target(), theExpressionsPackage_2.getExpression(), null, "target", null,
         0, 1, MethodCallExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
         IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getMethodCallExpression_OpaqueCallable(), theCallsPackage.getOpaqueCallable(),
         theCallsPackage.getOpaqueCallable_CallExpression(), "opaqueCallable", null, 0, 1, MethodCallExpression.class,
         !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
         !IS_DERIVED, !IS_ORDERED);

      initEClass(parameterExpressionEClass, ParameterExpression.class, "ParameterExpression", !IS_ABSTRACT,
         !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getParameterExpression_Parameter(), theCallsPackage.getParameterExtension(), null, "parameter",
         null, 0, 1, ParameterExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
         IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

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
      addAnnotation(
         methodCallExpressionEClass,
         source,
         new String[] {
               "documentation",
               "A MethodCallEpression represents the direct invocation of a method. This can either be a method which is explicitly modeled as an EOperation in a class diagram (referenced by the OperationExtension) or an unmodeled method in an external library (referenced by an OpaqueCallable). Therefore, a MethodCallExpression references either an OperationExtension (indirectly via the callee role between Invocation and Callable) or an OpaqueCallable."});
      addAnnotation(
         getMethodCallExpression_Target(),
         source,
         new String[] {
               "documentation",
               "A MethodCallExpression references an expression instead of a target object to allow the determination of the call target by an expression. This can be handy when a method should be called e.g. on the return value of another method (as in a.b().c() ). Then the method call of c() would be modeled by a MethodCallExpression with the callExpression a.b(), which again is a MethodCallExpression itself."});
      addAnnotation(
         getMethodCallExpression_OpaqueCallable(),
         source,
         new String[] {
               "documentation",
               "This containment reference is a helper construct because the OpaqueCallable has to be contained somewhere. A MethodCallExpression (being an Invocation) could also reference an OpaqueCallable (being a Callable) via the callee reference but then the OpaqueCallable would not be contained anywhere in the model."});
      addAnnotation(parameterExpressionEClass, source, new String[] {"documentation",
            "An Expressions that represents a parameter value, e.g. the value of an Activity\'s parameter."});
   }

} // ExpressionsPackageImpl
