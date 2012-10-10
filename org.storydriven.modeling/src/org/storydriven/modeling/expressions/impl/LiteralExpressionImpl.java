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
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.storydriven.modeling.expressions.ExpressionsPackage;
import org.storydriven.modeling.expressions.LiteralExpression;
import org.storydriven.modeling.util.SDMUtil;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Literal Expression</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.storydriven.modeling.expressions.impl.LiteralExpressionImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.storydriven.modeling.expressions.impl.LiteralExpressionImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.storydriven.modeling.expressions.impl.LiteralExpressionImpl#getValueType <em>Value Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LiteralExpressionImpl extends ExpressionImpl implements LiteralExpression
{
   /**
    * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #getValue()
    * @generated
    * @ordered
    */
   protected static final String VALUE_EDEFAULT = null;

   /**
    * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #getValue()
    * @generated
    * @ordered
    */
   protected String value = VALUE_EDEFAULT;

   /**
    * The cached value of the '{@link #getValueType() <em>Value Type</em>}' reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #getValueType()
    * @generated
    * @ordered
    */
   protected EDataType valueType;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   protected LiteralExpressionImpl ()
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
      return ExpressionsPackage.Literals.LITERAL_EXPRESSION;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   @Override
   public EClassifier getType ()
   {
      EClassifier type = basicGetType();
      return type != null && type.eIsProxy() ? (EClassifier) eResolveProxy((InternalEObject) type) : type;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   @Override
   public EClassifier basicGetType ()
   {
      if (eIsSet(ExpressionsPackage.LITERAL_EXPRESSION__VALUE_TYPE))
      {
         return basicGetValueType();
      }
      return super.basicGetType();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public String getValue ()
   {
      return value;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public void setValue (String newValue)
   {
      String oldValue = value;
      value = newValue;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.LITERAL_EXPRESSION__VALUE, oldValue,
            value));
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EDataType getValueType ()
   {
      if (valueType != null && valueType.eIsProxy())
      {
         InternalEObject oldValueType = (InternalEObject) valueType;
         valueType = (EDataType) eResolveProxy(oldValueType);
         if (valueType != oldValueType)
         {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                  ExpressionsPackage.LITERAL_EXPRESSION__VALUE_TYPE, oldValueType, valueType));
         }
      }
      return valueType;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EDataType basicGetValueType ()
   {
      return valueType;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public void setValueType (EDataType newValueType)
   {
      EDataType oldValueType = this.valueType;
      this.valueType = newValueType;
      NotificationChain msgs = updateGenericType(newValueType, null);
      SDMUtil.dispatch(msgs, eNotificationRequired() ? new ENotificationImpl(this, Notification.SET,
         ExpressionsPackage.LITERAL_EXPRESSION__VALUE_TYPE, oldValueType, this.valueType) : null);
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
         case ExpressionsPackage.LITERAL_EXPRESSION__VALUE:
            return getValue();
         case ExpressionsPackage.LITERAL_EXPRESSION__VALUE_TYPE:
            if (resolve)
               return getValueType();
            return basicGetValueType();
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
         case ExpressionsPackage.LITERAL_EXPRESSION__VALUE:
            setValue((String) newValue);
            return;
         case ExpressionsPackage.LITERAL_EXPRESSION__VALUE_TYPE:
            setValueType((EDataType) newValue);
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
         case ExpressionsPackage.LITERAL_EXPRESSION__VALUE:
            setValue(VALUE_EDEFAULT);
            return;
         case ExpressionsPackage.LITERAL_EXPRESSION__VALUE_TYPE:
            setValueType((EDataType) null);
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
         case ExpressionsPackage.LITERAL_EXPRESSION__VALUE:
            return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
         case ExpressionsPackage.LITERAL_EXPRESSION__VALUE_TYPE:
            return valueType != null;
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
      result.append(" (value: ");
      result.append(value);
      result.append(')');
      return result.toString();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   @Override
   public boolean isSetType ()
   {
      return super.isSetType() || eIsSet(ExpressionsPackage.LITERAL_EXPRESSION__VALUE_TYPE);
   }

} // LiteralExpressionImpl
