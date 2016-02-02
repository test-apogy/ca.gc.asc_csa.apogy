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
 * A representation of the model object '<em><b>Angular Velocity Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.motion.AngularVelocitySensor#getXAngularVelocity <em>XAngular Velocity</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.motion.AngularVelocitySensor#getYAngularVelocity <em>YAngular Velocity</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.motion.AngularVelocitySensor#getZAngularVelocity <em>ZAngular Velocity</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.addons.sensors.motion.ApogyAddonsSensorsMotionPackage#getAngularVelocitySensor()
 * @model
 * @generated
 */
public interface AngularVelocitySensor extends SelfMotionSensor {
	/**
	 * Returns the value of the '<em><b>XAngular Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XAngular Velocity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XAngular Velocity</em>' attribute.
	 * @see #setXAngularVelocity(double)
	 * @see ca.gc.asc_csa.apogy.addons.sensors.motion.ApogyAddonsSensorsMotionPackage#getAngularVelocitySensor_XAngularVelocity()
	 * @model unique="false"
	 * @generated
	 */
	double getXAngularVelocity();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.sensors.motion.AngularVelocitySensor#getXAngularVelocity <em>XAngular Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XAngular Velocity</em>' attribute.
	 * @see #getXAngularVelocity()
	 * @generated
	 */
	void setXAngularVelocity(double value);

	/**
	 * Returns the value of the '<em><b>YAngular Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>YAngular Velocity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YAngular Velocity</em>' attribute.
	 * @see #setYAngularVelocity(double)
	 * @see ca.gc.asc_csa.apogy.addons.sensors.motion.ApogyAddonsSensorsMotionPackage#getAngularVelocitySensor_YAngularVelocity()
	 * @model unique="false"
	 * @generated
	 */
	double getYAngularVelocity();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.sensors.motion.AngularVelocitySensor#getYAngularVelocity <em>YAngular Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YAngular Velocity</em>' attribute.
	 * @see #getYAngularVelocity()
	 * @generated
	 */
	void setYAngularVelocity(double value);

	/**
	 * Returns the value of the '<em><b>ZAngular Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ZAngular Velocity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ZAngular Velocity</em>' attribute.
	 * @see #setZAngularVelocity(double)
	 * @see ca.gc.asc_csa.apogy.addons.sensors.motion.ApogyAddonsSensorsMotionPackage#getAngularVelocitySensor_ZAngularVelocity()
	 * @model unique="false"
	 * @generated
	 */
	double getZAngularVelocity();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.sensors.motion.AngularVelocitySensor#getZAngularVelocity <em>ZAngular Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZAngular Velocity</em>' attribute.
	 * @see #getZAngularVelocity()
	 * @generated
	 */
	void setZAngularVelocity(double value);

} // AngularVelocitySensor
