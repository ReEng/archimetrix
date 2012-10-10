/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.patterns.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.storydriven.modeling.patterns.AbstractLinkVariable;
import org.storydriven.modeling.patterns.AttributeAssignment;
import org.storydriven.modeling.patterns.BindingOperator;
import org.storydriven.modeling.patterns.BindingSemantics;
import org.storydriven.modeling.patterns.LinkConstraint;
import org.storydriven.modeling.patterns.ObjectVariable;
import org.storydriven.modeling.patterns.PatternsPackage;
import org.storydriven.modeling.util.SDMUtil;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Object</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.storydriven.modeling.patterns.impl.ObjectVariableImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.storydriven.modeling.patterns.impl.ObjectVariableImpl#getOutgoingLinks <em>Outgoing Link</em>}</li>
 *   <li>{@link org.storydriven.modeling.patterns.impl.ObjectVariableImpl#getLinkOrderConstraints <em>Link Order Constraint</em>}</li>
 *   <li>{@link org.storydriven.modeling.patterns.impl.ObjectVariableImpl#getBindingSemantics <em>Binding Semantics</em>}</li>
 *   <li>{@link org.storydriven.modeling.patterns.impl.ObjectVariableImpl#getBindingOperator <em>Binding Operator</em>}</li>
 *   <li>{@link org.storydriven.modeling.patterns.impl.ObjectVariableImpl#getAttributeAssignments <em>Attribute Assignment</em>}</li>
 *   <li>{@link org.storydriven.modeling.patterns.impl.ObjectVariableImpl#getClassifier <em>Classifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectVariableImpl extends AbstractVariableImpl implements ObjectVariable
{
   /**
    * The cached value of the '{@link #getOutgoingLinks() <em>Outgoing Link</em>}' reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #getOutgoingLinks()
    * @generated
    * @ordered
    */
   protected EList<AbstractLinkVariable> outgoingLinks;
   /**
    * The cached value of the '{@link #getLinkOrderConstraints() <em>Link Order Constraint</em>}' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #getLinkOrderConstraints()
    * @generated
    * @ordered
    */
   protected EList<LinkConstraint> linkOrderConstraints;
   /**
    * The default value of the '{@link #getBindingSemantics() <em>Binding Semantics</em>}' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #getBindingSemantics()
    * @generated
    * @ordered
    */
   protected static final BindingSemantics BINDING_SEMANTICS_EDEFAULT = BindingSemantics.MANDATORY;
   /**
    * The cached value of the '{@link #getBindingSemantics() <em>Binding Semantics</em>}' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #getBindingSemantics()
    * @generated
    * @ordered
    */
   protected BindingSemantics bindingSemantics = BINDING_SEMANTICS_EDEFAULT;
   /**
    * The default value of the '{@link #getBindingOperator() <em>Binding Operator</em>}' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #getBindingOperator()
    * @generated
    * @ordered
    */
   protected static final BindingOperator BINDING_OPERATOR_EDEFAULT = BindingOperator.CHECK_ONLY;
   /**
    * The cached value of the '{@link #getBindingOperator() <em>Binding Operator</em>}' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #getBindingOperator()
    * @generated
    * @ordered
    */
   protected BindingOperator bindingOperator = BINDING_OPERATOR_EDEFAULT;
   /**
    * The cached value of the '{@link #getAttributeAssignments() <em>Attribute Assignment</em>}' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #getAttributeAssignments()
    * @generated
    * @ordered
    */
   protected EList<AttributeAssignment> attributeAssignments;
   /**
    * The cached value of the '{@link #getClassifier() <em>Classifier</em>}' reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #getClassifier()
    * @generated
    * @ordered
    */
   protected EClass classifier;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   protected ObjectVariableImpl ()
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
      return PatternsPackage.Literals.OBJECT_VARIABLE;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public BindingSemantics getBindingSemantics ()
   {
      return bindingSemantics;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public void setBindingSemantics (BindingSemantics newBindingSemantics)
   {
      BindingSemantics oldBindingSemantics = bindingSemantics;
      bindingSemantics = newBindingSemantics == null ? BINDING_SEMANTICS_EDEFAULT : newBindingSemantics;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.OBJECT_VARIABLE__BINDING_SEMANTICS,
            oldBindingSemantics, bindingSemantics));
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public BindingOperator getBindingOperator ()
   {
      return bindingOperator;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public void setBindingOperator (BindingOperator newBindingOperator)
   {
      BindingOperator oldBindingOperator = bindingOperator;
      bindingOperator = newBindingOperator == null ? BINDING_OPERATOR_EDEFAULT : newBindingOperator;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.OBJECT_VARIABLE__BINDING_OPERATOR,
            oldBindingOperator, bindingOperator));
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EList<AbstractLinkVariable> getOutgoingLinks ()
   {
      if (outgoingLinks == null)
      {
         outgoingLinks = new EObjectWithInverseResolvingEList<AbstractLinkVariable>(AbstractLinkVariable.class, this,
            PatternsPackage.OBJECT_VARIABLE__OUTGOING_LINK, PatternsPackage.ABSTRACT_LINK_VARIABLE__SOURCE);
      }
      return outgoingLinks;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EList<LinkConstraint> getLinkOrderConstraints ()
   {
      if (linkOrderConstraints == null)
      {
         linkOrderConstraints = new EObjectContainmentWithInverseEList.Resolving<LinkConstraint>(LinkConstraint.class,
            this, PatternsPackage.OBJECT_VARIABLE__LINK_ORDER_CONSTRAINT,
            PatternsPackage.LINK_CONSTRAINT__REFERENCING_OBJECT);
      }
      return linkOrderConstraints;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EClass getClassifier ()
   {
      if (classifier != null && classifier.eIsProxy())
      {
         InternalEObject oldClassifier = (InternalEObject) classifier;
         classifier = (EClass) eResolveProxy(oldClassifier);
         if (classifier != oldClassifier)
         {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternsPackage.OBJECT_VARIABLE__CLASSIFIER,
                  oldClassifier, classifier));
         }
      }
      return classifier;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EClass basicGetClassifier ()
   {
      return classifier;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public void setClassifier (EClass newClassifier)
   {
      EClass oldClassifier = this.classifier;
      this.classifier = newClassifier;
      NotificationChain msgs = updateGenericType(newClassifier, null);
      SDMUtil.dispatch(msgs, eNotificationRequired() ? new ENotificationImpl(this, Notification.SET,
         PatternsPackage.OBJECT_VARIABLE__CLASSIFIER, oldClassifier, this.classifier) : null);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EList<AttributeAssignment> getAttributeAssignments ()
   {
      if (attributeAssignments == null)
      {
         attributeAssignments = new EObjectContainmentWithInverseEList.Resolving<AttributeAssignment>(
            AttributeAssignment.class, this, PatternsPackage.OBJECT_VARIABLE__ATTRIBUTE_ASSIGNMENT,
            PatternsPackage.ATTRIBUTE_ASSIGNMENT__OBJECT_VARIABLE);
      }
      return attributeAssignments;
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
         case PatternsPackage.OBJECT_VARIABLE__OUTGOING_LINK:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getOutgoingLinks()).basicAdd(otherEnd, msgs);
         case PatternsPackage.OBJECT_VARIABLE__LINK_ORDER_CONSTRAINT:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getLinkOrderConstraints()).basicAdd(otherEnd,
               msgs);
         case PatternsPackage.OBJECT_VARIABLE__ATTRIBUTE_ASSIGNMENT:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getAttributeAssignments()).basicAdd(otherEnd,
               msgs);
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
         case PatternsPackage.OBJECT_VARIABLE__OUTGOING_LINK:
            return ((InternalEList<?>) getOutgoingLinks()).basicRemove(otherEnd, msgs);
         case PatternsPackage.OBJECT_VARIABLE__LINK_ORDER_CONSTRAINT:
            return ((InternalEList<?>) getLinkOrderConstraints()).basicRemove(otherEnd, msgs);
         case PatternsPackage.OBJECT_VARIABLE__ATTRIBUTE_ASSIGNMENT:
            return ((InternalEList<?>) getAttributeAssignments()).basicRemove(otherEnd, msgs);
      }
      return super.eInverseRemove(otherEnd, featureID, msgs);
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
         case PatternsPackage.OBJECT_VARIABLE__OUTGOING_LINK:
            return getOutgoingLinks();
         case PatternsPackage.OBJECT_VARIABLE__LINK_ORDER_CONSTRAINT:
            return getLinkOrderConstraints();
         case PatternsPackage.OBJECT_VARIABLE__BINDING_SEMANTICS:
            return getBindingSemantics();
         case PatternsPackage.OBJECT_VARIABLE__BINDING_OPERATOR:
            return getBindingOperator();
         case PatternsPackage.OBJECT_VARIABLE__ATTRIBUTE_ASSIGNMENT:
            return getAttributeAssignments();
         case PatternsPackage.OBJECT_VARIABLE__CLASSIFIER:
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
   @SuppressWarnings ("unchecked")
   @Override
   public void eSet (int featureID, Object newValue)
   {
      switch (featureID)
      {
         case PatternsPackage.OBJECT_VARIABLE__OUTGOING_LINK:
            getOutgoingLinks().clear();
            getOutgoingLinks().addAll((Collection<? extends AbstractLinkVariable>) newValue);
            return;
         case PatternsPackage.OBJECT_VARIABLE__LINK_ORDER_CONSTRAINT:
            getLinkOrderConstraints().clear();
            getLinkOrderConstraints().addAll((Collection<? extends LinkConstraint>) newValue);
            return;
         case PatternsPackage.OBJECT_VARIABLE__BINDING_SEMANTICS:
            setBindingSemantics((BindingSemantics) newValue);
            return;
         case PatternsPackage.OBJECT_VARIABLE__BINDING_OPERATOR:
            setBindingOperator((BindingOperator) newValue);
            return;
         case PatternsPackage.OBJECT_VARIABLE__ATTRIBUTE_ASSIGNMENT:
            getAttributeAssignments().clear();
            getAttributeAssignments().addAll((Collection<? extends AttributeAssignment>) newValue);
            return;
         case PatternsPackage.OBJECT_VARIABLE__CLASSIFIER:
            setClassifier((EClass) newValue);
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
         case PatternsPackage.OBJECT_VARIABLE__OUTGOING_LINK:
            getOutgoingLinks().clear();
            return;
         case PatternsPackage.OBJECT_VARIABLE__LINK_ORDER_CONSTRAINT:
            getLinkOrderConstraints().clear();
            return;
         case PatternsPackage.OBJECT_VARIABLE__BINDING_SEMANTICS:
            setBindingSemantics(BINDING_SEMANTICS_EDEFAULT);
            return;
         case PatternsPackage.OBJECT_VARIABLE__BINDING_OPERATOR:
            setBindingOperator(BINDING_OPERATOR_EDEFAULT);
            return;
         case PatternsPackage.OBJECT_VARIABLE__ATTRIBUTE_ASSIGNMENT:
            getAttributeAssignments().clear();
            return;
         case PatternsPackage.OBJECT_VARIABLE__CLASSIFIER:
            setClassifier((EClass) null);
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
         case PatternsPackage.OBJECT_VARIABLE__OUTGOING_LINK:
            return outgoingLinks != null && !outgoingLinks.isEmpty();
         case PatternsPackage.OBJECT_VARIABLE__LINK_ORDER_CONSTRAINT:
            return linkOrderConstraints != null && !linkOrderConstraints.isEmpty();
         case PatternsPackage.OBJECT_VARIABLE__BINDING_SEMANTICS:
            return bindingSemantics != BINDING_SEMANTICS_EDEFAULT;
         case PatternsPackage.OBJECT_VARIABLE__BINDING_OPERATOR:
            return bindingOperator != BINDING_OPERATOR_EDEFAULT;
         case PatternsPackage.OBJECT_VARIABLE__ATTRIBUTE_ASSIGNMENT:
            return attributeAssignments != null && !attributeAssignments.isEmpty();
         case PatternsPackage.OBJECT_VARIABLE__CLASSIFIER:
            return classifier != null;
      }
      return super.eIsSet(featureID);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   @Override
   public String toString ()
   {
      if (eIsProxy())
         return super.toString();

      StringBuffer result = new StringBuffer(super.toString());
      result.append(" (bindingSemantics: ");
      result.append(bindingSemantics);
      result.append(", bindingOperator: ");
      result.append(bindingOperator);
      result.append(')');
      return result.toString();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   @Override
   public boolean isSetType ()
   {
      return super.isSetType() || eIsSet(PatternsPackage.OBJECT_VARIABLE__CLASSIFIER);
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
      if (eIsSet(PatternsPackage.OBJECT_VARIABLE__CLASSIFIER))
      {
         return basicGetClassifier();
      }
      return super.basicGetType();
   }

   @Override
   protected NotificationChain basicSetType (EClassifier newType, NotificationChain msgs)
   {
      EClass oldClassifier = this.classifier;
      this.classifier = (EClass) newType;
      if (eNotificationRequired())
      {
         return SDMUtil.chain(msgs, new ENotificationImpl(this, Notification.SET,
            PatternsPackage.OBJECT_VARIABLE__CLASSIFIER, oldClassifier, this.classifier));
      }
      return msgs;
   }
} // ObjectVariableImpl
