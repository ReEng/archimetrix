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


/**
 * Abstract factory for implementing a hierarchical extension point (see {@link
 * IHierachicalExtension}) that allows:<ul>
 * <li>referencing child elements,</li>
 * <li>previous/next-elements associations between the child elements,</li>
 * <li>inheriting child elements from a previously defined extension and</li>
 * <li>hiding some of the inherited child elements.</li>
 * </ul>
 * Example of supported extension points:
 * <pre>
 * &lt;!-- First the define a hierarchical extension. -->
 * &lt;extension point="children">
 *    &lt;child id="child1" ... factory="..." />
 *    &lt;child id="child2" ... factory="..." />
 *    &lt;child id="child3" ... factory="..." />
 * &lt;/extension>
 * &lt;extension point="elements">
 *    &lt;element id="element1" ... factory="...">
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
 * 
 * &lt;!-- Now the previously defined extension can be "extended". -->
 * &lt;extension point="children">
 *    &lt;child id="child4" ... />
 * &lt;/extension>
 * &lt;extension point="elements">
 *    &lt;element id="element2" ... extends="element1">
 *       &lt;hideChildRef
 *             childID="child2" />
 *       &lt;childRef
 *             childID="child4"
 *             prevChildIDs="child2"
 *             nextChildIDs="child3" />
 *    &lt;/element>
 * &lt;/extension>
 * </pre>
 * @param T the child extension point
 * @param U the extension point the extended element (and this factory) implement
 * @author Thomas Gewering (cytom)
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 */
public abstract class AbstractInheritingHierachicalExtensionFactory<U extends IHierachicalExtension<T>, T>
      extends AbstractHierachicalExtensionFactory<T>
{
   /**
    * attribute which references the extended element (from which child elements are inherited)
    */
   private String extendAttr;
   /**
    * attribute of the element which is referenced by 'extendAttr'
    */
   private String extendIdAttr;
   /**
    * extension point of extended element
    */
   private String extendExtPointId;
   /**
    * attribute which defines a factory to get inherited children from
    */
   private String extendFactoryAttr;
   /**
    * attribute which defines a default factory to get the inherited children from
    */
   private Class<? extends U> extendDefaultFactory;
   /**
    * attribute which contains the inherited child elements to hide
    */
   private String hideChildrenAttr;
   /**
    * attribute which references to a inherited child element to hide
    */
   private String hideRefAttr;


   /**
    * Constructor which uses a 'childName' to construct the attribute names
    * used in the extension point definition. <br/>
    * The example shown in class description shows a extension point definition
    * that used 'child' as the childName.
    * @param childName name that is used to construct the attribute names
    * @param extendExtPoint extension point of extended element
    * @param extendDefaultFactory attribute which defines a default factory to get the inherited children from
    * @param childExtPoint extension point of referenced children
    * @param childDefaultFactory attribute which defines a default factory to create child elements
    */
   public AbstractInheritingHierachicalExtensionFactory(
         String childName,
         String extendExtPoint, Class<? extends U> extendDefaultFactory,
         String childExtPoint, Class<? extends T> childDefaultFactory)
   {
      super(childName, childExtPoint, childDefaultFactory);
      extendAttr = "extends";
      extendIdAttr = "id";
      extendExtPointId = extendExtPoint;
      extendFactoryAttr = "factory";
      this.extendDefaultFactory = extendDefaultFactory;
      hideChildrenAttr = "hide" + camelCase(childName) + "Ref";
      hideRefAttr = childName + "ID";
   }


   /**
    * Constructor
    * @param extend attribute which references the extended element (from which child elements are inherited)
    * @param extendId attribute of the element which is referenced by 'extend'
    * @param extendExtPoint extension point of extended element
    * @param extendFactory attribute which defines a factory to get inherited children from
    * @param extendDefaultFactory attribute which defines a default factory to get the inherited children from
    * @param hideChildren attribute which contains the inherited child elements to hide
    * @param hideRef attribute which references to a inherited child element to hide
    * @param children attribute which contains the child elements
    * @param ref attribute which references a child element
    * @param prev attribute which references a previous child
    * @param next attribute which references a next child
    * @param id attribute of child elements which is referenced by 'ref'
    * @param extPoint extension point of referenced children
    * @param factory attribute which defines a factory to create the child element
    * @param defaultFactory attribute which defines a default factory to create child elements
    */
   public AbstractInheritingHierachicalExtensionFactory(
         String extend, String extendId, String extendExtPoint, String extendFactory, Class<? extends U> extendDefaultFactory,
         String hideChildren, String hideRef, 
         String children, String ref, String prev, String next, String id, String extPoint, String factory, Class<? extends T> defaultFactory)
   {
      super(children, ref, prev, next, id, extPoint, factory, defaultFactory);
      extendAttr = extend;
      extendIdAttr = extendId;
      extendExtPointId = extendExtPoint;
      extendFactoryAttr = extendFactory;
      this.extendDefaultFactory = extendDefaultFactory;
      hideChildrenAttr = hideChildren;
      hideRefAttr = hideRef;
   }

   
   /**
    * @see de.uni_paderborn.fujaba4eclipse.extensionpoints.tools.AbstractHierachicalExtensionFactory#getChildren()
    */
   @Override
   public IConfigurationElement[] getChildren()
   {
      // get inherited child configs
      IConfigurationElement[] inherited = getInheritedChildren();
      
      // get our own child configs
      IConfigurationElement[] refElements = super.getChildren();

      return ExtensionpointTools.joinArrays(inherited, refElements);
   }


   /**
    * @return
    */
   protected IConfigurationElement[] getInheritedChildren()
   {
      String ext = getConfig().getAttribute(extendAttr);
      if (ext == null)
      {
         return null;
      }
      // create factory for the extended element
      IConfigurationElement elem = ExtensionpointTools.resolveReference(ext, extendIdAttr, extendExtPointId);
      U factory = ExtensionpointTools.<U>createFactory(elem, extendFactoryAttr, extendDefaultFactory);
      // and return its children
      return factory.getChildren();
   }


   /**
    * @see de.uni_paderborn.fujaba4eclipse.extensionpoints.tools.AbstractHierachicalExtensionFactory#getChildrenIds()
    */
   @Override
   protected List<String> getChildrenIds()
   {
      List<String> ids = super.getChildrenIds();

      // remove (inherited) children which should be hidden
      for (IConfigurationElement elem : getConfig().getChildren(hideChildrenAttr))
      {
         ids.remove(elem.getAttribute(hideRefAttr));
      }
      return ids;
   }
}
