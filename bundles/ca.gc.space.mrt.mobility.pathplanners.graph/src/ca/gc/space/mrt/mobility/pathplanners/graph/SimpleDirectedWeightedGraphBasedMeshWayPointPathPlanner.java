/**
 * Canadian Space Agency 2008.
 *
 * $Id: SimpleDirectedWeightedGraphBasedMeshWayPointPathPlanner.java,v 1.2.4.3 2015/09/22 19:39:37 rlarcheveque Exp $
 */
package ca.gc.space.mrt.mobility.pathplanners.graph;

import org.eclipse.symphony.common.geometry.data3d.CartesianPolygon;
import org.jgrapht.graph.SimpleDirectedWeightedGraph;

import ca.gc.space.mrt.common.processors.VerboseProvider;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Directed Weighted Graph Based Mesh Way Point Path Planner</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.space.mrt.mobility.pathplanners.graph.SimpleDirectedWeightedGraphBasedMeshWayPointPathPlanner#getSimpleDirectedWeightedGraph <em>Simple Directed Weighted Graph</em>}</li>
 *   <li>{@link ca.gc.space.mrt.mobility.pathplanners.graph.SimpleDirectedWeightedGraphBasedMeshWayPointPathPlanner#isEnablePathSimplification <em>Enable Path Simplification</em>}</li>
 *   <li>{@link ca.gc.space.mrt.mobility.pathplanners.graph.SimpleDirectedWeightedGraphBasedMeshWayPointPathPlanner#getRobotWidthForPathSimplication <em>Robot Width For Path Simplication</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.space.mrt.mobility.pathplanners.graph.PathplannersGraphPackage#getSimpleDirectedWeightedGraphBasedMeshWayPointPathPlanner()
 * @model
 * @generated
 */
public interface SimpleDirectedWeightedGraphBasedMeshWayPointPathPlanner<PolygonType extends CartesianPolygon> extends CostBasedMeshWayPointPathPlanner<PolygonType>, VerboseProvider {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Canadian Space Agency 2008.";

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
	 * @see ca.gc.space.mrt.mobility.pathplanners.graph.PathplannersGraphPackage#getSimpleDirectedWeightedGraphBasedMeshWayPointPathPlanner_SimpleDirectedWeightedGraph()
	 * @model dataType="ca.gc.space.mrt.mobility.pathplanners.graph.SimpleDirectedWeightedGraph" transient="true"
	 * @generated
	 */
	SimpleDirectedWeightedGraph getSimpleDirectedWeightedGraph();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.mobility.pathplanners.graph.SimpleDirectedWeightedGraphBasedMeshWayPointPathPlanner#getSimpleDirectedWeightedGraph <em>Simple Directed Weighted Graph</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simple Directed Weighted Graph</em>' attribute.
	 * @see #getSimpleDirectedWeightedGraph()
	 * @generated
	 */
	void setSimpleDirectedWeightedGraph(SimpleDirectedWeightedGraph value);

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
	 * @see ca.gc.space.mrt.mobility.pathplanners.graph.PathplannersGraphPackage#getSimpleDirectedWeightedGraphBasedMeshWayPointPathPlanner_EnablePathSimplification()
	 * @model default="true"
	 * @generated
	 */
	boolean isEnablePathSimplification();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.mobility.pathplanners.graph.SimpleDirectedWeightedGraphBasedMeshWayPointPathPlanner#isEnablePathSimplification <em>Enable Path Simplification</em>}' attribute.
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
	 * @see ca.gc.space.mrt.mobility.pathplanners.graph.PathplannersGraphPackage#getSimpleDirectedWeightedGraphBasedMeshWayPointPathPlanner_RobotWidthForPathSimplication()
	 * @model default="0.5"
	 * @generated
	 */
	double getRobotWidthForPathSimplication();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.mobility.pathplanners.graph.SimpleDirectedWeightedGraphBasedMeshWayPointPathPlanner#getRobotWidthForPathSimplication <em>Robot Width For Path Simplication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Robot Width For Path Simplication</em>' attribute.
	 * @see #getRobotWidthForPathSimplication()
	 * @generated
	 */
	void setRobotWidthForPathSimplication(double value);

} // SimpleDirectedWeightedGraphBasedMeshWayPointPathPlanner
