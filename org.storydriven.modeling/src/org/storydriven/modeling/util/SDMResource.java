/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.util;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMIResource;

/**
 * <!-- begin-user-doc --> The resource associated with the '<em><b>modeling</b></em>' package. <!-- end-user-doc -->
 * @generated
 */
public interface SDMResource extends XMIResource
{
   /**
    * <!-- begin-user-doc --> The factory for '<em><b>modeling</b></em>' resources. <!-- end-user-doc -->
    * @generated
    */
   public interface Factory extends Resource.Factory
   {
      public static boolean USE_UUIDS_DEFAULT = false;

      /**
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @generated
       */
      public static final Factory INSTANCE = new SDMResourceFactoryImpl();

      boolean useUUIDs ();

   }

   /**
    * <!-- begin-user-doc --> The file extension for '<em><b>modeling</b></em>' resources. <!-- end-user-doc -->
    * @generated
    */
   public static final String FILE_EXTENSION = "sdm";

   /**
    * <!-- begin-user-doc --> The default encoding for '<em><b>modeling</b></em>' resources. <!-- end-user-doc -->
    * @generated
    */
   public static final String DEFAULT_ENCODING = "UTF-8";

} // SDMResource