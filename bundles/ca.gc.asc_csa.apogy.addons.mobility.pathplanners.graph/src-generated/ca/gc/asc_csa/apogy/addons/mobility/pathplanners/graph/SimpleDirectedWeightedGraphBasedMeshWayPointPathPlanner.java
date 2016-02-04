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

import ca.gc.asc_csa.apogy.common.processors.VerboseProvider;

import org.jgrapht.graph.SimpleDirectedWeightedGraph;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Directed Weighted Graph Based Mesh Way Point Path Planner</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.SimpleDirectedWeightedGraphBasedMeshWayPointPathPlanner#getSimpleDirectedWeightedGraph <em>Simple Directed Weighted Graph</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.SimpleDirectedWeightedGraphBasedMeshWayPointPathPlanner#isEnablePathSimplification <em>Enable Path Simplification</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.SimpleDirectedWeightedGraphBasedMeshWayPointPathPlanner#getRobotWidthForPathSimplication <em>Robot Width For Path Simplication</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.ApogyAddonsMobilityPathplannersGraphPackage#getSimpleDirectedWeightedGraphBasedMeshWayPointPathPlanner()
 * @model
 * @generated
 */
public interface SimpleDirectedWeightedGraphBasedMeshWayPointPathPlanner<PolygonType extends CartesianPolygon> extends CostBasedMeshWayPointPathPlanner<PolygonType>, VerboseProvider {
	/**
	 * Returns the value of the '<em><b>Simple Directed Weighted Graph</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simple Directed Weighted Graph</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple Directed Weighted Graph</em>' attribute.
	 * @see #setSimpleDirectedWeightedGraph(SimpleDirectedWeightedGraph)
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.ApogyAddonsMobilityPathplannersGraphPackage#getSimpleDirectedWeightedGraphBasedMeshWayPointPathPlanner_SimpleDirectedWeightedGraph()
	 * @model unique="false" dataType="ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.SimpleDirectedWeightedGraph"
	 * @generated
	 */
	SimpleDirectedWeightedGraph<?, ?> getSimpleDirectedWeightedGraph();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.SimpleDirectedWeightedGraphBasedMeshWayPointPathPlanner#getSimpleDirectedWeightedGraph <em>Simple Directed Weighted Graph</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simple Directed Weighted Graph</em>' attribute.
	 * @see #getSimpleDirectedWeightedGraph()
	 * @generated
	 */
	void setSimpleDirectedWeightedGraph(SimpleDirectedWeightedGraph<?, ?> value);

	/**
	 * Returns the value of the '<em><b>Enable Path Simplification</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enable Path Simplification</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enable Path Simplification</em>' attribute.
	 * @see #setEnablePathSimplification(boolean)
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.ApogyAddonsMobilityPathplannersGraphPackage#getSimpleDirectedWeightedGraphBasedMeshWayPointPathPlanner_EnablePathSimplification()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isEnablePathSimplification();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.SimpleDirectedWeightedGraphBasedMeshWayPointPathPlanner#isEnablePathSimplification <em>Enable Path Simplification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable Path Simplification</em>' attribute.
	 * @see #isEnablePathSimplification()
	 * @generated
	 */
	void setEnablePathSimplification(boolean value);

	/**
	 * Returns the value of the '<em><b>Robot Width For Path Simplication</b></em>' attribute.
	 * The default value is <code>"0.5"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Robot Width For Path Simplication</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Robot Width For Path Simplication</em>' attribute.
	 * @see #setRobotWidthForPathSimplication(double)
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.ApogyAddonsMobilityPathplannersGraphPackage#getSimpleDirectedWeightedGraphBasedMeshWayPointPathPlanner_RobotWidthForPathSimplication()
	 * @model default="0.5" unique="false"
	 * @generated
	 */
	double getRobotWidthForPathSimplication();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.SimpleDirectedWeightedGraphBasedMeshWayPointPathPlanner#getRobotWidthForPathSimplication <em>Robot Width For Path Simplication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Robot Width For Path Simplication</em>' attribute.
	 * @see #getRobotWidthForPathSimplication()
	 * @generated
	 */
	void setRobotWidthForPathSimplication(double value);

} // SimpleDirectedWeightedGraphBasedMeshWayPointPathPlanner
