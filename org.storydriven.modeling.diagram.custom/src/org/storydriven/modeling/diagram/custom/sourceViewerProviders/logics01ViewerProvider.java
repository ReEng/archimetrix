package org.storydriven.modeling.diagram.custom.sourceViewerProviders;

import java.util.Map;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.text.source.SourceViewer;
import org.eclipse.jface.text.source.SourceViewerConfiguration;
import org.eclipse.swt.widgets.Composite;
import org.storydriven.modeling.diagram.custom.SourceViewerProvider;

public class logics01ViewerProvider extends SourceViewerProvider {

	public ISourceViewer createSourceViewer(Composite parent, int styles, EClassifier contextClassifier,
			Map<String, EClassifier> contextInformation, String text)
	{
		ISourceViewer sourceViewer = new SourceViewer(parent, null, styles);

		sourceViewer.configure(new SourceViewerConfiguration());

		sourceViewer.setDocument(new Document(text));

		sourceViewer.getTextWidget().setIndent(30);
		
		return sourceViewer;
	}
	
}
