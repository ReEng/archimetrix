/**
 * 
 */
package org.fujaba.commons.figures;

import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.swt.SWT;

/**
 * @author Dietrich Travkin (travkin)
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 */
public abstract class FigureWithAntialiasingSupport extends Figure
{
   private boolean antialias = (SWT.DEFAULT == SWT.ON);

   /**
    * Returns <code>true</code> if anti-aliasing is switched on,
    * <code>false</code> otherwise.
    * 
    * @return Returns the anti-aliasing setting.
    */
   public boolean isAntialiasing()
   {
      return this.antialias;
   }
   
   /**
    * Sets whether anti-aliasing should be enabled for this figure.
    * Consider that this is just a hint. The {@link IGraphicsSettingsStrategy}
    * decides whether the settings are applied or not.
    * 
    * When painting this figure {@link Graphics#setAntialias(int)}
    * will be called with {@link SWT#ON} or {@link SWT#OFF}.
    * If this value is not set, {@link SWT#DEFAULT} is used.
    * 
    * @param antialias the anti-aliasing setting
    */
   public void setAntialias(boolean antialiasing)
   {
      this.antialias = antialiasing;
   } 

   /**
    * Paints this figure and its children. This method enables applying additional
    * settings before drawing the figure using an {@link IGraphicsSettingsStrategy}.
    * This method is not intended to be overridden. Use the method
    * {@link Commons4EclipsePlugin#setGraphicsSettingsStrategy(IGraphicsSettingsStrategy)}
    * to adapt the behavior.
    * 
    * @see org.eclipse.draw2d.Figure#paint(org.eclipse.draw2d.Graphics)
    * @see Commons4EclipsePlugin#setGraphicsSettingsStrategy(IGraphicsSettingsStrategy)
    */
   @Override
   public void paint(Graphics graphics)
   {
      /*
       * FIXME this is a copy of org.eclipse.draw2d.Figure#paint(org.eclipse.draw2d.Graphics)
       * find another way to set up the Graphics object before drawing.
       */
      if (getLocalBackgroundColor() != null)
         graphics.setBackgroundColor(getLocalBackgroundColor());
      if (getLocalForegroundColor() != null)
         graphics.setForegroundColor(getLocalForegroundColor());
      if (getLocalFont() != null)
         graphics.setFont(getLocalFont());

      graphics.pushState();
      try
      {
         // prepare for painting the figure
         graphics.setAntialias(SWT.ON);
         
         paintFigure(graphics);
         graphics.restoreState();
         paintClientArea(graphics);
         
         graphics.pushState();
         try
         {          
            paintBorder(graphics);
         }
         finally
         {
            graphics.popState();
         }
         
      }
      finally
      {
         graphics.popState();
      }
   }
   
}
