/**
 * 
 */
package org.fujaba.commons.figures;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;

/**
 * @author Dietrich Travkin (travkin) / Florian Klein (fklein)
 * @author Last editor: $Author: fklein $
 * @version $Revision: 1334 $ $Date: 2007-02-16 19:40:02 +0100 (Fr, 16 Feb 2007) $
 */
public class LineBorderedEllipseContainer extends LineBorderedEllipseFigure
{
   private final IFigure contents;
   
   public LineBorderedEllipseContainer(IFigure contents)
   {
      this.contents = contents;      
      this.add(this.contents);
   }
   
   public IFigure getContents()
   {
      return this.contents;      
   }
     
   /**
    * @see org.eclipse.draw2d.Figure#getPreferredSize(int, int)
    */
   @Override
   public Dimension getPreferredSize(int wHint, int hHint)
   {
      Dimension size = this.contents.getPreferredSize(wHint, hHint);
      
      double a = 0.5d * size.width * Math.sqrt(2);  // x == 0.5d * size.width
      double b = 0.5d * size.height * Math.sqrt(2); // y == 0.5d * size.height
      
      int width = 2 * (int) Math.round(a);
      int height = 2 * (int) Math.round(b);
      
      return new Dimension(width + this.getBorderWidth() * 2,
            height + this.getBorderWidth() * 2);
   }

   /**
    * @see org.eclipse.draw2d.Figure#layout()
    */
   @Override
   protected void layout()
   {
      Rectangle bounds = this.getBounds().getCopy();
      bounds.x += this.getBorderWidth();
      bounds.y += this.getBorderWidth();
      bounds.width -= this.getBorderWidth() * 2;
      bounds.height -= this.getBorderWidth() * 2;
      
      double a = bounds.width*0.5d;
      double b = bounds.height*0.5d;
      
      int x = (int) Math.round(Math.sqrt(0.5d*a*a));
      int y = (int) Math.round((b*x)/a);
      
      int new_x = bounds.x + (int) Math.round(a - x);
      int new_y = bounds.y + (int) Math.round(b - y);
      int new_width = bounds.width - 2 * (int) Math.round(a - x);
      int new_height = bounds.height - 2 * (int) Math.round(b - y);
      
      this.contents.setBounds(new Rectangle(new_x, new_y, new_width, new_height));
   }
}
