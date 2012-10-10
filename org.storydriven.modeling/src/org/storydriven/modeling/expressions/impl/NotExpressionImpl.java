/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.expressions.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.storydriven.modeling.expressions.Expression;
import org.storydriven.modeling.expressions.ExpressionsPackage;
import org.storydriven.modeling.expressions.NotExpression;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Not Expression</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.storydriven.modeling.expressions.impl.NotExpressionImpl#getNegatedExpression <em>Negated Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NotExpressionImpl extends ExpressionImpl implements NotExpression
{
   /**
    * The cached value of the '{@link #getNegatedExpression() <em>Negated Expression</em>}' containment reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #getNegatedExpression()
    * @generated
    * @ordered
    */
   protected Expression negatedExpression;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   protected NotExpressionImpl ()
   {
      super();
      updateGenericType(EcorePackage.Literals.EBOOLEAN, null);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass ()
   {
      return ExpressionsPackage.Literals.NOT_EXPRESSION;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public Expression getNegatedExpression ()
   {
      if (negatedExpression != null && negatedExpression.eIsProxy())
      {
         InternalEObject oldNegatedExpression = (InternalEObject) negatedExpression;
         negatedExpression = (Expression) eResolveProxy(oldNegatedExpression);
         if (negatedExpression != oldNegatedExpression)
         {
            InternalEObject newNegatedExpression = (InternalEObject) negatedExpression;
            NotificationChain msgs = oldNegatedExpression.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
               - ExpressionsPackage.NOT_EXPRESSION__NEGATED_EXPRESSION, null, null);
            if (newNegatedExpression.eInternalContainer() == null)
            {
               msgs = newNegatedExpression.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                  - ExpressionsPackage.NOT_EXPRESSION__NEGATED_EXPRESSION, null, msgs);
            }
            if (msgs != null)
               msgs.dispatch();
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                  ExpressionsPackage.NOT_EXPRESSION__NEGATED_EXPRESSION, oldNegatedExpression, negatedExpression));
         }
      }
      return negatedExpression;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public Expression basicGetNegatedExpression ()
   {
      return negatedExpression;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetNegatedExpression (Expression newNegatedExpression, NotificationChain msgs)
   {
      Expression oldNegatedExpression = negatedExpression;
      negatedExpression = newNegatedExpression;
      if (eNotificationRequired())
      {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
            ExpressionsPackage.NOT_EXPRESSION__NEGATED_EXPRESSION, oldNegatedExpression, newNegatedExpression);
         if (msgs == null)
            msgs = notification;
         else
            msgs.add(notification);
      }
      return msgs;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public void setNegatedExpression (Expression newNegatedExpression)
   {
      if (newNegatedExpression != negatedExpression)
      {
         NotificationChain msgs = null;
         if (negatedExpression != null)
            msgs = ((InternalEObject) negatedExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
               - ExpressionsPackage.NOT_EXPRESSION__NEGATED_EXPRESSION, null, msgs);
         if (newNegatedExpression != null)
            msgs = ((InternalEObject) newNegatedExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
               - ExpressionsPackage.NOT_EXPRESSION__NEGATED_EXPRESSION, null, msgs);
         msgs = basicSetNegatedExpression(newNegatedExpression, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.NOT_EXPRESSION__NEGATED_EXPRESSION,
            newNegatedExpression, newNegatedExpression));
   }

   @Override
   public EClassifier basicGetType ()
   {
      return EcorePackage.Literals.EBOOLEAN;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eInverseRemove (InternalEObject otherEnd, int featureID, NotificationChain msgs)
   {
      switch (featureID)
      {
         case ExpressionsPackage.NOT_EXPRESSION__NEGATED_EXPRESSION:
            return basicSetNegatedExpression(null, msgs);
      }
      return super.eInverseRemove(otherEnd, featureID, msgs);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object eGet (int featureID, boolean resolve, boolean coreType)
   {
      switch (featureID)
      {
         case ExpressionsPackage.NOT_EXPRESSION__NEGATED_EXPRESSION:
            if (resolve)
               return getNegatedExpression();
            return basicGetNegatedExpression();
      }
      return super.eGet(featureID, resolve, coreType);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   @Override
   public void eSet (int featureID, Object newValue)
   {
      switch (featureID)
      {
         case ExpressionsPackage.NOT_EXPRESSION__NEGATED_EXPRESSION:
            setNegatedExpression((Expression) newValue);
            return;
      }
      super.eSet(featureID, newValue);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   @Override
   public void eUnset (int featureID)
   {
      switch (featureID)
      {
         case ExpressionsPackage.NOT_EXPRESSION__NEGATED_EXPRESSION:
            setNegatedExpression((Expression) null);
            return;
      }
      super.eUnset(featureID);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   @Override
   public boolean eIsSet (int featureID)
   {
      switch (featureID)
      {
         case ExpressionsPackage.NOT_EXPRESSION__NEGATED_EXPRESSION:
            return negatedExpression != null;
      }
      return super.eIsSet(featureID);
   }

} // NotExpressionImpl
