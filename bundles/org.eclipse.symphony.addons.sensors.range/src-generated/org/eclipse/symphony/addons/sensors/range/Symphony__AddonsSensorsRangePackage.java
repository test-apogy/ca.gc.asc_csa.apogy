/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.range;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.symphony.addons.sensors.Symphony__AddonsSensorsPackage;

import org.eclipse.symphony.addons.sensors.fov.Symphony__AddonsSensorsFOVPackage;

import org.eclipse.symphony.common.topology.Symphony__CommonTopologyPackage;

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
 * @see org.eclipse.symphony.addons.sensors.range.Symphony__AddonsSensorsRangeFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='Symphony__AddonsSensorsRange' childCreationExtenders='true' extensibleProviderFactory='true' multipleEditorPages='false' copyrightText='Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)' modelName='Symphony__AddonsSensorsRange' suppressGenModelAnnotations='false' modelDirectory='/org.eclipse.symphony.addons.sensors.range/src-generated' editDirectory='/org.eclipse.symphony.addons.sensors.range.edit/src-generated' basePackage='org.eclipse.symphony.addons.sensors'"
 * @generated
 */
public interface Symphony__AddonsSensorsRangePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "range";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.eclipse.symphony.addons.sensors.range";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "range";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Symphony__AddonsSensorsRangePackage eINSTANCE = org.eclipse.symphony.addons.sensors.range.impl.Symphony__AddonsSensorsRangePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.sensors.range.impl.RayDataImpl <em>Ray Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.sensors.range.impl.RayDataImpl
	 * @see org.eclipse.symphony.addons.sensors.range.impl.Symphony__AddonsSensorsRangePackageImpl#getRayData()
	 * @generated
	 */
	int RAY_DATA = 0;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAY_DATA__ORIGIN = 0;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAY_DATA__DIRECTION = 1;

	/**
	 * The number of structural features of the '<em>Ray Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAY_DATA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Ray Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAY_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.sensors.range.impl.RasterScanSettingsImpl <em>Raster Scan Settings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.sensors.range.impl.RasterScanSettingsImpl
	 * @see org.eclipse.symphony.addons.sensors.range.impl.Symphony__AddonsSensorsRangePackageImpl#getRasterScanSettings()
	 * @generated
	 */
	int RASTER_SCAN_SETTINGS = 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_SCAN_SETTINGS__PARENT = Symphony__AddonsSensorsFOVPackage.RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_SCAN_SETTINGS__DESCRIPTION = Symphony__AddonsSensorsFOVPackage.RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_SCAN_SETTINGS__NODE_ID = Symphony__AddonsSensorsFOVPackage.RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW__NODE_ID;

	/**
	 * The feature id for the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_SCAN_SETTINGS__RANGE = Symphony__AddonsSensorsFOVPackage.RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW__RANGE;

	/**
	 * The feature id for the '<em><b>Horizontal Field Of View Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_SCAN_SETTINGS__HORIZONTAL_FIELD_OF_VIEW_ANGLE = Symphony__AddonsSensorsFOVPackage.RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW__HORIZONTAL_FIELD_OF_VIEW_ANGLE;

	/**
	 * The feature id for the '<em><b>Vertical Field Of View Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_SCAN_SETTINGS__VERTICAL_FIELD_OF_VIEW_ANGLE = Symphony__AddonsSensorsFOVPackage.RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW__VERTICAL_FIELD_OF_VIEW_ANGLE;

	/**
	 * The feature id for the '<em><b>Volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_SCAN_SETTINGS__VOLUME = Symphony__AddonsSensorsFOVPackage.RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW__VOLUME;

	/**
	 * The feature id for the '<em><b>Vertical Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_SCAN_SETTINGS__VERTICAL_RESOLUTION = Symphony__AddonsSensorsFOVPackage.RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Horizontal Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_SCAN_SETTINGS__HORIZONTAL_RESOLUTION = Symphony__AddonsSensorsFOVPackage.RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Number Of Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_SCAN_SETTINGS__NUMBER_OF_POINTS = Symphony__AddonsSensorsFOVPackage.RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Raster Scan Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_SCAN_SETTINGS_FEATURE_COUNT = Symphony__AddonsSensorsFOVPackage.RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_SCAN_SETTINGS___ACCEPT__INODEVISITOR = Symphony__AddonsSensorsFOVPackage.RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW___ACCEPT__INODEVISITOR;

	/**
	 * The number of operations of the '<em>Raster Scan Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_SCAN_SETTINGS_OPERATION_COUNT = Symphony__AddonsSensorsFOVPackage.RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.sensors.range.impl.RangeSensorImpl <em>Range Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.sensors.range.impl.RangeSensorImpl
	 * @see org.eclipse.symphony.addons.sensors.range.impl.Symphony__AddonsSensorsRangePackageImpl#getRangeSensor()
	 * @generated
	 */
	int RANGE_SENSOR = 2;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_SENSOR__PARENT = Symphony__AddonsSensorsPackage.SENSOR__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_SENSOR__DESCRIPTION = Symphony__AddonsSensorsPackage.SENSOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_SENSOR__NODE_ID = Symphony__AddonsSensorsPackage.SENSOR__NODE_ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_SENSOR__CHILDREN = Symphony__AddonsSensorsPackage.SENSOR__CHILDREN;

	/**
	 * The feature id for the '<em><b>Aggregated Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_SENSOR__AGGREGATED_CHILDREN = Symphony__AddonsSensorsPackage.SENSOR__AGGREGATED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_SENSOR__STATUS = Symphony__AddonsSensorsPackage.SENSOR__STATUS;

	/**
	 * The number of structural features of the '<em>Range Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_SENSOR_FEATURE_COUNT = Symphony__AddonsSensorsPackage.SENSOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_SENSOR___ACCEPT__INODEVISITOR = Symphony__AddonsSensorsPackage.SENSOR___ACCEPT__INODEVISITOR;

	/**
	 * The number of operations of the '<em>Range Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_SENSOR_OPERATION_COUNT = Symphony__AddonsSensorsPackage.SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.sensors.range.impl.ContactSensorImpl <em>Contact Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.sensors.range.impl.ContactSensorImpl
	 * @see org.eclipse.symphony.addons.sensors.range.impl.Symphony__AddonsSensorsRangePackageImpl#getContactSensor()
	 * @generated
	 */
	int CONTACT_SENSOR = 3;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_SENSOR__PARENT = RANGE_SENSOR__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_SENSOR__DESCRIPTION = RANGE_SENSOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_SENSOR__NODE_ID = RANGE_SENSOR__NODE_ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_SENSOR__CHILDREN = RANGE_SENSOR__CHILDREN;

	/**
	 * The feature id for the '<em><b>Aggregated Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_SENSOR__AGGREGATED_CHILDREN = RANGE_SENSOR__AGGREGATED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_SENSOR__STATUS = RANGE_SENSOR__STATUS;

	/**
	 * The feature id for the '<em><b>Contacted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_SENSOR__CONTACTED = RANGE_SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Contact Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_SENSOR_FEATURE_COUNT = RANGE_SENSOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_SENSOR___ACCEPT__INODEVISITOR = RANGE_SENSOR___ACCEPT__INODEVISITOR;

	/**
	 * The number of operations of the '<em>Contact Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_SENSOR_OPERATION_COUNT = RANGE_SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.sensors.range.impl.SimpleRangeSensorImpl <em>Simple Range Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.sensors.range.impl.SimpleRangeSensorImpl
	 * @see org.eclipse.symphony.addons.sensors.range.impl.Symphony__AddonsSensorsRangePackageImpl#getSimpleRangeSensor()
	 * @generated
	 */
	int SIMPLE_RANGE_SENSOR = 4;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RANGE_SENSOR__PARENT = RANGE_SENSOR__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RANGE_SENSOR__DESCRIPTION = RANGE_SENSOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RANGE_SENSOR__NODE_ID = RANGE_SENSOR__NODE_ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RANGE_SENSOR__CHILDREN = RANGE_SENSOR__CHILDREN;

	/**
	 * The feature id for the '<em><b>Aggregated Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RANGE_SENSOR__AGGREGATED_CHILDREN = RANGE_SENSOR__AGGREGATED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RANGE_SENSOR__STATUS = RANGE_SENSOR__STATUS;

	/**
	 * The feature id for the '<em><b>Distance Measured</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RANGE_SENSOR__DISTANCE_MEASURED = RANGE_SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Simple Range Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RANGE_SENSOR_FEATURE_COUNT = RANGE_SENSOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RANGE_SENSOR___ACCEPT__INODEVISITOR = RANGE_SENSOR___ACCEPT__INODEVISITOR;

	/**
	 * The number of operations of the '<em>Simple Range Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RANGE_SENSOR_OPERATION_COUNT = RANGE_SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.sensors.range.impl.SimpleSonarImpl <em>Simple Sonar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.sensors.range.impl.SimpleSonarImpl
	 * @see org.eclipse.symphony.addons.sensors.range.impl.Symphony__AddonsSensorsRangePackageImpl#getSimpleSonar()
	 * @generated
	 */
	int SIMPLE_SONAR = 5;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SONAR__PARENT = SIMPLE_RANGE_SENSOR__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SONAR__DESCRIPTION = SIMPLE_RANGE_SENSOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SONAR__NODE_ID = SIMPLE_RANGE_SENSOR__NODE_ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SONAR__CHILDREN = SIMPLE_RANGE_SENSOR__CHILDREN;

	/**
	 * The feature id for the '<em><b>Aggregated Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SONAR__AGGREGATED_CHILDREN = SIMPLE_RANGE_SENSOR__AGGREGATED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SONAR__STATUS = SIMPLE_RANGE_SENSOR__STATUS;

	/**
	 * The feature id for the '<em><b>Distance Measured</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SONAR__DISTANCE_MEASURED = SIMPLE_RANGE_SENSOR__DISTANCE_MEASURED;

	/**
	 * The feature id for the '<em><b>Echo Detected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SONAR__ECHO_DETECTED = SIMPLE_RANGE_SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Simple Sonar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SONAR_FEATURE_COUNT = SIMPLE_RANGE_SENSOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SONAR___ACCEPT__INODEVISITOR = SIMPLE_RANGE_SENSOR___ACCEPT__INODEVISITOR;

	/**
	 * The operation id for the '<em>Get Field Of View</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SONAR___GET_FIELD_OF_VIEW = SIMPLE_RANGE_SENSOR_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Simple Sonar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SONAR_OPERATION_COUNT = SIMPLE_RANGE_SENSOR_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.sensors.range.impl.LineRangeScannerImpl <em>Line Range Scanner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.sensors.range.impl.LineRangeScannerImpl
	 * @see org.eclipse.symphony.addons.sensors.range.impl.Symphony__AddonsSensorsRangePackageImpl#getLineRangeScanner()
	 * @generated
	 */
	int LINE_RANGE_SCANNER = 6;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_RANGE_SCANNER__PARENT = RANGE_SENSOR__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_RANGE_SCANNER__DESCRIPTION = RANGE_SENSOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_RANGE_SCANNER__NODE_ID = RANGE_SENSOR__NODE_ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_RANGE_SCANNER__CHILDREN = RANGE_SENSOR__CHILDREN;

	/**
	 * The feature id for the '<em><b>Aggregated Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_RANGE_SCANNER__AGGREGATED_CHILDREN = RANGE_SENSOR__AGGREGATED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_RANGE_SCANNER__STATUS = RANGE_SENSOR__STATUS;

	/**
	 * The feature id for the '<em><b>Angular Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_RANGE_SCANNER__ANGULAR_RESOLUTION = RANGE_SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Line Range Scanner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_RANGE_SCANNER_FEATURE_COUNT = RANGE_SENSOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_RANGE_SCANNER___ACCEPT__INODEVISITOR = RANGE_SENSOR___ACCEPT__INODEVISITOR;

	/**
	 * The operation id for the '<em>Get Field Of View</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_RANGE_SCANNER___GET_FIELD_OF_VIEW = RANGE_SENSOR_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Line Range Scanner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_RANGE_SCANNER_OPERATION_COUNT = RANGE_SENSOR_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.sensors.range.impl.SimpleLineRangeScannerImpl <em>Simple Line Range Scanner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.sensors.range.impl.SimpleLineRangeScannerImpl
	 * @see org.eclipse.symphony.addons.sensors.range.impl.Symphony__AddonsSensorsRangePackageImpl#getSimpleLineRangeScanner()
	 * @generated
	 */
	int SIMPLE_LINE_RANGE_SCANNER = 7;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_LINE_RANGE_SCANNER__PARENT = LINE_RANGE_SCANNER__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_LINE_RANGE_SCANNER__DESCRIPTION = LINE_RANGE_SCANNER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_LINE_RANGE_SCANNER__NODE_ID = LINE_RANGE_SCANNER__NODE_ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_LINE_RANGE_SCANNER__CHILDREN = LINE_RANGE_SCANNER__CHILDREN;

	/**
	 * The feature id for the '<em><b>Aggregated Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_LINE_RANGE_SCANNER__AGGREGATED_CHILDREN = LINE_RANGE_SCANNER__AGGREGATED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_LINE_RANGE_SCANNER__STATUS = LINE_RANGE_SCANNER__STATUS;

	/**
	 * The feature id for the '<em><b>Angular Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_LINE_RANGE_SCANNER__ANGULAR_RESOLUTION = LINE_RANGE_SCANNER__ANGULAR_RESOLUTION;

	/**
	 * The number of structural features of the '<em>Simple Line Range Scanner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_LINE_RANGE_SCANNER_FEATURE_COUNT = LINE_RANGE_SCANNER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_LINE_RANGE_SCANNER___ACCEPT__INODEVISITOR = LINE_RANGE_SCANNER___ACCEPT__INODEVISITOR;

	/**
	 * The operation id for the '<em>Get Field Of View</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_LINE_RANGE_SCANNER___GET_FIELD_OF_VIEW = LINE_RANGE_SCANNER___GET_FIELD_OF_VIEW;

	/**
	 * The operation id for the '<em>Acquire Scan</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_LINE_RANGE_SCANNER___ACQUIRE_SCAN = LINE_RANGE_SCANNER_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Simple Line Range Scanner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_LINE_RANGE_SCANNER_OPERATION_COUNT = LINE_RANGE_SCANNER_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.sensors.range.impl.RangeScannerImpl <em>Range Scanner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.sensors.range.impl.RangeScannerImpl
	 * @see org.eclipse.symphony.addons.sensors.range.impl.Symphony__AddonsSensorsRangePackageImpl#getRangeScanner()
	 * @generated
	 */
	int RANGE_SCANNER = 8;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_SCANNER__PARENT = RANGE_SENSOR__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_SCANNER__DESCRIPTION = RANGE_SENSOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_SCANNER__NODE_ID = RANGE_SENSOR__NODE_ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_SCANNER__CHILDREN = RANGE_SENSOR__CHILDREN;

	/**
	 * The feature id for the '<em><b>Aggregated Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_SCANNER__AGGREGATED_CHILDREN = RANGE_SENSOR__AGGREGATED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_SCANNER__STATUS = RANGE_SENSOR__STATUS;

	/**
	 * The feature id for the '<em><b>Progress Monitor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_SCANNER__PROGRESS_MONITOR = RANGE_SENSOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_SCANNER__INPUT = RANGE_SENSOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_SCANNER__OUTPUT = RANGE_SENSOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Range Scanner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_SCANNER_FEATURE_COUNT = RANGE_SENSOR_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_SCANNER___ACCEPT__INODEVISITOR = RANGE_SENSOR___ACCEPT__INODEVISITOR;

	/**
	 * The operation id for the '<em>Process</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_SCANNER___PROCESS__OBJECT = RANGE_SENSOR_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Range Scanner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_SCANNER_OPERATION_COUNT = RANGE_SENSOR_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.sensors.range.impl.RangeScannerSimulatorImpl <em>Range Scanner Simulator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.sensors.range.impl.RangeScannerSimulatorImpl
	 * @see org.eclipse.symphony.addons.sensors.range.impl.Symphony__AddonsSensorsRangePackageImpl#getRangeScannerSimulator()
	 * @generated
	 */
	int RANGE_SCANNER_SIMULATOR = 9;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_SCANNER_SIMULATOR__PARENT = RANGE_SCANNER__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_SCANNER_SIMULATOR__DESCRIPTION = RANGE_SCANNER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_SCANNER_SIMULATOR__NODE_ID = RANGE_SCANNER__NODE_ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_SCANNER_SIMULATOR__CHILDREN = RANGE_SCANNER__CHILDREN;

	/**
	 * The feature id for the '<em><b>Aggregated Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_SCANNER_SIMULATOR__AGGREGATED_CHILDREN = RANGE_SCANNER__AGGREGATED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_SCANNER_SIMULATOR__STATUS = RANGE_SCANNER__STATUS;

	/**
	 * The feature id for the '<em><b>Progress Monitor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_SCANNER_SIMULATOR__PROGRESS_MONITOR = RANGE_SCANNER__PROGRESS_MONITOR;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_SCANNER_SIMULATOR__INPUT = RANGE_SCANNER__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_SCANNER_SIMULATOR__OUTPUT = RANGE_SCANNER__OUTPUT;

	/**
	 * The feature id for the '<em><b>Mesh Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_SCANNER_SIMULATOR__MESH_NODE = RANGE_SCANNER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Noise Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_SCANNER_SIMULATOR__NOISE_ENABLED = RANGE_SCANNER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Time Cropping Mesh</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_SCANNER_SIMULATOR__TIME_CROPPING_MESH = RANGE_SCANNER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Time Finding Intersections</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_SCANNER_SIMULATOR__TIME_FINDING_INTERSECTIONS = RANGE_SCANNER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Time Getting Simulated Rays</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_SCANNER_SIMULATOR__TIME_GETTING_SIMULATED_RAYS = RANGE_SCANNER_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Range Scanner Simulator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_SCANNER_SIMULATOR_FEATURE_COUNT = RANGE_SCANNER_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_SCANNER_SIMULATOR___ACCEPT__INODEVISITOR = RANGE_SCANNER___ACCEPT__INODEVISITOR;

	/**
	 * The operation id for the '<em>Process</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_SCANNER_SIMULATOR___PROCESS__OBJECT = RANGE_SCANNER___PROCESS__OBJECT;

	/**
	 * The operation id for the '<em>Get Cropped Mesh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_SCANNER_SIMULATOR___GET_CROPPED_MESH = RANGE_SCANNER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Simulated Rays</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_SCANNER_SIMULATOR___GET_SIMULATED_RAYS = RANGE_SCANNER_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Acquire Data</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_SCANNER_SIMULATOR___ACQUIRE_DATA = RANGE_SCANNER_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Apply Orientation Noise</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_SCANNER_SIMULATOR___APPLY_ORIENTATION_NOISE__RAYDATA = RANGE_SCANNER_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Apply Range Noise</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_SCANNER_SIMULATOR___APPLY_RANGE_NOISE__DOUBLE_RAYDATA_RAYDATA = RANGE_SCANNER_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Create Coordinates25 D</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_SCANNER_SIMULATOR___CREATE_COORDINATES25_D__RAYDATA_DOUBLE = RANGE_SCANNER_OPERATION_COUNT + 5;

	/**
	 * The number of operations of the '<em>Range Scanner Simulator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_SCANNER_SIMULATOR_OPERATION_COUNT = RANGE_SCANNER_OPERATION_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.sensors.range.impl.RasterScanRangeSensorImpl <em>Raster Scan Range Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.sensors.range.impl.RasterScanRangeSensorImpl
	 * @see org.eclipse.symphony.addons.sensors.range.impl.Symphony__AddonsSensorsRangePackageImpl#getRasterScanRangeSensor()
	 * @generated
	 */
	int RASTER_SCAN_RANGE_SENSOR = 10;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_SCAN_RANGE_SENSOR__PARENT = RANGE_SCANNER__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_SCAN_RANGE_SENSOR__DESCRIPTION = RANGE_SCANNER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_SCAN_RANGE_SENSOR__NODE_ID = RANGE_SCANNER__NODE_ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_SCAN_RANGE_SENSOR__CHILDREN = RANGE_SCANNER__CHILDREN;

	/**
	 * The feature id for the '<em><b>Aggregated Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_SCAN_RANGE_SENSOR__AGGREGATED_CHILDREN = RANGE_SCANNER__AGGREGATED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_SCAN_RANGE_SENSOR__STATUS = RANGE_SCANNER__STATUS;

	/**
	 * The feature id for the '<em><b>Progress Monitor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_SCAN_RANGE_SENSOR__PROGRESS_MONITOR = RANGE_SCANNER__PROGRESS_MONITOR;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_SCAN_RANGE_SENSOR__INPUT = RANGE_SCANNER__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_SCAN_RANGE_SENSOR__OUTPUT = RANGE_SCANNER__OUTPUT;

	/**
	 * The number of structural features of the '<em>Raster Scan Range Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_SCAN_RANGE_SENSOR_FEATURE_COUNT = RANGE_SCANNER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_SCAN_RANGE_SENSOR___ACCEPT__INODEVISITOR = RANGE_SCANNER___ACCEPT__INODEVISITOR;

	/**
	 * The operation id for the '<em>Process</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_SCAN_RANGE_SENSOR___PROCESS__OBJECT = RANGE_SCANNER___PROCESS__OBJECT;

	/**
	 * The operation id for the '<em>Get Scan Settings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_SCAN_RANGE_SENSOR___GET_SCAN_SETTINGS = RANGE_SCANNER_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Raster Scan Range Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_SCAN_RANGE_SENSOR_OPERATION_COUNT = RANGE_SCANNER_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.sensors.range.impl.SimpleRasterScanRangeScannerImpl <em>Simple Raster Scan Range Scanner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.sensors.range.impl.SimpleRasterScanRangeScannerImpl
	 * @see org.eclipse.symphony.addons.sensors.range.impl.Symphony__AddonsSensorsRangePackageImpl#getSimpleRasterScanRangeScanner()
	 * @generated
	 */
	int SIMPLE_RASTER_SCAN_RANGE_SCANNER = 11;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RASTER_SCAN_RANGE_SCANNER__PARENT = RASTER_SCAN_RANGE_SENSOR__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RASTER_SCAN_RANGE_SCANNER__DESCRIPTION = RASTER_SCAN_RANGE_SENSOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RASTER_SCAN_RANGE_SCANNER__NODE_ID = RASTER_SCAN_RANGE_SENSOR__NODE_ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RASTER_SCAN_RANGE_SCANNER__CHILDREN = RASTER_SCAN_RANGE_SENSOR__CHILDREN;

	/**
	 * The feature id for the '<em><b>Aggregated Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RASTER_SCAN_RANGE_SCANNER__AGGREGATED_CHILDREN = RASTER_SCAN_RANGE_SENSOR__AGGREGATED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RASTER_SCAN_RANGE_SCANNER__STATUS = RASTER_SCAN_RANGE_SENSOR__STATUS;

	/**
	 * The feature id for the '<em><b>Progress Monitor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RASTER_SCAN_RANGE_SCANNER__PROGRESS_MONITOR = RASTER_SCAN_RANGE_SENSOR__PROGRESS_MONITOR;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RASTER_SCAN_RANGE_SCANNER__INPUT = RASTER_SCAN_RANGE_SENSOR__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RASTER_SCAN_RANGE_SCANNER__OUTPUT = RASTER_SCAN_RANGE_SENSOR__OUTPUT;

	/**
	 * The number of structural features of the '<em>Simple Raster Scan Range Scanner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RASTER_SCAN_RANGE_SCANNER_FEATURE_COUNT = RASTER_SCAN_RANGE_SENSOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RASTER_SCAN_RANGE_SCANNER___ACCEPT__INODEVISITOR = RASTER_SCAN_RANGE_SENSOR___ACCEPT__INODEVISITOR;

	/**
	 * The operation id for the '<em>Process</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RASTER_SCAN_RANGE_SCANNER___PROCESS__OBJECT = RASTER_SCAN_RANGE_SENSOR___PROCESS__OBJECT;

	/**
	 * The operation id for the '<em>Get Scan Settings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RASTER_SCAN_RANGE_SCANNER___GET_SCAN_SETTINGS = RASTER_SCAN_RANGE_SENSOR___GET_SCAN_SETTINGS;

	/**
	 * The number of operations of the '<em>Simple Raster Scan Range Scanner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RASTER_SCAN_RANGE_SCANNER_OPERATION_COUNT = RASTER_SCAN_RANGE_SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.sensors.range.impl.SimpleRasterScanRangeScannerSimulatorImpl <em>Simple Raster Scan Range Scanner Simulator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.sensors.range.impl.SimpleRasterScanRangeScannerSimulatorImpl
	 * @see org.eclipse.symphony.addons.sensors.range.impl.Symphony__AddonsSensorsRangePackageImpl#getSimpleRasterScanRangeScannerSimulator()
	 * @generated
	 */
	int SIMPLE_RASTER_SCAN_RANGE_SCANNER_SIMULATOR = 12;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RASTER_SCAN_RANGE_SCANNER_SIMULATOR__PARENT = RANGE_SCANNER_SIMULATOR__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RASTER_SCAN_RANGE_SCANNER_SIMULATOR__DESCRIPTION = RANGE_SCANNER_SIMULATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RASTER_SCAN_RANGE_SCANNER_SIMULATOR__NODE_ID = RANGE_SCANNER_SIMULATOR__NODE_ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RASTER_SCAN_RANGE_SCANNER_SIMULATOR__CHILDREN = RANGE_SCANNER_SIMULATOR__CHILDREN;

	/**
	 * The feature id for the '<em><b>Aggregated Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RASTER_SCAN_RANGE_SCANNER_SIMULATOR__AGGREGATED_CHILDREN = RANGE_SCANNER_SIMULATOR__AGGREGATED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RASTER_SCAN_RANGE_SCANNER_SIMULATOR__STATUS = RANGE_SCANNER_SIMULATOR__STATUS;

	/**
	 * The feature id for the '<em><b>Progress Monitor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RASTER_SCAN_RANGE_SCANNER_SIMULATOR__PROGRESS_MONITOR = RANGE_SCANNER_SIMULATOR__PROGRESS_MONITOR;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RASTER_SCAN_RANGE_SCANNER_SIMULATOR__INPUT = RANGE_SCANNER_SIMULATOR__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RASTER_SCAN_RANGE_SCANNER_SIMULATOR__OUTPUT = RANGE_SCANNER_SIMULATOR__OUTPUT;

	/**
	 * The feature id for the '<em><b>Mesh Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RASTER_SCAN_RANGE_SCANNER_SIMULATOR__MESH_NODE = RANGE_SCANNER_SIMULATOR__MESH_NODE;

	/**
	 * The feature id for the '<em><b>Noise Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RASTER_SCAN_RANGE_SCANNER_SIMULATOR__NOISE_ENABLED = RANGE_SCANNER_SIMULATOR__NOISE_ENABLED;

	/**
	 * The feature id for the '<em><b>Time Cropping Mesh</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RASTER_SCAN_RANGE_SCANNER_SIMULATOR__TIME_CROPPING_MESH = RANGE_SCANNER_SIMULATOR__TIME_CROPPING_MESH;

	/**
	 * The feature id for the '<em><b>Time Finding Intersections</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RASTER_SCAN_RANGE_SCANNER_SIMULATOR__TIME_FINDING_INTERSECTIONS = RANGE_SCANNER_SIMULATOR__TIME_FINDING_INTERSECTIONS;

	/**
	 * The feature id for the '<em><b>Time Getting Simulated Rays</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RASTER_SCAN_RANGE_SCANNER_SIMULATOR__TIME_GETTING_SIMULATED_RAYS = RANGE_SCANNER_SIMULATOR__TIME_GETTING_SIMULATED_RAYS;

	/**
	 * The feature id for the '<em><b>Range Noise Amplitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RASTER_SCAN_RANGE_SCANNER_SIMULATOR__RANGE_NOISE_AMPLITUDE = RANGE_SCANNER_SIMULATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Azimuth Noise Amplitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RASTER_SCAN_RANGE_SCANNER_SIMULATOR__AZIMUTH_NOISE_AMPLITUDE = RANGE_SCANNER_SIMULATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Elevation Noise Amplitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RASTER_SCAN_RANGE_SCANNER_SIMULATOR__ELEVATION_NOISE_AMPLITUDE = RANGE_SCANNER_SIMULATOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Horizon Detection Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RASTER_SCAN_RANGE_SCANNER_SIMULATOR__HORIZON_DETECTION_ENABLED = RANGE_SCANNER_SIMULATOR_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Simple Raster Scan Range Scanner Simulator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RASTER_SCAN_RANGE_SCANNER_SIMULATOR_FEATURE_COUNT = RANGE_SCANNER_SIMULATOR_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RASTER_SCAN_RANGE_SCANNER_SIMULATOR___ACCEPT__INODEVISITOR = RANGE_SCANNER_SIMULATOR___ACCEPT__INODEVISITOR;

	/**
	 * The operation id for the '<em>Process</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RASTER_SCAN_RANGE_SCANNER_SIMULATOR___PROCESS__OBJECT = RANGE_SCANNER_SIMULATOR___PROCESS__OBJECT;

	/**
	 * The operation id for the '<em>Get Cropped Mesh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RASTER_SCAN_RANGE_SCANNER_SIMULATOR___GET_CROPPED_MESH = RANGE_SCANNER_SIMULATOR___GET_CROPPED_MESH;

	/**
	 * The operation id for the '<em>Get Simulated Rays</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RASTER_SCAN_RANGE_SCANNER_SIMULATOR___GET_SIMULATED_RAYS = RANGE_SCANNER_SIMULATOR___GET_SIMULATED_RAYS;

	/**
	 * The operation id for the '<em>Acquire Data</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RASTER_SCAN_RANGE_SCANNER_SIMULATOR___ACQUIRE_DATA = RANGE_SCANNER_SIMULATOR___ACQUIRE_DATA;

	/**
	 * The operation id for the '<em>Apply Orientation Noise</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RASTER_SCAN_RANGE_SCANNER_SIMULATOR___APPLY_ORIENTATION_NOISE__RAYDATA = RANGE_SCANNER_SIMULATOR___APPLY_ORIENTATION_NOISE__RAYDATA;

	/**
	 * The operation id for the '<em>Apply Range Noise</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RASTER_SCAN_RANGE_SCANNER_SIMULATOR___APPLY_RANGE_NOISE__DOUBLE_RAYDATA_RAYDATA = RANGE_SCANNER_SIMULATOR___APPLY_RANGE_NOISE__DOUBLE_RAYDATA_RAYDATA;

	/**
	 * The operation id for the '<em>Create Coordinates25 D</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RASTER_SCAN_RANGE_SCANNER_SIMULATOR___CREATE_COORDINATES25_D__RAYDATA_DOUBLE = RANGE_SCANNER_SIMULATOR___CREATE_COORDINATES25_D__RAYDATA_DOUBLE;

	/**
	 * The operation id for the '<em>Get Scan Settings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RASTER_SCAN_RANGE_SCANNER_SIMULATOR___GET_SCAN_SETTINGS = RANGE_SCANNER_SIMULATOR_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Simple Raster Scan Range Scanner Simulator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RASTER_SCAN_RANGE_SCANNER_SIMULATOR_OPERATION_COUNT = RANGE_SCANNER_SIMULATOR_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.sensors.range.impl.RasterScanDataImpl <em>Raster Scan Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.sensors.range.impl.RasterScanDataImpl
	 * @see org.eclipse.symphony.addons.sensors.range.impl.Symphony__AddonsSensorsRangePackageImpl#getRasterScanData()
	 * @generated
	 */
	int RASTER_SCAN_DATA = 13;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_SCAN_DATA__PARENT = Symphony__CommonTopologyPackage.AGGREGATE_GROUP_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_SCAN_DATA__DESCRIPTION = Symphony__CommonTopologyPackage.AGGREGATE_GROUP_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_SCAN_DATA__NODE_ID = Symphony__CommonTopologyPackage.AGGREGATE_GROUP_NODE__NODE_ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_SCAN_DATA__CHILDREN = Symphony__CommonTopologyPackage.AGGREGATE_GROUP_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Aggregated Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_SCAN_DATA__AGGREGATED_CHILDREN = Symphony__CommonTopologyPackage.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_SCAN_DATA__TIME = Symphony__CommonTopologyPackage.AGGREGATE_GROUP_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Raster Scan Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_SCAN_DATA__RASTER_SCAN_SETTINGS = Symphony__CommonTopologyPackage.AGGREGATE_GROUP_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Scan Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_SCAN_DATA__SCAN_DATA = Symphony__CommonTopologyPackage.AGGREGATE_GROUP_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Raster Scan Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_SCAN_DATA_FEATURE_COUNT = Symphony__CommonTopologyPackage.AGGREGATE_GROUP_NODE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_SCAN_DATA___ACCEPT__INODEVISITOR = Symphony__CommonTopologyPackage.AGGREGATE_GROUP_NODE___ACCEPT__INODEVISITOR;

	/**
	 * The number of operations of the '<em>Raster Scan Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_SCAN_DATA_OPERATION_COUNT = Symphony__CommonTopologyPackage.AGGREGATE_GROUP_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.sensors.range.impl.SensorsRangeFacadeImpl <em>Sensors Range Facade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.sensors.range.impl.SensorsRangeFacadeImpl
	 * @see org.eclipse.symphony.addons.sensors.range.impl.Symphony__AddonsSensorsRangePackageImpl#getSensorsRangeFacade()
	 * @generated
	 */
	int SENSORS_RANGE_FACADE = 14;

	/**
	 * The number of structural features of the '<em>Sensors Range Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSORS_RANGE_FACADE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Create Raster Scan Settings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSORS_RANGE_FACADE___CREATE_RASTER_SCAN_SETTINGS__DOUBLE_DOUBLE_DOUBLE_DOUBLE_INT_INT = 0;

	/**
	 * The operation id for the '<em>Create Raster Scan Settings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSORS_RANGE_FACADE___CREATE_RASTER_SCAN_SETTINGS__RASTERSCANSETTINGS = 1;

	/**
	 * The number of operations of the '<em>Sensors Range Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSORS_RANGE_FACADE_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '<em>List</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.eclipse.symphony.addons.sensors.range.impl.Symphony__AddonsSensorsRangePackageImpl#getList()
	 * @generated
	 */
	int LIST = 15;

	/**
	 * The meta object id for the '<em>Point3d</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.vecmath.Point3d
	 * @see org.eclipse.symphony.addons.sensors.range.impl.Symphony__AddonsSensorsRangePackageImpl#getPoint3d()
	 * @generated
	 */
	int POINT3D = 16;

	/**
	 * The meta object id for the '<em>Vector3d</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.vecmath.Vector3d
	 * @see org.eclipse.symphony.addons.sensors.range.impl.Symphony__AddonsSensorsRangePackageImpl#getVector3d()
	 * @generated
	 */
	int VECTOR3D = 17;

	/**
	 * The meta object id for the '<em>Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Exception
	 * @see org.eclipse.symphony.addons.sensors.range.impl.Symphony__AddonsSensorsRangePackageImpl#getException()
	 * @generated
	 */
	int EXCEPTION = 18;


	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.sensors.range.RayData <em>Ray Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ray Data</em>'.
	 * @see org.eclipse.symphony.addons.sensors.range.RayData
	 * @generated
	 */
	EClass getRayData();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.range.RayData#getOrigin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Origin</em>'.
	 * @see org.eclipse.symphony.addons.sensors.range.RayData#getOrigin()
	 * @see #getRayData()
	 * @generated
	 */
	EAttribute getRayData_Origin();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.range.RayData#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see org.eclipse.symphony.addons.sensors.range.RayData#getDirection()
	 * @see #getRayData()
	 * @generated
	 */
	EAttribute getRayData_Direction();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.sensors.range.RasterScanSettings <em>Raster Scan Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Raster Scan Settings</em>'.
	 * @see org.eclipse.symphony.addons.sensors.range.RasterScanSettings
	 * @generated
	 */
	EClass getRasterScanSettings();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.range.RasterScanSettings#getVerticalResolution <em>Vertical Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vertical Resolution</em>'.
	 * @see org.eclipse.symphony.addons.sensors.range.RasterScanSettings#getVerticalResolution()
	 * @see #getRasterScanSettings()
	 * @generated
	 */
	EAttribute getRasterScanSettings_VerticalResolution();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.range.RasterScanSettings#getHorizontalResolution <em>Horizontal Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horizontal Resolution</em>'.
	 * @see org.eclipse.symphony.addons.sensors.range.RasterScanSettings#getHorizontalResolution()
	 * @see #getRasterScanSettings()
	 * @generated
	 */
	EAttribute getRasterScanSettings_HorizontalResolution();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.range.RasterScanSettings#getNumberOfPoints <em>Number Of Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Points</em>'.
	 * @see org.eclipse.symphony.addons.sensors.range.RasterScanSettings#getNumberOfPoints()
	 * @see #getRasterScanSettings()
	 * @generated
	 */
	EAttribute getRasterScanSettings_NumberOfPoints();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.sensors.range.RangeSensor <em>Range Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Range Sensor</em>'.
	 * @see org.eclipse.symphony.addons.sensors.range.RangeSensor
	 * @generated
	 */
	EClass getRangeSensor();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.sensors.range.ContactSensor <em>Contact Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contact Sensor</em>'.
	 * @see org.eclipse.symphony.addons.sensors.range.ContactSensor
	 * @generated
	 */
	EClass getContactSensor();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.range.ContactSensor#isContacted <em>Contacted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contacted</em>'.
	 * @see org.eclipse.symphony.addons.sensors.range.ContactSensor#isContacted()
	 * @see #getContactSensor()
	 * @generated
	 */
	EAttribute getContactSensor_Contacted();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.sensors.range.SimpleRangeSensor <em>Simple Range Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Range Sensor</em>'.
	 * @see org.eclipse.symphony.addons.sensors.range.SimpleRangeSensor
	 * @generated
	 */
	EClass getSimpleRangeSensor();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.range.SimpleRangeSensor#getDistanceMeasured <em>Distance Measured</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance Measured</em>'.
	 * @see org.eclipse.symphony.addons.sensors.range.SimpleRangeSensor#getDistanceMeasured()
	 * @see #getSimpleRangeSensor()
	 * @generated
	 */
	EAttribute getSimpleRangeSensor_DistanceMeasured();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.sensors.range.SimpleSonar <em>Simple Sonar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Sonar</em>'.
	 * @see org.eclipse.symphony.addons.sensors.range.SimpleSonar
	 * @generated
	 */
	EClass getSimpleSonar();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.range.SimpleSonar#isEchoDetected <em>Echo Detected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Echo Detected</em>'.
	 * @see org.eclipse.symphony.addons.sensors.range.SimpleSonar#isEchoDetected()
	 * @see #getSimpleSonar()
	 * @generated
	 */
	EAttribute getSimpleSonar_EchoDetected();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.addons.sensors.range.SimpleSonar#getFieldOfView() <em>Get Field Of View</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Field Of View</em>' operation.
	 * @see org.eclipse.symphony.addons.sensors.range.SimpleSonar#getFieldOfView()
	 * @generated
	 */
	EOperation getSimpleSonar__GetFieldOfView();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.sensors.range.LineRangeScanner <em>Line Range Scanner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line Range Scanner</em>'.
	 * @see org.eclipse.symphony.addons.sensors.range.LineRangeScanner
	 * @generated
	 */
	EClass getLineRangeScanner();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.range.LineRangeScanner#getAngularResolution <em>Angular Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Angular Resolution</em>'.
	 * @see org.eclipse.symphony.addons.sensors.range.LineRangeScanner#getAngularResolution()
	 * @see #getLineRangeScanner()
	 * @generated
	 */
	EAttribute getLineRangeScanner_AngularResolution();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.addons.sensors.range.LineRangeScanner#getFieldOfView() <em>Get Field Of View</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Field Of View</em>' operation.
	 * @see org.eclipse.symphony.addons.sensors.range.LineRangeScanner#getFieldOfView()
	 * @generated
	 */
	EOperation getLineRangeScanner__GetFieldOfView();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.sensors.range.SimpleLineRangeScanner <em>Simple Line Range Scanner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Line Range Scanner</em>'.
	 * @see org.eclipse.symphony.addons.sensors.range.SimpleLineRangeScanner
	 * @generated
	 */
	EClass getSimpleLineRangeScanner();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.addons.sensors.range.SimpleLineRangeScanner#acquireScan() <em>Acquire Scan</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Acquire Scan</em>' operation.
	 * @see org.eclipse.symphony.addons.sensors.range.SimpleLineRangeScanner#acquireScan()
	 * @generated
	 */
	EOperation getSimpleLineRangeScanner__AcquireScan();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.sensors.range.RangeScanner <em>Range Scanner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Range Scanner</em>'.
	 * @see org.eclipse.symphony.addons.sensors.range.RangeScanner
	 * @generated
	 */
	EClass getRangeScanner();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.sensors.range.RangeScannerSimulator <em>Range Scanner Simulator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Range Scanner Simulator</em>'.
	 * @see org.eclipse.symphony.addons.sensors.range.RangeScannerSimulator
	 * @generated
	 */
	EClass getRangeScannerSimulator();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.addons.sensors.range.RangeScannerSimulator#getMeshNode <em>Mesh Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mesh Node</em>'.
	 * @see org.eclipse.symphony.addons.sensors.range.RangeScannerSimulator#getMeshNode()
	 * @see #getRangeScannerSimulator()
	 * @generated
	 */
	EReference getRangeScannerSimulator_MeshNode();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.range.RangeScannerSimulator#isNoiseEnabled <em>Noise Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Noise Enabled</em>'.
	 * @see org.eclipse.symphony.addons.sensors.range.RangeScannerSimulator#isNoiseEnabled()
	 * @see #getRangeScannerSimulator()
	 * @generated
	 */
	EAttribute getRangeScannerSimulator_NoiseEnabled();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.range.RangeScannerSimulator#getTimeCroppingMesh <em>Time Cropping Mesh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Cropping Mesh</em>'.
	 * @see org.eclipse.symphony.addons.sensors.range.RangeScannerSimulator#getTimeCroppingMesh()
	 * @see #getRangeScannerSimulator()
	 * @generated
	 */
	EAttribute getRangeScannerSimulator_TimeCroppingMesh();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.range.RangeScannerSimulator#getTimeFindingIntersections <em>Time Finding Intersections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Finding Intersections</em>'.
	 * @see org.eclipse.symphony.addons.sensors.range.RangeScannerSimulator#getTimeFindingIntersections()
	 * @see #getRangeScannerSimulator()
	 * @generated
	 */
	EAttribute getRangeScannerSimulator_TimeFindingIntersections();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.range.RangeScannerSimulator#getTimeGettingSimulatedRays <em>Time Getting Simulated Rays</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Getting Simulated Rays</em>'.
	 * @see org.eclipse.symphony.addons.sensors.range.RangeScannerSimulator#getTimeGettingSimulatedRays()
	 * @see #getRangeScannerSimulator()
	 * @generated
	 */
	EAttribute getRangeScannerSimulator_TimeGettingSimulatedRays();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.addons.sensors.range.RangeScannerSimulator#getCroppedMesh() <em>Get Cropped Mesh</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Cropped Mesh</em>' operation.
	 * @see org.eclipse.symphony.addons.sensors.range.RangeScannerSimulator#getCroppedMesh()
	 * @generated
	 */
	EOperation getRangeScannerSimulator__GetCroppedMesh();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.addons.sensors.range.RangeScannerSimulator#getSimulatedRays() <em>Get Simulated Rays</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Simulated Rays</em>' operation.
	 * @see org.eclipse.symphony.addons.sensors.range.RangeScannerSimulator#getSimulatedRays()
	 * @generated
	 */
	EOperation getRangeScannerSimulator__GetSimulatedRays();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.addons.sensors.range.RangeScannerSimulator#acquireData() <em>Acquire Data</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Acquire Data</em>' operation.
	 * @see org.eclipse.symphony.addons.sensors.range.RangeScannerSimulator#acquireData()
	 * @generated
	 */
	EOperation getRangeScannerSimulator__AcquireData();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.addons.sensors.range.RangeScannerSimulator#applyOrientationNoise(org.eclipse.symphony.addons.sensors.range.RayData) <em>Apply Orientation Noise</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Apply Orientation Noise</em>' operation.
	 * @see org.eclipse.symphony.addons.sensors.range.RangeScannerSimulator#applyOrientationNoise(org.eclipse.symphony.addons.sensors.range.RayData)
	 * @generated
	 */
	EOperation getRangeScannerSimulator__ApplyOrientationNoise__RayData();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.addons.sensors.range.RangeScannerSimulator#applyRangeNoise(double, org.eclipse.symphony.addons.sensors.range.RayData, org.eclipse.symphony.addons.sensors.range.RayData) <em>Apply Range Noise</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Apply Range Noise</em>' operation.
	 * @see org.eclipse.symphony.addons.sensors.range.RangeScannerSimulator#applyRangeNoise(double, org.eclipse.symphony.addons.sensors.range.RayData, org.eclipse.symphony.addons.sensors.range.RayData)
	 * @generated
	 */
	EOperation getRangeScannerSimulator__ApplyRangeNoise__double_RayData_RayData();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.addons.sensors.range.RangeScannerSimulator#createCoordinates25D(org.eclipse.symphony.addons.sensors.range.RayData, double) <em>Create Coordinates25 D</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Coordinates25 D</em>' operation.
	 * @see org.eclipse.symphony.addons.sensors.range.RangeScannerSimulator#createCoordinates25D(org.eclipse.symphony.addons.sensors.range.RayData, double)
	 * @generated
	 */
	EOperation getRangeScannerSimulator__CreateCoordinates25D__RayData_double();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.sensors.range.RasterScanRangeSensor <em>Raster Scan Range Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Raster Scan Range Sensor</em>'.
	 * @see org.eclipse.symphony.addons.sensors.range.RasterScanRangeSensor
	 * @generated
	 */
	EClass getRasterScanRangeSensor();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.addons.sensors.range.RasterScanRangeSensor#getScanSettings() <em>Get Scan Settings</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Scan Settings</em>' operation.
	 * @see org.eclipse.symphony.addons.sensors.range.RasterScanRangeSensor#getScanSettings()
	 * @generated
	 */
	EOperation getRasterScanRangeSensor__GetScanSettings();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.sensors.range.SimpleRasterScanRangeScanner <em>Simple Raster Scan Range Scanner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Raster Scan Range Scanner</em>'.
	 * @see org.eclipse.symphony.addons.sensors.range.SimpleRasterScanRangeScanner
	 * @generated
	 */
	EClass getSimpleRasterScanRangeScanner();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.sensors.range.SimpleRasterScanRangeScannerSimulator <em>Simple Raster Scan Range Scanner Simulator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Raster Scan Range Scanner Simulator</em>'.
	 * @see org.eclipse.symphony.addons.sensors.range.SimpleRasterScanRangeScannerSimulator
	 * @generated
	 */
	EClass getSimpleRasterScanRangeScannerSimulator();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.range.SimpleRasterScanRangeScannerSimulator#getRangeNoiseAmplitude <em>Range Noise Amplitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Range Noise Amplitude</em>'.
	 * @see org.eclipse.symphony.addons.sensors.range.SimpleRasterScanRangeScannerSimulator#getRangeNoiseAmplitude()
	 * @see #getSimpleRasterScanRangeScannerSimulator()
	 * @generated
	 */
	EAttribute getSimpleRasterScanRangeScannerSimulator_RangeNoiseAmplitude();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.range.SimpleRasterScanRangeScannerSimulator#getAzimuthNoiseAmplitude <em>Azimuth Noise Amplitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Azimuth Noise Amplitude</em>'.
	 * @see org.eclipse.symphony.addons.sensors.range.SimpleRasterScanRangeScannerSimulator#getAzimuthNoiseAmplitude()
	 * @see #getSimpleRasterScanRangeScannerSimulator()
	 * @generated
	 */
	EAttribute getSimpleRasterScanRangeScannerSimulator_AzimuthNoiseAmplitude();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.range.SimpleRasterScanRangeScannerSimulator#getElevationNoiseAmplitude <em>Elevation Noise Amplitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Elevation Noise Amplitude</em>'.
	 * @see org.eclipse.symphony.addons.sensors.range.SimpleRasterScanRangeScannerSimulator#getElevationNoiseAmplitude()
	 * @see #getSimpleRasterScanRangeScannerSimulator()
	 * @generated
	 */
	EAttribute getSimpleRasterScanRangeScannerSimulator_ElevationNoiseAmplitude();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.range.SimpleRasterScanRangeScannerSimulator#isHorizonDetectionEnabled <em>Horizon Detection Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horizon Detection Enabled</em>'.
	 * @see org.eclipse.symphony.addons.sensors.range.SimpleRasterScanRangeScannerSimulator#isHorizonDetectionEnabled()
	 * @see #getSimpleRasterScanRangeScannerSimulator()
	 * @generated
	 */
	EAttribute getSimpleRasterScanRangeScannerSimulator_HorizonDetectionEnabled();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.sensors.range.RasterScanData <em>Raster Scan Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Raster Scan Data</em>'.
	 * @see org.eclipse.symphony.addons.sensors.range.RasterScanData
	 * @generated
	 */
	EClass getRasterScanData();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.addons.sensors.range.RasterScanData#getRasterScanSettings <em>Raster Scan Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Raster Scan Settings</em>'.
	 * @see org.eclipse.symphony.addons.sensors.range.RasterScanData#getRasterScanSettings()
	 * @see #getRasterScanData()
	 * @generated
	 */
	EReference getRasterScanData_RasterScanSettings();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.addons.sensors.range.RasterScanData#getScanData <em>Scan Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scan Data</em>'.
	 * @see org.eclipse.symphony.addons.sensors.range.RasterScanData#getScanData()
	 * @see #getRasterScanData()
	 * @generated
	 */
	EReference getRasterScanData_ScanData();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.sensors.range.SensorsRangeFacade <em>Sensors Range Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensors Range Facade</em>'.
	 * @see org.eclipse.symphony.addons.sensors.range.SensorsRangeFacade
	 * @generated
	 */
	EClass getSensorsRangeFacade();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.addons.sensors.range.SensorsRangeFacade#createRasterScanSettings(double, double, double, double, int, int) <em>Create Raster Scan Settings</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Raster Scan Settings</em>' operation.
	 * @see org.eclipse.symphony.addons.sensors.range.SensorsRangeFacade#createRasterScanSettings(double, double, double, double, int, int)
	 * @generated
	 */
	EOperation getSensorsRangeFacade__CreateRasterScanSettings__double_double_double_double_int_int();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.addons.sensors.range.SensorsRangeFacade#createRasterScanSettings(org.eclipse.symphony.addons.sensors.range.RasterScanSettings) <em>Create Raster Scan Settings</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Raster Scan Settings</em>' operation.
	 * @see org.eclipse.symphony.addons.sensors.range.SensorsRangeFacade#createRasterScanSettings(org.eclipse.symphony.addons.sensors.range.RasterScanSettings)
	 * @generated
	 */
	EOperation getSensorsRangeFacade__CreateRasterScanSettings__RasterScanSettings();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>List</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List" typeParameters="T"
	 * @generated
	 */
	EDataType getList();

	/**
	 * Returns the meta object for data type '{@link javax.vecmath.Point3d <em>Point3d</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Point3d</em>'.
	 * @see javax.vecmath.Point3d
	 * @model instanceClass="javax.vecmath.Point3d"
	 * @generated
	 */
	EDataType getPoint3d();

	/**
	 * Returns the meta object for data type '{@link javax.vecmath.Vector3d <em>Vector3d</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Vector3d</em>'.
	 * @see javax.vecmath.Vector3d
	 * @model instanceClass="javax.vecmath.Vector3d"
	 * @generated
	 */
	EDataType getVector3d();

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
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Symphony__AddonsSensorsRangeFactory getSymphony__AddonsSensorsRangeFactory();

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
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.sensors.range.impl.RayDataImpl <em>Ray Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.sensors.range.impl.RayDataImpl
		 * @see org.eclipse.symphony.addons.sensors.range.impl.Symphony__AddonsSensorsRangePackageImpl#getRayData()
		 * @generated
		 */
		EClass RAY_DATA = eINSTANCE.getRayData();

		/**
		 * The meta object literal for the '<em><b>Origin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RAY_DATA__ORIGIN = eINSTANCE.getRayData_Origin();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RAY_DATA__DIRECTION = eINSTANCE.getRayData_Direction();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.sensors.range.impl.RasterScanSettingsImpl <em>Raster Scan Settings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.sensors.range.impl.RasterScanSettingsImpl
		 * @see org.eclipse.symphony.addons.sensors.range.impl.Symphony__AddonsSensorsRangePackageImpl#getRasterScanSettings()
		 * @generated
		 */
		EClass RASTER_SCAN_SETTINGS = eINSTANCE.getRasterScanSettings();

		/**
		 * The meta object literal for the '<em><b>Vertical Resolution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RASTER_SCAN_SETTINGS__VERTICAL_RESOLUTION = eINSTANCE.getRasterScanSettings_VerticalResolution();

		/**
		 * The meta object literal for the '<em><b>Horizontal Resolution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RASTER_SCAN_SETTINGS__HORIZONTAL_RESOLUTION = eINSTANCE.getRasterScanSettings_HorizontalResolution();

		/**
		 * The meta object literal for the '<em><b>Number Of Points</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RASTER_SCAN_SETTINGS__NUMBER_OF_POINTS = eINSTANCE.getRasterScanSettings_NumberOfPoints();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.sensors.range.impl.RangeSensorImpl <em>Range Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.sensors.range.impl.RangeSensorImpl
		 * @see org.eclipse.symphony.addons.sensors.range.impl.Symphony__AddonsSensorsRangePackageImpl#getRangeSensor()
		 * @generated
		 */
		EClass RANGE_SENSOR = eINSTANCE.getRangeSensor();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.sensors.range.impl.ContactSensorImpl <em>Contact Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.sensors.range.impl.ContactSensorImpl
		 * @see org.eclipse.symphony.addons.sensors.range.impl.Symphony__AddonsSensorsRangePackageImpl#getContactSensor()
		 * @generated
		 */
		EClass CONTACT_SENSOR = eINSTANCE.getContactSensor();

		/**
		 * The meta object literal for the '<em><b>Contacted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT_SENSOR__CONTACTED = eINSTANCE.getContactSensor_Contacted();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.sensors.range.impl.SimpleRangeSensorImpl <em>Simple Range Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.sensors.range.impl.SimpleRangeSensorImpl
		 * @see org.eclipse.symphony.addons.sensors.range.impl.Symphony__AddonsSensorsRangePackageImpl#getSimpleRangeSensor()
		 * @generated
		 */
		EClass SIMPLE_RANGE_SENSOR = eINSTANCE.getSimpleRangeSensor();

		/**
		 * The meta object literal for the '<em><b>Distance Measured</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_RANGE_SENSOR__DISTANCE_MEASURED = eINSTANCE.getSimpleRangeSensor_DistanceMeasured();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.sensors.range.impl.SimpleSonarImpl <em>Simple Sonar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.sensors.range.impl.SimpleSonarImpl
		 * @see org.eclipse.symphony.addons.sensors.range.impl.Symphony__AddonsSensorsRangePackageImpl#getSimpleSonar()
		 * @generated
		 */
		EClass SIMPLE_SONAR = eINSTANCE.getSimpleSonar();

		/**
		 * The meta object literal for the '<em><b>Echo Detected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_SONAR__ECHO_DETECTED = eINSTANCE.getSimpleSonar_EchoDetected();

		/**
		 * The meta object literal for the '<em><b>Get Field Of View</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SIMPLE_SONAR___GET_FIELD_OF_VIEW = eINSTANCE.getSimpleSonar__GetFieldOfView();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.sensors.range.impl.LineRangeScannerImpl <em>Line Range Scanner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.sensors.range.impl.LineRangeScannerImpl
		 * @see org.eclipse.symphony.addons.sensors.range.impl.Symphony__AddonsSensorsRangePackageImpl#getLineRangeScanner()
		 * @generated
		 */
		EClass LINE_RANGE_SCANNER = eINSTANCE.getLineRangeScanner();

		/**
		 * The meta object literal for the '<em><b>Angular Resolution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE_RANGE_SCANNER__ANGULAR_RESOLUTION = eINSTANCE.getLineRangeScanner_AngularResolution();

		/**
		 * The meta object literal for the '<em><b>Get Field Of View</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LINE_RANGE_SCANNER___GET_FIELD_OF_VIEW = eINSTANCE.getLineRangeScanner__GetFieldOfView();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.sensors.range.impl.SimpleLineRangeScannerImpl <em>Simple Line Range Scanner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.sensors.range.impl.SimpleLineRangeScannerImpl
		 * @see org.eclipse.symphony.addons.sensors.range.impl.Symphony__AddonsSensorsRangePackageImpl#getSimpleLineRangeScanner()
		 * @generated
		 */
		EClass SIMPLE_LINE_RANGE_SCANNER = eINSTANCE.getSimpleLineRangeScanner();

		/**
		 * The meta object literal for the '<em><b>Acquire Scan</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SIMPLE_LINE_RANGE_SCANNER___ACQUIRE_SCAN = eINSTANCE.getSimpleLineRangeScanner__AcquireScan();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.sensors.range.impl.RangeScannerImpl <em>Range Scanner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.sensors.range.impl.RangeScannerImpl
		 * @see org.eclipse.symphony.addons.sensors.range.impl.Symphony__AddonsSensorsRangePackageImpl#getRangeScanner()
		 * @generated
		 */
		EClass RANGE_SCANNER = eINSTANCE.getRangeScanner();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.sensors.range.impl.RangeScannerSimulatorImpl <em>Range Scanner Simulator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.sensors.range.impl.RangeScannerSimulatorImpl
		 * @see org.eclipse.symphony.addons.sensors.range.impl.Symphony__AddonsSensorsRangePackageImpl#getRangeScannerSimulator()
		 * @generated
		 */
		EClass RANGE_SCANNER_SIMULATOR = eINSTANCE.getRangeScannerSimulator();

		/**
		 * The meta object literal for the '<em><b>Mesh Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANGE_SCANNER_SIMULATOR__MESH_NODE = eINSTANCE.getRangeScannerSimulator_MeshNode();

		/**
		 * The meta object literal for the '<em><b>Noise Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANGE_SCANNER_SIMULATOR__NOISE_ENABLED = eINSTANCE.getRangeScannerSimulator_NoiseEnabled();

		/**
		 * The meta object literal for the '<em><b>Time Cropping Mesh</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANGE_SCANNER_SIMULATOR__TIME_CROPPING_MESH = eINSTANCE.getRangeScannerSimulator_TimeCroppingMesh();

		/**
		 * The meta object literal for the '<em><b>Time Finding Intersections</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANGE_SCANNER_SIMULATOR__TIME_FINDING_INTERSECTIONS = eINSTANCE.getRangeScannerSimulator_TimeFindingIntersections();

		/**
		 * The meta object literal for the '<em><b>Time Getting Simulated Rays</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANGE_SCANNER_SIMULATOR__TIME_GETTING_SIMULATED_RAYS = eINSTANCE.getRangeScannerSimulator_TimeGettingSimulatedRays();

		/**
		 * The meta object literal for the '<em><b>Get Cropped Mesh</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RANGE_SCANNER_SIMULATOR___GET_CROPPED_MESH = eINSTANCE.getRangeScannerSimulator__GetCroppedMesh();

		/**
		 * The meta object literal for the '<em><b>Get Simulated Rays</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RANGE_SCANNER_SIMULATOR___GET_SIMULATED_RAYS = eINSTANCE.getRangeScannerSimulator__GetSimulatedRays();

		/**
		 * The meta object literal for the '<em><b>Acquire Data</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RANGE_SCANNER_SIMULATOR___ACQUIRE_DATA = eINSTANCE.getRangeScannerSimulator__AcquireData();

		/**
		 * The meta object literal for the '<em><b>Apply Orientation Noise</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RANGE_SCANNER_SIMULATOR___APPLY_ORIENTATION_NOISE__RAYDATA = eINSTANCE.getRangeScannerSimulator__ApplyOrientationNoise__RayData();

		/**
		 * The meta object literal for the '<em><b>Apply Range Noise</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RANGE_SCANNER_SIMULATOR___APPLY_RANGE_NOISE__DOUBLE_RAYDATA_RAYDATA = eINSTANCE.getRangeScannerSimulator__ApplyRangeNoise__double_RayData_RayData();

		/**
		 * The meta object literal for the '<em><b>Create Coordinates25 D</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RANGE_SCANNER_SIMULATOR___CREATE_COORDINATES25_D__RAYDATA_DOUBLE = eINSTANCE.getRangeScannerSimulator__CreateCoordinates25D__RayData_double();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.sensors.range.impl.RasterScanRangeSensorImpl <em>Raster Scan Range Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.sensors.range.impl.RasterScanRangeSensorImpl
		 * @see org.eclipse.symphony.addons.sensors.range.impl.Symphony__AddonsSensorsRangePackageImpl#getRasterScanRangeSensor()
		 * @generated
		 */
		EClass RASTER_SCAN_RANGE_SENSOR = eINSTANCE.getRasterScanRangeSensor();

		/**
		 * The meta object literal for the '<em><b>Get Scan Settings</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RASTER_SCAN_RANGE_SENSOR___GET_SCAN_SETTINGS = eINSTANCE.getRasterScanRangeSensor__GetScanSettings();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.sensors.range.impl.SimpleRasterScanRangeScannerImpl <em>Simple Raster Scan Range Scanner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.sensors.range.impl.SimpleRasterScanRangeScannerImpl
		 * @see org.eclipse.symphony.addons.sensors.range.impl.Symphony__AddonsSensorsRangePackageImpl#getSimpleRasterScanRangeScanner()
		 * @generated
		 */
		EClass SIMPLE_RASTER_SCAN_RANGE_SCANNER = eINSTANCE.getSimpleRasterScanRangeScanner();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.sensors.range.impl.SimpleRasterScanRangeScannerSimulatorImpl <em>Simple Raster Scan Range Scanner Simulator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.sensors.range.impl.SimpleRasterScanRangeScannerSimulatorImpl
		 * @see org.eclipse.symphony.addons.sensors.range.impl.Symphony__AddonsSensorsRangePackageImpl#getSimpleRasterScanRangeScannerSimulator()
		 * @generated
		 */
		EClass SIMPLE_RASTER_SCAN_RANGE_SCANNER_SIMULATOR = eINSTANCE.getSimpleRasterScanRangeScannerSimulator();

		/**
		 * The meta object literal for the '<em><b>Range Noise Amplitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_RASTER_SCAN_RANGE_SCANNER_SIMULATOR__RANGE_NOISE_AMPLITUDE = eINSTANCE.getSimpleRasterScanRangeScannerSimulator_RangeNoiseAmplitude();

		/**
		 * The meta object literal for the '<em><b>Azimuth Noise Amplitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_RASTER_SCAN_RANGE_SCANNER_SIMULATOR__AZIMUTH_NOISE_AMPLITUDE = eINSTANCE.getSimpleRasterScanRangeScannerSimulator_AzimuthNoiseAmplitude();

		/**
		 * The meta object literal for the '<em><b>Elevation Noise Amplitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_RASTER_SCAN_RANGE_SCANNER_SIMULATOR__ELEVATION_NOISE_AMPLITUDE = eINSTANCE.getSimpleRasterScanRangeScannerSimulator_ElevationNoiseAmplitude();

		/**
		 * The meta object literal for the '<em><b>Horizon Detection Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_RASTER_SCAN_RANGE_SCANNER_SIMULATOR__HORIZON_DETECTION_ENABLED = eINSTANCE.getSimpleRasterScanRangeScannerSimulator_HorizonDetectionEnabled();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.sensors.range.impl.RasterScanDataImpl <em>Raster Scan Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.sensors.range.impl.RasterScanDataImpl
		 * @see org.eclipse.symphony.addons.sensors.range.impl.Symphony__AddonsSensorsRangePackageImpl#getRasterScanData()
		 * @generated
		 */
		EClass RASTER_SCAN_DATA = eINSTANCE.getRasterScanData();

		/**
		 * The meta object literal for the '<em><b>Raster Scan Settings</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RASTER_SCAN_DATA__RASTER_SCAN_SETTINGS = eINSTANCE.getRasterScanData_RasterScanSettings();

		/**
		 * The meta object literal for the '<em><b>Scan Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RASTER_SCAN_DATA__SCAN_DATA = eINSTANCE.getRasterScanData_ScanData();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.sensors.range.impl.SensorsRangeFacadeImpl <em>Sensors Range Facade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.sensors.range.impl.SensorsRangeFacadeImpl
		 * @see org.eclipse.symphony.addons.sensors.range.impl.Symphony__AddonsSensorsRangePackageImpl#getSensorsRangeFacade()
		 * @generated
		 */
		EClass SENSORS_RANGE_FACADE = eINSTANCE.getSensorsRangeFacade();

		/**
		 * The meta object literal for the '<em><b>Create Raster Scan Settings</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SENSORS_RANGE_FACADE___CREATE_RASTER_SCAN_SETTINGS__DOUBLE_DOUBLE_DOUBLE_DOUBLE_INT_INT = eINSTANCE.getSensorsRangeFacade__CreateRasterScanSettings__double_double_double_double_int_int();

		/**
		 * The meta object literal for the '<em><b>Create Raster Scan Settings</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SENSORS_RANGE_FACADE___CREATE_RASTER_SCAN_SETTINGS__RASTERSCANSETTINGS = eINSTANCE.getSensorsRangeFacade__CreateRasterScanSettings__RasterScanSettings();

		/**
		 * The meta object literal for the '<em>List</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see org.eclipse.symphony.addons.sensors.range.impl.Symphony__AddonsSensorsRangePackageImpl#getList()
		 * @generated
		 */
		EDataType LIST = eINSTANCE.getList();

		/**
		 * The meta object literal for the '<em>Point3d</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.vecmath.Point3d
		 * @see org.eclipse.symphony.addons.sensors.range.impl.Symphony__AddonsSensorsRangePackageImpl#getPoint3d()
		 * @generated
		 */
		EDataType POINT3D = eINSTANCE.getPoint3d();

		/**
		 * The meta object literal for the '<em>Vector3d</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.vecmath.Vector3d
		 * @see org.eclipse.symphony.addons.sensors.range.impl.Symphony__AddonsSensorsRangePackageImpl#getVector3d()
		 * @generated
		 */
		EDataType VECTOR3D = eINSTANCE.getVector3d();

		/**
		 * The meta object literal for the '<em>Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Exception
		 * @see org.eclipse.symphony.addons.sensors.range.impl.Symphony__AddonsSensorsRangePackageImpl#getException()
		 * @generated
		 */
		EDataType EXCEPTION = eINSTANCE.getException();

	}

} //Symphony__AddonsSensorsRangePackage
