/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.addons.sensors.range;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Range Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.range.SimpleRangeSensor#getDistanceMeasured <em>Distance Measured</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.addons.sensors.range.ApogyAddonsSensorsRangePackage#getSimpleRangeSensor()
 * @model
 * @generated
 */
public interface SimpleRangeSensor extends RangeSensor {
	/**
	 * Returns the value of the '<em><b>Distance Measured</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distance Measured</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance Measured</em>' attribute.
	 * @see #setDistanceMeasured(double)
	 * @see ca.gc.asc_csa.apogy.addons.sensors.range.ApogyAddonsSensorsRangePackage#getSimpleRangeSensor_DistanceMeasured()
	 * @model unique="false"
	 * @generated
	 */
	double getDistanceMeasured();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.sensors.range.SimpleRangeSensor#getDistanceMeasured <em>Distance Measured</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance Measured</em>' attribute.
	 * @see #getDistanceMeasured()
	 * @generated
	 */
	void setDistanceMeasured(double value);

} // SimpleRangeSensor
