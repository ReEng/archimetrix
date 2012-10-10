package org.storydriven.modeling.diagram.custom.providers;

import org.storydriven.modeling.diagram.custom.edit.parts.CustomSDMEditPartFactory;
import org.storydriven.modeling.diagram.providers.SDMEditPartProvider;


public class CustomSDMEditPartProvider extends SDMEditPartProvider {
	public CustomSDMEditPartProvider() {
		super();
		setFactory(new CustomSDMEditPartFactory());
	}
}
