/**
 * <copyright>
 * </copyright>
 *
 * $Id: SimpleRangeSensor.java,v 1.2.4.2 2015/05/21 15:50:22 pallard Exp $
 */
package ca.gc.space.mrt.sensors.range;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Range Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.space.mrt.sensors.range.SimpleRangeSensor#getDistanceMeasured <em>Distance Measured</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.space.mrt.sensors.range.RangePackage#getSimpleRangeSensor()
 * @model
 * @generated
 */
public interface SimpleRangeSensor extends RangeSensor
{
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
	 * @see ca.gc.space.mrt.sensors.range.RangePackage#getSimpleRangeSensor_DistanceMeasured()
	 * @model required="true"
	 * @generated
	 */
	double getDistanceMeasured();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.sensors.range.SimpleRangeSensor#getDistanceMeasured <em>Distance Measured</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance Measured</em>' attribute.
	 * @see #getDistanceMeasured()
	 * @generated
	 */
	void setDistanceMeasured(double value);

} // SimpleRangeSensor
