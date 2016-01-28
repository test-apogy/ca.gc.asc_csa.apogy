/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.addons.sensors.range;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contact Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.range.ContactSensor#isContacted <em>Contacted</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.addons.sensors.range.ApogyAddonsSensorsRangePackage#getContactSensor()
 * @model
 * @generated
 */
public interface ContactSensor extends RangeSensor {
	/**
	 * Returns the value of the '<em><b>Contacted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contacted</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contacted</em>' attribute.
	 * @see #setContacted(boolean)
	 * @see ca.gc.asc_csa.apogy.addons.sensors.range.ApogyAddonsSensorsRangePackage#getContactSensor_Contacted()
	 * @model unique="false"
	 * @generated
	 */
	boolean isContacted();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.sensors.range.ContactSensor#isContacted <em>Contacted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contacted</em>' attribute.
	 * @see #isContacted()
	 * @generated
	 */
	void setContacted(boolean value);

} // ContactSensor
