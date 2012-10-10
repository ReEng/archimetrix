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
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
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
import org.storydriven.modeling.diagram.edit.policies.ObjectVariableItemSemanticEditPolicy;
import org.storydriven.modeling.diagram.part.SDMVisualIDRegistry;
import org.storydriven.modeling.diagram.providers.SDMElementTypes;

/**
 * @generated
 */
public class ObjectVariableEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3012;

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
	public ObjectVariableEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicy());
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new ObjectVariableItemSemanticEditPolicy());
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
		return primaryShape = new ObjectVariableFigure();
	}

	/**
	 * @generated
	 */
	public ObjectVariableFigure getPrimaryShape() {
		return (ObjectVariableFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ObjectVariableNameEditPart) {
			((ObjectVariableNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureObjectVariableNameLabel());
			return true;
		}
		if (childEditPart instanceof ObjectVariableBindingOperatorEditPart) {
			((ObjectVariableBindingOperatorEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureObjectVariableModifierLabel());
			return true;
		}
		if (childEditPart instanceof ObjectVariableClassifierLabelEditPart) {
			((ObjectVariableClassifierLabelEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureObjectVariableClassifierLabel());
			return true;
		}
		if (childEditPart instanceof ObjectVariableObjectVariableConstraintsCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureObjectVariableConstraintsRectangle();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((ObjectVariableObjectVariableConstraintsCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof ObjectVariableObjectVariableAttributeAsignmentsCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureObjectVariableAttributeAssignmentsRectangle();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((ObjectVariableObjectVariableAttributeAsignmentsCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ObjectVariableNameEditPart) {
			return true;
		}
		if (childEditPart instanceof ObjectVariableBindingOperatorEditPart) {
			return true;
		}
		if (childEditPart instanceof ObjectVariableClassifierLabelEditPart) {
			return true;
		}
		if (childEditPart instanceof ObjectVariableObjectVariableConstraintsCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureObjectVariableConstraintsRectangle();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.remove(((ObjectVariableObjectVariableConstraintsCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof ObjectVariableObjectVariableAttributeAsignmentsCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureObjectVariableAttributeAssignmentsRectangle();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.remove(((ObjectVariableObjectVariableAttributeAsignmentsCompartmentEditPart) childEditPart)
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
		if (editPart instanceof ObjectVariableObjectVariableConstraintsCompartmentEditPart) {
			return getPrimaryShape()
					.getFigureObjectVariableConstraintsRectangle();
		}
		if (editPart instanceof ObjectVariableObjectVariableAttributeAsignmentsCompartmentEditPart) {
			return getPrimaryShape()
					.getFigureObjectVariableAttributeAssignmentsRectangle();
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
				.getType(ObjectVariableNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(SDMElementTypes.LinkVariable_4002);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof org.storydriven.modeling.diagram.edit.parts.ObjectVariableEditPart) {
			types.add(SDMElementTypes.LinkVariable_4002);
		}
		if (targetEditPart instanceof PrimitiveVariableEditPart) {
			types.add(SDMElementTypes.LinkVariable_4002);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == SDMElementTypes.LinkVariable_4002) {
			types.add(SDMElementTypes.ObjectVariable_3012);
			types.add(SDMElementTypes.PrimitiveVariable_3014);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(SDMElementTypes.LinkVariable_4002);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == SDMElementTypes.LinkVariable_4002) {
			types.add(SDMElementTypes.ObjectVariable_3012);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof CreateViewAndElementRequest) {
			CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request)
					.getViewAndElementDescriptor()
					.getCreateElementRequestAdapter();
			IElementType type = (IElementType) adapter
					.getAdapter(IElementType.class);
			if (type == SDMElementTypes.AttributeAssignment_3013) {
				return getChildBySemanticHint(SDMVisualIDRegistry
						.getType(ObjectVariableObjectVariableAttributeAsignmentsCompartmentEditPart.VISUAL_ID));
			}
		}
		return super.getTargetEditPart(request);
	}

	/**
	 * @generated
	 */
	public class ObjectVariableFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureObjectVariableNameLabel;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureObjectVariableModifierLabel;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureObjectVariableClassifierLabel;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureObjectVariableConstraintsRectangle;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureObjectVariableAttributeAssignmentsRectangle;

		/**
		 * @generated
		 */
		public ObjectVariableFigure() {
			this.setLayoutManager(new StackLayout());
			this.setFill(false);
			this.setOutline(false);
			this.setMinimumSize(new Dimension(getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(0)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			RectangleFigure objectVariableContainerRectangle0 = new RectangleFigure();
			objectVariableContainerRectangle0.setFill(false);
			objectVariableContainerRectangle0.setOutline(false);

			objectVariableContainerRectangle0.setBorder(new MarginBorder(
					getMapMode().DPtoLP(0), getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(0), getMapMode().DPtoLP(0)));

			this.add(objectVariableContainerRectangle0);
			objectVariableContainerRectangle0
					.setLayoutManager(new StackLayout());

			RectangleFigure objectVariableRectangle1 = new RectangleFigure();
			objectVariableRectangle1.setForegroundColor(ColorConstants.black);

			objectVariableContainerRectangle0.add(objectVariableRectangle1);

			BorderLayout layoutObjectVariableRectangle1 = new BorderLayout();
			objectVariableRectangle1
					.setLayoutManager(layoutObjectVariableRectangle1);

			RectangleFigure objectVariableFigureNameRectangle2 = new RectangleFigure();

			objectVariableRectangle1.add(objectVariableFigureNameRectangle2,
					BorderLayout.TOP);

			GridLayout layoutObjectVariableFigureNameRectangle2 = new GridLayout();
			layoutObjectVariableFigureNameRectangle2.numColumns = 1;
			layoutObjectVariableFigureNameRectangle2.makeColumnsEqualWidth = true;
			objectVariableFigureNameRectangle2
					.setLayoutManager(layoutObjectVariableFigureNameRectangle2);

			fFigureObjectVariableModifierLabel = new WrappingLabel();
			fFigureObjectVariableModifierLabel.setText("");

			fFigureObjectVariableModifierLabel
					.setFont(FFIGUREOBJECTVARIABLEMODIFIERLABEL_FONT);

			GridData constraintFFigureObjectVariableModifierLabel = new GridData();
			constraintFFigureObjectVariableModifierLabel.verticalAlignment = GridData.BEGINNING;
			constraintFFigureObjectVariableModifierLabel.horizontalAlignment = GridData.CENTER;
			constraintFFigureObjectVariableModifierLabel.horizontalIndent = 0;
			constraintFFigureObjectVariableModifierLabel.horizontalSpan = 1;
			constraintFFigureObjectVariableModifierLabel.verticalSpan = 1;
			constraintFFigureObjectVariableModifierLabel.grabExcessHorizontalSpace = true;
			constraintFFigureObjectVariableModifierLabel.grabExcessVerticalSpace = false;
			objectVariableFigureNameRectangle2.add(
					fFigureObjectVariableModifierLabel,
					constraintFFigureObjectVariableModifierLabel);

			fFigureObjectVariableNameLabel = new WrappingLabel();
			fFigureObjectVariableNameLabel.setText("");

			fFigureObjectVariableNameLabel
					.setFont(FFIGUREOBJECTVARIABLENAMELABEL_FONT);

			GridData constraintFFigureObjectVariableNameLabel = new GridData();
			constraintFFigureObjectVariableNameLabel.verticalAlignment = GridData.CENTER;
			constraintFFigureObjectVariableNameLabel.horizontalAlignment = GridData.CENTER;
			constraintFFigureObjectVariableNameLabel.horizontalIndent = 0;
			constraintFFigureObjectVariableNameLabel.horizontalSpan = 1;
			constraintFFigureObjectVariableNameLabel.verticalSpan = 1;
			constraintFFigureObjectVariableNameLabel.grabExcessHorizontalSpace = true;
			constraintFFigureObjectVariableNameLabel.grabExcessVerticalSpace = false;
			objectVariableFigureNameRectangle2.add(
					fFigureObjectVariableNameLabel,
					constraintFFigureObjectVariableNameLabel);

			fFigureObjectVariableClassifierLabel = new WrappingLabel();
			fFigureObjectVariableClassifierLabel.setText("");

			fFigureObjectVariableClassifierLabel
					.setFont(FFIGUREOBJECTVARIABLECLASSIFIERLABEL_FONT);

			GridData constraintFFigureObjectVariableClassifierLabel = new GridData();
			constraintFFigureObjectVariableClassifierLabel.verticalAlignment = GridData.END;
			constraintFFigureObjectVariableClassifierLabel.horizontalAlignment = GridData.CENTER;
			constraintFFigureObjectVariableClassifierLabel.horizontalIndent = 0;
			constraintFFigureObjectVariableClassifierLabel.horizontalSpan = 1;
			constraintFFigureObjectVariableClassifierLabel.verticalSpan = 1;
			constraintFFigureObjectVariableClassifierLabel.grabExcessHorizontalSpace = true;
			constraintFFigureObjectVariableClassifierLabel.grabExcessVerticalSpace = false;
			objectVariableFigureNameRectangle2.add(
					fFigureObjectVariableClassifierLabel,
					constraintFFigureObjectVariableClassifierLabel);

			RectangleFigure objectVariableFigureBodyRectangle2 = new RectangleFigure();
			objectVariableFigureBodyRectangle2.setFill(false);
			objectVariableFigureBodyRectangle2.setOutline(false);

			objectVariableRectangle1.add(objectVariableFigureBodyRectangle2,
					BorderLayout.CENTER);

			BorderLayout layoutObjectVariableFigureBodyRectangle2 = new BorderLayout();
			objectVariableFigureBodyRectangle2
					.setLayoutManager(layoutObjectVariableFigureBodyRectangle2);

			fFigureObjectVariableConstraintsRectangle = new RectangleFigure();
			fFigureObjectVariableConstraintsRectangle.setFill(false);
			fFigureObjectVariableConstraintsRectangle.setOutline(false);

			objectVariableFigureBodyRectangle2
					.add(fFigureObjectVariableConstraintsRectangle,
							BorderLayout.TOP);

			fFigureObjectVariableAttributeAssignmentsRectangle = new RectangleFigure();
			fFigureObjectVariableAttributeAssignmentsRectangle.setFill(false);
			fFigureObjectVariableAttributeAssignmentsRectangle
					.setOutline(false);

			objectVariableFigureBodyRectangle2.add(
					fFigureObjectVariableAttributeAssignmentsRectangle,
					BorderLayout.CENTER);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureObjectVariableNameLabel() {
			return fFigureObjectVariableNameLabel;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureObjectVariableModifierLabel() {
			return fFigureObjectVariableModifierLabel;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureObjectVariableClassifierLabel() {
			return fFigureObjectVariableClassifierLabel;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureObjectVariableConstraintsRectangle() {
			return fFigureObjectVariableConstraintsRectangle;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureObjectVariableAttributeAssignmentsRectangle() {
			return fFigureObjectVariableAttributeAssignmentsRectangle;
		}

	}

	/**
	 * @generated
	 */
	static final Font FFIGUREOBJECTVARIABLEMODIFIERLABEL_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 9, SWT.ITALIC);

	/**
	 * @generated
	 */
	static final Font FFIGUREOBJECTVARIABLENAMELABEL_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 9, SWT.BOLD);

	/**
	 * @generated
	 */
	static final Font FFIGUREOBJECTVARIABLECLASSIFIERLABEL_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 9, SWT.BOLD);

}
