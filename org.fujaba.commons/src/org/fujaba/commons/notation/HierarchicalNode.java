/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.fujaba.commons.notation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hierarchical Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents nodes which potentially has other nodes as children, such as a root node for a diagram.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.fujaba.commons.notation.HierarchicalNode#getNodes <em>Nodes</em>}</li>
 *   <li>{@link org.fujaba.commons.notation.HierarchicalNode#getEdges <em>Edges</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.fujaba.commons.notation.NotationPackage#getHierarchicalNode()
 * @model
 * @generated
 */
public interface HierarchicalNode extends Node
{
   /**
    * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
    * The list contents are of type {@link org.fujaba.commons.notation.Node}.
    * It is bidirectional and its opposite is '{@link org.fujaba.commons.notation.Node#getParent <em>Parent</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * The nodes that are contained in the hierarchical node.
    * <!-- end-model-doc -->
    * @return the value of the '<em>Nodes</em>' containment reference list.
    * @see org.fujaba.commons.notation.NotationPackage#getHierarchicalNode_Nodes()
    * @see org.fujaba.commons.notation.Node#getParent
    * @model opposite="parent" containment="true" keys="id"
    * @generated
    */
   EList<Node> getNodes();

   /**
    * Returns the value of the '<em><b>Edges</b></em>' containment reference list.
    * The list contents are of type {@link org.fujaba.commons.notation.Edge}.
    * It is bidirectional and its opposite is '{@link org.fujaba.commons.notation.Edge#getParent <em>Parent</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * The edges that are contained in the node.
    * <!-- end-model-doc -->
    * @return the value of the '<em>Edges</em>' containment reference list.
    * @see org.fujaba.commons.notation.NotationPackage#getHierarchicalNode_Edges()
    * @see org.fujaba.commons.notation.Edge#getParent
    * @model opposite="parent" containment="true" keys="id"
    * @generated
    */
   EList<Edge> getEdges();

} // HierarchicalNode
