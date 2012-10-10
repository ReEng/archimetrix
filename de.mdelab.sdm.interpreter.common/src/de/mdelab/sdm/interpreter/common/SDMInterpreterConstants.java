package de.mdelab.sdm.interpreter.common;

/**
 * @author Stephan Hildebrandt
 * @author Sebastian Wätzoldt
 */

public interface SDMInterpreterConstants
{
	/*
	 * Default name of the variable that stores the return value of an activity.
	 */
	public static final String	RETURN_VALUE_VAR_NAME	= "##RETURN_VALUE";

	/*
	 * Default name of temporary internal variables
	 */
	public static final String	INTERNAL_VAR_NAME		= "##INTERNAL_VARIABLE";

	/*
	 * The default size of the interpreter's thread pool.
	 */
	 public static final int NUMBER_OF_THREADS =
	 Runtime.getRuntime().availableProcessors();
//	public static final int		NUMBER_OF_THREADS		= 1;
}
