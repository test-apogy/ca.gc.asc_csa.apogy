package ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.impl;
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
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.DirectedGraphBasedMeshWayPointPathPlanner;
import ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.ApogyAddonsMobilityPathplannersGraphPackage;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPolygon;
import org.jgrapht.DirectedGraph;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Directed Graph Based Mesh Way Point Path Planner</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.impl.DirectedGraphBasedMeshWayPointPathPlannerImpl#getDirectedGraph <em>Directed Graph</em>}</li>
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
		return ApogyAddonsMobilityPathplannersGraphPackage.Literals.DIRECTED_GRAPH_BASED_MESH_WAY_POINT_PATH_PLANNER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsMobilityPathplannersGraphPackage.DIRECTED_GRAPH_BASED_MESH_WAY_POINT_PATH_PLANNER__DIRECTED_GRAPH, oldDirectedGraph, directedGraph, !oldDirectedGraphESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, ApogyAddonsMobilityPathplannersGraphPackage.DIRECTED_GRAPH_BASED_MESH_WAY_POINT_PATH_PLANNER__DIRECTED_GRAPH, oldDirectedGraph, null, oldDirectedGraphESet));
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
			case ApogyAddonsMobilityPathplannersGraphPackage.DIRECTED_GRAPH_BASED_MESH_WAY_POINT_PATH_PLANNER__DIRECTED_GRAPH:
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
			case ApogyAddonsMobilityPathplannersGraphPackage.DIRECTED_GRAPH_BASED_MESH_WAY_POINT_PATH_PLANNER__DIRECTED_GRAPH:
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
			case ApogyAddonsMobilityPathplannersGraphPackage.DIRECTED_GRAPH_BASED_MESH_WAY_POINT_PATH_PLANNER__DIRECTED_GRAPH:
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
			case ApogyAddonsMobilityPathplannersGraphPackage.DIRECTED_GRAPH_BASED_MESH_WAY_POINT_PATH_PLANNER__DIRECTED_GRAPH:
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
