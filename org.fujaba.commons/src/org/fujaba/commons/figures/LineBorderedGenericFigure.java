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

import org.eclipse.draw2d.Border;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;


/**
 * @author Florian Klein (fklein@upb.de)
 * @author Last editor: $Author: mvdetten $
 * @version $Revision: 1702 $ $Date: 2009-02-26 10:58:41 +0100 (Do, 26 Feb 2009) $
 *
 * A LineBorderedFigure that acts as its own line border - thus, for custom shapes,
 * it is not necessary to always define a figure and a matching border - they can be drawn 
 * together.  
 */
public abstract class LineBorderedGenericFigure extends LineBorderedFigure
{
   private Color color = ColorConstants.black;
   
   private int width = 1;
      
   private int lineStyle = SWT.LINE_SOLID;
   
   /**
    * Convenience style setter
    * 
    * Write in your paint method: 
    *   if(enableBorderStyle(graphics))
         {
            // Draw border
            disableBorderStyle(graphics);
         }
    * 
    * @param   graphics 
    * @return  success?
    */
   protected boolean enableBorderStyle(Graphics graphics) 
   {      
      graphics.pushState();
      
      try
      {
         graphics.setForegroundColor(this.color);
         graphics.setLineStyle(this.lineStyle);
         graphics.setLineWidth(this.width);
         return true;
      }
      catch (Exception e)
      {
         graphics.popState();
         return false;
      }
   }   
   
   /**
    * Just for symmetry, pops state
    * 
    * @param graphics
    */
   protected void disableBorderStyle(Graphics graphics) 
   {      
      graphics.popState();
   }   
   
   /* (non-Javadoc)
    * @see org.eclipse.draw2d.Figure#getBorder()
    */
   @Override
   public ILineBorder getBorder()
   {
      return null;      
   }
   
   /* (non-Javadoc)
    * @see org.eclipse.draw2d.Figure#setBorder(org.eclipse.draw2d.Border)
    */
   @Override
   public void setBorder(Border border)
   {
      throw new UnsupportedOperationException("LineBorderedGenericFigure acts as its own border.");
   }
      
   /**
    * Returns the style for the border lines, 
    * returns SWT.DEFAULT if no border is set.
    * 
    * @return the border line style
    * 
    * @see #setBorderLineStyle(int)
    */
   @Override
   public int getBorderLineStyle()
   {
     return this.lineStyle;
   }
   
   /**
    * Sets the style for the border lines. 
    * This has no effect if no border is set.
    * 
    * @param style the border line style
    */
   @Override
   public void setBorderLineStyle(int style)
   {
      if (this.lineStyle != style)
      {
         this.lineStyle = style;
         this.repaint();         
      }      
   }
   
   /**
    * Returns the width for the border lines, 
    * returns 0 if no border is set.
    * 
    * @return the border width
    * 
    * @see #setBorderWidth(int)
    */
   @Override
   public int getBorderWidth()
   {
     return this.width;
   }
   
   /**
    * Sets the width for the border lines. 
    * This has no effect if no border is set.
    * 
    * @param width the border width
    */
   @Override
   public void setBorderWidth(int width)
   {
      if (this.width != width)
      {
         this.width = width;
         this.repaint();         
      }
   }
   
   /**
    * Returns the color for the border lines, 
    * returns null if no border is set.
    * 
    * @return the border color
    * 
    * @see #setBorderColor(Color)
    */
   @Override
   public Color getBorderColor()
   {
     return this.color;
   }
   
   /**
    * Sets the color for the border lines. 
    * This has no effect if no border is set.
    * 
    * @param color the border color
    */
   @Override
   public void setBorderColor(Color color)
   {
      if (this.color != color)
      {
         this.color = color;
         this.repaint();         
      }
   }
 }
