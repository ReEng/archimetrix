/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.activities;

import org.storydriven.modeling.patterns.MatchingPattern;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Matching Story Node</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A MatchingStoryNode may only contain a MatchingPattern which does not change the graph. I.e., no element contained in this activity carries a create or destroy annotation. Thus, after executing a MatchingStoryNode, the underlying graph is guaranteed to be unchanged.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.storydriven.modeling.activities.MatchingStoryNode#getOwnedPattern <em>Owned Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.storydriven.modeling.activities.ActivitiesPackage#getMatchingStoryNode()
 * @model
 * @generated
 */
public interface MatchingStoryNode extends StoryNode
{
   /**
    * Returns the value of the '<em><b>Owned Pattern</b></em>' containment reference.
    * <p>
    * This feature subsets the following features:
    * <ul>
    *   <li>'{@link org.storydriven.modeling.activities.StoryNode#getStoryPattern() <em>Story Pattern</em>}'</li>
    * </ul>
    * </p>
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Owned Pattern</em>' containment reference isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * This MatchingPattern contained in this activity.
    * <!-- end-model-doc -->
    * @return the value of the '<em>Owned Pattern</em>' containment reference.
    * @see #setOwnedPattern(MatchingPattern)
    * @see org.storydriven.modeling.activities.ActivitiesPackage#getMatchingStoryNode_OwnedPattern()
    * @model containment="true" resolveProxies="true" required="true" ordered="false"
    * @generated
    */
   MatchingPattern getOwnedPattern ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.activities.MatchingStoryNode#getOwnedPattern <em>Owned Pattern</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Owned Pattern</em>' containment reference.
    * @see #getOwnedPattern()
    * @generated
    */
   void setOwnedPattern (MatchingPattern value);

} // MatchingStoryNode
