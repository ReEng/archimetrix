package org.fujaba.commons.figures;


import org.eclipse.draw2d.Border;
import org.eclipse.swt.graphics.Color;


public interface ILineBorder extends Border
{   
   /**
    * Returns the line color of this border.
    * @return The line color of this border
    */
   public abstract Color getColor();


   /**
    * Sets the line color of this border.
    * @param color The line color
    */
   public abstract void setColor(Color color);


   /**
    * Returns the line lineStyle of this border
    * @return the lineStyle
    */
   public abstract int getLineStyle();


   /**
    * Sets the line style for this border, which must be one of the
    * constants SWT.LINE_SOLID, SWT.LINE_DASH, SWT.LINE_DOT,
    * SWT.LINE_DASHDOT or SWT.LINE_DASHDOTDOT. 
    * @param lineStyle the line style to set
    */
   public abstract void setLineStyle(int lineStyle);


   /**
    * Returns the current width of this border
    * @return the width
    */
   public abstract int getWidth();


   /**
    * Sets the width of this border
    * @param width the width to set
    */
   public abstract void setWidth(int width);
}