/**
 * Canadian Space Agency 2008.
 *
 * $Id: DirectedGraphBasedMeshWayPointPathPlanner.java,v 1.2.4.2 2015/05/21 15:50:20 pallard Exp $
 */
package ca.gc.space.mrt.mobility.pathplanners.graph;

import org.jgrapht.DirectedGraph;

import ca.gc.space.mrt.geometry.data3d.CartesianPolygon;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Directed Graph Based Mesh Way Point Path Planner</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.space.mrt.mobility.pathplanners.graph.DirectedGraphBasedMeshWayPointPathPlanner#getDirectedGraph <em>Directed Graph</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.space.mrt.mobility.pathplanners.graph.PathplannersGraphPackage#getDirectedGraphBasedMeshWayPointPathPlanner()
 * @model
 * @generated
 */
public interface DirectedGraphBasedMeshWayPointPathPlanner<PolygonType extends CartesianPolygon> extends CostBasedMeshWayPointPathPlanner<PolygonType> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Canadian Space Agency 2008.";

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
	 * @see ca.gc.space.mrt.mobility.pathplanners.graph.PathplannersGraphPackage#getDirectedGraphBasedMeshWayPointPathPlanner_DirectedGraph()
	 * @model unsettable="true" dataType="ca.gc.space.mrt.mobility.pathplanners.graph.DirectedGraph" transient="true"
	 * @generated
	 */
	DirectedGraph getDirectedGraph();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.mobility.pathplanners.graph.DirectedGraphBasedMeshWayPointPathPlanner#getDirectedGraph <em>Directed Graph</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Directed Graph</em>' attribute.
	 * @see #isSetDirectedGraph()
	 * @see #unsetDirectedGraph()
	 * @see #getDirectedGraph()
	 * @generated
	 */
	void setDirectedGraph(DirectedGraph value);

	/**
	 * Unsets the value of the '{@link ca.gc.space.mrt.mobility.pathplanners.graph.DirectedGraphBasedMeshWayPointPathPlanner#getDirectedGraph <em>Directed Graph</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDirectedGraph()
	 * @see #getDirectedGraph()
	 * @see #setDirectedGraph(DirectedGraph)
	 * @generated
	 */
	void unsetDirectedGraph();

	/**
	 * Returns whether the value of the '{@link ca.gc.space.mrt.mobility.pathplanners.graph.DirectedGraphBasedMeshWayPointPathPlanner#getDirectedGraph <em>Directed Graph</em>}' attribute is set.
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
