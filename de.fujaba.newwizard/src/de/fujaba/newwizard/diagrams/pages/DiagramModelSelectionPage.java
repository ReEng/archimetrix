package de.fujaba.newwizard.diagrams.pages;

import java.util.List;
import java.util.Observable;
import java.util.Observer;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import de.fujaba.modelinstance.RootNode;
import de.fujaba.newwizard.Messages;
import de.fujaba.newwizard.diagrams.DiagramElementValidator;
import de.fujaba.newwizard.ui.ExtensibleModelSelectionPage;
import de.fujaba.newwizard.ui.PredefinedModelExtension;
import de.fujaba.newwizard.ui.ResourceLocationProvider;

/**
 * A Wizard Page that allows selecting the Diagram Element within an
 * EMF-Resource. This Wizard Page extends the ExtensibleModelSelectionPage (used
 * by GMF itself).
 * 
 * @author bingo
 * 
 */
public class DiagramModelSelectionPage extends ExtensibleModelSelectionPage {

	/**
	 * Page Extension that shows some predefined models.
	 */
	private PredefinedModelExtension predefinedModelExtension;

	/**
	 * Page Extension that allows the user to select an existing Diagram Element
	 * within the current Resource.
	 */
	private DiagramModelElementSelectionPageExtension diagramModelElementSelectionPageExtension;

	/**
	 * Page Extension that allows the user to select, if a new Diagram Element
	 * should be added.
	 */
	private AddElementPageExtension addElementExtension;

	/**
	 * The DiagramElementValidator that can check, if the current selection is a
	 * valid Diagram Element.
	 */
	private DiagramElementValidator diagramElementValidator;

	/**
	 * Constructs this DiagramModelSelectionPage.
	 * 
	 * @param pageId
	 *            The ID for this Page.
	 * @param rloc
	 *            The location of the current selection.
	 * @param resourceSet
	 *            The ResourceSet that should be used to load Resources. If it
	 *            is null, a new one will be created internally.
	 * @param modelFileExtension
	 *            The File Extension for the Domain Model.
	 * @param diagramElementValidator
	 *            The Validator that can check, if the current selection is a
	 *            valid Diagram Element.
	 */
	public DiagramModelSelectionPage(String pageId,
			ResourceLocationProvider rloc, ResourceSet resourceSet,
			String modelFileExtension,
			DiagramElementValidator diagramElementValidator) {
		super(pageId, rloc, resourceSet, modelFileExtension);
		this.diagramElementValidator = diagramElementValidator;
	}

	/**
	 * Overriden to add all Page Extensions.
	 */
	@Override
	public void addExtensions() {
		List<URI> uris = rloc.getSelectedURIs("fujaba"); //$NON-NLS-1$
		// uris.add(URI
		//				.createURI("platform:/plugin/org.eclipse.emf.ecore/model/Ecore.ecore")); //$NON-NLS-1$
		predefinedModelExtension = new PredefinedModelExtension(this, uris);
		diagramModelElementSelectionPageExtension = new DiagramModelElementSelectionPageExtension(
				this);
		addElementExtension = new AddElementPageExtension();
		addElementExtension.addObserver(new Observer() {

			@Override
			public void update(Observable o, Object arg) {
				boolean status = ((AddElementPageExtension) o)
						.shouldAddElement();
				updatedAddElement(status);
			}

		});

		addExtension("prem", predefinedModelExtension); //$NON-NLS-1$
		addExtension("domainElement", diagramModelElementSelectionPageExtension);
		addExtension("add", addElementExtension); //$NON-NLS-1$
	}

	/**
	 * Handler that will be called, if the status of the
	 * AddElementPageExtension-checkbox changed.
	 * 
	 * @param status
	 *            The current status.
	 */
	protected void updatedAddElement(boolean status) {

		// Make the ModelSelectionPageExtension read only
		diagramModelElementSelectionPageExtension.setEnabled(status);

		validatePage();
	}

	/**
	 * Validates the current state of this Wizard Page and all its extensions.
	 * It calls setPageComplete() and setErrorMessage() to give feedback.
	 */
	@Override
	public void validatePage() {
		// check if a file was selected
		super.validatePage();

		String error = null;
		EObject selectedModelElement = getSelectedDiagramElement();

		if (addElementExtension.shouldAddElement()) {
			boolean rootNodeFound = false;
			List<?> rootElements = getResource().getContents();
			if (!rootElements.isEmpty()) {
				Object rootElement = rootElements.get(0);
				if (rootElement instanceof RootNode) {
					rootNodeFound = true;
				}
			}
			if (!rootNodeFound) {
				error = "Selected file does not contain a valid Fujaba Root Node.";
			}

		} else if (selectedModelElement == null) {
			error = Messages.NewDiagramFileWizard_RootSelectionPageNoSelectionMessage;

		} else if (!diagramElementValidator
				.isValidDiagramElement(selectedModelElement)) {
			error = Messages.NewDiagramFileWizard_RootSelectionPageInvalidSelectionMessage;
		}
		setPageComplete(error == null);
		setErrorMessage(error);
	}

	/**
	 * Returns the currently selected Diagram Element, if any. In case, the user
	 * selected the Root Node, return value will be null.
	 * 
	 * @return The selected Diagram Element, or null if the Root Node was
	 *         selected, or no Element was selected at all.
	 */
	public EObject getSelectedDiagramElement() {
		// Add a new element
		if (!addElementExtension.shouldAddElement()) {

			return diagramModelElementSelectionPageExtension
					.getSelectedDiagramElement();

		}

		return null;
	}

	/**
	 * Handler that will be called whenever the Resource changed.
	 */
	protected void resourceChanged() {
		super.resourceChanged();
		boolean shouldAddElement = false;
		Resource resource = getResource();
		if (!resource.getContents().isEmpty()) {
			EObject firstElement = resource.getContents().get(0);
			if (firstElement instanceof RootNode) {
				shouldAddElement = true;
			}
		}
		addElementExtension.setAddElement(shouldAddElement);
	}
}
