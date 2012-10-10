package org.storydriven.modeling.diagram.ocl;

import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.NumberRule;
import org.eclipse.jface.text.rules.RuleBasedScanner;
import org.eclipse.jface.text.rules.SingleLineRule;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.jface.text.rules.WhitespaceRule;

public class OCLScanner extends RuleBasedScanner
{

	OCLScanner(ColorManager manager, OCLDocument oclDocument)
	{
		super();

		IToken literal = new Token(new TextAttribute(manager.getColor(ColorManager.LITERAL)));

		IRule[] rules = new IRule[7];

		// Add rule for strings
		rules[0] = new SingleLineRule("'", "'", literal); //$NON-NLS-1$ //$NON-NLS-2$

		// Keyword (and pseudo-keyword) rule
		rules[1] = new OCLKeywordRule();

		// Collection and Tuple Literal rules
		rules[2] = new OCLCollectionTupleRule(manager, false);
		rules[3] = new OCLCollectionTupleRule(manager, true);

		// identifier rule
		rules[4] = new OCLIdentifierRule(manager, oclDocument);

		// Add a rule for numbers
		rules[5] = new NumberRule(literal);

		// Add generic whitespace rule
		rules[6] = new WhitespaceRule(new OCLWhitespaceDetector());

		setRules(rules);
	}
}
