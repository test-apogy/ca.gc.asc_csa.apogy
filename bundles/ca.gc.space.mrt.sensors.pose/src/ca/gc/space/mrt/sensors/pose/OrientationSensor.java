/**
 * Canadian Space Agency 2007.
 *
 * $Id: OrientationSensor.java,v 1.2.4.2 2015/05/21 15:51:30 pallard Exp $
 */
package ca.gc.space.mrt.sensors.pose;

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
 *   <li>{@link ca.gc.space.mrt.sensors.pose.OrientationSensor#getOrientationCoordinates <em>Orientation Coordinates</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.space.mrt.sensors.pose.PosePackage#getOrientationSensor()
 * @model
 * @generated
 */
public interface OrientationSensor extends RotationNode, SelfPlaceSensor {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Canadian Space Agency 2007.";

	/**
	 * Returns the value of the '<em><b>Orientation Coordinates</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orientation Coordinates</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientation Coordinates</em>' reference.
	 * @see ca.gc.space.mrt.sensors.pose.PosePackage#getOrientationSensor_OrientationCoordinates()
	 * @model resolveProxies="false" transient="true" changeable="false" derived="true"
	 * @generated
	 */
	CartesianOrientationCoordinates getOrientationCoordinates();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.eclipse.symphony.common.processors.Exception"
	 * @generated
	 */
	void resetOrientation(CartesianOrientationCoordinates newOrientation) throws Exception;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CartesianOrientationCoordinates extractOrientationFromMatrix(Matrix3x3 matrix);

} // OrientationSensor
