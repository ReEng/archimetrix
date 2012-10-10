/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.patterns;

import org.eclipse.emf.common.util.EList;
import org.storydriven.modeling.NamedElement;
import org.storydriven.modeling.Variable;
import org.storydriven.modeling.expressions.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abstract super class for object and primitive variables.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.storydriven.modeling.patterns.AbstractVariable#getPattern <em>Pattern</em>}</li>
 *   <li>{@link org.storydriven.modeling.patterns.AbstractVariable#getBindingState <em>Binding State</em>}</li>
 *   <li>{@link org.storydriven.modeling.patterns.AbstractVariable#getBindingExpression <em>Binding Expression</em>}</li>
 *   <li>{@link org.storydriven.modeling.patterns.AbstractVariable#getConstraints <em>Constraint</em>}</li>
 *   <li>{@link org.storydriven.modeling.patterns.AbstractVariable#getIncomingLinks <em>Incoming Link</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.storydriven.modeling.patterns.PatternsPackage#getAbstractVariable()
 * @model abstract="true"
 * @generated
 */
public interface AbstractVariable extends Variable, NamedElement
{
   /**
    * Returns the value of the '<em><b>Pattern</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link org.storydriven.modeling.patterns.StoryPattern#getVariables <em>Variable</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Pattern</em>' container reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Pattern</em>' container reference.
    * @see #setPattern(StoryPattern)
    * @see org.storydriven.modeling.patterns.PatternsPackage#getAbstractVariable_Pattern()
    * @see org.storydriven.modeling.patterns.StoryPattern#getVariables
    * @model opposite="variable" required="true" transient="false" ordered="false"
    * @generated
    */
   StoryPattern getPattern ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.patterns.AbstractVariable#getPattern <em>Pattern</em>}' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Pattern</em>' container reference.
    * @see #getPattern()
    * @generated
    */
   void setPattern (StoryPattern value);

   /**
    * Returns the value of the '<em><b>Binding State</b></em>' attribute.
    * The default value is <code>"UNBOUND"</code>.
    * The literals are from the enumeration {@link org.storydriven.modeling.patterns.BindingState}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Binding State</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * The binding state defines whether the variable is already bound or whether a match has to be obtained for it. The default value is "unbound".
    * <!-- end-model-doc -->
    * @return the value of the '<em>Binding State</em>' attribute.
    * @see org.storydriven.modeling.patterns.BindingState
    * @see #setBindingState(BindingState)
    * @see org.storydriven.modeling.patterns.PatternsPackage#getAbstractVariable_BindingState()
    * @model default="UNBOUND" required="true" ordered="false"
    * @generated
    */
   BindingState getBindingState ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.patterns.AbstractVariable#getBindingState <em>Binding State</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Binding State</em>' attribute.
    * @see org.storydriven.modeling.patterns.BindingState
    * @see #getBindingState()
    * @generated
    */
   void setBindingState (BindingState value);

   /**
    * Returns the value of the '<em><b>Binding Expression</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Binding Expression</em>' containment reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * A binding expression can be used to bind a variable in a different way than just by pattern matching. This way, for example, the return value of a call can be bound to a variable.
    * <!-- end-model-doc -->
    * @return the value of the '<em>Binding Expression</em>' containment reference.
    * @see #setBindingExpression(Expression)
    * @see org.storydriven.modeling.patterns.PatternsPackage#getAbstractVariable_BindingExpression()
    * @model containment="true" resolveProxies="true" ordered="false"
    * @generated
    */
   Expression getBindingExpression ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.patterns.AbstractVariable#getBindingExpression <em>Binding Expression</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Binding Expression</em>' containment reference.
    * @see #getBindingExpression()
    * @generated
    */
   void setBindingExpression (Expression value);

   /**
    * Returns the value of the '<em><b>Constraint</b></em>' containment reference list.
    * The list contents are of type {@link org.storydriven.modeling.patterns.Constraint}.
    * It is bidirectional and its opposite is '{@link org.storydriven.modeling.patterns.Constraint#getObjectVariable <em>Object Variable</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Constraint</em>' containment reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * All constraints which are defined for this variable. For a successful matching, all constraints for this variable must evaluate to true.
    * <!-- end-model-doc -->
    * @return the value of the '<em>Constraint</em>' containment reference list.
    * @see org.storydriven.modeling.patterns.PatternsPackage#getAbstractVariable_Constraint()
    * @see org.storydriven.modeling.patterns.Constraint#getObjectVariable
    * @model opposite="objectVariable" containment="true" resolveProxies="true"
    * @generated
    */
   EList<Constraint> getConstraints ();

   /**
    * Returns the value of the '<em><b>Incoming Link</b></em>' reference list.
    * The list contents are of type {@link org.storydriven.modeling.patterns.AbstractLinkVariable}.
    * It is bidirectional and its opposite is '{@link org.storydriven.modeling.patterns.AbstractLinkVariable#getTarget <em>Target</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Incoming Link</em>' reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Incoming Link</em>' reference list.
    * @see org.storydriven.modeling.patterns.PatternsPackage#getAbstractVariable_IncomingLink()
    * @see org.storydriven.modeling.patterns.AbstractLinkVariable#getTarget
    * @model opposite="target" ordered="false"
    * @generated
    */
   EList<AbstractLinkVariable> getIncomingLinks ();

} // AbstractVariable
