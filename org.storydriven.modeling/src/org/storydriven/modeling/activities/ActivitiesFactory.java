/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.activities;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a create method for each non-abstract class of the model. <!-- end-user-doc -->
 * @see org.storydriven.modeling.activities.ActivitiesPackage
 * @generated
 */
public interface ActivitiesFactory extends EFactory
{
   /**
    * The singleton instance of the factory.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   ActivitiesFactory eINSTANCE = org.storydriven.modeling.activities.impl.ActivitiesFactoryImpl.init();

   /**
    * Returns a new object of class '<em>Activity</em>'.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return a new object of class '<em>Activity</em>'.
    * @generated
    */
   Activity createActivity ();

   /**
    * Returns a new object of class '<em>Activity Edge</em>'.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return a new object of class '<em>Activity Edge</em>'.
    * @generated
    */
   ActivityEdge createActivityEdge ();

   /**
    * Returns a new object of class '<em>Exception Variable</em>'.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return a new object of class '<em>Exception Variable</em>'.
    * @generated
    */
   ExceptionVariable createExceptionVariable ();

   /**
    * Returns a new object of class '<em>Structured Node</em>'.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return a new object of class '<em>Structured Node</em>'.
    * @generated
    */
   StructuredNode createStructuredNode ();

   /**
    * Returns a new object of class '<em>Operation Extension</em>'.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return a new object of class '<em>Operation Extension</em>'.
    * @generated
    */
   OperationExtension createOperationExtension ();

   /**
    * Returns a new object of class '<em>Junction Node</em>'.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return a new object of class '<em>Junction Node</em>'.
    * @generated
    */
   JunctionNode createJunctionNode ();

   /**
    * Returns a new object of class '<em>Start Node</em>'.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return a new object of class '<em>Start Node</em>'.
    * @generated
    */
   StartNode createStartNode ();

   /**
    * Returns a new object of class '<em>Statement Node</em>'.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return a new object of class '<em>Statement Node</em>'.
    * @generated
    */
   StatementNode createStatementNode ();

   /**
    * Returns a new object of class '<em>Stop Node</em>'.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return a new object of class '<em>Stop Node</em>'.
    * @generated
    */
   StopNode createStopNode ();

   /**
    * Returns a new object of class '<em>Activity Call Node</em>'.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return a new object of class '<em>Activity Call Node</em>'.
    * @generated
    */
   ActivityCallNode createActivityCallNode ();

   /**
    * Returns a new object of class '<em>Matching Story Node</em>'.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return a new object of class '<em>Matching Story Node</em>'.
    * @generated
    */
   MatchingStoryNode createMatchingStoryNode ();

   /**
    * Returns a new object of class '<em>Modifying Story Node</em>'.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return a new object of class '<em>Modifying Story Node</em>'.
    * @generated
    */
   ModifyingStoryNode createModifyingStoryNode ();

   /**
    * Returns the package supported by this factory.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return the package supported by this factory.
    * @generated
    */
   ActivitiesPackage getActivitiesPackage ();

} // ActivitiesFactory
