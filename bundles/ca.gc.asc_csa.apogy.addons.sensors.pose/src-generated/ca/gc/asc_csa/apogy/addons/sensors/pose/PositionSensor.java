package ca.gc.asc_csa.apogy.addons.sensors.pose;
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

import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates;

import ca.gc.asc_csa.apogy.common.topology.PositionNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Position Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.pose.PositionSensor#getPositionCoordinates <em>Position Coordinates</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.addons.sensors.pose.ApogyAddonsSensorsPosePackage#getPositionSensor()
 * @model
 * @generated
 */
public interface PositionSensor extends PositionNode, SelfPlaceSensor {
	/**
	 * Returns the value of the '<em><b>Position Coordinates</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position Coordinates</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position Coordinates</em>' reference.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.pose.ApogyAddonsSensorsPosePackage#getPositionSensor_PositionCoordinates()
	 * @model transient="true" changeable="false" derived="true"
	 * @generated
	 */
	CartesianPositionCoordinates getPositionCoordinates();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="ca.gc.asc_csa.apogy.addons.sensors.pose.Exception" newPositionUnique="false"
	 * @generated
	 */
	void resetPosition(CartesianPositionCoordinates newPosition) throws Exception;

} // PositionSensor
