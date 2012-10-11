/**
 * 
 */
package org.fujaba.commons.editor;

import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IPersistableElement;

/**
 * This implemation of IEditorInput is implemented for use with a multi page editor 
 * in its nested editors. Since the FileEditorInput does not necessarily change
 * with each page, you can use an instance of this class as an editor's input, 
 * which will give your page some kind of a partial view resulting from the tree of you EObject
 * instance.   
 * <br><br>
 * Feel free to subclass and to customize this class to your needs. 
 * 
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 *
 */
public class NestedEObjectEditorInput implements IEditorInput
{
   private EObject model;
   private ImageDescriptor image;

   public NestedEObjectEditorInput(EObject model)
   {
      super();
      this.model = model;
   }


   /**
    * @see org.eclipse.ui.IEditorInput#exists()
    */
   public boolean exists()
   {
      return false;
   }


   /**
    * @see org.eclipse.ui.IEditorInput#getImageDescriptor()
    */
   public ImageDescriptor getImageDescriptor()
   {
      if(image != null)
      {
         return image;
      }
      else
      {
         return ImageDescriptor.getMissingImageDescriptor();
      }
   }


   /**
    * @see org.eclipse.ui.IEditorInput#getName()
    */
   public String getName()
   {
      if(model instanceof ENamedElement)
      {
         return ((ENamedElement)model).getName();
      }

      return null;
   }


   /**
    * @see org.eclipse.ui.IEditorInput#getPersistable()
    */
   public IPersistableElement getPersistable()
   {
      return null;
   }


   /**
    * @see org.eclipse.ui.IEditorInput#getToolTipText()
    */
   public String getToolTipText()
   {
      return this.getName();
   }


   /**
    * @see org.eclipse.core.runtime.IAdaptable#getAdapter(java.lang.Class)
    */
   public Object getAdapter(@SuppressWarnings("rawtypes") Class adapter)
   {
      return null;
   }


   public ImageDescriptor getImage()
   {
      return this.image;
   }


   public void setImage(ImageDescriptor image)
   {
      this.image = image;
   }


   public EObject getModel()
   {
      return this.model;
   }
}
