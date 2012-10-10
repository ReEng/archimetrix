/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.patterns;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Matching Pattern</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A MatchingPattern is a special kind of story pattern that does not change the underlying graph. Thus, no contained object or link may carry an create or destroy BindingOperator.
 * <!-- end-model-doc -->
 *
 *
 * @see org.storydriven.modeling.patterns.PatternsPackage#getMatchingPattern()
 * @model
 * @generated
 */
public interface MatchingPattern extends StoryPattern
{
   /**
    * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> self.objectVariable->forAll(v:ObjectVariable | v.modifier = Modifier::NONE) and
    * self.linkVariable->forAll(v:LinkVariable | v.modifier = Modifier::NONE)
    * 
    * @param diagnostics The chain of diagnostics to which problems are to be appended.
    * @param context The cache of context-specific information. <!-- end-model-doc -->
    * @model annotation=
    *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.objectVariable->forAll(v:ObjectVariable | v.modifier = Modifier::NONE) and self.linkVariable->forAll(v:LinkVariable | v.modifier = Modifier::NONE)'"
    * @generated
    */
   boolean NoModifierInMatchingPattern (DiagnosticChain diagnostics, Map<Object, Object> context);

} // MatchingPattern
