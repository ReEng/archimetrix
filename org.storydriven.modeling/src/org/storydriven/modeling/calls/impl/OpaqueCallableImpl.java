/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.calls.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.storydriven.modeling.calls.CallsPackage;
import org.storydriven.modeling.calls.OpaqueCallable;
import org.storydriven.modeling.calls.expressions.ExpressionsPackage;
import org.storydriven.modeling.calls.expressions.MethodCallExpression;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Opaque Callable</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.storydriven.modeling.calls.impl.OpaqueCallableImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.storydriven.modeling.calls.impl.OpaqueCallableImpl#getCallExpression <em>Call Expression</em>}</li>
 *   <li>{@link org.storydriven.modeling.calls.impl.OpaqueCallableImpl#getInParameters <em>In Parameter</em>}</li>
 *   <li>{@link org.storydriven.modeling.calls.impl.OpaqueCallableImpl#getOutParameters <em>Out Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OpaqueCallableImpl extends CallableImpl implements OpaqueCallable
{
   /**
    * The default value of the '{@link #getName() <em>Name</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getName()
    * @generated
    * @ordered
    */
   protected static final String NAME_EDEFAULT = null;
   /**
    * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getName()
    * @generated
    * @ordered
    */
   protected String name = NAME_EDEFAULT;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   protected OpaqueCallableImpl ()
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
      return CallsPackage.Literals.OPAQUE_CALLABLE;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public String getName ()
   {
      return name;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setName (String newName)
   {
      String oldName = name;
      name = newName;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, CallsPackage.OPAQUE_CALLABLE__NAME, oldName, name));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public EList<EParameter> getInParameters ()
   {
      if (inParameters == null)
      {
         inParameters = new EObjectResolvingEList<EParameter>(EParameter.class, this,
            CallsPackage.OPAQUE_CALLABLE__IN_PARAMETER);
      }
      return inParameters;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean isSetInParameters ()
   {
      return inParameters != null && !inParameters.isEmpty();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public EList<EParameter> getOutParameters ()
   {
      if (outParameters == null)
      {
         outParameters = new EObjectResolvingEList<EParameter>(EParameter.class, this,
            CallsPackage.OPAQUE_CALLABLE__OUT_PARAMETER);
      }
      return outParameters;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean isSetOutParameters ()
   {
      return outParameters != null && !outParameters.isEmpty();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public MethodCallExpression getCallExpression ()
   {
      if (eContainerFeatureID() != CallsPackage.OPAQUE_CALLABLE__CALL_EXPRESSION)
         return null;
      return (MethodCallExpression) eContainer();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public MethodCallExpression basicGetCallExpression ()
   {
      if (eContainerFeatureID() != CallsPackage.OPAQUE_CALLABLE__CALL_EXPRESSION)
         return null;
      return (MethodCallExpression) eInternalContainer();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetCallExpression (MethodCallExpression newCallExpression, NotificationChain msgs)
   {
      msgs = eBasicSetContainer((InternalEObject) newCallExpression, CallsPackage.OPAQUE_CALLABLE__CALL_EXPRESSION,
         msgs);
      return msgs;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public void setCallExpression (MethodCallExpression newCallExpression)
   {
      if (newCallExpression != eInternalContainer()
         || (eContainerFeatureID() != CallsPackage.OPAQUE_CALLABLE__CALL_EXPRESSION && newCallExpression != null))
      {
         if (EcoreUtil.isAncestor(this, newCallExpression))
            throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
         NotificationChain msgs = null;
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         if (newCallExpression != null)
            msgs = ((InternalEObject) newCallExpression).eInverseAdd(this,
               ExpressionsPackage.METHOD_CALL_EXPRESSION__OPAQUE_CALLABLE, MethodCallExpression.class, msgs);
         msgs = basicSetCallExpression(newCallExpression, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, CallsPackage.OPAQUE_CALLABLE__CALL_EXPRESSION,
            newCallExpression, newCallExpression));
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public boolean NumberOfOutParams (DiagnosticChain diagnostics, Map<Object, Object> context)
   {
      return OpaqueCallableOperations.NumberOfOutParams(this, diagnostics, context);
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
         case CallsPackage.OPAQUE_CALLABLE__CALL_EXPRESSION:
            if (eInternalContainer() != null)
               msgs = eBasicRemoveFromContainer(msgs);
            return basicSetCallExpression((MethodCallExpression) otherEnd, msgs);
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
         case CallsPackage.OPAQUE_CALLABLE__CALL_EXPRESSION:
            return basicSetCallExpression(null, msgs);
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
         case CallsPackage.OPAQUE_CALLABLE__CALL_EXPRESSION:
            return eInternalContainer().eInverseRemove(this,
               ExpressionsPackage.METHOD_CALL_EXPRESSION__OPAQUE_CALLABLE, MethodCallExpression.class, msgs);
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
         case CallsPackage.OPAQUE_CALLABLE__NAME:
            return getName();
         case CallsPackage.OPAQUE_CALLABLE__CALL_EXPRESSION:
            if (resolve)
               return getCallExpression();
            return basicGetCallExpression();
      }
      return super.eGet(featureID, resolve, coreType);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   @SuppressWarnings ("unchecked")
   @Override
   public void eSet (int featureID, Object newValue)
   {
      switch (featureID)
      {
         case CallsPackage.OPAQUE_CALLABLE__NAME:
            setName((String) newValue);
            return;
         case CallsPackage.OPAQUE_CALLABLE__CALL_EXPRESSION:
            setCallExpression((MethodCallExpression) newValue);
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
         case CallsPackage.OPAQUE_CALLABLE__NAME:
            setName(NAME_EDEFAULT);
            return;
         case CallsPackage.OPAQUE_CALLABLE__CALL_EXPRESSION:
            setCallExpression((MethodCallExpression) null);
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
         case CallsPackage.OPAQUE_CALLABLE__NAME:
            return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
         case CallsPackage.OPAQUE_CALLABLE__CALL_EXPRESSION:
            return basicGetCallExpression() != null;
      }
      return super.eIsSet(featureID);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   @Override
   @SuppressWarnings ("unchecked")
   public Object eInvoke (int operationID, EList<?> arguments) throws InvocationTargetException
   {
      switch (operationID)
      {
         case CallsPackage.OPAQUE_CALLABLE___NUMBER_OF_OUT_PARAMS__DIAGNOSTICCHAIN_MAP:
            return NumberOfOutParams((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
      }
      return super.eInvoke(operationID, arguments);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public String toString ()
   {
      if (eIsProxy())
         return super.toString();

      StringBuffer result = new StringBuffer(super.toString());
      result.append(" (name: ");
      result.append(name);
      result.append(')');
      return result.toString();
   }

} // OpaqueCallableImpl
