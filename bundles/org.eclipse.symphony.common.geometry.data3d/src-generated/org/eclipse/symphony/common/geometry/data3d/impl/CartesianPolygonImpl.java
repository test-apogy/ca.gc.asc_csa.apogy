/**
 * Canadian Space Agency 2007.
 *
 * $Id: CartesianPolygonImpl.java,v 1.2.4.2 2015/05/21 15:50:49 pallard Exp $
 */
package org.eclipse.symphony.common.geometry.data3d.impl;

import javax.vecmath.Vector3d;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectEList;
import org.eclipse.symphony.common.geometry.data.impl.PolygonImpl;
import org.eclipse.symphony.common.geometry.data3d.CartesianPolygon;
import org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates;
import org.eclipse.symphony.common.geometry.data3d.Symphony__CommonGeometryData3DPackage;
import org.eclipse.symphony.common.geometry.data3d.Geometry3DUtilities;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cartesian Polygon</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.impl.CartesianPolygonImpl#getSurface <em>Surface</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.impl.CartesianPolygonImpl#getNormal <em>Normal</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.impl.CartesianPolygonImpl#getCentroid <em>Centroid</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CartesianPolygonImpl extends PolygonImpl<CartesianPositionCoordinates> implements CartesianPolygon {
	/**
	 * The default value of the '{@link #getSurface() <em>Surface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurface()
	 * @generated
	 * @ordered
	 */
	protected static final double SURFACE_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getNormal() <em>Normal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormal()
	 * @generated
	 * @ordered
	 */
	protected static final Vector3d NORMAL_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CartesianPolygonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Symphony__CommonGeometryData3DPackage.Literals.CARTESIAN_POLYGON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific element type known in this context.
	 * @generated
	 */
	@Override
	public EList<CartesianPositionCoordinates> getVertices() {
		if (vertices == null) {
			vertices = new EObjectEList<CartesianPositionCoordinates>(CartesianPositionCoordinates.class, this, Symphony__CommonGeometryData3DPackage.CARTESIAN_POLYGON__VERTICES);
		}
		return vertices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public double getSurface() {
		return Geometry3DUtilities.getPolygonSurface(this.getVertices());		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Vector3d getNormal() {
		return Geometry3DUtilities.getPolygonNormal(this.getVertices());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public CartesianPositionCoordinates getCentroid() {
		CartesianPositionCoordinates centroid = basicGetCentroid();
		return centroid != null && centroid.eIsProxy() ? (CartesianPositionCoordinates)eResolveProxy((InternalEObject)centroid) : centroid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public CartesianPositionCoordinates basicGetCentroid() {
		return Geometry3DUtilities.getCentroid(this.getVertices());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Symphony__CommonGeometryData3DPackage.CARTESIAN_POLYGON__SURFACE:
				return getSurface();
			case Symphony__CommonGeometryData3DPackage.CARTESIAN_POLYGON__NORMAL:
				return getNormal();
			case Symphony__CommonGeometryData3DPackage.CARTESIAN_POLYGON__CENTROID:
				if (resolve) return getCentroid();
				return basicGetCentroid();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Symphony__CommonGeometryData3DPackage.CARTESIAN_POLYGON__SURFACE:
				return getSurface() != SURFACE_EDEFAULT;
			case Symphony__CommonGeometryData3DPackage.CARTESIAN_POLYGON__NORMAL:
				return NORMAL_EDEFAULT == null ? getNormal() != null : !NORMAL_EDEFAULT.equals(getNormal());
			case Symphony__CommonGeometryData3DPackage.CARTESIAN_POLYGON__CENTROID:
				return basicGetCentroid() != null;
		}
		return super.eIsSet(featureID);
	}

} //CartesianPolygonImpl
