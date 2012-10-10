/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.patterns;

import org.eclipse.emf.common.util.EList;
import org.storydriven.modeling.NamedElement;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Abstract Link Variable</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abstract super class for all kinds of link variables that represent links between two objects in a story pattern.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.storydriven.modeling.patterns.AbstractLinkVariable#getBindingSemantics <em>Binding Semantics</em>}</li>
 *   <li>{@link org.storydriven.modeling.patterns.AbstractLinkVariable#getBindingOperator <em>Binding Operator</em>}</li>
 *   <li>{@link org.storydriven.modeling.patterns.AbstractLinkVariable#getSource <em>Source</em>}</li>
 *   <li>{@link org.storydriven.modeling.patterns.AbstractLinkVariable#getSecondLinkConstraints <em>Second Link Constraint</em>}</li>
 *   <li>{@link org.storydriven.modeling.patterns.AbstractLinkVariable#getFirstLinkConstraints <em>First Link Constraint</em>}</li>
 *   <li>{@link org.storydriven.modeling.patterns.AbstractLinkVariable#getBindingState <em>Binding State</em>}</li>
 *   <li>{@link org.storydriven.modeling.patterns.AbstractLinkVariable#getPattern <em>Pattern</em>}</li>
 *   <li>{@link org.storydriven.modeling.patterns.AbstractLinkVariable#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.storydriven.modeling.patterns.PatternsPackage#getAbstractLinkVariable()
 * @model abstract="true"
 * @generated
 */
public interface AbstractLinkVariable extends NamedElement
{
   /**
    * Returns the value of the '<em><b>Binding Semantics</b></em>' attribute.
    * The default value is <code>"MANDATORY"</code>.
    * The literals are from the enumeration {@link org.storydriven.modeling.patterns.BindingSemantics}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Binding Semantics</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * The binding semantics defines whether the link must be matched for a successful application of the containing story pattern, whether it must not be matched or whether it is optional, i.e., it will be bound if it can be bound but that does not affect the success of matching the story pattern. The default value is "mandatory" (i.e., it must be matched).
    * <!-- end-model-doc -->
    * @return the value of the '<em>Binding Semantics</em>' attribute.
    * @see org.storydriven.modeling.patterns.BindingSemantics
    * @see #setBindingSemantics(BindingSemantics)
    * @see org.storydriven.modeling.patterns.PatternsPackage#getAbstractLinkVariable_BindingSemantics()
    * @model default="MANDATORY" required="true" ordered="false"
    * @generated
    */
   BindingSemantics getBindingSemantics ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.patterns.AbstractLinkVariable#getBindingSemantics <em>Binding Semantics</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Binding Semantics</em>' attribute.
    * @see org.storydriven.modeling.patterns.BindingSemantics
    * @see #getBindingSemantics()
    * @generated
    */
   void setBindingSemantics (BindingSemantics value);

   /**
    * Returns the value of the '<em><b>Binding Operator</b></em>' attribute.
    * The default value is <code>"CHECK_ONLY"</code>.
    * The literals are from the enumeration {@link org.storydriven.modeling.patterns.BindingOperator}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Binding Operator</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * The binding operator defines whether this link will be matched, created or destroyed by the story pattern. The default value ist "check_only", i.e., the link will be matched.
    * <!-- end-model-doc -->
    * @return the value of the '<em>Binding Operator</em>' attribute.
    * @see org.storydriven.modeling.patterns.BindingOperator
    * @see #setBindingOperator(BindingOperator)
    * @see org.storydriven.modeling.patterns.PatternsPackage#getAbstractLinkVariable_BindingOperator()
    * @model default="CHECK_ONLY" required="true" ordered="false"
    * @generated
    */
   BindingOperator getBindingOperator ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.patterns.AbstractLinkVariable#getBindingOperator <em>Binding Operator</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Binding Operator</em>' attribute.
    * @see org.storydriven.modeling.patterns.BindingOperator
    * @see #getBindingOperator()
    * @generated
    */
   void setBindingOperator (BindingOperator value);

   /**
    * Returns the value of the '<em><b>Target</b></em>' reference.
    * It is bidirectional and its opposite is '{@link org.storydriven.modeling.patterns.AbstractVariable#getIncomingLinks <em>Incoming Link</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Target</em>' reference isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Target</em>' reference.
    * @see #setTarget(AbstractVariable)
    * @see org.storydriven.modeling.patterns.PatternsPackage#getAbstractLinkVariable_Target()
    * @see org.storydriven.modeling.patterns.AbstractVariable#getIncomingLinks
    * @model opposite="incomingLink" required="true" ordered="false"
    * @generated
    */
   AbstractVariable getTarget ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.patterns.AbstractLinkVariable#getTarget <em>Target</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Target</em>' reference.
    * @see #getTarget()
    * @generated
    */
   void setTarget (AbstractVariable value);

   /**
    * Returns the value of the '<em><b>Second Link Constraint</b></em>' reference list.
    * The list contents are of type {@link org.storydriven.modeling.patterns.LinkConstraint}.
    * It is bidirectional and its opposite is '{@link org.storydriven.modeling.patterns.LinkConstraint#getSecondLink <em>Second Link</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Second Link Constraint</em>' reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Second Link Constraint</em>' reference list.
    * @see org.storydriven.modeling.patterns.PatternsPackage#getAbstractLinkVariable_SecondLinkConstraint()
    * @see org.storydriven.modeling.patterns.LinkConstraint#getSecondLink
    * @model opposite="secondLink" ordered="false"
    * @generated
    */
   EList<LinkConstraint> getSecondLinkConstraints ();

   /**
    * Returns the value of the '<em><b>First Link Constraint</b></em>' reference list.
    * The list contents are of type {@link org.storydriven.modeling.patterns.LinkConstraint}.
    * It is bidirectional and its opposite is '{@link org.storydriven.modeling.patterns.LinkConstraint#getFirstLink <em>First Link</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>First Link Constraint</em>' reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>First Link Constraint</em>' reference list.
    * @see org.storydriven.modeling.patterns.PatternsPackage#getAbstractLinkVariable_FirstLinkConstraint()
    * @see org.storydriven.modeling.patterns.LinkConstraint#getFirstLink
    * @model opposite="firstLink" ordered="false"
    * @generated
    */
   EList<LinkConstraint> getFirstLinkConstraints ();

   /**
    * Returns the value of the '<em><b>Binding State</b></em>' attribute. The literals are from the enumeration {@link org.storydriven.modeling.patterns.BindingState}. <!--
    * begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Binding State</em>' attribute isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Binding State</em>' attribute.
    * @see org.storydriven.modeling.patterns.BindingState
    * @see #setBindingState(BindingState)
    * @see org.storydriven.modeling.patterns.PatternsPackage#getAbstractLinkVariable_BindingState()
    * @model required="true" ordered="false"
    * @generated
    */
   BindingState getBindingState ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.patterns.AbstractLinkVariable#getBindingState <em>Binding State</em>}' attribute.
    * <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * @param value the new value of the '<em>Binding State</em>' attribute.
    * @see org.storydriven.modeling.patterns.BindingState
    * @see #getBindingState()
    * @generated
    */
   void setBindingState (BindingState value);

   /**
    * Returns the value of the '<em><b>Pattern</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link org.storydriven.modeling.patterns.StoryPattern#getLinkVariables <em>Link Variable</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Pattern</em>' container reference isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Pattern</em>' container reference.
    * @see #setPattern(StoryPattern)
    * @see org.storydriven.modeling.patterns.PatternsPackage#getAbstractLinkVariable_Pattern()
    * @see org.storydriven.modeling.patterns.StoryPattern#getLinkVariables
    * @model opposite="linkVariable" required="true" transient="false" ordered="false"
    * @generated
    */
   StoryPattern getPattern ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.patterns.AbstractLinkVariable#getPattern <em>Pattern</em>}' container reference.
    * <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * @param value the new value of the '<em>Pattern</em>' container reference.
    * @see #getPattern()
    * @generated
    */
   void setPattern (StoryPattern value);

   /**
    * Returns the value of the '<em><b>Source</b></em>' reference.
    * It is bidirectional and its opposite is '{@link org.storydriven.modeling.patterns.ObjectVariable#getOutgoingLinks <em>Outgoing Link</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Source</em>' reference isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Source</em>' reference.
    * @see #setSource(ObjectVariable)
    * @see org.storydriven.modeling.patterns.PatternsPackage#getAbstractLinkVariable_Source()
    * @see org.storydriven.modeling.patterns.ObjectVariable#getOutgoingLinks
    * @model opposite="outgoingLink" required="true" ordered="false"
    * @generated
    */
   ObjectVariable getSource ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.patterns.AbstractLinkVariable#getSource <em>Source</em>}' reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @param value the new value of the '<em>Source</em>' reference.
    * @see #getSource()
    * @generated
    */
   void setSource (ObjectVariable value);

} // AbstractLinkVariable
