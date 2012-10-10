/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.patterns;

import org.eclipse.emf.ecore.EDataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents a variable that holds a value of a primitive type, e.g. integer, boolean, String.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.storydriven.modeling.patterns.PrimitiveVariable#getClassifier <em>Classifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.storydriven.modeling.patterns.PatternsPackage#getPrimitiveVariable()
 * @model
 * @generated
 */
public interface PrimitiveVariable extends AbstractVariable
{
   /**
    * Returns the value of the '<em><b>Classifier</b></em>' reference.
    * <p>
    * This feature subsets the following features:
    * <ul>
    *   <li>'{@link org.storydriven.modeling.TypedElement#getType() <em>Type</em>}'</li>
    * </ul>
    * </p>
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Classifier</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * The type of the primitive variable which must be an EDataType.
    * <!-- end-model-doc -->
    * @return the value of the '<em>Classifier</em>' reference.
    * @see #setClassifier(EDataType)
    * @see org.storydriven.modeling.patterns.PatternsPackage#getPrimitiveVariable_Classifier()
    * @model required="true" ordered="false"
    * @generated
    */
   EDataType getClassifier ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.patterns.PrimitiveVariable#getClassifier <em>Classifier</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Classifier</em>' reference.
    * @see #getClassifier()
    * @generated
    */
   void setClassifier (EDataType value);

} // PrimitiveVariable
