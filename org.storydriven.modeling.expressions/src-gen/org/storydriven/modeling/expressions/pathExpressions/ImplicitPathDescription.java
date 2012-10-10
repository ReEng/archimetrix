/**
 * <copyright>
 * </copyright>
 *

 */
package org.storydriven.modeling.expressions.pathExpressions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implicit Path Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.storydriven.modeling.expressions.pathExpressions.ImplicitPathDescription#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.storydriven.modeling.expressions.pathExpressions.PathExpressionsPackage#getImplicitPathDescription()
 * @model
 * @generated
 */
public interface ImplicitPathDescription extends PathSegmentDescription
{
  /**
   * Returns the value of the '<em><b>Kind</b></em>' attribute.
   * The literals are from the enumeration {@link org.storydriven.modeling.expressions.pathExpressions.ImplicitPathKind}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Kind</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Kind</em>' attribute.
   * @see org.storydriven.modeling.expressions.pathExpressions.ImplicitPathKind
   * @see #setKind(ImplicitPathKind)
   * @see org.storydriven.modeling.expressions.pathExpressions.PathExpressionsPackage#getImplicitPathDescription_Kind()
   * @model
   * @generated
   */
  ImplicitPathKind getKind();

  /**
   * Sets the value of the '{@link org.storydriven.modeling.expressions.pathExpressions.ImplicitPathDescription#getKind <em>Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Kind</em>' attribute.
   * @see org.storydriven.modeling.expressions.pathExpressions.ImplicitPathKind
   * @see #getKind()
   * @generated
   */
  void setKind(ImplicitPathKind value);

} // ImplicitPathDescription
