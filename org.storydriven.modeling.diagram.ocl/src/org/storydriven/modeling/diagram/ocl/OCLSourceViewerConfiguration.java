package org.storydriven.modeling.diagram.ocl;

import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.contentassist.ContentAssistant;
import org.eclipse.jface.text.contentassist.IContentAssistant;
import org.eclipse.jface.text.presentation.IPresentationReconciler;
import org.eclipse.jface.text.presentation.PresentationReconciler;
import org.eclipse.jface.text.rules.DefaultDamagerRepairer;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.text.source.SourceViewerConfiguration;

public class OCLSourceViewerConfiguration extends SourceViewerConfiguration
{

	private OCLScanner			oclScanner;
	private OCLCommentScanner	oclCommentScanner;
	private ColorManager		colorManager;
	private OCLDocument			oclDocument;

	public OCLSourceViewerConfiguration(ColorManager colorManager, OCLDocument oclDocument)
	{
		this.colorManager = colorManager;
		this.oclDocument = oclDocument;
	}

	@Override
	public String[] getConfiguredContentTypes(ISourceViewer sourceViewer)
	{
		return new String[]
		{
				IDocument.DEFAULT_CONTENT_TYPE, OCLPartitionScanner.OCL_COMMENT
		};
	}

	protected OCLScanner getOCLScanner()
	{
		if (oclScanner == null)
		{
			oclScanner = new OCLScanner(colorManager, oclDocument);
			oclScanner.setDefaultReturnToken(new Token(new TextAttribute(colorManager.getColor(ColorManager.DEFAULT))));
		}

		return oclScanner;
	}

	protected OCLCommentScanner getOCLCommentScanner()
	{
		if (oclCommentScanner == null)
		{
			oclCommentScanner = new OCLCommentScanner(colorManager);
			oclCommentScanner.setDefaultReturnToken(new Token(new TextAttribute(colorManager.getColor(ColorManager.COMMENT))));
		}

		return oclCommentScanner;
	}

	@Override
	public IPresentationReconciler getPresentationReconciler(ISourceViewer sourceViewer)
	{
		PresentationReconciler reconciler = new PresentationReconciler();

		DefaultDamagerRepairer dr = new DefaultDamagerRepairer(getOCLScanner());
		reconciler.setDamager(dr, IDocument.DEFAULT_CONTENT_TYPE);
		reconciler.setRepairer(dr, IDocument.DEFAULT_CONTENT_TYPE);

		dr = new DefaultDamagerRepairer(getOCLCommentScanner());
		reconciler.setDamager(dr, OCLPartitionScanner.OCL_COMMENT);
		reconciler.setRepairer(dr, OCLPartitionScanner.OCL_COMMENT);

		return reconciler;
	}

	@Override
	public IContentAssistant getContentAssistant(ISourceViewer sourceViewer)
	{
		ContentAssistant result = new ContentAssistant();

		result.setContentAssistProcessor(new OCLCompletionProcessor(), IDocument.DEFAULT_CONTENT_TYPE);
		result.enableAutoActivation(true);
		// result.enablePrefixCompletion(true);

		return result;
	}
}
