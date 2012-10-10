/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.patterns.expressions;

import org.storydriven.modeling.expressions.Expression;
import org.storydriven.modeling.patterns.ObjectVariable;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Object Variable Expression</b></em>'. <!-- end-user-doc --> <!-- begin-model-doc --> Represents the
 * reference to an object in an expression, i.e. the value of an object variable. <!-- end-model-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.storydriven.modeling.patterns.expressions.ObjectVariableExpression#getObject <em>Object</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.storydriven.modeling.patterns.expressions.ExpressionsPackage#getObjectVariableExpression()
 * @model
 * @generated
 */
public interface ObjectVariableExpression extends Expression
{
   /**
    * Returns the value of the '<em><b>Object</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Specifies the object variable that holds
    * the reference to be represented by this expression. <!-- end-model-doc -->
    * 
    * @return the value of the '<em>Object</em>' reference.
    * @see #setObject(ObjectVariable)
    * @see org.storydriven.modeling.patterns.expressions.ExpressionsPackage#getObjectVariableExpression_Object()
    * @model required="true" ordered="false"
    * @generated
    */
   ObjectVariable getObject ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.patterns.expressions.ObjectVariableExpression#getObject <em>Object</em>}' reference.
    * <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * @param value the new value of the '<em>Object</em>' reference.
    * @see #getObject()
    * @generated
    */
   void setObject (ObjectVariable value);

} // ObjectVariableExpression
