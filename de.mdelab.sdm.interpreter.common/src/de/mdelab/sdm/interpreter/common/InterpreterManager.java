package de.mdelab.sdm.interpreter.common;

import java.util.List;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;

import de.mdelab.sdm.interpreter.common.adapters.IMainAdapterFactory;
import de.mdelab.sdm.interpreter.common.tasks.Task;

/**
 * @author Stephan Hildebrandt
 * @author Sebastian Wätzoldt
 */
public class InterpreterManager
{
	private IMainAdapterFactory		mainAdapterFactory;

	private MainInterpreterFactory	mainInterpreterFactory;

	private ClassLoader				classLoader;

	private ExecutorService			executorService;

	private List<Throwable>			exceptions;

	private ReentrantReadWriteLock	readWriteLock;

	private boolean					finalNodeReached	= false;

	public InterpreterManager(IMainAdapterFactory mainAdapterFactory, MainInterpreterFactory mainInterpreterFactory, ClassLoader classLoader)
	{
		assert mainAdapterFactory != null;
		assert mainInterpreterFactory != null;
		assert classLoader != null;

		this.mainAdapterFactory = mainAdapterFactory;
		this.mainInterpreterFactory = mainInterpreterFactory;
		this.classLoader = classLoader;
	}

	public IMainAdapterFactory getMainAdapterFactory()
	{
		return mainAdapterFactory;
	}

	public MainInterpreterFactory getMainInterpreterFactory()
	{
		return mainInterpreterFactory;
	}

	public ClassLoader getClassLoader()
	{
		return classLoader;
	}

	public void submitTask(Task<?> task)
	{
		assert task != null;

		executorService.submit(task);
	}

	public List<Throwable> getExceptions()
	{
		return exceptions;
	}

	public void addException(Throwable exception)
	{
		exceptions.add(exception);
	}

	public Throwable getRootException()
	{
		if (exceptions.isEmpty())
		{
			return null;
		}
		else
		{
			return exceptions.get(0);
		}
	}

	public ReadLock getReadLock()
	{
		return readWriteLock.readLock();
	}

	public WriteLock getWriteLock()
	{
		return readWriteLock.writeLock();
	}

	protected void shutdown()
	{
		this.executorService.shutdown();
	}

	protected void initialize(int threadPoolSize)
	{
		this.executorService = Executors.newFixedThreadPool(threadPoolSize);
		this.exceptions = new Vector<Throwable>();
		this.readWriteLock = new ReentrantReadWriteLock();
	}

	public void setFinalNodeReached()
	{
		this.finalNodeReached = true;
	}

	public boolean isFinalNodeReached()
	{
		return this.finalNodeReached;
	}
}
