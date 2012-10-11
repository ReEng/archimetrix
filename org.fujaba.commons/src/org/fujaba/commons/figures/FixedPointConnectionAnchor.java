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

import org.eclipse.draw2d.AbstractConnectionAnchor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;


/**
 * The <code>FixedPointConnectionAnchor</code> defines a single
 * unmodifiable anchor point relative to its owner. The anchor
 * point is placed on the bounding box of the owner figure.
 * Constants such as {@link PositionConstants#NORTH NORTH} and
 * {@link PositionConstants#SOUTH SOUTH} specify the side of
 * the bounding box where to place the anchor point.
 *
 *
 * @author    Dietrich Travkin
 * @author    Last editor: $Author: fklein $
 * @version   $Revision: 1206 $ $Date: 2006-12-08 19:42:13 +0100 (Fr, 08 Dez 2006) $
 */
public class FixedPointConnectionAnchor extends AbstractConnectionAnchor
{
   /**
    * No comment provided by developer, please add a comment to improve documentation.
    */
   private int side;


   /**
    * <p>
    * Creates a <code>FixedPointConnectionAnchor</code> with the given
    * owner figure and the specified bounding box side where to place
    * the anchor point.
    * </p>
    * <p>
    * Possible values for <code>side</code> are {@link PositionConstants#NORTH NORTH},
    * {@link PositionConstants#SOUTH SOUTH}, {@link PositionConstants#WEST WEST}
    * and {@link PositionConstants#EAST EAST}.
    * </p>
    *
    *
    * @param owner  the owner figure
    * @param side   the owner figure's bounding box side
    */
   public FixedPointConnectionAnchor (IFigure owner, int side)
   {
      this.setOwner (owner);
      this.side = side;
   }


   /**
    * @param reference  No description provided
    * @return           The location value
    * @see              org.eclipse.draw2d.ConnectionAnchor#getLocation(org.eclipse.draw2d.geometry.Point)
    */
   public Point getLocation (Point reference)
   {
      Rectangle bounds = new Rectangle (this.getOwner().getBounds());
      this.getOwner().translateToAbsolute (bounds);

      int x;

      int y;
      if (this.side == PositionConstants.SOUTH || this.side == PositionConstants.NORTH)
      {
         x = bounds.x + bounds.width / 2;
         if (this.side == PositionConstants.SOUTH)
         {
            y = bounds.y + bounds.height;
         }
         else
         {
            y = bounds.y;
         }
      }
      else
      {
         y = bounds.y + bounds.height / 2;
         if (this.side == PositionConstants.WEST)
         {
            x = bounds.x;
         }
         else
         {
            x = bounds.x + bounds.width;
         }
      }
      return new Point (x, y);
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
 * Revision 1.2  2006/05/20 16:08:15  travkin
 * Removed some compile warnings.
 *
 * Revision 1.1  2006/02/15 18:34:10  mm
 * renamed plugin to Commons4Eclipse
 *
 * Revision 1.1  2005/11/23 14:26:16  mm
 * moved non-Fujaba-specific figures to AppIndependent4Eclipse
 *
 * Revision 1.2  2005/05/08 10:01:12  travkin
 * Fixed a bug concerning the relative and absolute positions.
 *
 */
