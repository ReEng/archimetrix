/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.fujaba.commons.notation;

import org.eclipse.emf.ecore.EObject;
import org.fujaba.commons.identifier.Identifier;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents diagram elements.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.fujaba.commons.notation.DiagramElement#getModel <em>Model</em>}</li>
 *   <li>{@link org.fujaba.commons.notation.DiagramElement#isVisible <em>Visible</em>}</li>
 *   <li>{@link org.fujaba.commons.notation.DiagramElement#isPersistent <em>Persistent</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.fujaba.commons.notation.NotationPackage#getDiagramElement()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface DiagramElement extends Identifier
{
   /**
    * Returns the value of the '<em><b>Model</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * References the model element which the diagram element represents.
    * <!-- end-model-doc -->
    * @return the value of the '<em>Model</em>' reference.
    * @see #setModel(EObject)
    * @see org.fujaba.commons.notation.NotationPackage#getDiagramElement_Model()
    * @model ordered="false"
    * @generated
    */
   EObject getModel();

   /**
    * Sets the value of the '{@link org.fujaba.commons.notation.DiagramElement#getModel <em>Model</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Model</em>' reference.
    * @see #getModel()
    * @generated
    */
   void setModel(EObject value);

   /**
    * Returns the value of the '<em><b>Visible</b></em>' attribute.
    * The default value is <code>"true"</code>.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * Indicates whether the diagram element is visible.
    * <!-- end-model-doc -->
    * @return the value of the '<em>Visible</em>' attribute.
    * @see #setVisible(boolean)
    * @see org.fujaba.commons.notation.NotationPackage#getDiagramElement_Visible()
    * @model default="true" unique="false" required="true" ordered="false"
    * @generated
    */
   boolean isVisible();

   /**
    * Sets the value of the '{@link org.fujaba.commons.notation.DiagramElement#isVisible <em>Visible</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Visible</em>' attribute.
    * @see #isVisible()
    * @generated
    */
   void setVisible(boolean value);

   /**
    * Returns the value of the '<em><b>Persistent</b></em>' attribute.
    * The default value is <code>"true"</code>.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * Indicates whether the diagram element is persistent.
    * <!-- end-model-doc -->
    * @return the value of the '<em>Persistent</em>' attribute.
    * @see #setPersistent(boolean)
    * @see org.fujaba.commons.notation.NotationPackage#getDiagramElement_Persistent()
    * @model default="true" unique="false" required="true" ordered="false"
    * @generated
    */
   boolean isPersistent();

   /**
    * Sets the value of the '{@link org.fujaba.commons.notation.DiagramElement#isPersistent <em>Persistent</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Persistent</em>' attribute.
    * @see #isPersistent()
    * @generated
    */
   void setPersistent(boolean value);

} // DiagramElement
