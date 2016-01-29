/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph;

import org.eclipse.emf.common.util.EList;

import ca.gc.asc_csa.apogy.addons.mobility.pathplanners.MeshWayPointPathPlanner;

import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPolygon;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cost Based Mesh Way Point Path Planner</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.CostBasedMeshWayPointPathPlanner#getCostFunctions <em>Cost Functions</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.ApogyAddonsMobilityPathplannersGraphPackage#getCostBasedMeshWayPointPathPlanner()
 * @model
 * @generated
 */
public interface CostBasedMeshWayPointPathPlanner<PolygonType extends CartesianPolygon> extends MeshWayPointPathPlanner<PolygonType> {
	/**
	 * Returns the value of the '<em><b>Cost Functions</b></em>' containment reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.DisplacementCostFunction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost Functions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost Functions</em>' containment reference list.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.ApogyAddonsMobilityPathplannersGraphPackage#getCostBasedMeshWayPointPathPlanner_CostFunctions()
	 * @model containment="true"
	 * @generated
	 */
	EList<DisplacementCostFunction> getCostFunctions();

} // CostBasedMeshWayPointPathPlanner
