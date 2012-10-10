/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.expressions;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Textual Expression</b></em>'. <!-- end-user-doc --> <!-- begin-model-doc --> Represents any expression in a
 * textual language embedded into Story Diagrams, e.g. OCL or Java . <!-- end-model-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.storydriven.modeling.expressions.TextualExpression#getExpressionText <em>Expression Text</em>}</li>
 * <li>{@link org.storydriven.modeling.expressions.TextualExpression#getLanguage <em>Language</em>}</li>
 * <li>{@link org.storydriven.modeling.expressions.TextualExpression#getLanguageVersion <em>Language Version</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.storydriven.modeling.expressions.ExpressionsPackage#getTextualExpression()
 * @model
 * @generated
 */
public interface TextualExpression extends Expression
{
   /**
    * Returns the value of the '<em><b>Expression Text</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Holds the expression, e.g. in OCL
    * or Java. <!-- end-model-doc -->
    * 
    * @return the value of the '<em>Expression Text</em>' attribute.
    * @see #setExpressionText(String)
    * @see org.storydriven.modeling.expressions.ExpressionsPackage#getTextualExpression_ExpressionText()
    * @model required="true" ordered="false"
    * @generated
    */
   String getExpressionText ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.expressions.TextualExpression#getExpressionText <em>Expression Text</em>}' attribute.
    * <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * @param value the new value of the '<em>Expression Text</em>' attribute.
    * @see #getExpressionText()
    * @generated
    */
   void setExpressionText (String value);

   /**
    * Returns the value of the '<em><b>Language</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> String representation of the used
    * language which has to be unique. Examples are OCL and Java. <!-- end-model-doc -->
    * 
    * @return the value of the '<em>Language</em>' attribute.
    * @see #setLanguage(String)
    * @see org.storydriven.modeling.expressions.ExpressionsPackage#getTextualExpression_Language()
    * @model required="true" ordered="false"
    * @generated
    */
   String getLanguage ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.expressions.TextualExpression#getLanguage <em>Language</em>}' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @param value the new value of the '<em>Language</em>' attribute.
    * @see #getLanguage()
    * @generated
    */
   void setLanguage (String value);

   /**
    * Returns the value of the '<em><b>Language Version</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> String representation of the
    * used language's version. The format is <Major>.<Minor>[.<Revision>[.<Build>]] Examples: 1.4 or 3.0.1 or 1.0.2.20101208. <!-- end-model-doc -->
    * 
    * @return the value of the '<em>Language Version</em>' attribute.
    * @see #setLanguageVersion(String)
    * @see org.storydriven.modeling.expressions.ExpressionsPackage#getTextualExpression_LanguageVersion()
    * @model ordered="false"
    * @generated
    */
   String getLanguageVersion ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.expressions.TextualExpression#getLanguageVersion <em>Language Version</em>}' attribute.
    * <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * @param value the new value of the '<em>Language Version</em>' attribute.
    * @see #getLanguageVersion()
    * @generated
    */
   void setLanguageVersion (String value);

} // TextualExpression
