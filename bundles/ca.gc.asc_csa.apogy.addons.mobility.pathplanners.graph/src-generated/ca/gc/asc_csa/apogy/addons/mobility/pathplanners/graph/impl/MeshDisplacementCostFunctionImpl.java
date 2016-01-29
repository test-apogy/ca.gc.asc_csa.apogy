/**
 * Canadian Space Agency 2008.
 *
 * $Id: MeshDisplacementCostFunctionImpl.java,v 1.2.4.2 2015/05/21 15:50:20 pallard Exp $
 */
package ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.CostBasedMeshWayPointPathPlanner;
import ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.MeshDisplacementCostFunction;
import ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.ApogyAddonsMobilityPathplannersGraphPackage;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPolygon;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mesh Displacement Cost Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.impl.MeshDisplacementCostFunctionImpl#getPlanner <em>Planner</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeshDisplacementCostFunctionImpl extends DisplacementCostFunctionImpl implements MeshDisplacementCostFunction {
	/**
	 * The cached value of the '{@link #getPlanner() <em>Planner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanner()
	 * @generated
	 * @ordered
	 */
	protected CostBasedMeshWayPointPathPlanner<? extends CartesianPolygon> planner;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeshDisplacementCostFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyAddonsMobilityPathplannersGraphPackage.Literals.MESH_DISPLACEMENT_COST_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public CostBasedMeshWayPointPathPlanner<? extends CartesianPolygon> getPlanner() {
		if (planner != null && planner.eIsProxy()) {
			InternalEObject oldPlanner = (InternalEObject)planner;
			planner = (CostBasedMeshWayPointPathPlanner<? extends CartesianPolygon>)eResolveProxy(oldPlanner);
			if (planner != oldPlanner) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyAddonsMobilityPathplannersGraphPackage.MESH_DISPLACEMENT_COST_FUNCTION__PLANNER, oldPlanner, planner));
			}
		}
		return planner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CostBasedMeshWayPointPathPlanner<? extends CartesianPolygon> basicGetPlanner() {
		return planner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlanner(CostBasedMeshWayPointPathPlanner<? extends CartesianPolygon> newPlanner) {
		CostBasedMeshWayPointPathPlanner<? extends CartesianPolygon> oldPlanner = planner;
		planner = newPlanner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsMobilityPathplannersGraphPackage.MESH_DISPLACEMENT_COST_FUNCTION__PLANNER, oldPlanner, planner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyAddonsMobilityPathplannersGraphPackage.MESH_DISPLACEMENT_COST_FUNCTION__PLANNER:
				if (resolve) return getPlanner();
				return basicGetPlanner();
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
			case ApogyAddonsMobilityPathplannersGraphPackage.MESH_DISPLACEMENT_COST_FUNCTION__PLANNER:
				setPlanner((CostBasedMeshWayPointPathPlanner<? extends CartesianPolygon>)newValue);
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
			case ApogyAddonsMobilityPathplannersGraphPackage.MESH_DISPLACEMENT_COST_FUNCTION__PLANNER:
				setPlanner((CostBasedMeshWayPointPathPlanner<? extends CartesianPolygon>)null);
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
			case ApogyAddonsMobilityPathplannersGraphPackage.MESH_DISPLACEMENT_COST_FUNCTION__PLANNER:
				return planner != null;
		}
		return super.eIsSet(featureID);
	}

} //MeshDisplacementCostFunctionImpl
