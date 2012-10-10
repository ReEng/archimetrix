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

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ResourceListSelectionDialog;

/**
 * File selection utility methods.
 * 
 * @author dstadnik
 */
public class FileSelector {

	public static IFile selectFile(Shell shell, String description, IContainer rootElement, IFile selected) {
		return selectFile(shell, description, rootElement, selected, null);
	}

	public static IFile selectFile(Shell shell, String description, IContainer rootElement, IFile selected, final String fileExtension) {
		if (rootElement == null) {
			rootElement = ResourcesPlugin.getWorkspace().getRoot();
		}
		// final String fileName = selected == null || !selected.exists() ? "" : selected.getName();
		// ResourceSelectionDialog fsd = new ResourceSelectionDialog(shell, rootElement, description);
		ResourceListSelectionDialog fsd = new ResourceListSelectionDialog(shell, rootElement, IResource.FILE) {

			protected String adjustPattern() {
				String s = super.adjustPattern();
				if (s.equals("") && fileExtension != null) { //$NON-NLS-1$
					s = "*." + fileExtension; //$NON-NLS-1$
				}
				return s;
			}

			public void create() {
				super.create();
				refresh(true);
			}

			protected void updateOKState(boolean state) {
				super.updateOKState(true); // allow to select nothing
			}
		};
		fsd.setTitle(description);
		fsd.setAllowUserToToggleDerived(true);
		if (fsd.open() == Window.OK) {
			Object[] result = fsd.getResult();
			if (result != null && result.length > 0 && result[0] instanceof IFile) {
				selected = (IFile) result[0];
			} else {
				selected = null;
			}
		}
		return selected;
	}
}
