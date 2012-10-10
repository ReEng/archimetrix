/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.patterns.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.storydriven.modeling.patterns.*;
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
import org.storydriven.modeling.patterns.PatternsPackage;
import org.storydriven.modeling.patterns.PrimitiveVariable;
import org.storydriven.modeling.patterns.StoryPattern;

/**
 * <!-- begin-user-doc --> The <b>Validator</b> for the model. <!-- end-user-doc -->
 * @see org.storydriven.modeling.patterns.PatternsPackage
 * @generated
 */
public class PatternsValidator extends EObjectValidator
{
   /**
    * The cached model package
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public static final PatternsValidator INSTANCE = new PatternsValidator();

   /**
    * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see org.eclipse.emf.common.util.Diagnostic#getSource()
    * @see org.eclipse.emf.common.util.Diagnostic#getCode()
    * @generated
    */
   public static final String DIAGNOSTIC_SOURCE = "org.storydriven.modeling.patterns";

   /**
    * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'No Modifier In Matching Pattern' of 'Matching Pattern'.
    * <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * @generated
    */
   public static final int MATCHING_PATTERN__NO_MODIFIER_IN_MATCHING_PATTERN = 1;

   /**
    * A constant with a fixed name that can be used as the base value for additional hand written constants.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 1;

   /**
    * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

   /**
    * Creates an instance of the switch.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public PatternsValidator ()
   {
      super();
   }

   /**
    * Returns the package of this validator switch.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EPackage getEPackage ()
   {
      return PatternsPackage.eINSTANCE;
   }

   /**
    * Calls <code>validateXXX</code> for the corresponding classifier of the model.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected boolean validate (int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context)
   {
      switch (classifierID)
      {
         case PatternsPackage.OBJECT_VARIABLE:
            return validateObjectVariable((ObjectVariable) value, diagnostics, context);
         case PatternsPackage.ABSTRACT_VARIABLE:
            return validateAbstractVariable((AbstractVariable) value, diagnostics, context);
         case PatternsPackage.CONSTRAINT:
            return validateConstraint((Constraint) value, diagnostics, context);
         case PatternsPackage.ABSTRACT_LINK_VARIABLE:
            return validateAbstractLinkVariable((AbstractLinkVariable) value, diagnostics, context);
         case PatternsPackage.LINK_CONSTRAINT:
            return validateLinkConstraint((LinkConstraint) value, diagnostics, context);
         case PatternsPackage.ATTRIBUTE_ASSIGNMENT:
            return validateAttributeAssignment((AttributeAssignment) value, diagnostics, context);
         case PatternsPackage.OBJECT_SET_VARIABLE:
            return validateObjectSetVariable((ObjectSetVariable) value, diagnostics, context);
         case PatternsPackage.PRIMITIVE_VARIABLE:
            return validatePrimitiveVariable((PrimitiveVariable) value, diagnostics, context);
         case PatternsPackage.PATH:
            return validatePath((Path) value, diagnostics, context);
         case PatternsPackage.LINK_VARIABLE:
            return validateLinkVariable((LinkVariable) value, diagnostics, context);
         case PatternsPackage.CONTAINMENT_RELATION:
            return validateContainmentRelation((ContainmentRelation) value, diagnostics, context);
         case PatternsPackage.MATCHING_PATTERN:
            return validateMatchingPattern((MatchingPattern) value, diagnostics, context);
         case PatternsPackage.CONTAINER_VARIABLE:
            return validateContainerVariable((ContainerVariable) value, diagnostics, context);
         case PatternsPackage.STORY_PATTERN:
            return validateStoryPattern((StoryPattern) value, diagnostics, context);
         case PatternsPackage.BINDING_STATE:
            return validateBindingState((BindingState) value, diagnostics, context);
         case PatternsPackage.BINDING_SEMANTICS:
            return validateBindingSemantics((BindingSemantics) value, diagnostics, context);
         case PatternsPackage.BINDING_OPERATOR:
            return validateBindingOperator((BindingOperator) value, diagnostics, context);
         case PatternsPackage.LINK_CONSTRAINT_TYPE:
            return validateLinkConstraintType((LinkConstraintType) value, diagnostics, context);
         default:
            return true;
      }
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public boolean validateAttributeAssignment (AttributeAssignment attributeAssignment, DiagnosticChain diagnostics,
                                               Map<Object, Object> context)
   {
      return validate_EveryDefaultConstraint(attributeAssignment, diagnostics, context);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public boolean validateObjectVariable (ObjectVariable objectVariable, DiagnosticChain diagnostics,
                                          Map<Object, Object> context)
   {
      return validate_EveryDefaultConstraint(objectVariable, diagnostics, context);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean validateAbstractVariable (AbstractVariable abstractVariable, DiagnosticChain diagnostics,
                                            Map<Object, Object> context)
   {
      return validate_EveryDefaultConstraint(abstractVariable, diagnostics, context);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public boolean validateAbstractLinkVariable (AbstractLinkVariable abstractLinkVariable, DiagnosticChain diagnostics,
                                                Map<Object, Object> context)
   {
      return validate_EveryDefaultConstraint(abstractLinkVariable, diagnostics, context);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public boolean validateLinkConstraint (LinkConstraint linkConstraint, DiagnosticChain diagnostics,
                                          Map<Object, Object> context)
   {
      return validate_EveryDefaultConstraint(linkConstraint, diagnostics, context);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public boolean validateConstraint (Constraint constraint, DiagnosticChain diagnostics, Map<Object, Object> context)
   {
      return validate_EveryDefaultConstraint(constraint, diagnostics, context);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public boolean validatePath (Path path, DiagnosticChain diagnostics, Map<Object, Object> context)
   {
      return validate_EveryDefaultConstraint(path, diagnostics, context);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public boolean validateLinkVariable (LinkVariable linkVariable, DiagnosticChain diagnostics,
                                        Map<Object, Object> context)
   {
      return validate_EveryDefaultConstraint(linkVariable, diagnostics, context);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public boolean validateContainmentRelation (ContainmentRelation containmentRelation, DiagnosticChain diagnostics,
                                               Map<Object, Object> context)
   {
      return validate_EveryDefaultConstraint(containmentRelation, diagnostics, context);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public boolean validateMatchingPattern (MatchingPattern matchingPattern, DiagnosticChain diagnostics,
                                           Map<Object, Object> context)
   {
      if (!validate_NoCircularContainment(matchingPattern, diagnostics, context))
         return false;
      boolean result = validate_EveryMultiplicityConforms(matchingPattern, diagnostics, context);
      if (result || diagnostics != null)
         result &= validate_EveryDataValueConforms(matchingPattern, diagnostics, context);
      if (result || diagnostics != null)
         result &= validate_EveryReferenceIsContained(matchingPattern, diagnostics, context);
      if (result || diagnostics != null)
         result &= validate_EveryBidirectionalReferenceIsPaired(matchingPattern, diagnostics, context);
      if (result || diagnostics != null)
         result &= validate_EveryProxyResolves(matchingPattern, diagnostics, context);
      if (result || diagnostics != null)
         result &= validate_UniqueID(matchingPattern, diagnostics, context);
      if (result || diagnostics != null)
         result &= validate_EveryKeyUnique(matchingPattern, diagnostics, context);
      if (result || diagnostics != null)
         result &= validate_EveryMapEntryUnique(matchingPattern, diagnostics, context);
      if (result || diagnostics != null)
         result &= validateMatchingPattern_NoModifierInMatchingPattern(matchingPattern, diagnostics, context);
      return result;
   }

   /**
    * Validates the NoModifierInMatchingPattern constraint of '<em>Matching Pattern</em>'.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public boolean validateMatchingPattern_NoModifierInMatchingPattern (MatchingPattern matchingPattern,
                                                                       DiagnosticChain diagnostics,
                                                                       Map<Object, Object> context)
   {
      return matchingPattern.NoModifierInMatchingPattern(diagnostics, context);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean validatePrimitiveVariable (PrimitiveVariable primitiveVariable, DiagnosticChain diagnostics,
                                             Map<Object, Object> context)
   {
      return validate_EveryDefaultConstraint(primitiveVariable, diagnostics, context);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean validateContainerVariable (ContainerVariable containerVariable, DiagnosticChain diagnostics,
                                             Map<Object, Object> context)
   {
      return validate_EveryDefaultConstraint(containerVariable, diagnostics, context);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public boolean validateObjectSetVariable (ObjectSetVariable objectSetVariable, DiagnosticChain diagnostics,
                                             Map<Object, Object> context)
   {
      return validate_EveryDefaultConstraint(objectSetVariable, diagnostics, context);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public boolean validateStoryPattern (StoryPattern storyPattern, DiagnosticChain diagnostics,
                                        Map<Object, Object> context)
   {
      return validate_EveryDefaultConstraint(storyPattern, diagnostics, context);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public boolean validateBindingState (BindingState bindingState, DiagnosticChain diagnostics,
                                        Map<Object, Object> context)
   {
      return true;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public boolean validateBindingSemantics (BindingSemantics bindingSemantics, DiagnosticChain diagnostics,
                                            Map<Object, Object> context)
   {
      return true;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public boolean validateBindingOperator (BindingOperator bindingOperator, DiagnosticChain diagnostics,
                                           Map<Object, Object> context)
   {
      return true;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public boolean validateLinkConstraintType (LinkConstraintType linkConstraintType, DiagnosticChain diagnostics,
                                              Map<Object, Object> context)
   {
      return true;
   }

   /**
    * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   @Override
   public ResourceLocator getResourceLocator ()
   {
      // TODO
      // Specialize this to return a resource locator for messages specific to this validator.
      // Ensure that you remove @generated or mark it @generated NOT
      return super.getResourceLocator();
   }

} // PatternsValidator
