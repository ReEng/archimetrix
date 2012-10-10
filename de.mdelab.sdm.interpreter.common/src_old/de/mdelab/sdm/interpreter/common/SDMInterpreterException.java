package de.mdelab.sdm.interpreter.common;

/**
 * Basic class of all exceptions that may occur during the execution of a story
 * diagram.
 * 
 * @author Stephan Hildebrandt
 * @author Sebastian Wätzoldt
 * 
 * 
 */
public class SDMInterpreterException extends Exception
{
	private static final long	serialVersionUID	= 1L;
	private String				message				= "";
	private Throwable			innerException		= null;

	/**
	 * Create a new SDMIntepreterException with the specified error message.
	 * 
	 * @param message
	 *            The error message.
	 */
	public SDMInterpreterException(String message)
	{
		this.message = message;
	}

	/**
	 * Create a new SDMIntepreterException with an error message and an inner
	 * exception.
	 * 
	 * @param message
	 *            The error message.
	 * @param innerException
	 *            The inner exception.
	 */
	public SDMInterpreterException(String message, Throwable innerException)
	{
		this.message = message;
		this.innerException = innerException;
	}

	@Override
	public String toString()
	{
		if (innerException == null)
		{
			return message;
		}
		else
		{
			return message + "\nInnerException:\n" + innerException.toString();
		}
	}
}
