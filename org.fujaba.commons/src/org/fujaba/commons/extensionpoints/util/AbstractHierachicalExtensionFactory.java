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
package org.fujaba.commons.extensionpoints.util;


import java.util.List;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.fujaba.commons.extensionpoints.IPaletteContainerExtension;



/**
 * Abstract factory for implementing a hierarchical extension point (see {@link
 * IHierachicalExtension}) that allows:<ul>
 * <li>referencing child elements and </li>
 * <li>previous/next-elements associations between the child elements.</li>
 * </ul>
 * Example of supported extension points:
 * <pre>
 * &lt;!-- First the child elements are defined with unique ids. -->
 * &lt;extension point="children">
 *    &lt;child id="child1" ... factory="..." />
 *    &lt;child id="child2" ... factory="..." />
 *    &lt;child id="child3" ... factory="..." />
 * &lt;/extension>
 * 
 * &lt;!-- Then the child elements can be referenced by their ids and
 *         ordered by prev/next associations. -->
 * &lt;extension point="elements">
 *    &lt;element>
 *       &lt;childRef
 *             childID="child1"
 *             nextChildIDs="child2" />
 *       &lt;childRef
 *             childID="child2"
 *             prevChildIDs="child1"
 *             nextChildIDs="child3" />
 *       &lt;childRef
 *             childID="child3"
 *             prevChildIDs="child2" />
 *    &lt;/element>
 * &lt;/extension>
 * </pre>
 * @param T the child extension point
 * @author Thomas Gewering (cytom)
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 */
public abstract class AbstractHierachicalExtensionFactory<T> implements
      IHierachicalExtension<T>, IExecutableExtension
{
   /**
    * attribute which contains the child elements
    */
   private String childrenAttr;
   /**
    * attribute which references a child element
    */
   private String childRefAttr;
   /**
    * attribute which references a previous child
    */
   private String childPrevAttr;
   /**
    * attribute which references a next child
    */
   private String childNextAttr;
   /**
    * attribute of child elements which is referenced by 'childRefAttr'
    */
   private String childIdAttr;
   /**
    * extension point of referenced children
    */
   private String childExtPointId = IPaletteContainerExtension.PALETTE_CONTAINER_EXTENSION_POINT_ID;
   /**
    * attribute which defines the factory to create the child element
    */
   private String childFactoryAttr = "factory";
   /**
    * attribute which defines a default factory to create child elements
    */
   private Class<? extends T> childDefaultFactory;
   

   /**
    * configuration element specified in the manifest (plugin.xml)
    */
   private IConfigurationElement config;
   
   

   /**
    * Constructor which uses a 'childName' to construct the attribute names
    * used in the extension point definition. <br/>
    * The example shown in class description shows a extension point definition
    * that used 'child' as the childName.
    * @param childName name that is used to construct the attribute names
    * @param extPoint extension point of referenced children
    * @param defaultFactory attribute which defines a default factory to create child elements
    */
   public AbstractHierachicalExtensionFactory(String childName, String extPoint, Class<? extends T> defaultFactory)
   {
      this(childName + "Ref", childName + "ID",
            "prev" + camelCase(childName) + "IDs", "next" + camelCase(childName) + "IDs",
            "id", extPoint, "factory", defaultFactory);
   }
   
   

   /**
    * Constructor
    * @param children attribute which contains the child elements
    * @param ref attribute which references a child element
    * @param prev attribute which references a previous child
    * @param next attribute which references a next child
    * @param id attribute of child elements which is referenced by 'ref'
    * @param extPoint extension point of referenced children
    * @param factory attribute which defines a factory to create the child element
    * @param defaultFactory attribute which defines a default factory to create child elements
    */
   public AbstractHierachicalExtensionFactory(String children, String ref, String prev, String next, String id, String extPoint, String factory, Class<? extends T> defaultFactory)
   {
      childrenAttr = children;
      childRefAttr = ref;
      childPrevAttr = prev;
      childNextAttr = next;
      childIdAttr = id;
      childExtPointId = extPoint;
      childFactoryAttr = factory;
      childDefaultFactory = defaultFactory;
   }


   /**
    * @see de.uni_paderborn.fujaba4eclipse.extensionpoints.tools.IHierachicalExtension#getChildren()
    */
   public IConfigurationElement[] getChildren()
   {
      return config.getChildren(childrenAttr);
   }


   /**
    * @see de.uni_paderborn.fujaba4eclipse.extensionpoints.tools.IHierachicalExtension#createChildFactories()
    */
   public List<T> createChildFactories()
   {
      List<String> ids = getChildrenIds();
      // find configuration elements for child ids
      List<IConfigurationElement> elements = ExtensionpointTools.resolveReferences(ids, childIdAttr, childExtPointId);
      // and create their factorys
      return ExtensionpointTools.createFactories(elements, childFactoryAttr, childDefaultFactory);
   }


   /**
    * Returns the sorted children ids to create factories for.
    * @return the sorted children ids
    */
   protected List<String> getChildrenIds()
   {
      return ExtensionpointTools.getSortedReferences(getChildren(), childRefAttr, childPrevAttr, childNextAttr);
   }


   /**
    * @see org.eclipse.core.runtime.IExecutableExtension#setInitializationData(org.eclipse.core.runtime.IConfigurationElement, java.lang.String, java.lang.Object)
    */
   public void setInitializationData(IConfigurationElement configElement, String propertyName, Object data)
   {
      config = configElement;
   }


   /**
    * @return the configuration element of this factory
    */
   public IConfigurationElement getConfig()
   {
      return config;
   }


   /**
    * @return convert first character of a string to uppercase
    */
   protected static String camelCase(String s)
   {
      if (s == null || s.length() == 0)
      {
         return "";
      }
      return s.substring(0, 1).toUpperCase() + s.substring(1);
   }
}
