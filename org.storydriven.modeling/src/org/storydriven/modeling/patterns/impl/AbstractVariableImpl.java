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
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.storydriven.modeling.NamedElement;
import org.storydriven.modeling.SDMPackage;
import org.storydriven.modeling.expressions.Expression;
import org.storydriven.modeling.impl.VariableImpl;
import org.storydriven.modeling.patterns.AbstractLinkVariable;
import org.storydriven.modeling.patterns.AbstractVariable;
import org.storydriven.modeling.patterns.BindingState;
import org.storydriven.modeling.patterns.Constraint;
import org.storydriven.modeling.patterns.PatternsPackage;
import org.storydriven.modeling.patterns.StoryPattern;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Abstract Variable</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.storydriven.modeling.patterns.impl.AbstractVariableImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.storydriven.modeling.patterns.impl.AbstractVariableImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link org.storydriven.modeling.patterns.impl.AbstractVariableImpl#getBindingState <em>Binding State</em>}</li>
 *   <li>{@link org.storydriven.modeling.patterns.impl.AbstractVariableImpl#getBindingExpression <em>Binding Expression</em>}</li>
 *   <li>{@link org.storydriven.modeling.patterns.impl.AbstractVariableImpl#getConstraints <em>Constraint</em>}</li>
 *   <li>{@link org.storydriven.modeling.patterns.impl.AbstractVariableImpl#getIncomingLinks <em>Incoming Link</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractVariableImpl extends VariableImpl implements AbstractVariable
{
   /**
    * The default value of the '{@link #getName() <em>Name</em>}' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #getName()
    * @generated
    * @ordered
    */
   protected static final String NAME_EDEFAULT = null;

   /**
    * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #getName()
    * @generated
    * @ordered
    */
   protected String name = NAME_EDEFAULT;

   /**
    * The default value of the '{@link #getBindingState() <em>Binding State</em>}' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #getBindingState()
    * @generated
    * @ordered
    */
   protected static final BindingState BINDING_STATE_EDEFAULT = BindingState.UNBOUND;

   /**
    * The cached value of the '{@link #getBindingState() <em>Binding State</em>}' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #getBindingState()
    * @generated
    * @ordered
    */
   protected BindingState bindingState = BINDING_STATE_EDEFAULT;

   /**
    * The cached value of the '{@link #getBindingExpression() <em>Binding Expression</em>}' containment reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #getBindingExpression()
    * @generated
    * @ordered
    */
   protected Expression bindingExpression;

   /**
    * The cached value of the '{@link #getConstraints() <em>Constraint</em>}' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #getConstraints()
    * @generated
    * @ordered
    */
   protected EList<Constraint> constraints;

   /**
    * The cached value of the '{@link #getIncomingLinks() <em>Incoming Link</em>}' reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #getIncomingLinks()
    * @generated
    * @ordered
    */
   protected EList<AbstractLinkVariable> incomingLinks;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   protected AbstractVariableImpl ()
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
      return PatternsPackage.Literals.ABSTRACT_VARIABLE;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public String getName ()
   {
      return name;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public void setName (String newName)
   {
      String oldName = name;
      name = newName;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.ABSTRACT_VARIABLE__NAME, oldName, name));
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public StoryPattern getPattern ()
   {
      if (eContainerFeatureID() != PatternsPackage.ABSTRACT_VARIABLE__PATTERN)
         return null;
      return (StoryPattern) eContainer();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public StoryPattern basicGetPattern ()
   {
      if (eContainerFeatureID() != PatternsPackage.ABSTRACT_VARIABLE__PATTERN)
         return null;
      return (StoryPattern) eInternalContainer();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetPattern (StoryPattern newPattern, NotificationChain msgs)
   {
      msgs = eBasicSetContainer((InternalEObject) newPattern, PatternsPackage.ABSTRACT_VARIABLE__PATTERN, msgs);
      return msgs;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public void setPattern (StoryPattern newPattern)
   {
      if (newPattern != eInternalContainer()
         || (eContainerFeatureID() != PatternsPackage.ABSTRACT_VARIABLE__PATTERN && newPattern != null))
      {
         if (EcoreUtil.isAncestor(this, newPattern))
            throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
         NotificationChain msgs = null;
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         if (newPattern != null)
            msgs = ((InternalEObject) newPattern).eInverseAdd(this, PatternsPackage.STORY_PATTERN__VARIABLE,
               StoryPattern.class, msgs);
         msgs = basicSetPattern(newPattern, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.ABSTRACT_VARIABLE__PATTERN, newPattern,
            newPattern));
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public BindingState getBindingState ()
   {
      return bindingState;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public void setBindingState (BindingState newBindingState)
   {
      BindingState oldBindingState = bindingState;
      bindingState = newBindingState == null ? BINDING_STATE_EDEFAULT : newBindingState;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.ABSTRACT_VARIABLE__BINDING_STATE,
            oldBindingState, bindingState));
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
               - PatternsPackage.ABSTRACT_VARIABLE__BINDING_EXPRESSION, null, null);
            if (newBindingExpression.eInternalContainer() == null)
            {
               msgs = newBindingExpression.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                  - PatternsPackage.ABSTRACT_VARIABLE__BINDING_EXPRESSION, null, msgs);
            }
            if (msgs != null)
               msgs.dispatch();
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                  PatternsPackage.ABSTRACT_VARIABLE__BINDING_EXPRESSION, oldBindingExpression, bindingExpression));
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
            PatternsPackage.ABSTRACT_VARIABLE__BINDING_EXPRESSION, oldBindingExpression, newBindingExpression);
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
               - PatternsPackage.ABSTRACT_VARIABLE__BINDING_EXPRESSION, null, msgs);
         if (newBindingExpression != null)
            msgs = ((InternalEObject) newBindingExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
               - PatternsPackage.ABSTRACT_VARIABLE__BINDING_EXPRESSION, null, msgs);
         msgs = basicSetBindingExpression(newBindingExpression, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.ABSTRACT_VARIABLE__BINDING_EXPRESSION,
            newBindingExpression, newBindingExpression));
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EList<Constraint> getConstraints ()
   {
      if (constraints == null)
      {
         constraints = new EObjectContainmentWithInverseEList.Resolving<Constraint>(Constraint.class, this,
            PatternsPackage.ABSTRACT_VARIABLE__CONSTRAINT, PatternsPackage.CONSTRAINT__OBJECT_VARIABLE);
      }
      return constraints;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EList<AbstractLinkVariable> getIncomingLinks ()
   {
      if (incomingLinks == null)
      {
         incomingLinks = new EObjectWithInverseResolvingEList<AbstractLinkVariable>(AbstractLinkVariable.class, this,
            PatternsPackage.ABSTRACT_VARIABLE__INCOMING_LINK, PatternsPackage.ABSTRACT_LINK_VARIABLE__TARGET);
      }
      return incomingLinks;
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
         case PatternsPackage.ABSTRACT_VARIABLE__PATTERN:
            if (eInternalContainer() != null)
               msgs = eBasicRemoveFromContainer(msgs);
            return basicSetPattern((StoryPattern) otherEnd, msgs);
         case PatternsPackage.ABSTRACT_VARIABLE__CONSTRAINT:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getConstraints()).basicAdd(otherEnd, msgs);
         case PatternsPackage.ABSTRACT_VARIABLE__INCOMING_LINK:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getIncomingLinks()).basicAdd(otherEnd, msgs);
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
         case PatternsPackage.ABSTRACT_VARIABLE__PATTERN:
            return basicSetPattern(null, msgs);
         case PatternsPackage.ABSTRACT_VARIABLE__BINDING_EXPRESSION:
            return basicSetBindingExpression(null, msgs);
         case PatternsPackage.ABSTRACT_VARIABLE__CONSTRAINT:
            return ((InternalEList<?>) getConstraints()).basicRemove(otherEnd, msgs);
         case PatternsPackage.ABSTRACT_VARIABLE__INCOMING_LINK:
            return ((InternalEList<?>) getIncomingLinks()).basicRemove(otherEnd, msgs);
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
         case PatternsPackage.ABSTRACT_VARIABLE__PATTERN:
            return eInternalContainer().eInverseRemove(this, PatternsPackage.STORY_PATTERN__VARIABLE,
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
         case PatternsPackage.ABSTRACT_VARIABLE__NAME:
            return getName();
         case PatternsPackage.ABSTRACT_VARIABLE__PATTERN:
            if (resolve)
               return getPattern();
            return basicGetPattern();
         case PatternsPackage.ABSTRACT_VARIABLE__BINDING_STATE:
            return getBindingState();
         case PatternsPackage.ABSTRACT_VARIABLE__BINDING_EXPRESSION:
            if (resolve)
               return getBindingExpression();
            return basicGetBindingExpression();
         case PatternsPackage.ABSTRACT_VARIABLE__CONSTRAINT:
            return getConstraints();
         case PatternsPackage.ABSTRACT_VARIABLE__INCOMING_LINK:
            return getIncomingLinks();
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
         case PatternsPackage.ABSTRACT_VARIABLE__NAME:
            setName((String) newValue);
            return;
         case PatternsPackage.ABSTRACT_VARIABLE__PATTERN:
            setPattern((StoryPattern) newValue);
            return;
         case PatternsPackage.ABSTRACT_VARIABLE__BINDING_STATE:
            setBindingState((BindingState) newValue);
            return;
         case PatternsPackage.ABSTRACT_VARIABLE__BINDING_EXPRESSION:
            setBindingExpression((Expression) newValue);
            return;
         case PatternsPackage.ABSTRACT_VARIABLE__CONSTRAINT:
            getConstraints().clear();
            getConstraints().addAll((Collection<? extends Constraint>) newValue);
            return;
         case PatternsPackage.ABSTRACT_VARIABLE__INCOMING_LINK:
            getIncomingLinks().clear();
            getIncomingLinks().addAll((Collection<? extends AbstractLinkVariable>) newValue);
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
         case PatternsPackage.ABSTRACT_VARIABLE__NAME:
            setName(NAME_EDEFAULT);
            return;
         case PatternsPackage.ABSTRACT_VARIABLE__PATTERN:
            setPattern((StoryPattern) null);
            return;
         case PatternsPackage.ABSTRACT_VARIABLE__BINDING_STATE:
            setBindingState(BINDING_STATE_EDEFAULT);
            return;
         case PatternsPackage.ABSTRACT_VARIABLE__BINDING_EXPRESSION:
            setBindingExpression((Expression) null);
            return;
         case PatternsPackage.ABSTRACT_VARIABLE__CONSTRAINT:
            getConstraints().clear();
            return;
         case PatternsPackage.ABSTRACT_VARIABLE__INCOMING_LINK:
            getIncomingLinks().clear();
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
         case PatternsPackage.ABSTRACT_VARIABLE__NAME:
            return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
         case PatternsPackage.ABSTRACT_VARIABLE__PATTERN:
            return basicGetPattern() != null;
         case PatternsPackage.ABSTRACT_VARIABLE__BINDING_STATE:
            return bindingState != BINDING_STATE_EDEFAULT;
         case PatternsPackage.ABSTRACT_VARIABLE__BINDING_EXPRESSION:
            return bindingExpression != null;
         case PatternsPackage.ABSTRACT_VARIABLE__CONSTRAINT:
            return constraints != null && !constraints.isEmpty();
         case PatternsPackage.ABSTRACT_VARIABLE__INCOMING_LINK:
            return incomingLinks != null && !incomingLinks.isEmpty();
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
      if (baseClass == NamedElement.class)
      {
         switch (derivedFeatureID)
         {
            case PatternsPackage.ABSTRACT_VARIABLE__NAME:
               return SDMPackage.NAMED_ELEMENT__NAME;
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
      if (baseClass == NamedElement.class)
      {
         switch (baseFeatureID)
         {
            case SDMPackage.NAMED_ELEMENT__NAME:
               return PatternsPackage.ABSTRACT_VARIABLE__NAME;
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
   @Override
   public String toString ()
   {
      if (eIsProxy())
         return super.toString();

      StringBuffer result = new StringBuffer(super.toString());
      result.append(" (name: ");
      result.append(name);
      result.append(", bindingState: ");
      result.append(bindingState);
      result.append(')');
      return result.toString();
   }

   @Override
   public String getVariableName ()
   {
      return getName();
   }

} // AbstractVariableImpl
