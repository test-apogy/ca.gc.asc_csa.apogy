/**
 * <copyright>
 * </copyright>
 *
 * $Id: SimulatedDataInterpreter.java,v 1.2.4.2 2015/05/21 15:50:11 pallard Exp $
 */
package ca.gc.space.mrt.sensors.gps.sim;

import ca.gc.space.mrt.sensors.gps.GPSDataInterpreter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simulated Data Interpreter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.space.mrt.sensors.gps.sim.SimulatedDataInterpreter#getUpdateFrequency <em>Update Frequency</em>}</li>
 *   <li>{@link ca.gc.space.mrt.sensors.gps.sim.SimulatedDataInterpreter#getStartLatitude <em>Start Latitude</em>}</li>
 *   <li>{@link ca.gc.space.mrt.sensors.gps.sim.SimulatedDataInterpreter#getStartLongitude <em>Start Longitude</em>}</li>
 *   <li>{@link ca.gc.space.mrt.sensors.gps.sim.SimulatedDataInterpreter#getLatitudeIncrement <em>Latitude Increment</em>}</li>
 *   <li>{@link ca.gc.space.mrt.sensors.gps.sim.SimulatedDataInterpreter#getLongitudeIncrement <em>Longitude Increment</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.space.mrt.sensors.gps.sim.SimPackage#getSimulatedDataInterpreter()
 * @model
 * @generated
 */
public interface SimulatedDataInterpreter extends GPSDataInterpreter {

	/**
	 * Returns the value of the '<em><b>Update Frequency</b></em>' attribute.
	 * The default value is <code>"1000"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Delay, in milliseconds before updateGPS() returns.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Update Frequency</em>' attribute.
	 * @see #setUpdateFrequency(int)
	 * @see ca.gc.space.mrt.sensors.gps.sim.SimPackage#getSimulatedDataInterpreter_UpdateFrequency()
	 * @model default="1000"
	 * @generated
	 */
	int getUpdateFrequency();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.sensors.gps.sim.SimulatedDataInterpreter#getUpdateFrequency <em>Update Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Frequency</em>' attribute.
	 * @see #getUpdateFrequency()
	 * @generated
	 */
	void setUpdateFrequency(int value);

	/**
	 * Returns the value of the '<em><b>Start Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Latitude</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Latitude</em>' attribute.
	 * @see #setStartLatitude(double)
	 * @see ca.gc.space.mrt.sensors.gps.sim.SimPackage#getSimulatedDataInterpreter_StartLatitude()
	 * @model
	 * @generated
	 */
	double getStartLatitude();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.sensors.gps.sim.SimulatedDataInterpreter#getStartLatitude <em>Start Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Latitude</em>' attribute.
	 * @see #getStartLatitude()
	 * @generated
	 */
	void setStartLatitude(double value);

	/**
	 * Returns the value of the '<em><b>Start Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Longitude</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Longitude</em>' attribute.
	 * @see #setStartLongitude(double)
	 * @see ca.gc.space.mrt.sensors.gps.sim.SimPackage#getSimulatedDataInterpreter_StartLongitude()
	 * @model
	 * @generated
	 */
	double getStartLongitude();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.sensors.gps.sim.SimulatedDataInterpreter#getStartLongitude <em>Start Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Longitude</em>' attribute.
	 * @see #getStartLongitude()
	 * @generated
	 */
	void setStartLongitude(double value);

	/**
	 * Returns the value of the '<em><b>Latitude Increment</b></em>' attribute.
	 * The default value is <code>"0.000001"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Latitude Increment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latitude Increment</em>' attribute.
	 * @see #setLatitudeIncrement(double)
	 * @see ca.gc.space.mrt.sensors.gps.sim.SimPackage#getSimulatedDataInterpreter_LatitudeIncrement()
	 * @model default="0.000001"
	 * @generated
	 */
	double getLatitudeIncrement();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.sensors.gps.sim.SimulatedDataInterpreter#getLatitudeIncrement <em>Latitude Increment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latitude Increment</em>' attribute.
	 * @see #getLatitudeIncrement()
	 * @generated
	 */
	void setLatitudeIncrement(double value);

	/**
	 * Returns the value of the '<em><b>Longitude Increment</b></em>' attribute.
	 * The default value is <code>"0.000001"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Longitude Increment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Longitude Increment</em>' attribute.
	 * @see #setLongitudeIncrement(double)
	 * @see ca.gc.space.mrt.sensors.gps.sim.SimPackage#getSimulatedDataInterpreter_LongitudeIncrement()
	 * @model default="0.000001"
	 * @generated
	 */
	double getLongitudeIncrement();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.sensors.gps.sim.SimulatedDataInterpreter#getLongitudeIncrement <em>Longitude Increment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Longitude Increment</em>' attribute.
	 * @see #getLongitudeIncrement()
	 * @generated
	 */
	void setLongitudeIncrement(double value);
} // SimulatedDataInterpreter
