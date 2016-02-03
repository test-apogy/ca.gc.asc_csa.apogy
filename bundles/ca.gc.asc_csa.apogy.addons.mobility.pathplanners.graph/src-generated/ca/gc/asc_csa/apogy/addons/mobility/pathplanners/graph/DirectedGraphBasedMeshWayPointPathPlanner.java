package ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph;
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

import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPolygon;

import org.jgrapht.DirectedGraph;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Directed Graph Based Mesh Way Point Path Planner</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.DirectedGraphBasedMeshWayPointPathPlanner#getDirectedGraph <em>Directed Graph</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.ApogyAddonsMobilityPathplannersGraphPackage#getDirectedGraphBasedMeshWayPointPathPlanner()
 * @model
 * @generated
 */
public interface DirectedGraphBasedMeshWayPointPathPlanner<PolygonType extends CartesianPolygon> extends CostBasedMeshWayPointPathPlanner<PolygonType> {
	/**
	 * Returns the value of the '<em><b>Directed Graph</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Directed Graph</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Directed Graph</em>' attribute.
	 * @see #isSetDirectedGraph()
	 * @see #unsetDirectedGraph()
	 * @see #setDirectedGraph(DirectedGraph)
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.ApogyAddonsMobilityPathplannersGraphPackage#getDirectedGraphBasedMeshWayPointPathPlanner_DirectedGraph()
	 * @model unique="false" unsettable="true" dataType="ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.DirectedGraph" transient="true"
	 * @generated
	 */
	DirectedGraph<?, ?> getDirectedGraph();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.DirectedGraphBasedMeshWayPointPathPlanner#getDirectedGraph <em>Directed Graph</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Directed Graph</em>' attribute.
	 * @see #isSetDirectedGraph()
	 * @see #unsetDirectedGraph()
	 * @see #getDirectedGraph()
	 * @generated
	 */
	void setDirectedGraph(DirectedGraph<?, ?> value);

	/**
	 * Unsets the value of the '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.DirectedGraphBasedMeshWayPointPathPlanner#getDirectedGraph <em>Directed Graph</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDirectedGraph()
	 * @see #getDirectedGraph()
	 * @see #setDirectedGraph(DirectedGraph)
	 * @generated
	 */
	void unsetDirectedGraph();

	/**
	 * Returns whether the value of the '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.DirectedGraphBasedMeshWayPointPathPlanner#getDirectedGraph <em>Directed Graph</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Directed Graph</em>' attribute is set.
	 * @see #unsetDirectedGraph()
	 * @see #getDirectedGraph()
	 * @see #setDirectedGraph(DirectedGraph)
	 * @generated
	 */
	boolean isSetDirectedGraph();

} // DirectedGraphBasedMeshWayPointPathPlanner
