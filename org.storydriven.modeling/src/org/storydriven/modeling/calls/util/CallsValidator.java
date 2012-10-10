/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.calls.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.storydriven.modeling.calls.*;
import org.storydriven.modeling.calls.Callable;
import org.storydriven.modeling.calls.CallsPackage;
import org.storydriven.modeling.calls.Invocation;
import org.storydriven.modeling.calls.OpaqueCallable;
import org.storydriven.modeling.calls.ParameterBinding;
import org.storydriven.modeling.calls.ParameterExtension;

/**
 * <!-- begin-user-doc --> The <b>Validator</b> for the model. <!-- end-user-doc -->
 * @see org.storydriven.modeling.calls.CallsPackage
 * @generated
 */
public class CallsValidator extends EObjectValidator
{
   /**
    * The cached model package
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public static final CallsValidator INSTANCE = new CallsValidator();

   /**
    * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see org.eclipse.emf.common.util.Diagnostic#getSource()
    * @see org.eclipse.emf.common.util.Diagnostic#getCode()
    * @generated
    */
   public static final String DIAGNOSTIC_SOURCE = "org.storydriven.modeling.calls";

   /**
    * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Number Of Out Params' of 'Opaque Callable'.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public static final int OPAQUE_CALLABLE__NUMBER_OF_OUT_PARAMS = 1;

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
   public CallsValidator ()
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
      return CallsPackage.eINSTANCE;
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
         case CallsPackage.INVOCATION:
            return validateInvocation((Invocation) value, diagnostics, context);
         case CallsPackage.PARAMETER_BINDING:
            return validateParameterBinding((ParameterBinding) value, diagnostics, context);
         case CallsPackage.OPAQUE_CALLABLE:
            return validateOpaqueCallable((OpaqueCallable) value, diagnostics, context);
         case CallsPackage.PARAMETER_EXTENSION:
            return validateParameterExtension((ParameterExtension) value, diagnostics, context);
         case CallsPackage.CALLABLE:
            return validateCallable((Callable) value, diagnostics, context);
         default:
            return true;
      }
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public boolean validateInvocation (Invocation invocation, DiagnosticChain diagnostics, Map<Object, Object> context)
   {
      return validate_EveryDefaultConstraint(invocation, diagnostics, context);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public boolean validateParameterBinding (ParameterBinding parameterBinding, DiagnosticChain diagnostics,
                                            Map<Object, Object> context)
   {
      return validate_EveryDefaultConstraint(parameterBinding, diagnostics, context);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public boolean validateOpaqueCallable (OpaqueCallable opaqueCallable, DiagnosticChain diagnostics,
                                          Map<Object, Object> context)
   {
      if (!validate_NoCircularContainment(opaqueCallable, diagnostics, context))
         return false;
      boolean result = validate_EveryMultiplicityConforms(opaqueCallable, diagnostics, context);
      if (result || diagnostics != null)
         result &= validate_EveryDataValueConforms(opaqueCallable, diagnostics, context);
      if (result || diagnostics != null)
         result &= validate_EveryReferenceIsContained(opaqueCallable, diagnostics, context);
      if (result || diagnostics != null)
         result &= validate_EveryBidirectionalReferenceIsPaired(opaqueCallable, diagnostics, context);
      if (result || diagnostics != null)
         result &= validate_EveryProxyResolves(opaqueCallable, diagnostics, context);
      if (result || diagnostics != null)
         result &= validate_UniqueID(opaqueCallable, diagnostics, context);
      if (result || diagnostics != null)
         result &= validate_EveryKeyUnique(opaqueCallable, diagnostics, context);
      if (result || diagnostics != null)
         result &= validate_EveryMapEntryUnique(opaqueCallable, diagnostics, context);
      if (result || diagnostics != null)
         result &= validateOpaqueCallable_NumberOfOutParams(opaqueCallable, diagnostics, context);
      return result;
   }

   /**
    * Validates the NumberOfOutParams constraint of '<em>Opaque Callable</em>'.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public boolean validateOpaqueCallable_NumberOfOutParams (OpaqueCallable opaqueCallable, DiagnosticChain diagnostics,
                                                            Map<Object, Object> context)
   {
      return opaqueCallable.NumberOfOutParams(diagnostics, context);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public boolean validateParameterExtension (ParameterExtension parameterExtension, DiagnosticChain diagnostics,
                                              Map<Object, Object> context)
   {
      return validate_EveryDefaultConstraint(parameterExtension, diagnostics, context);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public boolean validateCallable (Callable callable, DiagnosticChain diagnostics, Map<Object, Object> context)
   {
      return validate_EveryDefaultConstraint(callable, diagnostics, context);
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

} // CallsValidator
