package org.storydriven.modeling.util;

import java.lang.reflect.Array;
import java.util.AbstractSequentialList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EGenericTypeImpl;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.DelegatingEcoreEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;

public abstract class GenericTypeListHandler<C extends EClassifier>
{
   public static class EClassifiers extends GenericTypeListHandler<EClassifier>
   {

      public EClassifiers (InternalEObject owner, EReference rawTypeFeature, EReference genericTypeFeature)
      {
         super(owner, rawTypeFeature, genericTypeFeature);
      }

      @Override
      protected boolean isRawInstance (Object object)
      {
         return object instanceof EClassifier;
      }

      @Override
      protected EClassifier adaptUnwrappedType (EClassifier rawType)
      {
         return rawType;
      }

   }

   public static class EClasses extends GenericTypeListHandler<EClass>
   {

      public EClasses (InternalEObject owner, EReference rawTypeFeature, EReference genericTypeFeature)
      {
         super(owner, rawTypeFeature, genericTypeFeature);
      }

      @Override
      protected boolean isRawInstance (Object object)
      {
         return object instanceof EClass;
      }

      @Override
      protected EClass adaptUnwrappedType (EClassifier rawType)
      {
         return rawType instanceof EClass ? (EClass) rawType : EcorePackage.Literals.EOBJECT;
      }

   }

   public static class EDataTypes extends GenericTypeListHandler<EDataType>
   {

      public EDataTypes (InternalEObject owner, EReference rawTypeFeature, EReference genericTypeFeature)
      {
         super(owner, rawTypeFeature, genericTypeFeature);
      }

      @Override
      protected boolean isRawInstance (Object object)
      {
         return object instanceof EDataType;
      }

      @Override
      protected EDataType adaptUnwrappedType (EClassifier rawType)
      {
         return rawType instanceof EDataType ? (EDataType) rawType : EcorePackage.Literals.EJAVA_OBJECT;
      }

   }

   public static class EEnums extends GenericTypeListHandler<EEnum>
   {

      public EEnums (InternalEObject owner, EReference rawTypeFeature, EReference genericTypeFeature)
      {
         super(owner, rawTypeFeature, genericTypeFeature);
      }

      @Override
      protected boolean isRawInstance (Object object)
      {
         return object instanceof EEnum;
      }

      @Override
      protected EEnum adaptUnwrappedType (EClassifier rawType)
      {
         return rawType instanceof EEnum ? (EEnum) rawType : null;
      }

   }

   private final InternalEObject owner;
   private final EReference genericTypesFeature;
   private final EReference rawTypesFeature;

   private EList<C> rawTypes;
   private EList<EGenericType> genericTypes;

   protected GenericTypeListHandler (InternalEObject owner, EReference rawTypeFeature, EReference genericTypeFeature)
   {
      super();
      this.owner = owner;
      this.genericTypesFeature = genericTypeFeature;
      this.rawTypesFeature = rawTypeFeature;
   }

   public EList<C> getRawTypes ()
   {
      if (this.rawTypes == null)
      {
         this.rawTypes = new DelegatingEcoreEList<C>(this.owner)
         {
            private static final long serialVersionUID = 1L;

            @Override
            protected List<C> delegateList ()
            {
               return null;
            }

            @Override
            protected List<C> delegateBasicList ()
            {
               return new AbstractSequentialList<C>()
               {
                  @Override
                  public ListIterator<C> listIterator (int index)
                  {
                     return basicListIterator();
                  }

                  @Override
                  public int size ()
                  {
                     return delegateSize();
                  }
               };
            }

            @Override
            protected Iterator<C> delegateIterator ()
            {
               return iterator();
            }

            @Override
            protected ListIterator<C> delegateListIterator ()
            {
               return listIterator();
            }

            @Override
            protected void delegateAdd (int index, C eClass)
            {
               getGenericTypes().add(index, wrap(eClass));
            }

            @Override
            protected void delegateClear ()
            {
               getGenericTypes().clear();
            }

            @Override
            protected void delegateAdd (C eClass)
            {
               getGenericTypes().add(wrap(eClass));
            }

            @Override
            protected boolean delegateContains (Object object)
            {
               for (C eClass: this)
               {
                  if (object == eClass)
                  {
                     return true;
                  }
               }
               return false;
            }

            @Override
            protected boolean delegateContainsAll (Collection<?> collection)
            {
               for (Object object: collection)
               {
                  if (!delegateContains(object))
                  {
                     return false;
                  }
               }
               return true;
            }

            @Override
            protected boolean delegateEquals (Object object)
            {
               if (object instanceof List<?>)
               {
                  List<?> list = (List<?>) object;
                  if (list.size() == delegateSize())
                  {
                     for (Iterator<?> i = list.iterator(), j = iterator(); i.hasNext();)
                     {
                        if (i.next() != j.next())
                        {
                           return false;
                        }
                     }
                     return true;
                  }
               }
               return false;
            }

            @Override
            protected C delegateGet (int index)
            {
               EGenericType eGenericType = getGenericTypes().get(index);
               return unwrap(eGenericType);
            }

            @Override
            protected int delegateHashCode ()
            {
               int hashCode = 1;
               for (EGenericType eGenericType: getGenericTypes())
               {
                  Object object = unwrap(eGenericType);
                  hashCode = 31 * hashCode + (object == null ? 0 : object.hashCode());
               }
               return hashCode;
            }

            @Override
            protected int delegateIndexOf (Object object)
            {
               int index = 0;
               for (EGenericType eGenericType: getGenericTypes())
               {
                  if (object == unwrap(eGenericType))
                  {
                     return index;
                  }
                  ++index;
               }
               return -1;
            }

            @Override
            protected boolean delegateIsEmpty ()
            {
               return getGenericTypes().isEmpty();
            }

            @Override
            protected int delegateLastIndexOf (Object object)
            {
               EList<EGenericType> eGenericSuperTypes = getGenericTypes();
               for (int i = eGenericSuperTypes.size() - 1; i >= 0; --i)
               {
                  if (unwrap(eGenericSuperTypes.get(i)) == object)
                  {
                     return i;
                  }
               }
               return -1;
            }

            @Override
            protected C delegateRemove (int index)
            {
               EGenericType eGenericType = getGenericTypes().remove(index);
               return unwrap(eGenericType);
            }

            @Override
            protected C delegateSet (int index, C eClass)
            {
               EGenericType eGenericType = getGenericTypes().get(index);
               C result = unwrap(eGenericType);

               // If this is just a proxy being resolved...
               //
               if (resolveProxy(result) == eClass)
               {
                  // Force the raw type to be resolved so we don't resolve this endlessly.
                  //
                  eGenericType.getERawType();
               }
               else
               {
                  // Update the classifier and hence the raw type as normal.
                  //
                  eGenericType.setEClassifier(eClass);
               }
               return result;
            }

            @Override
            protected int delegateSize ()
            {
               return getGenericTypes().size();
            }

            @Override
            protected Object[] delegateToArray ()
            {
               int size = delegateSize();
               Object[] result = new Object[size];

               int index = 0;
               for (EGenericType eGenericType: getGenericTypes())
               {
                  result[index++] = unwrap(eGenericType);
               }
               return result;
            }

            @Override
            protected <T> T[] delegateToArray (T[] array)
            {
               int size = delegateSize();
               if (array.length < size)
               {
                  @SuppressWarnings ("unchecked")
                  T[] newArray = (T[]) Array.newInstance(array.getClass().getComponentType(), size);
                  array = newArray;
               }

               if (array.length > size)
               {
                  array[size] = null;
               }

               int index = 0;
               for (EGenericType eGenericType: getGenericTypes())
               {
                  @SuppressWarnings ("unchecked")
                  T rawType = (T) unwrap(eGenericType);
                  array[index++] = rawType;
               }

               return array;
            }

            @Override
            protected String delegateToString ()
            {
               StringBuffer stringBuffer = new StringBuffer();
               stringBuffer.append("[");
               EList<EGenericType> eGenericSuperTypes = getGenericTypes();
               for (int i = 0, size = delegateSize(); i < size;)
               {
                  stringBuffer.append(String.valueOf(unwrap(eGenericSuperTypes.get(i))));
                  if (++i < size)
                  {
                     stringBuffer.append(", ");
                  }
               }
               stringBuffer.append("]");
               return stringBuffer.toString();
            }

            @Override
            protected boolean isInstance (Object object)
            {
               return isRawInstance(object);
            }

            @Override
            public int getFeatureID ()
            {
               return GenericTypeListHandler.this.rawTypesFeature.getFeatureID();
            }

            @Override
            protected boolean useEquals ()
            {
               return true;
            }

            @Override
            protected boolean canContainNull ()
            {
               return false;
            }

            @Override
            protected boolean isUnique ()
            {
               return true;
            }

            @Override
            protected boolean hasInverse ()
            {
               return false;
            }

            @Override
            protected boolean hasManyInverse ()
            {
               return false;
            }

            @Override
            protected boolean hasNavigableInverse ()
            {
               return false;
            }

            @Override
            protected boolean isEObject ()
            {
               return true;
            }

            @Override
            protected boolean isContainment ()
            {
               return false;
            }

            @Override
            protected boolean hasProxies ()
            {
               return true;
            }

            @Override
            protected boolean hasInstanceClass ()
            {
               return true;
            }

            @Override
            public boolean isSet ()
            {
               return isSetGenericTypes();
            }

            @Override
            protected NotificationImpl createNotification (int eventType, Object oldObject, Object newObject,
                                                           int index, boolean wasSet)
            {
               // The notification for this list is being thrown by the
               // delegating list
               //
               return null;
            }

            @Override
            protected void dispatchNotification (Notification notification)
            {
               // Do nothing
            }
         };
      }
      return this.rawTypes;
   }

   public EList<EGenericType> getGenericTypes ()
   {
      if (this.genericTypes == null)
      {
         this.genericTypes = new EObjectContainmentEList.Unsettable<EGenericType>(EGenericType.class, this.owner,
            this.genericTypesFeature.getFeatureID())
         {
            private static final long serialVersionUID = 1L;

            @Override
            public boolean isSet ()
            {
               return isSetGenericTypes();
            }

            @Override
            protected boolean hasShadow ()
            {
               return true;
            }

            @Override
            protected NotificationChain shadowAdd (EGenericType eGenericType, NotificationChain notifications)
            {
               ENotificationImpl notification = new ENotificationImpl(this.owner, Notification.ADD,
                  GenericTypeListHandler.this.rawTypesFeature, null, unwrap(eGenericType), indexOf(eGenericType), false);
               if (notifications == null)
               {
                  notifications = notification;
               }
               else
               {
                  notifications.add(notification);
               }
               return notifications;
            }

            @Override
            protected NotificationChain shadowRemove (EGenericType eGenericType, NotificationChain notifications)
            {
               ENotificationImpl notification = new ENotificationImpl(this.owner, Notification.REMOVE,
                  GenericTypeListHandler.this.rawTypesFeature, unwrap(eGenericType), null, indexOf(eGenericType), false);
               if (notifications == null)
               {
                  notifications = notification;
               }
               else
               {
                  notifications.add(notification);
               }
               return notifications;
            }

            @Override
            protected NotificationChain shadowSet (EGenericType oldEGenericType, EGenericType newEGenericType,
                                                   NotificationChain notifications)
            {
               ENotificationImpl notification = new ENotificationImpl(this.owner, Notification.SET,
                  GenericTypeListHandler.this.rawTypesFeature, unwrap(oldEGenericType), unwrap(newEGenericType),
                  indexOf(oldEGenericType), false);
               if (notifications == null)
               {
                  notifications = notification;
               }
               else
               {
                  notifications.add(notification);
               }
               return notifications;
            }

            @Override
            public EGenericType move (int targetIndex, int sourceIndex)
            {
               EGenericType result = super.move(targetIndex, sourceIndex);
               if (isNotificationRequired())
               {
                  dispatchNotification(new ENotificationImpl(GenericTypeListHandler.this.owner, Notification.MOVE,
                     GenericTypeListHandler.this.rawTypesFeature, sourceIndex, unwrap(result), targetIndex));
               }
               return result;
            }

            @Override
            public void unset ()
            {
               // Don't really unset it.
               clear();
            }

            @Override
            protected NotificationImpl createNotification (int eventType, Object oldObject, Object newObject,
                                                           int index, boolean wasSet)
            {
               switch (eventType)
               {
                  case Notification.ADD:
                  {
                     return super.createNotification(eventType, oldObject, newObject, index, this.size > 1);
                  }
                  case Notification.ADD_MANY:
                  {
                     return super.createNotification(eventType, oldObject, newObject, index, this.size
                        - ((List<?>) newObject).size() > 0);
                  }
                  default:
                  {
                     return super.createNotification(eventType, oldObject, newObject, index, true);
                  }
               }
            }
         };
         getRawTypes();
      }
      return this.genericTypes;
   }

   public boolean isSetGenericTypes ()
   {
      for (EGenericType eGenericType: getGenericTypes())
      {
         if (eGenericType.getETypeParameter() != null || !eGenericType.getETypeArguments().isEmpty())
         {
            return true;
         }
      }
      return false;
   }

   public boolean isSetRawTypes ()
   {
      return this.rawTypes != null && !this.rawTypes.isEmpty() && !isSetGenericTypes();
   }

   protected abstract boolean isRawInstance (Object object);

   protected C unwrap (EGenericType genericType)
   {
      EClassifier rawType = ((EGenericTypeImpl) genericType).basicGetERawType();
      return adaptUnwrappedType(rawType);
   }

   protected abstract C adaptUnwrappedType (EClassifier rawType);

   /*
    * if (result instanceof EClass) { return (EClass) result; } else { return EcorePackage.Literals.EOBJECT; }
    */

   protected EGenericType wrap (C eClassifier)
   {
      EGenericType eGenericType = EcoreFactory.eINSTANCE.createEGenericType();
      eGenericType.setEClassifier(eClassifier);
      return eGenericType;
   }
}
