package org.storydriven.modeling.interpreter.adapter.m3;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import de.mdelab.sdm.interpreter.common.adapters.m3.IPropertyAdapter;


public interface SDEStructuralFeaturePropertyAdapter<FEATURE_TYPE extends EStructuralFeature> extends IPropertyAdapter
{
	public FEATURE_TYPE getFeature();
	
	public int getTraversalCost(EObject instance);
}
