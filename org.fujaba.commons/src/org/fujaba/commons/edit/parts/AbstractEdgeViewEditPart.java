package org.fujaba.commons.edit.parts;


import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.commands.CommandStack;
import org.eclipse.gef.editparts.AbstractConnectionEditPart;
import org.eclipse.ui.views.properties.IPropertySource;
import org.fujaba.commons.notation.Edge;



/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 */
public abstract class AbstractEdgeViewEditPart extends
      AbstractConnectionEditPart implements IModelViewEditPart
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
         return Platform.getAdapterManager().getAdapter(getModel(), key);
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
   public Edge getModel()
   {
      return (Edge) super.getModel();
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
               AbstractEdgeViewEditPart.this.notifyChanged(notification);
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
    * Implement this method to react on model changes. Don't forget to call super.notifyChanged. <br>
    * <br>
    * TODO: implement auto-punch directly in your face, if you dare to implement model modification
    * within this method!
    * 
    * @param notification The thrown notification.
    */
   public abstract void notifyChanged(Notification notification);


   @Override
   public void setModel(Object edge)
   {
      if (edge instanceof Edge)
      {
         super.setModel(edge);
      }
      else
      {
         throw new IllegalArgumentException("Element: " + edge
               + " is not an instance of " + Edge.class.getCanonicalName());
      }
   }
}
