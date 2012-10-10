/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.activities.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
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
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides an adapter <code>createXXX</code> method for each class of the model. <!-- end-user-doc -->
 * @see org.storydriven.modeling.activities.ActivitiesPackage
 * @generated
 */
public class ActivitiesAdapterFactory extends AdapterFactoryImpl
{
   /**
    * The cached model package.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   protected static ActivitiesPackage modelPackage;

   /**
    * Creates an instance of the adapter factory.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public ActivitiesAdapterFactory ()
   {
      if (modelPackage == null)
      {
         modelPackage = ActivitiesPackage.eINSTANCE;
      }
   }

   /**
    * Returns whether this factory is applicable for the type of the object.
    * <!-- begin-user-doc --> This implementation returns <code>true</code> if the object is either the
    * model's package or is an instance object of the model. <!-- end-user-doc -->
    * @return whether this factory is applicable for the type of the object.
    * @generated
    */
   @Override
   public boolean isFactoryForType (Object object)
   {
      if (object == modelPackage)
      {
         return true;
      }
      if (object instanceof EObject)
      {
         return ((EObject) object).eClass().getEPackage() == modelPackage;
      }
      return false;
   }

   /**
    * The switch that delegates to the <code>createXXX</code> methods.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   protected ActivitiesSwitch<Adapter> modelSwitch = new ActivitiesSwitch<Adapter>()
   {
      @Override
      public Adapter caseExceptionVariable (ExceptionVariable object)
      {
         return createExceptionVariableAdapter();
      }

      @Override
      public Adapter caseActivityEdge (ActivityEdge object)
      {
         return createActivityEdgeAdapter();
      }

      @Override
      public Adapter caseActivityNode (ActivityNode object)
      {
         return createActivityNodeAdapter();
      }

      @Override
      public Adapter caseActivity (Activity object)
      {
         return createActivityAdapter();
      }

      @Override
      public Adapter caseOperationExtension (OperationExtension object)
      {
         return createOperationExtensionAdapter();
      }

      @Override
      public Adapter caseMatchingStoryNode (MatchingStoryNode object)
      {
         return createMatchingStoryNodeAdapter();
      }

      @Override
      public Adapter caseStoryNode (StoryNode object)
      {
         return createStoryNodeAdapter();
      }

      @Override
      public Adapter caseStructuredNode (StructuredNode object)
      {
         return createStructuredNodeAdapter();
      }

      @Override
      public Adapter caseJunctionNode (JunctionNode object)
      {
         return createJunctionNodeAdapter();
      }

      @Override
      public Adapter caseStartNode (StartNode object)
      {
         return createStartNodeAdapter();
      }

      @Override
      public Adapter caseStatementNode (StatementNode object)
      {
         return createStatementNodeAdapter();
      }

      @Override
      public Adapter caseStopNode (StopNode object)
      {
         return createStopNodeAdapter();
      }

      @Override
      public Adapter caseActivityCallNode (ActivityCallNode object)
      {
         return createActivityCallNodeAdapter();
      }

      @Override
      public Adapter caseModifyingStoryNode (ModifyingStoryNode object)
      {
         return createModifyingStoryNodeAdapter();
      }

      @Override
      public Adapter caseExtendableElement (ExtendableElement object)
      {
         return createExtendableElementAdapter();
      }

      @Override
      public Adapter caseTypedElement (TypedElement object)
      {
         return createTypedElementAdapter();
      }

      @Override
      public Adapter caseVariable (Variable object)
      {
         return createVariableAdapter();
      }

      @Override
      public Adapter caseNamedElement (NamedElement object)
      {
         return createNamedElementAdapter();
      }

      @Override
      public Adapter caseCommentableElement (CommentableElement object)
      {
         return createCommentableElementAdapter();
      }

      @Override
      public Adapter caseCallable (Callable object)
      {
         return createCallableAdapter();
      }

      @Override
      public Adapter caseExtension (Extension object)
      {
         return createExtensionAdapter();
      }

      @Override
      public Adapter caseInvocation (Invocation object)
      {
         return createInvocationAdapter();
      }

      @Override
      public Adapter defaultCase (EObject object)
      {
         return createEObjectAdapter();
      }
   };

   /**
    * Creates an adapter for the <code>target</code>.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @param target the object to adapt.
    * @return the adapter for the <code>target</code>.
    * @generated
    */
   @Override
   public Adapter createAdapter (Notifier target)
   {
      return modelSwitch.doSwitch((EObject) target);
   }

   /**
    * Creates a new adapter for an object of class '{@link org.storydriven.modeling.activities.Activity <em>Activity</em>}'.
    * <!-- begin-user-doc --> This default implementation
    * returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.storydriven.modeling.activities.Activity
    * @generated
    */
   public Adapter createActivityAdapter ()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.storydriven.modeling.activities.ActivityNode <em>Activity Node</em>}'.
    * <!-- begin-user-doc --> This default
    * implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.storydriven.modeling.activities.ActivityNode
    * @generated
    */
   public Adapter createActivityNodeAdapter ()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.storydriven.modeling.activities.ActivityEdge <em>Activity Edge</em>}'.
    * <!-- begin-user-doc --> This default
    * implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.storydriven.modeling.activities.ActivityEdge
    * @generated
    */
   public Adapter createActivityEdgeAdapter ()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.storydriven.modeling.activities.ExceptionVariable <em>Exception Variable</em>}'.
    * <!-- begin-user-doc --> This default
    * implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.storydriven.modeling.activities.ExceptionVariable
    * @generated
    */
   public Adapter createExceptionVariableAdapter ()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.storydriven.modeling.activities.StructuredNode <em>Structured Node</em>}'.
    * <!-- begin-user-doc --> This default
    * implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.storydriven.modeling.activities.StructuredNode
    * @generated
    */
   public Adapter createStructuredNodeAdapter ()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.storydriven.modeling.activities.OperationExtension <em>Operation Extension</em>}'.
    * <!-- begin-user-doc --> This
    * default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.storydriven.modeling.activities.OperationExtension
    * @generated
    */
   public Adapter createOperationExtensionAdapter ()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.storydriven.modeling.activities.StoryNode <em>Story Node</em>}'.
    * <!-- begin-user-doc --> This default implementation
    * returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.storydriven.modeling.activities.StoryNode
    * @generated
    */
   public Adapter createStoryNodeAdapter ()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.storydriven.modeling.activities.JunctionNode <em>Junction Node</em>}'.
    * <!-- begin-user-doc --> This default
    * implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.storydriven.modeling.activities.JunctionNode
    * @generated
    */
   public Adapter createJunctionNodeAdapter ()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.storydriven.modeling.activities.StartNode <em>Start Node</em>}'.
    * <!-- begin-user-doc --> This default implementation
    * returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.storydriven.modeling.activities.StartNode
    * @generated
    */
   public Adapter createStartNodeAdapter ()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.storydriven.modeling.activities.StatementNode <em>Statement Node</em>}'.
    * <!-- begin-user-doc --> This default
    * implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.storydriven.modeling.activities.StatementNode
    * @generated
    */
   public Adapter createStatementNodeAdapter ()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.storydriven.modeling.activities.StopNode <em>Stop Node</em>}'.
    * <!-- begin-user-doc --> This default implementation
    * returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.storydriven.modeling.activities.StopNode
    * @generated
    */
   public Adapter createStopNodeAdapter ()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.storydriven.modeling.activities.ActivityCallNode <em>Activity Call Node</em>}'.
    * <!-- begin-user-doc --> This default
    * implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.storydriven.modeling.activities.ActivityCallNode
    * @generated
    */
   public Adapter createActivityCallNodeAdapter ()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.storydriven.modeling.activities.MatchingStoryNode <em>Matching Story Node</em>}'.
    * <!-- begin-user-doc --> This
    * default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.storydriven.modeling.activities.MatchingStoryNode
    * @generated
    */
   public Adapter createMatchingStoryNodeAdapter ()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.storydriven.modeling.activities.ModifyingStoryNode <em>Modifying Story Node</em>}'.
    * <!-- begin-user-doc --> This
    * default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.storydriven.modeling.activities.ModifyingStoryNode
    * @generated
    */
   public Adapter createModifyingStoryNodeAdapter ()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.storydriven.modeling.ExtendableElement <em>Extendable Element</em>}'.
    * <!-- begin-user-doc --> This default
    * implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.storydriven.modeling.ExtendableElement
    * @generated
    */
   public Adapter createExtendableElementAdapter ()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.storydriven.modeling.CommentableElement <em>Commentable Element</em>}'.
    * <!-- begin-user-doc --> This default
    * implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.storydriven.modeling.CommentableElement
    * @generated
    */
   public Adapter createCommentableElementAdapter ()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.storydriven.modeling.calls.Callable <em>Callable</em>}'.
    * <!-- begin-user-doc --> This default implementation returns
    * null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.storydriven.modeling.calls.Callable
    * @generated
    */
   public Adapter createCallableAdapter ()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.storydriven.modeling.NamedElement <em>Named Element</em>}'.
    * <!-- begin-user-doc --> This default implementation
    * returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.storydriven.modeling.NamedElement
    * @generated
    */
   public Adapter createNamedElementAdapter ()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.storydriven.modeling.TypedElement <em>Typed Element</em>}'.
    * <!-- begin-user-doc --> This default implementation
    * returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.storydriven.modeling.TypedElement
    * @generated
    */
   public Adapter createTypedElementAdapter ()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.storydriven.modeling.Variable <em>Variable</em>}'.
    * <!-- begin-user-doc --> This default implementation returns null
    * so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.storydriven.modeling.Variable
    * @generated
    */
   public Adapter createVariableAdapter ()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.storydriven.modeling.Extension <em>Extension</em>}'.
    * <!-- begin-user-doc --> This default implementation returns null
    * so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.storydriven.modeling.Extension
    * @generated
    */
   public Adapter createExtensionAdapter ()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.storydriven.modeling.calls.Invocation <em>Invocation</em>}'.
    * <!-- begin-user-doc --> This default implementation
    * returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.storydriven.modeling.calls.Invocation
    * @generated
    */
   public Adapter createInvocationAdapter ()
   {
      return null;
   }

   /**
    * Creates a new adapter for the default case.
    * <!-- begin-user-doc --> This default implementation returns null. <!-- end-user-doc -->
    * @return the new adapter.
    * @generated
    */
   public Adapter createEObjectAdapter ()
   {
      return null;
   }

} // ActivitiesAdapterFactory
