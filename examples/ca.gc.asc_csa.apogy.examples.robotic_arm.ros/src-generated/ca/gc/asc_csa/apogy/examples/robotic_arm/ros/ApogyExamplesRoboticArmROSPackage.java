/**
 * Canadian Space Agency / Agence spatiale canadienne - Copyright (c) 2016
 */
package ca.gc.asc_csa.apogy.examples.robotic_arm.ros;

import ca.gc.asc_csa.apogy.examples.robotic_arm.ApogyExamplesRoboticArmPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca),
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 * <!-- end-model-doc -->
 * @see ca.gc.asc_csa.apogy.examples.robotic_arm.ros.ApogyExamplesRoboticArmROSFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='ApogyExamplesRoboticArmROS' modelName='ApogyExamplesRoboticArmROS' copyrightText='Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Pierre Allard (Pierre.Allard@canada.ca), \n    Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n    Sebastien Gemme (Sebastien.Gemme@canada.ca),\n    Canadian Space Agency (CSA) - Initial API and implementation' childCreationExtenders='true' extensibleProviderFactory='true' suppressGenModelAnnotations='false' modelDirectory='/ca.gc.asc_csa.apogy.examples.robotic_arm.ros/src-generated' editDirectory='/ca.gc.asc_csa.apogy.examples.robotic_arm.ros.edit/src-generated' basePackage='ca.gc.asc_csa.apogy.examples.robotic_arm'"
 * @generated
 */
public interface ApogyExamplesRoboticArmROSPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ros";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ca.gc.asc_csa.apogy.examples.robotic_arm.ros";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ros";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApogyExamplesRoboticArmROSPackage eINSTANCE = ca.gc.asc_csa.apogy.examples.robotic_arm.ros.impl.ApogyExamplesRoboticArmROSPackageImpl.init();

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.examples.robotic_arm.ros.impl.RoboticArmROSImpl <em>Robotic Arm ROS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.examples.robotic_arm.ros.impl.RoboticArmROSImpl
	 * @see ca.gc.asc_csa.apogy.examples.robotic_arm.ros.impl.ApogyExamplesRoboticArmROSPackageImpl#getRoboticArmROS()
	 * @generated
	 */
	int ROBOTIC_ARM_ROS = 0;

	/**
	 * The feature id for the '<em><b>Turret Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTIC_ARM_ROS__TURRET_ANGLE = ApogyExamplesRoboticArmPackage.ROBOTIC_ARM__TURRET_ANGLE;

	/**
	 * The feature id for the '<em><b>Shoulder Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTIC_ARM_ROS__SHOULDER_ANGLE = ApogyExamplesRoboticArmPackage.ROBOTIC_ARM__SHOULDER_ANGLE;

	/**
	 * The feature id for the '<em><b>Elbow Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTIC_ARM_ROS__ELBOW_ANGLE = ApogyExamplesRoboticArmPackage.ROBOTIC_ARM__ELBOW_ANGLE;

	/**
	 * The feature id for the '<em><b>Wrist Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTIC_ARM_ROS__WRIST_ANGLE = ApogyExamplesRoboticArmPackage.ROBOTIC_ARM__WRIST_ANGLE;

	/**
	 * The feature id for the '<em><b>Initialized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTIC_ARM_ROS__INITIALIZED = ApogyExamplesRoboticArmPackage.ROBOTIC_ARM__INITIALIZED;

	/**
	 * The feature id for the '<em><b>Arm Moving</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTIC_ARM_ROS__ARM_MOVING = ApogyExamplesRoboticArmPackage.ROBOTIC_ARM__ARM_MOVING;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTIC_ARM_ROS__SPEED = ApogyExamplesRoboticArmPackage.ROBOTIC_ARM__SPEED;

	/**
	 * The feature id for the '<em><b>Service Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTIC_ARM_ROS__SERVICE_MANAGER = ApogyExamplesRoboticArmPackage.ROBOTIC_ARM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Topic Launcher</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTIC_ARM_ROS__TOPIC_LAUNCHER = ApogyExamplesRoboticArmPackage.ROBOTIC_ARM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Publisher Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTIC_ARM_ROS__PUBLISHER_MANAGER = ApogyExamplesRoboticArmPackage.ROBOTIC_ARM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTIC_ARM_ROS__NODE = ApogyExamplesRoboticArmPackage.ROBOTIC_ARM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Robotioc Arm Ros Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTIC_ARM_ROS__ROBOTIOC_ARM_ROS_NODE = ApogyExamplesRoboticArmPackage.ROBOTIC_ARM_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Robotic Arm ROS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTIC_ARM_ROS_FEATURE_COUNT = ApogyExamplesRoboticArmPackage.ROBOTIC_ARM_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTIC_ARM_ROS___INIT = ApogyExamplesRoboticArmPackage.ROBOTIC_ARM___INIT;

	/**
	 * The operation id for the '<em>Cmd Move Speed Level</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTIC_ARM_ROS___CMD_MOVE_SPEED_LEVEL__MOVESPEEDLEVEL = ApogyExamplesRoboticArmPackage.ROBOTIC_ARM___CMD_MOVE_SPEED_LEVEL__MOVESPEEDLEVEL;

	/**
	 * The operation id for the '<em>Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTIC_ARM_ROS___MOVE_TO__DOUBLE_DOUBLE_DOUBLE_DOUBLE = ApogyExamplesRoboticArmPackage.ROBOTIC_ARM___MOVE_TO__DOUBLE_DOUBLE_DOUBLE_DOUBLE;

	/**
	 * The operation id for the '<em>Stow</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTIC_ARM_ROS___STOW = ApogyExamplesRoboticArmPackage.ROBOTIC_ARM___STOW;

	/**
	 * The operation id for the '<em>Ros Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTIC_ARM_ROS___ROS_INIT = ApogyExamplesRoboticArmPackage.ROBOTIC_ARM_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Robotic Arm ROS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTIC_ARM_ROS_OPERATION_COUNT = ApogyExamplesRoboticArmPackage.ROBOTIC_ARM_OPERATION_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.examples.robotic_arm.ros.RoboticArmROS <em>Robotic Arm ROS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Robotic Arm ROS</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.robotic_arm.ros.RoboticArmROS
	 * @generated
	 */
	EClass getRoboticArmROS();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.examples.robotic_arm.ros.RoboticArmROS#getRobotiocArmRosNode <em>Robotioc Arm Ros Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Robotioc Arm Ros Node</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.robotic_arm.ros.RoboticArmROS#getRobotiocArmRosNode()
	 * @see #getRoboticArmROS()
	 * @generated
	 */
	EReference getRoboticArmROS_RobotiocArmRosNode();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ApogyExamplesRoboticArmROSFactory getApogyExamplesRoboticArmROSFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.examples.robotic_arm.ros.impl.RoboticArmROSImpl <em>Robotic Arm ROS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.examples.robotic_arm.ros.impl.RoboticArmROSImpl
		 * @see ca.gc.asc_csa.apogy.examples.robotic_arm.ros.impl.ApogyExamplesRoboticArmROSPackageImpl#getRoboticArmROS()
		 * @generated
		 */
		EClass ROBOTIC_ARM_ROS = eINSTANCE.getRoboticArmROS();

		/**
		 * The meta object literal for the '<em><b>Robotioc Arm Ros Node</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROBOTIC_ARM_ROS__ROBOTIOC_ARM_ROS_NODE = eINSTANCE.getRoboticArmROS_RobotiocArmRosNode();

	}

} //ApogyExamplesRoboticArmROSPackage
