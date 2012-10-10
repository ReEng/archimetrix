/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.calls;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EParameter;
import org.storydriven.modeling.CommentableElement;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Callable</b></em>'. <!-- end-user-doc --> <!-- begin-model-doc --> An entity which can be called by an
 * Invocation. A Callable can have a number of (ordered) parameters which are either in or out parameters. In the case of activities, the number of in and out parameters is
 * unbounded, whereas OperationExtensions and OpaqueCallables can only have one out parameter (This is enforced by an OCL constraint). <!-- end-model-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.storydriven.modeling.calls.Callable#getIns <em>In</em>}</li>
 * <li>{@link org.storydriven.modeling.calls.Callable#getOuts <em>Out</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.storydriven.modeling.calls.CallsPackage#getCallable()
 * @model abstract="true"
 * @generated
 */
public interface Callable extends CommentableElement
{
   /**
    * Returns the value of the '<em><b>Contained Parameters</b></em>' containment reference list.
    * The list contents are of type {@link org.eclipse.emf.ecore.EParameter}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Contained Parameters</em>' containment reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * This reference is used to contain the parameters of a Callable if they are not already contained in another container. If the parameter is contained in another container as it is the case for parameters of a EOperation, they must not be added to this container!
    * <!-- end-model-doc -->
    * @return the value of the '<em>Contained Parameters</em>' containment reference list.
    * @see org.storydriven.modeling.calls.CallsPackage#getCallable_ContainedParameters()
    * @model containment="true" resolveProxies="true" ordered="false"
    * @generated
    */
   EList<EParameter> getContainedParameters ();

   /**
    * Returns the value of the '<em><b>In Parameter</b></em>' reference list.
    * The list contents are of type {@link org.eclipse.emf.ecore.EParameter}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>In</em>' reference list isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * The ordered set of in parameters of this Callable. The parameters will not be contained in this reference, if parameters have to be contained in the callable, they also have to be added to the containedParameters reference.
    * <!-- end-model-doc -->
    * @return the value of the '<em>In Parameter</em>' reference list.
    * @see org.storydriven.modeling.calls.CallsPackage#getCallable_InParameter()
    * @model
    * @generated
    */
   EList<EParameter> getInParameters ();

   /**
    * Returns the value of the '<em><b>Out Parameter</b></em>' reference list.
    * The list contents are of type {@link org.eclipse.emf.ecore.EParameter}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Out</em>' reference list isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * The ordered set of out parameters of this Callable. The parameters will not be contained in this reference, if parameters have to be contained in the callable, they also have to be added to the containedParameters reference.
    * <!-- end-model-doc -->
    * @return the value of the '<em>Out Parameter</em>' reference list.
    * @see org.storydriven.modeling.calls.CallsPackage#getCallable_OutParameter()
    * @model
    * @generated
    */
   EList<EParameter> getOutParameters ();

} // Callable
