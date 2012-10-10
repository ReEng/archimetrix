package de.mdelab.sdm.interpreter.common.adapters.expressions;

/**
 * @author Stephan Hildebrandt
 * @author Sebastian Wätzoldt
 */
public interface IStringExpressionAdapter extends IExpressionAdapter
{
	public Object getAST();

	public void setAST(Object ast);

	public String getExpressionString();
}
