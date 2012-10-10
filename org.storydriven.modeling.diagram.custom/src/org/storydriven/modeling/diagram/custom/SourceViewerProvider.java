package org.storydriven.modeling.diagram.custom;

import java.util.Map;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.text.source.SourceViewer;
import org.eclipse.jface.text.source.SourceViewerConfiguration;
import org.eclipse.swt.widgets.Composite;

/**
 * This class can be used to provide custom implementations of ISourceViewer and
 * IDocument. Simply overwrite the create* methods. IMPORTANT: Always provide a
 * parameterless public constructor.
 * 
 * SourceViewers provide a text field for editing text of a specific textual
 * language. They provide syntax highlighting, code completion and other useful
 * programming features. The SourceViewer provided by a SourceViewerProvider is
 * integrated into the story diagram editors expression edit dialog when the
 * user selects the appropriate expression language.
 * 
 * To register a customized SourceViewer with the SDM editor, implement a
 * subclass of SourceViewerProvider and use the expressionSourceViewerExtension
 * of the org.storydriven.modeling.diagram.custom plugin to register it for the
 * appropriate expression language. If no SourceViewer is registered for an
 * expression language, a plain text field is used to edit it.
 * 
 * @author Stephan Hildebrandt
 * 
 */
public class SourceViewerProvider
{
	private IDocument	document;

	/**
	 * Create a new ISourceViewer.
	 * 
	 * @param parent
	 *            The parent UI component that will contain the ISourceViewer.
	 * @param styles
	 *            SWT style bits for the SourceViewer.
	 * @param contextClassifier
	 *            If the expression has a context (e.g. a story pattern object),
	 *            this is the context's classifier (e.g. the story pattern
	 *            object's classifier).
	 * @param contextInformation
	 *            A map that contains all variables that are available in this
	 *            expression (e.g. previously matched story pattern objects) and
	 *            maps them to their classifiers.
	 * @param text
	 *            The initial text that should be shown in the ISourceViewer
	 * @return A new ISourceViewer.
	 */
	public ISourceViewer createSourceViewer(Composite parent, int styles, EClassifier contextClassifier,
			Map<String, EClassifier> contextInformation, String text)
	{
		ISourceViewer sourceViewer = new SourceViewer(parent, null, styles);

		sourceViewer.configure(new SourceViewerConfiguration());

		document = new Document(text);

		sourceViewer.setDocument(document);

		return sourceViewer;
	}

	/**
	 * 
	 * @return The current text of the SourceViewer.
	 */
	public String getText()
	{
		return document.get();
	}

	/**
	 * 
	 * @param text
	 *            The text that should be shown in the SourceViewer.
	 */
	public void setText(String text)
	{
		document.set(text);
	}

	/**
	 * Dispose of the SourceViewer. This is necessary for some SWT widgets.
	 */
	public void dispose()
	{

	}
}
