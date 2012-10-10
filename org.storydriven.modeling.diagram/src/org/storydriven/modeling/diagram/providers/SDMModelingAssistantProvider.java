package org.storydriven.modeling.diagram.providers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.modelingassistant.ModelingAssistantProvider;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.storydriven.modeling.diagram.edit.parts.ActivityEditPart;
import org.storydriven.modeling.diagram.edit.parts.JunctionNode2EditPart;
import org.storydriven.modeling.diagram.edit.parts.JunctionNodeEditPart;
import org.storydriven.modeling.diagram.edit.parts.ModifyingStoryNode2EditPart;
import org.storydriven.modeling.diagram.edit.parts.ModifyingStoryNodeEditPart;
import org.storydriven.modeling.diagram.edit.parts.ModifyingStoryNodeModifyingStoryNodeContentCompartment2EditPart;
import org.storydriven.modeling.diagram.edit.parts.ModifyingStoryNodeModifyingStoryNodeContentCompartmentEditPart;
import org.storydriven.modeling.diagram.edit.parts.ObjectVariableEditPart;
import org.storydriven.modeling.diagram.edit.parts.PrimitiveVariableEditPart;
import org.storydriven.modeling.diagram.edit.parts.StartNode2EditPart;
import org.storydriven.modeling.diagram.edit.parts.StartNodeEditPart;
import org.storydriven.modeling.diagram.edit.parts.StatementNode2EditPart;
import org.storydriven.modeling.diagram.edit.parts.StatementNodeEditPart;
import org.storydriven.modeling.diagram.edit.parts.StopNode2EditPart;
import org.storydriven.modeling.diagram.edit.parts.StopNodeEditPart;
import org.storydriven.modeling.diagram.edit.parts.StoryPatternStoryPatternCompartementEditPart;
import org.storydriven.modeling.diagram.edit.parts.StructuredNode2EditPart;
import org.storydriven.modeling.diagram.edit.parts.StructuredNodeEditPart;
import org.storydriven.modeling.diagram.edit.parts.StructuredNodeStructuredNodeCompartment2EditPart;
import org.storydriven.modeling.diagram.edit.parts.StructuredNodeStructuredNodeCompartmentEditPart;
import org.storydriven.modeling.diagram.part.Messages;
import org.storydriven.modeling.diagram.part.SDMDiagramEditorPlugin;

/**
 * @generated
 */
public class SDMModelingAssistantProvider extends ModelingAssistantProvider {

	/**
	 * @generated
	 */
	public List getTypesForPopupBar(IAdaptable host) {
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart instanceof ActivityEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(6);
			types.add(SDMElementTypes.StartNode_2001);
			types.add(SDMElementTypes.StopNode_2002);
			types.add(SDMElementTypes.JunctionNode_2003);
			types.add(SDMElementTypes.StatementNode_2004);
			types.add(SDMElementTypes.StructuredNode_2005);
			types.add(SDMElementTypes.ModifyingStoryNode_2007);
			return types;
		}
		if (editPart instanceof StatementNodeEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(SDMElementTypes.TextualExpression_3015);
			return types;
		}
		if (editPart instanceof StatementNode2EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(SDMElementTypes.TextualExpression_3015);
			return types;
		}
		if (editPart instanceof ObjectVariableEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(SDMElementTypes.AttributeAssignment_3013);
			return types;
		}
		if (editPart instanceof StructuredNodeStructuredNodeCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(6);
			types.add(SDMElementTypes.JunctionNode_3001);
			types.add(SDMElementTypes.StartNode_3002);
			types.add(SDMElementTypes.StopNode_3004);
			types.add(SDMElementTypes.StatementNode_3003);
			types.add(SDMElementTypes.StructuredNode_3005);
			types.add(SDMElementTypes.ModifyingStoryNode_3011);
			return types;
		}
		if (editPart instanceof StructuredNodeStructuredNodeCompartment2EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(6);
			types.add(SDMElementTypes.JunctionNode_3001);
			types.add(SDMElementTypes.StartNode_3002);
			types.add(SDMElementTypes.StopNode_3004);
			types.add(SDMElementTypes.StatementNode_3003);
			types.add(SDMElementTypes.StructuredNode_3005);
			types.add(SDMElementTypes.ModifyingStoryNode_3011);
			return types;
		}
		if (editPart instanceof ModifyingStoryNodeModifyingStoryNodeContentCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(SDMElementTypes.StoryPattern_3008);
			return types;
		}
		if (editPart instanceof StoryPatternStoryPatternCompartementEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(SDMElementTypes.ObjectVariable_3012);
			types.add(SDMElementTypes.PrimitiveVariable_3014);
			return types;
		}
		if (editPart instanceof ModifyingStoryNodeModifyingStoryNodeContentCompartment2EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(SDMElementTypes.StoryPattern_3008);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof StartNodeEditPart) {
			return ((StartNodeEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof StopNodeEditPart) {
			return ((StopNodeEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof JunctionNodeEditPart) {
			return ((JunctionNodeEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof StatementNodeEditPart) {
			return ((StatementNodeEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof StructuredNodeEditPart) {
			return ((StructuredNodeEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ModifyingStoryNodeEditPart) {
			return ((ModifyingStoryNodeEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof JunctionNode2EditPart) {
			return ((JunctionNode2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof StartNode2EditPart) {
			return ((StartNode2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof StopNode2EditPart) {
			return ((StopNode2EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof StatementNode2EditPart) {
			return ((StatementNode2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof StructuredNode2EditPart) {
			return ((StructuredNode2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ModifyingStoryNode2EditPart) {
			return ((ModifyingStoryNode2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ObjectVariableEditPart) {
			return ((ObjectVariableEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof StartNodeEditPart) {
			return ((StartNodeEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof StopNodeEditPart) {
			return ((StopNodeEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof JunctionNodeEditPart) {
			return ((JunctionNodeEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof StatementNodeEditPart) {
			return ((StatementNodeEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof StructuredNodeEditPart) {
			return ((StructuredNodeEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ModifyingStoryNodeEditPart) {
			return ((ModifyingStoryNodeEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof JunctionNode2EditPart) {
			return ((JunctionNode2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof StartNode2EditPart) {
			return ((StartNode2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof StopNode2EditPart) {
			return ((StopNode2EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof StatementNode2EditPart) {
			return ((StatementNode2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof StructuredNode2EditPart) {
			return ((StructuredNode2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ModifyingStoryNode2EditPart) {
			return ((ModifyingStoryNode2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ObjectVariableEditPart) {
			return ((ObjectVariableEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof PrimitiveVariableEditPart) {
			return ((PrimitiveVariableEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof StartNodeEditPart) {
			return ((StartNodeEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof StopNodeEditPart) {
			return ((StopNodeEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof JunctionNodeEditPart) {
			return ((JunctionNodeEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof StatementNodeEditPart) {
			return ((StatementNodeEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof StructuredNodeEditPart) {
			return ((StructuredNodeEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ModifyingStoryNodeEditPart) {
			return ((ModifyingStoryNodeEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof JunctionNode2EditPart) {
			return ((JunctionNode2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof StartNode2EditPart) {
			return ((StartNode2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof StopNode2EditPart) {
			return ((StopNode2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof StatementNode2EditPart) {
			return ((StatementNode2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof StructuredNode2EditPart) {
			return ((StructuredNode2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ModifyingStoryNode2EditPart) {
			return ((ModifyingStoryNode2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ObjectVariableEditPart) {
			return ((ObjectVariableEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof StartNodeEditPart) {
			return ((StartNodeEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof StopNodeEditPart) {
			return ((StopNodeEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof JunctionNodeEditPart) {
			return ((JunctionNodeEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof StatementNodeEditPart) {
			return ((StatementNodeEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof StructuredNodeEditPart) {
			return ((StructuredNodeEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ModifyingStoryNodeEditPart) {
			return ((ModifyingStoryNodeEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof JunctionNode2EditPart) {
			return ((JunctionNode2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof StartNode2EditPart) {
			return ((StartNode2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof StopNode2EditPart) {
			return ((StopNode2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof StatementNode2EditPart) {
			return ((StatementNode2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof StructuredNode2EditPart) {
			return ((StructuredNode2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ModifyingStoryNode2EditPart) {
			return ((ModifyingStoryNode2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ObjectVariableEditPart) {
			return ((ObjectVariableEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof PrimitiveVariableEditPart) {
			return ((PrimitiveVariableEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof StartNodeEditPart) {
			return ((StartNodeEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof StopNodeEditPart) {
			return ((StopNodeEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof JunctionNodeEditPart) {
			return ((JunctionNodeEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof StatementNodeEditPart) {
			return ((StatementNodeEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof StructuredNodeEditPart) {
			return ((StructuredNodeEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ModifyingStoryNodeEditPart) {
			return ((ModifyingStoryNodeEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof JunctionNode2EditPart) {
			return ((JunctionNode2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof StartNode2EditPart) {
			return ((StartNode2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof StopNode2EditPart) {
			return ((StopNode2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof StatementNode2EditPart) {
			return ((StatementNode2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof StructuredNode2EditPart) {
			return ((StructuredNode2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ModifyingStoryNode2EditPart) {
			return ((ModifyingStoryNode2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ObjectVariableEditPart) {
			return ((ObjectVariableEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForSource(IAdaptable target,
			IElementType relationshipType) {
		return selectExistingElement(target,
				getTypesForSource(target, relationshipType));
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForTarget(IAdaptable source,
			IElementType relationshipType) {
		return selectExistingElement(source,
				getTypesForTarget(source, relationshipType));
	}

	/**
	 * @generated
	 */
	protected EObject selectExistingElement(IAdaptable host, Collection types) {
		if (types.isEmpty()) {
			return null;
		}
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart == null) {
			return null;
		}
		Diagram diagram = (Diagram) editPart.getRoot().getContents().getModel();
		HashSet<EObject> elements = new HashSet<EObject>();
		for (Iterator<EObject> it = diagram.getElement().eAllContents(); it
				.hasNext();) {
			EObject element = it.next();
			if (isApplicableElement(element, types)) {
				elements.add(element);
			}
		}
		if (elements.isEmpty()) {
			return null;
		}
		return selectElement((EObject[]) elements.toArray(new EObject[elements
				.size()]));
	}

	/**
	 * @generated
	 */
	protected boolean isApplicableElement(EObject element, Collection types) {
		IElementType type = ElementTypeRegistry.getInstance().getElementType(
				element);
		return types.contains(type);
	}

	/**
	 * @generated
	 */
	protected EObject selectElement(EObject[] elements) {
		Shell shell = Display.getCurrent().getActiveShell();
		ILabelProvider labelProvider = new AdapterFactoryLabelProvider(
				SDMDiagramEditorPlugin.getInstance()
						.getItemProvidersAdapterFactory());
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(
				shell, labelProvider);
		dialog.setMessage(Messages.SDMModelingAssistantProviderMessage);
		dialog.setTitle(Messages.SDMModelingAssistantProviderTitle);
		dialog.setMultipleSelection(false);
		dialog.setElements(elements);
		EObject selected = null;
		if (dialog.open() == Window.OK) {
			selected = (EObject) dialog.getFirstResult();
		}
		return selected;
	}
}
