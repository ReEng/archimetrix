/**
 * <copyright>
 * </copyright>
 *

 */
package org.storydriven.modeling.expressions.common.expressions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Minus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.storydriven.modeling.expressions.common.expressions.Minus#getLeft <em>Left</em>}</li>
 *   <li>{@link org.storydriven.modeling.expressions.common.expressions.Minus#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.storydriven.modeling.expressions.common.expressions.ExpressionsPackage#getMinus()
 * @model
 * @generated
 */
public interface Minus extends AExpression
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(AExpression)
   * @see org.storydriven.modeling.expressions.common.expressions.ExpressionsPackage#getMinus_Left()
   * @model containment="true"
   * @generated
   */
  AExpression getLeft();

  /**
   * Sets the value of the '{@link org.storydriven.modeling.expressions.common.expressions.Minus#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(AExpression value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(AExpression)
   * @see org.storydriven.modeling.expressions.common.expressions.ExpressionsPackage#getMinus_Right()
   * @model containment="true"
   * @generated
   */
  AExpression getRight();

  /**
   * Sets the value of the '{@link org.storydriven.modeling.expressions.common.expressions.Minus#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(AExpression value);

} // Minus
