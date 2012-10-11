/**
 * 
 */
package org.fujaba.sdm.ui.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.fujaba.sdm.ui.figures.UMLStartActivityChopboxAnchor;
import org.fujaba.sdm.ui.figures.UMLStartActivityFigure;
import org.storydriven.modeling.activities.StartNode;

/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 *
 */
public class StartNodeEditPart extends ActivityNodeEditPart
{
   @Override
   protected IFigure createFigure() 
   {
      UMLStartActivityFigure figure = new UMLStartActivityFigure(getRealModel().getName());

      this.anchor = new UMLStartActivityChopboxAnchor(figure);
      return figure;
   }

   /**
    * @see org.eclipse.gef.editparts.AbstractEditPart#createEditPolicies()
    */
   @Override
   protected void createEditPolicies()
   {
      installEditPolicy(EditPolicy.NODE_ROLE, new NonResizableEditPolicy());
   }

   @Override
   public StartNode getRealModel()
   {
      return (StartNode)super.getRealModel();
   }
   
   /**
    * @see org.eclipse.gef.editparts.AbstractEditPart#refreshVisuals()
    */
   @Override
   protected void refreshVisuals() 
   {
      ((UMLStartActivityFigure) this.getFigure()).setName(this.getRealModel().getName());
      ((GraphicalEditPart) getParent()).setLayoutConstraint(this, getFigure(), new Rectangle(getModel().getX(), getModel().getY(), getModel().getWidth(), getModel().getHeight()));
   }

}
