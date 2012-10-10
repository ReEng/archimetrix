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
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.storydriven.modeling.impl.ExtendableElementImpl;
import org.storydriven.modeling.patterns.AbstractLinkVariable;
import org.storydriven.modeling.patterns.LinkConstraint;
import org.storydriven.modeling.patterns.LinkConstraintType;
import org.storydriven.modeling.patterns.ObjectVariable;
import org.storydriven.modeling.patterns.PatternsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.storydriven.modeling.patterns.impl.LinkConstraintImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link org.storydriven.modeling.patterns.impl.LinkConstraintImpl#getConstraintType <em>Constraint Type</em>}</li>
 *   <li>{@link org.storydriven.modeling.patterns.impl.LinkConstraintImpl#isNegative <em>Negative</em>}</li>
 *   <li>{@link org.storydriven.modeling.patterns.impl.LinkConstraintImpl#getFirstLink <em>First Link</em>}</li>
 *   <li>{@link org.storydriven.modeling.patterns.impl.LinkConstraintImpl#getReferencingObject <em>Referencing Object</em>}</li>
 *   <li>{@link org.storydriven.modeling.patterns.impl.LinkConstraintImpl#getSecondLink <em>Second Link</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinkConstraintImpl extends ExtendableElementImpl implements LinkConstraint
{
   /**
    * The default value of the '{@link #getIndex() <em>Index</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getIndex()
    * @generated
    * @ordered
    */
   protected static final int INDEX_EDEFAULT = 0;

   /**
    * The cached value of the '{@link #getIndex() <em>Index</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getIndex()
    * @generated
    * @ordered
    */
   protected int index = INDEX_EDEFAULT;

   /**
    * The default value of the '{@link #getConstraintType() <em>Constraint Type</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getConstraintType()
    * @generated
    * @ordered
    */
   protected static final LinkConstraintType CONSTRAINT_TYPE_EDEFAULT = LinkConstraintType.DIRECT_SUCCESSOR;

   /**
    * The cached value of the '{@link #getConstraintType() <em>Constraint Type</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getConstraintType()
    * @generated
    * @ordered
    */
   protected LinkConstraintType constraintType = CONSTRAINT_TYPE_EDEFAULT;

   /**
    * The default value of the '{@link #isNegative() <em>Negative</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #isNegative()
    * @generated
    * @ordered
    */
   protected static final boolean NEGATIVE_EDEFAULT = false;

   /**
    * The cached value of the '{@link #isNegative() <em>Negative</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #isNegative()
    * @generated
    * @ordered
    */
   protected boolean negative = NEGATIVE_EDEFAULT;

   /**
    * The cached value of the '{@link #getFirstLink() <em>First Link</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getFirstLink()
    * @generated
    * @ordered
    */
   protected AbstractLinkVariable firstLink;

   /**
    * The cached value of the '{@link #getSecondLink() <em>Second Link</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getSecondLink()
    * @generated
    * @ordered
    */
   protected AbstractLinkVariable secondLink;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected LinkConstraintImpl ()
   {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass ()
   {
      return PatternsPackage.Literals.LINK_CONSTRAINT;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public int getIndex ()
   {
      return index;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setIndex (int newIndex)
   {
      int oldIndex = index;
      index = newIndex;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.LINK_CONSTRAINT__INDEX, oldIndex, index));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public LinkConstraintType getConstraintType ()
   {
      return constraintType;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setConstraintType (LinkConstraintType newConstraintType)
   {
      LinkConstraintType oldConstraintType = constraintType;
      constraintType = newConstraintType == null ? CONSTRAINT_TYPE_EDEFAULT : newConstraintType;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.LINK_CONSTRAINT__CONSTRAINT_TYPE,
            oldConstraintType, constraintType));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean isNegative ()
   {
      return negative;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setNegative (boolean newNegative)
   {
      boolean oldNegative = negative;
      negative = newNegative;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.LINK_CONSTRAINT__NEGATIVE, oldNegative,
            negative));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public AbstractLinkVariable getFirstLink ()
   {
      if (firstLink != null && firstLink.eIsProxy())
      {
         InternalEObject oldFirstLink = (InternalEObject) firstLink;
         firstLink = (AbstractLinkVariable) eResolveProxy(oldFirstLink);
         if (firstLink != oldFirstLink)
         {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternsPackage.LINK_CONSTRAINT__FIRST_LINK,
                  oldFirstLink, firstLink));
         }
      }
      return firstLink;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public AbstractLinkVariable basicGetFirstLink ()
   {
      return firstLink;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetFirstLink (AbstractLinkVariable newFirstLink, NotificationChain msgs)
   {
      AbstractLinkVariable oldFirstLink = firstLink;
      firstLink = newFirstLink;
      if (eNotificationRequired())
      {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
            PatternsPackage.LINK_CONSTRAINT__FIRST_LINK, oldFirstLink, newFirstLink);
         if (msgs == null)
            msgs = notification;
         else
            msgs.add(notification);
      }
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setFirstLink (AbstractLinkVariable newFirstLink)
   {
      if (newFirstLink != firstLink)
      {
         NotificationChain msgs = null;
         if (firstLink != null)
            msgs = ((InternalEObject) firstLink).eInverseRemove(this,
               PatternsPackage.ABSTRACT_LINK_VARIABLE__FIRST_LINK_CONSTRAINT, AbstractLinkVariable.class, msgs);
         if (newFirstLink != null)
            msgs = ((InternalEObject) newFirstLink).eInverseAdd(this,
               PatternsPackage.ABSTRACT_LINK_VARIABLE__FIRST_LINK_CONSTRAINT, AbstractLinkVariable.class, msgs);
         msgs = basicSetFirstLink(newFirstLink, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.LINK_CONSTRAINT__FIRST_LINK,
            newFirstLink, newFirstLink));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ObjectVariable getReferencingObject ()
   {
      if (eContainerFeatureID() != PatternsPackage.LINK_CONSTRAINT__REFERENCING_OBJECT)
         return null;
      return (ObjectVariable) eContainer();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ObjectVariable basicGetReferencingObject ()
   {
      if (eContainerFeatureID() != PatternsPackage.LINK_CONSTRAINT__REFERENCING_OBJECT)
         return null;
      return (ObjectVariable) eInternalContainer();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetReferencingObject (ObjectVariable newReferencingObject, NotificationChain msgs)
   {
      msgs = eBasicSetContainer((InternalEObject) newReferencingObject,
         PatternsPackage.LINK_CONSTRAINT__REFERENCING_OBJECT, msgs);
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setReferencingObject (ObjectVariable newReferencingObject)
   {
      if (newReferencingObject != eInternalContainer()
         || (eContainerFeatureID() != PatternsPackage.LINK_CONSTRAINT__REFERENCING_OBJECT && newReferencingObject != null))
      {
         if (EcoreUtil.isAncestor(this, newReferencingObject))
            throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
         NotificationChain msgs = null;
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         if (newReferencingObject != null)
            msgs = ((InternalEObject) newReferencingObject).eInverseAdd(this,
               PatternsPackage.OBJECT_VARIABLE__LINK_ORDER_CONSTRAINT, ObjectVariable.class, msgs);
         msgs = basicSetReferencingObject(newReferencingObject, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.LINK_CONSTRAINT__REFERENCING_OBJECT,
            newReferencingObject, newReferencingObject));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public AbstractLinkVariable getSecondLink ()
   {
      if (secondLink != null && secondLink.eIsProxy())
      {
         InternalEObject oldSecondLink = (InternalEObject) secondLink;
         secondLink = (AbstractLinkVariable) eResolveProxy(oldSecondLink);
         if (secondLink != oldSecondLink)
         {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternsPackage.LINK_CONSTRAINT__SECOND_LINK,
                  oldSecondLink, secondLink));
         }
      }
      return secondLink;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public AbstractLinkVariable basicGetSecondLink ()
   {
      return secondLink;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetSecondLink (AbstractLinkVariable newSecondLink, NotificationChain msgs)
   {
      AbstractLinkVariable oldSecondLink = secondLink;
      secondLink = newSecondLink;
      if (eNotificationRequired())
      {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
            PatternsPackage.LINK_CONSTRAINT__SECOND_LINK, oldSecondLink, newSecondLink);
         if (msgs == null)
            msgs = notification;
         else
            msgs.add(notification);
      }
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setSecondLink (AbstractLinkVariable newSecondLink)
   {
      if (newSecondLink != secondLink)
      {
         NotificationChain msgs = null;
         if (secondLink != null)
            msgs = ((InternalEObject) secondLink).eInverseRemove(this,
               PatternsPackage.ABSTRACT_LINK_VARIABLE__SECOND_LINK_CONSTRAINT, AbstractLinkVariable.class, msgs);
         if (newSecondLink != null)
            msgs = ((InternalEObject) newSecondLink).eInverseAdd(this,
               PatternsPackage.ABSTRACT_LINK_VARIABLE__SECOND_LINK_CONSTRAINT, AbstractLinkVariable.class, msgs);
         msgs = basicSetSecondLink(newSecondLink, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.LINK_CONSTRAINT__SECOND_LINK,
            newSecondLink, newSecondLink));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eInverseAdd (InternalEObject otherEnd, int featureID, NotificationChain msgs)
   {
      switch (featureID)
      {
         case PatternsPackage.LINK_CONSTRAINT__FIRST_LINK:
            if (firstLink != null)
               msgs = ((InternalEObject) firstLink).eInverseRemove(this,
                  PatternsPackage.ABSTRACT_LINK_VARIABLE__FIRST_LINK_CONSTRAINT, AbstractLinkVariable.class, msgs);
            return basicSetFirstLink((AbstractLinkVariable) otherEnd, msgs);
         case PatternsPackage.LINK_CONSTRAINT__REFERENCING_OBJECT:
            if (eInternalContainer() != null)
               msgs = eBasicRemoveFromContainer(msgs);
            return basicSetReferencingObject((ObjectVariable) otherEnd, msgs);
         case PatternsPackage.LINK_CONSTRAINT__SECOND_LINK:
            if (secondLink != null)
               msgs = ((InternalEObject) secondLink).eInverseRemove(this,
                  PatternsPackage.ABSTRACT_LINK_VARIABLE__SECOND_LINK_CONSTRAINT, AbstractLinkVariable.class, msgs);
            return basicSetSecondLink((AbstractLinkVariable) otherEnd, msgs);
      }
      return super.eInverseAdd(otherEnd, featureID, msgs);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eInverseRemove (InternalEObject otherEnd, int featureID, NotificationChain msgs)
   {
      switch (featureID)
      {
         case PatternsPackage.LINK_CONSTRAINT__FIRST_LINK:
            return basicSetFirstLink(null, msgs);
         case PatternsPackage.LINK_CONSTRAINT__REFERENCING_OBJECT:
            return basicSetReferencingObject(null, msgs);
         case PatternsPackage.LINK_CONSTRAINT__SECOND_LINK:
            return basicSetSecondLink(null, msgs);
      }
      return super.eInverseRemove(otherEnd, featureID, msgs);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eBasicRemoveFromContainerFeature (NotificationChain msgs)
   {
      switch (eContainerFeatureID())
      {
         case PatternsPackage.LINK_CONSTRAINT__REFERENCING_OBJECT:
            return eInternalContainer().eInverseRemove(this, PatternsPackage.OBJECT_VARIABLE__LINK_ORDER_CONSTRAINT,
               ObjectVariable.class, msgs);
      }
      return super.eBasicRemoveFromContainerFeature(msgs);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object eGet (int featureID, boolean resolve, boolean coreType)
   {
      switch (featureID)
      {
         case PatternsPackage.LINK_CONSTRAINT__INDEX:
            return getIndex();
         case PatternsPackage.LINK_CONSTRAINT__CONSTRAINT_TYPE:
            return getConstraintType();
         case PatternsPackage.LINK_CONSTRAINT__NEGATIVE:
            return isNegative();
         case PatternsPackage.LINK_CONSTRAINT__FIRST_LINK:
            if (resolve)
               return getFirstLink();
            return basicGetFirstLink();
         case PatternsPackage.LINK_CONSTRAINT__REFERENCING_OBJECT:
            if (resolve)
               return getReferencingObject();
            return basicGetReferencingObject();
         case PatternsPackage.LINK_CONSTRAINT__SECOND_LINK:
            if (resolve)
               return getSecondLink();
            return basicGetSecondLink();
      }
      return super.eGet(featureID, resolve, coreType);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public void eSet (int featureID, Object newValue)
   {
      switch (featureID)
      {
         case PatternsPackage.LINK_CONSTRAINT__INDEX:
            setIndex((Integer) newValue);
            return;
         case PatternsPackage.LINK_CONSTRAINT__CONSTRAINT_TYPE:
            setConstraintType((LinkConstraintType) newValue);
            return;
         case PatternsPackage.LINK_CONSTRAINT__NEGATIVE:
            setNegative((Boolean) newValue);
            return;
         case PatternsPackage.LINK_CONSTRAINT__FIRST_LINK:
            setFirstLink((AbstractLinkVariable) newValue);
            return;
         case PatternsPackage.LINK_CONSTRAINT__REFERENCING_OBJECT:
            setReferencingObject((ObjectVariable) newValue);
            return;
         case PatternsPackage.LINK_CONSTRAINT__SECOND_LINK:
            setSecondLink((AbstractLinkVariable) newValue);
            return;
      }
      super.eSet(featureID, newValue);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public void eUnset (int featureID)
   {
      switch (featureID)
      {
         case PatternsPackage.LINK_CONSTRAINT__INDEX:
            setIndex(INDEX_EDEFAULT);
            return;
         case PatternsPackage.LINK_CONSTRAINT__CONSTRAINT_TYPE:
            setConstraintType(CONSTRAINT_TYPE_EDEFAULT);
            return;
         case PatternsPackage.LINK_CONSTRAINT__NEGATIVE:
            setNegative(NEGATIVE_EDEFAULT);
            return;
         case PatternsPackage.LINK_CONSTRAINT__FIRST_LINK:
            setFirstLink((AbstractLinkVariable) null);
            return;
         case PatternsPackage.LINK_CONSTRAINT__REFERENCING_OBJECT:
            setReferencingObject((ObjectVariable) null);
            return;
         case PatternsPackage.LINK_CONSTRAINT__SECOND_LINK:
            setSecondLink((AbstractLinkVariable) null);
            return;
      }
      super.eUnset(featureID);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public boolean eIsSet (int featureID)
   {
      switch (featureID)
      {
         case PatternsPackage.LINK_CONSTRAINT__INDEX:
            return index != INDEX_EDEFAULT;
         case PatternsPackage.LINK_CONSTRAINT__CONSTRAINT_TYPE:
            return constraintType != CONSTRAINT_TYPE_EDEFAULT;
         case PatternsPackage.LINK_CONSTRAINT__NEGATIVE:
            return negative != NEGATIVE_EDEFAULT;
         case PatternsPackage.LINK_CONSTRAINT__FIRST_LINK:
            return firstLink != null;
         case PatternsPackage.LINK_CONSTRAINT__REFERENCING_OBJECT:
            return basicGetReferencingObject() != null;
         case PatternsPackage.LINK_CONSTRAINT__SECOND_LINK:
            return secondLink != null;
      }
      return super.eIsSet(featureID);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public String toString ()
   {
      if (eIsProxy())
         return super.toString();

      StringBuffer result = new StringBuffer(super.toString());
      result.append(" (index: ");
      result.append(index);
      result.append(", constraintType: ");
      result.append(constraintType);
      result.append(", negative: ");
      result.append(negative);
      result.append(')');
      return result.toString();
   }

} //LinkConstraintImpl
