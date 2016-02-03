package ca.gc.asc_csa.apogy.common.topology.ui.adapters;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import java.io.IOException;
import java.util.Collections;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import ca.gc.asc_csa.apogy.common.topology.GroupNode;
import ca.gc.asc_csa.apogy.common.topology.ui.GraphicsContext;
import ca.gc.asc_csa.apogy.common.topology.ui.GraphicsContextAdapter;
import ca.gc.asc_csa.apogy.common.topology.ui.ApogyCommonTopologyUIFactory;

public class TopoFileGraphicsContextAdapter implements GraphicsContextAdapter {

	private static final String SUPPORTED_EXTENSION = ".topo";

	public TopoFileGraphicsContextAdapter() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isAdapterFor(Object obj) {

		boolean adapterFor = false;

		if (obj instanceof IFile) {
			IFile file = (IFile) obj;
			adapterFor = file.getName().endsWith(SUPPORTED_EXTENSION);
		}

		return adapterFor;
	}

	@Override
	public GraphicsContext getAdapter(Object obj, Object context) {

		GraphicsContext ctx = null;

		if (isAdapterFor(obj)) {

			ctx = ApogyCommonTopologyUIFactory.eINSTANCE.createGraphicsContext();

			IProgressMonitor monitor = new NullProgressMonitor();

			if (context instanceof IProgressMonitor) {
				monitor = (IProgressMonitor) context;
			}

			IFile file = (IFile) obj;

			monitor.beginTask("Importing", 1);
			monitor.subTask("Loading file " + file.getName());

			XMIResource res = new XMIResourceImpl(URI.createFileURI(file
					.getLocation().toOSString()));

			try {
				res.load(Collections.EMPTY_MAP);

				EObject eObject = res.getContents().get(0);

				monitor.worked(1);

				if (eObject instanceof GroupNode) {
					GroupNode root = (GroupNode) eObject;

					ctx.setTopology(root);
				}

				monitor.done();
			} catch (IOException e) {
				monitor.done();
				e.printStackTrace();
			}

		}

		return ctx;
	}

	@Override
	public Class<?> getAdaptedClass() {
		return IFile.class;
	}

}
