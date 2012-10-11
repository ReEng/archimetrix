/**
 * 
 */
package org.fujaba.commons.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;
import org.fujaba.commons.FujabaCommonsPlugin;


/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 *
 */
public class CommonPreferenceInitializer extends AbstractPreferenceInitializer
{
   
   /**
    * Default palette size.
    */
   private final static int DEFAULT_PALETTE_SIZE = 125;

   /**
    * Preference ID used to persist the palette location.
    */
   private final static String PALETTE_DOCK_LOCATION = "EditorPaletteFactory.Location";
   /**
    * Preference ID used to persist the palette size.
    */
   private final static String PALETTE_SIZE = "EditorPaletteFactory.Size";
   /**
    * Preference ID used to persist the flyout palette's state.
    */
   private final static String PALETTE_STATE = "EditorPaletteFactory.State";

   /**
    * @see org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer#initializeDefaultPreferences()
    */
   @Override
   public void initializeDefaultPreferences()
   {
      // set default flyout palette preference values, in case the preference store
      // does not hold stored values for the given preferences
      getPreferenceStore().setDefault (PALETTE_DOCK_LOCATION, -1);
      getPreferenceStore().setDefault (PALETTE_STATE, -1);
      getPreferenceStore().setDefault (PALETTE_SIZE, DEFAULT_PALETTE_SIZE);

   }
   
   private IPreferenceStore getPreferenceStore()
   {
      return FujabaCommonsPlugin.getDefault().getPreferenceStore();
   }

}
