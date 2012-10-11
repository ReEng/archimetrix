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
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents nodes in a diagram.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.fujaba.commons.notation.Node#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link org.fujaba.commons.notation.Node#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link org.fujaba.commons.notation.Node#getParent <em>Parent</em>}</li>
 *   <li>{@link org.fujaba.commons.notation.Node#getX <em>X</em>}</li>
 *   <li>{@link org.fujaba.commons.notation.Node#getY <em>Y</em>}</li>
 *   <li>{@link org.fujaba.commons.notation.Node#getWidth <em>Width</em>}</li>
 *   <li>{@link org.fujaba.commons.notation.Node#getHeight <em>Height</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.fujaba.commons.notation.NotationPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends DiagramElement
{
   /**
    * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
    * The list contents are of type {@link org.fujaba.commons.notation.Edge}.
    * It is bidirectional and its opposite is '{@link org.fujaba.commons.notation.Edge#getSource <em>Source</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Outgoing</em>' reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Outgoing</em>' reference list.
    * @see org.fujaba.commons.notation.NotationPackage#getNode_Outgoing()
    * @see org.fujaba.commons.notation.Edge#getSource
    * @model opposite="source" keys="id"
    * @generated
    */
   EList<Edge> getOutgoing();

   /**
    * Returns the value of the '<em><b>Incoming</b></em>' reference list.
    * The list contents are of type {@link org.fujaba.commons.notation.Edge}.
    * It is bidirectional and its opposite is '{@link org.fujaba.commons.notation.Edge#getTarget <em>Target</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Incoming</em>' reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Incoming</em>' reference list.
    * @see org.fujaba.commons.notation.NotationPackage#getNode_Incoming()
    * @see org.fujaba.commons.notation.Edge#getTarget
    * @model opposite="target" keys="id"
    * @generated
    */
   EList<Edge> getIncoming();

   /**
    * Returns the value of the '<em><b>Parent</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link org.fujaba.commons.notation.HierarchicalNode#getNodes <em>Nodes</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * The edge in which the bend point is contained in.
    * <!-- end-model-doc -->
    * @return the value of the '<em>Parent</em>' container reference.
    * @see #setParent(HierarchicalNode)
    * @see org.fujaba.commons.notation.NotationPackage#getNode_Parent()
    * @see org.fujaba.commons.notation.HierarchicalNode#getNodes
    * @model opposite="nodes" keys="id" transient="false" ordered="false"
    * @generated
    */
   HierarchicalNode getParent();

   /**
    * Sets the value of the '{@link org.fujaba.commons.notation.Node#getParent <em>Parent</em>}' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Parent</em>' container reference.
    * @see #getParent()
    * @generated
    */
   void setParent(HierarchicalNode value);

   /**
    * Returns the value of the '<em><b>X</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * The X-coordinate of the node.
    * <!-- end-model-doc -->
    * @return the value of the '<em>X</em>' attribute.
    * @see #setX(int)
    * @see org.fujaba.commons.notation.NotationPackage#getNode_X()
    * @model unique="false" required="true" ordered="false"
    * @generated
    */
   int getX();

   /**
    * Sets the value of the '{@link org.fujaba.commons.notation.Node#getX <em>X</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>X</em>' attribute.
    * @see #getX()
    * @generated
    */
   void setX(int value);

   /**
    * Returns the value of the '<em><b>Y</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * The Y-coordinate of the node.
    * <!-- end-model-doc -->
    * @return the value of the '<em>Y</em>' attribute.
    * @see #setY(int)
    * @see org.fujaba.commons.notation.NotationPackage#getNode_Y()
    * @model unique="false" required="true" ordered="false"
    * @generated
    */
   int getY();

   /**
    * Sets the value of the '{@link org.fujaba.commons.notation.Node#getY <em>Y</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Y</em>' attribute.
    * @see #getY()
    * @generated
    */
   void setY(int value);

   /**
    * Returns the value of the '<em><b>Width</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * The width of the node.
    * <!-- end-model-doc -->
    * @return the value of the '<em>Width</em>' attribute.
    * @see #setWidth(int)
    * @see org.fujaba.commons.notation.NotationPackage#getNode_Width()
    * @model unique="false" required="true" ordered="false"
    * @generated
    */
   int getWidth();

   /**
    * Sets the value of the '{@link org.fujaba.commons.notation.Node#getWidth <em>Width</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Width</em>' attribute.
    * @see #getWidth()
    * @generated
    */
   void setWidth(int value);

   /**
    * Returns the value of the '<em><b>Height</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * The height of the node.
    * <!-- end-model-doc -->
    * @return the value of the '<em>Height</em>' attribute.
    * @see #setHeight(int)
    * @see org.fujaba.commons.notation.NotationPackage#getNode_Height()
    * @model unique="false" required="true" ordered="false"
    * @generated
    */
   int getHeight();

   /**
    * Sets the value of the '{@link org.fujaba.commons.notation.Node#getHeight <em>Height</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Height</em>' attribute.
    * @see #getHeight()
    * @generated
    */
   void setHeight(int value);

} // Node
