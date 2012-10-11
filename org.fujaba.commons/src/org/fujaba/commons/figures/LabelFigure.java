/*
 * The FUJABA ToolSuite for Eclipse project:
 *
 *   FUJABA is the acronym for 'From Uml to Java And Back Again'
 *   and originally aims to provide an environment for round-trip
 *   engineering using UML as visual programming language. During
 *   the last years, the environment has become a base for several
 *   research activities, e.g. distributed software, database
 *   systems, modelling mechanical and electrical systems and
 *   their simulation. Thus, the environment has become a project,
 *   where this source code is part of. Further details are avail-
 *   able via http://www.fujaba.de
 *
 *      Copyright (C) Fujaba Development Group
 *
 *   This library is free software; you can redistribute it and/or
 *   modify it under the terms of the GNU Lesser General Public
 *   License as published by the Free Software Foundation; either
 *   version 2.1 of the License, or (at your option) any later version.
 *
 *   You should have received a copy of the GNU Lesser General Public
 *   License along with this library; if not, write to the Free
 *   Software Foundation, Inc., 59 Temple Place, Suite 330, Boston,
 *   MA 02111-1307, USA or download the license under
 *   http://www.gnu.org/copyleft/lesser.html
 *
 * WARRANTY:
 *
 *   This library is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 *   GNU Lesser General Public License for more details.
 *
 * Contact address:
 *
 *   Fujaba Management Board
 *   Software Engineering Group
 *   University of Paderborn
 *   Warburgerstr. 100
 *   D-33098 Paderborn
 *   Germany
 *
 *   URL  : http://www.fujaba.de
 *   email: info@fujaba.de
 *
 */
package org.fujaba.commons.figures;


import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;
import org.fujaba.commons.Commons4EclipseFonts;



/**
 * @author Dietrich Travkin
 * @author Last editor: $Author: travkin $
 * @version $Revision: 1557 $ $Date: 2008-05-05 17:41:20 +0200 (Mo, 05 Mai 2008) $
 */
public class LabelFigure extends Label
{
   private boolean underlined = false;
   
   private boolean underlineMultipleLines = true;

   private boolean autosized = false;


   public LabelFigure()
   {
      super();
      this.setFont(Commons4EclipseFonts
            .getFont(Commons4EclipseFonts.FONT_DEFAULT_NORMAL));
   }


   public LabelFigure(String s)
   {
      this(s, Commons4EclipseFonts
            .getFont(Commons4EclipseFonts.FONT_DEFAULT_NORMAL));
   }


   public LabelFigure(String s, Font font)
   {
      super(s);
      if (font != null)
      {
         this.setFont(font);
      }
      else
      {
         this.setFont(Commons4EclipseFonts
               .getFont(Commons4EclipseFonts.FONT_DEFAULT_NORMAL));
      }
   }


   public LabelFigure(Image i)
   {
      super(i);
      this.setFont(Commons4EclipseFonts
            .getFont(Commons4EclipseFonts.FONT_DEFAULT_NORMAL));
   }


   public LabelFigure(String s, Image i)
   {
      this(s, i, Commons4EclipseFonts
            .getFont(Commons4EclipseFonts.FONT_DEFAULT_NORMAL));
   }


   public LabelFigure(String s, Image i, Font font)
   {
      super(s, i);
      if (font != null)
      {
         this.setFont(font);
      }
      else
      {
         this.setFont(Commons4EclipseFonts
               .getFont(Commons4EclipseFonts.FONT_DEFAULT_NORMAL));
      }
   }


   /**
    * Returns this figure's name.
    * 
    * @return The name of the figure
    */
   public String getName()
   {
      return this.getText();
   }


   /**
    * Sets this figure's name.
    * 
    * @param name The new name of the figure
    */
   public void setName(String name)
   {
      this.setText(name);
   }


   @Override
   public void setText(String s)
   {
      super.setText(s);
      autosize();
   }


   @Override
   public void setIcon(Image image)
   {
      super.setIcon(image);
      autosize();
   }


   public void setUnderlined(boolean underlined)
   {
      this.underlined = underlined;
      this.repaint();
   }


   /**
    * @return autosized?
    */
   public boolean isAutosized()
   {
      return autosized;
   }


   /**
    * @param enable/disable autosizing
    */
   public void setAutosized(boolean autosize)
   {
      this.autosized = autosize;
      autosize();
   }


   private void autosize()
   {
      if (this.autosized == true)
      {
         this.setSize(this.getPreferredSize());
      }
   }


   /**
    * @return underlined?
    */
   public boolean isUnderlined()
   {
      return underlined;
   }

   /**
    * Determines whether only the last one or all lines (if more than one exist)
    * of this label's text are to be underlined.
    *
    * @param underlineMultipleLines determines whether only the last one or all
    * lines of this label's text are to be underlined.
    */
   public void setUnderlineMultipleLines(boolean underlineMultipleLines)
   {
      this.underlineMultipleLines = underlineMultipleLines;
   }   


   /**
    * @see org.eclipse.draw2d.Figure#paintFigure(org.eclipse.draw2d.Graphics)
    */
   @Override
   protected void paintFigure(Graphics graphics)
   {
      super.paintFigure(graphics);
      if (this.underlined)
      {
         Rectangle bounds = this.getBounds();
         graphics.translate(bounds.x, bounds.y);

         // draw line
         Dimension size = this.getSubStringTextSize();
         Point location = this.getTextLocation();

         if (this.underlineMultipleLines)
         {
            int lines = 1;
            int index = -1;
            String text = this.getName();
            while ((index = text.indexOf(System.getProperty("line.separator"))) != -1)
            {
               lines++;
               text = text.substring(index + 1);
            }
            for (int lineCounter = 1; lineCounter < lines; lineCounter++)
            {
               graphics.drawLine(location.x, location.y + size.height
                     * lineCounter / lines - 1, location.x + size.width,
                     location.y + size.height * lineCounter / lines - 1);
            }
         }
         graphics.drawLine(location.x, location.y + size.height - 1, location.x
               + size.width, location.y + size.height - 1);

         graphics.translate(-bounds.x, -bounds.y);
      }
   }


   /**
    * @see org.eclipse.draw2d.Label#getTextSize()
    */
   @Override
   protected Dimension getTextSize()
   {
      Dimension size = super.getTextSize().getCopy();

      if (!underlined)
      {
         return size.expand(2, 0);
      }
      else
      {
         return size.expand(2, 1);
      }
   }


   /**
    * @see org.eclipse.draw2d.IFigure#setFont(org.eclipse.swt.graphics.Font)
    */
   @Override
   public void setFont(Font f)
   {
      super.setFont(f);
      this.repaint();
   }
}