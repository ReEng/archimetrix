/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.impl;

import org.eclipse.emf.ecore.EClass;
import org.storydriven.modeling.SDMPackage;
import org.storydriven.modeling.Variable;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Variable</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.storydriven.modeling.impl.VariableImpl#getVariableName <em>Variable Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class VariableImpl extends TypedElementImpl implements Variable
{
   /**
    * The default value of the '{@link #getVariableName() <em>Variable Name</em>}' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #getVariableName()
    * @generated
    * @ordered
    */
   protected static final String VARIABLE_NAME_EDEFAULT = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   protected VariableImpl ()
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
      return SDMPackage.Literals.VARIABLE;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated NOT
    */
   public abstract String getVariableName ();

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object eGet (int featureID, boolean resolve, boolean coreType)
   {
      switch (featureID)
      {
         case SDMPackage.VARIABLE__VARIABLE_NAME:
            return getVariableName();
      }
      return super.eGet(featureID, resolve, coreType);
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
         case SDMPackage.VARIABLE__VARIABLE_NAME:
            return VARIABLE_NAME_EDEFAULT == null ? getVariableName() != null : !VARIABLE_NAME_EDEFAULT
               .equals(getVariableName());
      }
      return super.eIsSet(featureID);
   }

} // VariableImpl
