package ca.gc.asc_csa.apogy.common.geometry.data3d.impl;
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

import javax.vecmath.Vector3d;
import org.eclipse.emf.ecore.EClass;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSet;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangle;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFactory;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DPackage;
import ca.gc.asc_csa.apogy.common.geometry.data3d.DelaunayMesher;
import ca.gc.asc_csa.apogy.common.math.quickhull3d.QuickHull3D;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Delaunay Mesher</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class DelaunayMesherImpl extends CartesianPositionCoordinatesMesherImpl
		implements DelaunayMesher {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected DelaunayMesherImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCommonGeometryData3DPackage.Literals.DELAUNAY_MESHER;
	}

	@Override
	public CartesianTriangularMesh process(CartesianCoordinatesSet input)
			throws Exception {

		Vector3d[] inputPoints = new Vector3d[input.getPoints().size()];

		int i = 0;
		// We take the points and we keep only the x,y coordinate.
		for (CartesianPositionCoordinates point : input.getPoints()) {

			inputPoints[i] = new Vector3d(point.asPoint3d());
			inputPoints[i].z = 0.0;

			double newZ = inputPoints[i].lengthSquared();
			inputPoints[i].z = newZ;

			i++;
		}

		long t0 = System.currentTimeMillis();
		QuickHull3D qhull = new QuickHull3D(inputPoints);
		// qhull.setExplicitDistanceTolerance(0.0);

		qhull.triangulate();
		int[][] faces = qhull.getFaces();
		long t1 = System.currentTimeMillis();

		System.out
				.println("DelaunayMesherImpl.process() time to compute triangulation: "
						+ (t1 - t0));

		// We only keep the faces facing down.
		CartesianTriangularMesh mesh = ApogyCommonGeometryData3DFactory.eINSTANCE.createCartesianTriangularMesh();

		for (CartesianPositionCoordinates point : input.getPoints()) {
			double x = point.getX();
			double y = point.getY();
			double z = point.getZ();

			CartesianPositionCoordinates copy = ApogyCommonGeometryData3DFacade.INSTANCE
					.createCartesianPositionCoordinates(x, y, z);

			mesh.getPoints().add(copy);
		}

		for (i = 0; i < faces.length; i++) {

			if (faces[i].length == 3 && isLower(faces[i], inputPoints)) 
			{
				if (faces[i].length == 3) 
				{
					CartesianPositionCoordinates p0 = mesh.getPoints().get(faces[i][0]);
					CartesianPositionCoordinates p1 = mesh.getPoints().get(faces[i][1]);
					CartesianPositionCoordinates p2 = mesh.getPoints().get(faces[i][2]);

					CartesianTriangle triangle = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianTriangle(p2, p1, p0);

					mesh.getPolygons().add(triangle);
				}
			}

		}

		return mesh;
	}

	private boolean isLower(int[] face, Vector3d[] data) {

		Vector3d v0 = new Vector3d(data[face[1]]);

		Vector3d v1 = new Vector3d(data[face[2]]);

		v0.sub(data[face[0]]);
		v1.sub(data[face[0]]);

		Vector3d res = new Vector3d();
		res.cross(v0, v1);

		return res.z < 0.0;
	}

} // DelaunayMesherImpl
