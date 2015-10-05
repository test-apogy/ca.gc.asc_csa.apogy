/**
 * <copyright>
 * </copyright>
 *
 * $Id: GPS.java,v 1.3.4.2 2015/05/21 15:49:51 pallard Exp $
 */
package ca.gc.space.mrt.sensors.gps;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GPS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.space.mrt.sensors.gps.GPS#getConnection <em>Connection</em>}</li>
 *   <li>{@link ca.gc.space.mrt.sensors.gps.GPS#getDataInterpreter <em>Data Interpreter</em>}</li>
 *   <li>{@link ca.gc.space.mrt.sensors.gps.GPS#getReading <em>Reading</em>}</li>
 *   <li>{@link ca.gc.space.mrt.sensors.gps.GPS#getStatus <em>Status</em>}</li>
 *   <li>{@link ca.gc.space.mrt.sensors.gps.GPS#getUpdateRate <em>Update Rate</em>}</li>
 *   <li>{@link ca.gc.space.mrt.sensors.gps.GPS#getLastFailure <em>Last Failure</em>}</li>
 *   <li>{@link ca.gc.space.mrt.sensors.gps.GPS#getMaxReconnectTime <em>Max Reconnect Time</em>}</li>
 *   <li>{@link ca.gc.space.mrt.sensors.gps.GPS#getSpeedKnots <em>Speed Knots</em>}</li>
 *   <li>{@link ca.gc.space.mrt.sensors.gps.GPS#getSpeedKmh <em>Speed Kmh</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.space.mrt.sensors.gps.GpsPackage#getGPS()
 * @model
 * @generated
 */
public interface GPS extends EObject {
	/**
	 * Returns the value of the '<em><b>Connection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection</em>' containment reference.
	 * @see #setConnection(GPSConnection)
	 * @see ca.gc.space.mrt.sensors.gps.GpsPackage#getGPS_Connection()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GPSConnection getConnection();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.sensors.gps.GPS#getConnection <em>Connection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection</em>' containment reference.
	 * @see #getConnection()
	 * @generated
	 */
	void setConnection(GPSConnection value);

	/**
	 * Returns the value of the '<em><b>Data Interpreter</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.space.mrt.sensors.gps.GPSDataInterpreter#getGps <em>Gps</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Interpreter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Interpreter</em>' containment reference.
	 * @see #setDataInterpreter(GPSDataInterpreter)
	 * @see ca.gc.space.mrt.sensors.gps.GpsPackage#getGPS_DataInterpreter()
	 * @see ca.gc.space.mrt.sensors.gps.GPSDataInterpreter#getGps
	 * @model opposite="gps" containment="true"
	 * @generated
	 */
	GPSDataInterpreter getDataInterpreter();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.sensors.gps.GPS#getDataInterpreter <em>Data Interpreter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Interpreter</em>' containment reference.
	 * @see #getDataInterpreter()
	 * @generated
	 */
	void setDataInterpreter(GPSDataInterpreter value);

	/**
	 * Returns the value of the '<em><b>Reading</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reading</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gets the latest gps reading.  This call is not blocking.
	 * Returns <code>null</code> if no reading is yet available.
	 * If the gps's state is 'STOPPED' when this method is called, a call to 'start()' is first made.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reading</em>' containment reference.
	 * @see #setReading(GPSReading)
	 * @see ca.gc.space.mrt.sensors.gps.GpsPackage#getGPS_Reading()
	 * @model containment="true"
	 * @generated
	 */
	GPSReading getReading();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.sensors.gps.GPS#getReading <em>Reading</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reading</em>' containment reference.
	 * @see #getReading()
	 * @generated
	 */
	void setReading(GPSReading value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The default value is <code>"STOPPED"</code>.
	 * The literals are from the enumeration {@link ca.gc.space.mrt.sensors.gps.GPS_STATUS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see ca.gc.space.mrt.sensors.gps.GPS_STATUS
	 * @see #setStatus(GPS_STATUS)
	 * @see ca.gc.space.mrt.sensors.gps.GpsPackage#getGPS_Status()
	 * @model default="STOPPED" transient="true"
	 * @generated
	 */
	GPS_STATUS getStatus();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.sensors.gps.GPS#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see ca.gc.space.mrt.sensors.gps.GPS_STATUS
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(GPS_STATUS value);

	/**
	 * Returns the value of the '<em><b>Update Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The desired update rate at which we want to acquire data.
	 * This can be useful when parsing from a file to simulate the real gps behavior.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Update Rate</em>' attribute.
	 * @see #setUpdateRate(long)
	 * @see ca.gc.space.mrt.sensors.gps.GpsPackage#getGPS_UpdateRate()
	 * @model
	 * @generated
	 */
	long getUpdateRate();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.sensors.gps.GPS#getUpdateRate <em>Update Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Rate</em>' attribute.
	 * @see #getUpdateRate()
	 * @generated
	 */
	void setUpdateRate(long value);

	/**
	 * Returns the value of the '<em><b>Last Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When the GPS falls into FAILED state, this attribute is set.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Last Failure</em>' attribute.
	 * @see #setLastFailure(Exception)
	 * @see ca.gc.space.mrt.sensors.gps.GpsPackage#getGPS_LastFailure()
	 * @model dataType="org.eclipse.symphony.common.math.Exception" transient="true"
	 * @generated
	 */
	Exception getLastFailure();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.sensors.gps.GPS#getLastFailure <em>Last Failure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Failure</em>' attribute.
	 * @see #getLastFailure()
	 * @generated
	 */
	void setLastFailure(Exception value);

	/**
	 * Returns the value of the '<em><b>Max Reconnect Time</b></em>' attribute.
	 * The default value is <code>"10000"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maximum time allowed to reconnect the GPS, in milliseconds.
	 * After that time, the GPS fals into 'FAILED' state.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Reconnect Time</em>' attribute.
	 * @see #setMaxReconnectTime(int)
	 * @see ca.gc.space.mrt.sensors.gps.GpsPackage#getGPS_MaxReconnectTime()
	 * @model default="10000"
	 * @generated
	 */
	int getMaxReconnectTime();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.sensors.gps.GPS#getMaxReconnectTime <em>Max Reconnect Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Reconnect Time</em>' attribute.
	 * @see #getMaxReconnectTime()
	 * @generated
	 */
	void setMaxReconnectTime(int value);

	/**
	 * Returns the value of the '<em><b>Speed Knots</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Current speed in knots.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Speed Knots</em>' attribute.
	 * @see #setSpeedKnots(double)
	 * @see ca.gc.space.mrt.sensors.gps.GpsPackage#getGPS_SpeedKnots()
	 * @model
	 * @generated
	 */
	double getSpeedKnots();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.sensors.gps.GPS#getSpeedKnots <em>Speed Knots</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speed Knots</em>' attribute.
	 * @see #getSpeedKnots()
	 * @generated
	 */
	void setSpeedKnots(double value);

	/**
	 * Returns the value of the '<em><b>Speed Kmh</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Current speed in KM/h.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Speed Kmh</em>' attribute.
	 * @see #setSpeedKmh(double)
	 * @see ca.gc.space.mrt.sensors.gps.GpsPackage#getGPS_SpeedKmh()
	 * @model
	 * @generated
	 */
	double getSpeedKmh();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.sensors.gps.GPS#getSpeedKmh <em>Speed Kmh</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speed Kmh</em>' attribute.
	 * @see #getSpeedKmh()
	 * @generated
	 */
	void setSpeedKmh(double value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Starts the GPS.
	 * The gps starts acquiring data.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void start();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Stops the acquisition process.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void stop();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Resets the GPS:
	 * <ul>
	 * <li>lastFailure is set to <code>null</code></li>
	 * <li>status is set to GPS_STATUS.STOPPED</li>
	 * </ul>
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void reset();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Resets the GPS:
	 * <ul>
	 * <li>lastFailure is set to <code>null</code></li>
	 * <li>status is set to GPS_STATUS.STOPPED</li>
	 * </ul>
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean reconnect();

} // GPS
