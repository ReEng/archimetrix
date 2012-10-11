/*
 * The FUJABA ToolSuite project:
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
 *      Copyright (C) 1997-2009 Fujaba Development Group
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
 * Contact adress:
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
package org.fujaba.commons.editor.palette;

import org.eclipse.gef.palette.MarqueeToolEntry;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteEntry;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.PaletteSeparator;
import org.eclipse.gef.palette.SelectionToolEntry;
import org.eclipse.gef.palette.ToolEntry;
import org.fujaba.commons.extensionpoints.IPaletteContainerExtension;
import org.fujaba.commons.extensionpoints.IPaletteExtension;
import org.fujaba.commons.extensionpoints.util.AbstractInheritingHierachicalExtensionFactory;


/**
 * Factory used in the {@link IPaletteExtension}point as default factory to
 * create palette containers.
 * @author Thomas Gewering (cytom)
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 */
public class PaletteFactory extends
      AbstractInheritingHierachicalExtensionFactory<IPaletteExtension, IPaletteContainerExtension>
      implements IPaletteExtension
{

   /**
    * Constructor
    */
   public PaletteFactory()
   {
      super("container", IPaletteExtension.PALETTE_EXTENSION_POINT_ID,
            PaletteFactory.class,
            IPaletteContainerExtension.PALETTE_CONTAINER_EXTENSION_POINT_ID, 
            PaletteContainerFactory.class);
   }


   /**
    * @see de.uni_paderborn.fujaba4eclipse.extensionpoints.IPaletteExtension#createPalette(de.uni_paderborn.fujaba.metamodel.common.FDiagram)
    */
   public PaletteRoot createPalette()
   {
      // create a palette
      PaletteRoot palette = createPaletteRoot();

      // create and add the containers to the palette
      for (IPaletteContainerExtension factory : createChildFactories())
      {
         PaletteContainer container = factory.createPaletteContainer();
         palette.add(container);
      }
      return palette;
   }


   /**
    * @return a new palette
    */
   protected PaletteRoot createPaletteRoot()
   {
      PaletteRoot root = new PaletteRoot();
      PaletteGroup group = createDefaultToolsGroup(root);
      root.add(group);
      return root;
   }
   
   private PaletteGroup createDefaultToolsGroup(PaletteRoot root)
   {
      PaletteGroup toolGroup = new PaletteGroup ("Tools");

      //selection tool
      ToolEntry tool = new SelectionToolEntry();
      toolGroup.add (tool);
      root.setDefaultEntry (tool);

      //marquee tool
      toolGroup.add (new MarqueeToolEntry());

      //separator
      PaletteSeparator separator = new PaletteSeparator();
      separator.setUserModificationPermission (PaletteEntry.PERMISSION_NO_MODIFICATION);
      toolGroup.add (separator);

      return toolGroup;
   }
}
