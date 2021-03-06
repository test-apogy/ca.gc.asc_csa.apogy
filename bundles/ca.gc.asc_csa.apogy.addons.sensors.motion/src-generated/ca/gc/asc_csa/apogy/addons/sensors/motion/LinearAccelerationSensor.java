package ca.gc.asc_csa.apogy.addons.sensors.motion;
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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Linear Acceleration Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.motion.LinearAccelerationSensor#getXAcceleration <em>XAcceleration</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.motion.LinearAccelerationSensor#getYAcceleration <em>YAcceleration</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.motion.LinearAccelerationSensor#getZAcceleration <em>ZAcceleration</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.addons.sensors.motion.ApogyAddonsSensorsMotionPackage#getLinearAccelerationSensor()
 * @model
 * @generated
 */
public interface LinearAccelerationSensor extends SelfMotionSensor {
	/**
	 * Returns the value of the '<em><b>XAcceleration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XAcceleration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XAcceleration</em>' attribute.
	 * @see #setXAcceleration(double)
	 * @see ca.gc.asc_csa.apogy.addons.sensors.motion.ApogyAddonsSensorsMotionPackage#getLinearAccelerationSensor_XAcceleration()
	 * @model unique="false"
	 * @generated
	 */
	double getXAcceleration();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.sensors.motion.LinearAccelerationSensor#getXAcceleration <em>XAcceleration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XAcceleration</em>' attribute.
	 * @see #getXAcceleration()
	 * @generated
	 */
	void setXAcceleration(double value);

	/**
	 * Returns the value of the '<em><b>YAcceleration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>YAcceleration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YAcceleration</em>' attribute.
	 * @see #setYAcceleration(double)
	 * @see ca.gc.asc_csa.apogy.addons.sensors.motion.ApogyAddonsSensorsMotionPackage#getLinearAccelerationSensor_YAcceleration()
	 * @model unique="false"
	 * @generated
	 */
	double getYAcceleration();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.sensors.motion.LinearAccelerationSensor#getYAcceleration <em>YAcceleration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YAcceleration</em>' attribute.
	 * @see #getYAcceleration()
	 * @generated
	 */
	void setYAcceleration(double value);

	/**
	 * Returns the value of the '<em><b>ZAcceleration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ZAcceleration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ZAcceleration</em>' attribute.
	 * @see #setZAcceleration(double)
	 * @see ca.gc.asc_csa.apogy.addons.sensors.motion.ApogyAddonsSensorsMotionPackage#getLinearAccelerationSensor_ZAcceleration()
	 * @model unique="false"
	 * @generated
	 */
	double getZAcceleration();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.sensors.motion.LinearAccelerationSensor#getZAcceleration <em>ZAcceleration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZAcceleration</em>' attribute.
	 * @see #getZAcceleration()
	 * @generated
	 */
	void setZAcceleration(double value);

} // LinearAccelerationSensor
