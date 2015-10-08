/**
 * Canadian Space Agency 2007.
 *
 * $Id: Sensor.java,v 1.4.4.2 2015/05/21 15:49:36 pallard Exp $
 */
package org.eclipse.symphony.addons.sensors;

import ca.gc.space.topology.AggregateGroupNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.sensors.Sensor#getStatus <em>Status</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.addons.sensors.SensorsPackage#getSensor()
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
	 * The literals are from the enumeration {@link org.eclipse.symphony.addons.sensors.SensorStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see org.eclipse.symphony.addons.sensors.SensorStatus
	 * @see #setStatus(SensorStatus)
	 * @see org.eclipse.symphony.addons.sensors.SensorsPackage#getSensor_Status()
	 * @model default="OFF" transient="true"
	 * @generated
	 */
	SensorStatus getStatus();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.sensors.Sensor#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see org.eclipse.symphony.addons.sensors.SensorStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(SensorStatus value);

} // Sensor
