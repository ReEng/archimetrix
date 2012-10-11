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
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;


/**
 * @author    Dietrich Travkin (travkin)
 * @author    Last editor: $Author: fklein $
 * @version   $Revision: 1209 $ $Date: 2006-12-08 19:47:45 +0100 (Fr, 08 Dez 2006) $
 */
public class UMLActivityChopboxAnchor extends ChopboxAnchor
{
   /**
    *Constructor for class UMLActivityChopboxAnchor
    */
   public UMLActivityChopboxAnchor()
   {
      super();
   }


   /**
    *Constructor for class UMLActivityChopboxAnchor
    *
    * @param owner  No description provided
    */
   public UMLActivityChopboxAnchor (IFigure owner)
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
      Rectangle bounds = new Rectangle (this.getBox().x, this.getBox().y, this.getBox().width, this.getBox().height);
      this.getOwner().translateToAbsolute (bounds);

      // determine the radius of the corner arcs
//      int size = Math.min (bounds.width, bounds.height);
//      int radius = size / 4;
      int radius = AbstractUMLActivityFigure.EDGE_RADIUS;

      // return the location point from the super implementation,
      // if the intersection point is on the bounding box
      Point bBoxIntersection = super.getLocation (reference);
      if ( (bBoxIntersection.x >= bounds.x + radius &&
         bBoxIntersection.x <= bounds.x + bounds.width - 1 - radius) ||
          (bBoxIntersection.y >= bounds.y + radius &&
         bBoxIntersection.y <= bounds.y + bounds.height - 1 - radius))
      {
         return bBoxIntersection;
      }
      else
      { // return the intersection point with one of the four arcs in the rectangle corners

         Point center = bounds.getCenter();

         Point intersection = null;

         if (reference.x <= center.x)
         { // left side

            if (reference.y <= center.y)
            { // upper left corner

               Point circleCenter = new Point (bounds.x + radius, bounds.y + radius);
               intersection = GeometricHelper.intersectionPointOfLineWithCircle (reference, center, circleCenter, radius);
            }
            else
            { // lower left corner

               Point circleCenter = new Point (bounds.x + radius, bounds.y + bounds.height - 1 - radius);
               intersection = GeometricHelper.intersectionPointOfLineWithCircle (reference, center, circleCenter, radius);
            }
         }
         else
         { // right side

            if (reference.y <= center.y)
            { // upper right corner

               Point circleCenter = new Point (bounds.x + bounds.width - 1 - radius, bounds.y + radius);
               intersection = GeometricHelper.intersectionPointOfLineWithCircle (reference, center, circleCenter, radius);
            }
            else
            { // lower right corner

               Point circleCenter = new Point (bounds.x + bounds.width - 1 - radius, bounds.y + bounds.height - 1 - radius);
               intersection = GeometricHelper.intersectionPointOfLineWithCircle (reference, center, circleCenter, radius);
            }
         }

         if (intersection != null)
         {
//            if (Math.abs(intersection.x) > 1000 || Math.abs(intersection.y) > 1000)
            return intersection;
         }
         else
         {
            return super.getLocation (reference);
         }
      }
   }
}

/*
 * $Log$
 * Revision 1.5  2006/12/08 18:47:45  fklein
 * Changed imported package to match restructuring in commons4eclipse
 *
 * Revision 1.4  2006/05/22 17:11:34  travkin
 * Removed most compile warnings.
 *
 * Revision 1.3  2006/04/11 17:07:05  travkin
 * Changed some javadoc comments.
 *
 */
