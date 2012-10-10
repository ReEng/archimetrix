package org.storydriven.modeling.diagram.custom.edit.parts;

import org.eclipse.draw2d.BorderLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.ScrollPane;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.storydriven.modeling.activities.StoryNode;
import org.storydriven.modeling.diagram.edit.parts.ModifyingStoryNodeEditPart;

public class CustomModifyingStoryNodeEditPart extends ModifyingStoryNodeEditPart {

	public CustomModifyingStoryNodeEditPart(View view) {
		super(view);
	}
	
	private void updateFigure(Notification event) {
		if(((StoryNode) ((View) getModel()).getElement()) != null) {
			boolean isForEach = ((StoryNode) ((View) getModel()).getElement()).isForEach();

			RectangleFigure frontRectangle = (RectangleFigure) getPrimaryShape().getChildren().get(1);

			Insets frontInsets = frontRectangle.getBorder().getInsets(frontRectangle);

			if (!isForEach)
			{
				frontInsets.top = 0;
				frontInsets.bottom = 0;
				frontInsets.left = 0;
				frontInsets.right = 0;
			}
			else
			{
				frontInsets.top = 0;
				frontInsets.bottom = 10;
				frontInsets.left = 0;
				frontInsets.right = 10;
			}
			
			// Get the StoryPattern Compartment.
			IFigure rectangleFront = (IFigure) ((IFigure) getFigure().getChildren().get(0)).getChildren().get(1);
			rectangleFront =  (IFigure) rectangleFront.getChildren().get(0);
			IFigure rectangleContent = (IFigure) rectangleFront.getChildren().get(1);
			rectangleContent = (IFigure) rectangleContent.getChildren().get(1);
			
			// If there is a StoryPattern resize it to the size of the StoryPatternCompartment.
			if(!rectangleContent.getChildren().isEmpty())
			{
				ResizableCompartmentFigure upperCompartment = (ResizableCompartmentFigure) rectangleContent.getChildren().get(0);
				upperCompartment.getScrollPane().setHorizontalScrollBarVisibility(ScrollPane.NEVER);
				upperCompartment.getScrollPane().setVerticalScrollBarVisibility(ScrollPane.NEVER);
				upperCompartment.setLayoutManager(new BorderLayout());
				
				if (!((EditPart) this.getChildren().get(2)).getChildren().isEmpty()) {
				upperCompartment.add(((AbstractGraphicalEditPart) ((EditPart) this.getChildren().get(2)).getChildren().get(0)).getFigure(), 
									BorderLayout.CENTER);
				}
			}
		}
	}
	
	@Override
	protected void handleNotificationEvent(Notification event) {
		super.handleNotificationEvent(event);
		updateFigure(event);
		super.refreshVisuals();
	}

	@Override 
	public void refresh() {
		super.refresh();
		updateFigure(null);
	}
}
