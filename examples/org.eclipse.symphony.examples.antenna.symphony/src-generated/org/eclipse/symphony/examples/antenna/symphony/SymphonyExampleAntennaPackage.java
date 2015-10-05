/**
 * Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015
 */
package org.eclipse.symphony.examples.antenna.symphony;

import ca.gc.asc_csa.symphony.core.SymphonyCorePackage;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see org.eclipse.symphony.examples.antenna.symphony.SymphonyExampleAntennaFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='SymphonyExampleAntenna' copyrightText='Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015' modelName='SymphonyExampleAntenna' childCreationExtenders='true' extensibleProviderFactory='true' suppressGenModelAnnotations='false' modelDirectory='/org.eclipse.symphony.examples.antenna.symphony/src-generated' editDirectory='/org.eclipse.symphony.examples.antenna.symphony.edit/src-generated' basePackage='org.eclipse.symphony.examples.antenna'"
 * @generated
 */
public interface SymphonyExampleAntennaPackage extends EPackage {
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
	String eNS_URI = "org.eclipse.symphony.examples.antenna.symphony";

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
	SymphonyExampleAntennaPackage eINSTANCE = org.eclipse.symphony.examples.antenna.symphony.impl.SymphonyExampleAntennaPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.examples.antenna.symphony.impl.PTUDishAntennaSymphonySystemApiAdapterImpl <em>PTU Dish Antenna Symphony System Api Adapter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.examples.antenna.symphony.impl.PTUDishAntennaSymphonySystemApiAdapterImpl
	 * @see org.eclipse.symphony.examples.antenna.symphony.impl.SymphonyExampleAntennaPackageImpl#getPTUDishAntennaSymphonySystemApiAdapter()
	 * @generated
	 */
	int PTU_DISH_ANTENNA_SYMPHONY_SYSTEM_API_ADAPTER = 0;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_DISH_ANTENNA_SYMPHONY_SYSTEM_API_ADAPTER__ENVIRONMENT = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER__ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_DISH_ANTENNA_SYMPHONY_SYSTEM_API_ADAPTER__INSTANCE = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER__INSTANCE;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_DISH_ANTENNA_SYMPHONY_SYSTEM_API_ADAPTER__ELEMENT_TYPE = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER__ELEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Pose Transform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_DISH_ANTENNA_SYMPHONY_SYSTEM_API_ADAPTER__POSE_TRANSFORM = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER__POSE_TRANSFORM;

	/**
	 * The feature id for the '<em><b>Pose Corrector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_DISH_ANTENNA_SYMPHONY_SYSTEM_API_ADAPTER__POSE_CORRECTOR = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER__POSE_CORRECTOR;

	/**
	 * The feature id for the '<em><b>Symphony System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_DISH_ANTENNA_SYMPHONY_SYSTEM_API_ADAPTER__SYMPHONY_SYSTEM = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER__SYMPHONY_SYSTEM;

	/**
	 * The number of structural features of the '<em>PTU Dish Antenna Symphony System Api Adapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_DISH_ANTENNA_SYMPHONY_SYSTEM_API_ADAPTER_FEATURE_COUNT = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_DISH_ANTENNA_SYMPHONY_SYSTEM_API_ADAPTER___INIT__ENVIRONMENT_TYPE_EOBJECT = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER___INIT__ENVIRONMENT_TYPE_EOBJECT;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_DISH_ANTENNA_SYMPHONY_SYSTEM_API_ADAPTER___APPLY__ABSTRACTINITIALIZATIONDATA = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER___APPLY__ABSTRACTINITIALIZATIONDATA;

	/**
	 * The operation id for the '<em>Create Initialization Data</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_DISH_ANTENNA_SYMPHONY_SYSTEM_API_ADAPTER___CREATE_INITIALIZATION_DATA = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER___CREATE_INITIALIZATION_DATA;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_DISH_ANTENNA_SYMPHONY_SYSTEM_API_ADAPTER___COLLECT__ABSTRACTINITIALIZATIONDATA = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER___COLLECT__ABSTRACTINITIALIZATIONDATA;

	/**
	 * The operation id for the '<em>Create Result</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_DISH_ANTENNA_SYMPHONY_SYSTEM_API_ADAPTER___CREATE_RESULT__OPERATIONCALL = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER___CREATE_RESULT__OPERATIONCALL;

	/**
	 * The operation id for the '<em>Create Result</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_DISH_ANTENNA_SYMPHONY_SYSTEM_API_ADAPTER___CREATE_RESULT__OPERATIONCALL_LONG_OBJECT_EXCEPTION = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER___CREATE_RESULT__OPERATIONCALL_LONG_OBJECT_EXCEPTION;

	/**
	 * The operation id for the '<em>Invoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_DISH_ANTENNA_SYMPHONY_SYSTEM_API_ADAPTER___INVOKE__EOBJECT_OPERATIONCALL_BOOLEAN = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER___INVOKE__EOBJECT_OPERATIONCALL_BOOLEAN;

	/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_DISH_ANTENNA_SYMPHONY_SYSTEM_API_ADAPTER___DISPOSE = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER___DISPOSE;

	/**
	 * The operation id for the '<em>Create Result Matrix</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_DISH_ANTENNA_SYMPHONY_SYSTEM_API_ADAPTER___CREATE_RESULT_MATRIX__OPERATIONCALL = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER___CREATE_RESULT_MATRIX__OPERATIONCALL;

	/**
	 * The number of operations of the '<em>PTU Dish Antenna Symphony System Api Adapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_DISH_ANTENNA_SYMPHONY_SYSTEM_API_ADAPTER_OPERATION_COUNT = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.examples.antenna.symphony.impl.PTUDishAntennaDataImpl <em>PTU Dish Antenna Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.examples.antenna.symphony.impl.PTUDishAntennaDataImpl
	 * @see org.eclipse.symphony.examples.antenna.symphony.impl.SymphonyExampleAntennaPackageImpl#getPTUDishAntennaData()
	 * @generated
	 */
	int PTU_DISH_ANTENNA_DATA = 1;

	/**
	 * The feature id for the '<em><b>Initial Pose Transform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_DISH_ANTENNA_DATA__INITIAL_POSE_TRANSFORM = SymphonyCorePackage.SYMPHONY_INITIALIZATION_DATA__INITIAL_POSE_TRANSFORM;

	/**
	 * The feature id for the '<em><b>Fov</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_DISH_ANTENNA_DATA__FOV = SymphonyCorePackage.SYMPHONY_INITIALIZATION_DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pan Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_DISH_ANTENNA_DATA__PAN_ANGLE = SymphonyCorePackage.SYMPHONY_INITIALIZATION_DATA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tilt Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_DISH_ANTENNA_DATA__TILT_ANGLE = SymphonyCorePackage.SYMPHONY_INITIALIZATION_DATA_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Tracking Sun</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_DISH_ANTENNA_DATA__TRACKING_SUN = SymphonyCorePackage.SYMPHONY_INITIALIZATION_DATA_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Initialized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_DISH_ANTENNA_DATA__INITIALIZED = SymphonyCorePackage.SYMPHONY_INITIALIZATION_DATA_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>PTU Dish Antenna Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_DISH_ANTENNA_DATA_FEATURE_COUNT = SymphonyCorePackage.SYMPHONY_INITIALIZATION_DATA_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>PTU Dish Antenna Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_DISH_ANTENNA_DATA_OPERATION_COUNT = SymphonyCorePackage.SYMPHONY_INITIALIZATION_DATA_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.examples.antenna.symphony.PTUDishAntennaSymphonySystemApiAdapter <em>PTU Dish Antenna Symphony System Api Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PTU Dish Antenna Symphony System Api Adapter</em>'.
	 * @see org.eclipse.symphony.examples.antenna.symphony.PTUDishAntennaSymphonySystemApiAdapter
	 * @generated
	 */
	EClass getPTUDishAntennaSymphonySystemApiAdapter();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.examples.antenna.symphony.PTUDishAntennaData <em>PTU Dish Antenna Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PTU Dish Antenna Data</em>'.
	 * @see org.eclipse.symphony.examples.antenna.symphony.PTUDishAntennaData
	 * @generated
	 */
	EClass getPTUDishAntennaData();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.examples.antenna.symphony.PTUDishAntennaData#getFov <em>Fov</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fov</em>'.
	 * @see org.eclipse.symphony.examples.antenna.symphony.PTUDishAntennaData#getFov()
	 * @see #getPTUDishAntennaData()
	 * @generated
	 */
	EReference getPTUDishAntennaData_Fov();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.examples.antenna.symphony.PTUDishAntennaData#getPanAngle <em>Pan Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pan Angle</em>'.
	 * @see org.eclipse.symphony.examples.antenna.symphony.PTUDishAntennaData#getPanAngle()
	 * @see #getPTUDishAntennaData()
	 * @generated
	 */
	EAttribute getPTUDishAntennaData_PanAngle();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.examples.antenna.symphony.PTUDishAntennaData#getTiltAngle <em>Tilt Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tilt Angle</em>'.
	 * @see org.eclipse.symphony.examples.antenna.symphony.PTUDishAntennaData#getTiltAngle()
	 * @see #getPTUDishAntennaData()
	 * @generated
	 */
	EAttribute getPTUDishAntennaData_TiltAngle();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.examples.antenna.symphony.PTUDishAntennaData#isTrackingSun <em>Tracking Sun</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tracking Sun</em>'.
	 * @see org.eclipse.symphony.examples.antenna.symphony.PTUDishAntennaData#isTrackingSun()
	 * @see #getPTUDishAntennaData()
	 * @generated
	 */
	EAttribute getPTUDishAntennaData_TrackingSun();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.examples.antenna.symphony.PTUDishAntennaData#isInitialized <em>Initialized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initialized</em>'.
	 * @see org.eclipse.symphony.examples.antenna.symphony.PTUDishAntennaData#isInitialized()
	 * @see #getPTUDishAntennaData()
	 * @generated
	 */
	EAttribute getPTUDishAntennaData_Initialized();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SymphonyExampleAntennaFactory getSymphonyExampleAntennaFactory();

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
		 * The meta object literal for the '{@link org.eclipse.symphony.examples.antenna.symphony.impl.PTUDishAntennaSymphonySystemApiAdapterImpl <em>PTU Dish Antenna Symphony System Api Adapter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.examples.antenna.symphony.impl.PTUDishAntennaSymphonySystemApiAdapterImpl
		 * @see org.eclipse.symphony.examples.antenna.symphony.impl.SymphonyExampleAntennaPackageImpl#getPTUDishAntennaSymphonySystemApiAdapter()
		 * @generated
		 */
		EClass PTU_DISH_ANTENNA_SYMPHONY_SYSTEM_API_ADAPTER = eINSTANCE.getPTUDishAntennaSymphonySystemApiAdapter();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.examples.antenna.symphony.impl.PTUDishAntennaDataImpl <em>PTU Dish Antenna Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.examples.antenna.symphony.impl.PTUDishAntennaDataImpl
		 * @see org.eclipse.symphony.examples.antenna.symphony.impl.SymphonyExampleAntennaPackageImpl#getPTUDishAntennaData()
		 * @generated
		 */
		EClass PTU_DISH_ANTENNA_DATA = eINSTANCE.getPTUDishAntennaData();

		/**
		 * The meta object literal for the '<em><b>Fov</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTU_DISH_ANTENNA_DATA__FOV = eINSTANCE.getPTUDishAntennaData_Fov();

		/**
		 * The meta object literal for the '<em><b>Pan Angle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PTU_DISH_ANTENNA_DATA__PAN_ANGLE = eINSTANCE.getPTUDishAntennaData_PanAngle();

		/**
		 * The meta object literal for the '<em><b>Tilt Angle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PTU_DISH_ANTENNA_DATA__TILT_ANGLE = eINSTANCE.getPTUDishAntennaData_TiltAngle();

		/**
		 * The meta object literal for the '<em><b>Tracking Sun</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PTU_DISH_ANTENNA_DATA__TRACKING_SUN = eINSTANCE.getPTUDishAntennaData_TrackingSun();

		/**
		 * The meta object literal for the '<em><b>Initialized</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PTU_DISH_ANTENNA_DATA__INITIALIZED = eINSTANCE.getPTUDishAntennaData_Initialized();

	}

} //SymphonyExampleAntennaPackage
