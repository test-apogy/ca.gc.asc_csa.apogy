package ca.gc.asc_csa.apogy.addons.mobility.controllers;
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

import org.eclipse.emf.ecore.EObject;

import ca.gc.asc_csa.apogy.addons.geometry.paths.Path;

import ca.gc.asc_csa.apogy.addons.sensors.pose.PoseSensor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Path Recorder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.PathRecorder#getPositionSensor <em>Position Sensor</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.PathRecorder#getMinimumDistanceDelta <em>Minimum Distance Delta</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.PathRecorder#getMinimumTimeDelta <em>Minimum Time Delta</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.PathRecorder#getSamplingMode <em>Sampling Mode</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.PathRecorder#getRecordedPath <em>Recorded Path</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.addons.mobility.controllers.ApogyAddonsMobilityControllersPackage#getPathRecorder()
 * @model
 * @generated
 */
public interface PathRecorder<PathType extends Path> extends EObject {
	/**
	 * Returns the value of the '<em><b>Position Sensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position Sensor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position Sensor</em>' reference.
	 * @see #setPositionSensor(PoseSensor)
	 * @see ca.gc.asc_csa.apogy.addons.mobility.controllers.ApogyAddonsMobilityControllersPackage#getPathRecorder_PositionSensor()
	 * @model
	 * @generated
	 */
	PoseSensor getPositionSensor();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.PathRecorder#getPositionSensor <em>Position Sensor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position Sensor</em>' reference.
	 * @see #getPositionSensor()
	 * @generated
	 */
	void setPositionSensor(PoseSensor value);

	/**
	 * Returns the value of the '<em><b>Minimum Distance Delta</b></em>' attribute.
	 * The default value is <code>"0.1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum Distance Delta</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Distance Delta</em>' attribute.
	 * @see #setMinimumDistanceDelta(double)
	 * @see ca.gc.asc_csa.apogy.addons.mobility.controllers.ApogyAddonsMobilityControllersPackage#getPathRecorder_MinimumDistanceDelta()
	 * @model default="0.1" unique="false"
	 * @generated
	 */
	double getMinimumDistanceDelta();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.PathRecorder#getMinimumDistanceDelta <em>Minimum Distance Delta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Distance Delta</em>' attribute.
	 * @see #getMinimumDistanceDelta()
	 * @generated
	 */
	void setMinimumDistanceDelta(double value);

	/**
	 * Returns the value of the '<em><b>Minimum Time Delta</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum Time Delta</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Time Delta</em>' attribute.
	 * @see #setMinimumTimeDelta(double)
	 * @see ca.gc.asc_csa.apogy.addons.mobility.controllers.ApogyAddonsMobilityControllersPackage#getPathRecorder_MinimumTimeDelta()
	 * @model default="1.0" unique="false"
	 * @generated
	 */
	double getMinimumTimeDelta();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.PathRecorder#getMinimumTimeDelta <em>Minimum Time Delta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Time Delta</em>' attribute.
	 * @see #getMinimumTimeDelta()
	 * @generated
	 */
	void setMinimumTimeDelta(double value);

	/**
	 * Returns the value of the '<em><b>Sampling Mode</b></em>' attribute.
	 * The default value is <code>"ON_DISTANCE_DELTA"</code>.
	 * The literals are from the enumeration {@link ca.gc.asc_csa.apogy.addons.mobility.controllers.PathRecorderSamplingMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sampling Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sampling Mode</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.controllers.PathRecorderSamplingMode
	 * @see #setSamplingMode(PathRecorderSamplingMode)
	 * @see ca.gc.asc_csa.apogy.addons.mobility.controllers.ApogyAddonsMobilityControllersPackage#getPathRecorder_SamplingMode()
	 * @model default="ON_DISTANCE_DELTA" unique="false"
	 * @generated
	 */
	PathRecorderSamplingMode getSamplingMode();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.PathRecorder#getSamplingMode <em>Sampling Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sampling Mode</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.controllers.PathRecorderSamplingMode
	 * @see #getSamplingMode()
	 * @generated
	 */
	void setSamplingMode(PathRecorderSamplingMode value);

	/**
	 * Returns the value of the '<em><b>Recorded Path</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recorded Path</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recorded Path</em>' reference.
	 * @see #setRecordedPath(Path)
	 * @see ca.gc.asc_csa.apogy.addons.mobility.controllers.ApogyAddonsMobilityControllersPackage#getPathRecorder_RecordedPath()
	 * @model
	 * @generated
	 */
	PathType getRecordedPath();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.PathRecorder#getRecordedPath <em>Recorded Path</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recorded Path</em>' reference.
	 * @see #getRecordedPath()
	 * @generated
	 */
	void setRecordedPath(PathType value);

} // PathRecorder
