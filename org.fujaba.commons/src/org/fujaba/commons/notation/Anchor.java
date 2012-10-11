/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.fujaba.commons.notation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Anchor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents (absolute) anchor points of an edge.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.fujaba.commons.notation.Anchor#getX <em>X</em>}</li>
 *   <li>{@link org.fujaba.commons.notation.Anchor#getY <em>Y</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.fujaba.commons.notation.NotationPackage#getAnchor()
 * @model
 * @generated
 */
public interface Anchor extends EObject
{
   /**
    * Returns the value of the '<em><b>X</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * The X-coordinate of the anchor.
    * <!-- end-model-doc -->
    * @return the value of the '<em>X</em>' attribute.
    * @see #setX(int)
    * @see org.fujaba.commons.notation.NotationPackage#getAnchor_X()
    * @model unique="false" required="true" ordered="false"
    * @generated
    */
   int getX();

   /**
    * Sets the value of the '{@link org.fujaba.commons.notation.Anchor#getX <em>X</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>X</em>' attribute.
    * @see #getX()
    * @generated
    */
   void setX(int value);

   /**
    * Returns the value of the '<em><b>Y</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * The Y-coordinate of the anchor.
    * <!-- end-model-doc -->
    * @return the value of the '<em>Y</em>' attribute.
    * @see #setY(int)
    * @see org.fujaba.commons.notation.NotationPackage#getAnchor_Y()
    * @model unique="false" required="true" ordered="false"
    * @generated
    */
   int getY();

   /**
    * Sets the value of the '{@link org.fujaba.commons.notation.Anchor#getY <em>Y</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Y</em>' attribute.
    * @see #getY()
    * @generated
    */
   void setY(int value);

} // Anchor
