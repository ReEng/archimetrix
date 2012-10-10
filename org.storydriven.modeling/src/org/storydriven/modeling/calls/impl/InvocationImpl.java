/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.calls.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.storydriven.modeling.calls.Callable;
import org.storydriven.modeling.calls.CallsPackage;
import org.storydriven.modeling.calls.Invocation;
import org.storydriven.modeling.calls.ParameterBinding;
import org.storydriven.modeling.impl.CommentableElementImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Invocation</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.storydriven.modeling.calls.impl.InvocationImpl#getOwnedParameterBindings <em>Owned Parameter Bindings</em>}</li>
 *   <li>{@link org.storydriven.modeling.calls.impl.InvocationImpl#getCallee <em>Callee</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class InvocationImpl extends CommentableElementImpl implements Invocation
{
   /**
    * The cached value of the '{@link #getOwnedParameterBindings() <em>Owned Parameter Bindings</em>}' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #getOwnedParameterBindings()
    * @generated
    * @ordered
    */
   protected EList<ParameterBinding> ownedParameterBindings;

   /**
    * The cached value of the '{@link #getCallee() <em>Callee</em>}' reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #getCallee()
    * @generated
    * @ordered
    */
   protected Callable callee;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   protected InvocationImpl ()
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
      return CallsPackage.Literals.INVOCATION;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EList<ParameterBinding> getOwnedParameterBindings ()
   {
      if (ownedParameterBindings == null)
      {
         ownedParameterBindings = new EObjectContainmentWithInverseEList.Resolving<ParameterBinding>(
            ParameterBinding.class, this, CallsPackage.INVOCATION__OWNED_PARAMETER_BINDINGS,
            CallsPackage.PARAMETER_BINDING__INVOCATION);
      }
      return ownedParameterBindings;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public Callable getCallee ()
   {
      if (callee != null && callee.eIsProxy())
      {
         InternalEObject oldCallee = (InternalEObject) callee;
         callee = (Callable) eResolveProxy(oldCallee);
         if (callee != oldCallee)
         {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, CallsPackage.INVOCATION__CALLEE, oldCallee,
                  callee));
         }
      }
      return callee;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public Callable basicGetCallee ()
   {
      return callee;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public void setCallee (Callable newCallee)
   {
      Callable oldCallee = callee;
      callee = newCallee;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, CallsPackage.INVOCATION__CALLEE, oldCallee, callee));
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   @SuppressWarnings ("unchecked")
   @Override
   public NotificationChain eInverseAdd (InternalEObject otherEnd, int featureID, NotificationChain msgs)
   {
      switch (featureID)
      {
         case CallsPackage.INVOCATION__OWNED_PARAMETER_BINDINGS:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getOwnedParameterBindings()).basicAdd(otherEnd,
               msgs);
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
         case CallsPackage.INVOCATION__OWNED_PARAMETER_BINDINGS:
            return ((InternalEList<?>) getOwnedParameterBindings()).basicRemove(otherEnd, msgs);
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
         case CallsPackage.INVOCATION__OWNED_PARAMETER_BINDINGS:
            return getOwnedParameterBindings();
         case CallsPackage.INVOCATION__CALLEE:
            if (resolve)
               return getCallee();
            return basicGetCallee();
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
         case CallsPackage.INVOCATION__OWNED_PARAMETER_BINDINGS:
            getOwnedParameterBindings().clear();
            getOwnedParameterBindings().addAll((Collection<? extends ParameterBinding>) newValue);
            return;
         case CallsPackage.INVOCATION__CALLEE:
            setCallee((Callable) newValue);
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
         case CallsPackage.INVOCATION__OWNED_PARAMETER_BINDINGS:
            getOwnedParameterBindings().clear();
            return;
         case CallsPackage.INVOCATION__CALLEE:
            setCallee((Callable) null);
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
         case CallsPackage.INVOCATION__OWNED_PARAMETER_BINDINGS:
            return ownedParameterBindings != null && !ownedParameterBindings.isEmpty();
         case CallsPackage.INVOCATION__CALLEE:
            return callee != null;
      }
      return super.eIsSet(featureID);
   }

} // InvocationImpl
