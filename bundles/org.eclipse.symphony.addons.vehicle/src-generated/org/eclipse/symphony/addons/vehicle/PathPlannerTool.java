/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package org.eclipse.symphony.addons.vehicle;

import org.eclipse.symphony.addons.AbstractTwoPoints3DTool;
import org.eclipse.symphony.addons.geometry.paths.WayPointPath;
import org.eclipse.symphony.addons.mobility.pathplanners.MeshWayPointPathPlanner;
import org.eclipse.symphony.core.environment.CartesianTriangularMeshMapLayer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Path Planner Tool</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.vehicle.PathPlannerTool#isBusy <em>Busy</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.vehicle.PathPlannerTool#isAutoPathPlanEnabled <em>Auto Path Plan Enabled</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.vehicle.PathPlannerTool#getMeshLayer <em>Mesh Layer</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.vehicle.PathPlannerTool#getPathPlanner <em>Path Planner</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.vehicle.PathPlannerTool#getPlannedPath <em>Planned Path</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.vehicle.PathPlannerTool#getPathPlannerToolNode <em>Path Planner Tool Node</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.addons.vehicle.SymphonyToolsVehiclePackage#getPathPlannerTool()
 * @model
 * @generated
 */
public interface PathPlannerTool extends AbstractTwoPoints3DTool {

	/**
	 * Returns the value of the '<em><b>Busy</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Busy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Busy</em>' attribute.
	 * @see #setBusy(boolean)
	 * @see org.eclipse.symphony.addons.vehicle.SymphonyToolsVehiclePackage#getPathPlannerTool_Busy()
	 * @model default="false" unique="false" transient="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' property='Readonly'"
	 * @generated
	 */
	boolean isBusy();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.vehicle.PathPlannerTool#isBusy <em>Busy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Busy</em>' attribute.
	 * @see #isBusy()
	 * @generated
	 */
	void setBusy(boolean value);

	/**
	 * Returns the value of the '<em><b>Auto Path Plan Enabled</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Whether or not automatic path planning is enabled. When enabled, chnaging the destination will automatically
	 * start a replan of the path.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Auto Path Plan Enabled</em>' attribute.
	 * @see #setAutoPathPlanEnabled(boolean)
	 * @see org.eclipse.symphony.addons.vehicle.SymphonyToolsVehiclePackage#getPathPlannerTool_AutoPathPlanEnabled()
	 * @model default="false" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' property='Editable'"
	 * @generated
	 */
	boolean isAutoPathPlanEnabled();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.vehicle.PathPlannerTool#isAutoPathPlanEnabled <em>Auto Path Plan Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Path Plan Enabled</em>' attribute.
	 * @see #isAutoPathPlanEnabled()
	 * @generated
	 */
	void setAutoPathPlanEnabled(boolean value);

	/**
	 * Returns the value of the '<em><b>Mesh Layer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mesh Layer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * The mesh layer to use to plan the path.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mesh Layer</em>' reference.
	 * @see #setMeshLayer(CartesianTriangularMeshMapLayer)
	 * @see org.eclipse.symphony.addons.vehicle.SymphonyToolsVehiclePackage#getPathPlannerTool_MeshLayer()
	 * @model
	 * @generated
	 */
	CartesianTriangularMeshMapLayer getMeshLayer();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.vehicle.PathPlannerTool#getMeshLayer <em>Mesh Layer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mesh Layer</em>' reference.
	 * @see #getMeshLayer()
	 * @generated
	 */
	void setMeshLayer(CartesianTriangularMeshMapLayer value);

	/**
	 * Returns the value of the '<em><b>Path Planner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path Planner</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path Planner</em>' containment reference.
	 * @see #setPathPlanner(MeshWayPointPathPlanner)
	 * @see org.eclipse.symphony.addons.vehicle.SymphonyToolsVehiclePackage#getPathPlannerTool_PathPlanner()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='true' notify='true'"
	 * @generated
	 */
	MeshWayPointPathPlanner getPathPlanner();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.vehicle.PathPlannerTool#getPathPlanner <em>Path Planner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path Planner</em>' containment reference.
	 * @see #getPathPlanner()
	 * @generated
	 */
	void setPathPlanner(MeshWayPointPathPlanner value);

	/**
	 * Returns the value of the '<em><b>Planned Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Planned Path</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Planned Path</em>' containment reference.
	 * @see #setPlannedPath(WayPointPath)
	 * @see org.eclipse.symphony.addons.vehicle.SymphonyToolsVehiclePackage#getPathPlannerTool_PlannedPath()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='true' notify='true' property='Readonly'"
	 * @generated
	 */
	WayPointPath getPlannedPath();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.vehicle.PathPlannerTool#getPlannedPath <em>Planned Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Planned Path</em>' containment reference.
	 * @see #getPlannedPath()
	 * @generated
	 */
	void setPlannedPath(WayPointPath value);

	/**
	 * Returns the value of the '<em><b>Path Planner Tool Node</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.symphony.addons.vehicle.PathPlannerToolNode#getPathPlannerTool <em>Path Planner Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path Planner Tool Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path Planner Tool Node</em>' reference.
	 * @see #setPathPlannerToolNode(PathPlannerToolNode)
	 * @see org.eclipse.symphony.addons.vehicle.SymphonyToolsVehiclePackage#getPathPlannerTool_PathPlannerToolNode()
	 * @see org.eclipse.symphony.addons.vehicle.PathPlannerToolNode#getPathPlannerTool
	 * @model opposite="pathPlannerTool" transient="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' children='false' property='None' propertyCategory='TRAJECTORY_3D_TOOL'"
	 * @generated
	 */
	PathPlannerToolNode getPathPlannerToolNode();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.vehicle.PathPlannerTool#getPathPlannerToolNode <em>Path Planner Tool Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path Planner Tool Node</em>' reference.
	 * @see #getPathPlannerToolNode()
	 * @generated
	 */
	void setPathPlannerToolNode(PathPlannerToolNode value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Method that plan a path from the variable current location to the specified destination and updates
	 * the planned path according to the result.
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 * @generated
	 */
	boolean planPath();
} // PathPlannerTool
