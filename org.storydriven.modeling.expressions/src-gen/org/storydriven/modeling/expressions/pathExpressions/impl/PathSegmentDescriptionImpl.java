/**
 * <copyright>
 * </copyright>
 *

 */
package org.storydriven.modeling.expressions.pathExpressions.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.storydriven.modeling.expressions.pathExpressions.PathExpressionsPackage;
import org.storydriven.modeling.expressions.pathExpressions.PathSegmentDescription;
import org.storydriven.modeling.expressions.pathExpressions.RestrictionList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Path Segment Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.storydriven.modeling.expressions.pathExpressions.impl.PathSegmentDescriptionImpl#getRestrictionList <em>Restriction List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PathSegmentDescriptionImpl extends MinimalEObjectImpl.Container implements PathSegmentDescription
{
  /**
   * The cached value of the '{@link #getRestrictionList() <em>Restriction List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRestrictionList()
   * @generated
   * @ordered
   */
  protected RestrictionList restrictionList;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PathSegmentDescriptionImpl()
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
    return PathExpressionsPackage.Literals.PATH_SEGMENT_DESCRIPTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RestrictionList getRestrictionList()
  {
    return restrictionList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRestrictionList(RestrictionList newRestrictionList, NotificationChain msgs)
  {
    RestrictionList oldRestrictionList = restrictionList;
    restrictionList = newRestrictionList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PathExpressionsPackage.PATH_SEGMENT_DESCRIPTION__RESTRICTION_LIST, oldRestrictionList, newRestrictionList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRestrictionList(RestrictionList newRestrictionList)
  {
    if (newRestrictionList != restrictionList)
    {
      NotificationChain msgs = null;
      if (restrictionList != null)
        msgs = ((InternalEObject)restrictionList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PathExpressionsPackage.PATH_SEGMENT_DESCRIPTION__RESTRICTION_LIST, null, msgs);
      if (newRestrictionList != null)
        msgs = ((InternalEObject)newRestrictionList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PathExpressionsPackage.PATH_SEGMENT_DESCRIPTION__RESTRICTION_LIST, null, msgs);
      msgs = basicSetRestrictionList(newRestrictionList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PathExpressionsPackage.PATH_SEGMENT_DESCRIPTION__RESTRICTION_LIST, newRestrictionList, newRestrictionList));
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
      case PathExpressionsPackage.PATH_SEGMENT_DESCRIPTION__RESTRICTION_LIST:
        return basicSetRestrictionList(null, msgs);
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
      case PathExpressionsPackage.PATH_SEGMENT_DESCRIPTION__RESTRICTION_LIST:
        return getRestrictionList();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PathExpressionsPackage.PATH_SEGMENT_DESCRIPTION__RESTRICTION_LIST:
        setRestrictionList((RestrictionList)newValue);
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
      case PathExpressionsPackage.PATH_SEGMENT_DESCRIPTION__RESTRICTION_LIST:
        setRestrictionList((RestrictionList)null);
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
      case PathExpressionsPackage.PATH_SEGMENT_DESCRIPTION__RESTRICTION_LIST:
        return restrictionList != null;
    }
    return super.eIsSet(featureID);
  }

} //PathSegmentDescriptionImpl
