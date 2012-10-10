/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.calls.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.storydriven.modeling.calls.CallsPackage;
import org.storydriven.modeling.calls.Invocation;
import org.storydriven.modeling.calls.ParameterBinding;
import org.storydriven.modeling.expressions.Expression;
import org.storydriven.modeling.impl.CommentableElementImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Parameter Binding</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.storydriven.modeling.calls.impl.ParameterBindingImpl#getValueExpression <em>Value Expression</em>}</li>
 *   <li>{@link org.storydriven.modeling.calls.impl.ParameterBindingImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.storydriven.modeling.calls.impl.ParameterBindingImpl#getInvocation <em>Invocation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParameterBindingImpl extends CommentableElementImpl implements ParameterBinding
{
   /**
    * The cached value of the '{@link #getValueExpression() <em>Value Expression</em>}' containment reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #getValueExpression()
    * @generated
    * @ordered
    */
   protected Expression valueExpression;

   /**
    * The cached value of the '{@link #getParameter() <em>Parameter</em>}' reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #getParameter()
    * @generated
    * @ordered
    */
   protected EParameter parameter;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   protected ParameterBindingImpl ()
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
      return CallsPackage.Literals.PARAMETER_BINDING;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public Expression getValueExpression ()
   {
      if (valueExpression != null && valueExpression.eIsProxy())
      {
         InternalEObject oldValueExpression = (InternalEObject) valueExpression;
         valueExpression = (Expression) eResolveProxy(oldValueExpression);
         if (valueExpression != oldValueExpression)
         {
            InternalEObject newValueExpression = (InternalEObject) valueExpression;
            NotificationChain msgs = oldValueExpression.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
               - CallsPackage.PARAMETER_BINDING__VALUE_EXPRESSION, null, null);
            if (newValueExpression.eInternalContainer() == null)
            {
               msgs = newValueExpression.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                  - CallsPackage.PARAMETER_BINDING__VALUE_EXPRESSION, null, msgs);
            }
            if (msgs != null)
               msgs.dispatch();
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                  CallsPackage.PARAMETER_BINDING__VALUE_EXPRESSION, oldValueExpression, valueExpression));
         }
      }
      return valueExpression;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public Expression basicGetValueExpression ()
   {
      return valueExpression;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetValueExpression (Expression newValueExpression, NotificationChain msgs)
   {
      Expression oldValueExpression = valueExpression;
      valueExpression = newValueExpression;
      if (eNotificationRequired())
      {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
            CallsPackage.PARAMETER_BINDING__VALUE_EXPRESSION, oldValueExpression, newValueExpression);
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
   public void setValueExpression (Expression newValueExpression)
   {
      if (newValueExpression != valueExpression)
      {
         NotificationChain msgs = null;
         if (valueExpression != null)
            msgs = ((InternalEObject) valueExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
               - CallsPackage.PARAMETER_BINDING__VALUE_EXPRESSION, null, msgs);
         if (newValueExpression != null)
            msgs = ((InternalEObject) newValueExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
               - CallsPackage.PARAMETER_BINDING__VALUE_EXPRESSION, null, msgs);
         msgs = basicSetValueExpression(newValueExpression, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, CallsPackage.PARAMETER_BINDING__VALUE_EXPRESSION,
            newValueExpression, newValueExpression));
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EParameter getParameter ()
   {
      if (parameter != null && parameter.eIsProxy())
      {
         InternalEObject oldParameter = (InternalEObject) parameter;
         parameter = (EParameter) eResolveProxy(oldParameter);
         if (parameter != oldParameter)
         {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, CallsPackage.PARAMETER_BINDING__PARAMETER,
                  oldParameter, parameter));
         }
      }
      return parameter;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EParameter basicGetParameter ()
   {
      return parameter;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public void setParameter (EParameter newParameter)
   {
      EParameter oldParameter = parameter;
      parameter = newParameter;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, CallsPackage.PARAMETER_BINDING__PARAMETER, oldParameter,
            parameter));
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public Invocation getInvocation ()
   {
      if (eContainerFeatureID() != CallsPackage.PARAMETER_BINDING__INVOCATION)
         return null;
      return (Invocation) eContainer();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public Invocation basicGetInvocation ()
   {
      if (eContainerFeatureID() != CallsPackage.PARAMETER_BINDING__INVOCATION)
         return null;
      return (Invocation) eInternalContainer();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetInvocation (Invocation newInvocation, NotificationChain msgs)
   {
      msgs = eBasicSetContainer((InternalEObject) newInvocation, CallsPackage.PARAMETER_BINDING__INVOCATION, msgs);
      return msgs;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public void setInvocation (Invocation newInvocation)
   {
      if (newInvocation != eInternalContainer()
         || (eContainerFeatureID() != CallsPackage.PARAMETER_BINDING__INVOCATION && newInvocation != null))
      {
         if (EcoreUtil.isAncestor(this, newInvocation))
            throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
         NotificationChain msgs = null;
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         if (newInvocation != null)
            msgs = ((InternalEObject) newInvocation).eInverseAdd(this,
               CallsPackage.INVOCATION__OWNED_PARAMETER_BINDINGS, Invocation.class, msgs);
         msgs = basicSetInvocation(newInvocation, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, CallsPackage.PARAMETER_BINDING__INVOCATION,
            newInvocation, newInvocation));
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eInverseAdd (InternalEObject otherEnd, int featureID, NotificationChain msgs)
   {
      switch (featureID)
      {
         case CallsPackage.PARAMETER_BINDING__INVOCATION:
            if (eInternalContainer() != null)
               msgs = eBasicRemoveFromContainer(msgs);
            return basicSetInvocation((Invocation) otherEnd, msgs);
      }
      return super.eInverseAdd(otherEnd, featureID, msgs);
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
         case CallsPackage.PARAMETER_BINDING__VALUE_EXPRESSION:
            return basicSetValueExpression(null, msgs);
         case CallsPackage.PARAMETER_BINDING__INVOCATION:
            return basicSetInvocation(null, msgs);
      }
      return super.eInverseRemove(otherEnd, featureID, msgs);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eBasicRemoveFromContainerFeature (NotificationChain msgs)
   {
      switch (eContainerFeatureID())
      {
         case CallsPackage.PARAMETER_BINDING__INVOCATION:
            return eInternalContainer().eInverseRemove(this, CallsPackage.INVOCATION__OWNED_PARAMETER_BINDINGS,
               Invocation.class, msgs);
      }
      return super.eBasicRemoveFromContainerFeature(msgs);
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
         case CallsPackage.PARAMETER_BINDING__VALUE_EXPRESSION:
            if (resolve)
               return getValueExpression();
            return basicGetValueExpression();
         case CallsPackage.PARAMETER_BINDING__PARAMETER:
            if (resolve)
               return getParameter();
            return basicGetParameter();
         case CallsPackage.PARAMETER_BINDING__INVOCATION:
            if (resolve)
               return getInvocation();
            return basicGetInvocation();
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
         case CallsPackage.PARAMETER_BINDING__VALUE_EXPRESSION:
            setValueExpression((Expression) newValue);
            return;
         case CallsPackage.PARAMETER_BINDING__PARAMETER:
            setParameter((EParameter) newValue);
            return;
         case CallsPackage.PARAMETER_BINDING__INVOCATION:
            setInvocation((Invocation) newValue);
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
         case CallsPackage.PARAMETER_BINDING__VALUE_EXPRESSION:
            setValueExpression((Expression) null);
            return;
         case CallsPackage.PARAMETER_BINDING__PARAMETER:
            setParameter((EParameter) null);
            return;
         case CallsPackage.PARAMETER_BINDING__INVOCATION:
            setInvocation((Invocation) null);
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
         case CallsPackage.PARAMETER_BINDING__VALUE_EXPRESSION:
            return valueExpression != null;
         case CallsPackage.PARAMETER_BINDING__PARAMETER:
            return parameter != null;
         case CallsPackage.PARAMETER_BINDING__INVOCATION:
            return basicGetInvocation() != null;
      }
      return super.eIsSet(featureID);
   }

} // ParameterBindingImpl
