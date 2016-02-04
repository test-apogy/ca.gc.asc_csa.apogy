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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simulated Position Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.pose.SimulatedPositionSensor#getXVelocity <em>XVelocity</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.pose.SimulatedPositionSensor#getYVelocity <em>YVelocity</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.pose.SimulatedPositionSensor#getZVelocity <em>ZVelocity</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.pose.SimulatedPositionSensor#getUpdatePeriod <em>Update Period</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.addons.sensors.pose.ApogyAddonsSensorsPosePackage#getSimulatedPositionSensor()
 * @model
 * @generated
 */
public interface SimulatedPositionSensor extends PositionSensor {
	/**
	 * Returns the value of the '<em><b>XVelocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XVelocity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XVelocity</em>' attribute.
	 * @see #setXVelocity(double)
	 * @see ca.gc.asc_csa.apogy.addons.sensors.pose.ApogyAddonsSensorsPosePackage#getSimulatedPositionSensor_XVelocity()
	 * @model unique="false"
	 * @generated
	 */
	double getXVelocity();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.sensors.pose.SimulatedPositionSensor#getXVelocity <em>XVelocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XVelocity</em>' attribute.
	 * @see #getXVelocity()
	 * @generated
	 */
	void setXVelocity(double value);

	/**
	 * Returns the value of the '<em><b>YVelocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>YVelocity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YVelocity</em>' attribute.
	 * @see #setYVelocity(double)
	 * @see ca.gc.asc_csa.apogy.addons.sensors.pose.ApogyAddonsSensorsPosePackage#getSimulatedPositionSensor_YVelocity()
	 * @model unique="false"
	 * @generated
	 */
	double getYVelocity();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.sensors.pose.SimulatedPositionSensor#getYVelocity <em>YVelocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YVelocity</em>' attribute.
	 * @see #getYVelocity()
	 * @generated
	 */
	void setYVelocity(double value);

	/**
	 * Returns the value of the '<em><b>ZVelocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ZVelocity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ZVelocity</em>' attribute.
	 * @see #setZVelocity(double)
	 * @see ca.gc.asc_csa.apogy.addons.sensors.pose.ApogyAddonsSensorsPosePackage#getSimulatedPositionSensor_ZVelocity()
	 * @model unique="false"
	 * @generated
	 */
	double getZVelocity();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.sensors.pose.SimulatedPositionSensor#getZVelocity <em>ZVelocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZVelocity</em>' attribute.
	 * @see #getZVelocity()
	 * @generated
	 */
	void setZVelocity(double value);

	/**
	 * Returns the value of the '<em><b>Update Period</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Update Period</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Period</em>' attribute.
	 * @see #setUpdatePeriod(double)
	 * @see ca.gc.asc_csa.apogy.addons.sensors.pose.ApogyAddonsSensorsPosePackage#getSimulatedPositionSensor_UpdatePeriod()
	 * @model default="1.0" unique="false"
	 * @generated
	 */
	double getUpdatePeriod();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.sensors.pose.SimulatedPositionSensor#getUpdatePeriod <em>Update Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Period</em>' attribute.
	 * @see #getUpdatePeriod()
	 * @generated
	 */
	void setUpdatePeriod(double value);

} // SimulatedPositionSensor
