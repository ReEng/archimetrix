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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.storydriven.modeling.activities.ActivitiesPackage;
import org.storydriven.modeling.activities.Activity;
import org.storydriven.modeling.activities.ActivityEdge;
import org.storydriven.modeling.activities.ActivityNode;
import org.storydriven.modeling.activities.EdgeGuard;
import org.storydriven.modeling.activities.ExceptionVariable;
import org.storydriven.modeling.expressions.Expression;
import org.storydriven.modeling.impl.ExtendableElementImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Activity Edge</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.storydriven.modeling.activities.impl.ActivityEdgeImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.storydriven.modeling.activities.impl.ActivityEdgeImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.storydriven.modeling.activities.impl.ActivityEdgeImpl#getOwningActivity <em>Owning Activity</em>}</li>
 *   <li>{@link org.storydriven.modeling.activities.impl.ActivityEdgeImpl#getGuard <em>Guard</em>}</li>
 *   <li>{@link org.storydriven.modeling.activities.impl.ActivityEdgeImpl#getGuardExpression <em>Guard Expression</em>}</li>
 *   <li>{@link org.storydriven.modeling.activities.impl.ActivityEdgeImpl#getGuardExceptions <em>Guard Exception</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityEdgeImpl extends ExtendableElementImpl implements ActivityEdge
{
   /**
    * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #getTarget()
    * @generated
    * @ordered
    */
   protected ActivityNode target;

   /**
    * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #getSource()
    * @generated
    * @ordered
    */
   protected ActivityNode source;

   /**
    * The default value of the '{@link #getGuard() <em>Guard</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getGuard()
    * @generated
    * @ordered
    */
   protected static final EdgeGuard GUARD_EDEFAULT = EdgeGuard.NONE;

   /**
    * The cached value of the '{@link #getGuard() <em>Guard</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getGuard()
    * @generated
    * @ordered
    */
   protected EdgeGuard guard = GUARD_EDEFAULT;

   /**
    * The cached value of the '{@link #getGuardExpression() <em>Guard Expression</em>}' containment reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #getGuardExpression()
    * @generated
    * @ordered
    */
   protected Expression guardExpression;

   /**
    * The cached value of the '{@link #getGuardExceptions() <em>Guard Exception</em>}' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #getGuardExceptions()
    * @generated
    * @ordered
    */
   protected EList<ExceptionVariable> guardExceptions;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   protected ActivityEdgeImpl ()
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
      return ActivitiesPackage.Literals.ACTIVITY_EDGE;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public ActivityNode getSource ()
   {
      if (source != null && source.eIsProxy())
      {
         InternalEObject oldSource = (InternalEObject) source;
         source = (ActivityNode) eResolveProxy(oldSource);
         if (source != oldSource)
         {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivitiesPackage.ACTIVITY_EDGE__SOURCE,
                  oldSource, source));
         }
      }
      return source;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public ActivityNode basicGetSource ()
   {
      return source;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetSource (ActivityNode newSource, NotificationChain msgs)
   {
      ActivityNode oldSource = source;
      source = newSource;
      if (eNotificationRequired())
      {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
            ActivitiesPackage.ACTIVITY_EDGE__SOURCE, oldSource, newSource);
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
   public void setSource (ActivityNode newSource)
   {
      if (newSource != source)
      {
         NotificationChain msgs = null;
         if (source != null)
            msgs = ((InternalEObject) source).eInverseRemove(this, ActivitiesPackage.ACTIVITY_NODE__OUTGOING,
               ActivityNode.class, msgs);
         if (newSource != null)
            msgs = ((InternalEObject) newSource).eInverseAdd(this, ActivitiesPackage.ACTIVITY_NODE__OUTGOING,
               ActivityNode.class, msgs);
         msgs = basicSetSource(newSource, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ActivitiesPackage.ACTIVITY_EDGE__SOURCE, newSource,
            newSource));
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public Expression getGuardExpression ()
   {
      if (guardExpression != null && guardExpression.eIsProxy())
      {
         InternalEObject oldGuardExpression = (InternalEObject) guardExpression;
         guardExpression = (Expression) eResolveProxy(oldGuardExpression);
         if (guardExpression != oldGuardExpression)
         {
            InternalEObject newGuardExpression = (InternalEObject) guardExpression;
            NotificationChain msgs = oldGuardExpression.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
               - ActivitiesPackage.ACTIVITY_EDGE__GUARD_EXPRESSION, null, null);
            if (newGuardExpression.eInternalContainer() == null)
            {
               msgs = newGuardExpression.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                  - ActivitiesPackage.ACTIVITY_EDGE__GUARD_EXPRESSION, null, msgs);
            }
            if (msgs != null)
               msgs.dispatch();
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                  ActivitiesPackage.ACTIVITY_EDGE__GUARD_EXPRESSION, oldGuardExpression, guardExpression));
         }
      }
      return guardExpression;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public Expression basicGetGuardExpression ()
   {
      return guardExpression;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetGuardExpression (Expression newGuardExpression, NotificationChain msgs)
   {
      Expression oldGuardExpression = guardExpression;
      guardExpression = newGuardExpression;
      if (eNotificationRequired())
      {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
            ActivitiesPackage.ACTIVITY_EDGE__GUARD_EXPRESSION, oldGuardExpression, newGuardExpression);
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
   public void setGuardExpression (Expression newGuardExpression)
   {
      if (newGuardExpression != guardExpression)
      {
         NotificationChain msgs = null;
         if (guardExpression != null)
            msgs = ((InternalEObject) guardExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
               - ActivitiesPackage.ACTIVITY_EDGE__GUARD_EXPRESSION, null, msgs);
         if (newGuardExpression != null)
            msgs = ((InternalEObject) newGuardExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
               - ActivitiesPackage.ACTIVITY_EDGE__GUARD_EXPRESSION, null, msgs);
         msgs = basicSetGuardExpression(newGuardExpression, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ActivitiesPackage.ACTIVITY_EDGE__GUARD_EXPRESSION,
            newGuardExpression, newGuardExpression));
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public Activity getOwningActivity ()
   {
      if (eContainerFeatureID() != ActivitiesPackage.ACTIVITY_EDGE__OWNING_ACTIVITY)
         return null;
      return (Activity) eContainer();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public Activity basicGetOwningActivity ()
   {
      if (eContainerFeatureID() != ActivitiesPackage.ACTIVITY_EDGE__OWNING_ACTIVITY)
         return null;
      return (Activity) eInternalContainer();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetOwningActivity (Activity newOwningActivity, NotificationChain msgs)
   {
      msgs = eBasicSetContainer((InternalEObject) newOwningActivity, ActivitiesPackage.ACTIVITY_EDGE__OWNING_ACTIVITY,
         msgs);
      return msgs;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public void setOwningActivity (Activity newOwningActivity)
   {
      if (newOwningActivity != eInternalContainer()
         || (eContainerFeatureID() != ActivitiesPackage.ACTIVITY_EDGE__OWNING_ACTIVITY && newOwningActivity != null))
      {
         if (EcoreUtil.isAncestor(this, newOwningActivity))
            throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
         NotificationChain msgs = null;
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         if (newOwningActivity != null)
            msgs = ((InternalEObject) newOwningActivity).eInverseAdd(this,
               ActivitiesPackage.ACTIVITY__OWNED_ACTIVITY_EDGE, Activity.class, msgs);
         msgs = basicSetOwningActivity(newOwningActivity, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ActivitiesPackage.ACTIVITY_EDGE__OWNING_ACTIVITY,
            newOwningActivity, newOwningActivity));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EdgeGuard getGuard ()
   {
      return guard;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setGuard (EdgeGuard newGuard)
   {
      EdgeGuard oldGuard = guard;
      guard = newGuard == null ? GUARD_EDEFAULT : newGuard;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ActivitiesPackage.ACTIVITY_EDGE__GUARD, oldGuard, guard));
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EList<ExceptionVariable> getGuardExceptions ()
   {
      if (guardExceptions == null)
      {
         guardExceptions = new EObjectContainmentWithInverseEList.Resolving<ExceptionVariable>(ExceptionVariable.class,
            this, ActivitiesPackage.ACTIVITY_EDGE__GUARD_EXCEPTION, ActivitiesPackage.EXCEPTION_VARIABLE__ACTIVITY_EDGE);
      }
      return guardExceptions;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public ActivityNode getTarget ()
   {
      if (target != null && target.eIsProxy())
      {
         InternalEObject oldTarget = (InternalEObject) target;
         target = (ActivityNode) eResolveProxy(oldTarget);
         if (target != oldTarget)
         {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivitiesPackage.ACTIVITY_EDGE__TARGET,
                  oldTarget, target));
         }
      }
      return target;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public ActivityNode basicGetTarget ()
   {
      return target;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetTarget (ActivityNode newTarget, NotificationChain msgs)
   {
      ActivityNode oldTarget = target;
      target = newTarget;
      if (eNotificationRequired())
      {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
            ActivitiesPackage.ACTIVITY_EDGE__TARGET, oldTarget, newTarget);
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
   public void setTarget (ActivityNode newTarget)
   {
      if (newTarget != target)
      {
         NotificationChain msgs = null;
         if (target != null)
            msgs = ((InternalEObject) target).eInverseRemove(this, ActivitiesPackage.ACTIVITY_NODE__INCOMING,
               ActivityNode.class, msgs);
         if (newTarget != null)
            msgs = ((InternalEObject) newTarget).eInverseAdd(this, ActivitiesPackage.ACTIVITY_NODE__INCOMING,
               ActivityNode.class, msgs);
         msgs = basicSetTarget(newTarget, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ActivitiesPackage.ACTIVITY_EDGE__TARGET, newTarget,
            newTarget));
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
         case ActivitiesPackage.ACTIVITY_EDGE__TARGET:
            if (target != null)
               msgs = ((InternalEObject) target).eInverseRemove(this, ActivitiesPackage.ACTIVITY_NODE__INCOMING,
                  ActivityNode.class, msgs);
            return basicSetTarget((ActivityNode) otherEnd, msgs);
         case ActivitiesPackage.ACTIVITY_EDGE__SOURCE:
            if (source != null)
               msgs = ((InternalEObject) source).eInverseRemove(this, ActivitiesPackage.ACTIVITY_NODE__OUTGOING,
                  ActivityNode.class, msgs);
            return basicSetSource((ActivityNode) otherEnd, msgs);
         case ActivitiesPackage.ACTIVITY_EDGE__OWNING_ACTIVITY:
            if (eInternalContainer() != null)
               msgs = eBasicRemoveFromContainer(msgs);
            return basicSetOwningActivity((Activity) otherEnd, msgs);
         case ActivitiesPackage.ACTIVITY_EDGE__GUARD_EXCEPTION:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getGuardExceptions()).basicAdd(otherEnd, msgs);
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
         case ActivitiesPackage.ACTIVITY_EDGE__TARGET:
            return basicSetTarget(null, msgs);
         case ActivitiesPackage.ACTIVITY_EDGE__SOURCE:
            return basicSetSource(null, msgs);
         case ActivitiesPackage.ACTIVITY_EDGE__OWNING_ACTIVITY:
            return basicSetOwningActivity(null, msgs);
         case ActivitiesPackage.ACTIVITY_EDGE__GUARD_EXPRESSION:
            return basicSetGuardExpression(null, msgs);
         case ActivitiesPackage.ACTIVITY_EDGE__GUARD_EXCEPTION:
            return ((InternalEList<?>) getGuardExceptions()).basicRemove(otherEnd, msgs);
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
         case ActivitiesPackage.ACTIVITY_EDGE__OWNING_ACTIVITY:
            return eInternalContainer().eInverseRemove(this, ActivitiesPackage.ACTIVITY__OWNED_ACTIVITY_EDGE,
               Activity.class, msgs);
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
         case ActivitiesPackage.ACTIVITY_EDGE__TARGET:
            if (resolve)
               return getTarget();
            return basicGetTarget();
         case ActivitiesPackage.ACTIVITY_EDGE__SOURCE:
            if (resolve)
               return getSource();
            return basicGetSource();
         case ActivitiesPackage.ACTIVITY_EDGE__OWNING_ACTIVITY:
            if (resolve)
               return getOwningActivity();
            return basicGetOwningActivity();
         case ActivitiesPackage.ACTIVITY_EDGE__GUARD:
            return getGuard();
         case ActivitiesPackage.ACTIVITY_EDGE__GUARD_EXPRESSION:
            if (resolve)
               return getGuardExpression();
            return basicGetGuardExpression();
         case ActivitiesPackage.ACTIVITY_EDGE__GUARD_EXCEPTION:
            return getGuardExceptions();
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
         case ActivitiesPackage.ACTIVITY_EDGE__TARGET:
            setTarget((ActivityNode) newValue);
            return;
         case ActivitiesPackage.ACTIVITY_EDGE__SOURCE:
            setSource((ActivityNode) newValue);
            return;
         case ActivitiesPackage.ACTIVITY_EDGE__OWNING_ACTIVITY:
            setOwningActivity((Activity) newValue);
            return;
         case ActivitiesPackage.ACTIVITY_EDGE__GUARD:
            setGuard((EdgeGuard) newValue);
            return;
         case ActivitiesPackage.ACTIVITY_EDGE__GUARD_EXPRESSION:
            setGuardExpression((Expression) newValue);
            return;
         case ActivitiesPackage.ACTIVITY_EDGE__GUARD_EXCEPTION:
            getGuardExceptions().clear();
            getGuardExceptions().addAll((Collection<? extends ExceptionVariable>) newValue);
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
         case ActivitiesPackage.ACTIVITY_EDGE__TARGET:
            setTarget((ActivityNode) null);
            return;
         case ActivitiesPackage.ACTIVITY_EDGE__SOURCE:
            setSource((ActivityNode) null);
            return;
         case ActivitiesPackage.ACTIVITY_EDGE__OWNING_ACTIVITY:
            setOwningActivity((Activity) null);
            return;
         case ActivitiesPackage.ACTIVITY_EDGE__GUARD:
            setGuard(GUARD_EDEFAULT);
            return;
         case ActivitiesPackage.ACTIVITY_EDGE__GUARD_EXPRESSION:
            setGuardExpression((Expression) null);
            return;
         case ActivitiesPackage.ACTIVITY_EDGE__GUARD_EXCEPTION:
            getGuardExceptions().clear();
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
         case ActivitiesPackage.ACTIVITY_EDGE__TARGET:
            return target != null;
         case ActivitiesPackage.ACTIVITY_EDGE__SOURCE:
            return source != null;
         case ActivitiesPackage.ACTIVITY_EDGE__OWNING_ACTIVITY:
            return basicGetOwningActivity() != null;
         case ActivitiesPackage.ACTIVITY_EDGE__GUARD:
            return guard != GUARD_EDEFAULT;
         case ActivitiesPackage.ACTIVITY_EDGE__GUARD_EXPRESSION:
            return guardExpression != null;
         case ActivitiesPackage.ACTIVITY_EDGE__GUARD_EXCEPTION:
            return guardExceptions != null && !guardExceptions.isEmpty();
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
      result.append(" (guard: ");
      result.append(guard);
      result.append(')');
      return result.toString();
   }

} // ActivityEdgeImpl
