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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.storydriven.modeling.activities.ActivitiesPackage;
import org.storydriven.modeling.activities.StopNode;
import org.storydriven.modeling.expressions.Expression;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Stop Node</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.storydriven.modeling.activities.impl.StopNodeImpl#isFlowStopOnly <em>Flow Stop Only</em>}</li>
 *   <li>{@link org.storydriven.modeling.activities.impl.StopNodeImpl#getReturnValue <em>Return Value</em>}</li>
 *   <li>{@link org.storydriven.modeling.activities.impl.StopNodeImpl#getReturnValues <em>Return Values</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StopNodeImpl extends ActivityNodeImpl implements StopNode
{
   /**
    * The default value of the '{@link #isFlowStopOnly() <em>Flow Stop Only</em>}' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #isFlowStopOnly()
    * @generated
    * @ordered
    */
   protected static final boolean FLOW_STOP_ONLY_EDEFAULT = false;

   /**
    * The cached value of the '{@link #isFlowStopOnly() <em>Flow Stop Only</em>}' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #isFlowStopOnly()
    * @generated
    * @ordered
    */
   protected boolean flowStopOnly = FLOW_STOP_ONLY_EDEFAULT;

   /**
    * The cached value of the '{@link #getReturnValues() <em>Return Values</em>}' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #getReturnValues()
    * @generated
    * @ordered
    */
   protected EList<Expression> returnValues;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   protected StopNodeImpl ()
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
      return ActivitiesPackage.Literals.STOP_NODE;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public boolean isFlowStopOnly ()
   {
      return flowStopOnly;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public void setFlowStopOnly (boolean newFlowStopOnly)
   {
      boolean oldFlowStopOnly = flowStopOnly;
      flowStopOnly = newFlowStopOnly;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ActivitiesPackage.STOP_NODE__FLOW_STOP_ONLY,
            oldFlowStopOnly, flowStopOnly));
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public Expression getReturnValue ()
   {
      Expression returnValue = basicGetReturnValue();
      return returnValue != null && returnValue.eIsProxy() ? (Expression) eResolveProxy((InternalEObject) returnValue)
         : returnValue;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    */
   public Expression basicGetReturnValue ()
   {
      // return first parameter from the list if it exists
      if (getReturnValues().size() >= 1)
      {
         return getReturnValues().get(0);
      }
      else
      {
         return null;
      }
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EList<Expression> getReturnValues ()
   {
      if (returnValues == null)
      {
         returnValues = new EObjectContainmentEList.Resolving<Expression>(Expression.class, this,
            ActivitiesPackage.STOP_NODE__RETURN_VALUES);
      }
      return returnValues;
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
         case ActivitiesPackage.STOP_NODE__RETURN_VALUES:
            return ((InternalEList<?>) getReturnValues()).basicRemove(otherEnd, msgs);
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
         case ActivitiesPackage.STOP_NODE__FLOW_STOP_ONLY:
            return isFlowStopOnly();
         case ActivitiesPackage.STOP_NODE__RETURN_VALUE:
            if (resolve)
               return getReturnValue();
            return basicGetReturnValue();
         case ActivitiesPackage.STOP_NODE__RETURN_VALUES:
            return getReturnValues();
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
         case ActivitiesPackage.STOP_NODE__FLOW_STOP_ONLY:
            setFlowStopOnly((Boolean) newValue);
            return;
         case ActivitiesPackage.STOP_NODE__RETURN_VALUES:
            getReturnValues().clear();
            getReturnValues().addAll((Collection<? extends Expression>) newValue);
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
         case ActivitiesPackage.STOP_NODE__FLOW_STOP_ONLY:
            setFlowStopOnly(FLOW_STOP_ONLY_EDEFAULT);
            return;
         case ActivitiesPackage.STOP_NODE__RETURN_VALUES:
            getReturnValues().clear();
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
         case ActivitiesPackage.STOP_NODE__FLOW_STOP_ONLY:
            return flowStopOnly != FLOW_STOP_ONLY_EDEFAULT;
         case ActivitiesPackage.STOP_NODE__RETURN_VALUE:
            return basicGetReturnValue() != null;
         case ActivitiesPackage.STOP_NODE__RETURN_VALUES:
            return returnValues != null && !returnValues.isEmpty();
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
      result.append(" (flowStopOnly: ");
      result.append(flowStopOnly);
      result.append(')');
      return result.toString();
   }

} // StopNodeImpl
