package org.storydriven.modeling.interpreter.adapter.storypattern;

import org.eclipse.emf.common.notify.Adapter;
import org.storydriven.modeling.interpreter.adapter.SDMainAdapterFactory;
import org.storydriven.modeling.patterns.util.PatternsAdapterFactory;

public class SDInternalStoryPatternAdapterFactory extends PatternsAdapterFactory
{
	protected SDMainAdapterFactory	mainAdapterFactory;

	public SDInternalStoryPatternAdapterFactory(SDMainAdapterFactory mainAdapterFactory)
	{
		assert mainAdapterFactory != null;

		this.mainAdapterFactory = mainAdapterFactory;
	}


	@Override
	public Adapter createAttributeAssignmentAdapter() 
	{
		return new SDAttributeAssignmentAdapter(mainAdapterFactory);
	}


	@Override
	public Adapter createAbstractLinkVariableAdapter() 
	{
		throw new UnsupportedOperationException();
	}


	@Override
	public Adapter createLinkConstraintAdapter() {
		// TODO Auto-generated method stub
		return super.createLinkConstraintAdapter();
	}


	@Override
	public Adapter createConstraintAdapter() {
		// TODO Auto-generated method stub
		return super.createConstraintAdapter();
	}


	@Override
	public Adapter createLinkVariableAdapter() 
	{
		return new SDLinkVariableAdapter(mainAdapterFactory);
	}


	@Override
	public Adapter createContainmentRelationAdapter() 
	{
		return new SDContainmentRelationAdapter(mainAdapterFactory);
	}


	@Override
	public Adapter createMatchingPatternAdapter() {
		return new SDMatchingPatternAdapter(mainAdapterFactory);
	}


	@Override
	public Adapter createStoryPatternAdapter() {
		// TODO Auto-generated method stub
		return super.createStoryPatternAdapter();
	}

	@Override
	public Adapter createObjectVariableAdapter() 
	{
		return new SDObjectVariableAdapter(mainAdapterFactory);
	}
	

   @Override
   public Adapter createObjectSetVariableAdapter()
   {
      return new SDObjectSetVariableAdapter(mainAdapterFactory);
   }



	@Override
	public Adapter createPrimitiveVariableAdapter() 
	{
		return new SDPrimitiveVariableAdapter(mainAdapterFactory);
	}


   @Override
   public Adapter createPathAdapter()
   {
      return new SDPathVariableAdapter(mainAdapterFactory);
   }
	
	
}
