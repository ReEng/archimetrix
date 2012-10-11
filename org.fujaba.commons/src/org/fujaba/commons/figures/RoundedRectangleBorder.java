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
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.swt.graphics.Color;

/**
 * @author Florian Klein (fklein@upb.de)
 * @author Last editor: $Author: fklein $
 * @version $Revision: 1207 $ $Date: 2006-12-08 19:43:39 +0100 (Fr, 08 Dez 2006) $
 *
 * A rounded rectangular border. The arc of the rounded corners
 * can either be specified as an absolute value in pixels, or
 * as a percentage of height/width of the rectangle. The size
 * of the arc in x and y direction can be set separately. If
 * both arc dimensions are relative and isSymmetrical is true,
 * the smaller of the computed arc sizes will be used for both
 * dimensions.
 *  
 */
public class RoundedRectangleBorder extends AbstractLineBorder
{
   public final static int ARC_RELATIVE = -1;
   
   private int arcX = ARC_RELATIVE;
   private int arcY = ARC_RELATIVE;
   
   private float relativeArcX = 0.2f;
   private float relativeArcY = 0.2f;
   
   private boolean symmetrical = true;
  
   /**
    * Constructs a border with width 1, default color, default line style
    */
   public RoundedRectangleBorder() 
   { 
      
   }
   
   /**
    * Constructs a rounded rectangle border with absolutely specified arc sizes
    */
   public RoundedRectangleBorder(int arcX, int arcY) 
   { 
      this.setArcX(arcX);
      this.setArcY(arcY);      
   }

   /**
    * Constructs a rounded rectangle border with absolutely specified arc sizes
    */
   public RoundedRectangleBorder(float relativeArcX, float relativeArcY) 
   { 
      this.setRelativeArcX(relativeArcX);
      this.setRelativeArcY(relativeArcY);
   }
   
   /**
    * Constructs a border with the provided width, default color, default line style
    *
    * @param width the width of the border
    */
   public RoundedRectangleBorder(int width) 
   {
      this(null, width);
   }
  
   /**
    * Constructs a border with the provided color, width 1, default line style
    *
    * @param color the border color
    */
   public RoundedRectangleBorder(Color color) 
   {
      this(color, 1);
   }
   
   /**
    * Constructs a border with the provided color and width, default line style
    *
    * @param color the border color
    * @param width the width of the border
    */
   public RoundedRectangleBorder(Color color, int width) 
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
   public RoundedRectangleBorder(Color color, int width, int lineStyle) 
   {
      setColor(color);
      setWidth(width);
      setLineStyle(lineStyle);
   }
  
   /**
    * Set both relative arcs at once
    * 
    * @param relativeArc the relativeArc to set
    */
   public void setRelativeArc(float relativeArc)
   {
      this.setRelativeArcX(relativeArc);
      this.setRelativeArcY(relativeArc);      
   }   
   
   /**
    * @return the relativeArcX
    */
   public float getRelativeArcX()
   {
      return relativeArcX;
   }

   /**
    * Use relative arc size.
    * 
    * @param relativeArcX the relativeArcX to set
    */
   public void setRelativeArcX(float relativeArcX)
   {
      this.relativeArcX = relativeArcX;
      this.arcX = ARC_RELATIVE;
   }

   /**
    * @return the relativeArcY
    */
   public float getRelativeArcY()
   {
      return relativeArcY;
   }

   /**
    * Use relative arc size.
    * 
    * @param relativeArcY the relativeArcY to set
    */
   public void setRelativeArcY(float relativeArcY)
   {
      this.relativeArcY = relativeArcY;
      this.arcY = ARC_RELATIVE;
   }

   /**
    * @return the symmetrical
    */
   public boolean isSymmetrical()
   {
      return symmetrical;
   }

   /**
    * Determines whether x and y arc are forced to be identical. 
    * Only affects relative arcs.
    * 
    * @param symmetrical the symmetrical to set
    */
   public void setSymmetrical(boolean symmetrical)
   {
      this.symmetrical = symmetrical;
   }

   /**
    * Set both absolute arcs at once
    * 
    * @param arc the arc to set
    */
   public void setArc(int arc)
   {
      this.setArcX(arc);
      this.setArcY(arc);            
   }
   
   /**
    * @return the arcX
    */
   public int getArcX()
   {
      return arcX;
   }

   /**
    * @param arcX the arcX to set
    */
   public void setArcX(int arcX)
   {
      this.arcX = arcX;
      this.symmetrical = false;
   }

   /**
    * @return the arcY
    */
   public int getArcY()
   {
      return arcY;
   }

   /**
    * @param arcY the arcY to set
    */
   public void setArcY(int arcY)
   {
      this.arcY = arcY;
      this.symmetrical = false;
   }
   
   /**
    * The space used up by the border
    * 
    * @param figure this border's figure
    * @return the border's insets
    */
   public Insets getInsets(IFigure figure) 
   {
      return new Insets(getWidth());
   }
         
   /**
    * Actually draw the border (rectangle)
    */
   @Override
   public void paintBorder(IFigure figure, Graphics graphics, Insets insets) 
   {
      tempRect.setBounds(getPaintRectangle(figure, insets));
      if (getWidth() % 2 == 1) 
      {
         tempRect.width--;
         tempRect.height--;
      }
      tempRect.shrink(getWidth() / 2, getWidth() / 2);      
      
      int drawArcX = this.getArcX();
      if(drawArcX == RoundedRectangleBorder.ARC_RELATIVE)
         drawArcX = Math.round(this.getRelativeArcX() * figure.getBounds().width);

      int drawArcY = this.getArcY();
      if(drawArcY == RoundedRectangleBorder.ARC_RELATIVE)
         drawArcY = Math.round(this.getRelativeArcY() * figure.getBounds().width);

      if(this.isSymmetrical())
      {
         drawArcX = Math.min(drawArcX, drawArcY);
         drawArcY = drawArcX;
      }
      
      graphics.drawRoundRectangle (tempRect, drawArcX, drawArcY);
   }   
}
