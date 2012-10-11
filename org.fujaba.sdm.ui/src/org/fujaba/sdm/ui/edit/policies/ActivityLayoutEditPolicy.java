/**
 * 
 */
package org.fujaba.sdm.ui.edit.policies;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.requests.CreateRequest;
import org.fujaba.commons.edit.parts.AbstractDiagramEditPart;
import org.fujaba.commons.edit.policies.AbstractLayoutEditPolicy;


/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 *
 */
public class ActivityLayoutEditPolicy extends AbstractLayoutEditPolicy
{

   @Override
   protected Command createChangeConstraintCommand(EditPart child,
         Object constraint)
   {

      return super.createChangeConstraintCommand(child, constraint);
   }


   @Override
   protected Command getCreateCommand(CreateRequest request)
   {
      if (getHost() instanceof AbstractDiagramEditPart
            && request.getNewObjectType() instanceof Class<?>)
      {
         // deliver those
         AbstractDiagramEditPart host = (AbstractDiagramEditPart) getHost();
         Class<?> type = (Class<?>) request.getNewObjectType();

      }
      return null;
   }
}
