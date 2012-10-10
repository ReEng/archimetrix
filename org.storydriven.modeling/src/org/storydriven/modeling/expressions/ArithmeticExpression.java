/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.expressions;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Arithmetic Expression</b></em>'. <!-- end-user-doc --> <!-- begin-model-doc --> Represents arithmetic
 * expressions like a + 5 or a * 7. <!-- end-model-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.storydriven.modeling.expressions.ArithmeticExpression#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.storydriven.modeling.expressions.ExpressionsPackage#getArithmeticExpression()
 * @model
 * @generated
 */
public interface ArithmeticExpression extends BinaryExpression
{
   /**
    * Returns the value of the '<em><b>Operator</b></em>' attribute. The literals are from the enumeration {@link org.storydriven.modeling.expressions.ArithmeticOperator}. <!--
    * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Specifies the expression's arithmetic operator, e.g. +, -, *, /, or MODULO. <!-- end-model-doc -->
    * 
    * @return the value of the '<em>Operator</em>' attribute.
    * @see org.storydriven.modeling.expressions.ArithmeticOperator
    * @see #setOperator(ArithmeticOperator)
    * @see org.storydriven.modeling.expressions.ExpressionsPackage#getArithmeticExpression_Operator()
    * @model required="true" ordered="false"
    * @generated
    */
   ArithmeticOperator getOperator ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.expressions.ArithmeticExpression#getOperator <em>Operator</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
    * -->
    * 
    * @param value the new value of the '<em>Operator</em>' attribute.
    * @see org.storydriven.modeling.expressions.ArithmeticOperator
    * @see #getOperator()
    * @generated
    */
   void setOperator (ArithmeticOperator value);

} // ArithmeticExpression
