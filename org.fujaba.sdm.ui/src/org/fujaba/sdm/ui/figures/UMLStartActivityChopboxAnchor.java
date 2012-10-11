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

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Rectangle;


/**
 * @author    Dietrich Travkin (travkin)
 * @author    Last editor: $Author: fklein $
 * @version   $Revision: 1209 $ $Date: 2006-12-08 19:47:45 +0100 (Fr, 08 Dez 2006) $
 */
public class UMLStartActivityChopboxAnchor extends CircleChopboxAnchor
{
   /**
    *Constructor for class UMLStartActivityChopboxAnchor
    *
    * @param owner  No description provided
    */
   public UMLStartActivityChopboxAnchor (IFigure owner)
   {
      super (owner);
   }


   /**
    * @return   The box value
    * @see      org.eclipse.draw2d.ChopboxAnchor#getBox()
    */
   @Override
   protected Rectangle getBox()
   {
      UMLStartActivityFigure figure = (UMLStartActivityFigure) this.getOwner();
      return figure.getCircleBounds();
   }
}

/*
 * $Log$
 * Revision 1.6  2006/12/08 18:47:24  fklein
 * Changed imported package to match restructuring in commons4eclipse
 *
 * Revision 1.5  2006/05/26 17:24:04  travkin
 * Added another EditPart for diagrams. AbstractASGDiagramEditPart creates
 * a ScalableFreeformLayeredPane as figure and sets the connection router.
 *
 * The UMLDiagramEditPart is an abstract subclass of AbstractASGDiagramEditPart and adds a label figure containing the diagram's name to the pane.
 *
 * Revision 1.4  2006/05/22 17:11:34  travkin
 * Removed most compile warnings.
 *
 * Revision 1.3  2006/04/11 17:07:05  travkin
 * Changed some javadoc comments.
 *
 */
