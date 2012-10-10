/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.expressions.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.storydriven.modeling.expressions.ComparingOperator;
import org.storydriven.modeling.expressions.ComparisonExpression;
import org.storydriven.modeling.expressions.ExpressionsPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Comparison Expression</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.storydriven.modeling.expressions.impl.ComparisonExpressionImpl#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComparisonExpressionImpl extends BinaryExpressionImpl implements ComparisonExpression
{
   /**
    * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #getOperator()
    * @generated
    * @ordered
    */
   protected static final ComparingOperator OPERATOR_EDEFAULT = ComparingOperator.LESS;

   /**
    * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #getOperator()
    * @generated
    * @ordered
    */
   protected ComparingOperator operator = OPERATOR_EDEFAULT;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   protected ComparisonExpressionImpl ()
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
      return ExpressionsPackage.Literals.COMPARISON_EXPRESSION;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public ComparingOperator getOperator ()
   {
      return operator;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public void setOperator (ComparingOperator newOperator)
   {
      ComparingOperator oldOperator = operator;
      operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.COMPARISON_EXPRESSION__OPERATOR,
            oldOperator, operator));
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
         case ExpressionsPackage.COMPARISON_EXPRESSION__OPERATOR:
            return getOperator();
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
         case ExpressionsPackage.COMPARISON_EXPRESSION__OPERATOR:
            setOperator((ComparingOperator) newValue);
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
         case ExpressionsPackage.COMPARISON_EXPRESSION__OPERATOR:
            setOperator(OPERATOR_EDEFAULT);
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
         case ExpressionsPackage.COMPARISON_EXPRESSION__OPERATOR:
            return operator != OPERATOR_EDEFAULT;
      }
      return super.eIsSet(featureID);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   @Override
   public String toString ()
   {
      if (eIsProxy())
         return super.toString();

      StringBuffer result = new StringBuffer(super.toString());
      result.append(" (operator: ");
      result.append(operator);
      result.append(')');
      return result.toString();
   }

} // ComparisonExpressionImpl
