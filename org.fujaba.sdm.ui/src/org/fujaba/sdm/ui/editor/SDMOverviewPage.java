/**
 * 
 */
package org.fujaba.sdm.ui.editor;

import org.eclipse.swt.layout.GridData;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.fujaba.commons.editor.overviewpage.AbstractOverviewPage;


/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 *
 */
public class SDMOverviewPage extends AbstractOverviewPage
{

   public SDMOverviewPage(SDMEditor editor)
   {
      super(editor);
   }

   /**
    * @see org.fujaba.commons.editor.overviewpage.AbstractOverviewPage#createNestedDiagramsSectionPart(org.eclipse.ui.forms.IManagedForm, org.eclipse.ui.forms.widgets.ScrolledForm, org.eclipse.ui.forms.widgets.FormToolkit)
    */
   @Override
   protected void createNestedDiagramsSectionPart(IManagedForm managedForm, ScrolledForm form, FormToolkit toolkit)
   {
      SDMEditor psEditor = (SDMEditor) this.editor;
      SDMTreeSectionPart sdmSection = new SDMTreeSectionPart(psEditor, managedForm);
      sdmSection.getSection().setLayoutData(new GridData(GridData.FILL_BOTH));
      managedForm.addPart(sdmSection);
      
      managedForm.setInput(psEditor.getPackage().eResource());
   }

}
