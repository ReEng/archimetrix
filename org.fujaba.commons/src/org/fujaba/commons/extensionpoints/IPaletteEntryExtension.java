/**
 * 
 */
package org.fujaba.commons.extensionpoints;

import org.eclipse.gef.palette.PaletteEntry;

/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 *
 */
public interface IPaletteEntryExtension
{
   /**
    * Unique id of this extensionpoint.
    */
   public final static String PALETTE_ENTRY_EXTENSION_POINT_ID = "org.fujaba.commons.paletteEntries";


   /**
    * Creates a new palette entry.
    * @return a new palette entry
    */
   public PaletteEntry createPaletteEntry();
}
