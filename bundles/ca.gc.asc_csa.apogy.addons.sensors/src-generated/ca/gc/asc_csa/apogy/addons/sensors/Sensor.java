/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.addons.sensors;

import ca.gc.asc_csa.apogy.common.topology.AggregateGroupNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.Sensor#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.addons.sensors.ApogyAddonsSensorsPackage#getSensor()
 * @model
 * @generated
 */
public interface Sensor extends AggregateGroupNode {
	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The default value is <code>"OFF"</code>.
	 * The literals are from the enumeration {@link ca.gc.asc_csa.apogy.addons.sensors.SensorStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.SensorStatus
	 * @see #setStatus(SensorStatus)
	 * @see ca.gc.asc_csa.apogy.addons.sensors.ApogyAddonsSensorsPackage#getSensor_Status()
	 * @model default="OFF" unique="false" transient="true"
	 * @generated
	 */
	SensorStatus getStatus();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.sensors.Sensor#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.SensorStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(SensorStatus value);

} // Sensor
