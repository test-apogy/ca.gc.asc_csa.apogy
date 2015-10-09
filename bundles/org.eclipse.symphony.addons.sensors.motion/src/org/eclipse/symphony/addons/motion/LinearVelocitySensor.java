/**
 * <copyright>
 * </copyright>
 *
 * $Id: LinearVelocitySensor.java,v 1.2.4.2 2015/05/21 15:50:26 pallard Exp $
 */
package org.eclipse.symphony.addons.motion;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Linear Velocity Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.motion.LinearVelocitySensor#getXVelocity <em>XVelocity</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.motion.LinearVelocitySensor#getYVelocity <em>YVelocity</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.motion.LinearVelocitySensor#getZVelocity <em>ZVelocity</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.addons.motion.MotionPackage#getLinearVelocitySensor()
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
	 * @see org.eclipse.symphony.addons.motion.MotionPackage#getLinearVelocitySensor_XVelocity()
	 * @model required="true"
	 * @generated
	 */
	double getXVelocity();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.motion.LinearVelocitySensor#getXVelocity <em>XVelocity</em>}' attribute.
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
	 * @see org.eclipse.symphony.addons.motion.MotionPackage#getLinearVelocitySensor_YVelocity()
	 * @model required="true"
	 * @generated
	 */
	double getYVelocity();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.motion.LinearVelocitySensor#getYVelocity <em>YVelocity</em>}' attribute.
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
	 * @see org.eclipse.symphony.addons.motion.MotionPackage#getLinearVelocitySensor_ZVelocity()
	 * @model required="true"
	 * @generated
	 */
	double getZVelocity();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.motion.LinearVelocitySensor#getZVelocity <em>ZVelocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZVelocity</em>' attribute.
	 * @see #getZVelocity()
	 * @generated
	 */
	void setZVelocity(double value);

} // LinearVelocitySensor
