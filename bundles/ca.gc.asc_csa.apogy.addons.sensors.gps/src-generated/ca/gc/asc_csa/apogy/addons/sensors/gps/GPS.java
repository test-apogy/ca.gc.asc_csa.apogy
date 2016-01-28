/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.gps;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GPS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.sensors.gps.GPS#getConnection <em>Connection</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.sensors.gps.GPS#getDataInterpreter <em>Data Interpreter</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.sensors.gps.GPS#getReading <em>Reading</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.sensors.gps.GPS#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.sensors.gps.GPS#getUpdateRate <em>Update Rate</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.sensors.gps.GPS#getLastFailure <em>Last Failure</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.sensors.gps.GPS#getMaxReconnectTime <em>Max Reconnect Time</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.sensors.gps.GPS#getSpeedKnots <em>Speed Knots</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.sensors.gps.GPS#getSpeedKmh <em>Speed Kmh</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.addons.sensors.gps.Symphony__AddonsSensorsGPSPackage#getGPS()
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
	 * @see org.eclipse.symphony.addons.sensors.gps.Symphony__AddonsSensorsGPSPackage#getGPS_Connection()
	 * @model containment="true"
	 * @generated
	 */
	GPSConnection getConnection();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.sensors.gps.GPS#getConnection <em>Connection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection</em>' containment reference.
	 * @see #getConnection()
	 * @generated
	 */
	void setConnection(GPSConnection value);

	/**
	 * Returns the value of the '<em><b>Data Interpreter</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.symphony.addons.sensors.gps.GPSDataInterpreter#getGps <em>Gps</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Interpreter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Interpreter</em>' containment reference.
	 * @see #setDataInterpreter(GPSDataInterpreter)
	 * @see org.eclipse.symphony.addons.sensors.gps.Symphony__AddonsSensorsGPSPackage#getGPS_DataInterpreter()
	 * @see org.eclipse.symphony.addons.sensors.gps.GPSDataInterpreter#getGps
	 * @model opposite="gps" containment="true"
	 * @generated
	 */
	GPSDataInterpreter getDataInterpreter();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.sensors.gps.GPS#getDataInterpreter <em>Data Interpreter</em>}' containment reference.
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
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gets the latest gps reading.  This call is not blocking.
	 * Returns <code>null</code> if no reading is yet available.
	 * 
	 * If the gps's state is 'STOPPED' when this method is called,
	 * a call to 'start()' is first made.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reading</em>' containment reference.
	 * @see #setReading(GPSReading)
	 * @see org.eclipse.symphony.addons.sensors.gps.Symphony__AddonsSensorsGPSPackage#getGPS_Reading()
	 * @model containment="true"
	 * @generated
	 */
	GPSReading getReading();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.sensors.gps.GPS#getReading <em>Reading</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reading</em>' containment reference.
	 * @see #getReading()
	 * @generated
	 */
	void setReading(GPSReading value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.symphony.addons.sensors.gps.GPSStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see org.eclipse.symphony.addons.sensors.gps.GPSStatus
	 * @see #setStatus(GPSStatus)
	 * @see org.eclipse.symphony.addons.sensors.gps.Symphony__AddonsSensorsGPSPackage#getGPS_Status()
	 * @model unique="false"
	 * @generated
	 */
	GPSStatus getStatus();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.sensors.gps.GPS#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see org.eclipse.symphony.addons.sensors.gps.GPSStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(GPSStatus value);

	/**
	 * Returns the value of the '<em><b>Update Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The desired update rate at which we want to acquire data.
	 * This can be useful when parsing from a file to simulate the real GPS behavior.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Update Rate</em>' attribute.
	 * @see #setUpdateRate(long)
	 * @see org.eclipse.symphony.addons.sensors.gps.Symphony__AddonsSensorsGPSPackage#getGPS_UpdateRate()
	 * @model unique="false"
	 * @generated
	 */
	long getUpdateRate();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.sensors.gps.GPS#getUpdateRate <em>Update Rate</em>}' attribute.
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
	 * @see org.eclipse.symphony.addons.sensors.gps.Symphony__AddonsSensorsGPSPackage#getGPS_LastFailure()
	 * @model unique="false" dataType="org.eclipse.symphony.addons.sensors.gps.Exception" transient="true"
	 * @generated
	 */
	Exception getLastFailure();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.sensors.gps.GPS#getLastFailure <em>Last Failure</em>}' attribute.
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
	 * After that time, the GPS falls into 'FAILED' state.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Reconnect Time</em>' attribute.
	 * @see #setMaxReconnectTime(int)
	 * @see org.eclipse.symphony.addons.sensors.gps.Symphony__AddonsSensorsGPSPackage#getGPS_MaxReconnectTime()
	 * @model default="10000" unique="false"
	 * @generated
	 */
	int getMaxReconnectTime();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.sensors.gps.GPS#getMaxReconnectTime <em>Max Reconnect Time</em>}' attribute.
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
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Speed Knots</em>' attribute.
	 * @see #setSpeedKnots(double)
	 * @see org.eclipse.symphony.addons.sensors.gps.Symphony__AddonsSensorsGPSPackage#getGPS_SpeedKnots()
	 * @model unique="false"
	 * @generated
	 */
	double getSpeedKnots();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.sensors.gps.GPS#getSpeedKnots <em>Speed Knots</em>}' attribute.
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
	 * Current speed in km/h.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Speed Kmh</em>' attribute.
	 * @see #setSpeedKmh(double)
	 * @see org.eclipse.symphony.addons.sensors.gps.Symphony__AddonsSensorsGPSPackage#getGPS_SpeedKmh()
	 * @model unique="false"
	 * @generated
	 */
	double getSpeedKmh();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.sensors.gps.GPS#getSpeedKmh <em>Speed Kmh</em>}' attribute.
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
	 * The GPS starts acquiring data.
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
	 * <li>status is set to GPSStatus.STOPPED</li>
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
	 * <li>status is set to GPSStatus.STOPPED</li>
	 * </ul>
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 * @generated
	 */
	boolean reconnect();

} // GPS
