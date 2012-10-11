/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.fujaba.commons.notation;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.fujaba.commons.notation.NotationPackage
 * @generated
 */
public interface NotationFactory extends EFactory
{
   /**
    * The singleton instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   NotationFactory eINSTANCE = org.fujaba.commons.notation.impl.NotationFactoryImpl.init();

   /**
    * Returns a new object of class '<em>Node</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Node</em>'.
    * @generated
    */
   Node createNode();

   /**
    * Returns a new object of class '<em>Edge</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Edge</em>'.
    * @generated
    */
   Edge createEdge();

   /**
    * Returns a new object of class '<em>Hierarchical Node</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Hierarchical Node</em>'.
    * @generated
    */
   HierarchicalNode createHierarchicalNode();

   /**
    * Returns a new object of class '<em>Anchor</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Anchor</em>'.
    * @generated
    */
   Anchor createAnchor();

   /**
    * Returns a new object of class '<em>Relative Bend Point</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Relative Bend Point</em>'.
    * @generated
    */
   RelativeBendPoint createRelativeBendPoint();

   /**
    * Returns a new object of class '<em>Absolute Bend Point</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Absolute Bend Point</em>'.
    * @generated
    */
   AbsoluteBendPoint createAbsoluteBendPoint();

   /**
    * Returns the package supported by this factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the package supported by this factory.
    * @generated
    */
   NotationPackage getNotationPackage();

} //NotationFactory
