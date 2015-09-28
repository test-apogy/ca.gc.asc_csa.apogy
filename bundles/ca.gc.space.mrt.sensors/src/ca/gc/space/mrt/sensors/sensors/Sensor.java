/**
 * Canadian Space Agency 2007.
 *
 * $Id: Sensor.java,v 1.4.4.2 2015/05/21 15:49:36 pallard Exp $
 */
package ca.gc.space.mrt.sensors.sensors;

import ca.gc.space.topology.AggregateGroupNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.space.mrt.sensors.sensors.Sensor#getStatus <em>Status</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.space.mrt.sensors.sensors.SensorsPackage#getSensor()
 * @model
 * @generated
 */
public interface Sensor extends AggregateGroupNode {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Canadian Space Agency 2007.";

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The default value is <code>"OFF"</code>.
	 * The literals are from the enumeration {@link ca.gc.space.mrt.sensors.sensors.SensorStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see ca.gc.space.mrt.sensors.sensors.SensorStatus
	 * @see #setStatus(SensorStatus)
	 * @see ca.gc.space.mrt.sensors.sensors.SensorsPackage#getSensor_Status()
	 * @model default="OFF" transient="true"
	 * @generated
	 */
	SensorStatus getStatus();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.sensors.sensors.Sensor#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see ca.gc.space.mrt.sensors.sensors.SensorStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(SensorStatus value);

} // Sensor
