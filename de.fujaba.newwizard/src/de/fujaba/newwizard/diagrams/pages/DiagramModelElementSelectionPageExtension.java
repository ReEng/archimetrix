package de.fujaba.newwizard.diagrams.pages;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.edit.provider.IWrapperItemProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

import de.fujaba.newwizard.FujabaNewwizardPlugin;
import de.fujaba.newwizard.Messages;
import de.fujaba.newwizard.ui.ModelSelectionPageExtension;

/**
 * A PageExtension for the ModelSelectionPage that allows selecting Diagram
 * Elements.
 * 
 * @author bingo
 * 
 */
public class DiagramModelElementSelectionPageExtension implements
		ModelSelectionPageExtension {

	/**
	 * The top level control for this Page Extension.
	 */
	private Composite plate;

	/**
	 * The currently selected Diagram Element.
	 */
	protected EObject selectedDiagramElement;

	/**
	 * 
	 */
	private TreeViewer modelViewer;

	private DiagramModelSelectionPage wizardPage;

	public DiagramModelElementSelectionPageExtension(
			DiagramModelSelectionPage wizardPage) {
		this.wizardPage = wizardPage;
	}

	public EObject getSelectedDiagramElement() {
		return selectedDiagramElement;
	}

	/**
	 * Create the controls for this Page Extension.
	 */
	@Override
	public void createControl(Composite parent) {
		
		// create the top level control
		plate = new Composite(parent, SWT.NONE);
		plate.setLayoutData(new GridData(GridData.FILL_BOTH));
		GridLayout layout = new GridLayout();
		layout.marginWidth = 0;
		plate.setLayout(layout);

		// create the label
		Label label = new Label(plate, SWT.NONE);
		label.setText(getSelectionTitle());
		label.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING));

		// create the tree viewer
		modelViewer = new TreeViewer(plate, SWT.SINGLE | SWT.H_SCROLL
				| SWT.V_SCROLL | SWT.BORDER);
		GridData layoutData = new GridData(GridData.FILL_BOTH);
		layoutData.heightHint = 300;
		layoutData.widthHint = 300;
		modelViewer.getTree().setLayoutData(layoutData);
		modelViewer.setContentProvider(new AdapterFactoryContentProvider(
				FujabaNewwizardPlugin.getDefault()
						.getItemProvidersAdapterFactory()));
		modelViewer.setLabelProvider(new AdapterFactoryLabelProvider(
				FujabaNewwizardPlugin.getDefault()
						.getItemProvidersAdapterFactory()));
		if (selectedDiagramElement != null) {
			modelViewer.setInput(selectedDiagramElement.eResource());
			modelViewer.setSelection(new StructuredSelection(
					selectedDiagramElement));
		}
		modelViewer
				.addSelectionChangedListener(new ISelectionChangedListener() {
					public void selectionChanged(SelectionChangedEvent event) {
						DiagramModelElementSelectionPageExtension.this
								.onSelectionChanged((IStructuredSelection) event
										.getSelection());
					}
				});

	}

	/**
	 * Enables or disables this Page Extension.
	 * 
	 * @param value
	 *            The enable status to set.
	 */
	public void setEnabled(boolean value) {
		modelViewer.getTree().setEnabled(!value);
	}

	/**
	 * A Handler that will be called by the Page when the selected resource
	 * changed.
	 */
	@Override
	public void setResource(Resource resource) {
		if (resource != null) {
			modelViewer.setInput(resource);
			if (!resource.getContents().isEmpty()) {
				EObject firstElement = resource.getContents().get(0);
				modelViewer.setSelection(new StructuredSelection(firstElement));
			}
		}
	}

	/**
	 * A Handler that will be called by the Tree Viewer, when its selection
	 * status changed.
	 * 
	 * @param selection
	 *            The selected Tree Element.
	 * 
	 */
	protected void onSelectionChanged(IStructuredSelection selection) {
		selectedDiagramElement = null;
		if (selection.size() == 1) {
			Object selectedElement = selection.getFirstElement();
			if (selectedElement instanceof IWrapperItemProvider) {
				selectedElement = ((IWrapperItemProvider) selectedElement)
						.getValue();
			}
			if (selectedElement instanceof FeatureMap.Entry) {
				selectedElement = ((FeatureMap.Entry) selectedElement)
						.getValue();
			}
			if (selectedElement instanceof EObject) {
				selectedDiagramElement = (EObject) selectedElement;
			}
		}
		wizardPage.validatePage();
	}

	/**
	 * Override to provide custom model element description.
	 * 
	 * @generated
	 */
	protected String getSelectionTitle() {
		return Messages.ModelElementSelectionPageMessage;
	}

}
