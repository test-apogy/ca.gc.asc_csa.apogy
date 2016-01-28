/**
 * Canadian Space Agency 2008.
 *
 * $Id: DirectedGraphBasedMeshWayPointPathPlannerImpl.java,v 1.2.4.2 2015/05/21 15:50:20 pallard Exp $
 */
package org.eclipse.symphony.addons.mobility.pathplanners.graph.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.addons.mobility.pathplanners.graph.DirectedGraphBasedMeshWayPointPathPlanner;
import org.eclipse.symphony.addons.mobility.pathplanners.graph.Symphony__AddonsMobilityPathplannersGraphPackage;
import org.eclipse.symphony.common.geometry.data3d.CartesianPolygon;
import org.jgrapht.DirectedGraph;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Directed Graph Based Mesh Way Point Path Planner</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.mobility.pathplanners.graph.impl.DirectedGraphBasedMeshWayPointPathPlannerImpl#getDirectedGraph <em>Directed Graph</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DirectedGraphBasedMeshWayPointPathPlannerImpl<PolygonType extends CartesianPolygon> extends CostBasedMeshWayPointPathPlannerImpl<PolygonType> implements DirectedGraphBasedMeshWayPointPathPlanner<PolygonType> {
	/**
	 * The cached value of the '{@link #getDirectedGraph() <em>Directed Graph</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectedGraph()
	 * @generated
	 * @ordered
	 */
	protected DirectedGraph<?, ?> directedGraph;

	/**
	 * This is true if the Directed Graph attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean directedGraphESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DirectedGraphBasedMeshWayPointPathPlannerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Symphony__AddonsMobilityPathplannersGraphPackage.Literals.DIRECTED_GRAPH_BASED_MESH_WAY_POINT_PATH_PLANNER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectedGraph<?, ?> getDirectedGraph() {
		return directedGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirectedGraph(DirectedGraph<?, ?> newDirectedGraph) {
		DirectedGraph<?, ?> oldDirectedGraph = directedGraph;
		directedGraph = newDirectedGraph;
		boolean oldDirectedGraphESet = directedGraphESet;
		directedGraphESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__AddonsMobilityPathplannersGraphPackage.DIRECTED_GRAPH_BASED_MESH_WAY_POINT_PATH_PLANNER__DIRECTED_GRAPH, oldDirectedGraph, directedGraph, !oldDirectedGraphESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDirectedGraph() {
		DirectedGraph<?, ?> oldDirectedGraph = directedGraph;
		boolean oldDirectedGraphESet = directedGraphESet;
		directedGraph = null;
		directedGraphESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Symphony__AddonsMobilityPathplannersGraphPackage.DIRECTED_GRAPH_BASED_MESH_WAY_POINT_PATH_PLANNER__DIRECTED_GRAPH, oldDirectedGraph, null, oldDirectedGraphESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDirectedGraph() {
		return directedGraphESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Symphony__AddonsMobilityPathplannersGraphPackage.DIRECTED_GRAPH_BASED_MESH_WAY_POINT_PATH_PLANNER__DIRECTED_GRAPH:
				return getDirectedGraph();
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
			case Symphony__AddonsMobilityPathplannersGraphPackage.DIRECTED_GRAPH_BASED_MESH_WAY_POINT_PATH_PLANNER__DIRECTED_GRAPH:
				setDirectedGraph((DirectedGraph<?, ?>)newValue);
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
			case Symphony__AddonsMobilityPathplannersGraphPackage.DIRECTED_GRAPH_BASED_MESH_WAY_POINT_PATH_PLANNER__DIRECTED_GRAPH:
				unsetDirectedGraph();
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
			case Symphony__AddonsMobilityPathplannersGraphPackage.DIRECTED_GRAPH_BASED_MESH_WAY_POINT_PATH_PLANNER__DIRECTED_GRAPH:
				return isSetDirectedGraph();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (directedGraph: ");
		if (directedGraphESet) result.append(directedGraph); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DirectedGraphBasedMeshWayPointPathPlannerImpl
