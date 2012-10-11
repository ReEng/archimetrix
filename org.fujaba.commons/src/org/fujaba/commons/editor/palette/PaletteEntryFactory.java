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
package org.fujaba.commons.editor.palette;


import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.core.runtime.Platform;
import org.eclipse.gef.palette.ConnectionCreationToolEntry;
import org.eclipse.gef.palette.CreationToolEntry;
import org.eclipse.gef.palette.PaletteEntry;
import org.eclipse.gef.requests.CreationFactory;
import org.eclipse.jface.resource.ImageDescriptor;
import org.fujaba.commons.FujabaCommonsPlugin;
import org.fujaba.commons.extensionpoints.IPaletteEntryExtension;
import org.fujaba.commons.extensionpoints.util.ExtensionpointTools;
import org.osgi.framework.Bundle;



/**
 * Factory that implements the {@link IPaletteEntryExtension}point to create
 * palette entries. Based on 'sluzar's original {@link
 * de.uni_paderborn.fujaba4eclipse.extensionpoints.IDiagramPaletteEntryExtension
 * IDiagramPaletteEntryExtension}point.
 * @author Thomas Gewering (cytom)
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 */
public class PaletteEntryFactory implements IPaletteEntryExtension,
      IExecutableExtension
{

   /**
    * configuration element specified in the manifest (plugin.xml)
    */
   private IConfigurationElement config;


   /**
    * @see org.eclipse.core.runtime.IExecutableExtension#setInitializationData(org.eclipse.core.runtime.IConfigurationElement, java.lang.String, java.lang.Object)
    */
   public void setInitializationData(IConfigurationElement configElement,
         String propertyName, Object data)
   {
      config = configElement;
   }


   /**
    * @see de.uni_paderborn.fujaba4eclipse.extensionpoints.IPaletteEntryExtension#createPaletteEntry(de.uni_paderborn.fujaba.metamodel.common.FDiagram)
    */
   public PaletteEntry createPaletteEntry()
   {
      // load product class (model element to be created by the entry)
      Bundle bundle = Platform.getBundle(config.getContributor().getName());
      if (bundle == null)
      {
         return null;
      }
      Class<?> product;
      try
      {
         product = bundle.loadClass(config.getAttribute("product"));
      }
      catch (ClassNotFoundException e)
      {
         FujabaCommonsPlugin.getDefault().logError(e.getMessage(), e);
         return null;
      }

      // load entry icons (use 16x16 pixel icon as fallback for the 24x24 pixel icon)
      ImageDescriptor icon16 = ExtensionpointTools.getImage(config, "icon16");
      ImageDescriptor icon24 = ExtensionpointTools.getImage(config, "icon24", true);
      if (icon24 == null)
      {
         icon24 = icon16;
      }

      // construct a default tooltip using the label
      String label = config.getAttribute("label");
      String tooltip = config.getAttribute("tooltip");
      if (tooltip == null && label != null && label.length() > 0)
      {
         if ("aAoOuUiI".contains(label.substring(0, 1)))
         {
            tooltip = "Create an " + label;
         }
         else
         {
            tooltip = "Create a " + label;
         }
      }

      CreationFactory factory = new EObjectCreationFactory(product);
      
      // create a CreationEntry depending on entry type
      if ("element".equals(config.getAttribute("type")))
      {
         CreationToolEntry entry = new CreationToolEntry(label, tooltip,
               factory, icon16, icon24);
         return entry;
      }
      else
      // if ("connection".equals(config.getAttribute("type")))
      {
         return new ConnectionCreationToolEntry(label, tooltip, factory,
               icon16, icon24);
      }
   }
}
