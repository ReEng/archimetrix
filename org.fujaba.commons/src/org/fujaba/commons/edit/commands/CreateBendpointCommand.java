package org.fujaba.commons.edit.commands;

import org.fujaba.commons.notation.Edge;
import org.fujaba.commons.notation.NotationFactory;
import org.fujaba.commons.notation.RelativeBendPoint;

/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 */
public class CreateBendpointCommand extends BendpointCommand {
	/**
	 * Default constructor.
	 * 
	 * @param model
	 *            The (view) model element.
	 */
	public CreateBendpointCommand(Edge model) {
		super(model, "create bendpoint");
	}

	@Override
	public void redo() {
		if (point == null) {
			RelativeBendPoint point = NotationFactory.eINSTANCE.createRelativeBendPoint();

			point.setSourceX(getSourceRelativeDimension().width);
			point.setSourceY(getSourceRelativeDimension().height);
			point.setTargetX(getTargetRelativeDimension().width);
			point.setTargetY(getTargetRelativeDimension().height);
			this.point = point;
		}

		model.getBendPoints().add(getIndex(), point);
	}

	@Override
	public void undo() {
		model.getBendPoints().remove(point);
	}
}
