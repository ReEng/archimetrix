package org.storydriven.modeling.diagram.ocl;

import java.util.Map;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.swt.widgets.Composite;
import org.storydriven.modeling.diagram.custom.SourceViewerProvider;

/**
 * Customized source viewer provider for OCL. Note: Most of the other classes in
 * this plug-in are taken from the OCL console plug-in.
 * 
 * @author Stephan Hildebrandt
 * 
 */
public class OCLSourceViewerProvider extends SourceViewerProvider
{
	private OCLSourceViewer	oclSourceViewer	= null;
	private ColorManager	colorManager	= null;

	@Override
	public ISourceViewer createSourceViewer(Composite parent, int styles, EClassifier contextClassifier,
			Map<String, EClassifier> contextInformation, String text)
	{
		colorManager = new ColorManager();

		oclSourceViewer = new OCLSourceViewer(parent, null, styles, colorManager, contextClassifier, contextInformation, text);

		return oclSourceViewer;
	}

	@Override
	public void dispose()
	{
		if (colorManager != null)
			colorManager.dispose();
	}

	@Override
	public String getText()
	{
		return oclSourceViewer.getDocument().get();
	}

	public void setText(String text)
	{
		oclSourceViewer.getDocument().set(text);
	}
}
