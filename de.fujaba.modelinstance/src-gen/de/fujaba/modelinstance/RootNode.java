/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.fujaba.modelinstance;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The RootNode is the single root element of the XMI file which is generated for
 * the FUJABA model.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fujaba.modelinstance.RootNode#getCategories <em>Categories</em>}</li>
 *   <li>{@link de.fujaba.modelinstance.RootNode#getEcoreDataTypes <em>Ecore Data Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fujaba.modelinstance.ModelinstancePackage#getRootNode()
 * @model
 * @generated
 */
public interface RootNode extends EObject {
	/**
	 * Returns the value of the '<em><b>Categories</b></em>' containment reference list.
	 * The list contents are of type {@link de.fujaba.modelinstance.ModelElementCategory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categories</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The model element categories which are contained in this RootNode.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Categories</em>' containment reference list.
	 * @see de.fujaba.modelinstance.ModelinstancePackage#getRootNode_Categories()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModelElementCategory> getCategories();

	/**
	 * Returns the value of the '<em><b>Ecore Data Types</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EDataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ecore Data Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ecore Data Types</em>' reference list.
	 * @see de.fujaba.modelinstance.ModelinstancePackage#getRootNode_EcoreDataTypes()
	 * @model
	 * @generated
	 */
	EList<EDataType> getEcoreDataTypes();

} // RootNode
