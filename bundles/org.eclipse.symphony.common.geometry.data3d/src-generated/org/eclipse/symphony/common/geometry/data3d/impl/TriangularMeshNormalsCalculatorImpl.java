/**
 * Canadian Space Agency 2008.
 *
 * $Id: TriangularMeshNormalsCalculatorImpl.java,v 1.2.4.2 2015/05/21 15:50:49 pallard Exp $
 */
package org.eclipse.symphony.common.geometry.data3d.impl;

import java.util.ArrayList;

import javax.vecmath.Vector3d;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates;
import org.eclipse.symphony.common.geometry.data3d.CartesianTriangle;
import org.eclipse.symphony.common.geometry.data3d.CartesianTriangularMesh;
import org.eclipse.symphony.common.geometry.data3d.Data3dPackage;
import org.eclipse.symphony.common.geometry.data3d.TriangularMeshNormalsCalculator;
import org.eclipse.symphony.common.processors.impl.ProcessorImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Triangular Mesh Normals Calculator</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class TriangularMeshNormalsCalculatorImpl extends
		ProcessorImpl<CartesianTriangularMesh, CartesianTriangularMesh>
		implements TriangularMeshNormalsCalculator {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected TriangularMeshNormalsCalculatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Data3dPackage.Literals.TRIANGULAR_MESH_NORMALS_CALCULATOR;
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
	public void setOutput(CartesianTriangularMesh newOutput) {
		super.setOutput(newOutput);
	}

	@Override
	public CartesianTriangularMesh process(CartesianTriangularMesh input)
			throws Exception {

		if (input == null) {
			throw new IllegalArgumentException("input is not specified");
		}

		if (input.getPolygons().size() > 0) {

			input.setNormals(new ArrayList<Vector3d>(input.getPoints().size()));

			// for every point in the mesh, we compute its normal.
			for (int i = 0; i < input.getPoints().size(); i++) {
				Vector3d normal = computeNormal(input, i);
				input.getNormals().add(normal);
			}
		}

		return input;
	}

	private Vector3d computeNormal(CartesianTriangularMesh mesh, int pointId) {
		Vector3d normal = new Vector3d(0.0, 0.0, 0.0);

		CartesianPositionCoordinates point = mesh.getPoints().get(pointId);

		// We get the polygons sharing this point.
		EList<CartesianTriangle> polygons = mesh.getPolygonsSharingPoint(point);

		int n = 0;

		if (polygons.size() >= 0) {

			for (CartesianTriangle triangle : polygons) {
				Vector3d ni = computeNormal(point, triangle);

				if (ni != null) {
					n++;
					normal.add(ni);
				}
			}
		}

		// We average the normal.
		if (n > 1) {
			normal.scale(1.0 / (double) n);
		}

		normal.normalize();

		return normal;
	}

	private Vector3d computeNormal(CartesianPositionCoordinates p0,
			CartesianTriangle triangle) {
		Vector3d normal = null;

		// We find p0 in triangle.
		int p0Index = triangle.getVertices().indexOf(p0);

		if (p0Index != -1) {
			int p1Index = (p0Index + 1) % 3;
			int p2Index = (p0Index + 2) % 3;

			Vector3d p1 = new Vector3d(triangle.getVertices().get(p1Index)
					.asPoint3d());

			Vector3d p2 = new Vector3d(triangle.getVertices().get(p2Index)
					.asPoint3d());

			// p1-p0
			p1.sub(p0.asPoint3d());

			// p2-p0
			p2.sub(p0.asPoint3d());

			normal = new Vector3d();
			normal.cross(p1, p2);

			normal.normalize();
		}

		return normal;

	}

} // TriangularMeshNormalsCalculatorImpl
