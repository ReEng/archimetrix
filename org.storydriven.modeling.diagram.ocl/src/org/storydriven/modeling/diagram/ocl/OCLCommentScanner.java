package org.storydriven.modeling.diagram.ocl;

import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.RuleBasedScanner;

public class OCLCommentScanner extends RuleBasedScanner {
	   OCLCommentScanner(ColorManager manager) {
	        super();
	        
	        setRules(new IRule[0]);
	    }
}
