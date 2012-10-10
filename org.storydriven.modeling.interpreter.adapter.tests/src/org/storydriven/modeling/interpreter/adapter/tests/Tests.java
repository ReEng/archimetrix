package org.storydriven.modeling.interpreter.adapter.tests;

import org.storydriven.modeling.interpreter.adapter.tests.activities.ActivitiesTests;
import org.storydriven.modeling.interpreter.adapter.tests.calls.CallsTests;
import org.storydriven.modeling.interpreter.adapter.tests.pathexpressions.PathsTests;
import org.storydriven.modeling.interpreter.adapter.tests.patterns.MatchingPatternsTests;
import org.storydriven.modeling.interpreter.adapter.tests.patterns.ModifyingPatternsTests;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;


/**
 * 
 * @generated
 */
public class Tests extends TestSuite
{

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static void main(String[] args)
	{
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static Test suite()
	{
		TestSuite suite = new Tests("Tests");
		suite.addTestSuite(ActivitiesTests.class);
		suite.addTestSuite(ModifyingPatternsTests.class);
		suite.addTestSuite(MatchingPatternsTests.class);
      suite.addTestSuite(PathsTests.class);
		suite.addTestSuite(CallsTests.class);
		
		return suite;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Tests(String name)
	{
		super(name);
	}

} // Tests

