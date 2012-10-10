/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.templates;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.storydriven.modeling.patterns.StoryPattern;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Template Signature</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.storydriven.modeling.templates.TemplateSignature#getTemplateBindings <em>Template Binding</em>}</li>
 *   <li>{@link org.storydriven.modeling.templates.TemplateSignature#getTypeParameters <em>Type Parameter</em>}</li>
 *   <li>{@link org.storydriven.modeling.templates.TemplateSignature#getPattern <em>Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.storydriven.modeling.templates.TemplatesPackage#getTemplateSignature()
 * @model
 * @generated
 */
public interface TemplateSignature extends EObject
{
   /**
    * Returns the value of the '<em><b>Type Parameter</b></em>' containment reference list. The list contents are of type {@link org.eclipse.emf.ecore.EClassifier}. <!--
    * begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Type Parameter</em>' containment reference list isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Type Parameter</em>' containment reference list.
    * @see org.storydriven.modeling.templates.TemplatesPackage#getTemplateSignature_TypeParameter()
    * @model containment="true" resolveProxies="true" ordered="false"
    * @generated
    */
   EList<EClassifier> getTypeParameters ();

   /**
    * Returns the value of the '<em><b>Template Binding</b></em>' containment reference list.
    * The list contents are of type {@link org.storydriven.modeling.templates.TemplateBinding}.
    * It is bidirectional and its opposite is '{@link org.storydriven.modeling.templates.TemplateBinding#getTemplate <em>Template</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Template Binding</em>' containment reference list isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Template Binding</em>' containment reference list.
    * @see org.storydriven.modeling.templates.TemplatesPackage#getTemplateSignature_TemplateBinding()
    * @see org.storydriven.modeling.templates.TemplateBinding#getTemplate
    * @model opposite="template" containment="true" resolveProxies="true" ordered="false"
    * @generated
    */
   EList<TemplateBinding> getTemplateBindings ();

   /**
    * Returns the value of the '<em><b>Pattern</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link org.storydriven.modeling.patterns.StoryPattern#getTemplateSignature <em>Template Signature</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Pattern</em>' container reference isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Pattern</em>' container reference.
    * @see #setPattern(StoryPattern)
    * @see org.storydriven.modeling.templates.TemplatesPackage#getTemplateSignature_Pattern()
    * @see org.storydriven.modeling.patterns.StoryPattern#getTemplateSignature
    * @model opposite="templateSignature" required="true" transient="false" ordered="false"
    * @generated
    */
   StoryPattern getPattern ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.templates.TemplateSignature#getPattern <em>Pattern</em>}' container reference.
    * <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * @param value the new value of the '<em>Pattern</em>' container reference.
    * @see #getPattern()
    * @generated
    */
   void setPattern (StoryPattern value);

} // TemplateSignature
