/**
 * Canadian Space Agency 2007.
 *
 * $Id: SpericalCoordinatesMeshImpl.java,v 1.2.4.2 2015/05/21 15:50:49 pallard Exp $
 */
package ca.gc.space.mrt.geometry.data3d.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;

import ca.gc.space.mrt.geometry.data.impl.MeshImpl;
import ca.gc.space.mrt.geometry.data3d.Data3dPackage;
import ca.gc.space.mrt.geometry.data3d.SpericalCoordinatesMesh;
import ca.gc.space.mrt.geometry.data3d.SphericalCoordinates;
import ca.gc.space.mrt.geometry.data3d.SphericalPolygon;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sperical Coordinates Mesh</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SpericalCoordinatesMeshImpl extends MeshImpl<SphericalCoordinates, SphericalPolygon> implements SpericalCoordinatesMesh {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Canadian Space Agency 2008.";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpericalCoordinatesMeshImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Data3dPackage.Literals.SPERICAL_COORDINATES_MESH;
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
			polygons = new EObjectContainmentEList<SphericalPolygon>(SphericalPolygon.class, this, Data3dPackage.SPERICAL_COORDINATES_MESH__POLYGONS);
		}
		return polygons;
	}

} //SpericalCoordinatesMeshImpl
