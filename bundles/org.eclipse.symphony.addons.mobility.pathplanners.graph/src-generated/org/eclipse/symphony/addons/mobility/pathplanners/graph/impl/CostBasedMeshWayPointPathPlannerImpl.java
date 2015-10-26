/**
 * Canadian Space Agency 2008.
 *
 * $Id: CostBasedMeshWayPointPathPlannerImpl.java,v 1.2.4.3 2015/09/22 19:39:37 rlarcheveque Exp $
 */
package org.eclipse.symphony.addons.mobility.pathplanners.graph.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.symphony.addons.mobility.pathplanners.graph.CostBasedMeshWayPointPathPlanner;
import org.eclipse.symphony.addons.mobility.pathplanners.graph.DisplacementCostFunction;
import org.eclipse.symphony.addons.mobility.pathplanners.graph.Symphony__AddonsMobilityPathplannersGraphPackage;
import org.eclipse.symphony.addons.mobility.pathplanners.impl.MeshWayPointPathPlannerImpl;
import org.eclipse.symphony.common.geometry.data3d.CartesianPolygon;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cost Based Mesh Way Point Path Planner</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.mobility.pathplanners.graph.impl.CostBasedMeshWayPointPathPlannerImpl#getCostFunctions <em>Cost Functions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CostBasedMeshWayPointPathPlannerImpl<PolygonType extends CartesianPolygon> extends MeshWayPointPathPlannerImpl<PolygonType> implements CostBasedMeshWayPointPathPlanner<PolygonType> {
	/**
	 * The cached value of the '{@link #getCostFunctions() <em>Cost Functions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<DisplacementCostFunction> costFunctions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CostBasedMeshWayPointPathPlannerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Symphony__AddonsMobilityPathplannersGraphPackage.Literals.COST_BASED_MESH_WAY_POINT_PATH_PLANNER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DisplacementCostFunction> getCostFunctions() {
		if (costFunctions == null) {
			costFunctions = new EObjectContainmentEList<DisplacementCostFunction>(DisplacementCostFunction.class, this, Symphony__AddonsMobilityPathplannersGraphPackage.COST_BASED_MESH_WAY_POINT_PATH_PLANNER__COST_FUNCTIONS);
		}
		return costFunctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Symphony__AddonsMobilityPathplannersGraphPackage.COST_BASED_MESH_WAY_POINT_PATH_PLANNER__COST_FUNCTIONS:
				return ((InternalEList<?>)getCostFunctions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Symphony__AddonsMobilityPathplannersGraphPackage.COST_BASED_MESH_WAY_POINT_PATH_PLANNER__COST_FUNCTIONS:
				return getCostFunctions();
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
			case Symphony__AddonsMobilityPathplannersGraphPackage.COST_BASED_MESH_WAY_POINT_PATH_PLANNER__COST_FUNCTIONS:
				getCostFunctions().clear();
				getCostFunctions().addAll((Collection<? extends DisplacementCostFunction>)newValue);
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
			case Symphony__AddonsMobilityPathplannersGraphPackage.COST_BASED_MESH_WAY_POINT_PATH_PLANNER__COST_FUNCTIONS:
				getCostFunctions().clear();
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
			case Symphony__AddonsMobilityPathplannersGraphPackage.COST_BASED_MESH_WAY_POINT_PATH_PLANNER__COST_FUNCTIONS:
				return costFunctions != null && !costFunctions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CostBasedMeshWayPointPathPlannerImpl
