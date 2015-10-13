/**
 * Canadian Space Agency 2007.
 *
 * $Id: SphericalCoordinatesMeshImpl.java,v 1.2.4.2 2015/05/21 15:50:49 pallard Exp $
 */
package org.eclipse.symphony.common.geometry.data3d.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.symphony.common.geometry.data.impl.MeshImpl;
import org.eclipse.symphony.common.geometry.data3d.Data3dPackage;
import org.eclipse.symphony.common.geometry.data3d.SphericalCoordinates;
import org.eclipse.symphony.common.geometry.data3d.SphericalCoordinatesMesh;
import org.eclipse.symphony.common.geometry.data3d.SphericalPolygon;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sperical Coordinates Mesh</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SphericalCoordinatesMeshImpl extends MeshImpl<SphericalCoordinates, SphericalPolygon> implements SphericalCoordinatesMesh {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SphericalCoordinatesMeshImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Data3dPackage.Literals.SPHERICAL_COORDINATES_MESH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific element type known in this context.
	 * @generated
	 */
	@Override
	public EList<SphericalPolygon> getPolygons() {
		if (polygons == null) {
			polygons = new EObjectContainmentEList<SphericalPolygon>(SphericalPolygon.class, this, Data3dPackage.SPHERICAL_COORDINATES_MESH__POLYGONS);
		}
		return polygons;
	}

} //SphericalCoordinatesMeshImpl
