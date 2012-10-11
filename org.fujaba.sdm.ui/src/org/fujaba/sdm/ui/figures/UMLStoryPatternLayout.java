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


import java.util.Iterator;

import org.eclipse.draw2d.AbstractLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;


/**
 * No comment provided by developer, please add a comment to improve documentation.
 * 
 * @author $Author: mm $
 * @version $Revision: 1556 $ $Date: 2008-05-04 18:20:51 +0200 (So, 04 Mai 2008) $
 */
public class UMLStoryPatternLayout extends AbstractLayout
{
   private boolean centerLabel = true;


   public void setCenterLabel(boolean centerLabel)
   {
      this.centerLabel = centerLabel;
   }


   /**
    * Get the preferredSize attribute of the UMLStoryPatternLayout object
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
      Dimension d = new Dimension();
      Iterator childIter = container.getChildren().iterator();
      while (childIter.hasNext())
      {
         IFigure child = (IFigure) childIter.next();
         Dimension childDim = child.getPreferredSize(wHint, hHint);
         d.width = Math.max(d.width, childDim.width);
         d.height += childDim.height;
      }
      return d;
   }


   /**
    * No comment provided by developer, please add a comment to improve documentation.
    * 
    * @param container No description provided
    */
   public void layout(IFigure container)
   {
      // a story pattern figure has two children, a LabelFigure and a FreeformLayer
      if (container instanceof UMLStoryPatternFigure
            && container.getChildren().size() == 2)
      {
         Rectangle availableArea = container.getClientArea();

         // set first figure, the label, to its preferred height and available width
         IFigure label = (IFigure) container.getChildren().get(0);
         Dimension prefSize = label.getPreferredSize();

         label.setSize(prefSize.width, prefSize.height);
         if (this.centerLabel)
         {
            label.setLocation(new Point(
                  (availableArea.width - prefSize.width) / 2, availableArea.y));
         }
         else
         {
            label.setLocation(new Point(availableArea.x, availableArea.y));
         }

         // set second figure, the pane, to fill the rest of the available area
         IFigure pane = (IFigure) container.getChildren().get(1);
         availableArea.y += prefSize.height;
         availableArea.height -= prefSize.height;
         pane.setBounds(availableArea);
      }
   }

}

/*
 * $Log$
 * Revision 1.7  2008/05/04 16:20:50  mm
 * - enabled configuration of the parent for a created link
 * - allowed to switch off centered display of story pattern labels
 * Revision 1.6 2007/02/06 15:32:59 mm display stereotypes in
 * story activities [patch by rafald] Revision 1.5 2007/01/15 09:26:51 mtt revoked patch to show
 * stereotypes due to problems concerning the size of the embedded story pattern
 * 
 * Revision 1.3 2006/05/22 17:11:34 travkin Removed most compile warnings.
 * 
 * Revision 1.2 2006/02/19 19:12:57 mm reimplemented story pattern unparsing (patch)
 * 
 */
