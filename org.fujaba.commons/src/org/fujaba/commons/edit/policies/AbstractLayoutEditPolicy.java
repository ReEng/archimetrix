package org.fujaba.commons.edit.policies;


import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.XYLayoutEditPolicy;
import org.fujaba.commons.edit.commands.SetConstraintCommand;
import org.fujaba.commons.edit.parts.AbstractNodeViewEditPart;



/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 */
public abstract class AbstractLayoutEditPolicy extends XYLayoutEditPolicy
{

   @Override
   protected Command createChangeConstraintCommand(EditPart child, Object constraint)
   {
      if (child instanceof AbstractNodeViewEditPart)
      {
         return new SetConstraintCommand((AbstractNodeViewEditPart) child, (Rectangle) constraint);
      }

      return null;
   }
}
