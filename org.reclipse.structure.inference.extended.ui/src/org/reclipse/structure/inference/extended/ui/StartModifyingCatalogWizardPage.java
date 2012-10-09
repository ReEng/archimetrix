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
      setTitle("Structural Pattern Detection on Architectures");
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
