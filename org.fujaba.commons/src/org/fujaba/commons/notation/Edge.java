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
 * A representation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents edges between two nodes.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.fujaba.commons.notation.Edge#getSource <em>Source</em>}</li>
 *   <li>{@link org.fujaba.commons.notation.Edge#getTarget <em>Target</em>}</li>
 *   <li>{@link org.fujaba.commons.notation.Edge#getParent <em>Parent</em>}</li>
 *   <li>{@link org.fujaba.commons.notation.Edge#getSourceAnchor <em>Source Anchor</em>}</li>
 *   <li>{@link org.fujaba.commons.notation.Edge#getTargetAnchor <em>Target Anchor</em>}</li>
 *   <li>{@link org.fujaba.commons.notation.Edge#getBendPoints <em>Bend Points</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.fujaba.commons.notation.NotationPackage#getEdge()
 * @model
 * @generated
 */
public interface Edge extends DiagramElement
{
   /**
    * Returns the value of the '<em><b>Source</b></em>' reference.
    * It is bidirectional and its opposite is '{@link org.fujaba.commons.notation.Node#getOutgoing <em>Outgoing</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Source</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Source</em>' reference.
    * @see #setSource(Node)
    * @see org.fujaba.commons.notation.NotationPackage#getEdge_Source()
    * @see org.fujaba.commons.notation.Node#getOutgoing
    * @model opposite="outgoing" keys="id" required="true" ordered="false"
    * @generated
    */
   Node getSource();

   /**
    * Sets the value of the '{@link org.fujaba.commons.notation.Edge#getSource <em>Source</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Source</em>' reference.
    * @see #getSource()
    * @generated
    */
   void setSource(Node value);

   /**
    * Returns the value of the '<em><b>Target</b></em>' reference.
    * It is bidirectional and its opposite is '{@link org.fujaba.commons.notation.Node#getIncoming <em>Incoming</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Target</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Target</em>' reference.
    * @see #setTarget(Node)
    * @see org.fujaba.commons.notation.NotationPackage#getEdge_Target()
    * @see org.fujaba.commons.notation.Node#getIncoming
    * @model opposite="incoming" keys="id" required="true" ordered="false"
    * @generated
    */
   Node getTarget();

   /**
    * Sets the value of the '{@link org.fujaba.commons.notation.Edge#getTarget <em>Target</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Target</em>' reference.
    * @see #getTarget()
    * @generated
    */
   void setTarget(Node value);

   /**
    * Returns the value of the '<em><b>Parent</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link org.fujaba.commons.notation.HierarchicalNode#getEdges <em>Edges</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * The parent node in which the node is contained in.
    * <!-- end-model-doc -->
    * @return the value of the '<em>Parent</em>' container reference.
    * @see #setParent(HierarchicalNode)
    * @see org.fujaba.commons.notation.NotationPackage#getEdge_Parent()
    * @see org.fujaba.commons.notation.HierarchicalNode#getEdges
    * @model opposite="edges" keys="id" transient="false" ordered="false"
    * @generated
    */
   HierarchicalNode getParent();

   /**
    * Sets the value of the '{@link org.fujaba.commons.notation.Edge#getParent <em>Parent</em>}' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Parent</em>' container reference.
    * @see #getParent()
    * @generated
    */
   void setParent(HierarchicalNode value);

   /**
    * Returns the value of the '<em><b>Source Anchor</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * Indicates the source anchor of the edge when set.
    * <!-- end-model-doc -->
    * @return the value of the '<em>Source Anchor</em>' containment reference.
    * @see #setSourceAnchor(Anchor)
    * @see org.fujaba.commons.notation.NotationPackage#getEdge_SourceAnchor()
    * @model containment="true" ordered="false"
    * @generated
    */
   Anchor getSourceAnchor();

   /**
    * Sets the value of the '{@link org.fujaba.commons.notation.Edge#getSourceAnchor <em>Source Anchor</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Source Anchor</em>' containment reference.
    * @see #getSourceAnchor()
    * @generated
    */
   void setSourceAnchor(Anchor value);

   /**
    * Returns the value of the '<em><b>Target Anchor</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * Indicates the target anchor of the edge when set.
    * <!-- end-model-doc -->
    * @return the value of the '<em>Target Anchor</em>' containment reference.
    * @see #setTargetAnchor(Anchor)
    * @see org.fujaba.commons.notation.NotationPackage#getEdge_TargetAnchor()
    * @model containment="true" ordered="false"
    * @generated
    */
   Anchor getTargetAnchor();

   /**
    * Sets the value of the '{@link org.fujaba.commons.notation.Edge#getTargetAnchor <em>Target Anchor</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Target Anchor</em>' containment reference.
    * @see #getTargetAnchor()
    * @generated
    */
   void setTargetAnchor(Anchor value);

   /**
    * Returns the value of the '<em><b>Bend Points</b></em>' containment reference list.
    * The list contents are of type {@link org.fujaba.commons.notation.BendPoint}.
    * It is bidirectional and its opposite is '{@link org.fujaba.commons.notation.BendPoint#getEdge <em>Edge</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * Indicates the list of bend points for the edge.
    * <!-- end-model-doc -->
    * @return the value of the '<em>Bend Points</em>' containment reference list.
    * @see org.fujaba.commons.notation.NotationPackage#getEdge_BendPoints()
    * @see org.fujaba.commons.notation.BendPoint#getEdge
    * @model opposite="edge" containment="true"
    * @generated
    */
   EList<BendPoint> getBendPoints();

} // Edge
