/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Named Element</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abstract super class for all meta-model elements that carry a name. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.storydriven.modeling.NamedElement#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.storydriven.modeling.SDMPackage#getNamedElement()
 * @model abstract="true"
 * @generated
 */
public interface NamedElement extends ExtendableElement
{
   /**
    * Returns the value of the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Name</em>' attribute isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * The name attribute of a meta-model element.
    * <!-- end-model-doc -->
    * @return the value of the '<em>Name</em>' attribute.
    * @see #setName(String)
    * @see org.storydriven.modeling.SDMPackage#getNamedElement_Name()
    * @model required="true" ordered="false"
    * @generated
    */
   String getName ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.NamedElement#getName <em>Name</em>}' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @param value the new value of the '<em>Name</em>' attribute.
    * @see #getName()
    * @generated
    */
   void setName (String value);

} // NamedElement
