/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.activities.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.storydriven.modeling.activities.*;
import org.storydriven.modeling.activities.ActivitiesPackage;
import org.storydriven.modeling.activities.Activity;
import org.storydriven.modeling.activities.ActivityCallNode;
import org.storydriven.modeling.activities.ActivityEdge;
import org.storydriven.modeling.activities.ActivityNode;
import org.storydriven.modeling.activities.EdgeGuard;
import org.storydriven.modeling.activities.ExceptionVariable;
import org.storydriven.modeling.activities.JunctionNode;
import org.storydriven.modeling.activities.MatchingStoryNode;
import org.storydriven.modeling.activities.ModifyingStoryNode;
import org.storydriven.modeling.activities.OperationExtension;
import org.storydriven.modeling.activities.StartNode;
import org.storydriven.modeling.activities.StatementNode;
import org.storydriven.modeling.activities.StopNode;
import org.storydriven.modeling.activities.StoryNode;
import org.storydriven.modeling.activities.StructuredNode;

/**
 * <!-- begin-user-doc --> The <b>Validator</b> for the model. <!-- end-user-doc -->
 * @see org.storydriven.modeling.activities.ActivitiesPackage
 * @generated
 */
public class ActivitiesValidator extends EObjectValidator
{
   /**
    * The cached model package
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public static final ActivitiesValidator INSTANCE = new ActivitiesValidator();

   /**
    * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see org.eclipse.emf.common.util.Diagnostic#getSource()
    * @see org.eclipse.emf.common.util.Diagnostic#getCode()
    * @generated
    */
   public static final String DIAGNOSTIC_SOURCE = "org.storydriven.modeling.activities";

   /**
    * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Number Of Out Params' of 'Operation Extension'. <!-- begin-user-doc --> <!-- end-user-doc
    * -->
    * 
    * @generated
    */
   public static final int OPERATION_EXTENSION__NUMBER_OF_OUT_PARAMS = 1;

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
   public ActivitiesValidator ()
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
      return ActivitiesPackage.eINSTANCE;
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
         case ActivitiesPackage.EXCEPTION_VARIABLE:
            return validateExceptionVariable((ExceptionVariable) value, diagnostics, context);
         case ActivitiesPackage.ACTIVITY_EDGE:
            return validateActivityEdge((ActivityEdge) value, diagnostics, context);
         case ActivitiesPackage.ACTIVITY_NODE:
            return validateActivityNode((ActivityNode) value, diagnostics, context);
         case ActivitiesPackage.ACTIVITY:
            return validateActivity((Activity) value, diagnostics, context);
         case ActivitiesPackage.OPERATION_EXTENSION:
            return validateOperationExtension((OperationExtension) value, diagnostics, context);
         case ActivitiesPackage.MATCHING_STORY_NODE:
            return validateMatchingStoryNode((MatchingStoryNode) value, diagnostics, context);
         case ActivitiesPackage.STORY_NODE:
            return validateStoryNode((StoryNode) value, diagnostics, context);
         case ActivitiesPackage.STRUCTURED_NODE:
            return validateStructuredNode((StructuredNode) value, diagnostics, context);
         case ActivitiesPackage.JUNCTION_NODE:
            return validateJunctionNode((JunctionNode) value, diagnostics, context);
         case ActivitiesPackage.START_NODE:
            return validateStartNode((StartNode) value, diagnostics, context);
         case ActivitiesPackage.STATEMENT_NODE:
            return validateStatementNode((StatementNode) value, diagnostics, context);
         case ActivitiesPackage.STOP_NODE:
            return validateStopNode((StopNode) value, diagnostics, context);
         case ActivitiesPackage.ACTIVITY_CALL_NODE:
            return validateActivityCallNode((ActivityCallNode) value, diagnostics, context);
         case ActivitiesPackage.MODIFYING_STORY_NODE:
            return validateModifyingStoryNode((ModifyingStoryNode) value, diagnostics, context);
         case ActivitiesPackage.EDGE_GUARD:
            return validateEdgeGuard((EdgeGuard) value, diagnostics, context);
         default:
            return true;
      }
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public boolean validateActivity (Activity activity, DiagnosticChain diagnostics, Map<Object, Object> context)
   {
      return validate_EveryDefaultConstraint(activity, diagnostics, context);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public boolean validateActivityNode (ActivityNode activityNode, DiagnosticChain diagnostics,
                                        Map<Object, Object> context)
   {
      return validate_EveryDefaultConstraint(activityNode, diagnostics, context);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public boolean validateActivityEdge (ActivityEdge activityEdge, DiagnosticChain diagnostics,
                                        Map<Object, Object> context)
   {
      return validate_EveryDefaultConstraint(activityEdge, diagnostics, context);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public boolean validateExceptionVariable (ExceptionVariable exceptionVariable, DiagnosticChain diagnostics,
                                             Map<Object, Object> context)
   {
      return validate_EveryDefaultConstraint(exceptionVariable, diagnostics, context);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public boolean validateStructuredNode (StructuredNode structuredNode, DiagnosticChain diagnostics,
                                          Map<Object, Object> context)
   {
      return validate_EveryDefaultConstraint(structuredNode, diagnostics, context);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public boolean validateOperationExtension (OperationExtension operationExtension, DiagnosticChain diagnostics,
                                              Map<Object, Object> context)
   {
      if (!validate_NoCircularContainment(operationExtension, diagnostics, context))
         return false;
      boolean result = validate_EveryMultiplicityConforms(operationExtension, diagnostics, context);
      if (result || diagnostics != null)
         result &= validate_EveryDataValueConforms(operationExtension, diagnostics, context);
      if (result || diagnostics != null)
         result &= validate_EveryReferenceIsContained(operationExtension, diagnostics, context);
      if (result || diagnostics != null)
         result &= validate_EveryBidirectionalReferenceIsPaired(operationExtension, diagnostics, context);
      if (result || diagnostics != null)
         result &= validate_EveryProxyResolves(operationExtension, diagnostics, context);
      if (result || diagnostics != null)
         result &= validate_UniqueID(operationExtension, diagnostics, context);
      if (result || diagnostics != null)
         result &= validate_EveryKeyUnique(operationExtension, diagnostics, context);
      if (result || diagnostics != null)
         result &= validate_EveryMapEntryUnique(operationExtension, diagnostics, context);
      if (result || diagnostics != null)
         result &= validateOperationExtension_NumberOfOutParams(operationExtension, diagnostics, context);
      return result;
   }

   /**
    * Validates the NumberOfOutParams constraint of '<em>Operation Extension</em>'.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public boolean validateOperationExtension_NumberOfOutParams (OperationExtension operationExtension,
                                                                DiagnosticChain diagnostics, Map<Object, Object> context)
   {
      return operationExtension.NumberOfOutParams(diagnostics, context);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public boolean validateStoryNode (StoryNode storyNode, DiagnosticChain diagnostics, Map<Object, Object> context)
   {
      return validate_EveryDefaultConstraint(storyNode, diagnostics, context);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public boolean validateJunctionNode (JunctionNode junctionNode, DiagnosticChain diagnostics,
                                        Map<Object, Object> context)
   {
      return validate_EveryDefaultConstraint(junctionNode, diagnostics, context);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public boolean validateStartNode (StartNode startNode, DiagnosticChain diagnostics, Map<Object, Object> context)
   {
      return validate_EveryDefaultConstraint(startNode, diagnostics, context);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public boolean validateStatementNode (StatementNode statementNode, DiagnosticChain diagnostics,
                                         Map<Object, Object> context)
   {
      return validate_EveryDefaultConstraint(statementNode, diagnostics, context);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public boolean validateStopNode (StopNode stopNode, DiagnosticChain diagnostics, Map<Object, Object> context)
   {
      return validate_EveryDefaultConstraint(stopNode, diagnostics, context);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public boolean validateActivityCallNode (ActivityCallNode activityCallNode, DiagnosticChain diagnostics,
                                            Map<Object, Object> context)
   {
      return validate_EveryDefaultConstraint(activityCallNode, diagnostics, context);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public boolean validateMatchingStoryNode (MatchingStoryNode matchingStoryNode, DiagnosticChain diagnostics,
                                             Map<Object, Object> context)
   {
      return validate_EveryDefaultConstraint(matchingStoryNode, diagnostics, context);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public boolean validateModifyingStoryNode (ModifyingStoryNode modifyingStoryNode, DiagnosticChain diagnostics,
                                              Map<Object, Object> context)
   {
      return validate_EveryDefaultConstraint(modifyingStoryNode, diagnostics, context);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public boolean validateEdgeGuard (EdgeGuard edgeGuard, DiagnosticChain diagnostics, Map<Object, Object> context)
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

} // ActivitiesValidator
