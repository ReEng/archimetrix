/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.calls;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a create method for each non-abstract class of the model. <!-- end-user-doc -->
 * @see org.storydriven.modeling.calls.CallsPackage
 * @generated
 */
public interface CallsFactory extends EFactory
{
   /**
    * The singleton instance of the factory.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   CallsFactory eINSTANCE = org.storydriven.modeling.calls.impl.CallsFactoryImpl.init();

   /**
    * Returns a new object of class '<em>Parameter Binding</em>'.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return a new object of class '<em>Parameter Binding</em>'.
    * @generated
    */
   ParameterBinding createParameterBinding ();

   /**
    * Returns a new object of class '<em>Opaque Callable</em>'.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return a new object of class '<em>Opaque Callable</em>'.
    * @generated
    */
   OpaqueCallable createOpaqueCallable ();

   /**
    * Returns a new object of class '<em>Parameter Extension</em>'.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return a new object of class '<em>Parameter Extension</em>'.
    * @generated
    */
   ParameterExtension createParameterExtension ();

   /**
    * Returns the package supported by this factory.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return the package supported by this factory.
    * @generated
    */
   CallsPackage getCallsPackage ();

} // CallsFactory
