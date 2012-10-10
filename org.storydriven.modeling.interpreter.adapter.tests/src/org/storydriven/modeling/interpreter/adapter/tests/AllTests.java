package org.storydriven.modeling.interpreter.adapter.tests;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc --> A test suite for the '<em><b>Sde</b></em>' model.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class AllTests extends TestSuite
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
		TestSuite suite = new AllTests("Tests");
		suite.addTest(Tests.suite());
		return suite;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AllTests(String name)
	{
		super(name);
	}

} // AllTests
