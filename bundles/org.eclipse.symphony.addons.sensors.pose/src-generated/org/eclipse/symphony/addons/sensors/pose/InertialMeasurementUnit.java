/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.pose;

import org.eclipse.symphony.common.math.Tuple3d;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inertial Measurement Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.sensors.pose.InertialMeasurementUnit#getAngularVelocity <em>Angular Velocity</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.sensors.pose.InertialMeasurementUnit#getLinearAcceleration <em>Linear Acceleration</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.addons.sensors.pose.PosePackage#getInertialMeasurementUnit()
 * @model
 * @generated
 */
public interface InertialMeasurementUnit extends OrientationSensor {
	/**
	 * Returns the value of the '<em><b>Angular Velocity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Angular Velocity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angular Velocity</em>' containment reference.
	 * @see #setAngularVelocity(Tuple3d)
	 * @see org.eclipse.symphony.addons.sensors.pose.PosePackage#getInertialMeasurementUnit_AngularVelocity()
	 * @model containment="true"
	 * @generated
	 */
	Tuple3d getAngularVelocity();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.sensors.pose.InertialMeasurementUnit#getAngularVelocity <em>Angular Velocity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angular Velocity</em>' containment reference.
	 * @see #getAngularVelocity()
	 * @generated
	 */
	void setAngularVelocity(Tuple3d value);

	/**
	 * Returns the value of the '<em><b>Linear Acceleration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linear Acceleration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linear Acceleration</em>' containment reference.
	 * @see #setLinearAcceleration(Tuple3d)
	 * @see org.eclipse.symphony.addons.sensors.pose.PosePackage#getInertialMeasurementUnit_LinearAcceleration()
	 * @model containment="true"
	 * @generated
	 */
	Tuple3d getLinearAcceleration();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.sensors.pose.InertialMeasurementUnit#getLinearAcceleration <em>Linear Acceleration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linear Acceleration</em>' containment reference.
	 * @see #getLinearAcceleration()
	 * @generated
	 */
	void setLinearAcceleration(Tuple3d value);

} // InertialMeasurementUnit