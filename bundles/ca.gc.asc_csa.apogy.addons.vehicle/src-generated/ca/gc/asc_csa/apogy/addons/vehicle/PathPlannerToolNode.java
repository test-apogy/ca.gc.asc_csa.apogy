/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package org.eclipse.symphony.addons.vehicle;

import org.eclipse.symphony.common.topology.AggregateGroupNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Path Planner Tool Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.vehicle.PathPlannerToolNode#getPathPlannerTool <em>Path Planner Tool</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.addons.vehicle.Symphony__AddonsVehiclePackage#getPathPlannerToolNode()
 * @model
 * @generated
 */
public interface PathPlannerToolNode extends AggregateGroupNode {
	/**
	 * Returns the value of the '<em><b>Path Planner Tool</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.symphony.addons.vehicle.PathPlannerTool#getPathPlannerToolNode <em>Path Planner Tool Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path Planner Tool</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path Planner Tool</em>' reference.
	 * @see #setPathPlannerTool(PathPlannerTool)
	 * @see org.eclipse.symphony.addons.vehicle.Symphony__AddonsVehiclePackage#getPathPlannerToolNode_PathPlannerTool()
	 * @see org.eclipse.symphony.addons.vehicle.PathPlannerTool#getPathPlannerToolNode
	 * @model opposite="pathPlannerToolNode" transient="true"
	 * @generated
	 */
	PathPlannerTool getPathPlannerTool();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.vehicle.PathPlannerToolNode#getPathPlannerTool <em>Path Planner Tool</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path Planner Tool</em>' reference.
	 * @see #getPathPlannerTool()
	 * @generated
	 */
	void setPathPlannerTool(PathPlannerTool value);

} // PathPlannerToolNode
