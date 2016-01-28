/**
 * Canadian Space Agency 2008.
 *
 * $Id: TriangularMeshToNormalPointCloudImpl.java,v 1.2.4.2 2015/05/21 15:50:49 pallard Exp $
 */
package org.eclipse.symphony.common.geometry.data3d.impl;

import java.util.ArrayList;
import java.util.List;

import javax.vecmath.Point3d;
import javax.vecmath.Vector3d;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates;
import org.eclipse.symphony.common.geometry.data3d.CartesianTriangularMesh;
import org.eclipse.symphony.common.geometry.data3d.Symphony__CommonGeometryData3DFactory;
import org.eclipse.symphony.common.geometry.data3d.Symphony__CommonGeometryData3DPackage;
import org.eclipse.symphony.common.geometry.data3d.NormalPointCloud;
import org.eclipse.symphony.common.geometry.data3d.TriangularMeshNormalsCalculator;
import org.eclipse.symphony.common.geometry.data3d.TriangularMeshToNormalPointCloud;
import org.eclipse.symphony.common.processors.impl.ProcessorImpl;

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
		return Symphony__CommonGeometryData3DPackage.Literals.TRIANGULAR_MESH_TO_NORMAL_POINT_CLOUD;
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

		NormalPointCloud output = Symphony__CommonGeometryData3DFactory.eINSTANCE
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
			TriangularMeshNormalsCalculator normalsCalculator = Symphony__CommonGeometryData3DFactory.eINSTANCE
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
