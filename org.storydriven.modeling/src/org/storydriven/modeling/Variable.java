/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Variable</b></em>'. <!-- end-user-doc --> <!-- begin-model-doc --> Represents a variable which can be, for
 * example, an object variable, an attribute, or any other kind of variable. <!-- end-model-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.storydriven.modeling.Variable#getVariableName <em>Variable Name</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.storydriven.modeling.SDMPackage#getVariable()
 * @model abstract="true"
 * @generated
 */
public interface Variable extends TypedElement
{
   /**
    * Returns the value of the '<em><b>Variable Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Variable Name</em>' attribute isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Variable Name</em>' attribute.
    * @see org.storydriven.modeling.SDMPackage#getVariable_VariableName()
    * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
    * @generated
    */
   String getVariableName ();

} // Variable
