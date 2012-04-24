package org.archimetrix.architecturepreview.ui.providers;


import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;

import de.fzi.gast.types.GASTClass;

import eu.qimpress.samm.staticstructure.ComponentType;


/**
 * The ComponentsTreeColorProvider is responsible for coloring the original component tree and the
 * predicted components tree in the Architecture Preview View.
 * 
 * @author mcp
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 * 
 */
public class ComponentsTreeColorProvider
{

   private Display display;

   private final ComponentsTreeLabelProvider componentsTreeLabelProvider;


   public ComponentsTreeColorProvider(final ComponentsTreeLabelProvider componentsTreeLabelProvider)
   {
      this.componentsTreeLabelProvider = componentsTreeLabelProvider;
   }


   public void layoutRedLines(final Object element, final boolean isFromOriginalArchitecture,
         final ComponentType componentFromNewArchitecture)
   {
      if (isFromOriginalArchitecture && componentFromNewArchitecture == null)
      {
         TreeItem item = getItem(this.componentsTreeLabelProvider.getOriginalComponentsTree(), element);
         if (item != null)
         {
            item.setBackground(makeRedColor());
         }
      }
   }


   public void layoutGreenLines(final Object element, final boolean isFromNewArchitecture,
         final ComponentType componentFromOriginalArchitecture)
   {
      if (isFromNewArchitecture && componentFromOriginalArchitecture == null)
      {
         Tree originalComponentsTree = this.componentsTreeLabelProvider.getOriginalComponentsTree();
         TreeItem item = getItem(originalComponentsTree, element);
         if (item != null)
         {
            item.setBackground(makeGreenColor());
         }
      }
   }


   private Color makeYellowColor()
   {
      return getDisplay().getSystemColor(SWT.COLOR_YELLOW);
   }


   private Color makeRedColor()
   {
      return new Color(getDisplay(), 255, 127, 80);
   }


   private Color makeGreenColor()
   {
      return new Color(getDisplay(), 152, 251, 152);
   }


   public Display getDisplay()
   {
      if (this.display == null)
      {
         this.display = Display.getCurrent();
      }
      return this.display;
   }


   public void layoutBackgroundOfComponents(final Object element, final ComponentType component,
         final boolean isFromOriginalArchitecture, final boolean isFromNewArchitecture, final ComponentType componentFromNewArchitecture,
         final ComponentType componentFromOriginalArchitecture)
   {
      Tree tree = null;
      if (isFromOriginalArchitecture
            && this.componentsTreeLabelProvider.componentValuesDiffer(component, componentFromNewArchitecture))
      {
         tree = this.componentsTreeLabelProvider.getOriginalComponentsTree();
      }
      else
      {
         if (isFromNewArchitecture
               && this.componentsTreeLabelProvider.componentValuesDiffer(componentFromOriginalArchitecture, component))
         {
            tree = this.componentsTreeLabelProvider.getNewComponentsTree();
         }
      }
      if (tree != null)
      {
         TreeItem item = getItem(tree, element);
         if (item != null)
         {
            item.setBackground(makeYellowColor());
         }
      }
   }


   public void layoutBackgroundOfGASTClass(final GASTClass gastClass)
   {
      Tree tree = this.componentsTreeLabelProvider.getNewComponentsTree();
      TreeItem item = getItem(tree, gastClass);
      if (item != null)
      {
         item.setBackground(makeYellowColor());
      }
   }


   private TreeItem getItem(final Tree tree, final Object object)
   {
      for (TreeItem item : tree.getItems())
      {
         TreeItem resultItem = getItem(object, item);
         if (resultItem != null)
         {
            return resultItem;
         }
      }
      return null;
   }


   private TreeItem getItem(final Object object, final TreeItem item)
   {
      if (item.getData() == object)
      {
         return item;
      }
      else
      {
         for (TreeItem childItem : item.getItems())
         {
            TreeItem resultItem = getItem(object, childItem);
            if (resultItem != null)
            {
               return resultItem;
            }
         }
      }
      return null;
   }


   public Color getBackground(final Object element, final int columnIndex)
   {
      if (columnIndex == 2)
      {
         if (!this.componentsTreeLabelProvider.getColumnText(element, columnIndex).equals(
               this.componentsTreeLabelProvider.getColumnText(element, columnIndex - 1)))
         {
            return makeYellowColor();
         }
      }
      return getDisplay().getSystemColor(SWT.COLOR_WHITE);
   }


   public Color getForeground()
   {
      return getDisplay().getSystemColor(SWT.COLOR_BLACK);
   }


}
