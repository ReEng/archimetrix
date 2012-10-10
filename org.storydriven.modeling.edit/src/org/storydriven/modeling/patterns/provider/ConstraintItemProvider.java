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
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.storydriven.modeling.activities.expressions.ExpressionsFactory;
import org.storydriven.modeling.patterns.Constraint;
import org.storydriven.modeling.patterns.PatternsPackage;
import org.storydriven.modeling.provider.SDMEditPlugin;

/**
 * This is the item provider adapter for a {@link org.storydriven.modeling.patterns.Constraint} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConstraintItemProvider extends ItemProviderAdapter implements
		IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
					.add(PatternsPackage.Literals.CONSTRAINT__CONSTRAINT_EXPRESSION);
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
	 * This returns Constraint.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object,
				getResourceLocator().getImage("full/obj16/Constraint"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Constraint_type");
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

		switch (notification.getFeatureID(Constraint.class)) {
		case PatternsPackage.CONSTRAINT__CONSTRAINT_EXPRESSION:
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
				PatternsPackage.Literals.CONSTRAINT__CONSTRAINT_EXPRESSION,
				ExpressionsFactory.eINSTANCE
						.createExceptionVariableExpression()));

		newChildDescriptors
				.add(createChildParameter(
						PatternsPackage.Literals.CONSTRAINT__CONSTRAINT_EXPRESSION,
						org.storydriven.modeling.expressions.ExpressionsFactory.eINSTANCE
								.createTextualExpression()));

		newChildDescriptors
				.add(createChildParameter(
						PatternsPackage.Literals.CONSTRAINT__CONSTRAINT_EXPRESSION,
						org.storydriven.modeling.expressions.ExpressionsFactory.eINSTANCE
								.createLiteralExpression()));

		newChildDescriptors
				.add(createChildParameter(
						PatternsPackage.Literals.CONSTRAINT__CONSTRAINT_EXPRESSION,
						org.storydriven.modeling.expressions.ExpressionsFactory.eINSTANCE
								.createNotExpression()));

		newChildDescriptors
				.add(createChildParameter(
						PatternsPackage.Literals.CONSTRAINT__CONSTRAINT_EXPRESSION,
						org.storydriven.modeling.expressions.ExpressionsFactory.eINSTANCE
								.createComparisonExpression()));

		newChildDescriptors
				.add(createChildParameter(
						PatternsPackage.Literals.CONSTRAINT__CONSTRAINT_EXPRESSION,
						org.storydriven.modeling.expressions.ExpressionsFactory.eINSTANCE
								.createArithmeticExpression()));

		newChildDescriptors
				.add(createChildParameter(
						PatternsPackage.Literals.CONSTRAINT__CONSTRAINT_EXPRESSION,
						org.storydriven.modeling.expressions.ExpressionsFactory.eINSTANCE
								.createBinaryLogicExpression()));

		newChildDescriptors
				.add(createChildParameter(
						PatternsPackage.Literals.CONSTRAINT__CONSTRAINT_EXPRESSION,
						org.storydriven.modeling.calls.expressions.ExpressionsFactory.eINSTANCE
								.createMethodCallExpression()));

		newChildDescriptors
				.add(createChildParameter(
						PatternsPackage.Literals.CONSTRAINT__CONSTRAINT_EXPRESSION,
						org.storydriven.modeling.calls.expressions.ExpressionsFactory.eINSTANCE
								.createParameterExpression()));

		newChildDescriptors
				.add(createChildParameter(
						PatternsPackage.Literals.CONSTRAINT__CONSTRAINT_EXPRESSION,
						org.storydriven.modeling.patterns.expressions.ExpressionsFactory.eINSTANCE
								.createAttributeValueExpression()));

		newChildDescriptors
				.add(createChildParameter(
						PatternsPackage.Literals.CONSTRAINT__CONSTRAINT_EXPRESSION,
						org.storydriven.modeling.patterns.expressions.ExpressionsFactory.eINSTANCE
								.createObjectVariableExpression()));

		newChildDescriptors
				.add(createChildParameter(
						PatternsPackage.Literals.CONSTRAINT__CONSTRAINT_EXPRESSION,
						org.storydriven.modeling.patterns.expressions.ExpressionsFactory.eINSTANCE
								.createObjectSetSizeExpression()));

		newChildDescriptors
				.add(createChildParameter(
						PatternsPackage.Literals.CONSTRAINT__CONSTRAINT_EXPRESSION,
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
