/**
 * Canadian Space Agency 2007.
 *
 * $Id: CartesianCoordinatesMeshImpl.java,v 1.2.4.4 2015/08/13 19:12:08 pallard Exp $
 */
package org.eclipse.symphony.common.geometry.data3d.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.symphony.common.geometry.data.impl.MeshImpl;
import org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesMesh;
import org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesSet;
import org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesSetExtent;
import org.eclipse.symphony.common.geometry.data3d.CartesianPolygon;
import org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates;
import org.eclipse.symphony.common.geometry.data3d.Data3dPackage;

import java.lang.reflect.InvocationTargetException;

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
