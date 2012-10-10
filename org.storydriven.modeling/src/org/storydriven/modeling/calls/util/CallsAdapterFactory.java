/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.calls.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.storydriven.modeling.CommentableElement;
import org.storydriven.modeling.ExtendableElement;
import org.storydriven.modeling.Extension;
import org.storydriven.modeling.TypedElement;
import org.storydriven.modeling.Variable;
import org.storydriven.modeling.calls.*;
import org.storydriven.modeling.calls.Callable;
import org.storydriven.modeling.calls.CallsPackage;
import org.storydriven.modeling.calls.Invocation;
import org.storydriven.modeling.calls.OpaqueCallable;
import org.storydriven.modeling.calls.ParameterBinding;
import org.storydriven.modeling.calls.ParameterExtension;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides an adapter <code>createXXX</code> method for each class of the model. <!-- end-user-doc -->
 * @see org.storydriven.modeling.calls.CallsPackage
 * @generated
 */
public class CallsAdapterFactory extends AdapterFactoryImpl
{
   /**
    * The cached model package.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   protected static CallsPackage modelPackage;

   /**
    * Creates an instance of the adapter factory.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public CallsAdapterFactory ()
   {
      if (modelPackage == null)
      {
         modelPackage = CallsPackage.eINSTANCE;
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
   protected CallsSwitch<Adapter> modelSwitch = new CallsSwitch<Adapter>()
   {
      @Override
      public Adapter caseInvocation (Invocation object)
      {
         return createInvocationAdapter();
      }

      @Override
      public Adapter caseParameterBinding (ParameterBinding object)
      {
         return createParameterBindingAdapter();
      }

      @Override
      public Adapter caseOpaqueCallable (OpaqueCallable object)
      {
         return createOpaqueCallableAdapter();
      }

      @Override
      public Adapter caseParameterExtension (ParameterExtension object)
      {
         return createParameterExtensionAdapter();
      }

      @Override
      public Adapter caseCallable (Callable object)
      {
         return createCallableAdapter();
      }

      @Override
      public Adapter caseExtendableElement (ExtendableElement object)
      {
         return createExtendableElementAdapter();
      }

      @Override
      public Adapter caseCommentableElement (CommentableElement object)
      {
         return createCommentableElementAdapter();
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
      public Adapter caseExtension (Extension object)
      {
         return createExtensionAdapter();
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
    * Creates a new adapter for an object of class '{@link org.storydriven.modeling.calls.ParameterBinding <em>Parameter Binding</em>}'.
    * <!-- begin-user-doc --> This default
    * implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.storydriven.modeling.calls.ParameterBinding
    * @generated
    */
   public Adapter createParameterBindingAdapter ()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.storydriven.modeling.calls.OpaqueCallable <em>Opaque Callable</em>}'.
    * <!-- begin-user-doc --> This default
    * implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.storydriven.modeling.calls.OpaqueCallable
    * @generated
    */
   public Adapter createOpaqueCallableAdapter ()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.storydriven.modeling.calls.ParameterExtension <em>Parameter Extension</em>}'.
    * <!-- begin-user-doc --> This default
    * implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.storydriven.modeling.calls.ParameterExtension
    * @generated
    */
   public Adapter createParameterExtensionAdapter ()
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
    * Creates a new adapter for the default case.
    * <!-- begin-user-doc --> This default implementation returns null. <!-- end-user-doc -->
    * @return the new adapter.
    * @generated
    */
   public Adapter createEObjectAdapter ()
   {
      return null;
   }

} // CallsAdapterFactory
