/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.patterns;

import org.eclipse.emf.ecore.EObject;
import org.storydriven.modeling.expressions.Expression;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Constraint</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A constraint represents a condition which must be fulfilled for a successful pattern matching. It can either be contained in the story pattern or in a variable. In the former case, the constraint is evaluated after the matching of the object structure is complete. It still has to be true for the pattern application to be sucessful (and therefore for creations and destructions to be carried out). If the constraint is contained in a variable, it constrains the matching of that variable, i.e., it is evaluated during the matching of the containing variable and has to be true for a successful matching. If the variable is an ObjectSetVariable, the constraint has to be true for every object in the set.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.storydriven.modeling.patterns.Constraint#getConstraintExpression <em>Constraint Expression</em>}</li>
 *   <li>{@link org.storydriven.modeling.patterns.Constraint#getPattern <em>Pattern</em>}</li>
 *   <li>{@link org.storydriven.modeling.patterns.Constraint#getObjectVariable <em>Object Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.storydriven.modeling.patterns.PatternsPackage#getConstraint()
 * @model
 * @generated
 */
public interface Constraint extends EObject
{
   /**
    * Returns the value of the '<em><b>Constraint Expression</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Constraint Expression</em>' containment reference isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * The constraintExpression defines the concrete condition of this constraint.
    * <!-- end-model-doc -->
    * @return the value of the '<em>Constraint Expression</em>' containment reference.
    * @see #setConstraintExpression(Expression)
    * @see org.storydriven.modeling.patterns.PatternsPackage#getConstraint_ConstraintExpression()
    * @model containment="true" resolveProxies="true" required="true" ordered="false"
    * @generated
    */
   Expression getConstraintExpression ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.patterns.Constraint#getConstraintExpression <em>Constraint Expression</em>}' containment reference.
    * <!-- begin-user-doc
    * --> <!-- end-user-doc -->
    * @param value the new value of the '<em>Constraint Expression</em>' containment reference.
    * @see #getConstraintExpression()
    * @generated
    */
   void setConstraintExpression (Expression value);

   /**
    * Returns the value of the '<em><b>Pattern</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link org.storydriven.modeling.patterns.StoryPattern#getConstraints <em>Constraint</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Pattern</em>' container reference isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * The story pattern this constraint applies to.
    * <!-- end-model-doc -->
    * @return the value of the '<em>Pattern</em>' container reference.
    * @see #setPattern(StoryPattern)
    * @see org.storydriven.modeling.patterns.PatternsPackage#getConstraint_Pattern()
    * @see org.storydriven.modeling.patterns.StoryPattern#getConstraints
    * @model opposite="constraint" transient="false" ordered="false"
    * @generated
    */
   StoryPattern getPattern ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.patterns.Constraint#getPattern <em>Pattern</em>}' container reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @param value the new value of the '<em>Pattern</em>' container reference.
    * @see #getPattern()
    * @generated
    */
   void setPattern (StoryPattern value);

   /**
    * Returns the value of the '<em><b>Object Variable</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link org.storydriven.modeling.patterns.AbstractVariable#getConstraints <em>Constraint</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Object Variable</em>' container reference isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * The object variable this constraint applies to.
    * <!-- end-model-doc -->
    * @return the value of the '<em>Object Variable</em>' container reference.
    * @see #setObjectVariable(AbstractVariable)
    * @see org.storydriven.modeling.patterns.PatternsPackage#getConstraint_ObjectVariable()
    * @see org.storydriven.modeling.patterns.AbstractVariable#getConstraints
    * @model opposite="constraint" transient="false" ordered="false"
    * @generated
    */
   AbstractVariable getObjectVariable ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.patterns.Constraint#getObjectVariable <em>Object Variable</em>}' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Object Variable</em>' container reference.
    * @see #getObjectVariable()
    * @generated
    */
   void setObjectVariable (AbstractVariable value);

} // Constraint
