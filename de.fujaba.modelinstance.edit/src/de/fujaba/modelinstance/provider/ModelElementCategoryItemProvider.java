/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.fujaba.modelinstance.provider;


import de.fujaba.modelinstance.ModelElementCategory;
import de.fujaba.modelinstance.ModelinstancePackage;

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
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.storydriven.modeling.activities.ActivitiesFactory;

import org.storydriven.modeling.activities.expressions.ExpressionsFactory;

import org.storydriven.modeling.calls.CallsFactory;

import org.storydriven.modeling.patterns.PatternsFactory;

import org.storydriven.modeling.templates.TemplatesFactory;

/**
 * This is the item provider adapter for a {@link de.fujaba.modelinstance.ModelElementCategory} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelElementCategoryItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelElementCategoryItemProvider(AdapterFactory adapterFactory) {
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

			addKeyPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Key feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addKeyPropertyDescriptor(Object object) {
//		itemPropertyDescriptors.add
//			(createItemPropertyDescriptor
//				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
//				 getResourceLocator(),
//				 getString("_UI_ModelElementCategory_key_feature"),
//				 getString("_UI_PropertyDescriptor_description", "_UI_ModelElementCategory_key_feature", "_UI_ModelElementCategory_type"),
//				 ModelinstancePackage.Literals.MODEL_ELEMENT_CATEGORY__KEY,
//				 true,
//				 false,
//				 false,
//				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
//				 null,
//				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addNamePropertyDescriptor(Object object) {
//		itemPropertyDescriptors.add
//			(createItemPropertyDescriptor
//				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
//				 getResourceLocator(),
//				 getString("_UI_ModelElementCategory_name_feature"),
//				 getString("_UI_PropertyDescriptor_description", "_UI_ModelElementCategory_name_feature", "_UI_ModelElementCategory_type"),
//				 ModelinstancePackage.Literals.MODEL_ELEMENT_CATEGORY__NAME,
//				 true,
//				 false,
//				 false,
//				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
//				 null,
//				 null));
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
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ModelinstancePackage.Literals.MODEL_ELEMENT_CATEGORY__MODEL_ELEMENTS);
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
	 * This returns ModelElementCategory.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ModelElementCategory"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ModelElementCategory)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ModelElementCategory_type") :
			getString("_UI_ModelElementCategory_type") + " " + label;
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

		switch (notification.getFeatureID(ModelElementCategory.class)) {
			case ModelinstancePackage.MODEL_ELEMENT_CATEGORY__KEY:
			case ModelinstancePackage.MODEL_ELEMENT_CATEGORY__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ModelinstancePackage.MODEL_ELEMENT_CATEGORY__MODEL_ELEMENTS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(ModelinstancePackage.Literals.MODEL_ELEMENT_CATEGORY__MODEL_ELEMENTS,
				 ActivitiesFactory.eINSTANCE.createExceptionVariable()));

		newChildDescriptors.add
			(createChildParameter
				(ModelinstancePackage.Literals.MODEL_ELEMENT_CATEGORY__MODEL_ELEMENTS,
				 ActivitiesFactory.eINSTANCE.createActivityEdge()));

		newChildDescriptors.add
			(createChildParameter
				(ModelinstancePackage.Literals.MODEL_ELEMENT_CATEGORY__MODEL_ELEMENTS,
				 ActivitiesFactory.eINSTANCE.createActivity()));

		newChildDescriptors.add
			(createChildParameter
				(ModelinstancePackage.Literals.MODEL_ELEMENT_CATEGORY__MODEL_ELEMENTS,
				 ActivitiesFactory.eINSTANCE.createOperationExtension()));

		newChildDescriptors.add
			(createChildParameter
				(ModelinstancePackage.Literals.MODEL_ELEMENT_CATEGORY__MODEL_ELEMENTS,
				 ActivitiesFactory.eINSTANCE.createMatchingStoryNode()));

		newChildDescriptors.add
			(createChildParameter
				(ModelinstancePackage.Literals.MODEL_ELEMENT_CATEGORY__MODEL_ELEMENTS,
				 ActivitiesFactory.eINSTANCE.createStructuredNode()));

		newChildDescriptors.add
			(createChildParameter
				(ModelinstancePackage.Literals.MODEL_ELEMENT_CATEGORY__MODEL_ELEMENTS,
				 ActivitiesFactory.eINSTANCE.createJunctionNode()));

		newChildDescriptors.add
			(createChildParameter
				(ModelinstancePackage.Literals.MODEL_ELEMENT_CATEGORY__MODEL_ELEMENTS,
				 ActivitiesFactory.eINSTANCE.createStartNode()));

		newChildDescriptors.add
			(createChildParameter
				(ModelinstancePackage.Literals.MODEL_ELEMENT_CATEGORY__MODEL_ELEMENTS,
				 ActivitiesFactory.eINSTANCE.createStatementNode()));

		newChildDescriptors.add
			(createChildParameter
				(ModelinstancePackage.Literals.MODEL_ELEMENT_CATEGORY__MODEL_ELEMENTS,
				 ActivitiesFactory.eINSTANCE.createStopNode()));

		newChildDescriptors.add
			(createChildParameter
				(ModelinstancePackage.Literals.MODEL_ELEMENT_CATEGORY__MODEL_ELEMENTS,
				 ActivitiesFactory.eINSTANCE.createActivityCallNode()));

		newChildDescriptors.add
			(createChildParameter
				(ModelinstancePackage.Literals.MODEL_ELEMENT_CATEGORY__MODEL_ELEMENTS,
				 ActivitiesFactory.eINSTANCE.createModifyingStoryNode()));

		newChildDescriptors.add
			(createChildParameter
				(ModelinstancePackage.Literals.MODEL_ELEMENT_CATEGORY__MODEL_ELEMENTS,
				 ExpressionsFactory.eINSTANCE.createExceptionVariableExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ModelinstancePackage.Literals.MODEL_ELEMENT_CATEGORY__MODEL_ELEMENTS,
				 org.storydriven.modeling.expressions.ExpressionsFactory.eINSTANCE.createTextualExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ModelinstancePackage.Literals.MODEL_ELEMENT_CATEGORY__MODEL_ELEMENTS,
				 org.storydriven.modeling.expressions.ExpressionsFactory.eINSTANCE.createLiteralExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ModelinstancePackage.Literals.MODEL_ELEMENT_CATEGORY__MODEL_ELEMENTS,
				 org.storydriven.modeling.expressions.ExpressionsFactory.eINSTANCE.createNotExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ModelinstancePackage.Literals.MODEL_ELEMENT_CATEGORY__MODEL_ELEMENTS,
				 org.storydriven.modeling.expressions.ExpressionsFactory.eINSTANCE.createComparisonExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ModelinstancePackage.Literals.MODEL_ELEMENT_CATEGORY__MODEL_ELEMENTS,
				 org.storydriven.modeling.expressions.ExpressionsFactory.eINSTANCE.createArithmeticExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ModelinstancePackage.Literals.MODEL_ELEMENT_CATEGORY__MODEL_ELEMENTS,
				 org.storydriven.modeling.expressions.ExpressionsFactory.eINSTANCE.createBinaryLogicExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ModelinstancePackage.Literals.MODEL_ELEMENT_CATEGORY__MODEL_ELEMENTS,
				 CallsFactory.eINSTANCE.createParameterBinding()));

		newChildDescriptors.add
			(createChildParameter
				(ModelinstancePackage.Literals.MODEL_ELEMENT_CATEGORY__MODEL_ELEMENTS,
				 CallsFactory.eINSTANCE.createOpaqueCallable()));

		newChildDescriptors.add
			(createChildParameter
				(ModelinstancePackage.Literals.MODEL_ELEMENT_CATEGORY__MODEL_ELEMENTS,
				 CallsFactory.eINSTANCE.createParameterExtension()));

		newChildDescriptors.add
			(createChildParameter
				(ModelinstancePackage.Literals.MODEL_ELEMENT_CATEGORY__MODEL_ELEMENTS,
				 org.storydriven.modeling.calls.expressions.ExpressionsFactory.eINSTANCE.createMethodCallExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ModelinstancePackage.Literals.MODEL_ELEMENT_CATEGORY__MODEL_ELEMENTS,
				 org.storydriven.modeling.calls.expressions.ExpressionsFactory.eINSTANCE.createParameterExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ModelinstancePackage.Literals.MODEL_ELEMENT_CATEGORY__MODEL_ELEMENTS,
				 PatternsFactory.eINSTANCE.createObjectVariable()));

		newChildDescriptors.add
			(createChildParameter
				(ModelinstancePackage.Literals.MODEL_ELEMENT_CATEGORY__MODEL_ELEMENTS,
				 PatternsFactory.eINSTANCE.createLinkConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(ModelinstancePackage.Literals.MODEL_ELEMENT_CATEGORY__MODEL_ELEMENTS,
				 PatternsFactory.eINSTANCE.createObjectSetVariable()));

		newChildDescriptors.add
			(createChildParameter
				(ModelinstancePackage.Literals.MODEL_ELEMENT_CATEGORY__MODEL_ELEMENTS,
				 PatternsFactory.eINSTANCE.createPrimitiveVariable()));

		newChildDescriptors.add
			(createChildParameter
				(ModelinstancePackage.Literals.MODEL_ELEMENT_CATEGORY__MODEL_ELEMENTS,
				 PatternsFactory.eINSTANCE.createPath()));

		newChildDescriptors.add
			(createChildParameter
				(ModelinstancePackage.Literals.MODEL_ELEMENT_CATEGORY__MODEL_ELEMENTS,
				 PatternsFactory.eINSTANCE.createLinkVariable()));

		newChildDescriptors.add
			(createChildParameter
				(ModelinstancePackage.Literals.MODEL_ELEMENT_CATEGORY__MODEL_ELEMENTS,
				 PatternsFactory.eINSTANCE.createContainmentRelation()));

		newChildDescriptors.add
			(createChildParameter
				(ModelinstancePackage.Literals.MODEL_ELEMENT_CATEGORY__MODEL_ELEMENTS,
				 PatternsFactory.eINSTANCE.createStoryPattern()));

		newChildDescriptors.add
			(createChildParameter
				(ModelinstancePackage.Literals.MODEL_ELEMENT_CATEGORY__MODEL_ELEMENTS,
				 PatternsFactory.eINSTANCE.createMatchingPattern()));

		newChildDescriptors.add
			(createChildParameter
				(ModelinstancePackage.Literals.MODEL_ELEMENT_CATEGORY__MODEL_ELEMENTS,
				 PatternsFactory.eINSTANCE.createContainerVariable()));

		newChildDescriptors.add
			(createChildParameter
				(ModelinstancePackage.Literals.MODEL_ELEMENT_CATEGORY__MODEL_ELEMENTS,
				 org.storydriven.modeling.patterns.expressions.ExpressionsFactory.eINSTANCE.createAttributeValueExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ModelinstancePackage.Literals.MODEL_ELEMENT_CATEGORY__MODEL_ELEMENTS,
				 org.storydriven.modeling.patterns.expressions.ExpressionsFactory.eINSTANCE.createObjectVariableExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ModelinstancePackage.Literals.MODEL_ELEMENT_CATEGORY__MODEL_ELEMENTS,
				 org.storydriven.modeling.patterns.expressions.ExpressionsFactory.eINSTANCE.createObjectSetSizeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ModelinstancePackage.Literals.MODEL_ELEMENT_CATEGORY__MODEL_ELEMENTS,
				 org.storydriven.modeling.patterns.expressions.ExpressionsFactory.eINSTANCE.createPrimitiveVariableExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ModelinstancePackage.Literals.MODEL_ELEMENT_CATEGORY__MODEL_ELEMENTS,
				 TemplatesFactory.eINSTANCE.createTemplateBinding()));

		newChildDescriptors.add
			(createChildParameter
				(ModelinstancePackage.Literals.MODEL_ELEMENT_CATEGORY__MODEL_ELEMENTS,
				 TemplatesFactory.eINSTANCE.createPropertyBinding()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ModelinstanceEditPlugin.INSTANCE;
	}

}
