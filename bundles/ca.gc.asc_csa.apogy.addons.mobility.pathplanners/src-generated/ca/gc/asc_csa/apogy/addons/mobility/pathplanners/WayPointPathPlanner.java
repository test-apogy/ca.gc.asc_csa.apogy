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

import ca.gc.asc_csa.apogy.addons.geometry.paths.WayPointPath;

import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSet;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates;

import ca.gc.asc_csa.apogy.common.processors.Processor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Way Point Path Planner</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * A path planner that produces a WayPoinPath.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.WayPointPathPlanner#getCurrentPosition <em>Current Position</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.WayPointPathPlanner#getCurrentDestination <em>Current Destination</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.ApogyAddonsMobilityPathplannersPackage#getWayPointPathPlanner()
 * @model
 * @generated
 */
public interface WayPointPathPlanner extends Processor<CartesianCoordinatesSet, WayPointPath> {
	/**
	 * Returns the value of the '<em><b>Current Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Position</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Position</em>' reference.
	 * @see #setCurrentPosition(CartesianPositionCoordinates)
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.ApogyAddonsMobilityPathplannersPackage#getWayPointPathPlanner_CurrentPosition()
	 * @model transient="true"
	 * @generated
	 */
	CartesianPositionCoordinates getCurrentPosition();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.WayPointPathPlanner#getCurrentPosition <em>Current Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Position</em>' reference.
	 * @see #getCurrentPosition()
	 * @generated
	 */
	void setCurrentPosition(CartesianPositionCoordinates value);

	/**
	 * Returns the value of the '<em><b>Current Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Destination</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Destination</em>' reference.
	 * @see #setCurrentDestination(CartesianPositionCoordinates)
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.ApogyAddonsMobilityPathplannersPackage#getWayPointPathPlanner_CurrentDestination()
	 * @model transient="true"
	 * @generated
	 */
	CartesianPositionCoordinates getCurrentDestination();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.WayPointPathPlanner#getCurrentDestination <em>Current Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Destination</em>' reference.
	 * @see #getCurrentDestination()
	 * @generated
	 */
	void setCurrentDestination(CartesianPositionCoordinates value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" exceptions="ca.gc.asc_csa.apogy.common.processors.Exception" currentPositionUnique="false" destinationPositionUnique="false"
	 * @generated
	 */
	WayPointPath plan(CartesianPositionCoordinates currentPosition, CartesianPositionCoordinates destinationPosition) throws Exception;

} // WayPointPathPlanner
