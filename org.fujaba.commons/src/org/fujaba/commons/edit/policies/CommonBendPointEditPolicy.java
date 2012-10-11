package org.fujaba.commons.edit.policies;


import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.BendpointEditPolicy;
import org.eclipse.gef.requests.BendpointRequest;
import org.fujaba.commons.edit.commands.CreateBendpointCommand;
import org.fujaba.commons.edit.commands.DeleteBendpointCommand;
import org.fujaba.commons.edit.commands.MoveBendpointCommand;
import org.fujaba.commons.notation.Edge;



/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 */
public class CommonBendPointEditPolicy extends BendpointEditPolicy
{

   @Override
   protected Command getCreateBendpointCommand(BendpointRequest request)
   {
      CreateBendpointCommand com = new CreateBendpointCommand((Edge) getHost()
            .getModel());
      Point p = request.getLocation();
      Connection conn = getConnection();

      conn.translateToRelative(p);

      Point ref1 = getConnection().getSourceAnchor().getReferencePoint();
      Point ref2 = getConnection().getTargetAnchor().getReferencePoint();

      conn.translateToRelative(ref1);
      conn.translateToRelative(ref2);

      com.setRelativeDimensions(p.getDifference(ref1), p.getDifference(ref2));
      com.setIndex(request.getIndex());
      return com;
   }


   @Override
   protected Command getDeleteBendpointCommand(BendpointRequest request)
   {
      DeleteBendpointCommand com = new DeleteBendpointCommand((Edge) getHost()
            .getModel());
      com.setIndex(request.getIndex());
      return com;
   }


   @Override
   protected Command getMoveBendpointCommand(BendpointRequest request)
   {
      MoveBendpointCommand com = new MoveBendpointCommand((Edge) getHost()
            .getModel());
      Point p = request.getLocation();
      Connection conn = getConnection();

      conn.translateToRelative(p);

      Point ref1 = getConnection().getSourceAnchor().getReferencePoint();
      Point ref2 = getConnection().getTargetAnchor().getReferencePoint();

      conn.translateToRelative(ref1);
      conn.translateToRelative(ref2);

      com.setRelativeDimensions(p.getDifference(ref1), p.getDifference(ref2));

      com.setIndex(request.getIndex());
      return com;
   }
}
