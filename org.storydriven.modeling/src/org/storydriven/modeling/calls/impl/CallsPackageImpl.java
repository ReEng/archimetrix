/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.calls.impl;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.storydriven.modeling.SDMPackage;
import org.storydriven.modeling.activities.ActivitiesPackage;
import org.storydriven.modeling.activities.expressions.ExpressionsPackage;
import org.storydriven.modeling.activities.expressions.impl.ExpressionsPackageImpl;
import org.storydriven.modeling.activities.impl.ActivitiesPackageImpl;
import org.storydriven.modeling.calls.Callable;
import org.storydriven.modeling.calls.CallsFactory;
import org.storydriven.modeling.calls.CallsPackage;
import org.storydriven.modeling.calls.Invocation;
import org.storydriven.modeling.calls.OpaqueCallable;
import org.storydriven.modeling.calls.ParameterBinding;
import org.storydriven.modeling.calls.ParameterExtension;
import org.storydriven.modeling.calls.util.CallsValidator;
import org.storydriven.modeling.impl.SDMPackageImpl;
import org.storydriven.modeling.patterns.PatternsPackage;
import org.storydriven.modeling.patterns.impl.PatternsPackageImpl;
import org.storydriven.modeling.templates.TemplatesPackage;
import org.storydriven.modeling.templates.impl.TemplatesPackageImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 * @generated
 */
public class CallsPackageImpl extends EPackageImpl implements CallsPackage
{
   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   private EClass invocationEClass = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   private EClass parameterBindingEClass = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   private EClass opaqueCallableEClass = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   private EClass parameterExtensionEClass = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   private EClass callableEClass = null;

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
    * @see org.storydriven.modeling.calls.CallsPackage#eNS_URI
    * @see #init()
    * @generated
    */
   private CallsPackageImpl ()
   {
      super(eNS_URI, CallsFactory.eINSTANCE);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   private static boolean isInited = false;

   /**
    * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
    * 
    * <p>This method is used to initialize {@link CallsPackage#eINSTANCE} when that field is accessed.
    * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #eNS_URI
    * @see #createPackageContents()
    * @see #initializePackageContents()
    * @generated
    */
   public static CallsPackage init ()
   {
      if (isInited)
         return (CallsPackage) EPackage.Registry.INSTANCE.getEPackage(CallsPackage.eNS_URI);

      // Obtain or create and register package
      CallsPackageImpl theCallsPackage = (CallsPackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CallsPackageImpl
         ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CallsPackageImpl());

      isInited = true;

      // Initialize simple dependencies
      EcorePackage.eINSTANCE.eClass();

      // Obtain or create and register interdependencies
      SDMPackageImpl theSDMPackage = (SDMPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(SDMPackage.eNS_URI) instanceof SDMPackageImpl
         ? EPackage.Registry.INSTANCE.getEPackage(SDMPackage.eNS_URI) : SDMPackage.eINSTANCE);
      ActivitiesPackageImpl theActivitiesPackage = (ActivitiesPackageImpl) (EPackage.Registry.INSTANCE
         .getEPackage(ActivitiesPackage.eNS_URI) instanceof ActivitiesPackageImpl ? EPackage.Registry.INSTANCE
         .getEPackage(ActivitiesPackage.eNS_URI) : ActivitiesPackage.eINSTANCE);
      ExpressionsPackageImpl theExpressionsPackage = (ExpressionsPackageImpl) (EPackage.Registry.INSTANCE
         .getEPackage(ExpressionsPackage.eNS_URI) instanceof ExpressionsPackageImpl ? EPackage.Registry.INSTANCE
         .getEPackage(ExpressionsPackage.eNS_URI) : ExpressionsPackage.eINSTANCE);
      org.storydriven.modeling.expressions.impl.ExpressionsPackageImpl theExpressionsPackage_1 = (org.storydriven.modeling.expressions.impl.ExpressionsPackageImpl) (EPackage.Registry.INSTANCE
         .getEPackage(org.storydriven.modeling.expressions.ExpressionsPackage.eNS_URI) instanceof org.storydriven.modeling.expressions.impl.ExpressionsPackageImpl
         ? EPackage.Registry.INSTANCE.getEPackage(org.storydriven.modeling.expressions.ExpressionsPackage.eNS_URI)
         : org.storydriven.modeling.expressions.ExpressionsPackage.eINSTANCE);
      org.storydriven.modeling.calls.expressions.impl.ExpressionsPackageImpl theExpressionsPackage_2 = (org.storydriven.modeling.calls.expressions.impl.ExpressionsPackageImpl) (EPackage.Registry.INSTANCE
         .getEPackage(org.storydriven.modeling.calls.expressions.ExpressionsPackage.eNS_URI) instanceof org.storydriven.modeling.calls.expressions.impl.ExpressionsPackageImpl
         ? EPackage.Registry.INSTANCE
            .getEPackage(org.storydriven.modeling.calls.expressions.ExpressionsPackage.eNS_URI)
         : org.storydriven.modeling.calls.expressions.ExpressionsPackage.eINSTANCE);
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
      theCallsPackage.createPackageContents();
      theSDMPackage.createPackageContents();
      theActivitiesPackage.createPackageContents();
      theExpressionsPackage.createPackageContents();
      theExpressionsPackage_1.createPackageContents();
      theExpressionsPackage_2.createPackageContents();
      thePatternsPackage.createPackageContents();
      theExpressionsPackage_3.createPackageContents();
      theTemplatesPackage.createPackageContents();

      // Initialize created meta-data
      theCallsPackage.initializePackageContents();
      theSDMPackage.initializePackageContents();
      theActivitiesPackage.initializePackageContents();
      theExpressionsPackage.initializePackageContents();
      theExpressionsPackage_1.initializePackageContents();
      theExpressionsPackage_2.initializePackageContents();
      thePatternsPackage.initializePackageContents();
      theExpressionsPackage_3.initializePackageContents();
      theTemplatesPackage.initializePackageContents();

      // Register package validator
      EValidator.Registry.INSTANCE.put(theCallsPackage, new EValidator.Descriptor()
      {
         public EValidator getEValidator ()
         {
            return CallsValidator.INSTANCE;
         }
      });

      // Mark meta-data to indicate it can't be changed
      theCallsPackage.freeze();

      // Update the registry and return the package
      EPackage.Registry.INSTANCE.put(CallsPackage.eNS_URI, theCallsPackage);
      return theCallsPackage;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EClass getInvocation ()
   {
      return invocationEClass;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getInvocation_OwnedParameterBindings ()
   {
      return (EReference) invocationEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getInvocation_Callee ()
   {
      return (EReference) invocationEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EClass getParameterBinding ()
   {
      return parameterBindingEClass;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getParameterBinding_ValueExpression ()
   {
      return (EReference) parameterBindingEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getParameterBinding_Parameter ()
   {
      return (EReference) parameterBindingEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getParameterBinding_Invocation ()
   {
      return (EReference) parameterBindingEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EClass getOpaqueCallable ()
   {
      return opaqueCallableEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getOpaqueCallable_Name ()
   {
      return (EAttribute) opaqueCallableEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getOpaqueCallable_CallExpression ()
   {
      return (EReference) opaqueCallableEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EOperation getOpaqueCallable__NumberOfOutParams__DiagnosticChain_Map ()
   {
      return opaqueCallableEClass.getEOperations().get(0);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EClass getParameterExtension ()
   {
      return parameterExtensionEClass;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getParameterExtension_Parameter ()
   {
      return (EReference) parameterExtensionEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EClass getCallable ()
   {
      return callableEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getCallable_InParameter ()
   {
      return (EReference) callableEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getCallable_OutParameter ()
   {
      return (EReference) callableEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getCallable_ContainedParameters ()
   {
      return (EReference) callableEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public CallsFactory getCallsFactory ()
   {
      return (CallsFactory) getEFactoryInstance();
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
      invocationEClass = createEClass(INVOCATION);
      createEReference(invocationEClass, INVOCATION__OWNED_PARAMETER_BINDINGS);
      createEReference(invocationEClass, INVOCATION__CALLEE);

      parameterBindingEClass = createEClass(PARAMETER_BINDING);
      createEReference(parameterBindingEClass, PARAMETER_BINDING__VALUE_EXPRESSION);
      createEReference(parameterBindingEClass, PARAMETER_BINDING__PARAMETER);
      createEReference(parameterBindingEClass, PARAMETER_BINDING__INVOCATION);

      opaqueCallableEClass = createEClass(OPAQUE_CALLABLE);
      createEAttribute(opaqueCallableEClass, OPAQUE_CALLABLE__NAME);
      createEReference(opaqueCallableEClass, OPAQUE_CALLABLE__CALL_EXPRESSION);
      createEOperation(opaqueCallableEClass, OPAQUE_CALLABLE___NUMBER_OF_OUT_PARAMS__DIAGNOSTICCHAIN_MAP);

      parameterExtensionEClass = createEClass(PARAMETER_EXTENSION);
      createEReference(parameterExtensionEClass, PARAMETER_EXTENSION__PARAMETER);

      callableEClass = createEClass(CALLABLE);
      createEReference(callableEClass, CALLABLE__IN_PARAMETER);
      createEReference(callableEClass, CALLABLE__OUT_PARAMETER);
      createEReference(callableEClass, CALLABLE__CONTAINED_PARAMETERS);
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
      org.storydriven.modeling.calls.expressions.ExpressionsPackage theExpressionsPackage_2 = (org.storydriven.modeling.calls.expressions.ExpressionsPackage) EPackage.Registry.INSTANCE
         .getEPackage(org.storydriven.modeling.calls.expressions.ExpressionsPackage.eNS_URI);
      SDMPackage theSDMPackage = (SDMPackage) EPackage.Registry.INSTANCE.getEPackage(SDMPackage.eNS_URI);
      org.storydriven.modeling.expressions.ExpressionsPackage theExpressionsPackage_1 = (org.storydriven.modeling.expressions.ExpressionsPackage) EPackage.Registry.INSTANCE
         .getEPackage(org.storydriven.modeling.expressions.ExpressionsPackage.eNS_URI);
      EcorePackage theEcorePackage = (EcorePackage) EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

      // Add subpackages
      getESubpackages().add(theExpressionsPackage_2);

      // Create type parameters

      // Set bounds for type parameters

      // Add supertypes to classes
      invocationEClass.getESuperTypes().add(theSDMPackage.getCommentableElement());
      parameterBindingEClass.getESuperTypes().add(theSDMPackage.getCommentableElement());
      opaqueCallableEClass.getESuperTypes().add(this.getCallable());
      parameterExtensionEClass.getESuperTypes().add(theSDMPackage.getVariable());
      parameterExtensionEClass.getESuperTypes().add(theSDMPackage.getExtension());
      callableEClass.getESuperTypes().add(theSDMPackage.getCommentableElement());

      // Initialize classes, features, and operations; add parameters
      initEClass(invocationEClass, Invocation.class, "Invocation", IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEReference(getInvocation_OwnedParameterBindings(), this.getParameterBinding(),
         this.getParameterBinding_Invocation(), "ownedParameterBindings", null, 0, -1, Invocation.class, !IS_TRANSIENT,
         !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
         IS_ORDERED);
      initEReference(getInvocation_Callee(), this.getCallable(), null, "callee", null, 0, 1, Invocation.class,
         !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
         !IS_DERIVED, !IS_ORDERED);

      initEClass(parameterBindingEClass, ParameterBinding.class, "ParameterBinding", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEReference(getParameterBinding_ValueExpression(), theExpressionsPackage_1.getExpression(), null,
         "valueExpression", null, 1, 1, ParameterBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
         IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getParameterBinding_Parameter(), theEcorePackage.getEParameter(), null, "parameter", null, 0, 1,
         ParameterBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getParameterBinding_Invocation(), this.getInvocation(),
         this.getInvocation_OwnedParameterBindings(), "invocation", null, 1, 1, ParameterBinding.class, !IS_TRANSIENT,
         !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
         !IS_ORDERED);

      initEClass(opaqueCallableEClass, OpaqueCallable.class, "OpaqueCallable", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getOpaqueCallable_Name(), ecorePackage.getEString(), "name", null, 1, 1, OpaqueCallable.class,
         !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getOpaqueCallable_CallExpression(), theExpressionsPackage_2.getMethodCallExpression(),
         theExpressionsPackage_2.getMethodCallExpression_OpaqueCallable(), "callExpression", null, 1, 1,
         OpaqueCallable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      EOperation op = initEOperation(getOpaqueCallable__NumberOfOutParams__DiagnosticChain_Map(),
         ecorePackage.getEBoolean(), "NumberOfOutParams", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
      EGenericType g1 = createEGenericType(ecorePackage.getEMap());
      EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(parameterExtensionEClass, ParameterExtension.class, "ParameterExtension", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEReference(getParameterExtension_Parameter(), theEcorePackage.getEParameter(), null, "parameter", null, 0, 1,
         ParameterExtension.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
         IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

      initEClass(callableEClass, Callable.class, "Callable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getCallable_InParameter(), theEcorePackage.getEParameter(), null, "inParameter", null, 0, -1,
         Callable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
         IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getCallable_OutParameter(), theEcorePackage.getEParameter(), null, "outParameter", null, 0, -1,
         Callable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
         IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getCallable_ContainedParameters(), theEcorePackage.getEParameter(), null, "containedParameters",
         null, 0, -1, Callable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      // Create annotations
      // http://www.eclipse.org/emf/2002/GenModel
      createGenModelAnnotations();
      // duplicates
      createDuplicatesAnnotations();
      // http://www.eclipse.org/uml2/1.1.0/GenModel
      createGenModel_1Annotations();
      // redefines
      createRedefinesAnnotations();
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
         this,
         source,
         new String[] {"documentation",
               "This package contains all classes for modeling calls to activities and EOperations\r\nfrom within an activity."});
      addAnnotation(
         invocationEClass,
         source,
         new String[] {
               "documentation",
               "Superclass for invocations of behavior which is specified elsewhere, e.g. in methods (MethodCallExpression) or activities (ActivityCallNode). An invocation has one parameter binding for each parameter (in or out) of the called method/activity. For Callables which are contained in the model (i.e. Activities and OperationExtensions) the Invocation directly points to the callee. OpaqueCallables are directly referenced by (and contained in) the MethodCallExpressions."});
      addAnnotation(
         parameterBindingEClass,
         source,
         new String[] {
               "documentation",
               "Binds a parameter to a certain value for a given invocation. The value of the parameter is represented by an expression."});
      addAnnotation(
         opaqueCallableEClass,
         source,
         new String[] {
               "documentation",
               "An OpaqueCallable represents an external method which is not explicitly modeled (e.g. a method in an external library). Because it is not contained anywhere in the model it is directly referenced by and contained in the MethodCallExpression."});
      addAnnotation(getOpaqueCallable__NumberOfOutParams__DiagnosticChain_Map(), source, new String[] {"documentation",
            "self.oclAsType(Callable).out->size() <= 1"});
      addAnnotation((getOpaqueCallable__NumberOfOutParams__DiagnosticChain_Map()).getEParameters().get(0), source,
         new String[] {"documentation", "The chain of diagnostics to which problems are to be appended."});
      addAnnotation((getOpaqueCallable__NumberOfOutParams__DiagnosticChain_Map()).getEParameters().get(1), source,
         new String[] {"documentation", "The cache of context-specific information."});
      addAnnotation(parameterExtensionEClass, source, new String[] {"documentation",
            "Represents an EParameter and adds functionality to it, especially beiing subtype of Variable."});
      addAnnotation(
         callableEClass,
         source,
         new String[] {
               "documentation",
               "An entity which can be called by an Invocation. A Callable can have a number of (ordered) parameters which are either in or out parameters. In the case of activities, the number of in and out parameters is unbounded, whereas OperationExtensions and OpaqueCallables can only have one out parameter (This is enforced by an OCL constraint)."});
      addAnnotation(
         getCallable_InParameter(),
         source,
         new String[] {
               "documentation",
               "The ordered set of in parameters of this Callable. The parameters will not be contained in this reference, if parameters have to be contained in the callable, they also have to be added to the containedParameters reference."});
      addAnnotation(
         getCallable_OutParameter(),
         source,
         new String[] {
               "documentation",
               "The ordered set of out parameters of this Callable. The parameters will not be contained in this reference, if parameters have to be contained in the callable, they also have to be added to the containedParameters reference."});
      addAnnotation(
         getCallable_ContainedParameters(),
         source,
         new String[] {
               "documentation",
               "This reference is used to contain the parameters of a Callable if they are not already contained in another container. If the parameter is contained in another container as it is the case for parameters of a EOperation, they must not be added to this container!"});
   }

   /**
    * Initializes the annotations for <b>http://www.eclipse.org/uml2/1.1.0/GenModel</b>.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   protected void createGenModel_1Annotations ()
   {
      String source = "http://www.eclipse.org/uml2/1.1.0/GenModel";
      addAnnotation(getOpaqueCallable__NumberOfOutParams__DiagnosticChain_Map(), source, new String[] {"body",
            "self.oclAsType(Callable).out->size() <= 1"});
   }

   /**
    * Initializes the annotations for <b>redefines</b>.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   protected void createRedefinesAnnotations ()
   {
      String source = "redefines";
      addAnnotation(getParameterExtension_Parameter(), source, new String[] {},
         new URI[] {URI.createURI(SDMPackage.eNS_URI).appendFragment("//Extension/modelBase")});
   }

   /**
    * Initializes the annotations for <b>duplicates</b>.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected void createDuplicatesAnnotations ()
   {
      String source = "duplicates";
      addAnnotation(opaqueCallableEClass, source, new String[] {});
   }

} // CallsPackageImpl
