package org.fujaba.commons.edit.policies;


import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.editpolicies.ContainerEditPolicy;


/**
 * TODO: describe type
 * 
 * @author harka
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 */
public abstract class AbstractContainerEditPolicy extends ContainerEditPolicy
{

   /**
    * Returns the <i>host</i> if the Request is an ADD, MOVE, or CREATE.
    * 
    * @see org.eclipse.gef.EditPolicy#getTargetEditPart(Request)
    */
   @Override
   public EditPart getTargetEditPart(Request request)
   {
      if (REQ_ADD.equals(request.getType())
            || REQ_MOVE.equals(request.getType())
            || REQ_CREATE.equals(request.getType())
            || REQ_CLONE.equals(request.getType())
            || REQ_ORPHAN_CHILDREN.equals(request.getType()))
      {
         return getHost();
      }

      return null;
   }
}
