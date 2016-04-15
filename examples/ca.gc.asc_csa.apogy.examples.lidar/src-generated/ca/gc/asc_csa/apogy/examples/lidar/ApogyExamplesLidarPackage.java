package ca.gc.asc_csa.apogy.examples.lidar;
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
 * @see ca.gc.asc_csa.apogy.examples.lidar.ApogyExamplesLidarFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='ApogyExamplesLidar' childCreationExtenders='true' extensibleProviderFactory='true' copyrightText='Copyright (c) 2015-2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Pierre Allard (Pierre.Allard@canada.ca), \n    Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n    Sebastien Gemme (Sebastien.Gemme@canada.ca),\n    Canadian Space Agency (CSA) - Initial API and implementation' modelName='ApogyExamplesLidar' suppressGenModelAnnotations='false' dynamicTemplates='true' templateDirectory='platform:/plugin/ca.gc.asc_csa.apogy.common.emf.templates' modelDirectory='/ca.gc.asc_csa.apogy.examples.lidar/src-generated' editDirectory='/ca.gc.asc_csa.apogy.examples.lidar.edit/src-generated' basePackage='ca.gc.asc_csa.apogy.examples'"
 * @generated
 */
public interface ApogyExamplesLidarPackage extends EPackage
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
  String eNS_URI = "ca.gc.asc_csa.apogy.examples.lidar";

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
  ApogyExamplesLidarPackage eINSTANCE = ca.gc.asc_csa.apogy.examples.lidar.impl.ApogyExamplesLidarPackageImpl.init();

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.examples.lidar.impl.LidarImpl <em>Lidar</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.examples.lidar.impl.LidarImpl
	 * @see ca.gc.asc_csa.apogy.examples.lidar.impl.ApogyExamplesLidarPackageImpl#getLidar()
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
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.examples.lidar.impl.LidarStubImpl <em>Lidar Stub</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.examples.lidar.impl.LidarStubImpl
	 * @see ca.gc.asc_csa.apogy.examples.lidar.impl.ApogyExamplesLidarPackageImpl#getLidarStub()
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
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.examples.lidar.impl.LidarSimulatedImpl <em>Lidar Simulated</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.examples.lidar.impl.LidarSimulatedImpl
	 * @see ca.gc.asc_csa.apogy.examples.lidar.impl.ApogyExamplesLidarPackageImpl#getLidarSimulated()
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
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.examples.lidar.Lidar <em>Lidar</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lidar</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.lidar.Lidar
	 * @generated
	 */
  EClass getLidar();

  /**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.examples.lidar.Lidar#getFov <em>Fov</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fov</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.lidar.Lidar#getFov()
	 * @see #getLidar()
	 * @generated
	 */
  EReference getLidar_Fov();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.examples.lidar.Lidar#isInitialized <em>Initialized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initialized</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.lidar.Lidar#isInitialized()
	 * @see #getLidar()
	 * @generated
	 */
	EAttribute getLidar_Initialized();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.examples.lidar.Lidar#init() <em>Init</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Init</em>' operation.
	 * @see ca.gc.asc_csa.apogy.examples.lidar.Lidar#init()
	 * @generated
	 */
	EOperation getLidar__Init();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.examples.lidar.Lidar#acquireScan(double, double) <em>Acquire Scan</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Acquire Scan</em>' operation.
	 * @see ca.gc.asc_csa.apogy.examples.lidar.Lidar#acquireScan(double, double)
	 * @generated
	 */
  EOperation getLidar__AcquireScan__double_double();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.examples.lidar.Lidar#acquireScanNonBlocking(double, double) <em>Acquire Scan Non Blocking</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Acquire Scan Non Blocking</em>' operation.
	 * @see ca.gc.asc_csa.apogy.examples.lidar.Lidar#acquireScanNonBlocking(double, double)
	 * @generated
	 */
  EOperation getLidar__AcquireScanNonBlocking__double_double();

  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.examples.lidar.LidarStub <em>Lidar Stub</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lidar Stub</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.lidar.LidarStub
	 * @generated
	 */
  EClass getLidarStub();

  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.examples.lidar.LidarSimulated <em>Lidar Simulated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lidar Simulated</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.lidar.LidarSimulated
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
	ApogyExamplesLidarFactory getApogyExamplesLidarFactory();

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
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.examples.lidar.impl.LidarImpl <em>Lidar</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.examples.lidar.impl.LidarImpl
		 * @see ca.gc.asc_csa.apogy.examples.lidar.impl.ApogyExamplesLidarPackageImpl#getLidar()
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
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.examples.lidar.impl.LidarStubImpl <em>Lidar Stub</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.examples.lidar.impl.LidarStubImpl
		 * @see ca.gc.asc_csa.apogy.examples.lidar.impl.ApogyExamplesLidarPackageImpl#getLidarStub()
		 * @generated
		 */
    EClass LIDAR_STUB = eINSTANCE.getLidarStub();

				/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.examples.lidar.impl.LidarSimulatedImpl <em>Lidar Simulated</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.examples.lidar.impl.LidarSimulatedImpl
		 * @see ca.gc.asc_csa.apogy.examples.lidar.impl.ApogyExamplesLidarPackageImpl#getLidarSimulated()
		 * @generated
		 */
		EClass LIDAR_SIMULATED = eINSTANCE.getLidarSimulated();

  }

} //ApogyExamplesLidarPackage
