/**
 * 
 */
package org.fujaba.commons.figures;


import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;


/**
 * <p>
 * This class implements a rectangle figure that contains a column of compartments, Each compartment
 * can contain other figures that are layed out using a vertical {@link ToolbarLayout}. For each
 * compartment a line separator can be defined. The separator (if defined) is drawn below the
 * compartment, if the compartment is not empty and another non-empty following compartment exists.
 * </p>
 * <p>
 * Subclasses are intended to use the methods {@link #addCompartment(String, int, int)} or
 * {@link #addCompartment(String)} to create the compartments during initialization of the figure.
 * Additional method can use {@link #addFigureToCompartment(String, IFigure)} and
 * {@link #removeFigureFromCompartment(String, IFigure)} to add or remove figure to or from a
 * specific compartment created before. It is not intended to add or remove compartments after
 * initialization of the figure.
 * </p>
 * 
 * @author Dietrich Travkin (travkin) / Florian Klein (fklein)
 * @author Last editor: $Author: oleg82 $
 * @version $Revision: 1906 $ $Date: 2009-12-16 13:41:54 +0100 (Mi, 16 Dez 2009) $
 */
public abstract class LineBorderedRectangleWithCompartmentsFigure extends
      LineBorderedFigure
{
   private LinkedHashMap<String, IFigure> compartments = new LinkedHashMap<String, IFigure>();

   private HashMap<String, LineFigure> separators = new HashMap<String, LineFigure>();


   public LineBorderedRectangleWithCompartmentsFigure()
   {
      ToolbarLayout layout = new ToolbarLayout();
      layout.setVertical(true);
      layout.setMinorAlignment(ToolbarLayout.ALIGN_TOPLEFT);
      layout.setStretchMinorAxis(true);

      this.setBorder(new RectangleBorder());     
      this.setLayoutManager(layout);

      this.setOpaque(true);
   }


   /**
    * Sets the style for the border lines. This has no effect if no border is set.
    * 
    * @param style the border line style
    */
   @Override
   public void setBorderLineStyle(int style)
   {
      super.setBorderLineStyle(style);
      Iterator<LineFigure> its = separators.values().iterator();
      while (its.hasNext())
         its.next().setLineStyle(style);
   }


   /**
    * Sets the width for the border lines. This has no effect if no border is set.
    * 
    * @param width the border width
    */
   @Override
   public void setBorderWidth(int width)
   {
      super.setBorderWidth(width);
      Iterator<LineFigure> its = separators.values().iterator();
      while (its.hasNext())
         its.next().setWidth(width);
   }


   /**
    * Sets the color for the border lines. This has no effect if no border is set.
    * 
    * @param color the border color
    */
   @Override
   public void setBorderColor(Color color)
   {
      super.setBorderColor(color);
      Iterator<LineFigure> its = separators.values().iterator();
      while (its.hasNext())
         its.next().setColor(color);
   }


   /**
    * <p>
    * Adds an additional compartment to this figure. This compartment can be accessed using the
    * given key.
    * </p>
    * <p>
    * This method is to be called by subclasses during intialization. It is not intended to add or
    * remove compartments after creating this figure. If a compartment with the given key already
    * exists an exception is thrown.
    * </p>
    * <p>
    * The additional parameters define, if a seperator line below this new compartment is to be
    * created. If it is to be created, the line style and width (greater zero) can be defined.
    * </p>
    * <p>
    * The line style has to be one of the following:
    * <ul>
    * <li>{@link SWT#NONE}</li>: Creates no separator, line width can be any value in this case
    * <li>{@link SWT#LINE_SOLID}</li>: Creates a solid line
    * <li>{@link SWT#LINE_DASH}</li>: Creates a dashed line
    * <li>{@link SWT#LINE_DOT}</li>: Creates an dotted line
    * <li>{@link SWT#LINE_DASHDOT}</li>: Creates a alternating dash-dot line
    * <li>{@link SWT#LINE_DASHDOTDOT}</li>: Creates a dash-dot-dot line
    * </ul>
    * </p>
    * 
    * @param compartmentKey the key for the new compartment
    * @param followingLineStyle the swt line style ({@link SWT#NONE} for no line) for the separator
    *           line
    * @param followingLineWidth the width for the separator line
    */
   protected void addCompartment(String compartmentKey, int followingLineStyle,
         int followingLineWidth)
   {
      if (compartments.containsKey(compartmentKey))
      {
         throw new UnsupportedOperationException(
               "A compartment with the given key already exists.");
      }

      if (followingLineStyle != SWT.NONE && followingLineWidth < 1)
      {
         throw new IllegalArgumentException(
               "The line width must be at least 1.");
      }

      Figure compartment = new Figure();
      compartment.setOpaque(true);

      ToolbarLayout layout = new ToolbarLayout();
      layout.setVertical(true);
      layout.setMinorAlignment(ToolbarLayout.ALIGN_TOPLEFT);
      layout.setStretchMinorAxis(true);

      compartment.setLayoutManager(layout);

      compartments.put(compartmentKey, compartment);
      this.add(compartment);

      if (followingLineStyle != SWT.NONE)
      {
         LineFigure separator = new LineFigure(followingLineWidth,
               followingLineStyle, SWT.HORIZONTAL);
         separator.setForegroundColor(ColorConstants.black);
         separators.put(compartmentKey, separator);
         this.add(separator);
      }
   }


   /**
    * <p>
    * Adds an additional compartment to this figure. This compartment can be accessed using the
    * given key. It is separated from the following compartment by a solid line of width 1.
    * </p>
    * <p>
    * This method is to be called by subclasses during intialization. It is not intended to add or
    * remove compartments after creating this figure. If a compartment with the given key already
    * exists an exception is thrown.
    * </p>
    * 
    * @param compartmentKey the key for the new compartment
    * 
    * @see #addCompartment(String, int, int)
    */
   protected void addCompartment(String compartmentKey)
   {
      this.addCompartment(compartmentKey, SWT.LINE_SOLID, 1);
   }


   public IFigure getCompartment(String compartmentKey)
   {
      return this.compartments.get(compartmentKey);
   }

   /**
    * Adds the given figure to the compartment represented by the given key. This has no effect, if
    * the compartment does already contain the given figure.
    * 
    * @param compartmentKey the key of the compartment for the insertion
    * @param figure the figure to be inserted
    */
   protected void addFigureToCompartment(String compartmentKey, IFigure figure)
   {
      addFigureToCompartment(compartmentKey, figure, -1);
   }

   /**
    * Adds the given figure to the compartment represented by the given key. This has no effect, if
    * the compartment does already contain the given figure.
    * 
    * @param compartmentKey the key of the compartment for the insertion
    * @param figure the figure to be inserted
    * @param index at which the figure should be inserted
    */
   protected void addFigureToCompartment(String compartmentKey, IFigure figure, int index)
   {
      if (!this.compartments.containsKey(compartmentKey))
      {
         throw new IllegalArgumentException(
               "There is no compartment with the given key.");
      }

      IFigure compartment = this.compartments.get(compartmentKey);
      if (!compartment.getChildren().contains(figure))
      {
         compartment.add(figure, index);
      }

      this.revalidateSeparators();
   }


   /**
    * Removes the given figure from the compartment represented by the given key. This has no
    * effect, if the compartment does not contain the given figure.
    * 
    * @param compartmentKey the key of the compartment for the removal
    * @param figure the figure to be removed
    */
   protected void removeFigureFromCompartment(String compartmentKey,
         IFigure figure)
   {
      if (!this.compartments.containsKey(compartmentKey))
      {
         throw new IllegalArgumentException(
               "There is no compartment with the given key.");
      }

      IFigure compartment = this.compartments.get(compartmentKey);
      if (compartment.getChildren().contains(figure))
      {
         compartment.remove(figure);
      }

      this.revalidateSeparators();
   }


   private void revalidateSeparators()
   {
      // remove all separators first
      List<?> children = this.getChildren();
      Iterator<String> iter = this.separators.keySet().iterator();
      while (iter.hasNext())
      {
         String key = iter.next();
         LineFigure separator = this.separators.get(key);
         if (children.contains(separator))
         {
            this.remove(separator);
         }
      }

      // add all necessary separators
      LineFigure currentSeparator = null;
      int index = -1;
      Iterator<String> compartmentKeyIter = this.compartments.keySet()
            .iterator();
      while (compartmentKeyIter.hasNext())
      {
         String compartmentKey = compartmentKeyIter.next();
         IFigure compartment = this.compartments.get(compartmentKey);

         if (compartment.getChildren().size() > 0)
         {
            children = this.getChildren();
            if (currentSeparator != null
                  && !children.contains(currentSeparator))
            {
               this.add(currentSeparator, index);
            }
            currentSeparator = this.separators.get(compartmentKey);
            index = children.indexOf(compartment) + 1;
         }
      }
   }


   @Override
   public Dimension getPreferredSize(int wHint, int hHint)
   {
      Iterator<String> figureIter = this.compartments.keySet().iterator();
      
      Dimension dim = super.getPreferredSize(wHint, hHint);
      
      while(figureIter.hasNext())
      {
         IFigure figure = this.compartments.get(figureIter.next());
         if(figure != null)
         {
            Dimension subDim = figure.getPreferredSize();
            if(!dim.contains(subDim))
            {
               dim = dim.getUnioned(subDim);
            }
         }
      }
      
      return dim;
   }


}
