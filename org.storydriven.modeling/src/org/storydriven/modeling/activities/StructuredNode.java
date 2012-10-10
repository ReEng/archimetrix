/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.activities;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Structured Node</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A structured node is a node that contains several other activities.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.storydriven.modeling.activities.StructuredNode#getOwnedActivityNodes <em>Owned Activity Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.storydriven.modeling.activities.ActivitiesPackage#getStructuredNode()
 * @model
 * @generated
 */
public interface StructuredNode extends ActivityNode
{
   /**
    * Returns the value of the '<em><b>Owned Activity Node</b></em>' containment reference list.
    * The list contents are of type {@link org.storydriven.modeling.activities.ActivityNode}.
    * It is bidirectional and its opposite is '{@link org.storydriven.modeling.activities.ActivityNode#getOwningActivityNode <em>Owning Activity Node</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Owned Activity Node</em>' containment reference list isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * All subnodes which are contained in this structured node.
    * <!-- end-model-doc -->
    * @return the value of the '<em>Owned Activity Node</em>' containment reference list.
    * @see org.storydriven.modeling.activities.ActivitiesPackage#getStructuredNode_OwnedActivityNode()
    * @see org.storydriven.modeling.activities.ActivityNode#getOwningActivityNode
    * @model opposite="owningActivityNode" containment="true" resolveProxies="true" ordered="false"
    * @generated
    */
   EList<ActivityNode> getOwnedActivityNodes ();

} // StructuredNode
