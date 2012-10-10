package org.storydriven.modeling.diagram.ocl;

import org.eclipse.jface.text.rules.EndOfLineRule;
import org.eclipse.jface.text.rules.IPredicateRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.MultiLineRule;
import org.eclipse.jface.text.rules.RuleBasedPartitionScanner;
import org.eclipse.jface.text.rules.Token;

public class OCLPartitionScanner extends RuleBasedPartitionScanner
{
	public static final String OCL_COMMENT = "__ocl_comment";

	OCLPartitionScanner()
	{
		super();

		IPredicateRule[] rules = new IPredicateRule[2];

		IToken commentToken = new Token(OCL_COMMENT);

		// rule for single-line comments
		rules[0] = new EndOfLineRule("--", commentToken);

		// rule for paragraph comments
		rules[1] = new MultiLineRule("/*", "*/", commentToken);

		setPredicateRules(rules);
	}
}
