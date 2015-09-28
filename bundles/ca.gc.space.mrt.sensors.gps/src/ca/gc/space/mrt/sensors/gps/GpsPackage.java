/**
 * <copyright>
 * </copyright>
 *
 * $Id: GpsPackage.java,v 1.5.4.2 2015/05/21 15:49:51 pallard Exp $
 */
package ca.gc.space.mrt.sensors.gps;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import ca.gc.space.mrt.sensors.pose.PosePackage;

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
 * @see ca.gc.space.mrt.sensors.gps.GpsFactory
 * @model kind="package"
 * @generated
 */
public interface GpsPackage extends EPackage {
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
	String eNS_URI = "http:///ca/gc/space/mrt/sensors/gps.ecore";

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
	GpsPackage eINSTANCE = ca.gc.space.mrt.sensors.gps.impl.GpsPackageImpl.init();

	/**
	 * The meta object id for the '{@link ca.gc.space.mrt.sensors.gps.impl.GPSImpl <em>GPS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.space.mrt.sensors.gps.impl.GPSImpl
	 * @see ca.gc.space.mrt.sensors.gps.impl.GpsPackageImpl#getGPS()
	 * @generated
	 */
	int GPS = 0;

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
	 * The meta object id for the '{@link ca.gc.space.mrt.sensors.gps.GPSConnection <em>GPS Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.space.mrt.sensors.gps.GPSConnection
	 * @see ca.gc.space.mrt.sensors.gps.impl.GpsPackageImpl#getGPSConnection()
	 * @generated
	 */
	int GPS_CONNECTION = 1;

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
	 * The meta object id for the '{@link ca.gc.space.mrt.sensors.gps.GPSDataInterpreter <em>GPS Data Interpreter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.space.mrt.sensors.gps.GPSDataInterpreter
	 * @see ca.gc.space.mrt.sensors.gps.impl.GpsPackageImpl#getGPSDataInterpreter()
	 * @generated
	 */
	int GPS_DATA_INTERPRETER = 2;

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
	 * The meta object id for the '{@link ca.gc.space.mrt.sensors.gps.impl.GPSReadingImpl <em>GPS Reading</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.space.mrt.sensors.gps.impl.GPSReadingImpl
	 * @see ca.gc.space.mrt.sensors.gps.impl.GpsPackageImpl#getGPSReading()
	 * @generated
	 */
	int GPS_READING = 3;

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
	 * The meta object id for the '{@link ca.gc.space.mrt.sensors.gps.impl.GPSPoseSensorImpl <em>GPS Pose Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.space.mrt.sensors.gps.impl.GPSPoseSensorImpl
	 * @see ca.gc.space.mrt.sensors.gps.impl.GpsPackageImpl#getGPSPoseSensor()
	 * @generated
	 */
	int GPS_POSE_SENSOR = 4;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_POSE_SENSOR__PARENT = PosePackage.POSE_SENSOR__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_POSE_SENSOR__DESCRIPTION = PosePackage.POSE_SENSOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_POSE_SENSOR__NODE_ID = PosePackage.POSE_SENSOR__NODE_ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_POSE_SENSOR__CHILDREN = PosePackage.POSE_SENSOR__CHILDREN;

	/**
	 * The feature id for the '<em><b>Aggregated Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_POSE_SENSOR__AGGREGATED_CHILDREN = PosePackage.POSE_SENSOR__AGGREGATED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_POSE_SENSOR__POSITION = PosePackage.POSE_SENSOR__POSITION;

	/**
	 * The feature id for the '<em><b>Rotation Matrix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_POSE_SENSOR__ROTATION_MATRIX = PosePackage.POSE_SENSOR__ROTATION_MATRIX;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_POSE_SENSOR__STATUS = PosePackage.POSE_SENSOR__STATUS;

	/**
	 * The feature id for the '<em><b>Position Coordinates</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_POSE_SENSOR__POSITION_COORDINATES = PosePackage.POSE_SENSOR__POSITION_COORDINATES;

	/**
	 * The feature id for the '<em><b>Orientation Coordinates</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_POSE_SENSOR__ORIENTATION_COORDINATES = PosePackage.POSE_SENSOR__ORIENTATION_COORDINATES;

	/**
	 * The feature id for the '<em><b>Pose</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_POSE_SENSOR__POSE = PosePackage.POSE_SENSOR__POSE;

	/**
	 * The feature id for the '<em><b>Data Logger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_POSE_SENSOR__DATA_LOGGER = PosePackage.POSE_SENSOR__DATA_LOGGER;

	/**
	 * The feature id for the '<em><b>Started</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_POSE_SENSOR__STARTED = PosePackage.POSE_SENSOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Server Job</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_POSE_SENSOR__SERVER_JOB = PosePackage.POSE_SENSOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Gps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_POSE_SENSOR__GPS = PosePackage.POSE_SENSOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Origin Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_POSE_SENSOR__ORIGIN_LATITUDE = PosePackage.POSE_SENSOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Origin Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_POSE_SENSOR__ORIGIN_LONGITUDE = PosePackage.POSE_SENSOR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Ne Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_POSE_SENSOR__NE_ANGLE = PosePackage.POSE_SENSOR_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Origin Elevation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_POSE_SENSOR__ORIGIN_ELEVATION = PosePackage.POSE_SENSOR_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Max Init Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_POSE_SENSOR__MAX_INIT_TIME = PosePackage.POSE_SENSOR_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>GPS Pose Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_POSE_SENSOR_FEATURE_COUNT = PosePackage.POSE_SENSOR_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link ca.gc.space.mrt.sensors.gps.impl.GPSFacadeImpl <em>GPS Facade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.space.mrt.sensors.gps.impl.GPSFacadeImpl
	 * @see ca.gc.space.mrt.sensors.gps.impl.GpsPackageImpl#getGPSFacade()
	 * @generated
	 */
	int GPS_FACADE = 5;

	/**
	 * The number of structural features of the '<em>GPS Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_FACADE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.gc.space.mrt.sensors.gps.impl.MarkedGPSImpl <em>Marked GPS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.space.mrt.sensors.gps.impl.MarkedGPSImpl
	 * @see ca.gc.space.mrt.sensors.gps.impl.GpsPackageImpl#getMarkedGPS()
	 * @generated
	 */
	int MARKED_GPS = 6;

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
	 * The meta object id for the '{@link ca.gc.space.mrt.sensors.gps.GPSRepository <em>GPS Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.space.mrt.sensors.gps.GPSRepository
	 * @see ca.gc.space.mrt.sensors.gps.impl.GpsPackageImpl#getGPSRepository()
	 * @generated
	 */
	int GPS_REPOSITORY = 7;

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
	 * The meta object id for the '{@link ca.gc.space.mrt.sensors.gps.GPS_QUALITY <em>GPS QUALITY</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.space.mrt.sensors.gps.GPS_QUALITY
	 * @see ca.gc.space.mrt.sensors.gps.impl.GpsPackageImpl#getGPS_QUALITY()
	 * @generated
	 */
	int GPS_QUALITY = 8;

	/**
	 * The meta object id for the '{@link ca.gc.space.mrt.sensors.gps.GPS_STATUS <em>GPS STATUS</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.space.mrt.sensors.gps.GPS_STATUS
	 * @see ca.gc.space.mrt.sensors.gps.impl.GpsPackageImpl#getGPS_STATUS()
	 * @generated
	 */
	int GPS_STATUS = 9;

	/**
	 * Returns the meta object for class '{@link ca.gc.space.mrt.sensors.gps.GPS <em>GPS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GPS</em>'.
	 * @see ca.gc.space.mrt.sensors.gps.GPS
	 * @generated
	 */
	EClass getGPS();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.space.mrt.sensors.gps.GPS#getConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connection</em>'.
	 * @see ca.gc.space.mrt.sensors.gps.GPS#getConnection()
	 * @see #getGPS()
	 * @generated
	 */
	EReference getGPS_Connection();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.space.mrt.sensors.gps.GPS#getDataInterpreter <em>Data Interpreter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Interpreter</em>'.
	 * @see ca.gc.space.mrt.sensors.gps.GPS#getDataInterpreter()
	 * @see #getGPS()
	 * @generated
	 */
	EReference getGPS_DataInterpreter();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.space.mrt.sensors.gps.GPS#getReading <em>Reading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reading</em>'.
	 * @see ca.gc.space.mrt.sensors.gps.GPS#getReading()
	 * @see #getGPS()
	 * @generated
	 */
	EReference getGPS_Reading();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.mrt.sensors.gps.GPS#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see ca.gc.space.mrt.sensors.gps.GPS#getStatus()
	 * @see #getGPS()
	 * @generated
	 */
	EAttribute getGPS_Status();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.mrt.sensors.gps.GPS#getUpdateRate <em>Update Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Update Rate</em>'.
	 * @see ca.gc.space.mrt.sensors.gps.GPS#getUpdateRate()
	 * @see #getGPS()
	 * @generated
	 */
	EAttribute getGPS_UpdateRate();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.mrt.sensors.gps.GPS#getLastFailure <em>Last Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Failure</em>'.
	 * @see ca.gc.space.mrt.sensors.gps.GPS#getLastFailure()
	 * @see #getGPS()
	 * @generated
	 */
	EAttribute getGPS_LastFailure();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.mrt.sensors.gps.GPS#getMaxReconnectTime <em>Max Reconnect Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Reconnect Time</em>'.
	 * @see ca.gc.space.mrt.sensors.gps.GPS#getMaxReconnectTime()
	 * @see #getGPS()
	 * @generated
	 */
	EAttribute getGPS_MaxReconnectTime();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.mrt.sensors.gps.GPS#getSpeedKnots <em>Speed Knots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed Knots</em>'.
	 * @see ca.gc.space.mrt.sensors.gps.GPS#getSpeedKnots()
	 * @see #getGPS()
	 * @generated
	 */
	EAttribute getGPS_SpeedKnots();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.mrt.sensors.gps.GPS#getSpeedKmh <em>Speed Kmh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed Kmh</em>'.
	 * @see ca.gc.space.mrt.sensors.gps.GPS#getSpeedKmh()
	 * @see #getGPS()
	 * @generated
	 */
	EAttribute getGPS_SpeedKmh();

	/**
	 * Returns the meta object for class '{@link ca.gc.space.mrt.sensors.gps.GPSConnection <em>GPS Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GPS Connection</em>'.
	 * @see ca.gc.space.mrt.sensors.gps.GPSConnection
	 * @generated
	 */
	EClass getGPSConnection();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.mrt.sensors.gps.GPSConnection#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input</em>'.
	 * @see ca.gc.space.mrt.sensors.gps.GPSConnection#getInput()
	 * @see #getGPSConnection()
	 * @generated
	 */
	EAttribute getGPSConnection_Input();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.mrt.sensors.gps.GPSConnection#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output</em>'.
	 * @see ca.gc.space.mrt.sensors.gps.GPSConnection#getOutput()
	 * @see #getGPSConnection()
	 * @generated
	 */
	EAttribute getGPSConnection_Output();

	/**
	 * Returns the meta object for class '{@link ca.gc.space.mrt.sensors.gps.GPSDataInterpreter <em>GPS Data Interpreter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GPS Data Interpreter</em>'.
	 * @see ca.gc.space.mrt.sensors.gps.GPSDataInterpreter
	 * @generated
	 */
	EClass getGPSDataInterpreter();

	/**
	 * Returns the meta object for the container reference '{@link ca.gc.space.mrt.sensors.gps.GPSDataInterpreter#getGps <em>Gps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Gps</em>'.
	 * @see ca.gc.space.mrt.sensors.gps.GPSDataInterpreter#getGps()
	 * @see #getGPSDataInterpreter()
	 * @generated
	 */
	EReference getGPSDataInterpreter_Gps();

	/**
	 * Returns the meta object for class '{@link ca.gc.space.mrt.sensors.gps.GPSReading <em>GPS Reading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GPS Reading</em>'.
	 * @see ca.gc.space.mrt.sensors.gps.GPSReading
	 * @generated
	 */
	EClass getGPSReading();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.mrt.sensors.gps.GPSReading#getLatitude <em>Latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latitude</em>'.
	 * @see ca.gc.space.mrt.sensors.gps.GPSReading#getLatitude()
	 * @see #getGPSReading()
	 * @generated
	 */
	EAttribute getGPSReading_Latitude();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.mrt.sensors.gps.GPSReading#getLongitude <em>Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Longitude</em>'.
	 * @see ca.gc.space.mrt.sensors.gps.GPSReading#getLongitude()
	 * @see #getGPSReading()
	 * @generated
	 */
	EAttribute getGPSReading_Longitude();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.mrt.sensors.gps.GPSReading#getElevation <em>Elevation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Elevation</em>'.
	 * @see ca.gc.space.mrt.sensors.gps.GPSReading#getElevation()
	 * @see #getGPSReading()
	 * @generated
	 */
	EAttribute getGPSReading_Elevation();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.mrt.sensors.gps.GPSReading#getQuality <em>Quality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quality</em>'.
	 * @see ca.gc.space.mrt.sensors.gps.GPSReading#getQuality()
	 * @see #getGPSReading()
	 * @generated
	 */
	EAttribute getGPSReading_Quality();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.mrt.sensors.gps.GPSReading#getTimeStamp <em>Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Stamp</em>'.
	 * @see ca.gc.space.mrt.sensors.gps.GPSReading#getTimeStamp()
	 * @see #getGPSReading()
	 * @generated
	 */
	EAttribute getGPSReading_TimeStamp();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.mrt.sensors.gps.GPSReading#getNumberOfSatellites <em>Number Of Satellites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Satellites</em>'.
	 * @see ca.gc.space.mrt.sensors.gps.GPSReading#getNumberOfSatellites()
	 * @see #getGPSReading()
	 * @generated
	 */
	EAttribute getGPSReading_NumberOfSatellites();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.mrt.sensors.gps.GPSReading#getHorizontalDilutionPos <em>Horizontal Dilution Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horizontal Dilution Pos</em>'.
	 * @see ca.gc.space.mrt.sensors.gps.GPSReading#getHorizontalDilutionPos()
	 * @see #getGPSReading()
	 * @generated
	 */
	EAttribute getGPSReading_HorizontalDilutionPos();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.mrt.sensors.gps.GPSReading#getMeanSeaLevel <em>Mean Sea Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mean Sea Level</em>'.
	 * @see ca.gc.space.mrt.sensors.gps.GPSReading#getMeanSeaLevel()
	 * @see #getGPSReading()
	 * @generated
	 */
	EAttribute getGPSReading_MeanSeaLevel();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.mrt.sensors.gps.GPSReading#getCheckSum <em>Check Sum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check Sum</em>'.
	 * @see ca.gc.space.mrt.sensors.gps.GPSReading#getCheckSum()
	 * @see #getGPSReading()
	 * @generated
	 */
	EAttribute getGPSReading_CheckSum();

	/**
	 * Returns the meta object for class '{@link ca.gc.space.mrt.sensors.gps.GPSPoseSensor <em>GPS Pose Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GPS Pose Sensor</em>'.
	 * @see ca.gc.space.mrt.sensors.gps.GPSPoseSensor
	 * @generated
	 */
	EClass getGPSPoseSensor();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.gc.space.mrt.sensors.gps.GPSPoseSensor#getGps <em>Gps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gps</em>'.
	 * @see ca.gc.space.mrt.sensors.gps.GPSPoseSensor#getGps()
	 * @see #getGPSPoseSensor()
	 * @generated
	 */
	EReference getGPSPoseSensor_Gps();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.mrt.sensors.gps.GPSPoseSensor#getOriginLatitude <em>Origin Latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Origin Latitude</em>'.
	 * @see ca.gc.space.mrt.sensors.gps.GPSPoseSensor#getOriginLatitude()
	 * @see #getGPSPoseSensor()
	 * @generated
	 */
	EAttribute getGPSPoseSensor_OriginLatitude();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.mrt.sensors.gps.GPSPoseSensor#getOriginLongitude <em>Origin Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Origin Longitude</em>'.
	 * @see ca.gc.space.mrt.sensors.gps.GPSPoseSensor#getOriginLongitude()
	 * @see #getGPSPoseSensor()
	 * @generated
	 */
	EAttribute getGPSPoseSensor_OriginLongitude();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.mrt.sensors.gps.GPSPoseSensor#getNeAngle <em>Ne Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ne Angle</em>'.
	 * @see ca.gc.space.mrt.sensors.gps.GPSPoseSensor#getNeAngle()
	 * @see #getGPSPoseSensor()
	 * @generated
	 */
	EAttribute getGPSPoseSensor_NeAngle();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.mrt.sensors.gps.GPSPoseSensor#getOriginElevation <em>Origin Elevation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Origin Elevation</em>'.
	 * @see ca.gc.space.mrt.sensors.gps.GPSPoseSensor#getOriginElevation()
	 * @see #getGPSPoseSensor()
	 * @generated
	 */
	EAttribute getGPSPoseSensor_OriginElevation();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.mrt.sensors.gps.GPSPoseSensor#getMaxInitTime <em>Max Init Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Init Time</em>'.
	 * @see ca.gc.space.mrt.sensors.gps.GPSPoseSensor#getMaxInitTime()
	 * @see #getGPSPoseSensor()
	 * @generated
	 */
	EAttribute getGPSPoseSensor_MaxInitTime();

	/**
	 * Returns the meta object for class '{@link ca.gc.space.mrt.sensors.gps.GPSFacade <em>GPS Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GPS Facade</em>'.
	 * @see ca.gc.space.mrt.sensors.gps.GPSFacade
	 * @generated
	 */
	EClass getGPSFacade();

	/**
	 * Returns the meta object for class '{@link ca.gc.space.mrt.sensors.gps.MarkedGPS <em>Marked GPS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Marked GPS</em>'.
	 * @see ca.gc.space.mrt.sensors.gps.MarkedGPS
	 * @generated
	 */
	EClass getMarkedGPS();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.space.mrt.sensors.gps.MarkedGPS#getMarker <em>Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Marker</em>'.
	 * @see ca.gc.space.mrt.sensors.gps.MarkedGPS#getMarker()
	 * @see #getMarkedGPS()
	 * @generated
	 */
	EReference getMarkedGPS_Marker();

	/**
	 * Returns the meta object for class '{@link ca.gc.space.mrt.sensors.gps.GPSRepository <em>GPS Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GPS Repository</em>'.
	 * @see ca.gc.space.mrt.sensors.gps.GPSRepository
	 * @generated
	 */
	EClass getGPSRepository();

	/**
	 * Returns the meta object for the reference list '{@link ca.gc.space.mrt.sensors.gps.GPSRepository#getGpsDevices <em>Gps Devices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gps Devices</em>'.
	 * @see ca.gc.space.mrt.sensors.gps.GPSRepository#getGpsDevices()
	 * @see #getGPSRepository()
	 * @generated
	 */
	EReference getGPSRepository_GpsDevices();

	/**
	 * Returns the meta object for enum '{@link ca.gc.space.mrt.sensors.gps.GPS_QUALITY <em>GPS QUALITY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GPS QUALITY</em>'.
	 * @see ca.gc.space.mrt.sensors.gps.GPS_QUALITY
	 * @generated
	 */
	EEnum getGPS_QUALITY();

	/**
	 * Returns the meta object for enum '{@link ca.gc.space.mrt.sensors.gps.GPS_STATUS <em>GPS STATUS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GPS STATUS</em>'.
	 * @see ca.gc.space.mrt.sensors.gps.GPS_STATUS
	 * @generated
	 */
	EEnum getGPS_STATUS();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GpsFactory getGpsFactory();

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
		 * The meta object literal for the '{@link ca.gc.space.mrt.sensors.gps.impl.GPSImpl <em>GPS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.space.mrt.sensors.gps.impl.GPSImpl
		 * @see ca.gc.space.mrt.sensors.gps.impl.GpsPackageImpl#getGPS()
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
		 * The meta object literal for the '{@link ca.gc.space.mrt.sensors.gps.GPSConnection <em>GPS Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.space.mrt.sensors.gps.GPSConnection
		 * @see ca.gc.space.mrt.sensors.gps.impl.GpsPackageImpl#getGPSConnection()
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
		 * The meta object literal for the '{@link ca.gc.space.mrt.sensors.gps.GPSDataInterpreter <em>GPS Data Interpreter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.space.mrt.sensors.gps.GPSDataInterpreter
		 * @see ca.gc.space.mrt.sensors.gps.impl.GpsPackageImpl#getGPSDataInterpreter()
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
		 * The meta object literal for the '{@link ca.gc.space.mrt.sensors.gps.impl.GPSReadingImpl <em>GPS Reading</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.space.mrt.sensors.gps.impl.GPSReadingImpl
		 * @see ca.gc.space.mrt.sensors.gps.impl.GpsPackageImpl#getGPSReading()
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
		 * The meta object literal for the '{@link ca.gc.space.mrt.sensors.gps.impl.GPSPoseSensorImpl <em>GPS Pose Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.space.mrt.sensors.gps.impl.GPSPoseSensorImpl
		 * @see ca.gc.space.mrt.sensors.gps.impl.GpsPackageImpl#getGPSPoseSensor()
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
		 * The meta object literal for the '{@link ca.gc.space.mrt.sensors.gps.impl.GPSFacadeImpl <em>GPS Facade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.space.mrt.sensors.gps.impl.GPSFacadeImpl
		 * @see ca.gc.space.mrt.sensors.gps.impl.GpsPackageImpl#getGPSFacade()
		 * @generated
		 */
		EClass GPS_FACADE = eINSTANCE.getGPSFacade();

		/**
		 * The meta object literal for the '{@link ca.gc.space.mrt.sensors.gps.impl.MarkedGPSImpl <em>Marked GPS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.space.mrt.sensors.gps.impl.MarkedGPSImpl
		 * @see ca.gc.space.mrt.sensors.gps.impl.GpsPackageImpl#getMarkedGPS()
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
		 * The meta object literal for the '{@link ca.gc.space.mrt.sensors.gps.GPSRepository <em>GPS Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.space.mrt.sensors.gps.GPSRepository
		 * @see ca.gc.space.mrt.sensors.gps.impl.GpsPackageImpl#getGPSRepository()
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
		 * The meta object literal for the '{@link ca.gc.space.mrt.sensors.gps.GPS_QUALITY <em>GPS QUALITY</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.space.mrt.sensors.gps.GPS_QUALITY
		 * @see ca.gc.space.mrt.sensors.gps.impl.GpsPackageImpl#getGPS_QUALITY()
		 * @generated
		 */
		EEnum GPS_QUALITY = eINSTANCE.getGPS_QUALITY();

		/**
		 * The meta object literal for the '{@link ca.gc.space.mrt.sensors.gps.GPS_STATUS <em>GPS STATUS</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.space.mrt.sensors.gps.GPS_STATUS
		 * @see ca.gc.space.mrt.sensors.gps.impl.GpsPackageImpl#getGPS_STATUS()
		 * @generated
		 */
		EEnum GPS_STATUS = eINSTANCE.getGPS_STATUS();

	}

} //GpsPackage
