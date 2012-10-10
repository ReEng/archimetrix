/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.patterns.impl;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
import org.storydriven.modeling.calls.CallsPackage;
import org.storydriven.modeling.calls.impl.CallsPackageImpl;
import org.storydriven.modeling.impl.SDMPackageImpl;
import org.storydriven.modeling.patterns.AbstractLinkVariable;
import org.storydriven.modeling.patterns.AbstractVariable;
import org.storydriven.modeling.patterns.AttributeAssignment;
import org.storydriven.modeling.patterns.BindingOperator;
import org.storydriven.modeling.patterns.BindingSemantics;
import org.storydriven.modeling.patterns.BindingState;
import org.storydriven.modeling.patterns.Constraint;
import org.storydriven.modeling.patterns.ContainerVariable;
import org.storydriven.modeling.patterns.ContainmentRelation;
import org.storydriven.modeling.patterns.LinkConstraint;
import org.storydriven.modeling.patterns.LinkConstraintType;
import org.storydriven.modeling.patterns.LinkVariable;
import org.storydriven.modeling.patterns.MatchingPattern;
import org.storydriven.modeling.patterns.ObjectSetVariable;
import org.storydriven.modeling.patterns.ObjectVariable;
import org.storydriven.modeling.patterns.Path;
import org.storydriven.modeling.patterns.PatternsFactory;
import org.storydriven.modeling.patterns.PatternsPackage;
import org.storydriven.modeling.patterns.PrimitiveVariable;
import org.storydriven.modeling.patterns.StoryPattern;
import org.storydriven.modeling.patterns.util.PatternsValidator;
import org.storydriven.modeling.templates.TemplatesPackage;
import org.storydriven.modeling.templates.impl.TemplatesPackageImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 * @generated
 */
public class PatternsPackageImpl extends EPackageImpl implements PatternsPackage
{
   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   private EClass attributeAssignmentEClass = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   private EClass objectVariableEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass abstractVariableEClass = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   private EClass abstractLinkVariableEClass = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   private EClass linkConstraintEClass = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   private EClass constraintEClass = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   private EClass pathEClass = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   private EClass linkVariableEClass = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   private EClass containmentRelationEClass = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   private EClass matchingPatternEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass primitiveVariableEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass containerVariableEClass = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   private EClass objectSetVariableEClass = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   private EClass storyPatternEClass = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   private EEnum bindingStateEEnum = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   private EEnum bindingSemanticsEEnum = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   private EEnum bindingOperatorEEnum = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   private EEnum linkConstraintTypeEEnum = null;

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
    * @see org.storydriven.modeling.patterns.PatternsPackage#eNS_URI
    * @see #init()
    * @generated
    */
   private PatternsPackageImpl ()
   {
      super(eNS_URI, PatternsFactory.eINSTANCE);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   private static boolean isInited = false;

   /**
    * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
    * 
    * <p>This method is used to initialize {@link PatternsPackage#eINSTANCE} when that field is accessed.
    * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #eNS_URI
    * @see #createPackageContents()
    * @see #initializePackageContents()
    * @generated
    */
   public static PatternsPackage init ()
   {
      if (isInited)
         return (PatternsPackage) EPackage.Registry.INSTANCE.getEPackage(PatternsPackage.eNS_URI);

      // Obtain or create and register package
      PatternsPackageImpl thePatternsPackage = (PatternsPackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PatternsPackageImpl
         ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PatternsPackageImpl());

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
      CallsPackageImpl theCallsPackage = (CallsPackageImpl) (EPackage.Registry.INSTANCE
         .getEPackage(CallsPackage.eNS_URI) instanceof CallsPackageImpl ? EPackage.Registry.INSTANCE
         .getEPackage(CallsPackage.eNS_URI) : CallsPackage.eINSTANCE);
      org.storydriven.modeling.calls.expressions.impl.ExpressionsPackageImpl theExpressionsPackage_2 = (org.storydriven.modeling.calls.expressions.impl.ExpressionsPackageImpl) (EPackage.Registry.INSTANCE
         .getEPackage(org.storydriven.modeling.calls.expressions.ExpressionsPackage.eNS_URI) instanceof org.storydriven.modeling.calls.expressions.impl.ExpressionsPackageImpl
         ? EPackage.Registry.INSTANCE
            .getEPackage(org.storydriven.modeling.calls.expressions.ExpressionsPackage.eNS_URI)
         : org.storydriven.modeling.calls.expressions.ExpressionsPackage.eINSTANCE);
      org.storydriven.modeling.patterns.expressions.impl.ExpressionsPackageImpl theExpressionsPackage_3 = (org.storydriven.modeling.patterns.expressions.impl.ExpressionsPackageImpl) (EPackage.Registry.INSTANCE
         .getEPackage(org.storydriven.modeling.patterns.expressions.ExpressionsPackage.eNS_URI) instanceof org.storydriven.modeling.patterns.expressions.impl.ExpressionsPackageImpl
         ? EPackage.Registry.INSTANCE
            .getEPackage(org.storydriven.modeling.patterns.expressions.ExpressionsPackage.eNS_URI)
         : org.storydriven.modeling.patterns.expressions.ExpressionsPackage.eINSTANCE);
      TemplatesPackageImpl theTemplatesPackage = (TemplatesPackageImpl) (EPackage.Registry.INSTANCE
         .getEPackage(TemplatesPackage.eNS_URI) instanceof TemplatesPackageImpl ? EPackage.Registry.INSTANCE
         .getEPackage(TemplatesPackage.eNS_URI) : TemplatesPackage.eINSTANCE);

      // Create package meta-data objects
      thePatternsPackage.createPackageContents();
      theSDMPackage.createPackageContents();
      theActivitiesPackage.createPackageContents();
      theExpressionsPackage.createPackageContents();
      theExpressionsPackage_1.createPackageContents();
      theCallsPackage.createPackageContents();
      theExpressionsPackage_2.createPackageContents();
      theExpressionsPackage_3.createPackageContents();
      theTemplatesPackage.createPackageContents();

      // Initialize created meta-data
      thePatternsPackage.initializePackageContents();
      theSDMPackage.initializePackageContents();
      theActivitiesPackage.initializePackageContents();
      theExpressionsPackage.initializePackageContents();
      theExpressionsPackage_1.initializePackageContents();
      theCallsPackage.initializePackageContents();
      theExpressionsPackage_2.initializePackageContents();
      theExpressionsPackage_3.initializePackageContents();
      theTemplatesPackage.initializePackageContents();

      // Register package validator
      EValidator.Registry.INSTANCE.put(thePatternsPackage, new EValidator.Descriptor()
      {
         public EValidator getEValidator ()
         {
            return PatternsValidator.INSTANCE;
         }
      });

      // Mark meta-data to indicate it can't be changed
      thePatternsPackage.freeze();

      // Update the registry and return the package
      EPackage.Registry.INSTANCE.put(PatternsPackage.eNS_URI, thePatternsPackage);
      return thePatternsPackage;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EClass getAttributeAssignment ()
   {
      return attributeAssignmentEClass;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getAttributeAssignment_ObjectVariable ()
   {
      return (EReference) attributeAssignmentEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getAttributeAssignment_Attribute ()
   {
      return (EReference) attributeAssignmentEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getAttributeAssignment_ValueExpression ()
   {
      return (EReference) attributeAssignmentEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EClass getObjectVariable ()
   {
      return objectVariableEClass;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getObjectVariable_BindingSemantics ()
   {
      return (EAttribute) objectVariableEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getObjectVariable_BindingOperator ()
   {
      return (EAttribute) objectVariableEClass.getEStructuralFeatures().get(3);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getObjectVariable_OutgoingLink ()
   {
      return (EReference) objectVariableEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getObjectVariable_LinkOrderConstraint ()
   {
      return (EReference) objectVariableEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getObjectVariable_Classifier ()
   {
      return (EReference) objectVariableEClass.getEStructuralFeatures().get(5);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getAbstractVariable ()
   {
      return abstractVariableEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getAbstractVariable_Pattern ()
   {
      return (EReference) abstractVariableEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getAbstractVariable_BindingState ()
   {
      return (EAttribute) abstractVariableEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getAbstractVariable_BindingExpression ()
   {
      return (EReference) abstractVariableEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getAbstractVariable_Constraint ()
   {
      return (EReference) abstractVariableEClass.getEStructuralFeatures().get(3);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getAbstractVariable_IncomingLink ()
   {
      return (EReference) abstractVariableEClass.getEStructuralFeatures().get(4);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getObjectVariable_AttributeAssignment ()
   {
      return (EReference) objectVariableEClass.getEStructuralFeatures().get(4);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EClass getAbstractLinkVariable ()
   {
      return abstractLinkVariableEClass;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getAbstractLinkVariable_BindingSemantics ()
   {
      return (EAttribute) abstractLinkVariableEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getAbstractLinkVariable_BindingOperator ()
   {
      return (EAttribute) abstractLinkVariableEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getAbstractLinkVariable_Target ()
   {
      return (EReference) abstractLinkVariableEClass.getEStructuralFeatures().get(7);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getAbstractLinkVariable_SecondLinkConstraint ()
   {
      return (EReference) abstractLinkVariableEClass.getEStructuralFeatures().get(3);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getAbstractLinkVariable_FirstLinkConstraint ()
   {
      return (EReference) abstractLinkVariableEClass.getEStructuralFeatures().get(4);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getAbstractLinkVariable_BindingState ()
   {
      return (EAttribute) abstractLinkVariableEClass.getEStructuralFeatures().get(5);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getAbstractLinkVariable_Pattern ()
   {
      return (EReference) abstractLinkVariableEClass.getEStructuralFeatures().get(6);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getAbstractLinkVariable_Source ()
   {
      return (EReference) abstractLinkVariableEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EClass getLinkConstraint ()
   {
      return linkConstraintEClass;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getLinkConstraint_Index ()
   {
      return (EAttribute) linkConstraintEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getLinkConstraint_ConstraintType ()
   {
      return (EAttribute) linkConstraintEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getLinkConstraint_Negative ()
   {
      return (EAttribute) linkConstraintEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getLinkConstraint_FirstLink ()
   {
      return (EReference) linkConstraintEClass.getEStructuralFeatures().get(3);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getLinkConstraint_ReferencingObject ()
   {
      return (EReference) linkConstraintEClass.getEStructuralFeatures().get(4);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getLinkConstraint_SecondLink ()
   {
      return (EReference) linkConstraintEClass.getEStructuralFeatures().get(5);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EClass getConstraint ()
   {
      return constraintEClass;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getConstraint_ConstraintExpression ()
   {
      return (EReference) constraintEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getConstraint_Pattern ()
   {
      return (EReference) constraintEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getConstraint_ObjectVariable ()
   {
      return (EReference) constraintEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EClass getPath ()
   {
      return pathEClass;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getPath_PathExpression ()
   {
      return (EReference) pathEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EClass getLinkVariable ()
   {
      return linkVariableEClass;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getLinkVariable_SourceEnd ()
   {
      return (EReference) linkVariableEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getLinkVariable_TargetEnd ()
   {
      return (EReference) linkVariableEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getLinkVariable_QualifierExpression ()
   {
      return (EReference) linkVariableEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EClass getContainmentRelation ()
   {
      return containmentRelationEClass;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EClass getMatchingPattern ()
   {
      return matchingPatternEClass;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EOperation getMatchingPattern__NoModifierInMatchingPattern__DiagnosticChain_Map ()
   {
      return matchingPatternEClass.getEOperations().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getPrimitiveVariable ()
   {
      return primitiveVariableEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getPrimitiveVariable_Classifier ()
   {
      return (EReference) primitiveVariableEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getContainerVariable ()
   {
      return containerVariableEClass;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EClass getObjectSetVariable ()
   {
      return objectSetVariableEClass;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EClass getStoryPattern ()
   {
      return storyPatternEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getStoryPattern_Variable ()
   {
      return (EReference) storyPatternEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getStoryPattern_LinkVariable ()
   {
      return (EReference) storyPatternEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getStoryPattern_Constraint ()
   {
      return (EReference) storyPatternEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getStoryPattern_ParentPattern ()
   {
      return (EReference) storyPatternEClass.getEStructuralFeatures().get(3);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getStoryPattern_ContainedPattern ()
   {
      return (EReference) storyPatternEClass.getEStructuralFeatures().get(4);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getStoryPattern_BindingSemantics ()
   {
      return (EAttribute) storyPatternEClass.getEStructuralFeatures().get(5);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getStoryPattern_TemplateSignature ()
   {
      return (EReference) storyPatternEClass.getEStructuralFeatures().get(6);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EEnum getBindingState ()
   {
      return bindingStateEEnum;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EEnum getBindingSemantics ()
   {
      return bindingSemanticsEEnum;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EEnum getBindingOperator ()
   {
      return bindingOperatorEEnum;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EEnum getLinkConstraintType ()
   {
      return linkConstraintTypeEEnum;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public PatternsFactory getPatternsFactory ()
   {
      return (PatternsFactory) getEFactoryInstance();
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
      objectVariableEClass = createEClass(OBJECT_VARIABLE);
      createEReference(objectVariableEClass, OBJECT_VARIABLE__OUTGOING_LINK);
      createEReference(objectVariableEClass, OBJECT_VARIABLE__LINK_ORDER_CONSTRAINT);
      createEAttribute(objectVariableEClass, OBJECT_VARIABLE__BINDING_SEMANTICS);
      createEAttribute(objectVariableEClass, OBJECT_VARIABLE__BINDING_OPERATOR);
      createEReference(objectVariableEClass, OBJECT_VARIABLE__ATTRIBUTE_ASSIGNMENT);
      createEReference(objectVariableEClass, OBJECT_VARIABLE__CLASSIFIER);

      abstractVariableEClass = createEClass(ABSTRACT_VARIABLE);
      createEReference(abstractVariableEClass, ABSTRACT_VARIABLE__PATTERN);
      createEAttribute(abstractVariableEClass, ABSTRACT_VARIABLE__BINDING_STATE);
      createEReference(abstractVariableEClass, ABSTRACT_VARIABLE__BINDING_EXPRESSION);
      createEReference(abstractVariableEClass, ABSTRACT_VARIABLE__CONSTRAINT);
      createEReference(abstractVariableEClass, ABSTRACT_VARIABLE__INCOMING_LINK);

      constraintEClass = createEClass(CONSTRAINT);
      createEReference(constraintEClass, CONSTRAINT__CONSTRAINT_EXPRESSION);
      createEReference(constraintEClass, CONSTRAINT__PATTERN);
      createEReference(constraintEClass, CONSTRAINT__OBJECT_VARIABLE);

      abstractLinkVariableEClass = createEClass(ABSTRACT_LINK_VARIABLE);
      createEAttribute(abstractLinkVariableEClass, ABSTRACT_LINK_VARIABLE__BINDING_SEMANTICS);
      createEAttribute(abstractLinkVariableEClass, ABSTRACT_LINK_VARIABLE__BINDING_OPERATOR);
      createEReference(abstractLinkVariableEClass, ABSTRACT_LINK_VARIABLE__SOURCE);
      createEReference(abstractLinkVariableEClass, ABSTRACT_LINK_VARIABLE__SECOND_LINK_CONSTRAINT);
      createEReference(abstractLinkVariableEClass, ABSTRACT_LINK_VARIABLE__FIRST_LINK_CONSTRAINT);
      createEAttribute(abstractLinkVariableEClass, ABSTRACT_LINK_VARIABLE__BINDING_STATE);
      createEReference(abstractLinkVariableEClass, ABSTRACT_LINK_VARIABLE__PATTERN);
      createEReference(abstractLinkVariableEClass, ABSTRACT_LINK_VARIABLE__TARGET);

      linkConstraintEClass = createEClass(LINK_CONSTRAINT);
      createEAttribute(linkConstraintEClass, LINK_CONSTRAINT__INDEX);
      createEAttribute(linkConstraintEClass, LINK_CONSTRAINT__CONSTRAINT_TYPE);
      createEAttribute(linkConstraintEClass, LINK_CONSTRAINT__NEGATIVE);
      createEReference(linkConstraintEClass, LINK_CONSTRAINT__FIRST_LINK);
      createEReference(linkConstraintEClass, LINK_CONSTRAINT__REFERENCING_OBJECT);
      createEReference(linkConstraintEClass, LINK_CONSTRAINT__SECOND_LINK);

      attributeAssignmentEClass = createEClass(ATTRIBUTE_ASSIGNMENT);
      createEReference(attributeAssignmentEClass, ATTRIBUTE_ASSIGNMENT__ATTRIBUTE);
      createEReference(attributeAssignmentEClass, ATTRIBUTE_ASSIGNMENT__VALUE_EXPRESSION);
      createEReference(attributeAssignmentEClass, ATTRIBUTE_ASSIGNMENT__OBJECT_VARIABLE);

      objectSetVariableEClass = createEClass(OBJECT_SET_VARIABLE);

      primitiveVariableEClass = createEClass(PRIMITIVE_VARIABLE);
      createEReference(primitiveVariableEClass, PRIMITIVE_VARIABLE__CLASSIFIER);

      pathEClass = createEClass(PATH);
      createEReference(pathEClass, PATH__PATH_EXPRESSION);

      linkVariableEClass = createEClass(LINK_VARIABLE);
      createEReference(linkVariableEClass, LINK_VARIABLE__SOURCE_END);
      createEReference(linkVariableEClass, LINK_VARIABLE__TARGET_END);
      createEReference(linkVariableEClass, LINK_VARIABLE__QUALIFIER_EXPRESSION);

      containmentRelationEClass = createEClass(CONTAINMENT_RELATION);

      matchingPatternEClass = createEClass(MATCHING_PATTERN);
      createEOperation(matchingPatternEClass, MATCHING_PATTERN___NO_MODIFIER_IN_MATCHING_PATTERN__DIAGNOSTICCHAIN_MAP);

      containerVariableEClass = createEClass(CONTAINER_VARIABLE);

      storyPatternEClass = createEClass(STORY_PATTERN);
      createEReference(storyPatternEClass, STORY_PATTERN__VARIABLE);
      createEReference(storyPatternEClass, STORY_PATTERN__CONSTRAINT);
      createEReference(storyPatternEClass, STORY_PATTERN__LINK_VARIABLE);
      createEReference(storyPatternEClass, STORY_PATTERN__PARENT_PATTERN);
      createEReference(storyPatternEClass, STORY_PATTERN__CONTAINED_PATTERN);
      createEAttribute(storyPatternEClass, STORY_PATTERN__BINDING_SEMANTICS);
      createEReference(storyPatternEClass, STORY_PATTERN__TEMPLATE_SIGNATURE);

      // Create enums
      bindingStateEEnum = createEEnum(BINDING_STATE);
      bindingSemanticsEEnum = createEEnum(BINDING_SEMANTICS);
      bindingOperatorEEnum = createEEnum(BINDING_OPERATOR);
      linkConstraintTypeEEnum = createEEnum(LINK_CONSTRAINT_TYPE);
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
      org.storydriven.modeling.patterns.expressions.ExpressionsPackage theExpressionsPackage_3 = (org.storydriven.modeling.patterns.expressions.ExpressionsPackage) EPackage.Registry.INSTANCE
         .getEPackage(org.storydriven.modeling.patterns.expressions.ExpressionsPackage.eNS_URI);
      EcorePackage theEcorePackage = (EcorePackage) EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
      SDMPackage theSDMPackage = (SDMPackage) EPackage.Registry.INSTANCE.getEPackage(SDMPackage.eNS_URI);
      org.storydriven.modeling.expressions.ExpressionsPackage theExpressionsPackage_1 = (org.storydriven.modeling.expressions.ExpressionsPackage) EPackage.Registry.INSTANCE
         .getEPackage(org.storydriven.modeling.expressions.ExpressionsPackage.eNS_URI);
      TemplatesPackage theTemplatesPackage = (TemplatesPackage) EPackage.Registry.INSTANCE
         .getEPackage(TemplatesPackage.eNS_URI);

      // Add subpackages
      getESubpackages().add(theExpressionsPackage_3);

      // Create type parameters

      // Set bounds for type parameters

      // Add supertypes to classes
      objectVariableEClass.getESuperTypes().add(this.getAbstractVariable());
      abstractVariableEClass.getESuperTypes().add(theSDMPackage.getVariable());
      abstractVariableEClass.getESuperTypes().add(theSDMPackage.getNamedElement());
      abstractLinkVariableEClass.getESuperTypes().add(theSDMPackage.getNamedElement());
      linkConstraintEClass.getESuperTypes().add(theSDMPackage.getExtendableElement());
      objectSetVariableEClass.getESuperTypes().add(this.getObjectVariable());
      primitiveVariableEClass.getESuperTypes().add(this.getAbstractVariable());
      pathEClass.getESuperTypes().add(this.getAbstractLinkVariable());
      linkVariableEClass.getESuperTypes().add(this.getAbstractLinkVariable());
      containmentRelationEClass.getESuperTypes().add(this.getAbstractLinkVariable());
      matchingPatternEClass.getESuperTypes().add(this.getStoryPattern());
      containerVariableEClass.getESuperTypes().add(this.getObjectVariable());
      storyPatternEClass.getESuperTypes().add(theSDMPackage.getCommentableElement());

      // Initialize classes, features, and operations; add parameters
      initEClass(objectVariableEClass, ObjectVariable.class, "ObjectVariable", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEReference(getObjectVariable_OutgoingLink(), this.getAbstractLinkVariable(),
         this.getAbstractLinkVariable_Source(), "outgoingLink", null, 0, -1, ObjectVariable.class, !IS_TRANSIENT,
         !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
         !IS_ORDERED);
      initEReference(getObjectVariable_LinkOrderConstraint(), this.getLinkConstraint(),
         this.getLinkConstraint_ReferencingObject(), "linkOrderConstraint", null, 0, -1, ObjectVariable.class,
         !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
         !IS_DERIVED, IS_ORDERED);
      initEAttribute(getObjectVariable_BindingSemantics(), this.getBindingSemantics(), "bindingSemantics", "MANDATORY",
         1, 1, ObjectVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
         !IS_DERIVED, !IS_ORDERED);
      initEAttribute(getObjectVariable_BindingOperator(), this.getBindingOperator(), "bindingOperator", "CHECK_ONLY",
         1, 1, ObjectVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
         !IS_DERIVED, !IS_ORDERED);
      initEReference(getObjectVariable_AttributeAssignment(), this.getAttributeAssignment(),
         this.getAttributeAssignment_ObjectVariable(), "attributeAssignment", null, 0, -1, ObjectVariable.class,
         !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
         !IS_DERIVED, IS_ORDERED);
      initEReference(getObjectVariable_Classifier(), theEcorePackage.getEClass(), null, "classifier", null, 1, 1,
         ObjectVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(abstractVariableEClass, AbstractVariable.class, "AbstractVariable", IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEReference(getAbstractVariable_Pattern(), this.getStoryPattern(), this.getStoryPattern_Variable(), "pattern",
         null, 1, 1, AbstractVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
         IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEAttribute(getAbstractVariable_BindingState(), this.getBindingState(), "bindingState", "UNBOUND", 1, 1,
         AbstractVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
         !IS_DERIVED, !IS_ORDERED);
      initEReference(getAbstractVariable_BindingExpression(), theExpressionsPackage_1.getExpression(), null,
         "bindingExpression", null, 0, 1, AbstractVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
         IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getAbstractVariable_Constraint(), this.getConstraint(), this.getConstraint_ObjectVariable(),
         "constraint", null, 0, -1, AbstractVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
         IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getAbstractVariable_IncomingLink(), this.getAbstractLinkVariable(),
         this.getAbstractLinkVariable_Target(), "incomingLink", null, 0, -1, AbstractVariable.class, !IS_TRANSIENT,
         !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
         !IS_ORDERED);

      initEClass(constraintEClass, Constraint.class, "Constraint", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEReference(getConstraint_ConstraintExpression(), theExpressionsPackage_1.getExpression(), null,
         "constraintExpression", null, 1, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
         IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getConstraint_Pattern(), this.getStoryPattern(), this.getStoryPattern_Constraint(), "pattern",
         null, 0, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getConstraint_ObjectVariable(), this.getAbstractVariable(), this.getAbstractVariable_Constraint(),
         "objectVariable", null, 0, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
         IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(abstractLinkVariableEClass, AbstractLinkVariable.class, "AbstractLinkVariable", IS_ABSTRACT,
         !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getAbstractLinkVariable_BindingSemantics(), this.getBindingSemantics(), "bindingSemantics",
         "MANDATORY", 1, 1, AbstractLinkVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
         !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEAttribute(getAbstractLinkVariable_BindingOperator(), this.getBindingOperator(), "bindingOperator",
         "CHECK_ONLY", 1, 1, AbstractLinkVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
         !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getAbstractLinkVariable_Source(), this.getObjectVariable(), this.getObjectVariable_OutgoingLink(),
         "source", null, 1, 1, AbstractLinkVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
         IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getAbstractLinkVariable_SecondLinkConstraint(), this.getLinkConstraint(),
         this.getLinkConstraint_SecondLink(), "secondLinkConstraint", null, 0, -1, AbstractLinkVariable.class,
         !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
         !IS_DERIVED, !IS_ORDERED);
      initEReference(getAbstractLinkVariable_FirstLinkConstraint(), this.getLinkConstraint(),
         this.getLinkConstraint_FirstLink(), "firstLinkConstraint", null, 0, -1, AbstractLinkVariable.class,
         !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
         !IS_DERIVED, !IS_ORDERED);
      initEAttribute(getAbstractLinkVariable_BindingState(), this.getBindingState(), "bindingState", "UNBOUND", 1, 1,
         AbstractLinkVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
         !IS_DERIVED, !IS_ORDERED);
      initEReference(getAbstractLinkVariable_Pattern(), this.getStoryPattern(), this.getStoryPattern_LinkVariable(),
         "pattern", null, 1, 1, AbstractLinkVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
         IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getAbstractLinkVariable_Target(), this.getAbstractVariable(),
         this.getAbstractVariable_IncomingLink(), "target", null, 1, 1, AbstractLinkVariable.class, !IS_TRANSIENT,
         !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
         !IS_ORDERED);

      initEClass(linkConstraintEClass, LinkConstraint.class, "LinkConstraint", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getLinkConstraint_Index(), ecorePackage.getEInt(), "index", null, 1, 1, LinkConstraint.class,
         !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEAttribute(getLinkConstraint_ConstraintType(), this.getLinkConstraintType(), "constraintType",
         "DIRECT_SUCCESSOR", 1, 1, LinkConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
         !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEAttribute(getLinkConstraint_Negative(), ecorePackage.getEBoolean(), "negative", null, 1, 1,
         LinkConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
         !IS_DERIVED, !IS_ORDERED);
      initEReference(getLinkConstraint_FirstLink(), this.getAbstractLinkVariable(),
         this.getAbstractLinkVariable_FirstLinkConstraint(), "firstLink", null, 1, 1, LinkConstraint.class,
         !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
         !IS_DERIVED, !IS_ORDERED);
      initEReference(getLinkConstraint_ReferencingObject(), this.getObjectVariable(),
         this.getObjectVariable_LinkOrderConstraint(), "referencingObject", null, 1, 1, LinkConstraint.class,
         !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
         !IS_DERIVED, !IS_ORDERED);
      initEReference(getLinkConstraint_SecondLink(), this.getAbstractLinkVariable(),
         this.getAbstractLinkVariable_SecondLinkConstraint(), "secondLink", null, 0, 1, LinkConstraint.class,
         !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
         !IS_DERIVED, !IS_ORDERED);

      initEClass(attributeAssignmentEClass, AttributeAssignment.class, "AttributeAssignment", !IS_ABSTRACT,
         !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getAttributeAssignment_Attribute(), theEcorePackage.getEAttribute(), null, "attribute", null, 1,
         1, AttributeAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getAttributeAssignment_ValueExpression(), theExpressionsPackage_1.getExpression(), null,
         "valueExpression", null, 1, 1, AttributeAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
         IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getAttributeAssignment_ObjectVariable(), this.getObjectVariable(),
         this.getObjectVariable_AttributeAssignment(), "objectVariable", null, 1, 1, AttributeAssignment.class,
         !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
         !IS_DERIVED, !IS_ORDERED);

      initEClass(objectSetVariableEClass, ObjectSetVariable.class, "ObjectSetVariable", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);

      initEClass(primitiveVariableEClass, PrimitiveVariable.class, "PrimitiveVariable", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEReference(getPrimitiveVariable_Classifier(), theEcorePackage.getEDataType(), null, "classifier", null, 1, 1,
         PrimitiveVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(pathEClass, Path.class, "Path", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getPath_PathExpression(), theExpressionsPackage_1.getExpression(), null, "pathExpression", null,
         1, 1, Path.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(linkVariableEClass, LinkVariable.class, "LinkVariable", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEReference(getLinkVariable_SourceEnd(), theEcorePackage.getEReference(), null, "sourceEnd", null, 0, 1,
         LinkVariable.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
      initEReference(getLinkVariable_TargetEnd(), theEcorePackage.getEReference(), null, "targetEnd", null, 1, 1,
         LinkVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getLinkVariable_QualifierExpression(), theExpressionsPackage_1.getExpression(), null,
         "qualifierExpression", null, 0, 1, LinkVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
         IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(containmentRelationEClass, ContainmentRelation.class, "ContainmentRelation", !IS_ABSTRACT,
         !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

      initEClass(matchingPatternEClass, MatchingPattern.class, "MatchingPattern", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);

      EOperation op = initEOperation(getMatchingPattern__NoModifierInMatchingPattern__DiagnosticChain_Map(),
         ecorePackage.getEBoolean(), "NoModifierInMatchingPattern", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
      EGenericType g1 = createEGenericType(ecorePackage.getEMap());
      EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(containerVariableEClass, ContainerVariable.class, "ContainerVariable", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);

      initEClass(storyPatternEClass, StoryPattern.class, "StoryPattern", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEReference(getStoryPattern_Variable(), this.getAbstractVariable(), this.getAbstractVariable_Pattern(),
         "variable", null, 0, -1, StoryPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
         IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getStoryPattern_Constraint(), this.getConstraint(), this.getConstraint_Pattern(), "constraint",
         null, 0, -1, StoryPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getStoryPattern_LinkVariable(), this.getAbstractLinkVariable(),
         this.getAbstractLinkVariable_Pattern(), "linkVariable", null, 0, -1, StoryPattern.class, !IS_TRANSIENT,
         !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
         IS_ORDERED);
      initEReference(getStoryPattern_ParentPattern(), this.getStoryPattern(), this.getStoryPattern_ContainedPattern(),
         "parentPattern", null, 0, 1, StoryPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
         IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getStoryPattern_ContainedPattern(), this.getStoryPattern(), this.getStoryPattern_ParentPattern(),
         "containedPattern", null, 0, -1, StoryPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
         IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEAttribute(getStoryPattern_BindingSemantics(), this.getBindingSemantics(), "bindingSemantics", "MANDATORY",
         1, 1, StoryPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
         !IS_DERIVED, !IS_ORDERED);
      initEReference(getStoryPattern_TemplateSignature(), theTemplatesPackage.getTemplateSignature(),
         theTemplatesPackage.getTemplateSignature_Pattern(), "templateSignature", null, 0, 1, StoryPattern.class,
         !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
         !IS_DERIVED, !IS_ORDERED);

      // Initialize enums and add enum literals
      initEEnum(bindingStateEEnum, BindingState.class, "BindingState");
      addEEnumLiteral(bindingStateEEnum, BindingState.UNBOUND);
      addEEnumLiteral(bindingStateEEnum, BindingState.BOUND);
      addEEnumLiteral(bindingStateEEnum, BindingState.MAYBE_BOUND);

      initEEnum(bindingSemanticsEEnum, BindingSemantics.class, "BindingSemantics");
      addEEnumLiteral(bindingSemanticsEEnum, BindingSemantics.MANDATORY);
      addEEnumLiteral(bindingSemanticsEEnum, BindingSemantics.NEGATIVE);
      addEEnumLiteral(bindingSemanticsEEnum, BindingSemantics.OPTIONAL);

      initEEnum(bindingOperatorEEnum, BindingOperator.class, "BindingOperator");
      addEEnumLiteral(bindingOperatorEEnum, BindingOperator.CHECK_ONLY);
      addEEnumLiteral(bindingOperatorEEnum, BindingOperator.CREATE);
      addEEnumLiteral(bindingOperatorEEnum, BindingOperator.DESTROY);

      initEEnum(linkConstraintTypeEEnum, LinkConstraintType.class, "LinkConstraintType");
      addEEnumLiteral(linkConstraintTypeEEnum, LinkConstraintType.FIRST);
      addEEnumLiteral(linkConstraintTypeEEnum, LinkConstraintType.LAST);
      addEEnumLiteral(linkConstraintTypeEEnum, LinkConstraintType.DIRECT_SUCCESSOR);
      addEEnumLiteral(linkConstraintTypeEEnum, LinkConstraintType.INDIRECT_SUCCESSOR);
      addEEnumLiteral(linkConstraintTypeEEnum, LinkConstraintType.INDEX);

      // Create annotations
      // http://www.eclipse.org/emf/2002/GenModel
      createGenModelAnnotations();
      // subsets
      createSubsetsAnnotations();
      // http://www.eclipse.org/uml2/1.1.0/GenModel
      createGenModel_1Annotations();
   }

   /**
    * Initializes the annotations for <b>subsets</b>.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   protected void createSubsetsAnnotations ()
   {
      String source = "subsets";
      addAnnotation(getObjectVariable_Classifier(), source, new String[] {},
         new URI[] {URI.createURI(SDMPackage.eNS_URI).appendFragment("//TypedElement/type")});
      addAnnotation(getPrimitiveVariable_Classifier(), source, new String[] {},
         new URI[] {URI.createURI(SDMPackage.eNS_URI).appendFragment("//TypedElement/type")});
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
         new String[] {
               "documentation",
               "This package contains all classes for modeling story patterns that may be \r\nembedded into StoryActivityNodes of an Activity."});
      addAnnotation(objectVariableEClass, source, new String[] {"documentation",
            "An ObjectVariable holds a value of a complex type which is defined by an EClass. "});
      addAnnotation(
         getObjectVariable_BindingSemantics(),
         source,
         new String[] {
               "documentation",
               "The binding semantics defines whether the object must be matched for a successful application of the containing story pattern, whether it must not be matched or whether it is optional, i.e., it will be bound if it can be bound but that does not affect the success of matching the story pattern."});
      addAnnotation(
         getObjectVariable_BindingOperator(),
         source,
         new String[] {"documentation",
               "The binding operator defines whether this object will be matched, created or destroyed by the story pattern."});
      addAnnotation(getObjectVariable_Classifier(), source, new String[] {"documentation",
            "The type of this ObjectVariable, given as an EClass."});
      addAnnotation(abstractVariableEClass, source, new String[] {"documentation",
            "Abstract super class for object and primitive variables."});
      addAnnotation(
         getAbstractVariable_BindingState(),
         source,
         new String[] {
               "documentation",
               "The binding state defines whether the variable is already bound or whether a match has to be obtained for it. The default value is \"unbound\"."});
      addAnnotation(
         getAbstractVariable_BindingExpression(),
         source,
         new String[] {
               "documentation",
               "A binding expression can be used to bind a variable in a different way than just by pattern matching. This way, for example, the return value of a call can be bound to a variable."});
      addAnnotation(
         getAbstractVariable_Constraint(),
         source,
         new String[] {
               "documentation",
               "All constraints which are defined for this variable. For a successful matching, all constraints for this variable must evaluate to true."});
      addAnnotation(bindingStateEEnum, source, new String[] {"documentation",
            "The BindingState defines whether an object or link variable is already bound to a concrete value or not."});
      addAnnotation(
         bindingStateEEnum.getELiterals().get(0),
         source,
         new String[] {
               "documentation",
               "UNBOUND is the default value for this enum. If an object or link variable in a story pattern is unbound, a new match has to be obtained for that variable."});
      addAnnotation(
         bindingStateEEnum.getELiterals().get(1),
         source,
         new String[] {
               "documentation",
               "A bound variable has already been bound to a concrete value. The concrete value has to be passed either as a parameter or it has to be bound in a previous activity. If, during the execution of a story pattern, a bound variable has no value, the execution of the story pattern fails."});
      addAnnotation(
         bindingStateEEnum.getELiterals().get(2),
         source,
         new String[] {
               "documentation",
               "A variable marked with maybe_bound indicates that it is unknown (or unimportant) at design time whether the variable is bound or not. If, during the execution of the pattern, the variable is not bound, an object is matched and bound to the variable. If it is already bound, it is not altered. If the variable is still unbound after this process, the matching fails (except for OPTIONAL variables)."});
      addAnnotation(
         constraintEClass,
         source,
         new String[] {
               "documentation",
               "A constraint represents a condition which must be fulfilled for a successful pattern matching. It can either be contained in the story pattern or in a variable. In the former case, the constraint is evaluated after the matching of the object structure is complete. It still has to be true for the pattern application to be sucessful (and therefore for creations and destructions to be carried out). If the constraint is contained in a variable, it constrains the matching of that variable, i.e., it is evaluated during the matching of the containing variable and has to be true for a successful matching. If the variable is an ObjectSetVariable, the constraint has to be true for every object in the set."});
      addAnnotation(getConstraint_ConstraintExpression(), source, new String[] {"documentation",
            "The constraintExpression defines the concrete condition of this constraint."});
      addAnnotation(getConstraint_Pattern(), source, new String[] {"documentation",
            "The story pattern this constraint applies to."});
      addAnnotation(getConstraint_ObjectVariable(), source, new String[] {"documentation",
            "The object variable this constraint applies to."});
      addAnnotation(
         abstractLinkVariableEClass,
         source,
         new String[] {"documentation",
               "Abstract super class for all kinds of link variables that represent links between two objects in a story pattern."});
      addAnnotation(
         getAbstractLinkVariable_BindingSemantics(),
         source,
         new String[] {
               "documentation",
               "The binding semantics defines whether the link must be matched for a successful application of the containing story pattern, whether it must not be matched or whether it is optional, i.e., it will be bound if it can be bound but that does not affect the success of matching the story pattern. The default value is \"mandatory\" (i.e., it must be matched)."});
      addAnnotation(
         getAbstractLinkVariable_BindingOperator(),
         source,
         new String[] {
               "documentation",
               "The binding operator defines whether this link will be matched, created or destroyed by the story pattern. The default value ist \"check_only\", i.e., the link will be matched."});
      addAnnotation(
         getAbstractLinkVariable_BindingState(),
         source,
         new String[] {"documentation",
               "The binding state defines whether the link is already bound or whether a match has to be obtained for it."});
      addAnnotation(bindingSemanticsEEnum, source, new String[] {"documentation",
            "The binding semantics defines which kind of match will be obtained for the object or link variable."});
      addAnnotation(
         bindingSemanticsEEnum.getELiterals().get(0),
         source,
         new String[] {"documentation",
               "For a mandatory object or link variable, a match has to be found for a pattern to be successfully applied."});
      addAnnotation(
         bindingSemanticsEEnum.getELiterals().get(1),
         source,
         new String[] {
               "documentation",
               "If an object or link variable is marked as NEGATIVE, no match may be found for that object or link variable. If a match can be found, the execution of the story pattern fails."});
      addAnnotation(
         bindingSemanticsEEnum.getELiterals().get(2),
         source,
         new String[] {
               "documentation",
               "For an OPTIONAL object or link variable, the matching tries to find a match. If no match can be found, this does not affect the success of the pattern application. If a match can be found, the respective object or link is bound to the variable."});
      addAnnotation(
         bindingOperatorEEnum,
         source,
         new String[] {
               "documentation",
               "The BindingOperator enum defines all possible operations for object and link variables. An object or link variable may be checked for existence be the story pattern (black object/link variable), it may be created (green object/link variable), or it may be destroyed (red object/link variable)."});
      addAnnotation(
         bindingOperatorEEnum.getELiterals().get(0),
         source,
         new String[] {
               "documentation",
               "CHECK_ONLY is the default value of this enum. It requires an object or link variable just to be matched by the story pattern."});
      addAnnotation(bindingOperatorEEnum.getELiterals().get(1), source, new String[] {"documentation",
            "An object or link variable marked as CREATE will be created by the story pattern."});
      addAnnotation(bindingOperatorEEnum.getELiterals().get(2), source, new String[] {"documentation",
            "An object or link variable marked as DESTROY will be destroyed be the story pattern."});
      addAnnotation(
         linkConstraintEClass,
         source,
         new String[] {
               "documentation",
               "Link constraints (formerly known as MultiLinks in old meta-model) constrain the ordering of links of the referencingObject is a collection. This way objects can be required to have a certain position in the collection (FIRST, LAST, INDEX) or a certain ordering relative to each other (DIRECT_SUCCESSOR, INDIRECT_SUCCESSOR). While the first kind of LinkConstraint can be imposed upon a single link, the second kind requires two links that are related to each other (e.g., have the same referencingObject)."});
      addAnnotation(
         getLinkConstraint_Index(),
         source,
         new String[] {
               "documentation",
               "The index of the linked object in the collection. The semantics of this attribute is only defined if the constraintType of the LinkConstraint is INDEX."});
      addAnnotation(getLinkConstraint_ConstraintType(), source, new String[] {"documentation",
            "The constraint type of the LinkConstraint."});
      addAnnotation(
         getLinkConstraint_Negative(),
         source,
         new String[] {
               "documentation",
               "If the negative attribute is true, the link constraint may not be fulfilled for the complete pattern application to be successful."});
      addAnnotation(
         linkConstraintTypeEEnum,
         source,
         new String[] {
               "documentation",
               "The LinkConstraintType represents the different uses of LinkConstraints. Objects can be required to have a certain position in their containing collection (FIRST, LAST, INDEX) or a certain ordering relative to each other (DIRECT_SUCCESSOR, INDIRECT_SUCCESSOR)."});
      addAnnotation(
         attributeAssignmentEClass,
         source,
         new String[] {
               "documentation",
               "An AttributeAssignment is used to set the value of a certain attribute of an object. It references the attribute that is to be set and the value. The value can be an expression to allow for calculations or calls that determine the final value. AttributeAssignments are carried out during the final phase of pattern application, i.e. after the matching and destruction are completed."});
      addAnnotation(
         getAttributeAssignment_Attribute(),
         source,
         new String[] {
               "documentation",
               "The attribute whose value is set. It has to be an attribute of the objectVariable that contains the AttributeAssignment."});
      addAnnotation(getAttributeAssignment_ValueExpression(), source, new String[] {"documentation",
            "The expression that determines the new value that is given to the attribute."});
      addAnnotation(
         objectSetVariableEClass,
         source,
         new String[] {
               "documentation",
               "Represents a set of objects of the same type that are represented by a single node.\r\nThe context for contained Constraints and AttributeAssignments is every single object in the set. E.g., if the constraint is \"name = \'abc\'\", only objects with that name are matched and added to the set. The use of the binding operator \"CREATE\" is not defined for ObjectSetVariables, i.e., the sets can only be matched and deleted."});
      addAnnotation(primitiveVariableEClass, source, new String[] {"documentation",
            "Represents a variable that holds a value of a primitive type, e.g. integer, boolean, String."});
      addAnnotation(getPrimitiveVariable_Classifier(), source, new String[] {"documentation",
            "The type of the primitive variable which must be an EDataType."});
      addAnnotation(
         pathEClass,
         source,
         new String[] {
               "documentation",
               "A path is a special link variable that specifies an indirect connection between two objects. That means, the connected objects have other links and objects \"between them\". Exactly which types of links may be traversed during the matching of a path can be constrained by a path expression."});
      addAnnotation(
         getPath_PathExpression(),
         source,
         new String[] {
               "documentation",
               "The path expression constrains the matching of the path variable during pattern application. It can determine which links may be matched when and how many times to reach the target object of the path from the source object."});
      addAnnotation(
         linkVariableEClass,
         source,
         new String[] {
               "documentation",
               "A link variable represents one link between two object variables. It is typed over one of the associations between the classes of those objects. Because EMF only directly supports references, the two link ends are typed over these references. In case of a uni-directional association, only the targetEnd is typed. In case of a bi-directional association, the reference that types the source end is automatically determined."});
      addAnnotation(
         getLinkVariable_SourceEnd(),
         source,
         new String[] {
               "documentation",
               "The source end of a link variable can only be determined when the link is typed over a bi-directional association. In this case, it points to the \"reverse\" direction of the association. If the reference is only uni-directional, the source end is null. The value of this attribute is derived automatically."});
      addAnnotation(
         getLinkVariable_TargetEnd(),
         source,
         new String[] {
               "documentation",
               "The target end points to the reference that types this direction of the link (the \"normal\" direction). This link end must be set always."});
      addAnnotation(
         getLinkVariable_QualifierExpression(),
         source,
         new String[] {
               "documentation",
               "If a link is typed over a qualified reference, a qualifier determines the key under which the object reachable via the link is stored. Because the qualifier can be set by an expression, it can either be a simple string or something more complex, e.g., a call like \"object.getName()\"."});
      addAnnotation(
         containmentRelationEClass,
         source,
         new String[] {
               "documentation",
               "Specifies the containment of an object in a set (represented by a ContainerVariable). Will be displayed by a line having a circle with a plus inside at the end of the container (the source end of the link). A create modifier specifies that the object will be added to the container, delete that it will be removed, and none that it will be checked to be contained."});
      addAnnotation(
         matchingPatternEClass,
         source,
         new String[] {
               "documentation",
               "A MatchingPattern is a special kind of story pattern that does not change the underlying graph. Thus, no contained object or link may carry an create or destroy BindingOperator."});
      addAnnotation(
         getMatchingPattern__NoModifierInMatchingPattern__DiagnosticChain_Map(),
         source,
         new String[] {
               "documentation",
               "self.objectVariable->forAll(v:ObjectVariable | v.modifier = Modifier::NONE) and self.linkVariable->forAll(v:LinkVariable | v.modifier = Modifier::NONE)"});
      addAnnotation((getMatchingPattern__NoModifierInMatchingPattern__DiagnosticChain_Map()).getEParameters().get(0),
         source, new String[] {"documentation", "The chain of diagnostics to which problems are to be appended."});
      addAnnotation((getMatchingPattern__NoModifierInMatchingPattern__DiagnosticChain_Map()).getEParameters().get(1),
         source, new String[] {"documentation", "The cache of context-specific information."});
      addAnnotation(
         containerVariableEClass,
         source,
         new String[] {
               "documentation",
               "Represents a single container, e.g. a Set or List. ContainmentRelations can be used to add or remove objects to or from this container.\r\nEvery Constraint or AttributeAssignment can use the variable as a container (e.g., \"set->size() > 5\")."});
      addAnnotation(storyPatternEClass, source, new String[] {"documentation",
            "A Story Pattern is a graph rewrite rule that may be embedded into a StoryActivityNode\r\nof an Activity."});
      addAnnotation(
         getStoryPattern_Constraint(),
         source,
         new String[] {
               "documentation",
               "All constraints which are defined for this story pattern. For a successful matching, all constraints for this story pattern must evaluate to true."});
   }

   /**
    * Initializes the annotations for <b>http://www.eclipse.org/uml2/1.1.0/GenModel</b>.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   protected void createGenModel_1Annotations ()
   {
      String source = "http://www.eclipse.org/uml2/1.1.0/GenModel";
      addAnnotation(
         getMatchingPattern__NoModifierInMatchingPattern__DiagnosticChain_Map(),
         source,
         new String[] {
               "body",
               "self.objectVariable->forAll(v:ObjectVariable | v.modifier = Modifier::NONE) and self.linkVariable->forAll(v:LinkVariable | v.modifier = Modifier::NONE)"});
   }

} // PatternsPackageImpl
