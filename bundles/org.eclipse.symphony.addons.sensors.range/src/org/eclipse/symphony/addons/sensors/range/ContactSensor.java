/**
 * <copyright>
 * </copyright>
 *
 * $Id: ContactSensor.java,v 1.2.4.2 2015/05/21 15:50:22 pallard Exp $
 */
package org.eclipse.symphony.addons.sensors.range;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contact Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.sensors.range.ContactSensor#isContacted <em>Contacted</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.addons.sensors.range.RangePackage#getContactSensor()
 * @model
 * @generated
 */
public interface ContactSensor extends RangeSensor
{
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
	 * @see org.eclipse.symphony.addons.sensors.range.RangePackage#getContactSensor_Contacted()
	 * @model required="true"
	 * @generated
	 */
	boolean isContacted();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.sensors.range.ContactSensor#isContacted <em>Contacted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contacted</em>' attribute.
	 * @see #isContacted()
	 * @generated
	 */
	void setContacted(boolean value);

} // ContactSensor
