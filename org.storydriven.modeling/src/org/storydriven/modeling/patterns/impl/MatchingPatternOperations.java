/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.patterns.impl;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.storydriven.modeling.impl.ExtendableElementOperations;
import org.storydriven.modeling.patterns.MatchingPattern;
import org.storydriven.modeling.patterns.PatternsPackage;
import org.storydriven.modeling.patterns.util.PatternsValidator;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations related to '<em><b>Matching Pattern</b></em>' model objects. <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.storydriven.modeling.patterns.MatchingPattern#NoModifierInMatchingPattern(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>No Modifier In Matching Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MatchingPatternOperations extends ExtendableElementOperations
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
   protected MatchingPatternOperations ()
   {
      super();
   }

   /**
    * The cached OCL expression body for the '{@link #NoModifierInMatchingPattern(MatchingPattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>No Modifier In Matching Pattern</em>}' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #NoModifierInMatchingPattern(MatchingPattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
    * @generated
    * @ordered
    */
   protected static final String NO_MODIFIER_IN_MATCHING_PATTERN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.objectVariable->forAll(v:ObjectVariable | v.modifier = Modifier::NONE) and self.linkVariable->forAll(v:LinkVariable | v.modifier = Modifier::NONE)";

   /**
    * The cached OCL invariant for the '{@link #NoModifierInMatchingPattern(MatchingPattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>No Modifier In Matching Pattern</em>}' invariant operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #NoModifierInMatchingPattern(MatchingPattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
    * @generated
    * @ordered
    */
   protected static Constraint NO_MODIFIER_IN_MATCHING_PATTERN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> self.objectVariable->forAll(v:ObjectVariable | v.modifier = Modifier::NONE) and
    * self.linkVariable->forAll(v:LinkVariable | v.modifier = Modifier::NONE)
    * 
    * @param matchingPattern The receiving '<em><b>Matching Pattern</b></em>' model object.
    * @param diagnostics The chain of diagnostics to which problems are to be appended.
    * @param context The cache of context-specific information. <!-- end-model-doc -->
    * @generated
    */
   public static boolean NoModifierInMatchingPattern (MatchingPattern matchingPattern, DiagnosticChain diagnostics,
                                                      Map<Object, Object> context)
   {
      if (NO_MODIFIER_IN_MATCHING_PATTERN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
      {
         OCL.Helper helper = EOCL_ENV.createOCLHelper();
         helper.setContext(PatternsPackage.Literals.MATCHING_PATTERN);
         try
         {
            NO_MODIFIER_IN_MATCHING_PATTERN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper
               .createInvariant(NO_MODIFIER_IN_MATCHING_PATTERN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
         }
         catch (ParserException pe)
         {
            throw new UnsupportedOperationException(pe.getLocalizedMessage());
         }
      }
      if (!EOCL_ENV.createQuery(NO_MODIFIER_IN_MATCHING_PATTERN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(matchingPattern))
      {
         if (diagnostics != null)
         {
            diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR, PatternsValidator.DIAGNOSTIC_SOURCE,
               PatternsValidator.MATCHING_PATTERN__NO_MODIFIER_IN_MATCHING_PATTERN,
               org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
                  "_UI_GenericInvariant_diagnostic",
                  new Object[] {"NoModifierInMatchingPattern",
                        org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(matchingPattern, context)}),
               new Object[] {matchingPattern}));
         }
         return false;
      }
      return true;
   }

} // MatchingPatternOperations