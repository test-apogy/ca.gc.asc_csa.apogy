/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.mobility.pathplanners.graph;

import org.eclipse.symphony.common.geometry.data3d.CartesianPolygon;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mesh Displacement Cost Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.mobility.pathplanners.graph.MeshDisplacementCostFunction#getPlanner <em>Planner</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.addons.mobility.pathplanners.graph.Symphony__AddonsMobilityPathplannersGraphPackage#getMeshDisplacementCostFunction()
 * @model
 * @generated
 */
public interface MeshDisplacementCostFunction extends DisplacementCostFunction {
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
	 * @see org.eclipse.symphony.addons.mobility.pathplanners.graph.Symphony__AddonsMobilityPathplannersGraphPackage#getMeshDisplacementCostFunction_Planner()
	 * @model
	 * @generated
	 */
	CostBasedMeshWayPointPathPlanner<? extends CartesianPolygon> getPlanner();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.mobility.pathplanners.graph.MeshDisplacementCostFunction#getPlanner <em>Planner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Planner</em>' reference.
	 * @see #getPlanner()
	 * @generated
	 */
	void setPlanner(CostBasedMeshWayPointPathPlanner<? extends CartesianPolygon> value);

} // MeshDisplacementCostFunction
