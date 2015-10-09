/**
 * <copyright>
 * </copyright>
 *
 * $Id: GPSPoseSensor.java,v 1.2.4.2 2015/05/21 15:49:51 pallard Exp $
 */
package org.eclipse.symphony.addons.sensors.gps;

import org.eclipse.emf.common.util.EList;

import ca.gc.space.mrt.common.Server;
import ca.gc.space.mrt.sensors.pose.PoseSensor;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>GPS Pose Sensor</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.sensors.gps.GPSPoseSensor#getGps <em>Gps</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.sensors.gps.GPSPoseSensor#getOriginLatitude <em>Origin Latitude</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.sensors.gps.GPSPoseSensor#getOriginLongitude <em>Origin Longitude</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.sensors.gps.GPSPoseSensor#getNeAngle <em>Ne Angle</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.sensors.gps.GPSPoseSensor#getOriginElevation <em>Origin Elevation</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.sensors.gps.GPSPoseSensor#getMaxInitTime <em>Max Init Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.addons.sensors.gps.GpsPackage#getGPSPoseSensor()
 * @model
 * @generated
 */
public interface GPSPoseSensor extends PoseSensor, Server {
	/**
	 * Returns the value of the '<em><b>Gps</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.symphony.addons.sensors.gps.MarkedGPS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gps</em>' containment reference list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gps</em>' containment reference list.
	 * @see org.eclipse.symphony.addons.sensors.gps.GpsPackage#getGPSPoseSensor_Gps()
	 * @model containment="true" required="true" upper="3"
	 * @generated
	 */
	EList<MarkedGPS> getGps();

	/**
	 * Returns the value of the '<em><b>Origin Latitude</b></em>' attribute. The
	 * default value is <code>"45.518206622222222"</code>. <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Origin Latitude</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc --> <!-- begin-model-doc --> This is the origin frame's
	 * latitude. The default value is set to "45.518206622222222", which is the
	 * MET's origin value. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Origin Latitude</em>' attribute.
	 * @see #setOriginLatitude(double)
	 * @see org.eclipse.symphony.addons.sensors.gps.GpsPackage#getGPSPoseSensor_OriginLatitude()
	 * @model default="45.518206622222222" required="true"
	 * @generated
	 */
	double getOriginLatitude();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.sensors.gps.GPSPoseSensor#getOriginLatitude <em>Origin Latitude</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Origin Latitude</em>' attribute.
	 * @see #getOriginLatitude()
	 * @generated
	 */
	void setOriginLatitude(double value);

	/**
	 * Returns the value of the '<em><b>Origin Longitude</b></em>' attribute.
	 * The default value is <code>"-73.3939031444445"</code>. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origin Longitude</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc --> <!-- begin-model-doc --> This is the origin frame's
	 * longitude. The default value is set to "73.3939031444445", which is the
	 * value which is the MET's origin value. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Origin Longitude</em>' attribute.
	 * @see #setOriginLongitude(double)
	 * @see org.eclipse.symphony.addons.sensors.gps.GpsPackage#getGPSPoseSensor_OriginLongitude()
	 * @model default="-73.3939031444445" required="true"
	 * @generated
	 */
	double getOriginLongitude();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.sensors.gps.GPSPoseSensor#getOriginLongitude <em>Origin Longitude</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Origin Longitude</em>' attribute.
	 * @see #getOriginLongitude()
	 * @generated
	 */
	void setOriginLongitude(double value);

	/**
	 * Returns the value of the '<em><b>Ne Angle</b></em>' attribute. The
	 * default value is <code>"0.553858844"</code>. <!-- begin-user-doc --> <!--
	 * end-user-doc --> <!-- begin-model-doc --> The angle, in radians, between
	 * the Noth East frame (z rotation). Default value is "0.553858844", which
	 * is the value used for the MET. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Ne Angle</em>' attribute.
	 * @see #setNeAngle(double)
	 * @see org.eclipse.symphony.addons.sensors.gps.GpsPackage#getGPSPoseSensor_NeAngle()
	 * @model default="0.553858844" required="true"
	 * @generated
	 */
	double getNeAngle();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.symphony.addons.sensors.gps.GPSPoseSensor#getNeAngle
	 * <em>Ne Angle</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Ne Angle</em>' attribute.
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
	 * @see org.eclipse.symphony.addons.sensors.gps.GpsPackage#getGPSPoseSensor_OriginElevation()
	 * @model default="33.0985" required="true"
	 * @generated
	 */
	double getOriginElevation();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.sensors.gps.GPSPoseSensor#getOriginElevation <em>Origin Elevation</em>}' attribute.
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
	 * While in the initialization stage, maxInitTime is the maximum time we can wait for a valid gps reading.
	 * The value is in milliseconds and its default value is 10 000 ms (10 seconds).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Init Time</em>' attribute.
	 * @see #setMaxInitTime(long)
	 * @see org.eclipse.symphony.addons.sensors.gps.GpsPackage#getGPSPoseSensor_MaxInitTime()
	 * @model default="10000"
	 * @generated
	 */
	long getMaxInitTime();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.sensors.gps.GPSPoseSensor#getMaxInitTime <em>Max Init Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Init Time</em>' attribute.
	 * @see #getMaxInitTime()
	 * @generated
	 */
	void setMaxInitTime(long value);

} // GPSPoseSensor
