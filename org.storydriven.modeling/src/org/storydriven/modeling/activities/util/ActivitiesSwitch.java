/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.activities.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.storydriven.modeling.CommentableElement;
import org.storydriven.modeling.ExtendableElement;
import org.storydriven.modeling.Extension;
import org.storydriven.modeling.NamedElement;
import org.storydriven.modeling.TypedElement;
import org.storydriven.modeling.Variable;
import org.storydriven.modeling.activities.*;
import org.storydriven.modeling.activities.ActivitiesPackage;
import org.storydriven.modeling.activities.Activity;
import org.storydriven.modeling.activities.ActivityCallNode;
import org.storydriven.modeling.activities.ActivityEdge;
import org.storydriven.modeling.activities.ActivityNode;
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
import org.storydriven.modeling.calls.Callable;
import org.storydriven.modeling.calls.Invocation;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the call {@link #doSwitch(EObject) doSwitch(object)} to invoke the
 * <code>caseXXX</code> method for each class of the model, starting with the actual class of the object and proceeding up the inheritance hierarchy until a non-null result is
 * returned, which is the result of the switch. <!-- end-user-doc -->
 * @see org.storydriven.modeling.activities.ActivitiesPackage
 * @generated
 */
public class ActivitiesSwitch<T>
{
   /**
    * The cached model package
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   protected static ActivitiesPackage modelPackage;

   /**
    * Creates an instance of the switch.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public ActivitiesSwitch ()
   {
      if (modelPackage == null)
      {
         modelPackage = ActivitiesPackage.eINSTANCE;
      }
   }

   /**
    * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return the first non-null result returned by a <code>caseXXX</code> call.
    * @generated
    */
   public T doSwitch (EObject theEObject)
   {
      return doSwitch(theEObject.eClass(), theEObject);
   }

   /**
    * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return the first non-null result returned by a <code>caseXXX</code> call.
    * @generated
    */
   protected T doSwitch (EClass theEClass, EObject theEObject)
   {
      if (theEClass.eContainer() == modelPackage)
      {
         return doSwitch(theEClass.getClassifierID(), theEObject);
      }
      else
      {
         List<EClass> eSuperTypes = theEClass.getESuperTypes();
         return eSuperTypes.isEmpty() ? defaultCase(theEObject) : doSwitch(eSuperTypes.get(0), theEObject);
      }
   }

   /**
    * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return the first non-null result returned by a <code>caseXXX</code> call.
    * @generated
    */
   protected T doSwitch (int classifierID, EObject theEObject)
   {
      switch (classifierID)
      {
         case ActivitiesPackage.EXCEPTION_VARIABLE:
         {
            ExceptionVariable exceptionVariable = (ExceptionVariable) theEObject;
            T result = caseExceptionVariable(exceptionVariable);
            if (result == null)
               result = caseVariable(exceptionVariable);
            if (result == null)
               result = caseTypedElement(exceptionVariable);
            if (result == null)
               result = caseExtendableElement(exceptionVariable);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case ActivitiesPackage.ACTIVITY_EDGE:
         {
            ActivityEdge activityEdge = (ActivityEdge) theEObject;
            T result = caseActivityEdge(activityEdge);
            if (result == null)
               result = caseExtendableElement(activityEdge);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case ActivitiesPackage.ACTIVITY_NODE:
         {
            ActivityNode activityNode = (ActivityNode) theEObject;
            T result = caseActivityNode(activityNode);
            if (result == null)
               result = caseNamedElement(activityNode);
            if (result == null)
               result = caseCommentableElement(activityNode);
            if (result == null)
               result = caseExtendableElement(activityNode);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case ActivitiesPackage.ACTIVITY:
         {
            Activity activity = (Activity) theEObject;
            T result = caseActivity(activity);
            if (result == null)
               result = caseCallable(activity);
            if (result == null)
               result = caseCommentableElement(activity);
            if (result == null)
               result = caseExtendableElement(activity);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case ActivitiesPackage.OPERATION_EXTENSION:
         {
            OperationExtension operationExtension = (OperationExtension) theEObject;
            T result = caseOperationExtension(operationExtension);
            if (result == null)
               result = caseExtension(operationExtension);
            if (result == null)
               result = caseCallable(operationExtension);
            if (result == null)
               result = caseCommentableElement(operationExtension);
            if (result == null)
               result = caseExtendableElement(operationExtension);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case ActivitiesPackage.MATCHING_STORY_NODE:
         {
            MatchingStoryNode matchingStoryNode = (MatchingStoryNode) theEObject;
            T result = caseMatchingStoryNode(matchingStoryNode);
            if (result == null)
               result = caseStoryNode(matchingStoryNode);
            if (result == null)
               result = caseActivityNode(matchingStoryNode);
            if (result == null)
               result = caseNamedElement(matchingStoryNode);
            if (result == null)
               result = caseCommentableElement(matchingStoryNode);
            if (result == null)
               result = caseExtendableElement(matchingStoryNode);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case ActivitiesPackage.STORY_NODE:
         {
            StoryNode storyNode = (StoryNode) theEObject;
            T result = caseStoryNode(storyNode);
            if (result == null)
               result = caseActivityNode(storyNode);
            if (result == null)
               result = caseNamedElement(storyNode);
            if (result == null)
               result = caseCommentableElement(storyNode);
            if (result == null)
               result = caseExtendableElement(storyNode);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case ActivitiesPackage.STRUCTURED_NODE:
         {
            StructuredNode structuredNode = (StructuredNode) theEObject;
            T result = caseStructuredNode(structuredNode);
            if (result == null)
               result = caseActivityNode(structuredNode);
            if (result == null)
               result = caseNamedElement(structuredNode);
            if (result == null)
               result = caseCommentableElement(structuredNode);
            if (result == null)
               result = caseExtendableElement(structuredNode);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case ActivitiesPackage.JUNCTION_NODE:
         {
            JunctionNode junctionNode = (JunctionNode) theEObject;
            T result = caseJunctionNode(junctionNode);
            if (result == null)
               result = caseActivityNode(junctionNode);
            if (result == null)
               result = caseNamedElement(junctionNode);
            if (result == null)
               result = caseCommentableElement(junctionNode);
            if (result == null)
               result = caseExtendableElement(junctionNode);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case ActivitiesPackage.START_NODE:
         {
            StartNode startNode = (StartNode) theEObject;
            T result = caseStartNode(startNode);
            if (result == null)
               result = caseActivityNode(startNode);
            if (result == null)
               result = caseNamedElement(startNode);
            if (result == null)
               result = caseCommentableElement(startNode);
            if (result == null)
               result = caseExtendableElement(startNode);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case ActivitiesPackage.STATEMENT_NODE:
         {
            StatementNode statementNode = (StatementNode) theEObject;
            T result = caseStatementNode(statementNode);
            if (result == null)
               result = caseActivityNode(statementNode);
            if (result == null)
               result = caseNamedElement(statementNode);
            if (result == null)
               result = caseCommentableElement(statementNode);
            if (result == null)
               result = caseExtendableElement(statementNode);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case ActivitiesPackage.STOP_NODE:
         {
            StopNode stopNode = (StopNode) theEObject;
            T result = caseStopNode(stopNode);
            if (result == null)
               result = caseActivityNode(stopNode);
            if (result == null)
               result = caseNamedElement(stopNode);
            if (result == null)
               result = caseCommentableElement(stopNode);
            if (result == null)
               result = caseExtendableElement(stopNode);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case ActivitiesPackage.ACTIVITY_CALL_NODE:
         {
            ActivityCallNode activityCallNode = (ActivityCallNode) theEObject;
            T result = caseActivityCallNode(activityCallNode);
            if (result == null)
               result = caseActivityNode(activityCallNode);
            if (result == null)
               result = caseInvocation(activityCallNode);
            if (result == null)
               result = caseNamedElement(activityCallNode);
            if (result == null)
               result = caseCommentableElement(activityCallNode);
            if (result == null)
               result = caseExtendableElement(activityCallNode);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case ActivitiesPackage.MODIFYING_STORY_NODE:
         {
            ModifyingStoryNode modifyingStoryNode = (ModifyingStoryNode) theEObject;
            T result = caseModifyingStoryNode(modifyingStoryNode);
            if (result == null)
               result = caseStoryNode(modifyingStoryNode);
            if (result == null)
               result = caseActivityNode(modifyingStoryNode);
            if (result == null)
               result = caseNamedElement(modifyingStoryNode);
            if (result == null)
               result = caseCommentableElement(modifyingStoryNode);
            if (result == null)
               result = caseExtendableElement(modifyingStoryNode);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         default:
            return defaultCase(theEObject);
      }
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Activity</em>'.
    * <!-- begin-user-doc --> This implementation returns null; returning a non-null result
    * will terminate the switch. <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Activity</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseActivity (Activity object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Activity Node</em>'.
    * <!-- begin-user-doc --> This implementation returns null; returning a non-null
    * result will terminate the switch. <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Activity Node</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseActivityNode (ActivityNode object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Activity Edge</em>'.
    * <!-- begin-user-doc --> This implementation returns null; returning a non-null
    * result will terminate the switch. <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Activity Edge</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseActivityEdge (ActivityEdge object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Exception Variable</em>'.
    * <!-- begin-user-doc --> This implementation returns null; returning a non-null
    * result will terminate the switch. <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Exception Variable</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseExceptionVariable (ExceptionVariable object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Structured Node</em>'.
    * <!-- begin-user-doc --> This implementation returns null; returning a non-null
    * result will terminate the switch. <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Structured Node</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseStructuredNode (StructuredNode object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Operation Extension</em>'.
    * <!-- begin-user-doc --> This implementation returns null; returning a non-null
    * result will terminate the switch. <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Operation Extension</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseOperationExtension (OperationExtension object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Story Node</em>'.
    * <!-- begin-user-doc --> This implementation returns null; returning a non-null result
    * will terminate the switch. <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Story Node</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseStoryNode (StoryNode object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Junction Node</em>'.
    * <!-- begin-user-doc --> This implementation returns null; returning a non-null
    * result will terminate the switch. <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Junction Node</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseJunctionNode (JunctionNode object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Start Node</em>'.
    * <!-- begin-user-doc --> This implementation returns null; returning a non-null result
    * will terminate the switch. <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Start Node</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseStartNode (StartNode object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Statement Node</em>'.
    * <!-- begin-user-doc --> This implementation returns null; returning a non-null
    * result will terminate the switch. <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Statement Node</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseStatementNode (StatementNode object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Stop Node</em>'.
    * <!-- begin-user-doc --> This implementation returns null; returning a non-null result
    * will terminate the switch. <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Stop Node</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseStopNode (StopNode object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Activity Call Node</em>'.
    * <!-- begin-user-doc --> This implementation returns null; returning a non-null
    * result will terminate the switch. <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Activity Call Node</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseActivityCallNode (ActivityCallNode object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Matching Story Node</em>'.
    * <!-- begin-user-doc --> This implementation returns null; returning a non-null
    * result will terminate the switch. <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Matching Story Node</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseMatchingStoryNode (MatchingStoryNode object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Modifying Story Node</em>'.
    * <!-- begin-user-doc --> This implementation returns null; returning a
    * non-null result will terminate the switch. <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Modifying Story Node</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseModifyingStoryNode (ModifyingStoryNode object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Extendable Element</em>'.
    * <!-- begin-user-doc --> This implementation returns null; returning a non-null
    * result will terminate the switch. <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Extendable Element</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseExtendableElement (ExtendableElement object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Commentable Element</em>'.
    * <!-- begin-user-doc --> This implementation returns null; returning a non-null
    * result will terminate the switch. <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Commentable Element</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseCommentableElement (CommentableElement object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Callable</em>'.
    * <!-- begin-user-doc --> This implementation returns null; returning a non-null result
    * will terminate the switch. <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Callable</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseCallable (Callable object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
    * <!-- begin-user-doc --> This implementation returns null; returning a non-null
    * result will terminate the switch. <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseNamedElement (NamedElement object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Typed Element</em>'.
    * <!-- begin-user-doc --> This implementation returns null; returning a non-null
    * result will terminate the switch. <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Typed Element</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseTypedElement (TypedElement object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
    * <!-- begin-user-doc --> This implementation returns null; returning a non-null result
    * will terminate the switch. <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseVariable (Variable object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Extension</em>'.
    * <!-- begin-user-doc --> This implementation returns null; returning a non-null result
    * will terminate the switch. <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Extension</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseExtension (Extension object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Invocation</em>'.
    * <!-- begin-user-doc --> This implementation returns null; returning a non-null result
    * will terminate the switch. <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Invocation</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseInvocation (Invocation object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
    * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
    * terminate the switch, but this is the last case anyway. <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject)
    * @generated
    */
   public T defaultCase (EObject object)
   {
      return null;
   }

} // ActivitiesSwitch
