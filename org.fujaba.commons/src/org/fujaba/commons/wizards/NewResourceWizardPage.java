/**
 * 
 */
package org.fujaba.commons.wizards;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 *
 */
public class NewResourceWizardPage extends WizardNewFileCreationPage
{
   private final String fileExtension;

   /**
    * @generated
    */
   public NewResourceWizardPage(String pageName, IStructuredSelection selection, String fileExtension) {
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
    * @generated
    */
   public URI getURI() {
      return URI.createPlatformResourceURI(getFilePath().toString(), false);
   }

   /**
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
    * @generated NOT
    * #174315 Automatically set diagram file extension
    * temporary workaround for #257954 Automatically set diagram/domain file extension
    */
   @Override
   public void createControl(Composite parent) {
      super.createControl(parent);
      String fileName = getUniqueFileName(getContainerFullPath(), getFileName(), getExtension());
      if (fileName.endsWith("." + getExtension())) {
         fileName = fileName.substring(0, fileName.length() - getExtension().length() - 1);
      }
      setFileName(fileName);
      setFileExtension(getExtension());
      setPageComplete(validatePage());
   }

   /**
    * @generated
    */
   @Override
   protected boolean validatePage() {
      if (!super.validatePage()) {
         return false;
      }
      String extension = getExtension();
      if (extension != null && !getFilePath().toString().endsWith("." + extension)) {
         setErrorMessage(NLS.bind("Creation Wizard Page Extension Error", extension));
         return false;
      }
      return true;
   }

   /**
    * #174315 Automatically set diagram file extension
    * 
    * @generated
    */
   @Override
   public IWizardPage getNextPage() {
      IWizardPage nextPage = super.getNextPage();
      if(nextPage!= null) {
         if ("DomainModelFile".equals(getName()) && "DiagramModelFile".equals(nextPage.getName())) {
            setDomainFileName(nextPage);
         }
      }
      return nextPage;
   }

   /**
    * Automatically set diagram file extension
    * 
    */
   protected void setDomainFileName(IWizardPage nextPage) {
      NewResourceWizardPage nextWizardPage = (NewResourceWizardPage) nextPage;
      String fileName = getFileName();
      String extension = getExtension();
      if (fileName.endsWith(extension)) {
         fileName = fileName.substring(0, fileName.length() - extension.length());
      }
      fileName += nextWizardPage.getExtension();
      nextWizardPage.setFileName(fileName);
   }
   
   public static String getUniqueFileName(IPath containerFullPath, String fileName, String extension) {
      if (containerFullPath == null) {
         containerFullPath = new Path(""); //$NON-NLS-1$
      }
      if (fileName == null || fileName.trim().length() == 0) {
         fileName = "default"; //$NON-NLS-1$
      }

      extension = "." + extension;
      if (fileName.endsWith(extension)) {
         fileName = fileName.substring(0, fileName.length() - extension.length());
      }
      int i = 1;
      IPath filePath = containerFullPath.append(fileName + extension);
      while (ResourcesPlugin.getWorkspace().getRoot().exists(filePath)) {
         i++;
         filePath = containerFullPath.append(fileName + i + extension);
      }
      return filePath.lastSegment();
   }
}
