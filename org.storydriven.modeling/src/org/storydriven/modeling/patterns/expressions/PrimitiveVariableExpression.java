/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.patterns.expressions;

import org.storydriven.modeling.expressions.Expression;
import org.storydriven.modeling.patterns.PrimitiveVariable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Variable Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents the value of a primitive variable, e.g., 5 or "MyName".
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.storydriven.modeling.patterns.expressions.PrimitiveVariableExpression#getPrimitiveVariable <em>Primitive Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.storydriven.modeling.patterns.expressions.ExpressionsPackage#getPrimitiveVariableExpression()
 * @model
 * @generated
 */
public interface PrimitiveVariableExpression extends Expression
{
   /**
    * Returns the value of the '<em><b>Primitive Variable</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Primitive Variable</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Primitive Variable</em>' reference.
    * @see #setPrimitiveVariable(PrimitiveVariable)
    * @see org.storydriven.modeling.patterns.expressions.ExpressionsPackage#getPrimitiveVariableExpression_PrimitiveVariable()
    * @model required="true" ordered="false"
    * @generated
    */
   PrimitiveVariable getPrimitiveVariable ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.patterns.expressions.PrimitiveVariableExpression#getPrimitiveVariable <em>Primitive Variable</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Primitive Variable</em>' reference.
    * @see #getPrimitiveVariable()
    * @generated
    */
   void setPrimitiveVariable (PrimitiveVariable value);

} // PrimitiveVariableExpression
