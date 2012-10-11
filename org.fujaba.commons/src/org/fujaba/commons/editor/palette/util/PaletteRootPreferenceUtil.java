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
package org.fujaba.commons.editor.palette.util;

import org.eclipse.gef.ui.palette.FlyoutPaletteComposite.FlyoutPreferences;
import org.eclipse.jface.preference.IPreferenceStore;
import org.fujaba.commons.FujabaCommonsPlugin;



/**
 * @author    $Author: mm $
 * @version   $Revision: 1096 $ $Date: 2006-08-31 17:36:23 +0200 (Do, 31 Aug 2006) $
 */
public abstract class PaletteRootPreferenceUtil
{
   /**
    * Default palette size.
    */
   private final static int DEFAULT_PALETTE_SIZE = 125;

   /**
    * Preference ID used to persist the palette location.
    */
   private final static String PALETTE_DOCK_LOCATION = "ShapesEditorPaletteFactory.Location";
   /**
    * Preference ID used to persist the palette size.
    */
   private final static String PALETTE_SIZE = "ShapesEditorPaletteFactory.Size";
   /**
    * Preference ID used to persist the flyout palette's state.
    */
   private final static String PALETTE_STATE = "ShapesEditorPaletteFactory.State";


   /**
    * Get the preferenceStore attribute of the AbstractPaletteRoot object
    *
    * @return   The preferenceStore value
    */
   private final static IPreferenceStore getPreferenceStore()
   {
      return FujabaCommonsPlugin.getDefault().getPreferenceStore();
   }


   /**
    * Get the preferences attribute of the AbstractPaletteRoot object
    *
    * @return   The preferences value
    */
   public static FlyoutPreferences getPreferences()
   {
      // set default flyout palette preference values, in case the preference store
      // does not hold stored values for the given preferences
      getPreferenceStore().setDefault (PALETTE_DOCK_LOCATION, -1);
      getPreferenceStore().setDefault (PALETTE_STATE, -1);
      getPreferenceStore().setDefault (PALETTE_SIZE, DEFAULT_PALETTE_SIZE);

      return
         new FlyoutPreferences()
         {
            public int getDockLocation()
            {
               return getPreferenceStore().getInt (PALETTE_DOCK_LOCATION);
            }


            public int getPaletteState()
            {
               return getPreferenceStore().getInt (PALETTE_STATE);
            }


            public int getPaletteWidth()
            {
               return getPreferenceStore().getInt (PALETTE_SIZE);
            }


            public void setDockLocation (int location)
            {
               getPreferenceStore().setValue (PALETTE_DOCK_LOCATION, location);
            }


            public void setPaletteState (int state)
            {
               getPreferenceStore().setValue (PALETTE_STATE, state);
            }


            public void setPaletteWidth (int width)
            {
               getPreferenceStore().setValue (PALETTE_SIZE, width);
            }
         };
   }
}
