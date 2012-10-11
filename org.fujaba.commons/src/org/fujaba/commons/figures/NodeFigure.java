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

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Vector;

import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.geometry.Point;


/**
 * @author    mm
 * @author    Last editor: $Author: travkin $
 * @version   $Revision: 1830 $ $Date: 2009-06-25 16:58:12 +0200 (Do, 25 Jun 2009) $
 */
public class NodeFigure extends FigureWithAntialiasingSupport
{
   protected HashMap<String, ConnectionAnchor> connectionAnchors = new HashMap<String, ConnectionAnchor>(7);

   protected Vector<ConnectionAnchor> inputConnectionAnchors = new Vector<ConnectionAnchor>(2, 2);

   protected Vector<ConnectionAnchor> outputConnectionAnchors = new Vector<ConnectionAnchor>(2, 2);

   public ConnectionAnchor connectionAnchorAt(Point p)
   {
      ConnectionAnchor closest = null;
      long min = Long.MAX_VALUE;

      Enumeration<ConnectionAnchor> e = getSourceConnectionAnchors().elements();
      while (e.hasMoreElements())
      {
         ConnectionAnchor c = e.nextElement();
         Point p2 = c.getLocation (null);
         long d = p.getDistance2 (p2);
         if (d < min)
         {
            min = d;
            closest = c;
         }
      }
      e = getTargetConnectionAnchors().elements();
      while (e.hasMoreElements())
      {
         ConnectionAnchor c = e.nextElement();
         Point p2 = c.getLocation (null);
         long d = p.getDistance2 (p2);
         if (d < min)
         {
            min = d;
            closest = c;
         }
      }
      return closest;
   }

   public ConnectionAnchor getConnectionAnchor(String terminal)
   {
      return connectionAnchors.get(terminal);
   }

   public String getConnectionAnchorName(ConnectionAnchor connectionAnchor)
   {
      Iterator<String> keyIter = connectionAnchors.keySet().iterator();
      String key;
      while (keyIter.hasNext())
      {
         key = keyIter.next();
         ConnectionAnchor anchor = connectionAnchors.get(key);
         if (anchor != null && anchor.equals(connectionAnchor))
         {
            return key;
         }
      }
      return null;
   }

   public ConnectionAnchor getSourceConnectionAnchorAt(Point point)
   {
      ConnectionAnchor closest = null;
      long min = Long.MAX_VALUE;

      Enumeration<ConnectionAnchor> e = getSourceConnectionAnchors().elements();
      while (e.hasMoreElements())
      {
         ConnectionAnchor c = e.nextElement();
         Point p2 = c.getLocation (null);
         long d = point.getDistance2 (p2);
         if (d < min)
         {
            min = d;
            closest = c;
         }
      }
      return closest;
   }

   // TODO prevent returning the complete container
   public Vector<ConnectionAnchor> getSourceConnectionAnchors()
   {
      return outputConnectionAnchors;
   }

   public ConnectionAnchor getTargetConnectionAnchorAt(Point point)
   {
      ConnectionAnchor closest = null;
      long min = Long.MAX_VALUE;

      Enumeration<ConnectionAnchor> e = getTargetConnectionAnchors().elements();
      while (e.hasMoreElements())
      {
         ConnectionAnchor c = e.nextElement();
         Point p2 = c.getLocation (null);
         long d = point.getDistance2 (p2);
         if (d < min)
         {
            min = d;
            closest = c;
         }
      }
      return closest;
   }

   // TODO prevent returning the complete container
   public Vector<ConnectionAnchor> getTargetConnectionAnchors()
   {
      return inputConnectionAnchors;
   }
}

/*
 * $Log$
 * Revision 1.3  2006/05/22 17:13:13  travkin
 * Removed obsolete attribute.
 *
 * Revision 1.2  2006/05/20 16:08:15  travkin
 * Removed some compile warnings.
 *
 * Revision 1.1  2006/02/15 18:34:10  mm
 * renamed plugin to Commons4Eclipse
 *
 * Revision 1.1  2005/11/23 14:26:15  mm
 * moved non-Fujaba-specific figures to AppIndependent4Eclipse
 *
 * Revision 1.6  2005/08/11 10:52:10  mm
 * renamed local variable to avoid collision with new enum keyword
 *
 */
