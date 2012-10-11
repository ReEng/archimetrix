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

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.fujaba.commons.figures.FigureWithAntialiasingSupport;



/**
 * @author    Dietrich Travkin (travkin)
 * @author    Last editor: $Author: travkin $
 * @version   $Revision: 1832 $ $Date: 2009-06-25 17:38:46 +0200 (Do, 25 Jun 2009) $
 */
public class UMLNopActivityFigure extends FigureWithAntialiasingSupport
{
   /**
    *Constructor for class RoundedRectangleFigure
    */
   public UMLNopActivityFigure()
   {
      this.setBackgroundColor (ColorConstants.white);
      this.setForegroundColor (ColorConstants.black);
      this.setOpaque (true);
      this.setAntialias(true);
   }


   /**
    * @param graphics  No description provided
    * @see             org.eclipse.draw2d.Figure#paintFigure(org.eclipse.draw2d.Graphics)
    */
   @Override
   protected void paintFigure (Graphics graphics)
   {
      if (isOpaque())
      {
         PointList decorationPointList = new PointList();
         Rectangle rec = getBounds();

         int x = rec.x;
         int y = rec.y;
         int width = rec.width;
         int height = rec.height;

         Point nullPoint = new Point (x + width / 2, y + height / 2);

         decorationPointList.addPoint (nullPoint.x + width / 2, nullPoint.y);
         decorationPointList.addPoint (nullPoint.x, nullPoint.y + height / 2);
         decorationPointList.addPoint (nullPoint.x - width / 2, nullPoint.y);
         decorationPointList.addPoint (nullPoint.x, nullPoint.y - height / 2);

         graphics.fillPolygon (decorationPointList);
         graphics.drawPolygon (decorationPointList);
      }
   }
}

/*
 * $Log$
 * Revision 1.3  2006/05/22 17:11:34  travkin
 * Removed most compile warnings.
 *
 * Revision 1.2  2006/04/11 17:07:05  travkin
 * Changed some javadoc comments.
 *
 */
