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


import org.eclipse.draw2d.AbstractLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;


/**
 * No comment provided by developer, please add a comment to improve documentation.
 * 
 * @author $Author: mvdetten $
 * @version $Revision: 1844 $ $Date: 2009-06-30 13:33:32 +0200 (Di, 30 Jun 2009) $
 */
public class UMLActivityLayout extends AbstractLayout
{
   /**
    * Get the preferredSize attribute of the UMLActivityLayout object
    * 
    * @param container No description provided
    * @param wHint No description provided
    * @param hHint No description provided
    * @return The preferredSize value
    */
   @Override
   public Dimension getPreferredSize(IFigure container, int wHint, int hHint)
   {
      return calculatePreferredSize(container, wHint, hHint);
   }


   /**
    * No comment provided by developer, please add a comment to improve documentation.
    * 
    * @param container No description provided
    * @param wHint No description provided
    * @param hHint No description provided
    * @return No description provided
    */
   @Override
   protected Dimension calculatePreferredSize(IFigure container, int wHint,
         int hHint)
   {
      if (container instanceof AbstractUMLActivityFigure)
      {
         if (container instanceof UMLStoryActivityFigure
               && container.getChildren().size() == 2)
         {
            IFigure child0 = (IFigure) container.getChildren().get(0);
            IFigure child1 = (IFigure) container.getChildren().get(1);

            Dimension d0 = child0.getPreferredSize(wHint, hHint);
            Dimension d = child1.getPreferredSize(wHint, hHint);
            Insets i = container.getInsets();
            d.width += d0.width + i.left + i.right;
            d.height += d0.height + i.top + i.bottom;
            return d;
         }
         // a UMLActivity has only one child, its content pane
         // preferred size is the preferred size of the child plus the insets
         // of
         // the acitivity figure
         else if (container.getChildren().size() == 1)
         {
            IFigure child = (IFigure) container.getChildren().get(0);

            Dimension d = child.getPreferredSize(wHint, hHint);
            Insets i = container.getInsets();
            d.width += i.left + i.right;
            d.height += i.top + i.bottom;

            return d;
         }
      }
      return null;
   }


   /**
    * No comment provided by developer, please add a comment to improve documentation.
    * 
    * @param container No description provided
    */
   public void layout(IFigure container)
   {
      // rafal /pgase/
      // we need the UMLStoryActivityFigure to show
      // its stereotypes
      if (container instanceof AbstractUMLActivityFigure)
      {
         if (container instanceof UMLStoryActivityFigure
               && container.getChildren().size() == 2)
         {
            IFigure child0 = (IFigure) container.getChildren().get(0);
            IFigure child1 = (IFigure) container.getChildren().get(1);
            Rectangle clientArea = container.getClientArea();
            // Set the preferred size for the upper figure
            // representing the stereotypes
            // we specify the width as the with of the
            // whole clientArea in order to centerize
            // the stereotypes description
            Dimension child0dim = child0.getPreferredSize();
            child0.setLocation(new Point(0, 0));
            child0.setBounds(new Rectangle(0, 0, clientArea.width,
                  child0dim.height));

            // Update the bounds of the lower figure
            Dimension child1dim = child1.getPreferredSize();
            child1.setLocation(new Point(0, child0.getBounds().height));
            child1.setBounds(new Rectangle(0, child0.getBounds().height,
                  clientArea.width, Math.max(clientArea.height
                        - child0dim.height, child1dim.height)));
            Insets i = container.getInsets();
            // Resize the whole container

            container.setBounds(new Rectangle(container.getBounds().x,
                  container.getBounds().y, Math.max(child0.getBounds().width,
                        child1.getBounds().width)
                        + i.left + i.right, Math.max(clientArea.height, child0
                        .getBounds().height
                        + child1.getBounds().height)
                        + i.top + i.bottom));
         }
         else if (container.getChildren().size() == 1)
         {
            // an UMLActivity has only one child, its content pane
            // the child is laid out to fill the whole available area
            IFigure child = (IFigure) container.getChildren().get(0);
            Rectangle clientArea = container.getClientArea();
            child.setBounds(clientArea);
         }
      }
   }
}

/*
 * $Log$ Revision 1.6 2007/02/06 15:32:59 mm display stereotypes in story activities [patch by
 * rafald] Revision 1.5 2007/01/15 09:26:51 mtt revoked patch to show stereotypes due to problems
 * concerning the size of the embedded story pattern
 * 
 * Revision 1.3 2006/05/22 17:11:34 travkin Removed most compile warnings.
 * 
 * Revision 1.2 2006/02/19 19:12:57 mm reimplemented story pattern unparsing (patch)
 */
