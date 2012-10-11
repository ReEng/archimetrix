/**
 * 
 */
package org.fujaba.commons.editor.overviewpage;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormPage;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.fujaba.commons.editor.AbstractMultiPageEditor;


/**
 * Basic implementation of the overview page, which can be used by a multi page editor
 * to navigate through the diagrams of a model and to create or delete them.
 * 
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 *
 */
public abstract class AbstractOverviewPage extends FormPage
{
   private final static String TITLE = "Overview";
   private final static String ID = "MultiPageOverview";
   protected AbstractMultiPageEditor editor;

   public AbstractOverviewPage(AbstractMultiPageEditor editor)
   {
      super(editor, ID, TITLE);
      this.editor = editor;
   }

   
   /**
    * @see org.eclipse.ui.forms.editor.FormPage#createFormContent(org.eclipse.ui.forms.IManagedForm)
    */
   @Override
   protected void createFormContent(IManagedForm managedForm)
   {
      final ScrolledForm form = managedForm.getForm();
      FormToolkit toolkit = managedForm.getToolkit();
      form.setText(TITLE);

      GridLayout layout = new GridLayout(1, true);
      form.getBody().setLayout(layout);

      NameSectionPart nameSectionPart = new NameSectionPart(editor, form
            .getBody(), toolkit);
      nameSectionPart.getSection().setLayoutData(
            new GridData(GridData.FILL_HORIZONTAL));
      managedForm.addPart(nameSectionPart);
      
      createNestedDiagramsSectionPart(managedForm, form, toolkit);
   }


   /**
    * Callback method that creates the section part for the listing of diagrams to display. 
    * Implement this method and create an instance of NestedDiagramsSectionPart within and add it
    * to the managed form.
    * 
    * @param managedForm
    * @param form
    * @param toolkit
    */
   protected abstract void createNestedDiagramsSectionPart(IManagedForm managedForm,
         final ScrolledForm form, FormToolkit toolkit);
}
