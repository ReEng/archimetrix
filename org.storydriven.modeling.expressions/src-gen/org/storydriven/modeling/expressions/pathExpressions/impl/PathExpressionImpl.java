/**
 * <copyright>
 * </copyright>
 *

 */
package org.storydriven.modeling.expressions.pathExpressions.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.storydriven.modeling.expressions.pathExpressions.Path;
import org.storydriven.modeling.expressions.pathExpressions.PathExpression;
import org.storydriven.modeling.expressions.pathExpressions.PathExpressionsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Path Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.storydriven.modeling.expressions.pathExpressions.impl.PathExpressionImpl#getPathAlternatives <em>Path Alternatives</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PathExpressionImpl extends MinimalEObjectImpl.Container implements PathExpression
{
  /**
   * The cached value of the '{@link #getPathAlternatives() <em>Path Alternatives</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPathAlternatives()
   * @generated
   * @ordered
   */
  protected EList<Path> pathAlternatives;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PathExpressionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return PathExpressionsPackage.Literals.PATH_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Path> getPathAlternatives()
  {
    if (pathAlternatives == null)
    {
      pathAlternatives = new EObjectContainmentEList<Path>(Path.class, this, PathExpressionsPackage.PATH_EXPRESSION__PATH_ALTERNATIVES);
    }
    return pathAlternatives;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case PathExpressionsPackage.PATH_EXPRESSION__PATH_ALTERNATIVES:
        return ((InternalEList<?>)getPathAlternatives()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case PathExpressionsPackage.PATH_EXPRESSION__PATH_ALTERNATIVES:
        return getPathAlternatives();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PathExpressionsPackage.PATH_EXPRESSION__PATH_ALTERNATIVES:
        getPathAlternatives().clear();
        getPathAlternatives().addAll((Collection<? extends Path>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case PathExpressionsPackage.PATH_EXPRESSION__PATH_ALTERNATIVES:
        getPathAlternatives().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case PathExpressionsPackage.PATH_EXPRESSION__PATH_ALTERNATIVES:
        return pathAlternatives != null && !pathAlternatives.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //PathExpressionImpl
