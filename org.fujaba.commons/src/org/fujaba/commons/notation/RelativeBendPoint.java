/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.fujaba.commons.notation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relative Bend Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents bend points positioned relatively to the source and target node.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.fujaba.commons.notation.RelativeBendPoint#getSourceX <em>Source X</em>}</li>
 *   <li>{@link org.fujaba.commons.notation.RelativeBendPoint#getSourceY <em>Source Y</em>}</li>
 *   <li>{@link org.fujaba.commons.notation.RelativeBendPoint#getTargetX <em>Target X</em>}</li>
 *   <li>{@link org.fujaba.commons.notation.RelativeBendPoint#getTargetY <em>Target Y</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.fujaba.commons.notation.NotationPackage#getRelativeBendPoint()
 * @model
 * @generated
 */
public interface RelativeBendPoint extends BendPoint
{
   /**
    * Returns the value of the '<em><b>Source X</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * The source relative X-coordinate of the bend point.
    * <!-- end-model-doc -->
    * @return the value of the '<em>Source X</em>' attribute.
    * @see #setSourceX(int)
    * @see org.fujaba.commons.notation.NotationPackage#getRelativeBendPoint_SourceX()
    * @model unique="false" required="true" ordered="false"
    * @generated
    */
   int getSourceX();

   /**
    * Sets the value of the '{@link org.fujaba.commons.notation.RelativeBendPoint#getSourceX <em>Source X</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Source X</em>' attribute.
    * @see #getSourceX()
    * @generated
    */
   void setSourceX(int value);

   /**
    * Returns the value of the '<em><b>Source Y</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * The source relative Y-coordinate of the bend point.
    * <!-- end-model-doc -->
    * @return the value of the '<em>Source Y</em>' attribute.
    * @see #setSourceY(int)
    * @see org.fujaba.commons.notation.NotationPackage#getRelativeBendPoint_SourceY()
    * @model unique="false" required="true" ordered="false"
    * @generated
    */
   int getSourceY();

   /**
    * Sets the value of the '{@link org.fujaba.commons.notation.RelativeBendPoint#getSourceY <em>Source Y</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Source Y</em>' attribute.
    * @see #getSourceY()
    * @generated
    */
   void setSourceY(int value);

   /**
    * Returns the value of the '<em><b>Target X</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * The target relative X-coordinate of the bend point.
    * <!-- end-model-doc -->
    * @return the value of the '<em>Target X</em>' attribute.
    * @see #setTargetX(int)
    * @see org.fujaba.commons.notation.NotationPackage#getRelativeBendPoint_TargetX()
    * @model unique="false" required="true" ordered="false"
    * @generated
    */
   int getTargetX();

   /**
    * Sets the value of the '{@link org.fujaba.commons.notation.RelativeBendPoint#getTargetX <em>Target X</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Target X</em>' attribute.
    * @see #getTargetX()
    * @generated
    */
   void setTargetX(int value);

   /**
    * Returns the value of the '<em><b>Target Y</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * The target relative Y-coordinate of the bend point.
    * <!-- end-model-doc -->
    * @return the value of the '<em>Target Y</em>' attribute.
    * @see #setTargetY(int)
    * @see org.fujaba.commons.notation.NotationPackage#getRelativeBendPoint_TargetY()
    * @model unique="false" required="true" ordered="false"
    * @generated
    */
   int getTargetY();

   /**
    * Sets the value of the '{@link org.fujaba.commons.notation.RelativeBendPoint#getTargetY <em>Target Y</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Target Y</em>' attribute.
    * @see #getTargetY()
    * @generated
    */
   void setTargetY(int value);

} // RelativeBendPoint
