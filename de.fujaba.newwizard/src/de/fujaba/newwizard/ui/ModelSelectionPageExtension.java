/*
 * Copyright (c) 2006 Eclipse.org
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Dmitry Stadnik - initial API and implementation
 */
package de.fujaba.newwizard.ui;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.swt.widgets.Composite;

/**
 * Extension slot for the model selection page.
 * 
 * @author dstadnik
 */
public interface ModelSelectionPageExtension {

	/**
	 * Create additional control(s) inside model selection page.
	 */
	public void createControl(Composite parent);

	/**
	 * New model was selected for the page.
	 * Called by page so extension could update controls.
	 */
	public void setResource(Resource resource);
}
