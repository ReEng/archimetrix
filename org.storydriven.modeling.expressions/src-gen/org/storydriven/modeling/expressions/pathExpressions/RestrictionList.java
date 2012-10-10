/**
 * <copyright>
 * </copyright>
 *

 */
package org.storydriven.modeling.expressions.pathExpressions;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Restriction List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.storydriven.modeling.expressions.pathExpressions.RestrictionList#getRestrictions <em>Restrictions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.storydriven.modeling.expressions.pathExpressions.PathExpressionsPackage#getRestrictionList()
 * @model
 * @generated
 */
public interface RestrictionList extends EObject
{
  /**
   * Returns the value of the '<em><b>Restrictions</b></em>' containment reference list.
   * The list contents are of type {@link org.storydriven.modeling.expressions.pathExpressions.TypeRestriction}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Restrictions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Restrictions</em>' containment reference list.
   * @see org.storydriven.modeling.expressions.pathExpressions.PathExpressionsPackage#getRestrictionList_Restrictions()
   * @model containment="true"
   * @generated
   */
  EList<TypeRestriction> getRestrictions();

} // RestrictionList
