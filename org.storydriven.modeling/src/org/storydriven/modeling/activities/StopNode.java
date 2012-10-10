/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.activities;

import org.eclipse.emf.common.util.EList;
import org.storydriven.modeling.expressions.Expression;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Stop Node</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * At a StopNode, the execution of an activity terminates. If the activity specifies any out-parameters, they have to be bound to a return expression.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.storydriven.modeling.activities.StopNode#isFlowStopOnly <em>Flow Stop Only</em>}</li>
 *   <li>{@link org.storydriven.modeling.activities.StopNode#getReturnValue <em>Return Value</em>}</li>
 *   <li>{@link org.storydriven.modeling.activities.StopNode#getReturnValues <em>Return Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.storydriven.modeling.activities.ActivitiesPackage#getStopNode()
 * @model
 * @generated
 */
public interface StopNode extends ActivityNode
{
   /**
    * Returns the value of the '<em><b>Flow Stop Only</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> true if subactivity is stopped,
    * but not the whole control flow <!-- end-model-doc -->
    * 
    * @return the value of the '<em>Flow Stop Only</em>' attribute.
    * @see #setFlowStopOnly(boolean)
    * @see org.storydriven.modeling.activities.ActivitiesPackage#getStopNode_FlowStopOnly()
    * @model required="true" ordered="false"
    * @generated
    */
   boolean isFlowStopOnly ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.activities.StopNode#isFlowStopOnly <em>Flow Stop Only</em>}' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @param value the new value of the '<em>Flow Stop Only</em>' attribute.
    * @see #isFlowStopOnly()
    * @generated
    */
   void setFlowStopOnly (boolean value);

   /**
    * Returns the value of the '<em><b>Return Value</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Return Value</em>' containment reference isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * Convenience method when dealing with activities that implement an EOperation. In this case, only one out parameter is supported. This attributes then returns the first out parameter.
    * <!-- end-model-doc -->
    * @return the value of the '<em>Return Value</em>' reference.
    * @see org.storydriven.modeling.activities.ActivitiesPackage#getStopNode_ReturnValue()
    * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
    * @generated
    */
   Expression getReturnValue ();

   /**
    * Returns the value of the '<em><b>Return Values</b></em>' containment reference list.
    * The list contents are of type {@link org.storydriven.modeling.expressions.Expression}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Return Values</em>' containment reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * Defines the return values of the activity. These return values will be assigned to the out-parameters.
    * <!-- end-model-doc -->
    * @return the value of the '<em>Return Values</em>' containment reference list.
    * @see org.storydriven.modeling.activities.ActivitiesPackage#getStopNode_ReturnValues()
    * @model containment="true" resolveProxies="true" ordered="false"
    * @generated
    */
   EList<Expression> getReturnValues ();

} // StopNode
