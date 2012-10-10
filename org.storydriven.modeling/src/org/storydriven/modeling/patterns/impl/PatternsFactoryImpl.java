/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.patterns.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.storydriven.modeling.patterns.*;
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

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * @generated
 */
public class PatternsFactoryImpl extends EFactoryImpl implements PatternsFactory
{
   /**
    * Creates the default factory implementation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public static PatternsFactory init ()
   {
      try
      {
         PatternsFactory thePatternsFactory = (PatternsFactory) EPackage.Registry.INSTANCE
            .getEFactory("http://ns.storydriven.org/sdm/patterns/0.1.0");
         if (thePatternsFactory != null)
         {
            return thePatternsFactory;
         }
      }
      catch (Exception exception)
      {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new PatternsFactoryImpl();
   }

   /**
    * Creates an instance of the factory.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public PatternsFactoryImpl ()
   {
      super();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   @Override
   public EObject create (EClass eClass)
   {
      switch (eClass.getClassifierID())
      {
         case PatternsPackage.OBJECT_VARIABLE:
            return createObjectVariable();
         case PatternsPackage.CONSTRAINT:
            return createConstraint();
         case PatternsPackage.LINK_CONSTRAINT:
            return createLinkConstraint();
         case PatternsPackage.ATTRIBUTE_ASSIGNMENT:
            return createAttributeAssignment();
         case PatternsPackage.OBJECT_SET_VARIABLE:
            return createObjectSetVariable();
         case PatternsPackage.PRIMITIVE_VARIABLE:
            return createPrimitiveVariable();
         case PatternsPackage.PATH:
            return createPath();
         case PatternsPackage.LINK_VARIABLE:
            return createLinkVariable();
         case PatternsPackage.CONTAINMENT_RELATION:
            return createContainmentRelation();
         case PatternsPackage.MATCHING_PATTERN:
            return createMatchingPattern();
         case PatternsPackage.CONTAINER_VARIABLE:
            return createContainerVariable();
         case PatternsPackage.STORY_PATTERN:
            return createStoryPattern();
         default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
      }
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object createFromString (EDataType eDataType, String initialValue)
   {
      switch (eDataType.getClassifierID())
      {
         case PatternsPackage.BINDING_STATE:
            return createBindingStateFromString(eDataType, initialValue);
         case PatternsPackage.BINDING_SEMANTICS:
            return createBindingSemanticsFromString(eDataType, initialValue);
         case PatternsPackage.BINDING_OPERATOR:
            return createBindingOperatorFromString(eDataType, initialValue);
         case PatternsPackage.LINK_CONSTRAINT_TYPE:
            return createLinkConstraintTypeFromString(eDataType, initialValue);
         default:
            throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
      }
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   @Override
   public String convertToString (EDataType eDataType, Object instanceValue)
   {
      switch (eDataType.getClassifierID())
      {
         case PatternsPackage.BINDING_STATE:
            return convertBindingStateToString(eDataType, instanceValue);
         case PatternsPackage.BINDING_SEMANTICS:
            return convertBindingSemanticsToString(eDataType, instanceValue);
         case PatternsPackage.BINDING_OPERATOR:
            return convertBindingOperatorToString(eDataType, instanceValue);
         case PatternsPackage.LINK_CONSTRAINT_TYPE:
            return convertLinkConstraintTypeToString(eDataType, instanceValue);
         default:
            throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
      }
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public AttributeAssignment createAttributeAssignment ()
   {
      AttributeAssignmentImpl attributeAssignment = new AttributeAssignmentImpl();
      return attributeAssignment;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public LinkConstraint createLinkConstraint ()
   {
      LinkConstraintImpl linkConstraint = new LinkConstraintImpl();
      return linkConstraint;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public ObjectVariable createObjectVariable ()
   {
      ObjectVariableImpl objectVariable = new ObjectVariableImpl();
      return objectVariable;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public Constraint createConstraint ()
   {
      ConstraintImpl constraint = new ConstraintImpl();
      return constraint;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public Path createPath ()
   {
      PathImpl path = new PathImpl();
      return path;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public LinkVariable createLinkVariable ()
   {
      LinkVariableImpl linkVariable = new LinkVariableImpl();
      return linkVariable;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public ContainmentRelation createContainmentRelation ()
   {
      ContainmentRelationImpl containmentRelation = new ContainmentRelationImpl();
      return containmentRelation;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public MatchingPattern createMatchingPattern ()
   {
      MatchingPatternImpl matchingPattern = new MatchingPatternImpl();
      return matchingPattern;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public PrimitiveVariable createPrimitiveVariable ()
   {
      PrimitiveVariableImpl primitiveVariable = new PrimitiveVariableImpl();
      return primitiveVariable;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ContainerVariable createContainerVariable ()
   {
      ContainerVariableImpl containerVariable = new ContainerVariableImpl();
      return containerVariable;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public ObjectSetVariable createObjectSetVariable ()
   {
      ObjectSetVariableImpl objectSetVariable = new ObjectSetVariableImpl();
      return objectSetVariable;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public StoryPattern createStoryPattern ()
   {
      StoryPatternImpl storyPattern = new StoryPatternImpl();
      return storyPattern;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public BindingState createBindingStateFromString (EDataType eDataType, String initialValue)
   {
      BindingState result = BindingState.get(initialValue);
      if (result == null)
         throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
            + eDataType.getName() + "'");
      return result;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public String convertBindingStateToString (EDataType eDataType, Object instanceValue)
   {
      return instanceValue == null ? null : instanceValue.toString();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public BindingSemantics createBindingSemanticsFromString (EDataType eDataType, String initialValue)
   {
      BindingSemantics result = BindingSemantics.get(initialValue);
      if (result == null)
         throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
            + eDataType.getName() + "'");
      return result;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public String convertBindingSemanticsToString (EDataType eDataType, Object instanceValue)
   {
      return instanceValue == null ? null : instanceValue.toString();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public BindingOperator createBindingOperatorFromString (EDataType eDataType, String initialValue)
   {
      BindingOperator result = BindingOperator.get(initialValue);
      if (result == null)
         throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
            + eDataType.getName() + "'");
      return result;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public String convertBindingOperatorToString (EDataType eDataType, Object instanceValue)
   {
      return instanceValue == null ? null : instanceValue.toString();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public LinkConstraintType createLinkConstraintTypeFromString (EDataType eDataType, String initialValue)
   {
      LinkConstraintType result = LinkConstraintType.get(initialValue);
      if (result == null)
         throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
            + eDataType.getName() + "'");
      return result;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public String convertLinkConstraintTypeToString (EDataType eDataType, Object instanceValue)
   {
      return instanceValue == null ? null : instanceValue.toString();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public PatternsPackage getPatternsPackage ()
   {
      return (PatternsPackage) getEPackage();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @deprecated
    * @generated
    */
   @Deprecated
   public static PatternsPackage getPackage ()
   {
      return PatternsPackage.eINSTANCE;
   }

} // PatternsFactoryImpl
