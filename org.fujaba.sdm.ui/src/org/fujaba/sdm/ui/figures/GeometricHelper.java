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


import org.eclipse.draw2d.geometry.Point;


/**
 * @author  Dietrich Travkin
 * @author  Last editor: $Author: fklein $
 * @version $Revision: 1206 $ $Date: 2006-12-08 19:42:13 +0100 (Fr, 08 Dez 2006) $
 */
public class GeometricHelper
{

   public static Point intersectionPointOfLineWithCircle(Point p1, Point p2,
         Point center, float radius)
   {
      // determine the two intersection points, if they exist
      float a = (p2.x - p1.x) * (p2.x - p1.x) + (p2.y - p1.y) * (p2.y - p1.y);
      float b = 2 * ((p1.x - center.x) * (p2.x - p1.x) + (p1.y - center.y)
            * (p2.y - p1.y));

      if (a == 0.0f)
      {
         if (b == 0.0f)
         {
            // no solution/intersection exists
            return null;
         }

         // a==0, b!=0 (only one solution/intersection exists)
         float alpha = (radius * radius - (p1.x - center.x) * (p1.x - center.x) - (p1.y - center.y)
               * (p1.y - center.y))
               / b;

         int x = Math.round(p1.x + alpha * (p2.x - p1.x));
         int y = Math.round(p1.y + alpha * (p2.y - p1.y));

         return new Point(x, y);
      }

      float c = b
            * b
            / (4 * a * a)
            - ((p1.x - center.x) * (p1.x - center.x) + (p1.y - center.y)
                  * (p1.y - center.y) - radius * radius) / a;

      if (c < 0)
      {
         // no solution/intersection exists
         return null;
      }

      float alpha1;

      float alpha2;

      float sqrt;
      sqrt = (float) Math.sqrt(c);
      alpha1 = -b / (2 * a) + sqrt;
      alpha2 = -b / (2 * a) - sqrt;

      // the two intersection points:
      float x1;

      // the two intersection points:
      float x2;

      // the two intersection points:
      float y1;

      // the two intersection points:
      float y2;

      x1 = p1.x + alpha1 * (p2.x - p1.x);
      y1 = p1.y + alpha1 * (p2.y - p1.y);

      x2 = p1.x + alpha2 * (p2.x - p1.x);
      y2 = p1.y + alpha2 * (p2.y - p1.y);

      // determine, which of the points is closer to p1 and return it
      double d1 = Math.sqrt((p1.x - x1) * (p1.x - x1) + (p1.y - y1)
            * (p1.y - y1));
      double d2 = Math.sqrt((p1.x - x2) * (p1.x - x2) + (p1.y - y2)
            * (p1.y - y2));

      if (d1 <= d2)
      {
         return new Point(Math.round(x1), Math.round(y1));
      }

      return new Point(Math.round(x2), Math.round(y2));
   }


   public static Point intersectionPointOfLineWithEllipse(Point p,
         Point center, double radiusX, double radiusY)
   {
      double dy = p.y - center.y;
      double dx = p.x - center.x;
      double theta = Math.atan2(dy, dx);
      double distanceCenterToCurve;
      
      // compute distance from center to curve
      double width = 2.0 * radiusX;
      double height = 2.0 * radiusY;
      
      if (radiusX>=radiusY)
      {
         double e = Math.sqrt(1.0 - (height * height) / (width * width));
         double divisor = 1.0 - e * e * Math.cos(theta) * Math.cos(theta);

         distanceCenterToCurve = radiusX
         * Math.sqrt((1.0 - e * e) / divisor);
      }
      else
      {
         double e = Math.sqrt(1.0 - (width * width) / (height * height) );
         double divisor = 1.0 - e * e * Math.sin(theta) * Math.sin(theta);

         distanceCenterToCurve = radiusY
         * Math.sqrt((1.0 - e * e) / divisor); 
      }
         
      // compute coordinates
      double x = center.x + distanceCenterToCurve * Math.cos(theta);
      double y = center.y + distanceCenterToCurve * Math.sin(theta);

      return new Point(x, y);
   }


   public static Point intersectionPointOfLines(Point p1, Point p2, Point p3,
         Point p4)
   {
      float alpha = 0.0f;
      if (p4.x - p3.x == 0)
      {
         if (p2.x - p1.x == 0)
         {
            return null;
         }

         alpha = ((float) (p3.x - p1.x)) / (p2.x - p1.x);
      }
      else
      {
         float value = p1.y - p2.y + ((float) (p2.x - p1.x) * (p4.y - p3.y))
               / (p4.x - p3.x);

         if (value == 0.0f)
         {
            return null;
         }

         alpha = (p1.y - p3.y - ((float) (p4.y - p3.y) * (p1.x - p3.x))
               / (p4.x - p3.x))
               / value;
      }

      int x = Math.round(p1.x + alpha * (p2.x - p1.x));
      int y = Math.round(p1.y + alpha * (p2.y - p1.y));

      return new Point(x, y);
   }
}

/*
 * $Log$
 * Revision 1.1  2006/12/08 18:42:12  fklein
 * Cleaned up de.uni_paderborn.commons4eclipse.gef.figures.*
 *
 * Created new packages
 *
 * de.uni_paderborn.commons4eclipse.gef.anchors.*
 * de.uni_paderborn.commons4eclipse.gef.locators.*
 *
 * and moved other classes to
 *
 * de.uni_paderborn.commons4eclipse.gef.border.*
 * de.uni_paderborn.commons4eclipse.gef.layout.*
 *
 * Old versions of the classes are still in the repository, but deprecated. They will be removed for the next release.
 *
 * Revision 1.4  2006/05/20 16:08:15  travkin
 * Removed some compile warnings.
 *
 * Revision 1.3  2006/04/05 09:10:15  yascha
 * fixed ElipseChopboxAnchor
 *
 * Revision 1.2  2006/03/07 21:56:42  lowende
 * Compile warnings removed.
 *
 */
