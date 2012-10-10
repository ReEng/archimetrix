/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.patterns;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Object Set Variable</b></em>'. <!-- end-user-doc --> <!-- begin-model-doc --> Represents a set of objects.
 * The context for contained Constraints and AttributeAssignments is a single object (e.g., "name = 'abc'"). After the set has been computed by the pattern matching, every other
 * Constraints or AttributeAssignment can use the ObjectSetVariable as a set (e.g., "osv1->size()"). <!-- end-model-doc -->
 * 
 * @see org.storydriven.modeling.patterns.PatternsPackage#getObjectSetVariable()
 * @model
 * @generated
 */
public interface ObjectSetVariable extends ObjectVariable
{
} // ObjectSetVariable
