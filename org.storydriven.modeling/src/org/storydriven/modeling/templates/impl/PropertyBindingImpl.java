/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.templates.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.storydriven.modeling.expressions.Expression;
import org.storydriven.modeling.impl.ExtendableElementImpl;
import org.storydriven.modeling.templates.PropertyBinding;
import org.storydriven.modeling.templates.TemplateBinding;
import org.storydriven.modeling.templates.TemplatesPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Property Binding</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.storydriven.modeling.templates.impl.PropertyBindingImpl#getBoundProperty <em>Bound Property</em>}</li>
 *   <li>{@link org.storydriven.modeling.templates.impl.PropertyBindingImpl#getBindingExpression <em>Binding Expression</em>}</li>
 *   <li>{@link org.storydriven.modeling.templates.impl.PropertyBindingImpl#getTemplateBinding <em>Template Binding</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyBindingImpl extends ExtendableElementImpl implements PropertyBinding
{
   /**
    * The cached value of the '{@link #getBoundProperty() <em>Bound Property</em>}' reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #getBoundProperty()
    * @generated
    * @ordered
    */
   protected EStructuralFeature boundProperty;

   /**
    * The cached value of the '{@link #getBindingExpression() <em>Binding Expression</em>}' containment reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #getBindingExpression()
    * @generated
    * @ordered
    */
   protected Expression bindingExpression;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   protected PropertyBindingImpl ()
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
      return TemplatesPackage.Literals.PROPERTY_BINDING;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EStructuralFeature getBoundProperty ()
   {
      if (boundProperty != null && boundProperty.eIsProxy())
      {
         InternalEObject oldBoundProperty = (InternalEObject) boundProperty;
         boundProperty = (EStructuralFeature) eResolveProxy(oldBoundProperty);
         if (boundProperty != oldBoundProperty)
         {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                  TemplatesPackage.PROPERTY_BINDING__BOUND_PROPERTY, oldBoundProperty, boundProperty));
         }
      }
      return boundProperty;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EStructuralFeature basicGetBoundProperty ()
   {
      return boundProperty;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public void setBoundProperty (EStructuralFeature newBoundProperty)
   {
      EStructuralFeature oldBoundProperty = boundProperty;
      boundProperty = newBoundProperty;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, TemplatesPackage.PROPERTY_BINDING__BOUND_PROPERTY,
            oldBoundProperty, boundProperty));
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public Expression getBindingExpression ()
   {
      if (bindingExpression != null && bindingExpression.eIsProxy())
      {
         InternalEObject oldBindingExpression = (InternalEObject) bindingExpression;
         bindingExpression = (Expression) eResolveProxy(oldBindingExpression);
         if (bindingExpression != oldBindingExpression)
         {
            InternalEObject newBindingExpression = (InternalEObject) bindingExpression;
            NotificationChain msgs = oldBindingExpression.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
               - TemplatesPackage.PROPERTY_BINDING__BINDING_EXPRESSION, null, null);
            if (newBindingExpression.eInternalContainer() == null)
            {
               msgs = newBindingExpression.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                  - TemplatesPackage.PROPERTY_BINDING__BINDING_EXPRESSION, null, msgs);
            }
            if (msgs != null)
               msgs.dispatch();
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                  TemplatesPackage.PROPERTY_BINDING__BINDING_EXPRESSION, oldBindingExpression, bindingExpression));
         }
      }
      return bindingExpression;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public Expression basicGetBindingExpression ()
   {
      return bindingExpression;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetBindingExpression (Expression newBindingExpression, NotificationChain msgs)
   {
      Expression oldBindingExpression = bindingExpression;
      bindingExpression = newBindingExpression;
      if (eNotificationRequired())
      {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
            TemplatesPackage.PROPERTY_BINDING__BINDING_EXPRESSION, oldBindingExpression, newBindingExpression);
         if (msgs == null)
            msgs = notification;
         else
            msgs.add(notification);
      }
      return msgs;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public void setBindingExpression (Expression newBindingExpression)
   {
      if (newBindingExpression != bindingExpression)
      {
         NotificationChain msgs = null;
         if (bindingExpression != null)
            msgs = ((InternalEObject) bindingExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
               - TemplatesPackage.PROPERTY_BINDING__BINDING_EXPRESSION, null, msgs);
         if (newBindingExpression != null)
            msgs = ((InternalEObject) newBindingExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
               - TemplatesPackage.PROPERTY_BINDING__BINDING_EXPRESSION, null, msgs);
         msgs = basicSetBindingExpression(newBindingExpression, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, TemplatesPackage.PROPERTY_BINDING__BINDING_EXPRESSION,
            newBindingExpression, newBindingExpression));
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public TemplateBinding getTemplateBinding ()
   {
      if (eContainerFeatureID() != TemplatesPackage.PROPERTY_BINDING__TEMPLATE_BINDING)
         return null;
      return (TemplateBinding) eContainer();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public TemplateBinding basicGetTemplateBinding ()
   {
      if (eContainerFeatureID() != TemplatesPackage.PROPERTY_BINDING__TEMPLATE_BINDING)
         return null;
      return (TemplateBinding) eInternalContainer();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetTemplateBinding (TemplateBinding newTemplateBinding, NotificationChain msgs)
   {
      msgs = eBasicSetContainer((InternalEObject) newTemplateBinding,
         TemplatesPackage.PROPERTY_BINDING__TEMPLATE_BINDING, msgs);
      return msgs;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public void setTemplateBinding (TemplateBinding newTemplateBinding)
   {
      if (newTemplateBinding != eInternalContainer()
         || (eContainerFeatureID() != TemplatesPackage.PROPERTY_BINDING__TEMPLATE_BINDING && newTemplateBinding != null))
      {
         if (EcoreUtil.isAncestor(this, newTemplateBinding))
            throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
         NotificationChain msgs = null;
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         if (newTemplateBinding != null)
            msgs = ((InternalEObject) newTemplateBinding).eInverseAdd(this,
               TemplatesPackage.TEMPLATE_BINDING__PROPERTY_BINDING, TemplateBinding.class, msgs);
         msgs = basicSetTemplateBinding(newTemplateBinding, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, TemplatesPackage.PROPERTY_BINDING__TEMPLATE_BINDING,
            newTemplateBinding, newTemplateBinding));
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
         case TemplatesPackage.PROPERTY_BINDING__TEMPLATE_BINDING:
            if (eInternalContainer() != null)
               msgs = eBasicRemoveFromContainer(msgs);
            return basicSetTemplateBinding((TemplateBinding) otherEnd, msgs);
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
         case TemplatesPackage.PROPERTY_BINDING__BINDING_EXPRESSION:
            return basicSetBindingExpression(null, msgs);
         case TemplatesPackage.PROPERTY_BINDING__TEMPLATE_BINDING:
            return basicSetTemplateBinding(null, msgs);
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
         case TemplatesPackage.PROPERTY_BINDING__TEMPLATE_BINDING:
            return eInternalContainer().eInverseRemove(this, TemplatesPackage.TEMPLATE_BINDING__PROPERTY_BINDING,
               TemplateBinding.class, msgs);
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
         case TemplatesPackage.PROPERTY_BINDING__BOUND_PROPERTY:
            if (resolve)
               return getBoundProperty();
            return basicGetBoundProperty();
         case TemplatesPackage.PROPERTY_BINDING__BINDING_EXPRESSION:
            if (resolve)
               return getBindingExpression();
            return basicGetBindingExpression();
         case TemplatesPackage.PROPERTY_BINDING__TEMPLATE_BINDING:
            if (resolve)
               return getTemplateBinding();
            return basicGetTemplateBinding();
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
         case TemplatesPackage.PROPERTY_BINDING__BOUND_PROPERTY:
            setBoundProperty((EStructuralFeature) newValue);
            return;
         case TemplatesPackage.PROPERTY_BINDING__BINDING_EXPRESSION:
            setBindingExpression((Expression) newValue);
            return;
         case TemplatesPackage.PROPERTY_BINDING__TEMPLATE_BINDING:
            setTemplateBinding((TemplateBinding) newValue);
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
         case TemplatesPackage.PROPERTY_BINDING__BOUND_PROPERTY:
            setBoundProperty((EStructuralFeature) null);
            return;
         case TemplatesPackage.PROPERTY_BINDING__BINDING_EXPRESSION:
            setBindingExpression((Expression) null);
            return;
         case TemplatesPackage.PROPERTY_BINDING__TEMPLATE_BINDING:
            setTemplateBinding((TemplateBinding) null);
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
         case TemplatesPackage.PROPERTY_BINDING__BOUND_PROPERTY:
            return boundProperty != null;
         case TemplatesPackage.PROPERTY_BINDING__BINDING_EXPRESSION:
            return bindingExpression != null;
         case TemplatesPackage.PROPERTY_BINDING__TEMPLATE_BINDING:
            return basicGetTemplateBinding() != null;
      }
      return super.eIsSet(featureID);
   }

} // PropertyBindingImpl
