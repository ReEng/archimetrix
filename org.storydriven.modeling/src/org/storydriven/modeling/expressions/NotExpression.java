/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.expressions;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Not Expression</b></em>'. <!-- end-user-doc --> <!-- begin-model-doc --> Represents a negated expression,
 * e.g. NOT (a < 5). <!-- end-model-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.storydriven.modeling.expressions.NotExpression#getNegatedExpression <em>Negated Expression</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.storydriven.modeling.expressions.ExpressionsPackage#getNotExpression()
 * @model
 * @generated
 */
public interface NotExpression extends Expression
{
   /**
    * Returns the value of the '<em><b>Negated Expression</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Represents the
    * operand of a NotExpression, e.g. a < 5 in NOT (a < 5). <!-- end-model-doc -->
    * 
    * @return the value of the '<em>Negated Expression</em>' containment reference.
    * @see #setNegatedExpression(Expression)
    * @see org.storydriven.modeling.expressions.ExpressionsPackage#getNotExpression_NegatedExpression()
    * @model containment="true" resolveProxies="true" required="true" ordered="false"
    * @generated
    */
   Expression getNegatedExpression ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.expressions.NotExpression#getNegatedExpression <em>Negated Expression</em>}' containment reference.
    * <!-- begin-user-doc
    * --> <!-- end-user-doc -->
    * @param value the new value of the '<em>Negated Expression</em>' containment reference.
    * @see #getNegatedExpression()
    * @generated
    */
   void setNegatedExpression (Expression value);

} // NotExpression
