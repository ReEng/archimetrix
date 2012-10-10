/**
 * <copyright>
 * </copyright>
 *

 */
package org.storydriven.modeling.expressions.pathExpressions;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.storydriven.modeling.expressions.pathExpressions.PathExpressionsPackage
 * @generated
 */
public interface PathExpressionsFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PathExpressionsFactory eINSTANCE = org.storydriven.modeling.expressions.pathExpressions.impl.PathExpressionsFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Path Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Path Expression</em>'.
   * @generated
   */
  PathExpression createPathExpression();

  /**
   * Returns a new object of class '<em>Path</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Path</em>'.
   * @generated
   */
  Path createPath();

  /**
   * Returns a new object of class '<em>Path Segment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Path Segment</em>'.
   * @generated
   */
  PathSegment createPathSegment();

  /**
   * Returns a new object of class '<em>Path Segment Description</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Path Segment Description</em>'.
   * @generated
   */
  PathSegmentDescription createPathSegmentDescription();

  /**
   * Returns a new object of class '<em>Restriction List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Restriction List</em>'.
   * @generated
   */
  RestrictionList createRestrictionList();

  /**
   * Returns a new object of class '<em>Implicit Path Description</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Implicit Path Description</em>'.
   * @generated
   */
  ImplicitPathDescription createImplicitPathDescription();

  /**
   * Returns a new object of class '<em>Explicit Path Description</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Explicit Path Description</em>'.
   * @generated
   */
  ExplicitPathDescription createExplicitPathDescription();

  /**
   * Returns a new object of class '<em>Type Restriction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Restriction</em>'.
   * @generated
   */
  TypeRestriction createTypeRestriction();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  PathExpressionsPackage getPathExpressionsPackage();

} //PathExpressionsFactory
