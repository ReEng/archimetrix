package org.fujaba.commons.edit.commands;

import org.fujaba.commons.notation.Edge;
import org.fujaba.commons.notation.NotationFactory;
import org.fujaba.commons.notation.RelativeBendPoint;

/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 */
public class MoveBendpointCommand extends BendpointCommand {

	private RelativeBendPoint newPoint;

	public MoveBendpointCommand(Edge model) {
		super(model, "move bendpoint");
	}

	@Override
	public void redo() {
		// save old point
		if (point == null) {
			point = model.getBendPoints().get(getIndex());

			newPoint = NotationFactory.eINSTANCE.createRelativeBendPoint();

			newPoint.setSourceX(getSourceRelativeDimension().width);
			newPoint.setSourceY(getSourceRelativeDimension().height);
			newPoint.setTargetX(getTargetRelativeDimension().width);
			newPoint.setTargetY(getTargetRelativeDimension().height);
		}

		model.getBendPoints().remove(point);
		model.getBendPoints().add(getIndex(), newPoint);
	}

	@Override
	public void undo() {
		model.getBendPoints().remove(newPoint);
		model.getBendPoints().add(getIndex(), point);
	}
}
