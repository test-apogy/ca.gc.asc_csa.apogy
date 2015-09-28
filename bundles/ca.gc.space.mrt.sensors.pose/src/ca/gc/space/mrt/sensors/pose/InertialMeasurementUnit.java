/**
 * Canadian Space Agency 2007.
 */
package ca.gc.space.mrt.sensors.pose;

import ca.gc.space.math.Tuple3d;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inertial Measurement Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.space.mrt.sensors.pose.InertialMeasurementUnit#getAngularVelocity <em>Angular Velocity</em>}</li>
 *   <li>{@link ca.gc.space.mrt.sensors.pose.InertialMeasurementUnit#getLinearAcceleration <em>Linear Acceleration</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.space.mrt.sensors.pose.PosePackage#getInertialMeasurementUnit()
 * @model
 * @generated
 */
public interface InertialMeasurementUnit extends OrientationSensor {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Canadian Space Agency 2007.";

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
	 * @see ca.gc.space.mrt.sensors.pose.PosePackage#getInertialMeasurementUnit_AngularVelocity()
	 * @model containment="true"
	 * @generated
	 */
	Tuple3d getAngularVelocity();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.sensors.pose.InertialMeasurementUnit#getAngularVelocity <em>Angular Velocity</em>}' containment reference.
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
	 * @see ca.gc.space.mrt.sensors.pose.PosePackage#getInertialMeasurementUnit_LinearAcceleration()
	 * @model containment="true"
	 * @generated
	 */
	Tuple3d getLinearAcceleration();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.sensors.pose.InertialMeasurementUnit#getLinearAcceleration <em>Linear Acceleration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linear Acceleration</em>' containment reference.
	 * @see #getLinearAcceleration()
	 * @generated
	 */
	void setLinearAcceleration(Tuple3d value);

} // InertialMeasurementUnit
