package org.storydriven.modeling.diagram.custom.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.storydriven.modeling.diagram.edit.parts.ActivityEdgeGuardConstraintLabelEditPart;
import org.storydriven.modeling.diagram.edit.parts.AttributeAssignmentEditPart;
import org.storydriven.modeling.diagram.edit.parts.ModifyingStoryNodeEditPart;
import org.storydriven.modeling.diagram.edit.parts.ObjectVariableBindingOperatorEditPart;
import org.storydriven.modeling.diagram.edit.parts.ObjectVariableClassifierLabelEditPart;
import org.storydriven.modeling.diagram.edit.parts.ObjectVariableEditPart;
import org.storydriven.modeling.diagram.edit.parts.ObjectVariableNameEditPart;
import org.storydriven.modeling.diagram.edit.parts.PrimitiveVariableClassifierLabelEditPart;
import org.storydriven.modeling.diagram.edit.parts.SDMEditPartFactory;
import org.storydriven.modeling.diagram.edit.parts.StopNodeEditPart;
import org.storydriven.modeling.diagram.edit.parts.StoryPatternEditPart;
import org.storydriven.modeling.diagram.edit.parts.TextualExpressionEditPart;
import org.storydriven.modeling.diagram.part.SDMVisualIDRegistry;

public class CustomSDMEditPartFactory extends SDMEditPartFactory {
	@Override
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (SDMVisualIDRegistry.getVisualID(view)) {

			case StopNodeEditPart.VISUAL_ID:
				return new CustomStopNodeEditPart(view);
				
			case ModifyingStoryNodeEditPart.VISUAL_ID:
				return new CustomModifyingStoryNodeEditPart(view);
				
			case StoryPatternEditPart.VISUAL_ID:
				return new CustomStoryPatternEditPart(view);
				
			case ObjectVariableNameEditPart.VISUAL_ID:
				return new CustomObjectVariableNameLabelEditPart(view);
				
			case ObjectVariableBindingOperatorEditPart.VISUAL_ID:
				return new CustomObjectVariableBindingOperatorLabelEditPart(view);
				
			case ObjectVariableClassifierLabelEditPart.VISUAL_ID:
				return new CustomObjectVariableClassifierLabelEditPart(view);
				
			case PrimitiveVariableClassifierLabelEditPart.VISUAL_ID:
				return new CustomPrimitiveVariableClassifierLabelEditPart(view);
				
			case AttributeAssignmentEditPart.VISUAL_ID:
				return new CustomAttributeAssignmentEditPart(view);
				
			case TextualExpressionEditPart.VISUAL_ID:
				return new CustomTextualExpressionEditPart(view);
				
			case ActivityEdgeGuardConstraintLabelEditPart.VISUAL_ID:
				return new CustomActivityEdgeGuardConstraintLabelEditPart(view);
				
			case ObjectVariableEditPart.VISUAL_ID:
				return new CustomObjectVariableEditPart(view);
			/* In case MatchingStoryNodes strike back add this:
			 * 	case MatchingStoryNodeEditPart.VISUAL_ID:
			 *		return new CustomMatchingStoryNodeEditPart(view);
			 */
			}	
		}
		return super.createEditPart(context, model);
	}
}
