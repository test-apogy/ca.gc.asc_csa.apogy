/**
 * Canadian Space Agency / Agence spatiale canadienne - Copyright (c) 2015
 */
package ca.gc.asc_csa.apogy.examples.mobile_platform;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;

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
 * @see ca.gc.asc_csa.apogy.examples.mobile_platform.ApogyExamplesMobilePlatformFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='ApogyExamplesMobilePlatform' copyrightText='Canadian Space Agency / Agence spatiale canadienne - Copyright (c) 2015' modelName='ApogyExamplesMobilePlatform' childCreationExtenders='true' extensibleProviderFactory='true' suppressGenModelAnnotations='false' modelDirectory='/ca.gc.asc_csa.apogy.examples.mobile_platform/src-generated' editDirectory='/ca.gc.asc_csa.apogy.examples.mobile_platform.edit/src-generated' basePackage='ca.gc.asc_csa.apogy.examples'"
 * @generated
 */
public interface ApogyExamplesMobilePlatformPackage extends EPackage
{
  /**
	 * The package name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNAME = "mobile_platform";

  /**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_URI = "ca.gc.asc_csa.apogy.examples.mobile_platform";

  /**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_PREFIX = "mobile_platform";

  /**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  ApogyExamplesMobilePlatformPackage eINSTANCE = ca.gc.asc_csa.apogy.examples.mobile_platform.impl.ApogyExamplesMobilePlatformPackageImpl.init();

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.examples.mobile_platform.impl.PositionImpl <em>Position</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.examples.mobile_platform.impl.PositionImpl
	 * @see ca.gc.asc_csa.apogy.examples.mobile_platform.impl.ApogyExamplesMobilePlatformPackageImpl#getPosition()
	 * @generated
	 */
  int POSITION = 0;

  /**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int POSITION__X = 0;

  /**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int POSITION__Y = 1;

  /**
	 * The feature id for the '<em><b>Theta</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int POSITION__THETA = 2;

  /**
	 * The number of structural features of the '<em>Position</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int POSITION_FEATURE_COUNT = 3;

  /**
	 * The number of operations of the '<em>Position</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int POSITION_OPERATION_COUNT = 0;

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.examples.mobile_platform.impl.NamedPositionImpl <em>Named Position</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.examples.mobile_platform.impl.NamedPositionImpl
	 * @see ca.gc.asc_csa.apogy.examples.mobile_platform.impl.ApogyExamplesMobilePlatformPackageImpl#getNamedPosition()
	 * @generated
	 */
  int NAMED_POSITION = 1;

  /**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NAMED_POSITION__X = POSITION__X;

  /**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NAMED_POSITION__Y = POSITION__Y;

  /**
	 * The feature id for the '<em><b>Theta</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NAMED_POSITION__THETA = POSITION__THETA;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NAMED_POSITION__NAME = POSITION_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Named Position</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NAMED_POSITION_FEATURE_COUNT = POSITION_FEATURE_COUNT + 1;

  /**
	 * The number of operations of the '<em>Named Position</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NAMED_POSITION_OPERATION_COUNT = POSITION_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.examples.mobile_platform.impl.MobilePlatformImpl <em>Mobile Platform</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.examples.mobile_platform.impl.MobilePlatformImpl
	 * @see ca.gc.asc_csa.apogy.examples.mobile_platform.impl.ApogyExamplesMobilePlatformPackageImpl#getMobilePlatform()
	 * @generated
	 */
  int MOBILE_PLATFORM = 2;

  /**
	 * The feature id for the '<em><b>Initialized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM__INITIALIZED = ApogyCommonEMFPackage.DISPOSABLE_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Disposed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM__DISPOSED = ApogyCommonEMFPackage.DISPOSABLE_FEATURE_COUNT + 1;

		/**
	 * The feature id for the '<em><b>Position Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MOBILE_PLATFORM__POSITION_ERROR = ApogyCommonEMFPackage.DISPOSABLE_FEATURE_COUNT + 2;

  /**
	 * The feature id for the '<em><b>Linear Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM__LINEAR_VELOCITY = ApogyCommonEMFPackage.DISPOSABLE_FEATURE_COUNT + 3;

		/**
	 * The feature id for the '<em><b>Angular Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM__ANGULAR_VELOCITY = ApogyCommonEMFPackage.DISPOSABLE_FEATURE_COUNT + 4;

		/**
	 * The feature id for the '<em><b>Left Wheel Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MOBILE_PLATFORM__LEFT_WHEEL_POSITION = ApogyCommonEMFPackage.DISPOSABLE_FEATURE_COUNT + 5;

  /**
	 * The feature id for the '<em><b>Right Wheel Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MOBILE_PLATFORM__RIGHT_WHEEL_POSITION = ApogyCommonEMFPackage.DISPOSABLE_FEATURE_COUNT + 6;

  /**
	 * The feature id for the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MOBILE_PLATFORM__POSITION = ApogyCommonEMFPackage.DISPOSABLE_FEATURE_COUNT + 7;

		/**
	 * The number of structural features of the '<em>Mobile Platform</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MOBILE_PLATFORM_FEATURE_COUNT = ApogyCommonEMFPackage.DISPOSABLE_FEATURE_COUNT + 8;

  /**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MOBILE_PLATFORM___DISPOSE = ApogyCommonEMFPackage.DISPOSABLE___DISPOSE;

  /**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MOBILE_PLATFORM___INIT = ApogyCommonEMFPackage.DISPOSABLE_OPERATION_COUNT + 0;

  /**
	 * The operation id for the '<em>Reset Position</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM___RESET_POSITION__POSITION = ApogyCommonEMFPackage.DISPOSABLE_OPERATION_COUNT + 1;

		/**
	 * The operation id for the '<em>Clear Position Error</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM___CLEAR_POSITION_ERROR = ApogyCommonEMFPackage.DISPOSABLE_OPERATION_COUNT + 2;

		/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MOBILE_PLATFORM___STOP = ApogyCommonEMFPackage.DISPOSABLE_OPERATION_COUNT + 3;

  /**
	 * The operation id for the '<em>Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM___MOVE_TO__DOUBLE_DOUBLE = ApogyCommonEMFPackage.DISPOSABLE_OPERATION_COUNT + 4;

		/**
	 * The operation id for the '<em>Cmd Linear Velocity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM___CMD_LINEAR_VELOCITY__DOUBLE = ApogyCommonEMFPackage.DISPOSABLE_OPERATION_COUNT + 5;

		/**
	 * The operation id for the '<em>Cmd Angular Velocity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM___CMD_ANGULAR_VELOCITY__DOUBLE = ApogyCommonEMFPackage.DISPOSABLE_OPERATION_COUNT + 6;

		/**
	 * The operation id for the '<em>Cmd Velocities</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM___CMD_VELOCITIES__DOUBLE_DOUBLE = ApogyCommonEMFPackage.DISPOSABLE_OPERATION_COUNT + 7;

		/**
	 * The number of operations of the '<em>Mobile Platform</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MOBILE_PLATFORM_OPERATION_COUNT = ApogyCommonEMFPackage.DISPOSABLE_OPERATION_COUNT + 8;

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.examples.mobile_platform.impl.MobilePlatformStubImpl <em>Mobile Platform Stub</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.examples.mobile_platform.impl.MobilePlatformStubImpl
	 * @see ca.gc.asc_csa.apogy.examples.mobile_platform.impl.ApogyExamplesMobilePlatformPackageImpl#getMobilePlatformStub()
	 * @generated
	 */
  int MOBILE_PLATFORM_STUB = 3;

  /**
	 * The feature id for the '<em><b>Initialized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_STUB__INITIALIZED = MOBILE_PLATFORM__INITIALIZED;

		/**
	 * The feature id for the '<em><b>Disposed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_STUB__DISPOSED = MOBILE_PLATFORM__DISPOSED;

		/**
	 * The feature id for the '<em><b>Position Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MOBILE_PLATFORM_STUB__POSITION_ERROR = MOBILE_PLATFORM__POSITION_ERROR;

  /**
	 * The feature id for the '<em><b>Linear Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_STUB__LINEAR_VELOCITY = MOBILE_PLATFORM__LINEAR_VELOCITY;

		/**
	 * The feature id for the '<em><b>Angular Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_STUB__ANGULAR_VELOCITY = MOBILE_PLATFORM__ANGULAR_VELOCITY;

		/**
	 * The feature id for the '<em><b>Left Wheel Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MOBILE_PLATFORM_STUB__LEFT_WHEEL_POSITION = MOBILE_PLATFORM__LEFT_WHEEL_POSITION;

  /**
	 * The feature id for the '<em><b>Right Wheel Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MOBILE_PLATFORM_STUB__RIGHT_WHEEL_POSITION = MOBILE_PLATFORM__RIGHT_WHEEL_POSITION;

  /**
	 * The feature id for the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MOBILE_PLATFORM_STUB__POSITION = MOBILE_PLATFORM__POSITION;

		/**
	 * The number of structural features of the '<em>Mobile Platform Stub</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MOBILE_PLATFORM_STUB_FEATURE_COUNT = MOBILE_PLATFORM_FEATURE_COUNT + 0;

  /**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MOBILE_PLATFORM_STUB___DISPOSE = MOBILE_PLATFORM___DISPOSE;

  /**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MOBILE_PLATFORM_STUB___INIT = MOBILE_PLATFORM___INIT;

		/**
	 * The operation id for the '<em>Reset Position</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_STUB___RESET_POSITION__POSITION = MOBILE_PLATFORM___RESET_POSITION__POSITION;

		/**
	 * The operation id for the '<em>Clear Position Error</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_STUB___CLEAR_POSITION_ERROR = MOBILE_PLATFORM___CLEAR_POSITION_ERROR;

		/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MOBILE_PLATFORM_STUB___STOP = MOBILE_PLATFORM___STOP;

		/**
	 * The operation id for the '<em>Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_STUB___MOVE_TO__DOUBLE_DOUBLE = MOBILE_PLATFORM___MOVE_TO__DOUBLE_DOUBLE;

		/**
	 * The operation id for the '<em>Cmd Linear Velocity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_STUB___CMD_LINEAR_VELOCITY__DOUBLE = MOBILE_PLATFORM___CMD_LINEAR_VELOCITY__DOUBLE;

		/**
	 * The operation id for the '<em>Cmd Angular Velocity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_STUB___CMD_ANGULAR_VELOCITY__DOUBLE = MOBILE_PLATFORM___CMD_ANGULAR_VELOCITY__DOUBLE;

		/**
	 * The operation id for the '<em>Cmd Velocities</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_STUB___CMD_VELOCITIES__DOUBLE_DOUBLE = MOBILE_PLATFORM___CMD_VELOCITIES__DOUBLE_DOUBLE;

		/**
	 * The number of operations of the '<em>Mobile Platform Stub</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MOBILE_PLATFORM_STUB_OPERATION_COUNT = MOBILE_PLATFORM_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.examples.mobile_platform.impl.MobilePlatformSimulatedImpl <em>Mobile Platform Simulated</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.examples.mobile_platform.impl.MobilePlatformSimulatedImpl
	 * @see ca.gc.asc_csa.apogy.examples.mobile_platform.impl.ApogyExamplesMobilePlatformPackageImpl#getMobilePlatformSimulated()
	 * @generated
	 */
	int MOBILE_PLATFORM_SIMULATED = 4;

		/**
	 * The feature id for the '<em><b>Initialized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_SIMULATED__INITIALIZED = MOBILE_PLATFORM__INITIALIZED;

		/**
	 * The feature id for the '<em><b>Disposed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_SIMULATED__DISPOSED = MOBILE_PLATFORM__DISPOSED;

		/**
	 * The feature id for the '<em><b>Position Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_SIMULATED__POSITION_ERROR = MOBILE_PLATFORM__POSITION_ERROR;

		/**
	 * The feature id for the '<em><b>Linear Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_SIMULATED__LINEAR_VELOCITY = MOBILE_PLATFORM__LINEAR_VELOCITY;

		/**
	 * The feature id for the '<em><b>Angular Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_SIMULATED__ANGULAR_VELOCITY = MOBILE_PLATFORM__ANGULAR_VELOCITY;

		/**
	 * The feature id for the '<em><b>Left Wheel Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_SIMULATED__LEFT_WHEEL_POSITION = MOBILE_PLATFORM__LEFT_WHEEL_POSITION;

		/**
	 * The feature id for the '<em><b>Right Wheel Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_SIMULATED__RIGHT_WHEEL_POSITION = MOBILE_PLATFORM__RIGHT_WHEEL_POSITION;

		/**
	 * The feature id for the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_SIMULATED__POSITION = MOBILE_PLATFORM__POSITION;

		/**
	 * The number of structural features of the '<em>Mobile Platform Simulated</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_SIMULATED_FEATURE_COUNT = MOBILE_PLATFORM_FEATURE_COUNT + 0;

		/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_SIMULATED___DISPOSE = MOBILE_PLATFORM___DISPOSE;

		/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_SIMULATED___INIT = MOBILE_PLATFORM___INIT;

		/**
	 * The operation id for the '<em>Reset Position</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_SIMULATED___RESET_POSITION__POSITION = MOBILE_PLATFORM___RESET_POSITION__POSITION;

		/**
	 * The operation id for the '<em>Clear Position Error</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_SIMULATED___CLEAR_POSITION_ERROR = MOBILE_PLATFORM___CLEAR_POSITION_ERROR;

		/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_SIMULATED___STOP = MOBILE_PLATFORM___STOP;

		/**
	 * The operation id for the '<em>Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_SIMULATED___MOVE_TO__DOUBLE_DOUBLE = MOBILE_PLATFORM___MOVE_TO__DOUBLE_DOUBLE;

		/**
	 * The operation id for the '<em>Cmd Linear Velocity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_SIMULATED___CMD_LINEAR_VELOCITY__DOUBLE = MOBILE_PLATFORM___CMD_LINEAR_VELOCITY__DOUBLE;

		/**
	 * The operation id for the '<em>Cmd Angular Velocity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_SIMULATED___CMD_ANGULAR_VELOCITY__DOUBLE = MOBILE_PLATFORM___CMD_ANGULAR_VELOCITY__DOUBLE;

		/**
	 * The operation id for the '<em>Cmd Velocities</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_SIMULATED___CMD_VELOCITIES__DOUBLE_DOUBLE = MOBILE_PLATFORM___CMD_VELOCITIES__DOUBLE_DOUBLE;

		/**
	 * The number of operations of the '<em>Mobile Platform Simulated</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_SIMULATED_OPERATION_COUNT = MOBILE_PLATFORM_OPERATION_COUNT + 0;

		/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.examples.mobile_platform.Position <em>Position</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.mobile_platform.Position
	 * @generated
	 */
  EClass getPosition();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.examples.mobile_platform.Position#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.mobile_platform.Position#getX()
	 * @see #getPosition()
	 * @generated
	 */
  EAttribute getPosition_X();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.examples.mobile_platform.Position#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.mobile_platform.Position#getY()
	 * @see #getPosition()
	 * @generated
	 */
  EAttribute getPosition_Y();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.examples.mobile_platform.Position#getTheta <em>Theta</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Theta</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.mobile_platform.Position#getTheta()
	 * @see #getPosition()
	 * @generated
	 */
  EAttribute getPosition_Theta();

  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.examples.mobile_platform.NamedPosition <em>Named Position</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Position</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.mobile_platform.NamedPosition
	 * @generated
	 */
  EClass getNamedPosition();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.examples.mobile_platform.NamedPosition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.mobile_platform.NamedPosition#getName()
	 * @see #getNamedPosition()
	 * @generated
	 */
  EAttribute getNamedPosition_Name();

  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.examples.mobile_platform.MobilePlatform <em>Mobile Platform</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mobile Platform</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.mobile_platform.MobilePlatform
	 * @generated
	 */
  EClass getMobilePlatform();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.examples.mobile_platform.MobilePlatform#isInitialized <em>Initialized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initialized</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.mobile_platform.MobilePlatform#isInitialized()
	 * @see #getMobilePlatform()
	 * @generated
	 */
	EAttribute getMobilePlatform_Initialized();

		/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.examples.mobile_platform.MobilePlatform#isDisposed <em>Disposed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disposed</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.mobile_platform.MobilePlatform#isDisposed()
	 * @see #getMobilePlatform()
	 * @generated
	 */
	EAttribute getMobilePlatform_Disposed();

		/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.examples.mobile_platform.MobilePlatform#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Position</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.mobile_platform.MobilePlatform#getPosition()
	 * @see #getMobilePlatform()
	 * @generated
	 */
  EReference getMobilePlatform_Position();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.examples.mobile_platform.MobilePlatform#getPositionError <em>Position Error</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position Error</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.mobile_platform.MobilePlatform#getPositionError()
	 * @see #getMobilePlatform()
	 * @generated
	 */
  EAttribute getMobilePlatform_PositionError();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.examples.mobile_platform.MobilePlatform#getLinearVelocity <em>Linear Velocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Linear Velocity</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.mobile_platform.MobilePlatform#getLinearVelocity()
	 * @see #getMobilePlatform()
	 * @generated
	 */
	EAttribute getMobilePlatform_LinearVelocity();

		/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.examples.mobile_platform.MobilePlatform#getAngularVelocity <em>Angular Velocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Angular Velocity</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.mobile_platform.MobilePlatform#getAngularVelocity()
	 * @see #getMobilePlatform()
	 * @generated
	 */
	EAttribute getMobilePlatform_AngularVelocity();

		/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.examples.mobile_platform.MobilePlatform#getLeftWheelPosition <em>Left Wheel Position</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Left Wheel Position</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.mobile_platform.MobilePlatform#getLeftWheelPosition()
	 * @see #getMobilePlatform()
	 * @generated
	 */
  EAttribute getMobilePlatform_LeftWheelPosition();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.examples.mobile_platform.MobilePlatform#getRightWheelPosition <em>Right Wheel Position</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Right Wheel Position</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.mobile_platform.MobilePlatform#getRightWheelPosition()
	 * @see #getMobilePlatform()
	 * @generated
	 */
  EAttribute getMobilePlatform_RightWheelPosition();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.examples.mobile_platform.MobilePlatform#init() <em>Init</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Init</em>' operation.
	 * @see ca.gc.asc_csa.apogy.examples.mobile_platform.MobilePlatform#init()
	 * @generated
	 */
  EOperation getMobilePlatform__Init();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.examples.mobile_platform.MobilePlatform#resetPosition(ca.gc.asc_csa.apogy.examples.mobile_platform.Position) <em>Reset Position</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Reset Position</em>' operation.
	 * @see ca.gc.asc_csa.apogy.examples.mobile_platform.MobilePlatform#resetPosition(ca.gc.asc_csa.apogy.examples.mobile_platform.Position)
	 * @generated
	 */
	EOperation getMobilePlatform__ResetPosition__Position();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.examples.mobile_platform.MobilePlatform#clearPositionError() <em>Clear Position Error</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Clear Position Error</em>' operation.
	 * @see ca.gc.asc_csa.apogy.examples.mobile_platform.MobilePlatform#clearPositionError()
	 * @generated
	 */
	EOperation getMobilePlatform__ClearPositionError();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.examples.mobile_platform.MobilePlatform#stop() <em>Stop</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Stop</em>' operation.
	 * @see ca.gc.asc_csa.apogy.examples.mobile_platform.MobilePlatform#stop()
	 * @generated
	 */
  EOperation getMobilePlatform__Stop();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.examples.mobile_platform.MobilePlatform#moveTo(double, double) <em>Move To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move To</em>' operation.
	 * @see ca.gc.asc_csa.apogy.examples.mobile_platform.MobilePlatform#moveTo(double, double)
	 * @generated
	 */
	EOperation getMobilePlatform__MoveTo__double_double();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.examples.mobile_platform.MobilePlatform#cmdLinearVelocity(double) <em>Cmd Linear Velocity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cmd Linear Velocity</em>' operation.
	 * @see ca.gc.asc_csa.apogy.examples.mobile_platform.MobilePlatform#cmdLinearVelocity(double)
	 * @generated
	 */
	EOperation getMobilePlatform__CmdLinearVelocity__double();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.examples.mobile_platform.MobilePlatform#cmdAngularVelocity(double) <em>Cmd Angular Velocity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cmd Angular Velocity</em>' operation.
	 * @see ca.gc.asc_csa.apogy.examples.mobile_platform.MobilePlatform#cmdAngularVelocity(double)
	 * @generated
	 */
	EOperation getMobilePlatform__CmdAngularVelocity__double();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.examples.mobile_platform.MobilePlatform#cmdVelocities(double, double) <em>Cmd Velocities</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cmd Velocities</em>' operation.
	 * @see ca.gc.asc_csa.apogy.examples.mobile_platform.MobilePlatform#cmdVelocities(double, double)
	 * @generated
	 */
	EOperation getMobilePlatform__CmdVelocities__double_double();

		/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.examples.mobile_platform.MobilePlatformStub <em>Mobile Platform Stub</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mobile Platform Stub</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.mobile_platform.MobilePlatformStub
	 * @generated
	 */
  EClass getMobilePlatformStub();

  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.examples.mobile_platform.MobilePlatformSimulated <em>Mobile Platform Simulated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mobile Platform Simulated</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.mobile_platform.MobilePlatformSimulated
	 * @generated
	 */
	EClass getMobilePlatformSimulated();

		/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ApogyExamplesMobilePlatformFactory getApogyExamplesMobilePlatformFactory();

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
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.examples.mobile_platform.impl.PositionImpl <em>Position</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.examples.mobile_platform.impl.PositionImpl
		 * @see ca.gc.asc_csa.apogy.examples.mobile_platform.impl.ApogyExamplesMobilePlatformPackageImpl#getPosition()
		 * @generated
		 */
    EClass POSITION = eINSTANCE.getPosition();

    /**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute POSITION__X = eINSTANCE.getPosition_X();

    /**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute POSITION__Y = eINSTANCE.getPosition_Y();

    /**
		 * The meta object literal for the '<em><b>Theta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute POSITION__THETA = eINSTANCE.getPosition_Theta();

    /**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.examples.mobile_platform.impl.NamedPositionImpl <em>Named Position</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.examples.mobile_platform.impl.NamedPositionImpl
		 * @see ca.gc.asc_csa.apogy.examples.mobile_platform.impl.ApogyExamplesMobilePlatformPackageImpl#getNamedPosition()
		 * @generated
		 */
    EClass NAMED_POSITION = eINSTANCE.getNamedPosition();

    /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute NAMED_POSITION__NAME = eINSTANCE.getNamedPosition_Name();

    /**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.examples.mobile_platform.impl.MobilePlatformImpl <em>Mobile Platform</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.examples.mobile_platform.impl.MobilePlatformImpl
		 * @see ca.gc.asc_csa.apogy.examples.mobile_platform.impl.ApogyExamplesMobilePlatformPackageImpl#getMobilePlatform()
		 * @generated
		 */
    EClass MOBILE_PLATFORM = eINSTANCE.getMobilePlatform();

    /**
		 * The meta object literal for the '<em><b>Initialized</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBILE_PLATFORM__INITIALIZED = eINSTANCE.getMobilePlatform_Initialized();

				/**
		 * The meta object literal for the '<em><b>Disposed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBILE_PLATFORM__DISPOSED = eINSTANCE.getMobilePlatform_Disposed();

				/**
		 * The meta object literal for the '<em><b>Position</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference MOBILE_PLATFORM__POSITION = eINSTANCE.getMobilePlatform_Position();

    /**
		 * The meta object literal for the '<em><b>Position Error</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute MOBILE_PLATFORM__POSITION_ERROR = eINSTANCE.getMobilePlatform_PositionError();

    /**
		 * The meta object literal for the '<em><b>Linear Velocity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBILE_PLATFORM__LINEAR_VELOCITY = eINSTANCE.getMobilePlatform_LinearVelocity();

				/**
		 * The meta object literal for the '<em><b>Angular Velocity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBILE_PLATFORM__ANGULAR_VELOCITY = eINSTANCE.getMobilePlatform_AngularVelocity();

				/**
		 * The meta object literal for the '<em><b>Left Wheel Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute MOBILE_PLATFORM__LEFT_WHEEL_POSITION = eINSTANCE.getMobilePlatform_LeftWheelPosition();

    /**
		 * The meta object literal for the '<em><b>Right Wheel Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute MOBILE_PLATFORM__RIGHT_WHEEL_POSITION = eINSTANCE.getMobilePlatform_RightWheelPosition();

    /**
		 * The meta object literal for the '<em><b>Init</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation MOBILE_PLATFORM___INIT = eINSTANCE.getMobilePlatform__Init();

    /**
		 * The meta object literal for the '<em><b>Reset Position</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MOBILE_PLATFORM___RESET_POSITION__POSITION = eINSTANCE.getMobilePlatform__ResetPosition__Position();

				/**
		 * The meta object literal for the '<em><b>Clear Position Error</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MOBILE_PLATFORM___CLEAR_POSITION_ERROR = eINSTANCE.getMobilePlatform__ClearPositionError();

				/**
		 * The meta object literal for the '<em><b>Stop</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation MOBILE_PLATFORM___STOP = eINSTANCE.getMobilePlatform__Stop();

    /**
		 * The meta object literal for the '<em><b>Move To</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MOBILE_PLATFORM___MOVE_TO__DOUBLE_DOUBLE = eINSTANCE.getMobilePlatform__MoveTo__double_double();

				/**
		 * The meta object literal for the '<em><b>Cmd Linear Velocity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MOBILE_PLATFORM___CMD_LINEAR_VELOCITY__DOUBLE = eINSTANCE.getMobilePlatform__CmdLinearVelocity__double();

				/**
		 * The meta object literal for the '<em><b>Cmd Angular Velocity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MOBILE_PLATFORM___CMD_ANGULAR_VELOCITY__DOUBLE = eINSTANCE.getMobilePlatform__CmdAngularVelocity__double();

				/**
		 * The meta object literal for the '<em><b>Cmd Velocities</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MOBILE_PLATFORM___CMD_VELOCITIES__DOUBLE_DOUBLE = eINSTANCE.getMobilePlatform__CmdVelocities__double_double();

				/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.examples.mobile_platform.impl.MobilePlatformStubImpl <em>Mobile Platform Stub</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.examples.mobile_platform.impl.MobilePlatformStubImpl
		 * @see ca.gc.asc_csa.apogy.examples.mobile_platform.impl.ApogyExamplesMobilePlatformPackageImpl#getMobilePlatformStub()
		 * @generated
		 */
    EClass MOBILE_PLATFORM_STUB = eINSTANCE.getMobilePlatformStub();

    /**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.examples.mobile_platform.impl.MobilePlatformSimulatedImpl <em>Mobile Platform Simulated</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.examples.mobile_platform.impl.MobilePlatformSimulatedImpl
		 * @see ca.gc.asc_csa.apogy.examples.mobile_platform.impl.ApogyExamplesMobilePlatformPackageImpl#getMobilePlatformSimulated()
		 * @generated
		 */
		EClass MOBILE_PLATFORM_SIMULATED = eINSTANCE.getMobilePlatformSimulated();

  }

} //ApogyExamplesMobilePlatformPackage
