/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.activities;

import org.storydriven.modeling.expressions.Expression;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Statement Node</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A statement node is a node that just contains an expression defining its behavior. In combination with a textual expression, arbitrary souce code might be added by using StatementNodes.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.storydriven.modeling.activities.StatementNode#getStatementExpression <em>Statement Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.storydriven.modeling.activities.ActivitiesPackage#getStatementNode()
 * @model
 * @generated
 */
public interface StatementNode extends ActivityNode
{
   /**
    * Returns the value of the '<em><b>Statement Expression</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Statement Expression</em>' containment reference isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * The expression which defines the behavior of this StatementNode.
    * <!-- end-model-doc -->
    * @return the value of the '<em>Statement Expression</em>' containment reference.
    * @see #setStatementExpression(Expression)
    * @see org.storydriven.modeling.activities.ActivitiesPackage#getStatementNode_StatementExpression()
    * @model containment="true" resolveProxies="true" required="true" ordered="false"
    * @generated
    */
   Expression getStatementExpression ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.activities.StatementNode#getStatementExpression <em>Statement Expression</em>}' containment reference. <!--
    * begin-user-doc --> <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Statement Expression</em>' containment reference.
    * @see #getStatementExpression()
    * @generated
    */
   void setStatementExpression (Expression value);

} // StatementNode
