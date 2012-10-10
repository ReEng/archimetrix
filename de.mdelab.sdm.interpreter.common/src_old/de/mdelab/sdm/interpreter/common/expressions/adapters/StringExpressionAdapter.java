package de.mdelab.sdm.interpreter.common.expressions.adapters;


/**
 * Superclass of all adapters of string expression. Provides operations to
 * access the expression string and to get and set the expression's abstract
 * syntax tree.
 * 
 * @author Stephan Hildebrandt
 * @author Sebastian Wätzoldt
 * 
 * 
 */
public abstract class StringExpressionAdapter extends ExpressionAdapter
{
	private Object	abstractSyntaxTree;

	protected StringExpressionAdapter(ExpressionAdapterFactory adapterFactory)
	{
		super(adapterFactory);
	}

	/**
	 * 
	 * @return The expression's expression string.
	 */
	public abstract String getExpressionString();

	/**
	 * 
	 * @return The abstract syntax tree of the expression. This may be null.
	 */
	public Object getAbstractSyntaxTree()
	{
		return abstractSyntaxTree;
	}

	/**
	 * 
	 * @param abstractSyntaxTree
	 *            The abstract syntax tree of this expression.
	 */
	public void setAbstractSyntaxTree(Object abstractSyntaxTree)
	{
		this.abstractSyntaxTree = abstractSyntaxTree;
	}
}
