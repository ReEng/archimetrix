package de.mdelab.sdm.interpreter.common;

/**
 * Several constants used throughout the SDM interpreter.
 * 
 * @author Stephan Hildebrandt
 * @author Sebastian Wätzoldt
 * 
 */
public interface SDMInterpreterConstants
{
	/*
	 * Default name of the variable that stores the return value of an activity.
	 */
	public static final String	RETURN_VALUE_VAR_NAME						= "##RETURN_VALUE";

	/*
	 * Default name of temporary internal variables
	 */
	public static final String	INTERNAL_VAR_NAME							= "##INTERNAL_VARIABLE";

	/*
	 * ID of the expression interpreter extension point
	 */
	public static final String	EXPRESSION_INTERPRETERS_EXTENSION_POINT_ID	= "de.mdelab.sdm.interpreter.common.expressionInterpreterExtension";

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

	/*
	 * The default size of the interpreter's thread pool.
	 */
//	public static final int		THREAD_POOL_SIZE							= Runtime.getRuntime().availableProcessors();
	public static final int		THREAD_POOL_SIZE							= 1;
}
