package org.storydriven.modeling.diagram.ocl;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.rules.IWordDetector;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.jface.text.rules.WordRule;
import org.eclipse.ocl.expressions.Variable;

public class OCLIdentifierRule extends WordRule
{
	public static OCLIdentifierRule	thisRule;

	OCLIdentifierRule(ColorManager colorManager, OCLDocument oclDocument)
	{
		super(new OCLKeywordDetector(), new Token(new TextAttribute(null)));

		Token wordToken = new Token(new TextAttribute(colorManager.getColor(ColorManager.KNOWN_VARIABLE)));

		for (Variable<EClassifier, EParameter> variable : oclDocument.getOCLContextInformation())
		{
			addWord(variable.getName(), wordToken);
		}
	}

	private static class OCLKeywordDetector implements IWordDetector
	{

		public boolean isWordPart(char c)
		{
			return isWordStart(c) || c == '$' || (c >= '0' && c <= '9');
		}

		public boolean isWordStart(char c)
		{
			return c == '_' || (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
		}
	}
}
