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
package org.fujaba.commons.extensionpoints.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.resource.ImageDescriptor;
import org.fujaba.commons.FujabaCommonsImages;
import org.fujaba.commons.FujabaCommonsPlugin;
import org.fujaba.commons.utils.OrderedNode;
import org.fujaba.commons.utils.TopologicalOrder;


/**
 * Utility class which provides helper methods for (hierachical)
 * extensionpoints. Based on some work of 'sluzar'.
 * @author Thomas Gewering (cytom)
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 */
public class ExtensionpointTools
{
   /**
    * Returns a sorted list of references build by topological sorting elements
    * which have reference-, previous- and next-attributes.
    * @param elems elements which have reference-, previous- and next-attributes
    * @param refAttr reference-attribute name
    * @param prevAttr previous-attribute name
    * @param nextAttr next-attribute name
    * @return sorted list of references
    */
   public static List<String> getSortedReferences(IConfigurationElement[] elems,
         String refAttr, String prevAttr, String nextAttr)
   {
      // build topological sorted graph of references
      TopologicalOrder<IConfigurationElement> graph = createTopologicalOrder(elems, refAttr, prevAttr, nextAttr);
      // extract sorted list of references
      List<String> result = new ArrayList<String>(graph.size());
      for (OrderedNode<IConfigurationElement> node; (node = graph.dequeue()) != null;)
      {
         if (node.getElement() == null)
         {
            continue;
         }
         result.add(node.getId());
      }
      if (graph.size() != 0)
      {
         FujabaCommonsPlugin.getDefault().logError("The ordering of the following '" + refAttr + "'-references form a cycle!");
      }
      return result;
   }


   /**
    * Create a topological graph of extensionpoint configuration elements by
    * taking the ordering from the configuration elements attributes.
    * @param elements extensionpoint configuration elements which provide id-, prevId- and nextId-attributes
    * @param idAttr name of the id attribute
    * @param prevIdAttr name of the prevId-attribute
    * @param nextIdAttr name of the nextId-attribute
    * @return topological graph containing the configuration elements
    */
   private static TopologicalOrder<IConfigurationElement> createTopologicalOrder(
         IConfigurationElement[] elements, String idAttr, String prevIdAttr, String nextIdAttr)
   {
      TopologicalOrder<IConfigurationElement> graph = new TopologicalOrder<IConfigurationElement>();
      addToTopologicalOrder(graph, elements, idAttr, prevIdAttr, nextIdAttr);
      return graph;
   }


   /**
    * Insert extensionpoint configuration elements into a topological graph by
    * taking the ordering from the configuration elements attributes.
    * @param graph topological graph to insert the configuration elements into
    * @param elements extensionpoint configuration elements which provide id-, prevId- and nextId-attributes
    * @param idAttr name of the id attribute
    * @param prevIdAttr name of the prevId-attribute
    * @param nextIdAttr name of the nextId-attribute
    */
   private static void addToTopologicalOrder(TopologicalOrder<IConfigurationElement> graph,
         IConfigurationElement[] elements, String idAttr, String prevIdAttr, String nextIdAttr)
   {
      // Add all entries and edges to the TopologicalOrder
      for (IConfigurationElement elem : elements)
      {
         // create or get the node
         String id = elem.getAttribute(idAttr);
         OrderedNode<IConfigurationElement> node = getOrCreateNode(graph, id, elem);
         // build the incoming edges
         String prevIDs = elem.getAttribute(prevIdAttr);
         for (String prevID : trimSplit(prevIDs))
         {
            getOrCreateNode(graph, prevID, null).addToNext(node);
         }
         // build the outgoing edges
         String nextIDs = elem.getAttribute(nextIdAttr);
         for (String nextID : trimSplit(nextIDs))
         {
            getOrCreateNode(graph, nextID, null).addToPrevious(node);
         }
      }
   }


   /**
    * Gets or creates a node in a topological graph.
    * @param <T> graph element type
    * @param graph topological graph to get from or create into the node
    * @param id node id
    * @param elem element to set as node data
    * @return the retrieved or created node
    */
   private static <T> OrderedNode<T> getOrCreateNode(TopologicalOrder<T> graph, String id, T elem)
   {
      OrderedNode<T> node = graph.get(id);
      if (node == null)
      {
         node = new OrderedNode<T>(id, elem);
         graph.add(node);
      }
      else if (elem != null)
      {
         node.setElement(elem);
      }
      return node;
   }


   /**
    * Returns the trimmed and by ";:," splitted parts of a string.
    * @param string string to split
    * @return the trimmed and by ";:," splitted parts of a string
    */
   private static String[] trimSplit(String string)
   {
      return trimSplit(string, ";:,");
   }


   /**
    * Returns the trimmed and splitted parts of a string.
    * @param string string to split
    * @param sep seperator chars
    * @return the trimmed and splitted parts of a string
    */
   private static String[] trimSplit(String string, String sep)
   {
      if (string == null)
      {
         return new String[] {};
      }
      String[] s = string.split(sep);
      for (int i = 0; i < s.length; i++)
      {
         s[i] = s[i].trim();
      }
      return s;
   }


   /**
    * Returns a list of configuration elements matching the references list.
    * @param refs list of references
    * @param attr attribute name which is referenced
    * @param extensionPointId extensionpoint of the configuration elements that are referenced
    * @return a list of configuration elements matching the references list
    */
   public static List<IConfigurationElement> resolveReferences(List<String> refs,
         String attr, String extensionPointId)
   {
      return resolveReferences(refs, attr, extensionPointId, false);
   }


   /**
    * Returns a list of configuration elements matching the references list.
    * @param refs list of references
    * @param attr attribute name which is referenced
    * @param extensionPointId extensionpoint of the configuration elements that are referenced
    * @param allowNull don't throw an exception if there are unresolvable references 
    * @return a list of configuration elements matching the references list
    */
   private static List<IConfigurationElement> resolveReferences(List<String> refs,
         String attr, String extensionPointId, boolean allowNull)
   {
      // create map for fast testing if an elements attribute value is in the references list (#refernces < #elements)
      Map<String, IConfigurationElement> map = new HashMap<String, IConfigurationElement>(refs.size());
      for (String ref : refs)
      {
         map.put(ref, null);
      }
      // get all elements of the extensionpoint
      IExtensionRegistry registry = Platform.getExtensionRegistry();
      IConfigurationElement[] elements = registry.getConfigurationElementsFor(extensionPointId);
      for (IConfigurationElement elem : elements)
      {
         String ref = elem.getAttribute(attr);
         if (map.containsKey(ref))
         {
            // assign matching element to the reference
            map.put(ref, elem);
         }
      }
      // return the matched elements as sorted list according to the references list
      List<IConfigurationElement> elems = new ArrayList<IConfigurationElement>(refs.size());
      for (String ref : refs)
      {
         IConfigurationElement elem = map.get(ref);
         if (allowNull || elem != null)
         {
            elems.add(elem);
         }
         else
         {
            throw new RuntimeException("unresolveable '" + extensionPointId
                  + "' configuration element with '" + attr + "' == " + ref);
         }
      }
      return elems;
   }


   /**
    * Returns the configuration elements matching the given reference or <code>null</code>.
    * @param ref reference
    * @param attr attribute name which is referenced
    * @param extensionPointId extensionpoint of the configuration element that is referenced
    * @return configuration element matching the reference
    */
   public static IConfigurationElement resolveReference(String ref,
         String attr, String extensionPointId)
   {
      IExtensionRegistry registry = Platform.getExtensionRegistry();
      IConfigurationElement[] elements = registry.getConfigurationElementsFor(extensionPointId);
      for (IConfigurationElement elem : elements)
      {
         if (ref.equals(elem.getAttribute(attr)))
         {
            return elem;
         }
      }
      return null;
   }


   /**
    * Returns a list factories which are defined in the given configuration elements by given attribute name.
    * A wrong or empty attribute value results in creating and initializing the giving default factory, if
    * this fails no factory is added to the result list.
    * @param <T> type of the factories
    * @param elements configuration elements which define the factories
    * @param factoryAttr name of the attribute which specifies the factory class
    * @param defaultFactory class which implements/extends <code>T</code> and has an empty constructor
    * @return a list of factories
    * @see #createFactory(IConfigurationElement, String, Class)
    */
   public static <T> List<T> createFactories(List<IConfigurationElement> elements, String factoryAttr, Class<? extends T> defaultFactory)
   {
      List<T> result = new ArrayList<T>(elements.size());
      for (IConfigurationElement elem : elements)
      {
         T factory = createFactory(elem, factoryAttr, defaultFactory);
         if (factory != null)
         {
            result.add(factory);
         }
      }
      return result;
   }


   /**
    * Returns the factory which is defined in the given configuration element by the given attribute name.
    * A wrong or empty attribute value results in creating and initializing the giving default factory, if
    * this fails <code>null</code> is returned.
    * @param <T> type of the factory
    * @param elements configuration element which define the factory
    * @param factoryAttr name of the attribute which specifies the factory class
    * @param defaultFactory class which implements/extends <code>T</code> and has an empty constructor
    * @return a factory
    */
   @SuppressWarnings("unchecked")
   public static <T> T createFactory(IConfigurationElement elem, String factoryAttr, Class<? extends T> defaultFactory)
   {
      // create and initialize the factory
      // (the default value in the extensionpoint doesn't work atm so its null
      //  in the default case)
      T factory = null;
      if (elem.getAttribute(factoryAttr) != null)
      {
         try
         {
            factory = (T) elem.createExecutableExtension(factoryAttr);
         }
         catch (CoreException exc)
         {
            FujabaCommonsPlugin.getDefault().logError(exc.getMessage(), exc);
         }
      }
      // in the default or error case use the default factory
      if (factory == null)
      {
         try
         {
            factory = defaultFactory.newInstance();
         }
         catch (InstantiationException exc)
         {
            FujabaCommonsPlugin.getDefault().logError(exc.getMessage(), exc);
         }
         catch (IllegalAccessException exc)
         {
            FujabaCommonsPlugin.getDefault().logError(exc.getMessage(), exc);
         }
         // set initiaization data (configuration element) if the factory requires it
         if (factory != null && factory instanceof IExecutableExtension)
         {
            try
            {
               ((IExecutableExtension) factory).setInitializationData(elem, factoryAttr, null);
            }
            catch (CoreException exc)
            {
               FujabaCommonsPlugin.getDefault().logError(exc.getMessage(), exc);
            }
         }
      }
      return factory;
   }


   /**
    * Returns an image descriptor of the image defined by specified attribute.
    * Missing images are logged.
    * @param attr attribute name which contains the image path
    * @return an image descriptor
    * @see #getImage(IConfigurationElement, String, boolean)
    */
   public static ImageDescriptor getImage(IConfigurationElement config,
         String attr)
   {
      return getImage(config, attr, false);
   }


   /**
    * Returns an image descriptor of the image defined by specified attribute.
    * Missing images are logged and replaced by <code>null</code> if specified.
    * @param attr attribute name which contains the image path
    * @param allowNull replace missing images with null
    * @return an image descriptor or <code>null</code>
    */
   public static ImageDescriptor getImage(IConfigurationElement config,
         String attr, boolean allowNull)
   {
      ImageDescriptor img = FujabaCommonsImages.getOrCreateDescriptor(
            config.getContributor().getName(), config.getAttribute(attr));
      if (ImageDescriptor.getMissingImageDescriptor().equals(img))
      {
         FujabaCommonsPlugin.getDefault().
         logWarning("WARNING: missing image used in palette entry '"
               + config.getAttribute("id") + "' of plugin '"
               + config.getContributor().getName() + "': "
               + config.getAttribute(attr));
         if (allowNull)
         {
            return null;
         }
      }
      return img;
   }


   /**
    * Joins two arrays. In case one of them is empty the other one is returned.
    * @param a1 first array
    * @param a2 second array
    * @return joined array
    */
   public static <T> T[] joinArrays(T[] a1, T[] a2)
   {
      if (a1 == null || a1.length == 0)
      {
         return a2;
      }
      if (a2 == null || a2.length == 0)
      {
         return a1;
      }
      ArrayList<T> list = new ArrayList<T>(a1.length + a2.length);
      for (T t: a1)
      {
         list.add(t);
      }
      for (T t: a2)
      {
         list.add(t);
      }
      T[] result = list.toArray(a1.clone());
      return result;
   }
}
