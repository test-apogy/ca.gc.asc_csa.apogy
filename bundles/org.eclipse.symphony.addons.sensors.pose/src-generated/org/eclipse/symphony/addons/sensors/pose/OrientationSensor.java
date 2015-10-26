/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.pose;

import org.eclipse.symphony.common.geometry.data3d.CartesianOrientationCoordinates;

import org.eclipse.symphony.common.math.Matrix3x3;

import org.eclipse.symphony.common.topology.RotationNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Orientation Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.sensors.pose.OrientationSensor#getOrientationCoordinates <em>Orientation Coordinates</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.addons.sensors.pose.PosePackage#getOrientationSensor()
 * @model
 * @generated
 */
public interface OrientationSensor extends RotationNode, SelfPlaceSensor {
	/**
	 * Returns the value of the '<em><b>Orientation Coordinates</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orientation Coordinates</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientation Coordinates</em>' reference.
	 * @see org.eclipse.symphony.addons.sensors.pose.PosePackage#getOrientationSensor_OrientationCoordinates()
	 * @model transient="true" changeable="false" derived="true"
	 * @generated
	 */
	CartesianOrientationCoordinates getOrientationCoordinates();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.eclipse.symphony.addons.sensors.pose.Exception" newOrientationUnique="false"
	 * @generated
	 */
	void resetOrientation(CartesianOrientationCoordinates newOrientation) throws Exception;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" matrixUnique="false"
	 * @generated
	 */
	CartesianOrientationCoordinates extractOrientationFromMatrix(Matrix3x3 matrix);

} // OrientationSensor
