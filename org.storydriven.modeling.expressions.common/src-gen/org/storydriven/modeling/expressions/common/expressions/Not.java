/**
 * <copyright>
 * </copyright>
 *

 */
package org.storydriven.modeling.expressions.common.expressions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Not</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.storydriven.modeling.expressions.common.expressions.Not#getNot <em>Not</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.storydriven.modeling.expressions.common.expressions.ExpressionsPackage#getNot()
 * @model
 * @generated
 */
public interface Not extends LExpression
{
  /**
   * Returns the value of the '<em><b>Not</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Not</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Not</em>' containment reference.
   * @see #setNot(LExpression)
   * @see org.storydriven.modeling.expressions.common.expressions.ExpressionsPackage#getNot_Not()
   * @model containment="true"
   * @generated
   */
  LExpression getNot();

  /**
   * Sets the value of the '{@link org.storydriven.modeling.expressions.common.expressions.Not#getNot <em>Not</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Not</em>' containment reference.
   * @see #getNot()
   * @generated
   */
  void setNot(LExpression value);

} // Not
