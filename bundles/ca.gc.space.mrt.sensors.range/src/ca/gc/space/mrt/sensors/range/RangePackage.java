/**
 * <copyright>
 * </copyright>
 *
 * $Id: RangePackage.java,v 1.6.4.2 2015/05/21 15:50:22 pallard Exp $
 */
package ca.gc.space.mrt.sensors.range;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import ca.gc.space.mrt.sensors.fov.FovPackage;
import ca.gc.space.mrt.sensors.sensors.SensorsPackage;
import ca.gc.space.topology.TopologyPackage;

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
 * @see ca.gc.space.mrt.sensors.range.RangeFactory
 * @model kind="package"
 * @generated
 */
public interface RangePackage extends EPackage
{
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
	String eNS_URI = "http:///ca/gc/space/mrt/sensors/range/model/range.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ca.gc.space.mrt.sensors.range";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RangePackage eINSTANCE = ca.gc.space.mrt.sensors.range.impl.RangePackageImpl.init();

	/**
	 * The meta object id for the '{@link ca.gc.space.mrt.sensors.range.impl.RangeSensorImpl <em>Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.space.mrt.sensors.range.impl.RangeSensorImpl
	 * @see ca.gc.space.mrt.sensors.range.impl.RangePackageImpl#getRangeSensor()
	 * @generated
	 */
	int RANGE_SENSOR = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_SENSOR__PARENT = SensorsPackage.SENSOR__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_SENSOR__DESCRIPTION = SensorsPackage.SENSOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_SENSOR__NODE_ID = SensorsPackage.SENSOR__NODE_ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_SENSOR__CHILDREN = SensorsPackage.SENSOR__CHILDREN;

	/**
	 * The feature id for the '<em><b>Aggregated Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_SENSOR__AGGREGATED_CHILDREN = SensorsPackage.SENSOR__AGGREGATED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_SENSOR__STATUS = SensorsPackage.SENSOR__STATUS;

	/**
	 * The number of structural features of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_SENSOR_FEATURE_COUNT = SensorsPackage.SENSOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_SENSOR___ACCEPT__INODEVISITOR = SensorsPackage.SENSOR___ACCEPT__INODEVISITOR;

	/**
	 * The number of operations of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_SENSOR_OPERATION_COUNT = SensorsPackage.SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.space.mrt.sensors.range.impl.SimpleRangeSensorImpl <em>Simple Range Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.space.mrt.sensors.range.impl.SimpleRangeSensorImpl
	 * @see ca.gc.space.mrt.sensors.range.impl.RangePackageImpl#getSimpleRangeSensor()
	 * @generated
	 */
	int SIMPLE_RANGE_SENSOR = 2;

	/**
	 * The meta object id for the '{@link ca.gc.space.mrt.sensors.range.impl.ContactSensorImpl <em>Contact Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.space.mrt.sensors.range.impl.ContactSensorImpl
	 * @see ca.gc.space.mrt.sensors.range.impl.RangePackageImpl#getContactSensor()
	 * @generated
	 */
	int CONTACT_SENSOR = 1;

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
	 * The meta object id for the '{@link ca.gc.space.mrt.sensors.range.impl.SimpleSonarImpl <em>Simple Sonar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.space.mrt.sensors.range.impl.SimpleSonarImpl
	 * @see ca.gc.space.mrt.sensors.range.impl.RangePackageImpl#getSimpleSonar()
	 * @generated
	 */
	int SIMPLE_SONAR = 3;

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
	 * The meta object id for the '{@link ca.gc.space.mrt.sensors.range.impl.LineRangeScannerImpl <em>Line Range Scanner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.space.mrt.sensors.range.impl.LineRangeScannerImpl
	 * @see ca.gc.space.mrt.sensors.range.impl.RangePackageImpl#getLineRangeScanner()
	 * @generated
	 */
	int LINE_RANGE_SCANNER = 4;

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
	 * The meta object id for the '{@link ca.gc.space.mrt.sensors.range.impl.SimpleLineRangeScannerImpl <em>Simple Line Range Scanner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.space.mrt.sensors.range.impl.SimpleLineRangeScannerImpl
	 * @see ca.gc.space.mrt.sensors.range.impl.RangePackageImpl#getSimpleLineRangeScanner()
	 * @generated
	 */
	int SIMPLE_LINE_RANGE_SCANNER = 5;

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
	 * The meta object id for the '{@link ca.gc.space.mrt.sensors.range.impl.RangeScannerImpl <em>Scanner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.space.mrt.sensors.range.impl.RangeScannerImpl
	 * @see ca.gc.space.mrt.sensors.range.impl.RangePackageImpl#getRangeScanner()
	 * @generated
	 */
	int RANGE_SCANNER = 6;

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
	 * The number of structural features of the '<em>Scanner</em>' class.
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
	 * The number of operations of the '<em>Scanner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_SCANNER_OPERATION_COUNT = RANGE_SENSOR_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link ca.gc.space.mrt.sensors.range.impl.RangeScannerSimulatorImpl <em>Scanner Simulator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.space.mrt.sensors.range.impl.RangeScannerSimulatorImpl
	 * @see ca.gc.space.mrt.sensors.range.impl.RangePackageImpl#getRangeScannerSimulator()
	 * @generated
	 */
	int RANGE_SCANNER_SIMULATOR = 7;

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
	 * The number of structural features of the '<em>Scanner Simulator</em>' class.
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
	 * The number of operations of the '<em>Scanner Simulator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_SCANNER_SIMULATOR_OPERATION_COUNT = RANGE_SCANNER_OPERATION_COUNT + 6;

	/**
	 * The meta object id for the '{@link ca.gc.space.mrt.sensors.range.impl.RayDataImpl <em>Ray Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.space.mrt.sensors.range.impl.RayDataImpl
	 * @see ca.gc.space.mrt.sensors.range.impl.RangePackageImpl#getRayData()
	 * @generated
	 */
	int RAY_DATA = 8;

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
	 * The meta object id for the '{@link ca.gc.space.mrt.sensors.range.impl.RasterScanRangeSensorImpl <em>Raster Scan Range Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.space.mrt.sensors.range.impl.RasterScanRangeSensorImpl
	 * @see ca.gc.space.mrt.sensors.range.impl.RangePackageImpl#getRasterScanRangeSensor()
	 * @generated
	 */
	int RASTER_SCAN_RANGE_SENSOR = 9;

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
	 * The meta object id for the '{@link ca.gc.space.mrt.sensors.range.impl.SimpleRasterScanRangeScannerImpl <em>Simple Raster Scan Range Scanner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.space.mrt.sensors.range.impl.SimpleRasterScanRangeScannerImpl
	 * @see ca.gc.space.mrt.sensors.range.impl.RangePackageImpl#getSimpleRasterScanRangeScanner()
	 * @generated
	 */
	int SIMPLE_RASTER_SCAN_RANGE_SCANNER = 10;

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
	 * The meta object id for the '{@link ca.gc.space.mrt.sensors.range.impl.SimpleRasterScanRangeScannerSimulatorImpl <em>Simple Raster Scan Range Scanner Simulator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.space.mrt.sensors.range.impl.SimpleRasterScanRangeScannerSimulatorImpl
	 * @see ca.gc.space.mrt.sensors.range.impl.RangePackageImpl#getSimpleRasterScanRangeScannerSimulator()
	 * @generated
	 */
	int SIMPLE_RASTER_SCAN_RANGE_SCANNER_SIMULATOR = 11;

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
	 * The meta object id for the '{@link ca.gc.space.mrt.sensors.range.impl.RasterScanSettingsImpl <em>Raster Scan Settings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.space.mrt.sensors.range.impl.RasterScanSettingsImpl
	 * @see ca.gc.space.mrt.sensors.range.impl.RangePackageImpl#getRasterScanSettings()
	 * @generated
	 */
	int RASTER_SCAN_SETTINGS = 12;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_SCAN_SETTINGS__PARENT = FovPackage.RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_SCAN_SETTINGS__DESCRIPTION = FovPackage.RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_SCAN_SETTINGS__NODE_ID = FovPackage.RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW__NODE_ID;

	/**
	 * The feature id for the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_SCAN_SETTINGS__RANGE = FovPackage.RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW__RANGE;

	/**
	 * The feature id for the '<em><b>Horizontal Field Of View Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_SCAN_SETTINGS__HORIZONTAL_FIELD_OF_VIEW_ANGLE = FovPackage.RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW__HORIZONTAL_FIELD_OF_VIEW_ANGLE;

	/**
	 * The feature id for the '<em><b>Vertical Field Of View Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_SCAN_SETTINGS__VERTICAL_FIELD_OF_VIEW_ANGLE = FovPackage.RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW__VERTICAL_FIELD_OF_VIEW_ANGLE;

	/**
	 * The feature id for the '<em><b>Volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_SCAN_SETTINGS__VOLUME = FovPackage.RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW__VOLUME;

	/**
	 * The feature id for the '<em><b>Vertical Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_SCAN_SETTINGS__VERTICAL_RESOLUTION = FovPackage.RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Horizontal Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_SCAN_SETTINGS__HORIZONTAL_RESOLUTION = FovPackage.RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Number Of Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_SCAN_SETTINGS__NUMBER_OF_POINTS = FovPackage.RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Raster Scan Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_SCAN_SETTINGS_FEATURE_COUNT = FovPackage.RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_SCAN_SETTINGS___ACCEPT__INODEVISITOR = FovPackage.RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW___ACCEPT__INODEVISITOR;

	/**
	 * The number of operations of the '<em>Raster Scan Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_SCAN_SETTINGS_OPERATION_COUNT = FovPackage.RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.space.mrt.sensors.range.impl.SensorsRangeFacadeImpl <em>Sensors Range Facade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.space.mrt.sensors.range.impl.SensorsRangeFacadeImpl
	 * @see ca.gc.space.mrt.sensors.range.impl.RangePackageImpl#getSensorsRangeFacade()
	 * @generated
	 */
	int SENSORS_RANGE_FACADE = 13;

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
	 * The meta object id for the '{@link ca.gc.space.mrt.sensors.range.impl.RasterScanDataImpl <em>Raster Scan Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.space.mrt.sensors.range.impl.RasterScanDataImpl
	 * @see ca.gc.space.mrt.sensors.range.impl.RangePackageImpl#getRasterScanData()
	 * @generated
	 */
	int RASTER_SCAN_DATA = 14;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_SCAN_DATA__PARENT = TopologyPackage.AGGREGATE_GROUP_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_SCAN_DATA__DESCRIPTION = TopologyPackage.AGGREGATE_GROUP_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_SCAN_DATA__NODE_ID = TopologyPackage.AGGREGATE_GROUP_NODE__NODE_ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_SCAN_DATA__CHILDREN = TopologyPackage.AGGREGATE_GROUP_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Aggregated Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_SCAN_DATA__AGGREGATED_CHILDREN = TopologyPackage.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_SCAN_DATA__TIME = TopologyPackage.AGGREGATE_GROUP_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Raster Scan Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_SCAN_DATA__RASTER_SCAN_SETTINGS = TopologyPackage.AGGREGATE_GROUP_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Scan Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_SCAN_DATA__SCAN_DATA = TopologyPackage.AGGREGATE_GROUP_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Raster Scan Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_SCAN_DATA_FEATURE_COUNT = TopologyPackage.AGGREGATE_GROUP_NODE_FEATURE_COUNT + 3;


	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_SCAN_DATA___ACCEPT__INODEVISITOR = TopologyPackage.AGGREGATE_GROUP_NODE___ACCEPT__INODEVISITOR;

	/**
	 * The number of operations of the '<em>Raster Scan Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_SCAN_DATA_OPERATION_COUNT = TopologyPackage.AGGREGATE_GROUP_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '<em>List</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see ca.gc.space.mrt.sensors.range.impl.RangePackageImpl#getList()
	 * @generated
	 */
	int LIST = 15;


	/**
	 * Returns the meta object for class '{@link ca.gc.space.mrt.sensors.range.SimpleRangeSensor <em>Simple Range Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Range Sensor</em>'.
	 * @see ca.gc.space.mrt.sensors.range.SimpleRangeSensor
	 * @generated
	 */
	EClass getSimpleRangeSensor();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.mrt.sensors.range.SimpleRangeSensor#getDistanceMeasured <em>Distance Measured</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance Measured</em>'.
	 * @see ca.gc.space.mrt.sensors.range.SimpleRangeSensor#getDistanceMeasured()
	 * @see #getSimpleRangeSensor()
	 * @generated
	 */
	EAttribute getSimpleRangeSensor_DistanceMeasured();

	/**
	 * Returns the meta object for class '{@link ca.gc.space.mrt.sensors.range.ContactSensor <em>Contact Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contact Sensor</em>'.
	 * @see ca.gc.space.mrt.sensors.range.ContactSensor
	 * @generated
	 */
	EClass getContactSensor();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.mrt.sensors.range.ContactSensor#isContacted <em>Contacted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contacted</em>'.
	 * @see ca.gc.space.mrt.sensors.range.ContactSensor#isContacted()
	 * @see #getContactSensor()
	 * @generated
	 */
	EAttribute getContactSensor_Contacted();

	/**
	 * Returns the meta object for class '{@link ca.gc.space.mrt.sensors.range.SimpleSonar <em>Simple Sonar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Sonar</em>'.
	 * @see ca.gc.space.mrt.sensors.range.SimpleSonar
	 * @generated
	 */
	EClass getSimpleSonar();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.mrt.sensors.range.SimpleSonar#isEchoDetected <em>Echo Detected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Echo Detected</em>'.
	 * @see ca.gc.space.mrt.sensors.range.SimpleSonar#isEchoDetected()
	 * @see #getSimpleSonar()
	 * @generated
	 */
	EAttribute getSimpleSonar_EchoDetected();

	/**
	 * Returns the meta object for the '{@link ca.gc.space.mrt.sensors.range.SimpleSonar#getFieldOfView() <em>Get Field Of View</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Field Of View</em>' operation.
	 * @see ca.gc.space.mrt.sensors.range.SimpleSonar#getFieldOfView()
	 * @generated
	 */
	EOperation getSimpleSonar__GetFieldOfView();

	/**
	 * Returns the meta object for class '{@link ca.gc.space.mrt.sensors.range.LineRangeScanner <em>Line Range Scanner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line Range Scanner</em>'.
	 * @see ca.gc.space.mrt.sensors.range.LineRangeScanner
	 * @generated
	 */
	EClass getLineRangeScanner();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.mrt.sensors.range.LineRangeScanner#getAngularResolution <em>Angular Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Angular Resolution</em>'.
	 * @see ca.gc.space.mrt.sensors.range.LineRangeScanner#getAngularResolution()
	 * @see #getLineRangeScanner()
	 * @generated
	 */
	EAttribute getLineRangeScanner_AngularResolution();

	/**
	 * Returns the meta object for the '{@link ca.gc.space.mrt.sensors.range.LineRangeScanner#getFieldOfView() <em>Get Field Of View</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Field Of View</em>' operation.
	 * @see ca.gc.space.mrt.sensors.range.LineRangeScanner#getFieldOfView()
	 * @generated
	 */
	EOperation getLineRangeScanner__GetFieldOfView();

	/**
	 * Returns the meta object for class '{@link ca.gc.space.mrt.sensors.range.SimpleLineRangeScanner <em>Simple Line Range Scanner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Line Range Scanner</em>'.
	 * @see ca.gc.space.mrt.sensors.range.SimpleLineRangeScanner
	 * @generated
	 */
	EClass getSimpleLineRangeScanner();

	/**
	 * Returns the meta object for the '{@link ca.gc.space.mrt.sensors.range.SimpleLineRangeScanner#acquireScan() <em>Acquire Scan</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Acquire Scan</em>' operation.
	 * @see ca.gc.space.mrt.sensors.range.SimpleLineRangeScanner#acquireScan()
	 * @generated
	 */
	EOperation getSimpleLineRangeScanner__AcquireScan();

	/**
	 * Returns the meta object for class '{@link ca.gc.space.mrt.sensors.range.RangeScanner <em>Scanner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scanner</em>'.
	 * @see ca.gc.space.mrt.sensors.range.RangeScanner
	 * @generated
	 */
	EClass getRangeScanner();

	/**
	 * Returns the meta object for class '{@link ca.gc.space.mrt.sensors.range.RangeScannerSimulator <em>Scanner Simulator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scanner Simulator</em>'.
	 * @see ca.gc.space.mrt.sensors.range.RangeScannerSimulator
	 * @generated
	 */
	EClass getRangeScannerSimulator();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.space.mrt.sensors.range.RangeScannerSimulator#getMeshNode <em>Mesh Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mesh Node</em>'.
	 * @see ca.gc.space.mrt.sensors.range.RangeScannerSimulator#getMeshNode()
	 * @see #getRangeScannerSimulator()
	 * @generated
	 */
	EReference getRangeScannerSimulator_MeshNode();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.mrt.sensors.range.RangeScannerSimulator#isNoiseEnabled <em>Noise Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Noise Enabled</em>'.
	 * @see ca.gc.space.mrt.sensors.range.RangeScannerSimulator#isNoiseEnabled()
	 * @see #getRangeScannerSimulator()
	 * @generated
	 */
	EAttribute getRangeScannerSimulator_NoiseEnabled();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.mrt.sensors.range.RangeScannerSimulator#getTimeCroppingMesh <em>Time Cropping Mesh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Cropping Mesh</em>'.
	 * @see ca.gc.space.mrt.sensors.range.RangeScannerSimulator#getTimeCroppingMesh()
	 * @see #getRangeScannerSimulator()
	 * @generated
	 */
	EAttribute getRangeScannerSimulator_TimeCroppingMesh();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.mrt.sensors.range.RangeScannerSimulator#getTimeFindingIntersections <em>Time Finding Intersections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Finding Intersections</em>'.
	 * @see ca.gc.space.mrt.sensors.range.RangeScannerSimulator#getTimeFindingIntersections()
	 * @see #getRangeScannerSimulator()
	 * @generated
	 */
	EAttribute getRangeScannerSimulator_TimeFindingIntersections();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.mrt.sensors.range.RangeScannerSimulator#getTimeGettingSimulatedRays <em>Time Getting Simulated Rays</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Getting Simulated Rays</em>'.
	 * @see ca.gc.space.mrt.sensors.range.RangeScannerSimulator#getTimeGettingSimulatedRays()
	 * @see #getRangeScannerSimulator()
	 * @generated
	 */
	EAttribute getRangeScannerSimulator_TimeGettingSimulatedRays();

	/**
	 * Returns the meta object for the '{@link ca.gc.space.mrt.sensors.range.RangeScannerSimulator#getCroppedMesh() <em>Get Cropped Mesh</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Cropped Mesh</em>' operation.
	 * @see ca.gc.space.mrt.sensors.range.RangeScannerSimulator#getCroppedMesh()
	 * @generated
	 */
	EOperation getRangeScannerSimulator__GetCroppedMesh();

	/**
	 * Returns the meta object for the '{@link ca.gc.space.mrt.sensors.range.RangeScannerSimulator#getSimulatedRays() <em>Get Simulated Rays</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Simulated Rays</em>' operation.
	 * @see ca.gc.space.mrt.sensors.range.RangeScannerSimulator#getSimulatedRays()
	 * @generated
	 */
	EOperation getRangeScannerSimulator__GetSimulatedRays();

	/**
	 * Returns the meta object for the '{@link ca.gc.space.mrt.sensors.range.RangeScannerSimulator#acquireData() <em>Acquire Data</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Acquire Data</em>' operation.
	 * @see ca.gc.space.mrt.sensors.range.RangeScannerSimulator#acquireData()
	 * @generated
	 */
	EOperation getRangeScannerSimulator__AcquireData();

	/**
	 * Returns the meta object for the '{@link ca.gc.space.mrt.sensors.range.RangeScannerSimulator#applyOrientationNoise(ca.gc.space.mrt.sensors.range.RayData) <em>Apply Orientation Noise</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Apply Orientation Noise</em>' operation.
	 * @see ca.gc.space.mrt.sensors.range.RangeScannerSimulator#applyOrientationNoise(ca.gc.space.mrt.sensors.range.RayData)
	 * @generated
	 */
	EOperation getRangeScannerSimulator__ApplyOrientationNoise__RayData();

	/**
	 * Returns the meta object for the '{@link ca.gc.space.mrt.sensors.range.RangeScannerSimulator#applyRangeNoise(double, ca.gc.space.mrt.sensors.range.RayData, ca.gc.space.mrt.sensors.range.RayData) <em>Apply Range Noise</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Apply Range Noise</em>' operation.
	 * @see ca.gc.space.mrt.sensors.range.RangeScannerSimulator#applyRangeNoise(double, ca.gc.space.mrt.sensors.range.RayData, ca.gc.space.mrt.sensors.range.RayData)
	 * @generated
	 */
	EOperation getRangeScannerSimulator__ApplyRangeNoise__double_RayData_RayData();

	/**
	 * Returns the meta object for the '{@link ca.gc.space.mrt.sensors.range.RangeScannerSimulator#createCoordinates25D(ca.gc.space.mrt.sensors.range.RayData, double) <em>Create Coordinates25 D</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Coordinates25 D</em>' operation.
	 * @see ca.gc.space.mrt.sensors.range.RangeScannerSimulator#createCoordinates25D(ca.gc.space.mrt.sensors.range.RayData, double)
	 * @generated
	 */
	EOperation getRangeScannerSimulator__CreateCoordinates25D__RayData_double();

	/**
	 * Returns the meta object for class '{@link ca.gc.space.mrt.sensors.range.RayData <em>Ray Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ray Data</em>'.
	 * @see ca.gc.space.mrt.sensors.range.RayData
	 * @generated
	 */
	EClass getRayData();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.mrt.sensors.range.RayData#getOrigin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Origin</em>'.
	 * @see ca.gc.space.mrt.sensors.range.RayData#getOrigin()
	 * @see #getRayData()
	 * @generated
	 */
	EAttribute getRayData_Origin();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.mrt.sensors.range.RayData#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see ca.gc.space.mrt.sensors.range.RayData#getDirection()
	 * @see #getRayData()
	 * @generated
	 */
	EAttribute getRayData_Direction();

	/**
	 * Returns the meta object for class '{@link ca.gc.space.mrt.sensors.range.RasterScanRangeSensor <em>Raster Scan Range Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Raster Scan Range Sensor</em>'.
	 * @see ca.gc.space.mrt.sensors.range.RasterScanRangeSensor
	 * @generated
	 */
	EClass getRasterScanRangeSensor();

	/**
	 * Returns the meta object for the '{@link ca.gc.space.mrt.sensors.range.RasterScanRangeSensor#getScanSettings() <em>Get Scan Settings</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Scan Settings</em>' operation.
	 * @see ca.gc.space.mrt.sensors.range.RasterScanRangeSensor#getScanSettings()
	 * @generated
	 */
	EOperation getRasterScanRangeSensor__GetScanSettings();

	/**
	 * Returns the meta object for class '{@link ca.gc.space.mrt.sensors.range.SimpleRasterScanRangeScanner <em>Simple Raster Scan Range Scanner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Raster Scan Range Scanner</em>'.
	 * @see ca.gc.space.mrt.sensors.range.SimpleRasterScanRangeScanner
	 * @generated
	 */
	EClass getSimpleRasterScanRangeScanner();

	/**
	 * Returns the meta object for class '{@link ca.gc.space.mrt.sensors.range.SimpleRasterScanRangeScannerSimulator <em>Simple Raster Scan Range Scanner Simulator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Raster Scan Range Scanner Simulator</em>'.
	 * @see ca.gc.space.mrt.sensors.range.SimpleRasterScanRangeScannerSimulator
	 * @generated
	 */
	EClass getSimpleRasterScanRangeScannerSimulator();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.mrt.sensors.range.SimpleRasterScanRangeScannerSimulator#getRangeNoiseAmplitude <em>Range Noise Amplitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Range Noise Amplitude</em>'.
	 * @see ca.gc.space.mrt.sensors.range.SimpleRasterScanRangeScannerSimulator#getRangeNoiseAmplitude()
	 * @see #getSimpleRasterScanRangeScannerSimulator()
	 * @generated
	 */
	EAttribute getSimpleRasterScanRangeScannerSimulator_RangeNoiseAmplitude();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.mrt.sensors.range.SimpleRasterScanRangeScannerSimulator#getAzimuthNoiseAmplitude <em>Azimuth Noise Amplitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Azimuth Noise Amplitude</em>'.
	 * @see ca.gc.space.mrt.sensors.range.SimpleRasterScanRangeScannerSimulator#getAzimuthNoiseAmplitude()
	 * @see #getSimpleRasterScanRangeScannerSimulator()
	 * @generated
	 */
	EAttribute getSimpleRasterScanRangeScannerSimulator_AzimuthNoiseAmplitude();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.mrt.sensors.range.SimpleRasterScanRangeScannerSimulator#getElevationNoiseAmplitude <em>Elevation Noise Amplitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Elevation Noise Amplitude</em>'.
	 * @see ca.gc.space.mrt.sensors.range.SimpleRasterScanRangeScannerSimulator#getElevationNoiseAmplitude()
	 * @see #getSimpleRasterScanRangeScannerSimulator()
	 * @generated
	 */
	EAttribute getSimpleRasterScanRangeScannerSimulator_ElevationNoiseAmplitude();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.mrt.sensors.range.SimpleRasterScanRangeScannerSimulator#isHorizonDetectionEnabled <em>Horizon Detection Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horizon Detection Enabled</em>'.
	 * @see ca.gc.space.mrt.sensors.range.SimpleRasterScanRangeScannerSimulator#isHorizonDetectionEnabled()
	 * @see #getSimpleRasterScanRangeScannerSimulator()
	 * @generated
	 */
	EAttribute getSimpleRasterScanRangeScannerSimulator_HorizonDetectionEnabled();

	/**
	 * Returns the meta object for class '{@link ca.gc.space.mrt.sensors.range.RangeSensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor</em>'.
	 * @see ca.gc.space.mrt.sensors.range.RangeSensor
	 * @generated
	 */
	EClass getRangeSensor();

	/**
	 * Returns the meta object for class '{@link ca.gc.space.mrt.sensors.range.RasterScanSettings <em>Raster Scan Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Raster Scan Settings</em>'.
	 * @see ca.gc.space.mrt.sensors.range.RasterScanSettings
	 * @generated
	 */
	EClass getRasterScanSettings();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.mrt.sensors.range.RasterScanSettings#getVerticalResolution <em>Vertical Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vertical Resolution</em>'.
	 * @see ca.gc.space.mrt.sensors.range.RasterScanSettings#getVerticalResolution()
	 * @see #getRasterScanSettings()
	 * @generated
	 */
	EAttribute getRasterScanSettings_VerticalResolution();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.mrt.sensors.range.RasterScanSettings#getHorizontalResolution <em>Horizontal Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horizontal Resolution</em>'.
	 * @see ca.gc.space.mrt.sensors.range.RasterScanSettings#getHorizontalResolution()
	 * @see #getRasterScanSettings()
	 * @generated
	 */
	EAttribute getRasterScanSettings_HorizontalResolution();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.mrt.sensors.range.RasterScanSettings#getNumberOfPoints <em>Number Of Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Points</em>'.
	 * @see ca.gc.space.mrt.sensors.range.RasterScanSettings#getNumberOfPoints()
	 * @see #getRasterScanSettings()
	 * @generated
	 */
	EAttribute getRasterScanSettings_NumberOfPoints();

	/**
	 * Returns the meta object for class '{@link ca.gc.space.mrt.sensors.range.SensorsRangeFacade <em>Sensors Range Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensors Range Facade</em>'.
	 * @see ca.gc.space.mrt.sensors.range.SensorsRangeFacade
	 * @generated
	 */
	EClass getSensorsRangeFacade();

	/**
	 * Returns the meta object for the '{@link ca.gc.space.mrt.sensors.range.SensorsRangeFacade#createRasterScanSettings(double, double, double, double, int, int) <em>Create Raster Scan Settings</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Raster Scan Settings</em>' operation.
	 * @see ca.gc.space.mrt.sensors.range.SensorsRangeFacade#createRasterScanSettings(double, double, double, double, int, int)
	 * @generated
	 */
	EOperation getSensorsRangeFacade__CreateRasterScanSettings__double_double_double_double_int_int();

	/**
	 * Returns the meta object for the '{@link ca.gc.space.mrt.sensors.range.SensorsRangeFacade#createRasterScanSettings(ca.gc.space.mrt.sensors.range.RasterScanSettings) <em>Create Raster Scan Settings</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Raster Scan Settings</em>' operation.
	 * @see ca.gc.space.mrt.sensors.range.SensorsRangeFacade#createRasterScanSettings(ca.gc.space.mrt.sensors.range.RasterScanSettings)
	 * @generated
	 */
	EOperation getSensorsRangeFacade__CreateRasterScanSettings__RasterScanSettings();

	/**
	 * Returns the meta object for class '{@link ca.gc.space.mrt.sensors.range.RasterScanData <em>Raster Scan Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Raster Scan Data</em>'.
	 * @see ca.gc.space.mrt.sensors.range.RasterScanData
	 * @generated
	 */
	EClass getRasterScanData();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.space.mrt.sensors.range.RasterScanData#getRasterScanSettings <em>Raster Scan Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Raster Scan Settings</em>'.
	 * @see ca.gc.space.mrt.sensors.range.RasterScanData#getRasterScanSettings()
	 * @see #getRasterScanData()
	 * @generated
	 */
	EReference getRasterScanData_RasterScanSettings();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.space.mrt.sensors.range.RasterScanData#getScanData <em>Scan Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scan Data</em>'.
	 * @see ca.gc.space.mrt.sensors.range.RasterScanData#getScanData()
	 * @see #getRasterScanData()
	 * @generated
	 */
	EReference getRasterScanData_ScanData();

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
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RangeFactory getRangeFactory();

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
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link ca.gc.space.mrt.sensors.range.impl.SimpleRangeSensorImpl <em>Simple Range Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.space.mrt.sensors.range.impl.SimpleRangeSensorImpl
		 * @see ca.gc.space.mrt.sensors.range.impl.RangePackageImpl#getSimpleRangeSensor()
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
		 * The meta object literal for the '{@link ca.gc.space.mrt.sensors.range.impl.ContactSensorImpl <em>Contact Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.space.mrt.sensors.range.impl.ContactSensorImpl
		 * @see ca.gc.space.mrt.sensors.range.impl.RangePackageImpl#getContactSensor()
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
		 * The meta object literal for the '{@link ca.gc.space.mrt.sensors.range.impl.SimpleSonarImpl <em>Simple Sonar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.space.mrt.sensors.range.impl.SimpleSonarImpl
		 * @see ca.gc.space.mrt.sensors.range.impl.RangePackageImpl#getSimpleSonar()
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
		 * The meta object literal for the '{@link ca.gc.space.mrt.sensors.range.impl.LineRangeScannerImpl <em>Line Range Scanner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.space.mrt.sensors.range.impl.LineRangeScannerImpl
		 * @see ca.gc.space.mrt.sensors.range.impl.RangePackageImpl#getLineRangeScanner()
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
		 * The meta object literal for the '{@link ca.gc.space.mrt.sensors.range.impl.SimpleLineRangeScannerImpl <em>Simple Line Range Scanner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.space.mrt.sensors.range.impl.SimpleLineRangeScannerImpl
		 * @see ca.gc.space.mrt.sensors.range.impl.RangePackageImpl#getSimpleLineRangeScanner()
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
		 * The meta object literal for the '{@link ca.gc.space.mrt.sensors.range.impl.RangeScannerImpl <em>Scanner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.space.mrt.sensors.range.impl.RangeScannerImpl
		 * @see ca.gc.space.mrt.sensors.range.impl.RangePackageImpl#getRangeScanner()
		 * @generated
		 */
		EClass RANGE_SCANNER = eINSTANCE.getRangeScanner();

		/**
		 * The meta object literal for the '{@link ca.gc.space.mrt.sensors.range.impl.RangeScannerSimulatorImpl <em>Scanner Simulator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.space.mrt.sensors.range.impl.RangeScannerSimulatorImpl
		 * @see ca.gc.space.mrt.sensors.range.impl.RangePackageImpl#getRangeScannerSimulator()
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
		 * The meta object literal for the '{@link ca.gc.space.mrt.sensors.range.impl.RayDataImpl <em>Ray Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.space.mrt.sensors.range.impl.RayDataImpl
		 * @see ca.gc.space.mrt.sensors.range.impl.RangePackageImpl#getRayData()
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
		 * The meta object literal for the '{@link ca.gc.space.mrt.sensors.range.impl.RasterScanRangeSensorImpl <em>Raster Scan Range Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.space.mrt.sensors.range.impl.RasterScanRangeSensorImpl
		 * @see ca.gc.space.mrt.sensors.range.impl.RangePackageImpl#getRasterScanRangeSensor()
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
		 * The meta object literal for the '{@link ca.gc.space.mrt.sensors.range.impl.SimpleRasterScanRangeScannerImpl <em>Simple Raster Scan Range Scanner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.space.mrt.sensors.range.impl.SimpleRasterScanRangeScannerImpl
		 * @see ca.gc.space.mrt.sensors.range.impl.RangePackageImpl#getSimpleRasterScanRangeScanner()
		 * @generated
		 */
		EClass SIMPLE_RASTER_SCAN_RANGE_SCANNER = eINSTANCE.getSimpleRasterScanRangeScanner();

		/**
		 * The meta object literal for the '{@link ca.gc.space.mrt.sensors.range.impl.SimpleRasterScanRangeScannerSimulatorImpl <em>Simple Raster Scan Range Scanner Simulator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.space.mrt.sensors.range.impl.SimpleRasterScanRangeScannerSimulatorImpl
		 * @see ca.gc.space.mrt.sensors.range.impl.RangePackageImpl#getSimpleRasterScanRangeScannerSimulator()
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
		 * The meta object literal for the '{@link ca.gc.space.mrt.sensors.range.impl.RangeSensorImpl <em>Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.space.mrt.sensors.range.impl.RangeSensorImpl
		 * @see ca.gc.space.mrt.sensors.range.impl.RangePackageImpl#getRangeSensor()
		 * @generated
		 */
		EClass RANGE_SENSOR = eINSTANCE.getRangeSensor();

		/**
		 * The meta object literal for the '{@link ca.gc.space.mrt.sensors.range.impl.RasterScanSettingsImpl <em>Raster Scan Settings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.space.mrt.sensors.range.impl.RasterScanSettingsImpl
		 * @see ca.gc.space.mrt.sensors.range.impl.RangePackageImpl#getRasterScanSettings()
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
		 * The meta object literal for the '{@link ca.gc.space.mrt.sensors.range.impl.SensorsRangeFacadeImpl <em>Sensors Range Facade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.space.mrt.sensors.range.impl.SensorsRangeFacadeImpl
		 * @see ca.gc.space.mrt.sensors.range.impl.RangePackageImpl#getSensorsRangeFacade()
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
		 * The meta object literal for the '{@link ca.gc.space.mrt.sensors.range.impl.RasterScanDataImpl <em>Raster Scan Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.space.mrt.sensors.range.impl.RasterScanDataImpl
		 * @see ca.gc.space.mrt.sensors.range.impl.RangePackageImpl#getRasterScanData()
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
		 * The meta object literal for the '<em>List</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see ca.gc.space.mrt.sensors.range.impl.RangePackageImpl#getList()
		 * @generated
		 */
		EDataType LIST = eINSTANCE.getList();

	}

} //RangePackage
