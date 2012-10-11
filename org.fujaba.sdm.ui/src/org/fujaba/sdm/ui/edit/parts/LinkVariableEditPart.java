/**
 * 
 */
package org.fujaba.sdm.ui.edit.parts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.ConnectionLocator;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.fujaba.commons.edit.parts.AbstractEdgeEditPart;
import org.fujaba.commons.figures.CrossFigure;
import org.fujaba.commons.figures.DoublePolylineConnection;
import org.fujaba.commons.figures.utils.ConnectionDecorationFactory;
import org.fujaba.sdm.ui.utils.Expr2String;
import org.storydriven.modeling.patterns.AbstractLinkVariable;
import org.storydriven.modeling.patterns.BindingOperator;
import org.storydriven.modeling.patterns.BindingSemantics;
import org.storydriven.modeling.patterns.LinkVariable;
import org.storydriven.modeling.patterns.Path;


/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 *
 */
public class LinkVariableEditPart extends AbstractEdgeEditPart
{
   public static final String LABEL_FRENCH_QUOTES_LEFT = "\u00ab"; // guillements
   
   public static final String LABEL_FRENCH_QUOTES_RIGHT = "\u00bb"; // guillements

   public static final String LABEL_CREATE = LABEL_FRENCH_QUOTES_LEFT
         + "create" + LABEL_FRENCH_QUOTES_RIGHT;
   
   public static final String LABEL_DESTROY = LABEL_FRENCH_QUOTES_LEFT
         + "destroy" + LABEL_FRENCH_QUOTES_RIGHT;

   public static final String LABEL_DELETE = LABEL_FRENCH_QUOTES_LEFT
         + "delete" + LABEL_FRENCH_QUOTES_RIGHT;
   
   
   private CrossFigure crossFigure = null;
   private ConnectionLocator crossLocator = null;
   
   @Override
   protected IFigure createFigure()
   {
      if(getRealModel() instanceof Path)
      {
         this.connection = new DoublePolylineConnection();
      }
      else
      {
         connection = new PolylineConnection();
      }   
      
      connection.setTargetDecoration(ConnectionDecorationFactory.createDecoration(ConnectionDecorationFactory.OPEN_ARROW));
      
      setFigure(connection);
      
      updateFigure();
      return figure;
   }

   @Override
   public AbstractLinkVariable getRealModel()
   {
      return (AbstractLinkVariable) super.getRealModel();
   }
   
   protected void updateFigure()
   {
      AbstractLinkVariable var = getRealModel();
      
      
      
      if (var.getBindingSemantics() == BindingSemantics.OPTIONAL)
      {
        connection.setLineStyle(SWT.LINE_DASH);
      }
      else
      {
        connection.setLineStyle(SWT.LINE_SOLID);
      }
      
      
      if (var.getBindingOperator() == BindingOperator.CREATE)
      {
         Color c = ColorConstants.darkGreen;
         connection.setForegroundColor(c);
         this.placeReadingDirectionArrow(true, c, c);
         this.placeLabel(LABEL_CREATE + "\n" + this.getLinkName());
      }
      else if (var.getBindingOperator() == BindingOperator.DESTROY)
      {
         Color c = ColorConstants.red;
         connection.setForegroundColor(c);
         this.placeReadingDirectionArrow(true, c, c);
         this.placeLabel(LABEL_DESTROY + "\n" + this.getLinkName());
      }
      else
      {
         connection.setForegroundColor(ColorConstants.black);
         this.placeReadingDirectionArrow(true);
         this.placeLabel(this.getLinkName());
      }

      
      if (var.getBindingSemantics() == BindingSemantics.NEGATIVE)
      {
       if (crossFigure == null)
       {
          crossFigure = new CrossFigure();
          crossLocator = new ConnectionLocator (
                  connection, ConnectionLocator.MIDDLE);
       }
         connection.add(crossFigure, crossLocator, -1);
      }
      else if (crossFigure != null && crossFigure.getParent() == connection)
      {
       connection.remove(crossFigure);
      }
   }
   
   /**
    * Get the linkName attribute of the UMLConnectionEditPart object
    *
    * @return   The linkName value
    */
   protected String getLinkName()
   {
      String name = getRealModel().getName();
      if(getRealModel() instanceof LinkVariable)
      {
         LinkVariable var = (LinkVariable) getRealModel();
         if(var.getTargetEnd() != null)
         {
            name = "ERef: " + var.getTargetEnd().getName();
         }
         else
         {
            name = "ERef: null, Name: " + name;
         }

         if (var.getQualifierExpression() != null)
         {
            name += "[" + Expr2String.toString(var.getQualifierExpression()) + "]";
         }
      }
      
      
      
      // create the constraints string, if some exist
//      Iterator iter =  this.getModel().iteratorOfConstraints();
//      name += this.getConstraintsString (iter);

      return  name;
   }
}
