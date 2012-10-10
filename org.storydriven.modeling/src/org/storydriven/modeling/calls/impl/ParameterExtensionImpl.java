/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.calls.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.storydriven.modeling.ExtendableElement;
import org.storydriven.modeling.Extension;
import org.storydriven.modeling.SDMPackage;
import org.storydriven.modeling.calls.CallsPackage;
import org.storydriven.modeling.calls.ParameterExtension;
import org.storydriven.modeling.impl.ExtensionOperations;
import org.storydriven.modeling.impl.VariableImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Parameter Extension</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.storydriven.modeling.calls.impl.ParameterExtensionImpl#getBase <em>Base</em>}</li>
 *   <li>{@link org.storydriven.modeling.calls.impl.ParameterExtensionImpl#getOwningAnnotation <em>Owning Annotation</em>}</li>
 *   <li>{@link org.storydriven.modeling.calls.impl.ParameterExtensionImpl#getExtendableBase <em>Extendable Base</em>}</li>
 *   <li>{@link org.storydriven.modeling.calls.impl.ParameterExtensionImpl#getParameter <em>Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParameterExtensionImpl extends VariableImpl implements ParameterExtension
{
   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   protected ParameterExtensionImpl ()
   {
      super();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass ()
   {
      return CallsPackage.Literals.PARAMETER_EXTENSION;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EModelElement getModelBase ()
   {
      return getParameter();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public EModelElement basicGetModelBase ()
   {
      return getParameter();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public void setModelBase (EModelElement newModelBase)
   {
      setParameter((EParameter) newModelBase);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public void unsetModelBase ()
   {
      unsetParameter();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public boolean isSetModelBase ()
   {
      return isSetParameter();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EAnnotation getOwningAnnotation ()
   {
      EAnnotation owningAnnotation = basicGetOwningAnnotation();
      return owningAnnotation != null && owningAnnotation.eIsProxy()
         ? (EAnnotation) eResolveProxy((InternalEObject) owningAnnotation) : owningAnnotation;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public EAnnotation basicGetOwningAnnotation ()
   {
      return ExtensionOperations.getOwningAnnotation(this);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public void setOwningAnnotation (EAnnotation newOwningAnnotation)
   {
      ExtensionOperations.setOwningAnnotation(this, newOwningAnnotation);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public void unsetOwningAnnotation ()
   {
      ExtensionOperations.unsetOwningAnnotation(this);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public boolean isSetOwningAnnotation ()
   {
      return ExtensionOperations.isSetOwningAnnotation(this);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public ExtendableElement getExtendableBase ()
   {
      if (eContainerFeatureID() != CallsPackage.PARAMETER_EXTENSION__EXTENDABLE_BASE)
         return null;
      return (ExtendableElement) eContainer();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public ExtendableElement basicGetExtendableBase ()
   {
      if (eContainerFeatureID() != CallsPackage.PARAMETER_EXTENSION__EXTENDABLE_BASE)
         return null;
      return (ExtendableElement) eInternalContainer();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetExtendableBase (ExtendableElement newExtendableBase, NotificationChain msgs)
   {
      msgs = eBasicSetContainer((InternalEObject) newExtendableBase, CallsPackage.PARAMETER_EXTENSION__EXTENDABLE_BASE,
         msgs);
      return msgs;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public void setExtendableBase (ExtendableElement newExtendableBase)
   {
      if (newExtendableBase != eInternalContainer()
         || (eContainerFeatureID() != CallsPackage.PARAMETER_EXTENSION__EXTENDABLE_BASE && newExtendableBase != null))
      {
         if (EcoreUtil.isAncestor(this, newExtendableBase))
            throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
         NotificationChain msgs = null;
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         if (newExtendableBase != null)
            msgs = ((InternalEObject) newExtendableBase).eInverseAdd(this, SDMPackage.EXTENDABLE_ELEMENT__EXTENSION,
               ExtendableElement.class, msgs);
         msgs = basicSetExtendableBase(newExtendableBase, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, CallsPackage.PARAMETER_EXTENSION__EXTENDABLE_BASE,
            newExtendableBase, newExtendableBase));
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public EParameter getParameter ()
   {
      return (EParameter) ExtensionOperations.getModelBase(this);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public void setParameter (EParameter newParameter)
   {
      ExtensionOperations.setModelBase(this, newParameter);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public void unsetParameter ()
   {
      ExtensionOperations.unsetModelBase(this);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public boolean isSetParameter ()
   {
      return ExtensionOperations.isSetModelBase(this);
   }

   @Override
   public EClassifier basicGetType ()
   {
      EParameter parameter = getParameter();
      return parameter == null ? null : parameter.getEType();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eInverseAdd (InternalEObject otherEnd, int featureID, NotificationChain msgs)
   {
      switch (featureID)
      {
         case CallsPackage.PARAMETER_EXTENSION__EXTENDABLE_BASE:
            if (eInternalContainer() != null)
               msgs = eBasicRemoveFromContainer(msgs);
            return basicSetExtendableBase((ExtendableElement) otherEnd, msgs);
      }
      return super.eInverseAdd(otherEnd, featureID, msgs);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eInverseRemove (InternalEObject otherEnd, int featureID, NotificationChain msgs)
   {
      switch (featureID)
      {
         case CallsPackage.PARAMETER_EXTENSION__EXTENDABLE_BASE:
            return basicSetExtendableBase(null, msgs);
      }
      return super.eInverseRemove(otherEnd, featureID, msgs);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eBasicRemoveFromContainerFeature (NotificationChain msgs)
   {
      switch (eContainerFeatureID())
      {
         case CallsPackage.PARAMETER_EXTENSION__EXTENDABLE_BASE:
            return eInternalContainer().eInverseRemove(this, SDMPackage.EXTENDABLE_ELEMENT__EXTENSION,
               ExtendableElement.class, msgs);
      }
      return super.eBasicRemoveFromContainerFeature(msgs);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object eGet (int featureID, boolean resolve, boolean coreType)
   {
      switch (featureID)
      {
         case CallsPackage.PARAMETER_EXTENSION__BASE:
            if (resolve)
               return getBase();
            return basicGetBase();
         case CallsPackage.PARAMETER_EXTENSION__MODEL_BASE:
            if (resolve)
               return getModelBase();
            return basicGetModelBase();
         case CallsPackage.PARAMETER_EXTENSION__OWNING_ANNOTATION:
            if (resolve)
               return getOwningAnnotation();
            return basicGetOwningAnnotation();
         case CallsPackage.PARAMETER_EXTENSION__EXTENDABLE_BASE:
            if (resolve)
               return getExtendableBase();
            return basicGetExtendableBase();
         case CallsPackage.PARAMETER_EXTENSION__PARAMETER:
            return getParameter();
      }
      return super.eGet(featureID, resolve, coreType);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   @Override
   public void eSet (int featureID, Object newValue)
   {
      switch (featureID)
      {
         case CallsPackage.PARAMETER_EXTENSION__MODEL_BASE:
            setModelBase((EModelElement) newValue);
            return;
         case CallsPackage.PARAMETER_EXTENSION__OWNING_ANNOTATION:
            setOwningAnnotation((EAnnotation) newValue);
            return;
         case CallsPackage.PARAMETER_EXTENSION__EXTENDABLE_BASE:
            setExtendableBase((ExtendableElement) newValue);
            return;
         case CallsPackage.PARAMETER_EXTENSION__PARAMETER:
            setParameter((EParameter) newValue);
            return;
      }
      super.eSet(featureID, newValue);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   @Override
   public void eUnset (int featureID)
   {
      switch (featureID)
      {
         case CallsPackage.PARAMETER_EXTENSION__MODEL_BASE:
            unsetModelBase();
            return;
         case CallsPackage.PARAMETER_EXTENSION__OWNING_ANNOTATION:
            unsetOwningAnnotation();
            return;
         case CallsPackage.PARAMETER_EXTENSION__EXTENDABLE_BASE:
            setExtendableBase((ExtendableElement) null);
            return;
         case CallsPackage.PARAMETER_EXTENSION__PARAMETER:
            unsetParameter();
            return;
      }
      super.eUnset(featureID);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   @Override
   public boolean eIsSet (int featureID)
   {
      switch (featureID)
      {
         case CallsPackage.PARAMETER_EXTENSION__BASE:
            return isSetBase();
         case CallsPackage.PARAMETER_EXTENSION__MODEL_BASE:
            return isSetModelBase();
         case CallsPackage.PARAMETER_EXTENSION__OWNING_ANNOTATION:
            return isSetOwningAnnotation();
         case CallsPackage.PARAMETER_EXTENSION__EXTENDABLE_BASE:
            return basicGetExtendableBase() != null;
         case CallsPackage.PARAMETER_EXTENSION__PARAMETER:
            return isSetParameter();
      }
      return super.eIsSet(featureID);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   @Override
   public int eBaseStructuralFeatureID (int derivedFeatureID, Class<?> baseClass)
   {
      if (baseClass == Extension.class)
      {
         switch (derivedFeatureID)
         {
            case CallsPackage.PARAMETER_EXTENSION__BASE:
               return SDMPackage.EXTENSION__BASE;
            case CallsPackage.PARAMETER_EXTENSION__MODEL_BASE:
               return SDMPackage.EXTENSION__MODEL_BASE;
            case CallsPackage.PARAMETER_EXTENSION__OWNING_ANNOTATION:
               return SDMPackage.EXTENSION__OWNING_ANNOTATION;
            case CallsPackage.PARAMETER_EXTENSION__EXTENDABLE_BASE:
               return SDMPackage.EXTENSION__EXTENDABLE_BASE;
            default:
               return -1;
         }
      }
      return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   @Override
   public int eDerivedStructuralFeatureID (int baseFeatureID, Class<?> baseClass)
   {
      if (baseClass == Extension.class)
      {
         switch (baseFeatureID)
         {
            case SDMPackage.EXTENSION__BASE:
               return CallsPackage.PARAMETER_EXTENSION__BASE;
            case SDMPackage.EXTENSION__MODEL_BASE:
               return CallsPackage.PARAMETER_EXTENSION__MODEL_BASE;
            case SDMPackage.EXTENSION__OWNING_ANNOTATION:
               return CallsPackage.PARAMETER_EXTENSION__OWNING_ANNOTATION;
            case SDMPackage.EXTENSION__EXTENDABLE_BASE:
               return CallsPackage.PARAMETER_EXTENSION__EXTENDABLE_BASE;
            default:
               return -1;
         }
      }
      return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EObject getBase ()
   {
      EObject base = basicGetBase();
      return base != null && base.eIsProxy() ? eResolveProxy((InternalEObject) base) : base;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EObject basicGetBase ()
   {
      if (isSetModelBase())
      {
         return basicGetModelBase();
      }
      ExtendableElement extendableBase = basicGetExtendableBase();
      if (extendableBase != null)
      {
         return extendableBase;
      }
      return null;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public boolean isSetBase ()
   {
      return isSetParameter();
   }

   public String getVariableName ()
   {
      ENamedElement namedElement = getParameter();
      return namedElement == null ? null : namedElement.getName();
   }

} // ParameterExtensionImpl
