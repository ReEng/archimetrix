package org.storydriven.modeling.diagram.custom.edit.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.notation.View;
import org.storydriven.modeling.diagram.custom.util.SdmUtility;
import org.storydriven.modeling.diagram.edit.parts.ObjectVariableBindingOperatorEditPart;
import org.storydriven.modeling.patterns.ObjectVariable;

public class CustomObjectVariableBindingOperatorLabelEditPart extends
		ObjectVariableBindingOperatorEditPart {
	
	public CustomObjectVariableBindingOperatorLabelEditPart(View view)
	{
		super(view);
	}

	@Override
	protected void handleNotificationEvent(Notification event)
	{
		super.handleNotificationEvent(event);
		
		if (event.getNotifier() instanceof ObjectVariable)
		{
			adjustColorAndModifierLabel();
		}
	}

	@Override
	protected void refreshVisuals()
	{
		super.refreshVisuals();
		adjustColorAndModifierLabel();
	}

	protected void adjustColorAndModifierLabel()
	{
		SdmUtility.adaptColor(getFigure(), ((ObjectVariable) ((View) this.getModel()).getElement()).getBindingOperator());

		setLabelText(SdmUtility.adaptObjectVariableModifierText(this));
	}
}
