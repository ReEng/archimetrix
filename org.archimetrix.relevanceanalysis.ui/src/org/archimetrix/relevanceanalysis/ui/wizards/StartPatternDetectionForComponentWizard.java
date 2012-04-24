package org.archimetrix.relevanceanalysis.ui.wizards;


import java.util.ArrayList;
import java.util.Collection;

import org.archimetrix.inference.ArchimetrixInferenceJob;
import org.archimetrix.relevanceanalysis.ui.views.RelevantComponentsView;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.fujaba.commons.console.ReportLevel;
import org.reclipse.structure.inference.ui.views.annotations.AnnotationView;
import org.reclipse.structure.inference.ui.wizards.StartInferenceWizard;

import eu.qimpress.samm.staticstructure.ComponentType;
import eu.qimpress.sourcecodedecorator.ComponentImplementingClassesLink;


/**
 * This class represents the wizard that is used to start the bad smell detection from the Relevant Components View. It
 * uses the StartPatternDetectionForComponentWizardPage.
 * 
 * @author mcp
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 * 
 */
public class StartPatternDetectionForComponentWizard extends StartInferenceWizard
{
	private static final String WIZARD_TITLE = "Start Bad Smell Detection";


	public StartPatternDetectionForComponentWizard(final IWorkbench workbench)
	{
		super();

		setWindowTitle(WIZARD_TITLE);
	}


	@Override
	public boolean performFinish()
	{
		// save settings
		storePageSettings();

		Collection<ComponentType> selectedComponents = getSelectedComponents();
		String catalogPath = page.getCatalog().getURI().toPlatformString(true);
		String hostPath = getSCDM().getURI().toPlatformString(true);
		String enginesPath = page.getEnginesPath();
		ReportLevel reportLevel = ReportLevel.DEBUG;

		final ArchimetrixInferenceJob job = new ArchimetrixInferenceJob(catalogPath, hostPath, enginesPath,
				selectedComponents, reportLevel);

		// cache views
		IViewPart part = null;
		try
		{
			part = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView(AnnotationView.ID);
		}
		catch (PartInitException e)
		{
			e.printStackTrace();
			return false;
		}

		// check for existing annotations view
		if (part == null || !(part instanceof AnnotationView))
		{
			return false;
		}

		final AnnotationView annotations = (AnnotationView) part;

		// configure view
		PlatformUI.getWorkbench().getDisplay().syncExec(new Runnable()
		{
			@Override
			public void run()
			{
				if (annotations != null)
				{
					annotations.switchToInference(job.getEngine());
				}
			}
		});

		job.schedule();

		return true;
	}


	private Collection<ComponentType> getSelectedComponents()
	{
		Object[] selectedComponentImplementingClassesLinks = RelevantComponentsView.getSelectedComponents();
		Collection<ComponentType> selectedComponents = new ArrayList<ComponentType>();
		for (Object object : selectedComponentImplementingClassesLinks)
		{
			ComponentImplementingClassesLink link = (ComponentImplementingClassesLink) object;
			selectedComponents.add(link.getComponent());
		}
		return selectedComponents;
	}


	private Resource getSCDM()
	{
		ComponentImplementingClassesLink link = (ComponentImplementingClassesLink) RelevantComponentsView
				.getSelectedComponents()[0];
		return link.eResource();
	}


	@Override
	public void addPages()
	{
		this.page = new StartPatternDetectionForComponentWizardPage(WIZARD_TITLE);
		addPage(this.page);
	}


	@Override
	protected void storePageSettings()
	{
	}
}
