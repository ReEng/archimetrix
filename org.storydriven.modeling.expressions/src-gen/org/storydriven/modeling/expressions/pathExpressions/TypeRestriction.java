/**
 * <copyright>
 * </copyright>
 *

 */
package org.storydriven.modeling.expressions.pathExpressions;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Restriction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.storydriven.modeling.expressions.pathExpressions.TypeRestriction#isForbidden <em>Forbidden</em>}</li>
 *   <li>{@link org.storydriven.modeling.expressions.pathExpressions.TypeRestriction#getTypeName <em>Type Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.storydriven.modeling.expressions.pathExpressions.PathExpressionsPackage#getTypeRestriction()
 * @model
 * @generated
 */
public interface TypeRestriction extends EObject
{
  /**
   * Returns the value of the '<em><b>Forbidden</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Forbidden</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Forbidden</em>' attribute.
   * @see #setForbidden(boolean)
   * @see org.storydriven.modeling.expressions.pathExpressions.PathExpressionsPackage#getTypeRestriction_Forbidden()
   * @model
   * @generated
   */
  boolean isForbidden();

  /**
   * Sets the value of the '{@link org.storydriven.modeling.expressions.pathExpressions.TypeRestriction#isForbidden <em>Forbidden</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Forbidden</em>' attribute.
   * @see #isForbidden()
   * @generated
   */
  void setForbidden(boolean value);

  /**
   * Returns the value of the '<em><b>Type Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Name</em>' attribute.
   * @see #setTypeName(String)
   * @see org.storydriven.modeling.expressions.pathExpressions.PathExpressionsPackage#getTypeRestriction_TypeName()
   * @model
   * @generated
   */
  String getTypeName();

  /**
   * Sets the value of the '{@link org.storydriven.modeling.expressions.pathExpressions.TypeRestriction#getTypeName <em>Type Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Name</em>' attribute.
   * @see #getTypeName()
   * @generated
   */
  void setTypeName(String value);

} // TypeRestriction
