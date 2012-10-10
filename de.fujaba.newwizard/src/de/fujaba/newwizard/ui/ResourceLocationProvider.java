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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;

/**
 * Adapts selection to resource locations.
 * 
 * @author dstadnik
 */
public class ResourceLocationProvider {

	private final List<IResource> selectedResources;

	private final List<URI> selectedURIs;

	public ResourceLocationProvider(ISelection selection) {
		selectedResources = new ArrayList<IResource>();
		selectedURIs = new ArrayList<URI>();
		if (selection instanceof IStructuredSelection) {
			for (Object element : ((IStructuredSelection) selection).toList()) {
				if (element instanceof IResource) {
					selectedResources.add((IResource) element);
				} else if (element instanceof URI) {
					selectedURIs.add((URI) element);
				}
			}
		}
	}

	/**
	 * Returns selected files with specified extension.
	 * 
	 * @param explicit If true then if folder was selected looks for appropriate files in it.
	 */
	public List<IFile> getSelectedFiles(String extension, boolean explicit) {
		List<IFile> files = new ArrayList<IFile>();
		if (extension == null) {
			return files;
		}
		addFiles(files, selectedResources, extension);
		if (!explicit) {
			// add files from containers; they are at the end since explicitly selected files are more important
			addContainers(files, selectedResources, extension);
		}
		return files;
	}

	protected void addFiles(List<IFile> files, List<? extends IResource> resources, String extension) {
		for (IResource resource : resources) {
			if (resource instanceof IFile && extension.equals(((IFile) resource).getFileExtension())) {
				files.add((IFile) resource);
			}
		}
	}

	protected void addContainers(List<IFile> files, List<? extends IResource> resources, String extension) {
		for (IResource resource : resources) {
			if (resource instanceof IContainer) {
				try {
					List<IResource> members = Arrays.asList(((IContainer) resource).members());
					addFiles(files, members, extension);
				} catch (CoreException ce) {
					// ignore
				}
			}
		}
	}

	/**
	 * Returns selected resources with specified extension.
	 * 
	 * @param explicit If true then examines folders in selection.
	 */
	public List<URI> getSelectedURIs(String extension, boolean explicit) {
		List<URI> uris = new ArrayList<URI>();
		if (extension == null) {
			return uris;
		}
		for (URI uri : selectedURIs) {
			if (extension.equals(uri.fileExtension())) {
				uris.add(uri);
			}
		}
		// files follow uris since uris are more specific
		List<IFile> files = getSelectedFiles(extension, explicit);
		for (IFile file : files) {
			uris.add(URI.createPlatformResourceURI(file.getFullPath().toString(), true));
		}
		return uris;
	}

	public final List<URI> getSelectedURIs(String extension) {
		return getSelectedURIs(extension, false);
	}
}
