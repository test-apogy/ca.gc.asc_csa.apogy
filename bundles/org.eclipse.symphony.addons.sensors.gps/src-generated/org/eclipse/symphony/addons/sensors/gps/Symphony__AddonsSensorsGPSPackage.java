/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.gps;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.symphony.addons.sensors.pose.Symphony__AddonsSensorsPosePackage;

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
 * @see org.eclipse.symphony.addons.sensors.gps.Symphony__AddonsSensorsGPSFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='Symphony__AddonsSensorsGPS' childCreationExtenders='true' extensibleProviderFactory='true' multipleEditorPages='false' copyrightText='Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)' modelName='Symphony__AddonsSensorsGPS' suppressGenModelAnnotations='false' modelDirectory='/org.eclipse.symphony.addons.sensors.gps/src-generated' editDirectory='/org.eclipse.symphony.addons.sensors.gps.edit/src-generated' basePackage='org.eclipse.symphony.addons.sensors'"
 * @generated
 */
public interface Symphony__AddonsSensorsGPSPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "gps";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.eclipse.symphony.addons.sensors.gps";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gps";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Symphony__AddonsSensorsGPSPackage eINSTANCE = org.eclipse.symphony.addons.sensors.gps.impl.Symphony__AddonsSensorsGPSPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.sensors.gps.GPSConnection <em>GPS Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.sensors.gps.GPSConnection
	 * @see org.eclipse.symphony.addons.sensors.gps.impl.Symphony__AddonsSensorsGPSPackageImpl#getGPSConnection()
	 * @generated
	 */
	int GPS_CONNECTION = 0;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_CONNECTION__INPUT = 0;

	/**
	 * The feature id for the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_CONNECTION__OUTPUT = 1;

	/**
	 * The number of structural features of the '<em>GPS Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_CONNECTION_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_CONNECTION___RESET = 0;

	/**
	 * The number of operations of the '<em>GPS Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_CONNECTION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.sensors.gps.GPSDataInterpreter <em>GPS Data Interpreter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.sensors.gps.GPSDataInterpreter
	 * @see org.eclipse.symphony.addons.sensors.gps.impl.Symphony__AddonsSensorsGPSPackageImpl#getGPSDataInterpreter()
	 * @generated
	 */
	int GPS_DATA_INTERPRETER = 1;

	/**
	 * The feature id for the '<em><b>Gps</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_DATA_INTERPRETER__GPS = 0;

	/**
	 * The number of structural features of the '<em>GPS Data Interpreter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_DATA_INTERPRETER_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Update GPS</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_DATA_INTERPRETER___UPDATE_GPS = 0;

	/**
	 * The number of operations of the '<em>GPS Data Interpreter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_DATA_INTERPRETER_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.sensors.gps.impl.GPSReadingImpl <em>GPS Reading</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.sensors.gps.impl.GPSReadingImpl
	 * @see org.eclipse.symphony.addons.sensors.gps.impl.Symphony__AddonsSensorsGPSPackageImpl#getGPSReading()
	 * @generated
	 */
	int GPS_READING = 2;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_READING__LATITUDE = 0;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_READING__LONGITUDE = 1;

	/**
	 * The feature id for the '<em><b>Elevation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_READING__ELEVATION = 2;

	/**
	 * The feature id for the '<em><b>Quality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_READING__QUALITY = 3;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_READING__TIME_STAMP = 4;

	/**
	 * The feature id for the '<em><b>Number Of Satellites</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_READING__NUMBER_OF_SATELLITES = 5;

	/**
	 * The feature id for the '<em><b>Horizontal Dilution Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_READING__HORIZONTAL_DILUTION_POS = 6;

	/**
	 * The feature id for the '<em><b>Mean Sea Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_READING__MEAN_SEA_LEVEL = 7;

	/**
	 * The feature id for the '<em><b>Check Sum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_READING__CHECK_SUM = 8;

	/**
	 * The number of structural features of the '<em>GPS Reading</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_READING_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>GPS Reading</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_READING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.sensors.gps.impl.GPSPoseSensorImpl <em>GPS Pose Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.sensors.gps.impl.GPSPoseSensorImpl
	 * @see org.eclipse.symphony.addons.sensors.gps.impl.Symphony__AddonsSensorsGPSPackageImpl#getGPSPoseSensor()
	 * @generated
	 */
	int GPS_POSE_SENSOR = 3;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_POSE_SENSOR__PARENT = Symphony__AddonsSensorsPosePackage.POSE_SENSOR__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_POSE_SENSOR__DESCRIPTION = Symphony__AddonsSensorsPosePackage.POSE_SENSOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_POSE_SENSOR__NODE_ID = Symphony__AddonsSensorsPosePackage.POSE_SENSOR__NODE_ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_POSE_SENSOR__CHILDREN = Symphony__AddonsSensorsPosePackage.POSE_SENSOR__CHILDREN;

	/**
	 * The feature id for the '<em><b>Aggregated Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_POSE_SENSOR__AGGREGATED_CHILDREN = Symphony__AddonsSensorsPosePackage.POSE_SENSOR__AGGREGATED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_POSE_SENSOR__POSITION = Symphony__AddonsSensorsPosePackage.POSE_SENSOR__POSITION;

	/**
	 * The feature id for the '<em><b>Rotation Matrix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_POSE_SENSOR__ROTATION_MATRIX = Symphony__AddonsSensorsPosePackage.POSE_SENSOR__ROTATION_MATRIX;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_POSE_SENSOR__STATUS = Symphony__AddonsSensorsPosePackage.POSE_SENSOR__STATUS;

	/**
	 * The feature id for the '<em><b>Position Coordinates</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_POSE_SENSOR__POSITION_COORDINATES = Symphony__AddonsSensorsPosePackage.POSE_SENSOR__POSITION_COORDINATES;

	/**
	 * The feature id for the '<em><b>Orientation Coordinates</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_POSE_SENSOR__ORIENTATION_COORDINATES = Symphony__AddonsSensorsPosePackage.POSE_SENSOR__ORIENTATION_COORDINATES;

	/**
	 * The feature id for the '<em><b>Pose</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_POSE_SENSOR__POSE = Symphony__AddonsSensorsPosePackage.POSE_SENSOR__POSE;

	/**
	 * The feature id for the '<em><b>Data Logger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_POSE_SENSOR__DATA_LOGGER = Symphony__AddonsSensorsPosePackage.POSE_SENSOR__DATA_LOGGER;

	/**
	 * The feature id for the '<em><b>Started</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_POSE_SENSOR__STARTED = Symphony__AddonsSensorsPosePackage.POSE_SENSOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Server Job</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_POSE_SENSOR__SERVER_JOB = Symphony__AddonsSensorsPosePackage.POSE_SENSOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Gps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_POSE_SENSOR__GPS = Symphony__AddonsSensorsPosePackage.POSE_SENSOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Origin Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_POSE_SENSOR__ORIGIN_LATITUDE = Symphony__AddonsSensorsPosePackage.POSE_SENSOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Origin Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_POSE_SENSOR__ORIGIN_LONGITUDE = Symphony__AddonsSensorsPosePackage.POSE_SENSOR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Ne Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_POSE_SENSOR__NE_ANGLE = Symphony__AddonsSensorsPosePackage.POSE_SENSOR_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Origin Elevation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_POSE_SENSOR__ORIGIN_ELEVATION = Symphony__AddonsSensorsPosePackage.POSE_SENSOR_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Max Init Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_POSE_SENSOR__MAX_INIT_TIME = Symphony__AddonsSensorsPosePackage.POSE_SENSOR_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>GPS Pose Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_POSE_SENSOR_FEATURE_COUNT = Symphony__AddonsSensorsPosePackage.POSE_SENSOR_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_POSE_SENSOR___ACCEPT__INODEVISITOR = Symphony__AddonsSensorsPosePackage.POSE_SENSOR___ACCEPT__INODEVISITOR;

	/**
	 * The operation id for the '<em>As Matrix4d</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_POSE_SENSOR___AS_MATRIX4D = Symphony__AddonsSensorsPosePackage.POSE_SENSOR___AS_MATRIX4D;

	/**
	 * The operation id for the '<em>Set Transformation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_POSE_SENSOR___SET_TRANSFORMATION__MATRIX4D = Symphony__AddonsSensorsPosePackage.POSE_SENSOR___SET_TRANSFORMATION__MATRIX4D;

	/**
	 * The operation id for the '<em>Reset Position</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_POSE_SENSOR___RESET_POSITION__CARTESIANPOSITIONCOORDINATES = Symphony__AddonsSensorsPosePackage.POSE_SENSOR___RESET_POSITION__CARTESIANPOSITIONCOORDINATES;

	/**
	 * The operation id for the '<em>Reset Orientation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_POSE_SENSOR___RESET_ORIENTATION__CARTESIANORIENTATIONCOORDINATES = Symphony__AddonsSensorsPosePackage.POSE_SENSOR___RESET_ORIENTATION__CARTESIANORIENTATIONCOORDINATES;

	/**
	 * The operation id for the '<em>Extract Orientation From Matrix</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_POSE_SENSOR___EXTRACT_ORIENTATION_FROM_MATRIX__MATRIX3X3 = Symphony__AddonsSensorsPosePackage.POSE_SENSOR___EXTRACT_ORIENTATION_FROM_MATRIX__MATRIX3X3;

	/**
	 * The operation id for the '<em>Reset Pose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_POSE_SENSOR___RESET_POSE__POSE = Symphony__AddonsSensorsPosePackage.POSE_SENSOR___RESET_POSE__POSE;

	/**
	 * The number of operations of the '<em>GPS Pose Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_POSE_SENSOR_OPERATION_COUNT = Symphony__AddonsSensorsPosePackage.POSE_SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.sensors.gps.impl.GPSImpl <em>GPS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.sensors.gps.impl.GPSImpl
	 * @see org.eclipse.symphony.addons.sensors.gps.impl.Symphony__AddonsSensorsGPSPackageImpl#getGPS()
	 * @generated
	 */
	int GPS = 4;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS__CONNECTION = 0;

	/**
	 * The feature id for the '<em><b>Data Interpreter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS__DATA_INTERPRETER = 1;

	/**
	 * The feature id for the '<em><b>Reading</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS__READING = 2;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS__STATUS = 3;

	/**
	 * The feature id for the '<em><b>Update Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS__UPDATE_RATE = 4;

	/**
	 * The feature id for the '<em><b>Last Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS__LAST_FAILURE = 5;

	/**
	 * The feature id for the '<em><b>Max Reconnect Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS__MAX_RECONNECT_TIME = 6;

	/**
	 * The feature id for the '<em><b>Speed Knots</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS__SPEED_KNOTS = 7;

	/**
	 * The feature id for the '<em><b>Speed Kmh</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS__SPEED_KMH = 8;

	/**
	 * The number of structural features of the '<em>GPS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_FEATURE_COUNT = 9;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS___START = 0;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS___STOP = 1;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS___RESET = 2;

	/**
	 * The operation id for the '<em>Reconnect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS___RECONNECT = 3;

	/**
	 * The number of operations of the '<em>GPS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.sensors.gps.impl.MarkedGPSImpl <em>Marked GPS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.sensors.gps.impl.MarkedGPSImpl
	 * @see org.eclipse.symphony.addons.sensors.gps.impl.Symphony__AddonsSensorsGPSPackageImpl#getMarkedGPS()
	 * @generated
	 */
	int MARKED_GPS = 5;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKED_GPS__CONNECTION = GPS__CONNECTION;

	/**
	 * The feature id for the '<em><b>Data Interpreter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKED_GPS__DATA_INTERPRETER = GPS__DATA_INTERPRETER;

	/**
	 * The feature id for the '<em><b>Reading</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKED_GPS__READING = GPS__READING;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKED_GPS__STATUS = GPS__STATUS;

	/**
	 * The feature id for the '<em><b>Update Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKED_GPS__UPDATE_RATE = GPS__UPDATE_RATE;

	/**
	 * The feature id for the '<em><b>Last Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKED_GPS__LAST_FAILURE = GPS__LAST_FAILURE;

	/**
	 * The feature id for the '<em><b>Max Reconnect Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKED_GPS__MAX_RECONNECT_TIME = GPS__MAX_RECONNECT_TIME;

	/**
	 * The feature id for the '<em><b>Speed Knots</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKED_GPS__SPEED_KNOTS = GPS__SPEED_KNOTS;

	/**
	 * The feature id for the '<em><b>Speed Kmh</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKED_GPS__SPEED_KMH = GPS__SPEED_KMH;

	/**
	 * The feature id for the '<em><b>Marker</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKED_GPS__MARKER = GPS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Marked GPS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKED_GPS_FEATURE_COUNT = GPS_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKED_GPS___START = GPS___START;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKED_GPS___STOP = GPS___STOP;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKED_GPS___RESET = GPS___RESET;

	/**
	 * The operation id for the '<em>Reconnect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKED_GPS___RECONNECT = GPS___RECONNECT;

	/**
	 * The number of operations of the '<em>Marked GPS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKED_GPS_OPERATION_COUNT = GPS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.sensors.gps.GPSRepository <em>GPS Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.sensors.gps.GPSRepository
	 * @see org.eclipse.symphony.addons.sensors.gps.impl.Symphony__AddonsSensorsGPSPackageImpl#getGPSRepository()
	 * @generated
	 */
	int GPS_REPOSITORY = 6;

	/**
	 * The feature id for the '<em><b>Gps Devices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_REPOSITORY__GPS_DEVICES = 0;

	/**
	 * The number of structural features of the '<em>GPS Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_REPOSITORY_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Scan For Devices</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_REPOSITORY___SCAN_FOR_DEVICES = 0;

	/**
	 * The operation id for the '<em>Get GPS By Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_REPOSITORY___GET_GPS_BY_ID__STRING = 1;

	/**
	 * The number of operations of the '<em>GPS Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_REPOSITORY_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.sensors.gps.impl.Symphony__AddonsSensorsGPSFacadeImpl <em>Facade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.sensors.gps.impl.Symphony__AddonsSensorsGPSFacadeImpl
	 * @see org.eclipse.symphony.addons.sensors.gps.impl.Symphony__AddonsSensorsGPSPackageImpl#getSymphony__AddonsSensorsGPSFacade()
	 * @generated
	 */
	int SYMPHONY_ADDONS_SENSORS_GPS_FACADE = 7;

	/**
	 * The number of structural features of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_ADDONS_SENSORS_GPS_FACADE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Create GPS Pose Sensor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_ADDONS_SENSORS_GPS_FACADE___CREATE_GPS_POSE_SENSOR__DOUBLE_DOUBLE = 0;

	/**
	 * The operation id for the '<em>Create Marked GPS</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_ADDONS_SENSORS_GPS_FACADE___CREATE_MARKED_GPS__POSITIONMARKER = 1;

	/**
	 * The number of operations of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_ADDONS_SENSORS_GPS_FACADE_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.sensors.gps.GPSStatus <em>GPS Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.sensors.gps.GPSStatus
	 * @see org.eclipse.symphony.addons.sensors.gps.impl.Symphony__AddonsSensorsGPSPackageImpl#getGPSStatus()
	 * @generated
	 */
	int GPS_STATUS = 8;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.sensors.gps.GPSQuality <em>GPS Quality</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.sensors.gps.GPSQuality
	 * @see org.eclipse.symphony.addons.sensors.gps.impl.Symphony__AddonsSensorsGPSPackageImpl#getGPSQuality()
	 * @generated
	 */
	int GPS_QUALITY = 9;

	/**
	 * The meta object id for the '<em>Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Exception
	 * @see org.eclipse.symphony.addons.sensors.gps.impl.Symphony__AddonsSensorsGPSPackageImpl#getException()
	 * @generated
	 */
	int EXCEPTION = 10;

	/**
	 * The meta object id for the '<em>IO Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.io.IOException
	 * @see org.eclipse.symphony.addons.sensors.gps.impl.Symphony__AddonsSensorsGPSPackageImpl#getIOException()
	 * @generated
	 */
	int IO_EXCEPTION = 11;

	/**
	 * The meta object id for the '<em>Input Stream</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.io.InputStream
	 * @see org.eclipse.symphony.addons.sensors.gps.impl.Symphony__AddonsSensorsGPSPackageImpl#getInputStream()
	 * @generated
	 */
	int INPUT_STREAM = 12;

	/**
	 * The meta object id for the '<em>Output Stream</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.io.OutputStream
	 * @see org.eclipse.symphony.addons.sensors.gps.impl.Symphony__AddonsSensorsGPSPackageImpl#getOutputStream()
	 * @generated
	 */
	int OUTPUT_STREAM = 13;

	/**
	 * The meta object id for the '<em>Date</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Date
	 * @see org.eclipse.symphony.addons.sensors.gps.impl.Symphony__AddonsSensorsGPSPackageImpl#getDate()
	 * @generated
	 */
	int DATE = 14;


	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.sensors.gps.GPSConnection <em>GPS Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GPS Connection</em>'.
	 * @see org.eclipse.symphony.addons.sensors.gps.GPSConnection
	 * @generated
	 */
	EClass getGPSConnection();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.gps.GPSConnection#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input</em>'.
	 * @see org.eclipse.symphony.addons.sensors.gps.GPSConnection#getInput()
	 * @see #getGPSConnection()
	 * @generated
	 */
	EAttribute getGPSConnection_Input();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.gps.GPSConnection#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output</em>'.
	 * @see org.eclipse.symphony.addons.sensors.gps.GPSConnection#getOutput()
	 * @see #getGPSConnection()
	 * @generated
	 */
	EAttribute getGPSConnection_Output();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.addons.sensors.gps.GPSConnection#reset() <em>Reset</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Reset</em>' operation.
	 * @see org.eclipse.symphony.addons.sensors.gps.GPSConnection#reset()
	 * @generated
	 */
	EOperation getGPSConnection__Reset();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.sensors.gps.GPSDataInterpreter <em>GPS Data Interpreter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GPS Data Interpreter</em>'.
	 * @see org.eclipse.symphony.addons.sensors.gps.GPSDataInterpreter
	 * @generated
	 */
	EClass getGPSDataInterpreter();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.symphony.addons.sensors.gps.GPSDataInterpreter#getGps <em>Gps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Gps</em>'.
	 * @see org.eclipse.symphony.addons.sensors.gps.GPSDataInterpreter#getGps()
	 * @see #getGPSDataInterpreter()
	 * @generated
	 */
	EReference getGPSDataInterpreter_Gps();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.addons.sensors.gps.GPSDataInterpreter#updateGPS() <em>Update GPS</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update GPS</em>' operation.
	 * @see org.eclipse.symphony.addons.sensors.gps.GPSDataInterpreter#updateGPS()
	 * @generated
	 */
	EOperation getGPSDataInterpreter__UpdateGPS();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.sensors.gps.GPSReading <em>GPS Reading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GPS Reading</em>'.
	 * @see org.eclipse.symphony.addons.sensors.gps.GPSReading
	 * @generated
	 */
	EClass getGPSReading();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.gps.GPSReading#getLatitude <em>Latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latitude</em>'.
	 * @see org.eclipse.symphony.addons.sensors.gps.GPSReading#getLatitude()
	 * @see #getGPSReading()
	 * @generated
	 */
	EAttribute getGPSReading_Latitude();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.gps.GPSReading#getLongitude <em>Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Longitude</em>'.
	 * @see org.eclipse.symphony.addons.sensors.gps.GPSReading#getLongitude()
	 * @see #getGPSReading()
	 * @generated
	 */
	EAttribute getGPSReading_Longitude();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.gps.GPSReading#getElevation <em>Elevation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Elevation</em>'.
	 * @see org.eclipse.symphony.addons.sensors.gps.GPSReading#getElevation()
	 * @see #getGPSReading()
	 * @generated
	 */
	EAttribute getGPSReading_Elevation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.gps.GPSReading#getQuality <em>Quality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quality</em>'.
	 * @see org.eclipse.symphony.addons.sensors.gps.GPSReading#getQuality()
	 * @see #getGPSReading()
	 * @generated
	 */
	EAttribute getGPSReading_Quality();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.gps.GPSReading#getTimeStamp <em>Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Stamp</em>'.
	 * @see org.eclipse.symphony.addons.sensors.gps.GPSReading#getTimeStamp()
	 * @see #getGPSReading()
	 * @generated
	 */
	EAttribute getGPSReading_TimeStamp();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.gps.GPSReading#getNumberOfSatellites <em>Number Of Satellites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Satellites</em>'.
	 * @see org.eclipse.symphony.addons.sensors.gps.GPSReading#getNumberOfSatellites()
	 * @see #getGPSReading()
	 * @generated
	 */
	EAttribute getGPSReading_NumberOfSatellites();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.gps.GPSReading#getHorizontalDilutionPos <em>Horizontal Dilution Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horizontal Dilution Pos</em>'.
	 * @see org.eclipse.symphony.addons.sensors.gps.GPSReading#getHorizontalDilutionPos()
	 * @see #getGPSReading()
	 * @generated
	 */
	EAttribute getGPSReading_HorizontalDilutionPos();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.gps.GPSReading#getMeanSeaLevel <em>Mean Sea Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mean Sea Level</em>'.
	 * @see org.eclipse.symphony.addons.sensors.gps.GPSReading#getMeanSeaLevel()
	 * @see #getGPSReading()
	 * @generated
	 */
	EAttribute getGPSReading_MeanSeaLevel();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.gps.GPSReading#getCheckSum <em>Check Sum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check Sum</em>'.
	 * @see org.eclipse.symphony.addons.sensors.gps.GPSReading#getCheckSum()
	 * @see #getGPSReading()
	 * @generated
	 */
	EAttribute getGPSReading_CheckSum();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.sensors.gps.GPSPoseSensor <em>GPS Pose Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GPS Pose Sensor</em>'.
	 * @see org.eclipse.symphony.addons.sensors.gps.GPSPoseSensor
	 * @generated
	 */
	EClass getGPSPoseSensor();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.symphony.addons.sensors.gps.GPSPoseSensor#getGps <em>Gps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gps</em>'.
	 * @see org.eclipse.symphony.addons.sensors.gps.GPSPoseSensor#getGps()
	 * @see #getGPSPoseSensor()
	 * @generated
	 */
	EReference getGPSPoseSensor_Gps();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.gps.GPSPoseSensor#getOriginLatitude <em>Origin Latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Origin Latitude</em>'.
	 * @see org.eclipse.symphony.addons.sensors.gps.GPSPoseSensor#getOriginLatitude()
	 * @see #getGPSPoseSensor()
	 * @generated
	 */
	EAttribute getGPSPoseSensor_OriginLatitude();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.gps.GPSPoseSensor#getOriginLongitude <em>Origin Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Origin Longitude</em>'.
	 * @see org.eclipse.symphony.addons.sensors.gps.GPSPoseSensor#getOriginLongitude()
	 * @see #getGPSPoseSensor()
	 * @generated
	 */
	EAttribute getGPSPoseSensor_OriginLongitude();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.gps.GPSPoseSensor#getNeAngle <em>Ne Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ne Angle</em>'.
	 * @see org.eclipse.symphony.addons.sensors.gps.GPSPoseSensor#getNeAngle()
	 * @see #getGPSPoseSensor()
	 * @generated
	 */
	EAttribute getGPSPoseSensor_NeAngle();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.gps.GPSPoseSensor#getOriginElevation <em>Origin Elevation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Origin Elevation</em>'.
	 * @see org.eclipse.symphony.addons.sensors.gps.GPSPoseSensor#getOriginElevation()
	 * @see #getGPSPoseSensor()
	 * @generated
	 */
	EAttribute getGPSPoseSensor_OriginElevation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.gps.GPSPoseSensor#getMaxInitTime <em>Max Init Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Init Time</em>'.
	 * @see org.eclipse.symphony.addons.sensors.gps.GPSPoseSensor#getMaxInitTime()
	 * @see #getGPSPoseSensor()
	 * @generated
	 */
	EAttribute getGPSPoseSensor_MaxInitTime();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.sensors.gps.GPS <em>GPS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GPS</em>'.
	 * @see org.eclipse.symphony.addons.sensors.gps.GPS
	 * @generated
	 */
	EClass getGPS();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.addons.sensors.gps.GPS#getConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connection</em>'.
	 * @see org.eclipse.symphony.addons.sensors.gps.GPS#getConnection()
	 * @see #getGPS()
	 * @generated
	 */
	EReference getGPS_Connection();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.addons.sensors.gps.GPS#getDataInterpreter <em>Data Interpreter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Interpreter</em>'.
	 * @see org.eclipse.symphony.addons.sensors.gps.GPS#getDataInterpreter()
	 * @see #getGPS()
	 * @generated
	 */
	EReference getGPS_DataInterpreter();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.addons.sensors.gps.GPS#getReading <em>Reading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reading</em>'.
	 * @see org.eclipse.symphony.addons.sensors.gps.GPS#getReading()
	 * @see #getGPS()
	 * @generated
	 */
	EReference getGPS_Reading();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.gps.GPS#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.eclipse.symphony.addons.sensors.gps.GPS#getStatus()
	 * @see #getGPS()
	 * @generated
	 */
	EAttribute getGPS_Status();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.gps.GPS#getUpdateRate <em>Update Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Update Rate</em>'.
	 * @see org.eclipse.symphony.addons.sensors.gps.GPS#getUpdateRate()
	 * @see #getGPS()
	 * @generated
	 */
	EAttribute getGPS_UpdateRate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.gps.GPS#getLastFailure <em>Last Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Failure</em>'.
	 * @see org.eclipse.symphony.addons.sensors.gps.GPS#getLastFailure()
	 * @see #getGPS()
	 * @generated
	 */
	EAttribute getGPS_LastFailure();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.gps.GPS#getMaxReconnectTime <em>Max Reconnect Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Reconnect Time</em>'.
	 * @see org.eclipse.symphony.addons.sensors.gps.GPS#getMaxReconnectTime()
	 * @see #getGPS()
	 * @generated
	 */
	EAttribute getGPS_MaxReconnectTime();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.gps.GPS#getSpeedKnots <em>Speed Knots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed Knots</em>'.
	 * @see org.eclipse.symphony.addons.sensors.gps.GPS#getSpeedKnots()
	 * @see #getGPS()
	 * @generated
	 */
	EAttribute getGPS_SpeedKnots();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.gps.GPS#getSpeedKmh <em>Speed Kmh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed Kmh</em>'.
	 * @see org.eclipse.symphony.addons.sensors.gps.GPS#getSpeedKmh()
	 * @see #getGPS()
	 * @generated
	 */
	EAttribute getGPS_SpeedKmh();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.addons.sensors.gps.GPS#start() <em>Start</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Start</em>' operation.
	 * @see org.eclipse.symphony.addons.sensors.gps.GPS#start()
	 * @generated
	 */
	EOperation getGPS__Start();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.addons.sensors.gps.GPS#stop() <em>Stop</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Stop</em>' operation.
	 * @see org.eclipse.symphony.addons.sensors.gps.GPS#stop()
	 * @generated
	 */
	EOperation getGPS__Stop();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.addons.sensors.gps.GPS#reset() <em>Reset</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Reset</em>' operation.
	 * @see org.eclipse.symphony.addons.sensors.gps.GPS#reset()
	 * @generated
	 */
	EOperation getGPS__Reset();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.addons.sensors.gps.GPS#reconnect() <em>Reconnect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Reconnect</em>' operation.
	 * @see org.eclipse.symphony.addons.sensors.gps.GPS#reconnect()
	 * @generated
	 */
	EOperation getGPS__Reconnect();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.sensors.gps.MarkedGPS <em>Marked GPS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Marked GPS</em>'.
	 * @see org.eclipse.symphony.addons.sensors.gps.MarkedGPS
	 * @generated
	 */
	EClass getMarkedGPS();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.addons.sensors.gps.MarkedGPS#getMarker <em>Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Marker</em>'.
	 * @see org.eclipse.symphony.addons.sensors.gps.MarkedGPS#getMarker()
	 * @see #getMarkedGPS()
	 * @generated
	 */
	EReference getMarkedGPS_Marker();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.sensors.gps.GPSRepository <em>GPS Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GPS Repository</em>'.
	 * @see org.eclipse.symphony.addons.sensors.gps.GPSRepository
	 * @generated
	 */
	EClass getGPSRepository();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.symphony.addons.sensors.gps.GPSRepository#getGpsDevices <em>Gps Devices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gps Devices</em>'.
	 * @see org.eclipse.symphony.addons.sensors.gps.GPSRepository#getGpsDevices()
	 * @see #getGPSRepository()
	 * @generated
	 */
	EReference getGPSRepository_GpsDevices();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.addons.sensors.gps.GPSRepository#scanForDevices() <em>Scan For Devices</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Scan For Devices</em>' operation.
	 * @see org.eclipse.symphony.addons.sensors.gps.GPSRepository#scanForDevices()
	 * @generated
	 */
	EOperation getGPSRepository__ScanForDevices();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.addons.sensors.gps.GPSRepository#getGPSById(java.lang.String) <em>Get GPS By Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get GPS By Id</em>' operation.
	 * @see org.eclipse.symphony.addons.sensors.gps.GPSRepository#getGPSById(java.lang.String)
	 * @generated
	 */
	EOperation getGPSRepository__GetGPSById__String();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.sensors.gps.Symphony__AddonsSensorsGPSFacade <em>Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facade</em>'.
	 * @see org.eclipse.symphony.addons.sensors.gps.Symphony__AddonsSensorsGPSFacade
	 * @generated
	 */
	EClass getSymphony__AddonsSensorsGPSFacade();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.addons.sensors.gps.Symphony__AddonsSensorsGPSFacade#createGPSPoseSensor(double, double) <em>Create GPS Pose Sensor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create GPS Pose Sensor</em>' operation.
	 * @see org.eclipse.symphony.addons.sensors.gps.Symphony__AddonsSensorsGPSFacade#createGPSPoseSensor(double, double)
	 * @generated
	 */
	EOperation getSymphony__AddonsSensorsGPSFacade__CreateGPSPoseSensor__double_double();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.addons.sensors.gps.Symphony__AddonsSensorsGPSFacade#createMarkedGPS(org.eclipse.symphony.common.geometry.data3d.PositionMarker) <em>Create Marked GPS</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Marked GPS</em>' operation.
	 * @see org.eclipse.symphony.addons.sensors.gps.Symphony__AddonsSensorsGPSFacade#createMarkedGPS(org.eclipse.symphony.common.geometry.data3d.PositionMarker)
	 * @generated
	 */
	EOperation getSymphony__AddonsSensorsGPSFacade__CreateMarkedGPS__PositionMarker();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.symphony.addons.sensors.gps.GPSStatus <em>GPS Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GPS Status</em>'.
	 * @see org.eclipse.symphony.addons.sensors.gps.GPSStatus
	 * @generated
	 */
	EEnum getGPSStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.symphony.addons.sensors.gps.GPSQuality <em>GPS Quality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GPS Quality</em>'.
	 * @see org.eclipse.symphony.addons.sensors.gps.GPSQuality
	 * @generated
	 */
	EEnum getGPSQuality();

	/**
	 * Returns the meta object for data type '{@link java.lang.Exception <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Exception</em>'.
	 * @see java.lang.Exception
	 * @model instanceClass="java.lang.Exception"
	 * @generated
	 */
	EDataType getException();

	/**
	 * Returns the meta object for data type '{@link java.io.IOException <em>IO Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IO Exception</em>'.
	 * @see java.io.IOException
	 * @model instanceClass="java.io.IOException"
	 * @generated
	 */
	EDataType getIOException();

	/**
	 * Returns the meta object for data type '{@link java.io.InputStream <em>Input Stream</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Input Stream</em>'.
	 * @see java.io.InputStream
	 * @model instanceClass="java.io.InputStream"
	 * @generated
	 */
	EDataType getInputStream();

	/**
	 * Returns the meta object for data type '{@link java.io.OutputStream <em>Output Stream</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Output Stream</em>'.
	 * @see java.io.OutputStream
	 * @model instanceClass="java.io.OutputStream"
	 * @generated
	 */
	EDataType getOutputStream();

	/**
	 * Returns the meta object for data type '{@link java.util.Date <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Date</em>'.
	 * @see java.util.Date
	 * @model instanceClass="java.util.Date"
	 * @generated
	 */
	EDataType getDate();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Symphony__AddonsSensorsGPSFactory getSymphony__AddonsSensorsGPSFactory();

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
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.sensors.gps.GPSConnection <em>GPS Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.sensors.gps.GPSConnection
		 * @see org.eclipse.symphony.addons.sensors.gps.impl.Symphony__AddonsSensorsGPSPackageImpl#getGPSConnection()
		 * @generated
		 */
		EClass GPS_CONNECTION = eINSTANCE.getGPSConnection();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GPS_CONNECTION__INPUT = eINSTANCE.getGPSConnection_Input();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GPS_CONNECTION__OUTPUT = eINSTANCE.getGPSConnection_Output();

		/**
		 * The meta object literal for the '<em><b>Reset</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GPS_CONNECTION___RESET = eINSTANCE.getGPSConnection__Reset();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.sensors.gps.GPSDataInterpreter <em>GPS Data Interpreter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.sensors.gps.GPSDataInterpreter
		 * @see org.eclipse.symphony.addons.sensors.gps.impl.Symphony__AddonsSensorsGPSPackageImpl#getGPSDataInterpreter()
		 * @generated
		 */
		EClass GPS_DATA_INTERPRETER = eINSTANCE.getGPSDataInterpreter();

		/**
		 * The meta object literal for the '<em><b>Gps</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GPS_DATA_INTERPRETER__GPS = eINSTANCE.getGPSDataInterpreter_Gps();

		/**
		 * The meta object literal for the '<em><b>Update GPS</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GPS_DATA_INTERPRETER___UPDATE_GPS = eINSTANCE.getGPSDataInterpreter__UpdateGPS();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.sensors.gps.impl.GPSReadingImpl <em>GPS Reading</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.sensors.gps.impl.GPSReadingImpl
		 * @see org.eclipse.symphony.addons.sensors.gps.impl.Symphony__AddonsSensorsGPSPackageImpl#getGPSReading()
		 * @generated
		 */
		EClass GPS_READING = eINSTANCE.getGPSReading();

		/**
		 * The meta object literal for the '<em><b>Latitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GPS_READING__LATITUDE = eINSTANCE.getGPSReading_Latitude();

		/**
		 * The meta object literal for the '<em><b>Longitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GPS_READING__LONGITUDE = eINSTANCE.getGPSReading_Longitude();

		/**
		 * The meta object literal for the '<em><b>Elevation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GPS_READING__ELEVATION = eINSTANCE.getGPSReading_Elevation();

		/**
		 * The meta object literal for the '<em><b>Quality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GPS_READING__QUALITY = eINSTANCE.getGPSReading_Quality();

		/**
		 * The meta object literal for the '<em><b>Time Stamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GPS_READING__TIME_STAMP = eINSTANCE.getGPSReading_TimeStamp();

		/**
		 * The meta object literal for the '<em><b>Number Of Satellites</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GPS_READING__NUMBER_OF_SATELLITES = eINSTANCE.getGPSReading_NumberOfSatellites();

		/**
		 * The meta object literal for the '<em><b>Horizontal Dilution Pos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GPS_READING__HORIZONTAL_DILUTION_POS = eINSTANCE.getGPSReading_HorizontalDilutionPos();

		/**
		 * The meta object literal for the '<em><b>Mean Sea Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GPS_READING__MEAN_SEA_LEVEL = eINSTANCE.getGPSReading_MeanSeaLevel();

		/**
		 * The meta object literal for the '<em><b>Check Sum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GPS_READING__CHECK_SUM = eINSTANCE.getGPSReading_CheckSum();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.sensors.gps.impl.GPSPoseSensorImpl <em>GPS Pose Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.sensors.gps.impl.GPSPoseSensorImpl
		 * @see org.eclipse.symphony.addons.sensors.gps.impl.Symphony__AddonsSensorsGPSPackageImpl#getGPSPoseSensor()
		 * @generated
		 */
		EClass GPS_POSE_SENSOR = eINSTANCE.getGPSPoseSensor();

		/**
		 * The meta object literal for the '<em><b>Gps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GPS_POSE_SENSOR__GPS = eINSTANCE.getGPSPoseSensor_Gps();

		/**
		 * The meta object literal for the '<em><b>Origin Latitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GPS_POSE_SENSOR__ORIGIN_LATITUDE = eINSTANCE.getGPSPoseSensor_OriginLatitude();

		/**
		 * The meta object literal for the '<em><b>Origin Longitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GPS_POSE_SENSOR__ORIGIN_LONGITUDE = eINSTANCE.getGPSPoseSensor_OriginLongitude();

		/**
		 * The meta object literal for the '<em><b>Ne Angle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GPS_POSE_SENSOR__NE_ANGLE = eINSTANCE.getGPSPoseSensor_NeAngle();

		/**
		 * The meta object literal for the '<em><b>Origin Elevation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GPS_POSE_SENSOR__ORIGIN_ELEVATION = eINSTANCE.getGPSPoseSensor_OriginElevation();

		/**
		 * The meta object literal for the '<em><b>Max Init Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GPS_POSE_SENSOR__MAX_INIT_TIME = eINSTANCE.getGPSPoseSensor_MaxInitTime();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.sensors.gps.impl.GPSImpl <em>GPS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.sensors.gps.impl.GPSImpl
		 * @see org.eclipse.symphony.addons.sensors.gps.impl.Symphony__AddonsSensorsGPSPackageImpl#getGPS()
		 * @generated
		 */
		EClass GPS = eINSTANCE.getGPS();

		/**
		 * The meta object literal for the '<em><b>Connection</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GPS__CONNECTION = eINSTANCE.getGPS_Connection();

		/**
		 * The meta object literal for the '<em><b>Data Interpreter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GPS__DATA_INTERPRETER = eINSTANCE.getGPS_DataInterpreter();

		/**
		 * The meta object literal for the '<em><b>Reading</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GPS__READING = eINSTANCE.getGPS_Reading();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GPS__STATUS = eINSTANCE.getGPS_Status();

		/**
		 * The meta object literal for the '<em><b>Update Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GPS__UPDATE_RATE = eINSTANCE.getGPS_UpdateRate();

		/**
		 * The meta object literal for the '<em><b>Last Failure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GPS__LAST_FAILURE = eINSTANCE.getGPS_LastFailure();

		/**
		 * The meta object literal for the '<em><b>Max Reconnect Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GPS__MAX_RECONNECT_TIME = eINSTANCE.getGPS_MaxReconnectTime();

		/**
		 * The meta object literal for the '<em><b>Speed Knots</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GPS__SPEED_KNOTS = eINSTANCE.getGPS_SpeedKnots();

		/**
		 * The meta object literal for the '<em><b>Speed Kmh</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GPS__SPEED_KMH = eINSTANCE.getGPS_SpeedKmh();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GPS___START = eINSTANCE.getGPS__Start();

		/**
		 * The meta object literal for the '<em><b>Stop</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GPS___STOP = eINSTANCE.getGPS__Stop();

		/**
		 * The meta object literal for the '<em><b>Reset</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GPS___RESET = eINSTANCE.getGPS__Reset();

		/**
		 * The meta object literal for the '<em><b>Reconnect</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GPS___RECONNECT = eINSTANCE.getGPS__Reconnect();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.sensors.gps.impl.MarkedGPSImpl <em>Marked GPS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.sensors.gps.impl.MarkedGPSImpl
		 * @see org.eclipse.symphony.addons.sensors.gps.impl.Symphony__AddonsSensorsGPSPackageImpl#getMarkedGPS()
		 * @generated
		 */
		EClass MARKED_GPS = eINSTANCE.getMarkedGPS();

		/**
		 * The meta object literal for the '<em><b>Marker</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKED_GPS__MARKER = eINSTANCE.getMarkedGPS_Marker();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.sensors.gps.GPSRepository <em>GPS Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.sensors.gps.GPSRepository
		 * @see org.eclipse.symphony.addons.sensors.gps.impl.Symphony__AddonsSensorsGPSPackageImpl#getGPSRepository()
		 * @generated
		 */
		EClass GPS_REPOSITORY = eINSTANCE.getGPSRepository();

		/**
		 * The meta object literal for the '<em><b>Gps Devices</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GPS_REPOSITORY__GPS_DEVICES = eINSTANCE.getGPSRepository_GpsDevices();

		/**
		 * The meta object literal for the '<em><b>Scan For Devices</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GPS_REPOSITORY___SCAN_FOR_DEVICES = eINSTANCE.getGPSRepository__ScanForDevices();

		/**
		 * The meta object literal for the '<em><b>Get GPS By Id</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GPS_REPOSITORY___GET_GPS_BY_ID__STRING = eINSTANCE.getGPSRepository__GetGPSById__String();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.sensors.gps.impl.Symphony__AddonsSensorsGPSFacadeImpl <em>Facade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.sensors.gps.impl.Symphony__AddonsSensorsGPSFacadeImpl
		 * @see org.eclipse.symphony.addons.sensors.gps.impl.Symphony__AddonsSensorsGPSPackageImpl#getSymphony__AddonsSensorsGPSFacade()
		 * @generated
		 */
		EClass SYMPHONY_ADDONS_SENSORS_GPS_FACADE = eINSTANCE.getSymphony__AddonsSensorsGPSFacade();

		/**
		 * The meta object literal for the '<em><b>Create GPS Pose Sensor</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMPHONY_ADDONS_SENSORS_GPS_FACADE___CREATE_GPS_POSE_SENSOR__DOUBLE_DOUBLE = eINSTANCE.getSymphony__AddonsSensorsGPSFacade__CreateGPSPoseSensor__double_double();

		/**
		 * The meta object literal for the '<em><b>Create Marked GPS</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMPHONY_ADDONS_SENSORS_GPS_FACADE___CREATE_MARKED_GPS__POSITIONMARKER = eINSTANCE.getSymphony__AddonsSensorsGPSFacade__CreateMarkedGPS__PositionMarker();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.sensors.gps.GPSStatus <em>GPS Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.sensors.gps.GPSStatus
		 * @see org.eclipse.symphony.addons.sensors.gps.impl.Symphony__AddonsSensorsGPSPackageImpl#getGPSStatus()
		 * @generated
		 */
		EEnum GPS_STATUS = eINSTANCE.getGPSStatus();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.sensors.gps.GPSQuality <em>GPS Quality</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.sensors.gps.GPSQuality
		 * @see org.eclipse.symphony.addons.sensors.gps.impl.Symphony__AddonsSensorsGPSPackageImpl#getGPSQuality()
		 * @generated
		 */
		EEnum GPS_QUALITY = eINSTANCE.getGPSQuality();

		/**
		 * The meta object literal for the '<em>Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Exception
		 * @see org.eclipse.symphony.addons.sensors.gps.impl.Symphony__AddonsSensorsGPSPackageImpl#getException()
		 * @generated
		 */
		EDataType EXCEPTION = eINSTANCE.getException();

		/**
		 * The meta object literal for the '<em>IO Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.io.IOException
		 * @see org.eclipse.symphony.addons.sensors.gps.impl.Symphony__AddonsSensorsGPSPackageImpl#getIOException()
		 * @generated
		 */
		EDataType IO_EXCEPTION = eINSTANCE.getIOException();

		/**
		 * The meta object literal for the '<em>Input Stream</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.io.InputStream
		 * @see org.eclipse.symphony.addons.sensors.gps.impl.Symphony__AddonsSensorsGPSPackageImpl#getInputStream()
		 * @generated
		 */
		EDataType INPUT_STREAM = eINSTANCE.getInputStream();

		/**
		 * The meta object literal for the '<em>Output Stream</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.io.OutputStream
		 * @see org.eclipse.symphony.addons.sensors.gps.impl.Symphony__AddonsSensorsGPSPackageImpl#getOutputStream()
		 * @generated
		 */
		EDataType OUTPUT_STREAM = eINSTANCE.getOutputStream();

		/**
		 * The meta object literal for the '<em>Date</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Date
		 * @see org.eclipse.symphony.addons.sensors.gps.impl.Symphony__AddonsSensorsGPSPackageImpl#getDate()
		 * @generated
		 */
		EDataType DATE = eINSTANCE.getDate();

	}

} //Symphony__AddonsSensorsGPSPackage
