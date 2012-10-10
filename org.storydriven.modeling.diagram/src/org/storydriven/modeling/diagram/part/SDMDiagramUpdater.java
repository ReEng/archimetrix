package org.storydriven.modeling.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.storydriven.modeling.activities.ActivitiesPackage;
import org.storydriven.modeling.activities.Activity;
import org.storydriven.modeling.activities.ActivityEdge;
import org.storydriven.modeling.activities.ActivityNode;
import org.storydriven.modeling.activities.JunctionNode;
import org.storydriven.modeling.activities.ModifyingStoryNode;
import org.storydriven.modeling.activities.StartNode;
import org.storydriven.modeling.activities.StatementNode;
import org.storydriven.modeling.activities.StopNode;
import org.storydriven.modeling.activities.StructuredNode;
import org.storydriven.modeling.diagram.edit.parts.ActivityEdgeEditPart;
import org.storydriven.modeling.diagram.edit.parts.ActivityEditPart;
import org.storydriven.modeling.diagram.edit.parts.AttributeAssignmentEditPart;
import org.storydriven.modeling.diagram.edit.parts.JunctionNode2EditPart;
import org.storydriven.modeling.diagram.edit.parts.JunctionNodeEditPart;
import org.storydriven.modeling.diagram.edit.parts.LinkVariableEditPart;
import org.storydriven.modeling.diagram.edit.parts.ModifyingStoryNode2EditPart;
import org.storydriven.modeling.diagram.edit.parts.ModifyingStoryNodeEditPart;
import org.storydriven.modeling.diagram.edit.parts.ModifyingStoryNodeModifyingStoryNodeContentCompartment2EditPart;
import org.storydriven.modeling.diagram.edit.parts.ModifyingStoryNodeModifyingStoryNodeContentCompartmentEditPart;
import org.storydriven.modeling.diagram.edit.parts.ObjectVariableEditPart;
import org.storydriven.modeling.diagram.edit.parts.ObjectVariableObjectVariableAttributeAsignmentsCompartmentEditPart;
import org.storydriven.modeling.diagram.edit.parts.PrimitiveVariableEditPart;
import org.storydriven.modeling.diagram.edit.parts.StartNode2EditPart;
import org.storydriven.modeling.diagram.edit.parts.StartNodeEditPart;
import org.storydriven.modeling.diagram.edit.parts.StatementNode2EditPart;
import org.storydriven.modeling.diagram.edit.parts.StatementNodeEditPart;
import org.storydriven.modeling.diagram.edit.parts.StatementNodeStatementNodeCompartment2EditPart;
import org.storydriven.modeling.diagram.edit.parts.StatementNodeStatementNodeCompartmentEditPart;
import org.storydriven.modeling.diagram.edit.parts.StopNode2EditPart;
import org.storydriven.modeling.diagram.edit.parts.StopNodeEditPart;
import org.storydriven.modeling.diagram.edit.parts.StoryPatternEditPart;
import org.storydriven.modeling.diagram.edit.parts.StoryPatternStoryPatternCompartementEditPart;
import org.storydriven.modeling.diagram.edit.parts.StructuredNode2EditPart;
import org.storydriven.modeling.diagram.edit.parts.StructuredNodeEditPart;
import org.storydriven.modeling.diagram.edit.parts.StructuredNodeStructuredNodeCompartment2EditPart;
import org.storydriven.modeling.diagram.edit.parts.StructuredNodeStructuredNodeCompartmentEditPart;
import org.storydriven.modeling.diagram.edit.parts.TextualExpressionEditPart;
import org.storydriven.modeling.diagram.providers.SDMElementTypes;
import org.storydriven.modeling.expressions.Expression;
import org.storydriven.modeling.patterns.AbstractVariable;
import org.storydriven.modeling.patterns.AttributeAssignment;
import org.storydriven.modeling.patterns.LinkVariable;
import org.storydriven.modeling.patterns.ObjectVariable;
import org.storydriven.modeling.patterns.PatternsPackage;
import org.storydriven.modeling.patterns.PrimitiveVariable;
import org.storydriven.modeling.patterns.StoryPattern;

/**
 * @generated
 */
public class SDMDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<SDMNodeDescriptor> getSemanticChildren(View view) {
		switch (SDMVisualIDRegistry.getVisualID(view)) {
		case ActivityEditPart.VISUAL_ID:
			return getActivity_1000SemanticChildren(view);
		case StatementNodeStatementNodeCompartmentEditPart.VISUAL_ID:
			return getStatementNodeStatementNodeCompartment_7016SemanticChildren(view);
		case StructuredNodeStructuredNodeCompartmentEditPart.VISUAL_ID:
			return getStructuredNodeStructuredNodeCompartment_7001SemanticChildren(view);
		case StatementNodeStatementNodeCompartment2EditPart.VISUAL_ID:
			return getStatementNodeStatementNodeCompartment_7017SemanticChildren(view);
		case StructuredNodeStructuredNodeCompartment2EditPart.VISUAL_ID:
			return getStructuredNodeStructuredNodeCompartment_7002SemanticChildren(view);
		case ModifyingStoryNodeModifyingStoryNodeContentCompartmentEditPart.VISUAL_ID:
			return getModifyingStoryNodeModifyingStoryNodeContentCompartment_7012SemanticChildren(view);
		case StoryPatternStoryPatternCompartementEditPart.VISUAL_ID:
			return getStoryPatternStoryPatternCompartement_7008SemanticChildren(view);
		case ObjectVariableObjectVariableAttributeAsignmentsCompartmentEditPart.VISUAL_ID:
			return getObjectVariableObjectVariableAttributeAssignmentsCompartment_7014SemanticChildren(view);
		case ModifyingStoryNodeModifyingStoryNodeContentCompartment2EditPart.VISUAL_ID:
			return getModifyingStoryNodeModifyingStoryNodeContentCompartment_7007SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SDMNodeDescriptor> getActivity_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Activity modelElement = (Activity) view.getElement();
		LinkedList<SDMNodeDescriptor> result = new LinkedList<SDMNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOwnedActivityNodes().iterator(); it
				.hasNext();) {
			ActivityNode childElement = (ActivityNode) it.next();
			int visualID = SDMVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == StartNodeEditPart.VISUAL_ID) {
				result.add(new SDMNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == StopNodeEditPart.VISUAL_ID) {
				result.add(new SDMNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == JunctionNodeEditPart.VISUAL_ID) {
				result.add(new SDMNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == StatementNodeEditPart.VISUAL_ID) {
				result.add(new SDMNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == StructuredNodeEditPart.VISUAL_ID) {
				result.add(new SDMNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ModifyingStoryNodeEditPart.VISUAL_ID) {
				result.add(new SDMNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SDMNodeDescriptor> getStatementNodeStatementNodeCompartment_7016SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		StatementNode modelElement = (StatementNode) containerView.getElement();
		LinkedList<SDMNodeDescriptor> result = new LinkedList<SDMNodeDescriptor>();
		{
			Expression childElement = modelElement.getStatementExpression();
			int visualID = SDMVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TextualExpressionEditPart.VISUAL_ID) {
				result.add(new SDMNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SDMNodeDescriptor> getStructuredNodeStructuredNodeCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		StructuredNode modelElement = (StructuredNode) containerView
				.getElement();
		LinkedList<SDMNodeDescriptor> result = new LinkedList<SDMNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOwnedActivityNodes().iterator(); it
				.hasNext();) {
			ActivityNode childElement = (ActivityNode) it.next();
			int visualID = SDMVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == JunctionNode2EditPart.VISUAL_ID) {
				result.add(new SDMNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == StartNode2EditPart.VISUAL_ID) {
				result.add(new SDMNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == StopNode2EditPart.VISUAL_ID) {
				result.add(new SDMNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == StatementNode2EditPart.VISUAL_ID) {
				result.add(new SDMNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == StructuredNode2EditPart.VISUAL_ID) {
				result.add(new SDMNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ModifyingStoryNode2EditPart.VISUAL_ID) {
				result.add(new SDMNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SDMNodeDescriptor> getStatementNodeStatementNodeCompartment_7017SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		StatementNode modelElement = (StatementNode) containerView.getElement();
		LinkedList<SDMNodeDescriptor> result = new LinkedList<SDMNodeDescriptor>();
		{
			Expression childElement = modelElement.getStatementExpression();
			int visualID = SDMVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TextualExpressionEditPart.VISUAL_ID) {
				result.add(new SDMNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SDMNodeDescriptor> getStructuredNodeStructuredNodeCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		StructuredNode modelElement = (StructuredNode) containerView
				.getElement();
		LinkedList<SDMNodeDescriptor> result = new LinkedList<SDMNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOwnedActivityNodes().iterator(); it
				.hasNext();) {
			ActivityNode childElement = (ActivityNode) it.next();
			int visualID = SDMVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == JunctionNode2EditPart.VISUAL_ID) {
				result.add(new SDMNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == StartNode2EditPart.VISUAL_ID) {
				result.add(new SDMNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == StopNode2EditPart.VISUAL_ID) {
				result.add(new SDMNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == StatementNode2EditPart.VISUAL_ID) {
				result.add(new SDMNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == StructuredNode2EditPart.VISUAL_ID) {
				result.add(new SDMNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ModifyingStoryNode2EditPart.VISUAL_ID) {
				result.add(new SDMNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SDMNodeDescriptor> getModifyingStoryNodeModifyingStoryNodeContentCompartment_7012SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ModifyingStoryNode modelElement = (ModifyingStoryNode) containerView
				.getElement();
		LinkedList<SDMNodeDescriptor> result = new LinkedList<SDMNodeDescriptor>();
		{
			StoryPattern childElement = modelElement.getOwnedRule();
			int visualID = SDMVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == StoryPatternEditPart.VISUAL_ID) {
				result.add(new SDMNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SDMNodeDescriptor> getStoryPatternStoryPatternCompartement_7008SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		StoryPattern modelElement = (StoryPattern) containerView.getElement();
		LinkedList<SDMNodeDescriptor> result = new LinkedList<SDMNodeDescriptor>();
		for (Iterator<?> it = modelElement.getVariables().iterator(); it
				.hasNext();) {
			AbstractVariable childElement = (AbstractVariable) it.next();
			int visualID = SDMVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ObjectVariableEditPart.VISUAL_ID) {
				result.add(new SDMNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PrimitiveVariableEditPart.VISUAL_ID) {
				result.add(new SDMNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SDMNodeDescriptor> getObjectVariableObjectVariableAttributeAssignmentsCompartment_7014SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ObjectVariable modelElement = (ObjectVariable) containerView
				.getElement();
		LinkedList<SDMNodeDescriptor> result = new LinkedList<SDMNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAttributeAssignments().iterator(); it
				.hasNext();) {
			AttributeAssignment childElement = (AttributeAssignment) it.next();
			int visualID = SDMVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == AttributeAssignmentEditPart.VISUAL_ID) {
				result.add(new SDMNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SDMNodeDescriptor> getModifyingStoryNodeModifyingStoryNodeContentCompartment_7007SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ModifyingStoryNode modelElement = (ModifyingStoryNode) containerView
				.getElement();
		LinkedList<SDMNodeDescriptor> result = new LinkedList<SDMNodeDescriptor>();
		{
			StoryPattern childElement = modelElement.getOwnedRule();
			int visualID = SDMVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == StoryPatternEditPart.VISUAL_ID) {
				result.add(new SDMNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getContainedLinks(View view) {
		switch (SDMVisualIDRegistry.getVisualID(view)) {
		case ActivityEditPart.VISUAL_ID:
			return getActivity_1000ContainedLinks(view);
		case StartNodeEditPart.VISUAL_ID:
			return getStartNode_2001ContainedLinks(view);
		case StopNodeEditPart.VISUAL_ID:
			return getStopNode_2002ContainedLinks(view);
		case JunctionNodeEditPart.VISUAL_ID:
			return getJunctionNode_2003ContainedLinks(view);
		case StatementNodeEditPart.VISUAL_ID:
			return getStatementNode_2004ContainedLinks(view);
		case StructuredNodeEditPart.VISUAL_ID:
			return getStructuredNode_2005ContainedLinks(view);
		case ModifyingStoryNodeEditPart.VISUAL_ID:
			return getModifyingStoryNode_2007ContainedLinks(view);
		case TextualExpressionEditPart.VISUAL_ID:
			return getTextualExpression_3015ContainedLinks(view);
		case JunctionNode2EditPart.VISUAL_ID:
			return getJunctionNode_3001ContainedLinks(view);
		case StartNode2EditPart.VISUAL_ID:
			return getStartNode_3002ContainedLinks(view);
		case StopNode2EditPart.VISUAL_ID:
			return getStopNode_3004ContainedLinks(view);
		case StatementNode2EditPart.VISUAL_ID:
			return getStatementNode_3003ContainedLinks(view);
		case StructuredNode2EditPart.VISUAL_ID:
			return getStructuredNode_3005ContainedLinks(view);
		case ModifyingStoryNode2EditPart.VISUAL_ID:
			return getModifyingStoryNode_3011ContainedLinks(view);
		case StoryPatternEditPart.VISUAL_ID:
			return getStoryPattern_3008ContainedLinks(view);
		case ObjectVariableEditPart.VISUAL_ID:
			return getObjectVariable_3012ContainedLinks(view);
		case AttributeAssignmentEditPart.VISUAL_ID:
			return getAttributeAssignment_3013ContainedLinks(view);
		case PrimitiveVariableEditPart.VISUAL_ID:
			return getPrimitiveVariable_3014ContainedLinks(view);
		case ActivityEdgeEditPart.VISUAL_ID:
			return getActivityEdge_4001ContainedLinks(view);
		case LinkVariableEditPart.VISUAL_ID:
			return getLinkVariable_4002ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getIncomingLinks(View view) {
		switch (SDMVisualIDRegistry.getVisualID(view)) {
		case StartNodeEditPart.VISUAL_ID:
			return getStartNode_2001IncomingLinks(view);
		case StopNodeEditPart.VISUAL_ID:
			return getStopNode_2002IncomingLinks(view);
		case JunctionNodeEditPart.VISUAL_ID:
			return getJunctionNode_2003IncomingLinks(view);
		case StatementNodeEditPart.VISUAL_ID:
			return getStatementNode_2004IncomingLinks(view);
		case StructuredNodeEditPart.VISUAL_ID:
			return getStructuredNode_2005IncomingLinks(view);
		case ModifyingStoryNodeEditPart.VISUAL_ID:
			return getModifyingStoryNode_2007IncomingLinks(view);
		case TextualExpressionEditPart.VISUAL_ID:
			return getTextualExpression_3015IncomingLinks(view);
		case JunctionNode2EditPart.VISUAL_ID:
			return getJunctionNode_3001IncomingLinks(view);
		case StartNode2EditPart.VISUAL_ID:
			return getStartNode_3002IncomingLinks(view);
		case StopNode2EditPart.VISUAL_ID:
			return getStopNode_3004IncomingLinks(view);
		case StatementNode2EditPart.VISUAL_ID:
			return getStatementNode_3003IncomingLinks(view);
		case StructuredNode2EditPart.VISUAL_ID:
			return getStructuredNode_3005IncomingLinks(view);
		case ModifyingStoryNode2EditPart.VISUAL_ID:
			return getModifyingStoryNode_3011IncomingLinks(view);
		case StoryPatternEditPart.VISUAL_ID:
			return getStoryPattern_3008IncomingLinks(view);
		case ObjectVariableEditPart.VISUAL_ID:
			return getObjectVariable_3012IncomingLinks(view);
		case AttributeAssignmentEditPart.VISUAL_ID:
			return getAttributeAssignment_3013IncomingLinks(view);
		case PrimitiveVariableEditPart.VISUAL_ID:
			return getPrimitiveVariable_3014IncomingLinks(view);
		case ActivityEdgeEditPart.VISUAL_ID:
			return getActivityEdge_4001IncomingLinks(view);
		case LinkVariableEditPart.VISUAL_ID:
			return getLinkVariable_4002IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getOutgoingLinks(View view) {
		switch (SDMVisualIDRegistry.getVisualID(view)) {
		case StartNodeEditPart.VISUAL_ID:
			return getStartNode_2001OutgoingLinks(view);
		case StopNodeEditPart.VISUAL_ID:
			return getStopNode_2002OutgoingLinks(view);
		case JunctionNodeEditPart.VISUAL_ID:
			return getJunctionNode_2003OutgoingLinks(view);
		case StatementNodeEditPart.VISUAL_ID:
			return getStatementNode_2004OutgoingLinks(view);
		case StructuredNodeEditPart.VISUAL_ID:
			return getStructuredNode_2005OutgoingLinks(view);
		case ModifyingStoryNodeEditPart.VISUAL_ID:
			return getModifyingStoryNode_2007OutgoingLinks(view);
		case TextualExpressionEditPart.VISUAL_ID:
			return getTextualExpression_3015OutgoingLinks(view);
		case JunctionNode2EditPart.VISUAL_ID:
			return getJunctionNode_3001OutgoingLinks(view);
		case StartNode2EditPart.VISUAL_ID:
			return getStartNode_3002OutgoingLinks(view);
		case StopNode2EditPart.VISUAL_ID:
			return getStopNode_3004OutgoingLinks(view);
		case StatementNode2EditPart.VISUAL_ID:
			return getStatementNode_3003OutgoingLinks(view);
		case StructuredNode2EditPart.VISUAL_ID:
			return getStructuredNode_3005OutgoingLinks(view);
		case ModifyingStoryNode2EditPart.VISUAL_ID:
			return getModifyingStoryNode_3011OutgoingLinks(view);
		case StoryPatternEditPart.VISUAL_ID:
			return getStoryPattern_3008OutgoingLinks(view);
		case ObjectVariableEditPart.VISUAL_ID:
			return getObjectVariable_3012OutgoingLinks(view);
		case AttributeAssignmentEditPart.VISUAL_ID:
			return getAttributeAssignment_3013OutgoingLinks(view);
		case PrimitiveVariableEditPart.VISUAL_ID:
			return getPrimitiveVariable_3014OutgoingLinks(view);
		case ActivityEdgeEditPart.VISUAL_ID:
			return getActivityEdge_4001OutgoingLinks(view);
		case LinkVariableEditPart.VISUAL_ID:
			return getLinkVariable_4002OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getActivity_1000ContainedLinks(
			View view) {
		Activity modelElement = (Activity) view.getElement();
		LinkedList<SDMLinkDescriptor> result = new LinkedList<SDMLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_ActivityEdge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getStartNode_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getStopNode_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getJunctionNode_2003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getStatementNode_2004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getStructuredNode_2005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getModifyingStoryNode_2007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getTextualExpression_3015ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getJunctionNode_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getStartNode_3002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getStopNode_3004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getStatementNode_3003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getStructuredNode_3005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getModifyingStoryNode_3011ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getStoryPattern_3008ContainedLinks(
			View view) {
		StoryPattern modelElement = (StoryPattern) view.getElement();
		LinkedList<SDMLinkDescriptor> result = new LinkedList<SDMLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_LinkVariable_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getObjectVariable_3012ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getAttributeAssignment_3013ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getPrimitiveVariable_3014ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getActivityEdge_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getLinkVariable_4002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getStartNode_2001IncomingLinks(
			View view) {
		StartNode modelElement = (StartNode) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<SDMLinkDescriptor> result = new LinkedList<SDMLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getStopNode_2002IncomingLinks(
			View view) {
		StopNode modelElement = (StopNode) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<SDMLinkDescriptor> result = new LinkedList<SDMLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getJunctionNode_2003IncomingLinks(
			View view) {
		JunctionNode modelElement = (JunctionNode) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<SDMLinkDescriptor> result = new LinkedList<SDMLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getStatementNode_2004IncomingLinks(
			View view) {
		StatementNode modelElement = (StatementNode) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<SDMLinkDescriptor> result = new LinkedList<SDMLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getStructuredNode_2005IncomingLinks(
			View view) {
		StructuredNode modelElement = (StructuredNode) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<SDMLinkDescriptor> result = new LinkedList<SDMLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getModifyingStoryNode_2007IncomingLinks(
			View view) {
		ModifyingStoryNode modelElement = (ModifyingStoryNode) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<SDMLinkDescriptor> result = new LinkedList<SDMLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getTextualExpression_3015IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getJunctionNode_3001IncomingLinks(
			View view) {
		JunctionNode modelElement = (JunctionNode) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<SDMLinkDescriptor> result = new LinkedList<SDMLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getStartNode_3002IncomingLinks(
			View view) {
		StartNode modelElement = (StartNode) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<SDMLinkDescriptor> result = new LinkedList<SDMLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getStopNode_3004IncomingLinks(
			View view) {
		StopNode modelElement = (StopNode) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<SDMLinkDescriptor> result = new LinkedList<SDMLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getStatementNode_3003IncomingLinks(
			View view) {
		StatementNode modelElement = (StatementNode) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<SDMLinkDescriptor> result = new LinkedList<SDMLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getStructuredNode_3005IncomingLinks(
			View view) {
		StructuredNode modelElement = (StructuredNode) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<SDMLinkDescriptor> result = new LinkedList<SDMLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getModifyingStoryNode_3011IncomingLinks(
			View view) {
		ModifyingStoryNode modelElement = (ModifyingStoryNode) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<SDMLinkDescriptor> result = new LinkedList<SDMLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getStoryPattern_3008IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getObjectVariable_3012IncomingLinks(
			View view) {
		ObjectVariable modelElement = (ObjectVariable) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<SDMLinkDescriptor> result = new LinkedList<SDMLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_LinkVariable_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getAttributeAssignment_3013IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getPrimitiveVariable_3014IncomingLinks(
			View view) {
		PrimitiveVariable modelElement = (PrimitiveVariable) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<SDMLinkDescriptor> result = new LinkedList<SDMLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_LinkVariable_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getActivityEdge_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getLinkVariable_4002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getStartNode_2001OutgoingLinks(
			View view) {
		StartNode modelElement = (StartNode) view.getElement();
		LinkedList<SDMLinkDescriptor> result = new LinkedList<SDMLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getStopNode_2002OutgoingLinks(
			View view) {
		StopNode modelElement = (StopNode) view.getElement();
		LinkedList<SDMLinkDescriptor> result = new LinkedList<SDMLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getJunctionNode_2003OutgoingLinks(
			View view) {
		JunctionNode modelElement = (JunctionNode) view.getElement();
		LinkedList<SDMLinkDescriptor> result = new LinkedList<SDMLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getStatementNode_2004OutgoingLinks(
			View view) {
		StatementNode modelElement = (StatementNode) view.getElement();
		LinkedList<SDMLinkDescriptor> result = new LinkedList<SDMLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getStructuredNode_2005OutgoingLinks(
			View view) {
		StructuredNode modelElement = (StructuredNode) view.getElement();
		LinkedList<SDMLinkDescriptor> result = new LinkedList<SDMLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getModifyingStoryNode_2007OutgoingLinks(
			View view) {
		ModifyingStoryNode modelElement = (ModifyingStoryNode) view
				.getElement();
		LinkedList<SDMLinkDescriptor> result = new LinkedList<SDMLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getTextualExpression_3015OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getJunctionNode_3001OutgoingLinks(
			View view) {
		JunctionNode modelElement = (JunctionNode) view.getElement();
		LinkedList<SDMLinkDescriptor> result = new LinkedList<SDMLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getStartNode_3002OutgoingLinks(
			View view) {
		StartNode modelElement = (StartNode) view.getElement();
		LinkedList<SDMLinkDescriptor> result = new LinkedList<SDMLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getStopNode_3004OutgoingLinks(
			View view) {
		StopNode modelElement = (StopNode) view.getElement();
		LinkedList<SDMLinkDescriptor> result = new LinkedList<SDMLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getStatementNode_3003OutgoingLinks(
			View view) {
		StatementNode modelElement = (StatementNode) view.getElement();
		LinkedList<SDMLinkDescriptor> result = new LinkedList<SDMLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getStructuredNode_3005OutgoingLinks(
			View view) {
		StructuredNode modelElement = (StructuredNode) view.getElement();
		LinkedList<SDMLinkDescriptor> result = new LinkedList<SDMLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getModifyingStoryNode_3011OutgoingLinks(
			View view) {
		ModifyingStoryNode modelElement = (ModifyingStoryNode) view
				.getElement();
		LinkedList<SDMLinkDescriptor> result = new LinkedList<SDMLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getStoryPattern_3008OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getObjectVariable_3012OutgoingLinks(
			View view) {
		ObjectVariable modelElement = (ObjectVariable) view.getElement();
		LinkedList<SDMLinkDescriptor> result = new LinkedList<SDMLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_LinkVariable_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getAttributeAssignment_3013OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getPrimitiveVariable_3014OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getActivityEdge_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getLinkVariable_4002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<SDMLinkDescriptor> getContainedTypeModelFacetLinks_ActivityEdge_4001(
			Activity container) {
		LinkedList<SDMLinkDescriptor> result = new LinkedList<SDMLinkDescriptor>();
		for (Iterator<?> links = container.getOwnedActivityEdges().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ActivityEdge) {
				continue;
			}
			ActivityEdge link = (ActivityEdge) linkObject;
			if (ActivityEdgeEditPart.VISUAL_ID != SDMVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ActivityNode dst = link.getTarget();
			ActivityNode src = link.getSource();
			result.add(new SDMLinkDescriptor(src, dst, link,
					SDMElementTypes.ActivityEdge_4001,
					ActivityEdgeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<SDMLinkDescriptor> getContainedTypeModelFacetLinks_LinkVariable_4002(
			StoryPattern container) {
		LinkedList<SDMLinkDescriptor> result = new LinkedList<SDMLinkDescriptor>();
		for (Iterator<?> links = container.getLinkVariables().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof LinkVariable) {
				continue;
			}
			LinkVariable link = (LinkVariable) linkObject;
			if (LinkVariableEditPart.VISUAL_ID != SDMVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			AbstractVariable dst = link.getTarget();
			ObjectVariable src = link.getSource();
			result.add(new SDMLinkDescriptor(src, dst, link,
					SDMElementTypes.LinkVariable_4002,
					LinkVariableEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<SDMLinkDescriptor> getIncomingTypeModelFacetLinks_ActivityEdge_4001(
			ActivityNode target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<SDMLinkDescriptor> result = new LinkedList<SDMLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ActivitiesPackage.eINSTANCE
					.getActivityEdge_Target()
					|| false == setting.getEObject() instanceof ActivityEdge) {
				continue;
			}
			ActivityEdge link = (ActivityEdge) setting.getEObject();
			if (ActivityEdgeEditPart.VISUAL_ID != SDMVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ActivityNode src = link.getSource();
			result.add(new SDMLinkDescriptor(src, target, link,
					SDMElementTypes.ActivityEdge_4001,
					ActivityEdgeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<SDMLinkDescriptor> getIncomingTypeModelFacetLinks_LinkVariable_4002(
			AbstractVariable target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<SDMLinkDescriptor> result = new LinkedList<SDMLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != PatternsPackage.eINSTANCE
					.getAbstractLinkVariable_Target()
					|| false == setting.getEObject() instanceof LinkVariable) {
				continue;
			}
			LinkVariable link = (LinkVariable) setting.getEObject();
			if (LinkVariableEditPart.VISUAL_ID != SDMVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ObjectVariable src = link.getSource();
			result.add(new SDMLinkDescriptor(src, target, link,
					SDMElementTypes.LinkVariable_4002,
					LinkVariableEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<SDMLinkDescriptor> getOutgoingTypeModelFacetLinks_ActivityEdge_4001(
			ActivityNode source) {
		Activity container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Activity) {
				container = (Activity) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<SDMLinkDescriptor> result = new LinkedList<SDMLinkDescriptor>();
		for (Iterator<?> links = container.getOwnedActivityEdges().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ActivityEdge) {
				continue;
			}
			ActivityEdge link = (ActivityEdge) linkObject;
			if (ActivityEdgeEditPart.VISUAL_ID != SDMVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ActivityNode dst = link.getTarget();
			ActivityNode src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new SDMLinkDescriptor(src, dst, link,
					SDMElementTypes.ActivityEdge_4001,
					ActivityEdgeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<SDMLinkDescriptor> getOutgoingTypeModelFacetLinks_LinkVariable_4002(
			ObjectVariable source) {
		StoryPattern container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof StoryPattern) {
				container = (StoryPattern) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<SDMLinkDescriptor> result = new LinkedList<SDMLinkDescriptor>();
		for (Iterator<?> links = container.getLinkVariables().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof LinkVariable) {
				continue;
			}
			LinkVariable link = (LinkVariable) linkObject;
			if (LinkVariableEditPart.VISUAL_ID != SDMVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			AbstractVariable dst = link.getTarget();
			ObjectVariable src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new SDMLinkDescriptor(src, dst, link,
					SDMElementTypes.LinkVariable_4002,
					LinkVariableEditPart.VISUAL_ID));
		}
		return result;
	}

}
