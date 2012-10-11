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

import org.eclipse.draw2d.BorderLayout;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.graphics.Color;
import org.fujaba.commons.Commons4EclipseFonts;
import org.fujaba.commons.figures.LabelFigure;
import org.fujaba.commons.figures.NodeFigure;



/**
 * @author    Dietrich Travkin (travkin)
 * @version   $Revision: 1022 $ $Date: 2006-05-22 19:11:54 +0200 (Mo, 22 Mai 2006) $
 */
public class UMLStartActivityFigure extends NodeFigure
{
   /**
    * No comment provided by developer, please add a comment to improve documentation.
    */
   private Label myLabel;

   /**
    * No comment provided by developer, please add a comment to improve documentation.
    */
   private CircleFigure circle;


   /**
    * Constructor for class UMLClassFigure
    *
    * @param name  No description provided
    */
   public UMLStartActivityFigure (String name)
   {
      super();
      BorderLayout layout = new BorderLayout();
      layout.setVerticalSpacing (3);
      this.setLayoutManager (layout);
      this.setBackgroundColor (ColorConstants.black);
      this.setOpaque (false);

      this.myLabel = new LabelFigure (name, Commons4EclipseFonts.getFont (Commons4EclipseFonts.FONT_DEFAULT_NORMAL));

      this.add (this.myLabel, BorderLayout.TOP);
      circle = new CircleFigure (this.getBackgroundColor());
      circle.setOpaque (true);
      this.add (circle, BorderLayout.CENTER);
   }


   /**
    * Get the name attribute of the UMLStartActivityFigure object
    *
    * @return   The name value
    */
   public String getName()
   {
      return this.myLabel.getText();
   }


   /**
    * @param name  The new name value
    */
   public void setName (String name)
   {
      this.myLabel.setText (name);
   }


   /**
    * Get the circleBounds attribute of the UMLStartActivityFigure object
    *
    * @return   The circleBounds value
    */
   Rectangle getCircleBounds()
   {
      return this.circle.getBounds();
   }


   /**
    * @param wHint  No description provided
    * @param hHint  No description provided
    * @return       The preferredSize value
    * @see          org.eclipse.draw2d.IFigure#getPreferredSize(int, int)
    */
   @Override
   public Dimension getPreferredSize (int wHint, int hHint)
   {
      this.circle.setSize (15, 15);
      return super.getPreferredSize (wHint, hHint);
   }


   /**
    * @param bg  The new backgroundColor value
    * @see       org.eclipse.draw2d.IFigure#setBackgroundColor(org.eclipse.swt.graphics.Color)
    */
   @Override
   public void setBackgroundColor (Color bg)
   {
      super.setBackgroundColor (bg);
      if (this.circle != null)
      {
         this.circle.setBackgroundColor (bg);
      }
   }
}

/*
 * $Log$
 * Revision 1.4  2006/05/22 17:11:34  travkin
 * Removed most compile warnings.
 *
 * Revision 1.3  2006/04/11 17:07:05  travkin
 * Changed some javadoc comments.
 *
 */
