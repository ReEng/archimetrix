/**
 * 
 */
package org.fujaba.sdm.ui.edit.parts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editpolicies.RootComponentEditPolicy;
import org.fujaba.commons.edit.parts.AbstractDiagramEditPart;
import org.fujaba.commons.figures.UMLFragmentLabelFigure;
import org.fujaba.sdm.ui.edit.policies.ActivityLayoutEditPolicy;
import org.storydriven.modeling.activities.Activity;
import org.storydriven.modeling.activities.OperationExtension;


/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 *
 */
public class ActivityEditPart extends AbstractDiagramEditPart
{
   private UMLFragmentLabelFigure labelFigure;
   private final static String DIAGRAM_PREFIX = "activity";
   
   @Override
   protected IFigure createFigure()
   {
      // create label figure
      labelFigure = new UMLFragmentLabelFigure(DIAGRAM_PREFIX, new String());

      // change parent figure
      IFigure f = super.createFigure();
      f.setBorder(new LineBorder(ColorConstants.black, 1));
      f.add(labelFigure);
      f.setConstraint(labelFigure, new Rectangle(1, 1, -1, -1));

      return super.createFigure();
   }
   

   @Override
   protected void refreshVisuals()
   {
      StringBuilder text = new StringBuilder();

      if (getRealModel().eContainer() != null)
      {
         String name = ((OperationExtension) getRealModel().eContainer()).getOperation().getName();
         text.append(name);
      }

      labelFigure.setText(1, text.toString());
   }
   
   @Override
   public Activity getRealModel()
   {
      return (Activity) super.getRealModel();
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
}
