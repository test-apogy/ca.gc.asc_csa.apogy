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

import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianOrientationCoordinates;

import ca.gc.asc_csa.apogy.common.math.Matrix3x3;

import ca.gc.asc_csa.apogy.common.topology.RotationNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Orientation Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.pose.OrientationSensor#getOrientationCoordinates <em>Orientation Coordinates</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.addons.sensors.pose.ApogyAddonsSensorsPosePackage#getOrientationSensor()
 * @model
 * @generated
 */
public interface OrientationSensor extends RotationNode, SelfPlaceSensor {
	/**
	 * Returns the value of the '<em><b>Orientation Coordinates</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orientation Coordinates</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientation Coordinates</em>' reference.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.pose.ApogyAddonsSensorsPosePackage#getOrientationSensor_OrientationCoordinates()
	 * @model transient="true" changeable="false" derived="true"
	 * @generated
	 */
	CartesianOrientationCoordinates getOrientationCoordinates();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="ca.gc.asc_csa.apogy.addons.sensors.pose.Exception" newOrientationUnique="false"
	 * @generated
	 */
	void resetOrientation(CartesianOrientationCoordinates newOrientation) throws Exception;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" matrixUnique="false"
	 * @generated
	 */
	CartesianOrientationCoordinates extractOrientationFromMatrix(Matrix3x3 matrix);

} // OrientationSensor
