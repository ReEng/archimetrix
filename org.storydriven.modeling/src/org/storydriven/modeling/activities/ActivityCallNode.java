/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.activities;

import org.eclipse.emf.common.util.EList;
import org.storydriven.modeling.calls.Invocation;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Activity Call Node</b></em>'. <!-- end-user-doc --> <!-- begin-model-doc --> The ActivityCallNode is a
 * special ActivityNode which represents the calling of another story diagram within an activity. To support polymorphic dispatching, multiple activities can be assigned to it (all
 * of which must have the same call signature, i.e. matching in and out parameters). All assigned activities are then called in the given order and the first one whose precondition
 * is fulfilled is executed (Chain of Responsibilty). <!-- end-model-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.storydriven.modeling.activities.ActivityCallNode#getCalledActivities <em>Called Activity</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.storydriven.modeling.activities.ActivitiesPackage#getActivityCallNode()
 * @model
 * @generated
 */
public interface ActivityCallNode extends ActivityNode, Invocation
{
   /**
    * Returns the value of the '<em><b>Called Activity</b></em>' reference list. The list contents are of type {@link org.storydriven.modeling.activities.Activity}. <!--
    * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> References all activities that are to be considered for the polymorphic dispatching of the call. All
    * activities must have the same call signature. <!-- end-model-doc -->
    * 
    * @return the value of the '<em>Called Activity</em>' reference list.
    * @see org.storydriven.modeling.activities.ActivitiesPackage#getActivityCallNode_CalledActivity()
    * @model required="true"
    * @generated
    */
   EList<Activity> getCalledActivities ();

} // ActivityCallNode
