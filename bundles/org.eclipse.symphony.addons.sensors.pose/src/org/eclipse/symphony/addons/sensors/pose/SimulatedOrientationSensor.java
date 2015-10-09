/**
 * Canadian Space Agency 2007.
 *
 * $Id: SimulatedOrientationSensor.java,v 1.2.4.2 2015/05/21 15:51:31 pallard Exp $
 */
package org.eclipse.symphony.addons.sensors.pose;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simulated Orientation Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.sensors.pose.SimulatedOrientationSensor#getXAngularVelocity <em>XAngular Velocity</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.sensors.pose.SimulatedOrientationSensor#getYAngularVelocity <em>YAngular Velocity</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.sensors.pose.SimulatedOrientationSensor#getZAngularVelocity <em>ZAngular Velocity</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.sensors.pose.SimulatedOrientationSensor#getUpdatePeriod <em>Update Period</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.addons.sensors.pose.PosePackage#getSimulatedOrientationSensor()
 * @model
 * @generated
 */
public interface SimulatedOrientationSensor extends OrientationSensor
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Canadian Space Agency 2007.";

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
	 * @see org.eclipse.symphony.addons.sensors.pose.PosePackage#getSimulatedOrientationSensor_XAngularVelocity()
	 * @model
	 * @generated
	 */
	double getXAngularVelocity();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.sensors.pose.SimulatedOrientationSensor#getXAngularVelocity <em>XAngular Velocity</em>}' attribute.
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
	 * @see org.eclipse.symphony.addons.sensors.pose.PosePackage#getSimulatedOrientationSensor_YAngularVelocity()
	 * @model
	 * @generated
	 */
	double getYAngularVelocity();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.sensors.pose.SimulatedOrientationSensor#getYAngularVelocity <em>YAngular Velocity</em>}' attribute.
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
	 * @see org.eclipse.symphony.addons.sensors.pose.PosePackage#getSimulatedOrientationSensor_ZAngularVelocity()
	 * @model
	 * @generated
	 */
	double getZAngularVelocity();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.sensors.pose.SimulatedOrientationSensor#getZAngularVelocity <em>ZAngular Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZAngular Velocity</em>' attribute.
	 * @see #getZAngularVelocity()
	 * @generated
	 */
	void setZAngularVelocity(double value);

	/**
	 * Returns the value of the '<em><b>Update Period</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Update Period</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Period</em>' attribute.
	 * @see #setUpdatePeriod(double)
	 * @see org.eclipse.symphony.addons.sensors.pose.PosePackage#getSimulatedOrientationSensor_UpdatePeriod()
	 * @model default="1.0"
	 * @generated
	 */
	double getUpdatePeriod();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.sensors.pose.SimulatedOrientationSensor#getUpdatePeriod <em>Update Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Period</em>' attribute.
	 * @see #getUpdatePeriod()
	 * @generated
	 */
	void setUpdatePeriod(double value);

} // SimulatedOrientationSensor
