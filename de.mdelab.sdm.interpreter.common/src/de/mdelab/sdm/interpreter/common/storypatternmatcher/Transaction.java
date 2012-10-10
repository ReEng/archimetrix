package de.mdelab.sdm.interpreter.common.storypatternmatcher;

import java.util.Set;

/**
 * @author Stephan Hildebrandt
 * @author Sebastian Wätzoldt
 */
public class Transaction<T>
{
	protected Set<T>			sourceSet;

	protected Set<T>			targetSet;

	protected T					element;

	public TransactionTypeEnum	transactionType;

	public Transaction(T element, Set<T> sourceSet, Set<T> targetSet, TransactionTypeEnum transactionType)
	{
		this.element = element;
		this.sourceSet = sourceSet;
		this.targetSet = targetSet;
		this.transactionType = transactionType;
	}

	public void commit()
	{
		if (sourceSet != null)
		{
			sourceSet.remove(element);
		}

		if (targetSet != null)
		{
			targetSet.add(element);
		}
	}

	public void rollBack()
	{
		if (targetSet != null)
		{
			targetSet.remove(element);
		}

		if (sourceSet != null)
		{
			sourceSet.add(element);
		}
	}
}
