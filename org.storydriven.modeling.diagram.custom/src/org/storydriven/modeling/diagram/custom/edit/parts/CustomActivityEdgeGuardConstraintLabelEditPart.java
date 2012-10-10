package org.storydriven.modeling.diagram.custom.edit.parts;

import org.eclipse.draw2d.PositionConstants;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.storydriven.modeling.activities.ActivityEdge;
import org.storydriven.modeling.activities.EdgeGuard;
import org.storydriven.modeling.diagram.custom.util.SdmUtility;
import org.storydriven.modeling.diagram.edit.parts.ActivityEdgeGuardConstraintLabelEditPart;
import org.storydriven.modeling.expressions.TextualExpression;


public class CustomActivityEdgeGuardConstraintLabelEditPart extends ActivityEdgeGuardConstraintLabelEditPart
{

	public CustomActivityEdgeGuardConstraintLabelEditPart(View view)
	{
		super(view);
	}

	/*
	 * should be similar to addNotationalListeners of:
	 * 
	 * CustomActivityEdgeGuardConstraintLabelEditPart
	 * CustomActivityFinalNodeReturnValueLabelEditPart
	 * CustomAttributeAssignmentEditPart CustomCallActionExpressionEditPart
	 * CustomCallActionExpression2EditPart CustomCallActionExpression3EditPart
	 * CustomStoryPatternExpressionLinkFeatureNameLabelEditPart
	 * CustomStoryPatternObjectClassifierLabelEditPart
	 */
	
	protected void handleNotificationEvent(Notification event)
	{
		updateFigure();
		super.handleNotificationEvent(event);
	}

	protected static String format(String text)
	{
		return "[ " + text + " ]";
	}

	protected void updateFigure()
	{
		((WrappingLabel) getFigure()).setTextWrap(true);
		((WrappingLabel) getFigure()).setTextJustification(PositionConstants.CENTER);

		ActivityEdge edge = (ActivityEdge) ((View) getModel()).getElement();

		String text = "hihihi";
		if (edge.getGuardExpression() != null)
		{
			text = format(((TextualExpression) edge.getGuardExpression()).getExpressionText());
		}
		else if (edge.getGuard() != EdgeGuard.NONE)
		{
			text = format(SdmUtility.Guard2String(edge.getGuard()));
		}

		setLabelText(text);
	}

	protected void refreshVisuals()
	{
		super.refreshVisuals();
		updateFigure();
	}
}
