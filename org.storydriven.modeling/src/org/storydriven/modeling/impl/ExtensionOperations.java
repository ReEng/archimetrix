package org.storydriven.modeling.impl;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.storydriven.modeling.Extension;
import org.storydriven.modeling.SDMPackage;

/**
 * @author <a href="mailto:reckord@yatta-solutions.com">Carsten Reckord</a> (original author)
 * @author $Author$ (last change)
 * @version $Revision$
 */
public class ExtensionOperations
{
   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   protected ExtensionOperations ()
   {
      super();
   }

   public static class ExtensionAnnotationAdapter extends AdapterImpl
   {
      @Override
      public boolean isAdapterForType (Object type)
      {
         return type == SDMPackage.Literals.EXTENSION;
      }

      @SuppressWarnings ("unchecked")
      @Override
      public void notifyChanged (Notification msg)
      {
         if (msg.isTouch())
         {
            return;
         }
         EAnnotation notifier = (EAnnotation) msg.getNotifier();
         switch (msg.getFeatureID(EAnnotation.class))
         {
            case EcorePackage.EANNOTATION__CONTENTS:
            {
               switch (msg.getEventType())
               {
                  case Notification.ADD:
                     contentChanged(notifier, null, msg.getNewValue());
                     break;
                  case Notification.ADD_MANY:
                     contentAddedMany(notifier, (List<EObject>) msg.getNewValue());
                     break;
                  case Notification.REMOVE:
                     contentChanged(notifier, msg.getOldValue(), null);
                     break;
                  case Notification.REMOVE_MANY:
                     contentRemovedMany(notifier, (List<EObject>) msg.getOldValue());
                     break;
                  case Notification.SET:
                     contentChanged(notifier, msg.getOldValue(), msg.getNewValue());
                     break;
               }
               break;
            }
            case EcorePackage.EANNOTATION__EMODEL_ELEMENT:
            {
               int eventType = msg.getEventType();
               switch (eventType)
               {
                  case Notification.RESOLVE:
                  case Notification.SET:
                  case Notification.UNSET:
                     NotificationChain msgs = createNotifications(notifier, eventType,
                        (EModelElement) msg.getOldValue(), (EModelElement) msg.getNewValue());
                     if (msgs != null)
                     {
                        msgs.dispatch();
                     }
                     break;
               }
               break;
            }
            default:
               // do nothing
         }
      }

      private NotificationChain createNotifications (EAnnotation notifier, int eventType,
                                                     EModelElement oldModelElement, EModelElement newModelElement)
      {
         NotificationChain msgs = null;
         final EList<EObject> contents = notifier.getContents();
         for (EObject eObject: contents)
         {
            if (eObject instanceof Extension)
            {
               final InternalEObject internalEObject = (InternalEObject) eObject;
               if (internalEObject.eNotificationRequired())
               {
                  NotificationImpl notification = new ENotificationImpl(internalEObject, eventType,
                     SDMPackage.Literals.EXTENSION__MODEL_BASE, oldModelElement, newModelElement);
                  if (msgs == null)
                  {
                     msgs = notification;
                  }
                  else
                  {
                     msgs.add(notification);
                  }
               }
            }
         }
         return msgs;
      }

      private void contentChanged (EAnnotation annotation, Object oldValue, Object newValue)
      {
         EModelElement modelElement = annotation.getEModelElement();
         NotificationChain msgs = contentChanged(modelElement, oldValue, newValue, null);
         if (msgs != null)
         {
            msgs.dispatch();
         }
      }

      private NotificationChain contentChanged (EModelElement modelElement, Object oldValue, Object newValue,
                                                NotificationChain msgs)
      {
         if (oldValue instanceof Extension)
         {
            final InternalEObject internalEObject = (InternalEObject) oldValue;
            if (internalEObject.eNotificationRequired())
            {
               msgs = new ENotificationImpl(internalEObject, Notification.SET,
                  SDMPackage.Literals.EXTENSION__MODEL_BASE, modelElement, null);
            }
         }
         if (newValue instanceof Extension)
         {
            final InternalEObject internalEObject = (InternalEObject) oldValue;
            if (internalEObject.eNotificationRequired())
            {
               NotificationImpl notification = new ENotificationImpl(internalEObject, Notification.SET,
                  SDMPackage.Literals.EXTENSION__MODEL_BASE, null, modelElement);
               if (msgs == null)
               {
                  msgs = notification;
               }
               else
               {
                  msgs.add(notification);
               }
            }
         }
         return msgs;
      }

      private void contentRemovedMany (EAnnotation annotation, List<EObject> oldValue)
      {
         EModelElement modelElement = annotation.getEModelElement();
         NotificationChain msgs = null;
         for (EObject eObject: oldValue)
         {
            msgs = contentChanged(modelElement, eObject, null, msgs);
         }
         if (msgs != null)
         {
            msgs.dispatch();
         }
      }

      private void contentAddedMany (EAnnotation annotation, List<EObject> newValue)
      {
         EModelElement modelElement = annotation.getEModelElement();
         NotificationChain msgs = null;
         for (EObject eObject: newValue)
         {
            msgs = contentChanged(modelElement, null, eObject, msgs);
         }
         if (msgs != null)
         {
            msgs.dispatch();
         }
      }
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public static EModelElement getModelBase (Extension extension)
   {
      EAnnotation annotation = extension.getOwningAnnotation();
      return annotation == null ? null : annotation.getEModelElement();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public static void setModelBase (Extension extension, EModelElement newModelBase)
   {
      EAnnotation annotation = EModelElementOperations.provideAnnotation(newModelBase, Extension.EXTENSION_SOURCE_URI);
      annotation.getContents().add(extension);
      // TODO event
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public static void unsetModelBase (Extension extension)
   {
      EAnnotation owningAnnotation = extension.getOwningAnnotation();
      if (owningAnnotation != null)
      {
         owningAnnotation.getContents().remove(extension);
      }
      // TODO event
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public static boolean isSetModelBase (Extension extension)
   {
      return getModelBase(extension) != null;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public static EAnnotation getOwningAnnotation (Extension extension)
   {
      if (extension.eContainmentFeature() == EcorePackage.Literals.EANNOTATION__CONTENTS)
      {
         EAnnotation annotation = (EAnnotation) extension.eContainer();
         if (Extension.EXTENSION_SOURCE_URI.equals(annotation.getSource()))
         {
            return annotation;
         }
      }
      return null;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public static void setOwningAnnotation (Extension extension, EAnnotation newOwningAnnotation)
   {
      newOwningAnnotation.getContents().add(extension);
      // TODO event
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public static void unsetOwningAnnotation (Extension extension)
   {
      EAnnotation owningAnnotation = extension.getOwningAnnotation();
      if (owningAnnotation != null)
      {
         owningAnnotation.getContents().remove(extension);
      }
      // TODO event
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public static boolean isSetOwningAnnotation (Extension extension)
   {
      return extension.getOwningAnnotation() != null;
   }

}
