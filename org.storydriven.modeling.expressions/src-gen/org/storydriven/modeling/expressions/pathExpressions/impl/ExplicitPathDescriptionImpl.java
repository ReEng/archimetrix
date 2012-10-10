/**
 * <copyright>
 * </copyright>
 *

 */
package org.storydriven.modeling.expressions.pathExpressions.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.storydriven.modeling.expressions.pathExpressions.ExplicitPathDescription;
import org.storydriven.modeling.expressions.pathExpressions.PathExpressionsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Explicit Path Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.storydriven.modeling.expressions.pathExpressions.impl.ExplicitPathDescriptionImpl#getAssociationName <em>Association Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExplicitPathDescriptionImpl extends PathSegmentDescriptionImpl implements ExplicitPathDescription
{
  /**
   * The default value of the '{@link #getAssociationName() <em>Association Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssociationName()
   * @generated
   * @ordered
   */
  protected static final String ASSOCIATION_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAssociationName() <em>Association Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssociationName()
   * @generated
   * @ordered
   */
  protected String associationName = ASSOCIATION_NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExplicitPathDescriptionImpl()
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
    return PathExpressionsPackage.Literals.EXPLICIT_PATH_DESCRIPTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAssociationName()
  {
    return associationName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAssociationName(String newAssociationName)
  {
    String oldAssociationName = associationName;
    associationName = newAssociationName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PathExpressionsPackage.EXPLICIT_PATH_DESCRIPTION__ASSOCIATION_NAME, oldAssociationName, associationName));
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
      case PathExpressionsPackage.EXPLICIT_PATH_DESCRIPTION__ASSOCIATION_NAME:
        return getAssociationName();
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
      case PathExpressionsPackage.EXPLICIT_PATH_DESCRIPTION__ASSOCIATION_NAME:
        setAssociationName((String)newValue);
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
      case PathExpressionsPackage.EXPLICIT_PATH_DESCRIPTION__ASSOCIATION_NAME:
        setAssociationName(ASSOCIATION_NAME_EDEFAULT);
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
      case PathExpressionsPackage.EXPLICIT_PATH_DESCRIPTION__ASSOCIATION_NAME:
        return ASSOCIATION_NAME_EDEFAULT == null ? associationName != null : !ASSOCIATION_NAME_EDEFAULT.equals(associationName);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (associationName: ");
    result.append(associationName);
    result.append(')');
    return result.toString();
  }

} //ExplicitPathDescriptionImpl
