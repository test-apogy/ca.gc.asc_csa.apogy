/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.examples.satellite;

import ca.gc.asc_csa.eclipse.emf.ecore.EMFEcorePackage;
import ca.gc.space.mrt.sensors.imaging.MRTSensorsImagingPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.symphony.common.images.ImagesCorePackage;
import org.eclipse.symphony.core.invocator.EMFEcoreInvocatorPackage;

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
 * @see org.eclipse.symphony.examples.satellite.EMFEcoreExampleSatelliteFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='EMFEcoreExampleSatellite' copyrightText='Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)' modelName='EMFEcoreExampleSatellite' childCreationExtenders='true' extensibleProviderFactory='true' suppressGenModelAnnotations='false' modelDirectory='/org.eclipse.symphony.examples.satellite/src-generated' editDirectory='/org.eclipse.symphony.examples.satellite.edit/src-generated' basePackage='org.eclipse.symphony.examples'"
 * @generated
 */
public interface EMFEcoreExampleSatellitePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "satellite";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.eclipse.symphony.examples.satellite";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "satellite";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EMFEcoreExampleSatellitePackage eINSTANCE = org.eclipse.symphony.examples.satellite.impl.EMFEcoreExampleSatellitePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.examples.satellite.impl.SatelliteImpl <em>Satellite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.examples.satellite.impl.SatelliteImpl
	 * @see org.eclipse.symphony.examples.satellite.impl.EMFEcoreExampleSatellitePackageImpl#getSatellite()
	 * @generated
	 */
	int SATELLITE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE__NAME = EMFEcorePackage.NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Maximum Roll Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE__MAXIMUM_ROLL_RATE = EMFEcorePackage.NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Maximum Roll</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE__MAXIMUM_ROLL = EMFEcorePackage.NAMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Orbit Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE__ORBIT_MODEL = EMFEcorePackage.NAMED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Imager</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE__IMAGER = EMFEcorePackage.NAMED_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Satellite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_FEATURE_COUNT = EMFEcorePackage.NAMED_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Roll</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE___ROLL__DOUBLE = EMFEcorePackage.NAMED_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Acquire Image</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE___ACQUIRE_IMAGE__DOUBLE = EMFEcorePackage.NAMED_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Download Images</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE___DOWNLOAD_IMAGES__INT = EMFEcorePackage.NAMED_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Enqueue Satellite Command</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE___ENQUEUE_SATELLITE_COMMAND__SATELLITECOMMAND = EMFEcorePackage.NAMED_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Satellite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_OPERATION_COUNT = EMFEcorePackage.NAMED_OPERATION_COUNT + 4;


	/**
	 * The meta object id for the '{@link org.eclipse.symphony.examples.satellite.impl.SatelliteSimulatedImpl <em>Satellite Simulated</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.examples.satellite.impl.SatelliteSimulatedImpl
	 * @see org.eclipse.symphony.examples.satellite.impl.EMFEcoreExampleSatellitePackageImpl#getSatelliteSimulated()
	 * @generated
	 */
	int SATELLITE_SIMULATED = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_SIMULATED__NAME = SATELLITE__NAME;

	/**
	 * The feature id for the '<em><b>Maximum Roll Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_SIMULATED__MAXIMUM_ROLL_RATE = SATELLITE__MAXIMUM_ROLL_RATE;

	/**
	 * The feature id for the '<em><b>Maximum Roll</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_SIMULATED__MAXIMUM_ROLL = SATELLITE__MAXIMUM_ROLL;

	/**
	 * The feature id for the '<em><b>Orbit Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_SIMULATED__ORBIT_MODEL = SATELLITE__ORBIT_MODEL;

	/**
	 * The feature id for the '<em><b>Imager</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_SIMULATED__IMAGER = SATELLITE__IMAGER;

	/**
	 * The number of structural features of the '<em>Satellite Simulated</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_SIMULATED_FEATURE_COUNT = SATELLITE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Roll</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_SIMULATED___ROLL__DOUBLE = SATELLITE___ROLL__DOUBLE;

	/**
	 * The operation id for the '<em>Acquire Image</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_SIMULATED___ACQUIRE_IMAGE__DOUBLE = SATELLITE___ACQUIRE_IMAGE__DOUBLE;

	/**
	 * The operation id for the '<em>Download Images</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_SIMULATED___DOWNLOAD_IMAGES__INT = SATELLITE___DOWNLOAD_IMAGES__INT;

	/**
	 * The operation id for the '<em>Enqueue Satellite Command</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_SIMULATED___ENQUEUE_SATELLITE_COMMAND__SATELLITECOMMAND = SATELLITE___ENQUEUE_SATELLITE_COMMAND__SATELLITECOMMAND;

	/**
	 * The number of operations of the '<em>Satellite Simulated</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_SIMULATED_OPERATION_COUNT = SATELLITE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.examples.satellite.impl.SatelliteStubImpl <em>Satellite Stub</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.examples.satellite.impl.SatelliteStubImpl
	 * @see org.eclipse.symphony.examples.satellite.impl.EMFEcoreExampleSatellitePackageImpl#getSatelliteStub()
	 * @generated
	 */
	int SATELLITE_STUB = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_STUB__NAME = SATELLITE__NAME;

	/**
	 * The feature id for the '<em><b>Maximum Roll Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_STUB__MAXIMUM_ROLL_RATE = SATELLITE__MAXIMUM_ROLL_RATE;

	/**
	 * The feature id for the '<em><b>Maximum Roll</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_STUB__MAXIMUM_ROLL = SATELLITE__MAXIMUM_ROLL;

	/**
	 * The feature id for the '<em><b>Orbit Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_STUB__ORBIT_MODEL = SATELLITE__ORBIT_MODEL;

	/**
	 * The feature id for the '<em><b>Imager</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_STUB__IMAGER = SATELLITE__IMAGER;

	/**
	 * The number of structural features of the '<em>Satellite Stub</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_STUB_FEATURE_COUNT = SATELLITE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Roll</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_STUB___ROLL__DOUBLE = SATELLITE___ROLL__DOUBLE;

	/**
	 * The operation id for the '<em>Acquire Image</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_STUB___ACQUIRE_IMAGE__DOUBLE = SATELLITE___ACQUIRE_IMAGE__DOUBLE;

	/**
	 * The operation id for the '<em>Download Images</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_STUB___DOWNLOAD_IMAGES__INT = SATELLITE___DOWNLOAD_IMAGES__INT;

	/**
	 * The operation id for the '<em>Enqueue Satellite Command</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_STUB___ENQUEUE_SATELLITE_COMMAND__SATELLITECOMMAND = SATELLITE___ENQUEUE_SATELLITE_COMMAND__SATELLITECOMMAND;

	/**
	 * The number of operations of the '<em>Satellite Stub</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_STUB_OPERATION_COUNT = SATELLITE_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.eclipse.symphony.examples.satellite.impl.SatelliteCommandImpl <em>Satellite Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.examples.satellite.impl.SatelliteCommandImpl
	 * @see org.eclipse.symphony.examples.satellite.impl.EMFEcoreExampleSatellitePackageImpl#getSatelliteCommand()
	 * @generated
	 */
	int SATELLITE_COMMAND = 3;

	/**
	 * The feature id for the '<em><b>Satellite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_COMMAND__SATELLITE = 0;

	/**
	 * The feature id for the '<em><b>Command Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_COMMAND__COMMAND_START_TIME = 1;

	/**
	 * The number of structural features of the '<em>Satellite Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_COMMAND_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Satellite Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_COMMAND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.examples.satellite.impl.SatelliteCommandListImpl <em>Satellite Command List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.examples.satellite.impl.SatelliteCommandListImpl
	 * @see org.eclipse.symphony.examples.satellite.impl.EMFEcoreExampleSatellitePackageImpl#getSatelliteCommandList()
	 * @generated
	 */
	int SATELLITE_COMMAND_LIST = 4;

	/**
	 * The feature id for the '<em><b>Commands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_COMMAND_LIST__COMMANDS = 0;

	/**
	 * The number of structural features of the '<em>Satellite Command List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_COMMAND_LIST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Satellite Command List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_COMMAND_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.examples.satellite.impl.SatelliteCommandRollImpl <em>Satellite Command Roll</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.examples.satellite.impl.SatelliteCommandRollImpl
	 * @see org.eclipse.symphony.examples.satellite.impl.EMFEcoreExampleSatellitePackageImpl#getSatelliteCommandRoll()
	 * @generated
	 */
	int SATELLITE_COMMAND_ROLL = 5;

	/**
	 * The feature id for the '<em><b>Satellite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_COMMAND_ROLL__SATELLITE = SATELLITE_COMMAND__SATELLITE;

	/**
	 * The feature id for the '<em><b>Command Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_COMMAND_ROLL__COMMAND_START_TIME = SATELLITE_COMMAND__COMMAND_START_TIME;

	/**
	 * The feature id for the '<em><b>Target Roll Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_COMMAND_ROLL__TARGET_ROLL_ANGLE = SATELLITE_COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Satellite Command Roll</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_COMMAND_ROLL_FEATURE_COUNT = SATELLITE_COMMAND_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Satellite Command Roll</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_COMMAND_ROLL_OPERATION_COUNT = SATELLITE_COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.examples.satellite.impl.SatelliteCommandAcquireImageImpl <em>Satellite Command Acquire Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.examples.satellite.impl.SatelliteCommandAcquireImageImpl
	 * @see org.eclipse.symphony.examples.satellite.impl.EMFEcoreExampleSatellitePackageImpl#getSatelliteCommandAcquireImage()
	 * @generated
	 */
	int SATELLITE_COMMAND_ACQUIRE_IMAGE = 6;

	/**
	 * The feature id for the '<em><b>Satellite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_COMMAND_ACQUIRE_IMAGE__SATELLITE = SATELLITE_COMMAND__SATELLITE;

	/**
	 * The feature id for the '<em><b>Command Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_COMMAND_ACQUIRE_IMAGE__COMMAND_START_TIME = SATELLITE_COMMAND__COMMAND_START_TIME;

	/**
	 * The feature id for the '<em><b>Image Order</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_COMMAND_ACQUIRE_IMAGE__IMAGE_ORDER = SATELLITE_COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Satellite Command Acquire Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_COMMAND_ACQUIRE_IMAGE_FEATURE_COUNT = SATELLITE_COMMAND_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Satellite Command Acquire Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_COMMAND_ACQUIRE_IMAGE_OPERATION_COUNT = SATELLITE_COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.examples.satellite.impl.ImageOrderImpl <em>Image Order</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.examples.satellite.impl.ImageOrderImpl
	 * @see org.eclipse.symphony.examples.satellite.impl.EMFEcoreExampleSatellitePackageImpl#getImageOrder()
	 * @generated
	 */
	int IMAGE_ORDER = 7;

	/**
	 * The feature id for the '<em><b>Order Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ORDER__ORDER_ID = 0;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ORDER__PRIORITY = 1;

	/**
	 * The feature id for the '<em><b>Image Center</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ORDER__IMAGE_CENTER = 2;

	/**
	 * The feature id for the '<em><b>Commanded Zoom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ORDER__COMMANDED_ZOOM = 3;

	/**
	 * The number of structural features of the '<em>Image Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ORDER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Image Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ORDER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.examples.satellite.impl.SatelliteImagerImpl <em>Satellite Imager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.examples.satellite.impl.SatelliteImagerImpl
	 * @see org.eclipse.symphony.examples.satellite.impl.EMFEcoreExampleSatellitePackageImpl#getSatelliteImager()
	 * @generated
	 */
	int SATELLITE_IMAGER = 8;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_IMAGER__PARENT = MRTSensorsImagingPackage.ABSTRACT_CAMERA__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_IMAGER__DESCRIPTION = MRTSensorsImagingPackage.ABSTRACT_CAMERA__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_IMAGER__NODE_ID = MRTSensorsImagingPackage.ABSTRACT_CAMERA__NODE_ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_IMAGER__CHILDREN = MRTSensorsImagingPackage.ABSTRACT_CAMERA__CHILDREN;

	/**
	 * The feature id for the '<em><b>Aggregated Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_IMAGER__AGGREGATED_CHILDREN = MRTSensorsImagingPackage.ABSTRACT_CAMERA__AGGREGATED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_IMAGER__STATUS = MRTSensorsImagingPackage.ABSTRACT_CAMERA__STATUS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_IMAGER__NAME = MRTSensorsImagingPackage.ABSTRACT_CAMERA__NAME;

	/**
	 * The feature id for the '<em><b>Latest Image Snapshot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_IMAGER__LATEST_IMAGE_SNAPSHOT = MRTSensorsImagingPackage.ABSTRACT_CAMERA__LATEST_IMAGE_SNAPSHOT;

	/**
	 * The feature id for the '<em><b>Current Zoom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_IMAGER__CURRENT_ZOOM = MRTSensorsImagingPackage.ABSTRACT_CAMERA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Commanded Zoom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_IMAGER__COMMANDED_ZOOM = MRTSensorsImagingPackage.ABSTRACT_CAMERA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Satellite</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_IMAGER__SATELLITE = MRTSensorsImagingPackage.ABSTRACT_CAMERA_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Images Acquired</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_IMAGER__IMAGES_ACQUIRED = MRTSensorsImagingPackage.ABSTRACT_CAMERA_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Satellite Imager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_IMAGER_FEATURE_COUNT = MRTSensorsImagingPackage.ABSTRACT_CAMERA_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_IMAGER___ACCEPT__INODEVISITOR = MRTSensorsImagingPackage.ABSTRACT_CAMERA___ACCEPT__INODEVISITOR;

	/**
	 * The operation id for the '<em>Take Snapshot</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_IMAGER___TAKE_SNAPSHOT = MRTSensorsImagingPackage.ABSTRACT_CAMERA___TAKE_SNAPSHOT;

	/**
	 * The operation id for the '<em>Get Field Of View</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_IMAGER___GET_FIELD_OF_VIEW = MRTSensorsImagingPackage.ABSTRACT_CAMERA___GET_FIELD_OF_VIEW;

	/**
	 * The operation id for the '<em>Command Zoom</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_IMAGER___COMMAND_ZOOM__DOUBLE = MRTSensorsImagingPackage.ABSTRACT_CAMERA_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Minimum Zoom</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_IMAGER___GET_MINIMUM_ZOOM = MRTSensorsImagingPackage.ABSTRACT_CAMERA_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Maximum Zoom</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_IMAGER___GET_MAXIMUM_ZOOM = MRTSensorsImagingPackage.ABSTRACT_CAMERA_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Download Images</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_IMAGER___DOWNLOAD_IMAGES__INT = MRTSensorsImagingPackage.ABSTRACT_CAMERA_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Satellite Imager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_IMAGER_OPERATION_COUNT = MRTSensorsImagingPackage.ABSTRACT_CAMERA_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.examples.satellite.impl.OrbitalImageImpl <em>Orbital Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.examples.satellite.impl.OrbitalImageImpl
	 * @see org.eclipse.symphony.examples.satellite.impl.EMFEcoreExampleSatellitePackageImpl#getOrbitalImage()
	 * @generated
	 */
	int ORBITAL_IMAGE = 9;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORBITAL_IMAGE__WIDTH = ImagesCorePackage.ABSTRACT_EIMAGE__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORBITAL_IMAGE__HEIGHT = ImagesCorePackage.ABSTRACT_EIMAGE__HEIGHT;

	/**
	 * The feature id for the '<em><b>Order Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORBITAL_IMAGE__ORDER_ID = ImagesCorePackage.ABSTRACT_EIMAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Image Center</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORBITAL_IMAGE__IMAGE_CENTER = ImagesCorePackage.ABSTRACT_EIMAGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Download Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORBITAL_IMAGE__DOWNLOAD_SIZE = ImagesCorePackage.ABSTRACT_EIMAGE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Orbital Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORBITAL_IMAGE_FEATURE_COUNT = ImagesCorePackage.ABSTRACT_EIMAGE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>As Buffered Image</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORBITAL_IMAGE___AS_BUFFERED_IMAGE = ImagesCorePackage.ABSTRACT_EIMAGE___AS_BUFFERED_IMAGE;

	/**
	 * The number of operations of the '<em>Orbital Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORBITAL_IMAGE_OPERATION_COUNT = ImagesCorePackage.ABSTRACT_EIMAGE_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.eclipse.symphony.examples.satellite.impl.SatelliteConstellationImpl <em>Satellite Constellation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.examples.satellite.impl.SatelliteConstellationImpl
	 * @see org.eclipse.symphony.examples.satellite.impl.EMFEcoreExampleSatellitePackageImpl#getSatelliteConstellation()
	 * @generated
	 */
	int SATELLITE_CONSTELLATION = 10;

	/**
	 * The feature id for the '<em><b>Satellites</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_CONSTELLATION__SATELLITES = 0;

	/**
	 * The feature id for the '<em><b>Ground Stations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_CONSTELLATION__GROUND_STATIONS = 1;

	/**
	 * The feature id for the '<em><b>Pending Image Orders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_CONSTELLATION__PENDING_IMAGE_ORDERS = 2;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_CONSTELLATION__START_DATE = 3;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_CONSTELLATION__END_DATE = 4;

	/**
	 * The number of structural features of the '<em>Satellite Constellation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_CONSTELLATION_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Get Satellite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_CONSTELLATION___GET_SATELLITE__ORBITMODEL = 0;

	/**
	 * The operation id for the '<em>Get Target Passes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_CONSTELLATION___GET_TARGET_PASSES__IMAGEORDER_DATE_DATE_ELEVATIONMASK = 1;

	/**
	 * The operation id for the '<em>Get Ground Station Passes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_CONSTELLATION___GET_GROUND_STATION_PASSES__SATELLITE_DATE_DATE_ELEVATIONMASK = 2;

	/**
	 * The operation id for the '<em>Plan</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_CONSTELLATION___PLAN__LIST_DATE_DATE = 3;

	/**
	 * The operation id for the '<em>Plan</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_CONSTELLATION___PLAN__DATE_DATE = 4;

	/**
	 * The operation id for the '<em>Plan</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_CONSTELLATION___PLAN = 5;

	/**
	 * The number of operations of the '<em>Satellite Constellation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_CONSTELLATION_OPERATION_COUNT = 6;


	/**
	 * The meta object id for the '{@link org.eclipse.symphony.examples.satellite.impl.SatelliteConstellationInitializationDataImpl <em>Satellite Constellation Initialization Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.examples.satellite.impl.SatelliteConstellationInitializationDataImpl
	 * @see org.eclipse.symphony.examples.satellite.impl.EMFEcoreExampleSatellitePackageImpl#getSatelliteConstellationInitializationData()
	 * @generated
	 */
	int SATELLITE_CONSTELLATION_INITIALIZATION_DATA = 13;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.examples.satellite.impl.SatelliteConstellationTypeApiAdapterImpl <em>Satellite Constellation Type Api Adapter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.examples.satellite.impl.SatelliteConstellationTypeApiAdapterImpl
	 * @see org.eclipse.symphony.examples.satellite.impl.EMFEcoreExampleSatellitePackageImpl#getSatelliteConstellationTypeApiAdapter()
	 * @generated
	 */
	int SATELLITE_CONSTELLATION_TYPE_API_ADAPTER = 12;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.examples.satellite.impl.SatelliteInitializationDataImpl <em>Satellite Initialization Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.examples.satellite.impl.SatelliteInitializationDataImpl
	 * @see org.eclipse.symphony.examples.satellite.impl.EMFEcoreExampleSatellitePackageImpl#getSatelliteInitializationData()
	 * @generated
	 */
	int SATELLITE_INITIALIZATION_DATA = 14;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.examples.satellite.impl.SatelliteUtilsImpl <em>Satellite Utils</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.examples.satellite.impl.SatelliteUtilsImpl
	 * @see org.eclipse.symphony.examples.satellite.impl.EMFEcoreExampleSatellitePackageImpl#getSatelliteUtils()
	 * @generated
	 */
	int SATELLITE_UTILS = 11;

	/**
	 * The number of structural features of the '<em>Satellite Utils</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_UTILS_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Create Satellite Command Roll</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_UTILS___CREATE_SATELLITE_COMMAND_ROLL__SATELLITE_DATE_DOUBLE = 0;

	/**
	 * The operation id for the '<em>Create Satellite Command Acquire Image</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_UTILS___CREATE_SATELLITE_COMMAND_ACQUIRE_IMAGE__SATELLITE_DATE_IMAGEORDER = 1;

	/**
	 * The operation id for the '<em>Sort Image Order By Priority</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_UTILS___SORT_IMAGE_ORDER_BY_PRIORITY__LIST = 2;

	/**
	 * The number of operations of the '<em>Satellite Utils</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_UTILS_OPERATION_COUNT = 3;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_CONSTELLATION_TYPE_API_ADAPTER__ENVIRONMENT = EMFEcoreInvocatorPackage.TYPE_API_ADAPTER__ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_CONSTELLATION_TYPE_API_ADAPTER__INSTANCE = EMFEcoreInvocatorPackage.TYPE_API_ADAPTER__INSTANCE;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_CONSTELLATION_TYPE_API_ADAPTER__ELEMENT_TYPE = EMFEcoreInvocatorPackage.TYPE_API_ADAPTER__ELEMENT_TYPE;

	/**
	 * The number of structural features of the '<em>Satellite Constellation Type Api Adapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_CONSTELLATION_TYPE_API_ADAPTER_FEATURE_COUNT = EMFEcoreInvocatorPackage.TYPE_API_ADAPTER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_CONSTELLATION_TYPE_API_ADAPTER___INIT__ENVIRONMENT_TYPE_EOBJECT = EMFEcoreInvocatorPackage.TYPE_API_ADAPTER___INIT__ENVIRONMENT_TYPE_EOBJECT;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_CONSTELLATION_TYPE_API_ADAPTER___APPLY__ABSTRACTINITIALIZATIONDATA = EMFEcoreInvocatorPackage.TYPE_API_ADAPTER___APPLY__ABSTRACTINITIALIZATIONDATA;

	/**
	 * The operation id for the '<em>Create Initialization Data</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_CONSTELLATION_TYPE_API_ADAPTER___CREATE_INITIALIZATION_DATA = EMFEcoreInvocatorPackage.TYPE_API_ADAPTER___CREATE_INITIALIZATION_DATA;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_CONSTELLATION_TYPE_API_ADAPTER___COLLECT__ABSTRACTINITIALIZATIONDATA = EMFEcoreInvocatorPackage.TYPE_API_ADAPTER___COLLECT__ABSTRACTINITIALIZATIONDATA;

	/**
	 * The operation id for the '<em>Create Result</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_CONSTELLATION_TYPE_API_ADAPTER___CREATE_RESULT__OPERATIONCALL = EMFEcoreInvocatorPackage.TYPE_API_ADAPTER___CREATE_RESULT__OPERATIONCALL;

	/**
	 * The operation id for the '<em>Create Result</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_CONSTELLATION_TYPE_API_ADAPTER___CREATE_RESULT__OPERATIONCALL_LONG_OBJECT_EXCEPTION = EMFEcoreInvocatorPackage.TYPE_API_ADAPTER___CREATE_RESULT__OPERATIONCALL_LONG_OBJECT_EXCEPTION;

	/**
	 * The operation id for the '<em>Invoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_CONSTELLATION_TYPE_API_ADAPTER___INVOKE__EOBJECT_OPERATIONCALL_BOOLEAN = EMFEcoreInvocatorPackage.TYPE_API_ADAPTER___INVOKE__EOBJECT_OPERATIONCALL_BOOLEAN;

	/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_CONSTELLATION_TYPE_API_ADAPTER___DISPOSE = EMFEcoreInvocatorPackage.TYPE_API_ADAPTER___DISPOSE;

	/**
	 * The number of operations of the '<em>Satellite Constellation Type Api Adapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_CONSTELLATION_TYPE_API_ADAPTER_OPERATION_COUNT = EMFEcoreInvocatorPackage.TYPE_API_ADAPTER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Satellite Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_CONSTELLATION_INITIALIZATION_DATA__SATELLITE_DATA = EMFEcoreInvocatorPackage.ABSTRACT_INITIALIZATION_DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ground Stations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_CONSTELLATION_INITIALIZATION_DATA__GROUND_STATIONS = EMFEcoreInvocatorPackage.ABSTRACT_INITIALIZATION_DATA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Pending Image Orders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_CONSTELLATION_INITIALIZATION_DATA__PENDING_IMAGE_ORDERS = EMFEcoreInvocatorPackage.ABSTRACT_INITIALIZATION_DATA_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Satellite Constellation Initialization Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_CONSTELLATION_INITIALIZATION_DATA_FEATURE_COUNT = EMFEcoreInvocatorPackage.ABSTRACT_INITIALIZATION_DATA_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Satellite Constellation Initialization Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_CONSTELLATION_INITIALIZATION_DATA_OPERATION_COUNT = EMFEcoreInvocatorPackage.ABSTRACT_INITIALIZATION_DATA_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Satellite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_INITIALIZATION_DATA__SATELLITE = EMFEcoreInvocatorPackage.ABSTRACT_INITIALIZATION_DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Orbit Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_INITIALIZATION_DATA__ORBIT_MODEL = EMFEcoreInvocatorPackage.ABSTRACT_INITIALIZATION_DATA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Satellite Initialization Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_INITIALIZATION_DATA_FEATURE_COUNT = EMFEcoreInvocatorPackage.ABSTRACT_INITIALIZATION_DATA_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Satellite Initialization Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_INITIALIZATION_DATA_OPERATION_COUNT = EMFEcoreInvocatorPackage.ABSTRACT_INITIALIZATION_DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '<em>List</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.eclipse.symphony.examples.satellite.impl.EMFEcoreExampleSatellitePackageImpl#getList()
	 * @generated
	 */
	int LIST = 15;


	/**
	 * The meta object id for the '<em>Sorted Set</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.SortedSet
	 * @see org.eclipse.symphony.examples.satellite.impl.EMFEcoreExampleSatellitePackageImpl#getSortedSet()
	 * @generated
	 */
	int SORTED_SET = 16;

	/**
	 * The meta object id for the '<em>Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Exception
	 * @see org.eclipse.symphony.examples.satellite.impl.EMFEcoreExampleSatellitePackageImpl#getException()
	 * @generated
	 */
	int EXCEPTION = 17;


	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.examples.satellite.Satellite <em>Satellite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Satellite</em>'.
	 * @see org.eclipse.symphony.examples.satellite.Satellite
	 * @generated
	 */
	EClass getSatellite();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.examples.satellite.Satellite#getMaximumRollRate <em>Maximum Roll Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Roll Rate</em>'.
	 * @see org.eclipse.symphony.examples.satellite.Satellite#getMaximumRollRate()
	 * @see #getSatellite()
	 * @generated
	 */
	EAttribute getSatellite_MaximumRollRate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.examples.satellite.Satellite#getMaximumRoll <em>Maximum Roll</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Roll</em>'.
	 * @see org.eclipse.symphony.examples.satellite.Satellite#getMaximumRoll()
	 * @see #getSatellite()
	 * @generated
	 */
	EAttribute getSatellite_MaximumRoll();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.examples.satellite.Satellite#getOrbitModel <em>Orbit Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Orbit Model</em>'.
	 * @see org.eclipse.symphony.examples.satellite.Satellite#getOrbitModel()
	 * @see #getSatellite()
	 * @generated
	 */
	EReference getSatellite_OrbitModel();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.examples.satellite.Satellite#getImager <em>Imager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Imager</em>'.
	 * @see org.eclipse.symphony.examples.satellite.Satellite#getImager()
	 * @see #getSatellite()
	 * @generated
	 */
	EReference getSatellite_Imager();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.examples.satellite.Satellite#roll(double) <em>Roll</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Roll</em>' operation.
	 * @see org.eclipse.symphony.examples.satellite.Satellite#roll(double)
	 * @generated
	 */
	EOperation getSatellite__Roll__double();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.examples.satellite.Satellite#acquireImage(double) <em>Acquire Image</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Acquire Image</em>' operation.
	 * @see org.eclipse.symphony.examples.satellite.Satellite#acquireImage(double)
	 * @generated
	 */
	EOperation getSatellite__AcquireImage__double();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.examples.satellite.Satellite#downloadImages(int) <em>Download Images</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Download Images</em>' operation.
	 * @see org.eclipse.symphony.examples.satellite.Satellite#downloadImages(int)
	 * @generated
	 */
	EOperation getSatellite__DownloadImages__int();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.examples.satellite.Satellite#enqueueSatelliteCommand(org.eclipse.symphony.examples.satellite.SatelliteCommand) <em>Enqueue Satellite Command</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Enqueue Satellite Command</em>' operation.
	 * @see org.eclipse.symphony.examples.satellite.Satellite#enqueueSatelliteCommand(org.eclipse.symphony.examples.satellite.SatelliteCommand)
	 * @generated
	 */
	EOperation getSatellite__EnqueueSatelliteCommand__SatelliteCommand();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.examples.satellite.SatelliteSimulated <em>Satellite Simulated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Satellite Simulated</em>'.
	 * @see org.eclipse.symphony.examples.satellite.SatelliteSimulated
	 * @generated
	 */
	EClass getSatelliteSimulated();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.examples.satellite.SatelliteStub <em>Satellite Stub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Satellite Stub</em>'.
	 * @see org.eclipse.symphony.examples.satellite.SatelliteStub
	 * @generated
	 */
	EClass getSatelliteStub();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.examples.satellite.SatelliteCommand <em>Satellite Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Satellite Command</em>'.
	 * @see org.eclipse.symphony.examples.satellite.SatelliteCommand
	 * @generated
	 */
	EClass getSatelliteCommand();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.examples.satellite.SatelliteCommand#getSatellite <em>Satellite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Satellite</em>'.
	 * @see org.eclipse.symphony.examples.satellite.SatelliteCommand#getSatellite()
	 * @see #getSatelliteCommand()
	 * @generated
	 */
	EReference getSatelliteCommand_Satellite();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.examples.satellite.SatelliteCommand#getCommandStartTime <em>Command Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Command Start Time</em>'.
	 * @see org.eclipse.symphony.examples.satellite.SatelliteCommand#getCommandStartTime()
	 * @see #getSatelliteCommand()
	 * @generated
	 */
	EAttribute getSatelliteCommand_CommandStartTime();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.examples.satellite.SatelliteCommandList <em>Satellite Command List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Satellite Command List</em>'.
	 * @see org.eclipse.symphony.examples.satellite.SatelliteCommandList
	 * @generated
	 */
	EClass getSatelliteCommandList();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.symphony.examples.satellite.SatelliteCommandList#getCommands <em>Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Commands</em>'.
	 * @see org.eclipse.symphony.examples.satellite.SatelliteCommandList#getCommands()
	 * @see #getSatelliteCommandList()
	 * @generated
	 */
	EReference getSatelliteCommandList_Commands();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.examples.satellite.SatelliteCommandRoll <em>Satellite Command Roll</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Satellite Command Roll</em>'.
	 * @see org.eclipse.symphony.examples.satellite.SatelliteCommandRoll
	 * @generated
	 */
	EClass getSatelliteCommandRoll();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.examples.satellite.SatelliteCommandRoll#getTargetRollAngle <em>Target Roll Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Roll Angle</em>'.
	 * @see org.eclipse.symphony.examples.satellite.SatelliteCommandRoll#getTargetRollAngle()
	 * @see #getSatelliteCommandRoll()
	 * @generated
	 */
	EAttribute getSatelliteCommandRoll_TargetRollAngle();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.examples.satellite.SatelliteCommandAcquireImage <em>Satellite Command Acquire Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Satellite Command Acquire Image</em>'.
	 * @see org.eclipse.symphony.examples.satellite.SatelliteCommandAcquireImage
	 * @generated
	 */
	EClass getSatelliteCommandAcquireImage();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.examples.satellite.SatelliteCommandAcquireImage#getImageOrder <em>Image Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Image Order</em>'.
	 * @see org.eclipse.symphony.examples.satellite.SatelliteCommandAcquireImage#getImageOrder()
	 * @see #getSatelliteCommandAcquireImage()
	 * @generated
	 */
	EReference getSatelliteCommandAcquireImage_ImageOrder();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.examples.satellite.ImageOrder <em>Image Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image Order</em>'.
	 * @see org.eclipse.symphony.examples.satellite.ImageOrder
	 * @generated
	 */
	EClass getImageOrder();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.examples.satellite.ImageOrder#getOrderId <em>Order Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Id</em>'.
	 * @see org.eclipse.symphony.examples.satellite.ImageOrder#getOrderId()
	 * @see #getImageOrder()
	 * @generated
	 */
	EAttribute getImageOrder_OrderId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.examples.satellite.ImageOrder#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see org.eclipse.symphony.examples.satellite.ImageOrder#getPriority()
	 * @see #getImageOrder()
	 * @generated
	 */
	EAttribute getImageOrder_Priority();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.examples.satellite.ImageOrder#getImageCenter <em>Image Center</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Image Center</em>'.
	 * @see org.eclipse.symphony.examples.satellite.ImageOrder#getImageCenter()
	 * @see #getImageOrder()
	 * @generated
	 */
	EReference getImageOrder_ImageCenter();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.examples.satellite.ImageOrder#getCommandedZoom <em>Commanded Zoom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Commanded Zoom</em>'.
	 * @see org.eclipse.symphony.examples.satellite.ImageOrder#getCommandedZoom()
	 * @see #getImageOrder()
	 * @generated
	 */
	EAttribute getImageOrder_CommandedZoom();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.examples.satellite.SatelliteImager <em>Satellite Imager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Satellite Imager</em>'.
	 * @see org.eclipse.symphony.examples.satellite.SatelliteImager
	 * @generated
	 */
	EClass getSatelliteImager();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.symphony.examples.satellite.SatelliteImager#getSatellite <em>Satellite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Satellite</em>'.
	 * @see org.eclipse.symphony.examples.satellite.SatelliteImager#getSatellite()
	 * @see #getSatelliteImager()
	 * @generated
	 */
	EReference getSatelliteImager_Satellite();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.symphony.examples.satellite.SatelliteImager#getImagesAcquired <em>Images Acquired</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Images Acquired</em>'.
	 * @see org.eclipse.symphony.examples.satellite.SatelliteImager#getImagesAcquired()
	 * @see #getSatelliteImager()
	 * @generated
	 */
	EReference getSatelliteImager_ImagesAcquired();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.examples.satellite.SatelliteImager#downloadImages(int) <em>Download Images</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Download Images</em>' operation.
	 * @see org.eclipse.symphony.examples.satellite.SatelliteImager#downloadImages(int)
	 * @generated
	 */
	EOperation getSatelliteImager__DownloadImages__int();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.examples.satellite.OrbitalImage <em>Orbital Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orbital Image</em>'.
	 * @see org.eclipse.symphony.examples.satellite.OrbitalImage
	 * @generated
	 */
	EClass getOrbitalImage();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.examples.satellite.OrbitalImage#getOrderId <em>Order Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Id</em>'.
	 * @see org.eclipse.symphony.examples.satellite.OrbitalImage#getOrderId()
	 * @see #getOrbitalImage()
	 * @generated
	 */
	EAttribute getOrbitalImage_OrderId();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.examples.satellite.OrbitalImage#getImageCenter <em>Image Center</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Image Center</em>'.
	 * @see org.eclipse.symphony.examples.satellite.OrbitalImage#getImageCenter()
	 * @see #getOrbitalImage()
	 * @generated
	 */
	EReference getOrbitalImage_ImageCenter();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.examples.satellite.OrbitalImage#getDownloadSize <em>Download Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Download Size</em>'.
	 * @see org.eclipse.symphony.examples.satellite.OrbitalImage#getDownloadSize()
	 * @see #getOrbitalImage()
	 * @generated
	 */
	EAttribute getOrbitalImage_DownloadSize();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.examples.satellite.SatelliteConstellation <em>Satellite Constellation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Satellite Constellation</em>'.
	 * @see org.eclipse.symphony.examples.satellite.SatelliteConstellation
	 * @generated
	 */
	EClass getSatelliteConstellation();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.symphony.examples.satellite.SatelliteConstellation#getSatellites <em>Satellites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Satellites</em>'.
	 * @see org.eclipse.symphony.examples.satellite.SatelliteConstellation#getSatellites()
	 * @see #getSatelliteConstellation()
	 * @generated
	 */
	EReference getSatelliteConstellation_Satellites();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.symphony.examples.satellite.SatelliteConstellation#getGroundStations <em>Ground Stations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ground Stations</em>'.
	 * @see org.eclipse.symphony.examples.satellite.SatelliteConstellation#getGroundStations()
	 * @see #getSatelliteConstellation()
	 * @generated
	 */
	EReference getSatelliteConstellation_GroundStations();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.symphony.examples.satellite.SatelliteConstellation#getPendingImageOrders <em>Pending Image Orders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pending Image Orders</em>'.
	 * @see org.eclipse.symphony.examples.satellite.SatelliteConstellation#getPendingImageOrders()
	 * @see #getSatelliteConstellation()
	 * @generated
	 */
	EReference getSatelliteConstellation_PendingImageOrders();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.examples.satellite.SatelliteConstellation#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see org.eclipse.symphony.examples.satellite.SatelliteConstellation#getStartDate()
	 * @see #getSatelliteConstellation()
	 * @generated
	 */
	EAttribute getSatelliteConstellation_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.examples.satellite.SatelliteConstellation#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see org.eclipse.symphony.examples.satellite.SatelliteConstellation#getEndDate()
	 * @see #getSatelliteConstellation()
	 * @generated
	 */
	EAttribute getSatelliteConstellation_EndDate();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.examples.satellite.SatelliteConstellation#getSatellite(ca.gc.asc_csa.symphony.environment.orbit.OrbitModel) <em>Get Satellite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Satellite</em>' operation.
	 * @see org.eclipse.symphony.examples.satellite.SatelliteConstellation#getSatellite(ca.gc.asc_csa.symphony.environment.orbit.OrbitModel)
	 * @generated
	 */
	EOperation getSatelliteConstellation__GetSatellite__OrbitModel();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.examples.satellite.SatelliteConstellation#getTargetPasses(org.eclipse.symphony.examples.satellite.ImageOrder, java.util.Date, java.util.Date, ca.gc.asc_csa.symphony.environment.orbit.earth.ElevationMask) <em>Get Target Passes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Target Passes</em>' operation.
	 * @see org.eclipse.symphony.examples.satellite.SatelliteConstellation#getTargetPasses(org.eclipse.symphony.examples.satellite.ImageOrder, java.util.Date, java.util.Date, ca.gc.asc_csa.symphony.environment.orbit.earth.ElevationMask)
	 * @generated
	 */
	EOperation getSatelliteConstellation__GetTargetPasses__ImageOrder_Date_Date_ElevationMask();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.examples.satellite.SatelliteConstellation#getGroundStationPasses(org.eclipse.symphony.examples.satellite.Satellite, java.util.Date, java.util.Date, ca.gc.asc_csa.symphony.environment.orbit.earth.ElevationMask) <em>Get Ground Station Passes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Ground Station Passes</em>' operation.
	 * @see org.eclipse.symphony.examples.satellite.SatelliteConstellation#getGroundStationPasses(org.eclipse.symphony.examples.satellite.Satellite, java.util.Date, java.util.Date, ca.gc.asc_csa.symphony.environment.orbit.earth.ElevationMask)
	 * @generated
	 */
	EOperation getSatelliteConstellation__GetGroundStationPasses__Satellite_Date_Date_ElevationMask();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.examples.satellite.SatelliteConstellation#plan(java.util.List, java.util.Date, java.util.Date) <em>Plan</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Plan</em>' operation.
	 * @see org.eclipse.symphony.examples.satellite.SatelliteConstellation#plan(java.util.List, java.util.Date, java.util.Date)
	 * @generated
	 */
	EOperation getSatelliteConstellation__Plan__List_Date_Date();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.examples.satellite.SatelliteConstellation#plan(java.util.Date, java.util.Date) <em>Plan</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Plan</em>' operation.
	 * @see org.eclipse.symphony.examples.satellite.SatelliteConstellation#plan(java.util.Date, java.util.Date)
	 * @generated
	 */
	EOperation getSatelliteConstellation__Plan__Date_Date();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.examples.satellite.SatelliteConstellation#plan() <em>Plan</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Plan</em>' operation.
	 * @see org.eclipse.symphony.examples.satellite.SatelliteConstellation#plan()
	 * @generated
	 */
	EOperation getSatelliteConstellation__Plan();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.examples.satellite.SatelliteConstellationInitializationData <em>Satellite Constellation Initialization Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Satellite Constellation Initialization Data</em>'.
	 * @see org.eclipse.symphony.examples.satellite.SatelliteConstellationInitializationData
	 * @generated
	 */
	EClass getSatelliteConstellationInitializationData();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.symphony.examples.satellite.SatelliteConstellationInitializationData#getSatelliteData <em>Satellite Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Satellite Data</em>'.
	 * @see org.eclipse.symphony.examples.satellite.SatelliteConstellationInitializationData#getSatelliteData()
	 * @see #getSatelliteConstellationInitializationData()
	 * @generated
	 */
	EReference getSatelliteConstellationInitializationData_SatelliteData();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.symphony.examples.satellite.SatelliteConstellationInitializationData#getGroundStations <em>Ground Stations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ground Stations</em>'.
	 * @see org.eclipse.symphony.examples.satellite.SatelliteConstellationInitializationData#getGroundStations()
	 * @see #getSatelliteConstellationInitializationData()
	 * @generated
	 */
	EReference getSatelliteConstellationInitializationData_GroundStations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.symphony.examples.satellite.SatelliteConstellationInitializationData#getPendingImageOrders <em>Pending Image Orders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pending Image Orders</em>'.
	 * @see org.eclipse.symphony.examples.satellite.SatelliteConstellationInitializationData#getPendingImageOrders()
	 * @see #getSatelliteConstellationInitializationData()
	 * @generated
	 */
	EReference getSatelliteConstellationInitializationData_PendingImageOrders();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.examples.satellite.SatelliteConstellationTypeApiAdapter <em>Satellite Constellation Type Api Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Satellite Constellation Type Api Adapter</em>'.
	 * @see org.eclipse.symphony.examples.satellite.SatelliteConstellationTypeApiAdapter
	 * @generated
	 */
	EClass getSatelliteConstellationTypeApiAdapter();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.examples.satellite.SatelliteInitializationData <em>Satellite Initialization Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Satellite Initialization Data</em>'.
	 * @see org.eclipse.symphony.examples.satellite.SatelliteInitializationData
	 * @generated
	 */
	EClass getSatelliteInitializationData();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.examples.satellite.SatelliteInitializationData#getSatellite <em>Satellite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Satellite</em>'.
	 * @see org.eclipse.symphony.examples.satellite.SatelliteInitializationData#getSatellite()
	 * @see #getSatelliteInitializationData()
	 * @generated
	 */
	EReference getSatelliteInitializationData_Satellite();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.examples.satellite.SatelliteInitializationData#getOrbitModel <em>Orbit Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Orbit Model</em>'.
	 * @see org.eclipse.symphony.examples.satellite.SatelliteInitializationData#getOrbitModel()
	 * @see #getSatelliteInitializationData()
	 * @generated
	 */
	EReference getSatelliteInitializationData_OrbitModel();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.examples.satellite.SatelliteUtils <em>Satellite Utils</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Satellite Utils</em>'.
	 * @see org.eclipse.symphony.examples.satellite.SatelliteUtils
	 * @generated
	 */
	EClass getSatelliteUtils();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.examples.satellite.SatelliteUtils#createSatelliteCommandRoll(org.eclipse.symphony.examples.satellite.Satellite, java.util.Date, double) <em>Create Satellite Command Roll</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Satellite Command Roll</em>' operation.
	 * @see org.eclipse.symphony.examples.satellite.SatelliteUtils#createSatelliteCommandRoll(org.eclipse.symphony.examples.satellite.Satellite, java.util.Date, double)
	 * @generated
	 */
	EOperation getSatelliteUtils__CreateSatelliteCommandRoll__Satellite_Date_double();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.examples.satellite.SatelliteUtils#createSatelliteCommandAcquireImage(org.eclipse.symphony.examples.satellite.Satellite, java.util.Date, org.eclipse.symphony.examples.satellite.ImageOrder) <em>Create Satellite Command Acquire Image</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Satellite Command Acquire Image</em>' operation.
	 * @see org.eclipse.symphony.examples.satellite.SatelliteUtils#createSatelliteCommandAcquireImage(org.eclipse.symphony.examples.satellite.Satellite, java.util.Date, org.eclipse.symphony.examples.satellite.ImageOrder)
	 * @generated
	 */
	EOperation getSatelliteUtils__CreateSatelliteCommandAcquireImage__Satellite_Date_ImageOrder();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.examples.satellite.SatelliteUtils#sortImageOrderByPriority(java.util.List) <em>Sort Image Order By Priority</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Sort Image Order By Priority</em>' operation.
	 * @see org.eclipse.symphony.examples.satellite.SatelliteUtils#sortImageOrderByPriority(java.util.List)
	 * @generated
	 */
	EOperation getSatelliteUtils__SortImageOrderByPriority__List();

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
	 * Returns the meta object for data type '{@link java.util.SortedSet <em>Sorted Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Sorted Set</em>'.
	 * @see java.util.SortedSet
	 * @model instanceClass="java.util.SortedSet" typeParameters="T"
	 * @generated
	 */
	EDataType getSortedSet();

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
	EMFEcoreExampleSatelliteFactory getEMFEcoreExampleSatelliteFactory();

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
		 * The meta object literal for the '{@link org.eclipse.symphony.examples.satellite.impl.SatelliteImpl <em>Satellite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.examples.satellite.impl.SatelliteImpl
		 * @see org.eclipse.symphony.examples.satellite.impl.EMFEcoreExampleSatellitePackageImpl#getSatellite()
		 * @generated
		 */
		EClass SATELLITE = eINSTANCE.getSatellite();
		/**
		 * The meta object literal for the '<em><b>Maximum Roll Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SATELLITE__MAXIMUM_ROLL_RATE = eINSTANCE.getSatellite_MaximumRollRate();
		/**
		 * The meta object literal for the '<em><b>Maximum Roll</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SATELLITE__MAXIMUM_ROLL = eINSTANCE.getSatellite_MaximumRoll();
		/**
		 * The meta object literal for the '<em><b>Orbit Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SATELLITE__ORBIT_MODEL = eINSTANCE.getSatellite_OrbitModel();
		/**
		 * The meta object literal for the '<em><b>Imager</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SATELLITE__IMAGER = eINSTANCE.getSatellite_Imager();
		/**
		 * The meta object literal for the '<em><b>Roll</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SATELLITE___ROLL__DOUBLE = eINSTANCE.getSatellite__Roll__double();
		/**
		 * The meta object literal for the '<em><b>Acquire Image</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SATELLITE___ACQUIRE_IMAGE__DOUBLE = eINSTANCE.getSatellite__AcquireImage__double();
		/**
		 * The meta object literal for the '<em><b>Download Images</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SATELLITE___DOWNLOAD_IMAGES__INT = eINSTANCE.getSatellite__DownloadImages__int();
		/**
		 * The meta object literal for the '<em><b>Enqueue Satellite Command</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SATELLITE___ENQUEUE_SATELLITE_COMMAND__SATELLITECOMMAND = eINSTANCE.getSatellite__EnqueueSatelliteCommand__SatelliteCommand();
		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.examples.satellite.impl.SatelliteSimulatedImpl <em>Satellite Simulated</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.examples.satellite.impl.SatelliteSimulatedImpl
		 * @see org.eclipse.symphony.examples.satellite.impl.EMFEcoreExampleSatellitePackageImpl#getSatelliteSimulated()
		 * @generated
		 */
		EClass SATELLITE_SIMULATED = eINSTANCE.getSatelliteSimulated();
		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.examples.satellite.impl.SatelliteStubImpl <em>Satellite Stub</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.examples.satellite.impl.SatelliteStubImpl
		 * @see org.eclipse.symphony.examples.satellite.impl.EMFEcoreExampleSatellitePackageImpl#getSatelliteStub()
		 * @generated
		 */
		EClass SATELLITE_STUB = eINSTANCE.getSatelliteStub();
		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.examples.satellite.impl.SatelliteCommandImpl <em>Satellite Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.examples.satellite.impl.SatelliteCommandImpl
		 * @see org.eclipse.symphony.examples.satellite.impl.EMFEcoreExampleSatellitePackageImpl#getSatelliteCommand()
		 * @generated
		 */
		EClass SATELLITE_COMMAND = eINSTANCE.getSatelliteCommand();
		/**
		 * The meta object literal for the '<em><b>Satellite</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SATELLITE_COMMAND__SATELLITE = eINSTANCE.getSatelliteCommand_Satellite();
		/**
		 * The meta object literal for the '<em><b>Command Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SATELLITE_COMMAND__COMMAND_START_TIME = eINSTANCE.getSatelliteCommand_CommandStartTime();
		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.examples.satellite.impl.SatelliteCommandListImpl <em>Satellite Command List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.examples.satellite.impl.SatelliteCommandListImpl
		 * @see org.eclipse.symphony.examples.satellite.impl.EMFEcoreExampleSatellitePackageImpl#getSatelliteCommandList()
		 * @generated
		 */
		EClass SATELLITE_COMMAND_LIST = eINSTANCE.getSatelliteCommandList();
		/**
		 * The meta object literal for the '<em><b>Commands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SATELLITE_COMMAND_LIST__COMMANDS = eINSTANCE.getSatelliteCommandList_Commands();
		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.examples.satellite.impl.SatelliteCommandRollImpl <em>Satellite Command Roll</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.examples.satellite.impl.SatelliteCommandRollImpl
		 * @see org.eclipse.symphony.examples.satellite.impl.EMFEcoreExampleSatellitePackageImpl#getSatelliteCommandRoll()
		 * @generated
		 */
		EClass SATELLITE_COMMAND_ROLL = eINSTANCE.getSatelliteCommandRoll();
		/**
		 * The meta object literal for the '<em><b>Target Roll Angle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SATELLITE_COMMAND_ROLL__TARGET_ROLL_ANGLE = eINSTANCE.getSatelliteCommandRoll_TargetRollAngle();
		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.examples.satellite.impl.SatelliteCommandAcquireImageImpl <em>Satellite Command Acquire Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.examples.satellite.impl.SatelliteCommandAcquireImageImpl
		 * @see org.eclipse.symphony.examples.satellite.impl.EMFEcoreExampleSatellitePackageImpl#getSatelliteCommandAcquireImage()
		 * @generated
		 */
		EClass SATELLITE_COMMAND_ACQUIRE_IMAGE = eINSTANCE.getSatelliteCommandAcquireImage();
		/**
		 * The meta object literal for the '<em><b>Image Order</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SATELLITE_COMMAND_ACQUIRE_IMAGE__IMAGE_ORDER = eINSTANCE.getSatelliteCommandAcquireImage_ImageOrder();
		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.examples.satellite.impl.ImageOrderImpl <em>Image Order</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.examples.satellite.impl.ImageOrderImpl
		 * @see org.eclipse.symphony.examples.satellite.impl.EMFEcoreExampleSatellitePackageImpl#getImageOrder()
		 * @generated
		 */
		EClass IMAGE_ORDER = eINSTANCE.getImageOrder();
		/**
		 * The meta object literal for the '<em><b>Order Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_ORDER__ORDER_ID = eINSTANCE.getImageOrder_OrderId();
		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_ORDER__PRIORITY = eINSTANCE.getImageOrder_Priority();
		/**
		 * The meta object literal for the '<em><b>Image Center</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMAGE_ORDER__IMAGE_CENTER = eINSTANCE.getImageOrder_ImageCenter();
		/**
		 * The meta object literal for the '<em><b>Commanded Zoom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_ORDER__COMMANDED_ZOOM = eINSTANCE.getImageOrder_CommandedZoom();
		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.examples.satellite.impl.SatelliteImagerImpl <em>Satellite Imager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.examples.satellite.impl.SatelliteImagerImpl
		 * @see org.eclipse.symphony.examples.satellite.impl.EMFEcoreExampleSatellitePackageImpl#getSatelliteImager()
		 * @generated
		 */
		EClass SATELLITE_IMAGER = eINSTANCE.getSatelliteImager();
		/**
		 * The meta object literal for the '<em><b>Satellite</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SATELLITE_IMAGER__SATELLITE = eINSTANCE.getSatelliteImager_Satellite();
		/**
		 * The meta object literal for the '<em><b>Images Acquired</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SATELLITE_IMAGER__IMAGES_ACQUIRED = eINSTANCE.getSatelliteImager_ImagesAcquired();
		/**
		 * The meta object literal for the '<em><b>Download Images</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SATELLITE_IMAGER___DOWNLOAD_IMAGES__INT = eINSTANCE.getSatelliteImager__DownloadImages__int();
		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.examples.satellite.impl.OrbitalImageImpl <em>Orbital Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.examples.satellite.impl.OrbitalImageImpl
		 * @see org.eclipse.symphony.examples.satellite.impl.EMFEcoreExampleSatellitePackageImpl#getOrbitalImage()
		 * @generated
		 */
		EClass ORBITAL_IMAGE = eINSTANCE.getOrbitalImage();
		/**
		 * The meta object literal for the '<em><b>Order Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORBITAL_IMAGE__ORDER_ID = eINSTANCE.getOrbitalImage_OrderId();
		/**
		 * The meta object literal for the '<em><b>Image Center</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORBITAL_IMAGE__IMAGE_CENTER = eINSTANCE.getOrbitalImage_ImageCenter();
		/**
		 * The meta object literal for the '<em><b>Download Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORBITAL_IMAGE__DOWNLOAD_SIZE = eINSTANCE.getOrbitalImage_DownloadSize();
		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.examples.satellite.impl.SatelliteConstellationImpl <em>Satellite Constellation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.examples.satellite.impl.SatelliteConstellationImpl
		 * @see org.eclipse.symphony.examples.satellite.impl.EMFEcoreExampleSatellitePackageImpl#getSatelliteConstellation()
		 * @generated
		 */
		EClass SATELLITE_CONSTELLATION = eINSTANCE.getSatelliteConstellation();
		/**
		 * The meta object literal for the '<em><b>Satellites</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SATELLITE_CONSTELLATION__SATELLITES = eINSTANCE.getSatelliteConstellation_Satellites();
		/**
		 * The meta object literal for the '<em><b>Ground Stations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SATELLITE_CONSTELLATION__GROUND_STATIONS = eINSTANCE.getSatelliteConstellation_GroundStations();
		/**
		 * The meta object literal for the '<em><b>Pending Image Orders</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SATELLITE_CONSTELLATION__PENDING_IMAGE_ORDERS = eINSTANCE.getSatelliteConstellation_PendingImageOrders();
		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SATELLITE_CONSTELLATION__START_DATE = eINSTANCE.getSatelliteConstellation_StartDate();
		/**
		 * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SATELLITE_CONSTELLATION__END_DATE = eINSTANCE.getSatelliteConstellation_EndDate();
		/**
		 * The meta object literal for the '<em><b>Get Satellite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SATELLITE_CONSTELLATION___GET_SATELLITE__ORBITMODEL = eINSTANCE.getSatelliteConstellation__GetSatellite__OrbitModel();
		/**
		 * The meta object literal for the '<em><b>Get Target Passes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SATELLITE_CONSTELLATION___GET_TARGET_PASSES__IMAGEORDER_DATE_DATE_ELEVATIONMASK = eINSTANCE.getSatelliteConstellation__GetTargetPasses__ImageOrder_Date_Date_ElevationMask();
		/**
		 * The meta object literal for the '<em><b>Get Ground Station Passes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SATELLITE_CONSTELLATION___GET_GROUND_STATION_PASSES__SATELLITE_DATE_DATE_ELEVATIONMASK = eINSTANCE.getSatelliteConstellation__GetGroundStationPasses__Satellite_Date_Date_ElevationMask();
		/**
		 * The meta object literal for the '<em><b>Plan</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SATELLITE_CONSTELLATION___PLAN__LIST_DATE_DATE = eINSTANCE.getSatelliteConstellation__Plan__List_Date_Date();
		/**
		 * The meta object literal for the '<em><b>Plan</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SATELLITE_CONSTELLATION___PLAN__DATE_DATE = eINSTANCE.getSatelliteConstellation__Plan__Date_Date();
		/**
		 * The meta object literal for the '<em><b>Plan</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SATELLITE_CONSTELLATION___PLAN = eINSTANCE.getSatelliteConstellation__Plan();
		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.examples.satellite.impl.SatelliteConstellationInitializationDataImpl <em>Satellite Constellation Initialization Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.examples.satellite.impl.SatelliteConstellationInitializationDataImpl
		 * @see org.eclipse.symphony.examples.satellite.impl.EMFEcoreExampleSatellitePackageImpl#getSatelliteConstellationInitializationData()
		 * @generated
		 */
		EClass SATELLITE_CONSTELLATION_INITIALIZATION_DATA = eINSTANCE.getSatelliteConstellationInitializationData();
		/**
		 * The meta object literal for the '<em><b>Satellite Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SATELLITE_CONSTELLATION_INITIALIZATION_DATA__SATELLITE_DATA = eINSTANCE.getSatelliteConstellationInitializationData_SatelliteData();
		/**
		 * The meta object literal for the '<em><b>Ground Stations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SATELLITE_CONSTELLATION_INITIALIZATION_DATA__GROUND_STATIONS = eINSTANCE.getSatelliteConstellationInitializationData_GroundStations();
		/**
		 * The meta object literal for the '<em><b>Pending Image Orders</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SATELLITE_CONSTELLATION_INITIALIZATION_DATA__PENDING_IMAGE_ORDERS = eINSTANCE.getSatelliteConstellationInitializationData_PendingImageOrders();
		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.examples.satellite.impl.SatelliteConstellationTypeApiAdapterImpl <em>Satellite Constellation Type Api Adapter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.examples.satellite.impl.SatelliteConstellationTypeApiAdapterImpl
		 * @see org.eclipse.symphony.examples.satellite.impl.EMFEcoreExampleSatellitePackageImpl#getSatelliteConstellationTypeApiAdapter()
		 * @generated
		 */
		EClass SATELLITE_CONSTELLATION_TYPE_API_ADAPTER = eINSTANCE.getSatelliteConstellationTypeApiAdapter();
		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.examples.satellite.impl.SatelliteInitializationDataImpl <em>Satellite Initialization Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.examples.satellite.impl.SatelliteInitializationDataImpl
		 * @see org.eclipse.symphony.examples.satellite.impl.EMFEcoreExampleSatellitePackageImpl#getSatelliteInitializationData()
		 * @generated
		 */
		EClass SATELLITE_INITIALIZATION_DATA = eINSTANCE.getSatelliteInitializationData();
		/**
		 * The meta object literal for the '<em><b>Satellite</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SATELLITE_INITIALIZATION_DATA__SATELLITE = eINSTANCE.getSatelliteInitializationData_Satellite();
		/**
		 * The meta object literal for the '<em><b>Orbit Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SATELLITE_INITIALIZATION_DATA__ORBIT_MODEL = eINSTANCE.getSatelliteInitializationData_OrbitModel();
		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.examples.satellite.impl.SatelliteUtilsImpl <em>Satellite Utils</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.examples.satellite.impl.SatelliteUtilsImpl
		 * @see org.eclipse.symphony.examples.satellite.impl.EMFEcoreExampleSatellitePackageImpl#getSatelliteUtils()
		 * @generated
		 */
		EClass SATELLITE_UTILS = eINSTANCE.getSatelliteUtils();
		/**
		 * The meta object literal for the '<em><b>Create Satellite Command Roll</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SATELLITE_UTILS___CREATE_SATELLITE_COMMAND_ROLL__SATELLITE_DATE_DOUBLE = eINSTANCE.getSatelliteUtils__CreateSatelliteCommandRoll__Satellite_Date_double();
		/**
		 * The meta object literal for the '<em><b>Create Satellite Command Acquire Image</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SATELLITE_UTILS___CREATE_SATELLITE_COMMAND_ACQUIRE_IMAGE__SATELLITE_DATE_IMAGEORDER = eINSTANCE.getSatelliteUtils__CreateSatelliteCommandAcquireImage__Satellite_Date_ImageOrder();
		/**
		 * The meta object literal for the '<em><b>Sort Image Order By Priority</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SATELLITE_UTILS___SORT_IMAGE_ORDER_BY_PRIORITY__LIST = eINSTANCE.getSatelliteUtils__SortImageOrderByPriority__List();
		/**
		 * The meta object literal for the '<em>List</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see org.eclipse.symphony.examples.satellite.impl.EMFEcoreExampleSatellitePackageImpl#getList()
		 * @generated
		 */
		EDataType LIST = eINSTANCE.getList();
		/**
		 * The meta object literal for the '<em>Sorted Set</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.SortedSet
		 * @see org.eclipse.symphony.examples.satellite.impl.EMFEcoreExampleSatellitePackageImpl#getSortedSet()
		 * @generated
		 */
		EDataType SORTED_SET = eINSTANCE.getSortedSet();
		/**
		 * The meta object literal for the '<em>Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Exception
		 * @see org.eclipse.symphony.examples.satellite.impl.EMFEcoreExampleSatellitePackageImpl#getException()
		 * @generated
		 */
		EDataType EXCEPTION = eINSTANCE.getException();

	}

} //EMFEcoreExampleSatellitePackage
