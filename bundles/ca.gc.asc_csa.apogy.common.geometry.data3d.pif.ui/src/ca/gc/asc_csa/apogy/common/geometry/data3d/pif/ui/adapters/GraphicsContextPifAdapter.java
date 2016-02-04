package ca.gc.asc_csa.apogy.common.geometry.data3d.pif.ui.adapters;
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
import java.util.ArrayList;
import java.util.List;

import javax.vecmath.Point3f;

import org.eclipse.core.resources.IFile;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSet;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFactory;
import ca.gc.asc_csa.apogy.common.geometry.data3d.pif.PifReader;
import ca.gc.asc_csa.apogy.common.topology.ContentNode;
import ca.gc.asc_csa.apogy.common.topology.GroupNode;
import ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyFacade;
import ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyFactory;
import ca.gc.asc_csa.apogy.common.topology.ui.GraphicsContext;
import ca.gc.asc_csa.apogy.common.topology.ui.GraphicsContextAdapter;
import ca.gc.asc_csa.apogy.common.topology.ui.ApogyCommonTopologyUIFactory;

public class GraphicsContextPifAdapter implements GraphicsContextAdapter {

	public static final String SUPPORTED_EXTENSION = "pf";

	public GraphicsContextPifAdapter() {
	}

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

	@Override
	public GraphicsContext getAdapter(Object obj, Object context) {

		GraphicsContext grContext = null;

		if (isAdapterFor(obj)) {
			IFile file = (IFile) obj;

			// We import the file
			try {
				PifReader reader = new PifReader(file.getLocation()
						.toOSString());

				List<Point3f> points = reader.getPoints();

				// We convert the points into a cartesian coordinates set
				CartesianCoordinatesSet pts = ApogyCommonGeometryData3DFactory.eINSTANCE
						.createCartesianCoordinatesSet();

				List<CartesianPositionCoordinates> pointList = new ArrayList<CartesianPositionCoordinates>(
						points.size());

				for (Point3f p : points) {
					CartesianPositionCoordinates point = ApogyCommonGeometryData3DFacade.INSTANCE
							.createCartesianPositionCoordinates(p.getX(),
									p.getY(), p.getZ());
					pointList.add(point);
				}

				pts.getPoints().addAll(pointList);

				// We create a topology
				GroupNode root = ApogyCommonTopologyFactory.eINSTANCE.createGroupNode();

				ContentNode<CartesianCoordinatesSet> pointNode = ApogyCommonTopologyFacade.INSTANCE
						.createContentNode(pts);

				root.getChildren().add(pointNode);

				// We create a graphics context
				grContext = ApogyCommonTopologyUIFactory.eINSTANCE.createGraphicsContext();
				grContext.setTopology(root);

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return grContext;
	}

	@Override
	public Class<?> getAdaptedClass() {
		return IFile.class;
	}

}
