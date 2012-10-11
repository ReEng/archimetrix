/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.fujaba.commons.notation.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.fujaba.commons.identifier.impl.IdentifierImpl;
import org.fujaba.commons.notation.Edge;
import org.fujaba.commons.notation.HierarchicalNode;
import org.fujaba.commons.notation.Node;
import org.fujaba.commons.notation.NotationPackage;



/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.fujaba.commons.notation.impl.NodeImpl#getModel <em>Model</em>}</li>
 *   <li>{@link org.fujaba.commons.notation.impl.NodeImpl#isVisible <em>Visible</em>}</li>
 *   <li>{@link org.fujaba.commons.notation.impl.NodeImpl#isPersistent <em>Persistent</em>}</li>
 *   <li>{@link org.fujaba.commons.notation.impl.NodeImpl#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link org.fujaba.commons.notation.impl.NodeImpl#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link org.fujaba.commons.notation.impl.NodeImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.fujaba.commons.notation.impl.NodeImpl#getX <em>X</em>}</li>
 *   <li>{@link org.fujaba.commons.notation.impl.NodeImpl#getY <em>Y</em>}</li>
 *   <li>{@link org.fujaba.commons.notation.impl.NodeImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link org.fujaba.commons.notation.impl.NodeImpl#getHeight <em>Height</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeImpl extends IdentifierImpl implements Node
{
   /**
    * The cached value of the '{@link #getModel() <em>Model</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getModel()
    * @generated
    * @ordered
    */
   protected EObject model;

   /**
    * The default value of the '{@link #isVisible() <em>Visible</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #isVisible()
    * @generated
    * @ordered
    */
   protected static final boolean VISIBLE_EDEFAULT = true;

   /**
    * The cached value of the '{@link #isVisible() <em>Visible</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #isVisible()
    * @generated
    * @ordered
    */
   protected boolean visible = VISIBLE_EDEFAULT;

   /**
    * The default value of the '{@link #isPersistent() <em>Persistent</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #isPersistent()
    * @generated
    * @ordered
    */
   protected static final boolean PERSISTENT_EDEFAULT = true;

   /**
    * The cached value of the '{@link #isPersistent() <em>Persistent</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #isPersistent()
    * @generated
    * @ordered
    */
   protected boolean persistent = PERSISTENT_EDEFAULT;

   /**
    * The cached value of the '{@link #getOutgoing() <em>Outgoing</em>}' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getOutgoing()
    * @generated
    * @ordered
    */
   protected EList<Edge> outgoing;

   /**
    * The cached value of the '{@link #getIncoming() <em>Incoming</em>}' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getIncoming()
    * @generated
    * @ordered
    */
   protected EList<Edge> incoming;

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
    * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getWidth()
    * @generated
    * @ordered
    */
   protected static final int WIDTH_EDEFAULT = 0;

   /**
    * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getWidth()
    * @generated
    * @ordered
    */
   protected int width = WIDTH_EDEFAULT;

   /**
    * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getHeight()
    * @generated
    * @ordered
    */
   protected static final int HEIGHT_EDEFAULT = 0;

   /**
    * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getHeight()
    * @generated
    * @ordered
    */
   protected int height = HEIGHT_EDEFAULT;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected NodeImpl()
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
      return NotationPackage.Literals.NODE;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EObject getModel()
   {
      if (model != null && model.eIsProxy())
      {
         InternalEObject oldModel = (InternalEObject)model;
         model = eResolveProxy(oldModel);
         if (model != oldModel)
         {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, NotationPackage.NODE__MODEL, oldModel, model));
         }
      }
      return model;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EObject basicGetModel()
   {
      return model;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setModel(EObject newModel)
   {
      EObject oldModel = model;
      model = newModel;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.NODE__MODEL, oldModel, model));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean isVisible()
   {
      return visible;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setVisible(boolean newVisible)
   {
      boolean oldVisible = visible;
      visible = newVisible;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.NODE__VISIBLE, oldVisible, visible));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean isPersistent()
   {
      return persistent;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setPersistent(boolean newPersistent)
   {
      boolean oldPersistent = persistent;
      persistent = newPersistent;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.NODE__PERSISTENT, oldPersistent, persistent));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<Edge> getOutgoing()
   {
      if (outgoing == null)
      {
         outgoing = new EObjectWithInverseResolvingEList<Edge>(Edge.class, this, NotationPackage.NODE__OUTGOING, NotationPackage.EDGE__SOURCE);
      }
      return outgoing;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<Edge> getIncoming()
   {
      if (incoming == null)
      {
         incoming = new EObjectWithInverseResolvingEList<Edge>(Edge.class, this, NotationPackage.NODE__INCOMING, NotationPackage.EDGE__TARGET);
      }
      return incoming;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public HierarchicalNode getParent()
   {
      if (eContainerFeatureID() != NotationPackage.NODE__PARENT) return null;
      return (HierarchicalNode)eContainer();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetParent(HierarchicalNode newParent, NotificationChain msgs)
   {
      msgs = eBasicSetContainer((InternalEObject)newParent, NotationPackage.NODE__PARENT, msgs);
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setParent(HierarchicalNode newParent)
   {
      if (newParent != eInternalContainer() || (eContainerFeatureID() != NotationPackage.NODE__PARENT && newParent != null))
      {
         if (EcoreUtil.isAncestor(this, newParent))
            throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
         NotificationChain msgs = null;
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         if (newParent != null)
            msgs = ((InternalEObject)newParent).eInverseAdd(this, NotationPackage.HIERARCHICAL_NODE__NODES, HierarchicalNode.class, msgs);
         msgs = basicSetParent(newParent, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.NODE__PARENT, newParent, newParent));
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
         eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.NODE__X, oldX, x));
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
         eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.NODE__Y, oldY, y));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public int getWidth()
   {
      return width;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setWidth(int newWidth)
   {
      int oldWidth = width;
      width = newWidth;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.NODE__WIDTH, oldWidth, width));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public int getHeight()
   {
      return height;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setHeight(int newHeight)
   {
      int oldHeight = height;
      height = newHeight;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.NODE__HEIGHT, oldHeight, height));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @SuppressWarnings("unchecked")
   @Override
   public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
   {
      switch (featureID)
      {
         case NotationPackage.NODE__OUTGOING:
            return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoing()).basicAdd(otherEnd, msgs);
         case NotationPackage.NODE__INCOMING:
            return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncoming()).basicAdd(otherEnd, msgs);
         case NotationPackage.NODE__PARENT:
            if (eInternalContainer() != null)
               msgs = eBasicRemoveFromContainer(msgs);
            return basicSetParent((HierarchicalNode)otherEnd, msgs);
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
         case NotationPackage.NODE__OUTGOING:
            return ((InternalEList<?>)getOutgoing()).basicRemove(otherEnd, msgs);
         case NotationPackage.NODE__INCOMING:
            return ((InternalEList<?>)getIncoming()).basicRemove(otherEnd, msgs);
         case NotationPackage.NODE__PARENT:
            return basicSetParent(null, msgs);
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
         case NotationPackage.NODE__PARENT:
            return eInternalContainer().eInverseRemove(this, NotationPackage.HIERARCHICAL_NODE__NODES, HierarchicalNode.class, msgs);
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
         case NotationPackage.NODE__MODEL:
            if (resolve) return getModel();
            return basicGetModel();
         case NotationPackage.NODE__VISIBLE:
            return isVisible();
         case NotationPackage.NODE__PERSISTENT:
            return isPersistent();
         case NotationPackage.NODE__OUTGOING:
            return getOutgoing();
         case NotationPackage.NODE__INCOMING:
            return getIncoming();
         case NotationPackage.NODE__PARENT:
            return getParent();
         case NotationPackage.NODE__X:
            return getX();
         case NotationPackage.NODE__Y:
            return getY();
         case NotationPackage.NODE__WIDTH:
            return getWidth();
         case NotationPackage.NODE__HEIGHT:
            return getHeight();
      }
      return super.eGet(featureID, resolve, coreType);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @SuppressWarnings("unchecked")
   @Override
   public void eSet(int featureID, Object newValue)
   {
      switch (featureID)
      {
         case NotationPackage.NODE__MODEL:
            setModel((EObject)newValue);
            return;
         case NotationPackage.NODE__VISIBLE:
            setVisible((Boolean)newValue);
            return;
         case NotationPackage.NODE__PERSISTENT:
            setPersistent((Boolean)newValue);
            return;
         case NotationPackage.NODE__OUTGOING:
            getOutgoing().clear();
            getOutgoing().addAll((Collection<? extends Edge>)newValue);
            return;
         case NotationPackage.NODE__INCOMING:
            getIncoming().clear();
            getIncoming().addAll((Collection<? extends Edge>)newValue);
            return;
         case NotationPackage.NODE__PARENT:
            setParent((HierarchicalNode)newValue);
            return;
         case NotationPackage.NODE__X:
            setX((Integer)newValue);
            return;
         case NotationPackage.NODE__Y:
            setY((Integer)newValue);
            return;
         case NotationPackage.NODE__WIDTH:
            setWidth((Integer)newValue);
            return;
         case NotationPackage.NODE__HEIGHT:
            setHeight((Integer)newValue);
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
         case NotationPackage.NODE__MODEL:
            setModel((EObject)null);
            return;
         case NotationPackage.NODE__VISIBLE:
            setVisible(VISIBLE_EDEFAULT);
            return;
         case NotationPackage.NODE__PERSISTENT:
            setPersistent(PERSISTENT_EDEFAULT);
            return;
         case NotationPackage.NODE__OUTGOING:
            getOutgoing().clear();
            return;
         case NotationPackage.NODE__INCOMING:
            getIncoming().clear();
            return;
         case NotationPackage.NODE__PARENT:
            setParent((HierarchicalNode)null);
            return;
         case NotationPackage.NODE__X:
            setX(X_EDEFAULT);
            return;
         case NotationPackage.NODE__Y:
            setY(Y_EDEFAULT);
            return;
         case NotationPackage.NODE__WIDTH:
            setWidth(WIDTH_EDEFAULT);
            return;
         case NotationPackage.NODE__HEIGHT:
            setHeight(HEIGHT_EDEFAULT);
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
         case NotationPackage.NODE__MODEL:
            return model != null;
         case NotationPackage.NODE__VISIBLE:
            return visible != VISIBLE_EDEFAULT;
         case NotationPackage.NODE__PERSISTENT:
            return persistent != PERSISTENT_EDEFAULT;
         case NotationPackage.NODE__OUTGOING:
            return outgoing != null && !outgoing.isEmpty();
         case NotationPackage.NODE__INCOMING:
            return incoming != null && !incoming.isEmpty();
         case NotationPackage.NODE__PARENT:
            return getParent() != null;
         case NotationPackage.NODE__X:
            return x != X_EDEFAULT;
         case NotationPackage.NODE__Y:
            return y != Y_EDEFAULT;
         case NotationPackage.NODE__WIDTH:
            return width != WIDTH_EDEFAULT;
         case NotationPackage.NODE__HEIGHT:
            return height != HEIGHT_EDEFAULT;
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
      result.append(" (visible: ");
      result.append(visible);
      result.append(", persistent: ");
      result.append(persistent);
      result.append(", x: ");
      result.append(x);
      result.append(", y: ");
      result.append(y);
      result.append(", width: ");
      result.append(width);
      result.append(", height: ");
      result.append(height);
      result.append(')');
      return result.toString();
   }

} //NodeImpl
