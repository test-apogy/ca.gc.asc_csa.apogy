/**
 * Canadian Space Agency 2007.
 *
 * $Id: PoseSensor.java,v 1.2.4.2 2015/05/21 15:51:30 pallard Exp $
 */
package org.eclipse.symphony.addons.sensors.pose;

import org.eclipse.symphony.common.geometry.data3d.Pose;
import org.eclipse.symphony.common.topology.TransformNode;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.sensors.pose.PoseSensor#getPose <em>Pose</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.sensors.pose.PoseSensor#getDataLogger <em>Data Logger</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.addons.sensors.pose.PosePackage#getPoseSensor()
 * @model
 * @generated
 */
public interface PoseSensor extends TransformNode, PositionSensor, OrientationSensor {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Canadian Space Agency 2007.";

	/**
	 * Returns the value of the '<em><b>Pose</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pose</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pose</em>' reference.
	 * @see org.eclipse.symphony.addons.sensors.pose.PosePackage#getPoseSensor_Pose()
	 * @model resolveProxies="false" required="true" transient="true" changeable="false" derived="true"
	 * @generated
	 */
	Pose getPose();

	/**
	 * Returns the value of the '<em><b>Data Logger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Logger</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Logger</em>' containment reference.
	 * @see #setDataLogger(PoseDataLogger)
	 * @see org.eclipse.symphony.addons.sensors.pose.PosePackage#getPoseSensor_DataLogger()
	 * @model containment="true"
	 * @generated
	 */
	PoseDataLogger getDataLogger();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.sensors.pose.PoseSensor#getDataLogger <em>Data Logger</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Logger</em>' containment reference.
	 * @see #getDataLogger()
	 * @generated
	 */
	void setDataLogger(PoseDataLogger value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.eclipse.symphony.common.processors.Exception"
	 * @generated
	 */
	void resetPose(Pose newPose) throws Exception;

} // PoseSensor
