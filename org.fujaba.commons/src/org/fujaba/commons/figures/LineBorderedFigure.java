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
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;

/**
 * @author Florian Klein (fklein@upb.de)
 * @author Last editor: $Author: travkin $
 * @version $Revision: 1838 $ $Date: 2009-06-26 21:25:30 +0200 (Fr, 26 Jun 2009) $
 *
 * A figure with a line border, directly supports setting
 * color, width and line style.
 * getBorder() returns an AbstractLineBorder, subclasses are
 * thus required to use a subclass of AbstractLineBorder as 
 * their border.
 * 
 * Intended as a replacement for BoderedFigure, but due to the
 * requirement to use an AbstractLineBorder, it is not a drop-in
 * replacement.
 */
public class LineBorderedFigure extends NodeFigure
{
   /**
    * @see org.eclipse.draw2d.Figure#getBorder()
    */
   @Override
   public ILineBorder getBorder()
   {
      return (ILineBorder)super.getBorder();      
   }
   
   /**
    * @see org.eclipse.draw2d.Figure#setBorder(org.eclipse.draw2d.Border)
    */
   @Override
   public void setBorder(Border border)
   {
      if(border instanceof ILineBorder)
         super.setBorder(border);
      else
         throw new IllegalArgumentException("LineBorderedFigure expects an AbstractLineBorder as its border.");
   }
      
   /**
    * Returns the style for the border lines, 
    * returns SWT.DEFAULT if no border is set.
    * 
    * @return the border line style
    * 
    * @see #setBorderLineStyle(int)
    */
   public int getBorderLineStyle()
   {
     if(this.getBorder() != null)
        return this.getBorder().getLineStyle();
     else
        return SWT.DEFAULT;
   }
   
   /**
    * Sets the style for the border lines. 
    * This has no effect if no border is set.
    * 
    * @param style the border line style
    */
   public void setBorderLineStyle(int style)
   {
      if(this.getBorder() != null)
      {
         if (this.getBorder().getLineStyle() != style)
         {
            this.getBorder().setLineStyle(style);
            this.repaint();
         }
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
   public int getBorderWidth()
   {
     if(this.getBorder() != null)
        return this.getBorder().getWidth();
     else
        return 0;
   }
   
   /**
    * Sets the width for the border lines. 
    * This has no effect if no border is set.
    * 
    * @param width the border width
    */
   public void setBorderWidth(int width)
   {
      if(this.getBorder() != null)
      {
         if (this.getBorder().getWidth() != width)
         {
            this.getBorder().setWidth(width);
            this.repaint();
         }
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
   public Color getBorderColor()
   {
     if(this.getBorder() != null)
        return this.getBorder().getColor();
     else
        return null;
   }
   
   /**
    * Sets the color for the border lines. 
    * This has no effect if no border is set.
    * 
    * @param color the border color
    */
   public void setBorderColor(Color color)
   {
      if(this.getBorder() != null)
      {
         if (this.getBorder().getColor() != color)
         {
            this.getBorder().setColor(color);
            this.repaint();
         }
      }
   }
   
}
