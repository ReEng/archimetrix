/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.calls.impl;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.storydriven.modeling.calls.CallsPackage;
import org.storydriven.modeling.calls.OpaqueCallable;
import org.storydriven.modeling.calls.util.CallsValidator;
import org.storydriven.modeling.impl.ExtendableElementOperations;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations related to '<em><b>Opaque Callable</b></em>' model objects. <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.storydriven.modeling.calls.OpaqueCallable#NumberOfOutParams(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Number Of Out Params</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OpaqueCallableOperations extends ExtendableElementOperations
{
   /**
    * The cached environment for evaluating OCL expressions.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   protected static final OCL EOCL_ENV = OCL.newInstance();

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   protected OpaqueCallableOperations ()
   {
      super();
   }

   /**
    * The cached OCL expression body for the '{@link #NumberOfOutParams(OpaqueCallable, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Number Of Out Params</em>}' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #NumberOfOutParams(OpaqueCallable, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
    * @generated
    * @ordered
    */
   protected static final String NUMBER_OF_OUT_PARAMS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.oclAsType(Callable).out->size() <= 1";

   /**
    * The cached OCL invariant for the '{@link #NumberOfOutParams(OpaqueCallable, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Number Of Out Params</em>}' invariant operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #NumberOfOutParams(OpaqueCallable, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
    * @generated
    * @ordered
    */
   protected static Constraint NUMBER_OF_OUT_PARAMS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> self.oclAsType(Callable).out->size() <= 1
    * 
    * @param opaqueCallable The receiving '<em><b>Opaque Callable</b></em>' model object.
    * @param diagnostics The chain of diagnostics to which problems are to be appended.
    * @param context The cache of context-specific information. <!-- end-model-doc -->
    * @generated
    */
   public static boolean NumberOfOutParams (OpaqueCallable opaqueCallable, DiagnosticChain diagnostics,
                                            Map<Object, Object> context)
   {
      if (NUMBER_OF_OUT_PARAMS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
      {
         OCL.Helper helper = EOCL_ENV.createOCLHelper();
         helper.setContext(CallsPackage.Literals.OPAQUE_CALLABLE);
         try
         {
            NUMBER_OF_OUT_PARAMS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper
               .createInvariant(NUMBER_OF_OUT_PARAMS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
         }
         catch (ParserException pe)
         {
            throw new UnsupportedOperationException(pe.getLocalizedMessage());
         }
      }
      if (!EOCL_ENV.createQuery(NUMBER_OF_OUT_PARAMS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(opaqueCallable))
      {
         if (diagnostics != null)
         {
            diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR, CallsValidator.DIAGNOSTIC_SOURCE,
               CallsValidator.OPAQUE_CALLABLE__NUMBER_OF_OUT_PARAMS, org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
                  .getString("_UI_GenericInvariant_diagnostic", new Object[] {"NumberOfOutParams",
                        org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(opaqueCallable, context)}),
               new Object[] {opaqueCallable}));
         }
         return false;
      }
      return true;
   }

} // OpaqueCallableOperations