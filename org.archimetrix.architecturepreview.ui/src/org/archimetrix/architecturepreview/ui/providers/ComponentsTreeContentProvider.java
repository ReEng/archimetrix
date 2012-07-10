package org.archimetrix.architecturepreview.ui.providers;


import java.util.ArrayList;
import java.util.List;

import org.archimetrix.architecturepreview.ui.util.ComponentsUtil;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

import de.fzi.gast.types.GASTClass;
import eu.qimpress.samm.staticstructure.ComponentType;
import eu.qimpress.samm.staticstructure.CompositeComponent;
import eu.qimpress.samm.staticstructure.PrimitiveComponent;
import eu.qimpress.samm.staticstructure.Repository;
import eu.qimpress.samm.staticstructure.SubcomponentInstance;
import eu.qimpress.sourcecodedecorator.ComponentImplementingClassesLink;


/**
 * This class provides the content of the two components trees in the Architecture Preview View.
 * 
 * @author mcp
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 * 
 */
public class ComponentsTreeContentProvider implements ITreeContentProvider
{

   private static final String SOMOX_DUMMY_COMPONENT = "SoMoX System-Level Dummy Component";


   @Override
   public Object[] getElements(final Object inputElement)
   {
      List<ComponentType> allComponents = ((Repository) inputElement).getComponenttype();
      List<ComponentType> filteredComponents = new ArrayList<ComponentType>();
      for (ComponentType componentType : allComponents)
      {
         if (!componentType.getName().equals(SOMOX_DUMMY_COMPONENT))
         {
            filteredComponents.add(componentType);
         }
      }
      return filteredComponents.toArray();
   }


   @Override
   public void dispose()
   {

   }


   @Override
   public void inputChanged(final Viewer viewer, final Object oldInput, final Object newInput)
   {

   }


   @Override
   public Object[] getChildren(final Object parentElement)
   {
      if (parentElement instanceof CompositeComponent)
      {
         CompositeComponent parent = (CompositeComponent) parentElement;
         List<ComponentType> children = getChildrenComponents(parent);
         return children.toArray();
      }
      else if (parentElement instanceof PrimitiveComponent)
      {
         PrimitiveComponent parent = (PrimitiveComponent) parentElement;
         ComponentImplementingClassesLink link = ComponentsUtil.get().getComponentImplementingClassesLinkForComponent(
               parent);
         if (link != null)
         {
            List<GASTClass> children = link.getImplementingClasses();
            return children.toArray();
         }
      }
      return null;
   }


   private List<ComponentType> getChildrenComponents(final CompositeComponent parent)
   {
      List<ComponentType> children = new ArrayList<ComponentType>();
      for (SubcomponentInstance subComp : parent.getSubcomponents())
      {
         children.add(subComp.getRealizedBy());
      }
      return children;
   }


   @Override
   public Object getParent(final Object element)
   {
      if (element instanceof PrimitiveComponent || element instanceof CompositeComponent)
      {
         return getParentCompositeComponent((ComponentType) element,
               ((Repository) ((ComponentType) element).eContainer()).getComponenttype());
      }
      return null;
   }


   private ComponentType getParentCompositeComponent(final ComponentType element, final List<ComponentType> components)
   {
      for (ComponentType component : components)
      {
         if (component instanceof CompositeComponent)
         {
            List<ComponentType> childrenComponents = getChildrenComponents((CompositeComponent) component);
            if (childrenComponents.contains(element))
            {
               return component;
            }
            else
            {
               ComponentType result = getParentCompositeComponent(element, childrenComponents);
               if (result != null)
               {
                  return result;
               }
            }
         }
      }
      return null;
   }


   @Override
   public boolean hasChildren(final Object element)
   {
      if (element instanceof CompositeComponent || element instanceof PrimitiveComponent)
      {
         return true;
      }
      return false;
   }

}
