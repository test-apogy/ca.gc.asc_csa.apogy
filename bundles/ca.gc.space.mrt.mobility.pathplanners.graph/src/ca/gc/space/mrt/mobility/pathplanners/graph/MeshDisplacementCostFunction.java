/**
 * Canadian Space Agency 2008.
 *
 * $Id: MeshDisplacementCostFunction.java,v 1.2.4.2 2015/05/21 15:50:20 pallard Exp $
 */
package ca.gc.space.mrt.mobility.pathplanners.graph;

import ca.gc.space.mrt.geometry.data3d.CartesianPolygon;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mesh Displacement Cost Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.space.mrt.mobility.pathplanners.graph.MeshDisplacementCostFunction#getPlanner <em>Planner</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.space.mrt.mobility.pathplanners.graph.PathplannersGraphPackage#getMeshDisplacementCostFunction()
 * @model
 * @generated
 */
public interface MeshDisplacementCostFunction extends DisplacementCostFunction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Canadian Space Agency 2008.";

	/**
	 * Returns the value of the '<em><b>Planner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Planner</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Planner</em>' reference.
	 * @see #setPlanner(CostBasedMeshWayPointPathPlanner)
	 * @see ca.gc.space.mrt.mobility.pathplanners.graph.PathplannersGraphPackage#getMeshDisplacementCostFunction_Planner()
	 * @model
	 * @generated
	 */
	CostBasedMeshWayPointPathPlanner<? extends CartesianPolygon> getPlanner();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.mobility.pathplanners.graph.MeshDisplacementCostFunction#getPlanner <em>Planner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Planner</em>' reference.
	 * @see #getPlanner()
	 * @generated
	 */
	void setPlanner(CostBasedMeshWayPointPathPlanner<? extends CartesianPolygon> value);

} // MeshDisplacementCostFunction
