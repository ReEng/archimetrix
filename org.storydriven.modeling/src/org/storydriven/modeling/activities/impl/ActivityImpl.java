/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.activities.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.storydriven.modeling.activities.ActivitiesPackage;
import org.storydriven.modeling.activities.Activity;
import org.storydriven.modeling.activities.ActivityEdge;
import org.storydriven.modeling.activities.ActivityNode;
import org.storydriven.modeling.activities.MatchingStoryNode;
import org.storydriven.modeling.activities.OperationExtension;
import org.storydriven.modeling.calls.Callable;
import org.storydriven.modeling.calls.CallsPackage;
import org.storydriven.modeling.impl.CommentableElementImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Activity</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.storydriven.modeling.activities.impl.ActivityImpl#getInParameters <em>In Parameter</em>}</li>
 *   <li>{@link org.storydriven.modeling.activities.impl.ActivityImpl#getOutParameters <em>Out Parameter</em>}</li>
 *   <li>{@link org.storydriven.modeling.activities.impl.ActivityImpl#getContainedParameters <em>Contained Parameters</em>}</li>
 *   <li>{@link org.storydriven.modeling.activities.impl.ActivityImpl#getOwningOperation <em>Owning Operation</em>}</li>
 *   <li>{@link org.storydriven.modeling.activities.impl.ActivityImpl#getOwnedActivityEdges <em>Owned Activity Edge</em>}</li>
 *   <li>{@link org.storydriven.modeling.activities.impl.ActivityImpl#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link org.storydriven.modeling.activities.impl.ActivityImpl#getOwnedActivityNodes <em>Owned Activity Node</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityImpl extends CommentableElementImpl implements Activity
{
   /**
    * The cached value of the '{@link #getInParameters() <em>In Parameter</em>}' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getInParameters()
    * @generated
    * @ordered
    */
   protected EList<EParameter> inParameters;

   /**
    * The cached value of the '{@link #getOutParameters() <em>Out Parameter</em>}' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getOutParameters()
    * @generated
    * @ordered
    */
   protected EList<EParameter> outParameters;

   /**
    * The cached value of the '{@link #getContainedParameters() <em>Contained Parameters</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getContainedParameters()
    * @generated
    * @ordered
    */
   protected EList<EParameter> containedParameters;

   private static final String ACTIVITY_ANNOTATION_URI = "http://ns.storydriven.org/sdm/activities/activity";

   /**
    * The cached value of the '{@link #getOwnedActivityEdges() <em>Owned Activity Edge</em>}' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #getOwnedActivityEdges()
    * @generated
    * @ordered
    */
   protected EList<ActivityEdge> ownedActivityEdges;

   /**
    * The cached value of the '{@link #getPrecondition() <em>Precondition</em>}' reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #getPrecondition()
    * @generated
    * @ordered
    */
   protected MatchingStoryNode precondition;

   /**
    * The cached value of the '{@link #getOwnedActivityNodes() <em>Owned Activity Node</em>}' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #getOwnedActivityNodes()
    * @generated
    * @ordered
    */
   protected EList<ActivityNode> ownedActivityNodes;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   protected ActivityImpl ()
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
      return ActivitiesPackage.Literals.ACTIVITY;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<EParameter> getContainedParameters ()
   {
      if (containedParameters == null)
      {
         containedParameters = new EObjectContainmentEList.Resolving<EParameter>(EParameter.class, this,
            ActivitiesPackage.ACTIVITY__CONTAINED_PARAMETERS);
      }
      return containedParameters;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<EParameter> getInParameters ()
   {
      if (inParameters == null)
      {
         inParameters = new EObjectResolvingEList<EParameter>(EParameter.class, this,
            ActivitiesPackage.ACTIVITY__IN_PARAMETER);
      }
      return inParameters;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<EParameter> getOutParameters ()
   {
      if (outParameters == null)
      {
         outParameters = new EObjectResolvingEList<EParameter>(EParameter.class, this,
            ActivitiesPackage.ACTIVITY__OUT_PARAMETER);
      }
      return outParameters;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public OperationExtension getOwningOperation ()
   {
      if (eContainerFeatureID() != ActivitiesPackage.ACTIVITY__OWNING_OPERATION)
         return null;
      return (OperationExtension) eContainer();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public EOperation basicGetOwningOperation ()
   {
      EAnnotation annotation = getOwningOperationAnnotation();
      if (annotation != null)
      {
         EModelElement modelElement = annotation.getEModelElement();
         if (modelElement instanceof EOperation)
         {
            return (EOperation) modelElement;
         }
      }
      return null;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetOwningOperation (OperationExtension newOwningOperation, NotificationChain msgs)
   {
      msgs = eBasicSetContainer((InternalEObject) newOwningOperation, ActivitiesPackage.ACTIVITY__OWNING_OPERATION,
         msgs);
      return msgs;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public void setOwningOperation (OperationExtension newOwningOperation)
   {
      if (newOwningOperation != eInternalContainer()
         || (eContainerFeatureID() != ActivitiesPackage.ACTIVITY__OWNING_OPERATION && newOwningOperation != null))
      {
         if (EcoreUtil.isAncestor(this, newOwningOperation))
            throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
         NotificationChain msgs = null;
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         if (newOwningOperation != null)
            msgs = ((InternalEObject) newOwningOperation).eInverseAdd(this,
               ActivitiesPackage.OPERATION_EXTENSION__OWNED_ACTIVITY, OperationExtension.class, msgs);
         msgs = basicSetOwningOperation(newOwningOperation, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ActivitiesPackage.ACTIVITY__OWNING_OPERATION,
            newOwningOperation, newOwningOperation));
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public MatchingStoryNode getPrecondition ()
   {
      if (precondition != null && precondition.eIsProxy())
      {
         InternalEObject oldPrecondition = (InternalEObject) precondition;
         precondition = (MatchingStoryNode) eResolveProxy(oldPrecondition);
         if (precondition != oldPrecondition)
         {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivitiesPackage.ACTIVITY__PRECONDITION,
                  oldPrecondition, precondition));
         }
      }
      return precondition;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public MatchingStoryNode basicGetPrecondition ()
   {
      return precondition;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public void setPrecondition (MatchingStoryNode newPrecondition)
   {
      MatchingStoryNode oldPrecondition = precondition;
      precondition = newPrecondition;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ActivitiesPackage.ACTIVITY__PRECONDITION,
            oldPrecondition, precondition));
   }

   protected EAnnotation getOwningOperationAnnotation ()
   {
      if (eContainmentFeature() == EcorePackage.Literals.EANNOTATION__CONTENTS)
      {
         EAnnotation annotation = (EAnnotation) eContainer();
         if (ACTIVITY_ANNOTATION_URI.equals(annotation.getSource()))
         {
            return annotation;
         }
      }
      return null;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EList<ActivityNode> getOwnedActivityNodes ()
   {
      if (ownedActivityNodes == null)
      {
         ownedActivityNodes = new EObjectContainmentWithInverseEList.Resolving<ActivityNode>(ActivityNode.class, this,
            ActivitiesPackage.ACTIVITY__OWNED_ACTIVITY_NODE, ActivitiesPackage.ACTIVITY_NODE__OWNING_ACTIVITY);
      }
      return ownedActivityNodes;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EList<ActivityEdge> getOwnedActivityEdges ()
   {
      if (ownedActivityEdges == null)
      {
         ownedActivityEdges = new EObjectContainmentWithInverseEList.Resolving<ActivityEdge>(ActivityEdge.class, this,
            ActivitiesPackage.ACTIVITY__OWNED_ACTIVITY_EDGE, ActivitiesPackage.ACTIVITY_EDGE__OWNING_ACTIVITY);
      }
      return ownedActivityEdges;
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
         case ActivitiesPackage.ACTIVITY__OWNING_OPERATION:
            if (eInternalContainer() != null)
               msgs = eBasicRemoveFromContainer(msgs);
            return basicSetOwningOperation((OperationExtension) otherEnd, msgs);
         case ActivitiesPackage.ACTIVITY__OWNED_ACTIVITY_EDGE:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getOwnedActivityEdges()).basicAdd(otherEnd,
               msgs);
         case ActivitiesPackage.ACTIVITY__OWNED_ACTIVITY_NODE:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getOwnedActivityNodes()).basicAdd(otherEnd,
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
         case ActivitiesPackage.ACTIVITY__CONTAINED_PARAMETERS:
            return ((InternalEList<?>) getContainedParameters()).basicRemove(otherEnd, msgs);
         case ActivitiesPackage.ACTIVITY__OWNING_OPERATION:
            return basicSetOwningOperation(null, msgs);
         case ActivitiesPackage.ACTIVITY__OWNED_ACTIVITY_EDGE:
            return ((InternalEList<?>) getOwnedActivityEdges()).basicRemove(otherEnd, msgs);
         case ActivitiesPackage.ACTIVITY__OWNED_ACTIVITY_NODE:
            return ((InternalEList<?>) getOwnedActivityNodes()).basicRemove(otherEnd, msgs);
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
         case ActivitiesPackage.ACTIVITY__OWNING_OPERATION:
            return eInternalContainer().eInverseRemove(this, ActivitiesPackage.OPERATION_EXTENSION__OWNED_ACTIVITY,
               OperationExtension.class, msgs);
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
         case ActivitiesPackage.ACTIVITY__IN_PARAMETER:
            return getInParameters();
         case ActivitiesPackage.ACTIVITY__OUT_PARAMETER:
            return getOutParameters();
         case ActivitiesPackage.ACTIVITY__CONTAINED_PARAMETERS:
            return getContainedParameters();
         case ActivitiesPackage.ACTIVITY__OWNING_OPERATION:
            if (resolve)
               return getOwningOperation();
            return basicGetOwningOperation();
         case ActivitiesPackage.ACTIVITY__OWNED_ACTIVITY_EDGE:
            return getOwnedActivityEdges();
         case ActivitiesPackage.ACTIVITY__PRECONDITION:
            if (resolve)
               return getPrecondition();
            return basicGetPrecondition();
         case ActivitiesPackage.ACTIVITY__OWNED_ACTIVITY_NODE:
            return getOwnedActivityNodes();
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
         case ActivitiesPackage.ACTIVITY__IN_PARAMETER:
            getInParameters().clear();
            getInParameters().addAll((Collection<? extends EParameter>) newValue);
            return;
         case ActivitiesPackage.ACTIVITY__OUT_PARAMETER:
            getOutParameters().clear();
            getOutParameters().addAll((Collection<? extends EParameter>) newValue);
            return;
         case ActivitiesPackage.ACTIVITY__CONTAINED_PARAMETERS:
            getContainedParameters().clear();
            getContainedParameters().addAll((Collection<? extends EParameter>) newValue);
            return;
         case ActivitiesPackage.ACTIVITY__OWNING_OPERATION:
            setOwningOperation((OperationExtension) newValue);
            return;
         case ActivitiesPackage.ACTIVITY__OWNED_ACTIVITY_EDGE:
            getOwnedActivityEdges().clear();
            getOwnedActivityEdges().addAll((Collection<? extends ActivityEdge>) newValue);
            return;
         case ActivitiesPackage.ACTIVITY__PRECONDITION:
            setPrecondition((MatchingStoryNode) newValue);
            return;
         case ActivitiesPackage.ACTIVITY__OWNED_ACTIVITY_NODE:
            getOwnedActivityNodes().clear();
            getOwnedActivityNodes().addAll((Collection<? extends ActivityNode>) newValue);
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
         case ActivitiesPackage.ACTIVITY__IN_PARAMETER:
            getInParameters().clear();
            return;
         case ActivitiesPackage.ACTIVITY__OUT_PARAMETER:
            getOutParameters().clear();
            return;
         case ActivitiesPackage.ACTIVITY__CONTAINED_PARAMETERS:
            getContainedParameters().clear();
            return;
         case ActivitiesPackage.ACTIVITY__OWNING_OPERATION:
            setOwningOperation((OperationExtension) null);
            return;
         case ActivitiesPackage.ACTIVITY__OWNED_ACTIVITY_EDGE:
            getOwnedActivityEdges().clear();
            return;
         case ActivitiesPackage.ACTIVITY__PRECONDITION:
            setPrecondition((MatchingStoryNode) null);
            return;
         case ActivitiesPackage.ACTIVITY__OWNED_ACTIVITY_NODE:
            getOwnedActivityNodes().clear();
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
         case ActivitiesPackage.ACTIVITY__IN_PARAMETER:
            return inParameters != null && !inParameters.isEmpty();
         case ActivitiesPackage.ACTIVITY__OUT_PARAMETER:
            return outParameters != null && !outParameters.isEmpty();
         case ActivitiesPackage.ACTIVITY__CONTAINED_PARAMETERS:
            return containedParameters != null && !containedParameters.isEmpty();
         case ActivitiesPackage.ACTIVITY__OWNING_OPERATION:
            return basicGetOwningOperation() != null;
         case ActivitiesPackage.ACTIVITY__OWNED_ACTIVITY_EDGE:
            return ownedActivityEdges != null && !ownedActivityEdges.isEmpty();
         case ActivitiesPackage.ACTIVITY__PRECONDITION:
            return precondition != null;
         case ActivitiesPackage.ACTIVITY__OWNED_ACTIVITY_NODE:
            return ownedActivityNodes != null && !ownedActivityNodes.isEmpty();
      }
      return super.eIsSet(featureID);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public int eBaseStructuralFeatureID (int derivedFeatureID, Class<?> baseClass)
   {
      if (baseClass == Callable.class)
      {
         switch (derivedFeatureID)
         {
            case ActivitiesPackage.ACTIVITY__IN_PARAMETER:
               return CallsPackage.CALLABLE__IN_PARAMETER;
            case ActivitiesPackage.ACTIVITY__OUT_PARAMETER:
               return CallsPackage.CALLABLE__OUT_PARAMETER;
            case ActivitiesPackage.ACTIVITY__CONTAINED_PARAMETERS:
               return CallsPackage.CALLABLE__CONTAINED_PARAMETERS;
            default:
               return -1;
         }
      }
      return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public int eDerivedStructuralFeatureID (int baseFeatureID, Class<?> baseClass)
   {
      if (baseClass == Callable.class)
      {
         switch (baseFeatureID)
         {
            case CallsPackage.CALLABLE__IN_PARAMETER:
               return ActivitiesPackage.ACTIVITY__IN_PARAMETER;
            case CallsPackage.CALLABLE__OUT_PARAMETER:
               return ActivitiesPackage.ACTIVITY__OUT_PARAMETER;
            case CallsPackage.CALLABLE__CONTAINED_PARAMETERS:
               return ActivitiesPackage.ACTIVITY__CONTAINED_PARAMETERS;
            default:
               return -1;
         }
      }
      return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
   }

} // ActivityImpl
