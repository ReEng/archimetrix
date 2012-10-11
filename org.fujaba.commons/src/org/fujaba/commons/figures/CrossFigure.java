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
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;


/**
 * @author    Oliver Rohe
 * @author    Last editor: $Author: travkin $
 * @version   $Revision: 1830 $ $Date: 2009-06-25 16:58:12 +0200 (Do, 25 Jun 2009) $
 */
public class CrossFigure extends FigureWithAntialiasingSupport
{
	public CrossFigure()
	{
		this.setSize(30, 20);
		this.setAntialias(true);
	}

   /**
    * @see org.eclipse.draw2d.Figure#paintFigure(org.eclipse.draw2d.Graphics)
    */
   @Override
   public void paintFigure(Graphics graphics)
   {
      Rectangle rect = this.getBounds();

      graphics.setLineWidth(1);

      PointList pList = new PointList();
      pList.addPoint (rect.x, rect.y);
      pList.addPoint (rect.x + rect.width, rect.y + rect.height);

      graphics.drawPolyline (pList);

      PointList pList2 = new PointList();
      pList2.addPoint (rect.x + rect.width, rect.y);
      pList2.addPoint (rect.x, rect.y + rect.height);

      graphics.drawPolyline(pList2);
   }
}

/*
 * $Log$
 * Revision 1.4  2008/10/10 11:54:47  travkin
 * Set initial CrossFigure size.
 *
 * Revision 1.3  2006/07/13 11:22:09  travkin
 * - Added some new useful figures.
 * - Added the class FigureTest for testing figures and layouts. It just opens a new window, wherein figures can be placed and viewed.
 *
 * Revision 1.2  2006/05/20 16:08:15  travkin
 * Removed some compile warnings.
 *
 * Revision 1.1  2006/02/15 18:34:09  mm
 * renamed plugin to Commons4Eclipse
 *
 * Revision 1.1  2005/11/23 14:26:14  mm
 * moved non-Fujaba-specific figures to AppIndependent4Eclipse
 *
 * Revision 1.1  2005/05/24 11:21:33  orohe
 * UMLLinks can be set to negative...
 *
 */
