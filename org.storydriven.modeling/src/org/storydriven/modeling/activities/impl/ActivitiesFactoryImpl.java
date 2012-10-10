/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.activities.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.storydriven.modeling.activities.*;
import org.storydriven.modeling.activities.ActivitiesFactory;
import org.storydriven.modeling.activities.ActivitiesPackage;
import org.storydriven.modeling.activities.Activity;
import org.storydriven.modeling.activities.ActivityCallNode;
import org.storydriven.modeling.activities.ActivityEdge;
import org.storydriven.modeling.activities.EdgeGuard;
import org.storydriven.modeling.activities.ExceptionVariable;
import org.storydriven.modeling.activities.JunctionNode;
import org.storydriven.modeling.activities.MatchingStoryNode;
import org.storydriven.modeling.activities.ModifyingStoryNode;
import org.storydriven.modeling.activities.OperationExtension;
import org.storydriven.modeling.activities.StartNode;
import org.storydriven.modeling.activities.StatementNode;
import org.storydriven.modeling.activities.StopNode;
import org.storydriven.modeling.activities.StructuredNode;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * @generated
 */
public class ActivitiesFactoryImpl extends EFactoryImpl implements ActivitiesFactory
{
   /**
    * Creates the default factory implementation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public static ActivitiesFactory init ()
   {
      try
      {
         ActivitiesFactory theActivitiesFactory = (ActivitiesFactory) EPackage.Registry.INSTANCE
            .getEFactory("http://ns.storydriven.org/sdm/activities/0.1.0");
         if (theActivitiesFactory != null)
         {
            return theActivitiesFactory;
         }
      }
      catch (Exception exception)
      {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new ActivitiesFactoryImpl();
   }

   /**
    * Creates an instance of the factory.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public ActivitiesFactoryImpl ()
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
         case ActivitiesPackage.EXCEPTION_VARIABLE:
            return createExceptionVariable();
         case ActivitiesPackage.ACTIVITY_EDGE:
            return createActivityEdge();
         case ActivitiesPackage.ACTIVITY:
            return createActivity();
         case ActivitiesPackage.OPERATION_EXTENSION:
            return createOperationExtension();
         case ActivitiesPackage.MATCHING_STORY_NODE:
            return createMatchingStoryNode();
         case ActivitiesPackage.STRUCTURED_NODE:
            return createStructuredNode();
         case ActivitiesPackage.JUNCTION_NODE:
            return createJunctionNode();
         case ActivitiesPackage.START_NODE:
            return createStartNode();
         case ActivitiesPackage.STATEMENT_NODE:
            return createStatementNode();
         case ActivitiesPackage.STOP_NODE:
            return createStopNode();
         case ActivitiesPackage.ACTIVITY_CALL_NODE:
            return createActivityCallNode();
         case ActivitiesPackage.MODIFYING_STORY_NODE:
            return createModifyingStoryNode();
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
         case ActivitiesPackage.EDGE_GUARD:
            return createEdgeGuardFromString(eDataType, initialValue);
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
         case ActivitiesPackage.EDGE_GUARD:
            return convertEdgeGuardToString(eDataType, instanceValue);
         default:
            throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
      }
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public Activity createActivity ()
   {
      ActivityImpl activity = new ActivityImpl();
      return activity;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public ActivityEdge createActivityEdge ()
   {
      ActivityEdgeImpl activityEdge = new ActivityEdgeImpl();
      return activityEdge;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public ExceptionVariable createExceptionVariable ()
   {
      ExceptionVariableImpl exceptionVariable = new ExceptionVariableImpl();
      return exceptionVariable;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public StructuredNode createStructuredNode ()
   {
      StructuredNodeImpl structuredNode = new StructuredNodeImpl();
      return structuredNode;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public OperationExtension createOperationExtension ()
   {
      OperationExtensionImpl operationExtension = new OperationExtensionImpl();
      return operationExtension;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public JunctionNode createJunctionNode ()
   {
      JunctionNodeImpl junctionNode = new JunctionNodeImpl();
      return junctionNode;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public StartNode createStartNode ()
   {
      StartNodeImpl startNode = new StartNodeImpl();
      return startNode;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public StatementNode createStatementNode ()
   {
      StatementNodeImpl statementNode = new StatementNodeImpl();
      return statementNode;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public StopNode createStopNode ()
   {
      StopNodeImpl stopNode = new StopNodeImpl();
      return stopNode;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public ActivityCallNode createActivityCallNode ()
   {
      ActivityCallNodeImpl activityCallNode = new ActivityCallNodeImpl();
      return activityCallNode;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public MatchingStoryNode createMatchingStoryNode ()
   {
      MatchingStoryNodeImpl matchingStoryNode = new MatchingStoryNodeImpl();
      return matchingStoryNode;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public ModifyingStoryNode createModifyingStoryNode ()
   {
      ModifyingStoryNodeImpl modifyingStoryNode = new ModifyingStoryNodeImpl();
      return modifyingStoryNode;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EdgeGuard createEdgeGuardFromString (EDataType eDataType, String initialValue)
   {
      EdgeGuard result = EdgeGuard.get(initialValue);
      if (result == null)
         throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
            + eDataType.getName() + "'");
      return result;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public String convertEdgeGuardToString (EDataType eDataType, Object instanceValue)
   {
      return instanceValue == null ? null : instanceValue.toString();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public ActivitiesPackage getActivitiesPackage ()
   {
      return (ActivitiesPackage) getEPackage();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @deprecated
    * @generated
    */
   @Deprecated
   public static ActivitiesPackage getPackage ()
   {
      return ActivitiesPackage.eINSTANCE;
   }

} // ActivitiesFactoryImpl
