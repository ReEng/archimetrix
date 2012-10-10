package de.fujaba.newwizard.diagrams;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.OperationHistoryFactory;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateDiagramViewOperation;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.storydriven.modeling.ExtendableElement;

import de.fujaba.modelinstance.ModelElementCategory;
import de.fujaba.modelinstance.ModelinstanceFactory;
import de.fujaba.modelinstance.RootNode;
import de.fujaba.newwizard.FujabaNewwizardPlugin;
import de.fujaba.newwizard.Messages;
import de.fujaba.newwizard.diagrams.pages.DiagramModelSelectionPage;
import de.fujaba.newwizard.diagrams.pages.NewExtendedFileCreationPage;
import de.fujaba.newwizard.ui.ResourceLocationProvider;

public abstract class FujabaDiagramNewWizard extends Wizard implements
		INewWizard, DiagramElementValidator {

	/**
	 * @generated
	 */
	private IWorkbench workbench;

	/**
	 * @generated
	 */
	protected IStructuredSelection selection;

	/**
	 * @generated
	 */
	protected NewExtendedFileCreationPage diagramModelFilePage;

	/**
	 * Added to allow selection of an existing domain model file.
	 */
	protected DiagramModelSelectionPage domainModelSelectionPage;

	/**
	 * @generated
	 */
	protected Resource diagram;

	/**
	 * @generated
	 */
	private boolean openNewlyCreatedDiagramEditor = true;

	private TransactionalEditingDomain editingDomain;

	public FujabaDiagramNewWizard() {
		editingDomain = GMFEditingDomainFactory.INSTANCE.createEditingDomain();

	}

	/**
	 * Should return the ID of the generated Editor class.
	 * 
	 * @return the Editor-ID.
	 */
	protected abstract String getEditorId();

	/**
	 * Should return the MODEL_ID of the generated DiagramEditPart.
	 * 
	 * @return The Model-ID.
	 */
	protected abstract String getModelId();

	/**
	 * Should return the DIAGRAM_PREFERENCES_HINT of the generated Editor-Plugin
	 * class.
	 * 
	 * @return the PreferencesHint.
	 */
	protected abstract PreferencesHint getDiagramPreferencesHint();

	/**
	 * Should return the file extension to use in the NewWizard.
	 * 
	 * @return the file extension.
	 */
	protected abstract String getDiagramFileExtension();

	/**
	 * Create a new instance of domain element associated with canvas.
	 */
	// protected abstract EObject createInitialModel();

	/**
	 * Return the Diagram Element, or null if the ModelElementCategory should be
	 * used as the Diagram Element.
	 */
	protected abstract ExtendableElement createDiagramElement();

	protected abstract String getModelElementCategoryKey();

	/**
	 * @generated
	 */
	public IWorkbench getWorkbench() {
		return workbench;
	}

	/**
	 * @generated
	 */
	public IStructuredSelection getSelection() {
		return selection;
	}

	/**
	 * @generated
	 */
	public final Resource getDiagram() {
		return diagram;
	}

	/**
	 * @generated
	 */
	public final boolean isOpenNewlyCreatedDiagramEditor() {
		return openNewlyCreatedDiagramEditor;
	}

	/**
	 * @generated
	 */
	public void setOpenNewlyCreatedDiagramEditor(
			boolean openNewlyCreatedDiagramEditor) {
		this.openNewlyCreatedDiagramEditor = openNewlyCreatedDiagramEditor;
	}

	/**
	 * @generated
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;

		setNeedsProgressMonitor(true);
	}

	@Override
	public void addPages() {
		// 1) Create Diagram Model File
		addDiagramModelFilePage();

		// 2) Select existing Domain File and Domain Element.
		addDomainModelSelectionPage();

	}

	private void addDiagramModelFilePage() {
		diagramModelFilePage = new NewExtendedFileCreationPage(
				"DiagramModelFile", getSelection(), getDiagramFileExtension()); //$NON-NLS-1$

		diagramModelFilePage
				.setTitle(Messages.CreationWizard_DiagramModelFilePageTitle);
		diagramModelFilePage
				.setDescription(Messages.CreationWizard_DiagramModelFilePageDescription);

		addPage(diagramModelFilePage);
	}

	private void addDomainModelSelectionPage() {
		ResourceLocationProvider rloc = new ResourceLocationProvider(
				getSelection());

		domainModelSelectionPage = new DiagramModelSelectionPage(
				"domain", rloc, editingDomain.getResourceSet(), "fujaba", this); //$NON-NLS-1$ //$NON-NLS-2$

		domainModelSelectionPage.setTitle("Select Domain Model");
		domainModelSelectionPage
				.setDescription("Load domain model and select element for diagram.");
		domainModelSelectionPage.setModelRequired(true);

		addPage(domainModelSelectionPage);
	}

	/**
	 * @generated
	 */
	public boolean performFinish() {
		IRunnableWithProgress op = new WorkspaceModifyOperation(null) {

			protected void execute(IProgressMonitor monitor)
					throws CoreException, InterruptedException {

				diagram = createDiagram(diagramModelFilePage.getURI(),
						domainModelSelectionPage.getURI(), monitor);
				if (isOpenNewlyCreatedDiagramEditor() && diagram != null) {
					try {
						DiagramEditorUtil.openDiagram(diagram, getEditorId());
					} catch (PartInitException e) {
						ErrorDialog.openError(getContainer().getShell(),
								Messages.CreationWizardOpenEditorError, null,
								e.getStatus());
					}
				}
			}
		};
		try {
			getContainer().run(false, true, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			if (e.getTargetException() instanceof CoreException) {
				ErrorDialog.openError(getContainer().getShell(),
						Messages.CreationWizardCreationError, null,
						((CoreException) e.getTargetException()).getStatus());
			} else {
				FujabaNewwizardPlugin.getDefault().logError(
						"Error creating diagram", e.getTargetException()); //$NON-NLS-1$
			}
			return false;
		}
		return diagram != null;
	}

	/**
	 * This method should be called within a workspace modify operation since it
	 * creates resources.
	 * 
	 * @generated
	 */
	public Resource createDiagram(URI diagramURI, final URI modelURI,
			IProgressMonitor progressMonitor) {

		final TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
				.createEditingDomain();
		progressMonitor.beginTask(
				Messages.DiagramEditorUtil_CreateDiagramProgressTask, 3);
		final Resource diagramResource = editingDomain.getResourceSet()
				.createResource(diagramURI);
		final String diagramName = diagramURI.lastSegment();
		final Resource modelResource = editingDomain.getResourceSet()
				.getResource(modelURI, true);

		AbstractTransactionalCommand command = new AbstractTransactionalCommand(
				editingDomain,
				Messages.DiagramEditorUtil_CreateDiagramCommandLabel,
				Collections.EMPTY_LIST) {
			protected CommandResult doExecuteWithResult(
					IProgressMonitor monitor, IAdaptable info)
					throws ExecutionException {

				ModelElementCategory elementCategory = null;

				EObject element = domainModelSelectionPage
						.getSelectedDiagramElement();

				if (!(element instanceof ExtendableElement)) {
					List<?> rootElements = modelResource.getContents();
					if (!rootElements.isEmpty()) {
						Object rootElement = rootElements.get(0);
						if (rootElement instanceof RootNode) {
							RootNode rootNode = (RootNode) rootElement;
							String categoryKey = getModelElementCategoryKey();
							for (ModelElementCategory category : rootNode
									.getCategories()) {
								if (category.getKey().equals(categoryKey)
								/*
								 * && category .isValidElement(diagramElement)
								 */) {
									elementCategory = category;
									break;
								}
							}

							if (elementCategory == null) {
								elementCategory = ModelinstanceFactory.eINSTANCE
										.createModelElementCategory();
								elementCategory.setKey(categoryKey);
								rootNode.getCategories().add(elementCategory);
							}

							ExtendableElement newDiagramElement = createDiagramElement();

							if (newDiagramElement != null) {
								elementCategory.getModelElements().add(
										newDiagramElement);
								element = newDiagramElement;
							}
						}
					}
				}

				if (element == null) {
					element = elementCategory;
				}

				Diagram diagram = ViewService.createDiagram(element,
						getModelId(), getDiagramPreferencesHint());
				if (diagram != null) {
					diagramResource.getContents().add(diagram);
					diagram.setName(diagramName);
				}

				try {
					Map<?, ?> saveOptions = DiagramEditorUtil.getSaveOptions();
					modelResource.save(saveOptions);
					diagramResource.save(saveOptions);
				} catch (IOException e) {
					FujabaNewwizardPlugin.getDefault().logError(
							"Unable to store model and diagram resources", e); //$NON-NLS-1$
				}
				return CommandResult.newOKCommandResult();
			}
		};
		try {
			OperationHistoryFactory.getOperationHistory().execute(command,
					new SubProgressMonitor(progressMonitor, 1), null);
		} catch (ExecutionException e) {
			FujabaNewwizardPlugin.getDefault().logError(
					"Unable to create model and diagram", e); //$NON-NLS-1$
		}
		DiagramEditorUtil.setCharset(WorkspaceSynchronizer
				.getFile(modelResource));
		DiagramEditorUtil.setCharset(WorkspaceSynchronizer
				.getFile(diagramResource));
		return diagramResource;
	}

	@Override
	public boolean isValidDiagramElement(EObject object) {
		IAdaptable adapter = new EObjectAdapter(object);
		IOperation operation = new CreateDiagramViewOperation(adapter,
				getModelId(), getDiagramPreferencesHint());
		return ViewService.getInstance().provides(operation);
	}
}
