/**
 * Canadian Space Agency 2007.
 *
 * $Id: PositionSensor.java,v 1.2.4.2 2015/05/21 15:51:31 pallard Exp $
 */
package ca.gc.space.mrt.sensors.pose;

import ca.gc.space.mrt.geometry.data3d.CartesianPositionCoordinates;
import ca.gc.space.topology.PositionNode;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Position Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.space.mrt.sensors.pose.PositionSensor#getPositionCoordinates <em>Position Coordinates</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.space.mrt.sensors.pose.PosePackage#getPositionSensor()
 * @model
 * @generated
 */
public interface PositionSensor extends PositionNode, SelfPlaceSensor {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Canadian Space Agency 2007.";

	/**
	 * Returns the value of the '<em><b>Position Coordinates</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position Coordinates</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position Coordinates</em>' reference.
	 * @see ca.gc.space.mrt.sensors.pose.PosePackage#getPositionSensor_PositionCoordinates()
	 * @model resolveProxies="false" transient="true" changeable="false" derived="true"
	 * @generated
	 */
	CartesianPositionCoordinates getPositionCoordinates();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="ca.gc.space.mrt.common.processors.Exception"
	 * @generated
	 */
	void resetPosition(CartesianPositionCoordinates newPosition) throws Exception;

} // PositionSensor
