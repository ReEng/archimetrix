package org.fujaba.commons.edit.parts;


import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.commands.CommandStack;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.ui.views.properties.IPropertySource;
import org.fujaba.commons.notation.Node;



/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 */
public abstract class AbstractNodeViewEditPart extends
      AbstractGraphicalEditPart implements IModelViewEditPart
{

   private Adapter modelAdapter;


   @Override
   public void activate()
   {
      if (isActive())
      {
         return;
      }
      super.activate();
      getModel().eAdapters().add(getModelAdapter());
      getRealModel().eAdapters().add(getModelAdapter());
   }


   @Override
   public void deactivate()
   {
      if (!isActive())
      {
         return;
      }

      if (getModel() != null)
      {
         getModel().eAdapters().remove(getModelAdapter());
      }
      if (getRealModel() != null)
      {
         getRealModel().eAdapters().remove(getModelAdapter());
      }
      super.deactivate();
   }


   @Override
   @SuppressWarnings("rawtypes")
   public Object getAdapter(Class/* <?> */key)
   {
      if (IPropertySource.class == key)
      {
         return Platform.getAdapterManager().getAdapter(getRealModel(), key);
      }

      return super.getAdapter(key);
   }


   /**
    * Getter of the {@link CommandStack} for this edit part.
    * 
    * @return Returns the command stack.
    */
   protected CommandStack getCommandStack()
   {
      if (isActive() && getViewer() != null
            && getViewer().getEditDomain() != null)
      {
         return getViewer().getEditDomain().getCommandStack();
      }
      return null;
   }


   @Override
   public Node getModel()
   {
      return (Node) super.getModel();
   }


   /**
    * Getter of the model adapter for this edit part.
    * 
    * @return Returns the {@link Adapter}.
    */
   protected Adapter getModelAdapter()
   {
      if (modelAdapter == null)
      {
         modelAdapter = new Adapter()
         {
            private Notifier target;


            public Notifier getTarget()
            {
               return target;
            }


            public boolean isAdapterForType(Object type)
            {
               return false;
            }


            public void notifyChanged(Notification notification)
            {
               AbstractNodeViewEditPart.this.notifyChanged(notification);
            }


            public void setTarget(Notifier newTarget)
            {
               target = newTarget;
            }
         };
      }

      return modelAdapter;
   }


   public EObject getRealModel()
   {
      return getModel().getModel();
   }


   /**
    * Implement this method to react on model changes. Don't forget to call super.notifyChanged. <br />
    * <br />
    * TODO: implement auto-punch directly in your face, if you dare to implement model modification
    * within this method!
    * 
    * @param notification
    */
   public abstract void notifyChanged(Notification notification);


   /**
    * Try not to call this method before this' model is not set.
    * 
    * @param viewO The view for this editpart's model.
    */
   @Override
   public void setModel(Object viewO)
   {
      if (viewO instanceof Node)
      {
         super.setModel(viewO);
      }
      else
      {
         throw new IllegalArgumentException("Element: " + viewO
               + " is not an instance of "
               + Node.class.getCanonicalName());
      }
   }
}
