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
 *      Copyright (C) 1997-2004 Fujaba Development Group
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
 * @author  Dietrich Travkin
 * @author  Last editor: $Author: fklein $
 * @version $Revision: 1206 $ $Date: 2006-12-08 19:42:13 +0100 (Fr, 08 Dez 2006) $
 */
public class RhombChopboxAnchor extends ChopboxAnchor
{
   public RhombChopboxAnchor(IFigure owner)
   {
      super(owner);
   }

   /**
    * @see org.eclipse.draw2d.ConnectionAnchor#getLocation(org.eclipse.draw2d.geometry.Point)
    */
   @Override
   public Point getLocation(Point reference)
   {
      Rectangle r = new Rectangle(this.getBox().x, this.getBox().y, this
            .getBox().width, this.getBox().height);
      this.getOwner().translateToAbsolute(r);

      Point center = new Point(r.x + r.width / 2, r.y + r.height / 2);
      Point north = new Point(r.x + r.width / 2, r.y);
      Point south = new Point(r.x + r.width / 2, r.y + r.height);
      Point west = new Point(r.x, r.y + r.height / 2);
      Point east = new Point(r.x + r.width, r.y + r.height / 2);

      Point intersection = null;

      if (reference.x <= north.x)
      { // left side

         if (reference.y <= west.y)
         { // upper left side

            // intersection with left upper line /
            intersection = GeometricHelper.intersectionPointOfLines(north,
                  west, center, reference);
         }
         else
         { // lower left side

            // intersection with left lower line \
            intersection = GeometricHelper.intersectionPointOfLines(west,
                  south, center, reference);
         }
      }
      else
      { // right side

         if (reference.y <= west.y)
         { // upper right side

            // intersection with right upper line \
            intersection = GeometricHelper.intersectionPointOfLines(north,
                  east, center, reference);
         }
         else
         { // lower right side

            // intersection with right lower line /
            intersection = GeometricHelper.intersectionPointOfLines(east,
                  south, center, reference);
         }
      }

      if (intersection != null)
      {
         // if (Math.abs(intersection.x) > 1000 || Math.abs(intersection.y) > 1000)
         return intersection;
      }

      return super.getLocation(reference);
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
 * Revision 1.5  2006/05/26 17:20:23  travkin
 * Added some javadoc comments.
 *
 * Revision 1.4  2006/05/20 16:08:15  travkin
 * Removed some compile warnings.
 *
 * Revision 1.3  2006/03/08 20:17:45  mm
 * removed Java5 annotations
 *
 * Revision 1.2  2006/03/07 21:56:42  lowende
 * Compile warnings removed.
 *
 */
