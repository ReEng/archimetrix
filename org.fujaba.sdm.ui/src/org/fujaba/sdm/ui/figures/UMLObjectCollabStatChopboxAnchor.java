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
import org.eclipse.draw2d.geometry.PrecisionPoint;


/**
 * @author    Oliver Rohe
 * @version
 */
public class UMLObjectCollabStatChopboxAnchor extends ChopboxAnchor
{
   /**
    * No comment provided by developer, please add a comment to improve documentation.
    */
   IFigure sourceFigure;

   /**
    * No comment provided by developer, please add a comment to improve documentation.
    */
   IFigure owner;


   /**
    *Constructor for class UMLObjectChopboxAnchor
    *
    * @param owner   No description provided
    * @param source  No description provided
    */
   public UMLObjectCollabStatChopboxAnchor (IFigure owner, IFigure source)
   {
      super (owner);
      this.owner = owner;
      this.sourceFigure = source;
   }


   /**
    * @param reference  No description provided
    * @return           The location value
    * @see              org.eclipse.draw2d.ConnectionAnchor#getLocation(org.eclipse.draw2d.geometry.Point)
    */
   @Override
   public Point getLocation (Point reference)
   {
      Point p = owner.getBounds().getCenter();
      owner.translateToAbsolute (p);

      double x2 = p.x;
      double y2 = p.y;

      Point sourcePoint = sourceFigure.getBounds().getCenter();

      owner.translateToAbsolute (sourcePoint);
      double x1 = sourcePoint.x;
      double y1 = sourcePoint.y;

      double deltax = x2 - x1;
      double deltay = y2 - y1;

      double c = 0.6;
      double newX = c * deltax;
      double newY = c * deltay;

      double x = x1 + newX;
      double y = y1 + newY;

      p = new PrecisionPoint (x, y);

      return p;
   }
}

/*
 * $Log$
 * Revision 1.4  2006/05/22 17:11:34  travkin
 * Removed most compile warnings.
 *
 * Revision 1.3  2006/02/14 15:55:46  mm
 * improved display
 *
 */
