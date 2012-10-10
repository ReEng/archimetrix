/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.expressions;

import org.eclipse.emf.ecore.EDataType;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Literal Expression</b></em>'. <!-- end-user-doc --> <!-- begin-model-doc --> Represents any literal, i.e. a
 * value whose type is an EDataType. Literals are, for example, 5, 3.14, 'c', "text", true. <!-- end-model-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.storydriven.modeling.expressions.LiteralExpression#getValue <em>Value</em>}</li>
 * <li>{@link org.storydriven.modeling.expressions.LiteralExpression#getValueType <em>Value Type</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.storydriven.modeling.expressions.ExpressionsPackage#getLiteralExpression()
 * @model
 * @generated
 */
public interface LiteralExpression extends Expression
{
   /**
    * Returns the value of the '<em><b>Value</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> String representation of the value, e.g.
    * "5", "3.14", "c", "text", or "true". <!-- end-model-doc -->
    * 
    * @return the value of the '<em>Value</em>' attribute.
    * @see #setValue(String)
    * @see org.storydriven.modeling.expressions.ExpressionsPackage#getLiteralExpression_Value()
    * @model ordered="false"
    * @generated
    */
   String getValue ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.expressions.LiteralExpression#getValue <em>Value</em>}' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @param value the new value of the '<em>Value</em>' attribute.
    * @see #getValue()
    * @generated
    */
   void setValue (String value);

   /**
    * Returns the value of the '<em><b>Value Type</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> The literal's type, e.g. EInt,
    * EString, etc. <!-- end-model-doc -->
    * 
    * @return the value of the '<em>Value Type</em>' reference.
    * @see #setValueType(EDataType)
    * @see org.storydriven.modeling.expressions.ExpressionsPackage#getLiteralExpression_ValueType()
    * @model required="true" ordered="false"
    * @generated
    */
   EDataType getValueType ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.expressions.LiteralExpression#getValueType <em>Value Type</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
    * -->
    * 
    * @param value the new value of the '<em>Value Type</em>' reference.
    * @see #getValueType()
    * @generated
    */
   void setValueType (EDataType value);

} // LiteralExpression
