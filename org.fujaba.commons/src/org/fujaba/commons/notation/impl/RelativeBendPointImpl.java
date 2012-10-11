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
import org.fujaba.commons.notation.Edge;
import org.fujaba.commons.notation.NotationPackage;
import org.fujaba.commons.notation.RelativeBendPoint;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relative Bend Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.fujaba.commons.notation.impl.RelativeBendPointImpl#getEdge <em>Edge</em>}</li>
 *   <li>{@link org.fujaba.commons.notation.impl.RelativeBendPointImpl#getSourceX <em>Source X</em>}</li>
 *   <li>{@link org.fujaba.commons.notation.impl.RelativeBendPointImpl#getSourceY <em>Source Y</em>}</li>
 *   <li>{@link org.fujaba.commons.notation.impl.RelativeBendPointImpl#getTargetX <em>Target X</em>}</li>
 *   <li>{@link org.fujaba.commons.notation.impl.RelativeBendPointImpl#getTargetY <em>Target Y</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelativeBendPointImpl extends EObjectImpl implements RelativeBendPoint
{
   /**
    * The default value of the '{@link #getSourceX() <em>Source X</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getSourceX()
    * @generated
    * @ordered
    */
   protected static final int SOURCE_X_EDEFAULT = 0;

   /**
    * The cached value of the '{@link #getSourceX() <em>Source X</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getSourceX()
    * @generated
    * @ordered
    */
   protected int sourceX = SOURCE_X_EDEFAULT;

   /**
    * The default value of the '{@link #getSourceY() <em>Source Y</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getSourceY()
    * @generated
    * @ordered
    */
   protected static final int SOURCE_Y_EDEFAULT = 0;

   /**
    * The cached value of the '{@link #getSourceY() <em>Source Y</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getSourceY()
    * @generated
    * @ordered
    */
   protected int sourceY = SOURCE_Y_EDEFAULT;

   /**
    * The default value of the '{@link #getTargetX() <em>Target X</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getTargetX()
    * @generated
    * @ordered
    */
   protected static final int TARGET_X_EDEFAULT = 0;

   /**
    * The cached value of the '{@link #getTargetX() <em>Target X</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getTargetX()
    * @generated
    * @ordered
    */
   protected int targetX = TARGET_X_EDEFAULT;

   /**
    * The default value of the '{@link #getTargetY() <em>Target Y</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getTargetY()
    * @generated
    * @ordered
    */
   protected static final int TARGET_Y_EDEFAULT = 0;

   /**
    * The cached value of the '{@link #getTargetY() <em>Target Y</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getTargetY()
    * @generated
    * @ordered
    */
   protected int targetY = TARGET_Y_EDEFAULT;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected RelativeBendPointImpl()
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
      return NotationPackage.Literals.RELATIVE_BEND_POINT;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Edge getEdge()
   {
      if (eContainerFeatureID() != NotationPackage.RELATIVE_BEND_POINT__EDGE) return null;
      return (Edge)eContainer();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetEdge(Edge newEdge, NotificationChain msgs)
   {
      msgs = eBasicSetContainer((InternalEObject)newEdge, NotationPackage.RELATIVE_BEND_POINT__EDGE, msgs);
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setEdge(Edge newEdge)
   {
      if (newEdge != eInternalContainer() || (eContainerFeatureID() != NotationPackage.RELATIVE_BEND_POINT__EDGE && newEdge != null))
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
         eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.RELATIVE_BEND_POINT__EDGE, newEdge, newEdge));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public int getSourceX()
   {
      return sourceX;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setSourceX(int newSourceX)
   {
      int oldSourceX = sourceX;
      sourceX = newSourceX;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.RELATIVE_BEND_POINT__SOURCE_X, oldSourceX, sourceX));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public int getSourceY()
   {
      return sourceY;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setSourceY(int newSourceY)
   {
      int oldSourceY = sourceY;
      sourceY = newSourceY;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.RELATIVE_BEND_POINT__SOURCE_Y, oldSourceY, sourceY));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public int getTargetX()
   {
      return targetX;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setTargetX(int newTargetX)
   {
      int oldTargetX = targetX;
      targetX = newTargetX;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.RELATIVE_BEND_POINT__TARGET_X, oldTargetX, targetX));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public int getTargetY()
   {
      return targetY;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setTargetY(int newTargetY)
   {
      int oldTargetY = targetY;
      targetY = newTargetY;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.RELATIVE_BEND_POINT__TARGET_Y, oldTargetY, targetY));
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
         case NotationPackage.RELATIVE_BEND_POINT__EDGE:
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
         case NotationPackage.RELATIVE_BEND_POINT__EDGE:
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
         case NotationPackage.RELATIVE_BEND_POINT__EDGE:
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
         case NotationPackage.RELATIVE_BEND_POINT__EDGE:
            return getEdge();
         case NotationPackage.RELATIVE_BEND_POINT__SOURCE_X:
            return getSourceX();
         case NotationPackage.RELATIVE_BEND_POINT__SOURCE_Y:
            return getSourceY();
         case NotationPackage.RELATIVE_BEND_POINT__TARGET_X:
            return getTargetX();
         case NotationPackage.RELATIVE_BEND_POINT__TARGET_Y:
            return getTargetY();
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
         case NotationPackage.RELATIVE_BEND_POINT__EDGE:
            setEdge((Edge)newValue);
            return;
         case NotationPackage.RELATIVE_BEND_POINT__SOURCE_X:
            setSourceX((Integer)newValue);
            return;
         case NotationPackage.RELATIVE_BEND_POINT__SOURCE_Y:
            setSourceY((Integer)newValue);
            return;
         case NotationPackage.RELATIVE_BEND_POINT__TARGET_X:
            setTargetX((Integer)newValue);
            return;
         case NotationPackage.RELATIVE_BEND_POINT__TARGET_Y:
            setTargetY((Integer)newValue);
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
         case NotationPackage.RELATIVE_BEND_POINT__EDGE:
            setEdge((Edge)null);
            return;
         case NotationPackage.RELATIVE_BEND_POINT__SOURCE_X:
            setSourceX(SOURCE_X_EDEFAULT);
            return;
         case NotationPackage.RELATIVE_BEND_POINT__SOURCE_Y:
            setSourceY(SOURCE_Y_EDEFAULT);
            return;
         case NotationPackage.RELATIVE_BEND_POINT__TARGET_X:
            setTargetX(TARGET_X_EDEFAULT);
            return;
         case NotationPackage.RELATIVE_BEND_POINT__TARGET_Y:
            setTargetY(TARGET_Y_EDEFAULT);
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
         case NotationPackage.RELATIVE_BEND_POINT__EDGE:
            return getEdge() != null;
         case NotationPackage.RELATIVE_BEND_POINT__SOURCE_X:
            return sourceX != SOURCE_X_EDEFAULT;
         case NotationPackage.RELATIVE_BEND_POINT__SOURCE_Y:
            return sourceY != SOURCE_Y_EDEFAULT;
         case NotationPackage.RELATIVE_BEND_POINT__TARGET_X:
            return targetX != TARGET_X_EDEFAULT;
         case NotationPackage.RELATIVE_BEND_POINT__TARGET_Y:
            return targetY != TARGET_Y_EDEFAULT;
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
      result.append(" (sourceX: ");
      result.append(sourceX);
      result.append(", sourceY: ");
      result.append(sourceY);
      result.append(", targetX: ");
      result.append(targetX);
      result.append(", targetY: ");
      result.append(targetY);
      result.append(')');
      return result.toString();
   }

} //RelativeBendPointImpl
