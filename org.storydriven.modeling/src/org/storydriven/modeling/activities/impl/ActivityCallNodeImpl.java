/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.activities.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.storydriven.modeling.activities.ActivitiesPackage;
import org.storydriven.modeling.activities.Activity;
import org.storydriven.modeling.activities.ActivityCallNode;
import org.storydriven.modeling.calls.Callable;
import org.storydriven.modeling.calls.CallsPackage;
import org.storydriven.modeling.calls.Invocation;
import org.storydriven.modeling.calls.ParameterBinding;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Activity Call Node</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.storydriven.modeling.activities.impl.ActivityCallNodeImpl#getOwnedParameterBindings <em>Owned Parameter Bindings</em>}</li>
 *   <li>{@link org.storydriven.modeling.activities.impl.ActivityCallNodeImpl#getCallee <em>Callee</em>}</li>
 *   <li>{@link org.storydriven.modeling.activities.impl.ActivityCallNodeImpl#getCalledActivities <em>Called Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityCallNodeImpl extends ActivityNodeImpl implements ActivityCallNode
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
    * The cached value of the '{@link #getCalledActivities() <em>Called Activity</em>}' reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #getCalledActivities()
    * @generated
    * @ordered
    */
   protected EList<Activity> calledActivities;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   protected ActivityCallNodeImpl ()
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
      return ActivitiesPackage.Literals.ACTIVITY_CALL_NODE;
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
            ParameterBinding.class, this, ActivitiesPackage.ACTIVITY_CALL_NODE__OWNED_PARAMETER_BINDINGS,
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
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivitiesPackage.ACTIVITY_CALL_NODE__CALLEE,
                  oldCallee, callee));
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
         eNotify(new ENotificationImpl(this, Notification.SET, ActivitiesPackage.ACTIVITY_CALL_NODE__CALLEE, oldCallee,
            callee));
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EList<Activity> getCalledActivities ()
   {
      if (calledActivities == null)
      {
         calledActivities = new EObjectResolvingEList<Activity>(Activity.class, this,
            ActivitiesPackage.ACTIVITY_CALL_NODE__CALLED_ACTIVITY);
      }
      return calledActivities;
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
         case ActivitiesPackage.ACTIVITY_CALL_NODE__OWNED_PARAMETER_BINDINGS:
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
         case ActivitiesPackage.ACTIVITY_CALL_NODE__OWNED_PARAMETER_BINDINGS:
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
         case ActivitiesPackage.ACTIVITY_CALL_NODE__OWNED_PARAMETER_BINDINGS:
            return getOwnedParameterBindings();
         case ActivitiesPackage.ACTIVITY_CALL_NODE__CALLEE:
            if (resolve)
               return getCallee();
            return basicGetCallee();
         case ActivitiesPackage.ACTIVITY_CALL_NODE__CALLED_ACTIVITY:
            return getCalledActivities();
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
         case ActivitiesPackage.ACTIVITY_CALL_NODE__OWNED_PARAMETER_BINDINGS:
            getOwnedParameterBindings().clear();
            getOwnedParameterBindings().addAll((Collection<? extends ParameterBinding>) newValue);
            return;
         case ActivitiesPackage.ACTIVITY_CALL_NODE__CALLEE:
            setCallee((Callable) newValue);
            return;
         case ActivitiesPackage.ACTIVITY_CALL_NODE__CALLED_ACTIVITY:
            getCalledActivities().clear();
            getCalledActivities().addAll((Collection<? extends Activity>) newValue);
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
         case ActivitiesPackage.ACTIVITY_CALL_NODE__OWNED_PARAMETER_BINDINGS:
            getOwnedParameterBindings().clear();
            return;
         case ActivitiesPackage.ACTIVITY_CALL_NODE__CALLEE:
            setCallee((Callable) null);
            return;
         case ActivitiesPackage.ACTIVITY_CALL_NODE__CALLED_ACTIVITY:
            getCalledActivities().clear();
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
         case ActivitiesPackage.ACTIVITY_CALL_NODE__OWNED_PARAMETER_BINDINGS:
            return ownedParameterBindings != null && !ownedParameterBindings.isEmpty();
         case ActivitiesPackage.ACTIVITY_CALL_NODE__CALLEE:
            return callee != null;
         case ActivitiesPackage.ACTIVITY_CALL_NODE__CALLED_ACTIVITY:
            return calledActivities != null && !calledActivities.isEmpty();
      }
      return super.eIsSet(featureID);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   @Override
   public int eBaseStructuralFeatureID (int derivedFeatureID, Class<?> baseClass)
   {
      if (baseClass == Invocation.class)
      {
         switch (derivedFeatureID)
         {
            case ActivitiesPackage.ACTIVITY_CALL_NODE__OWNED_PARAMETER_BINDINGS:
               return CallsPackage.INVOCATION__OWNED_PARAMETER_BINDINGS;
            case ActivitiesPackage.ACTIVITY_CALL_NODE__CALLEE:
               return CallsPackage.INVOCATION__CALLEE;
            default:
               return -1;
         }
      }
      return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   @Override
   public int eDerivedStructuralFeatureID (int baseFeatureID, Class<?> baseClass)
   {
      if (baseClass == Invocation.class)
      {
         switch (baseFeatureID)
         {
            case CallsPackage.INVOCATION__OWNED_PARAMETER_BINDINGS:
               return ActivitiesPackage.ACTIVITY_CALL_NODE__OWNED_PARAMETER_BINDINGS;
            case CallsPackage.INVOCATION__CALLEE:
               return ActivitiesPackage.ACTIVITY_CALL_NODE__CALLEE;
            default:
               return -1;
         }
      }
      return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
   }

} // ActivityCallNodeImpl
