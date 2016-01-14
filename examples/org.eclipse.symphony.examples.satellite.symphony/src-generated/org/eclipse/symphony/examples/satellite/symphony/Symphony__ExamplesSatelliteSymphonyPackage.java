/**
 * Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015-2016
 */
package org.eclipse.symphony.examples.satellite.symphony;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.symphony.core.Symphony__CorePackage;

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
 * @see org.eclipse.symphony.examples.satellite.symphony.Symphony__ExamplesSatelliteSymphonyFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='Symphony__ExamplesSatelliteSymphony' copyrightText='Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015-2016' modelName='Symphony__ExamplesSatelliteSymphony' childCreationExtenders='true' extensibleProviderFactory='true' suppressGenModelAnnotations='false' modelDirectory='/org.eclipse.symphony.examples.satellite.symphony/src-generated' editDirectory='/org.eclipse.symphony.examples.satellite.symphony.edit/src-generated' basePackage='org.eclipse.symphony.examples.satellite'"
 * @generated
 */
public interface Symphony__ExamplesSatelliteSymphonyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "symphony";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.eclipse.symphony.examples.satellite.symphony";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "symphony";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Symphony__ExamplesSatelliteSymphonyPackage eINSTANCE = org.eclipse.symphony.examples.satellite.symphony.impl.Symphony__ExamplesSatelliteSymphonyPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.examples.satellite.symphony.impl.ConstellationSystemApiAdapterImpl <em>Constellation System Api Adapter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.examples.satellite.symphony.impl.ConstellationSystemApiAdapterImpl
	 * @see org.eclipse.symphony.examples.satellite.symphony.impl.Symphony__ExamplesSatelliteSymphonyPackageImpl#getConstellationSystemApiAdapter()
	 * @generated
	 */
	int CONSTELLATION_SYSTEM_API_ADAPTER = 0;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTELLATION_SYSTEM_API_ADAPTER__ENVIRONMENT = Symphony__CorePackage.SYMPHONY_SYSTEM_API_ADAPTER__ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTELLATION_SYSTEM_API_ADAPTER__INSTANCE = Symphony__CorePackage.SYMPHONY_SYSTEM_API_ADAPTER__INSTANCE;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTELLATION_SYSTEM_API_ADAPTER__ELEMENT_TYPE = Symphony__CorePackage.SYMPHONY_SYSTEM_API_ADAPTER__ELEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Pose Transform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTELLATION_SYSTEM_API_ADAPTER__POSE_TRANSFORM = Symphony__CorePackage.SYMPHONY_SYSTEM_API_ADAPTER__POSE_TRANSFORM;

	/**
	 * The feature id for the '<em><b>Pose Corrector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTELLATION_SYSTEM_API_ADAPTER__POSE_CORRECTOR = Symphony__CorePackage.SYMPHONY_SYSTEM_API_ADAPTER__POSE_CORRECTOR;

	/**
	 * The feature id for the '<em><b>Symphony System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTELLATION_SYSTEM_API_ADAPTER__SYMPHONY_SYSTEM = Symphony__CorePackage.SYMPHONY_SYSTEM_API_ADAPTER__SYMPHONY_SYSTEM;

	/**
	 * The number of structural features of the '<em>Constellation System Api Adapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTELLATION_SYSTEM_API_ADAPTER_FEATURE_COUNT = Symphony__CorePackage.SYMPHONY_SYSTEM_API_ADAPTER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTELLATION_SYSTEM_API_ADAPTER___INIT__ENVIRONMENT_TYPE_EOBJECT = Symphony__CorePackage.SYMPHONY_SYSTEM_API_ADAPTER___INIT__ENVIRONMENT_TYPE_EOBJECT;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTELLATION_SYSTEM_API_ADAPTER___APPLY__ABSTRACTINITIALIZATIONDATA = Symphony__CorePackage.SYMPHONY_SYSTEM_API_ADAPTER___APPLY__ABSTRACTINITIALIZATIONDATA;

	/**
	 * The operation id for the '<em>Create Initialization Data</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTELLATION_SYSTEM_API_ADAPTER___CREATE_INITIALIZATION_DATA = Symphony__CorePackage.SYMPHONY_SYSTEM_API_ADAPTER___CREATE_INITIALIZATION_DATA;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTELLATION_SYSTEM_API_ADAPTER___COLLECT__ABSTRACTINITIALIZATIONDATA = Symphony__CorePackage.SYMPHONY_SYSTEM_API_ADAPTER___COLLECT__ABSTRACTINITIALIZATIONDATA;

	/**
	 * The operation id for the '<em>Create Result</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTELLATION_SYSTEM_API_ADAPTER___CREATE_RESULT__OPERATIONCALL = Symphony__CorePackage.SYMPHONY_SYSTEM_API_ADAPTER___CREATE_RESULT__OPERATIONCALL;

	/**
	 * The operation id for the '<em>Create Result</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTELLATION_SYSTEM_API_ADAPTER___CREATE_RESULT__OPERATIONCALL_LONG_OBJECT_EXCEPTION = Symphony__CorePackage.SYMPHONY_SYSTEM_API_ADAPTER___CREATE_RESULT__OPERATIONCALL_LONG_OBJECT_EXCEPTION;

	/**
	 * The operation id for the '<em>Invoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTELLATION_SYSTEM_API_ADAPTER___INVOKE__EOBJECT_OPERATIONCALL_BOOLEAN = Symphony__CorePackage.SYMPHONY_SYSTEM_API_ADAPTER___INVOKE__EOBJECT_OPERATIONCALL_BOOLEAN;

	/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTELLATION_SYSTEM_API_ADAPTER___DISPOSE = Symphony__CorePackage.SYMPHONY_SYSTEM_API_ADAPTER___DISPOSE;

	/**
	 * The operation id for the '<em>Create Result Matrix</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTELLATION_SYSTEM_API_ADAPTER___CREATE_RESULT_MATRIX__OPERATIONCALL = Symphony__CorePackage.SYMPHONY_SYSTEM_API_ADAPTER___CREATE_RESULT_MATRIX__OPERATIONCALL;

	/**
	 * The number of operations of the '<em>Constellation System Api Adapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTELLATION_SYSTEM_API_ADAPTER_OPERATION_COUNT = Symphony__CorePackage.SYMPHONY_SYSTEM_API_ADAPTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.examples.satellite.symphony.impl.ConstellationDataImpl <em>Constellation Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.examples.satellite.symphony.impl.ConstellationDataImpl
	 * @see org.eclipse.symphony.examples.satellite.symphony.impl.Symphony__ExamplesSatelliteSymphonyPackageImpl#getConstellationData()
	 * @generated
	 */
	int CONSTELLATION_DATA = 1;

	/**
	 * The feature id for the '<em><b>Initial Pose Transform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTELLATION_DATA__INITIAL_POSE_TRANSFORM = Symphony__CorePackage.SYMPHONY_INITIALIZATION_DATA__INITIAL_POSE_TRANSFORM;

	/**
	 * The feature id for the '<em><b>Satellites List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTELLATION_DATA__SATELLITES_LIST = Symphony__CorePackage.SYMPHONY_INITIALIZATION_DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ground Stations References List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTELLATION_DATA__GROUND_STATIONS_REFERENCES_LIST = Symphony__CorePackage.SYMPHONY_INITIALIZATION_DATA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Constellation Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTELLATION_DATA_FEATURE_COUNT = Symphony__CorePackage.SYMPHONY_INITIALIZATION_DATA_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Constellation Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTELLATION_DATA_OPERATION_COUNT = Symphony__CorePackage.SYMPHONY_INITIALIZATION_DATA_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.examples.satellite.symphony.ConstellationSystemApiAdapter <em>Constellation System Api Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constellation System Api Adapter</em>'.
	 * @see org.eclipse.symphony.examples.satellite.symphony.ConstellationSystemApiAdapter
	 * @generated
	 */
	EClass getConstellationSystemApiAdapter();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.examples.satellite.symphony.ConstellationData <em>Constellation Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constellation Data</em>'.
	 * @see org.eclipse.symphony.examples.satellite.symphony.ConstellationData
	 * @generated
	 */
	EClass getConstellationData();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.examples.satellite.symphony.ConstellationData#getSatellitesList <em>Satellites List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Satellites List</em>'.
	 * @see org.eclipse.symphony.examples.satellite.symphony.ConstellationData#getSatellitesList()
	 * @see #getConstellationData()
	 * @generated
	 */
	EReference getConstellationData_SatellitesList();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.examples.satellite.symphony.ConstellationData#getGroundStationsReferencesList <em>Ground Stations References List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ground Stations References List</em>'.
	 * @see org.eclipse.symphony.examples.satellite.symphony.ConstellationData#getGroundStationsReferencesList()
	 * @see #getConstellationData()
	 * @generated
	 */
	EReference getConstellationData_GroundStationsReferencesList();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Symphony__ExamplesSatelliteSymphonyFactory getSymphony__ExamplesSatelliteSymphonyFactory();

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
		 * The meta object literal for the '{@link org.eclipse.symphony.examples.satellite.symphony.impl.ConstellationSystemApiAdapterImpl <em>Constellation System Api Adapter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.examples.satellite.symphony.impl.ConstellationSystemApiAdapterImpl
		 * @see org.eclipse.symphony.examples.satellite.symphony.impl.Symphony__ExamplesSatelliteSymphonyPackageImpl#getConstellationSystemApiAdapter()
		 * @generated
		 */
		EClass CONSTELLATION_SYSTEM_API_ADAPTER = eINSTANCE.getConstellationSystemApiAdapter();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.examples.satellite.symphony.impl.ConstellationDataImpl <em>Constellation Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.examples.satellite.symphony.impl.ConstellationDataImpl
		 * @see org.eclipse.symphony.examples.satellite.symphony.impl.Symphony__ExamplesSatelliteSymphonyPackageImpl#getConstellationData()
		 * @generated
		 */
		EClass CONSTELLATION_DATA = eINSTANCE.getConstellationData();

		/**
		 * The meta object literal for the '<em><b>Satellites List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTELLATION_DATA__SATELLITES_LIST = eINSTANCE.getConstellationData_SatellitesList();

		/**
		 * The meta object literal for the '<em><b>Ground Stations References List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTELLATION_DATA__GROUND_STATIONS_REFERENCES_LIST = eINSTANCE.getConstellationData_GroundStationsReferencesList();

	}

} //Symphony__ExamplesSatelliteSymphonyPackage
