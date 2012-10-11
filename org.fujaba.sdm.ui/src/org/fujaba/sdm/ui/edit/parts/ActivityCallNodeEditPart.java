/**
 * 
 */
package org.fujaba.sdm.ui.edit.parts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.gef.EditPolicy;
import org.fujaba.commons.edit.parts.AbstractNodeEditPart;
import org.fujaba.sdm.ui.edit.policies.ActivityLayoutEditPolicy;
import org.fujaba.sdm.ui.figures.UMLActivityChopboxAnchor;
import org.fujaba.sdm.ui.figures.UMLStoryActivityFigure;
import org.fujaba.sdm.ui.utils.Expr2String;
import org.storydriven.modeling.activities.Activity;
import org.storydriven.modeling.activities.ActivityCallNode;
import org.storydriven.modeling.calls.ParameterBinding;


/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 *
 */
public class ActivityCallNodeEditPart extends AbstractNodeEditPart
{

   /**
    * @see org.eclipse.gef.editparts.AbstractGraphicalEditPart#createFigure()
    */
   @Override
   protected IFigure createFigure()
   {
      String name = null;
      Activity activity = (Activity) getRealModel().getCallee();
      EOperation operation = activity.getOwningOperation().getOperation();
      
      if(!activity.getOutParameters().isEmpty())
      {
         EParameter param = activity.getOutParameters().get(0);
         for(ParameterBinding binding : getRealModel().getOwnedParameterBindings())
         {
            if(binding.getParameter() == param)
            {
               name = Expr2String.toString(binding.getValueExpression()) + " := "; 
            }
         }
         
      }
      else
      {
         name = "void ";
      }
      
      if(name == null)
      {
         name = "null := ";
      }
      
      name += operation.getName() + "(";
      for(EParameter param : operation.getEParameters())
      {
         for(ParameterBinding binding : getRealModel().getOwnedParameterBindings())
         {
            if(binding.getParameter() == param)
            {
               name += Expr2String.toString(binding.getValueExpression()) + ","; 
            }
         }
      }
      name += ")";
      UMLStoryActivityFigure figure = new UMLStoryActivityFigure();
      figure.setName(name);
      figure.setBackgroundColor(ColorConstants.lightGray);
      this.anchor = new UMLActivityChopboxAnchor(figure);
      return figure;
   }

   /**
    * @see de.uni_paderborn.fujaba4eclipse.edit.editparts.AbstractBoundedASGEditPart#refreshVisuals()
    */
   @Override
   protected void refreshVisuals()
   {
      super.refreshVisuals();
   }
   
   /**
    * @see org.eclipse.gef.editparts.AbstractEditPart#createEditPolicies()
    */
   @Override
   protected void createEditPolicies()
   {
      installEditPolicy(EditPolicy.LAYOUT_ROLE, new ActivityLayoutEditPolicy());
   }

   @Override
   public ActivityCallNode getRealModel()
   {
      return (ActivityCallNode) super.getRealModel();
   }

}
