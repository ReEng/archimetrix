/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.patterns.expressions;

import org.storydriven.modeling.expressions.Expression;
import org.storydriven.modeling.patterns.ObjectSetVariable;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Object Set Size Expression</b></em>'. <!-- end-user-doc --> <!-- begin-model-doc --> Represents the number
 * of elements in a set or more precisely: the number of elements in the set of objects that is represented by an object set variable. For example, if you have an object set
 * variable objects, then this expression would represent something like objects.size(). <!-- end-model-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.storydriven.modeling.patterns.expressions.ObjectSetSizeExpression#getSet <em>Set</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.storydriven.modeling.patterns.expressions.ExpressionsPackage#getObjectSetSizeExpression()
 * @model
 * @generated
 */
public interface ObjectSetSizeExpression extends Expression
{
   /**
    * Returns the value of the '<em><b>Set</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Specifies the object set variable whose
    * number of set elements is to be represented by this expression. <!-- end-model-doc -->
    * 
    * @return the value of the '<em>Set</em>' reference.
    * @see #setSet(ObjectSetVariable)
    * @see org.storydriven.modeling.patterns.expressions.ExpressionsPackage#getObjectSetSizeExpression_Set()
    * @model required="true" ordered="false"
    * @generated
    */
   ObjectSetVariable getSet ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.patterns.expressions.ObjectSetSizeExpression#getSet <em>Set</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
    * -->
    * 
    * @param value the new value of the '<em>Set</em>' reference.
    * @see #getSet()
    * @generated
    */
   void setSet (ObjectSetVariable value);

} // ObjectSetSizeExpression
