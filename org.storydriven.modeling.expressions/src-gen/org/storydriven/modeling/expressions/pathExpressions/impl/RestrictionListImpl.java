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

import org.storydriven.modeling.expressions.pathExpressions.PathExpressionsPackage;
import org.storydriven.modeling.expressions.pathExpressions.RestrictionList;
import org.storydriven.modeling.expressions.pathExpressions.TypeRestriction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Restriction List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.storydriven.modeling.expressions.pathExpressions.impl.RestrictionListImpl#getRestrictions <em>Restrictions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RestrictionListImpl extends MinimalEObjectImpl.Container implements RestrictionList
{
  /**
   * The cached value of the '{@link #getRestrictions() <em>Restrictions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRestrictions()
   * @generated
   * @ordered
   */
  protected EList<TypeRestriction> restrictions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RestrictionListImpl()
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
    return PathExpressionsPackage.Literals.RESTRICTION_LIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TypeRestriction> getRestrictions()
  {
    if (restrictions == null)
    {
      restrictions = new EObjectContainmentEList<TypeRestriction>(TypeRestriction.class, this, PathExpressionsPackage.RESTRICTION_LIST__RESTRICTIONS);
    }
    return restrictions;
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
      case PathExpressionsPackage.RESTRICTION_LIST__RESTRICTIONS:
        return ((InternalEList<?>)getRestrictions()).basicRemove(otherEnd, msgs);
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
      case PathExpressionsPackage.RESTRICTION_LIST__RESTRICTIONS:
        return getRestrictions();
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
      case PathExpressionsPackage.RESTRICTION_LIST__RESTRICTIONS:
        getRestrictions().clear();
        getRestrictions().addAll((Collection<? extends TypeRestriction>)newValue);
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
      case PathExpressionsPackage.RESTRICTION_LIST__RESTRICTIONS:
        getRestrictions().clear();
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
      case PathExpressionsPackage.RESTRICTION_LIST__RESTRICTIONS:
        return restrictions != null && !restrictions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //RestrictionListImpl
