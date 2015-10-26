/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.pose;

import org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates;

import org.eclipse.symphony.common.topology.PositionNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Position Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.sensors.pose.PositionSensor#getPositionCoordinates <em>Position Coordinates</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.addons.sensors.pose.PosePackage#getPositionSensor()
 * @model
 * @generated
 */
public interface PositionSensor extends PositionNode, SelfPlaceSensor {
	/**
	 * Returns the value of the '<em><b>Position Coordinates</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position Coordinates</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position Coordinates</em>' reference.
	 * @see org.eclipse.symphony.addons.sensors.pose.PosePackage#getPositionSensor_PositionCoordinates()
	 * @model transient="true" changeable="false" derived="true"
	 * @generated
	 */
	CartesianPositionCoordinates getPositionCoordinates();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.eclipse.symphony.addons.sensors.pose.Exception" newPositionUnique="false"
	 * @generated
	 */
	void resetPosition(CartesianPositionCoordinates newPosition) throws Exception;

} // PositionSensor
