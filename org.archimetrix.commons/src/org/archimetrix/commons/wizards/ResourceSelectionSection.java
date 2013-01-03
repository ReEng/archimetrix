package org.archimetrix.commons.wizards;


import org.eclipse.core.resources.IResource;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.fujaba.commons.ui.WorkbenchFileTreeSelectionDialog;


/**
 * Defines a combination of ui elements used in wizards to select a resource from the workspace. The
 * section creates a label, a text field and a dialog. The ResourceSelectionSectionProvider provides
 * helper methods to create ResourceSelectionSections.
 * 
 * @author mcp
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 * 
 */
public class ResourceSelectionSection
{

   private final Composite parent;

   private Text textField;

   private ElementTreeSelectionDialog dialog;


   public ResourceSelectionSection(final Composite parent, final String label, final WizardPage page, final String dialogDescription,
         final String fileExtension)
   {
      this.parent = parent;
      this.dialog = new WorkbenchFileTreeSelectionDialog(page.getShell(), label, dialogDescription, fileExtension);
      this.textField = addLabeledResourceSelection(parent, label, this.dialog, page);
   }


   public Composite getParent()
   {
      return this.parent;
   }


   public Text getTextField()
   {
      return this.textField;
   }


   public ElementTreeSelectionDialog getDialog()
   {
      return this.dialog;
   }


   public Text addLabeledResourceSelection(final Composite parent, final String label, final ElementTreeSelectionDialog dialog,
         final WizardPage page)
   {
      Label select = new Label(parent, SWT.LEFT);
      select.setText(label + ":");

      final Text input = new Text(parent, SWT.BORDER);
      input.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
      if (page instanceof ModifyListener)
      {
         input.addModifyListener((ModifyListener) page);
      }

      Button browse = new Button(parent, SWT.PUSH);
      browse.setText(WizardConstants.SELECT_BUTTON_TEXT);
      browse.addSelectionListener(new SelectionAdapter()
      {
         @Override
         public void widgetSelected(final SelectionEvent e)
         {
            if (dialog.open() == Window.OK)
            {
               IResource resource = (IResource) dialog.getFirstResult();
               input.setText(resource.getFullPath().toString());
            }
         }
      });

      return input;
   }


}
