package org.storydriven.modeling.diagram.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.BorderLayout;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;
import org.storydriven.modeling.diagram.edit.policies.ModifyingStoryNode2ItemSemanticEditPolicy;
import org.storydriven.modeling.diagram.part.SDMVisualIDRegistry;
import org.storydriven.modeling.diagram.providers.SDMElementTypes;

/**
 * @generated
 */
public class ModifyingStoryNode2EditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3011;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public ModifyingStoryNode2EditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new ModifyingStoryNode2ItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child
						.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new StoryNodeFigure();
	}

	/**
	 * @generated
	 */
	public StoryNodeFigure getPrimaryShape() {
		return (StoryNodeFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ModifyingStoryNodeName2EditPart) {
			((ModifyingStoryNodeName2EditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureStoryNodeNameLabel());
			return true;
		}
		if (childEditPart instanceof ModifyingStoryNodeModifyingStoryNodeConstraintsCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureStoryNodeConstraintsRectangle();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((ModifyingStoryNodeModifyingStoryNodeConstraintsCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof ModifyingStoryNodeModifyingStoryNodeContentCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureStoryNodeContentRectangle();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((ModifyingStoryNodeModifyingStoryNodeContentCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ModifyingStoryNodeName2EditPart) {
			return true;
		}
		if (childEditPart instanceof ModifyingStoryNodeModifyingStoryNodeConstraintsCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureStoryNodeConstraintsRectangle();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.remove(((ModifyingStoryNodeModifyingStoryNodeConstraintsCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof ModifyingStoryNodeModifyingStoryNodeContentCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureStoryNodeContentRectangle();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.remove(((ModifyingStoryNodeModifyingStoryNodeContentCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		if (editPart instanceof ModifyingStoryNodeModifyingStoryNodeConstraintsCompartmentEditPart) {
			return getPrimaryShape().getFigureStoryNodeConstraintsRectangle();
		}
		if (editPart instanceof ModifyingStoryNodeModifyingStoryNodeContentCompartmentEditPart) {
			return getPrimaryShape().getFigureStoryNodeContentRectangle();
		}
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(SDMVisualIDRegistry
				.getType(ModifyingStoryNodeName2EditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(SDMElementTypes.ActivityEdge_4001);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof StartNodeEditPart) {
			types.add(SDMElementTypes.ActivityEdge_4001);
		}
		if (targetEditPart instanceof StopNodeEditPart) {
			types.add(SDMElementTypes.ActivityEdge_4001);
		}
		if (targetEditPart instanceof JunctionNodeEditPart) {
			types.add(SDMElementTypes.ActivityEdge_4001);
		}
		if (targetEditPart instanceof StatementNodeEditPart) {
			types.add(SDMElementTypes.ActivityEdge_4001);
		}
		if (targetEditPart instanceof StructuredNodeEditPart) {
			types.add(SDMElementTypes.ActivityEdge_4001);
		}
		if (targetEditPart instanceof ModifyingStoryNodeEditPart) {
			types.add(SDMElementTypes.ActivityEdge_4001);
		}
		if (targetEditPart instanceof JunctionNode2EditPart) {
			types.add(SDMElementTypes.ActivityEdge_4001);
		}
		if (targetEditPart instanceof StartNode2EditPart) {
			types.add(SDMElementTypes.ActivityEdge_4001);
		}
		if (targetEditPart instanceof StopNode2EditPart) {
			types.add(SDMElementTypes.ActivityEdge_4001);
		}
		if (targetEditPart instanceof StatementNode2EditPart) {
			types.add(SDMElementTypes.ActivityEdge_4001);
		}
		if (targetEditPart instanceof StructuredNode2EditPart) {
			types.add(SDMElementTypes.ActivityEdge_4001);
		}
		if (targetEditPart instanceof org.storydriven.modeling.diagram.edit.parts.ModifyingStoryNode2EditPart) {
			types.add(SDMElementTypes.ActivityEdge_4001);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == SDMElementTypes.ActivityEdge_4001) {
			types.add(SDMElementTypes.StartNode_2001);
			types.add(SDMElementTypes.StopNode_2002);
			types.add(SDMElementTypes.JunctionNode_2003);
			types.add(SDMElementTypes.StatementNode_2004);
			types.add(SDMElementTypes.StructuredNode_2005);
			types.add(SDMElementTypes.ModifyingStoryNode_2007);
			types.add(SDMElementTypes.JunctionNode_3001);
			types.add(SDMElementTypes.StartNode_3002);
			types.add(SDMElementTypes.StopNode_3004);
			types.add(SDMElementTypes.StatementNode_3003);
			types.add(SDMElementTypes.StructuredNode_3005);
			types.add(SDMElementTypes.ModifyingStoryNode_3011);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(SDMElementTypes.ActivityEdge_4001);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == SDMElementTypes.ActivityEdge_4001) {
			types.add(SDMElementTypes.StartNode_2001);
			types.add(SDMElementTypes.StopNode_2002);
			types.add(SDMElementTypes.JunctionNode_2003);
			types.add(SDMElementTypes.StatementNode_2004);
			types.add(SDMElementTypes.StructuredNode_2005);
			types.add(SDMElementTypes.ModifyingStoryNode_2007);
			types.add(SDMElementTypes.JunctionNode_3001);
			types.add(SDMElementTypes.StartNode_3002);
			types.add(SDMElementTypes.StopNode_3004);
			types.add(SDMElementTypes.StatementNode_3003);
			types.add(SDMElementTypes.StructuredNode_3005);
			types.add(SDMElementTypes.ModifyingStoryNode_3011);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class StoryNodeFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureStoryNodeNameLabel;
		/**
		 * @generated
		 */
		private RoundedRectangle fFigureStoryNodeConstraintsRectangle;
		/**
		 * @generated
		 */
		private RoundedRectangle fFigureStoryNodeContentRectangle;

		/**
		 * @generated
		 */
		public StoryNodeFigure() {
			this.setLayoutManager(new StackLayout());
			this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(16),
					getMapMode().DPtoLP(16)));
			this.setFill(false);
			this.setOutline(false);
			this.setMinimumSize(new Dimension(getMapMode().DPtoLP(100),
					getMapMode().DPtoLP(50)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			RectangleFigure storyNodeContainerBack0 = new RectangleFigure();
			storyNodeContainerBack0.setFill(false);
			storyNodeContainerBack0.setOutline(false);

			storyNodeContainerBack0.setBorder(new MarginBorder(getMapMode()
					.DPtoLP(10), getMapMode().DPtoLP(10), getMapMode()
					.DPtoLP(0), getMapMode().DPtoLP(0)));

			this.add(storyNodeContainerBack0);
			storyNodeContainerBack0.setLayoutManager(new StackLayout());

			RoundedRectangle storyActionNodeFigureBackRectangle1 = new RoundedRectangle();
			storyActionNodeFigureBackRectangle1
					.setCornerDimensions(new Dimension(getMapMode().DPtoLP(16),
							getMapMode().DPtoLP(16)));
			storyActionNodeFigureBackRectangle1
					.setForegroundColor(ColorConstants.black);
			storyActionNodeFigureBackRectangle1
					.setBackgroundColor(STORYACTIONNODEFIGUREBACKRECTANGLE1_BACK);

			storyNodeContainerBack0.add(storyActionNodeFigureBackRectangle1);

			RectangleFigure storyNodeContainerFront0 = new RectangleFigure();
			storyNodeContainerFront0.setFill(false);
			storyNodeContainerFront0.setOutline(false);

			storyNodeContainerFront0.setBorder(new MarginBorder(getMapMode()
					.DPtoLP(0), getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(10), getMapMode().DPtoLP(10)));

			this.add(storyNodeContainerFront0);
			storyNodeContainerFront0.setLayoutManager(new StackLayout());

			RoundedRectangle storyNodeFigureFrontRectangle1 = new RoundedRectangle();
			storyNodeFigureFrontRectangle1.setCornerDimensions(new Dimension(
					getMapMode().DPtoLP(16), getMapMode().DPtoLP(16)));
			storyNodeFigureFrontRectangle1
					.setForegroundColor(ColorConstants.black);
			storyNodeFigureFrontRectangle1
					.setBackgroundColor(STORYNODEFIGUREFRONTRECTANGLE1_BACK);

			storyNodeContainerFront0.add(storyNodeFigureFrontRectangle1);

			BorderLayout layoutStoryNodeFigureFrontRectangle1 = new BorderLayout();
			storyNodeFigureFrontRectangle1
					.setLayoutManager(layoutStoryNodeFigureFrontRectangle1);

			RoundedRectangle storyActionNodeFigureTitleRectangle2 = new RoundedRectangle();
			storyActionNodeFigureTitleRectangle2
					.setCornerDimensions(new Dimension(getMapMode().DPtoLP(16),
							getMapMode().DPtoLP(16)));
			storyActionNodeFigureTitleRectangle2.setFill(false);
			storyActionNodeFigureTitleRectangle2.setOutline(false);
			storyActionNodeFigureTitleRectangle2
					.setPreferredSize(new Dimension(getMapMode().DPtoLP(100),
							getMapMode().DPtoLP(30)));

			storyNodeFigureFrontRectangle1.add(
					storyActionNodeFigureTitleRectangle2, BorderLayout.TOP);

			GridLayout layoutStoryActionNodeFigureTitleRectangle2 = new GridLayout();
			layoutStoryActionNodeFigureTitleRectangle2.numColumns = 1;
			layoutStoryActionNodeFigureTitleRectangle2.makeColumnsEqualWidth = true;
			storyActionNodeFigureTitleRectangle2
					.setLayoutManager(layoutStoryActionNodeFigureTitleRectangle2);

			fFigureStoryNodeNameLabel = new WrappingLabel();
			fFigureStoryNodeNameLabel.setText("");

			fFigureStoryNodeNameLabel.setFont(FFIGURESTORYNODENAMELABEL_FONT);

			GridData constraintFFigureStoryNodeNameLabel = new GridData();
			constraintFFigureStoryNodeNameLabel.verticalAlignment = GridData.CENTER;
			constraintFFigureStoryNodeNameLabel.horizontalAlignment = GridData.CENTER;
			constraintFFigureStoryNodeNameLabel.horizontalIndent = 0;
			constraintFFigureStoryNodeNameLabel.horizontalSpan = 1;
			constraintFFigureStoryNodeNameLabel.verticalSpan = 1;
			constraintFFigureStoryNodeNameLabel.grabExcessHorizontalSpace = true;
			constraintFFigureStoryNodeNameLabel.grabExcessVerticalSpace = false;
			storyActionNodeFigureTitleRectangle2.add(fFigureStoryNodeNameLabel,
					constraintFFigureStoryNodeNameLabel);

			RoundedRectangle storyActionNodeContentRectangle2 = new RoundedRectangle();
			storyActionNodeContentRectangle2.setCornerDimensions(new Dimension(
					getMapMode().DPtoLP(16), getMapMode().DPtoLP(16)));
			storyActionNodeContentRectangle2.setFill(false);
			storyActionNodeContentRectangle2.setOutline(false);

			storyNodeFigureFrontRectangle1.add(
					storyActionNodeContentRectangle2, BorderLayout.CENTER);

			BorderLayout layoutStoryActionNodeContentRectangle2 = new BorderLayout();
			storyActionNodeContentRectangle2
					.setLayoutManager(layoutStoryActionNodeContentRectangle2);

			fFigureStoryNodeConstraintsRectangle = new RoundedRectangle();
			fFigureStoryNodeConstraintsRectangle
					.setCornerDimensions(new Dimension(getMapMode().DPtoLP(16),
							getMapMode().DPtoLP(16)));
			fFigureStoryNodeConstraintsRectangle.setFill(false);
			fFigureStoryNodeConstraintsRectangle.setOutline(false);

			storyActionNodeContentRectangle2.add(
					fFigureStoryNodeConstraintsRectangle, BorderLayout.TOP);

			fFigureStoryNodeContentRectangle = new RoundedRectangle();
			fFigureStoryNodeContentRectangle.setCornerDimensions(new Dimension(
					getMapMode().DPtoLP(16), getMapMode().DPtoLP(16)));
			fFigureStoryNodeContentRectangle.setFill(false);
			fFigureStoryNodeContentRectangle.setOutline(false);

			storyActionNodeContentRectangle2.add(
					fFigureStoryNodeContentRectangle, BorderLayout.CENTER);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureStoryNodeNameLabel() {
			return fFigureStoryNodeNameLabel;
		}

		/**
		 * @generated
		 */
		public RoundedRectangle getFigureStoryNodeConstraintsRectangle() {
			return fFigureStoryNodeConstraintsRectangle;
		}

		/**
		 * @generated
		 */
		public RoundedRectangle getFigureStoryNodeContentRectangle() {
			return fFigureStoryNodeContentRectangle;
		}

	}

	/**
	 * @generated
	 */
	static final Color STORYACTIONNODEFIGUREBACKRECTANGLE1_BACK = new Color(
			null, 252, 254, 204);

	/**
	 * @generated
	 */
	static final Color STORYNODEFIGUREFRONTRECTANGLE1_BACK = new Color(null,
			252, 254, 204);

	/**
	 * @generated
	 */
	static final Font FFIGURESTORYNODENAMELABEL_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 10, SWT.BOLD);

}
