/**
 * <copyright>
 * </copyright>
 *
 * $Id: AngularVelocitySensor.java,v 1.2.4.2 2015/05/21 15:50:26 pallard Exp $
 */
package org.eclipse.symphony.addons.motion;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Angular Velocity Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.motion.AngularVelocitySensor#getXAngularVelocity <em>XAngular Velocity</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.motion.AngularVelocitySensor#getYAngularVelocity <em>YAngular Velocity</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.motion.AngularVelocitySensor#getZAngularVelocity <em>ZAngular Velocity</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.addons.motion.MotionPackage#getAngularVelocitySensor()
 * @model
 * @generated
 */
public interface AngularVelocitySensor extends SelfMotionSensor {
	/**
	 * Returns the value of the '<em><b>XAngular Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XAngular Velocity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XAngular Velocity</em>' attribute.
	 * @see #setXAngularVelocity(double)
	 * @see org.eclipse.symphony.addons.motion.MotionPackage#getAngularVelocitySensor_XAngularVelocity()
	 * @model required="true"
	 * @generated
	 */
	double getXAngularVelocity();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.motion.AngularVelocitySensor#getXAngularVelocity <em>XAngular Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XAngular Velocity</em>' attribute.
	 * @see #getXAngularVelocity()
	 * @generated
	 */
	void setXAngularVelocity(double value);

	/**
	 * Returns the value of the '<em><b>YAngular Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>YAngular Velocity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YAngular Velocity</em>' attribute.
	 * @see #setYAngularVelocity(double)
	 * @see org.eclipse.symphony.addons.motion.MotionPackage#getAngularVelocitySensor_YAngularVelocity()
	 * @model required="true"
	 * @generated
	 */
	double getYAngularVelocity();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.motion.AngularVelocitySensor#getYAngularVelocity <em>YAngular Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YAngular Velocity</em>' attribute.
	 * @see #getYAngularVelocity()
	 * @generated
	 */
	void setYAngularVelocity(double value);

	/**
	 * Returns the value of the '<em><b>ZAngular Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ZAngular Velocity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ZAngular Velocity</em>' attribute.
	 * @see #setZAngularVelocity(double)
	 * @see org.eclipse.symphony.addons.motion.MotionPackage#getAngularVelocitySensor_ZAngularVelocity()
	 * @model required="true"
	 * @generated
	 */
	double getZAngularVelocity();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.motion.AngularVelocitySensor#getZAngularVelocity <em>ZAngular Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZAngular Velocity</em>' attribute.
	 * @see #getZAngularVelocity()
	 * @generated
	 */
	void setZAngularVelocity(double value);

} // AngularVelocitySensor
