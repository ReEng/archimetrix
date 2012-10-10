/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.fujaba.modelinstance;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.fujaba.modelinstance.ModelinstancePackage
 * @generated
 */
public interface ModelinstanceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelinstanceFactory eINSTANCE = de.fujaba.modelinstance.impl.ModelinstanceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Root Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Root Node</em>'.
	 * @generated
	 */
	RootNode createRootNode();

	/**
	 * Returns a new object of class '<em>Model Element Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Element Category</em>'.
	 * @generated
	 */
	ModelElementCategory createModelElementCategory();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ModelinstancePackage getModelinstancePackage();

} //ModelinstanceFactory
