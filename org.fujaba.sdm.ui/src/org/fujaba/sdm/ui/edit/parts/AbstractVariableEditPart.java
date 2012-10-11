package org.fujaba.sdm.ui.edit.parts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.fujaba.commons.edit.parts.AbstractNodeEditPart;
import org.fujaba.commons.figures.LabelFigure;
import org.fujaba.commons.figures.UMLObjectFigure;
import org.fujaba.sdm.ui.figures.UMLObjectChopboxAnchor;
import org.fujaba.sdm.ui.utils.Expr2String;
import org.storydriven.modeling.patterns.AbstractVariable;
import org.storydriven.modeling.patterns.BindingState;
import org.storydriven.modeling.patterns.Constraint;


public class AbstractVariableEditPart extends AbstractNodeEditPart
{
   
   private LabelFigure bindingExpressionLabel = null;
   private LabelFigure constraintsLabel = null;
   /**
    * @return No description provided
    * @see org.eclipse.gef.editparts.AbstractGraphicalEditPart#createFigure()
    */
   @Override
   protected IFigure createFigure()
   {
      UMLObjectFigure figure = new UMLObjectFigure(null);
      anchor = new UMLObjectChopboxAnchor(figure);
      updateVisuals(figure);
      
      return figure;
   }

   protected void updateVisuals(UMLObjectFigure figure)
   {
      String name = getRealModel().getName();
      if (!"this".equals(name) && getRealModel().getType() != null
            && getRealModel().getBindingState() == BindingState.UNBOUND)
      {
         // add the type only if it is not bound yet
         name += " : " + getRealModel().getType().getName();
      }
      figure.setName(name);
      
      
      
      if(getRealModel().getBindingExpression() != null
            && bindingExpressionLabel == null)
      {
         bindingExpressionLabel  = new LabelFigure("some binding expression");
         bindingExpressionLabel.setText(getRealModel().getName() + " := " + Expr2String.toString(getRealModel().getBindingExpression()));
         figure.addToAttributes(bindingExpressionLabel);
      }
      
      if(bindingExpressionLabel != null)
      {
         bindingExpressionLabel.setAutosized(true);
      }
      
      if(!getRealModel().getConstraints().isEmpty()
            && constraintsLabel == null)
      {
         
         constraintsLabel  = new LabelFigure("constraint:\n");
         for (Constraint c : getRealModel().getConstraints())
         {
            String text = constraintsLabel.getText();
            text += Expr2String.toString(c.getConstraintExpression()) + "\n";
            constraintsLabel.setText(text);
         }
         figure.addToAttributes(constraintsLabel);
      }
      
      if(constraintsLabel != null)
      {
         constraintsLabel.setAutosized(true);
      }
      
      
      figure.setBorderColor(ColorConstants.black);
      figure.getNameLabel().setForegroundColor(ColorConstants.black);
      figure.getCreateOrDeleteLabel().setName("");
      figure.getCreateOrDeleteLabel().setForegroundColor(ColorConstants.white);
      figure.setCreateOrDeleteLableVisible(false);
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
   public AbstractVariable getRealModel()
   {
      return (AbstractVariable) super.getRealModel();
   }

   @Override
   protected void refreshVisuals()
   {
      super.refreshVisuals();
      updateVisuals((UMLObjectFigure) getFigure());
   }
}
