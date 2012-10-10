/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.calls.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.storydriven.modeling.calls.*;
import org.storydriven.modeling.calls.CallsFactory;
import org.storydriven.modeling.calls.CallsPackage;
import org.storydriven.modeling.calls.OpaqueCallable;
import org.storydriven.modeling.calls.ParameterBinding;
import org.storydriven.modeling.calls.ParameterExtension;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * @generated
 */
public class CallsFactoryImpl extends EFactoryImpl implements CallsFactory
{
   /**
    * Creates the default factory implementation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public static CallsFactory init ()
   {
      try
      {
         CallsFactory theCallsFactory = (CallsFactory) EPackage.Registry.INSTANCE
            .getEFactory("http://ns.storydriven.org/sdm/calls/0.1.0");
         if (theCallsFactory != null)
         {
            return theCallsFactory;
         }
      }
      catch (Exception exception)
      {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new CallsFactoryImpl();
   }

   /**
    * Creates an instance of the factory.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public CallsFactoryImpl ()
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
         case CallsPackage.PARAMETER_BINDING:
            return createParameterBinding();
         case CallsPackage.OPAQUE_CALLABLE:
            return createOpaqueCallable();
         case CallsPackage.PARAMETER_EXTENSION:
            return createParameterExtension();
         default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
      }
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public ParameterBinding createParameterBinding ()
   {
      ParameterBindingImpl parameterBinding = new ParameterBindingImpl();
      return parameterBinding;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public OpaqueCallable createOpaqueCallable ()
   {
      OpaqueCallableImpl opaqueCallable = new OpaqueCallableImpl();
      return opaqueCallable;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public ParameterExtension createParameterExtension ()
   {
      ParameterExtensionImpl parameterExtension = new ParameterExtensionImpl();
      return parameterExtension;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public CallsPackage getCallsPackage ()
   {
      return (CallsPackage) getEPackage();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @deprecated
    * @generated
    */
   @Deprecated
   public static CallsPackage getPackage ()
   {
      return CallsPackage.eINSTANCE;
   }

} // CallsFactoryImpl
