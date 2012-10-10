/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.fujaba.modelinstance.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.fujaba.modelinstance.ModelElementCategory;
import de.fujaba.modelinstance.ModelinstancePackage;
import de.fujaba.modelinstance.RootNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.fujaba.modelinstance.impl.RootNodeImpl#getCategories <em>Categories</em>}</li>
 *   <li>{@link de.fujaba.modelinstance.impl.RootNodeImpl#getEcoreDataTypes <em>Ecore Data Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RootNodeImpl extends EObjectImpl implements RootNode {
	/**
	 * The cached value of the '{@link #getCategories() <em>Categories</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategories()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelElementCategory> categories;

	/**
	 * The cached value of the '{@link #getEcoreDataTypes() <em>Ecore Data Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEcoreDataTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<EDataType> ecoreDataTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RootNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelinstancePackage.Literals.ROOT_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelElementCategory> getCategories() {
		if (categories == null) {
			categories = new EObjectContainmentEList<ModelElementCategory>(ModelElementCategory.class, this, ModelinstancePackage.ROOT_NODE__CATEGORIES);
		}
		return categories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EDataType> getEcoreDataTypes() {
		if (ecoreDataTypes == null) {
			ecoreDataTypes = new EObjectResolvingEList<EDataType>(EDataType.class, this, ModelinstancePackage.ROOT_NODE__ECORE_DATA_TYPES);
		}
		return ecoreDataTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelinstancePackage.ROOT_NODE__CATEGORIES:
				return ((InternalEList<?>)getCategories()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelinstancePackage.ROOT_NODE__CATEGORIES:
				return getCategories();
			case ModelinstancePackage.ROOT_NODE__ECORE_DATA_TYPES:
				return getEcoreDataTypes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelinstancePackage.ROOT_NODE__CATEGORIES:
				getCategories().clear();
				getCategories().addAll((Collection<? extends ModelElementCategory>)newValue);
				return;
			case ModelinstancePackage.ROOT_NODE__ECORE_DATA_TYPES:
				getEcoreDataTypes().clear();
				getEcoreDataTypes().addAll((Collection<? extends EDataType>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModelinstancePackage.ROOT_NODE__CATEGORIES:
				getCategories().clear();
				return;
			case ModelinstancePackage.ROOT_NODE__ECORE_DATA_TYPES:
				getEcoreDataTypes().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModelinstancePackage.ROOT_NODE__CATEGORIES:
				return categories != null && !categories.isEmpty();
			case ModelinstancePackage.ROOT_NODE__ECORE_DATA_TYPES:
				return ecoreDataTypes != null && !ecoreDataTypes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RootNodeImpl
