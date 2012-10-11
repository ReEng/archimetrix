package org.fujaba.commons.figures;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LayoutManager;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.graphics.Image;
import org.fujaba.commons.Commons4EclipseFonts;



/**
 * UML 2.0 style label.
 * 
 * @author Dietrich Travkin (travkin) / Florian Klein (fklein@upb.de) [variable number of labels]
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 */
public class UMLFragmentLabelFigure extends LineBorderedGenericFigure
{

   List<LabelFigure> labels = null;


   /**
    * Creates an empty UML 2.0 label
    */
   public UMLFragmentLabelFigure()
   {
      setLayoutManager(new FragmentLabelFigureLayoutManager());
      setBackgroundColor(ColorConstants.white);
      setOpaque(true);
      this.labels = new ArrayList<LabelFigure>();
   }


   /**
    * Creates a UML 2.0 label containing text
    */
   public UMLFragmentLabelFigure(String text)
   {
      this();

      LabelFigure textLabel = new LabelFigure(text, Commons4EclipseFonts
            .getFont(Commons4EclipseFonts.FONT_DEFAULT_NORMAL));
      addLabel(textLabel);
   }


   /**
    * Creates a UML 2.0 label of the form "<b>prefix</b> text"
    */
   public UMLFragmentLabelFigure(String prefix, String text)
   {
      this();

      LabelFigure boldLabel = new LabelFigure(prefix, Commons4EclipseFonts
            .getFont(Commons4EclipseFonts.FONT_DEFAULT_BOLD));
      addLabel(boldLabel);

      LabelFigure textLabel = new LabelFigure(text, Commons4EclipseFonts
            .getFont(Commons4EclipseFonts.FONT_DEFAULT_NORMAL));
      addLabel(textLabel);
   }


   /**
    * Set the bold prefix on a label of the form prefix: text
    * 
    * @param prefix new prefix text
    * @deprecated use the generic setter setText(0,prefix) instead
    */
   public void setPrefix(String prefix)
   {
      if (this.labels.size() > 0)
      {
         this.labels.get(0).setText(prefix);
      }
      else
      {
         throw new IllegalArgumentException("UMLFragmentLabelFigure: Cannot "
               + "set prefix (first sublabel) as there are no sublabels.");
      }
   }


   /**
    * Set the text on a label of the form prefix: text
    * 
    * @param text the new text
    * @deprecated use the generic setter setText(1,text) instead
    */
   public void setText(String text)
   {
      if (this.labels.size() > 1)
      {
         this.labels.get(1).setText(text);
      }
      else
      {
         throw new IllegalArgumentException("UMLFragmentLabelFigure: Cannot "
               + "set text (second sublabel) as there is no second sublabel.");
      }
   }


   /**
    * Convenience method: Add an empty label
    */
   public void addLabel()
   {
      LabelFigure label = new LabelFigure();
      this.labels.add(label);
      add(label);
   }


   /**
    * Add a label
    * 
    * @param figure the label
    */
   public void addLabel(LabelFigure figure)
   {
      this.labels.add(figure);
      add(figure);
   }


   /**
    * Convenience method: Add an empty label at position index
    * 
    * @param index the insertion point
    */
   public void addLabel(int index)
   {
      if (index >= this.labels.size())
      {
         throw new IllegalArgumentException(
               "UMLFragmentLabelFigure: No such index.");
      }

      LabelFigure label = new LabelFigure();
      this.labels.add(index, label);
      add(label, index);
   }


   /**
    * Add a label at position index
    * 
    * @param index the insertion point
    * @param figure the label
    */
   public void addLabel(int index, LabelFigure figure)
   {
      if (index >= this.labels.size())
      {
         throw new IllegalArgumentException(
               "UMLFragmentLabelFigure: No such index.");
      }

      this.labels.add(index, figure);
      add(figure, index);
   }


   /**
    * Query the number of labels
    * 
    * @return the number of labels
    */
   public int sizeOfLabels()
   {
      return this.labels.size();
   }


   /**
    * Returns the label at position index
    * 
    * @param index
    * @return the label
    */
   public LabelFigure getLabel(int index)
   {
      if (index >= this.labels.size())
      {
         throw new IllegalArgumentException(
               "UMLFragmentLabelFigure: No such index.");
      }

      return this.labels.get(index);
   }


   /**
    * Removes the label at position index
    * 
    * @param index
    */
   public void removeLabel(int index)
   {
      if (index >= this.labels.size())
      {
         throw new IllegalArgumentException(
               "UMLFragmentLabelFigure: No such index.");
      }

      remove(this.labels.get(index));
      this.labels.remove(index);
   }


   /**
    * Removes a label
    * 
    * @param label
    */
   public boolean removeLabel(LabelFigure label)
   {
      remove(label);
      return this.labels.remove(label);
   }


   /**
    * Removes all labels
    */
   public void removeAllLabels()
   {
      this.labels.clear();
      removeAll();
   }


   /**
    * Convenience method: Set text directly
    * 
    * @param index
    * @param text
    */
   public void setText(int index, String text)
   {
      if (index >= this.labels.size())
      {
         throw new IllegalArgumentException(
               "UMLFragmentLabelFigure: No such index.");
      }

      this.labels.get(index).setText(text);
   }


   /**
    * Convenience method: Set icon directly
    * 
    * @param index
    * @param image
    */
   public void setIcon(int index, Image image)
   {
      if (index >= this.labels.size())
      {
         throw new IllegalArgumentException(
               "UMLFragmentLabelFigure: No such index.");
      }

      this.labels.get(index).setIcon(image);
   }


   /**
    * @see org.eclipse.draw2d.Figure#paintFigure(org.eclipse.draw2d.Graphics)
    */
   @Override
   protected void paintFigure(Graphics graphics)
   {
      Rectangle bounds = this.getBounds();

      Point p1;
      Point p2;
      Point p3;
      Point p4;

      p1 = new Point(bounds.x, bounds.y + bounds.height - 1);
      p2 = new Point(bounds.x + bounds.width - 6, bounds.y + bounds.height - 1);
      p3 = new Point(bounds.x + bounds.width - 1, bounds.y + bounds.height - 6);
      p4 = new Point(bounds.x + bounds.width - 1, bounds.y);

      graphics.pushState();

      try
      {
         int[] points = { p1.x, p1.y, p2.x, p2.y, p3.x, p3.y, p4.x, p4.y,
               bounds.x, bounds.y };

         if (this.isOpaque())
         {
            if (this.getBackgroundColor() != null)
               graphics.setBackgroundColor(this.getBackgroundColor());
            graphics.fillPolygon(points);
         }

         if (enableBorderStyle(graphics))
         {
            graphics.drawLine(p1, p2);
            graphics.drawLine(p2, p3);
            graphics.drawLine(p3, p4);
            disableBorderStyle(graphics);
         }
      }
      finally
      {
         graphics.popState();
      }
   }


   class FragmentLabelFigureLayoutManager implements LayoutManager
   {
      private final static int OFFSET_LEFT_X = 3;

      private final static int OFFSET_TOP_Y = 2;

      private final static int OFFSET_RIGHT_X = 7;

      private final static int OFFSET_BOTTOM_Y = 4;


      /**
       * @see org.eclipse.draw2d.LayoutManager#getConstraint(org.eclipse.draw2d.IFigure)
       */
      public Object getConstraint(IFigure child)
      {
         return null;
      }


      /**
       * @see org.eclipse.draw2d.LayoutManager#getMinimumSize(org.eclipse.draw2d.IFigure, int, int)
       */
      public Dimension getMinimumSize(IFigure container, int wHint, int hHint)
      {
         return getPreferredSize(container, wHint, hHint);
      }


      /**
       * @see org.eclipse.draw2d.LayoutManager#getPreferredSize(org.eclipse.draw2d.IFigure, int,
       *      int)
       */
      public Dimension getPreferredSize(IFigure container, int wHint, int hHint)
      {
         Dimension result = new Dimension(OFFSET_RIGHT_X, OFFSET_BOTTOM_Y);

         Iterator<LabelFigure> itl = labels.iterator();
         while (itl.hasNext())
         {
            Dimension labelDimensions = itl.next().getPreferredSize();
            result.width += labelDimensions.width;
            result.height = Math.max(result.height, labelDimensions.height
                  + OFFSET_BOTTOM_Y);
         }

         return result;
      }


      /**
       * @see org.eclipse.draw2d.LayoutManager#invalidate()
       */
      public void invalidate()
      {
      }


      /**
       * @see org.eclipse.draw2d.LayoutManager#layout(org.eclipse.draw2d.IFigure)
       */
      public void layout(IFigure container)
      {
         Rectangle bounds = getBounds();
         Point location = new Point(bounds.x + OFFSET_LEFT_X, bounds.y
               + OFFSET_TOP_Y);

         Iterator<LabelFigure> itl = labels.iterator();
         while (itl.hasNext())
         {
            LabelFigure label = itl.next();
            label.setLocation(location);
            label.setSize(label.getPreferredSize());
            Rectangle labelBounds = label.getBounds();
            location.x += labelBounds.width;
         }
      }


      /**
       * @see org.eclipse.draw2d.LayoutManager#remove(org.eclipse.draw2d.IFigure)
       */
      public void remove(IFigure child)
      {
      }


      /**
       * @see org.eclipse.draw2d.LayoutManager#setConstraint(org.eclipse.draw2d.IFigure,
       *      java.lang.Object)
       */
      public void setConstraint(IFigure child, Object constraint)
      {
      }
   }

}
