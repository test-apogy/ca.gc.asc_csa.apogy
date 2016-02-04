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
