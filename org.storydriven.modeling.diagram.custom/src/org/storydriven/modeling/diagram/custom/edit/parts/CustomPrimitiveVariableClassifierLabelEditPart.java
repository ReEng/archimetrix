package org.storydriven.modeling.diagram.custom.edit.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;
import org.storydriven.modeling.diagram.edit.parts.ObjectVariableClassifierLabelEditPart;
import org.storydriven.modeling.diagram.edit.parts.PrimitiveVariableClassifierLabelEditPart;
import org.storydriven.modeling.patterns.BindingState;
import org.storydriven.modeling.patterns.PrimitiveVariable;

public class CustomPrimitiveVariableClassifierLabelEditPart extends PrimitiveVariableClassifierLabelEditPart
{

	public CustomPrimitiveVariableClassifierLabelEditPart(View view)
	{
		super(view);
	}

	/*
	 * should be similar to addNotationalListeners of:
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
//	@Override
//	protected void addNotationalListeners()
//	{
//		super.addNotationalListeners();
//		Expression expr = ((StoryPatternObject) ((View) getModel()).getElement()).getDirectAssignmentExpression();
//		
//		if (expr != null)
//		{
//			this.addListenerFilter(Utility.getFilterId((NamedElement) expr), this, expr);
//			
//			if (expr instanceof CallActionExpression)
//			{
//				TreeIterator<EObject> it = ((CallActionExpression) expr).eAllContents();
//				for (EObject eObj; it.hasNext();)
//				{
//					eObj = it.next();
//					this.addListenerFilter(Utility.getFilterId((NamedElement) eObj), this, eObj);
//				}
//			}
//		}
//	}
	
	/*
	 * should be similar to handleNotificationEvent of:
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
//		Object notifier = event.getNotifier();
//		Object newValue = event.getNewValue();
//		Object oldValue = event.getOldValue();
//		int eventType = event.getEventType();
//
//		if ((eventType == Notification.SET || eventType == Notification.ADD)
//				&& (newValue instanceof CallAction || newValue instanceof Expression || newValue instanceof CallActionParameter))
//		{
//			this.addListenerFilter(Utility.getFilterId((NamedElement) newValue), this, (EObject) newValue);
//			updateFigure();
//		}
//		else if (eventType == Notification.REMOVE
//				&& (oldValue instanceof CallAction || oldValue instanceof Expression || oldValue instanceof CallActionParameter))
//		{
//			this.removeListenerFilter(Utility.getFilterId((NamedElement) oldValue));
//			updateFigure();
//		}
//		else if (notifier instanceof StoryPatternObject || notifier instanceof CallAction || notifier instanceof Expression
//				|| notifier instanceof CallActionParameter)
//		{
//			updateFigure();
//		}
		updateFigure();
		super.handleNotificationEvent(event);
	}

	protected void updateFigure()
	{
		PrimitiveVariable pv = (PrimitiveVariable) ((View) getModel()).getElement();

		String text = "";

		String eClassName = "[null]";
		if (pv.getClassifier() != null)
		{
			eClassName = pv.getClassifier().getName();
		}

		text = " : " + eClassName;
		
		if (pv.getBindingState() == BindingState.BOUND)
		{
			setForegroundColor(new Color(null, 160, 160, 160));
			((WrappingLabel) this.getFigure()).setOpaque(false);
		}
		else if (pv.getBindingState() == BindingState.MAYBE_BOUND)
		{
			setBackgroundColor(new Color(null, 200, 200, 200));
			((WrappingLabel) this.getFigure()).setOpaque(true);
		}
		else if (pv.getBindingState() == BindingState.UNBOUND)
		{
			((WrappingLabel) this.getFigure()).setOpaque(false);
			/*
			 * Leave the color as is, so it is green in case of created
			 * objects, red for destroyed objects, and black otherwise.
			 */
		}

		if (text.length() > 50)
		{
			text = text.substring(0, 50);
			text += "...";
		}

		setLabelText(text);

		((WrappingLabel) getFigure()).setTextUnderline(true);
	}

	@Override
	protected void refreshVisuals()
	{
		super.refreshVisuals();
		updateFigure();
	}
}
