/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.patterns;

import org.storydriven.modeling.expressions.Expression;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Path</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A path is a special link variable that specifies an indirect connection between two objects. That means, the connected objects have other links and objects "between them". Exactly which types of links may be traversed during the matching of a path can be constrained by a path expression.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.storydriven.modeling.patterns.Path#getPathExpression <em>Path Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.storydriven.modeling.patterns.PatternsPackage#getPath()
 * @model
 * @generated
 */
public interface Path extends AbstractLinkVariable
{
   /**
    * Returns the value of the '<em><b>Path Expression</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Path Expression</em>' containment reference isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * The path expression constrains the matching of the path variable during pattern application. It can determine which links may be matched when and how many times to reach the target object of the path from the source object.
    * <!-- end-model-doc -->
    * @return the value of the '<em>Path Expression</em>' containment reference.
    * @see #setPathExpression(Expression)
    * @see org.storydriven.modeling.patterns.PatternsPackage#getPath_PathExpression()
    * @model containment="true" resolveProxies="true" required="true" ordered="false"
    * @generated
    */
   Expression getPathExpression ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.patterns.Path#getPathExpression <em>Path Expression</em>}' containment reference.
    * <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * @param value the new value of the '<em>Path Expression</em>' containment reference.
    * @see #getPathExpression()
    * @generated
    */
   void setPathExpression (Expression value);

} // Path
