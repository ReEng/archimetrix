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
import org.storydriven.modeling.diagram.edit.policies.PrimitiveVariableItemSemanticEditPolicy;
import org.storydriven.modeling.diagram.part.SDMVisualIDRegistry;
import org.storydriven.modeling.diagram.providers.SDMElementTypes;

/**
 * @generated
 */
public class PrimitiveVariableEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3014;

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
	public PrimitiveVariableEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new PrimitiveVariableItemSemanticEditPolicy());
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
		return primaryShape = new PrimitiveVariableFigure();
	}

	/**
	 * @generated
	 */
	public PrimitiveVariableFigure getPrimaryShape() {
		return (PrimitiveVariableFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof PrimitiveVariableNameEditPart) {
			((PrimitiveVariableNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigurePrimitiveVariableNameLabel());
			return true;
		}
		if (childEditPart instanceof PrimitiveVariableClassifierLabelEditPart) {
			((PrimitiveVariableClassifierLabelEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigurePrimitiveVariableClassifierLabel());
			return true;
		}
		if (childEditPart instanceof PrimitiveVariablePrimitiveVariableConstraintsCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigurePrimitiveVariableConstraintsRectangle();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((PrimitiveVariablePrimitiveVariableConstraintsCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof PrimitiveVariableNameEditPart) {
			return true;
		}
		if (childEditPart instanceof PrimitiveVariableClassifierLabelEditPart) {
			return true;
		}
		if (childEditPart instanceof PrimitiveVariablePrimitiveVariableConstraintsCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigurePrimitiveVariableConstraintsRectangle();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.remove(((PrimitiveVariablePrimitiveVariableConstraintsCompartmentEditPart) childEditPart)
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
		if (editPart instanceof PrimitiveVariablePrimitiveVariableConstraintsCompartmentEditPart) {
			return getPrimaryShape()
					.getFigurePrimitiveVariableConstraintsRectangle();
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
				.getType(PrimitiveVariableNameEditPart.VISUAL_ID));
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
	public class PrimitiveVariableFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigurePrimitiveVariableNameLabel;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePrimitiveVariableClassifierLabel;
		/**
		 * @generated
		 */
		private RectangleFigure fFigurePrimitiveVariableConstraintsRectangle;

		/**
		 * @generated
		 */
		public PrimitiveVariableFigure() {
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

			RectangleFigure primitiveVariableContainerRectangle0 = new RectangleFigure();
			primitiveVariableContainerRectangle0.setFill(false);
			primitiveVariableContainerRectangle0.setOutline(false);

			primitiveVariableContainerRectangle0.setBorder(new MarginBorder(
					getMapMode().DPtoLP(0), getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(0), getMapMode().DPtoLP(0)));

			this.add(primitiveVariableContainerRectangle0);
			primitiveVariableContainerRectangle0
					.setLayoutManager(new StackLayout());

			RectangleFigure primitiveVariableRectangle1 = new RectangleFigure();
			primitiveVariableRectangle1
					.setForegroundColor(ColorConstants.black);

			primitiveVariableContainerRectangle0
					.add(primitiveVariableRectangle1);

			BorderLayout layoutPrimitiveVariableRectangle1 = new BorderLayout();
			primitiveVariableRectangle1
					.setLayoutManager(layoutPrimitiveVariableRectangle1);

			RectangleFigure primitiveVariableFigureNameRectangle2 = new RectangleFigure();

			primitiveVariableRectangle1.add(
					primitiveVariableFigureNameRectangle2, BorderLayout.TOP);

			GridLayout layoutPrimitiveVariableFigureNameRectangle2 = new GridLayout();
			layoutPrimitiveVariableFigureNameRectangle2.numColumns = 1;
			layoutPrimitiveVariableFigureNameRectangle2.makeColumnsEqualWidth = true;
			primitiveVariableFigureNameRectangle2
					.setLayoutManager(layoutPrimitiveVariableFigureNameRectangle2);

			fFigurePrimitiveVariableNameLabel = new WrappingLabel();
			fFigurePrimitiveVariableNameLabel.setText("");

			fFigurePrimitiveVariableNameLabel
					.setFont(FFIGUREPRIMITIVEVARIABLENAMELABEL_FONT);

			GridData constraintFFigurePrimitiveVariableNameLabel = new GridData();
			constraintFFigurePrimitiveVariableNameLabel.verticalAlignment = GridData.CENTER;
			constraintFFigurePrimitiveVariableNameLabel.horizontalAlignment = GridData.CENTER;
			constraintFFigurePrimitiveVariableNameLabel.horizontalIndent = 0;
			constraintFFigurePrimitiveVariableNameLabel.horizontalSpan = 1;
			constraintFFigurePrimitiveVariableNameLabel.verticalSpan = 1;
			constraintFFigurePrimitiveVariableNameLabel.grabExcessHorizontalSpace = true;
			constraintFFigurePrimitiveVariableNameLabel.grabExcessVerticalSpace = false;
			primitiveVariableFigureNameRectangle2.add(
					fFigurePrimitiveVariableNameLabel,
					constraintFFigurePrimitiveVariableNameLabel);

			fFigurePrimitiveVariableClassifierLabel = new WrappingLabel();
			fFigurePrimitiveVariableClassifierLabel.setText("");

			fFigurePrimitiveVariableClassifierLabel
					.setFont(FFIGUREPRIMITIVEVARIABLECLASSIFIERLABEL_FONT);

			GridData constraintFFigurePrimitiveVariableClassifierLabel = new GridData();
			constraintFFigurePrimitiveVariableClassifierLabel.verticalAlignment = GridData.END;
			constraintFFigurePrimitiveVariableClassifierLabel.horizontalAlignment = GridData.CENTER;
			constraintFFigurePrimitiveVariableClassifierLabel.horizontalIndent = 0;
			constraintFFigurePrimitiveVariableClassifierLabel.horizontalSpan = 1;
			constraintFFigurePrimitiveVariableClassifierLabel.verticalSpan = 1;
			constraintFFigurePrimitiveVariableClassifierLabel.grabExcessHorizontalSpace = true;
			constraintFFigurePrimitiveVariableClassifierLabel.grabExcessVerticalSpace = false;
			primitiveVariableFigureNameRectangle2.add(
					fFigurePrimitiveVariableClassifierLabel,
					constraintFFigurePrimitiveVariableClassifierLabel);

			RectangleFigure primitiveVariableFigureBodyRectangle2 = new RectangleFigure();
			primitiveVariableFigureBodyRectangle2.setFill(false);
			primitiveVariableFigureBodyRectangle2.setOutline(false);

			primitiveVariableRectangle1.add(
					primitiveVariableFigureBodyRectangle2, BorderLayout.CENTER);

			BorderLayout layoutPrimitiveVariableFigureBodyRectangle2 = new BorderLayout();
			primitiveVariableFigureBodyRectangle2
					.setLayoutManager(layoutPrimitiveVariableFigureBodyRectangle2);

			fFigurePrimitiveVariableConstraintsRectangle = new RectangleFigure();
			fFigurePrimitiveVariableConstraintsRectangle.setFill(false);
			fFigurePrimitiveVariableConstraintsRectangle.setOutline(false);

			primitiveVariableFigureBodyRectangle2.add(
					fFigurePrimitiveVariableConstraintsRectangle,
					BorderLayout.TOP);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePrimitiveVariableNameLabel() {
			return fFigurePrimitiveVariableNameLabel;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePrimitiveVariableClassifierLabel() {
			return fFigurePrimitiveVariableClassifierLabel;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigurePrimitiveVariableConstraintsRectangle() {
			return fFigurePrimitiveVariableConstraintsRectangle;
		}

	}

	/**
	 * @generated
	 */
	static final Font FFIGUREPRIMITIVEVARIABLENAMELABEL_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 9, SWT.BOLD);

	/**
	 * @generated
	 */
	static final Font FFIGUREPRIMITIVEVARIABLECLASSIFIERLABEL_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 9, SWT.BOLD);

}
