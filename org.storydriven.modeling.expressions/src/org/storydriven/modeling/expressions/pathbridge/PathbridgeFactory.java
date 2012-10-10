/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.expressions.pathbridge;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.storydriven.modeling.expressions.pathbridge.PathbridgePackage
 * @generated
 */
public interface PathbridgeFactory extends EFactory
{
   /**
    * The singleton instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   PathbridgeFactory eINSTANCE = org.storydriven.modeling.expressions.pathbridge.impl.PathbridgeFactoryImpl.init();

   /**
    * Returns a new object of class '<em>Path Expression Bridge</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Path Expression Bridge</em>'.
    * @generated
    */
   PathExpressionBridge createPathExpressionBridge();

   /**
    * Returns the package supported by this factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the package supported by this factory.
    * @generated
    */
   PathbridgePackage getPathbridgePackage();

} //PathbridgeFactory
