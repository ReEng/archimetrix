package org.storydriven.modeling.diagram.custom.edit.parts;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.notation.View;
import org.storydriven.modeling.diagram.edit.parts.ObjectVariableEditPart;
import org.storydriven.modeling.patterns.ObjectVariable;

public class CustomObjectVariableEditPart extends ObjectVariableEditPart {

	public CustomObjectVariableEditPart(View view) {
		super(view);
	}
	
	@Override
	protected void handleNotificationEvent(Notification notification)
	{
		if (notification.getNotifier() instanceof ObjectVariable)
		{
			updateFigure();
		}

		super.handleNotificationEvent(notification);
	}

	@Override
	protected void refreshVisuals()
	{
		super.refreshVisuals();
		updateFigure();
	}
	
	protected void updateFigure()
	{
		ObjectVariable ov = (ObjectVariable) ((View) getModel()).getElement();
		if( ov.getBindingSemantics() == org.storydriven.modeling.patterns.BindingSemantics.OPTIONAL) {
			RectangleFigure outerRectangle = ((RectangleFigure) ((IFigure) ((RectangleFigure) getFigure().getChildren().get(0))
																				.getChildren().get(0)).getChildren().get(0));
			outerRectangle.setLineStyle(Graphics.LINE_DASH);
			((RectangleFigure) outerRectangle.getChildren().get(0)).setLineStyle(Graphics.LINE_DASH);
		}
		else
		{
			RectangleFigure outerRectangle = ((RectangleFigure) ((IFigure) ((RectangleFigure) getFigure().getChildren().get(0))
					.getChildren().get(0)).getChildren().get(0));
			outerRectangle.setLineStyle(Graphics.LINE_SOLID);
			((RectangleFigure) outerRectangle.getChildren().get(0)).setLineStyle(Graphics.LINE_SOLID);
		}
	}

}
