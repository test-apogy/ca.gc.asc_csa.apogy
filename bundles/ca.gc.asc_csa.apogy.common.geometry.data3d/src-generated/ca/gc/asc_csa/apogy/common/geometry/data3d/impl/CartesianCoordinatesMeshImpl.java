/**
 * Canadian Space Agency 2007.
 *
 * $Id: CartesianCoordinatesMeshImpl.java,v 1.2.4.4 2015/08/13 19:12:08 pallard Exp $
 */
package ca.gc.asc_csa.apogy.common.geometry.data3d.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import ca.gc.asc_csa.apogy.common.geometry.data.impl.MeshImpl;
import ca.gc.asc_csa.apogy.common.geometry.data3d.AbstractCartesianCoordinatesSet;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesMesh;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSet;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSetExtent;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPolygon;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates;
import ca.gc.asc_csa.apogy.common.geometry.data3d.Geometry3DUtilities;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cartesian Coordinates Mesh</b></em>'.
 * <!-- end-user-doc -->
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
		return ApogyCommonGeometryData3DPackage.Literals.CARTESIAN_COORDINATES_MESH;
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
			polygons = new EObjectContainmentEList<CartesianPolygon>(CartesianPolygon.class, this, ApogyCommonGeometryData3DPackage.CARTESIAN_COORDINATES_MESH__POLYGONS);
		}
		return polygons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public CartesianCoordinatesSetExtent getExtent() 
	{
		return Geometry3DUtilities.getCartesianCoordinatesSetExtent(getPoints());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == AbstractCartesianCoordinatesSet.class) {
			switch (baseOperationID) {
				case ApogyCommonGeometryData3DPackage.ABSTRACT_CARTESIAN_COORDINATES_SET___GET_EXTENT: return ApogyCommonGeometryData3DPackage.CARTESIAN_COORDINATES_MESH___GET_EXTENT;
				default: return -1;
			}
		}
		if (baseClass == CartesianCoordinatesSet.class) {
			switch (baseOperationID) {
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
			case ApogyCommonGeometryData3DPackage.CARTESIAN_COORDINATES_MESH___GET_EXTENT:
				return getExtent();
		}
		return super.eInvoke(operationID, arguments);
	}
} //CartesianCoordinatesMeshImpl
