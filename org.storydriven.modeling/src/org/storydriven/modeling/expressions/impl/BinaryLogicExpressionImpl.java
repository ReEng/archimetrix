/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.expressions.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.storydriven.modeling.expressions.BinaryLogicExpression;
import org.storydriven.modeling.expressions.ExpressionsPackage;
import org.storydriven.modeling.expressions.LogicOperator;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Binary Logic Expression</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.storydriven.modeling.expressions.impl.BinaryLogicExpressionImpl#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BinaryLogicExpressionImpl extends BinaryExpressionImpl implements BinaryLogicExpression
{
   /**
    * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #getOperator()
    * @generated
    * @ordered
    */
   protected static final LogicOperator OPERATOR_EDEFAULT = LogicOperator.AND;

   /**
    * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #getOperator()
    * @generated
    * @ordered
    */
   protected LogicOperator operator = OPERATOR_EDEFAULT;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   protected BinaryLogicExpressionImpl ()
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
      return ExpressionsPackage.Literals.BINARY_LOGIC_EXPRESSION;
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
   public LogicOperator getOperator ()
   {
      return operator;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public void setOperator (LogicOperator newOperator)
   {
      LogicOperator oldOperator = operator;
      operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.BINARY_LOGIC_EXPRESSION__OPERATOR,
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
         case ExpressionsPackage.BINARY_LOGIC_EXPRESSION__OPERATOR:
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
         case ExpressionsPackage.BINARY_LOGIC_EXPRESSION__OPERATOR:
            setOperator((LogicOperator) newValue);
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
         case ExpressionsPackage.BINARY_LOGIC_EXPRESSION__OPERATOR:
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
         case ExpressionsPackage.BINARY_LOGIC_EXPRESSION__OPERATOR:
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

} // BinaryLogicExpressionImpl
