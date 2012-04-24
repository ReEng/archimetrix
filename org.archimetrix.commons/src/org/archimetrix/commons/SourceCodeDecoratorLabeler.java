package org.archimetrix.commons;


import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.graphics.Image;
import org.reclipse.metamodel.AbstractElementLabeler;

import eu.qimpress.samm.core.NamedEntity;
import eu.qimpress.sourcecodedecorator.ComponentImplementingClassesLink;


public class SourceCodeDecoratorLabeler extends AbstractElementLabeler
{

   public SourceCodeDecoratorLabeler()
   {
      // TODO Auto-generated constructor stub
   }


   @Override
   public Image getImage(EObject element)
   {
      return getImage(Element.UNKNOWN);
   }


   @Override
   public String getText(EObject element)
   {
      if (element instanceof NamedEntity)
      {
         return ((NamedEntity) element).getName();
      }

      if (element instanceof ComponentImplementingClassesLink)
      {
         return getText(((ComponentImplementingClassesLink) element).getComponent());
      }

      return String.valueOf(element);
   }


   @Override
   public String getFullText(EObject element)
   {
      // TODO Auto-generated method stub
      return null;
   }

}
