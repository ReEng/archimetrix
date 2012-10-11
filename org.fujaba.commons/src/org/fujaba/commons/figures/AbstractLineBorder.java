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

import org.eclipse.draw2d.AbstractBorder;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;

/**
 * @author Florian Klein (fklein@upb.de)
 * @author Last editor: $Author: mvdetten $
 * @version $Revision: 1702 $ $Date: 2009-02-26 10:58:41 +0100 (Do, 26 Feb 2009) $
 *
 * A border that consists of (a) line(s).
 * It has a width, a color and a lineStyle.
 */


public abstract class AbstractLineBorder extends AbstractBorder implements ILineBorder 
{   
   private Color color = ColorConstants.black;
   
   private int width = 1;
      
   private int lineStyle = SWT.LINE_SOLID;

   /* (non-Javadoc)
    * @see de.uni_paderborn.commons4eclipse.gef.border.ILineBorder#paint(org.eclipse.draw2d.IFigure, org.eclipse.draw2d.Graphics, org.eclipse.draw2d.geometry.Insets)
    */
   public void paint(IFigure figure, Graphics graphics, Insets insets) 
   {      
      graphics.pushState();
      
      try
      {
         if(this.getColor() != null)   
            graphics.setForegroundColor(this.getColor());
         if(this.getLineStyle() != SWT.DEFAULT)
            graphics.setLineStyle(this.getLineStyle());
         if(this.getWidth() != SWT.DEFAULT)
            graphics.setLineWidth(this.getWidth());
         
         paintBorder(figure, graphics, insets);
      }
      finally
      {
         graphics.popState();
      }
   }   
   
   /**
    *    Actually draws the border. 
    *    Overload this in concrete classes.
    */
   public abstract void paintBorder(IFigure figure, Graphics graphics, Insets insets);
   
   /* (non-Javadoc)
    * @see de.uni_paderborn.commons4eclipse.gef.border.ILineBorder#getColor()
    */
   public Color getColor() 
   {
      return color;
   }
   
   /* (non-Javadoc)
    * @see de.uni_paderborn.commons4eclipse.gef.border.ILineBorder#setColor(org.eclipse.swt.graphics.Color)
    */
   public void setColor(Color color) 
   {
      this.color = color;
   }
   
   /* (non-Javadoc)
    * @see de.uni_paderborn.commons4eclipse.gef.border.ILineBorder#getLineStyle()
    */
   public int getLineStyle()
   {
      return lineStyle;
   }

   /* (non-Javadoc)
    * @see de.uni_paderborn.commons4eclipse.gef.border.ILineBorder#setLineStyle(int)
    */
   public void setLineStyle(int lineStyle)
   {
      if (lineStyle != SWT.LINE_SOLID &&
          lineStyle != SWT.LINE_DASH &&
          lineStyle != SWT.LINE_DOT &&
          lineStyle != SWT.LINE_DASHDOT &&
          lineStyle != SWT.LINE_DASHDOTDOT)
      {
         throw new IllegalArgumentException("Illegal line style: " + lineStyle);
      }
      
      this.lineStyle = lineStyle;
   }

   /* (non-Javadoc)
    * @see de.uni_paderborn.commons4eclipse.gef.border.ILineBorder#getWidth()
    */
   public int getWidth()
   {
      return width;
   }

   /* (non-Javadoc)
    * @see de.uni_paderborn.commons4eclipse.gef.border.ILineBorder#setWidth(int)
    */
   public void setWidth(int width)
   {
      this.width = width;
   }  
   
   /* (non-Javadoc)
    * @see de.uni_paderborn.commons4eclipse.gef.border.ILineBorder#isOpaque()
    */
   @Override
   public boolean isOpaque() 
   {
      return true;
   }
   
   /**
    * @see org.eclipse.draw2d.Border#getPreferredSize(IFigure)
    */
   @Override
   public Dimension getPreferredSize(IFigure fig) 
   {
      Insets insets = getInsets(fig);
      return new Dimension(insets.getWidth(), insets.getHeight());
   }   
}




