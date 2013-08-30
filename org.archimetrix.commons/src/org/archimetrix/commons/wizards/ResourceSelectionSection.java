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
 * Defines a combination of ui elements used in wizards to select a
 * resource from the workspace. The
 * section creates a label, a text field and a dialog. The
 * ResourceSelectionSectionProvider provides
 * helper methods to create ResourceSelectionSections.
 *
 * @author mcp
 */
public class ResourceSelectionSection {
    /**
     * the parent composite of the section.
     */
    private final Composite parent;
    /**
     * text field.
     */
    private Text textField;
    /**
     * selection dialog.
     */
    private ElementTreeSelectionDialog dialog;

    /**
     * the constructor.
     * @param parent
     *            the composite parent
     * @param label
     *            label (string)
     * @param page
     *            wizard page
     * @param dialogDescription
     *            description
     * @param fileExtension
     *            extension
     */
    public ResourceSelectionSection(final Composite parent,
            final String label, final WizardPage page,
            final String dialogDescription, final String fileExtension) {
        this.parent = parent;
        this.dialog = new WorkbenchFileTreeSelectionDialog(
                page.getShell(), label, dialogDescription, fileExtension);
        this.textField = addLabeledResourceSelection(
                parent, label, this.dialog, page);
    }

    /**
     * get parent method.
     * @return parent
     */
    public Composite getParent() {
        return this.parent;
    }

    /**
     * get text method.
     * @return text field
     */
    public Text getTextField() {
        return this.textField;
    }

    /**
     * get dialog method.
     * @return dialog
     */
    public ElementTreeSelectionDialog getDialog() {
        return this.dialog;
    }

    /**
     * @param parent
     *            the composite parent
     * @param label
     *            label (string)
     * @param dialog
     *            dialog
     * @param page
     *            wizard page
     * @return resource full path
     */
    public Text addLabeledResourceSelection(final Composite parent,
            final String label,
            final ElementTreeSelectionDialog dialog,
            final WizardPage page) {
        Label select = new Label(parent, SWT.LEFT);
        select.setText(label + ":");

        final Text input = new Text(parent, SWT.BORDER);
        input.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
        if (page instanceof ModifyListener) {
            input.addModifyListener((ModifyListener) page);
        }

        Button browse = new Button(parent, SWT.PUSH);
        browse.setText(WizardConst.WizardConstants_SELECT_BUTTON_TEXT);
        browse.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(final SelectionEvent e) {
                if (dialog.open() == Window.OK) {
                    IResource resource = (IResource) dialog.getFirstResult();
                    input.setText(resource.getFullPath().toString());
                }
            }
        });

        return input;
    }

}
