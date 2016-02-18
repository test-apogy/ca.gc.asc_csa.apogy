/**
 * Canadian Space Agency / Agence spatiale canadienne - Copyright (c) 2016
 */
package ca.gc.asc_csa.apogy.examples.robotic_arm.ros;

import ca.gc.asc_csa.apogy.addons.ros.ROSInterface;
import ca.gc.asc_csa.apogy.addons.ros.ROSNode;

import ca.gc.asc_csa.apogy.examples.robotic_arm.RoboticArm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Robotic Arm ROS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * This class is an implementation of RoboticArm that is a client
 * of a Robot Operating System (ROS) server node. It shows one way
 * of interfacing an Apogy System with an ROS implementation.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.robotic_arm.ros.RoboticArmROS#getRobotiocArmRosNode <em>Robotioc Arm Ros Node</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.examples.robotic_arm.ros.ApogyExamplesRoboticArmROSPackage#getRoboticArmROS()
 * @model
 * @generated
 */
public interface RoboticArmROS extends RoboticArm, ROSInterface {
	/**
	 * Returns the value of the '<em><b>Robotioc Arm Ros Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Robotioc Arm Ros Node</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * The ROSNode used to manage the connection with ROS.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Robotioc Arm Ros Node</em>' containment reference.
	 * @see #setRobotiocArmRosNode(ROSNode)
	 * @see ca.gc.asc_csa.apogy.examples.robotic_arm.ros.ApogyExamplesRoboticArmROSPackage#getRoboticArmROS_RobotiocArmRosNode()
	 * @model containment="true"
	 * @generated
	 */
	ROSNode getRobotiocArmRosNode();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.examples.robotic_arm.ros.RoboticArmROS#getRobotiocArmRosNode <em>Robotioc Arm Ros Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Robotioc Arm Ros Node</em>' containment reference.
	 * @see #getRobotiocArmRosNode()
	 * @generated
	 */
	void setRobotiocArmRosNode(ROSNode value);

} // RoboticArmROS
