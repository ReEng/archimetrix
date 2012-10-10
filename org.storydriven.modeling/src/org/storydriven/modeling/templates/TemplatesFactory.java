/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.templates;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a create method for each non-abstract class of the model. <!-- end-user-doc -->
 * @see org.storydriven.modeling.templates.TemplatesPackage
 * @generated
 */
public interface TemplatesFactory extends EFactory
{
   /**
    * The singleton instance of the factory.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   TemplatesFactory eINSTANCE = org.storydriven.modeling.templates.impl.TemplatesFactoryImpl.init();

   /**
    * Returns a new object of class '<em>Template Signature</em>'.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return a new object of class '<em>Template Signature</em>'.
    * @generated
    */
   TemplateSignature createTemplateSignature ();

   /**
    * Returns a new object of class '<em>Template Binding</em>'.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return a new object of class '<em>Template Binding</em>'.
    * @generated
    */
   TemplateBinding createTemplateBinding ();

   /**
    * Returns a new object of class '<em>Property Binding</em>'.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return a new object of class '<em>Property Binding</em>'.
    * @generated
    */
   PropertyBinding createPropertyBinding ();

   /**
    * Returns the package supported by this factory.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return the package supported by this factory.
    * @generated
    */
   TemplatesPackage getTemplatesPackage ();

} // TemplatesFactory
