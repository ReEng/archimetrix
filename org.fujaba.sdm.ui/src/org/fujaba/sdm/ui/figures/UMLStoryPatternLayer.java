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

import org.eclipse.draw2d.FreeformLayer;
import org.eclipse.draw2d.FreeformLayout;


/**
 * No comment provided by developer, please add a comment to improve documentation.
 *
 * @author    $Author: travkin $
 * @version   $Revision: 1071 $ $Date: 2006-07-22 13:51:55 +0200 (Sa, 22 Jul 2006) $
 */
public class UMLStoryPatternLayer extends FreeformLayer
{
   /**
    *Constructor for class UMLStoryPatternLayer
    */
   public UMLStoryPatternLayer()
   {
      setLayoutManager (new FreeformLayout());
      setOpaque (true);
   }


   /**
    * No comment provided by developer, please add a comment to improve documentation.
    *
    * @return   No description provided
    */
   @Override
   protected boolean useLocalCoordinates()
   {
      return true;
   }
}

/*
 * $Log$
 * Revision 1.4  2006/07/22 11:51:54  travkin
 * Fixed a bug that prevents the user from creating transitions and links.
 *
 * Revision 1.3  2006/05/22 17:11:34  travkin
 * Removed most compile warnings.
 *
 * Revision 1.2  2006/02/19 19:12:57  mm
 * reimplemented story pattern unparsing (patch)
 *
 */
