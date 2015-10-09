/**
 * Canadian Space Agency 2007.
 *
 * $Id: PosePackage.java,v 1.4.4.2 2015/05/21 15:51:31 pallard Exp $
 */
package org.eclipse.symphony.addons.sensors.pose;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.symphony.addons.sensors.SensorsPackage;
import org.eclipse.symphony.common.topology.TopologyPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.symphony.addons.sensors.pose.PoseFactory
 * @model kind="package"
 * @generated
 */
public interface PosePackage extends EPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Canadian Space Agency 2007.";

	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "pose";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///ca/gc/space/mrt/sensors/pose/model/pose.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ca.gc.space.mrt.sensors";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PosePackage eINSTANCE = org.eclipse.symphony.addons.sensors.pose.impl.PosePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.sensors.pose.impl.SelfPlaceSensorImpl <em>Self Place Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.sensors.pose.impl.SelfPlaceSensorImpl
	 * @see org.eclipse.symphony.addons.sensors.pose.impl.PosePackageImpl#getSelfPlaceSensor()
	 * @generated
	 */
	int SELF_PLACE_SENSOR = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.sensors.pose.impl.PositionSensorImpl <em>Position Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.sensors.pose.impl.PositionSensorImpl
	 * @see org.eclipse.symphony.addons.sensors.pose.impl.PosePackageImpl#getPositionSensor()
	 * @generated
	 */
	int POSITION_SENSOR = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_SENSOR__PARENT = TopologyPackage.POSITION_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_SENSOR__DESCRIPTION = TopologyPackage.POSITION_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_SENSOR__NODE_ID = TopologyPackage.POSITION_NODE__NODE_ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_SENSOR__CHILDREN = TopologyPackage.POSITION_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Aggregated Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_SENSOR__AGGREGATED_CHILDREN = TopologyPackage.POSITION_NODE__AGGREGATED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_SENSOR__POSITION = TopologyPackage.POSITION_NODE__POSITION;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_SENSOR__STATUS = TopologyPackage.POSITION_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Position Coordinates</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_SENSOR__POSITION_COORDINATES = TopologyPackage.POSITION_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Position Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_SENSOR_FEATURE_COUNT = TopologyPackage.POSITION_NODE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_SENSOR___ACCEPT__INODEVISITOR = TopologyPackage.POSITION_NODE___ACCEPT__INODEVISITOR;

	/**
	 * The operation id for the '<em>Reset Position</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_SENSOR___RESET_POSITION__CARTESIANPOSITIONCOORDINATES = TopologyPackage.POSITION_NODE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Position Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_SENSOR_OPERATION_COUNT = TopologyPackage.POSITION_NODE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.sensors.pose.impl.OrientationSensorImpl <em>Orientation Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.sensors.pose.impl.OrientationSensorImpl
	 * @see org.eclipse.symphony.addons.sensors.pose.impl.PosePackageImpl#getOrientationSensor()
	 * @generated
	 */
	int ORIENTATION_SENSOR = 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIENTATION_SENSOR__PARENT = TopologyPackage.ROTATION_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIENTATION_SENSOR__DESCRIPTION = TopologyPackage.ROTATION_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIENTATION_SENSOR__NODE_ID = TopologyPackage.ROTATION_NODE__NODE_ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIENTATION_SENSOR__CHILDREN = TopologyPackage.ROTATION_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Aggregated Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIENTATION_SENSOR__AGGREGATED_CHILDREN = TopologyPackage.ROTATION_NODE__AGGREGATED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Rotation Matrix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIENTATION_SENSOR__ROTATION_MATRIX = TopologyPackage.ROTATION_NODE__ROTATION_MATRIX;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIENTATION_SENSOR__STATUS = TopologyPackage.ROTATION_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Orientation Coordinates</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIENTATION_SENSOR__ORIENTATION_COORDINATES = TopologyPackage.ROTATION_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Orientation Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIENTATION_SENSOR_FEATURE_COUNT = TopologyPackage.ROTATION_NODE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIENTATION_SENSOR___ACCEPT__INODEVISITOR = TopologyPackage.ROTATION_NODE___ACCEPT__INODEVISITOR;

	/**
	 * The operation id for the '<em>Reset Orientation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIENTATION_SENSOR___RESET_ORIENTATION__CARTESIANORIENTATIONCOORDINATES = TopologyPackage.ROTATION_NODE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Extract Orientation From Matrix</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIENTATION_SENSOR___EXTRACT_ORIENTATION_FROM_MATRIX__MATRIX3X3 = TopologyPackage.ROTATION_NODE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Orientation Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIENTATION_SENSOR_OPERATION_COUNT = TopologyPackage.ROTATION_NODE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.sensors.pose.impl.PoseSensorImpl <em>Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.sensors.pose.impl.PoseSensorImpl
	 * @see org.eclipse.symphony.addons.sensors.pose.impl.PosePackageImpl#getPoseSensor()
	 * @generated
	 */
	int POSE_SENSOR = 2;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSE_SENSOR__PARENT = TopologyPackage.TRANSFORM_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSE_SENSOR__DESCRIPTION = TopologyPackage.TRANSFORM_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSE_SENSOR__NODE_ID = TopologyPackage.TRANSFORM_NODE__NODE_ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSE_SENSOR__CHILDREN = TopologyPackage.TRANSFORM_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Aggregated Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSE_SENSOR__AGGREGATED_CHILDREN = TopologyPackage.TRANSFORM_NODE__AGGREGATED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSE_SENSOR__POSITION = TopologyPackage.TRANSFORM_NODE__POSITION;

	/**
	 * The feature id for the '<em><b>Rotation Matrix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSE_SENSOR__ROTATION_MATRIX = TopologyPackage.TRANSFORM_NODE__ROTATION_MATRIX;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSE_SENSOR__STATUS = TopologyPackage.TRANSFORM_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Position Coordinates</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSE_SENSOR__POSITION_COORDINATES = TopologyPackage.TRANSFORM_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Orientation Coordinates</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSE_SENSOR__ORIENTATION_COORDINATES = TopologyPackage.TRANSFORM_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Pose</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSE_SENSOR__POSE = TopologyPackage.TRANSFORM_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Data Logger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSE_SENSOR__DATA_LOGGER = TopologyPackage.TRANSFORM_NODE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSE_SENSOR_FEATURE_COUNT = TopologyPackage.TRANSFORM_NODE_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSE_SENSOR___ACCEPT__INODEVISITOR = TopologyPackage.TRANSFORM_NODE___ACCEPT__INODEVISITOR;

	/**
	 * The operation id for the '<em>As Matrix4d</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSE_SENSOR___AS_MATRIX4D = TopologyPackage.TRANSFORM_NODE___AS_MATRIX4D;

	/**
	 * The operation id for the '<em>Set Transformation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSE_SENSOR___SET_TRANSFORMATION__MATRIX4D = TopologyPackage.TRANSFORM_NODE___SET_TRANSFORMATION__MATRIX4D;

	/**
	 * The operation id for the '<em>Reset Position</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSE_SENSOR___RESET_POSITION__CARTESIANPOSITIONCOORDINATES = TopologyPackage.TRANSFORM_NODE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Reset Orientation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSE_SENSOR___RESET_ORIENTATION__CARTESIANORIENTATIONCOORDINATES = TopologyPackage.TRANSFORM_NODE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Extract Orientation From Matrix</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSE_SENSOR___EXTRACT_ORIENTATION_FROM_MATRIX__MATRIX3X3 = TopologyPackage.TRANSFORM_NODE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Reset Pose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSE_SENSOR___RESET_POSE__POSE = TopologyPackage.TRANSFORM_NODE_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSE_SENSOR_OPERATION_COUNT = TopologyPackage.TRANSFORM_NODE_OPERATION_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_PLACE_SENSOR__PARENT = SensorsPackage.SENSOR__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_PLACE_SENSOR__DESCRIPTION = SensorsPackage.SENSOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_PLACE_SENSOR__NODE_ID = SensorsPackage.SENSOR__NODE_ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_PLACE_SENSOR__CHILDREN = SensorsPackage.SENSOR__CHILDREN;

	/**
	 * The feature id for the '<em><b>Aggregated Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_PLACE_SENSOR__AGGREGATED_CHILDREN = SensorsPackage.SENSOR__AGGREGATED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_PLACE_SENSOR__STATUS = SensorsPackage.SENSOR__STATUS;

	/**
	 * The number of structural features of the '<em>Self Place Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_PLACE_SENSOR_FEATURE_COUNT = SensorsPackage.SENSOR_FEATURE_COUNT + 0;


	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_PLACE_SENSOR___ACCEPT__INODEVISITOR = SensorsPackage.SENSOR___ACCEPT__INODEVISITOR;

	/**
	 * The number of operations of the '<em>Self Place Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_PLACE_SENSOR_OPERATION_COUNT = SensorsPackage.SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.sensors.pose.impl.SimulatedPositionSensorImpl <em>Simulated Position Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.sensors.pose.impl.SimulatedPositionSensorImpl
	 * @see org.eclipse.symphony.addons.sensors.pose.impl.PosePackageImpl#getSimulatedPositionSensor()
	 * @generated
	 */
	int SIMULATED_POSITION_SENSOR = 4;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATED_POSITION_SENSOR__PARENT = POSITION_SENSOR__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATED_POSITION_SENSOR__DESCRIPTION = POSITION_SENSOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATED_POSITION_SENSOR__NODE_ID = POSITION_SENSOR__NODE_ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATED_POSITION_SENSOR__CHILDREN = POSITION_SENSOR__CHILDREN;

	/**
	 * The feature id for the '<em><b>Aggregated Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATED_POSITION_SENSOR__AGGREGATED_CHILDREN = POSITION_SENSOR__AGGREGATED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATED_POSITION_SENSOR__POSITION = POSITION_SENSOR__POSITION;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATED_POSITION_SENSOR__STATUS = POSITION_SENSOR__STATUS;

	/**
	 * The feature id for the '<em><b>Position Coordinates</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATED_POSITION_SENSOR__POSITION_COORDINATES = POSITION_SENSOR__POSITION_COORDINATES;

	/**
	 * The feature id for the '<em><b>XVelocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATED_POSITION_SENSOR__XVELOCITY = POSITION_SENSOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>YVelocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATED_POSITION_SENSOR__YVELOCITY = POSITION_SENSOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>ZVelocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATED_POSITION_SENSOR__ZVELOCITY = POSITION_SENSOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Update Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATED_POSITION_SENSOR__UPDATE_PERIOD = POSITION_SENSOR_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Simulated Position Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATED_POSITION_SENSOR_FEATURE_COUNT = POSITION_SENSOR_FEATURE_COUNT + 4;


	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATED_POSITION_SENSOR___ACCEPT__INODEVISITOR = POSITION_SENSOR___ACCEPT__INODEVISITOR;

	/**
	 * The operation id for the '<em>Reset Position</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATED_POSITION_SENSOR___RESET_POSITION__CARTESIANPOSITIONCOORDINATES = POSITION_SENSOR___RESET_POSITION__CARTESIANPOSITIONCOORDINATES;

	/**
	 * The number of operations of the '<em>Simulated Position Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATED_POSITION_SENSOR_OPERATION_COUNT = POSITION_SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.sensors.pose.impl.SimulatedOrientationSensorImpl <em>Simulated Orientation Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.sensors.pose.impl.SimulatedOrientationSensorImpl
	 * @see org.eclipse.symphony.addons.sensors.pose.impl.PosePackageImpl#getSimulatedOrientationSensor()
	 * @generated
	 */
	int SIMULATED_ORIENTATION_SENSOR = 5;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATED_ORIENTATION_SENSOR__PARENT = ORIENTATION_SENSOR__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATED_ORIENTATION_SENSOR__DESCRIPTION = ORIENTATION_SENSOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATED_ORIENTATION_SENSOR__NODE_ID = ORIENTATION_SENSOR__NODE_ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATED_ORIENTATION_SENSOR__CHILDREN = ORIENTATION_SENSOR__CHILDREN;

	/**
	 * The feature id for the '<em><b>Aggregated Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATED_ORIENTATION_SENSOR__AGGREGATED_CHILDREN = ORIENTATION_SENSOR__AGGREGATED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Rotation Matrix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATED_ORIENTATION_SENSOR__ROTATION_MATRIX = ORIENTATION_SENSOR__ROTATION_MATRIX;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATED_ORIENTATION_SENSOR__STATUS = ORIENTATION_SENSOR__STATUS;

	/**
	 * The feature id for the '<em><b>Orientation Coordinates</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATED_ORIENTATION_SENSOR__ORIENTATION_COORDINATES = ORIENTATION_SENSOR__ORIENTATION_COORDINATES;

	/**
	 * The feature id for the '<em><b>XAngular Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATED_ORIENTATION_SENSOR__XANGULAR_VELOCITY = ORIENTATION_SENSOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>YAngular Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATED_ORIENTATION_SENSOR__YANGULAR_VELOCITY = ORIENTATION_SENSOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>ZAngular Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATED_ORIENTATION_SENSOR__ZANGULAR_VELOCITY = ORIENTATION_SENSOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Update Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATED_ORIENTATION_SENSOR__UPDATE_PERIOD = ORIENTATION_SENSOR_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Simulated Orientation Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATED_ORIENTATION_SENSOR_FEATURE_COUNT = ORIENTATION_SENSOR_FEATURE_COUNT + 4;


	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATED_ORIENTATION_SENSOR___ACCEPT__INODEVISITOR = ORIENTATION_SENSOR___ACCEPT__INODEVISITOR;

	/**
	 * The operation id for the '<em>Reset Orientation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATED_ORIENTATION_SENSOR___RESET_ORIENTATION__CARTESIANORIENTATIONCOORDINATES = ORIENTATION_SENSOR___RESET_ORIENTATION__CARTESIANORIENTATIONCOORDINATES;

	/**
	 * The operation id for the '<em>Extract Orientation From Matrix</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATED_ORIENTATION_SENSOR___EXTRACT_ORIENTATION_FROM_MATRIX__MATRIX3X3 = ORIENTATION_SENSOR___EXTRACT_ORIENTATION_FROM_MATRIX__MATRIX3X3;

	/**
	 * The number of operations of the '<em>Simulated Orientation Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATED_ORIENTATION_SENSOR_OPERATION_COUNT = ORIENTATION_SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.sensors.pose.impl.SimulatedPoseSensorImpl <em>Simulated Pose Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.sensors.pose.impl.SimulatedPoseSensorImpl
	 * @see org.eclipse.symphony.addons.sensors.pose.impl.PosePackageImpl#getSimulatedPoseSensor()
	 * @generated
	 */
	int SIMULATED_POSE_SENSOR = 6;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATED_POSE_SENSOR__PARENT = POSE_SENSOR__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATED_POSE_SENSOR__DESCRIPTION = POSE_SENSOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATED_POSE_SENSOR__NODE_ID = POSE_SENSOR__NODE_ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATED_POSE_SENSOR__CHILDREN = POSE_SENSOR__CHILDREN;

	/**
	 * The feature id for the '<em><b>Aggregated Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATED_POSE_SENSOR__AGGREGATED_CHILDREN = POSE_SENSOR__AGGREGATED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATED_POSE_SENSOR__POSITION = POSE_SENSOR__POSITION;

	/**
	 * The feature id for the '<em><b>Rotation Matrix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATED_POSE_SENSOR__ROTATION_MATRIX = POSE_SENSOR__ROTATION_MATRIX;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATED_POSE_SENSOR__STATUS = POSE_SENSOR__STATUS;

	/**
	 * The feature id for the '<em><b>Position Coordinates</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATED_POSE_SENSOR__POSITION_COORDINATES = POSE_SENSOR__POSITION_COORDINATES;

	/**
	 * The feature id for the '<em><b>Orientation Coordinates</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATED_POSE_SENSOR__ORIENTATION_COORDINATES = POSE_SENSOR__ORIENTATION_COORDINATES;

	/**
	 * The feature id for the '<em><b>Pose</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATED_POSE_SENSOR__POSE = POSE_SENSOR__POSE;

	/**
	 * The feature id for the '<em><b>Data Logger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATED_POSE_SENSOR__DATA_LOGGER = POSE_SENSOR__DATA_LOGGER;

	/**
	 * The feature id for the '<em><b>Update Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATED_POSE_SENSOR__UPDATE_PERIOD = POSE_SENSOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>XVelocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATED_POSE_SENSOR__XVELOCITY = POSE_SENSOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>YVelocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATED_POSE_SENSOR__YVELOCITY = POSE_SENSOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>ZVelocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATED_POSE_SENSOR__ZVELOCITY = POSE_SENSOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>XAngular Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATED_POSE_SENSOR__XANGULAR_VELOCITY = POSE_SENSOR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>YAngular Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATED_POSE_SENSOR__YANGULAR_VELOCITY = POSE_SENSOR_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>ZAngular Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATED_POSE_SENSOR__ZANGULAR_VELOCITY = POSE_SENSOR_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Simulated Pose Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATED_POSE_SENSOR_FEATURE_COUNT = POSE_SENSOR_FEATURE_COUNT + 7;


	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATED_POSE_SENSOR___ACCEPT__INODEVISITOR = POSE_SENSOR___ACCEPT__INODEVISITOR;

	/**
	 * The operation id for the '<em>As Matrix4d</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATED_POSE_SENSOR___AS_MATRIX4D = POSE_SENSOR___AS_MATRIX4D;

	/**
	 * The operation id for the '<em>Set Transformation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATED_POSE_SENSOR___SET_TRANSFORMATION__MATRIX4D = POSE_SENSOR___SET_TRANSFORMATION__MATRIX4D;

	/**
	 * The operation id for the '<em>Reset Position</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATED_POSE_SENSOR___RESET_POSITION__CARTESIANPOSITIONCOORDINATES = POSE_SENSOR___RESET_POSITION__CARTESIANPOSITIONCOORDINATES;

	/**
	 * The operation id for the '<em>Reset Orientation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATED_POSE_SENSOR___RESET_ORIENTATION__CARTESIANORIENTATIONCOORDINATES = POSE_SENSOR___RESET_ORIENTATION__CARTESIANORIENTATIONCOORDINATES;

	/**
	 * The operation id for the '<em>Extract Orientation From Matrix</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATED_POSE_SENSOR___EXTRACT_ORIENTATION_FROM_MATRIX__MATRIX3X3 = POSE_SENSOR___EXTRACT_ORIENTATION_FROM_MATRIX__MATRIX3X3;

	/**
	 * The operation id for the '<em>Reset Pose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATED_POSE_SENSOR___RESET_POSE__POSE = POSE_SENSOR___RESET_POSE__POSE;

	/**
	 * The number of operations of the '<em>Simulated Pose Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATED_POSE_SENSOR_OPERATION_COUNT = POSE_SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.sensors.pose.PoseDataLogger <em>Data Logger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.sensors.pose.PoseDataLogger
	 * @see org.eclipse.symphony.addons.sensors.pose.impl.PosePackageImpl#getPoseDataLogger()
	 * @generated
	 */
	int POSE_DATA_LOGGER = 7;

	/**
	 * The feature id for the '<em><b>Output File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSE_DATA_LOGGER__OUTPUT_FILE = 0;

	/**
	 * The number of structural features of the '<em>Data Logger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSE_DATA_LOGGER_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Log Pose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSE_DATA_LOGGER___LOG_POSE__POSE = 0;

	/**
	 * The number of operations of the '<em>Data Logger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSE_DATA_LOGGER_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.sensors.pose.impl.CSVDataLoggerImpl <em>CSV Data Logger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.sensors.pose.impl.CSVDataLoggerImpl
	 * @see org.eclipse.symphony.addons.sensors.pose.impl.PosePackageImpl#getCSVDataLogger()
	 * @generated
	 */
	int CSV_DATA_LOGGER = 8;

	/**
	 * The feature id for the '<em><b>Output File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_DATA_LOGGER__OUTPUT_FILE = POSE_DATA_LOGGER__OUTPUT_FILE;

	/**
	 * The number of structural features of the '<em>CSV Data Logger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_DATA_LOGGER_FEATURE_COUNT = POSE_DATA_LOGGER_FEATURE_COUNT + 0;


	/**
	 * The operation id for the '<em>Log Pose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_DATA_LOGGER___LOG_POSE__POSE = POSE_DATA_LOGGER___LOG_POSE__POSE;

	/**
	 * The number of operations of the '<em>CSV Data Logger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_DATA_LOGGER_OPERATION_COUNT = POSE_DATA_LOGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.sensors.pose.impl.PoseFacadeImpl <em>Facade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.sensors.pose.impl.PoseFacadeImpl
	 * @see org.eclipse.symphony.addons.sensors.pose.impl.PosePackageImpl#getPoseFacade()
	 * @generated
	 */
	int POSE_FACADE = 9;

	/**
	 * The number of structural features of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSE_FACADE_FEATURE_COUNT = 0;


	/**
	 * The operation id for the '<em>Create CSV Data Logger</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSE_FACADE___CREATE_CSV_DATA_LOGGER__STRING = 0;

	/**
	 * The number of operations of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSE_FACADE_OPERATION_COUNT = 1;


	/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.sensors.pose.impl.InertialMeasurementUnitImpl <em>Inertial Measurement Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.sensors.pose.impl.InertialMeasurementUnitImpl
	 * @see org.eclipse.symphony.addons.sensors.pose.impl.PosePackageImpl#getInertialMeasurementUnit()
	 * @generated
	 */
	int INERTIAL_MEASUREMENT_UNIT = 10;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INERTIAL_MEASUREMENT_UNIT__PARENT = ORIENTATION_SENSOR__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INERTIAL_MEASUREMENT_UNIT__DESCRIPTION = ORIENTATION_SENSOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INERTIAL_MEASUREMENT_UNIT__NODE_ID = ORIENTATION_SENSOR__NODE_ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INERTIAL_MEASUREMENT_UNIT__CHILDREN = ORIENTATION_SENSOR__CHILDREN;

	/**
	 * The feature id for the '<em><b>Aggregated Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INERTIAL_MEASUREMENT_UNIT__AGGREGATED_CHILDREN = ORIENTATION_SENSOR__AGGREGATED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Rotation Matrix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INERTIAL_MEASUREMENT_UNIT__ROTATION_MATRIX = ORIENTATION_SENSOR__ROTATION_MATRIX;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INERTIAL_MEASUREMENT_UNIT__STATUS = ORIENTATION_SENSOR__STATUS;

	/**
	 * The feature id for the '<em><b>Orientation Coordinates</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INERTIAL_MEASUREMENT_UNIT__ORIENTATION_COORDINATES = ORIENTATION_SENSOR__ORIENTATION_COORDINATES;

	/**
	 * The feature id for the '<em><b>Angular Velocity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INERTIAL_MEASUREMENT_UNIT__ANGULAR_VELOCITY = ORIENTATION_SENSOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Linear Acceleration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INERTIAL_MEASUREMENT_UNIT__LINEAR_ACCELERATION = ORIENTATION_SENSOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Inertial Measurement Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INERTIAL_MEASUREMENT_UNIT_FEATURE_COUNT = ORIENTATION_SENSOR_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INERTIAL_MEASUREMENT_UNIT___ACCEPT__INODEVISITOR = ORIENTATION_SENSOR___ACCEPT__INODEVISITOR;

	/**
	 * The operation id for the '<em>Reset Orientation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INERTIAL_MEASUREMENT_UNIT___RESET_ORIENTATION__CARTESIANORIENTATIONCOORDINATES = ORIENTATION_SENSOR___RESET_ORIENTATION__CARTESIANORIENTATIONCOORDINATES;

	/**
	 * The operation id for the '<em>Extract Orientation From Matrix</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INERTIAL_MEASUREMENT_UNIT___EXTRACT_ORIENTATION_FROM_MATRIX__MATRIX3X3 = ORIENTATION_SENSOR___EXTRACT_ORIENTATION_FROM_MATRIX__MATRIX3X3;

	/**
	 * The number of operations of the '<em>Inertial Measurement Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INERTIAL_MEASUREMENT_UNIT_OPERATION_COUNT = ORIENTATION_SENSOR_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.sensors.pose.PositionSensor <em>Position Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position Sensor</em>'.
	 * @see org.eclipse.symphony.addons.sensors.pose.PositionSensor
	 * @generated
	 */
	EClass getPositionSensor();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.addons.sensors.pose.PositionSensor#getPositionCoordinates <em>Position Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Position Coordinates</em>'.
	 * @see org.eclipse.symphony.addons.sensors.pose.PositionSensor#getPositionCoordinates()
	 * @see #getPositionSensor()
	 * @generated
	 */
	EReference getPositionSensor_PositionCoordinates();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.addons.sensors.pose.PositionSensor#resetPosition(org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates) <em>Reset Position</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Reset Position</em>' operation.
	 * @see org.eclipse.symphony.addons.sensors.pose.PositionSensor#resetPosition(org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates)
	 * @generated
	 */
	EOperation getPositionSensor__ResetPosition__CartesianPositionCoordinates();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.sensors.pose.OrientationSensor <em>Orientation Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orientation Sensor</em>'.
	 * @see org.eclipse.symphony.addons.sensors.pose.OrientationSensor
	 * @generated
	 */
	EClass getOrientationSensor();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.addons.sensors.pose.OrientationSensor#getOrientationCoordinates <em>Orientation Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Orientation Coordinates</em>'.
	 * @see org.eclipse.symphony.addons.sensors.pose.OrientationSensor#getOrientationCoordinates()
	 * @see #getOrientationSensor()
	 * @generated
	 */
	EReference getOrientationSensor_OrientationCoordinates();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.addons.sensors.pose.OrientationSensor#resetOrientation(org.eclipse.symphony.common.geometry.data3d.CartesianOrientationCoordinates) <em>Reset Orientation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Reset Orientation</em>' operation.
	 * @see org.eclipse.symphony.addons.sensors.pose.OrientationSensor#resetOrientation(org.eclipse.symphony.common.geometry.data3d.CartesianOrientationCoordinates)
	 * @generated
	 */
	EOperation getOrientationSensor__ResetOrientation__CartesianOrientationCoordinates();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.addons.sensors.pose.OrientationSensor#extractOrientationFromMatrix(org.eclipse.symphony.common.math.Matrix3x3) <em>Extract Orientation From Matrix</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Extract Orientation From Matrix</em>' operation.
	 * @see org.eclipse.symphony.addons.sensors.pose.OrientationSensor#extractOrientationFromMatrix(org.eclipse.symphony.common.math.Matrix3x3)
	 * @generated
	 */
	EOperation getOrientationSensor__ExtractOrientationFromMatrix__Matrix3x3();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.sensors.pose.PoseSensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor</em>'.
	 * @see org.eclipse.symphony.addons.sensors.pose.PoseSensor
	 * @generated
	 */
	EClass getPoseSensor();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.addons.sensors.pose.PoseSensor#getPose <em>Pose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pose</em>'.
	 * @see org.eclipse.symphony.addons.sensors.pose.PoseSensor#getPose()
	 * @see #getPoseSensor()
	 * @generated
	 */
	EReference getPoseSensor_Pose();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.addons.sensors.pose.PoseSensor#getDataLogger <em>Data Logger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Logger</em>'.
	 * @see org.eclipse.symphony.addons.sensors.pose.PoseSensor#getDataLogger()
	 * @see #getPoseSensor()
	 * @generated
	 */
	EReference getPoseSensor_DataLogger();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.addons.sensors.pose.PoseSensor#resetPose(org.eclipse.symphony.common.geometry.data3d.Pose) <em>Reset Pose</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Reset Pose</em>' operation.
	 * @see org.eclipse.symphony.addons.sensors.pose.PoseSensor#resetPose(org.eclipse.symphony.common.geometry.data3d.Pose)
	 * @generated
	 */
	EOperation getPoseSensor__ResetPose__Pose();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.sensors.pose.SelfPlaceSensor <em>Self Place Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Self Place Sensor</em>'.
	 * @see org.eclipse.symphony.addons.sensors.pose.SelfPlaceSensor
	 * @generated
	 */
	EClass getSelfPlaceSensor();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.sensors.pose.SimulatedPositionSensor <em>Simulated Position Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simulated Position Sensor</em>'.
	 * @see org.eclipse.symphony.addons.sensors.pose.SimulatedPositionSensor
	 * @generated
	 */
	EClass getSimulatedPositionSensor();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.pose.SimulatedPositionSensor#getXVelocity <em>XVelocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XVelocity</em>'.
	 * @see org.eclipse.symphony.addons.sensors.pose.SimulatedPositionSensor#getXVelocity()
	 * @see #getSimulatedPositionSensor()
	 * @generated
	 */
	EAttribute getSimulatedPositionSensor_XVelocity();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.pose.SimulatedPositionSensor#getYVelocity <em>YVelocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YVelocity</em>'.
	 * @see org.eclipse.symphony.addons.sensors.pose.SimulatedPositionSensor#getYVelocity()
	 * @see #getSimulatedPositionSensor()
	 * @generated
	 */
	EAttribute getSimulatedPositionSensor_YVelocity();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.pose.SimulatedPositionSensor#getZVelocity <em>ZVelocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ZVelocity</em>'.
	 * @see org.eclipse.symphony.addons.sensors.pose.SimulatedPositionSensor#getZVelocity()
	 * @see #getSimulatedPositionSensor()
	 * @generated
	 */
	EAttribute getSimulatedPositionSensor_ZVelocity();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.pose.SimulatedPositionSensor#getUpdatePeriod <em>Update Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Update Period</em>'.
	 * @see org.eclipse.symphony.addons.sensors.pose.SimulatedPositionSensor#getUpdatePeriod()
	 * @see #getSimulatedPositionSensor()
	 * @generated
	 */
	EAttribute getSimulatedPositionSensor_UpdatePeriod();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.sensors.pose.SimulatedOrientationSensor <em>Simulated Orientation Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simulated Orientation Sensor</em>'.
	 * @see org.eclipse.symphony.addons.sensors.pose.SimulatedOrientationSensor
	 * @generated
	 */
	EClass getSimulatedOrientationSensor();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.pose.SimulatedOrientationSensor#getXAngularVelocity <em>XAngular Velocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XAngular Velocity</em>'.
	 * @see org.eclipse.symphony.addons.sensors.pose.SimulatedOrientationSensor#getXAngularVelocity()
	 * @see #getSimulatedOrientationSensor()
	 * @generated
	 */
	EAttribute getSimulatedOrientationSensor_XAngularVelocity();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.pose.SimulatedOrientationSensor#getYAngularVelocity <em>YAngular Velocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YAngular Velocity</em>'.
	 * @see org.eclipse.symphony.addons.sensors.pose.SimulatedOrientationSensor#getYAngularVelocity()
	 * @see #getSimulatedOrientationSensor()
	 * @generated
	 */
	EAttribute getSimulatedOrientationSensor_YAngularVelocity();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.pose.SimulatedOrientationSensor#getZAngularVelocity <em>ZAngular Velocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ZAngular Velocity</em>'.
	 * @see org.eclipse.symphony.addons.sensors.pose.SimulatedOrientationSensor#getZAngularVelocity()
	 * @see #getSimulatedOrientationSensor()
	 * @generated
	 */
	EAttribute getSimulatedOrientationSensor_ZAngularVelocity();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.pose.SimulatedOrientationSensor#getUpdatePeriod <em>Update Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Update Period</em>'.
	 * @see org.eclipse.symphony.addons.sensors.pose.SimulatedOrientationSensor#getUpdatePeriod()
	 * @see #getSimulatedOrientationSensor()
	 * @generated
	 */
	EAttribute getSimulatedOrientationSensor_UpdatePeriod();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.sensors.pose.SimulatedPoseSensor <em>Simulated Pose Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simulated Pose Sensor</em>'.
	 * @see org.eclipse.symphony.addons.sensors.pose.SimulatedPoseSensor
	 * @generated
	 */
	EClass getSimulatedPoseSensor();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.pose.SimulatedPoseSensor#getUpdatePeriod <em>Update Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Update Period</em>'.
	 * @see org.eclipse.symphony.addons.sensors.pose.SimulatedPoseSensor#getUpdatePeriod()
	 * @see #getSimulatedPoseSensor()
	 * @generated
	 */
	EAttribute getSimulatedPoseSensor_UpdatePeriod();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.pose.SimulatedPoseSensor#getXVelocity <em>XVelocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XVelocity</em>'.
	 * @see org.eclipse.symphony.addons.sensors.pose.SimulatedPoseSensor#getXVelocity()
	 * @see #getSimulatedPoseSensor()
	 * @generated
	 */
	EAttribute getSimulatedPoseSensor_XVelocity();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.pose.SimulatedPoseSensor#getYVelocity <em>YVelocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YVelocity</em>'.
	 * @see org.eclipse.symphony.addons.sensors.pose.SimulatedPoseSensor#getYVelocity()
	 * @see #getSimulatedPoseSensor()
	 * @generated
	 */
	EAttribute getSimulatedPoseSensor_YVelocity();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.pose.SimulatedPoseSensor#getZVelocity <em>ZVelocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ZVelocity</em>'.
	 * @see org.eclipse.symphony.addons.sensors.pose.SimulatedPoseSensor#getZVelocity()
	 * @see #getSimulatedPoseSensor()
	 * @generated
	 */
	EAttribute getSimulatedPoseSensor_ZVelocity();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.pose.SimulatedPoseSensor#getXAngularVelocity <em>XAngular Velocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XAngular Velocity</em>'.
	 * @see org.eclipse.symphony.addons.sensors.pose.SimulatedPoseSensor#getXAngularVelocity()
	 * @see #getSimulatedPoseSensor()
	 * @generated
	 */
	EAttribute getSimulatedPoseSensor_XAngularVelocity();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.pose.SimulatedPoseSensor#getYAngularVelocity <em>YAngular Velocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YAngular Velocity</em>'.
	 * @see org.eclipse.symphony.addons.sensors.pose.SimulatedPoseSensor#getYAngularVelocity()
	 * @see #getSimulatedPoseSensor()
	 * @generated
	 */
	EAttribute getSimulatedPoseSensor_YAngularVelocity();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.pose.SimulatedPoseSensor#getZAngularVelocity <em>ZAngular Velocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ZAngular Velocity</em>'.
	 * @see org.eclipse.symphony.addons.sensors.pose.SimulatedPoseSensor#getZAngularVelocity()
	 * @see #getSimulatedPoseSensor()
	 * @generated
	 */
	EAttribute getSimulatedPoseSensor_ZAngularVelocity();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.sensors.pose.PoseDataLogger <em>Data Logger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Logger</em>'.
	 * @see org.eclipse.symphony.addons.sensors.pose.PoseDataLogger
	 * @generated
	 */
	EClass getPoseDataLogger();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.pose.PoseDataLogger#getOutputFile <em>Output File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output File</em>'.
	 * @see org.eclipse.symphony.addons.sensors.pose.PoseDataLogger#getOutputFile()
	 * @see #getPoseDataLogger()
	 * @generated
	 */
	EAttribute getPoseDataLogger_OutputFile();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.addons.sensors.pose.PoseDataLogger#logPose(org.eclipse.symphony.common.geometry.data3d.Pose) <em>Log Pose</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Log Pose</em>' operation.
	 * @see org.eclipse.symphony.addons.sensors.pose.PoseDataLogger#logPose(org.eclipse.symphony.common.geometry.data3d.Pose)
	 * @generated
	 */
	EOperation getPoseDataLogger__LogPose__Pose();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.sensors.pose.CSVDataLogger <em>CSV Data Logger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CSV Data Logger</em>'.
	 * @see org.eclipse.symphony.addons.sensors.pose.CSVDataLogger
	 * @generated
	 */
	EClass getCSVDataLogger();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.sensors.pose.PoseFacade <em>Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facade</em>'.
	 * @see org.eclipse.symphony.addons.sensors.pose.PoseFacade
	 * @generated
	 */
	EClass getPoseFacade();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.addons.sensors.pose.PoseFacade#createCSVDataLogger(java.lang.String) <em>Create CSV Data Logger</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create CSV Data Logger</em>' operation.
	 * @see org.eclipse.symphony.addons.sensors.pose.PoseFacade#createCSVDataLogger(java.lang.String)
	 * @generated
	 */
	EOperation getPoseFacade__CreateCSVDataLogger__String();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.sensors.pose.InertialMeasurementUnit <em>Inertial Measurement Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inertial Measurement Unit</em>'.
	 * @see org.eclipse.symphony.addons.sensors.pose.InertialMeasurementUnit
	 * @generated
	 */
	EClass getInertialMeasurementUnit();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.addons.sensors.pose.InertialMeasurementUnit#getAngularVelocity <em>Angular Velocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Angular Velocity</em>'.
	 * @see org.eclipse.symphony.addons.sensors.pose.InertialMeasurementUnit#getAngularVelocity()
	 * @see #getInertialMeasurementUnit()
	 * @generated
	 */
	EReference getInertialMeasurementUnit_AngularVelocity();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.addons.sensors.pose.InertialMeasurementUnit#getLinearAcceleration <em>Linear Acceleration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Linear Acceleration</em>'.
	 * @see org.eclipse.symphony.addons.sensors.pose.InertialMeasurementUnit#getLinearAcceleration()
	 * @see #getInertialMeasurementUnit()
	 * @generated
	 */
	EReference getInertialMeasurementUnit_LinearAcceleration();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PoseFactory getPoseFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.sensors.pose.impl.PositionSensorImpl <em>Position Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.sensors.pose.impl.PositionSensorImpl
		 * @see org.eclipse.symphony.addons.sensors.pose.impl.PosePackageImpl#getPositionSensor()
		 * @generated
		 */
		EClass POSITION_SENSOR = eINSTANCE.getPositionSensor();

		/**
		 * The meta object literal for the '<em><b>Position Coordinates</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSITION_SENSOR__POSITION_COORDINATES = eINSTANCE.getPositionSensor_PositionCoordinates();

		/**
		 * The meta object literal for the '<em><b>Reset Position</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POSITION_SENSOR___RESET_POSITION__CARTESIANPOSITIONCOORDINATES = eINSTANCE.getPositionSensor__ResetPosition__CartesianPositionCoordinates();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.sensors.pose.impl.OrientationSensorImpl <em>Orientation Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.sensors.pose.impl.OrientationSensorImpl
		 * @see org.eclipse.symphony.addons.sensors.pose.impl.PosePackageImpl#getOrientationSensor()
		 * @generated
		 */
		EClass ORIENTATION_SENSOR = eINSTANCE.getOrientationSensor();

		/**
		 * The meta object literal for the '<em><b>Orientation Coordinates</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORIENTATION_SENSOR__ORIENTATION_COORDINATES = eINSTANCE.getOrientationSensor_OrientationCoordinates();

		/**
		 * The meta object literal for the '<em><b>Reset Orientation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ORIENTATION_SENSOR___RESET_ORIENTATION__CARTESIANORIENTATIONCOORDINATES = eINSTANCE.getOrientationSensor__ResetOrientation__CartesianOrientationCoordinates();

		/**
		 * The meta object literal for the '<em><b>Extract Orientation From Matrix</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ORIENTATION_SENSOR___EXTRACT_ORIENTATION_FROM_MATRIX__MATRIX3X3 = eINSTANCE.getOrientationSensor__ExtractOrientationFromMatrix__Matrix3x3();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.sensors.pose.impl.PoseSensorImpl <em>Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.sensors.pose.impl.PoseSensorImpl
		 * @see org.eclipse.symphony.addons.sensors.pose.impl.PosePackageImpl#getPoseSensor()
		 * @generated
		 */
		EClass POSE_SENSOR = eINSTANCE.getPoseSensor();

		/**
		 * The meta object literal for the '<em><b>Pose</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSE_SENSOR__POSE = eINSTANCE.getPoseSensor_Pose();

		/**
		 * The meta object literal for the '<em><b>Data Logger</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSE_SENSOR__DATA_LOGGER = eINSTANCE.getPoseSensor_DataLogger();

		/**
		 * The meta object literal for the '<em><b>Reset Pose</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POSE_SENSOR___RESET_POSE__POSE = eINSTANCE.getPoseSensor__ResetPose__Pose();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.sensors.pose.impl.SelfPlaceSensorImpl <em>Self Place Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.sensors.pose.impl.SelfPlaceSensorImpl
		 * @see org.eclipse.symphony.addons.sensors.pose.impl.PosePackageImpl#getSelfPlaceSensor()
		 * @generated
		 */
		EClass SELF_PLACE_SENSOR = eINSTANCE.getSelfPlaceSensor();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.sensors.pose.impl.SimulatedPositionSensorImpl <em>Simulated Position Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.sensors.pose.impl.SimulatedPositionSensorImpl
		 * @see org.eclipse.symphony.addons.sensors.pose.impl.PosePackageImpl#getSimulatedPositionSensor()
		 * @generated
		 */
		EClass SIMULATED_POSITION_SENSOR = eINSTANCE.getSimulatedPositionSensor();

		/**
		 * The meta object literal for the '<em><b>XVelocity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATED_POSITION_SENSOR__XVELOCITY = eINSTANCE.getSimulatedPositionSensor_XVelocity();

		/**
		 * The meta object literal for the '<em><b>YVelocity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATED_POSITION_SENSOR__YVELOCITY = eINSTANCE.getSimulatedPositionSensor_YVelocity();

		/**
		 * The meta object literal for the '<em><b>ZVelocity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATED_POSITION_SENSOR__ZVELOCITY = eINSTANCE.getSimulatedPositionSensor_ZVelocity();

		/**
		 * The meta object literal for the '<em><b>Update Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATED_POSITION_SENSOR__UPDATE_PERIOD = eINSTANCE.getSimulatedPositionSensor_UpdatePeriod();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.sensors.pose.impl.SimulatedOrientationSensorImpl <em>Simulated Orientation Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.sensors.pose.impl.SimulatedOrientationSensorImpl
		 * @see org.eclipse.symphony.addons.sensors.pose.impl.PosePackageImpl#getSimulatedOrientationSensor()
		 * @generated
		 */
		EClass SIMULATED_ORIENTATION_SENSOR = eINSTANCE.getSimulatedOrientationSensor();

		/**
		 * The meta object literal for the '<em><b>XAngular Velocity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATED_ORIENTATION_SENSOR__XANGULAR_VELOCITY = eINSTANCE.getSimulatedOrientationSensor_XAngularVelocity();

		/**
		 * The meta object literal for the '<em><b>YAngular Velocity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATED_ORIENTATION_SENSOR__YANGULAR_VELOCITY = eINSTANCE.getSimulatedOrientationSensor_YAngularVelocity();

		/**
		 * The meta object literal for the '<em><b>ZAngular Velocity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATED_ORIENTATION_SENSOR__ZANGULAR_VELOCITY = eINSTANCE.getSimulatedOrientationSensor_ZAngularVelocity();

		/**
		 * The meta object literal for the '<em><b>Update Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATED_ORIENTATION_SENSOR__UPDATE_PERIOD = eINSTANCE.getSimulatedOrientationSensor_UpdatePeriod();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.sensors.pose.impl.SimulatedPoseSensorImpl <em>Simulated Pose Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.sensors.pose.impl.SimulatedPoseSensorImpl
		 * @see org.eclipse.symphony.addons.sensors.pose.impl.PosePackageImpl#getSimulatedPoseSensor()
		 * @generated
		 */
		EClass SIMULATED_POSE_SENSOR = eINSTANCE.getSimulatedPoseSensor();

		/**
		 * The meta object literal for the '<em><b>Update Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATED_POSE_SENSOR__UPDATE_PERIOD = eINSTANCE.getSimulatedPoseSensor_UpdatePeriod();

		/**
		 * The meta object literal for the '<em><b>XVelocity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATED_POSE_SENSOR__XVELOCITY = eINSTANCE.getSimulatedPoseSensor_XVelocity();

		/**
		 * The meta object literal for the '<em><b>YVelocity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATED_POSE_SENSOR__YVELOCITY = eINSTANCE.getSimulatedPoseSensor_YVelocity();

		/**
		 * The meta object literal for the '<em><b>ZVelocity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATED_POSE_SENSOR__ZVELOCITY = eINSTANCE.getSimulatedPoseSensor_ZVelocity();

		/**
		 * The meta object literal for the '<em><b>XAngular Velocity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATED_POSE_SENSOR__XANGULAR_VELOCITY = eINSTANCE.getSimulatedPoseSensor_XAngularVelocity();

		/**
		 * The meta object literal for the '<em><b>YAngular Velocity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATED_POSE_SENSOR__YANGULAR_VELOCITY = eINSTANCE.getSimulatedPoseSensor_YAngularVelocity();

		/**
		 * The meta object literal for the '<em><b>ZAngular Velocity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATED_POSE_SENSOR__ZANGULAR_VELOCITY = eINSTANCE.getSimulatedPoseSensor_ZAngularVelocity();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.sensors.pose.PoseDataLogger <em>Data Logger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.sensors.pose.PoseDataLogger
		 * @see org.eclipse.symphony.addons.sensors.pose.impl.PosePackageImpl#getPoseDataLogger()
		 * @generated
		 */
		EClass POSE_DATA_LOGGER = eINSTANCE.getPoseDataLogger();

		/**
		 * The meta object literal for the '<em><b>Output File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSE_DATA_LOGGER__OUTPUT_FILE = eINSTANCE.getPoseDataLogger_OutputFile();

		/**
		 * The meta object literal for the '<em><b>Log Pose</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POSE_DATA_LOGGER___LOG_POSE__POSE = eINSTANCE.getPoseDataLogger__LogPose__Pose();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.sensors.pose.impl.CSVDataLoggerImpl <em>CSV Data Logger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.sensors.pose.impl.CSVDataLoggerImpl
		 * @see org.eclipse.symphony.addons.sensors.pose.impl.PosePackageImpl#getCSVDataLogger()
		 * @generated
		 */
		EClass CSV_DATA_LOGGER = eINSTANCE.getCSVDataLogger();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.sensors.pose.impl.PoseFacadeImpl <em>Facade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.sensors.pose.impl.PoseFacadeImpl
		 * @see org.eclipse.symphony.addons.sensors.pose.impl.PosePackageImpl#getPoseFacade()
		 * @generated
		 */
		EClass POSE_FACADE = eINSTANCE.getPoseFacade();

		/**
		 * The meta object literal for the '<em><b>Create CSV Data Logger</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POSE_FACADE___CREATE_CSV_DATA_LOGGER__STRING = eINSTANCE.getPoseFacade__CreateCSVDataLogger__String();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.sensors.pose.impl.InertialMeasurementUnitImpl <em>Inertial Measurement Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.sensors.pose.impl.InertialMeasurementUnitImpl
		 * @see org.eclipse.symphony.addons.sensors.pose.impl.PosePackageImpl#getInertialMeasurementUnit()
		 * @generated
		 */
		EClass INERTIAL_MEASUREMENT_UNIT = eINSTANCE.getInertialMeasurementUnit();

		/**
		 * The meta object literal for the '<em><b>Angular Velocity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INERTIAL_MEASUREMENT_UNIT__ANGULAR_VELOCITY = eINSTANCE.getInertialMeasurementUnit_AngularVelocity();

		/**
		 * The meta object literal for the '<em><b>Linear Acceleration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INERTIAL_MEASUREMENT_UNIT__LINEAR_ACCELERATION = eINSTANCE.getInertialMeasurementUnit_LinearAcceleration();

	}

} //PosePackage
