/**
 * Canadian Space Agency / Agence spatiale canadienne - Copyright (c) 2015
 */
package org.eclipse.symphony.examples.camera;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.symphony.addons.sensors.imaging.Symphony__AddonsSensorsImagingPackage;

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
 * @see org.eclipse.symphony.examples.camera.Symphony__ExamplesCameraFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='Symphony__ExamplesCamera' copyrightText='Canadian Space Agency / Agence spatiale canadienne - Copyright (c) 2015' modelName='Symphony__ExamplesCamera' childCreationExtenders='true' extensibleProviderFactory='true' suppressGenModelAnnotations='false' modelDirectory='/org.eclipse.symphony.examples.camera/src-generated' editDirectory='/org.eclipse.symphony.examples.camera.edit/src-generated' basePackage='org.eclipse.symphony.examples'"
 * @generated
 */
public interface Symphony__ExamplesCameraPackage extends EPackage
{

  /**
	 * The package name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNAME = "camera";
  /**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_URI = "org.eclipse.symphony.examples.camera";
  /**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_PREFIX = "camera";
  /**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  Symphony__ExamplesCameraPackage eINSTANCE = org.eclipse.symphony.examples.camera.impl.Symphony__ExamplesCameraPackageImpl.init();
  /**
	 * The meta object id for the '{@link org.eclipse.symphony.examples.camera.impl.CameraImpl <em>Camera</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.examples.camera.impl.CameraImpl
	 * @see org.eclipse.symphony.examples.camera.impl.Symphony__ExamplesCameraPackageImpl#getCamera()
	 * @generated
	 */
  int CAMERA = 0;
  /**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA__PARENT = Symphony__AddonsSensorsImagingPackage.ABSTRACT_CAMERA__PARENT;
		/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA__DESCRIPTION = Symphony__AddonsSensorsImagingPackage.ABSTRACT_CAMERA__DESCRIPTION;
		/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA__NODE_ID = Symphony__AddonsSensorsImagingPackage.ABSTRACT_CAMERA__NODE_ID;
		/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA__CHILDREN = Symphony__AddonsSensorsImagingPackage.ABSTRACT_CAMERA__CHILDREN;
		/**
	 * The feature id for the '<em><b>Aggregated Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA__AGGREGATED_CHILDREN = Symphony__AddonsSensorsImagingPackage.ABSTRACT_CAMERA__AGGREGATED_CHILDREN;
		/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA__STATUS = Symphony__AddonsSensorsImagingPackage.ABSTRACT_CAMERA__STATUS;
		/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA__NAME = Symphony__AddonsSensorsImagingPackage.ABSTRACT_CAMERA__NAME;
		/**
	 * The feature id for the '<em><b>Latest Image Snapshot</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CAMERA__LATEST_IMAGE_SNAPSHOT = Symphony__AddonsSensorsImagingPackage.ABSTRACT_CAMERA__LATEST_IMAGE_SNAPSHOT;
  /**
	 * The feature id for the '<em><b>Current Zoom</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CAMERA__CURRENT_ZOOM = Symphony__AddonsSensorsImagingPackage.ABSTRACT_CAMERA_FEATURE_COUNT + 0;
  /**
	 * The feature id for the '<em><b>Commanded Zoom</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CAMERA__COMMANDED_ZOOM = Symphony__AddonsSensorsImagingPackage.ABSTRACT_CAMERA_FEATURE_COUNT + 1;
  /**
	 * The feature id for the '<em><b>Fov</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CAMERA__FOV = Symphony__AddonsSensorsImagingPackage.ABSTRACT_CAMERA_FEATURE_COUNT + 2;
  /**
	 * The feature id for the '<em><b>Initialized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA__INITIALIZED = Symphony__AddonsSensorsImagingPackage.ABSTRACT_CAMERA_FEATURE_COUNT + 3;
		/**
	 * The feature id for the '<em><b>Streaming Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA__STREAMING_ENABLED = Symphony__AddonsSensorsImagingPackage.ABSTRACT_CAMERA_FEATURE_COUNT + 4;
		/**
	 * The number of structural features of the '<em>Camera</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CAMERA_FEATURE_COUNT = Symphony__AddonsSensorsImagingPackage.ABSTRACT_CAMERA_FEATURE_COUNT + 5;
  /**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA___ACCEPT__INODEVISITOR = Symphony__AddonsSensorsImagingPackage.ABSTRACT_CAMERA___ACCEPT__INODEVISITOR;
		/**
	 * The operation id for the '<em>Take Snapshot</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CAMERA___TAKE_SNAPSHOT = Symphony__AddonsSensorsImagingPackage.ABSTRACT_CAMERA___TAKE_SNAPSHOT;
  /**
	 * The operation id for the '<em>Get Field Of View</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CAMERA___GET_FIELD_OF_VIEW = Symphony__AddonsSensorsImagingPackage.ABSTRACT_CAMERA___GET_FIELD_OF_VIEW;
  /**
	 * The operation id for the '<em>Command Zoom</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CAMERA___COMMAND_ZOOM__DOUBLE = Symphony__AddonsSensorsImagingPackage.ABSTRACT_CAMERA_OPERATION_COUNT + 0;
  /**
	 * The operation id for the '<em>Get Minimum Zoom</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CAMERA___GET_MINIMUM_ZOOM = Symphony__AddonsSensorsImagingPackage.ABSTRACT_CAMERA_OPERATION_COUNT + 1;
  /**
	 * The operation id for the '<em>Get Maximum Zoom</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CAMERA___GET_MAXIMUM_ZOOM = Symphony__AddonsSensorsImagingPackage.ABSTRACT_CAMERA_OPERATION_COUNT + 2;
  /**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA___INIT = Symphony__AddonsSensorsImagingPackage.ABSTRACT_CAMERA_OPERATION_COUNT + 3;
		/**
	 * The operation id for the '<em>Command Streaming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA___COMMAND_STREAMING__BOOLEAN = Symphony__AddonsSensorsImagingPackage.ABSTRACT_CAMERA_OPERATION_COUNT + 4;
		/**
	 * The number of operations of the '<em>Camera</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CAMERA_OPERATION_COUNT = Symphony__AddonsSensorsImagingPackage.ABSTRACT_CAMERA_OPERATION_COUNT + 5;
  /**
	 * The meta object id for the '{@link org.eclipse.symphony.examples.camera.impl.CameraStubImpl <em>Camera Stub</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.examples.camera.impl.CameraStubImpl
	 * @see org.eclipse.symphony.examples.camera.impl.Symphony__ExamplesCameraPackageImpl#getCameraStub()
	 * @generated
	 */
	int CAMERA_STUB = 1;
		/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_STUB__PARENT = CAMERA__PARENT;
		/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_STUB__DESCRIPTION = CAMERA__DESCRIPTION;
		/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_STUB__NODE_ID = CAMERA__NODE_ID;
		/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_STUB__CHILDREN = CAMERA__CHILDREN;
		/**
	 * The feature id for the '<em><b>Aggregated Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_STUB__AGGREGATED_CHILDREN = CAMERA__AGGREGATED_CHILDREN;
		/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_STUB__STATUS = CAMERA__STATUS;
		/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_STUB__NAME = CAMERA__NAME;
		/**
	 * The feature id for the '<em><b>Latest Image Snapshot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_STUB__LATEST_IMAGE_SNAPSHOT = CAMERA__LATEST_IMAGE_SNAPSHOT;
		/**
	 * The feature id for the '<em><b>Current Zoom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_STUB__CURRENT_ZOOM = CAMERA__CURRENT_ZOOM;
		/**
	 * The feature id for the '<em><b>Commanded Zoom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_STUB__COMMANDED_ZOOM = CAMERA__COMMANDED_ZOOM;
		/**
	 * The feature id for the '<em><b>Fov</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_STUB__FOV = CAMERA__FOV;
		/**
	 * The feature id for the '<em><b>Initialized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_STUB__INITIALIZED = CAMERA__INITIALIZED;
		/**
	 * The feature id for the '<em><b>Streaming Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_STUB__STREAMING_ENABLED = CAMERA__STREAMING_ENABLED;
		/**
	 * The number of structural features of the '<em>Camera Stub</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_STUB_FEATURE_COUNT = CAMERA_FEATURE_COUNT + 0;
		/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_STUB___ACCEPT__INODEVISITOR = CAMERA___ACCEPT__INODEVISITOR;
		/**
	 * The operation id for the '<em>Take Snapshot</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_STUB___TAKE_SNAPSHOT = CAMERA___TAKE_SNAPSHOT;
		/**
	 * The operation id for the '<em>Get Field Of View</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_STUB___GET_FIELD_OF_VIEW = CAMERA___GET_FIELD_OF_VIEW;
		/**
	 * The operation id for the '<em>Command Zoom</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_STUB___COMMAND_ZOOM__DOUBLE = CAMERA___COMMAND_ZOOM__DOUBLE;
		/**
	 * The operation id for the '<em>Get Minimum Zoom</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_STUB___GET_MINIMUM_ZOOM = CAMERA___GET_MINIMUM_ZOOM;
		/**
	 * The operation id for the '<em>Get Maximum Zoom</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_STUB___GET_MAXIMUM_ZOOM = CAMERA___GET_MAXIMUM_ZOOM;
		/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_STUB___INIT = CAMERA___INIT;
		/**
	 * The operation id for the '<em>Command Streaming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_STUB___COMMAND_STREAMING__BOOLEAN = CAMERA___COMMAND_STREAMING__BOOLEAN;
		/**
	 * The number of operations of the '<em>Camera Stub</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_STUB_OPERATION_COUNT = CAMERA_OPERATION_COUNT + 0;
		/**
	 * The meta object id for the '{@link org.eclipse.symphony.examples.camera.impl.CameraSimulatedImpl <em>Camera Simulated</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.examples.camera.impl.CameraSimulatedImpl
	 * @see org.eclipse.symphony.examples.camera.impl.Symphony__ExamplesCameraPackageImpl#getCameraSimulated()
	 * @generated
	 */
	int CAMERA_SIMULATED = 2;
		/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_SIMULATED__PARENT = CAMERA__PARENT;
		/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_SIMULATED__DESCRIPTION = CAMERA__DESCRIPTION;
		/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_SIMULATED__NODE_ID = CAMERA__NODE_ID;
		/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_SIMULATED__CHILDREN = CAMERA__CHILDREN;
		/**
	 * The feature id for the '<em><b>Aggregated Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_SIMULATED__AGGREGATED_CHILDREN = CAMERA__AGGREGATED_CHILDREN;
		/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_SIMULATED__STATUS = CAMERA__STATUS;
		/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_SIMULATED__NAME = CAMERA__NAME;
		/**
	 * The feature id for the '<em><b>Latest Image Snapshot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_SIMULATED__LATEST_IMAGE_SNAPSHOT = CAMERA__LATEST_IMAGE_SNAPSHOT;
		/**
	 * The feature id for the '<em><b>Current Zoom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_SIMULATED__CURRENT_ZOOM = CAMERA__CURRENT_ZOOM;
		/**
	 * The feature id for the '<em><b>Commanded Zoom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_SIMULATED__COMMANDED_ZOOM = CAMERA__COMMANDED_ZOOM;
		/**
	 * The feature id for the '<em><b>Fov</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_SIMULATED__FOV = CAMERA__FOV;
		/**
	 * The feature id for the '<em><b>Initialized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_SIMULATED__INITIALIZED = CAMERA__INITIALIZED;
		/**
	 * The feature id for the '<em><b>Streaming Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_SIMULATED__STREAMING_ENABLED = CAMERA__STREAMING_ENABLED;
		/**
	 * The number of structural features of the '<em>Camera Simulated</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_SIMULATED_FEATURE_COUNT = CAMERA_FEATURE_COUNT + 0;
		/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_SIMULATED___ACCEPT__INODEVISITOR = CAMERA___ACCEPT__INODEVISITOR;
		/**
	 * The operation id for the '<em>Take Snapshot</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_SIMULATED___TAKE_SNAPSHOT = CAMERA___TAKE_SNAPSHOT;
		/**
	 * The operation id for the '<em>Get Field Of View</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_SIMULATED___GET_FIELD_OF_VIEW = CAMERA___GET_FIELD_OF_VIEW;
		/**
	 * The operation id for the '<em>Command Zoom</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_SIMULATED___COMMAND_ZOOM__DOUBLE = CAMERA___COMMAND_ZOOM__DOUBLE;
		/**
	 * The operation id for the '<em>Get Minimum Zoom</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_SIMULATED___GET_MINIMUM_ZOOM = CAMERA___GET_MINIMUM_ZOOM;
		/**
	 * The operation id for the '<em>Get Maximum Zoom</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_SIMULATED___GET_MAXIMUM_ZOOM = CAMERA___GET_MAXIMUM_ZOOM;
		/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_SIMULATED___INIT = CAMERA___INIT;
		/**
	 * The operation id for the '<em>Command Streaming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_SIMULATED___COMMAND_STREAMING__BOOLEAN = CAMERA___COMMAND_STREAMING__BOOLEAN;
		/**
	 * The number of operations of the '<em>Camera Simulated</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_SIMULATED_OPERATION_COUNT = CAMERA_OPERATION_COUNT + 0;
		/**
	 * The meta object id for the '{@link org.eclipse.symphony.examples.camera.impl.PTUCameraImpl <em>PTU Camera</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.examples.camera.impl.PTUCameraImpl
	 * @see org.eclipse.symphony.examples.camera.impl.Symphony__ExamplesCameraPackageImpl#getPTUCamera()
	 * @generated
	 */
  int PTU_CAMERA = 3;
  /**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA__PARENT = CAMERA__PARENT;
		/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA__DESCRIPTION = CAMERA__DESCRIPTION;
		/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA__NODE_ID = CAMERA__NODE_ID;
		/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA__CHILDREN = CAMERA__CHILDREN;
		/**
	 * The feature id for the '<em><b>Aggregated Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA__AGGREGATED_CHILDREN = CAMERA__AGGREGATED_CHILDREN;
		/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA__STATUS = CAMERA__STATUS;
		/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA__NAME = CAMERA__NAME;
		/**
	 * The feature id for the '<em><b>Latest Image Snapshot</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PTU_CAMERA__LATEST_IMAGE_SNAPSHOT = CAMERA__LATEST_IMAGE_SNAPSHOT;
  /**
	 * The feature id for the '<em><b>Current Zoom</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PTU_CAMERA__CURRENT_ZOOM = CAMERA__CURRENT_ZOOM;
  /**
	 * The feature id for the '<em><b>Commanded Zoom</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PTU_CAMERA__COMMANDED_ZOOM = CAMERA__COMMANDED_ZOOM;
  /**
	 * The feature id for the '<em><b>Fov</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PTU_CAMERA__FOV = CAMERA__FOV;
  /**
	 * The feature id for the '<em><b>Initialized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA__INITIALIZED = CAMERA__INITIALIZED;
		/**
	 * The feature id for the '<em><b>Streaming Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA__STREAMING_ENABLED = CAMERA__STREAMING_ENABLED;
		/**
	 * The feature id for the '<em><b>Moving</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PTU_CAMERA__MOVING = CAMERA_FEATURE_COUNT + 0;
  /**
	 * The feature id for the '<em><b>Actuator Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PTU_CAMERA__ACTUATOR_STATUS = CAMERA_FEATURE_COUNT + 1;
  /**
	 * The feature id for the '<em><b>Current Pan Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PTU_CAMERA__CURRENT_PAN_ANGLE = CAMERA_FEATURE_COUNT + 2;
  /**
	 * The feature id for the '<em><b>Current Tilt Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PTU_CAMERA__CURRENT_TILT_ANGLE = CAMERA_FEATURE_COUNT + 3;
  /**
	 * The feature id for the '<em><b>Commanded Pan Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PTU_CAMERA__COMMANDED_PAN_ANGLE = CAMERA_FEATURE_COUNT + 4;
  /**
	 * The feature id for the '<em><b>Commanded Tilt Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PTU_CAMERA__COMMANDED_TILT_ANGLE = CAMERA_FEATURE_COUNT + 5;
  /**
	 * The number of structural features of the '<em>PTU Camera</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PTU_CAMERA_FEATURE_COUNT = CAMERA_FEATURE_COUNT + 6;
  /**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA___ACCEPT__INODEVISITOR = CAMERA___ACCEPT__INODEVISITOR;
		/**
	 * The operation id for the '<em>Take Snapshot</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PTU_CAMERA___TAKE_SNAPSHOT = CAMERA___TAKE_SNAPSHOT;
  /**
	 * The operation id for the '<em>Get Field Of View</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PTU_CAMERA___GET_FIELD_OF_VIEW = CAMERA___GET_FIELD_OF_VIEW;
  /**
	 * The operation id for the '<em>Command Zoom</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PTU_CAMERA___COMMAND_ZOOM__DOUBLE = CAMERA___COMMAND_ZOOM__DOUBLE;
  /**
	 * The operation id for the '<em>Get Minimum Zoom</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PTU_CAMERA___GET_MINIMUM_ZOOM = CAMERA___GET_MINIMUM_ZOOM;
  /**
	 * The operation id for the '<em>Get Maximum Zoom</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PTU_CAMERA___GET_MAXIMUM_ZOOM = CAMERA___GET_MAXIMUM_ZOOM;
  /**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA___INIT = CAMERA___INIT;
		/**
	 * The operation id for the '<em>Command Streaming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA___COMMAND_STREAMING__BOOLEAN = CAMERA___COMMAND_STREAMING__BOOLEAN;
		/**
	 * The operation id for the '<em>Get Maximum Pan Angle</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PTU_CAMERA___GET_MAXIMUM_PAN_ANGLE = CAMERA_OPERATION_COUNT + 0;
  /**
	 * The operation id for the '<em>Get Minimum Pan Angle</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PTU_CAMERA___GET_MINIMUM_PAN_ANGLE = CAMERA_OPERATION_COUNT + 1;
  /**
	 * The operation id for the '<em>Get Maximum Tilt Angle</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PTU_CAMERA___GET_MAXIMUM_TILT_ANGLE = CAMERA_OPERATION_COUNT + 2;
  /**
	 * The operation id for the '<em>Get Minimum Tilt Angle</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PTU_CAMERA___GET_MINIMUM_TILT_ANGLE = CAMERA_OPERATION_COUNT + 3;
  /**
	 * The operation id for the '<em>Move To Pan Tilt</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PTU_CAMERA___MOVE_TO_PAN_TILT__DOUBLE_DOUBLE = CAMERA_OPERATION_COUNT + 4;
  /**
	 * The operation id for the '<em>Move To Pan</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PTU_CAMERA___MOVE_TO_PAN__DOUBLE = CAMERA_OPERATION_COUNT + 5;
  /**
	 * The operation id for the '<em>Move To Tilt</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PTU_CAMERA___MOVE_TO_TILT__DOUBLE = CAMERA_OPERATION_COUNT + 6;
  /**
	 * The operation id for the '<em>Move By Pan Tilt</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PTU_CAMERA___MOVE_BY_PAN_TILT__DOUBLE_DOUBLE = CAMERA_OPERATION_COUNT + 7;
  /**
	 * The operation id for the '<em>Move By Pan</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PTU_CAMERA___MOVE_BY_PAN__DOUBLE = CAMERA_OPERATION_COUNT + 8;
  /**
	 * The operation id for the '<em>Move By Tilt</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PTU_CAMERA___MOVE_BY_TILT__DOUBLE = CAMERA_OPERATION_COUNT + 9;
  /**
	 * The operation id for the '<em>Stop Motion</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PTU_CAMERA___STOP_MOTION = CAMERA_OPERATION_COUNT + 10;
  /**
	 * The number of operations of the '<em>PTU Camera</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PTU_CAMERA_OPERATION_COUNT = CAMERA_OPERATION_COUNT + 11;
  /**
	 * The meta object id for the '{@link org.eclipse.symphony.examples.camera.impl.PTUCameraStubImpl <em>PTU Camera Stub</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.examples.camera.impl.PTUCameraStubImpl
	 * @see org.eclipse.symphony.examples.camera.impl.Symphony__ExamplesCameraPackageImpl#getPTUCameraStub()
	 * @generated
	 */
	int PTU_CAMERA_STUB = 4;
		/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA_STUB__PARENT = CAMERA_STUB__PARENT;
		/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA_STUB__DESCRIPTION = CAMERA_STUB__DESCRIPTION;
		/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA_STUB__NODE_ID = CAMERA_STUB__NODE_ID;
		/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA_STUB__CHILDREN = CAMERA_STUB__CHILDREN;
		/**
	 * The feature id for the '<em><b>Aggregated Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA_STUB__AGGREGATED_CHILDREN = CAMERA_STUB__AGGREGATED_CHILDREN;
		/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA_STUB__STATUS = CAMERA_STUB__STATUS;
		/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA_STUB__NAME = CAMERA_STUB__NAME;
		/**
	 * The feature id for the '<em><b>Latest Image Snapshot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA_STUB__LATEST_IMAGE_SNAPSHOT = CAMERA_STUB__LATEST_IMAGE_SNAPSHOT;
		/**
	 * The feature id for the '<em><b>Current Zoom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA_STUB__CURRENT_ZOOM = CAMERA_STUB__CURRENT_ZOOM;
		/**
	 * The feature id for the '<em><b>Commanded Zoom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA_STUB__COMMANDED_ZOOM = CAMERA_STUB__COMMANDED_ZOOM;
		/**
	 * The feature id for the '<em><b>Fov</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA_STUB__FOV = CAMERA_STUB__FOV;
		/**
	 * The feature id for the '<em><b>Initialized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA_STUB__INITIALIZED = CAMERA_STUB__INITIALIZED;
		/**
	 * The feature id for the '<em><b>Streaming Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA_STUB__STREAMING_ENABLED = CAMERA_STUB__STREAMING_ENABLED;
		/**
	 * The feature id for the '<em><b>Moving</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA_STUB__MOVING = CAMERA_STUB_FEATURE_COUNT + 0;
		/**
	 * The feature id for the '<em><b>Actuator Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA_STUB__ACTUATOR_STATUS = CAMERA_STUB_FEATURE_COUNT + 1;
		/**
	 * The feature id for the '<em><b>Current Pan Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA_STUB__CURRENT_PAN_ANGLE = CAMERA_STUB_FEATURE_COUNT + 2;
		/**
	 * The feature id for the '<em><b>Current Tilt Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA_STUB__CURRENT_TILT_ANGLE = CAMERA_STUB_FEATURE_COUNT + 3;
		/**
	 * The feature id for the '<em><b>Commanded Pan Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA_STUB__COMMANDED_PAN_ANGLE = CAMERA_STUB_FEATURE_COUNT + 4;
		/**
	 * The feature id for the '<em><b>Commanded Tilt Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA_STUB__COMMANDED_TILT_ANGLE = CAMERA_STUB_FEATURE_COUNT + 5;
		/**
	 * The number of structural features of the '<em>PTU Camera Stub</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA_STUB_FEATURE_COUNT = CAMERA_STUB_FEATURE_COUNT + 6;
		/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA_STUB___ACCEPT__INODEVISITOR = CAMERA_STUB___ACCEPT__INODEVISITOR;
		/**
	 * The operation id for the '<em>Take Snapshot</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA_STUB___TAKE_SNAPSHOT = CAMERA_STUB___TAKE_SNAPSHOT;
		/**
	 * The operation id for the '<em>Get Field Of View</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA_STUB___GET_FIELD_OF_VIEW = CAMERA_STUB___GET_FIELD_OF_VIEW;
		/**
	 * The operation id for the '<em>Command Zoom</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA_STUB___COMMAND_ZOOM__DOUBLE = CAMERA_STUB___COMMAND_ZOOM__DOUBLE;
		/**
	 * The operation id for the '<em>Get Minimum Zoom</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA_STUB___GET_MINIMUM_ZOOM = CAMERA_STUB___GET_MINIMUM_ZOOM;
		/**
	 * The operation id for the '<em>Get Maximum Zoom</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA_STUB___GET_MAXIMUM_ZOOM = CAMERA_STUB___GET_MAXIMUM_ZOOM;
		/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA_STUB___INIT = CAMERA_STUB___INIT;
		/**
	 * The operation id for the '<em>Command Streaming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA_STUB___COMMAND_STREAMING__BOOLEAN = CAMERA_STUB___COMMAND_STREAMING__BOOLEAN;
		/**
	 * The operation id for the '<em>Get Maximum Pan Angle</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA_STUB___GET_MAXIMUM_PAN_ANGLE = CAMERA_STUB_OPERATION_COUNT + 0;
		/**
	 * The operation id for the '<em>Get Minimum Pan Angle</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA_STUB___GET_MINIMUM_PAN_ANGLE = CAMERA_STUB_OPERATION_COUNT + 1;
		/**
	 * The operation id for the '<em>Get Maximum Tilt Angle</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA_STUB___GET_MAXIMUM_TILT_ANGLE = CAMERA_STUB_OPERATION_COUNT + 2;
		/**
	 * The operation id for the '<em>Get Minimum Tilt Angle</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA_STUB___GET_MINIMUM_TILT_ANGLE = CAMERA_STUB_OPERATION_COUNT + 3;
		/**
	 * The operation id for the '<em>Move To Pan Tilt</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA_STUB___MOVE_TO_PAN_TILT__DOUBLE_DOUBLE = CAMERA_STUB_OPERATION_COUNT + 4;
		/**
	 * The operation id for the '<em>Move To Pan</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA_STUB___MOVE_TO_PAN__DOUBLE = CAMERA_STUB_OPERATION_COUNT + 5;
		/**
	 * The operation id for the '<em>Move To Tilt</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA_STUB___MOVE_TO_TILT__DOUBLE = CAMERA_STUB_OPERATION_COUNT + 6;
		/**
	 * The operation id for the '<em>Move By Pan Tilt</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA_STUB___MOVE_BY_PAN_TILT__DOUBLE_DOUBLE = CAMERA_STUB_OPERATION_COUNT + 7;
		/**
	 * The operation id for the '<em>Move By Pan</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA_STUB___MOVE_BY_PAN__DOUBLE = CAMERA_STUB_OPERATION_COUNT + 8;
		/**
	 * The operation id for the '<em>Move By Tilt</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA_STUB___MOVE_BY_TILT__DOUBLE = CAMERA_STUB_OPERATION_COUNT + 9;
		/**
	 * The operation id for the '<em>Stop Motion</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA_STUB___STOP_MOTION = CAMERA_STUB_OPERATION_COUNT + 10;
		/**
	 * The number of operations of the '<em>PTU Camera Stub</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA_STUB_OPERATION_COUNT = CAMERA_STUB_OPERATION_COUNT + 11;
		/**
	 * The meta object id for the '{@link org.eclipse.symphony.examples.camera.impl.PTUCameraSimulatedImpl <em>PTU Camera Simulated</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.examples.camera.impl.PTUCameraSimulatedImpl
	 * @see org.eclipse.symphony.examples.camera.impl.Symphony__ExamplesCameraPackageImpl#getPTUCameraSimulated()
	 * @generated
	 */
	int PTU_CAMERA_SIMULATED = 5;
		/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA_SIMULATED__PARENT = CAMERA_SIMULATED__PARENT;
		/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA_SIMULATED__DESCRIPTION = CAMERA_SIMULATED__DESCRIPTION;
		/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA_SIMULATED__NODE_ID = CAMERA_SIMULATED__NODE_ID;
		/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA_SIMULATED__CHILDREN = CAMERA_SIMULATED__CHILDREN;
		/**
	 * The feature id for the '<em><b>Aggregated Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA_SIMULATED__AGGREGATED_CHILDREN = CAMERA_SIMULATED__AGGREGATED_CHILDREN;
		/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA_SIMULATED__STATUS = CAMERA_SIMULATED__STATUS;
		/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA_SIMULATED__NAME = CAMERA_SIMULATED__NAME;
		/**
	 * The feature id for the '<em><b>Latest Image Snapshot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA_SIMULATED__LATEST_IMAGE_SNAPSHOT = CAMERA_SIMULATED__LATEST_IMAGE_SNAPSHOT;
		/**
	 * The feature id for the '<em><b>Current Zoom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA_SIMULATED__CURRENT_ZOOM = CAMERA_SIMULATED__CURRENT_ZOOM;
		/**
	 * The feature id for the '<em><b>Commanded Zoom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA_SIMULATED__COMMANDED_ZOOM = CAMERA_SIMULATED__COMMANDED_ZOOM;
		/**
	 * The feature id for the '<em><b>Fov</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA_SIMULATED__FOV = CAMERA_SIMULATED__FOV;
		/**
	 * The feature id for the '<em><b>Initialized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA_SIMULATED__INITIALIZED = CAMERA_SIMULATED__INITIALIZED;
		/**
	 * The feature id for the '<em><b>Streaming Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA_SIMULATED__STREAMING_ENABLED = CAMERA_SIMULATED__STREAMING_ENABLED;
		/**
	 * The feature id for the '<em><b>Moving</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA_SIMULATED__MOVING = CAMERA_SIMULATED_FEATURE_COUNT + 0;
		/**
	 * The feature id for the '<em><b>Actuator Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA_SIMULATED__ACTUATOR_STATUS = CAMERA_SIMULATED_FEATURE_COUNT + 1;
		/**
	 * The feature id for the '<em><b>Current Pan Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA_SIMULATED__CURRENT_PAN_ANGLE = CAMERA_SIMULATED_FEATURE_COUNT + 2;
		/**
	 * The feature id for the '<em><b>Current Tilt Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA_SIMULATED__CURRENT_TILT_ANGLE = CAMERA_SIMULATED_FEATURE_COUNT + 3;
		/**
	 * The feature id for the '<em><b>Commanded Pan Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA_SIMULATED__COMMANDED_PAN_ANGLE = CAMERA_SIMULATED_FEATURE_COUNT + 4;
		/**
	 * The feature id for the '<em><b>Commanded Tilt Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA_SIMULATED__COMMANDED_TILT_ANGLE = CAMERA_SIMULATED_FEATURE_COUNT + 5;
		/**
	 * The number of structural features of the '<em>PTU Camera Simulated</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA_SIMULATED_FEATURE_COUNT = CAMERA_SIMULATED_FEATURE_COUNT + 6;
		/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA_SIMULATED___ACCEPT__INODEVISITOR = CAMERA_SIMULATED___ACCEPT__INODEVISITOR;
		/**
	 * The operation id for the '<em>Take Snapshot</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA_SIMULATED___TAKE_SNAPSHOT = CAMERA_SIMULATED___TAKE_SNAPSHOT;
		/**
	 * The operation id for the '<em>Get Field Of View</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA_SIMULATED___GET_FIELD_OF_VIEW = CAMERA_SIMULATED___GET_FIELD_OF_VIEW;
		/**
	 * The operation id for the '<em>Command Zoom</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA_SIMULATED___COMMAND_ZOOM__DOUBLE = CAMERA_SIMULATED___COMMAND_ZOOM__DOUBLE;
		/**
	 * The operation id for the '<em>Get Minimum Zoom</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA_SIMULATED___GET_MINIMUM_ZOOM = CAMERA_SIMULATED___GET_MINIMUM_ZOOM;
		/**
	 * The operation id for the '<em>Get Maximum Zoom</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA_SIMULATED___GET_MAXIMUM_ZOOM = CAMERA_SIMULATED___GET_MAXIMUM_ZOOM;
		/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA_SIMULATED___INIT = CAMERA_SIMULATED___INIT;
		/**
	 * The operation id for the '<em>Command Streaming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA_SIMULATED___COMMAND_STREAMING__BOOLEAN = CAMERA_SIMULATED___COMMAND_STREAMING__BOOLEAN;
		/**
	 * The operation id for the '<em>Get Maximum Pan Angle</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA_SIMULATED___GET_MAXIMUM_PAN_ANGLE = CAMERA_SIMULATED_OPERATION_COUNT + 0;
		/**
	 * The operation id for the '<em>Get Minimum Pan Angle</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA_SIMULATED___GET_MINIMUM_PAN_ANGLE = CAMERA_SIMULATED_OPERATION_COUNT + 1;
		/**
	 * The operation id for the '<em>Get Maximum Tilt Angle</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA_SIMULATED___GET_MAXIMUM_TILT_ANGLE = CAMERA_SIMULATED_OPERATION_COUNT + 2;
		/**
	 * The operation id for the '<em>Get Minimum Tilt Angle</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA_SIMULATED___GET_MINIMUM_TILT_ANGLE = CAMERA_SIMULATED_OPERATION_COUNT + 3;
		/**
	 * The operation id for the '<em>Move To Pan Tilt</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA_SIMULATED___MOVE_TO_PAN_TILT__DOUBLE_DOUBLE = CAMERA_SIMULATED_OPERATION_COUNT + 4;
		/**
	 * The operation id for the '<em>Move To Pan</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA_SIMULATED___MOVE_TO_PAN__DOUBLE = CAMERA_SIMULATED_OPERATION_COUNT + 5;
		/**
	 * The operation id for the '<em>Move To Tilt</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA_SIMULATED___MOVE_TO_TILT__DOUBLE = CAMERA_SIMULATED_OPERATION_COUNT + 6;
		/**
	 * The operation id for the '<em>Move By Pan Tilt</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA_SIMULATED___MOVE_BY_PAN_TILT__DOUBLE_DOUBLE = CAMERA_SIMULATED_OPERATION_COUNT + 7;
		/**
	 * The operation id for the '<em>Move By Pan</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA_SIMULATED___MOVE_BY_PAN__DOUBLE = CAMERA_SIMULATED_OPERATION_COUNT + 8;
		/**
	 * The operation id for the '<em>Move By Tilt</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA_SIMULATED___MOVE_BY_TILT__DOUBLE = CAMERA_SIMULATED_OPERATION_COUNT + 9;
		/**
	 * The operation id for the '<em>Stop Motion</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA_SIMULATED___STOP_MOTION = CAMERA_SIMULATED_OPERATION_COUNT + 10;
		/**
	 * The number of operations of the '<em>PTU Camera Simulated</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_CAMERA_SIMULATED_OPERATION_COUNT = CAMERA_SIMULATED_OPERATION_COUNT + 11;
		/**
	 * The meta object id for the '<em>Throwable</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see java.lang.Throwable
	 * @see org.eclipse.symphony.examples.camera.impl.Symphony__ExamplesCameraPackageImpl#getThrowable()
	 * @generated
	 */
  int THROWABLE = 6;

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.examples.camera.Camera <em>Camera</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Camera</em>'.
	 * @see org.eclipse.symphony.examples.camera.Camera
	 * @generated
	 */
  EClass getCamera();

  /**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.examples.camera.Camera#getFov <em>Fov</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fov</em>'.
	 * @see org.eclipse.symphony.examples.camera.Camera#getFov()
	 * @see #getCamera()
	 * @generated
	 */
  EReference getCamera_Fov();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.examples.camera.Camera#isInitialized <em>Initialized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initialized</em>'.
	 * @see org.eclipse.symphony.examples.camera.Camera#isInitialized()
	 * @see #getCamera()
	 * @generated
	 */
	EAttribute getCamera_Initialized();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.examples.camera.Camera#isStreamingEnabled <em>Streaming Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Streaming Enabled</em>'.
	 * @see org.eclipse.symphony.examples.camera.Camera#isStreamingEnabled()
	 * @see #getCamera()
	 * @generated
	 */
	EAttribute getCamera_StreamingEnabled();

		/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.examples.camera.Camera#init() <em>Init</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Init</em>' operation.
	 * @see org.eclipse.symphony.examples.camera.Camera#init()
	 * @generated
	 */
	EOperation getCamera__Init();

		/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.examples.camera.Camera#commandStreaming(boolean) <em>Command Streaming</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Command Streaming</em>' operation.
	 * @see org.eclipse.symphony.examples.camera.Camera#commandStreaming(boolean)
	 * @generated
	 */
	EOperation getCamera__CommandStreaming__boolean();

		/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.examples.camera.CameraStub <em>Camera Stub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Camera Stub</em>'.
	 * @see org.eclipse.symphony.examples.camera.CameraStub
	 * @generated
	 */
	EClass getCameraStub();

		/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.examples.camera.CameraSimulated <em>Camera Simulated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Camera Simulated</em>'.
	 * @see org.eclipse.symphony.examples.camera.CameraSimulated
	 * @generated
	 */
	EClass getCameraSimulated();

		/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.examples.camera.PTUCamera <em>PTU Camera</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PTU Camera</em>'.
	 * @see org.eclipse.symphony.examples.camera.PTUCamera
	 * @generated
	 */
  EClass getPTUCamera();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.examples.camera.PTUCameraStub <em>PTU Camera Stub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PTU Camera Stub</em>'.
	 * @see org.eclipse.symphony.examples.camera.PTUCameraStub
	 * @generated
	 */
	EClass getPTUCameraStub();

		/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.examples.camera.PTUCameraSimulated <em>PTU Camera Simulated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PTU Camera Simulated</em>'.
	 * @see org.eclipse.symphony.examples.camera.PTUCameraSimulated
	 * @generated
	 */
	EClass getPTUCameraSimulated();

		/**
	 * Returns the meta object for data type '{@link java.lang.Throwable <em>Throwable</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Throwable</em>'.
	 * @see java.lang.Throwable
	 * @model instanceClass="java.lang.Throwable"
	 * @generated
	 */
  EDataType getThrowable();

  /**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Symphony__ExamplesCameraFactory getSymphony__ExamplesCameraFactory();

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
		 * The meta object literal for the '{@link org.eclipse.symphony.examples.camera.impl.CameraImpl <em>Camera</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.examples.camera.impl.CameraImpl
		 * @see org.eclipse.symphony.examples.camera.impl.Symphony__ExamplesCameraPackageImpl#getCamera()
		 * @generated
		 */
    EClass CAMERA = eINSTANCE.getCamera();

    /**
		 * The meta object literal for the '<em><b>Fov</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference CAMERA__FOV = eINSTANCE.getCamera_Fov();

    /**
		 * The meta object literal for the '<em><b>Initialized</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAMERA__INITIALIZED = eINSTANCE.getCamera_Initialized();

				/**
		 * The meta object literal for the '<em><b>Streaming Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAMERA__STREAMING_ENABLED = eINSTANCE.getCamera_StreamingEnabled();

				/**
		 * The meta object literal for the '<em><b>Init</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CAMERA___INIT = eINSTANCE.getCamera__Init();

				/**
		 * The meta object literal for the '<em><b>Command Streaming</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CAMERA___COMMAND_STREAMING__BOOLEAN = eINSTANCE.getCamera__CommandStreaming__boolean();

				/**
		 * The meta object literal for the '{@link org.eclipse.symphony.examples.camera.impl.CameraStubImpl <em>Camera Stub</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.examples.camera.impl.CameraStubImpl
		 * @see org.eclipse.symphony.examples.camera.impl.Symphony__ExamplesCameraPackageImpl#getCameraStub()
		 * @generated
		 */
		EClass CAMERA_STUB = eINSTANCE.getCameraStub();

				/**
		 * The meta object literal for the '{@link org.eclipse.symphony.examples.camera.impl.CameraSimulatedImpl <em>Camera Simulated</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.examples.camera.impl.CameraSimulatedImpl
		 * @see org.eclipse.symphony.examples.camera.impl.Symphony__ExamplesCameraPackageImpl#getCameraSimulated()
		 * @generated
		 */
		EClass CAMERA_SIMULATED = eINSTANCE.getCameraSimulated();

				/**
		 * The meta object literal for the '{@link org.eclipse.symphony.examples.camera.impl.PTUCameraImpl <em>PTU Camera</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.examples.camera.impl.PTUCameraImpl
		 * @see org.eclipse.symphony.examples.camera.impl.Symphony__ExamplesCameraPackageImpl#getPTUCamera()
		 * @generated
		 */
    EClass PTU_CAMERA = eINSTANCE.getPTUCamera();

    /**
		 * The meta object literal for the '{@link org.eclipse.symphony.examples.camera.impl.PTUCameraStubImpl <em>PTU Camera Stub</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.examples.camera.impl.PTUCameraStubImpl
		 * @see org.eclipse.symphony.examples.camera.impl.Symphony__ExamplesCameraPackageImpl#getPTUCameraStub()
		 * @generated
		 */
		EClass PTU_CAMERA_STUB = eINSTANCE.getPTUCameraStub();

				/**
		 * The meta object literal for the '{@link org.eclipse.symphony.examples.camera.impl.PTUCameraSimulatedImpl <em>PTU Camera Simulated</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.examples.camera.impl.PTUCameraSimulatedImpl
		 * @see org.eclipse.symphony.examples.camera.impl.Symphony__ExamplesCameraPackageImpl#getPTUCameraSimulated()
		 * @generated
		 */
		EClass PTU_CAMERA_SIMULATED = eINSTANCE.getPTUCameraSimulated();

				/**
		 * The meta object literal for the '<em>Throwable</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see java.lang.Throwable
		 * @see org.eclipse.symphony.examples.camera.impl.Symphony__ExamplesCameraPackageImpl#getThrowable()
		 * @generated
		 */
    EDataType THROWABLE = eINSTANCE.getThrowable();

  }

} //Symphony__ExamplesCameraPackage
