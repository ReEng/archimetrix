package de.fujaba.newwizard.diagrams.pages;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

import de.fujaba.newwizard.Messages;

/**
 * A Wizard Page for creating new diagram files that have a certain file
 * extension. This class has been copied from a generated GMF-Editor, where it
 * was named ???CreationWizardPage.
 * 
 * @author bingo
 * 
 */
public class NewExtendedFileCreationPage extends WizardNewFileCreationPage {

	/**
	 * The File Extension to use.
	 * 
	 * @generated
	 */
	private final String fileExtension;

	/**
	 * Constructs this Creation Page.
	 * 
	 * @param pageName
	 *            The name for this Page.
	 * @param selection
	 *            The current object selection in the workbench.
	 * @param fileExtension
	 *            The file extension for new files.
	 * 
	 * @generated
	 */
	public NewExtendedFileCreationPage(String pageName,
			IStructuredSelection selection, String fileExtension) {
		super(pageName, selection);
		this.fileExtension = fileExtension;
	}

	/**
	 * Override to create files with this extension.
	 * 
	 * @generated
	 */
	protected String getExtension() {
		return fileExtension;
	}

	/**
	 * Returns the URI of the specified file.
	 * 
	 * @generated
	 */
	public URI getURI() {
		return URI.createPlatformResourceURI(getFilePath().toString(), false);
	}

	/**
	 * Finds out the Path for the currently selected file, as entered by the
	 * user.
	 * 
	 * @generated
	 */
	protected IPath getFilePath() {
		IPath path = getContainerFullPath();
		if (path == null) {
			path = new Path(""); //$NON-NLS-1$
		}
		String fileName = getFileName();
		if (fileName != null) {
			path = path.append(fileName);
		}
		return path;
	}

	/**
	 * Creates the controls for this Wizard Page.
	 * 
	 * @param parent
	 *            The parent control.
	 * 
	 * @generated
	 */
	public void createControl(Composite parent) {
		super.createControl(parent);
		setFileName(getUniqueFileName(getContainerFullPath(), getFileName(),
				getExtension()));
		setPageComplete(validatePage());
	}

	/**
	 * Returns a unique file name, based on the given hint.
	 * 
	 * @param containerFullPath
	 *            The full path for the new file.
	 * @param fileName
	 *            The desired filename, or null for a default name.
	 * @param extension
	 *            The file extension to use.
	 * @return The unique file name that can be used to create a new file.
	 * 
	 * @generated
	 */
	private static String getUniqueFileName(IPath containerFullPath,
			String fileName, String extension) {
		if (containerFullPath == null) {
			containerFullPath = new Path(""); //$NON-NLS-1$
		}
		if (fileName == null || fileName.trim().length() == 0) {
			fileName = "default"; //$NON-NLS-1$
		}
		IPath filePath = containerFullPath.append(fileName);
		if (extension != null && !extension.equals(filePath.getFileExtension())) {
			filePath = filePath.addFileExtension(extension);
		}
		extension = filePath.getFileExtension();
		fileName = filePath.removeFileExtension().lastSegment();
		int i = 1;
		while (ResourcesPlugin.getWorkspace().getRoot().exists(filePath)) {
			i++;
			filePath = containerFullPath.append(fileName + i);
			if (extension != null) {
				filePath = filePath.addFileExtension(extension);
			}
		}
		return filePath.lastSegment();
	}

	/**
	 * Validates the current state of this Wizard Page.
	 * 
	 * @generated
	 */
	protected boolean validatePage() {
		if (!super.validatePage()) {
			return false;
		}
		String extension = getExtension();
		if (extension != null
				&& !getFilePath().toString().endsWith("." + extension)) {
			setErrorMessage(NLS.bind(Messages.CreationWizardPageExtensionError,
					extension));
			return false;
		}
		return true;
	}
}
