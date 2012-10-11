/**
 * 
 */
package org.fujaba.sdm.ui.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.fujaba.sdm.ui.figures.RhombChopboxAnchor;
import org.fujaba.sdm.ui.figures.UMLNopActivityFigure;

/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 *
 */
public class JunctionNodeEditPart extends ActivityNodeEditPart
{

   @Override
   protected IFigure createFigure()
   {
      UMLNopActivityFigure figure = new UMLNopActivityFigure();
      anchor = new RhombChopboxAnchor (figure);
      return figure;
   }
   
   /**
    * @see org.eclipse.gef.editparts.AbstractEditPart#createEditPolicies()
    */
   @Override
   protected void createEditPolicies()
   {
      this.installEditPolicy (EditPolicy.NODE_ROLE,
            new NonResizableEditPolicy());
   }

}
