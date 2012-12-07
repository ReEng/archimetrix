/**
 * 
 */
package org.reclipse.structure.inference.extended.ui;

import org.reclipse.structure.inference.ui.wizards.StartInferenceWizardPage;

/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 *
 */
public class StartModifyingCatalogWizardPage extends StartInferenceWizardPage
{

   protected StartModifyingCatalogWizardPage(String name)
   {
      super(name);
      setTitle("Design Deficiency Detection");
   }

   @Override
   public boolean canFlipToNextPage()
   {
      return isPageComplete();
   }

   @Override
   protected String getHostGraphFileExt()
   {
      return "sourcecodedecorator";
   }

}
