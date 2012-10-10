/**
 * <copyright> </copyright> $Id$
 */
package org.storydriven.modeling.activities.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.storydriven.modeling.SDMPackage;
import org.storydriven.modeling.activities.ActivitiesFactory;
import org.storydriven.modeling.activities.ActivitiesPackage;
import org.storydriven.modeling.activities.OperationExtension;
import org.storydriven.modeling.calls.CallsPackage;
import org.storydriven.modeling.provider.ExtensionItemProvider;
import org.storydriven.modeling.provider.SDMEditPlugin;

/**
 * This is the item provider adapter for a {@link org.storydriven.modeling.activities.OperationExtension} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OperationExtensionItemProvider extends ExtensionItemProvider
		implements IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationExtensionItemProvider(AdapterFactory adapterFactory) {
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

			addCommentPropertyDescriptor(object);
			addInParameterPropertyDescriptor(object);
			addOutParameterPropertyDescriptor(object);
			addContainedParametersPropertyDescriptor(object);
			addOperationPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Comment feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCommentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_CommentableElement_comment_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CommentableElement_comment_feature",
						"_UI_CommentableElement_type"),
				SDMPackage.Literals.COMMENTABLE_ELEMENT__COMMENT, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the In Parameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInParameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_Callable_inParameter_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_Callable_inParameter_feature",
								"_UI_Callable_type"),
						CallsPackage.Literals.CALLABLE__IN_PARAMETER, true,
						false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Out Parameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutParameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Callable_outParameter_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_Callable_outParameter_feature",
						"_UI_Callable_type"),
				CallsPackage.Literals.CALLABLE__OUT_PARAMETER, true, false,
				true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Contained Parameters feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContainedParametersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Callable_containedParameters_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_Callable_containedParameters_feature",
						"_UI_Callable_type"),
				CallsPackage.Literals.CALLABLE__CONTAINED_PARAMETERS, true,
				false, false, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Operation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOperationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_OperationExtension_operation_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_OperationExtension_operation_feature",
						"_UI_OperationExtension_type"),
				ActivitiesPackage.Literals.OPERATION_EXTENSION__OPERATION,
				true, false, true, null, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(
			Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures
					.add(CallsPackage.Literals.CALLABLE__CONTAINED_PARAMETERS);
			childrenFeatures
					.add(ActivitiesPackage.Literals.OPERATION_EXTENSION__RETURN_VALUE);
			childrenFeatures
					.add(ActivitiesPackage.Literals.OPERATION_EXTENSION__OWNED_ACTIVITY);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns OperationExtension.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object,
				getResourceLocator().getImage("full/obj16/OperationExtension"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((OperationExtension) object).getComment();
		return label == null || label.length() == 0 ? getString("_UI_OperationExtension_type")
				: getString("_UI_OperationExtension_type") + " " + label;
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

		switch (notification.getFeatureID(OperationExtension.class)) {
		case ActivitiesPackage.OPERATION_EXTENSION__COMMENT:
			fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), false, true));
			return;
		case ActivitiesPackage.OPERATION_EXTENSION__CONTAINED_PARAMETERS:
		case ActivitiesPackage.OPERATION_EXTENSION__RETURN_VALUE:
		case ActivitiesPackage.OPERATION_EXTENSION__OWNED_ACTIVITY:
			fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), true, false));
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

		newChildDescriptors.add(createChildParameter(
				CallsPackage.Literals.CALLABLE__CONTAINED_PARAMETERS,
				EcoreFactory.eINSTANCE.createEParameter()));

		newChildDescriptors.add(createChildParameter(
				ActivitiesPackage.Literals.OPERATION_EXTENSION__RETURN_VALUE,
				EcoreFactory.eINSTANCE.createEParameter()));

		newChildDescriptors.add(createChildParameter(
				ActivitiesPackage.Literals.OPERATION_EXTENSION__OWNED_ACTIVITY,
				ActivitiesFactory.eINSTANCE.createActivity()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature,
			Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify = childFeature == CallsPackage.Literals.CALLABLE__CONTAINED_PARAMETERS
				|| childFeature == ActivitiesPackage.Literals.OPERATION_EXTENSION__RETURN_VALUE;

		if (qualify) {
			return getString("_UI_CreateChild_text2", new Object[] {
					getTypeText(childObject), getFeatureText(childFeature),
					getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
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
