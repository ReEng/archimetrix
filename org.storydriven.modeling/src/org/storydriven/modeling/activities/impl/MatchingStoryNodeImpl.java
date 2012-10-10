/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.activities.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.storydriven.modeling.activities.ActivitiesPackage;
import org.storydriven.modeling.activities.MatchingStoryNode;
import org.storydriven.modeling.patterns.MatchingPattern;
import org.storydriven.modeling.patterns.StoryPattern;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Matching Story Node</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.storydriven.modeling.activities.impl.MatchingStoryNodeImpl#getStoryPattern <em>Story Pattern</em>}</li>
 *   <li>{@link org.storydriven.modeling.activities.impl.MatchingStoryNodeImpl#getOwnedPattern <em>Owned Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MatchingStoryNodeImpl extends StoryNodeImpl implements MatchingStoryNode
{
   /**
    * The cached value of the '{@link #getOwnedPattern() <em>Owned Pattern</em>}' containment reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #getOwnedPattern()
    * @generated
    * @ordered
    */
   protected MatchingPattern ownedPattern;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   protected MatchingStoryNodeImpl ()
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
      return ActivitiesPackage.Literals.MATCHING_STORY_NODE;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public MatchingPattern getOwnedPattern ()
   {
      if (ownedPattern != null && ownedPattern.eIsProxy())
      {
         InternalEObject oldOwnedPattern = (InternalEObject) ownedPattern;
         ownedPattern = (MatchingPattern) eResolveProxy(oldOwnedPattern);
         if (ownedPattern != oldOwnedPattern)
         {
            InternalEObject newOwnedPattern = (InternalEObject) ownedPattern;
            NotificationChain msgs = oldOwnedPattern.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
               - ActivitiesPackage.MATCHING_STORY_NODE__OWNED_PATTERN, null, null);
            if (newOwnedPattern.eInternalContainer() == null)
            {
               msgs = newOwnedPattern.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                  - ActivitiesPackage.MATCHING_STORY_NODE__OWNED_PATTERN, null, msgs);
            }
            if (msgs != null)
               msgs.dispatch();
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                  ActivitiesPackage.MATCHING_STORY_NODE__OWNED_PATTERN, oldOwnedPattern, ownedPattern));
         }
      }
      return ownedPattern;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public MatchingPattern basicGetOwnedPattern ()
   {
      return ownedPattern;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetOwnedPattern (MatchingPattern newOwnedPattern, NotificationChain msgs)
   {
      MatchingPattern oldOwnedPattern = ownedPattern;
      ownedPattern = newOwnedPattern;
      if (eNotificationRequired())
      {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
            ActivitiesPackage.MATCHING_STORY_NODE__OWNED_PATTERN, oldOwnedPattern, newOwnedPattern);
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
   public void setOwnedPattern (MatchingPattern newOwnedPattern)
   {
      if (newOwnedPattern != ownedPattern)
      {
         NotificationChain msgs = null;
         if (ownedPattern != null)
            msgs = ((InternalEObject) ownedPattern).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
               - ActivitiesPackage.MATCHING_STORY_NODE__OWNED_PATTERN, null, msgs);
         if (newOwnedPattern != null)
            msgs = ((InternalEObject) newOwnedPattern).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
               - ActivitiesPackage.MATCHING_STORY_NODE__OWNED_PATTERN, null, msgs);
         msgs = basicSetOwnedPattern(newOwnedPattern, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ActivitiesPackage.MATCHING_STORY_NODE__OWNED_PATTERN,
            newOwnedPattern, newOwnedPattern));
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
         case ActivitiesPackage.MATCHING_STORY_NODE__OWNED_PATTERN:
            return basicSetOwnedPattern(null, msgs);
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
         case ActivitiesPackage.MATCHING_STORY_NODE__OWNED_PATTERN:
            if (resolve)
               return getOwnedPattern();
            return basicGetOwnedPattern();
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
         case ActivitiesPackage.MATCHING_STORY_NODE__OWNED_PATTERN:
            setOwnedPattern((MatchingPattern) newValue);
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
         case ActivitiesPackage.MATCHING_STORY_NODE__OWNED_PATTERN:
            setOwnedPattern((MatchingPattern) null);
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
         case ActivitiesPackage.MATCHING_STORY_NODE__OWNED_PATTERN:
            return ownedPattern != null;
      }
      return super.eIsSet(featureID);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   @Override
   public StoryPattern getStoryPattern ()
   {
      StoryPattern storyPattern = basicGetStoryPattern();
      return storyPattern != null && storyPattern.eIsProxy()
         ? (StoryPattern) eResolveProxy((InternalEObject) storyPattern) : storyPattern;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   @Override
   public StoryPattern basicGetStoryPattern ()
   {
      if (eIsSet(ActivitiesPackage.MATCHING_STORY_NODE__OWNED_PATTERN))
      {
         return basicGetOwnedPattern();
      }
      return super.basicGetStoryPattern();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   @Override
   public boolean isSetStoryPattern ()
   {
      return super.isSetStoryPattern() || eIsSet(ActivitiesPackage.MATCHING_STORY_NODE__OWNED_PATTERN);
   }

} // MatchingStoryNodeImpl
