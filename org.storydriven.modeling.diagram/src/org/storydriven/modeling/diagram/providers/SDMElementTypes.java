package org.storydriven.modeling.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;
import org.storydriven.modeling.activities.ActivitiesPackage;
import org.storydriven.modeling.diagram.edit.parts.ActivityEdgeEditPart;
import org.storydriven.modeling.diagram.edit.parts.ActivityEditPart;
import org.storydriven.modeling.diagram.edit.parts.AttributeAssignmentEditPart;
import org.storydriven.modeling.diagram.edit.parts.JunctionNode2EditPart;
import org.storydriven.modeling.diagram.edit.parts.JunctionNodeEditPart;
import org.storydriven.modeling.diagram.edit.parts.LinkVariableEditPart;
import org.storydriven.modeling.diagram.edit.parts.ModifyingStoryNode2EditPart;
import org.storydriven.modeling.diagram.edit.parts.ModifyingStoryNodeEditPart;
import org.storydriven.modeling.diagram.edit.parts.ObjectVariableEditPart;
import org.storydriven.modeling.diagram.edit.parts.PrimitiveVariableEditPart;
import org.storydriven.modeling.diagram.edit.parts.StartNode2EditPart;
import org.storydriven.modeling.diagram.edit.parts.StartNodeEditPart;
import org.storydriven.modeling.diagram.edit.parts.StatementNode2EditPart;
import org.storydriven.modeling.diagram.edit.parts.StatementNodeEditPart;
import org.storydriven.modeling.diagram.edit.parts.StopNode2EditPart;
import org.storydriven.modeling.diagram.edit.parts.StopNodeEditPart;
import org.storydriven.modeling.diagram.edit.parts.StoryPatternEditPart;
import org.storydriven.modeling.diagram.edit.parts.StructuredNode2EditPart;
import org.storydriven.modeling.diagram.edit.parts.StructuredNodeEditPart;
import org.storydriven.modeling.diagram.edit.parts.TextualExpressionEditPart;
import org.storydriven.modeling.diagram.part.SDMDiagramEditorPlugin;
import org.storydriven.modeling.expressions.ExpressionsPackage;
import org.storydriven.modeling.patterns.PatternsPackage;

/**
 * @generated
 */
public class SDMElementTypes {

	/**
	 * @generated
	 */
	private SDMElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType Activity_1000 = getElementType("org.storydriven.modeling.diagram.Activity_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType StartNode_2001 = getElementType("org.storydriven.modeling.diagram.StartNode_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType StopNode_2002 = getElementType("org.storydriven.modeling.diagram.StopNode_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType JunctionNode_2003 = getElementType("org.storydriven.modeling.diagram.JunctionNode_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType StatementNode_2004 = getElementType("org.storydriven.modeling.diagram.StatementNode_2004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType StructuredNode_2005 = getElementType("org.storydriven.modeling.diagram.StructuredNode_2005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ModifyingStoryNode_2007 = getElementType("org.storydriven.modeling.diagram.ModifyingStoryNode_2007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType TextualExpression_3015 = getElementType("org.storydriven.modeling.diagram.TextualExpression_3015"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType JunctionNode_3001 = getElementType("org.storydriven.modeling.diagram.JunctionNode_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType StartNode_3002 = getElementType("org.storydriven.modeling.diagram.StartNode_3002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType StopNode_3004 = getElementType("org.storydriven.modeling.diagram.StopNode_3004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType StatementNode_3003 = getElementType("org.storydriven.modeling.diagram.StatementNode_3003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType StructuredNode_3005 = getElementType("org.storydriven.modeling.diagram.StructuredNode_3005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ModifyingStoryNode_3011 = getElementType("org.storydriven.modeling.diagram.ModifyingStoryNode_3011"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType StoryPattern_3008 = getElementType("org.storydriven.modeling.diagram.StoryPattern_3008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ObjectVariable_3012 = getElementType("org.storydriven.modeling.diagram.ObjectVariable_3012"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AttributeAssignment_3013 = getElementType("org.storydriven.modeling.diagram.AttributeAssignment_3013"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType PrimitiveVariable_3014 = getElementType("org.storydriven.modeling.diagram.PrimitiveVariable_3014"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ActivityEdge_4001 = getElementType("org.storydriven.modeling.diagram.ActivityEdge_4001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType LinkVariable_4002 = getElementType("org.storydriven.modeling.diagram.LinkVariable_4002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return SDMDiagramEditorPlugin.getInstance()
						.getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(Activity_1000,
					ActivitiesPackage.eINSTANCE.getActivity());

			elements.put(StartNode_2001,
					ActivitiesPackage.eINSTANCE.getStartNode());

			elements.put(StopNode_2002,
					ActivitiesPackage.eINSTANCE.getStopNode());

			elements.put(JunctionNode_2003,
					ActivitiesPackage.eINSTANCE.getJunctionNode());

			elements.put(StatementNode_2004,
					ActivitiesPackage.eINSTANCE.getStatementNode());

			elements.put(StructuredNode_2005,
					ActivitiesPackage.eINSTANCE.getStructuredNode());

			elements.put(ModifyingStoryNode_2007,
					ActivitiesPackage.eINSTANCE.getModifyingStoryNode());

			elements.put(TextualExpression_3015,
					ExpressionsPackage.eINSTANCE.getTextualExpression());

			elements.put(JunctionNode_3001,
					ActivitiesPackage.eINSTANCE.getJunctionNode());

			elements.put(StartNode_3002,
					ActivitiesPackage.eINSTANCE.getStartNode());

			elements.put(StopNode_3004,
					ActivitiesPackage.eINSTANCE.getStopNode());

			elements.put(StatementNode_3003,
					ActivitiesPackage.eINSTANCE.getStatementNode());

			elements.put(StructuredNode_3005,
					ActivitiesPackage.eINSTANCE.getStructuredNode());

			elements.put(ModifyingStoryNode_3011,
					ActivitiesPackage.eINSTANCE.getModifyingStoryNode());

			elements.put(StoryPattern_3008,
					PatternsPackage.eINSTANCE.getStoryPattern());

			elements.put(ObjectVariable_3012,
					PatternsPackage.eINSTANCE.getObjectVariable());

			elements.put(AttributeAssignment_3013,
					PatternsPackage.eINSTANCE.getAttributeAssignment());

			elements.put(PrimitiveVariable_3014,
					PatternsPackage.eINSTANCE.getPrimitiveVariable());

			elements.put(ActivityEdge_4001,
					ActivitiesPackage.eINSTANCE.getActivityEdge());

			elements.put(LinkVariable_4002,
					PatternsPackage.eINSTANCE.getLinkVariable());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Activity_1000);
			KNOWN_ELEMENT_TYPES.add(StartNode_2001);
			KNOWN_ELEMENT_TYPES.add(StopNode_2002);
			KNOWN_ELEMENT_TYPES.add(JunctionNode_2003);
			KNOWN_ELEMENT_TYPES.add(StatementNode_2004);
			KNOWN_ELEMENT_TYPES.add(StructuredNode_2005);
			KNOWN_ELEMENT_TYPES.add(ModifyingStoryNode_2007);
			KNOWN_ELEMENT_TYPES.add(TextualExpression_3015);
			KNOWN_ELEMENT_TYPES.add(JunctionNode_3001);
			KNOWN_ELEMENT_TYPES.add(StartNode_3002);
			KNOWN_ELEMENT_TYPES.add(StopNode_3004);
			KNOWN_ELEMENT_TYPES.add(StatementNode_3003);
			KNOWN_ELEMENT_TYPES.add(StructuredNode_3005);
			KNOWN_ELEMENT_TYPES.add(ModifyingStoryNode_3011);
			KNOWN_ELEMENT_TYPES.add(StoryPattern_3008);
			KNOWN_ELEMENT_TYPES.add(ObjectVariable_3012);
			KNOWN_ELEMENT_TYPES.add(AttributeAssignment_3013);
			KNOWN_ELEMENT_TYPES.add(PrimitiveVariable_3014);
			KNOWN_ELEMENT_TYPES.add(ActivityEdge_4001);
			KNOWN_ELEMENT_TYPES.add(LinkVariable_4002);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case ActivityEditPart.VISUAL_ID:
			return Activity_1000;
		case StartNodeEditPart.VISUAL_ID:
			return StartNode_2001;
		case StopNodeEditPart.VISUAL_ID:
			return StopNode_2002;
		case JunctionNodeEditPart.VISUAL_ID:
			return JunctionNode_2003;
		case StatementNodeEditPart.VISUAL_ID:
			return StatementNode_2004;
		case StructuredNodeEditPart.VISUAL_ID:
			return StructuredNode_2005;
		case ModifyingStoryNodeEditPart.VISUAL_ID:
			return ModifyingStoryNode_2007;
		case TextualExpressionEditPart.VISUAL_ID:
			return TextualExpression_3015;
		case JunctionNode2EditPart.VISUAL_ID:
			return JunctionNode_3001;
		case StartNode2EditPart.VISUAL_ID:
			return StartNode_3002;
		case StopNode2EditPart.VISUAL_ID:
			return StopNode_3004;
		case StatementNode2EditPart.VISUAL_ID:
			return StatementNode_3003;
		case StructuredNode2EditPart.VISUAL_ID:
			return StructuredNode_3005;
		case ModifyingStoryNode2EditPart.VISUAL_ID:
			return ModifyingStoryNode_3011;
		case StoryPatternEditPart.VISUAL_ID:
			return StoryPattern_3008;
		case ObjectVariableEditPart.VISUAL_ID:
			return ObjectVariable_3012;
		case AttributeAssignmentEditPart.VISUAL_ID:
			return AttributeAssignment_3013;
		case PrimitiveVariableEditPart.VISUAL_ID:
			return PrimitiveVariable_3014;
		case ActivityEdgeEditPart.VISUAL_ID:
			return ActivityEdge_4001;
		case LinkVariableEditPart.VISUAL_ID:
			return LinkVariable_4002;
		}
		return null;
	}

}
