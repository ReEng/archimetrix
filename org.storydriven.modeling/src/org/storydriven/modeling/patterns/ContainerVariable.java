/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.patterns;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents a single container, e.g. a Set or List. ContainmentRelations can be used to add or remove objects to or from this container.
 * Every Constraint or AttributeAssignment can use the variable as a container (e.g., "set->size() > 5").
 * <!-- end-model-doc -->
 *
 *
 * @see org.storydriven.modeling.patterns.PatternsPackage#getContainerVariable()
 * @model
 * @generated
 */
public interface ContainerVariable extends ObjectVariable
{
} // ContainerVariable
