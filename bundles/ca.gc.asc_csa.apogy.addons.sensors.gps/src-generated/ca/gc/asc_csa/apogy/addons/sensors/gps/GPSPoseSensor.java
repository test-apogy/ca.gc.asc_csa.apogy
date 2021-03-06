package ca.gc.asc_csa.apogy.addons.sensors.gps;
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

import org.eclipse.emf.common.util.EList;
import ca.gc.asc_csa.apogy.addons.sensors.pose.PoseSensor;
import ca.gc.asc_csa.apogy.common.emf.Server;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GPS Pose Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.gps.GPSPoseSensor#getGps <em>Gps</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.gps.GPSPoseSensor#getOriginLatitude <em>Origin Latitude</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.gps.GPSPoseSensor#getOriginLongitude <em>Origin Longitude</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.gps.GPSPoseSensor#getNeAngle <em>Ne Angle</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.gps.GPSPoseSensor#getOriginElevation <em>Origin Elevation</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.gps.GPSPoseSensor#getMaxInitTime <em>Max Init Time</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.ApogyAddonsSensorsGPSPackage#getGPSPoseSensor()
 * @model
 * @generated
 */
public interface GPSPoseSensor extends PoseSensor, Server {
	/**
	 * Returns the value of the '<em><b>Gps</b></em>' containment reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.apogy.addons.sensors.gps.MarkedGPS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gps</em>' containment reference list.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.ApogyAddonsSensorsGPSPackage#getGPSPoseSensor_Gps()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<MarkedGPS> getGps();

	/**
	 * Returns the value of the '<em><b>Origin Latitude</b></em>' attribute.
	 * The default value is <code>"45.518206644445"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the origin frame's latitude.  The default
	 * value is set to "45.518206644445", which is the
	 * MET's origin value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Origin Latitude</em>' attribute.
	 * @see #setOriginLatitude(double)
	 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.ApogyAddonsSensorsGPSPackage#getGPSPoseSensor_OriginLatitude()
	 * @model default="45.518206644445" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel apogy_units='deg'"
	 * @generated
	 */
	double getOriginLatitude();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.sensors.gps.GPSPoseSensor#getOriginLatitude <em>Origin Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin Latitude</em>' attribute.
	 * @see #getOriginLatitude()
	 * @generated
	 */
	void setOriginLatitude(double value);

	/**
	 * Returns the value of the '<em><b>Origin Longitude</b></em>' attribute.
	 * The default value is <code>"-73.393904468182"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the origin frame's longitude.  The default
	 * value is set to "-73.393904468182", which is the
	 * value which is the MET's origin value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Origin Longitude</em>' attribute.
	 * @see #setOriginLongitude(double)
	 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.ApogyAddonsSensorsGPSPackage#getGPSPoseSensor_OriginLongitude()
	 * @model default="-73.393904468182" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel apogy_units='deg'"
	 * @generated
	 */
	double getOriginLongitude();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.sensors.gps.GPSPoseSensor#getOriginLongitude <em>Origin Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin Longitude</em>' attribute.
	 * @see #getOriginLongitude()
	 * @generated
	 */
	void setOriginLongitude(double value);

	/**
	 * Returns the value of the '<em><b>Ne Angle</b></em>' attribute.
	 * The default value is <code>"0.5940676"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The angle, in radians, between the Noth East frame (z rotation).
	 * Default value is "0.5940676", which is the value used for the MET.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ne Angle</em>' attribute.
	 * @see #setNeAngle(double)
	 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.ApogyAddonsSensorsGPSPackage#getGPSPoseSensor_NeAngle()
	 * @model default="0.5940676" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel apogy_units='rad'"
	 * @generated
	 */
	double getNeAngle();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.sensors.gps.GPSPoseSensor#getNeAngle <em>Ne Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ne Angle</em>' attribute.
	 * @see #getNeAngle()
	 * @generated
	 */
	void setNeAngle(double value);

	/**
	 * Returns the value of the '<em><b>Origin Elevation</b></em>' attribute.
	 * The default value is <code>"33.0985"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origin Elevation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin Elevation</em>' attribute.
	 * @see #setOriginElevation(double)
	 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.ApogyAddonsSensorsGPSPackage#getGPSPoseSensor_OriginElevation()
	 * @model default="33.0985" unique="false"
	 * @generated
	 */
	double getOriginElevation();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.sensors.gps.GPSPoseSensor#getOriginElevation <em>Origin Elevation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin Elevation</em>' attribute.
	 * @see #getOriginElevation()
	 * @generated
	 */
	void setOriginElevation(double value);

	/**
	 * Returns the value of the '<em><b>Max Init Time</b></em>' attribute.
	 * The default value is <code>"10000"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * While in the initialization stage, maxInitTime is the maximum
	 * time we can wait for a valid GPS reading. The value is in
	 * milliseconds and its default value is 10 000 ms (10 seconds).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Init Time</em>' attribute.
	 * @see #setMaxInitTime(long)
	 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.ApogyAddonsSensorsGPSPackage#getGPSPoseSensor_MaxInitTime()
	 * @model default="10000" unique="false"
	 * @generated
	 */
	long getMaxInitTime();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.sensors.gps.GPSPoseSensor#getMaxInitTime <em>Max Init Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Init Time</em>' attribute.
	 * @see #getMaxInitTime()
	 * @generated
	 */
	void setMaxInitTime(long value);

} // GPSPoseSensor
