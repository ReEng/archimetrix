package org.storydriven.modeling.diagram.custom.part;

import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbench;
import org.storydriven.modeling.ExtendableElement;
import org.storydriven.modeling.activities.ActivitiesFactory;

import de.fujaba.newwizard.diagrams.FujabaDiagramNewWizard;

/**
 * A CreationWizard for Activity diagrams. It implements the abstract
 * creation wizard from the de.fujaba.newwizard plugin.
 * 
 * @author bingo
 * 
 */
public class CustomActivityDiagramCreationWizard extends
		FujabaDiagramNewWizard {

	public void init(IWorkbench workbench, IStructuredSelection selection) {
		super.init(workbench, selection);

		setWindowTitle(getWindowTitle());
		setDefaultPageImageDescriptor(org.storydriven.modeling.diagram.part.SDMDiagramEditorPlugin
				.getBundledImageDescriptor("icons/wizban/NewActivitiesWizard.gif")); //$NON-NLS-1$
	}

	@Override
	protected String getDiagramFileExtension() {
		return "sdm_diagram"; //$NON-NLS-1$
	}

	@Override
	protected String getModelId() {
		return org.storydriven.modeling.diagram.edit.parts.ActivityEditPart.MODEL_ID;
	}

	@Override
	protected PreferencesHint getDiagramPreferencesHint() {
		return org.storydriven.modeling.diagram.part.SDMDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT;
	}

	@Override
	protected String getEditorId() {
		return org.storydriven.modeling.diagram.part.SDMDiagramEditor.ID;
	}

	@Override
	protected String getModelElementCategoryKey() {
		return "org.storydriven.modeling.activities";
	}

	@Override
	protected ExtendableElement createDiagramElement() {
		return ActivitiesFactory.eINSTANCE.createActivity();
	}

}
