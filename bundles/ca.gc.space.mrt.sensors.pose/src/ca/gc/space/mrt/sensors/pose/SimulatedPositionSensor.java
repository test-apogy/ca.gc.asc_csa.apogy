/**
 * Canadian Space Agency 2007.
 *
 * $Id: SimulatedPositionSensor.java,v 1.2.4.2 2015/05/21 15:51:31 pallard Exp $
 */
package ca.gc.space.mrt.sensors.pose;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simulated Position Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.space.mrt.sensors.pose.SimulatedPositionSensor#getXVelocity <em>XVelocity</em>}</li>
 *   <li>{@link ca.gc.space.mrt.sensors.pose.SimulatedPositionSensor#getYVelocity <em>YVelocity</em>}</li>
 *   <li>{@link ca.gc.space.mrt.sensors.pose.SimulatedPositionSensor#getZVelocity <em>ZVelocity</em>}</li>
 *   <li>{@link ca.gc.space.mrt.sensors.pose.SimulatedPositionSensor#getUpdatePeriod <em>Update Period</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.space.mrt.sensors.pose.PosePackage#getSimulatedPositionSensor()
 * @model
 * @generated
 */
public interface SimulatedPositionSensor extends PositionSensor
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Canadian Space Agency 2007.";

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
	 * @see ca.gc.space.mrt.sensors.pose.PosePackage#getSimulatedPositionSensor_XVelocity()
	 * @model
	 * @generated
	 */
	double getXVelocity();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.sensors.pose.SimulatedPositionSensor#getXVelocity <em>XVelocity</em>}' attribute.
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
	 * @see ca.gc.space.mrt.sensors.pose.PosePackage#getSimulatedPositionSensor_YVelocity()
	 * @model
	 * @generated
	 */
	double getYVelocity();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.sensors.pose.SimulatedPositionSensor#getYVelocity <em>YVelocity</em>}' attribute.
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
	 * @see ca.gc.space.mrt.sensors.pose.PosePackage#getSimulatedPositionSensor_ZVelocity()
	 * @model
	 * @generated
	 */
	double getZVelocity();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.sensors.pose.SimulatedPositionSensor#getZVelocity <em>ZVelocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZVelocity</em>' attribute.
	 * @see #getZVelocity()
	 * @generated
	 */
	void setZVelocity(double value);

	/**
	 * Returns the value of the '<em><b>Update Period</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Update Period</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Period</em>' attribute.
	 * @see #setUpdatePeriod(double)
	 * @see ca.gc.space.mrt.sensors.pose.PosePackage#getSimulatedPositionSensor_UpdatePeriod()
	 * @model default="1"
	 * @generated
	 */
	double getUpdatePeriod();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.sensors.pose.SimulatedPositionSensor#getUpdatePeriod <em>Update Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Period</em>' attribute.
	 * @see #getUpdatePeriod()
	 * @generated
	 */
	void setUpdatePeriod(double value);

} // SimulatedPositionSensor
