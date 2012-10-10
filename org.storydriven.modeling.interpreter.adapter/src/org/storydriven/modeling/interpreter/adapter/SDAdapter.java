package org.storydriven.modeling.interpreter.adapter;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import de.mdelab.sdm.interpreter.common.adapters.IAdapter;

public abstract class SDAdapter<ELEMENT_TYPE extends Notifier>  implements IAdapter, Adapter 
{

	private SDMainAdapterFactory	mainAdapterFactory;

	private ELEMENT_TYPE			element;

	public SDAdapter(SDMainAdapterFactory mainAdapterFactory)
	{
		assert mainAdapterFactory != null;

		this.mainAdapterFactory = mainAdapterFactory;
	}

	@Override
	public void notifyChanged(Notification notification)
	{
		// Do nothing

	}

	@Override
	public Notifier getTarget()
	{
		return element;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void setTarget(Notifier newTarget)
	{
		element = (ELEMENT_TYPE) newTarget;
	}

	protected ELEMENT_TYPE getElement()
	{
		return element;
	}

	protected SDMainAdapterFactory getMainAdapterFactory()
	{
		return mainAdapterFactory;
	}

}
