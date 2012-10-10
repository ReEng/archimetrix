/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.expressions.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.storydriven.modeling.expressions.ExpressionsPackage;
import org.storydriven.modeling.expressions.TextualExpression;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Textual Expression</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.storydriven.modeling.expressions.impl.TextualExpressionImpl#getExpressionText <em>Expression Text</em>}</li>
 *   <li>{@link org.storydriven.modeling.expressions.impl.TextualExpressionImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.storydriven.modeling.expressions.impl.TextualExpressionImpl#getLanguageVersion <em>Language Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TextualExpressionImpl extends ExpressionImpl implements TextualExpression
{
   /**
    * The default value of the '{@link #getExpressionText() <em>Expression Text</em>}' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #getExpressionText()
    * @generated
    * @ordered
    */
   protected static final String EXPRESSION_TEXT_EDEFAULT = null;

   /**
    * The cached value of the '{@link #getExpressionText() <em>Expression Text</em>}' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #getExpressionText()
    * @generated
    * @ordered
    */
   protected String expressionText = EXPRESSION_TEXT_EDEFAULT;

   /**
    * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #getLanguage()
    * @generated
    * @ordered
    */
   protected static final String LANGUAGE_EDEFAULT = null;

   /**
    * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #getLanguage()
    * @generated
    * @ordered
    */
   protected String language = LANGUAGE_EDEFAULT;

   /**
    * The default value of the '{@link #getLanguageVersion() <em>Language Version</em>}' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #getLanguageVersion()
    * @generated
    * @ordered
    */
   protected static final String LANGUAGE_VERSION_EDEFAULT = null;

   /**
    * The cached value of the '{@link #getLanguageVersion() <em>Language Version</em>}' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #getLanguageVersion()
    * @generated
    * @ordered
    */
   protected String languageVersion = LANGUAGE_VERSION_EDEFAULT;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   protected TextualExpressionImpl ()
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
      return ExpressionsPackage.Literals.TEXTUAL_EXPRESSION;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public String getExpressionText ()
   {
      return expressionText;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public void setExpressionText (String newExpressionText)
   {
      String oldExpressionText = expressionText;
      expressionText = newExpressionText;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.TEXTUAL_EXPRESSION__EXPRESSION_TEXT,
            oldExpressionText, expressionText));
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public String getLanguage ()
   {
      return language;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public void setLanguage (String newLanguage)
   {
      String oldLanguage = language;
      language = newLanguage;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.TEXTUAL_EXPRESSION__LANGUAGE,
            oldLanguage, language));
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public String getLanguageVersion ()
   {
      return languageVersion;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public void setLanguageVersion (String newLanguageVersion)
   {
      String oldLanguageVersion = languageVersion;
      languageVersion = newLanguageVersion;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.TEXTUAL_EXPRESSION__LANGUAGE_VERSION,
            oldLanguageVersion, languageVersion));
   }

   @Override
   public EClassifier basicGetType ()
   {
      // TODO how was the type computed again?
      return super.basicGetType();
   }

   @Override
   public EGenericType basicGetGenericType ()
   {
      // TODO how was the type computed again?
      return super.basicGetGenericType();
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
         case ExpressionsPackage.TEXTUAL_EXPRESSION__EXPRESSION_TEXT:
            return getExpressionText();
         case ExpressionsPackage.TEXTUAL_EXPRESSION__LANGUAGE:
            return getLanguage();
         case ExpressionsPackage.TEXTUAL_EXPRESSION__LANGUAGE_VERSION:
            return getLanguageVersion();
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
         case ExpressionsPackage.TEXTUAL_EXPRESSION__EXPRESSION_TEXT:
            setExpressionText((String) newValue);
            return;
         case ExpressionsPackage.TEXTUAL_EXPRESSION__LANGUAGE:
            setLanguage((String) newValue);
            return;
         case ExpressionsPackage.TEXTUAL_EXPRESSION__LANGUAGE_VERSION:
            setLanguageVersion((String) newValue);
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
         case ExpressionsPackage.TEXTUAL_EXPRESSION__EXPRESSION_TEXT:
            setExpressionText(EXPRESSION_TEXT_EDEFAULT);
            return;
         case ExpressionsPackage.TEXTUAL_EXPRESSION__LANGUAGE:
            setLanguage(LANGUAGE_EDEFAULT);
            return;
         case ExpressionsPackage.TEXTUAL_EXPRESSION__LANGUAGE_VERSION:
            setLanguageVersion(LANGUAGE_VERSION_EDEFAULT);
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
         case ExpressionsPackage.TEXTUAL_EXPRESSION__EXPRESSION_TEXT:
            return EXPRESSION_TEXT_EDEFAULT == null ? expressionText != null : !EXPRESSION_TEXT_EDEFAULT
               .equals(expressionText);
         case ExpressionsPackage.TEXTUAL_EXPRESSION__LANGUAGE:
            return LANGUAGE_EDEFAULT == null ? language != null : !LANGUAGE_EDEFAULT.equals(language);
         case ExpressionsPackage.TEXTUAL_EXPRESSION__LANGUAGE_VERSION:
            return LANGUAGE_VERSION_EDEFAULT == null ? languageVersion != null : !LANGUAGE_VERSION_EDEFAULT
               .equals(languageVersion);
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
      result.append(" (expressionText: ");
      result.append(expressionText);
      result.append(", language: ");
      result.append(language);
      result.append(", languageVersion: ");
      result.append(languageVersion);
      result.append(')');
      return result.toString();
   }

} // TextualExpressionImpl
