/**
 * <copyright>
 * </copyright>
 *

 */
package org.storydriven.modeling.expressions.pathExpressions;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Path Segment Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.storydriven.modeling.expressions.pathExpressions.PathSegmentDescription#getRestrictionList <em>Restriction List</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.storydriven.modeling.expressions.pathExpressions.PathExpressionsPackage#getPathSegmentDescription()
 * @model
 * @generated
 */
public interface PathSegmentDescription extends EObject
{
  /**
   * Returns the value of the '<em><b>Restriction List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Restriction List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Restriction List</em>' containment reference.
   * @see #setRestrictionList(RestrictionList)
   * @see org.storydriven.modeling.expressions.pathExpressions.PathExpressionsPackage#getPathSegmentDescription_RestrictionList()
   * @model containment="true"
   * @generated
   */
  RestrictionList getRestrictionList();

  /**
   * Sets the value of the '{@link org.storydriven.modeling.expressions.pathExpressions.PathSegmentDescription#getRestrictionList <em>Restriction List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Restriction List</em>' containment reference.
   * @see #getRestrictionList()
   * @generated
   */
  void setRestrictionList(RestrictionList value);

} // PathSegmentDescription
