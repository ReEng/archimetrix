package de.mdelab.sdm.interpreter.common.expressions;

public interface Constants
{
	/*
	 * ID of the expression interpreter extension point
	 */
	public static final String	EXPRESSION_INTERPRETERS_EXTENSION_POINT_ID	= "de.mdelab.sdm.interpreter.common.eclipse.expressionInterpreterExtension";

	/*
	 * name of the expression language attribute of the expression interpreter
	 * extension point
	 */
	public static final String	EXPRESSION_LANGUAGE_ATTRIBUTE_NAME			= "expressionLanguage";

	/*
	 * name of the expression interpreter class attribute of the expression
	 * interpreter extension point
	 */
	public static final String	EXPRESSION_INTERPRETER_CLASS_ATTRIBUTE_NAME	= "expressionInterpreterClass";

}
