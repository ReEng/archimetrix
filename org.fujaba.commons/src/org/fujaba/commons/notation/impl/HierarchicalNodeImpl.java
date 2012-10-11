/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.fujaba.commons.notation.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.fujaba.commons.notation.Edge;
import org.fujaba.commons.notation.HierarchicalNode;
import org.fujaba.commons.notation.Node;
import org.fujaba.commons.notation.NotationPackage;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hierarchical Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.fujaba.commons.notation.impl.HierarchicalNodeImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link org.fujaba.commons.notation.impl.HierarchicalNodeImpl#getEdges <em>Edges</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HierarchicalNodeImpl extends NodeImpl implements HierarchicalNode
{
   /**
    * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getNodes()
    * @generated
    * @ordered
    */
   protected EList<Node> nodes;

   /**
    * The cached value of the '{@link #getEdges() <em>Edges</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getEdges()
    * @generated
    * @ordered
    */
   protected EList<Edge> edges;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected HierarchicalNodeImpl()
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
      return NotationPackage.Literals.HIERARCHICAL_NODE;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<Node> getNodes()
   {
      if (nodes == null)
      {
         nodes = new EObjectContainmentWithInverseEList<Node>(Node.class, this, NotationPackage.HIERARCHICAL_NODE__NODES, NotationPackage.NODE__PARENT);
      }
      return nodes;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<Edge> getEdges()
   {
      if (edges == null)
      {
         edges = new EObjectContainmentWithInverseEList<Edge>(Edge.class, this, NotationPackage.HIERARCHICAL_NODE__EDGES, NotationPackage.EDGE__PARENT);
      }
      return edges;
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
         case NotationPackage.HIERARCHICAL_NODE__NODES:
            return ((InternalEList<InternalEObject>)(InternalEList<?>)getNodes()).basicAdd(otherEnd, msgs);
         case NotationPackage.HIERARCHICAL_NODE__EDGES:
            return ((InternalEList<InternalEObject>)(InternalEList<?>)getEdges()).basicAdd(otherEnd, msgs);
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
         case NotationPackage.HIERARCHICAL_NODE__NODES:
            return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
         case NotationPackage.HIERARCHICAL_NODE__EDGES:
            return ((InternalEList<?>)getEdges()).basicRemove(otherEnd, msgs);
      }
      return super.eInverseRemove(otherEnd, featureID, msgs);
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
         case NotationPackage.HIERARCHICAL_NODE__NODES:
            return getNodes();
         case NotationPackage.HIERARCHICAL_NODE__EDGES:
            return getEdges();
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
         case NotationPackage.HIERARCHICAL_NODE__NODES:
            getNodes().clear();
            getNodes().addAll((Collection<? extends Node>)newValue);
            return;
         case NotationPackage.HIERARCHICAL_NODE__EDGES:
            getEdges().clear();
            getEdges().addAll((Collection<? extends Edge>)newValue);
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
         case NotationPackage.HIERARCHICAL_NODE__NODES:
            getNodes().clear();
            return;
         case NotationPackage.HIERARCHICAL_NODE__EDGES:
            getEdges().clear();
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
         case NotationPackage.HIERARCHICAL_NODE__NODES:
            return nodes != null && !nodes.isEmpty();
         case NotationPackage.HIERARCHICAL_NODE__EDGES:
            return edges != null && !edges.isEmpty();
      }
      return super.eIsSet(featureID);
   }

} //HierarchicalNodeImpl
