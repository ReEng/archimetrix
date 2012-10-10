/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.activities;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EGenericType;
import org.storydriven.modeling.Variable;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Exception Variable</b></em>'. <!-- end-user-doc --> <!-- begin-model-doc --> Declares a variable
 * representing an Exception that leads to firing a transition (ActivityEdge). <!-- end-model-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.storydriven.modeling.activities.ExceptionVariable#getActivityEdge <em>Activity Edge</em>}</li>
 * <li>{@link org.storydriven.modeling.activities.ExceptionVariable#getName <em>Name</em>}</li>
 * <li>{@link org.storydriven.modeling.activities.ExceptionVariable#getExceptionTypes <em>Exception Type</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.storydriven.modeling.activities.ActivitiesPackage#getExceptionVariable()
 * @model
 * @generated
 */
public interface ExceptionVariable extends Variable
{
   /**
    * Returns the value of the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Specifies the name of the declared exception
    * variable. <!-- end-model-doc -->
    * 
    * @return the value of the '<em>Name</em>' attribute.
    * @see #setName(String)
    * @see org.storydriven.modeling.activities.ActivitiesPackage#getExceptionVariable_Name()
    * @model required="true" ordered="false"
    * @generated
    */
   String getName ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.activities.ExceptionVariable#getName <em>Name</em>}' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @param value the new value of the '<em>Name</em>' attribute.
    * @see #getName()
    * @generated
    */
   void setName (String value);

   /**
    * Returns the value of the '<em><b>Exception Type</b></em>' reference list. The list contents are of type {@link org.eclipse.emf.ecore.EClass}. <!-- begin-user-doc --> <!--
    * end-user-doc --> <!-- begin-model-doc --> Specifies the type of the declared exception variable. <!-- end-model-doc -->
    * 
    * @return the value of the '<em>Exception Type</em>' reference list.
    * @see org.storydriven.modeling.activities.ActivitiesPackage#getExceptionVariable_ExceptionType()
    * @model ordered="false"
    * @generated
    */
   EList<EClassifier> getExceptionTypes ();

   /**
    * Returns the value of the '<em><b>Generic Exception Type</b></em>' reference list.
    * The list contents are of type {@link org.eclipse.emf.ecore.EGenericType}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Generic Exception Type</em>' reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Generic Exception Type</em>' reference list.
    * @see org.storydriven.modeling.activities.ActivitiesPackage#getExceptionVariable_GenericExceptionType()
    * @model ordered="false"
    * @generated
    */
   EList<EGenericType> getGenericExceptionTypes ();

   /**
    * Returns the value of the '<em><b>Activity Edge</b></em>' container reference. It is bidirectional and its opposite is '
    * {@link org.storydriven.modeling.activities.ActivityEdge#getGuardExceptions <em>Guard Exception</em>}'. <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
    * Specifies the transition (activity edge) where the exception variable is declared. <!-- end-model-doc -->
    * 
    * @return the value of the '<em>Activity Edge</em>' container reference.
    * @see #setActivityEdge(ActivityEdge)
    * @see org.storydriven.modeling.activities.ActivitiesPackage#getExceptionVariable_ActivityEdge()
    * @see org.storydriven.modeling.activities.ActivityEdge#getGuardExceptions
    * @model opposite="guardException" required="true" transient="false" ordered="false"
    * @generated
    */
   ActivityEdge getActivityEdge ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.activities.ExceptionVariable#getActivityEdge <em>Activity Edge</em>}' container reference.
    * <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * @param value the new value of the '<em>Activity Edge</em>' container reference.
    * @see #getActivityEdge()
    * @generated
    */
   void setActivityEdge (ActivityEdge value);

} // ExceptionVariable
