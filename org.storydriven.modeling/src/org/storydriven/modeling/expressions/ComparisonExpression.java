/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.expressions;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Comparison Expression</b></em>'. <!-- end-user-doc --> <!-- begin-model-doc --> Represents comparing
 * expressions like a < 5 or a >= 7. <!-- end-model-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.storydriven.modeling.expressions.ComparisonExpression#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.storydriven.modeling.expressions.ExpressionsPackage#getComparisonExpression()
 * @model
 * @generated
 */
public interface ComparisonExpression extends BinaryExpression
{
   /**
    * Returns the value of the '<em><b>Operator</b></em>' attribute. The literals are from the enumeration {@link org.storydriven.modeling.expressions.ComparingOperator}. <!--
    * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Specifies the expression's comparing operator, e.g. <, >=, !=. <!-- end-model-doc -->
    * 
    * @return the value of the '<em>Operator</em>' attribute.
    * @see org.storydriven.modeling.expressions.ComparingOperator
    * @see #setOperator(ComparingOperator)
    * @see org.storydriven.modeling.expressions.ExpressionsPackage#getComparisonExpression_Operator()
    * @model required="true" ordered="false"
    * @generated
    */
   ComparingOperator getOperator ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.expressions.ComparisonExpression#getOperator <em>Operator</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
    * -->
    * 
    * @param value the new value of the '<em>Operator</em>' attribute.
    * @see org.storydriven.modeling.expressions.ComparingOperator
    * @see #getOperator()
    * @generated
    */
   void setOperator (ComparingOperator value);

} // ComparisonExpression
