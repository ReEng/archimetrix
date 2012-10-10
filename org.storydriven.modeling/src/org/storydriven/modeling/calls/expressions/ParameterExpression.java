/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.calls.expressions;

import org.storydriven.modeling.calls.ParameterExtension;
import org.storydriven.modeling.expressions.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An Expressions that represents a parameter value, e.g. the value of an Activity's parameter.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.storydriven.modeling.calls.expressions.ParameterExpression#getParameter <em>Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.storydriven.modeling.calls.expressions.ExpressionsPackage#getParameterExpression()
 * @model
 * @generated
 */
public interface ParameterExpression extends Expression
{
   /**
    * Returns the value of the '<em><b>Parameter</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Parameter</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Parameter</em>' reference.
    * @see #setParameter(ParameterExtension)
    * @see org.storydriven.modeling.calls.expressions.ExpressionsPackage#getParameterExpression_Parameter()
    * @model ordered="false"
    * @generated
    */
   ParameterExtension getParameter ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.calls.expressions.ParameterExpression#getParameter <em>Parameter</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Parameter</em>' reference.
    * @see #getParameter()
    * @generated
    */
   void setParameter (ParameterExtension value);

} // ParameterExpression
