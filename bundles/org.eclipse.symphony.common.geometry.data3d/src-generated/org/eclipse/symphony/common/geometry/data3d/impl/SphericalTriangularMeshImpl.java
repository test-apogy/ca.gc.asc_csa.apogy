/**
 * Canadian Space Agency 2008.
 *
 * $Id: SphericalTriangularMeshImpl.java,v 1.2.4.2 2015/05/21 15:50:49 pallard Exp $
 */
package org.eclipse.symphony.common.geometry.data3d.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.symphony.common.geometry.data.impl.MeshImpl;
import org.eclipse.symphony.common.geometry.data3d.Data3dPackage;
import org.eclipse.symphony.common.geometry.data3d.SphericalCoordinates;
import org.eclipse.symphony.common.geometry.data3d.SphericalTriangle;
import org.eclipse.symphony.common.geometry.data3d.SphericalTriangularMesh;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spherical Triangular Mesh</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SphericalTriangularMeshImpl extends MeshImpl<SphericalCoordinates, SphericalTriangle> implements SphericalTriangularMesh {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SphericalTriangularMeshImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Data3dPackage.Literals.SPHERICAL_TRIANGULAR_MESH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific element type known in this context.
	 * @generated
	 */
	@Override
	public EList<SphericalTriangle> getPolygons() {
		if (polygons == null) {
			polygons = new EObjectContainmentEList<SphericalTriangle>(SphericalTriangle.class, this, Data3dPackage.SPHERICAL_TRIANGULAR_MESH__POLYGONS);
		}
		return polygons;
	}

} //SphericalTriangularMeshImpl
