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

import java.util.ArrayList;
import java.util.List;

import javax.vecmath.Point3d;
import javax.vecmath.Vector3d;

import org.eclipse.emf.ecore.EClass;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFactory;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DPackage;
import ca.gc.asc_csa.apogy.common.geometry.data3d.NormalPointCloud;
import ca.gc.asc_csa.apogy.common.geometry.data3d.TriangularMeshNormalsCalculator;
import ca.gc.asc_csa.apogy.common.geometry.data3d.TriangularMeshToNormalPointCloud;
import ca.gc.asc_csa.apogy.common.processors.impl.ProcessorImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Triangular Mesh2 Normal Point Cloud</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class TriangularMeshToNormalPointCloudImpl extends
		ProcessorImpl<CartesianTriangularMesh, NormalPointCloud> implements
		TriangularMeshToNormalPointCloud {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected TriangularMeshToNormalPointCloudImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCommonGeometryData3DPackage.Literals.TRIANGULAR_MESH_TO_NORMAL_POINT_CLOUD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setInput(CartesianTriangularMesh newInput) {
		super.setInput(newInput);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setOutput(NormalPointCloud newOutput) {
		super.setOutput(newOutput);
	}

	@Override
	public NormalPointCloud process(CartesianTriangularMesh input)
			throws Exception {

		NormalPointCloud output = ApogyCommonGeometryData3DFactory.eINSTANCE
				.createNormalPointCloud();

		List<Vector3d> normals = null;

		// We extract the points from input.
		List<Point3d> points = new ArrayList<Point3d>(input.getPoints().size());

		for (CartesianPositionCoordinates point : input.getPoints()) {
			points.add(point.asPoint3d());
		}

		// If the normals are not present, we compute the normals.
		if (input.getNormals() == null
				|| input.getNormals().size() != input.getPoints().size()) {
			// We compute the normals.
			TriangularMeshNormalsCalculator normalsCalculator = ApogyCommonGeometryData3DFactory.eINSTANCE
					.createTriangularMeshNormalsCalculator();
			input = normalsCalculator.process(input);
		}

		// We process the normals.
		if (input.getNormals() != null && input.getNormals().size() > 0) {
			normals = new ArrayList<Vector3d>(input.getNormals().size());

			for (Vector3d normal : input.getNormals()) {
				normals.add(new Vector3d(normal));
			}
		}

		output.setPoints(points);
		output.setNormals(normals);

		return output;
	}

} // TriangularMeshToNormalPointCloudImpl
