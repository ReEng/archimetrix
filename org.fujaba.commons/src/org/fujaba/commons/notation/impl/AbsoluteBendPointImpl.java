/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.fujaba.commons.notation.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.fujaba.commons.notation.AbsoluteBendPoint;
import org.fujaba.commons.notation.Edge;
import org.fujaba.commons.notation.NotationPackage;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Absolute Bend Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.fujaba.commons.notation.impl.AbsoluteBendPointImpl#getEdge <em>Edge</em>}</li>
 *   <li>{@link org.fujaba.commons.notation.impl.AbsoluteBendPointImpl#getX <em>X</em>}</li>
 *   <li>{@link org.fujaba.commons.notation.impl.AbsoluteBendPointImpl#getY <em>Y</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AbsoluteBendPointImpl extends EObjectImpl implements AbsoluteBendPoint
{
   /**
    * The default value of the '{@link #getX() <em>X</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getX()
    * @generated
    * @ordered
    */
   protected static final int X_EDEFAULT = 0;

   /**
    * The cached value of the '{@link #getX() <em>X</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getX()
    * @generated
    * @ordered
    */
   protected int x = X_EDEFAULT;

   /**
    * The default value of the '{@link #getY() <em>Y</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getY()
    * @generated
    * @ordered
    */
   protected static final int Y_EDEFAULT = 0;

   /**
    * The cached value of the '{@link #getY() <em>Y</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getY()
    * @generated
    * @ordered
    */
   protected int y = Y_EDEFAULT;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected AbsoluteBendPointImpl()
   {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass()
   {
      return NotationPackage.Literals.ABSOLUTE_BEND_POINT;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Edge getEdge()
   {
      if (eContainerFeatureID() != NotationPackage.ABSOLUTE_BEND_POINT__EDGE) return null;
      return (Edge)eContainer();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetEdge(Edge newEdge, NotificationChain msgs)
   {
      msgs = eBasicSetContainer((InternalEObject)newEdge, NotationPackage.ABSOLUTE_BEND_POINT__EDGE, msgs);
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setEdge(Edge newEdge)
   {
      if (newEdge != eInternalContainer() || (eContainerFeatureID() != NotationPackage.ABSOLUTE_BEND_POINT__EDGE && newEdge != null))
      {
         if (EcoreUtil.isAncestor(this, newEdge))
            throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
         NotificationChain msgs = null;
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         if (newEdge != null)
            msgs = ((InternalEObject)newEdge).eInverseAdd(this, NotationPackage.EDGE__BEND_POINTS, Edge.class, msgs);
         msgs = basicSetEdge(newEdge, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.ABSOLUTE_BEND_POINT__EDGE, newEdge, newEdge));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public int getX()
   {
      return x;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setX(int newX)
   {
      int oldX = x;
      x = newX;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.ABSOLUTE_BEND_POINT__X, oldX, x));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public int getY()
   {
      return y;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setY(int newY)
   {
      int oldY = y;
      y = newY;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.ABSOLUTE_BEND_POINT__Y, oldY, y));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
   {
      switch (featureID)
      {
         case NotationPackage.ABSOLUTE_BEND_POINT__EDGE:
            if (eInternalContainer() != null)
               msgs = eBasicRemoveFromContainer(msgs);
            return basicSetEdge((Edge)otherEnd, msgs);
      }
      return super.eInverseAdd(otherEnd, featureID, msgs);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
   {
      switch (featureID)
      {
         case NotationPackage.ABSOLUTE_BEND_POINT__EDGE:
            return basicSetEdge(null, msgs);
      }
      return super.eInverseRemove(otherEnd, featureID, msgs);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
   {
      switch (eContainerFeatureID())
      {
         case NotationPackage.ABSOLUTE_BEND_POINT__EDGE:
            return eInternalContainer().eInverseRemove(this, NotationPackage.EDGE__BEND_POINTS, Edge.class, msgs);
      }
      return super.eBasicRemoveFromContainerFeature(msgs);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object eGet(int featureID, boolean resolve, boolean coreType)
   {
      switch (featureID)
      {
         case NotationPackage.ABSOLUTE_BEND_POINT__EDGE:
            return getEdge();
         case NotationPackage.ABSOLUTE_BEND_POINT__X:
            return getX();
         case NotationPackage.ABSOLUTE_BEND_POINT__Y:
            return getY();
      }
      return super.eGet(featureID, resolve, coreType);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public void eSet(int featureID, Object newValue)
   {
      switch (featureID)
      {
         case NotationPackage.ABSOLUTE_BEND_POINT__EDGE:
            setEdge((Edge)newValue);
            return;
         case NotationPackage.ABSOLUTE_BEND_POINT__X:
            setX((Integer)newValue);
            return;
         case NotationPackage.ABSOLUTE_BEND_POINT__Y:
            setY((Integer)newValue);
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
   public void eUnset(int featureID)
   {
      switch (featureID)
      {
         case NotationPackage.ABSOLUTE_BEND_POINT__EDGE:
            setEdge((Edge)null);
            return;
         case NotationPackage.ABSOLUTE_BEND_POINT__X:
            setX(X_EDEFAULT);
            return;
         case NotationPackage.ABSOLUTE_BEND_POINT__Y:
            setY(Y_EDEFAULT);
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
   public boolean eIsSet(int featureID)
   {
      switch (featureID)
      {
         case NotationPackage.ABSOLUTE_BEND_POINT__EDGE:
            return getEdge() != null;
         case NotationPackage.ABSOLUTE_BEND_POINT__X:
            return x != X_EDEFAULT;
         case NotationPackage.ABSOLUTE_BEND_POINT__Y:
            return y != Y_EDEFAULT;
      }
      return super.eIsSet(featureID);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public String toString()
   {
      if (eIsProxy()) return super.toString();

      StringBuffer result = new StringBuffer(super.toString());
      result.append(" (x: ");
      result.append(x);
      result.append(", y: ");
      result.append(y);
      result.append(')');
      return result.toString();
   }

} //AbsoluteBendPointImpl
