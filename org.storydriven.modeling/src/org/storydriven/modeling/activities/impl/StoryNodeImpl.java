/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.activities.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.storydriven.modeling.activities.ActivitiesPackage;
import org.storydriven.modeling.activities.StoryNode;
import org.storydriven.modeling.patterns.StoryPattern;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Story Node</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.storydriven.modeling.activities.impl.StoryNodeImpl#getStoryPattern <em>Story Pattern</em>}</li>
 *   <li>{@link org.storydriven.modeling.activities.impl.StoryNodeImpl#isForEach <em>For Each</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class StoryNodeImpl extends ActivityNodeImpl implements StoryNode
{
   /**
    * The default value of the '{@link #isForEach() <em>For Each</em>}' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #isForEach()
    * @generated
    * @ordered
    */
   protected static final boolean FOR_EACH_EDEFAULT = false;

   /**
    * The cached value of the '{@link #isForEach() <em>For Each</em>}' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #isForEach()
    * @generated
    * @ordered
    */
   protected boolean forEach = FOR_EACH_EDEFAULT;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   protected StoryNodeImpl ()
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
      return ActivitiesPackage.Literals.STORY_NODE;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public boolean isForEach ()
   {
      return forEach;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public void setForEach (boolean newForEach)
   {
      boolean oldForEach = forEach;
      forEach = newForEach;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ActivitiesPackage.STORY_NODE__FOR_EACH, oldForEach,
            forEach));
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
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
   public StoryPattern basicGetStoryPattern ()
   {
      return null;
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
         case ActivitiesPackage.STORY_NODE__STORY_PATTERN:
            if (resolve)
               return getStoryPattern();
            return basicGetStoryPattern();
         case ActivitiesPackage.STORY_NODE__FOR_EACH:
            return isForEach();
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
         case ActivitiesPackage.STORY_NODE__FOR_EACH:
            setForEach((Boolean) newValue);
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
         case ActivitiesPackage.STORY_NODE__FOR_EACH:
            setForEach(FOR_EACH_EDEFAULT);
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
         case ActivitiesPackage.STORY_NODE__STORY_PATTERN:
            return isSetStoryPattern();
         case ActivitiesPackage.STORY_NODE__FOR_EACH:
            return forEach != FOR_EACH_EDEFAULT;
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
      result.append(" (forEach: ");
      result.append(forEach);
      result.append(')');
      return result.toString();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public boolean isSetStoryPattern ()
   {
      return false;
   }

} // StoryNodeImpl
