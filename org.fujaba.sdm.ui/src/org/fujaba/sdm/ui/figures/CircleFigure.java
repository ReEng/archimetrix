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
package org.fujaba.sdm.ui.figures;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.graphics.Color;
import org.fujaba.commons.figures.FigureWithAntialiasingSupport;



/**
 * @author    Dietrich Travkin
 * @author    Last editor: $Author: travkin $
 * @version   $Revision: 1830 $ $Date: 2009-06-25 16:58:12 +0200 (Do, 25 Jun 2009) $
 */
public class CircleFigure extends FigureWithAntialiasingSupport
{
   /**
    * No comment provided by developer, please add a comment to improve documentation.
    */
   private Color myColor;


   /**
    *Constructor for class CircleFigure
    */
   public CircleFigure()
   {
      this (ColorConstants.black);
   }


   /**
    *Constructor for class CircleFigure
    *
    * @param fillColor  No description provided
    */
   public CircleFigure(Color fillColor)
   {
      super();
      this.myColor = fillColor;
      this.setBackgroundColor (fillColor);
      this.setAntialias(true);
   }


   /**
    * @param graphics  No description provided
    * @see             org.eclipse.draw2d.Figure#paintFigure(org.eclipse.draw2d.Graphics)
    */
   @Override
   protected void paintFigure(Graphics graphics)
   {
      if (isOpaque())
      {
         int size = Math.min (getBounds().height, getBounds().width);
         int x = getBounds().x + getBounds().width / 2 - size / 2;
         int y = getBounds().y + getBounds().height / 2 - size / 2;
         graphics.fillOval (x, y, size, size);
      }
   }


   /**
    * Get the color attribute of the CircleFigure object
    *
    * @return   The color value
    */
   protected Color getColor()
   {
      return this.myColor;
   }


   /**
    * @param rect  The new bounds value
    * @see         org.eclipse.draw2d.IFigure#setBounds(org.eclipse.draw2d.geometry.Rectangle)
    */
   @Override
   public void setBounds(Rectangle rect)
   {
      int size = Math.min (rect.height, rect.width);
      int x = rect.x + rect.width / 2 - size / 2;
      int y = rect.y + rect.height / 2 - size / 2;
      rect.height = size;
      rect.width = size;
      rect.x = x;
      rect.y = y;
      super.setBounds (rect);
   }


   /**
    * @param w  The new size value
    * @param h  The new size value
    * @see      org.eclipse.draw2d.IFigure#setSize(int, int)
    */
   @Override
   public void setSize(int w, int h)
   {
      int size = Math.min (w, h);
      super.setSize (size, size);
   }
}

/*
 * $Log$
 * Revision 1.2  2006/05/20 16:08:15  travkin
 * Removed some compile warnings.
 *
 * Revision 1.1  2006/02/15 18:34:09  mm
 * renamed plugin to Commons4Eclipse
 *
 * Revision 1.1  2005/11/23 14:26:15  mm
 * moved non-Fujaba-specific figures to AppIndependent4Eclipse
 *
 * Revision 1.3  2005/01/02 15:13:51  travkin
 * Changed the paint method to enable highlighting the figures.
 *
 */
