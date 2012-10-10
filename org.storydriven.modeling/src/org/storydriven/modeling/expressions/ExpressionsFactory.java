/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.expressions;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a create method for each non-abstract class of the model. <!-- end-user-doc -->
 * @see org.storydriven.modeling.expressions.ExpressionsPackage
 * @generated
 */
public interface ExpressionsFactory extends EFactory
{
   /**
    * The singleton instance of the factory.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   ExpressionsFactory eINSTANCE = org.storydriven.modeling.expressions.impl.ExpressionsFactoryImpl.init();

   /**
    * Returns a new object of class '<em>Textual Expression</em>'.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return a new object of class '<em>Textual Expression</em>'.
    * @generated
    */
   TextualExpression createTextualExpression ();

   /**
    * Returns a new object of class '<em>Literal Expression</em>'.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return a new object of class '<em>Literal Expression</em>'.
    * @generated
    */
   LiteralExpression createLiteralExpression ();

   /**
    * Returns a new object of class '<em>Not Expression</em>'.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return a new object of class '<em>Not Expression</em>'.
    * @generated
    */
   NotExpression createNotExpression ();

   /**
    * Returns a new object of class '<em>Comparison Expression</em>'.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return a new object of class '<em>Comparison Expression</em>'.
    * @generated
    */
   ComparisonExpression createComparisonExpression ();

   /**
    * Returns a new object of class '<em>Arithmetic Expression</em>'.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return a new object of class '<em>Arithmetic Expression</em>'.
    * @generated
    */
   ArithmeticExpression createArithmeticExpression ();

   /**
    * Returns a new object of class '<em>Binary Logic Expression</em>'.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return a new object of class '<em>Binary Logic Expression</em>'.
    * @generated
    */
   BinaryLogicExpression createBinaryLogicExpression ();

   /**
    * Returns the package supported by this factory.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return the package supported by this factory.
    * @generated
    */
   ExpressionsPackage getExpressionsPackage ();

} // ExpressionsFactory
