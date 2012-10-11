/**
 * 
 */
package org.fujaba.sdm.ui.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.fujaba.commons.edit.parts.AbstractEdgeEditPart;
import org.fujaba.commons.figures.utils.ConnectionDecorationFactory;
import org.storydriven.modeling.activities.ActivityEdge;


/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 *
 */
public class ActivityEdgeEditPart extends AbstractEdgeEditPart
{

   @Override
   protected IFigure createFigure()
   {
      IFigure figure = super.createFigure();
      placeLabel(((ActivityEdge)this.getRealModel()).getGuard().toString());
      connection.setTargetDecoration(ConnectionDecorationFactory.createDecoration(ConnectionDecorationFactory.OPEN_ARROW));
      return figure;
   }

   @Override
   protected void refreshVisuals()
   {
      // TODO Auto-generated method stub
      super.refreshVisuals();
   }

}
