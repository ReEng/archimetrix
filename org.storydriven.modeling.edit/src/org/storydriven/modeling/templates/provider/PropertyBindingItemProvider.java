/**
 * <copyright> </copyright> $Id$
 */
package org.storydriven.modeling.templates.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.storydriven.modeling.activities.expressions.ExpressionsFactory;
import org.storydriven.modeling.provider.ExtendableElementItemProvider;
import org.storydriven.modeling.provider.SDMEditPlugin;
import org.storydriven.modeling.templates.PropertyBinding;
import org.storydriven.modeling.templates.TemplatesPackage;

/**
 * This is the item provider adapter for a {@link org.storydriven.modeling.templates.PropertyBinding} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PropertyBindingItemProvider extends ExtendableElementItemProvider
		implements IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyBindingItemProvider(AdapterFactory adapterFactory) {
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

			addBoundPropertyPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Bound Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBoundPropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_PropertyBinding_boundProperty_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_PropertyBinding_boundProperty_feature",
						"_UI_PropertyBinding_type"),
				TemplatesPackage.Literals.PROPERTY_BINDING__BOUND_PROPERTY,
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
					.add(TemplatesPackage.Literals.PROPERTY_BINDING__BINDING_EXPRESSION);
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
	 * This returns PropertyBinding.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object,
				getResourceLocator().getImage("full/obj16/PropertyBinding"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_PropertyBinding_type");
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

		switch (notification.getFeatureID(PropertyBinding.class)) {
		case TemplatesPackage.PROPERTY_BINDING__BINDING_EXPRESSION:
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
				TemplatesPackage.Literals.PROPERTY_BINDING__BINDING_EXPRESSION,
				ExpressionsFactory.eINSTANCE
						.createExceptionVariableExpression()));

		newChildDescriptors
				.add(createChildParameter(
						TemplatesPackage.Literals.PROPERTY_BINDING__BINDING_EXPRESSION,
						org.storydriven.modeling.expressions.ExpressionsFactory.eINSTANCE
								.createTextualExpression()));

		newChildDescriptors
				.add(createChildParameter(
						TemplatesPackage.Literals.PROPERTY_BINDING__BINDING_EXPRESSION,
						org.storydriven.modeling.expressions.ExpressionsFactory.eINSTANCE
								.createLiteralExpression()));

		newChildDescriptors
				.add(createChildParameter(
						TemplatesPackage.Literals.PROPERTY_BINDING__BINDING_EXPRESSION,
						org.storydriven.modeling.expressions.ExpressionsFactory.eINSTANCE
								.createNotExpression()));

		newChildDescriptors
				.add(createChildParameter(
						TemplatesPackage.Literals.PROPERTY_BINDING__BINDING_EXPRESSION,
						org.storydriven.modeling.expressions.ExpressionsFactory.eINSTANCE
								.createComparisonExpression()));

		newChildDescriptors
				.add(createChildParameter(
						TemplatesPackage.Literals.PROPERTY_BINDING__BINDING_EXPRESSION,
						org.storydriven.modeling.expressions.ExpressionsFactory.eINSTANCE
								.createArithmeticExpression()));

		newChildDescriptors
				.add(createChildParameter(
						TemplatesPackage.Literals.PROPERTY_BINDING__BINDING_EXPRESSION,
						org.storydriven.modeling.expressions.ExpressionsFactory.eINSTANCE
								.createBinaryLogicExpression()));

		newChildDescriptors
				.add(createChildParameter(
						TemplatesPackage.Literals.PROPERTY_BINDING__BINDING_EXPRESSION,
						org.storydriven.modeling.calls.expressions.ExpressionsFactory.eINSTANCE
								.createMethodCallExpression()));

		newChildDescriptors
				.add(createChildParameter(
						TemplatesPackage.Literals.PROPERTY_BINDING__BINDING_EXPRESSION,
						org.storydriven.modeling.calls.expressions.ExpressionsFactory.eINSTANCE
								.createParameterExpression()));

		newChildDescriptors
				.add(createChildParameter(
						TemplatesPackage.Literals.PROPERTY_BINDING__BINDING_EXPRESSION,
						org.storydriven.modeling.patterns.expressions.ExpressionsFactory.eINSTANCE
								.createAttributeValueExpression()));

		newChildDescriptors
				.add(createChildParameter(
						TemplatesPackage.Literals.PROPERTY_BINDING__BINDING_EXPRESSION,
						org.storydriven.modeling.patterns.expressions.ExpressionsFactory.eINSTANCE
								.createObjectVariableExpression()));

		newChildDescriptors
				.add(createChildParameter(
						TemplatesPackage.Literals.PROPERTY_BINDING__BINDING_EXPRESSION,
						org.storydriven.modeling.patterns.expressions.ExpressionsFactory.eINSTANCE
								.createObjectSetSizeExpression()));

		newChildDescriptors
				.add(createChildParameter(
						TemplatesPackage.Literals.PROPERTY_BINDING__BINDING_EXPRESSION,
						org.storydriven.modeling.patterns.expressions.ExpressionsFactory.eINSTANCE
								.createPrimitiveVariableExpression()));
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
