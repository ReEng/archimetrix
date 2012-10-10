/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.templates.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.storydriven.modeling.ExtendableElement;
import org.storydriven.modeling.templates.*;
import org.storydriven.modeling.templates.PropertyBinding;
import org.storydriven.modeling.templates.TemplateBinding;
import org.storydriven.modeling.templates.TemplateSignature;
import org.storydriven.modeling.templates.TemplatesPackage;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides an adapter <code>createXXX</code> method for each class of the model. <!-- end-user-doc -->
 * @see org.storydriven.modeling.templates.TemplatesPackage
 * @generated
 */
public class TemplatesAdapterFactory extends AdapterFactoryImpl
{
   /**
    * The cached model package.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   protected static TemplatesPackage modelPackage;

   /**
    * Creates an instance of the adapter factory.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public TemplatesAdapterFactory ()
   {
      if (modelPackage == null)
      {
         modelPackage = TemplatesPackage.eINSTANCE;
      }
   }

   /**
    * Returns whether this factory is applicable for the type of the object.
    * <!-- begin-user-doc --> This implementation returns <code>true</code> if the object is either the
    * model's package or is an instance object of the model. <!-- end-user-doc -->
    * @return whether this factory is applicable for the type of the object.
    * @generated
    */
   @Override
   public boolean isFactoryForType (Object object)
   {
      if (object == modelPackage)
      {
         return true;
      }
      if (object instanceof EObject)
      {
         return ((EObject) object).eClass().getEPackage() == modelPackage;
      }
      return false;
   }

   /**
    * The switch that delegates to the <code>createXXX</code> methods.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   protected TemplatesSwitch<Adapter> modelSwitch = new TemplatesSwitch<Adapter>()
   {
      @Override
      public Adapter caseTemplateBinding (TemplateBinding object)
      {
         return createTemplateBindingAdapter();
      }

      @Override
      public Adapter casePropertyBinding (PropertyBinding object)
      {
         return createPropertyBindingAdapter();
      }

      @Override
      public Adapter caseTemplateSignature (TemplateSignature object)
      {
         return createTemplateSignatureAdapter();
      }

      @Override
      public Adapter caseExtendableElement (ExtendableElement object)
      {
         return createExtendableElementAdapter();
      }

      @Override
      public Adapter defaultCase (EObject object)
      {
         return createEObjectAdapter();
      }
   };

   /**
    * Creates an adapter for the <code>target</code>.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @param target the object to adapt.
    * @return the adapter for the <code>target</code>.
    * @generated
    */
   @Override
   public Adapter createAdapter (Notifier target)
   {
      return modelSwitch.doSwitch((EObject) target);
   }

   /**
    * Creates a new adapter for an object of class '{@link org.storydriven.modeling.templates.TemplateSignature <em>Template Signature</em>}'.
    * <!-- begin-user-doc --> This default
    * implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.storydriven.modeling.templates.TemplateSignature
    * @generated
    */
   public Adapter createTemplateSignatureAdapter ()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.storydriven.modeling.templates.TemplateBinding <em>Template Binding</em>}'.
    * <!-- begin-user-doc --> This default
    * implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.storydriven.modeling.templates.TemplateBinding
    * @generated
    */
   public Adapter createTemplateBindingAdapter ()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.storydriven.modeling.templates.PropertyBinding <em>Property Binding</em>}'.
    * <!-- begin-user-doc --> This default
    * implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.storydriven.modeling.templates.PropertyBinding
    * @generated
    */
   public Adapter createPropertyBindingAdapter ()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.storydriven.modeling.ExtendableElement <em>Extendable Element</em>}'.
    * <!-- begin-user-doc --> This default
    * implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.storydriven.modeling.ExtendableElement
    * @generated
    */
   public Adapter createExtendableElementAdapter ()
   {
      return null;
   }

   /**
    * Creates a new adapter for the default case.
    * <!-- begin-user-doc --> This default implementation returns null. <!-- end-user-doc -->
    * @return the new adapter.
    * @generated
    */
   public Adapter createEObjectAdapter ()
   {
      return null;
   }

} // TemplatesAdapterFactory
