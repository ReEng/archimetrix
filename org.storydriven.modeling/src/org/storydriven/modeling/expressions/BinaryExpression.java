/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.expressions;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Binary Expression</b></em>'. <!-- end-user-doc --> <!-- begin-model-doc --> Represents any binary expression
 * like v < 5 or x + 7. <!-- end-model-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.storydriven.modeling.expressions.BinaryExpression#getLeftExpression <em>Left Expression</em>}</li>
 * <li>{@link org.storydriven.modeling.expressions.BinaryExpression#getRightExpression <em>Right Expression</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.storydriven.modeling.expressions.ExpressionsPackage#getBinaryExpression()
 * @model abstract="true"
 * @generated
 */
public interface BinaryExpression extends Expression
{
   /**
    * Returns the value of the '<em><b>Left Expression</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Represents the first
    * operand of a binary expression, e.g. x in the expression x < 5. <!-- end-model-doc -->
    * 
    * @return the value of the '<em>Left Expression</em>' containment reference.
    * @see #setLeftExpression(Expression)
    * @see org.storydriven.modeling.expressions.ExpressionsPackage#getBinaryExpression_LeftExpression()
    * @model containment="true" resolveProxies="true" required="true" ordered="false"
    * @generated
    */
   Expression getLeftExpression ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.expressions.BinaryExpression#getLeftExpression <em>Left Expression</em>}' containment reference.
    * <!-- begin-user-doc
    * --> <!-- end-user-doc -->
    * @param value the new value of the '<em>Left Expression</em>' containment reference.
    * @see #getLeftExpression()
    * @generated
    */
   void setLeftExpression (Expression value);

   /**
    * Returns the value of the '<em><b>Right Expression</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Represents the
    * second operand of a binary expression, e.g. 5 in the expression x < 5. <!-- end-model-doc -->
    * 
    * @return the value of the '<em>Right Expression</em>' containment reference.
    * @see #setRightExpression(Expression)
    * @see org.storydriven.modeling.expressions.ExpressionsPackage#getBinaryExpression_RightExpression()
    * @model containment="true" resolveProxies="true" required="true" ordered="false"
    * @generated
    */
   Expression getRightExpression ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.expressions.BinaryExpression#getRightExpression <em>Right Expression</em>}' containment reference.
    * <!-- begin-user-doc
    * --> <!-- end-user-doc -->
    * @param value the new value of the '<em>Right Expression</em>' containment reference.
    * @see #getRightExpression()
    * @generated
    */
   void setRightExpression (Expression value);

} // BinaryExpression
