/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.fujaba.commons.notation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bend Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents bend points of an edge.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.fujaba.commons.notation.BendPoint#getEdge <em>Edge</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.fujaba.commons.notation.NotationPackage#getBendPoint()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface BendPoint extends EObject
{
   /**
    * Returns the value of the '<em><b>Edge</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link org.fujaba.commons.notation.Edge#getBendPoints <em>Bend Points</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * The edge in which the bend point is contained in.
    * <!-- end-model-doc -->
    * @return the value of the '<em>Edge</em>' container reference.
    * @see #setEdge(Edge)
    * @see org.fujaba.commons.notation.NotationPackage#getBendPoint_Edge()
    * @see org.fujaba.commons.notation.Edge#getBendPoints
    * @model opposite="bendPoints" keys="id" required="true" transient="false" ordered="false"
    * @generated
    */
   Edge getEdge();

   /**
    * Sets the value of the '{@link org.fujaba.commons.notation.BendPoint#getEdge <em>Edge</em>}' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Edge</em>' container reference.
    * @see #getEdge()
    * @generated
    */
   void setEdge(Edge value);

} // BendPoint
