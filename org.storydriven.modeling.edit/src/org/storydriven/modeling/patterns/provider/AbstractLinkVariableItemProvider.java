/**
 * <copyright> </copyright> $Id$
 */
package org.storydriven.modeling.patterns.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.storydriven.modeling.patterns.AbstractLinkVariable;
import org.storydriven.modeling.patterns.PatternsPackage;
import org.storydriven.modeling.provider.NamedElementItemProvider;
import org.storydriven.modeling.provider.SDMEditPlugin;

/**
 * This is the item provider adapter for a {@link org.storydriven.modeling.patterns.AbstractLinkVariable} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AbstractLinkVariableItemProvider extends NamedElementItemProvider
		implements IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractLinkVariableItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addBindingSemanticsPropertyDescriptor(object);
			addBindingOperatorPropertyDescriptor(object);
			addSourcePropertyDescriptor(object);
			addSecondLinkConstraintPropertyDescriptor(object);
			addFirstLinkConstraintPropertyDescriptor(object);
			addBindingStatePropertyDescriptor(object);
			addTargetPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Binding Semantics feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBindingSemanticsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_AbstractLinkVariable_bindingSemantics_feature"),
						getString(
								"_UI_PropertyDescriptor_description",
								"_UI_AbstractLinkVariable_bindingSemantics_feature",
								"_UI_AbstractLinkVariable_type"),
						PatternsPackage.Literals.ABSTRACT_LINK_VARIABLE__BINDING_SEMANTICS,
						true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Binding Operator feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBindingOperatorPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_AbstractLinkVariable_bindingOperator_feature"),
						getString(
								"_UI_PropertyDescriptor_description",
								"_UI_AbstractLinkVariable_bindingOperator_feature",
								"_UI_AbstractLinkVariable_type"),
						PatternsPackage.Literals.ABSTRACT_LINK_VARIABLE__BINDING_OPERATOR,
						true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Target feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_AbstractLinkVariable_target_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AbstractLinkVariable_target_feature",
						"_UI_AbstractLinkVariable_type"),
				PatternsPackage.Literals.ABSTRACT_LINK_VARIABLE__TARGET, true,
				false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Second Link Constraint feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSecondLinkConstraintPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_AbstractLinkVariable_secondLinkConstraint_feature"),
						getString(
								"_UI_PropertyDescriptor_description",
								"_UI_AbstractLinkVariable_secondLinkConstraint_feature",
								"_UI_AbstractLinkVariable_type"),
						PatternsPackage.Literals.ABSTRACT_LINK_VARIABLE__SECOND_LINK_CONSTRAINT,
						true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the First Link Constraint feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFirstLinkConstraintPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_AbstractLinkVariable_firstLinkConstraint_feature"),
						getString(
								"_UI_PropertyDescriptor_description",
								"_UI_AbstractLinkVariable_firstLinkConstraint_feature",
								"_UI_AbstractLinkVariable_type"),
						PatternsPackage.Literals.ABSTRACT_LINK_VARIABLE__FIRST_LINK_CONSTRAINT,
						true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Binding State feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBindingStatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_AbstractLinkVariable_bindingState_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AbstractLinkVariable_bindingState_feature",
						"_UI_AbstractLinkVariable_type"),
				PatternsPackage.Literals.ABSTRACT_LINK_VARIABLE__BINDING_STATE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				null, null));
	}

	/**
	 * This adds a property descriptor for the Source feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_AbstractLinkVariable_source_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AbstractLinkVariable_source_feature",
						"_UI_AbstractLinkVariable_type"),
				PatternsPackage.Literals.ABSTRACT_LINK_VARIABLE__SOURCE, true,
				false, true, null, null, null));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((AbstractLinkVariable) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_AbstractLinkVariable_type")
				: getString("_UI_AbstractLinkVariable_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(AbstractLinkVariable.class)) {
		case PatternsPackage.ABSTRACT_LINK_VARIABLE__BINDING_SEMANTICS:
		case PatternsPackage.ABSTRACT_LINK_VARIABLE__BINDING_OPERATOR:
		case PatternsPackage.ABSTRACT_LINK_VARIABLE__BINDING_STATE:
			fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), false, true));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(
			Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return SDMEditPlugin.INSTANCE;
	}

}
