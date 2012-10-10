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

import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.events.ExpansionEvent;
import org.eclipse.ui.forms.events.HyperlinkEvent;
import org.eclipse.ui.forms.events.IExpansionListener;
import org.eclipse.ui.forms.events.IHyperlinkListener;
import org.eclipse.ui.forms.widgets.ExpandableComposite;
import org.eclipse.ui.forms.widgets.Hyperlink;

import de.fujaba.newwizard.Messages;

/**
 * @author dstadnik
 */
public class PredefinedModelExtension implements ModelSelectionPageExtension {

	protected final ModelSelectionPage page;

	protected final List<URI> uris;

	public PredefinedModelExtension(ModelSelectionPage page, List<URI> uris) {
		this.page = page;
		this.uris = uris;
	}

	protected String getLabelText() {
		return Messages.PredefinedModelExtensionPredefinedModels;
	}

	public void createControl(Composite parent) {
		Composite plate = new Composite(parent, SWT.NONE);
		{
			GridData data = new GridData();
			data.horizontalAlignment = GridData.FILL;
			data.grabExcessHorizontalSpace = true;
			plate.setLayoutData(data);
		}
		plate.setLayout(new GridLayout());
		ExpandableComposite hlSection = new ExpandableComposite(plate, SWT.NONE, ExpandableComposite.TWISTIE);
		hlSection.setText(getLabelText());
		hlSection.setLayoutData(new GridData());
		Composite hlPlate = new Composite(hlSection, SWT.NONE);
		hlPlate.setLayout(new GridLayout());
		hlSection.setClient(hlPlate);
		hlSection.addExpansionListener(new IExpansionListener() {

			public void expansionStateChanged(ExpansionEvent e) {
				Composite pc = (Composite) page.getControl();
				pc.layout(true, true);
			}

			public void expansionStateChanging(ExpansionEvent e) {
			}
		});
		for (URI uri : uris) {
			createHyperlink(hlPlate, uri);
		}
	}

	protected Hyperlink createHyperlink(Composite parent, final URI uri) {
		final Hyperlink hyperlink = new Hyperlink(parent, SWT.NONE);
		hyperlink.setForeground(page.getShell().getDisplay().getSystemColor(SWT.COLOR_BLUE));
		hyperlink.setText(uri.toString());
		hyperlink.addHyperlinkListener(new IHyperlinkListener() {

			public void linkActivated(HyperlinkEvent e) {
				setPredefinedModelURI(uri);
			}

			public void linkEntered(HyperlinkEvent e) {
				hyperlink.setUnderlined(true);
			}

			public void linkExited(HyperlinkEvent e) {
				hyperlink.setUnderlined(false);
			}
		});
		GridData data = new GridData();
		hyperlink.setLayoutData(data);
		return hyperlink;
	}

	protected void setPredefinedModelURI(URI uri) {
		page.setURI(uri);
		page.updateURI();
	}

	public void setResource(Resource resource) {
	}
}
