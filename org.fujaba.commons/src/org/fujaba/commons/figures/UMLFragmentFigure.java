package org.fujaba.commons.figures;


import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;

/**
 * Implementation of a standard UML 2.0 box.
 * 
 * @author Dietrich Travkin (travkin) / Florian Klein (fklein@upb.de)
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 */
public class UMLFragmentFigure extends LineBorderedFigure
{

   /**
    * The fragment label (top corner box)
    */
   private UMLFragmentLabelFigure label;


   /**
    * Default constructor for class UMLFragmentFigure
    * 
    */
   public UMLFragmentFigure()
   {
      this("");
   }


   /**
    * Constructor for class UMLFragmentFigure
    * 
    * @param name No description provided
    */
   public UMLFragmentFigure(String name)
   {
      setBorder(new RectangleBorder(ColorConstants.black, 1));
      this.label = new UMLFragmentLabelFigure(name);
      add(this.label);
      setBorderColor(ColorConstants.black);
      setBackgroundColor(ColorConstants.white);
      this.setOpaque(false);
   }


   /**
    * Access the fragment label (for modifying sublabels)
    * 
    * @return the fragment label
    */
   public UMLFragmentLabelFigure getLabel()
   {
      return label;
   }


   /**
    * Sets the text of the first sublabel of the fragment label
    * 
    * @param text The new text value
    */
   public void setText(String text)
   {
      this.label.setText(0, text);
   }


   /**
    * Sets an icon for the first sublabel of the fragment label
    * 
    * @param text The new text value
    */
   public void setIcon(Image image)
   {
      this.label.setIcon(0, image);
   }


   /**
    * @see de.uni_paderborn.commons4eclipse.gef.figures.LineBorderedFigure#setBorderColor(org.eclipse.swt.graphics.Color)
    */
   @Override
   public void setBorderColor(Color color)
   {
      super.setBorderColor(color);
      if (this.label != null)
      {
         this.label.setBorderColor(color);
      }
   }


   public void setBorderLineStle(int lineStyle)
   {
      super.setBorderLineStyle(lineStyle);
      if (this.label != null)
      {
         this.label.setBorderLineStyle(lineStyle);
      }
   }


   /**
    * @see de.uni_paderborn.commons4eclipse.gef.figures.LineBorderedFigure#setBorderWidth(int)
    */
   @Override
   public void setBorderWidth(int width)
   {
      super.setBorderWidth(width);
      if (this.label != null)
      {
         this.label.setBorderWidth(width);
      }
   }


   /**
    * Get the clientArea attribute of the UMLFragmentFigure object
    * 
    * @return The clientArea value
    * @see org.eclipse.draw2d.Figure#getClientArea(org.eclipse.draw2d.geometry.Rectangle)
    */
   @Override
   public Rectangle getClientArea(Rectangle rect)
   {
      Rectangle result = super.getClientArea(rect);
      result.y = result.y + this.label.getPreferredSize().height;
      return result;
   }


   /**
    * @see org.eclipse.draw2d.Figure#paintFigure(org.eclipse.draw2d.Graphics)
    */
   @Override
   protected void paintFigure(Graphics graphics)
   {
      super.paintFigure(graphics);
      this.label.setSize(this.label.getPreferredSize());
      this.label.setLocation(new Point(getClientArea().x, getClientArea().y
            - this.label.getSize().height));
      this.label.paint(graphics);
   }


   /**
    * Grow at least to size of label
    * 
    * @see org.eclipse.draw2d.Figure#getPreferredSize(int, int)
    */
   @Override
   public Dimension getPreferredSize(int wHint, int hHint)
   {
      Dimension fragmentPreferred = super.getPreferredSize(wHint, hHint);
      Dimension labelPreferred = this.label.getPreferredSize();

      Dimension preferred = new Dimension();

      preferred.height = Math.max(fragmentPreferred.height,
            labelPreferred.height);
      preferred.width = Math.max(fragmentPreferred.width, labelPreferred.width);

      return preferred;
   }


   /**
    * @return The minimumSize value
    * @see org.eclipse.draw2d.IFigure#getMinimumSize(int, int)
    */
   @Override
   public Dimension getMinimumSize(int wHint, int hHint)
   {
      Dimension fragmentMinimum = super.getMinimumSize(wHint, hHint);
      Dimension labelPreferred = this.label.getPreferredSize();

      Dimension minimum = new Dimension();

      minimum.height = Math.max(fragmentMinimum.height, labelPreferred.height);
      minimum.width = Math.max(fragmentMinimum.width, labelPreferred.width);

      return minimum;
   }

}
