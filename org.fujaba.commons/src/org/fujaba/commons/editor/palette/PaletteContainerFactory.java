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

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteEntry;
import org.eclipse.jface.resource.ImageDescriptor;
import org.fujaba.commons.extensionpoints.IPaletteContainerExtension;
import org.fujaba.commons.extensionpoints.IPaletteEntryExtension;
import org.fujaba.commons.extensionpoints.util.AbstractInheritingHierachicalExtensionFactory;
import org.fujaba.commons.extensionpoints.util.ExtensionpointTools;


/**
 * Factory that implements the {@link IPaletteContainerExtension}point to
 * create palette containers.
 * @author Thomas Gewering (cytom)
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 */
public class PaletteContainerFactory extends
      AbstractInheritingHierachicalExtensionFactory<IPaletteContainerExtension, IPaletteEntryExtension>
      implements IPaletteContainerExtension
{

   /**
    * Constructor
    */
   public PaletteContainerFactory()
   {
      super("entry",
            IPaletteContainerExtension.PALETTE_CONTAINER_EXTENSION_POINT_ID,
            PaletteContainerFactory.class,
            IPaletteEntryExtension.PALETTE_ENTRY_EXTENSION_POINT_ID,
            PaletteEntryFactory.class);
   }


   /**
    * @see de.uni_paderborn.fujaba4eclipse.extensionpoints.IPaletteContainerExtension#createPaletteContainer(de.uni_paderborn.fujaba.metamodel.common.FDiagram)
    */
   public PaletteContainer createPaletteContainer()
   {
      // create a palette container
      PaletteContainer container = createPaletteDrawer();

      // create and add the entries to the container
      for (IPaletteEntryExtension factory : createChildFactories())
      {
         PaletteEntry entry = factory.createPaletteEntry();
         container.add(entry);
      }
      return container;
   }


   /**
    * @return a new palette container
    */
   protected PaletteContainer createPaletteDrawer()
   {
      ImageDescriptor icon = ExtensionpointTools.getImage(getConfig(), "icon");
      return new PaletteDrawer(getConfig().getAttribute("label"), icon);
   }
}
