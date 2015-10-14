/**
 * Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015
 */
package org.eclipse.symphony.examples.lidar;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
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
 * @see org.eclipse.symphony.examples.lidar.EMFEcoreExampleLidarFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='EMFEcoreExampleLidar' childCreationExtenders='true' extensibleProviderFactory='true' copyrightText='Canadian Space Agency / Agence spatiale canadienne - Copyright (c) 2015' modelName='EMFEcoreExampleLidar' suppressGenModelAnnotations='false' modelDirectory='/org.eclipse.symphony.examples.lidar/src-generated' editDirectory='/org.eclipse.symphony.examples.lidar.edit/src-generated' basePackage='org.eclipse.symphony.examples'"
 * @generated
 */
public interface EMFEcoreExampleLidarPackage extends EPackage
{
  /**
	 * The package name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNAME = "lidar";

  /**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_URI = "org.eclipse.symphony.examples.lidar";

  /**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_PREFIX = "lidar";

  /**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  EMFEcoreExampleLidarPackage eINSTANCE = org.eclipse.symphony.examples.lidar.impl.EMFEcoreExampleLidarPackageImpl.init();

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.examples.lidar.impl.LidarImpl <em>Lidar</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.examples.lidar.impl.LidarImpl
	 * @see org.eclipse.symphony.examples.lidar.impl.EMFEcoreExampleLidarPackageImpl#getLidar()
	 * @generated
	 */
  int LIDAR = 0;

  /**
	 * The feature id for the '<em><b>Fov</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LIDAR__FOV = 0;

  /**
	 * The feature id for the '<em><b>Initialized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIDAR__INITIALIZED = 1;

		/**
	 * The number of structural features of the '<em>Lidar</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LIDAR_FEATURE_COUNT = 2;

  /**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIDAR___INIT = 0;

		/**
	 * The operation id for the '<em>Acquire Scan</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LIDAR___ACQUIRE_SCAN__DOUBLE_DOUBLE = 1;

  /**
	 * The operation id for the '<em>Acquire Scan Non Blocking</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LIDAR___ACQUIRE_SCAN_NON_BLOCKING__DOUBLE_DOUBLE = 2;

  /**
	 * The number of operations of the '<em>Lidar</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LIDAR_OPERATION_COUNT = 3;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.examples.lidar.impl.LidarStubImpl <em>Lidar Stub</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.examples.lidar.impl.LidarStubImpl
	 * @see org.eclipse.symphony.examples.lidar.impl.EMFEcoreExampleLidarPackageImpl#getLidarStub()
	 * @generated
	 */
  int LIDAR_STUB = 1;

  /**
	 * The feature id for the '<em><b>Fov</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LIDAR_STUB__FOV = LIDAR__FOV;

  /**
	 * The feature id for the '<em><b>Initialized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIDAR_STUB__INITIALIZED = LIDAR__INITIALIZED;

		/**
	 * The number of structural features of the '<em>Lidar Stub</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LIDAR_STUB_FEATURE_COUNT = LIDAR_FEATURE_COUNT + 0;

  /**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIDAR_STUB___INIT = LIDAR___INIT;

		/**
	 * The operation id for the '<em>Acquire Scan</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LIDAR_STUB___ACQUIRE_SCAN__DOUBLE_DOUBLE = LIDAR___ACQUIRE_SCAN__DOUBLE_DOUBLE;

  /**
	 * The operation id for the '<em>Acquire Scan Non Blocking</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LIDAR_STUB___ACQUIRE_SCAN_NON_BLOCKING__DOUBLE_DOUBLE = LIDAR___ACQUIRE_SCAN_NON_BLOCKING__DOUBLE_DOUBLE;

  /**
	 * The number of operations of the '<em>Lidar Stub</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LIDAR_STUB_OPERATION_COUNT = LIDAR_OPERATION_COUNT + 0;


  /**
	 * The meta object id for the '{@link org.eclipse.symphony.examples.lidar.impl.LidarSimulatedImpl <em>Lidar Simulated</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.examples.lidar.impl.LidarSimulatedImpl
	 * @see org.eclipse.symphony.examples.lidar.impl.EMFEcoreExampleLidarPackageImpl#getLidarSimulated()
	 * @generated
	 */
	int LIDAR_SIMULATED = 2;

		/**
	 * The feature id for the '<em><b>Fov</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIDAR_SIMULATED__FOV = LIDAR__FOV;

		/**
	 * The feature id for the '<em><b>Initialized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIDAR_SIMULATED__INITIALIZED = LIDAR__INITIALIZED;

		/**
	 * The number of structural features of the '<em>Lidar Simulated</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIDAR_SIMULATED_FEATURE_COUNT = LIDAR_FEATURE_COUNT + 0;

		/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIDAR_SIMULATED___INIT = LIDAR___INIT;

		/**
	 * The operation id for the '<em>Acquire Scan</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIDAR_SIMULATED___ACQUIRE_SCAN__DOUBLE_DOUBLE = LIDAR___ACQUIRE_SCAN__DOUBLE_DOUBLE;

		/**
	 * The operation id for the '<em>Acquire Scan Non Blocking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIDAR_SIMULATED___ACQUIRE_SCAN_NON_BLOCKING__DOUBLE_DOUBLE = LIDAR___ACQUIRE_SCAN_NON_BLOCKING__DOUBLE_DOUBLE;

		/**
	 * The number of operations of the '<em>Lidar Simulated</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIDAR_SIMULATED_OPERATION_COUNT = LIDAR_OPERATION_COUNT + 0;


		/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.examples.lidar.Lidar <em>Lidar</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lidar</em>'.
	 * @see org.eclipse.symphony.examples.lidar.Lidar
	 * @generated
	 */
  EClass getLidar();

  /**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.examples.lidar.Lidar#getFov <em>Fov</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fov</em>'.
	 * @see org.eclipse.symphony.examples.lidar.Lidar#getFov()
	 * @see #getLidar()
	 * @generated
	 */
  EReference getLidar_Fov();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.examples.lidar.Lidar#isInitialized <em>Initialized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initialized</em>'.
	 * @see org.eclipse.symphony.examples.lidar.Lidar#isInitialized()
	 * @see #getLidar()
	 * @generated
	 */
	EAttribute getLidar_Initialized();

		/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.examples.lidar.Lidar#init() <em>Init</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Init</em>' operation.
	 * @see org.eclipse.symphony.examples.lidar.Lidar#init()
	 * @generated
	 */
	EOperation getLidar__Init();

		/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.examples.lidar.Lidar#acquireScan(double, double) <em>Acquire Scan</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Acquire Scan</em>' operation.
	 * @see org.eclipse.symphony.examples.lidar.Lidar#acquireScan(double, double)
	 * @generated
	 */
  EOperation getLidar__AcquireScan__double_double();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.examples.lidar.Lidar#acquireScanNonBlocking(double, double) <em>Acquire Scan Non Blocking</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Acquire Scan Non Blocking</em>' operation.
	 * @see org.eclipse.symphony.examples.lidar.Lidar#acquireScanNonBlocking(double, double)
	 * @generated
	 */
  EOperation getLidar__AcquireScanNonBlocking__double_double();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.examples.lidar.LidarStub <em>Lidar Stub</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lidar Stub</em>'.
	 * @see org.eclipse.symphony.examples.lidar.LidarStub
	 * @generated
	 */
  EClass getLidarStub();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.examples.lidar.LidarSimulated <em>Lidar Simulated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lidar Simulated</em>'.
	 * @see org.eclipse.symphony.examples.lidar.LidarSimulated
	 * @generated
	 */
	EClass getLidarSimulated();

		/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
  EMFEcoreExampleLidarFactory getEMFEcoreExampleLidarFactory();

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
		 * The meta object literal for the '{@link org.eclipse.symphony.examples.lidar.impl.LidarImpl <em>Lidar</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.examples.lidar.impl.LidarImpl
		 * @see org.eclipse.symphony.examples.lidar.impl.EMFEcoreExampleLidarPackageImpl#getLidar()
		 * @generated
		 */
    EClass LIDAR = eINSTANCE.getLidar();

    /**
		 * The meta object literal for the '<em><b>Fov</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference LIDAR__FOV = eINSTANCE.getLidar_Fov();

    /**
		 * The meta object literal for the '<em><b>Initialized</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIDAR__INITIALIZED = eINSTANCE.getLidar_Initialized();

				/**
		 * The meta object literal for the '<em><b>Init</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LIDAR___INIT = eINSTANCE.getLidar__Init();

				/**
		 * The meta object literal for the '<em><b>Acquire Scan</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation LIDAR___ACQUIRE_SCAN__DOUBLE_DOUBLE = eINSTANCE.getLidar__AcquireScan__double_double();

    /**
		 * The meta object literal for the '<em><b>Acquire Scan Non Blocking</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation LIDAR___ACQUIRE_SCAN_NON_BLOCKING__DOUBLE_DOUBLE = eINSTANCE.getLidar__AcquireScanNonBlocking__double_double();

    /**
		 * The meta object literal for the '{@link org.eclipse.symphony.examples.lidar.impl.LidarStubImpl <em>Lidar Stub</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.examples.lidar.impl.LidarStubImpl
		 * @see org.eclipse.symphony.examples.lidar.impl.EMFEcoreExampleLidarPackageImpl#getLidarStub()
		 * @generated
		 */
    EClass LIDAR_STUB = eINSTANCE.getLidarStub();

				/**
		 * The meta object literal for the '{@link org.eclipse.symphony.examples.lidar.impl.LidarSimulatedImpl <em>Lidar Simulated</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.examples.lidar.impl.LidarSimulatedImpl
		 * @see org.eclipse.symphony.examples.lidar.impl.EMFEcoreExampleLidarPackageImpl#getLidarSimulated()
		 * @generated
		 */
		EClass LIDAR_SIMULATED = eINSTANCE.getLidarSimulated();

  }

} //EMFEcoreExampleLidarPackage
