/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.fujaba.commons.identifier;

import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents the root element for fujaba model elements. It provides the possibility to universal unique identify an element.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.fujaba.commons.identifier.Identifier#getId <em>Id</em>}</li>
 *   <li>{@link org.fujaba.commons.identifier.Identifier#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.fujaba.commons.identifier.IdentifierPackage#getIdentifier()
 * @model abstract="true"
 * @generated
 */
public interface Identifier extends EObject, EModelElement
{
   /**
    * Returns the value of the '<em><b>Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * This attribute delivers an UUID for the element which is set during the initialization.
    * <!-- end-model-doc -->
    * @return the value of the '<em>Id</em>' attribute.
    * @see #setId(String)
    * @see org.fujaba.commons.identifier.IdentifierPackage#getIdentifier_Id()
    * @model unique="false" id="true" required="true" ordered="false"
    * @generated
    */
   String getId();

   /**
    * Sets the value of the '{@link org.fujaba.commons.identifier.Identifier#getId <em>Id</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Id</em>' attribute.
    * @see #getId()
    * @generated
    */
   void setId(String value);

   /**
    * Returns the value of the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * This attribute is optional and can be used to name a model element.
    * <!-- end-model-doc -->
    * @return the value of the '<em>Name</em>' attribute.
    * @see #setName(String)
    * @see org.fujaba.commons.identifier.IdentifierPackage#getIdentifier_Name()
    * @model unique="false" ordered="false"
    * @generated
    */
   String getName();

   /**
    * Sets the value of the '{@link org.fujaba.commons.identifier.Identifier#getName <em>Name</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Name</em>' attribute.
    * @see #getName()
    * @generated
    */
   void setName(String value);

} // Identifier
