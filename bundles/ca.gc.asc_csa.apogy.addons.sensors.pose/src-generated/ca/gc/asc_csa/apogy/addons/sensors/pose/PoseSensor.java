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

import ca.gc.asc_csa.apogy.common.geometry.data3d.Pose;

import ca.gc.asc_csa.apogy.common.topology.TransformNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.pose.PoseSensor#getPose <em>Pose</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.pose.PoseSensor#getDataLogger <em>Data Logger</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.addons.sensors.pose.ApogyAddonsSensorsPosePackage#getPoseSensor()
 * @model
 * @generated
 */
public interface PoseSensor extends TransformNode, PositionSensor, OrientationSensor {
	/**
	 * Returns the value of the '<em><b>Pose</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pose</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pose</em>' reference.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.pose.ApogyAddonsSensorsPosePackage#getPoseSensor_Pose()
	 * @model transient="true" changeable="false" derived="true"
	 * @generated
	 */
	Pose getPose();

	/**
	 * Returns the value of the '<em><b>Data Logger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Logger</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Logger</em>' containment reference.
	 * @see #setDataLogger(PoseDataLogger)
	 * @see ca.gc.asc_csa.apogy.addons.sensors.pose.ApogyAddonsSensorsPosePackage#getPoseSensor_DataLogger()
	 * @model containment="true"
	 * @generated
	 */
	PoseDataLogger getDataLogger();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.sensors.pose.PoseSensor#getDataLogger <em>Data Logger</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Logger</em>' containment reference.
	 * @see #getDataLogger()
	 * @generated
	 */
	void setDataLogger(PoseDataLogger value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="ca.gc.asc_csa.apogy.addons.sensors.pose.Exception" newPoseUnique="false"
	 * @generated
	 */
	void resetPose(Pose newPose) throws Exception;

} // PoseSensor
