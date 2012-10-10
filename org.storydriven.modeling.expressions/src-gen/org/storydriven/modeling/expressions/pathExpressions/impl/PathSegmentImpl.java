/**
 * <copyright>
 * </copyright>
 *

 */
package org.storydriven.modeling.expressions.pathExpressions.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.storydriven.modeling.expressions.pathExpressions.PathExpressionsPackage;
import org.storydriven.modeling.expressions.pathExpressions.PathSegment;
import org.storydriven.modeling.expressions.pathExpressions.PathSegmentDescription;
import org.storydriven.modeling.expressions.pathExpressions.RepeatOperator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Path Segment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.storydriven.modeling.expressions.pathExpressions.impl.PathSegmentImpl#getAlternatives <em>Alternatives</em>}</li>
 *   <li>{@link org.storydriven.modeling.expressions.pathExpressions.impl.PathSegmentImpl#getRepeatOperator <em>Repeat Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PathSegmentImpl extends MinimalEObjectImpl.Container implements PathSegment
{
  /**
   * The cached value of the '{@link #getAlternatives() <em>Alternatives</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlternatives()
   * @generated
   * @ordered
   */
  protected EList<PathSegmentDescription> alternatives;

  /**
   * The default value of the '{@link #getRepeatOperator() <em>Repeat Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRepeatOperator()
   * @generated
   * @ordered
   */
  protected static final RepeatOperator REPEAT_OPERATOR_EDEFAULT = RepeatOperator.NO_REPEAT;

  /**
   * The cached value of the '{@link #getRepeatOperator() <em>Repeat Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRepeatOperator()
   * @generated
   * @ordered
   */
  protected RepeatOperator repeatOperator = REPEAT_OPERATOR_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PathSegmentImpl()
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
    return PathExpressionsPackage.Literals.PATH_SEGMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PathSegmentDescription> getAlternatives()
  {
    if (alternatives == null)
    {
      alternatives = new EObjectContainmentEList<PathSegmentDescription>(PathSegmentDescription.class, this, PathExpressionsPackage.PATH_SEGMENT__ALTERNATIVES);
    }
    return alternatives;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RepeatOperator getRepeatOperator()
  {
    return repeatOperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRepeatOperator(RepeatOperator newRepeatOperator)
  {
    RepeatOperator oldRepeatOperator = repeatOperator;
    repeatOperator = newRepeatOperator == null ? REPEAT_OPERATOR_EDEFAULT : newRepeatOperator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PathExpressionsPackage.PATH_SEGMENT__REPEAT_OPERATOR, oldRepeatOperator, repeatOperator));
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
      case PathExpressionsPackage.PATH_SEGMENT__ALTERNATIVES:
        return ((InternalEList<?>)getAlternatives()).basicRemove(otherEnd, msgs);
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
      case PathExpressionsPackage.PATH_SEGMENT__ALTERNATIVES:
        return getAlternatives();
      case PathExpressionsPackage.PATH_SEGMENT__REPEAT_OPERATOR:
        return getRepeatOperator();
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
      case PathExpressionsPackage.PATH_SEGMENT__ALTERNATIVES:
        getAlternatives().clear();
        getAlternatives().addAll((Collection<? extends PathSegmentDescription>)newValue);
        return;
      case PathExpressionsPackage.PATH_SEGMENT__REPEAT_OPERATOR:
        setRepeatOperator((RepeatOperator)newValue);
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
      case PathExpressionsPackage.PATH_SEGMENT__ALTERNATIVES:
        getAlternatives().clear();
        return;
      case PathExpressionsPackage.PATH_SEGMENT__REPEAT_OPERATOR:
        setRepeatOperator(REPEAT_OPERATOR_EDEFAULT);
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
      case PathExpressionsPackage.PATH_SEGMENT__ALTERNATIVES:
        return alternatives != null && !alternatives.isEmpty();
      case PathExpressionsPackage.PATH_SEGMENT__REPEAT_OPERATOR:
        return repeatOperator != REPEAT_OPERATOR_EDEFAULT;
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
    result.append(" (repeatOperator: ");
    result.append(repeatOperator);
    result.append(')');
    return result.toString();
  }

} //PathSegmentImpl
