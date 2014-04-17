package org.archimetrix.architecturepreview.ui.providers;

import java.util.List;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.reclipse.structure.inference.annotations.ASGAnnotation;

/**
 * This class provides the content of the bad smells tree in the ArchitecturePrognosisWizard.
 * 
 * @author mcp
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 * 
 */
public class BadSmellsWizardPageContentProvider implements ITreeContentProvider {

    @SuppressWarnings("unchecked")
    @Override
    public Object[] getElements(final Object inputElement) {
        List<ASGAnnotation> annotations = (List<ASGAnnotation>) inputElement;
        return annotations.toArray();
    }

    @Override
    public void dispose() {
    }

    @Override
    public void inputChanged(final Viewer viewer, final Object oldInput, final Object newInput) {
    }

    @Override
    public Object[] getChildren(final Object parentElement) {
        return null;
    }

    @Override
    public Object getParent(final Object element) {
        return null;
    }

    @Override
    public boolean hasChildren(final Object element) {
        return false;
    }

}
