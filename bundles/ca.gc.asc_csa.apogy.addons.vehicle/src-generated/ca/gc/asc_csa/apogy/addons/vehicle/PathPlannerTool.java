package ca.gc.asc_csa.apogy.addons.vehicle;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import ca.gc.asc_csa.apogy.addons.AbstractTwoPoints3DTool;
import ca.gc.asc_csa.apogy.addons.geometry.paths.WayPointPath;
import ca.gc.asc_csa.apogy.addons.mobility.pathplanners.MeshWayPointPathPlanner;
import ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshMapLayer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Path Planner Tool</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.vehicle.PathPlannerTool#isBusy <em>Busy</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.vehicle.PathPlannerTool#isAutoPathPlanEnabled <em>Auto Path Plan Enabled</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.vehicle.PathPlannerTool#getMeshLayer <em>Mesh Layer</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.vehicle.PathPlannerTool#getPathPlanner <em>Path Planner</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.vehicle.PathPlannerTool#getPlannedPath <em>Planned Path</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.vehicle.PathPlannerTool#getPathPlannerToolNode <em>Path Planner Tool Node</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.addons.vehicle.ApogyAddonsVehiclePackage#getPathPlannerTool()
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
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.ApogyAddonsVehiclePackage#getPathPlannerTool_Busy()
	 * @model default="false" unique="false" transient="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' property='Readonly'"
	 * @generated
	 */
	boolean isBusy();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.vehicle.PathPlannerTool#isBusy <em>Busy</em>}' attribute.
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
	 * Whether or not automatic path planning is enabled. When enabled, chnaging the destination will automatically
	 * start a replan of the path.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Auto Path Plan Enabled</em>' attribute.
	 * @see #setAutoPathPlanEnabled(boolean)
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.ApogyAddonsVehiclePackage#getPathPlannerTool_AutoPathPlanEnabled()
	 * @model default="false" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' property='Editable'"
	 * @generated
	 */
	boolean isAutoPathPlanEnabled();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.vehicle.PathPlannerTool#isAutoPathPlanEnabled <em>Auto Path Plan Enabled</em>}' attribute.
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
	 * The mesh layer to use to plan the path.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mesh Layer</em>' reference.
	 * @see #setMeshLayer(CartesianTriangularMeshMapLayer)
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.ApogyAddonsVehiclePackage#getPathPlannerTool_MeshLayer()
	 * @model
	 * @generated
	 */
	CartesianTriangularMeshMapLayer getMeshLayer();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.vehicle.PathPlannerTool#getMeshLayer <em>Mesh Layer</em>}' reference.
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
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.ApogyAddonsVehiclePackage#getPathPlannerTool_PathPlanner()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='true' notify='true'"
	 * @generated
	 */
	MeshWayPointPathPlanner getPathPlanner();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.vehicle.PathPlannerTool#getPathPlanner <em>Path Planner</em>}' containment reference.
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
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.ApogyAddonsVehiclePackage#getPathPlannerTool_PlannedPath()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='true' notify='true' property='Readonly'"
	 * @generated
	 */
	WayPointPath getPlannedPath();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.vehicle.PathPlannerTool#getPlannedPath <em>Planned Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Planned Path</em>' containment reference.
	 * @see #getPlannedPath()
	 * @generated
	 */
	void setPlannedPath(WayPointPath value);

	/**
	 * Returns the value of the '<em><b>Path Planner Tool Node</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.addons.vehicle.PathPlannerToolNode#getPathPlannerTool <em>Path Planner Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path Planner Tool Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path Planner Tool Node</em>' reference.
	 * @see #setPathPlannerToolNode(PathPlannerToolNode)
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.ApogyAddonsVehiclePackage#getPathPlannerTool_PathPlannerToolNode()
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.PathPlannerToolNode#getPathPlannerTool
	 * @model opposite="pathPlannerTool" transient="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' children='false' property='None' propertyCategory='TRAJECTORY_3D_TOOL'"
	 * @generated
	 */
	PathPlannerToolNode getPathPlannerToolNode();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.vehicle.PathPlannerTool#getPathPlannerToolNode <em>Path Planner Tool Node</em>}' reference.
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
	 * Method that plan a path from the variable current location to the specified destination and updates
	 * the planned path according to the result.
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 * @generated
	 */
	boolean planPath();
} // PathPlannerTool
