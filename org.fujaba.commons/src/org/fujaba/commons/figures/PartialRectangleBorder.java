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
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.swt.graphics.Color;

/**
 * @author Florian Klein (fklein@upb.de)
 * @author Last editor: $Author: fklein $
 * @version $Revision: 1206 $ $Date: 2006-12-08 19:42:13 +0100 (Fr, 08 Dez 2006) $
 *
 * A rectangular border that only draws the specified sides
 * of the rectangle.
 */
public class PartialRectangleBorder extends AbstractLineBorder
{
   private boolean top = true;
   private boolean left = true;
   private boolean bottom = true;
   private boolean right = true;   
   
   /**
    * Constructor, set which sides to display
    * 
    * @param top
    * @param left
    * @param bottom
    * @param right
    */
   public PartialRectangleBorder(boolean top, boolean left, boolean bottom, boolean right)
   {
      this.top = top;
      this.left = left;
      this.bottom = bottom;
      this.right = right;
   }    
   
   /**
    * Constructor, set color, width and which sides to display
    * 
    * @param color
    * @param width
    * @param top
    * @param left
    * @param bottom
    * @param right
    */
   public PartialRectangleBorder(Color color, int width, boolean top, boolean left, boolean bottom, boolean right)
   {
      this(top,left,bottom,right);
      this.setColor(color);
      this.setWidth(width);
   }
   
   /**
    * Constructs a border with width 1, default color, default line style
    */
   public PartialRectangleBorder() 
   { 
      
   }
   
   /**
    * Constructs a border with the provided width, default color, default line style
    *
    * @param width the width of the border
    */
   public PartialRectangleBorder(int width) 
   {
      this(null, width);
   }
  
   /**
    * Constructs a border with the provided color, width 1, default line style
    *
    * @param color the border color
    */
   public PartialRectangleBorder(Color color) 
   {
      this(color, 1);
   }
   
   /**
    * Constructs a border with the provided color and width, default line style
    *
    * @param color the border color
    * @param width the width of the border
    */
   public PartialRectangleBorder(Color color, int width) 
   {
      setColor(color);
      setWidth(width);
   }
   
   /**
    * Constructs a border with the provided color, width, and line style
    *
    * @param color the border color
    * @param width the width of the border
    */
   public PartialRectangleBorder(Color color, int width, int lineStyle) 
   {
      setColor(color);
      setWidth(width);
      setLineStyle(lineStyle);
   }
   
   
   /**
    * Show only the indicated sides 
    * 
    * @param sides (PositionConstants.NORTH | PositionConstants.EAST) etc. as parameters
    */
   public void setVisible(int sides)
   {
      this.top = false;
      this.left = false;
      this.bottom = false;
      this.right = false;
      
      this.show(sides);      
   }
   
   /**
    * Add the indicated sides, leave others unchanged
    * 
    * @param sides (PositionConstants.NORTH | PositionConstants.EAST) etc. as parameters
    */
   public void show(int sides)
   {
      if((sides & PositionConstants.NORTH) != 0)
         top = true;
      if((sides & PositionConstants.WEST) != 0)
         left = true;
      if((sides & PositionConstants.SOUTH) != 0)
         bottom = true;
      if((sides & PositionConstants.EAST) != 0)
         right = true;
   }
   
   /**
    * Hide the indicated sides
    * 
    * @param sides (PositionConstants.NORTH | PositionConstants.EAST) etc. as parameters
    */
   public void hide(int sides)
   {
      if((sides & PositionConstants.NORTH) != 0)
         top = false;
      if((sides & PositionConstants.WEST) != 0)
         left = false;
      if((sides & PositionConstants.SOUTH) != 0)
         bottom = false;
      if((sides & PositionConstants.EAST) != 0)
         right = false;
   }
  
   /**
    * The space used up by the border
    * 
    * @param figure this border's figure
    * @return the border's insets
    * @see org.eclipse.draw2d.LineBorder#getInsets(org.eclipse.draw2d.IFigure)
    */   
   public Insets getInsets(IFigure figure)
   {
      int width = this.getWidth();
      return new Insets(
            (this.top ? width : 0),
            (this.left ? width : 0),
            (this.bottom ? width : 0),
            (this.right ? width : 0));
   }

   /**
    * @see org.eclipse.draw2d.LineBorder#paint(org.eclipse.draw2d.IFigure, org.eclipse.draw2d.Graphics, org.eclipse.draw2d.geometry.Insets)
    */
   @Override
   public void paintBorder(IFigure figure, Graphics graphics, Insets insets)
   {
      tempRect.setBounds(getPaintRectangle(figure, insets));
      if (getWidth() % 2 == 1)
      {
         if (this.left && this.right)
         {
            tempRect.width--;
         }
         if (this.top && this.bottom)
         {
            tempRect.height--;
         }
      }
      
      int delta = getWidth() / 2;
      
      if (this.top)
      {
         tempRect.y += delta;
         tempRect.width -= delta;
      }
      if (this.left)
      {
         tempRect.x += delta;
         tempRect.height -= delta;
      }
      if (this.bottom)
      {
         tempRect.height -=delta;
      }
      if (this.right)
      {
         tempRect.width -= delta;
      } 
      
      if (this.top)
      {
         graphics.drawLine(tempRect.x, tempRect.y, tempRect.x + tempRect.width, tempRect.y);
      }
      if (this.left)
      {
         graphics.drawLine(tempRect.x, tempRect.y, tempRect.x, tempRect.y + tempRect.height);
      }
      if (this.bottom)
      {
         graphics.drawLine(tempRect.x, tempRect.y + tempRect.height, tempRect.x + tempRect.width, tempRect.y + tempRect.height);
      }
      if (this.right)
      {
         graphics.drawLine(tempRect.x + tempRect.width, tempRect.y, tempRect.x + tempRect.width, tempRect.y + tempRect.height);
      }
   }
}
