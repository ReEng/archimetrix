/**
 * 
 */
package org.fujaba.sdm.ui.edit.parts;

import org.fujaba.commons.figures.UMLObjectFigure;
import org.fujaba.sdm.ui.utils.Expr2String;
import org.storydriven.modeling.expressions.Expression;



/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 *
 */
public class PrimitiveVariableEditPart extends AbstractVariableEditPart
{

   @Override
   protected void updateVisuals(UMLObjectFigure figure)
   {
      super.updateVisuals(figure);
      
      String name = getRealModel().getName();
      Expression expr = getRealModel().getBindingExpression();
      if (expr != null)
      {
         name = getRealModel().getType().getName()  + " : " +  name + " := " + Expr2String.toString(expr);
      }
      figure.setName(name);
   }


}
