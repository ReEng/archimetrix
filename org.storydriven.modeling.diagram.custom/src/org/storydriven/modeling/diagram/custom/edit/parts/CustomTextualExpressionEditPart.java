package org.storydriven.modeling.diagram.custom.edit.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.notation.View;
import org.storydriven.modeling.diagram.edit.parts.TextualExpressionEditPart;
import org.storydriven.modeling.expressions.TextualExpression;

public class CustomTextualExpressionEditPart extends TextualExpressionEditPart
{

	public CustomTextualExpressionEditPart(View view) {
		super(view);
	}

	/*
	 * should be similar to addNotationalListeners of (if needed):
	 * 
	 * CustomActivityEdgeGuardConstraintLabelEditPart
	 * CustomActivityFinalNodeReturnValueLabelEditPart
	 * CustomAttributeAssignmentEditPart
	 * CustomCallActionExpressionEditPart
	 * CustomCallActionExpression2EditPart
	 * CustomCallActionExpression3EditPart
	 * CustomStoryPatternExpressionLinkFeatureNameLabelEditPart
	 * CustomStoryPatternObjectClassifierLabelEditPart
	 */	

	@Override
	protected void handleNotificationEvent(Notification event)
	{
		updateFigure();
		super.handleNotificationEvent(event);
	}

	@Override
	protected void refreshVisuals()
	{
		super.refreshVisuals();
		updateFigure();
	}

	protected void updateFigure()
	{
		TextualExpression te = ((TextualExpression) ((View) getModel()).getElement());

		setLabelText(te.getExpressionText());

	}
}



















