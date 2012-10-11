package org.fujaba.commons.edit.commands;

import org.fujaba.commons.notation.Edge;

/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 */
public class DeleteBendpointCommand extends BendpointCommand {

	/**
	 * Default constructor.
	 * 
	 * @param model
	 *            The (view) model element.
	 */
	public DeleteBendpointCommand(Edge model) {
		super(model, "delete bendpoint");
	}

	@Override
	public void redo() {
		if (point == null) {
			point = model.getBendPoints().get(getIndex());
		}

		model.getBendPoints().remove(getIndex());
	}

	@Override
	public void undo() {
		model.getBendPoints().add(point);
	}
}
