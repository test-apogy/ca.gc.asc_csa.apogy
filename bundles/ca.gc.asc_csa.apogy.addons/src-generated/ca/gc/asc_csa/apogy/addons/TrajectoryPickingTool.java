/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.addons;

import ca.gc.asc_csa.apogy.addons.geometry.paths.WayPointPath;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trajectory Picking Tool</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * A 3D tool used to define trajectories by piking point in the 3D world.
 * The tool support the creation of multiple path.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.TrajectoryPickingTool#getPaths <em>Paths</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.TrajectoryPickingTool#getActivePath <em>Active Path</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.TrajectoryPickingTool#getTrajectoryPickingToolNode <em>Trajectory Picking Tool Node</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.addons.ApogyAddonsPackage#getTrajectoryPickingTool()
 * @model
 * @generated
 */
public interface TrajectoryPickingTool extends Simple3DTool {
	/**
	 * Returns the value of the '<em><b>Paths</b></em>' containment reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.apogy.addons.geometry.paths.WayPointPath}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * All the  WayPointPath created with this tool.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Paths</em>' containment reference list.
	 * @see ca.gc.asc_csa.apogy.addons.ApogyAddonsPackage#getTrajectoryPickingTool_Paths()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' propertyCategory='TRAJECTORY_PICKING_TOOL'"
	 * @generated
	 */
	EList<WayPointPath> getPaths();

	/**
	 * Returns the value of the '<em><b>Active Path</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * The WayPointPath to which selected points are to be added.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Active Path</em>' reference.
	 * @see #setActivePath(WayPointPath)
	 * @see ca.gc.asc_csa.apogy.addons.ApogyAddonsPackage#getTrajectoryPickingTool_ActivePath()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' propertyCategory='TRAJECTORY_PICKING_TOOL'"
	 * @generated
	 */
	WayPointPath getActivePath();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.TrajectoryPickingTool#getActivePath <em>Active Path</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active Path</em>' reference.
	 * @see #getActivePath()
	 * @generated
	 */
	void setActivePath(WayPointPath value);

	/**
	 * Returns the value of the '<em><b>Trajectory Picking Tool Node</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.addons.TrajectoryPickingToolNode#getTrajectoryPickingTool <em>Trajectory Picking Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * The node representing the tool in the topology.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trajectory Picking Tool Node</em>' reference.
	 * @see #setTrajectoryPickingToolNode(TrajectoryPickingToolNode)
	 * @see ca.gc.asc_csa.apogy.addons.ApogyAddonsPackage#getTrajectoryPickingTool_TrajectoryPickingToolNode()
	 * @see ca.gc.asc_csa.apogy.addons.TrajectoryPickingToolNode#getTrajectoryPickingTool
	 * @model opposite="trajectoryPickingTool" transient="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' children='false' property='Readonly' propertyCategory='TRAJECTORY_PICKING_TOOL'"
	 * @generated
	 */
	TrajectoryPickingToolNode getTrajectoryPickingToolNode();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.TrajectoryPickingTool#getTrajectoryPickingToolNode <em>Trajectory Picking Tool Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trajectory Picking Tool Node</em>' reference.
	 * @see #getTrajectoryPickingToolNode()
	 * @generated
	 */
	void setTrajectoryPickingToolNode(TrajectoryPickingToolNode value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Clears all points from the active path.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void clearActivePath();

} // TrajectoryPickingTool
