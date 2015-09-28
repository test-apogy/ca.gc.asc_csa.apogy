/**
 * <copyright>
 * </copyright>
 *
 * $Id: LinearAccelerationSensor.java,v 1.2.4.2 2015/05/21 15:50:26 pallard Exp $
 */
package motion;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Linear Acceleration Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link motion.LinearAccelerationSensor#getXAcceleration <em>XAcceleration</em>}</li>
 *   <li>{@link motion.LinearAccelerationSensor#getYAcceleration <em>YAcceleration</em>}</li>
 *   <li>{@link motion.LinearAccelerationSensor#getZAcceleration <em>ZAcceleration</em>}</li>
 * </ul>
 * </p>
 *
 * @see motion.MotionPackage#getLinearAccelerationSensor()
 * @model
 * @generated
 */
public interface LinearAccelerationSensor extends SelfMotionSensor {
	/**
	 * Returns the value of the '<em><b>XAcceleration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XAcceleration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XAcceleration</em>' attribute.
	 * @see #setXAcceleration(double)
	 * @see motion.MotionPackage#getLinearAccelerationSensor_XAcceleration()
	 * @model required="true"
	 * @generated
	 */
	double getXAcceleration();

	/**
	 * Sets the value of the '{@link motion.LinearAccelerationSensor#getXAcceleration <em>XAcceleration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XAcceleration</em>' attribute.
	 * @see #getXAcceleration()
	 * @generated
	 */
	void setXAcceleration(double value);

	/**
	 * Returns the value of the '<em><b>YAcceleration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>YAcceleration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YAcceleration</em>' attribute.
	 * @see #setYAcceleration(double)
	 * @see motion.MotionPackage#getLinearAccelerationSensor_YAcceleration()
	 * @model required="true"
	 * @generated
	 */
	double getYAcceleration();

	/**
	 * Sets the value of the '{@link motion.LinearAccelerationSensor#getYAcceleration <em>YAcceleration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YAcceleration</em>' attribute.
	 * @see #getYAcceleration()
	 * @generated
	 */
	void setYAcceleration(double value);

	/**
	 * Returns the value of the '<em><b>ZAcceleration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ZAcceleration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ZAcceleration</em>' attribute.
	 * @see #setZAcceleration(double)
	 * @see motion.MotionPackage#getLinearAccelerationSensor_ZAcceleration()
	 * @model required="true"
	 * @generated
	 */
	double getZAcceleration();

	/**
	 * Sets the value of the '{@link motion.LinearAccelerationSensor#getZAcceleration <em>ZAcceleration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZAcceleration</em>' attribute.
	 * @see #getZAcceleration()
	 * @generated
	 */
	void setZAcceleration(double value);

} // LinearAccelerationSensor
