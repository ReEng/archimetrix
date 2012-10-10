/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.expressions.impl;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.storydriven.modeling.SDMPackage;
import org.storydriven.modeling.activities.ActivitiesPackage;
import org.storydriven.modeling.activities.impl.ActivitiesPackageImpl;
import org.storydriven.modeling.calls.CallsPackage;
import org.storydriven.modeling.calls.impl.CallsPackageImpl;
import org.storydriven.modeling.expressions.ArithmeticExpression;
import org.storydriven.modeling.expressions.ArithmeticOperator;
import org.storydriven.modeling.expressions.BinaryExpression;
import org.storydriven.modeling.expressions.BinaryLogicExpression;
import org.storydriven.modeling.expressions.ComparingOperator;
import org.storydriven.modeling.expressions.ComparisonExpression;
import org.storydriven.modeling.expressions.Expression;
import org.storydriven.modeling.expressions.ExpressionsFactory;
import org.storydriven.modeling.expressions.ExpressionsPackage;
import org.storydriven.modeling.expressions.LiteralExpression;
import org.storydriven.modeling.expressions.LogicOperator;
import org.storydriven.modeling.expressions.NotExpression;
import org.storydriven.modeling.expressions.TextualExpression;
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
   private EClass expressionEClass = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   private EClass textualExpressionEClass = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   private EClass literalExpressionEClass = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   private EClass notExpressionEClass = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   private EClass binaryExpressionEClass = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   private EClass comparisonExpressionEClass = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   private EClass arithmeticExpressionEClass = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   private EClass binaryLogicExpressionEClass = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   private EEnum logicOperatorEEnum = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   private EEnum comparingOperatorEEnum = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   private EEnum arithmeticOperatorEEnum = null;

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
    * @see org.storydriven.modeling.expressions.ExpressionsPackage#eNS_URI
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
      CallsPackageImpl theCallsPackage = (CallsPackageImpl) (EPackage.Registry.INSTANCE
         .getEPackage(CallsPackage.eNS_URI) instanceof CallsPackageImpl ? EPackage.Registry.INSTANCE
         .getEPackage(CallsPackage.eNS_URI) : CallsPackage.eINSTANCE);
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
      theExpressionsPackage.createPackageContents();
      theSDMPackage.createPackageContents();
      theActivitiesPackage.createPackageContents();
      theExpressionsPackage_1.createPackageContents();
      theCallsPackage.createPackageContents();
      theExpressionsPackage_2.createPackageContents();
      thePatternsPackage.createPackageContents();
      theExpressionsPackage_3.createPackageContents();
      theTemplatesPackage.createPackageContents();

      // Initialize created meta-data
      theExpressionsPackage.initializePackageContents();
      theSDMPackage.initializePackageContents();
      theActivitiesPackage.initializePackageContents();
      theExpressionsPackage_1.initializePackageContents();
      theCallsPackage.initializePackageContents();
      theExpressionsPackage_2.initializePackageContents();
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
   public EClass getExpression ()
   {
      return expressionEClass;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EClass getTextualExpression ()
   {
      return textualExpressionEClass;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getTextualExpression_ExpressionText ()
   {
      return (EAttribute) textualExpressionEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getTextualExpression_Language ()
   {
      return (EAttribute) textualExpressionEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getTextualExpression_LanguageVersion ()
   {
      return (EAttribute) textualExpressionEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EClass getLiteralExpression ()
   {
      return literalExpressionEClass;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getLiteralExpression_Value ()
   {
      return (EAttribute) literalExpressionEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getLiteralExpression_ValueType ()
   {
      return (EReference) literalExpressionEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EClass getNotExpression ()
   {
      return notExpressionEClass;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getNotExpression_NegatedExpression ()
   {
      return (EReference) notExpressionEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EClass getBinaryExpression ()
   {
      return binaryExpressionEClass;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getBinaryExpression_LeftExpression ()
   {
      return (EReference) binaryExpressionEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getBinaryExpression_RightExpression ()
   {
      return (EReference) binaryExpressionEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EClass getComparisonExpression ()
   {
      return comparisonExpressionEClass;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getComparisonExpression_Operator ()
   {
      return (EAttribute) comparisonExpressionEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EClass getArithmeticExpression ()
   {
      return arithmeticExpressionEClass;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getArithmeticExpression_Operator ()
   {
      return (EAttribute) arithmeticExpressionEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EClass getBinaryLogicExpression ()
   {
      return binaryLogicExpressionEClass;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getBinaryLogicExpression_Operator ()
   {
      return (EAttribute) binaryLogicExpressionEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EEnum getLogicOperator ()
   {
      return logicOperatorEEnum;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EEnum getComparingOperator ()
   {
      return comparingOperatorEEnum;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EEnum getArithmeticOperator ()
   {
      return arithmeticOperatorEEnum;
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
      textualExpressionEClass = createEClass(TEXTUAL_EXPRESSION);
      createEAttribute(textualExpressionEClass, TEXTUAL_EXPRESSION__EXPRESSION_TEXT);
      createEAttribute(textualExpressionEClass, TEXTUAL_EXPRESSION__LANGUAGE);
      createEAttribute(textualExpressionEClass, TEXTUAL_EXPRESSION__LANGUAGE_VERSION);

      literalExpressionEClass = createEClass(LITERAL_EXPRESSION);
      createEAttribute(literalExpressionEClass, LITERAL_EXPRESSION__VALUE);
      createEReference(literalExpressionEClass, LITERAL_EXPRESSION__VALUE_TYPE);

      notExpressionEClass = createEClass(NOT_EXPRESSION);
      createEReference(notExpressionEClass, NOT_EXPRESSION__NEGATED_EXPRESSION);

      binaryExpressionEClass = createEClass(BINARY_EXPRESSION);
      createEReference(binaryExpressionEClass, BINARY_EXPRESSION__LEFT_EXPRESSION);
      createEReference(binaryExpressionEClass, BINARY_EXPRESSION__RIGHT_EXPRESSION);

      comparisonExpressionEClass = createEClass(COMPARISON_EXPRESSION);
      createEAttribute(comparisonExpressionEClass, COMPARISON_EXPRESSION__OPERATOR);

      arithmeticExpressionEClass = createEClass(ARITHMETIC_EXPRESSION);
      createEAttribute(arithmeticExpressionEClass, ARITHMETIC_EXPRESSION__OPERATOR);

      binaryLogicExpressionEClass = createEClass(BINARY_LOGIC_EXPRESSION);
      createEAttribute(binaryLogicExpressionEClass, BINARY_LOGIC_EXPRESSION__OPERATOR);

      expressionEClass = createEClass(EXPRESSION);

      // Create enums
      logicOperatorEEnum = createEEnum(LOGIC_OPERATOR);
      comparingOperatorEEnum = createEEnum(COMPARING_OPERATOR);
      arithmeticOperatorEEnum = createEEnum(ARITHMETIC_OPERATOR);
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
      EcorePackage theEcorePackage = (EcorePackage) EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
      SDMPackage theSDMPackage = (SDMPackage) EPackage.Registry.INSTANCE.getEPackage(SDMPackage.eNS_URI);

      // Create type parameters

      // Set bounds for type parameters

      // Add supertypes to classes
      textualExpressionEClass.getESuperTypes().add(this.getExpression());
      literalExpressionEClass.getESuperTypes().add(this.getExpression());
      notExpressionEClass.getESuperTypes().add(this.getExpression());
      binaryExpressionEClass.getESuperTypes().add(this.getExpression());
      comparisonExpressionEClass.getESuperTypes().add(this.getBinaryExpression());
      arithmeticExpressionEClass.getESuperTypes().add(this.getBinaryExpression());
      binaryLogicExpressionEClass.getESuperTypes().add(this.getBinaryExpression());
      expressionEClass.getESuperTypes().add(theSDMPackage.getTypedElement());
      expressionEClass.getESuperTypes().add(theSDMPackage.getCommentableElement());

      // Initialize classes, features, and operations; add parameters
      initEClass(textualExpressionEClass, TextualExpression.class, "TextualExpression", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getTextualExpression_ExpressionText(), ecorePackage.getEString(), "expressionText", null, 1, 1,
         TextualExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
         !IS_DERIVED, !IS_ORDERED);
      initEAttribute(getTextualExpression_Language(), ecorePackage.getEString(), "language", null, 1, 1,
         TextualExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
         !IS_DERIVED, !IS_ORDERED);
      initEAttribute(getTextualExpression_LanguageVersion(), ecorePackage.getEString(), "languageVersion", null, 0, 1,
         TextualExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
         !IS_DERIVED, !IS_ORDERED);

      initEClass(literalExpressionEClass, LiteralExpression.class, "LiteralExpression", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getLiteralExpression_Value(), ecorePackage.getEString(), "value", null, 0, 1,
         LiteralExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
         !IS_DERIVED, !IS_ORDERED);
      initEReference(getLiteralExpression_ValueType(), theEcorePackage.getEDataType(), null, "valueType", null, 1, 1,
         LiteralExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(notExpressionEClass, NotExpression.class, "NotExpression", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEReference(getNotExpression_NegatedExpression(), this.getExpression(), null, "negatedExpression", null, 1, 1,
         NotExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(binaryExpressionEClass, BinaryExpression.class, "BinaryExpression", IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEReference(getBinaryExpression_LeftExpression(), this.getExpression(), null, "leftExpression", null, 1, 1,
         BinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getBinaryExpression_RightExpression(), this.getExpression(), null, "rightExpression", null, 1, 1,
         BinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(comparisonExpressionEClass, ComparisonExpression.class, "ComparisonExpression", !IS_ABSTRACT,
         !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getComparisonExpression_Operator(), this.getComparingOperator(), "operator", null, 1, 1,
         ComparisonExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
         !IS_DERIVED, !IS_ORDERED);

      initEClass(arithmeticExpressionEClass, ArithmeticExpression.class, "ArithmeticExpression", !IS_ABSTRACT,
         !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getArithmeticExpression_Operator(), this.getArithmeticOperator(), "operator", null, 1, 1,
         ArithmeticExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
         !IS_DERIVED, !IS_ORDERED);

      initEClass(binaryLogicExpressionEClass, BinaryLogicExpression.class, "BinaryLogicExpression", !IS_ABSTRACT,
         !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getBinaryLogicExpression_Operator(), this.getLogicOperator(), "operator", null, 1, 1,
         BinaryLogicExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
         !IS_DERIVED, !IS_ORDERED);

      initEClass(expressionEClass, Expression.class, "Expression", IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);

      // Initialize enums and add enum literals
      initEEnum(logicOperatorEEnum, LogicOperator.class, "LogicOperator");
      addEEnumLiteral(logicOperatorEEnum, LogicOperator.AND);
      addEEnumLiteral(logicOperatorEEnum, LogicOperator.OR);
      addEEnumLiteral(logicOperatorEEnum, LogicOperator.XOR);
      addEEnumLiteral(logicOperatorEEnum, LogicOperator.IMPLY);
      addEEnumLiteral(logicOperatorEEnum, LogicOperator.EQUIVALENT);

      initEEnum(comparingOperatorEEnum, ComparingOperator.class, "ComparingOperator");
      addEEnumLiteral(comparingOperatorEEnum, ComparingOperator.LESS);
      addEEnumLiteral(comparingOperatorEEnum, ComparingOperator.LESS_OR_EQUAL);
      addEEnumLiteral(comparingOperatorEEnum, ComparingOperator.EQUAL);
      addEEnumLiteral(comparingOperatorEEnum, ComparingOperator.GREATER_OR_EQUAL);
      addEEnumLiteral(comparingOperatorEEnum, ComparingOperator.GREATER);
      addEEnumLiteral(comparingOperatorEEnum, ComparingOperator.UNEQUAL);
      addEEnumLiteral(comparingOperatorEEnum, ComparingOperator.REGULAR_EXPRESSION);

      initEEnum(arithmeticOperatorEEnum, ArithmeticOperator.class, "ArithmeticOperator");
      addEEnumLiteral(arithmeticOperatorEEnum, ArithmeticOperator.PLUS);
      addEEnumLiteral(arithmeticOperatorEEnum, ArithmeticOperator.MINUS);
      addEEnumLiteral(arithmeticOperatorEEnum, ArithmeticOperator.TIMES);
      addEEnumLiteral(arithmeticOperatorEEnum, ArithmeticOperator.DIVIDE);
      addEEnumLiteral(arithmeticOperatorEEnum, ArithmeticOperator.MODULO);
      addEEnumLiteral(arithmeticOperatorEEnum, ArithmeticOperator.EXP);

      // Create annotations
      // http://www.eclipse.org/emf/2002/GenModel
      createGenModelAnnotations();
      // subsets
      createSubsetsAnnotations();
   }

   /**
    * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   protected void createGenModelAnnotations ()
   {
      String source = "http://www.eclipse.org/emf/2002/GenModel";
      addAnnotation(this, source, new String[] {"documentation",
            "The base package for all expressions which can be used for modeling activities\r\nand patterns."});
      addAnnotation(
         logicOperatorEEnum,
         source,
         new String[] {
               "documentation",
               "Defines the operators for binary logic expressions. The unary logic expression representing negated expressions is reflected by the NotExpression."});
      addAnnotation(comparingOperatorEEnum, source, new String[] {"documentation",
            "Defines the operators for comparing expressions."});
      addAnnotation(comparingOperatorEEnum.getELiterals().get(6), source, new String[] {"documentation",
            "For comparison of a String with a regular expression."});
      addAnnotation(arithmeticOperatorEEnum, source, new String[] {"documentation",
            "Defines the operators for arithmetic expressions."});
      addAnnotation(arithmeticOperatorEEnum.getELiterals().get(5), source, new String[] {"documentation",
            "For formulas like a^b."});
      addAnnotation(textualExpressionEClass, source, new String[] {"documentation",
            "Represents any expression in a textual language embedded into Story Diagrams, e.g. OCL or Java ."});
      addAnnotation(getTextualExpression_ExpressionText(), source, new String[] {"documentation",
            "Holds the expression, e.g. in OCL or Java."});
      addAnnotation(getTextualExpression_Language(), source, new String[] {"documentation",
            "String representation of the used language which has to be unique. Examples are OCL and Java."});
      addAnnotation(
         getTextualExpression_LanguageVersion(),
         source,
         new String[] {
               "documentation",
               "String representation of the used language\'s version. The format is <Major>.<Minor>[.<Revision>[.<Build>]]\r\nExamples: 1.4 or 3.0.1 or 1.0.2.20101208."});
      addAnnotation(
         literalExpressionEClass,
         source,
         new String[] {
               "documentation",
               "Represents any literal, i.e. a value whose type is an EDataType. Literals are, for example, 5, 3.14, \'c\', \"text\", true."});
      addAnnotation(getLiteralExpression_Value(), source, new String[] {"documentation",
            "String representation of the value, e.g. \"5\", \"3.14\", \"c\", \"text\", or \"true\"."});
      addAnnotation(getLiteralExpression_ValueType(), source, new String[] {"documentation",
            "The literal\'s type, e.g. EInt, EString, etc."});
      addAnnotation(notExpressionEClass, source, new String[] {"documentation",
            "Represents a negated expression, e.g. NOT (a < 5)."});
      addAnnotation(getNotExpression_NegatedExpression(), source, new String[] {"documentation",
            "Represents the operand of a NotExpression, e.g. a < 5 in NOT (a < 5)."});
      addAnnotation(binaryExpressionEClass, source, new String[] {"documentation",
            "Represents any binary expression like v < 5 or x + 7."});
      addAnnotation(getBinaryExpression_LeftExpression(), source, new String[] {"documentation",
            "Represents the first operand of a binary expression, e.g. x in the expression x < 5."});
      addAnnotation(getBinaryExpression_RightExpression(), source, new String[] {"documentation",
            "Represents the second operand of a binary expression, e.g. 5 in the expression x < 5."});
      addAnnotation(comparisonExpressionEClass, source, new String[] {"documentation",
            "Represents comparing expressions like a < 5 or a >= 7."});
      addAnnotation(getComparisonExpression_Operator(), source, new String[] {"documentation",
            "Specifies the expression\'s comparing operator, e.g. <, >=, !=."});
      addAnnotation(arithmeticExpressionEClass, source, new String[] {"documentation",
            "Represents arithmetic expressions like a + 5 or a * 7."});
      addAnnotation(getArithmeticExpression_Operator(), source, new String[] {"documentation",
            "Specifies the expression\'s arithmetic operator, e.g. +, -, *, /, or MODULO."});
      addAnnotation(binaryLogicExpressionEClass, source, new String[] {"documentation",
            "Represents binary, logic expressions like a AND b and a OR b."});
      addAnnotation(getBinaryLogicExpression_Operator(), source, new String[] {"documentation",
            "Specifies the expression\'s logic operator, e.g. AND, OR, or XOR."});
      addAnnotation(
         expressionEClass,
         source,
         new String[] {
               "documentation",
               "Represents any expression in an embedded textual language, e.g. OCL or Java. An expression\'s type is dynamically derived by an external mechanism (see TypedElement)."});
   }

   /**
    * Initializes the annotations for <b>subsets</b>.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected void createSubsetsAnnotations ()
   {
      String source = "subsets";
      addAnnotation(getLiteralExpression_ValueType(), source, new String[] {},
         new URI[] {URI.createURI(SDMPackage.eNS_URI).appendFragment("//TypedElement/type")});
   }

} // ExpressionsPackageImpl
