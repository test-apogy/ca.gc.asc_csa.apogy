package ca.gc.asc_csa.apogy.addons.mobility.pathplanners;
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

import ca.gc.asc_csa.apogy.common.geometry.data.Mesh;

import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPolygon;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mesh Way Point Path Planner</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * A path planner that produces a WayPoinPath based on a triangular mesh.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.MeshWayPointPathPlanner#getMesh <em>Mesh</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.ApogyAddonsMobilityPathplannersPackage#getMeshWayPointPathPlanner()
 * @model
 * @generated
 */
public interface MeshWayPointPathPlanner<T extends CartesianPolygon> extends WayPointPathPlanner {
	/**
	 * Returns the value of the '<em><b>Mesh</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mesh</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mesh</em>' reference.
	 * @see #setMesh(Mesh)
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.ApogyAddonsMobilityPathplannersPackage#getMeshWayPointPathPlanner_Mesh()
	 * @model transient="true"
	 * @generated
	 */
	Mesh<CartesianPositionCoordinates, CartesianPolygon> getMesh();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.MeshWayPointPathPlanner#getMesh <em>Mesh</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mesh</em>' reference.
	 * @see #getMesh()
	 * @generated
	 */
	void setMesh(Mesh<CartesianPositionCoordinates, CartesianPolygon> value);

} // MeshWayPointPathPlanner
