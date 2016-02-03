package ca.gc.asc_csa.apogy.addons.mobility.pathplanners.impl;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import ca.gc.asc_csa.apogy.addons.mobility.pathplanners.MeshWayPointPathPlanner;
import ca.gc.asc_csa.apogy.addons.mobility.pathplanners.ApogyAddonsMobilityPathplannersPackage;
import ca.gc.asc_csa.apogy.common.geometry.data.Mesh;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPolygon;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mesh Way Point Path Planner</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.impl.MeshWayPointPathPlannerImpl#getMesh <em>Mesh</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeshWayPointPathPlannerImpl<T extends CartesianPolygon> extends WayPointPathPlannerImpl implements MeshWayPointPathPlanner<T> {
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
		return ApogyAddonsMobilityPathplannersPackage.Literals.MESH_WAY_POINT_PATH_PLANNER;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyAddonsMobilityPathplannersPackage.MESH_WAY_POINT_PATH_PLANNER__MESH, oldMesh, mesh));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsMobilityPathplannersPackage.MESH_WAY_POINT_PATH_PLANNER__MESH, oldMesh, mesh));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyAddonsMobilityPathplannersPackage.MESH_WAY_POINT_PATH_PLANNER__MESH:
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
			case ApogyAddonsMobilityPathplannersPackage.MESH_WAY_POINT_PATH_PLANNER__MESH:
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
			case ApogyAddonsMobilityPathplannersPackage.MESH_WAY_POINT_PATH_PLANNER__MESH:
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
			case ApogyAddonsMobilityPathplannersPackage.MESH_WAY_POINT_PATH_PLANNER__MESH:
				return mesh != null;
		}
		return super.eIsSet(featureID);
	}

} //MeshWayPointPathPlannerImpl
