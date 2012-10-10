/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.storydriven.modeling.ExtendableElement;
import org.storydriven.modeling.Extension;
import org.storydriven.modeling.SDMPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Extension</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.storydriven.modeling.impl.ExtensionImpl#getBase <em>Base</em>}</li>
 *   <li>{@link org.storydriven.modeling.impl.ExtensionImpl#getModelBase <em>Model Base</em>}</li>
 *   <li>{@link org.storydriven.modeling.impl.ExtensionImpl#getOwningAnnotation <em>Owning Annotation</em>}</li>
 *   <li>{@link org.storydriven.modeling.impl.ExtensionImpl#getExtendableBase <em>Extendable Base</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ExtensionImpl extends ExtendableElementImpl implements Extension
{
   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   protected ExtensionImpl ()
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
      return SDMPackage.Literals.EXTENSION;
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
    * @generated
    */
   public EModelElement getModelBase ()
   {
      EModelElement modelBase = basicGetModelBase();
      return modelBase != null && modelBase.eIsProxy() ? (EModelElement) eResolveProxy((InternalEObject) modelBase)
         : modelBase;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public EModelElement basicGetModelBase ()
   {
      return ExtensionOperations.getModelBase(this);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public void setModelBase (EModelElement newModelBase)
   {
      ExtensionOperations.setModelBase(this, newModelBase);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public void unsetModelBase ()
   {
      ExtensionOperations.unsetModelBase(this);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public boolean isSetModelBase ()
   {
      return ExtensionOperations.isSetModelBase(this);
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
      if (eContainerFeatureID() != SDMPackage.EXTENSION__EXTENDABLE_BASE)
         return null;
      return (ExtendableElement) eContainer();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public ExtendableElement basicGetExtendableBase ()
   {
      if (eContainerFeatureID() != SDMPackage.EXTENSION__EXTENDABLE_BASE)
         return null;
      return (ExtendableElement) eInternalContainer();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetExtendableBase (ExtendableElement newExtendableBase, NotificationChain msgs)
   {
      msgs = eBasicSetContainer((InternalEObject) newExtendableBase, SDMPackage.EXTENSION__EXTENDABLE_BASE, msgs);
      return msgs;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public void setExtendableBase (ExtendableElement newExtendableBase)
   {
      if (newExtendableBase != eInternalContainer()
         || (eContainerFeatureID() != SDMPackage.EXTENSION__EXTENDABLE_BASE && newExtendableBase != null))
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
         eNotify(new ENotificationImpl(this, Notification.SET, SDMPackage.EXTENSION__EXTENDABLE_BASE,
            newExtendableBase, newExtendableBase));
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
         case SDMPackage.EXTENSION__EXTENDABLE_BASE:
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
   protected NotificationChain eInverseAddGen (InternalEObject otherEnd, int featureID, NotificationChain msgs)
   {
      switch (featureID)
      {
         case SDMPackage.EXTENSION__EXTENDABLE_BASE:
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
         case SDMPackage.EXTENSION__EXTENDABLE_BASE:
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
         case SDMPackage.EXTENSION__EXTENDABLE_BASE:
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
         case SDMPackage.EXTENSION__BASE:
            if (resolve)
               return getBase();
            return basicGetBase();
         case SDMPackage.EXTENSION__MODEL_BASE:
            if (resolve)
               return getModelBase();
            return basicGetModelBase();
         case SDMPackage.EXTENSION__OWNING_ANNOTATION:
            if (resolve)
               return getOwningAnnotation();
            return basicGetOwningAnnotation();
         case SDMPackage.EXTENSION__EXTENDABLE_BASE:
            if (resolve)
               return getExtendableBase();
            return basicGetExtendableBase();
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
         case SDMPackage.EXTENSION__MODEL_BASE:
            setModelBase((EModelElement) newValue);
            return;
         case SDMPackage.EXTENSION__OWNING_ANNOTATION:
            setOwningAnnotation((EAnnotation) newValue);
            return;
         case SDMPackage.EXTENSION__EXTENDABLE_BASE:
            setExtendableBase((ExtendableElement) newValue);
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
         case SDMPackage.EXTENSION__MODEL_BASE:
            unsetModelBase();
            return;
         case SDMPackage.EXTENSION__OWNING_ANNOTATION:
            unsetOwningAnnotation();
            return;
         case SDMPackage.EXTENSION__EXTENDABLE_BASE:
            setExtendableBase((ExtendableElement) null);
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
         case SDMPackage.EXTENSION__BASE:
            return isSetBase();
         case SDMPackage.EXTENSION__MODEL_BASE:
            return isSetModelBase();
         case SDMPackage.EXTENSION__OWNING_ANNOTATION:
            return isSetOwningAnnotation();
         case SDMPackage.EXTENSION__EXTENDABLE_BASE:
            return basicGetExtendableBase() != null;
      }
      return super.eIsSet(featureID);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public boolean isSetBase ()
   {
      return isSetModelBase() || eIsSet(SDMPackage.EXTENSION__EXTENDABLE_BASE);
   }

} // ExtensionImpl
