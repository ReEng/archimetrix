/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.fujaba.commons.notation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Absolute Bend Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents bend points positioned absolutely.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.fujaba.commons.notation.AbsoluteBendPoint#getX <em>X</em>}</li>
 *   <li>{@link org.fujaba.commons.notation.AbsoluteBendPoint#getY <em>Y</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.fujaba.commons.notation.NotationPackage#getAbsoluteBendPoint()
 * @model
 * @generated
 */
public interface AbsoluteBendPoint extends BendPoint
{
   /**
    * Returns the value of the '<em><b>X</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * The absolute X-coordinate of the bend point.
    * <!-- end-model-doc -->
    * @return the value of the '<em>X</em>' attribute.
    * @see #setX(int)
    * @see org.fujaba.commons.notation.NotationPackage#getAbsoluteBendPoint_X()
    * @model unique="false" required="true" ordered="false"
    * @generated
    */
   int getX();

   /**
    * Sets the value of the '{@link org.fujaba.commons.notation.AbsoluteBendPoint#getX <em>X</em>}' attribute.
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
    * The absolute Y-coordinate of the bend point.
    * <!-- end-model-doc -->
    * @return the value of the '<em>Y</em>' attribute.
    * @see #setY(int)
    * @see org.fujaba.commons.notation.NotationPackage#getAbsoluteBendPoint_Y()
    * @model unique="false" required="true" ordered="false"
    * @generated
    */
   int getY();

   /**
    * Sets the value of the '{@link org.fujaba.commons.notation.AbsoluteBendPoint#getY <em>Y</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Y</em>' attribute.
    * @see #getY()
    * @generated
    */
   void setY(int value);

} // AbsoluteBendPoint
