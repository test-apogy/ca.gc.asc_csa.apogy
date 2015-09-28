/**
 * Canadian Space Agency 2007.
 *
 * $Id: CartesianCoordinatesMeshImpl.java,v 1.2.4.5 2015/09/22 19:39:41 rlarcheveque Exp $
 */
package ca.gc.space.mrt.geometry.data3d.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;

import ca.gc.space.mrt.geometry.data.impl.MeshImpl;
import ca.gc.space.mrt.geometry.data3d.CartesianCoordinatesMesh;
import ca.gc.space.mrt.geometry.data3d.CartesianCoordinatesSet;
import ca.gc.space.mrt.geometry.data3d.CartesianCoordinatesSetExtent;
import ca.gc.space.mrt.geometry.data3d.CartesianPolygon;
import ca.gc.space.mrt.geometry.data3d.CartesianPositionCoordinates;
import ca.gc.space.mrt.geometry.data3d.Data3dPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cartesian Coordinates Mesh</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class CartesianCoordinatesMeshImpl extends MeshImpl<CartesianPositionCoordinates, CartesianPolygon> implements CartesianCoordinatesMesh {
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
	protected CartesianCoordinatesMeshImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Data3dPackage.Literals.CARTESIAN_COORDINATES_MESH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific element type known in this context.
	 * @generated
	 */
	@Override
	public EList<CartesianPolygon> getPolygons() {
		if (polygons == null) {
			polygons = new EObjectContainmentEList<CartesianPolygon>(CartesianPolygon.class, this, Data3dPackage.CARTESIAN_COORDINATES_MESH__POLYGONS);
		}
		return polygons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianCoordinatesSetExtent getExtent() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == CartesianCoordinatesSet.class) {
			switch (baseOperationID) {
				case Data3dPackage.CARTESIAN_COORDINATES_SET___GET_EXTENT: return Data3dPackage.CARTESIAN_COORDINATES_MESH___GET_EXTENT;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case Data3dPackage.CARTESIAN_COORDINATES_MESH___GET_EXTENT:
				return getExtent();
		}
		return super.eInvoke(operationID, arguments);
	}
} //CartesianCoordinatesMeshImpl
