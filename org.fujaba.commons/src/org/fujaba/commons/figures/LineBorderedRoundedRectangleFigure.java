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
import org.eclipse.draw2d.Graphics;


/**
 * @author Florian Klein (fklein@upb.de)
 * @author Last editor: $Author: travkin $
 * @version $Revision: 1830 $ $Date: 2009-06-25 16:58:12 +0200 (Do, 25 Jun 2009) $
 *
 * A rectangle with a line border.
 */
public class LineBorderedRoundedRectangleFigure extends LineBorderedFigure
{
   public final static int ARC_RELATIVE = -1;
   
   private int arcX = ARC_RELATIVE;
   private int arcY = ARC_RELATIVE;
   
   private float relativeArcX = 0.2f;
   private float relativeArcY = 0.2f;
   
   private boolean symmetrical = true;
   
   public LineBorderedRoundedRectangleFigure()
   {
      this.setBorder(new RoundedRectangleBorder());
      this.setOpaque(true);
      this.setAntialias(true);
   }   
      
   /**
    * Constructs a rounded rectangle border with absolutely specified arc sizes
    */
   public LineBorderedRoundedRectangleFigure(int arcX, int arcY) 
   { 
      this();
      this.setArcX(arcX);
      this.setArcY(arcY);      
   }

   /**
    * Constructs a rounded rectangle border with absolutely specified arc sizes
    */
   public LineBorderedRoundedRectangleFigure(float relativeArcX, float relativeArcY) 
   { 
      this();
      this.setRelativeArcX(relativeArcX);
      this.setRelativeArcY(relativeArcY);
   }
    
   
   /**
    * @see de.uni_paderborn.commons4eclipse.gef.figures.LineBorderedFigure#getBorder()
    */
   @Override
   public RoundedRectangleBorder getBorder()
   {
      return (RoundedRectangleBorder) super.getBorder();      
   }
   
   /**
    * @see org.eclipse.draw2d.Figure#setBorder(org.eclipse.draw2d.Border)
    */
   @Override
   public void setBorder(Border border)
   {
      if(border instanceof RoundedRectangleBorder)
         super.setBorder(border);
      else
         throw new IllegalArgumentException("LineBorderedRoundedRectangleFigure expects a RoundedRectangleBorder as its border.");
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
      this.getBorder().setRelativeArcX(relativeArcX);
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
      this.getBorder().setRelativeArcY(relativeArcY);
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
      this.getBorder().setSymmetrical(symmetrical);
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
      this.getBorder().setArcX(arcX);
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
      this.getBorder().setArcY(arcY);
   }
   
   /**
    * Actually draw the border (rectangle)
    */
   @Override
   public void paintFigure(Graphics graphics) 
   {      
      int drawArcX = this.getArcX();
      if(drawArcX == RoundedRectangleBorder.ARC_RELATIVE)
         drawArcX = Math.round(this.getRelativeArcX() * this.getBounds().width);

      int drawArcY = this.getArcY();
      if(drawArcY == RoundedRectangleBorder.ARC_RELATIVE)
         drawArcY = Math.round(this.getRelativeArcY() * this.getBounds().width);

      if(this.isSymmetrical())
      {
         drawArcX = Math.min(drawArcX, drawArcY);
         drawArcY = drawArcX;
      }
      
      graphics.pushState();
      
      try
      {
         if (this.isOpaque() && this.getBackgroundColor() != null)
         {
            graphics.setBackgroundColor(this.getBackgroundColor());
            graphics.fillRoundRectangle(this.getBounds(), drawArcX, drawArcY);
         }
      }
      finally
      {
         graphics.popState();         
      }          
   }   
}

