/**
 * 
 */
package org.fujaba.sdm.ui.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editpolicies.RootComponentEditPolicy;
import org.fujaba.commons.edit.parts.AbstractDiagramEditPart;
import org.fujaba.sdm.ui.edit.policies.ActivityLayoutEditPolicy;
import org.fujaba.sdm.ui.figures.UMLActivityChopboxAnchor;
import org.fujaba.sdm.ui.figures.UMLStoryActivityFigure;
import org.fujaba.sdm.ui.utils.Expr2String;
import org.storydriven.modeling.activities.StoryNode;
import org.storydriven.modeling.patterns.Constraint;


/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 *
 */
public class StoryNodeEditPart extends AbstractDiagramEditPart
{
   
   /**
    * @see org.eclipse.gef.editparts.AbstractGraphicalEditPart#createFigure()
    */
   @Override
   protected IFigure createFigure()
   {
      String name = getRealModel().getName();
      UMLStoryActivityFigure figure = new UMLStoryActivityFigure();
      if(!getRealModel().getStoryPattern().getConstraints().isEmpty())
      {
         name += "\n Constraints: ";
         for (Constraint c : getRealModel().getStoryPattern().getConstraints())
         {
            name += Expr2String.toString(c.getConstraintExpression()) + " && ";
         }
      }
      figure.setName(name);
      this.anchor = new UMLActivityChopboxAnchor(figure);
      return figure;
   }

   /**
    * @see de.uni_paderborn.fujaba4eclipse.edit.editparts.AbstractBoundedASGEditPart#refreshVisuals()
    */
   @Override
   protected void refreshVisuals()
   {
      UMLStoryActivityFigure fig = (UMLStoryActivityFigure) getFigure();
      fig.setIsForEach(getRealModel().isForEach());

      super.refreshVisuals();
   }
   
   /**
    * @see org.eclipse.gef.editparts.AbstractEditPart#createEditPolicies()
    */
   @Override
   protected void createEditPolicies()
   {
      installEditPolicy(EditPolicy.COMPONENT_ROLE,
            new RootComponentEditPolicy());
      installEditPolicy(EditPolicy.LAYOUT_ROLE, new ActivityLayoutEditPolicy());
   }

   @Override
   public StoryNode getRealModel()
   {
      return (StoryNode) super.getRealModel();
   }

}
