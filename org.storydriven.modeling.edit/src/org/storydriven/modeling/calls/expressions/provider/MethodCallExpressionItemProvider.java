/**
 * <copyright> </copyright> $Id$
 */
package org.storydriven.modeling.calls.expressions.provider;

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
import org.storydriven.modeling.calls.CallsFactory;
import org.storydriven.modeling.calls.CallsPackage;
import org.storydriven.modeling.calls.expressions.ExpressionsFactory;
import org.storydriven.modeling.calls.expressions.ExpressionsPackage;
import org.storydriven.modeling.calls.expressions.MethodCallExpression;
import org.storydriven.modeling.expressions.provider.ExpressionItemProvider;
import org.storydriven.modeling.provider.SDMEditPlugin;

/**
 * This is the item provider adapter for a {@link org.storydriven.modeling.calls.expressions.MethodCallExpression} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MethodCallExpressionItemProvider extends ExpressionItemProvider
		implements IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodCallExpressionItemProvider(AdapterFactory adapterFactory) {
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

			addCalleePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Callee feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCalleePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_Invocation_callee_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_Invocation_callee_feature",
								"_UI_Invocation_type"),
						CallsPackage.Literals.INVOCATION__CALLEE, true, false,
						true, null, null, null));
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
					.add(CallsPackage.Literals.INVOCATION__OWNED_PARAMETER_BINDINGS);
			childrenFeatures
					.add(ExpressionsPackage.Literals.METHOD_CALL_EXPRESSION__TARGET);
			childrenFeatures
					.add(ExpressionsPackage.Literals.METHOD_CALL_EXPRESSION__OPAQUE_CALLABLE);
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
	 * This returns MethodCallExpression.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object,
				getResourceLocator()
						.getImage("full/obj16/MethodCallExpression"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((MethodCallExpression) object).getComment();
		return label == null || label.length() == 0 ? getString("_UI_MethodCallExpression_type")
				: getString("_UI_MethodCallExpression_type") + " " + label;
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

		switch (notification.getFeatureID(MethodCallExpression.class)) {
		case ExpressionsPackage.METHOD_CALL_EXPRESSION__OWNED_PARAMETER_BINDINGS:
		case ExpressionsPackage.METHOD_CALL_EXPRESSION__TARGET:
		case ExpressionsPackage.METHOD_CALL_EXPRESSION__OPAQUE_CALLABLE:
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
				CallsPackage.Literals.INVOCATION__OWNED_PARAMETER_BINDINGS,
				CallsFactory.eINSTANCE.createParameterBinding()));

		newChildDescriptors.add(createChildParameter(
				ExpressionsPackage.Literals.METHOD_CALL_EXPRESSION__TARGET,
				ExpressionsFactory.eINSTANCE.createMethodCallExpression()));

		newChildDescriptors.add(createChildParameter(
				ExpressionsPackage.Literals.METHOD_CALL_EXPRESSION__TARGET,
				ExpressionsFactory.eINSTANCE.createParameterExpression()));

		newChildDescriptors
				.add(createChildParameter(
						ExpressionsPackage.Literals.METHOD_CALL_EXPRESSION__TARGET,
						org.storydriven.modeling.activities.expressions.ExpressionsFactory.eINSTANCE
								.createExceptionVariableExpression()));

		newChildDescriptors
				.add(createChildParameter(
						ExpressionsPackage.Literals.METHOD_CALL_EXPRESSION__TARGET,
						org.storydriven.modeling.expressions.ExpressionsFactory.eINSTANCE
								.createTextualExpression()));

		newChildDescriptors
				.add(createChildParameter(
						ExpressionsPackage.Literals.METHOD_CALL_EXPRESSION__TARGET,
						org.storydriven.modeling.expressions.ExpressionsFactory.eINSTANCE
								.createLiteralExpression()));

		newChildDescriptors
				.add(createChildParameter(
						ExpressionsPackage.Literals.METHOD_CALL_EXPRESSION__TARGET,
						org.storydriven.modeling.expressions.ExpressionsFactory.eINSTANCE
								.createNotExpression()));

		newChildDescriptors
				.add(createChildParameter(
						ExpressionsPackage.Literals.METHOD_CALL_EXPRESSION__TARGET,
						org.storydriven.modeling.expressions.ExpressionsFactory.eINSTANCE
								.createComparisonExpression()));

		newChildDescriptors
				.add(createChildParameter(
						ExpressionsPackage.Literals.METHOD_CALL_EXPRESSION__TARGET,
						org.storydriven.modeling.expressions.ExpressionsFactory.eINSTANCE
								.createArithmeticExpression()));

		newChildDescriptors
				.add(createChildParameter(
						ExpressionsPackage.Literals.METHOD_CALL_EXPRESSION__TARGET,
						org.storydriven.modeling.expressions.ExpressionsFactory.eINSTANCE
								.createBinaryLogicExpression()));

		newChildDescriptors
				.add(createChildParameter(
						ExpressionsPackage.Literals.METHOD_CALL_EXPRESSION__TARGET,
						org.storydriven.modeling.patterns.expressions.ExpressionsFactory.eINSTANCE
								.createAttributeValueExpression()));

		newChildDescriptors
				.add(createChildParameter(
						ExpressionsPackage.Literals.METHOD_CALL_EXPRESSION__TARGET,
						org.storydriven.modeling.patterns.expressions.ExpressionsFactory.eINSTANCE
								.createObjectVariableExpression()));

		newChildDescriptors
				.add(createChildParameter(
						ExpressionsPackage.Literals.METHOD_CALL_EXPRESSION__TARGET,
						org.storydriven.modeling.patterns.expressions.ExpressionsFactory.eINSTANCE
								.createObjectSetSizeExpression()));

		newChildDescriptors
				.add(createChildParameter(
						ExpressionsPackage.Literals.METHOD_CALL_EXPRESSION__TARGET,
						org.storydriven.modeling.patterns.expressions.ExpressionsFactory.eINSTANCE
								.createPrimitiveVariableExpression()));

		newChildDescriptors
				.add(createChildParameter(
						ExpressionsPackage.Literals.METHOD_CALL_EXPRESSION__OPAQUE_CALLABLE,
						CallsFactory.eINSTANCE.createOpaqueCallable()));
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
