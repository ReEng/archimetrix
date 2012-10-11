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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.fujaba.commons.identifier.impl.IdentifierImpl;
import org.fujaba.commons.notation.Anchor;
import org.fujaba.commons.notation.BendPoint;
import org.fujaba.commons.notation.Edge;
import org.fujaba.commons.notation.HierarchicalNode;
import org.fujaba.commons.notation.Node;
import org.fujaba.commons.notation.NotationPackage;



/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.fujaba.commons.notation.impl.EdgeImpl#getModel <em>Model</em>}</li>
 *   <li>{@link org.fujaba.commons.notation.impl.EdgeImpl#isVisible <em>Visible</em>}</li>
 *   <li>{@link org.fujaba.commons.notation.impl.EdgeImpl#isPersistent <em>Persistent</em>}</li>
 *   <li>{@link org.fujaba.commons.notation.impl.EdgeImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.fujaba.commons.notation.impl.EdgeImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.fujaba.commons.notation.impl.EdgeImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.fujaba.commons.notation.impl.EdgeImpl#getSourceAnchor <em>Source Anchor</em>}</li>
 *   <li>{@link org.fujaba.commons.notation.impl.EdgeImpl#getTargetAnchor <em>Target Anchor</em>}</li>
 *   <li>{@link org.fujaba.commons.notation.impl.EdgeImpl#getBendPoints <em>Bend Points</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EdgeImpl extends IdentifierImpl implements Edge
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
    * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getSource()
    * @generated
    * @ordered
    */
   protected Node source;

   /**
    * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getTarget()
    * @generated
    * @ordered
    */
   protected Node target;

   /**
    * The cached value of the '{@link #getSourceAnchor() <em>Source Anchor</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getSourceAnchor()
    * @generated
    * @ordered
    */
   protected Anchor sourceAnchor;

   /**
    * The cached value of the '{@link #getTargetAnchor() <em>Target Anchor</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getTargetAnchor()
    * @generated
    * @ordered
    */
   protected Anchor targetAnchor;

   /**
    * The cached value of the '{@link #getBendPoints() <em>Bend Points</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getBendPoints()
    * @generated
    * @ordered
    */
   protected EList<BendPoint> bendPoints;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected EdgeImpl()
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
      return NotationPackage.Literals.EDGE;
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
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, NotationPackage.EDGE__MODEL, oldModel, model));
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
         eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.EDGE__MODEL, oldModel, model));
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
         eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.EDGE__VISIBLE, oldVisible, visible));
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
         eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.EDGE__PERSISTENT, oldPersistent, persistent));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Node getSource()
   {
      if (source != null && source.eIsProxy())
      {
         InternalEObject oldSource = (InternalEObject)source;
         source = (Node)eResolveProxy(oldSource);
         if (source != oldSource)
         {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, NotationPackage.EDGE__SOURCE, oldSource, source));
         }
      }
      return source;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Node basicGetSource()
   {
      return source;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetSource(Node newSource, NotificationChain msgs)
   {
      Node oldSource = source;
      source = newSource;
      if (eNotificationRequired())
      {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NotationPackage.EDGE__SOURCE, oldSource, newSource);
         if (msgs == null) msgs = notification; else msgs.add(notification);
      }
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setSource(Node newSource)
   {
      if (newSource != source)
      {
         NotificationChain msgs = null;
         if (source != null)
            msgs = ((InternalEObject)source).eInverseRemove(this, NotationPackage.NODE__OUTGOING, Node.class, msgs);
         if (newSource != null)
            msgs = ((InternalEObject)newSource).eInverseAdd(this, NotationPackage.NODE__OUTGOING, Node.class, msgs);
         msgs = basicSetSource(newSource, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.EDGE__SOURCE, newSource, newSource));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Node getTarget()
   {
      if (target != null && target.eIsProxy())
      {
         InternalEObject oldTarget = (InternalEObject)target;
         target = (Node)eResolveProxy(oldTarget);
         if (target != oldTarget)
         {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, NotationPackage.EDGE__TARGET, oldTarget, target));
         }
      }
      return target;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Node basicGetTarget()
   {
      return target;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetTarget(Node newTarget, NotificationChain msgs)
   {
      Node oldTarget = target;
      target = newTarget;
      if (eNotificationRequired())
      {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NotationPackage.EDGE__TARGET, oldTarget, newTarget);
         if (msgs == null) msgs = notification; else msgs.add(notification);
      }
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setTarget(Node newTarget)
   {
      if (newTarget != target)
      {
         NotificationChain msgs = null;
         if (target != null)
            msgs = ((InternalEObject)target).eInverseRemove(this, NotationPackage.NODE__INCOMING, Node.class, msgs);
         if (newTarget != null)
            msgs = ((InternalEObject)newTarget).eInverseAdd(this, NotationPackage.NODE__INCOMING, Node.class, msgs);
         msgs = basicSetTarget(newTarget, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.EDGE__TARGET, newTarget, newTarget));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public HierarchicalNode getParent()
   {
      if (eContainerFeatureID() != NotationPackage.EDGE__PARENT) return null;
      return (HierarchicalNode)eContainer();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetParent(HierarchicalNode newParent, NotificationChain msgs)
   {
      msgs = eBasicSetContainer((InternalEObject)newParent, NotationPackage.EDGE__PARENT, msgs);
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setParent(HierarchicalNode newParent)
   {
      if (newParent != eInternalContainer() || (eContainerFeatureID() != NotationPackage.EDGE__PARENT && newParent != null))
      {
         if (EcoreUtil.isAncestor(this, newParent))
            throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
         NotificationChain msgs = null;
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         if (newParent != null)
            msgs = ((InternalEObject)newParent).eInverseAdd(this, NotationPackage.HIERARCHICAL_NODE__EDGES, HierarchicalNode.class, msgs);
         msgs = basicSetParent(newParent, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.EDGE__PARENT, newParent, newParent));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Anchor getSourceAnchor()
   {
      return sourceAnchor;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetSourceAnchor(Anchor newSourceAnchor, NotificationChain msgs)
   {
      Anchor oldSourceAnchor = sourceAnchor;
      sourceAnchor = newSourceAnchor;
      if (eNotificationRequired())
      {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NotationPackage.EDGE__SOURCE_ANCHOR, oldSourceAnchor, newSourceAnchor);
         if (msgs == null) msgs = notification; else msgs.add(notification);
      }
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setSourceAnchor(Anchor newSourceAnchor)
   {
      if (newSourceAnchor != sourceAnchor)
      {
         NotificationChain msgs = null;
         if (sourceAnchor != null)
            msgs = ((InternalEObject)sourceAnchor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NotationPackage.EDGE__SOURCE_ANCHOR, null, msgs);
         if (newSourceAnchor != null)
            msgs = ((InternalEObject)newSourceAnchor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NotationPackage.EDGE__SOURCE_ANCHOR, null, msgs);
         msgs = basicSetSourceAnchor(newSourceAnchor, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.EDGE__SOURCE_ANCHOR, newSourceAnchor, newSourceAnchor));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Anchor getTargetAnchor()
   {
      return targetAnchor;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetTargetAnchor(Anchor newTargetAnchor, NotificationChain msgs)
   {
      Anchor oldTargetAnchor = targetAnchor;
      targetAnchor = newTargetAnchor;
      if (eNotificationRequired())
      {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NotationPackage.EDGE__TARGET_ANCHOR, oldTargetAnchor, newTargetAnchor);
         if (msgs == null) msgs = notification; else msgs.add(notification);
      }
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setTargetAnchor(Anchor newTargetAnchor)
   {
      if (newTargetAnchor != targetAnchor)
      {
         NotificationChain msgs = null;
         if (targetAnchor != null)
            msgs = ((InternalEObject)targetAnchor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NotationPackage.EDGE__TARGET_ANCHOR, null, msgs);
         if (newTargetAnchor != null)
            msgs = ((InternalEObject)newTargetAnchor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NotationPackage.EDGE__TARGET_ANCHOR, null, msgs);
         msgs = basicSetTargetAnchor(newTargetAnchor, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.EDGE__TARGET_ANCHOR, newTargetAnchor, newTargetAnchor));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<BendPoint> getBendPoints()
   {
      if (bendPoints == null)
      {
         bendPoints = new EObjectContainmentWithInverseEList<BendPoint>(BendPoint.class, this, NotationPackage.EDGE__BEND_POINTS, NotationPackage.BEND_POINT__EDGE);
      }
      return bendPoints;
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
         case NotationPackage.EDGE__SOURCE:
            if (source != null)
               msgs = ((InternalEObject)source).eInverseRemove(this, NotationPackage.NODE__OUTGOING, Node.class, msgs);
            return basicSetSource((Node)otherEnd, msgs);
         case NotationPackage.EDGE__TARGET:
            if (target != null)
               msgs = ((InternalEObject)target).eInverseRemove(this, NotationPackage.NODE__INCOMING, Node.class, msgs);
            return basicSetTarget((Node)otherEnd, msgs);
         case NotationPackage.EDGE__PARENT:
            if (eInternalContainer() != null)
               msgs = eBasicRemoveFromContainer(msgs);
            return basicSetParent((HierarchicalNode)otherEnd, msgs);
         case NotationPackage.EDGE__BEND_POINTS:
            return ((InternalEList<InternalEObject>)(InternalEList<?>)getBendPoints()).basicAdd(otherEnd, msgs);
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
         case NotationPackage.EDGE__SOURCE:
            return basicSetSource(null, msgs);
         case NotationPackage.EDGE__TARGET:
            return basicSetTarget(null, msgs);
         case NotationPackage.EDGE__PARENT:
            return basicSetParent(null, msgs);
         case NotationPackage.EDGE__SOURCE_ANCHOR:
            return basicSetSourceAnchor(null, msgs);
         case NotationPackage.EDGE__TARGET_ANCHOR:
            return basicSetTargetAnchor(null, msgs);
         case NotationPackage.EDGE__BEND_POINTS:
            return ((InternalEList<?>)getBendPoints()).basicRemove(otherEnd, msgs);
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
         case NotationPackage.EDGE__PARENT:
            return eInternalContainer().eInverseRemove(this, NotationPackage.HIERARCHICAL_NODE__EDGES, HierarchicalNode.class, msgs);
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
         case NotationPackage.EDGE__MODEL:
            if (resolve) return getModel();
            return basicGetModel();
         case NotationPackage.EDGE__VISIBLE:
            return isVisible();
         case NotationPackage.EDGE__PERSISTENT:
            return isPersistent();
         case NotationPackage.EDGE__SOURCE:
            if (resolve) return getSource();
            return basicGetSource();
         case NotationPackage.EDGE__TARGET:
            if (resolve) return getTarget();
            return basicGetTarget();
         case NotationPackage.EDGE__PARENT:
            return getParent();
         case NotationPackage.EDGE__SOURCE_ANCHOR:
            return getSourceAnchor();
         case NotationPackage.EDGE__TARGET_ANCHOR:
            return getTargetAnchor();
         case NotationPackage.EDGE__BEND_POINTS:
            return getBendPoints();
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
         case NotationPackage.EDGE__MODEL:
            setModel((EObject)newValue);
            return;
         case NotationPackage.EDGE__VISIBLE:
            setVisible((Boolean)newValue);
            return;
         case NotationPackage.EDGE__PERSISTENT:
            setPersistent((Boolean)newValue);
            return;
         case NotationPackage.EDGE__SOURCE:
            setSource((Node)newValue);
            return;
         case NotationPackage.EDGE__TARGET:
            setTarget((Node)newValue);
            return;
         case NotationPackage.EDGE__PARENT:
            setParent((HierarchicalNode)newValue);
            return;
         case NotationPackage.EDGE__SOURCE_ANCHOR:
            setSourceAnchor((Anchor)newValue);
            return;
         case NotationPackage.EDGE__TARGET_ANCHOR:
            setTargetAnchor((Anchor)newValue);
            return;
         case NotationPackage.EDGE__BEND_POINTS:
            getBendPoints().clear();
            getBendPoints().addAll((Collection<? extends BendPoint>)newValue);
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
         case NotationPackage.EDGE__MODEL:
            setModel((EObject)null);
            return;
         case NotationPackage.EDGE__VISIBLE:
            setVisible(VISIBLE_EDEFAULT);
            return;
         case NotationPackage.EDGE__PERSISTENT:
            setPersistent(PERSISTENT_EDEFAULT);
            return;
         case NotationPackage.EDGE__SOURCE:
            setSource((Node)null);
            return;
         case NotationPackage.EDGE__TARGET:
            setTarget((Node)null);
            return;
         case NotationPackage.EDGE__PARENT:
            setParent((HierarchicalNode)null);
            return;
         case NotationPackage.EDGE__SOURCE_ANCHOR:
            setSourceAnchor((Anchor)null);
            return;
         case NotationPackage.EDGE__TARGET_ANCHOR:
            setTargetAnchor((Anchor)null);
            return;
         case NotationPackage.EDGE__BEND_POINTS:
            getBendPoints().clear();
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
         case NotationPackage.EDGE__MODEL:
            return model != null;
         case NotationPackage.EDGE__VISIBLE:
            return visible != VISIBLE_EDEFAULT;
         case NotationPackage.EDGE__PERSISTENT:
            return persistent != PERSISTENT_EDEFAULT;
         case NotationPackage.EDGE__SOURCE:
            return source != null;
         case NotationPackage.EDGE__TARGET:
            return target != null;
         case NotationPackage.EDGE__PARENT:
            return getParent() != null;
         case NotationPackage.EDGE__SOURCE_ANCHOR:
            return sourceAnchor != null;
         case NotationPackage.EDGE__TARGET_ANCHOR:
            return targetAnchor != null;
         case NotationPackage.EDGE__BEND_POINTS:
            return bendPoints != null && !bendPoints.isEmpty();
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
      result.append(')');
      return result.toString();
   }

} //EdgeImpl
