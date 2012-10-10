package de.fujaba.newwizard.model;

import java.io.IOException;
import java.util.LinkedList;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.OperationHistoryFactory;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

import de.fujaba.modelinstance.ModelinstanceFactory;
import de.fujaba.modelinstance.RootNode;
import de.fujaba.newwizard.FujabaNewwizardPlugin;
import de.fujaba.newwizard.Messages;
import de.fujaba.newwizard.diagrams.DiagramEditorUtil;
import de.fujaba.newwizard.diagrams.pages.NewExtendedFileCreationPage;

/**
 * A New Wizard for the Fujaba Model.
 * 
 * @author bingo
 * 
 */
public class FujabaModelNewWizard extends Wizard implements INewWizard {

	/**
	 * The Wizard Page for selecting a file name.
	 */
	protected NewExtendedFileCreationPage domainModelFilePage;

	/**
	 * The Editing Domain for all changes.
	 */
	private TransactionalEditingDomain editingDomain;

	/**
	 * Constructs this NewWizard.
	 */
	public FujabaModelNewWizard() {
		editingDomain = GMFEditingDomainFactory.INSTANCE.createEditingDomain();
	}

	/**
	 * Initializes this creation wizard.
	 * 
	 * @param workbench
	 *            The workbench
	 * @param selection
	 *            The selection that existed before this wizard was opened.
	 * 
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		setNeedsProgressMonitor(true);

		domainModelFilePage = new NewExtendedFileCreationPage(
				"DiagramModelFile", selection, FujabaNewwizardPlugin.FUJABA_MODEL_EXTENSION); //$NON-NLS-1$

		domainModelFilePage
				.setTitle(Messages.NewDiagramFileWizard_CreationPageTitle);
		domainModelFilePage
				.setDescription(Messages.NewDiagramFileWizard_CreationPageDescription);

		addPage(domainModelFilePage);
	}

	/**
	 * Creates the specified domain model.
	 */
	@Override
	public boolean performFinish() {

		LinkedList<IFile> affectedFiles = new LinkedList<IFile>();
		IFile domainModelFile = domainModelFilePage.createNewFile();
		DiagramEditorUtil.setCharset(domainModelFile);
		affectedFiles.add(domainModelFile);
		URI diagramModelURI = URI.createPlatformResourceURI(domainModelFile
				.getFullPath().toString(), true);
		ResourceSet resourceSet = editingDomain.getResourceSet();
		final Resource domainModelResource = resourceSet
				.createResource(diagramModelURI);

		final RootNode rootNode = ModelinstanceFactory.eINSTANCE
				.createRootNode();

		AbstractTransactionalCommand command = new AbstractTransactionalCommand(
				editingDomain, "InitDiagramCommand", affectedFiles) {

			protected CommandResult doExecuteWithResult(
					IProgressMonitor monitor, IAdaptable info)
					throws ExecutionException {

				domainModelResource.getContents().add(rootNode);
				
				//general edata types are created
				rootNode.getEcoreDataTypes().add(EcorePackage.eINSTANCE.getEString());
				rootNode.getEcoreDataTypes().add(EcorePackage.eINSTANCE.getEInt());
				//rootNode.getEcoreDataTypes().add(EcorePackage.eINSTANCE.getEIntegerObject());
				rootNode.getEcoreDataTypes().add(EcorePackage.eINSTANCE.getEDouble());
				//rootNode.getEcoreDataTypes().add(EcorePackage.eINSTANCE.getEDoubleObject());
				rootNode.getEcoreDataTypes().add(EcorePackage.eINSTANCE.getEFloat());
				//rootNode.getEcoreDataTypes().add(EcorePackage.eINSTANCE.getEFloatObject());
				rootNode.getEcoreDataTypes().add(EcorePackage.eINSTANCE.getEBoolean());
				//rootNode.getEcoreDataTypes().add(EcorePackage.eINSTANCE.getEBooleanObject());
				rootNode.getEcoreDataTypes().add(EcorePackage.eINSTANCE.getELong());
				
				
				return CommandResult.newOKCommandResult();
			}
		};

		try {
			OperationHistoryFactory.getOperationHistory().execute(command,
					new NullProgressMonitor(), null);
			domainModelResource.save(DiagramEditorUtil.getSaveOptions());

		} catch (ExecutionException e) {
			FujabaNewwizardPlugin.getDefault().logError(
					"Unable to create model.", e); //$NON-NLS-1$
		} catch (IOException ex) {
			FujabaNewwizardPlugin.getDefault().logError(
					"Save operation failed for: " + diagramModelURI, ex); //$NON-NLS-1$
		}
		return true;
	}

}
