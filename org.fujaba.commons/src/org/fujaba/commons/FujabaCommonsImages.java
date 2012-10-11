/*
 * The FUJABA ToolSuite for Eclipse project:
 *
 *   FUJABA is the acronym for 'From Uml to Java And Back Again'
 *   and originally aims to provide an environment for round-trip
 *   engineering using UML as visual programming language. During
 *   the last years, the environment has become a base for several
 *   research activities, e.g. distributed software, database
 *   systems, modelling mechanical and electrical systems and
 *   their simulation. Thus, the environment has become a project,
 *   where this source code is part of. Further details are avail-
 *   able via http://www.fujaba.de
 *
 *      Copyright (C) Fujaba Development Group
 *
 *   This library is free software; you can redistribute it and/or
 *   modify it under the terms of the GNU Lesser General Public
 *   License as published by the Free Software Foundation; either
 *   version 2.1 of the License, or (at your option) any later version.
 *
 *   You should have received a copy of the GNU Lesser General Public
 *   License along with this library; if not, write to the Free
 *   Software Foundation, Inc., 59 Temple Place, Suite 330, Boston,
 *   MA 02111-1307, USA or download the license under
 *   http://www.gnu.org/copyleft/lesser.html
 *
 * WARRANTY:
 *
 *   This library is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 *   GNU Lesser General Public License for more details.
 *
 * Contact address:
 *
 *   Fujaba Management Board
 *   Software Engineering Group
 *   University of Paderborn
 *   Warburgerstr. 100
 *   D-33098 Paderborn
 *   Germany
 *
 *   URL  : http://www.fujaba.de
 *   email: info@fujaba.de
 *
 */
package org.fujaba.commons;


import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.osgi.framework.Bundle;


/**
 * An common class for handling of images. 
 * 
 * @author    $Author: travkin $
 * @version   $Revision: 1617 $ $Date: 2008-10-18 16:20:54 +0200 (Sa, 18 Okt 2008) $
 */
public abstract class FujabaCommonsImages
{
   public static final String IMG_CONSOLE_DEFAULT = "icons/console/default.png"; //$NON-NLS-1$

   public static final String IMG_CONSOLE_PAUSE = "icons/console/pause.png"; //$NON-NLS-1$

   public static final String IMG_CONSOLE_ABORT = "icons/console/abort.gif"; //$NON-NLS-1$

   public static final String IMG_CONSOLE_REMOVE = "icons/console/remove.gif"; //$NON-NLS-1$

   public static final String IMG_CONSOLE_REMOVEALL = "icons/console/removeall.gif"; //$NON-NLS-1$
  
   private final static String ETOOL_PATH = "icons/etool/";

   public final static String IMG_DLG_REMOVE_CLASSES_WITHOUT_CONTEXT = ETOOL_PATH
      + "removeClassesWithoutContext.gif";

   public final static String IMG_DLG_REMOVE_CLASSES_WITH_CONTEXT = ETOOL_PATH
      + "removeClassesWithContext.gif";

   public final static String IMG_DLG_ADD_CLASSES_WITHOUT_CONTEXT = ETOOL_PATH
      + "addClassesWithoutContext.gif";

   public final static String IMG_DLG_ADD_CLASSES_WITH_CONTEXT = ETOOL_PATH
      + "addClassesWithContext.gif";

   public final static String IMG_DLG_ADD_AND_REMOVE_CLASSES_16 = ETOOL_PATH
      + "addAndRemoveClasses16.gif";

   // enabled tool icons
   public final static String IMG_ETOOL_ADD_CLASS_16 = ETOOL_PATH
      + "addClass16.gif";

   public final static String IMG_ETOOL_ADD_ATTRIBUTE_16 = ETOOL_PATH
      + "addAttribute16.gif";

   public final static String IMG_ETOOL_ADD_METHOD_16 = ETOOL_PATH
      + "addMethod16.gif";

   public final static String IMG_ETOOL_ADD_PARAMETER_16 = ETOOL_PATH
      + "addParameter16.gif";

   public final static String IMG_ETOOL_ADD_ASSOCIATION_16 = ETOOL_PATH
      + "addAssociation16.gif";

   public final static String IMG_ETOOL_ADD_GENERALIZATION_16 = ETOOL_PATH
      + "addGeneralization16.gif";

   public final static String IMG_ETOOL_EDIT_ASSERTION_16 = "IMG_ETOOL_EDIT_ASSERTION_16";

   public final static String IMG_ETOOL_EDIT_ASSERTION_24 = "IMG_ETOOL_EDIT_ASSERTION_24";

   public final static String IMG_ETOOL_EDIT_COLLABSTAT_16 = "IMG_ETOOL_EDIT_COLLABSTAT_16";

   public final static String IMG_ETOOL_EDIT_COLLABSTAT_24 = "IMG_ETOOL_EDIT_COLLABSTAT_24";

   public final static String IMG_ETOOL_EDIT_CONSTRAINT_16 = "IMG_ETOOL_EDIT_CONSTRAINT_16";

   public final static String IMG_ETOOL_EDIT_CONSTRAINT_24 = "IMG_ETOOL_EDIT_CONSTRAINT_24";

   public final static String IMG_ETOOL_EDIT_LINK_16 = "IMG_ETOOL_EDIT_LINK_16";

   public final static String IMG_ETOOL_EDIT_LINK_24 = "IMG_ETOOL_EDIT_LINK_24";

   public final static String IMG_ETOOL_EDIT_OBJECT_16 = "IMG_ETOOL_EDIT_OBJECT_16";

   public final static String IMG_ETOOL_EDIT_OBJECT_24 = "IMG_ETOOL_EDIT_OBJECT_24";

   public final static String IMG_ETOOL_EDIT_TRANSITION_16 = "IMG_ETOOL_EDIT_TRANSITION_16";

   public final static String IMG_ETOOL_EDIT_TRANSITION_24 = "IMG_ETOOL_EDIT_TRANSITION_24";

   public final static String IMG_ETOOL_EDIT_TEXT_16 = "IMG_ETOOL_EDIT_TEXT_16";

   public final static String IMG_ETOOL_EXPORT_JAVA_SRC_16 = "IMG_ETOOL_EXPORT_JAVA_SRC_16";

   public final static String IMG_ETOOL_NEW_NOP_16 = "IMG_ETOOL_NEW_NOP_16";

   public final static String IMG_ETOOL_NEW_NOP_24 = "IMG_ETOOL_NEW_NOP_24";

   public final static String IMG_ETOOL_NEW_STATE_16 = "IMG_ETOOL_NEW_STATE_16";

   public final static String IMG_ETOOL_NEW_STATE_24 = "IMG_ETOOL_NEW_STATE_24";

   public final static String IMG_ETOOL_NEW_STATEMENT_16 = "IMG_ETOOL_NEW_STATEMENT_16";

   public final static String IMG_ETOOL_NEW_STATEMENT_24 = "IMG_ETOOL_NEW_STATEMENT_24";

   public final static String IMG_ETOOL_NEW_STOP_16 = "IMG_ETOOL_NEW_STOP_16";

   public final static String IMG_ETOOL_NEW_STOP_24 = "IMG_ETOOL_NEW_STOP_24";

   public final static String IMG_ETOOL_NEW_STORY_16 = "IMG_ETOOL_NEW_STORY_16";

   public final static String IMG_ETOOL_NEW_STORY_24 = "IMG_ETOOL_NEW_STORY_24";

   private final static String OBJ_PATH = "icons/obj/";

   public final static String IMG_OBJ_MODEL_16 = OBJ_PATH + "IMG_OBJ_MODEL_16";

   public final static String IMG_OBJ_MODEL_CLOSED_16 = "IMG_OBJ_MODEL_CLOSED_16";

   public final static String IMG_OBJ_CLASS_16 = "IMG_OBJ_CLASS_16";

   public final static String IMG_OBJ_DIAGRAM_16 = OBJ_PATH + "diagram.gif";

   public final static String IMG_OBJ_DIAGRAM_CLASS_16 = OBJ_PATH
      + "diagram_cd.gif";

   public final static String IMG_OBJ_DIAGRAM_ACTIVITY_16 = OBJ_PATH
      + "diagram_ad.gif";

   public final static String IMG_OBJ_DIAGRAM_COLLECTION_16 = OBJ_PATH
      + "collection_folder.gif";

   public final static String IMG_OBJ_FIELD_DEFAULT_16 = "IMG_OBJ_FIELD_DEFAULT_16";

   public final static String IMG_OBJ_FIELD_PRIVATE_16 = "IMG_OBJ_FIELD_PRIVATE_16";

   public final static String IMG_OBJ_FIELD_PROTECTED_16 = "IMG_OBJ_FIELD_PROTECTED_16";

   public final static String IMG_OBJ_FIELD_PUBLIC_16 = "IMG_OBJ_FIELD_PUBLIC_16";

   public final static String IMG_OBJ_METHOD_DEFAULT_16 = "IMG_OBJ_METHOD_DEFAULT_16";

   public final static String IMG_OBJ_METHOD_PRIVATE_16 = "IMG_OBJ_METHOD_PRIVATE_16";

   public final static String IMG_OBJ_METHOD_PROTECTED_16 = "IMG_OBJ_METHOD_PROTECTED_16";

   public final static String IMG_OBJ_METHOD_PUBLIC_16 = "IMG_OBJ_METHOD_PUBLIC_16";

   private final static String VIEW_PATH = "icons/view/";

   public final static String IMG_VIEW_FUJABA_16 = VIEW_PATH
      + "fujaba_icon.png";

   public final static String IMG_VIEW_FUJABA_SOURCE_CODE = VIEW_PATH
      + "edit_source.gif";

   private final static String WIZ_PATH = "icons/wiz/";

   public final static String IMG_WIZ_FUJABA_WIZARD = WIZ_PATH
      + "fujaba_wizard.gif";

   public final static String IMG_WIZ_NEW_MODEL = WIZ_PATH + "newmodel_wiz.gif";

   public final static String IMG_WIZ_NEW_CLASS_DIAGRAM = WIZ_PATH
      + "newclassdiag_wiz.gif";

   public final static String IMG_WIZ_EXPORT_SOURCE_CODE = WIZ_PATH
      + "exportModel_wiz.gif";


   public static Image getImage (String symbolicName)
   {
      return FujabaCommonsPlugin.getDefault().getImageRegistry().get (
         symbolicName);
   }


   /**
    * Helper that shields clients from having to know how the id was computed by
    * getOrCreateDescriptor(String symbolicPluginID, String iconPath) below
    *
    * @param symbolicPluginID
    * @param iconPath
    * @return
    */
   public static Image getImage (String symbolicPluginID, String iconPath)
   {
      if (iconPath == null || iconPath.trim().length() == 0)
      {
         return null;
      }

      return FujabaCommonsImages.getImage (FujabaCommonsImages.computeSymbolicName (symbolicPluginID, iconPath));
   }


   public static ImageDescriptor getDescriptor (String symbolicName)
   {
      return FujabaCommonsPlugin.getDefault().getImageRegistry()
         .getDescriptor (symbolicName);
   }


   public static ImageDescriptor getOrCreateDescriptor (String symbolicPluginID,
                                                        String iconPath)
   {
      if (iconPath == null || iconPath.trim().length() == 0)
      {
         return null;
      }

      String symbolicName = FujabaCommonsImages.computeSymbolicName (
         symbolicPluginID, iconPath);

      if (symbolicPluginID == null || symbolicPluginID.trim().length() == 0)
      {
         symbolicPluginID = FujabaCommonsPlugin.ID;
      }

      ImageDescriptor descriptor = FujabaCommonsImages.getDescriptor (symbolicName);

      if (descriptor == null)
      {
         Bundle bundle = Platform.getBundle (symbolicPluginID);
         descriptor = ImageDescriptor.createFromURL (bundle.getEntry (iconPath));

         if (descriptor != null)
         {
            FujabaCommonsImages.addDescriptor (symbolicName, descriptor);
         }
      }

      return descriptor;
   }


   public static String computeSymbolicName (String symbolicPluginID,
                                             String iconPath)
   {
      if (symbolicPluginID == null || symbolicPluginID.trim().length() == 0
         || FujabaCommonsPlugin.ID.equals (symbolicPluginID))
      {
         return iconPath;
      }
      else
      {
         return symbolicPluginID + "/" + iconPath;
      }
   }


   public static void addImage (String key, Image image)
   {
      FujabaCommonsPlugin.getDefault().getImageRegistry().put (key, image);
   }


   public static void addDescriptor (String key, ImageDescriptor descriptor)
   {
      FujabaCommonsPlugin.getDefault().getImageRegistry().put (key, descriptor);
   }
}
