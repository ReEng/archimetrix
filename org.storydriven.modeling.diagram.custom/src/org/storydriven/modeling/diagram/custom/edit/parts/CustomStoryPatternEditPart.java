package org.storydriven.modeling.diagram.custom.edit.parts;

import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.storydriven.modeling.diagram.edit.parts.StoryPatternEditPart;

public class CustomStoryPatternEditPart extends StoryPatternEditPart {

	public CustomStoryPatternEditPart(View view) {
		super(view);
		
		EditPolicy newPolicy = new NonResizableEditPolicy() {
			@Override
			protected Command getMoveCommand(ChangeBoundsRequest request) {
				return UnexecutableCommand.INSTANCE;
			}
			
			@Override
			public boolean isDragAllowed() {
				return false;
			}
		};
		
		this.installEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE, newPolicy);
	}

}
