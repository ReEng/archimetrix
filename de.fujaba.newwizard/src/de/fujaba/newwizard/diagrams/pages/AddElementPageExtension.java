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
package de.fujaba.newwizard.diagrams.pages;

import java.util.Observable;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

import de.fujaba.newwizard.Messages;
import de.fujaba.newwizard.ui.ModelSelectionPageExtension;

/**
 * A Page Extension for the ModelSelectionPage with a check box. The user can
 * choose, if a new Diagram Element should be added to the Root Node, or if an
 * existing Diagram Element is to be selected.
 * 
 * @author bingo
 * 
 */
public class AddElementPageExtension extends Observable implements
		ModelSelectionPageExtension {

	/**
	 * The checkbox.
	 */
	private Button btn;

	/**
	 * The current status of the checkbox.
	 */
	private boolean addElement;

	/**
	 * Gets the current status of the checkbox.
	 * 
	 * @return true, if a new element should be added to the Root Node.
	 */
	public final boolean shouldAddElement() {
		return addElement;
	}

	/**
	 * Handler that will be executed, when the status of the checkbox changes.
	 * 
	 * @param value
	 *            Current status of the checkbox.
	 */
	protected void onStatusChanged(boolean value) {
		if (addElement == value) {
			return;
		}
		this.addElement = value;
		setChanged();
		notifyObservers(Boolean.valueOf(addElement));
	}

	/**
	 * The checkbox will use this text.
	 * 
	 * @return The text to use.
	 */
	protected String getLabelText() {
		return Messages.AddNewDiagramElementToRootNode;
	}

	/**
	 * Creates the checkbox for this Page Extension.
	 */
	public void createControl(Composite parent) {
		btn = new Button(parent, SWT.CHECK);
		btn.setText(getLabelText());
		btn.setSelection(addElement);
		btn.addSelectionListener(new SelectionListener() {

			public void widgetDefaultSelected(SelectionEvent e) {
			}

			public void widgetSelected(SelectionEvent e) {
				onStatusChanged(btn.getSelection());
			}
		});
	}

	/**
	 * Handler that will be called, if the Resource in the ModelSelectionPage
	 * changed.
	 */
	public void setResource(Resource resource) {
		// ignore
	}

	/**
	 * Sets the current selection status of the checkbox to "status".
	 * 
	 * @param status
	 *            The selection status to set.
	 */
	public void setAddElement(boolean status) {
		btn.setSelection(status);
		onStatusChanged(status);
	}
}
