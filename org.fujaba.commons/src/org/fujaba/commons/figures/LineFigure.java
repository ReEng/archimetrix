/**
 * 
 */
package org.fujaba.commons.figures;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;

/**
 * @author Dietrich Travkin (travkin)
 * @author Last editor: $Author: fklein $
 * @version $Revision: 1207 $ $Date: 2006-12-08 19:43:39 +0100 (Fr, 08 Dez 2006) $
 *
 */
public class LineFigure extends Figure
{
   private int lineStyle;
   private int orientation;
   private int width;
   private Color color = ColorConstants.black;
   
   public LineFigure()
   {
      this(1, SWT.LINE_SOLID, SWT.HORIZONTAL);
   }
   
   public LineFigure(int width, int style, int orientation)
   {
      this.setOpaque(true);
      this.width = width;
      this.lineStyle = style;
      this.orientation = orientation;
   }

   public LineFigure(Color color, int width, int style, int orientation)
   {
      this.setOpaque(true);
      this.width = width;
      this.lineStyle = style;
      this.orientation = orientation;
      this.color = color;
   }
   
   /**
    * @return the color
    */
   public Color getColor()
   {
      return color;
   }

   /**
    * @param color the color to set
    */
   public void setColor(Color color)
   {
      this.color = color;
   }

   /**
    * @return the lineStyle
    */
   public int getLineStyle()
   {
      return lineStyle;
   }

   /**
    * @param lineStyle the lineStyle to set
    */
   public void setLineStyle(int lineStyle)
   {
      this.lineStyle = lineStyle;
   }

   /**
    * @return the width
    */
   public int getWidth()
   {
      return width;
   }

   /**
    * @param width the width to set
    */
   public void setWidth(int width)
   {
      this.width = width;
   }

   /**
    * @see org.eclipse.draw2d.Figure#paintFigure(org.eclipse.draw2d.Graphics)
    */
   @Override
   protected void paintFigure(Graphics graphics)
   {
      if (isOpaque())
      {
         graphics.pushState();
         
         try
         {
            graphics.setLineStyle(this.lineStyle);
            graphics.setLineWidth(this.width);
            graphics.setForegroundColor(this.color);
         
            Rectangle bounds = this.getBounds();
            if (this.orientation == SWT.HORIZONTAL)
            {
               int y = bounds.y + bounds.height/2;
               graphics.drawLine(bounds.x, y, bounds.x + bounds.width, y);
            }
            else
            {
               int x = bounds.x + bounds.width/2;
               graphics.drawLine(x, bounds.y, x, bounds.y + bounds.height);
            }
         }
         finally
         {
            graphics.popState();
         }        
      }
   }

   /**
    * @see org.eclipse.draw2d.Figure#getPreferredSize(int, int)
    */
   @Override
   public Dimension getPreferredSize(int wHint, int hHint)
   {
      if (this.orientation == SWT.HORIZONTAL)
      {
         return new Dimension(wHint, this.width);
      }
      else
      {
         return new Dimension(this.width, hHint);
      }
   }
}
