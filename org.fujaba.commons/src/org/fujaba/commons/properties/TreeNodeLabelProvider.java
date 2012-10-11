package org.fujaba.commons.properties;


import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreeNode;
import org.eclipse.swt.graphics.Image;


public class TreeNodeLabelProvider extends LabelProvider
{
   private AdapterFactoryLabelProvider adapterLabelProvider;


   public TreeNodeLabelProvider(AdapterFactory factory)
   {
      adapterLabelProvider = new AdapterFactoryLabelProvider(factory);
   }


   @Override
   public String getText(Object element)
   {
      // get element
      Object type = ((TreeNode) element).getValue();

      // create qualified package name
      if (type instanceof EPackage)
      {
         EPackage current = (EPackage) type;

         StringBuilder text = new StringBuilder(current.getName());

         while (current.getESuperPackage() != null)
         {
            current = current.getESuperPackage();
            text.insert(0, "."); //$NON-NLS-1$
            text.insert(0, current.getName());
         }

         return text.toString();
      }
      else if (type instanceof EClass)
      {
         return ((EClass) type).getName();
      }
      else
      {
         return adapterLabelProvider.getText(type);
      }
   }


   @Override
   public Image getImage(Object element)
   {
      return adapterLabelProvider.getImage(((TreeNode) element).getValue());
   }
}
