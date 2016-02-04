package ca.gc.asc_csa.apogy.common.geometry.data3d.xyz.ui.adapters;
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

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSet;
import ca.gc.asc_csa.apogy.common.geometry.data3d.Data3DIO;
import ca.gc.asc_csa.apogy.common.topology.ContentNode;
import ca.gc.asc_csa.apogy.common.topology.GroupNode;
import ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyFacade;
import ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyFactory;
import ca.gc.asc_csa.apogy.common.topology.ui.GraphicsContext;
import ca.gc.asc_csa.apogy.common.topology.ui.GraphicsContextAdapter;
import ca.gc.asc_csa.apogy.common.topology.ui.ApogyCommonTopologyUIFactory;

public class GraphicsContextXYZAdapter implements GraphicsContextAdapter {

	public static final String SUPPORTED_EXTENSION = "xyz";

	@Override
	public boolean isAdapterFor(Object obj) {

		boolean ok = false;

		// We respond to IFile selection ending with SUPPORTED_EXTENSION
		if (obj instanceof IFile) {
			IFile file = (IFile) obj;

			ok = file.getName().endsWith("." + SUPPORTED_EXTENSION);
		}

		return ok;
	}

	public GraphicsContextXYZAdapter() {

	}

	@SuppressWarnings("unused")
	@Override
	public GraphicsContext getAdapter(Object obj, Object context) {

		GraphicsContext ctx = null;

		if (isAdapterFor(obj)) {
			IProgressMonitor monitor = new NullProgressMonitor();

			if (context instanceof IProgressMonitor) {
				monitor = (IProgressMonitor) context;
			}

			IFile file = (IFile) obj;

			try {
				CartesianCoordinatesSet points = Data3DIO.INSTANCE.loadXYZ(file
						.getLocation().toOSString());

				GroupNode root = ApogyCommonTopologyFactory.eINSTANCE
						.createAggregateGroupNode();

				ContentNode<CartesianCoordinatesSet> content = ApogyCommonTopologyFacade.INSTANCE
						.createContentNode(points);

				root.getChildren().add(content);

				ctx = ApogyCommonTopologyUIFactory.eINSTANCE.createGraphicsContext();
				ctx.setTopology(root);

			} catch (IOException e) {
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
