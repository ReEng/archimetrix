/**
 * <copyright> </copyright> $Id$
 */
package org.storydriven.modeling.patterns.provider;

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
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.storydriven.modeling.SDMPackage;
import org.storydriven.modeling.activities.expressions.ExpressionsFactory;
import org.storydriven.modeling.patterns.AbstractVariable;
import org.storydriven.modeling.patterns.PatternsFactory;
import org.storydriven.modeling.patterns.PatternsPackage;
import org.storydriven.modeling.provider.SDMEditPlugin;
import org.storydriven.modeling.provider.VariableItemProvider;

/**
 * This is the item provider adapter for a {@link org.storydriven.modeling.patterns.AbstractVariable} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AbstractVariableItemProvider extends VariableItemProvider
		implements IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractVariableItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addBindingStatePropertyDescriptor(object);
			addIncomingLinkPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_NamedElement_name_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_NamedElement_name_feature",
						"_UI_NamedElement_type"),
				SDMPackage.Literals.NAMED_ELEMENT__NAME, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
				getString("_UI_AbstractVariable_bindingState_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AbstractVariable_bindingState_feature",
						"_UI_AbstractVariable_type"),
				PatternsPackage.Literals.ABSTRACT_VARIABLE__BINDING_STATE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				null, null));
	}

	/**
	 * This adds a property descriptor for the Incoming Link feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIncomingLinkPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_AbstractVariable_incomingLink_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AbstractVariable_incomingLink_feature",
						"_UI_AbstractVariable_type"),
				PatternsPackage.Literals.ABSTRACT_VARIABLE__INCOMING_LINK,
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
					.add(PatternsPackage.Literals.ABSTRACT_VARIABLE__BINDING_EXPRESSION);
			childrenFeatures
					.add(PatternsPackage.Literals.ABSTRACT_VARIABLE__CONSTRAINT);
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((AbstractVariable) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_AbstractVariable_type")
				: getString("_UI_AbstractVariable_type") + " " + label;
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

		switch (notification.getFeatureID(AbstractVariable.class)) {
		case PatternsPackage.ABSTRACT_VARIABLE__NAME:
		case PatternsPackage.ABSTRACT_VARIABLE__BINDING_STATE:
			fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), false, true));
			return;
		case PatternsPackage.ABSTRACT_VARIABLE__BINDING_EXPRESSION:
		case PatternsPackage.ABSTRACT_VARIABLE__CONSTRAINT:
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
				PatternsPackage.Literals.ABSTRACT_VARIABLE__BINDING_EXPRESSION,
				ExpressionsFactory.eINSTANCE
						.createExceptionVariableExpression()));

		newChildDescriptors
				.add(createChildParameter(
						PatternsPackage.Literals.ABSTRACT_VARIABLE__BINDING_EXPRESSION,
						org.storydriven.modeling.expressions.ExpressionsFactory.eINSTANCE
								.createTextualExpression()));

		newChildDescriptors
				.add(createChildParameter(
						PatternsPackage.Literals.ABSTRACT_VARIABLE__BINDING_EXPRESSION,
						org.storydriven.modeling.expressions.ExpressionsFactory.eINSTANCE
								.createLiteralExpression()));

		newChildDescriptors
				.add(createChildParameter(
						PatternsPackage.Literals.ABSTRACT_VARIABLE__BINDING_EXPRESSION,
						org.storydriven.modeling.expressions.ExpressionsFactory.eINSTANCE
								.createNotExpression()));

		newChildDescriptors
				.add(createChildParameter(
						PatternsPackage.Literals.ABSTRACT_VARIABLE__BINDING_EXPRESSION,
						org.storydriven.modeling.expressions.ExpressionsFactory.eINSTANCE
								.createComparisonExpression()));

		newChildDescriptors
				.add(createChildParameter(
						PatternsPackage.Literals.ABSTRACT_VARIABLE__BINDING_EXPRESSION,
						org.storydriven.modeling.expressions.ExpressionsFactory.eINSTANCE
								.createArithmeticExpression()));

		newChildDescriptors
				.add(createChildParameter(
						PatternsPackage.Literals.ABSTRACT_VARIABLE__BINDING_EXPRESSION,
						org.storydriven.modeling.expressions.ExpressionsFactory.eINSTANCE
								.createBinaryLogicExpression()));

		newChildDescriptors
				.add(createChildParameter(
						PatternsPackage.Literals.ABSTRACT_VARIABLE__BINDING_EXPRESSION,
						org.storydriven.modeling.calls.expressions.ExpressionsFactory.eINSTANCE
								.createMethodCallExpression()));

		newChildDescriptors
				.add(createChildParameter(
						PatternsPackage.Literals.ABSTRACT_VARIABLE__BINDING_EXPRESSION,
						org.storydriven.modeling.calls.expressions.ExpressionsFactory.eINSTANCE
								.createParameterExpression()));

		newChildDescriptors
				.add(createChildParameter(
						PatternsPackage.Literals.ABSTRACT_VARIABLE__BINDING_EXPRESSION,
						org.storydriven.modeling.patterns.expressions.ExpressionsFactory.eINSTANCE
								.createAttributeValueExpression()));

		newChildDescriptors
				.add(createChildParameter(
						PatternsPackage.Literals.ABSTRACT_VARIABLE__BINDING_EXPRESSION,
						org.storydriven.modeling.patterns.expressions.ExpressionsFactory.eINSTANCE
								.createObjectVariableExpression()));

		newChildDescriptors
				.add(createChildParameter(
						PatternsPackage.Literals.ABSTRACT_VARIABLE__BINDING_EXPRESSION,
						org.storydriven.modeling.patterns.expressions.ExpressionsFactory.eINSTANCE
								.createObjectSetSizeExpression()));

		newChildDescriptors
				.add(createChildParameter(
						PatternsPackage.Literals.ABSTRACT_VARIABLE__BINDING_EXPRESSION,
						org.storydriven.modeling.patterns.expressions.ExpressionsFactory.eINSTANCE
								.createPrimitiveVariableExpression()));

		newChildDescriptors.add(createChildParameter(
				PatternsPackage.Literals.ABSTRACT_VARIABLE__CONSTRAINT,
				PatternsFactory.eINSTANCE.createConstraint()));
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
