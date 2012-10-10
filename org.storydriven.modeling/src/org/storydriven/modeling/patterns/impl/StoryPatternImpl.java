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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.storydriven.modeling.impl.CommentableElementImpl;
import org.storydriven.modeling.patterns.AbstractLinkVariable;
import org.storydriven.modeling.patterns.AbstractVariable;
import org.storydriven.modeling.patterns.BindingSemantics;
import org.storydriven.modeling.patterns.Constraint;
import org.storydriven.modeling.patterns.PatternsPackage;
import org.storydriven.modeling.patterns.StoryPattern;
import org.storydriven.modeling.templates.TemplateSignature;
import org.storydriven.modeling.templates.TemplatesPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Story Pattern</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.storydriven.modeling.patterns.impl.StoryPatternImpl#getVariables <em>Variable</em>}</li>
 *   <li>{@link org.storydriven.modeling.patterns.impl.StoryPatternImpl#getConstraints <em>Constraint</em>}</li>
 *   <li>{@link org.storydriven.modeling.patterns.impl.StoryPatternImpl#getLinkVariables <em>Link Variable</em>}</li>
 *   <li>{@link org.storydriven.modeling.patterns.impl.StoryPatternImpl#getParentPattern <em>Parent Pattern</em>}</li>
 *   <li>{@link org.storydriven.modeling.patterns.impl.StoryPatternImpl#getContainedPatterns <em>Contained Pattern</em>}</li>
 *   <li>{@link org.storydriven.modeling.patterns.impl.StoryPatternImpl#getBindingSemantics <em>Binding Semantics</em>}</li>
 *   <li>{@link org.storydriven.modeling.patterns.impl.StoryPatternImpl#getTemplateSignature <em>Template Signature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StoryPatternImpl extends CommentableElementImpl implements StoryPattern
{
   /**
    * The cached value of the '{@link #getVariables() <em>Variable</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getVariables()
    * @generated
    * @ordered
    */
   protected EList<AbstractVariable> variables;

   /**
    * The cached value of the '{@link #getConstraints() <em>Constraint</em>}' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #getConstraints()
    * @generated
    * @ordered
    */
   protected EList<Constraint> constraints;

   /**
    * The cached value of the '{@link #getLinkVariables() <em>Link Variable</em>}' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #getLinkVariables()
    * @generated
    * @ordered
    */
   protected EList<AbstractLinkVariable> linkVariables;

   /**
    * The cached value of the '{@link #getContainedPatterns() <em>Contained Pattern</em>}' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #getContainedPatterns()
    * @generated
    * @ordered
    */
   protected EList<StoryPattern> containedPatterns;

   /**
    * The default value of the '{@link #getBindingSemantics() <em>Binding Semantics</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getBindingSemantics()
    * @generated
    * @ordered
    */
   protected static final BindingSemantics BINDING_SEMANTICS_EDEFAULT = BindingSemantics.MANDATORY;

   /**
    * The cached value of the '{@link #getBindingSemantics() <em>Binding Semantics</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getBindingSemantics()
    * @generated
    * @ordered
    */
   protected BindingSemantics bindingSemantics = BINDING_SEMANTICS_EDEFAULT;

   /**
    * The cached value of the '{@link #getTemplateSignature() <em>Template Signature</em>}' containment reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #getTemplateSignature()
    * @generated
    * @ordered
    */
   protected TemplateSignature templateSignature;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   protected StoryPatternImpl ()
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
      return PatternsPackage.Literals.STORY_PATTERN;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<AbstractVariable> getVariables ()
   {
      if (variables == null)
      {
         variables = new EObjectContainmentWithInverseEList.Resolving<AbstractVariable>(AbstractVariable.class, this,
            PatternsPackage.STORY_PATTERN__VARIABLE, PatternsPackage.ABSTRACT_VARIABLE__PATTERN);
      }
      return variables;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EList<AbstractLinkVariable> getLinkVariables ()
   {
      if (linkVariables == null)
      {
         linkVariables = new EObjectContainmentWithInverseEList.Resolving<AbstractLinkVariable>(
            AbstractLinkVariable.class, this, PatternsPackage.STORY_PATTERN__LINK_VARIABLE,
            PatternsPackage.ABSTRACT_LINK_VARIABLE__PATTERN);
      }
      return linkVariables;
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
            PatternsPackage.STORY_PATTERN__CONSTRAINT, PatternsPackage.CONSTRAINT__PATTERN);
      }
      return constraints;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public StoryPattern getParentPattern ()
   {
      if (eContainerFeatureID() != PatternsPackage.STORY_PATTERN__PARENT_PATTERN)
         return null;
      return (StoryPattern) eContainer();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public StoryPattern basicGetParentPattern ()
   {
      if (eContainerFeatureID() != PatternsPackage.STORY_PATTERN__PARENT_PATTERN)
         return null;
      return (StoryPattern) eInternalContainer();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetParentPattern (StoryPattern newParentPattern, NotificationChain msgs)
   {
      msgs = eBasicSetContainer((InternalEObject) newParentPattern, PatternsPackage.STORY_PATTERN__PARENT_PATTERN, msgs);
      return msgs;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public void setParentPattern (StoryPattern newParentPattern)
   {
      if (newParentPattern != eInternalContainer()
         || (eContainerFeatureID() != PatternsPackage.STORY_PATTERN__PARENT_PATTERN && newParentPattern != null))
      {
         if (EcoreUtil.isAncestor(this, newParentPattern))
            throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
         NotificationChain msgs = null;
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         if (newParentPattern != null)
            msgs = ((InternalEObject) newParentPattern).eInverseAdd(this,
               PatternsPackage.STORY_PATTERN__CONTAINED_PATTERN, StoryPattern.class, msgs);
         msgs = basicSetParentPattern(newParentPattern, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.STORY_PATTERN__PARENT_PATTERN,
            newParentPattern, newParentPattern));
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EList<StoryPattern> getContainedPatterns ()
   {
      if (containedPatterns == null)
      {
         containedPatterns = new EObjectContainmentWithInverseEList.Resolving<StoryPattern>(StoryPattern.class, this,
            PatternsPackage.STORY_PATTERN__CONTAINED_PATTERN, PatternsPackage.STORY_PATTERN__PARENT_PATTERN);
      }
      return containedPatterns;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public BindingSemantics getBindingSemantics ()
   {
      return bindingSemantics;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setBindingSemantics (BindingSemantics newBindingSemantics)
   {
      BindingSemantics oldBindingSemantics = bindingSemantics;
      bindingSemantics = newBindingSemantics == null ? BINDING_SEMANTICS_EDEFAULT : newBindingSemantics;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.STORY_PATTERN__BINDING_SEMANTICS,
            oldBindingSemantics, bindingSemantics));
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public TemplateSignature getTemplateSignature ()
   {
      if (templateSignature != null && templateSignature.eIsProxy())
      {
         InternalEObject oldTemplateSignature = (InternalEObject) templateSignature;
         templateSignature = (TemplateSignature) eResolveProxy(oldTemplateSignature);
         if (templateSignature != oldTemplateSignature)
         {
            InternalEObject newTemplateSignature = (InternalEObject) templateSignature;
            NotificationChain msgs = oldTemplateSignature.eInverseRemove(this,
               TemplatesPackage.TEMPLATE_SIGNATURE__PATTERN, TemplateSignature.class, null);
            if (newTemplateSignature.eInternalContainer() == null)
            {
               msgs = newTemplateSignature.eInverseAdd(this, TemplatesPackage.TEMPLATE_SIGNATURE__PATTERN,
                  TemplateSignature.class, msgs);
            }
            if (msgs != null)
               msgs.dispatch();
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                  PatternsPackage.STORY_PATTERN__TEMPLATE_SIGNATURE, oldTemplateSignature, templateSignature));
         }
      }
      return templateSignature;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public TemplateSignature basicGetTemplateSignature ()
   {
      return templateSignature;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetTemplateSignature (TemplateSignature newTemplateSignature, NotificationChain msgs)
   {
      TemplateSignature oldTemplateSignature = templateSignature;
      templateSignature = newTemplateSignature;
      if (eNotificationRequired())
      {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
            PatternsPackage.STORY_PATTERN__TEMPLATE_SIGNATURE, oldTemplateSignature, newTemplateSignature);
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
   public void setTemplateSignature (TemplateSignature newTemplateSignature)
   {
      if (newTemplateSignature != templateSignature)
      {
         NotificationChain msgs = null;
         if (templateSignature != null)
            msgs = ((InternalEObject) templateSignature).eInverseRemove(this,
               TemplatesPackage.TEMPLATE_SIGNATURE__PATTERN, TemplateSignature.class, msgs);
         if (newTemplateSignature != null)
            msgs = ((InternalEObject) newTemplateSignature).eInverseAdd(this,
               TemplatesPackage.TEMPLATE_SIGNATURE__PATTERN, TemplateSignature.class, msgs);
         msgs = basicSetTemplateSignature(newTemplateSignature, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.STORY_PATTERN__TEMPLATE_SIGNATURE,
            newTemplateSignature, newTemplateSignature));
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
         case PatternsPackage.STORY_PATTERN__VARIABLE:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getVariables()).basicAdd(otherEnd, msgs);
         case PatternsPackage.STORY_PATTERN__CONSTRAINT:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getConstraints()).basicAdd(otherEnd, msgs);
         case PatternsPackage.STORY_PATTERN__LINK_VARIABLE:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getLinkVariables()).basicAdd(otherEnd, msgs);
         case PatternsPackage.STORY_PATTERN__PARENT_PATTERN:
            if (eInternalContainer() != null)
               msgs = eBasicRemoveFromContainer(msgs);
            return basicSetParentPattern((StoryPattern) otherEnd, msgs);
         case PatternsPackage.STORY_PATTERN__CONTAINED_PATTERN:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getContainedPatterns())
               .basicAdd(otherEnd, msgs);
         case PatternsPackage.STORY_PATTERN__TEMPLATE_SIGNATURE:
            if (templateSignature != null)
               msgs = ((InternalEObject) templateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                  - PatternsPackage.STORY_PATTERN__TEMPLATE_SIGNATURE, null, msgs);
            return basicSetTemplateSignature((TemplateSignature) otherEnd, msgs);
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
         case PatternsPackage.STORY_PATTERN__VARIABLE:
            return ((InternalEList<?>) getVariables()).basicRemove(otherEnd, msgs);
         case PatternsPackage.STORY_PATTERN__CONSTRAINT:
            return ((InternalEList<?>) getConstraints()).basicRemove(otherEnd, msgs);
         case PatternsPackage.STORY_PATTERN__LINK_VARIABLE:
            return ((InternalEList<?>) getLinkVariables()).basicRemove(otherEnd, msgs);
         case PatternsPackage.STORY_PATTERN__PARENT_PATTERN:
            return basicSetParentPattern(null, msgs);
         case PatternsPackage.STORY_PATTERN__CONTAINED_PATTERN:
            return ((InternalEList<?>) getContainedPatterns()).basicRemove(otherEnd, msgs);
         case PatternsPackage.STORY_PATTERN__TEMPLATE_SIGNATURE:
            return basicSetTemplateSignature(null, msgs);
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
         case PatternsPackage.STORY_PATTERN__PARENT_PATTERN:
            return eInternalContainer().eInverseRemove(this, PatternsPackage.STORY_PATTERN__CONTAINED_PATTERN,
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
         case PatternsPackage.STORY_PATTERN__VARIABLE:
            return getVariables();
         case PatternsPackage.STORY_PATTERN__CONSTRAINT:
            return getConstraints();
         case PatternsPackage.STORY_PATTERN__LINK_VARIABLE:
            return getLinkVariables();
         case PatternsPackage.STORY_PATTERN__PARENT_PATTERN:
            if (resolve)
               return getParentPattern();
            return basicGetParentPattern();
         case PatternsPackage.STORY_PATTERN__CONTAINED_PATTERN:
            return getContainedPatterns();
         case PatternsPackage.STORY_PATTERN__BINDING_SEMANTICS:
            return getBindingSemantics();
         case PatternsPackage.STORY_PATTERN__TEMPLATE_SIGNATURE:
            if (resolve)
               return getTemplateSignature();
            return basicGetTemplateSignature();
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
         case PatternsPackage.STORY_PATTERN__VARIABLE:
            getVariables().clear();
            getVariables().addAll((Collection<? extends AbstractVariable>) newValue);
            return;
         case PatternsPackage.STORY_PATTERN__CONSTRAINT:
            getConstraints().clear();
            getConstraints().addAll((Collection<? extends Constraint>) newValue);
            return;
         case PatternsPackage.STORY_PATTERN__LINK_VARIABLE:
            getLinkVariables().clear();
            getLinkVariables().addAll((Collection<? extends AbstractLinkVariable>) newValue);
            return;
         case PatternsPackage.STORY_PATTERN__PARENT_PATTERN:
            setParentPattern((StoryPattern) newValue);
            return;
         case PatternsPackage.STORY_PATTERN__CONTAINED_PATTERN:
            getContainedPatterns().clear();
            getContainedPatterns().addAll((Collection<? extends StoryPattern>) newValue);
            return;
         case PatternsPackage.STORY_PATTERN__BINDING_SEMANTICS:
            setBindingSemantics((BindingSemantics) newValue);
            return;
         case PatternsPackage.STORY_PATTERN__TEMPLATE_SIGNATURE:
            setTemplateSignature((TemplateSignature) newValue);
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
         case PatternsPackage.STORY_PATTERN__VARIABLE:
            getVariables().clear();
            return;
         case PatternsPackage.STORY_PATTERN__CONSTRAINT:
            getConstraints().clear();
            return;
         case PatternsPackage.STORY_PATTERN__LINK_VARIABLE:
            getLinkVariables().clear();
            return;
         case PatternsPackage.STORY_PATTERN__PARENT_PATTERN:
            setParentPattern((StoryPattern) null);
            return;
         case PatternsPackage.STORY_PATTERN__CONTAINED_PATTERN:
            getContainedPatterns().clear();
            return;
         case PatternsPackage.STORY_PATTERN__BINDING_SEMANTICS:
            setBindingSemantics(BINDING_SEMANTICS_EDEFAULT);
            return;
         case PatternsPackage.STORY_PATTERN__TEMPLATE_SIGNATURE:
            setTemplateSignature((TemplateSignature) null);
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
         case PatternsPackage.STORY_PATTERN__VARIABLE:
            return variables != null && !variables.isEmpty();
         case PatternsPackage.STORY_PATTERN__CONSTRAINT:
            return constraints != null && !constraints.isEmpty();
         case PatternsPackage.STORY_PATTERN__LINK_VARIABLE:
            return linkVariables != null && !linkVariables.isEmpty();
         case PatternsPackage.STORY_PATTERN__PARENT_PATTERN:
            return basicGetParentPattern() != null;
         case PatternsPackage.STORY_PATTERN__CONTAINED_PATTERN:
            return containedPatterns != null && !containedPatterns.isEmpty();
         case PatternsPackage.STORY_PATTERN__BINDING_SEMANTICS:
            return bindingSemantics != BINDING_SEMANTICS_EDEFAULT;
         case PatternsPackage.STORY_PATTERN__TEMPLATE_SIGNATURE:
            return templateSignature != null;
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
      result.append(')');
      return result.toString();
   }

} // StoryPatternImpl
