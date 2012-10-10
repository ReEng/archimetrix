/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.patterns.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.storydriven.modeling.patterns.PatternsPackage;
import org.storydriven.modeling.patterns.PrimitiveVariable;
import org.storydriven.modeling.util.SDMUtil;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Primitive Variable</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.storydriven.modeling.patterns.impl.PrimitiveVariableImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.storydriven.modeling.patterns.impl.PrimitiveVariableImpl#getClassifier <em>Classifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrimitiveVariableImpl extends AbstractVariableImpl implements PrimitiveVariable
{
   /**
    * The cached value of the '{@link #getClassifier() <em>Classifier</em>}' reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #getClassifier()
    * @generated
    * @ordered
    */
   protected EDataType classifier;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   protected PrimitiveVariableImpl ()
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
      return PatternsPackage.Literals.PRIMITIVE_VARIABLE;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   @Override
   public EClassifier getType ()
   {
      EClassifier type = basicGetType();
      return type != null && type.eIsProxy() ? (EClassifier) eResolveProxy((InternalEObject) type) : type;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   @Override
   public EClassifier basicGetType ()
   {
      if (eIsSet(PatternsPackage.PRIMITIVE_VARIABLE__CLASSIFIER))
      {
         return basicGetClassifier();
      }
      return super.basicGetType();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EDataType getClassifier ()
   {
      if (classifier != null && classifier.eIsProxy())
      {
         InternalEObject oldClassifier = (InternalEObject) classifier;
         classifier = (EDataType) eResolveProxy(oldClassifier);
         if (classifier != oldClassifier)
         {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                  PatternsPackage.PRIMITIVE_VARIABLE__CLASSIFIER, oldClassifier, classifier));
         }
      }
      return classifier;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EDataType basicGetClassifier ()
   {
      return classifier;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public void setClassifier (EDataType newClassifier)
   {
      EDataType oldClassifier = classifier;
      classifier = newClassifier;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.PRIMITIVE_VARIABLE__CLASSIFIER,
            oldClassifier, classifier));
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
         case PatternsPackage.PRIMITIVE_VARIABLE__CLASSIFIER:
            if (resolve)
               return getClassifier();
            return basicGetClassifier();
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
         case PatternsPackage.PRIMITIVE_VARIABLE__CLASSIFIER:
            setClassifier((EDataType) newValue);
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
         case PatternsPackage.PRIMITIVE_VARIABLE__CLASSIFIER:
            setClassifier((EDataType) null);
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
         case PatternsPackage.PRIMITIVE_VARIABLE__CLASSIFIER:
            return classifier != null;
      }
      return super.eIsSet(featureID);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   @Override
   public boolean isSetType ()
   {
      return super.isSetType() || eIsSet(PatternsPackage.PRIMITIVE_VARIABLE__CLASSIFIER);
   }

   @Override
   protected NotificationChain basicSetType (EClassifier newType, NotificationChain msgs)
   {
      EDataType oldClassifier = this.classifier;
      this.classifier = (EDataType) newType;
      if (eNotificationRequired())
      {
         return SDMUtil.chain(msgs, new ENotificationImpl(this, Notification.SET,
            PatternsPackage.PRIMITIVE_VARIABLE__CLASSIFIER, oldClassifier, this.classifier));
      }
      return msgs;
   }

} // PrimitiveVariableImpl
