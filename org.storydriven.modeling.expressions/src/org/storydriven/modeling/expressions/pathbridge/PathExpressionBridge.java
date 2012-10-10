/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.expressions.pathbridge;

import org.storydriven.modeling.expressions.Expression;

import org.storydriven.modeling.expressions.pathExpressions.PathExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Path Expression Bridge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.storydriven.modeling.expressions.pathbridge.PathExpressionBridge#getPathExpression <em>Path Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.storydriven.modeling.expressions.pathbridge.PathbridgePackage#getPathExpressionBridge()
 * @model
 * @generated
 */
public interface PathExpressionBridge extends Expression
{
   /**
    * Returns the value of the '<em><b>Path Expression</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Path Expression</em>' containment reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Path Expression</em>' containment reference.
    * @see #setPathExpression(PathExpression)
    * @see org.storydriven.modeling.expressions.pathbridge.PathbridgePackage#getPathExpressionBridge_PathExpression()
    * @model containment="true"
    * @generated
    */
   PathExpression getPathExpression();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.expressions.pathbridge.PathExpressionBridge#getPathExpression <em>Path Expression</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Path Expression</em>' containment reference.
    * @see #getPathExpression()
    * @generated
    */
   void setPathExpression(PathExpression value);

} // PathExpressionBridge
