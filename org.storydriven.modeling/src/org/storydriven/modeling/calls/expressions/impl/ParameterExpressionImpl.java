/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.calls.expressions.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.storydriven.modeling.calls.ParameterExtension;
import org.storydriven.modeling.calls.expressions.ExpressionsPackage;
import org.storydriven.modeling.calls.expressions.ParameterExpression;
import org.storydriven.modeling.expressions.impl.ExpressionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.storydriven.modeling.calls.expressions.impl.ParameterExpressionImpl#getParameter <em>Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParameterExpressionImpl extends ExpressionImpl implements ParameterExpression
{
   /**
    * The cached value of the '{@link #getParameter() <em>Parameter</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getParameter()
    * @generated
    * @ordered
    */
   protected ParameterExtension parameter;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected ParameterExpressionImpl ()
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
      return ExpressionsPackage.Literals.PARAMETER_EXPRESSION;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ParameterExtension getParameter ()
   {
      if (parameter != null && parameter.eIsProxy())
      {
         InternalEObject oldParameter = (InternalEObject) parameter;
         parameter = (ParameterExtension) eResolveProxy(oldParameter);
         if (parameter != oldParameter)
         {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                  ExpressionsPackage.PARAMETER_EXPRESSION__PARAMETER, oldParameter, parameter));
         }
      }
      return parameter;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ParameterExtension basicGetParameter ()
   {
      return parameter;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setParameter (ParameterExtension newParameter)
   {
      ParameterExtension oldParameter = parameter;
      parameter = newParameter;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.PARAMETER_EXPRESSION__PARAMETER,
            oldParameter, parameter));
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
         case ExpressionsPackage.PARAMETER_EXPRESSION__PARAMETER:
            if (resolve)
               return getParameter();
            return basicGetParameter();
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
         case ExpressionsPackage.PARAMETER_EXPRESSION__PARAMETER:
            setParameter((ParameterExtension) newValue);
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
         case ExpressionsPackage.PARAMETER_EXPRESSION__PARAMETER:
            setParameter((ParameterExtension) null);
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
         case ExpressionsPackage.PARAMETER_EXPRESSION__PARAMETER:
            return parameter != null;
      }
      return super.eIsSet(featureID);
   }

} //ParameterExpressionImpl
