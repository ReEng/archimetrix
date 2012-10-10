package org.storydriven.modeling.interpreter.adapter.tests.calls;

import java.io.IOException;
import java.util.Map;

import org.storydriven.modeling.activities.Activity;
import org.storydriven.modeling.activities.ActivityNode;
import org.storydriven.modeling.interpreter.adapter.tests.TestBase;

import de.mdelab.sdm.interpreter.common.SDMInterpreterConstants;
import de.mdelab.sdm.interpreter.common.SDMInterpreterException;
import de.mdelab.sdm.interpreter.common.variables.Variable;

public class CallsTests extends TestBase
{

	public CallsTests(String name)
	{
		super(name);
	}

	@Override
	protected String getModelFolder()
	{
		return "/org.storydriven.modeling.interpreter.adapter.tests/models/calls/";
	}

	public void testOCL() throws IOException, SDMInterpreterException
	{
		booleanTest("testOCL");
	}

	public void testLiteralExpression() throws IOException, SDMInterpreterException
	{
		booleanTest("testLiteralExpression");
	}

	public void testNotExpression() throws IOException, SDMInterpreterException
	{
		booleanTest("testNotExpression");
	}

	public void testComparisonExpression() throws IOException, SDMInterpreterException
	{
		booleanTest("testComparisonExpression");
	}

	public void testComparisonExpressionLess() throws IOException, SDMInterpreterException
	{
		booleanTest("testComparisonExpressionLess");
	}

	public void testComparisonExpressionLessEqual() throws IOException, SDMInterpreterException
	{
		booleanTest("testComparisonExpressionLessEqual");
	}

	public void testArithmeticExpressionPlus() throws IOException, SDMInterpreterException
	{
		booleanTest("testArithmeticExpressionPlus");
	}

	public void testArithmeticExpressionMinus() throws IOException, SDMInterpreterException
	{
		booleanTest("testArithmeticExpressionMinus");
	}

	public void testArithmeticExpressionTimes() throws IOException, SDMInterpreterException
	{
		booleanTest("testArithmeticExpressionTimes");
	}

	public void testArithmeticExpressionDivide() throws IOException, SDMInterpreterException
	{
		booleanTest("testArithmeticExpressionDivide");
	}

	public void testArithmeticExpressionModulo() throws IOException, SDMInterpreterException
	{
		booleanTest("testArithmeticExpressionModulo");
	}

	public void testArithmeticExpressionExp() throws IOException, SDMInterpreterException
	{
		booleanTest("testArithmeticExpressionExp");
	}

	public void testBinaryLogicExpressionAND() throws IOException, SDMInterpreterException
	{
		booleanTest("testBinaryLogicExpressionAND");
	}

	public void testBinaryLogicExpressionOR() throws IOException, SDMInterpreterException
	{
		booleanTest("testBinaryLogicExpressionOR");
	}

	public void testBinaryLogicExpressionEquivalent() throws IOException, SDMInterpreterException
	{
		booleanTest("testBinaryLogicExpressionEquivalent");
	}

	public void testBinaryLogicExpressionImply() throws IOException, SDMInterpreterException
	{
		booleanTest("testBinaryLogicExpressionImply");
	}

	public void testBinaryLogicExpressionXor() throws IOException, SDMInterpreterException
	{
		booleanTest("testBinaryLogicExpressionXor");
	}

	public void testMethodCallExpression() throws IOException, SDMInterpreterException
	{
		System.out.println("\n\n\nExecuting 'testMethodCallExpression'.");

		Activity a = loadActivityDiagram("testMethodCallExpression.sdm");

		ActivityNode an = a.getOwnedActivityNodes().get(0);

		long start = System.nanoTime();

		Map<String, Variable> vars = executeActivityNode(an);

		assertTrue(((Long) vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValueAdapter().getValue()) > start);

		vars = executeActivityNode(an);

		assertTrue(((Long) vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValueAdapter().getValue()) > start);
	}

	public void testMethodCallExpression2() throws IOException, SDMInterpreterException
	{
		booleanTest("testMethodCallExpression2");
	}

	public void testMethodCallExpression3() throws IOException, SDMInterpreterException
	{
		booleanTest("testMethodCallExpression3");
	}

	public void testMethodCallExpression4() throws IOException, SDMInterpreterException
	{
		booleanTest("testMethodCallExpression4");
	}

	public void testMethodCallExpression5() throws IOException, SDMInterpreterException
	{
		booleanTest("testMethodCallExpression5");
	}

	public void testMethodCallExpression_Activity() throws IOException, SDMInterpreterException
	{
		booleanTest("testMethodCallExpression_Activity");
	}

	public void testMethodCallExpression_Activity2() throws IOException, SDMInterpreterException
	{
		booleanTest("testMethodCallExpression_Activity2");
	}
}
