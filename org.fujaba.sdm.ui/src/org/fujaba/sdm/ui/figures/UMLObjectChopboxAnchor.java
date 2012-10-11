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

import org.eclipse.draw2d.ChopboxAnchor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;


/**
 * @author    Oliver Rohe
 * @version
 */
public class UMLObjectChopboxAnchor extends ChopboxAnchor
{
   /**
    *Constructor for class UMLObjectChopboxAnchor
    */
   public UMLObjectChopboxAnchor()
   {
      super();
   }


   /**
    *Constructor for class UMLObjectChopboxAnchor
    *
    * @param owner  No description provided
    */
   public UMLObjectChopboxAnchor (IFigure owner)
   {
      super (owner);
   }


   /**
    * @param reference  No description provided
    * @return           The location value
    * @see              org.eclipse.draw2d.ConnectionAnchor#getLocation(org.eclipse.draw2d.geometry.Point)
    */
   @Override
   public Point getLocation (Point reference)
   {

      if (this.getOwner().getLayoutManager() instanceof XYLayout)
      {
         Rectangle bounds = new Rectangle (this.getBox().x, this.getBox().y, this.getBox().width, this.getBox().height);
         this.getOwner().translateToAbsolute (bounds);

         Point bBoxIntersection = super.getLocation (reference);

         Point center = bounds.getCenter();
         this.getOwner().translateToAbsolute (center);

         int x1 = bBoxIntersection.x;
         int x2 = center.x;

         int y1 = bounds.y;
         int y2 = center.y;

         int xoffset = 20;
         int yoffset = 10;
         Point offset = new Point (xoffset, yoffset);
         //this.getOwner().translateToParent(offset);

         double steigung = Math.abs ( ( ((double)  (y2 - y1)) /  ((double)  (x2 - x1))));

         if (bBoxIntersection.x < bounds.x + offset.x && bBoxIntersection.y < bounds.y + offset.y)
         {

            if (bBoxIntersection.x > bounds.x)
            {

               double deltay =  ( (bounds.x + offset.x) - x1) * steigung;

               int x = bBoxIntersection.x +  ( (bounds.x + offset.x) - bBoxIntersection.x);
               int y = (int)  (bBoxIntersection.y + deltay);

               if (y >  (bounds.y + offset.y))
               {
                  y = bounds.y + offset.y;
               }
               return new Point (x, y);
            }
            else
            {

               double deltax =  ( (bounds.y + offset.y) - bBoxIntersection.y) * steigung;

               return new Point (bBoxIntersection.x + deltax, bounds.y + offset.y);
            }

         }
         else if ( (bBoxIntersection.x >  ( (bounds.x + bounds.width) - offset.x)) &&  (bBoxIntersection.y >  ( (bounds.y + bounds.height) - offset.y)))
         {

            if (bBoxIntersection.x <  (bounds.x + bounds.width))
            {

               double deltay =  (bBoxIntersection.x -  ( (bounds.x + bounds.width) - offset.x)) * steigung;

               int x = bBoxIntersection.x -  (bBoxIntersection.x -  ( (bounds.x + bounds.width) - offset.x));
               int y = (int)  (bBoxIntersection.y - deltay);

               if (y <  ( (bounds.y + bounds.height) - offset.y))
               {
                  y =  ( (bounds.y + bounds.height) - offset.y);
               }

               Point p = new Point (x, y);

               this.getOwner().translateToParent (p);

               return p;
            }
            else
            {
               double deltax =  (bBoxIntersection.y -  ( (bounds.y + bounds.height) - offset.y)) * steigung;
               int x = (int)  (bBoxIntersection.x - deltax);

               Point p = new Point (x,  (bounds.y + bounds.height) - offset.y);
               this.getOwner().translateToParent (p);

               return p;
            }

         }

         return super.getLocation (reference);
      }
      return super.getLocation (reference);
   }
}

/*
 * $Log$
 * Revision 1.2  2006/05/22 17:11:34  travkin
 * Removed most compile warnings.
 *
 * Revision 1.1  2005/11/27 17:09:07  mm
 * package restructuring - introduced uml.structure and uml.behavior packages and moved classes accordingly
 *
 */
