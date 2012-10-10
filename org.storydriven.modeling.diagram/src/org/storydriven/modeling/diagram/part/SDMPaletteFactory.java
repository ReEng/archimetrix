package org.storydriven.modeling.diagram.part;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.storydriven.modeling.diagram.providers.SDMElementTypes;

/**
 * @generated
 */
public class SDMPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createStoryPatternTools1Group());
		paletteRoot.add(createActivityNodeTools2Group());
	}

	/**
	 * Creates "Story Pattern Tools" palette tool group
	 * @generated
	 */
	private PaletteContainer createStoryPatternTools1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.StoryPatternTools1Group_title);
		paletteContainer.setId("createStoryPatternTools1Group"); //$NON-NLS-1$
		paletteContainer.add(createModifyingStoryNode1CreationTool());
		paletteContainer.add(createObjectVariableNode2CreationTool());
		paletteContainer.add(createPrimitiveVariableNode3CreationTool());
		paletteContainer.add(createAttributeAssignment4CreationTool());
		paletteContainer.add(createLinkVariable5CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Activity Node Tools" palette tool group
	 * @generated
	 */
	private PaletteContainer createActivityNodeTools2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.ActivityNodeTools2Group_title);
		paletteContainer.setId("createActivityNodeTools2Group"); //$NON-NLS-1$
		paletteContainer.add(createActivityEdge1CreationTool());
		paletteContainer.add(createStartNode2CreationTool());
		paletteContainer.add(createStopNode3CreationTool());
		paletteContainer.add(createJunctionNode4CreationTool());
		paletteContainer.add(createStructuredNode5CreationTool());
		paletteContainer.add(createStatementNode6CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createModifyingStoryNode1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(SDMElementTypes.ModifyingStoryNode_3011);
		types.add(SDMElementTypes.ModifyingStoryNode_2007);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ModifyingStoryNode1CreationTool_title,
				Messages.ModifyingStoryNode1CreationTool_desc, types);
		entry.setId("createModifyingStoryNode1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SDMDiagramEditorPlugin
				.findImageDescriptor("/org.storydriven.modeling.diagram.custom/icons/objects16/ModifyingStoryNode.gif")); //$NON-NLS-1$
		entry.setLargeIcon(SDMDiagramEditorPlugin
				.findImageDescriptor("/org.storydriven.modeling.diagram.custom/icons/objects16/ModifyingStoryNode.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createObjectVariableNode2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ObjectVariableNode2CreationTool_title,
				Messages.ObjectVariableNode2CreationTool_desc,
				Collections.singletonList(SDMElementTypes.ObjectVariable_3012));
		entry.setId("createObjectVariableNode2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SDMDiagramEditorPlugin
				.findImageDescriptor("/org.storydriven.modeling.diagram.custom/icons/objects16/ObjectVariableNode.gif")); //$NON-NLS-1$
		entry.setLargeIcon(SDMDiagramEditorPlugin
				.findImageDescriptor("/org.storydriven.modeling.diagram.custom/icons/objects16/ObjectVariableNode.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPrimitiveVariableNode3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.PrimitiveVariableNode3CreationTool_title,
				Messages.PrimitiveVariableNode3CreationTool_desc,
				Collections
						.singletonList(SDMElementTypes.AttributeAssignment_3013));
		entry.setId("createPrimitiveVariableNode3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SDMDiagramEditorPlugin
				.findImageDescriptor("/org.storydriven.modeling.diagram.custom/icons/objects16/PrimitiveVariableNode.gif")); //$NON-NLS-1$
		entry.setLargeIcon(SDMDiagramEditorPlugin
				.findImageDescriptor("/org.storydriven.modeling.diagram.custom/icons/objects16/PrimitiveVariableNode.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAttributeAssignment4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.AttributeAssignment4CreationTool_title,
				Messages.AttributeAssignment4CreationTool_desc,
				Collections
						.singletonList(SDMElementTypes.PrimitiveVariable_3014));
		entry.setId("createAttributeAssignment4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SDMDiagramEditorPlugin
				.findImageDescriptor("/org.storydriven.modeling.diagram.custom/icons/objects16/AttributeAssignment.gif")); //$NON-NLS-1$
		entry.setLargeIcon(SDMDiagramEditorPlugin
				.findImageDescriptor("/org.storydriven.modeling.diagram.custom/icons/objects16/AttributeAssignment.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLinkVariable5CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.LinkVariable5CreationTool_title,
				Messages.LinkVariable5CreationTool_desc,
				Collections.singletonList(SDMElementTypes.LinkVariable_4002));
		entry.setId("createLinkVariable5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SDMDiagramEditorPlugin
				.findImageDescriptor("/org.storydriven.modeling.diagram.custom/icons/objects16/LinkVariable.gif")); //$NON-NLS-1$
		entry.setLargeIcon(SDMDiagramEditorPlugin
				.findImageDescriptor("/org.storydriven.modeling.diagram.custom/icons/objects16/LinkVariable.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createActivityEdge1CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.ActivityEdge1CreationTool_title,
				Messages.ActivityEdge1CreationTool_desc,
				Collections.singletonList(SDMElementTypes.ActivityEdge_4001));
		entry.setId("createActivityEdge1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SDMDiagramEditorPlugin
				.findImageDescriptor("/org.storydriven.modeling.diagram.custom/icons/objects16/ActivityEdge.gif")); //$NON-NLS-1$
		entry.setLargeIcon(SDMDiagramEditorPlugin
				.findImageDescriptor("/org.storydriven.modeling.diagram.custom/icons/objects16/ActivityEdge.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStartNode2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(SDMElementTypes.StartNode_2001);
		types.add(SDMElementTypes.StartNode_3002);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.StartNode2CreationTool_title,
				Messages.StartNode2CreationTool_desc, types);
		entry.setId("createStartNode2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SDMDiagramEditorPlugin
				.findImageDescriptor("/org.storydriven.modeling.diagram.custom/icons/objects16/StartNode.gif")); //$NON-NLS-1$
		entry.setLargeIcon(SDMDiagramEditorPlugin
				.findImageDescriptor("/org.storydriven.modeling.diagram.custom/icons/objects16/StartNode.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStopNode3CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(SDMElementTypes.StopNode_2002);
		types.add(SDMElementTypes.StopNode_3004);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.StopNode3CreationTool_title,
				Messages.StopNode3CreationTool_desc, types);
		entry.setId("createStopNode3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SDMDiagramEditorPlugin
				.findImageDescriptor("/org.storydriven.modeling.diagram.custom/icons/objects16/StopNode.gif")); //$NON-NLS-1$
		entry.setLargeIcon(SDMDiagramEditorPlugin
				.findImageDescriptor("/org.storydriven.modeling.diagram.custom/icons/objects16/StopNode.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createJunctionNode4CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(SDMElementTypes.JunctionNode_2003);
		types.add(SDMElementTypes.JunctionNode_3001);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.JunctionNode4CreationTool_title,
				Messages.JunctionNode4CreationTool_desc, types);
		entry.setId("createJunctionNode4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SDMDiagramEditorPlugin
				.findImageDescriptor("/org.storydriven.modeling.diagram.custom/icons/objects16/JunctionNode.gif")); //$NON-NLS-1$
		entry.setLargeIcon(SDMDiagramEditorPlugin
				.findImageDescriptor("/org.storydriven.modeling.diagram.custom/icons/objects16/JunctionNode.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStructuredNode5CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(SDMElementTypes.StructuredNode_2005);
		types.add(SDMElementTypes.StructuredNode_3005);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.StructuredNode5CreationTool_title,
				Messages.StructuredNode5CreationTool_desc, types);
		entry.setId("createStructuredNode5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SDMDiagramEditorPlugin
				.findImageDescriptor("/org.storydriven.modeling.diagram.custom/icons/full/obj16/StructuredNode.gif")); //$NON-NLS-1$
		entry.setLargeIcon(SDMDiagramEditorPlugin
				.findImageDescriptor("/org.storydriven.modeling.diagram.custom/icons/full/obj16/StructuredNode.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStatementNode6CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(SDMElementTypes.StatementNode_2004);
		types.add(SDMElementTypes.StatementNode_3003);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.StatementNode6CreationTool_title,
				Messages.StatementNode6CreationTool_desc, types);
		entry.setId("createStatementNode6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SDMDiagramEditorPlugin
				.findImageDescriptor("/org.storydriven.modeling.diagram.custom/icons/full/obj16/StatementNode.gif")); //$NON-NLS-1$
		entry.setLargeIcon(SDMDiagramEditorPlugin
				.findImageDescriptor("/org.storydriven.modeling.diagram.custom/icons/full/obj16/StatementNode.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
