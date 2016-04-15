package ca.gc.asc_csa.apogy.addons.sensors.gps;
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
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import ca.gc.asc_csa.apogy.addons.sensors.pose.ApogyAddonsSensorsPosePackage;

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
 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.ApogyAddonsSensorsGPSFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='ApogyAddonsSensorsGPS' childCreationExtenders='true' extensibleProviderFactory='true' multipleEditorPages='false' copyrightText='Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Pierre Allard (Pierre.Allard@canada.ca), \n    Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n    Sebastien Gemme (Sebastien.Gemme@canada.ca),\n    Canadian Space Agency (CSA) - Initial API and implementation' modelName='ApogyAddonsSensorsGPS' suppressGenModelAnnotations='false' dynamicTemplates='true' templateDirectory='platform:/plugin/ca.gc.asc_csa.apogy.common.emf.templates' modelDirectory='/ca.gc.asc_csa.apogy.addons.sensors.gps/src-generated' editDirectory='/ca.gc.asc_csa.apogy.addons.sensors.gps.edit/src-generated' basePackage='ca.gc.asc_csa.apogy.addons.sensors'"
 * @generated
 */
public interface ApogyAddonsSensorsGPSPackage extends EPackage {
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
	String eNS_URI = "ca.gc.asc_csa.apogy.addons.sensors.gps";

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
	ApogyAddonsSensorsGPSPackage eINSTANCE = ca.gc.asc_csa.apogy.addons.sensors.gps.impl.ApogyAddonsSensorsGPSPackageImpl.init();

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.addons.sensors.gps.GPSConnection <em>GPS Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.GPSConnection
	 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.impl.ApogyAddonsSensorsGPSPackageImpl#getGPSConnection()
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
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.addons.sensors.gps.GPSDataInterpreter <em>GPS Data Interpreter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.GPSDataInterpreter
	 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.impl.ApogyAddonsSensorsGPSPackageImpl#getGPSDataInterpreter()
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
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.addons.sensors.gps.impl.GPSReadingImpl <em>GPS Reading</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.impl.GPSReadingImpl
	 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.impl.ApogyAddonsSensorsGPSPackageImpl#getGPSReading()
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
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.addons.sensors.gps.impl.GPSPoseSensorImpl <em>GPS Pose Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.impl.GPSPoseSensorImpl
	 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.impl.ApogyAddonsSensorsGPSPackageImpl#getGPSPoseSensor()
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
	int GPS_POSE_SENSOR__PARENT = ApogyAddonsSensorsPosePackage.POSE_SENSOR__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_POSE_SENSOR__DESCRIPTION = ApogyAddonsSensorsPosePackage.POSE_SENSOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_POSE_SENSOR__NODE_ID = ApogyAddonsSensorsPosePackage.POSE_SENSOR__NODE_ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_POSE_SENSOR__CHILDREN = ApogyAddonsSensorsPosePackage.POSE_SENSOR__CHILDREN;

	/**
	 * The feature id for the '<em><b>Aggregated Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_POSE_SENSOR__AGGREGATED_CHILDREN = ApogyAddonsSensorsPosePackage.POSE_SENSOR__AGGREGATED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_POSE_SENSOR__POSITION = ApogyAddonsSensorsPosePackage.POSE_SENSOR__POSITION;

	/**
	 * The feature id for the '<em><b>Rotation Matrix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_POSE_SENSOR__ROTATION_MATRIX = ApogyAddonsSensorsPosePackage.POSE_SENSOR__ROTATION_MATRIX;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_POSE_SENSOR__STATUS = ApogyAddonsSensorsPosePackage.POSE_SENSOR__STATUS;

	/**
	 * The feature id for the '<em><b>Position Coordinates</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_POSE_SENSOR__POSITION_COORDINATES = ApogyAddonsSensorsPosePackage.POSE_SENSOR__POSITION_COORDINATES;

	/**
	 * The feature id for the '<em><b>Orientation Coordinates</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_POSE_SENSOR__ORIENTATION_COORDINATES = ApogyAddonsSensorsPosePackage.POSE_SENSOR__ORIENTATION_COORDINATES;

	/**
	 * The feature id for the '<em><b>Pose</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_POSE_SENSOR__POSE = ApogyAddonsSensorsPosePackage.POSE_SENSOR__POSE;

	/**
	 * The feature id for the '<em><b>Data Logger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_POSE_SENSOR__DATA_LOGGER = ApogyAddonsSensorsPosePackage.POSE_SENSOR__DATA_LOGGER;

	/**
	 * The feature id for the '<em><b>Started</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_POSE_SENSOR__STARTED = ApogyAddonsSensorsPosePackage.POSE_SENSOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Server Job</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_POSE_SENSOR__SERVER_JOB = ApogyAddonsSensorsPosePackage.POSE_SENSOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Gps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_POSE_SENSOR__GPS = ApogyAddonsSensorsPosePackage.POSE_SENSOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Origin Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_POSE_SENSOR__ORIGIN_LATITUDE = ApogyAddonsSensorsPosePackage.POSE_SENSOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Origin Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_POSE_SENSOR__ORIGIN_LONGITUDE = ApogyAddonsSensorsPosePackage.POSE_SENSOR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Ne Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_POSE_SENSOR__NE_ANGLE = ApogyAddonsSensorsPosePackage.POSE_SENSOR_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Origin Elevation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_POSE_SENSOR__ORIGIN_ELEVATION = ApogyAddonsSensorsPosePackage.POSE_SENSOR_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Max Init Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_POSE_SENSOR__MAX_INIT_TIME = ApogyAddonsSensorsPosePackage.POSE_SENSOR_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>GPS Pose Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_POSE_SENSOR_FEATURE_COUNT = ApogyAddonsSensorsPosePackage.POSE_SENSOR_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_POSE_SENSOR___ACCEPT__INODEVISITOR = ApogyAddonsSensorsPosePackage.POSE_SENSOR___ACCEPT__INODEVISITOR;

	/**
	 * The operation id for the '<em>As Matrix4d</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_POSE_SENSOR___AS_MATRIX4D = ApogyAddonsSensorsPosePackage.POSE_SENSOR___AS_MATRIX4D;

	/**
	 * The operation id for the '<em>Set Transformation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_POSE_SENSOR___SET_TRANSFORMATION__MATRIX4D = ApogyAddonsSensorsPosePackage.POSE_SENSOR___SET_TRANSFORMATION__MATRIX4D;

	/**
	 * The operation id for the '<em>Reset Position</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_POSE_SENSOR___RESET_POSITION__CARTESIANPOSITIONCOORDINATES = ApogyAddonsSensorsPosePackage.POSE_SENSOR___RESET_POSITION__CARTESIANPOSITIONCOORDINATES;

	/**
	 * The operation id for the '<em>Reset Orientation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_POSE_SENSOR___RESET_ORIENTATION__CARTESIANORIENTATIONCOORDINATES = ApogyAddonsSensorsPosePackage.POSE_SENSOR___RESET_ORIENTATION__CARTESIANORIENTATIONCOORDINATES;

	/**
	 * The operation id for the '<em>Extract Orientation From Matrix</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_POSE_SENSOR___EXTRACT_ORIENTATION_FROM_MATRIX__MATRIX3X3 = ApogyAddonsSensorsPosePackage.POSE_SENSOR___EXTRACT_ORIENTATION_FROM_MATRIX__MATRIX3X3;

	/**
	 * The operation id for the '<em>Reset Pose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_POSE_SENSOR___RESET_POSE__POSE = ApogyAddonsSensorsPosePackage.POSE_SENSOR___RESET_POSE__POSE;

	/**
	 * The number of operations of the '<em>GPS Pose Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_POSE_SENSOR_OPERATION_COUNT = ApogyAddonsSensorsPosePackage.POSE_SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.addons.sensors.gps.impl.GPSImpl <em>GPS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.impl.GPSImpl
	 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.impl.ApogyAddonsSensorsGPSPackageImpl#getGPS()
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
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.addons.sensors.gps.impl.MarkedGPSImpl <em>Marked GPS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.impl.MarkedGPSImpl
	 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.impl.ApogyAddonsSensorsGPSPackageImpl#getMarkedGPS()
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
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.addons.sensors.gps.GPSRepository <em>GPS Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.GPSRepository
	 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.impl.ApogyAddonsSensorsGPSPackageImpl#getGPSRepository()
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
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.addons.sensors.gps.impl.ApogyAddonsSensorsGPSFacadeImpl <em>Facade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.impl.ApogyAddonsSensorsGPSFacadeImpl
	 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.impl.ApogyAddonsSensorsGPSPackageImpl#getApogyAddonsSensorsGPSFacade()
	 * @generated
	 */
	int APOGY_ADDONS_SENSORS_GPS_FACADE = 7;

	/**
	 * The number of structural features of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_ADDONS_SENSORS_GPS_FACADE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Create GPS Pose Sensor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_ADDONS_SENSORS_GPS_FACADE___CREATE_GPS_POSE_SENSOR__DOUBLE_DOUBLE = 0;

	/**
	 * The operation id for the '<em>Create Marked GPS</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_ADDONS_SENSORS_GPS_FACADE___CREATE_MARKED_GPS__POSITIONMARKER = 1;

	/**
	 * The number of operations of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_ADDONS_SENSORS_GPS_FACADE_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.addons.sensors.gps.GPSStatus <em>GPS Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.GPSStatus
	 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.impl.ApogyAddonsSensorsGPSPackageImpl#getGPSStatus()
	 * @generated
	 */
	int GPS_STATUS = 8;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.addons.sensors.gps.GPSQuality <em>GPS Quality</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.GPSQuality
	 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.impl.ApogyAddonsSensorsGPSPackageImpl#getGPSQuality()
	 * @generated
	 */
	int GPS_QUALITY = 9;

	/**
	 * The meta object id for the '<em>Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Exception
	 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.impl.ApogyAddonsSensorsGPSPackageImpl#getException()
	 * @generated
	 */
	int EXCEPTION = 10;

	/**
	 * The meta object id for the '<em>IO Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.io.IOException
	 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.impl.ApogyAddonsSensorsGPSPackageImpl#getIOException()
	 * @generated
	 */
	int IO_EXCEPTION = 11;

	/**
	 * The meta object id for the '<em>Input Stream</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.io.InputStream
	 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.impl.ApogyAddonsSensorsGPSPackageImpl#getInputStream()
	 * @generated
	 */
	int INPUT_STREAM = 12;

	/**
	 * The meta object id for the '<em>Output Stream</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.io.OutputStream
	 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.impl.ApogyAddonsSensorsGPSPackageImpl#getOutputStream()
	 * @generated
	 */
	int OUTPUT_STREAM = 13;

	/**
	 * The meta object id for the '<em>Date</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Date
	 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.impl.ApogyAddonsSensorsGPSPackageImpl#getDate()
	 * @generated
	 */
	int DATE = 14;


	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.addons.sensors.gps.GPSConnection <em>GPS Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GPS Connection</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.GPSConnection
	 * @generated
	 */
	EClass getGPSConnection();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.sensors.gps.GPSConnection#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.GPSConnection#getInput()
	 * @see #getGPSConnection()
	 * @generated
	 */
	EAttribute getGPSConnection_Input();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.sensors.gps.GPSConnection#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.GPSConnection#getOutput()
	 * @see #getGPSConnection()
	 * @generated
	 */
	EAttribute getGPSConnection_Output();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.sensors.gps.GPSConnection#reset() <em>Reset</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Reset</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.GPSConnection#reset()
	 * @generated
	 */
	EOperation getGPSConnection__Reset();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.addons.sensors.gps.GPSDataInterpreter <em>GPS Data Interpreter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GPS Data Interpreter</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.GPSDataInterpreter
	 * @generated
	 */
	EClass getGPSDataInterpreter();

	/**
	 * Returns the meta object for the container reference '{@link ca.gc.asc_csa.apogy.addons.sensors.gps.GPSDataInterpreter#getGps <em>Gps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Gps</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.GPSDataInterpreter#getGps()
	 * @see #getGPSDataInterpreter()
	 * @generated
	 */
	EReference getGPSDataInterpreter_Gps();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.sensors.gps.GPSDataInterpreter#updateGPS() <em>Update GPS</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update GPS</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.GPSDataInterpreter#updateGPS()
	 * @generated
	 */
	EOperation getGPSDataInterpreter__UpdateGPS();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.addons.sensors.gps.GPSReading <em>GPS Reading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GPS Reading</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.GPSReading
	 * @generated
	 */
	EClass getGPSReading();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.sensors.gps.GPSReading#getLatitude <em>Latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latitude</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.GPSReading#getLatitude()
	 * @see #getGPSReading()
	 * @generated
	 */
	EAttribute getGPSReading_Latitude();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.sensors.gps.GPSReading#getLongitude <em>Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Longitude</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.GPSReading#getLongitude()
	 * @see #getGPSReading()
	 * @generated
	 */
	EAttribute getGPSReading_Longitude();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.sensors.gps.GPSReading#getElevation <em>Elevation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Elevation</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.GPSReading#getElevation()
	 * @see #getGPSReading()
	 * @generated
	 */
	EAttribute getGPSReading_Elevation();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.sensors.gps.GPSReading#getQuality <em>Quality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quality</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.GPSReading#getQuality()
	 * @see #getGPSReading()
	 * @generated
	 */
	EAttribute getGPSReading_Quality();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.sensors.gps.GPSReading#getTimeStamp <em>Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Stamp</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.GPSReading#getTimeStamp()
	 * @see #getGPSReading()
	 * @generated
	 */
	EAttribute getGPSReading_TimeStamp();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.sensors.gps.GPSReading#getNumberOfSatellites <em>Number Of Satellites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Satellites</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.GPSReading#getNumberOfSatellites()
	 * @see #getGPSReading()
	 * @generated
	 */
	EAttribute getGPSReading_NumberOfSatellites();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.sensors.gps.GPSReading#getHorizontalDilutionPos <em>Horizontal Dilution Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horizontal Dilution Pos</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.GPSReading#getHorizontalDilutionPos()
	 * @see #getGPSReading()
	 * @generated
	 */
	EAttribute getGPSReading_HorizontalDilutionPos();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.sensors.gps.GPSReading#getMeanSeaLevel <em>Mean Sea Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mean Sea Level</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.GPSReading#getMeanSeaLevel()
	 * @see #getGPSReading()
	 * @generated
	 */
	EAttribute getGPSReading_MeanSeaLevel();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.sensors.gps.GPSReading#getCheckSum <em>Check Sum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check Sum</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.GPSReading#getCheckSum()
	 * @see #getGPSReading()
	 * @generated
	 */
	EAttribute getGPSReading_CheckSum();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.addons.sensors.gps.GPSPoseSensor <em>GPS Pose Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GPS Pose Sensor</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.GPSPoseSensor
	 * @generated
	 */
	EClass getGPSPoseSensor();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.gc.asc_csa.apogy.addons.sensors.gps.GPSPoseSensor#getGps <em>Gps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gps</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.GPSPoseSensor#getGps()
	 * @see #getGPSPoseSensor()
	 * @generated
	 */
	EReference getGPSPoseSensor_Gps();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.sensors.gps.GPSPoseSensor#getOriginLatitude <em>Origin Latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Origin Latitude</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.GPSPoseSensor#getOriginLatitude()
	 * @see #getGPSPoseSensor()
	 * @generated
	 */
	EAttribute getGPSPoseSensor_OriginLatitude();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.sensors.gps.GPSPoseSensor#getOriginLongitude <em>Origin Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Origin Longitude</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.GPSPoseSensor#getOriginLongitude()
	 * @see #getGPSPoseSensor()
	 * @generated
	 */
	EAttribute getGPSPoseSensor_OriginLongitude();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.sensors.gps.GPSPoseSensor#getNeAngle <em>Ne Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ne Angle</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.GPSPoseSensor#getNeAngle()
	 * @see #getGPSPoseSensor()
	 * @generated
	 */
	EAttribute getGPSPoseSensor_NeAngle();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.sensors.gps.GPSPoseSensor#getOriginElevation <em>Origin Elevation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Origin Elevation</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.GPSPoseSensor#getOriginElevation()
	 * @see #getGPSPoseSensor()
	 * @generated
	 */
	EAttribute getGPSPoseSensor_OriginElevation();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.sensors.gps.GPSPoseSensor#getMaxInitTime <em>Max Init Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Init Time</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.GPSPoseSensor#getMaxInitTime()
	 * @see #getGPSPoseSensor()
	 * @generated
	 */
	EAttribute getGPSPoseSensor_MaxInitTime();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.addons.sensors.gps.GPS <em>GPS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GPS</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.GPS
	 * @generated
	 */
	EClass getGPS();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.addons.sensors.gps.GPS#getConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connection</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.GPS#getConnection()
	 * @see #getGPS()
	 * @generated
	 */
	EReference getGPS_Connection();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.addons.sensors.gps.GPS#getDataInterpreter <em>Data Interpreter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Interpreter</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.GPS#getDataInterpreter()
	 * @see #getGPS()
	 * @generated
	 */
	EReference getGPS_DataInterpreter();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.addons.sensors.gps.GPS#getReading <em>Reading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reading</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.GPS#getReading()
	 * @see #getGPS()
	 * @generated
	 */
	EReference getGPS_Reading();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.sensors.gps.GPS#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.GPS#getStatus()
	 * @see #getGPS()
	 * @generated
	 */
	EAttribute getGPS_Status();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.sensors.gps.GPS#getUpdateRate <em>Update Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Update Rate</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.GPS#getUpdateRate()
	 * @see #getGPS()
	 * @generated
	 */
	EAttribute getGPS_UpdateRate();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.sensors.gps.GPS#getLastFailure <em>Last Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Failure</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.GPS#getLastFailure()
	 * @see #getGPS()
	 * @generated
	 */
	EAttribute getGPS_LastFailure();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.sensors.gps.GPS#getMaxReconnectTime <em>Max Reconnect Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Reconnect Time</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.GPS#getMaxReconnectTime()
	 * @see #getGPS()
	 * @generated
	 */
	EAttribute getGPS_MaxReconnectTime();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.sensors.gps.GPS#getSpeedKnots <em>Speed Knots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed Knots</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.GPS#getSpeedKnots()
	 * @see #getGPS()
	 * @generated
	 */
	EAttribute getGPS_SpeedKnots();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.sensors.gps.GPS#getSpeedKmh <em>Speed Kmh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed Kmh</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.GPS#getSpeedKmh()
	 * @see #getGPS()
	 * @generated
	 */
	EAttribute getGPS_SpeedKmh();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.sensors.gps.GPS#start() <em>Start</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Start</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.GPS#start()
	 * @generated
	 */
	EOperation getGPS__Start();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.sensors.gps.GPS#stop() <em>Stop</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Stop</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.GPS#stop()
	 * @generated
	 */
	EOperation getGPS__Stop();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.sensors.gps.GPS#reset() <em>Reset</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Reset</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.GPS#reset()
	 * @generated
	 */
	EOperation getGPS__Reset();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.sensors.gps.GPS#reconnect() <em>Reconnect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Reconnect</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.GPS#reconnect()
	 * @generated
	 */
	EOperation getGPS__Reconnect();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.addons.sensors.gps.MarkedGPS <em>Marked GPS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Marked GPS</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.MarkedGPS
	 * @generated
	 */
	EClass getMarkedGPS();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.addons.sensors.gps.MarkedGPS#getMarker <em>Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Marker</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.MarkedGPS#getMarker()
	 * @see #getMarkedGPS()
	 * @generated
	 */
	EReference getMarkedGPS_Marker();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.addons.sensors.gps.GPSRepository <em>GPS Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GPS Repository</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.GPSRepository
	 * @generated
	 */
	EClass getGPSRepository();

	/**
	 * Returns the meta object for the reference list '{@link ca.gc.asc_csa.apogy.addons.sensors.gps.GPSRepository#getGpsDevices <em>Gps Devices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gps Devices</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.GPSRepository#getGpsDevices()
	 * @see #getGPSRepository()
	 * @generated
	 */
	EReference getGPSRepository_GpsDevices();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.sensors.gps.GPSRepository#scanForDevices() <em>Scan For Devices</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Scan For Devices</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.GPSRepository#scanForDevices()
	 * @generated
	 */
	EOperation getGPSRepository__ScanForDevices();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.sensors.gps.GPSRepository#getGPSById(java.lang.String) <em>Get GPS By Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get GPS By Id</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.GPSRepository#getGPSById(java.lang.String)
	 * @generated
	 */
	EOperation getGPSRepository__GetGPSById__String();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.addons.sensors.gps.ApogyAddonsSensorsGPSFacade <em>Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facade</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.ApogyAddonsSensorsGPSFacade
	 * @generated
	 */
	EClass getApogyAddonsSensorsGPSFacade();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.sensors.gps.ApogyAddonsSensorsGPSFacade#createGPSPoseSensor(double, double) <em>Create GPS Pose Sensor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create GPS Pose Sensor</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.ApogyAddonsSensorsGPSFacade#createGPSPoseSensor(double, double)
	 * @generated
	 */
	EOperation getApogyAddonsSensorsGPSFacade__CreateGPSPoseSensor__double_double();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.sensors.gps.ApogyAddonsSensorsGPSFacade#createMarkedGPS(ca.gc.asc_csa.apogy.common.geometry.data3d.PositionMarker) <em>Create Marked GPS</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Marked GPS</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.ApogyAddonsSensorsGPSFacade#createMarkedGPS(ca.gc.asc_csa.apogy.common.geometry.data3d.PositionMarker)
	 * @generated
	 */
	EOperation getApogyAddonsSensorsGPSFacade__CreateMarkedGPS__PositionMarker();

	/**
	 * Returns the meta object for enum '{@link ca.gc.asc_csa.apogy.addons.sensors.gps.GPSStatus <em>GPS Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GPS Status</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.GPSStatus
	 * @generated
	 */
	EEnum getGPSStatus();

	/**
	 * Returns the meta object for enum '{@link ca.gc.asc_csa.apogy.addons.sensors.gps.GPSQuality <em>GPS Quality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GPS Quality</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.GPSQuality
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
	ApogyAddonsSensorsGPSFactory getApogyAddonsSensorsGPSFactory();

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
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.addons.sensors.gps.GPSConnection <em>GPS Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.GPSConnection
		 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.impl.ApogyAddonsSensorsGPSPackageImpl#getGPSConnection()
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
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.addons.sensors.gps.GPSDataInterpreter <em>GPS Data Interpreter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.GPSDataInterpreter
		 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.impl.ApogyAddonsSensorsGPSPackageImpl#getGPSDataInterpreter()
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
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.addons.sensors.gps.impl.GPSReadingImpl <em>GPS Reading</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.impl.GPSReadingImpl
		 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.impl.ApogyAddonsSensorsGPSPackageImpl#getGPSReading()
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
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.addons.sensors.gps.impl.GPSPoseSensorImpl <em>GPS Pose Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.impl.GPSPoseSensorImpl
		 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.impl.ApogyAddonsSensorsGPSPackageImpl#getGPSPoseSensor()
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
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.addons.sensors.gps.impl.GPSImpl <em>GPS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.impl.GPSImpl
		 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.impl.ApogyAddonsSensorsGPSPackageImpl#getGPS()
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
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.addons.sensors.gps.impl.MarkedGPSImpl <em>Marked GPS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.impl.MarkedGPSImpl
		 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.impl.ApogyAddonsSensorsGPSPackageImpl#getMarkedGPS()
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
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.addons.sensors.gps.GPSRepository <em>GPS Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.GPSRepository
		 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.impl.ApogyAddonsSensorsGPSPackageImpl#getGPSRepository()
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
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.addons.sensors.gps.impl.ApogyAddonsSensorsGPSFacadeImpl <em>Facade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.impl.ApogyAddonsSensorsGPSFacadeImpl
		 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.impl.ApogyAddonsSensorsGPSPackageImpl#getApogyAddonsSensorsGPSFacade()
		 * @generated
		 */
		EClass APOGY_ADDONS_SENSORS_GPS_FACADE = eINSTANCE.getApogyAddonsSensorsGPSFacade();

		/**
		 * The meta object literal for the '<em><b>Create GPS Pose Sensor</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_ADDONS_SENSORS_GPS_FACADE___CREATE_GPS_POSE_SENSOR__DOUBLE_DOUBLE = eINSTANCE.getApogyAddonsSensorsGPSFacade__CreateGPSPoseSensor__double_double();

		/**
		 * The meta object literal for the '<em><b>Create Marked GPS</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_ADDONS_SENSORS_GPS_FACADE___CREATE_MARKED_GPS__POSITIONMARKER = eINSTANCE.getApogyAddonsSensorsGPSFacade__CreateMarkedGPS__PositionMarker();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.addons.sensors.gps.GPSStatus <em>GPS Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.GPSStatus
		 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.impl.ApogyAddonsSensorsGPSPackageImpl#getGPSStatus()
		 * @generated
		 */
		EEnum GPS_STATUS = eINSTANCE.getGPSStatus();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.addons.sensors.gps.GPSQuality <em>GPS Quality</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.GPSQuality
		 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.impl.ApogyAddonsSensorsGPSPackageImpl#getGPSQuality()
		 * @generated
		 */
		EEnum GPS_QUALITY = eINSTANCE.getGPSQuality();

		/**
		 * The meta object literal for the '<em>Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Exception
		 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.impl.ApogyAddonsSensorsGPSPackageImpl#getException()
		 * @generated
		 */
		EDataType EXCEPTION = eINSTANCE.getException();

		/**
		 * The meta object literal for the '<em>IO Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.io.IOException
		 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.impl.ApogyAddonsSensorsGPSPackageImpl#getIOException()
		 * @generated
		 */
		EDataType IO_EXCEPTION = eINSTANCE.getIOException();

		/**
		 * The meta object literal for the '<em>Input Stream</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.io.InputStream
		 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.impl.ApogyAddonsSensorsGPSPackageImpl#getInputStream()
		 * @generated
		 */
		EDataType INPUT_STREAM = eINSTANCE.getInputStream();

		/**
		 * The meta object literal for the '<em>Output Stream</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.io.OutputStream
		 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.impl.ApogyAddonsSensorsGPSPackageImpl#getOutputStream()
		 * @generated
		 */
		EDataType OUTPUT_STREAM = eINSTANCE.getOutputStream();

		/**
		 * The meta object literal for the '<em>Date</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Date
		 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.impl.ApogyAddonsSensorsGPSPackageImpl#getDate()
		 * @generated
		 */
		EDataType DATE = eINSTANCE.getDate();

	}

} //ApogyAddonsSensorsGPSPackage
