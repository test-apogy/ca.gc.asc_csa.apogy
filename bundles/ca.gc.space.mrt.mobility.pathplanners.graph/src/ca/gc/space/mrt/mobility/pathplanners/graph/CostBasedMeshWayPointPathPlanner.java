/**
 * Canadian Space Agency 2008.
 *
 * $Id: CostBasedMeshWayPointPathPlanner.java,v 1.2.4.2 2015/05/21 15:50:20 pallard Exp $
 */
package ca.gc.space.mrt.mobility.pathplanners.graph;

import org.eclipse.emf.common.util.EList;

import ca.gc.space.mrt.geometry.data3d.CartesianPolygon;
import ca.gc.space.mrt.mobility.pathplanners.MeshWayPointPathPlanner;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cost Based Mesh Way Point Path Planner</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.space.mrt.mobility.pathplanners.graph.CostBasedMeshWayPointPathPlanner#getCostFunctions <em>Cost Functions</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.space.mrt.mobility.pathplanners.graph.PathplannersGraphPackage#getCostBasedMeshWayPointPathPlanner()
 * @model
 * @generated
 */
public interface CostBasedMeshWayPointPathPlanner<PolygonType extends CartesianPolygon> extends MeshWayPointPathPlanner<PolygonType> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Canadian Space Agency 2008.";

	/**
	 * Returns the value of the '<em><b>Cost Functions</b></em>' containment reference list.
	 * The list contents are of type {@link ca.gc.space.mrt.mobility.pathplanners.graph.DisplacementCostFunction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost Functions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost Functions</em>' containment reference list.
	 * @see ca.gc.space.mrt.mobility.pathplanners.graph.PathplannersGraphPackage#getCostBasedMeshWayPointPathPlanner_CostFunctions()
	 * @model containment="true"
	 * @generated
	 */
	EList<DisplacementCostFunction> getCostFunctions();

} // CostBasedMeshWayPointPathPlanner
