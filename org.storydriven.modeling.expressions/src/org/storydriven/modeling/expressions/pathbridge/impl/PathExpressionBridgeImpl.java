/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.expressions.pathbridge.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.storydriven.modeling.expressions.impl.ExpressionImpl;

import org.storydriven.modeling.expressions.pathExpressions.PathExpression;

import org.storydriven.modeling.expressions.pathbridge.PathExpressionBridge;
import org.storydriven.modeling.expressions.pathbridge.PathbridgePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Path Expression Bridge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.storydriven.modeling.expressions.pathbridge.impl.PathExpressionBridgeImpl#getPathExpression <em>Path Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PathExpressionBridgeImpl extends ExpressionImpl implements PathExpressionBridge
{
   /**
    * The cached value of the '{@link #getPathExpression() <em>Path Expression</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getPathExpression()
    * @generated
    * @ordered
    */
   protected PathExpression pathExpression;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected PathExpressionBridgeImpl()
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
      return PathbridgePackage.Literals.PATH_EXPRESSION_BRIDGE;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public PathExpression getPathExpression()
   {
      return pathExpression;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetPathExpression(PathExpression newPathExpression, NotificationChain msgs)
   {
      PathExpression oldPathExpression = pathExpression;
      pathExpression = newPathExpression;
      if (eNotificationRequired())
      {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PathbridgePackage.PATH_EXPRESSION_BRIDGE__PATH_EXPRESSION, oldPathExpression, newPathExpression);
         if (msgs == null) msgs = notification; else msgs.add(notification);
      }
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setPathExpression(PathExpression newPathExpression)
   {
      if (newPathExpression != pathExpression)
      {
         NotificationChain msgs = null;
         if (pathExpression != null)
            msgs = ((InternalEObject)pathExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PathbridgePackage.PATH_EXPRESSION_BRIDGE__PATH_EXPRESSION, null, msgs);
         if (newPathExpression != null)
            msgs = ((InternalEObject)newPathExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PathbridgePackage.PATH_EXPRESSION_BRIDGE__PATH_EXPRESSION, null, msgs);
         msgs = basicSetPathExpression(newPathExpression, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, PathbridgePackage.PATH_EXPRESSION_BRIDGE__PATH_EXPRESSION, newPathExpression, newPathExpression));
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
         case PathbridgePackage.PATH_EXPRESSION_BRIDGE__PATH_EXPRESSION:
            return basicSetPathExpression(null, msgs);
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
         case PathbridgePackage.PATH_EXPRESSION_BRIDGE__PATH_EXPRESSION:
            return getPathExpression();
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
         case PathbridgePackage.PATH_EXPRESSION_BRIDGE__PATH_EXPRESSION:
            setPathExpression((PathExpression)newValue);
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
         case PathbridgePackage.PATH_EXPRESSION_BRIDGE__PATH_EXPRESSION:
            setPathExpression((PathExpression)null);
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
         case PathbridgePackage.PATH_EXPRESSION_BRIDGE__PATH_EXPRESSION:
            return pathExpression != null;
      }
      return super.eIsSet(featureID);
   }

} //PathExpressionBridgeImpl
