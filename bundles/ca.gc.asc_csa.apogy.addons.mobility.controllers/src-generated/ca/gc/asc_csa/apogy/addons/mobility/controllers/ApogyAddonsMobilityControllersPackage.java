package ca.gc.asc_csa.apogy.addons.mobility.controllers;
/*
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
 */

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
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
 * @see ca.gc.asc_csa.apogy.addons.mobility.controllers.ApogyAddonsMobilityControllersFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='ApogyAddonsMobilityControllers' childCreationExtenders='true' extensibleProviderFactory='true' copyrightText='Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)' modelName='ApogyAddonsMobilityControllers' modelDirectory='/ca.gc.asc_csa.apogy.addons.mobility.controllers/src-generated' editDirectory='/ca.gc.asc_csa.apogy.addons.mobility.controllers.edit/src-generated' basePackage='ca.gc.asc_csa.apogy.addons.mobility'"
 * @generated
 */
public interface ApogyAddonsMobilityControllersPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "controllers";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ca.gc.asc_csa.apogy.addons.mobility.controllers";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "controllers";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApogyAddonsMobilityControllersPackage eINSTANCE = ca.gc.asc_csa.apogy.addons.mobility.controllers.impl.ApogyAddonsMobilityControllersPackageImpl.init();

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.impl.PathFollowerImpl <em>Path Follower</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.addons.mobility.controllers.impl.PathFollowerImpl
	 * @see ca.gc.asc_csa.apogy.addons.mobility.controllers.impl.ApogyAddonsMobilityControllersPackageImpl#getPathFollower()
	 * @generated
	 */
	int PATH_FOLLOWER = 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_FOLLOWER__PATH = 0;

	/**
	 * The feature id for the '<em><b>Platform</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_FOLLOWER__PLATFORM = 1;

	/**
	 * The feature id for the '<em><b>Pose Sensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_FOLLOWER__POSE_SENSOR = 2;

	/**
	 * The feature id for the '<em><b>Destination Reached</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_FOLLOWER__DESTINATION_REACHED = 3;

	/**
	 * The feature id for the '<em><b>Path Follower State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_FOLLOWER__PATH_FOLLOWER_STATE = 4;

	/**
	 * The number of structural features of the '<em>Path Follower</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_FOLLOWER_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_FOLLOWER___START = 0;

	/**
	 * The operation id for the '<em>Pause</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_FOLLOWER___PAUSE = 1;

	/**
	 * The operation id for the '<em>Resume</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_FOLLOWER___RESUME = 2;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_FOLLOWER___STOP = 3;

	/**
	 * The operation id for the '<em>Is Transition Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_FOLLOWER___IS_TRANSITION_VALID__PATHFOLLOWERSTATE = 4;

	/**
	 * The number of operations of the '<em>Path Follower</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_FOLLOWER_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.impl.SkidSteeredPlatformPathFollowerImpl <em>Skid Steered Platform Path Follower</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.addons.mobility.controllers.impl.SkidSteeredPlatformPathFollowerImpl
	 * @see ca.gc.asc_csa.apogy.addons.mobility.controllers.impl.ApogyAddonsMobilityControllersPackageImpl#getSkidSteeredPlatformPathFollower()
	 * @generated
	 */
	int SKID_STEERED_PLATFORM_PATH_FOLLOWER = 1;

	/**
	 * The feature id for the '<em><b>Path</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKID_STEERED_PLATFORM_PATH_FOLLOWER__PATH = PATH_FOLLOWER__PATH;

	/**
	 * The feature id for the '<em><b>Platform</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKID_STEERED_PLATFORM_PATH_FOLLOWER__PLATFORM = PATH_FOLLOWER__PLATFORM;

	/**
	 * The feature id for the '<em><b>Pose Sensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKID_STEERED_PLATFORM_PATH_FOLLOWER__POSE_SENSOR = PATH_FOLLOWER__POSE_SENSOR;

	/**
	 * The feature id for the '<em><b>Destination Reached</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKID_STEERED_PLATFORM_PATH_FOLLOWER__DESTINATION_REACHED = PATH_FOLLOWER__DESTINATION_REACHED;

	/**
	 * The feature id for the '<em><b>Path Follower State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKID_STEERED_PLATFORM_PATH_FOLLOWER__PATH_FOLLOWER_STATE = PATH_FOLLOWER__PATH_FOLLOWER_STATE;

	/**
	 * The feature id for the '<em><b>Maximum Angular Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKID_STEERED_PLATFORM_PATH_FOLLOWER__MAXIMUM_ANGULAR_VELOCITY = PATH_FOLLOWER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Maximum Linear Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKID_STEERED_PLATFORM_PATH_FOLLOWER__MAXIMUM_LINEAR_VELOCITY = PATH_FOLLOWER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Skid Steered Platform Path Follower</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKID_STEERED_PLATFORM_PATH_FOLLOWER_FEATURE_COUNT = PATH_FOLLOWER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKID_STEERED_PLATFORM_PATH_FOLLOWER___START = PATH_FOLLOWER___START;

	/**
	 * The operation id for the '<em>Pause</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKID_STEERED_PLATFORM_PATH_FOLLOWER___PAUSE = PATH_FOLLOWER___PAUSE;

	/**
	 * The operation id for the '<em>Resume</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKID_STEERED_PLATFORM_PATH_FOLLOWER___RESUME = PATH_FOLLOWER___RESUME;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKID_STEERED_PLATFORM_PATH_FOLLOWER___STOP = PATH_FOLLOWER___STOP;

	/**
	 * The operation id for the '<em>Is Transition Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKID_STEERED_PLATFORM_PATH_FOLLOWER___IS_TRANSITION_VALID__PATHFOLLOWERSTATE = PATH_FOLLOWER___IS_TRANSITION_VALID__PATHFOLLOWERSTATE;

	/**
	 * The number of operations of the '<em>Skid Steered Platform Path Follower</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKID_STEERED_PLATFORM_PATH_FOLLOWER_OPERATION_COUNT = PATH_FOLLOWER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.impl.PathRecorderImpl <em>Path Recorder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.addons.mobility.controllers.impl.PathRecorderImpl
	 * @see ca.gc.asc_csa.apogy.addons.mobility.controllers.impl.ApogyAddonsMobilityControllersPackageImpl#getPathRecorder()
	 * @generated
	 */
	int PATH_RECORDER = 2;

	/**
	 * The feature id for the '<em><b>Position Sensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_RECORDER__POSITION_SENSOR = 0;

	/**
	 * The feature id for the '<em><b>Minimum Distance Delta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_RECORDER__MINIMUM_DISTANCE_DELTA = 1;

	/**
	 * The feature id for the '<em><b>Minimum Time Delta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_RECORDER__MINIMUM_TIME_DELTA = 2;

	/**
	 * The feature id for the '<em><b>Sampling Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_RECORDER__SAMPLING_MODE = 3;

	/**
	 * The feature id for the '<em><b>Recorded Path</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_RECORDER__RECORDED_PATH = 4;

	/**
	 * The number of structural features of the '<em>Path Recorder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_RECORDER_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Path Recorder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_RECORDER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.impl.WaypointPathRecorderImpl <em>Waypoint Path Recorder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.addons.mobility.controllers.impl.WaypointPathRecorderImpl
	 * @see ca.gc.asc_csa.apogy.addons.mobility.controllers.impl.ApogyAddonsMobilityControllersPackageImpl#getWaypointPathRecorder()
	 * @generated
	 */
	int WAYPOINT_PATH_RECORDER = 3;

	/**
	 * The feature id for the '<em><b>Position Sensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAYPOINT_PATH_RECORDER__POSITION_SENSOR = PATH_RECORDER__POSITION_SENSOR;

	/**
	 * The feature id for the '<em><b>Minimum Distance Delta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAYPOINT_PATH_RECORDER__MINIMUM_DISTANCE_DELTA = PATH_RECORDER__MINIMUM_DISTANCE_DELTA;

	/**
	 * The feature id for the '<em><b>Minimum Time Delta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAYPOINT_PATH_RECORDER__MINIMUM_TIME_DELTA = PATH_RECORDER__MINIMUM_TIME_DELTA;

	/**
	 * The feature id for the '<em><b>Sampling Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAYPOINT_PATH_RECORDER__SAMPLING_MODE = PATH_RECORDER__SAMPLING_MODE;

	/**
	 * The feature id for the '<em><b>Recorded Path</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAYPOINT_PATH_RECORDER__RECORDED_PATH = PATH_RECORDER__RECORDED_PATH;

	/**
	 * The number of structural features of the '<em>Waypoint Path Recorder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAYPOINT_PATH_RECORDER_FEATURE_COUNT = PATH_RECORDER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Waypoint Path Recorder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAYPOINT_PATH_RECORDER_OPERATION_COUNT = PATH_RECORDER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.impl.SkidSteeredWayPointPathFollowerImpl <em>Skid Steered Way Point Path Follower</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.addons.mobility.controllers.impl.SkidSteeredWayPointPathFollowerImpl
	 * @see ca.gc.asc_csa.apogy.addons.mobility.controllers.impl.ApogyAddonsMobilityControllersPackageImpl#getSkidSteeredWayPointPathFollower()
	 * @generated
	 */
	int SKID_STEERED_WAY_POINT_PATH_FOLLOWER = 4;

	/**
	 * The feature id for the '<em><b>Path</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKID_STEERED_WAY_POINT_PATH_FOLLOWER__PATH = SKID_STEERED_PLATFORM_PATH_FOLLOWER__PATH;

	/**
	 * The feature id for the '<em><b>Platform</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKID_STEERED_WAY_POINT_PATH_FOLLOWER__PLATFORM = SKID_STEERED_PLATFORM_PATH_FOLLOWER__PLATFORM;

	/**
	 * The feature id for the '<em><b>Pose Sensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKID_STEERED_WAY_POINT_PATH_FOLLOWER__POSE_SENSOR = SKID_STEERED_PLATFORM_PATH_FOLLOWER__POSE_SENSOR;

	/**
	 * The feature id for the '<em><b>Destination Reached</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKID_STEERED_WAY_POINT_PATH_FOLLOWER__DESTINATION_REACHED = SKID_STEERED_PLATFORM_PATH_FOLLOWER__DESTINATION_REACHED;

	/**
	 * The feature id for the '<em><b>Path Follower State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKID_STEERED_WAY_POINT_PATH_FOLLOWER__PATH_FOLLOWER_STATE = SKID_STEERED_PLATFORM_PATH_FOLLOWER__PATH_FOLLOWER_STATE;

	/**
	 * The feature id for the '<em><b>Maximum Angular Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKID_STEERED_WAY_POINT_PATH_FOLLOWER__MAXIMUM_ANGULAR_VELOCITY = SKID_STEERED_PLATFORM_PATH_FOLLOWER__MAXIMUM_ANGULAR_VELOCITY;

	/**
	 * The feature id for the '<em><b>Maximum Linear Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKID_STEERED_WAY_POINT_PATH_FOLLOWER__MAXIMUM_LINEAR_VELOCITY = SKID_STEERED_PLATFORM_PATH_FOLLOWER__MAXIMUM_LINEAR_VELOCITY;

	/**
	 * The number of structural features of the '<em>Skid Steered Way Point Path Follower</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKID_STEERED_WAY_POINT_PATH_FOLLOWER_FEATURE_COUNT = SKID_STEERED_PLATFORM_PATH_FOLLOWER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKID_STEERED_WAY_POINT_PATH_FOLLOWER___START = SKID_STEERED_PLATFORM_PATH_FOLLOWER___START;

	/**
	 * The operation id for the '<em>Pause</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKID_STEERED_WAY_POINT_PATH_FOLLOWER___PAUSE = SKID_STEERED_PLATFORM_PATH_FOLLOWER___PAUSE;

	/**
	 * The operation id for the '<em>Resume</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKID_STEERED_WAY_POINT_PATH_FOLLOWER___RESUME = SKID_STEERED_PLATFORM_PATH_FOLLOWER___RESUME;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKID_STEERED_WAY_POINT_PATH_FOLLOWER___STOP = SKID_STEERED_PLATFORM_PATH_FOLLOWER___STOP;

	/**
	 * The operation id for the '<em>Is Transition Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKID_STEERED_WAY_POINT_PATH_FOLLOWER___IS_TRANSITION_VALID__PATHFOLLOWERSTATE = SKID_STEERED_PLATFORM_PATH_FOLLOWER___IS_TRANSITION_VALID__PATHFOLLOWERSTATE;

	/**
	 * The number of operations of the '<em>Skid Steered Way Point Path Follower</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKID_STEERED_WAY_POINT_PATH_FOLLOWER_OPERATION_COUNT = SKID_STEERED_PLATFORM_PATH_FOLLOWER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.impl.AstolfiGuidanceControllerImpl <em>Astolfi Guidance Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.addons.mobility.controllers.impl.AstolfiGuidanceControllerImpl
	 * @see ca.gc.asc_csa.apogy.addons.mobility.controllers.impl.ApogyAddonsMobilityControllersPackageImpl#getAstolfiGuidanceController()
	 * @generated
	 */
	int ASTOLFI_GUIDANCE_CONTROLLER = 5;

	/**
	 * The feature id for the '<em><b>Path</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTOLFI_GUIDANCE_CONTROLLER__PATH = SKID_STEERED_PLATFORM_PATH_FOLLOWER__PATH;

	/**
	 * The feature id for the '<em><b>Platform</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTOLFI_GUIDANCE_CONTROLLER__PLATFORM = SKID_STEERED_PLATFORM_PATH_FOLLOWER__PLATFORM;

	/**
	 * The feature id for the '<em><b>Pose Sensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTOLFI_GUIDANCE_CONTROLLER__POSE_SENSOR = SKID_STEERED_PLATFORM_PATH_FOLLOWER__POSE_SENSOR;

	/**
	 * The feature id for the '<em><b>Destination Reached</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTOLFI_GUIDANCE_CONTROLLER__DESTINATION_REACHED = SKID_STEERED_PLATFORM_PATH_FOLLOWER__DESTINATION_REACHED;

	/**
	 * The feature id for the '<em><b>Path Follower State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTOLFI_GUIDANCE_CONTROLLER__PATH_FOLLOWER_STATE = SKID_STEERED_PLATFORM_PATH_FOLLOWER__PATH_FOLLOWER_STATE;

	/**
	 * The feature id for the '<em><b>Maximum Angular Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTOLFI_GUIDANCE_CONTROLLER__MAXIMUM_ANGULAR_VELOCITY = SKID_STEERED_PLATFORM_PATH_FOLLOWER__MAXIMUM_ANGULAR_VELOCITY;

	/**
	 * The feature id for the '<em><b>Maximum Linear Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTOLFI_GUIDANCE_CONTROLLER__MAXIMUM_LINEAR_VELOCITY = SKID_STEERED_PLATFORM_PATH_FOLLOWER__MAXIMUM_LINEAR_VELOCITY;

	/**
	 * The feature id for the '<em><b>Current Way Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTOLFI_GUIDANCE_CONTROLLER__CURRENT_WAY_POINT = SKID_STEERED_PLATFORM_PATH_FOLLOWER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Previous Way Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTOLFI_GUIDANCE_CONTROLLER__PREVIOUS_WAY_POINT = SKID_STEERED_PLATFORM_PATH_FOLLOWER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Current Pose In Guidance Reference Frame</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTOLFI_GUIDANCE_CONTROLLER__CURRENT_POSE_IN_GUIDANCE_REFERENCE_FRAME = SKID_STEERED_PLATFORM_PATH_FOLLOWER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rho</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTOLFI_GUIDANCE_CONTROLLER__RHO = SKID_STEERED_PLATFORM_PATH_FOLLOWER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Phi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTOLFI_GUIDANCE_CONTROLLER__PHI = SKID_STEERED_PLATFORM_PATH_FOLLOWER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTOLFI_GUIDANCE_CONTROLLER__ALPHA = SKID_STEERED_PLATFORM_PATH_FOLLOWER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Yaw</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTOLFI_GUIDANCE_CONTROLLER__YAW = SKID_STEERED_PLATFORM_PATH_FOLLOWER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Nu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTOLFI_GUIDANCE_CONTROLLER__NU = SKID_STEERED_PLATFORM_PATH_FOLLOWER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Omega</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTOLFI_GUIDANCE_CONTROLLER__OMEGA = SKID_STEERED_PLATFORM_PATH_FOLLOWER_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Krho</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTOLFI_GUIDANCE_CONTROLLER__KRHO = SKID_STEERED_PLATFORM_PATH_FOLLOWER_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Kphi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTOLFI_GUIDANCE_CONTROLLER__KPHI = SKID_STEERED_PLATFORM_PATH_FOLLOWER_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Kalpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTOLFI_GUIDANCE_CONTROLLER__KALPHA = SKID_STEERED_PLATFORM_PATH_FOLLOWER_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Destination Distance Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTOLFI_GUIDANCE_CONTROLLER__DESTINATION_DISTANCE_THRESHOLD = SKID_STEERED_PLATFORM_PATH_FOLLOWER_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Way Point Distance Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTOLFI_GUIDANCE_CONTROLLER__WAY_POINT_DISTANCE_THRESHOLD = SKID_STEERED_PLATFORM_PATH_FOLLOWER_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>KHill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTOLFI_GUIDANCE_CONTROLLER__KHILL = SKID_STEERED_PLATFORM_PATH_FOLLOWER_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Hill Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTOLFI_GUIDANCE_CONTROLLER__HILL_THRESHOLD = SKID_STEERED_PLATFORM_PATH_FOLLOWER_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Phi Threshold For Reduced Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTOLFI_GUIDANCE_CONTROLLER__PHI_THRESHOLD_FOR_REDUCED_VELOCITY = SKID_STEERED_PLATFORM_PATH_FOLLOWER_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Alpha Threshold For Reduced Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTOLFI_GUIDANCE_CONTROLLER__ALPHA_THRESHOLD_FOR_REDUCED_VELOCITY = SKID_STEERED_PLATFORM_PATH_FOLLOWER_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Smooth Path Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTOLFI_GUIDANCE_CONTROLLER__SMOOTH_PATH_ENABLED = SKID_STEERED_PLATFORM_PATH_FOLLOWER_FEATURE_COUNT + 18;

	/**
	 * The number of structural features of the '<em>Astolfi Guidance Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTOLFI_GUIDANCE_CONTROLLER_FEATURE_COUNT = SKID_STEERED_PLATFORM_PATH_FOLLOWER_FEATURE_COUNT + 19;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTOLFI_GUIDANCE_CONTROLLER___START = SKID_STEERED_PLATFORM_PATH_FOLLOWER___START;

	/**
	 * The operation id for the '<em>Pause</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTOLFI_GUIDANCE_CONTROLLER___PAUSE = SKID_STEERED_PLATFORM_PATH_FOLLOWER___PAUSE;

	/**
	 * The operation id for the '<em>Resume</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTOLFI_GUIDANCE_CONTROLLER___RESUME = SKID_STEERED_PLATFORM_PATH_FOLLOWER___RESUME;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTOLFI_GUIDANCE_CONTROLLER___STOP = SKID_STEERED_PLATFORM_PATH_FOLLOWER___STOP;

	/**
	 * The operation id for the '<em>Is Transition Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTOLFI_GUIDANCE_CONTROLLER___IS_TRANSITION_VALID__PATHFOLLOWERSTATE = SKID_STEERED_PLATFORM_PATH_FOLLOWER___IS_TRANSITION_VALID__PATHFOLLOWERSTATE;

	/**
	 * The number of operations of the '<em>Astolfi Guidance Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTOLFI_GUIDANCE_CONTROLLER_OPERATION_COUNT = SKID_STEERED_PLATFORM_PATH_FOLLOWER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.PathFollowerState <em>Path Follower State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.addons.mobility.controllers.PathFollowerState
	 * @see ca.gc.asc_csa.apogy.addons.mobility.controllers.impl.ApogyAddonsMobilityControllersPackageImpl#getPathFollowerState()
	 * @generated
	 */
	int PATH_FOLLOWER_STATE = 6;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.PathRecorderSamplingMode <em>Path Recorder Sampling Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.addons.mobility.controllers.PathRecorderSamplingMode
	 * @see ca.gc.asc_csa.apogy.addons.mobility.controllers.impl.ApogyAddonsMobilityControllersPackageImpl#getPathRecorderSamplingMode()
	 * @generated
	 */
	int PATH_RECORDER_SAMPLING_MODE = 7;


	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.PathFollower <em>Path Follower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path Follower</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.controllers.PathFollower
	 * @generated
	 */
	EClass getPathFollower();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.PathFollower#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Path</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.controllers.PathFollower#getPath()
	 * @see #getPathFollower()
	 * @generated
	 */
	EReference getPathFollower_Path();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.PathFollower#getPlatform <em>Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Platform</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.controllers.PathFollower#getPlatform()
	 * @see #getPathFollower()
	 * @generated
	 */
	EReference getPathFollower_Platform();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.PathFollower#getPoseSensor <em>Pose Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pose Sensor</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.controllers.PathFollower#getPoseSensor()
	 * @see #getPathFollower()
	 * @generated
	 */
	EReference getPathFollower_PoseSensor();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.PathFollower#isDestinationReached <em>Destination Reached</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Destination Reached</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.controllers.PathFollower#isDestinationReached()
	 * @see #getPathFollower()
	 * @generated
	 */
	EAttribute getPathFollower_DestinationReached();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.PathFollower#getPathFollowerState <em>Path Follower State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path Follower State</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.controllers.PathFollower#getPathFollowerState()
	 * @see #getPathFollower()
	 * @generated
	 */
	EAttribute getPathFollower_PathFollowerState();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.PathFollower#start() <em>Start</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Start</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.controllers.PathFollower#start()
	 * @generated
	 */
	EOperation getPathFollower__Start();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.PathFollower#pause() <em>Pause</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pause</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.controllers.PathFollower#pause()
	 * @generated
	 */
	EOperation getPathFollower__Pause();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.PathFollower#resume() <em>Resume</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Resume</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.controllers.PathFollower#resume()
	 * @generated
	 */
	EOperation getPathFollower__Resume();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.PathFollower#stop() <em>Stop</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Stop</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.controllers.PathFollower#stop()
	 * @generated
	 */
	EOperation getPathFollower__Stop();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.PathFollower#isTransitionValid(ca.gc.asc_csa.apogy.addons.mobility.controllers.PathFollowerState) <em>Is Transition Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Transition Valid</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.controllers.PathFollower#isTransitionValid(ca.gc.asc_csa.apogy.addons.mobility.controllers.PathFollowerState)
	 * @generated
	 */
	EOperation getPathFollower__IsTransitionValid__PathFollowerState();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.SkidSteeredPlatformPathFollower <em>Skid Steered Platform Path Follower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Skid Steered Platform Path Follower</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.controllers.SkidSteeredPlatformPathFollower
	 * @generated
	 */
	EClass getSkidSteeredPlatformPathFollower();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.SkidSteeredPlatformPathFollower#getMaximumAngularVelocity <em>Maximum Angular Velocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Angular Velocity</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.controllers.SkidSteeredPlatformPathFollower#getMaximumAngularVelocity()
	 * @see #getSkidSteeredPlatformPathFollower()
	 * @generated
	 */
	EAttribute getSkidSteeredPlatformPathFollower_MaximumAngularVelocity();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.SkidSteeredPlatformPathFollower#getMaximumLinearVelocity <em>Maximum Linear Velocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Linear Velocity</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.controllers.SkidSteeredPlatformPathFollower#getMaximumLinearVelocity()
	 * @see #getSkidSteeredPlatformPathFollower()
	 * @generated
	 */
	EAttribute getSkidSteeredPlatformPathFollower_MaximumLinearVelocity();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.PathRecorder <em>Path Recorder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path Recorder</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.controllers.PathRecorder
	 * @generated
	 */
	EClass getPathRecorder();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.PathRecorder#getPositionSensor <em>Position Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Position Sensor</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.controllers.PathRecorder#getPositionSensor()
	 * @see #getPathRecorder()
	 * @generated
	 */
	EReference getPathRecorder_PositionSensor();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.PathRecorder#getMinimumDistanceDelta <em>Minimum Distance Delta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum Distance Delta</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.controllers.PathRecorder#getMinimumDistanceDelta()
	 * @see #getPathRecorder()
	 * @generated
	 */
	EAttribute getPathRecorder_MinimumDistanceDelta();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.PathRecorder#getMinimumTimeDelta <em>Minimum Time Delta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum Time Delta</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.controllers.PathRecorder#getMinimumTimeDelta()
	 * @see #getPathRecorder()
	 * @generated
	 */
	EAttribute getPathRecorder_MinimumTimeDelta();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.PathRecorder#getSamplingMode <em>Sampling Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sampling Mode</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.controllers.PathRecorder#getSamplingMode()
	 * @see #getPathRecorder()
	 * @generated
	 */
	EAttribute getPathRecorder_SamplingMode();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.PathRecorder#getRecordedPath <em>Recorded Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Recorded Path</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.controllers.PathRecorder#getRecordedPath()
	 * @see #getPathRecorder()
	 * @generated
	 */
	EReference getPathRecorder_RecordedPath();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.WaypointPathRecorder <em>Waypoint Path Recorder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Waypoint Path Recorder</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.controllers.WaypointPathRecorder
	 * @generated
	 */
	EClass getWaypointPathRecorder();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.SkidSteeredWayPointPathFollower <em>Skid Steered Way Point Path Follower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Skid Steered Way Point Path Follower</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.controllers.SkidSteeredWayPointPathFollower
	 * @generated
	 */
	EClass getSkidSteeredWayPointPathFollower();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.AstolfiGuidanceController <em>Astolfi Guidance Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Astolfi Guidance Controller</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.controllers.AstolfiGuidanceController
	 * @generated
	 */
	EClass getAstolfiGuidanceController();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.AstolfiGuidanceController#getCurrentWayPoint <em>Current Way Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current Way Point</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.controllers.AstolfiGuidanceController#getCurrentWayPoint()
	 * @see #getAstolfiGuidanceController()
	 * @generated
	 */
	EReference getAstolfiGuidanceController_CurrentWayPoint();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.AstolfiGuidanceController#getPreviousWayPoint <em>Previous Way Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Previous Way Point</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.controllers.AstolfiGuidanceController#getPreviousWayPoint()
	 * @see #getAstolfiGuidanceController()
	 * @generated
	 */
	EReference getAstolfiGuidanceController_PreviousWayPoint();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.AstolfiGuidanceController#getCurrentPoseInGuidanceReferenceFrame <em>Current Pose In Guidance Reference Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current Pose In Guidance Reference Frame</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.controllers.AstolfiGuidanceController#getCurrentPoseInGuidanceReferenceFrame()
	 * @see #getAstolfiGuidanceController()
	 * @generated
	 */
	EReference getAstolfiGuidanceController_CurrentPoseInGuidanceReferenceFrame();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.AstolfiGuidanceController#getRho <em>Rho</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rho</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.controllers.AstolfiGuidanceController#getRho()
	 * @see #getAstolfiGuidanceController()
	 * @generated
	 */
	EAttribute getAstolfiGuidanceController_Rho();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.AstolfiGuidanceController#getPhi <em>Phi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phi</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.controllers.AstolfiGuidanceController#getPhi()
	 * @see #getAstolfiGuidanceController()
	 * @generated
	 */
	EAttribute getAstolfiGuidanceController_Phi();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.AstolfiGuidanceController#getAlpha <em>Alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alpha</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.controllers.AstolfiGuidanceController#getAlpha()
	 * @see #getAstolfiGuidanceController()
	 * @generated
	 */
	EAttribute getAstolfiGuidanceController_Alpha();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.AstolfiGuidanceController#getYaw <em>Yaw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Yaw</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.controllers.AstolfiGuidanceController#getYaw()
	 * @see #getAstolfiGuidanceController()
	 * @generated
	 */
	EAttribute getAstolfiGuidanceController_Yaw();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.AstolfiGuidanceController#getNu <em>Nu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nu</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.controllers.AstolfiGuidanceController#getNu()
	 * @see #getAstolfiGuidanceController()
	 * @generated
	 */
	EAttribute getAstolfiGuidanceController_Nu();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.AstolfiGuidanceController#getOmega <em>Omega</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Omega</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.controllers.AstolfiGuidanceController#getOmega()
	 * @see #getAstolfiGuidanceController()
	 * @generated
	 */
	EAttribute getAstolfiGuidanceController_Omega();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.AstolfiGuidanceController#getKrho <em>Krho</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Krho</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.controllers.AstolfiGuidanceController#getKrho()
	 * @see #getAstolfiGuidanceController()
	 * @generated
	 */
	EAttribute getAstolfiGuidanceController_Krho();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.AstolfiGuidanceController#getKphi <em>Kphi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kphi</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.controllers.AstolfiGuidanceController#getKphi()
	 * @see #getAstolfiGuidanceController()
	 * @generated
	 */
	EAttribute getAstolfiGuidanceController_Kphi();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.AstolfiGuidanceController#getKalpha <em>Kalpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kalpha</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.controllers.AstolfiGuidanceController#getKalpha()
	 * @see #getAstolfiGuidanceController()
	 * @generated
	 */
	EAttribute getAstolfiGuidanceController_Kalpha();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.AstolfiGuidanceController#getDestinationDistanceThreshold <em>Destination Distance Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Destination Distance Threshold</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.controllers.AstolfiGuidanceController#getDestinationDistanceThreshold()
	 * @see #getAstolfiGuidanceController()
	 * @generated
	 */
	EAttribute getAstolfiGuidanceController_DestinationDistanceThreshold();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.AstolfiGuidanceController#getWayPointDistanceThreshold <em>Way Point Distance Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Way Point Distance Threshold</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.controllers.AstolfiGuidanceController#getWayPointDistanceThreshold()
	 * @see #getAstolfiGuidanceController()
	 * @generated
	 */
	EAttribute getAstolfiGuidanceController_WayPointDistanceThreshold();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.AstolfiGuidanceController#getKHill <em>KHill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>KHill</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.controllers.AstolfiGuidanceController#getKHill()
	 * @see #getAstolfiGuidanceController()
	 * @generated
	 */
	EAttribute getAstolfiGuidanceController_KHill();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.AstolfiGuidanceController#getHillThreshold <em>Hill Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hill Threshold</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.controllers.AstolfiGuidanceController#getHillThreshold()
	 * @see #getAstolfiGuidanceController()
	 * @generated
	 */
	EAttribute getAstolfiGuidanceController_HillThreshold();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.AstolfiGuidanceController#getPhiThresholdForReducedVelocity <em>Phi Threshold For Reduced Velocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phi Threshold For Reduced Velocity</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.controllers.AstolfiGuidanceController#getPhiThresholdForReducedVelocity()
	 * @see #getAstolfiGuidanceController()
	 * @generated
	 */
	EAttribute getAstolfiGuidanceController_PhiThresholdForReducedVelocity();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.AstolfiGuidanceController#getAlphaThresholdForReducedVelocity <em>Alpha Threshold For Reduced Velocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alpha Threshold For Reduced Velocity</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.controllers.AstolfiGuidanceController#getAlphaThresholdForReducedVelocity()
	 * @see #getAstolfiGuidanceController()
	 * @generated
	 */
	EAttribute getAstolfiGuidanceController_AlphaThresholdForReducedVelocity();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.AstolfiGuidanceController#isSmoothPathEnabled <em>Smooth Path Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Smooth Path Enabled</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.controllers.AstolfiGuidanceController#isSmoothPathEnabled()
	 * @see #getAstolfiGuidanceController()
	 * @generated
	 */
	EAttribute getAstolfiGuidanceController_SmoothPathEnabled();

	/**
	 * Returns the meta object for enum '{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.PathFollowerState <em>Path Follower State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Path Follower State</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.controllers.PathFollowerState
	 * @generated
	 */
	EEnum getPathFollowerState();

	/**
	 * Returns the meta object for enum '{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.PathRecorderSamplingMode <em>Path Recorder Sampling Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Path Recorder Sampling Mode</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.controllers.PathRecorderSamplingMode
	 * @generated
	 */
	EEnum getPathRecorderSamplingMode();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ApogyAddonsMobilityControllersFactory getApogyAddonsMobilityControllersFactory();

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
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.impl.PathFollowerImpl <em>Path Follower</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.addons.mobility.controllers.impl.PathFollowerImpl
		 * @see ca.gc.asc_csa.apogy.addons.mobility.controllers.impl.ApogyAddonsMobilityControllersPackageImpl#getPathFollower()
		 * @generated
		 */
		EClass PATH_FOLLOWER = eINSTANCE.getPathFollower();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH_FOLLOWER__PATH = eINSTANCE.getPathFollower_Path();

		/**
		 * The meta object literal for the '<em><b>Platform</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH_FOLLOWER__PLATFORM = eINSTANCE.getPathFollower_Platform();

		/**
		 * The meta object literal for the '<em><b>Pose Sensor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH_FOLLOWER__POSE_SENSOR = eINSTANCE.getPathFollower_PoseSensor();

		/**
		 * The meta object literal for the '<em><b>Destination Reached</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATH_FOLLOWER__DESTINATION_REACHED = eINSTANCE.getPathFollower_DestinationReached();

		/**
		 * The meta object literal for the '<em><b>Path Follower State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATH_FOLLOWER__PATH_FOLLOWER_STATE = eINSTANCE.getPathFollower_PathFollowerState();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PATH_FOLLOWER___START = eINSTANCE.getPathFollower__Start();

		/**
		 * The meta object literal for the '<em><b>Pause</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PATH_FOLLOWER___PAUSE = eINSTANCE.getPathFollower__Pause();

		/**
		 * The meta object literal for the '<em><b>Resume</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PATH_FOLLOWER___RESUME = eINSTANCE.getPathFollower__Resume();

		/**
		 * The meta object literal for the '<em><b>Stop</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PATH_FOLLOWER___STOP = eINSTANCE.getPathFollower__Stop();

		/**
		 * The meta object literal for the '<em><b>Is Transition Valid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PATH_FOLLOWER___IS_TRANSITION_VALID__PATHFOLLOWERSTATE = eINSTANCE.getPathFollower__IsTransitionValid__PathFollowerState();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.impl.SkidSteeredPlatformPathFollowerImpl <em>Skid Steered Platform Path Follower</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.addons.mobility.controllers.impl.SkidSteeredPlatformPathFollowerImpl
		 * @see ca.gc.asc_csa.apogy.addons.mobility.controllers.impl.ApogyAddonsMobilityControllersPackageImpl#getSkidSteeredPlatformPathFollower()
		 * @generated
		 */
		EClass SKID_STEERED_PLATFORM_PATH_FOLLOWER = eINSTANCE.getSkidSteeredPlatformPathFollower();

		/**
		 * The meta object literal for the '<em><b>Maximum Angular Velocity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SKID_STEERED_PLATFORM_PATH_FOLLOWER__MAXIMUM_ANGULAR_VELOCITY = eINSTANCE.getSkidSteeredPlatformPathFollower_MaximumAngularVelocity();

		/**
		 * The meta object literal for the '<em><b>Maximum Linear Velocity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SKID_STEERED_PLATFORM_PATH_FOLLOWER__MAXIMUM_LINEAR_VELOCITY = eINSTANCE.getSkidSteeredPlatformPathFollower_MaximumLinearVelocity();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.impl.PathRecorderImpl <em>Path Recorder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.addons.mobility.controllers.impl.PathRecorderImpl
		 * @see ca.gc.asc_csa.apogy.addons.mobility.controllers.impl.ApogyAddonsMobilityControllersPackageImpl#getPathRecorder()
		 * @generated
		 */
		EClass PATH_RECORDER = eINSTANCE.getPathRecorder();

		/**
		 * The meta object literal for the '<em><b>Position Sensor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH_RECORDER__POSITION_SENSOR = eINSTANCE.getPathRecorder_PositionSensor();

		/**
		 * The meta object literal for the '<em><b>Minimum Distance Delta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATH_RECORDER__MINIMUM_DISTANCE_DELTA = eINSTANCE.getPathRecorder_MinimumDistanceDelta();

		/**
		 * The meta object literal for the '<em><b>Minimum Time Delta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATH_RECORDER__MINIMUM_TIME_DELTA = eINSTANCE.getPathRecorder_MinimumTimeDelta();

		/**
		 * The meta object literal for the '<em><b>Sampling Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATH_RECORDER__SAMPLING_MODE = eINSTANCE.getPathRecorder_SamplingMode();

		/**
		 * The meta object literal for the '<em><b>Recorded Path</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH_RECORDER__RECORDED_PATH = eINSTANCE.getPathRecorder_RecordedPath();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.impl.WaypointPathRecorderImpl <em>Waypoint Path Recorder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.addons.mobility.controllers.impl.WaypointPathRecorderImpl
		 * @see ca.gc.asc_csa.apogy.addons.mobility.controllers.impl.ApogyAddonsMobilityControllersPackageImpl#getWaypointPathRecorder()
		 * @generated
		 */
		EClass WAYPOINT_PATH_RECORDER = eINSTANCE.getWaypointPathRecorder();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.impl.SkidSteeredWayPointPathFollowerImpl <em>Skid Steered Way Point Path Follower</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.addons.mobility.controllers.impl.SkidSteeredWayPointPathFollowerImpl
		 * @see ca.gc.asc_csa.apogy.addons.mobility.controllers.impl.ApogyAddonsMobilityControllersPackageImpl#getSkidSteeredWayPointPathFollower()
		 * @generated
		 */
		EClass SKID_STEERED_WAY_POINT_PATH_FOLLOWER = eINSTANCE.getSkidSteeredWayPointPathFollower();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.impl.AstolfiGuidanceControllerImpl <em>Astolfi Guidance Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.addons.mobility.controllers.impl.AstolfiGuidanceControllerImpl
		 * @see ca.gc.asc_csa.apogy.addons.mobility.controllers.impl.ApogyAddonsMobilityControllersPackageImpl#getAstolfiGuidanceController()
		 * @generated
		 */
		EClass ASTOLFI_GUIDANCE_CONTROLLER = eINSTANCE.getAstolfiGuidanceController();

		/**
		 * The meta object literal for the '<em><b>Current Way Point</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASTOLFI_GUIDANCE_CONTROLLER__CURRENT_WAY_POINT = eINSTANCE.getAstolfiGuidanceController_CurrentWayPoint();

		/**
		 * The meta object literal for the '<em><b>Previous Way Point</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASTOLFI_GUIDANCE_CONTROLLER__PREVIOUS_WAY_POINT = eINSTANCE.getAstolfiGuidanceController_PreviousWayPoint();

		/**
		 * The meta object literal for the '<em><b>Current Pose In Guidance Reference Frame</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASTOLFI_GUIDANCE_CONTROLLER__CURRENT_POSE_IN_GUIDANCE_REFERENCE_FRAME = eINSTANCE.getAstolfiGuidanceController_CurrentPoseInGuidanceReferenceFrame();

		/**
		 * The meta object literal for the '<em><b>Rho</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASTOLFI_GUIDANCE_CONTROLLER__RHO = eINSTANCE.getAstolfiGuidanceController_Rho();

		/**
		 * The meta object literal for the '<em><b>Phi</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASTOLFI_GUIDANCE_CONTROLLER__PHI = eINSTANCE.getAstolfiGuidanceController_Phi();

		/**
		 * The meta object literal for the '<em><b>Alpha</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASTOLFI_GUIDANCE_CONTROLLER__ALPHA = eINSTANCE.getAstolfiGuidanceController_Alpha();

		/**
		 * The meta object literal for the '<em><b>Yaw</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASTOLFI_GUIDANCE_CONTROLLER__YAW = eINSTANCE.getAstolfiGuidanceController_Yaw();

		/**
		 * The meta object literal for the '<em><b>Nu</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASTOLFI_GUIDANCE_CONTROLLER__NU = eINSTANCE.getAstolfiGuidanceController_Nu();

		/**
		 * The meta object literal for the '<em><b>Omega</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASTOLFI_GUIDANCE_CONTROLLER__OMEGA = eINSTANCE.getAstolfiGuidanceController_Omega();

		/**
		 * The meta object literal for the '<em><b>Krho</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASTOLFI_GUIDANCE_CONTROLLER__KRHO = eINSTANCE.getAstolfiGuidanceController_Krho();

		/**
		 * The meta object literal for the '<em><b>Kphi</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASTOLFI_GUIDANCE_CONTROLLER__KPHI = eINSTANCE.getAstolfiGuidanceController_Kphi();

		/**
		 * The meta object literal for the '<em><b>Kalpha</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASTOLFI_GUIDANCE_CONTROLLER__KALPHA = eINSTANCE.getAstolfiGuidanceController_Kalpha();

		/**
		 * The meta object literal for the '<em><b>Destination Distance Threshold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASTOLFI_GUIDANCE_CONTROLLER__DESTINATION_DISTANCE_THRESHOLD = eINSTANCE.getAstolfiGuidanceController_DestinationDistanceThreshold();

		/**
		 * The meta object literal for the '<em><b>Way Point Distance Threshold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASTOLFI_GUIDANCE_CONTROLLER__WAY_POINT_DISTANCE_THRESHOLD = eINSTANCE.getAstolfiGuidanceController_WayPointDistanceThreshold();

		/**
		 * The meta object literal for the '<em><b>KHill</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASTOLFI_GUIDANCE_CONTROLLER__KHILL = eINSTANCE.getAstolfiGuidanceController_KHill();

		/**
		 * The meta object literal for the '<em><b>Hill Threshold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASTOLFI_GUIDANCE_CONTROLLER__HILL_THRESHOLD = eINSTANCE.getAstolfiGuidanceController_HillThreshold();

		/**
		 * The meta object literal for the '<em><b>Phi Threshold For Reduced Velocity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASTOLFI_GUIDANCE_CONTROLLER__PHI_THRESHOLD_FOR_REDUCED_VELOCITY = eINSTANCE.getAstolfiGuidanceController_PhiThresholdForReducedVelocity();

		/**
		 * The meta object literal for the '<em><b>Alpha Threshold For Reduced Velocity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASTOLFI_GUIDANCE_CONTROLLER__ALPHA_THRESHOLD_FOR_REDUCED_VELOCITY = eINSTANCE.getAstolfiGuidanceController_AlphaThresholdForReducedVelocity();

		/**
		 * The meta object literal for the '<em><b>Smooth Path Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASTOLFI_GUIDANCE_CONTROLLER__SMOOTH_PATH_ENABLED = eINSTANCE.getAstolfiGuidanceController_SmoothPathEnabled();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.PathFollowerState <em>Path Follower State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.addons.mobility.controllers.PathFollowerState
		 * @see ca.gc.asc_csa.apogy.addons.mobility.controllers.impl.ApogyAddonsMobilityControllersPackageImpl#getPathFollowerState()
		 * @generated
		 */
		EEnum PATH_FOLLOWER_STATE = eINSTANCE.getPathFollowerState();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.PathRecorderSamplingMode <em>Path Recorder Sampling Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.addons.mobility.controllers.PathRecorderSamplingMode
		 * @see ca.gc.asc_csa.apogy.addons.mobility.controllers.impl.ApogyAddonsMobilityControllersPackageImpl#getPathRecorderSamplingMode()
		 * @generated
		 */
		EEnum PATH_RECORDER_SAMPLING_MODE = eINSTANCE.getPathRecorderSamplingMode();

	}

} //ApogyAddonsMobilityControllersPackage
