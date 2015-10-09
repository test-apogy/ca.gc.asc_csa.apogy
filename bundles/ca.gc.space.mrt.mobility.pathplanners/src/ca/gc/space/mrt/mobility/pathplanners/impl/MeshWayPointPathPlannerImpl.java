/**
 * Canadian Space Agency 2007.
 *
 * $Id: MeshWayPointPathPlannerImpl.java,v 1.2.4.2 2015/05/21 15:50:52 pallard Exp $
 */
package ca.gc.space.mrt.mobility.pathplanners.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.common.geometry.data.Mesh;

import ca.gc.space.mrt.geometry.data3d.CartesianPolygon;
import ca.gc.space.mrt.geometry.data3d.CartesianPositionCoordinates;
import ca.gc.space.mrt.mobility.pathplanners.MeshWayPointPathPlanner;
import ca.gc.space.mrt.mobility.pathplanners.PathplannersPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mesh Way Point Path Planner</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.gc.space.mrt.mobility.pathplanners.impl.MeshWayPointPathPlannerImpl#getMesh <em>Mesh</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MeshWayPointPathPlannerImpl<T extends CartesianPolygon> extends WayPointPathPlannerImpl implements MeshWayPointPathPlanner<T> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Canadian Space Agency 2007.";

	/**
	 * The cached value of the '{@link #getMesh() <em>Mesh</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMesh()
	 * @generated
	 * @ordered
	 */
	protected Mesh<CartesianPositionCoordinates, CartesianPolygon> mesh;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeshWayPointPathPlannerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PathplannersPackage.Literals.MESH_WAY_POINT_PATH_PLANNER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public Mesh<CartesianPositionCoordinates, CartesianPolygon> getMesh() {
		if (mesh != null && mesh.eIsProxy()) {
			InternalEObject oldMesh = (InternalEObject)mesh;
			mesh = (Mesh<CartesianPositionCoordinates, CartesianPolygon>)eResolveProxy(oldMesh);
			if (mesh != oldMesh) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PathplannersPackage.MESH_WAY_POINT_PATH_PLANNER__MESH, oldMesh, mesh));
			}
		}
		return mesh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mesh<CartesianPositionCoordinates, CartesianPolygon> basicGetMesh() {
		return mesh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMesh(Mesh<CartesianPositionCoordinates, CartesianPolygon> newMesh)
	{
		Mesh<CartesianPositionCoordinates, CartesianPolygon> oldMesh = mesh;
		mesh = newMesh;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PathplannersPackage.MESH_WAY_POINT_PATH_PLANNER__MESH, oldMesh, mesh));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PathplannersPackage.MESH_WAY_POINT_PATH_PLANNER__MESH:
				if (resolve) return getMesh();
				return basicGetMesh();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PathplannersPackage.MESH_WAY_POINT_PATH_PLANNER__MESH:
				setMesh((Mesh<CartesianPositionCoordinates, CartesianPolygon>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PathplannersPackage.MESH_WAY_POINT_PATH_PLANNER__MESH:
				setMesh((Mesh<CartesianPositionCoordinates, CartesianPolygon>)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PathplannersPackage.MESH_WAY_POINT_PATH_PLANNER__MESH:
				return mesh != null;
		}
		return super.eIsSet(featureID);
	}

} //MeshWayPointPathPlannerImpl
