/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Commentable Element</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abstract super class for all meta-model elements that may carry a comment in form of a string.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.storydriven.modeling.CommentableElement#getComment <em>Comment</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.storydriven.modeling.SDMPackage#getCommentableElement()
 * @model abstract="true"
 * @generated
 */
public interface CommentableElement extends ExtendableElement
{
   /**
    * Returns the value of the '<em><b>Comment</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Comment</em>' attribute isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Comment</em>' attribute.
    * @see #setComment(String)
    * @see org.storydriven.modeling.SDMPackage#getCommentableElement_Comment()
    * @model ordered="false"
    * @generated
    */
   String getComment ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.CommentableElement#getComment <em>Comment</em>}' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @param value the new value of the '<em>Comment</em>' attribute.
    * @see #getComment()
    * @generated
    */
   void setComment (String value);

} // CommentableElement
