/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.templates.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.storydriven.modeling.patterns.PatternsPackage;
import org.storydriven.modeling.patterns.StoryPattern;
import org.storydriven.modeling.templates.TemplateBinding;
import org.storydriven.modeling.templates.TemplateSignature;
import org.storydriven.modeling.templates.TemplatesPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Template Signature</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.storydriven.modeling.templates.impl.TemplateSignatureImpl#getTemplateBindings <em>Template Binding</em>}</li>
 *   <li>{@link org.storydriven.modeling.templates.impl.TemplateSignatureImpl#getTypeParameters <em>Type Parameter</em>}</li>
 *   <li>{@link org.storydriven.modeling.templates.impl.TemplateSignatureImpl#getPattern <em>Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TemplateSignatureImpl extends EObjectImpl implements TemplateSignature
{
   /**
    * The cached value of the '{@link #getTemplateBindings() <em>Template Binding</em>}' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #getTemplateBindings()
    * @generated
    * @ordered
    */
   protected EList<TemplateBinding> templateBindings;

   /**
    * The cached value of the '{@link #getTypeParameters() <em>Type Parameter</em>}' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #getTypeParameters()
    * @generated
    * @ordered
    */
   protected EList<EClassifier> typeParameters;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   protected TemplateSignatureImpl ()
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
      return TemplatesPackage.Literals.TEMPLATE_SIGNATURE;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EList<EClassifier> getTypeParameters ()
   {
      if (typeParameters == null)
      {
         typeParameters = new EObjectContainmentEList.Resolving<EClassifier>(EClassifier.class, this,
            TemplatesPackage.TEMPLATE_SIGNATURE__TYPE_PARAMETER);
      }
      return typeParameters;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EList<TemplateBinding> getTemplateBindings ()
   {
      if (templateBindings == null)
      {
         templateBindings = new EObjectContainmentWithInverseEList.Resolving<TemplateBinding>(TemplateBinding.class,
            this, TemplatesPackage.TEMPLATE_SIGNATURE__TEMPLATE_BINDING, TemplatesPackage.TEMPLATE_BINDING__TEMPLATE);
      }
      return templateBindings;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public StoryPattern getPattern ()
   {
      if (eContainerFeatureID() != TemplatesPackage.TEMPLATE_SIGNATURE__PATTERN)
         return null;
      return (StoryPattern) eContainer();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public StoryPattern basicGetPattern ()
   {
      if (eContainerFeatureID() != TemplatesPackage.TEMPLATE_SIGNATURE__PATTERN)
         return null;
      return (StoryPattern) eInternalContainer();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetPattern (StoryPattern newPattern, NotificationChain msgs)
   {
      msgs = eBasicSetContainer((InternalEObject) newPattern, TemplatesPackage.TEMPLATE_SIGNATURE__PATTERN, msgs);
      return msgs;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public void setPattern (StoryPattern newPattern)
   {
      if (newPattern != eInternalContainer()
         || (eContainerFeatureID() != TemplatesPackage.TEMPLATE_SIGNATURE__PATTERN && newPattern != null))
      {
         if (EcoreUtil.isAncestor(this, newPattern))
            throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
         NotificationChain msgs = null;
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         if (newPattern != null)
            msgs = ((InternalEObject) newPattern).eInverseAdd(this, PatternsPackage.STORY_PATTERN__TEMPLATE_SIGNATURE,
               StoryPattern.class, msgs);
         msgs = basicSetPattern(newPattern, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, TemplatesPackage.TEMPLATE_SIGNATURE__PATTERN,
            newPattern, newPattern));
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   @SuppressWarnings ("unchecked")
   @Override
   public NotificationChain eInverseAdd (InternalEObject otherEnd, int featureID, NotificationChain msgs)
   {
      switch (featureID)
      {
         case TemplatesPackage.TEMPLATE_SIGNATURE__TEMPLATE_BINDING:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getTemplateBindings()).basicAdd(otherEnd, msgs);
         case TemplatesPackage.TEMPLATE_SIGNATURE__PATTERN:
            if (eInternalContainer() != null)
               msgs = eBasicRemoveFromContainer(msgs);
            return basicSetPattern((StoryPattern) otherEnd, msgs);
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
         case TemplatesPackage.TEMPLATE_SIGNATURE__TEMPLATE_BINDING:
            return ((InternalEList<?>) getTemplateBindings()).basicRemove(otherEnd, msgs);
         case TemplatesPackage.TEMPLATE_SIGNATURE__TYPE_PARAMETER:
            return ((InternalEList<?>) getTypeParameters()).basicRemove(otherEnd, msgs);
         case TemplatesPackage.TEMPLATE_SIGNATURE__PATTERN:
            return basicSetPattern(null, msgs);
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
         case TemplatesPackage.TEMPLATE_SIGNATURE__PATTERN:
            return eInternalContainer().eInverseRemove(this, PatternsPackage.STORY_PATTERN__TEMPLATE_SIGNATURE,
               StoryPattern.class, msgs);
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
         case TemplatesPackage.TEMPLATE_SIGNATURE__TEMPLATE_BINDING:
            return getTemplateBindings();
         case TemplatesPackage.TEMPLATE_SIGNATURE__TYPE_PARAMETER:
            return getTypeParameters();
         case TemplatesPackage.TEMPLATE_SIGNATURE__PATTERN:
            if (resolve)
               return getPattern();
            return basicGetPattern();
      }
      return super.eGet(featureID, resolve, coreType);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   @SuppressWarnings ("unchecked")
   @Override
   public void eSet (int featureID, Object newValue)
   {
      switch (featureID)
      {
         case TemplatesPackage.TEMPLATE_SIGNATURE__TEMPLATE_BINDING:
            getTemplateBindings().clear();
            getTemplateBindings().addAll((Collection<? extends TemplateBinding>) newValue);
            return;
         case TemplatesPackage.TEMPLATE_SIGNATURE__TYPE_PARAMETER:
            getTypeParameters().clear();
            getTypeParameters().addAll((Collection<? extends EClassifier>) newValue);
            return;
         case TemplatesPackage.TEMPLATE_SIGNATURE__PATTERN:
            setPattern((StoryPattern) newValue);
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
         case TemplatesPackage.TEMPLATE_SIGNATURE__TEMPLATE_BINDING:
            getTemplateBindings().clear();
            return;
         case TemplatesPackage.TEMPLATE_SIGNATURE__TYPE_PARAMETER:
            getTypeParameters().clear();
            return;
         case TemplatesPackage.TEMPLATE_SIGNATURE__PATTERN:
            setPattern((StoryPattern) null);
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
         case TemplatesPackage.TEMPLATE_SIGNATURE__TEMPLATE_BINDING:
            return templateBindings != null && !templateBindings.isEmpty();
         case TemplatesPackage.TEMPLATE_SIGNATURE__TYPE_PARAMETER:
            return typeParameters != null && !typeParameters.isEmpty();
         case TemplatesPackage.TEMPLATE_SIGNATURE__PATTERN:
            return basicGetPattern() != null;
      }
      return super.eIsSet(featureID);
   }

} // TemplateSignatureImpl
