/**
 * <copyright>
 * </copyright>
 *

 */
package org.storydriven.modeling.expressions.pathExpressions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Explicit Path Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.storydriven.modeling.expressions.pathExpressions.ExplicitPathDescription#getAssociationName <em>Association Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.storydriven.modeling.expressions.pathExpressions.PathExpressionsPackage#getExplicitPathDescription()
 * @model
 * @generated
 */
public interface ExplicitPathDescription extends PathSegmentDescription
{
  /**
   * Returns the value of the '<em><b>Association Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Association Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Association Name</em>' attribute.
   * @see #setAssociationName(String)
   * @see org.storydriven.modeling.expressions.pathExpressions.PathExpressionsPackage#getExplicitPathDescription_AssociationName()
   * @model
   * @generated
   */
  String getAssociationName();

  /**
   * Sets the value of the '{@link org.storydriven.modeling.expressions.pathExpressions.ExplicitPathDescription#getAssociationName <em>Association Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Association Name</em>' attribute.
   * @see #getAssociationName()
   * @generated
   */
  void setAssociationName(String value);

} // ExplicitPathDescription
