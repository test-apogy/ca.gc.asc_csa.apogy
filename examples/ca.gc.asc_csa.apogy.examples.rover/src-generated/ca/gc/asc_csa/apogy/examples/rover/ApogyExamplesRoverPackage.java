/**
 * Canadian Space Agency / Agence spatiale canadienne - Copyright (c) 2015
 */
package org.eclipse.symphony.examples.rover;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.symphony.common.emf.Symphony__CommonEMFPackage;

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
 * @see org.eclipse.symphony.examples.rover.Symphony__ExamplesRoverFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='Symphony__ExamplesRover' copyrightText='Canadian Space Agency / Agence spatiale canadienne - Copyright (c) 2015' modelName='Symphony__ExamplesRover' childCreationExtenders='true' extensibleProviderFactory='true' suppressGenModelAnnotations='false' modelDirectory='/org.eclipse.symphony.examples.rover/src-generated' editDirectory='/org.eclipse.symphony.examples.rover.edit/src-generated' basePackage='org.eclipse.symphony.examples'"
 * @generated
 */
public interface Symphony__ExamplesRoverPackage extends EPackage
{
  /**
	 * The package name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNAME = "rover";

  /**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_URI = "org.eclipse.symphony.examples.rover";

  /**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_PREFIX = "rover";

  /**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  Symphony__ExamplesRoverPackage eINSTANCE = org.eclipse.symphony.examples.rover.impl.Symphony__ExamplesRoverPackageImpl.init();

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.examples.rover.impl.BatteryImpl <em>Battery</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.examples.rover.impl.BatteryImpl
	 * @see org.eclipse.symphony.examples.rover.impl.Symphony__ExamplesRoverPackageImpl#getBattery()
	 * @generated
	 */
	int BATTERY = 0;

		/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY__ACTIVE = 0;

		/**
	 * The feature id for the '<em><b>Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY__VOLTAGE = 1;

		/**
	 * The feature id for the '<em><b>Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY__CURRENT = 2;

		/**
	 * The number of structural features of the '<em>Battery</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_FEATURE_COUNT = 3;

		/**
	 * The operation id for the '<em>Activate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY___ACTIVATE = 0;

		/**
	 * The operation id for the '<em>Deactivate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY___DEACTIVATE = 1;

		/**
	 * The number of operations of the '<em>Battery</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_OPERATION_COUNT = 2;

		/**
	 * The meta object id for the '{@link org.eclipse.symphony.examples.rover.impl.PowerSystemImpl <em>Power System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.examples.rover.impl.PowerSystemImpl
	 * @see org.eclipse.symphony.examples.rover.impl.Symphony__ExamplesRoverPackageImpl#getPowerSystem()
	 * @generated
	 */
	int POWER_SYSTEM = 1;

		/**
	 * The feature id for the '<em><b>Batteries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SYSTEM__BATTERIES = 0;

		/**
	 * The feature id for the '<em><b>Active Battery</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SYSTEM__ACTIVE_BATTERY = 1;

		/**
	 * The feature id for the '<em><b>Current Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SYSTEM__CURRENT_VOLTAGE = 2;

		/**
	 * The feature id for the '<em><b>Current Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SYSTEM__CURRENT_CURRENT = 3;

		/**
	 * The number of structural features of the '<em>Power System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SYSTEM_FEATURE_COUNT = 4;

		/**
	 * The operation id for the '<em>Change Active Battery To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SYSTEM___CHANGE_ACTIVE_BATTERY_TO__INT = 0;

		/**
	 * The number of operations of the '<em>Power System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SYSTEM_OPERATION_COUNT = 1;

		/**
	 * The meta object id for the '{@link org.eclipse.symphony.examples.rover.impl.RoverImpl <em>Rover</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.examples.rover.impl.RoverImpl
	 * @see org.eclipse.symphony.examples.rover.impl.Symphony__ExamplesRoverPackageImpl#getRover()
	 * @generated
	 */
  int ROVER = 2;

  /**
	 * The feature id for the '<em><b>Robotic Arm</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROVER__ROBOTIC_ARM = Symphony__CommonEMFPackage.DISPOSABLE_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Mobile Platform</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROVER__MOBILE_PLATFORM = Symphony__CommonEMFPackage.DISPOSABLE_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Arm Camera</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROVER__ARM_CAMERA = Symphony__CommonEMFPackage.DISPOSABLE_FEATURE_COUNT + 2;

		/**
	 * The feature id for the '<em><b>Center Camera</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROVER__CENTER_CAMERA = Symphony__CommonEMFPackage.DISPOSABLE_FEATURE_COUNT + 3;

		/**
	 * The feature id for the '<em><b>Power System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROVER__POWER_SYSTEM = Symphony__CommonEMFPackage.DISPOSABLE_FEATURE_COUNT + 4;

		/**
	 * The feature id for the '<em><b>Linear Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROVER__LINEAR_VELOCITY = Symphony__CommonEMFPackage.DISPOSABLE_FEATURE_COUNT + 5;

		/**
	 * The feature id for the '<em><b>Angular Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROVER__ANGULAR_VELOCITY = Symphony__CommonEMFPackage.DISPOSABLE_FEATURE_COUNT + 6;

		/**
	 * The feature id for the '<em><b>Initialized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROVER__INITIALIZED = Symphony__CommonEMFPackage.DISPOSABLE_FEATURE_COUNT + 7;

		/**
	 * The feature id for the '<em><b>Disposed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROVER__DISPOSED = Symphony__CommonEMFPackage.DISPOSABLE_FEATURE_COUNT + 8;

		/**
	 * The number of structural features of the '<em>Rover</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROVER_FEATURE_COUNT = Symphony__CommonEMFPackage.DISPOSABLE_FEATURE_COUNT + 9;

  /**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROVER___DISPOSE = Symphony__CommonEMFPackage.DISPOSABLE___DISPOSE;

		/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROVER___INIT = Symphony__CommonEMFPackage.DISPOSABLE_OPERATION_COUNT + 0;

  /**
	 * The operation id for the '<em>Cmd Linear Velocity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROVER___CMD_LINEAR_VELOCITY__DOUBLE = Symphony__CommonEMFPackage.DISPOSABLE_OPERATION_COUNT + 1;

		/**
	 * The operation id for the '<em>Cmd Angular Velocity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROVER___CMD_ANGULAR_VELOCITY__DOUBLE = Symphony__CommonEMFPackage.DISPOSABLE_OPERATION_COUNT + 2;

		/**
	 * The operation id for the '<em>Cmd Velocities</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROVER___CMD_VELOCITIES__DOUBLE_DOUBLE = Symphony__CommonEMFPackage.DISPOSABLE_OPERATION_COUNT + 3;

		/**
	 * The number of operations of the '<em>Rover</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROVER_OPERATION_COUNT = Symphony__CommonEMFPackage.DISPOSABLE_OPERATION_COUNT + 4;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.examples.rover.impl.RoverStubImpl <em>Rover Stub</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.examples.rover.impl.RoverStubImpl
	 * @see org.eclipse.symphony.examples.rover.impl.Symphony__ExamplesRoverPackageImpl#getRoverStub()
	 * @generated
	 */
  int ROVER_STUB = 3;

  /**
	 * The feature id for the '<em><b>Robotic Arm</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROVER_STUB__ROBOTIC_ARM = ROVER__ROBOTIC_ARM;

  /**
	 * The feature id for the '<em><b>Mobile Platform</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROVER_STUB__MOBILE_PLATFORM = ROVER__MOBILE_PLATFORM;

  /**
	 * The feature id for the '<em><b>Arm Camera</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROVER_STUB__ARM_CAMERA = ROVER__ARM_CAMERA;

		/**
	 * The feature id for the '<em><b>Center Camera</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROVER_STUB__CENTER_CAMERA = ROVER__CENTER_CAMERA;

		/**
	 * The feature id for the '<em><b>Power System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROVER_STUB__POWER_SYSTEM = ROVER__POWER_SYSTEM;

		/**
	 * The feature id for the '<em><b>Linear Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROVER_STUB__LINEAR_VELOCITY = ROVER__LINEAR_VELOCITY;

		/**
	 * The feature id for the '<em><b>Angular Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROVER_STUB__ANGULAR_VELOCITY = ROVER__ANGULAR_VELOCITY;

		/**
	 * The feature id for the '<em><b>Initialized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROVER_STUB__INITIALIZED = ROVER__INITIALIZED;

		/**
	 * The feature id for the '<em><b>Disposed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROVER_STUB__DISPOSED = ROVER__DISPOSED;

		/**
	 * The number of structural features of the '<em>Rover Stub</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROVER_STUB_FEATURE_COUNT = ROVER_FEATURE_COUNT + 0;

  /**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROVER_STUB___DISPOSE = ROVER___DISPOSE;

		/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROVER_STUB___INIT = ROVER___INIT;

		/**
	 * The operation id for the '<em>Cmd Linear Velocity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROVER_STUB___CMD_LINEAR_VELOCITY__DOUBLE = ROVER___CMD_LINEAR_VELOCITY__DOUBLE;

		/**
	 * The operation id for the '<em>Cmd Angular Velocity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROVER_STUB___CMD_ANGULAR_VELOCITY__DOUBLE = ROVER___CMD_ANGULAR_VELOCITY__DOUBLE;

		/**
	 * The operation id for the '<em>Cmd Velocities</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROVER_STUB___CMD_VELOCITIES__DOUBLE_DOUBLE = ROVER___CMD_VELOCITIES__DOUBLE_DOUBLE;

		/**
	 * The number of operations of the '<em>Rover Stub</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROVER_STUB_OPERATION_COUNT = ROVER_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.examples.rover.impl.RoverSimulatedImpl <em>Rover Simulated</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.examples.rover.impl.RoverSimulatedImpl
	 * @see org.eclipse.symphony.examples.rover.impl.Symphony__ExamplesRoverPackageImpl#getRoverSimulated()
	 * @generated
	 */
	int ROVER_SIMULATED = 4;

		/**
	 * The feature id for the '<em><b>Robotic Arm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROVER_SIMULATED__ROBOTIC_ARM = ROVER__ROBOTIC_ARM;

		/**
	 * The feature id for the '<em><b>Mobile Platform</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROVER_SIMULATED__MOBILE_PLATFORM = ROVER__MOBILE_PLATFORM;

		/**
	 * The feature id for the '<em><b>Arm Camera</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROVER_SIMULATED__ARM_CAMERA = ROVER__ARM_CAMERA;

		/**
	 * The feature id for the '<em><b>Center Camera</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROVER_SIMULATED__CENTER_CAMERA = ROVER__CENTER_CAMERA;

		/**
	 * The feature id for the '<em><b>Power System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROVER_SIMULATED__POWER_SYSTEM = ROVER__POWER_SYSTEM;

		/**
	 * The feature id for the '<em><b>Linear Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROVER_SIMULATED__LINEAR_VELOCITY = ROVER__LINEAR_VELOCITY;

		/**
	 * The feature id for the '<em><b>Angular Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROVER_SIMULATED__ANGULAR_VELOCITY = ROVER__ANGULAR_VELOCITY;

		/**
	 * The feature id for the '<em><b>Initialized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROVER_SIMULATED__INITIALIZED = ROVER__INITIALIZED;

		/**
	 * The feature id for the '<em><b>Disposed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROVER_SIMULATED__DISPOSED = ROVER__DISPOSED;

		/**
	 * The number of structural features of the '<em>Rover Simulated</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROVER_SIMULATED_FEATURE_COUNT = ROVER_FEATURE_COUNT + 0;

		/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROVER_SIMULATED___DISPOSE = ROVER___DISPOSE;

		/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROVER_SIMULATED___INIT = ROVER___INIT;

		/**
	 * The operation id for the '<em>Cmd Linear Velocity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROVER_SIMULATED___CMD_LINEAR_VELOCITY__DOUBLE = ROVER___CMD_LINEAR_VELOCITY__DOUBLE;

		/**
	 * The operation id for the '<em>Cmd Angular Velocity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROVER_SIMULATED___CMD_ANGULAR_VELOCITY__DOUBLE = ROVER___CMD_ANGULAR_VELOCITY__DOUBLE;

		/**
	 * The operation id for the '<em>Cmd Velocities</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROVER_SIMULATED___CMD_VELOCITIES__DOUBLE_DOUBLE = ROVER___CMD_VELOCITIES__DOUBLE_DOUBLE;

		/**
	 * The number of operations of the '<em>Rover Simulated</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROVER_SIMULATED_OPERATION_COUNT = ROVER_OPERATION_COUNT + 0;

		/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.examples.rover.Battery <em>Battery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Battery</em>'.
	 * @see org.eclipse.symphony.examples.rover.Battery
	 * @generated
	 */
	EClass getBattery();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.examples.rover.Battery#isActive <em>Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active</em>'.
	 * @see org.eclipse.symphony.examples.rover.Battery#isActive()
	 * @see #getBattery()
	 * @generated
	 */
	EAttribute getBattery_Active();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.examples.rover.Battery#getVoltage <em>Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Voltage</em>'.
	 * @see org.eclipse.symphony.examples.rover.Battery#getVoltage()
	 * @see #getBattery()
	 * @generated
	 */
	EAttribute getBattery_Voltage();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.examples.rover.Battery#getCurrent <em>Current</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current</em>'.
	 * @see org.eclipse.symphony.examples.rover.Battery#getCurrent()
	 * @see #getBattery()
	 * @generated
	 */
	EAttribute getBattery_Current();

		/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.examples.rover.Battery#activate() <em>Activate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Activate</em>' operation.
	 * @see org.eclipse.symphony.examples.rover.Battery#activate()
	 * @generated
	 */
	EOperation getBattery__Activate();

		/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.examples.rover.Battery#deactivate() <em>Deactivate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Deactivate</em>' operation.
	 * @see org.eclipse.symphony.examples.rover.Battery#deactivate()
	 * @generated
	 */
	EOperation getBattery__Deactivate();

		/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.examples.rover.PowerSystem <em>Power System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Power System</em>'.
	 * @see org.eclipse.symphony.examples.rover.PowerSystem
	 * @generated
	 */
	EClass getPowerSystem();

		/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.symphony.examples.rover.PowerSystem#getBatteries <em>Batteries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Batteries</em>'.
	 * @see org.eclipse.symphony.examples.rover.PowerSystem#getBatteries()
	 * @see #getPowerSystem()
	 * @generated
	 */
	EReference getPowerSystem_Batteries();

		/**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.examples.rover.PowerSystem#getActiveBattery <em>Active Battery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Active Battery</em>'.
	 * @see org.eclipse.symphony.examples.rover.PowerSystem#getActiveBattery()
	 * @see #getPowerSystem()
	 * @generated
	 */
	EReference getPowerSystem_ActiveBattery();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.examples.rover.PowerSystem#getCurrentVoltage <em>Current Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Voltage</em>'.
	 * @see org.eclipse.symphony.examples.rover.PowerSystem#getCurrentVoltage()
	 * @see #getPowerSystem()
	 * @generated
	 */
	EAttribute getPowerSystem_CurrentVoltage();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.examples.rover.PowerSystem#getCurrentCurrent <em>Current Current</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Current</em>'.
	 * @see org.eclipse.symphony.examples.rover.PowerSystem#getCurrentCurrent()
	 * @see #getPowerSystem()
	 * @generated
	 */
	EAttribute getPowerSystem_CurrentCurrent();

		/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.examples.rover.PowerSystem#changeActiveBatteryTo(int) <em>Change Active Battery To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Active Battery To</em>' operation.
	 * @see org.eclipse.symphony.examples.rover.PowerSystem#changeActiveBatteryTo(int)
	 * @generated
	 */
	EOperation getPowerSystem__ChangeActiveBatteryTo__int();

		/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.examples.rover.Rover <em>Rover</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rover</em>'.
	 * @see org.eclipse.symphony.examples.rover.Rover
	 * @generated
	 */
  EClass getRover();

  /**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.examples.rover.Rover#getRoboticArm <em>Robotic Arm</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Robotic Arm</em>'.
	 * @see org.eclipse.symphony.examples.rover.Rover#getRoboticArm()
	 * @see #getRover()
	 * @generated
	 */
  EReference getRover_RoboticArm();

  /**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.examples.rover.Rover#getMobilePlatform <em>Mobile Platform</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mobile Platform</em>'.
	 * @see org.eclipse.symphony.examples.rover.Rover#getMobilePlatform()
	 * @see #getRover()
	 * @generated
	 */
  EReference getRover_MobilePlatform();

  /**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.examples.rover.Rover#getArmCamera <em>Arm Camera</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Arm Camera</em>'.
	 * @see org.eclipse.symphony.examples.rover.Rover#getArmCamera()
	 * @see #getRover()
	 * @generated
	 */
	EReference getRover_ArmCamera();

		/**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.examples.rover.Rover#getCenterCamera <em>Center Camera</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Center Camera</em>'.
	 * @see org.eclipse.symphony.examples.rover.Rover#getCenterCamera()
	 * @see #getRover()
	 * @generated
	 */
	EReference getRover_CenterCamera();

		/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.examples.rover.Rover#getPowerSystem <em>Power System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Power System</em>'.
	 * @see org.eclipse.symphony.examples.rover.Rover#getPowerSystem()
	 * @see #getRover()
	 * @generated
	 */
	EReference getRover_PowerSystem();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.examples.rover.Rover#getLinearVelocity <em>Linear Velocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Linear Velocity</em>'.
	 * @see org.eclipse.symphony.examples.rover.Rover#getLinearVelocity()
	 * @see #getRover()
	 * @generated
	 */
	EAttribute getRover_LinearVelocity();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.examples.rover.Rover#getAngularVelocity <em>Angular Velocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Angular Velocity</em>'.
	 * @see org.eclipse.symphony.examples.rover.Rover#getAngularVelocity()
	 * @see #getRover()
	 * @generated
	 */
	EAttribute getRover_AngularVelocity();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.examples.rover.Rover#isInitialized <em>Initialized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initialized</em>'.
	 * @see org.eclipse.symphony.examples.rover.Rover#isInitialized()
	 * @see #getRover()
	 * @generated
	 */
	EAttribute getRover_Initialized();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.examples.rover.Rover#isDisposed <em>Disposed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disposed</em>'.
	 * @see org.eclipse.symphony.examples.rover.Rover#isDisposed()
	 * @see #getRover()
	 * @generated
	 */
	EAttribute getRover_Disposed();

		/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.examples.rover.Rover#init() <em>Init</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Init</em>' operation.
	 * @see org.eclipse.symphony.examples.rover.Rover#init()
	 * @generated
	 */
  EOperation getRover__Init();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.examples.rover.Rover#cmdLinearVelocity(double) <em>Cmd Linear Velocity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cmd Linear Velocity</em>' operation.
	 * @see org.eclipse.symphony.examples.rover.Rover#cmdLinearVelocity(double)
	 * @generated
	 */
	EOperation getRover__CmdLinearVelocity__double();

		/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.examples.rover.Rover#cmdAngularVelocity(double) <em>Cmd Angular Velocity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cmd Angular Velocity</em>' operation.
	 * @see org.eclipse.symphony.examples.rover.Rover#cmdAngularVelocity(double)
	 * @generated
	 */
	EOperation getRover__CmdAngularVelocity__double();

		/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.examples.rover.Rover#cmdVelocities(double, double) <em>Cmd Velocities</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cmd Velocities</em>' operation.
	 * @see org.eclipse.symphony.examples.rover.Rover#cmdVelocities(double, double)
	 * @generated
	 */
	EOperation getRover__CmdVelocities__double_double();

		/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.examples.rover.RoverStub <em>Rover Stub</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rover Stub</em>'.
	 * @see org.eclipse.symphony.examples.rover.RoverStub
	 * @generated
	 */
  EClass getRoverStub();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.examples.rover.RoverSimulated <em>Rover Simulated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rover Simulated</em>'.
	 * @see org.eclipse.symphony.examples.rover.RoverSimulated
	 * @generated
	 */
	EClass getRoverSimulated();

		/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Symphony__ExamplesRoverFactory getSymphony__ExamplesRoverFactory();

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
		 * The meta object literal for the '{@link org.eclipse.symphony.examples.rover.impl.BatteryImpl <em>Battery</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.examples.rover.impl.BatteryImpl
		 * @see org.eclipse.symphony.examples.rover.impl.Symphony__ExamplesRoverPackageImpl#getBattery()
		 * @generated
		 */
		EClass BATTERY = eINSTANCE.getBattery();

			/**
		 * The meta object literal for the '<em><b>Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BATTERY__ACTIVE = eINSTANCE.getBattery_Active();

			/**
		 * The meta object literal for the '<em><b>Voltage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BATTERY__VOLTAGE = eINSTANCE.getBattery_Voltage();

			/**
		 * The meta object literal for the '<em><b>Current</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BATTERY__CURRENT = eINSTANCE.getBattery_Current();

			/**
		 * The meta object literal for the '<em><b>Activate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BATTERY___ACTIVATE = eINSTANCE.getBattery__Activate();

			/**
		 * The meta object literal for the '<em><b>Deactivate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BATTERY___DEACTIVATE = eINSTANCE.getBattery__Deactivate();

			/**
		 * The meta object literal for the '{@link org.eclipse.symphony.examples.rover.impl.PowerSystemImpl <em>Power System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.examples.rover.impl.PowerSystemImpl
		 * @see org.eclipse.symphony.examples.rover.impl.Symphony__ExamplesRoverPackageImpl#getPowerSystem()
		 * @generated
		 */
		EClass POWER_SYSTEM = eINSTANCE.getPowerSystem();

			/**
		 * The meta object literal for the '<em><b>Batteries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POWER_SYSTEM__BATTERIES = eINSTANCE.getPowerSystem_Batteries();

			/**
		 * The meta object literal for the '<em><b>Active Battery</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POWER_SYSTEM__ACTIVE_BATTERY = eINSTANCE.getPowerSystem_ActiveBattery();

			/**
		 * The meta object literal for the '<em><b>Current Voltage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POWER_SYSTEM__CURRENT_VOLTAGE = eINSTANCE.getPowerSystem_CurrentVoltage();

			/**
		 * The meta object literal for the '<em><b>Current Current</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POWER_SYSTEM__CURRENT_CURRENT = eINSTANCE.getPowerSystem_CurrentCurrent();

				/**
		 * The meta object literal for the '<em><b>Change Active Battery To</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POWER_SYSTEM___CHANGE_ACTIVE_BATTERY_TO__INT = eINSTANCE.getPowerSystem__ChangeActiveBatteryTo__int();

				/**
		 * The meta object literal for the '{@link org.eclipse.symphony.examples.rover.impl.RoverImpl <em>Rover</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.examples.rover.impl.RoverImpl
		 * @see org.eclipse.symphony.examples.rover.impl.Symphony__ExamplesRoverPackageImpl#getRover()
		 * @generated
		 */
    EClass ROVER = eINSTANCE.getRover();

    /**
		 * The meta object literal for the '<em><b>Robotic Arm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ROVER__ROBOTIC_ARM = eINSTANCE.getRover_RoboticArm();

    /**
		 * The meta object literal for the '<em><b>Mobile Platform</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ROVER__MOBILE_PLATFORM = eINSTANCE.getRover_MobilePlatform();

    /**
		 * The meta object literal for the '<em><b>Arm Camera</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROVER__ARM_CAMERA = eINSTANCE.getRover_ArmCamera();

				/**
		 * The meta object literal for the '<em><b>Center Camera</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROVER__CENTER_CAMERA = eINSTANCE.getRover_CenterCamera();

				/**
		 * The meta object literal for the '<em><b>Power System</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROVER__POWER_SYSTEM = eINSTANCE.getRover_PowerSystem();

				/**
		 * The meta object literal for the '<em><b>Linear Velocity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROVER__LINEAR_VELOCITY = eINSTANCE.getRover_LinearVelocity();

				/**
		 * The meta object literal for the '<em><b>Angular Velocity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROVER__ANGULAR_VELOCITY = eINSTANCE.getRover_AngularVelocity();

				/**
		 * The meta object literal for the '<em><b>Initialized</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROVER__INITIALIZED = eINSTANCE.getRover_Initialized();

				/**
		 * The meta object literal for the '<em><b>Disposed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROVER__DISPOSED = eINSTANCE.getRover_Disposed();

				/**
		 * The meta object literal for the '<em><b>Init</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation ROVER___INIT = eINSTANCE.getRover__Init();

    /**
		 * The meta object literal for the '<em><b>Cmd Linear Velocity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROVER___CMD_LINEAR_VELOCITY__DOUBLE = eINSTANCE.getRover__CmdLinearVelocity__double();

				/**
		 * The meta object literal for the '<em><b>Cmd Angular Velocity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROVER___CMD_ANGULAR_VELOCITY__DOUBLE = eINSTANCE.getRover__CmdAngularVelocity__double();

				/**
		 * The meta object literal for the '<em><b>Cmd Velocities</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROVER___CMD_VELOCITIES__DOUBLE_DOUBLE = eINSTANCE.getRover__CmdVelocities__double_double();

				/**
		 * The meta object literal for the '{@link org.eclipse.symphony.examples.rover.impl.RoverStubImpl <em>Rover Stub</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.examples.rover.impl.RoverStubImpl
		 * @see org.eclipse.symphony.examples.rover.impl.Symphony__ExamplesRoverPackageImpl#getRoverStub()
		 * @generated
		 */
    EClass ROVER_STUB = eINSTANCE.getRoverStub();

    /**
		 * The meta object literal for the '{@link org.eclipse.symphony.examples.rover.impl.RoverSimulatedImpl <em>Rover Simulated</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.examples.rover.impl.RoverSimulatedImpl
		 * @see org.eclipse.symphony.examples.rover.impl.Symphony__ExamplesRoverPackageImpl#getRoverSimulated()
		 * @generated
		 */
		EClass ROVER_SIMULATED = eINSTANCE.getRoverSimulated();

  }

} //Symphony__ExamplesRoverPackage
