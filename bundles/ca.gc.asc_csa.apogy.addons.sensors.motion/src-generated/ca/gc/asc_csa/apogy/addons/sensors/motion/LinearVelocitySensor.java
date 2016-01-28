/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.addons.sensors.motion;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Linear Velocity Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.motion.LinearVelocitySensor#getXVelocity <em>XVelocity</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.motion.LinearVelocitySensor#getYVelocity <em>YVelocity</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.motion.LinearVelocitySensor#getZVelocity <em>ZVelocity</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.addons.sensors.motion.ApogyAddonsSensorsMotionPackage#getLinearVelocitySensor()
 * @model
 * @generated
 */
public interface LinearVelocitySensor extends SelfMotionSensor {
	/**
	 * Returns the value of the '<em><b>XVelocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XVelocity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XVelocity</em>' attribute.
	 * @see #setXVelocity(double)
	 * @see ca.gc.asc_csa.apogy.addons.sensors.motion.ApogyAddonsSensorsMotionPackage#getLinearVelocitySensor_XVelocity()
	 * @model unique="false"
	 * @generated
	 */
	double getXVelocity();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.sensors.motion.LinearVelocitySensor#getXVelocity <em>XVelocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XVelocity</em>' attribute.
	 * @see #getXVelocity()
	 * @generated
	 */
	void setXVelocity(double value);

	/**
	 * Returns the value of the '<em><b>YVelocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>YVelocity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YVelocity</em>' attribute.
	 * @see #setYVelocity(double)
	 * @see ca.gc.asc_csa.apogy.addons.sensors.motion.ApogyAddonsSensorsMotionPackage#getLinearVelocitySensor_YVelocity()
	 * @model unique="false"
	 * @generated
	 */
	double getYVelocity();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.sensors.motion.LinearVelocitySensor#getYVelocity <em>YVelocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YVelocity</em>' attribute.
	 * @see #getYVelocity()
	 * @generated
	 */
	void setYVelocity(double value);

	/**
	 * Returns the value of the '<em><b>ZVelocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ZVelocity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ZVelocity</em>' attribute.
	 * @see #setZVelocity(double)
	 * @see ca.gc.asc_csa.apogy.addons.sensors.motion.ApogyAddonsSensorsMotionPackage#getLinearVelocitySensor_ZVelocity()
	 * @model unique="false"
	 * @generated
	 */
	double getZVelocity();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.sensors.motion.LinearVelocitySensor#getZVelocity <em>ZVelocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZVelocity</em>' attribute.
	 * @see #getZVelocity()
	 * @generated
	 */
	void setZVelocity(double value);

} // LinearVelocitySensor
