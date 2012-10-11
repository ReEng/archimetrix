/**
 * 
 */
package org.fujaba.commons.extensionpoints;

import org.eclipse.gef.palette.PaletteContainer;
import org.fujaba.commons.extensionpoints.util.IHierachicalExtension;


/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 *
 */
public interface IPaletteContainerExtension extends IHierachicalExtension<IPaletteEntryExtension>
{
   /**
    * Unique id of this extensionpoint.
    */
   public final static String PALETTE_CONTAINER_EXTENSION_POINT_ID = "org.fujaba.commons.paletteContainer";


   /**
    * Creates a new palette container.
    * @return a new palette container
    */
   public PaletteContainer createPaletteContainer();
}
