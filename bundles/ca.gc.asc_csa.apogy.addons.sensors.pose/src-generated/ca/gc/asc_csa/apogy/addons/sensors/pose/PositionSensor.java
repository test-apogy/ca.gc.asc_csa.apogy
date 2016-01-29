/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.addons.sensors.pose;

import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates;

import ca.gc.asc_csa.apogy.common.topology.PositionNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Position Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.pose.PositionSensor#getPositionCoordinates <em>Position Coordinates</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.addons.sensors.pose.ApogyAddonsSensorsPosePackage#getPositionSensor()
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
	 * @see ca.gc.asc_csa.apogy.addons.sensors.pose.ApogyAddonsSensorsPosePackage#getPositionSensor_PositionCoordinates()
	 * @model transient="true" changeable="false" derived="true"
	 * @generated
	 */
	CartesianPositionCoordinates getPositionCoordinates();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="ca.gc.asc_csa.apogy.addons.sensors.pose.Exception" newPositionUnique="false"
	 * @generated
	 */
	void resetPosition(CartesianPositionCoordinates newPosition) throws Exception;

} // PositionSensor
