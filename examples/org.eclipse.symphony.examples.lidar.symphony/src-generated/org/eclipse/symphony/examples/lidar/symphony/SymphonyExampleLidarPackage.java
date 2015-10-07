/**
 * Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015
 */
package org.eclipse.symphony.examples.lidar.symphony;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.symphony.core.SymphonyCorePackage;

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
 * @see org.eclipse.symphony.examples.lidar.symphony.SymphonyExampleLidarFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='SymphonyExampleLidar' copyrightText='Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015' modelName='SymphonyExampleLidar' modelDirectory='/org.eclipse.symphony.examples.lidar.symphony/src-generated' editDirectory='/org.eclipse.symphony.examples.lidar.symphony.edit/src-generated' basePackage='org.eclipse.symphony.examples.lidar'"
 * @generated
 */
public interface SymphonyExampleLidarPackage extends EPackage
{
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
  String eNS_URI = "org.eclipse.symphony.examples.lidar.symphony";

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
  SymphonyExampleLidarPackage eINSTANCE = org.eclipse.symphony.examples.lidar.symphony.impl.SymphonyExampleLidarPackageImpl.init();

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.examples.lidar.symphony.impl.LidarSymphonySystemApiAdapterImpl <em>Lidar Symphony System Api Adapter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.examples.lidar.symphony.impl.LidarSymphonySystemApiAdapterImpl
	 * @see org.eclipse.symphony.examples.lidar.symphony.impl.SymphonyExampleLidarPackageImpl#getLidarSymphonySystemApiAdapter()
	 * @generated
	 */
	int LIDAR_SYMPHONY_SYSTEM_API_ADAPTER = 0;

		/**
	 * The feature id for the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIDAR_SYMPHONY_SYSTEM_API_ADAPTER__ENVIRONMENT = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER__ENVIRONMENT;

		/**
	 * The feature id for the '<em><b>Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIDAR_SYMPHONY_SYSTEM_API_ADAPTER__INSTANCE = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER__INSTANCE;

		/**
	 * The feature id for the '<em><b>Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIDAR_SYMPHONY_SYSTEM_API_ADAPTER__ELEMENT_TYPE = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER__ELEMENT_TYPE;

		/**
	 * The feature id for the '<em><b>Pose Transform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIDAR_SYMPHONY_SYSTEM_API_ADAPTER__POSE_TRANSFORM = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER__POSE_TRANSFORM;

		/**
	 * The feature id for the '<em><b>Pose Corrector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIDAR_SYMPHONY_SYSTEM_API_ADAPTER__POSE_CORRECTOR = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER__POSE_CORRECTOR;

		/**
	 * The feature id for the '<em><b>Symphony System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIDAR_SYMPHONY_SYSTEM_API_ADAPTER__SYMPHONY_SYSTEM = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER__SYMPHONY_SYSTEM;

		/**
	 * The number of structural features of the '<em>Lidar Symphony System Api Adapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIDAR_SYMPHONY_SYSTEM_API_ADAPTER_FEATURE_COUNT = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER_FEATURE_COUNT + 0;

		/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIDAR_SYMPHONY_SYSTEM_API_ADAPTER___INIT__ENVIRONMENT_TYPE_EOBJECT = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER___INIT__ENVIRONMENT_TYPE_EOBJECT;

		/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIDAR_SYMPHONY_SYSTEM_API_ADAPTER___APPLY__ABSTRACTINITIALIZATIONDATA = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER___APPLY__ABSTRACTINITIALIZATIONDATA;

		/**
	 * The operation id for the '<em>Create Initialization Data</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIDAR_SYMPHONY_SYSTEM_API_ADAPTER___CREATE_INITIALIZATION_DATA = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER___CREATE_INITIALIZATION_DATA;

		/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIDAR_SYMPHONY_SYSTEM_API_ADAPTER___COLLECT__ABSTRACTINITIALIZATIONDATA = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER___COLLECT__ABSTRACTINITIALIZATIONDATA;

		/**
	 * The operation id for the '<em>Create Result</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIDAR_SYMPHONY_SYSTEM_API_ADAPTER___CREATE_RESULT__OPERATIONCALL = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER___CREATE_RESULT__OPERATIONCALL;

		/**
	 * The operation id for the '<em>Create Result</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIDAR_SYMPHONY_SYSTEM_API_ADAPTER___CREATE_RESULT__OPERATIONCALL_LONG_OBJECT_EXCEPTION = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER___CREATE_RESULT__OPERATIONCALL_LONG_OBJECT_EXCEPTION;

		/**
	 * The operation id for the '<em>Invoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIDAR_SYMPHONY_SYSTEM_API_ADAPTER___INVOKE__EOBJECT_OPERATIONCALL_BOOLEAN = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER___INVOKE__EOBJECT_OPERATIONCALL_BOOLEAN;

		/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIDAR_SYMPHONY_SYSTEM_API_ADAPTER___DISPOSE = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER___DISPOSE;

		/**
	 * The operation id for the '<em>Create Result Matrix</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIDAR_SYMPHONY_SYSTEM_API_ADAPTER___CREATE_RESULT_MATRIX__OPERATIONCALL = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER___CREATE_RESULT_MATRIX__OPERATIONCALL;

		/**
	 * The number of operations of the '<em>Lidar Symphony System Api Adapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIDAR_SYMPHONY_SYSTEM_API_ADAPTER_OPERATION_COUNT = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER_OPERATION_COUNT + 0;


		/**
	 * The meta object id for the '{@link org.eclipse.symphony.examples.lidar.symphony.impl.LidarDataImpl <em>Lidar Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.examples.lidar.symphony.impl.LidarDataImpl
	 * @see org.eclipse.symphony.examples.lidar.symphony.impl.SymphonyExampleLidarPackageImpl#getLidarData()
	 * @generated
	 */
	int LIDAR_DATA = 1;

		/**
	 * The feature id for the '<em><b>Initial Pose Transform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIDAR_DATA__INITIAL_POSE_TRANSFORM = SymphonyCorePackage.SYMPHONY_INITIALIZATION_DATA__INITIAL_POSE_TRANSFORM;

		/**
	 * The feature id for the '<em><b>Fov</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIDAR_DATA__FOV = SymphonyCorePackage.SYMPHONY_INITIALIZATION_DATA_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Initialized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIDAR_DATA__INITIALIZED = SymphonyCorePackage.SYMPHONY_INITIALIZATION_DATA_FEATURE_COUNT + 1;

		/**
	 * The number of structural features of the '<em>Lidar Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIDAR_DATA_FEATURE_COUNT = SymphonyCorePackage.SYMPHONY_INITIALIZATION_DATA_FEATURE_COUNT + 2;

		/**
	 * The number of operations of the '<em>Lidar Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIDAR_DATA_OPERATION_COUNT = SymphonyCorePackage.SYMPHONY_INITIALIZATION_DATA_OPERATION_COUNT + 0;


		/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.examples.lidar.symphony.LidarSymphonySystemApiAdapter <em>Lidar Symphony System Api Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lidar Symphony System Api Adapter</em>'.
	 * @see org.eclipse.symphony.examples.lidar.symphony.LidarSymphonySystemApiAdapter
	 * @generated
	 */
	EClass getLidarSymphonySystemApiAdapter();

		/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.examples.lidar.symphony.LidarData <em>Lidar Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lidar Data</em>'.
	 * @see org.eclipse.symphony.examples.lidar.symphony.LidarData
	 * @generated
	 */
	EClass getLidarData();

		/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.examples.lidar.symphony.LidarData#getFov <em>Fov</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fov</em>'.
	 * @see org.eclipse.symphony.examples.lidar.symphony.LidarData#getFov()
	 * @see #getLidarData()
	 * @generated
	 */
	EReference getLidarData_Fov();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.examples.lidar.symphony.LidarData#isInitialized <em>Initialized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initialized</em>'.
	 * @see org.eclipse.symphony.examples.lidar.symphony.LidarData#isInitialized()
	 * @see #getLidarData()
	 * @generated
	 */
	EAttribute getLidarData_Initialized();

		/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
  SymphonyExampleLidarFactory getSymphonyExampleLidarFactory();

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
  interface Literals
  {
    /**
		 * The meta object literal for the '{@link org.eclipse.symphony.examples.lidar.symphony.impl.LidarSymphonySystemApiAdapterImpl <em>Lidar Symphony System Api Adapter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.examples.lidar.symphony.impl.LidarSymphonySystemApiAdapterImpl
		 * @see org.eclipse.symphony.examples.lidar.symphony.impl.SymphonyExampleLidarPackageImpl#getLidarSymphonySystemApiAdapter()
		 * @generated
		 */
		EClass LIDAR_SYMPHONY_SYSTEM_API_ADAPTER = eINSTANCE.getLidarSymphonySystemApiAdapter();
				/**
		 * The meta object literal for the '{@link org.eclipse.symphony.examples.lidar.symphony.impl.LidarDataImpl <em>Lidar Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.examples.lidar.symphony.impl.LidarDataImpl
		 * @see org.eclipse.symphony.examples.lidar.symphony.impl.SymphonyExampleLidarPackageImpl#getLidarData()
		 * @generated
		 */
		EClass LIDAR_DATA = eINSTANCE.getLidarData();
				/**
		 * The meta object literal for the '<em><b>Fov</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIDAR_DATA__FOV = eINSTANCE.getLidarData_Fov();
				/**
		 * The meta object literal for the '<em><b>Initialized</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIDAR_DATA__INITIALIZED = eINSTANCE.getLidarData_Initialized();

  }

} //SymphonyExampleLidarPackage
