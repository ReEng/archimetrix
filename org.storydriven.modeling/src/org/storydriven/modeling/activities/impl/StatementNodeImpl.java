/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.activities.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.storydriven.modeling.activities.ActivitiesPackage;
import org.storydriven.modeling.activities.StatementNode;
import org.storydriven.modeling.expressions.Expression;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Statement Node</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.storydriven.modeling.activities.impl.StatementNodeImpl#getStatementExpression <em>Statement Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StatementNodeImpl extends ActivityNodeImpl implements StatementNode
{
   /**
    * The cached value of the '{@link #getStatementExpression() <em>Statement Expression</em>}' containment reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #getStatementExpression()
    * @generated
    * @ordered
    */
   protected Expression statementExpression;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   protected StatementNodeImpl ()
   {
      super();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass ()
   {
      return ActivitiesPackage.Literals.STATEMENT_NODE;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public Expression getStatementExpression ()
   {
      if (statementExpression != null && statementExpression.eIsProxy())
      {
         InternalEObject oldStatementExpression = (InternalEObject) statementExpression;
         statementExpression = (Expression) eResolveProxy(oldStatementExpression);
         if (statementExpression != oldStatementExpression)
         {
            InternalEObject newStatementExpression = (InternalEObject) statementExpression;
            NotificationChain msgs = oldStatementExpression.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
               - ActivitiesPackage.STATEMENT_NODE__STATEMENT_EXPRESSION, null, null);
            if (newStatementExpression.eInternalContainer() == null)
            {
               msgs = newStatementExpression.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                  - ActivitiesPackage.STATEMENT_NODE__STATEMENT_EXPRESSION, null, msgs);
            }
            if (msgs != null)
               msgs.dispatch();
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                  ActivitiesPackage.STATEMENT_NODE__STATEMENT_EXPRESSION, oldStatementExpression, statementExpression));
         }
      }
      return statementExpression;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public Expression basicGetStatementExpression ()
   {
      return statementExpression;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetStatementExpression (Expression newStatementExpression, NotificationChain msgs)
   {
      Expression oldStatementExpression = statementExpression;
      statementExpression = newStatementExpression;
      if (eNotificationRequired())
      {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
            ActivitiesPackage.STATEMENT_NODE__STATEMENT_EXPRESSION, oldStatementExpression, newStatementExpression);
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
   public void setStatementExpression (Expression newStatementExpression)
   {
      if (newStatementExpression != statementExpression)
      {
         NotificationChain msgs = null;
         if (statementExpression != null)
            msgs = ((InternalEObject) statementExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
               - ActivitiesPackage.STATEMENT_NODE__STATEMENT_EXPRESSION, null, msgs);
         if (newStatementExpression != null)
            msgs = ((InternalEObject) newStatementExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
               - ActivitiesPackage.STATEMENT_NODE__STATEMENT_EXPRESSION, null, msgs);
         msgs = basicSetStatementExpression(newStatementExpression, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ActivitiesPackage.STATEMENT_NODE__STATEMENT_EXPRESSION,
            newStatementExpression, newStatementExpression));
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
         case ActivitiesPackage.STATEMENT_NODE__STATEMENT_EXPRESSION:
            return basicSetStatementExpression(null, msgs);
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
         case ActivitiesPackage.STATEMENT_NODE__STATEMENT_EXPRESSION:
            if (resolve)
               return getStatementExpression();
            return basicGetStatementExpression();
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
         case ActivitiesPackage.STATEMENT_NODE__STATEMENT_EXPRESSION:
            setStatementExpression((Expression) newValue);
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
         case ActivitiesPackage.STATEMENT_NODE__STATEMENT_EXPRESSION:
            setStatementExpression((Expression) null);
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
         case ActivitiesPackage.STATEMENT_NODE__STATEMENT_EXPRESSION:
            return statementExpression != null;
      }
      return super.eIsSet(featureID);
   }

} // StatementNodeImpl
