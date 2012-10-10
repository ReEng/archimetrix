package org.storydriven.modeling.diagram.custom.edit.parts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.PolylineShape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.NonResizableEditPolicyEx;
import org.eclipse.gmf.runtime.notation.View;
import org.storydriven.modeling.activities.StopNode;
import org.storydriven.modeling.diagram.edit.parts.StopNodeEditPart;

public class CustomStopNodeEditPart extends StopNodeEditPart {

	public CustomStopNodeEditPart(View view) {
		super(view);
	}
	
	private void updateFigure() {
		
		StopNode stopnode = (StopNode) ((View) getModel()).getElement();
		Ellipse primaryEllipse = ((Ellipse) getPrimaryShape());
		if (stopnode.isFlowStopOnly()) {
			
			primaryEllipse.removeAll();
			primaryEllipse.setLayoutManager(new StackLayout());

			PolylineShape flowFinalNodeSlash0 = new PolylineShape();
			flowFinalNodeSlash0.addPoint(new Point(getMapMode().DPtoLP(4), getMapMode().DPtoLP(4)));
			flowFinalNodeSlash0.addPoint(new Point(getMapMode().DPtoLP(19), getMapMode().DPtoLP(19)));
			flowFinalNodeSlash0.setLineWidth(1);
			flowFinalNodeSlash0.setForegroundColor(ColorConstants.black);

			primaryEllipse.add(flowFinalNodeSlash0);

			PolylineShape flowFinalNodeBackSlash0 = new PolylineShape();
			flowFinalNodeBackSlash0.addPoint(new Point(getMapMode().DPtoLP(4), getMapMode().DPtoLP(19)));
			flowFinalNodeBackSlash0.addPoint(new Point(getMapMode().DPtoLP(19), getMapMode().DPtoLP(4)));
			flowFinalNodeBackSlash0.setLineWidth(1);
			flowFinalNodeBackSlash0.setForegroundColor(ColorConstants.black);

			primaryEllipse.add(flowFinalNodeBackSlash0);			
		}
		else {
			primaryEllipse.removeAll();
			
			GridLayout layoutThis = new GridLayout();
			layoutThis.numColumns = 1;
			layoutThis.makeColumnsEqualWidth = true;
			primaryEllipse.setLayoutManager(layoutThis);
			
			Ellipse stopNodeInnerEllipse0 = new Ellipse();
			stopNodeInnerEllipse0.setBackgroundColor(ColorConstants.black);
			stopNodeInnerEllipse0.setPreferredSize(new Dimension(getMapMode()
					.DPtoLP(15), getMapMode().DPtoLP(15)));
			stopNodeInnerEllipse0.setMaximumSize(new Dimension(getMapMode()
					.DPtoLP(15), getMapMode().DPtoLP(15)));
			stopNodeInnerEllipse0.setMinimumSize(new Dimension(getMapMode()
					.DPtoLP(15), getMapMode().DPtoLP(15)));

			GridData constraintStopNodeInnerEllipse0 = new GridData();
			constraintStopNodeInnerEllipse0.verticalAlignment = GridData.CENTER;
			constraintStopNodeInnerEllipse0.horizontalAlignment = GridData.CENTER;
			constraintStopNodeInnerEllipse0.horizontalIndent = 0;
			constraintStopNodeInnerEllipse0.horizontalSpan = 1;
			constraintStopNodeInnerEllipse0.verticalSpan = 1;
			constraintStopNodeInnerEllipse0.grabExcessHorizontalSpace = true;
			constraintStopNodeInnerEllipse0.grabExcessVerticalSpace = true;
			
			primaryEllipse.add(stopNodeInnerEllipse0, constraintStopNodeInnerEllipse0);
		}
	}
	
	@Override
	protected void handleNotificationEvent(Notification event) {
		super.handleNotificationEvent(event);
		updateFigure();
	}
	
	@Override
	public EditPolicy getPrimaryDragEditPolicy() {
	  return new NonResizableEditPolicyEx(); 
	}
	
	@Override 
	public void refresh() {
		super.refresh();
		updateFigure();
	}

}
