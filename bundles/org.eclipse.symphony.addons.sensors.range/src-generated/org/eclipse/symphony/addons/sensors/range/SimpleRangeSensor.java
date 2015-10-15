/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.range;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Range Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.sensors.range.SimpleRangeSensor#getDistanceMeasured <em>Distance Measured</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.addons.sensors.range.RangePackage#getSimpleRangeSensor()
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
	 * @see org.eclipse.symphony.addons.sensors.range.RangePackage#getSimpleRangeSensor_DistanceMeasured()
	 * @model unique="false"
	 * @generated
	 */
	double getDistanceMeasured();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.sensors.range.SimpleRangeSensor#getDistanceMeasured <em>Distance Measured</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance Measured</em>' attribute.
	 * @see #getDistanceMeasured()
	 * @generated
	 */
	void setDistanceMeasured(double value);

} // SimpleRangeSensor
