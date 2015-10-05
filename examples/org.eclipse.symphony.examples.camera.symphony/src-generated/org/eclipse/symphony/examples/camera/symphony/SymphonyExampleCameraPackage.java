/**
 * Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015
 */
package org.eclipse.symphony.examples.camera.symphony;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import ca.gc.asc_csa.symphony.core.SymphonyCorePackage;

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
 * @see org.eclipse.symphony.examples.camera.symphony.SymphonyExampleCameraFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='SymphonyExampleCamera' copyrightText='Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015' modelName='SymphonyExampleCamera' modelDirectory='/org.eclipse.symphony.examples.camera.symphony/src-generated' editDirectory='/org.eclipse.symphony.examples.camera.symphony.edit/src-generated' basePackage='org.eclipse.symphony.examples.camera'"
 * @generated
 */
public interface SymphonyExampleCameraPackage extends EPackage
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
  String eNS_URI = "org.eclipse.symphony.examples.camera.symphony";

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
  SymphonyExampleCameraPackage eINSTANCE = org.eclipse.symphony.examples.camera.symphony.impl.SymphonyExampleCameraPackageImpl.init();

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.examples.camera.symphony.impl.CameraSymphonySystemApiAdapterImpl <em>Camera Symphony System Api Adapter</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.examples.camera.symphony.impl.CameraSymphonySystemApiAdapterImpl
	 * @see org.eclipse.symphony.examples.camera.symphony.impl.SymphonyExampleCameraPackageImpl#getCameraSymphonySystemApiAdapter()
	 * @generated
	 */
  int CAMERA_SYMPHONY_SYSTEM_API_ADAPTER = 0;

  /**
	 * The feature id for the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_SYMPHONY_SYSTEM_API_ADAPTER__ENVIRONMENT = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER__ENVIRONMENT;

		/**
	 * The feature id for the '<em><b>Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_SYMPHONY_SYSTEM_API_ADAPTER__INSTANCE = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER__INSTANCE;

		/**
	 * The feature id for the '<em><b>Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_SYMPHONY_SYSTEM_API_ADAPTER__ELEMENT_TYPE = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER__ELEMENT_TYPE;

		/**
	 * The feature id for the '<em><b>Pose Transform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CAMERA_SYMPHONY_SYSTEM_API_ADAPTER__POSE_TRANSFORM = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER__POSE_TRANSFORM;

  /**
	 * The feature id for the '<em><b>Pose Corrector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_SYMPHONY_SYSTEM_API_ADAPTER__POSE_CORRECTOR = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER__POSE_CORRECTOR;

		/**
	 * The feature id for the '<em><b>Symphony System</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CAMERA_SYMPHONY_SYSTEM_API_ADAPTER__SYMPHONY_SYSTEM = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER__SYMPHONY_SYSTEM;

  /**
	 * The number of structural features of the '<em>Camera Symphony System Api Adapter</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CAMERA_SYMPHONY_SYSTEM_API_ADAPTER_FEATURE_COUNT = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER_FEATURE_COUNT + 0;

  /**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_SYMPHONY_SYSTEM_API_ADAPTER___INIT__ENVIRONMENT_TYPE_EOBJECT = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER___INIT__ENVIRONMENT_TYPE_EOBJECT;

		/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_SYMPHONY_SYSTEM_API_ADAPTER___APPLY__ABSTRACTINITIALIZATIONDATA = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER___APPLY__ABSTRACTINITIALIZATIONDATA;

		/**
	 * The operation id for the '<em>Create Initialization Data</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_SYMPHONY_SYSTEM_API_ADAPTER___CREATE_INITIALIZATION_DATA = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER___CREATE_INITIALIZATION_DATA;

		/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_SYMPHONY_SYSTEM_API_ADAPTER___COLLECT__ABSTRACTINITIALIZATIONDATA = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER___COLLECT__ABSTRACTINITIALIZATIONDATA;

		/**
	 * The operation id for the '<em>Create Result</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_SYMPHONY_SYSTEM_API_ADAPTER___CREATE_RESULT__OPERATIONCALL = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER___CREATE_RESULT__OPERATIONCALL;

		/**
	 * The operation id for the '<em>Create Result</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_SYMPHONY_SYSTEM_API_ADAPTER___CREATE_RESULT__OPERATIONCALL_LONG_OBJECT_EXCEPTION = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER___CREATE_RESULT__OPERATIONCALL_LONG_OBJECT_EXCEPTION;

		/**
	 * The operation id for the '<em>Invoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_SYMPHONY_SYSTEM_API_ADAPTER___INVOKE__EOBJECT_OPERATIONCALL_BOOLEAN = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER___INVOKE__EOBJECT_OPERATIONCALL_BOOLEAN;

		/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_SYMPHONY_SYSTEM_API_ADAPTER___DISPOSE = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER___DISPOSE;

		/**
	 * The operation id for the '<em>Create Result Matrix</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_SYMPHONY_SYSTEM_API_ADAPTER___CREATE_RESULT_MATRIX__OPERATIONCALL = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER___CREATE_RESULT_MATRIX__OPERATIONCALL;

		/**
	 * The number of operations of the '<em>Camera Symphony System Api Adapter</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CAMERA_SYMPHONY_SYSTEM_API_ADAPTER_OPERATION_COUNT = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.examples.camera.symphony.impl.CameraDataImpl <em>Camera Data</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.examples.camera.symphony.impl.CameraDataImpl
	 * @see org.eclipse.symphony.examples.camera.symphony.impl.SymphonyExampleCameraPackageImpl#getCameraData()
	 * @generated
	 */
  int CAMERA_DATA = 1;

  /**
	 * The feature id for the '<em><b>Initial Pose Transform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CAMERA_DATA__INITIAL_POSE_TRANSFORM = SymphonyCorePackage.SYMPHONY_INITIALIZATION_DATA__INITIAL_POSE_TRANSFORM;

  /**
	 * The feature id for the '<em><b>Fov</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_DATA__FOV = SymphonyCorePackage.SYMPHONY_INITIALIZATION_DATA_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Zoom</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CAMERA_DATA__ZOOM = SymphonyCorePackage.SYMPHONY_INITIALIZATION_DATA_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Initialized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_DATA__INITIALIZED = SymphonyCorePackage.SYMPHONY_INITIALIZATION_DATA_FEATURE_COUNT + 2;

		/**
	 * The number of structural features of the '<em>Camera Data</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CAMERA_DATA_FEATURE_COUNT = SymphonyCorePackage.SYMPHONY_INITIALIZATION_DATA_FEATURE_COUNT + 3;

  /**
	 * The number of operations of the '<em>Camera Data</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CAMERA_DATA_OPERATION_COUNT = SymphonyCorePackage.SYMPHONY_INITIALIZATION_DATA_OPERATION_COUNT + 0;


  /**
	 * The meta object id for the '{@link org.eclipse.symphony.examples.camera.symphony.impl.PTUCameraSymphonySystemApiAdapterImpl <em>PTU Camera Symphony System Api Adapter</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.examples.camera.symphony.impl.PTUCameraSymphonySystemApiAdapterImpl
	 * @see org.eclipse.symphony.examples.camera.symphony.impl.SymphonyExampleCameraPackageImpl#getPTUCameraSymphonySystemApiAdapter()
	 * @generated
	 */
  int PTU_CAMERA_SYMPHONY_SYSTEM_API_ADAPTER = 2;

  /**
	 * The feature id for the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA_SYMPHONY_SYSTEM_API_ADAPTER__ENVIRONMENT = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER__ENVIRONMENT;

		/**
	 * The feature id for the '<em><b>Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA_SYMPHONY_SYSTEM_API_ADAPTER__INSTANCE = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER__INSTANCE;

		/**
	 * The feature id for the '<em><b>Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA_SYMPHONY_SYSTEM_API_ADAPTER__ELEMENT_TYPE = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER__ELEMENT_TYPE;

		/**
	 * The feature id for the '<em><b>Pose Transform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PTU_CAMERA_SYMPHONY_SYSTEM_API_ADAPTER__POSE_TRANSFORM = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER__POSE_TRANSFORM;

  /**
	 * The feature id for the '<em><b>Pose Corrector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA_SYMPHONY_SYSTEM_API_ADAPTER__POSE_CORRECTOR = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER__POSE_CORRECTOR;

		/**
	 * The feature id for the '<em><b>Symphony System</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PTU_CAMERA_SYMPHONY_SYSTEM_API_ADAPTER__SYMPHONY_SYSTEM = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER__SYMPHONY_SYSTEM;

  /**
	 * The number of structural features of the '<em>PTU Camera Symphony System Api Adapter</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PTU_CAMERA_SYMPHONY_SYSTEM_API_ADAPTER_FEATURE_COUNT = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER_FEATURE_COUNT + 0;

  /**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA_SYMPHONY_SYSTEM_API_ADAPTER___INIT__ENVIRONMENT_TYPE_EOBJECT = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER___INIT__ENVIRONMENT_TYPE_EOBJECT;

		/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA_SYMPHONY_SYSTEM_API_ADAPTER___APPLY__ABSTRACTINITIALIZATIONDATA = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER___APPLY__ABSTRACTINITIALIZATIONDATA;

		/**
	 * The operation id for the '<em>Create Initialization Data</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA_SYMPHONY_SYSTEM_API_ADAPTER___CREATE_INITIALIZATION_DATA = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER___CREATE_INITIALIZATION_DATA;

		/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA_SYMPHONY_SYSTEM_API_ADAPTER___COLLECT__ABSTRACTINITIALIZATIONDATA = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER___COLLECT__ABSTRACTINITIALIZATIONDATA;

		/**
	 * The operation id for the '<em>Create Result</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA_SYMPHONY_SYSTEM_API_ADAPTER___CREATE_RESULT__OPERATIONCALL = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER___CREATE_RESULT__OPERATIONCALL;

		/**
	 * The operation id for the '<em>Create Result</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA_SYMPHONY_SYSTEM_API_ADAPTER___CREATE_RESULT__OPERATIONCALL_LONG_OBJECT_EXCEPTION = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER___CREATE_RESULT__OPERATIONCALL_LONG_OBJECT_EXCEPTION;

		/**
	 * The operation id for the '<em>Invoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA_SYMPHONY_SYSTEM_API_ADAPTER___INVOKE__EOBJECT_OPERATIONCALL_BOOLEAN = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER___INVOKE__EOBJECT_OPERATIONCALL_BOOLEAN;

		/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA_SYMPHONY_SYSTEM_API_ADAPTER___DISPOSE = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER___DISPOSE;

		/**
	 * The operation id for the '<em>Create Result Matrix</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA_SYMPHONY_SYSTEM_API_ADAPTER___CREATE_RESULT_MATRIX__OPERATIONCALL = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER___CREATE_RESULT_MATRIX__OPERATIONCALL;

		/**
	 * The number of operations of the '<em>PTU Camera Symphony System Api Adapter</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PTU_CAMERA_SYMPHONY_SYSTEM_API_ADAPTER_OPERATION_COUNT = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.examples.camera.symphony.impl.PTUCameraDataImpl <em>PTU Camera Data</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.examples.camera.symphony.impl.PTUCameraDataImpl
	 * @see org.eclipse.symphony.examples.camera.symphony.impl.SymphonyExampleCameraPackageImpl#getPTUCameraData()
	 * @generated
	 */
  int PTU_CAMERA_DATA = 3;

  /**
	 * The feature id for the '<em><b>Initial Pose Transform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PTU_CAMERA_DATA__INITIAL_POSE_TRANSFORM = CAMERA_DATA__INITIAL_POSE_TRANSFORM;

  /**
	 * The feature id for the '<em><b>Fov</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA_DATA__FOV = CAMERA_DATA__FOV;

		/**
	 * The feature id for the '<em><b>Zoom</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PTU_CAMERA_DATA__ZOOM = CAMERA_DATA__ZOOM;

  /**
	 * The feature id for the '<em><b>Initialized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA_DATA__INITIALIZED = CAMERA_DATA__INITIALIZED;

		/**
	 * The feature id for the '<em><b>Pan Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA_DATA__PAN_ANGLE = CAMERA_DATA_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Tilt Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA_DATA__TILT_ANGLE = CAMERA_DATA_FEATURE_COUNT + 1;

		/**
	 * The number of structural features of the '<em>PTU Camera Data</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PTU_CAMERA_DATA_FEATURE_COUNT = CAMERA_DATA_FEATURE_COUNT + 2;

  /**
	 * The number of operations of the '<em>PTU Camera Data</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PTU_CAMERA_DATA_OPERATION_COUNT = CAMERA_DATA_OPERATION_COUNT + 0;


  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.examples.camera.symphony.CameraSymphonySystemApiAdapter <em>Camera Symphony System Api Adapter</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Camera Symphony System Api Adapter</em>'.
	 * @see org.eclipse.symphony.examples.camera.symphony.CameraSymphonySystemApiAdapter
	 * @generated
	 */
  EClass getCameraSymphonySystemApiAdapter();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.examples.camera.symphony.CameraData <em>Camera Data</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Camera Data</em>'.
	 * @see org.eclipse.symphony.examples.camera.symphony.CameraData
	 * @generated
	 */
  EClass getCameraData();

  /**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.examples.camera.symphony.CameraData#getFov <em>Fov</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fov</em>'.
	 * @see org.eclipse.symphony.examples.camera.symphony.CameraData#getFov()
	 * @see #getCameraData()
	 * @generated
	 */
	EReference getCameraData_Fov();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.examples.camera.symphony.CameraData#getZoom <em>Zoom</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zoom</em>'.
	 * @see org.eclipse.symphony.examples.camera.symphony.CameraData#getZoom()
	 * @see #getCameraData()
	 * @generated
	 */
  EAttribute getCameraData_Zoom();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.examples.camera.symphony.CameraData#isInitialized <em>Initialized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initialized</em>'.
	 * @see org.eclipse.symphony.examples.camera.symphony.CameraData#isInitialized()
	 * @see #getCameraData()
	 * @generated
	 */
	EAttribute getCameraData_Initialized();

		/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.examples.camera.symphony.PTUCameraSymphonySystemApiAdapter <em>PTU Camera Symphony System Api Adapter</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PTU Camera Symphony System Api Adapter</em>'.
	 * @see org.eclipse.symphony.examples.camera.symphony.PTUCameraSymphonySystemApiAdapter
	 * @generated
	 */
  EClass getPTUCameraSymphonySystemApiAdapter();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.examples.camera.symphony.PTUCameraData <em>PTU Camera Data</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PTU Camera Data</em>'.
	 * @see org.eclipse.symphony.examples.camera.symphony.PTUCameraData
	 * @generated
	 */
  EClass getPTUCameraData();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.examples.camera.symphony.PTUCameraData#getPanAngle <em>Pan Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pan Angle</em>'.
	 * @see org.eclipse.symphony.examples.camera.symphony.PTUCameraData#getPanAngle()
	 * @see #getPTUCameraData()
	 * @generated
	 */
	EAttribute getPTUCameraData_PanAngle();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.examples.camera.symphony.PTUCameraData#getTiltAngle <em>Tilt Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tilt Angle</em>'.
	 * @see org.eclipse.symphony.examples.camera.symphony.PTUCameraData#getTiltAngle()
	 * @see #getPTUCameraData()
	 * @generated
	 */
	EAttribute getPTUCameraData_TiltAngle();

		/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
  SymphonyExampleCameraFactory getSymphonyExampleCameraFactory();

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
		 * The meta object literal for the '{@link org.eclipse.symphony.examples.camera.symphony.impl.CameraSymphonySystemApiAdapterImpl <em>Camera Symphony System Api Adapter</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.examples.camera.symphony.impl.CameraSymphonySystemApiAdapterImpl
		 * @see org.eclipse.symphony.examples.camera.symphony.impl.SymphonyExampleCameraPackageImpl#getCameraSymphonySystemApiAdapter()
		 * @generated
		 */
    EClass CAMERA_SYMPHONY_SYSTEM_API_ADAPTER = eINSTANCE.getCameraSymphonySystemApiAdapter();
    /**
		 * The meta object literal for the '{@link org.eclipse.symphony.examples.camera.symphony.impl.CameraDataImpl <em>Camera Data</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.examples.camera.symphony.impl.CameraDataImpl
		 * @see org.eclipse.symphony.examples.camera.symphony.impl.SymphonyExampleCameraPackageImpl#getCameraData()
		 * @generated
		 */
    EClass CAMERA_DATA = eINSTANCE.getCameraData();
    /**
		 * The meta object literal for the '<em><b>Fov</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAMERA_DATA__FOV = eINSTANCE.getCameraData_Fov();
				/**
		 * The meta object literal for the '<em><b>Zoom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute CAMERA_DATA__ZOOM = eINSTANCE.getCameraData_Zoom();
    /**
		 * The meta object literal for the '<em><b>Initialized</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAMERA_DATA__INITIALIZED = eINSTANCE.getCameraData_Initialized();
				/**
		 * The meta object literal for the '{@link org.eclipse.symphony.examples.camera.symphony.impl.PTUCameraSymphonySystemApiAdapterImpl <em>PTU Camera Symphony System Api Adapter</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.examples.camera.symphony.impl.PTUCameraSymphonySystemApiAdapterImpl
		 * @see org.eclipse.symphony.examples.camera.symphony.impl.SymphonyExampleCameraPackageImpl#getPTUCameraSymphonySystemApiAdapter()
		 * @generated
		 */
    EClass PTU_CAMERA_SYMPHONY_SYSTEM_API_ADAPTER = eINSTANCE.getPTUCameraSymphonySystemApiAdapter();
    /**
		 * The meta object literal for the '{@link org.eclipse.symphony.examples.camera.symphony.impl.PTUCameraDataImpl <em>PTU Camera Data</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.examples.camera.symphony.impl.PTUCameraDataImpl
		 * @see org.eclipse.symphony.examples.camera.symphony.impl.SymphonyExampleCameraPackageImpl#getPTUCameraData()
		 * @generated
		 */
    EClass PTU_CAMERA_DATA = eINSTANCE.getPTUCameraData();
    /**
		 * The meta object literal for the '<em><b>Pan Angle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PTU_CAMERA_DATA__PAN_ANGLE = eINSTANCE.getPTUCameraData_PanAngle();
				/**
		 * The meta object literal for the '<em><b>Tilt Angle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PTU_CAMERA_DATA__TILT_ANGLE = eINSTANCE.getPTUCameraData_TiltAngle();

  }

} //SymphonyExampleCameraPackage
