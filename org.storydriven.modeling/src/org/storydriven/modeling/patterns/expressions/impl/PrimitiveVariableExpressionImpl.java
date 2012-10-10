/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.patterns.expressions.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.storydriven.modeling.expressions.impl.ExpressionImpl;
import org.storydriven.modeling.patterns.PrimitiveVariable;
import org.storydriven.modeling.patterns.expressions.ExpressionsPackage;
import org.storydriven.modeling.patterns.expressions.PrimitiveVariableExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Primitive Variable Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.storydriven.modeling.patterns.expressions.impl.PrimitiveVariableExpressionImpl#getPrimitiveVariable <em>Primitive Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrimitiveVariableExpressionImpl extends ExpressionImpl implements PrimitiveVariableExpression
{
   /**
    * The cached value of the '{@link #getPrimitiveVariable() <em>Primitive Variable</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getPrimitiveVariable()
    * @generated
    * @ordered
    */
   protected PrimitiveVariable primitiveVariable;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected PrimitiveVariableExpressionImpl ()
   {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass ()
   {
      return ExpressionsPackage.Literals.PRIMITIVE_VARIABLE_EXPRESSION;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public PrimitiveVariable getPrimitiveVariable ()
   {
      if (primitiveVariable != null && primitiveVariable.eIsProxy())
      {
         InternalEObject oldPrimitiveVariable = (InternalEObject) primitiveVariable;
         primitiveVariable = (PrimitiveVariable) eResolveProxy(oldPrimitiveVariable);
         if (primitiveVariable != oldPrimitiveVariable)
         {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                  ExpressionsPackage.PRIMITIVE_VARIABLE_EXPRESSION__PRIMITIVE_VARIABLE, oldPrimitiveVariable,
                  primitiveVariable));
         }
      }
      return primitiveVariable;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public PrimitiveVariable basicGetPrimitiveVariable ()
   {
      return primitiveVariable;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setPrimitiveVariable (PrimitiveVariable newPrimitiveVariable)
   {
      PrimitiveVariable oldPrimitiveVariable = primitiveVariable;
      primitiveVariable = newPrimitiveVariable;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET,
            ExpressionsPackage.PRIMITIVE_VARIABLE_EXPRESSION__PRIMITIVE_VARIABLE, oldPrimitiveVariable,
            primitiveVariable));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object eGet (int featureID, boolean resolve, boolean coreType)
   {
      switch (featureID)
      {
         case ExpressionsPackage.PRIMITIVE_VARIABLE_EXPRESSION__PRIMITIVE_VARIABLE:
            if (resolve)
               return getPrimitiveVariable();
            return basicGetPrimitiveVariable();
      }
      return super.eGet(featureID, resolve, coreType);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public void eSet (int featureID, Object newValue)
   {
      switch (featureID)
      {
         case ExpressionsPackage.PRIMITIVE_VARIABLE_EXPRESSION__PRIMITIVE_VARIABLE:
            setPrimitiveVariable((PrimitiveVariable) newValue);
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
   public void eUnset (int featureID)
   {
      switch (featureID)
      {
         case ExpressionsPackage.PRIMITIVE_VARIABLE_EXPRESSION__PRIMITIVE_VARIABLE:
            setPrimitiveVariable((PrimitiveVariable) null);
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
   public boolean eIsSet (int featureID)
   {
      switch (featureID)
      {
         case ExpressionsPackage.PRIMITIVE_VARIABLE_EXPRESSION__PRIMITIVE_VARIABLE:
            return primitiveVariable != null;
      }
      return super.eIsSet(featureID);
   }

} //PrimitiveVariableExpressionImpl
