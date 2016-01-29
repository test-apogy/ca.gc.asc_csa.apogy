/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.addons.vehicle;

import ca.gc.asc_csa.apogy.common.topology.AggregateGroupNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Path Planner Tool Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.vehicle.PathPlannerToolNode#getPathPlannerTool <em>Path Planner Tool</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.addons.vehicle.ApogyAddonsVehiclePackage#getPathPlannerToolNode()
 * @model
 * @generated
 */
public interface PathPlannerToolNode extends AggregateGroupNode {
	/**
	 * Returns the value of the '<em><b>Path Planner Tool</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.addons.vehicle.PathPlannerTool#getPathPlannerToolNode <em>Path Planner Tool Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path Planner Tool</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path Planner Tool</em>' reference.
	 * @see #setPathPlannerTool(PathPlannerTool)
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.ApogyAddonsVehiclePackage#getPathPlannerToolNode_PathPlannerTool()
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.PathPlannerTool#getPathPlannerToolNode
	 * @model opposite="pathPlannerToolNode" transient="true"
	 * @generated
	 */
	PathPlannerTool getPathPlannerTool();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.vehicle.PathPlannerToolNode#getPathPlannerTool <em>Path Planner Tool</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path Planner Tool</em>' reference.
	 * @see #getPathPlannerTool()
	 * @generated
	 */
	void setPathPlannerTool(PathPlannerTool value);

} // PathPlannerToolNode