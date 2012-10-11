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
package org.fujaba.commons.figures.utils;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.swt.graphics.Color;


/**
 * @author    Dietrich Travkin
 * @author    Last editor: $Author: travkin $
 * @version   $Revision: 1019 $ $Date: 2006-05-20 18:08:16 +0200 (Sa, 20 Mai 2006) $
 */
public class ConnectionDecorationFactory
{
   /**
    * No comment provided by developer, please add a comment to improve documentation.
    */
   public final static int NO_DECORATION = 0;
   /**
    * No comment provided by developer, please add a comment to improve documentation.
    */
   public final static int OPEN_ARROW = 1;
   /**
    * No comment provided by developer, please add a comment to improve documentation.
    */
   public final static int CLOSED_ARROW = 2;
   /**
    * No comment provided by developer, please add a comment to improve documentation.
    */
   public final static int RHOMB = 3;
   /**
    * No comment provided by developer, please add a comment to improve documentation.
    */
   public final static int SMALL_CLOSED_ARROW = 4;


   /**
    * No comment provided by developer, please add a comment to improve documentation.
    *
    * @return   No description provided
    */
   private static PolygonDecoration createClosedArrowDecoration()
   {
      PointList decorationPointList = new PointList();
      Point aPointRef = new Point (0, 0);
      decorationPointList.addPoint (aPointRef);

      Point aPoint = new Point (-2, 2);
      decorationPointList.addPoint (aPoint.getTranslated (aPointRef));
      aPoint = new Point (-2, -2);
      decorationPointList.addPoint (aPoint.getTranslated (aPointRef));

      PolygonDecoration decoration = new PolygonDecoration();
      decoration.setTemplate (decorationPointList);
      decoration.setScale (5, 2);
      return decoration;
   }


   /**
    * No comment provided by developer, please add a comment to improve documentation.
    *
    * @return   No description provided
    */
   private static PolygonDecoration createOpenArrowDecoration()
   {
      PointList decorationPointList = new PointList();
      Point aPointRef = new Point (0, 0);
      decorationPointList.addPoint (aPointRef);

      Point aPoint = new Point (-2, 2);
      decorationPointList.addPoint (aPoint.getTranslated (aPointRef));
      decorationPointList.addPoint (aPointRef);
      aPoint = new Point (-2, -2);
      decorationPointList.addPoint (aPoint.getTranslated (aPointRef));

      PolygonDecoration decoration = new PolygonDecoration();
      decoration.setTemplate (decorationPointList);
      decoration.setScale (5, 2);
      return decoration;
   }


   /**
    * No comment provided by developer, please add a comment to improve documentation.
    *
    * @return   No description provided
    */
   private static PolygonDecoration createRhombDecoration()
   {
      PolygonDecoration decoration = new PolygonDecoration();
      PointList decorationPointList = new PointList();
      decorationPointList.addPoint (0, 0);
      decorationPointList.addPoint (-2, 2);
      decorationPointList.addPoint (-4, 0);
      decorationPointList.addPoint (-2, -2);
      decoration.setTemplate (decorationPointList);
      decoration.setScale (4, 2);
      return decoration;
   }


   /**
    * No comment provided by developer, please add a comment to improve documentation.
    *
    * @return   No description provided
    */
   private static PolygonDecoration createSmallClosedArrowDecoration()
   {
      PolygonDecoration arrow = new PolygonDecoration();
      PointList arrowPointList = new PointList();
      arrowPointList.addPoint (1, 1);
      arrowPointList.addPoint (1, -1);
      arrowPointList.addPoint (-1, 0);
      arrow.setTemplate (arrowPointList);
      arrow.setScale (4, 3);
      return arrow;
   }


   /**
    * No comment provided by developer, please add a comment to improve documentation.
    *
    * @param type  No description provided
    * @return      No description provided
    */
   public static PolygonDecoration createDecoration (int type)
   {
      return createDecoration (type, ColorConstants.black, ColorConstants.black);
   }


   /**
    * No comment provided by developer, please add a comment to improve documentation.
    *
    * @param type             No description provided
    * @param backgroundColor  No description provided
    * @param foregroundColor  No description provided
    * @return                 No description provided
    */
   public static PolygonDecoration createDecoration (int type, Color backgroundColor, Color foregroundColor)
   {
      PolygonDecoration decoration;

      switch (type)
      {
         case OPEN_ARROW:
            decoration = createOpenArrowDecoration();
            break;
         case CLOSED_ARROW:
            decoration = createClosedArrowDecoration();
            break;
         case SMALL_CLOSED_ARROW:
            decoration = createSmallClosedArrowDecoration();
            break;
         case RHOMB:
            decoration = createRhombDecoration();
            break;
         default:
            decoration = null;
      }

      if (decoration != null)
      {
         decoration.setBackgroundColor (backgroundColor);
         decoration.setForegroundColor (foregroundColor);
      }

      return decoration;
   }
}

/*
 * $Log$
 * Revision 1.2  2006/05/20 16:08:15  travkin
 * Removed some compile warnings.
 *
 * Revision 1.1  2006/02/15 18:34:09  mm
 * renamed plugin to Commons4Eclipse
 *
 * Revision 1.1  2005/11/23 14:26:16  mm
 * moved non-Fujaba-specific figures to AppIndependent4Eclipse
 *
 * Revision 1.2  2004/09/27 09:45:44  travkin
 * Decreased the size of the decoration figures. (dt)
 *
 */
