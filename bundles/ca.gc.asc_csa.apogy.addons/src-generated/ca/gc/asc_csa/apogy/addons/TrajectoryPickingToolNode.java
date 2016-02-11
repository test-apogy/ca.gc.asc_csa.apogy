/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.addons;

import ca.gc.asc_csa.apogy.common.topology.AggregateGroupNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trajectory Picking Tool Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Node representing the TrajectoryPickingTool in the topology.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.TrajectoryPickingToolNode#getTrajectoryPickingTool <em>Trajectory Picking Tool</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.addons.ApogyAddonsPackage#getTrajectoryPickingToolNode()
 * @model
 * @generated
 */
public interface TrajectoryPickingToolNode extends AggregateGroupNode {
	/**
	 * Returns the value of the '<em><b>Trajectory Picking Tool</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.addons.TrajectoryPickingTool#getTrajectoryPickingToolNode <em>Trajectory Picking Tool Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * The  TrajectoryPickingTool associated with this node.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trajectory Picking Tool</em>' reference.
	 * @see #setTrajectoryPickingTool(TrajectoryPickingTool)
	 * @see ca.gc.asc_csa.apogy.addons.ApogyAddonsPackage#getTrajectoryPickingToolNode_TrajectoryPickingTool()
	 * @see ca.gc.asc_csa.apogy.addons.TrajectoryPickingTool#getTrajectoryPickingToolNode
	 * @model opposite="trajectoryPickingToolNode" transient="true"
	 * @generated
	 */
	TrajectoryPickingTool getTrajectoryPickingTool();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.TrajectoryPickingToolNode#getTrajectoryPickingTool <em>Trajectory Picking Tool</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trajectory Picking Tool</em>' reference.
	 * @see #getTrajectoryPickingTool()
	 * @generated
	 */
	void setTrajectoryPickingTool(TrajectoryPickingTool value);

} // TrajectoryPickingToolNode
