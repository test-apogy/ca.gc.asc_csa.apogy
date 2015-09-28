/**
 * Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015
 */
package ca.gc.asc_csa.symphony.examples.rover;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import ca.gc.asc_csa.symphony.core.SymphonyCorePackage;
import org.eclipse.emf.ecore.EAttribute;

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
 * @see ca.gc.asc_csa.symphony.examples.rover.SymphonyExampleRoverFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='SymphonyExampleRover' copyrightText='Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015' modelName='SymphonyExampleRover' modelDirectory='/ca.gc.asc_csa.symphony.examples.rover/src-generated' editDirectory='/ca.gc.asc_csa.symphony.examples.rover.edit/src-generated' basePackage='ca.gc.asc_csa.symphony.examples'"
 * @generated
 */
public interface SymphonyExampleRoverPackage extends EPackage
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
  String eNS_URI = "ca.gc.asc_csa.symphony.examples.rover";

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
  SymphonyExampleRoverPackage eINSTANCE = ca.gc.asc_csa.symphony.examples.rover.impl.SymphonyExampleRoverPackageImpl.init();

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.symphony.examples.rover.impl.RoverSymphonySystemApiAdapterImpl <em>Rover Symphony System Api Adapter</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.symphony.examples.rover.impl.RoverSymphonySystemApiAdapterImpl
	 * @see ca.gc.asc_csa.symphony.examples.rover.impl.SymphonyExampleRoverPackageImpl#getRoverSymphonySystemApiAdapter()
	 * @generated
	 */
  int ROVER_SYMPHONY_SYSTEM_API_ADAPTER = 0;

  /**
	 * The feature id for the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROVER_SYMPHONY_SYSTEM_API_ADAPTER__ENVIRONMENT = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER__ENVIRONMENT;

		/**
	 * The feature id for the '<em><b>Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROVER_SYMPHONY_SYSTEM_API_ADAPTER__INSTANCE = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER__INSTANCE;

		/**
	 * The feature id for the '<em><b>Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROVER_SYMPHONY_SYSTEM_API_ADAPTER__ELEMENT_TYPE = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER__ELEMENT_TYPE;

		/**
	 * The feature id for the '<em><b>Pose Transform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROVER_SYMPHONY_SYSTEM_API_ADAPTER__POSE_TRANSFORM = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER__POSE_TRANSFORM;

  /**
	 * The feature id for the '<em><b>Pose Corrector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROVER_SYMPHONY_SYSTEM_API_ADAPTER__POSE_CORRECTOR = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER__POSE_CORRECTOR;

		/**
	 * The feature id for the '<em><b>Symphony System</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROVER_SYMPHONY_SYSTEM_API_ADAPTER__SYMPHONY_SYSTEM = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER__SYMPHONY_SYSTEM;

  /**
	 * The number of structural features of the '<em>Rover Symphony System Api Adapter</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROVER_SYMPHONY_SYSTEM_API_ADAPTER_FEATURE_COUNT = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER_FEATURE_COUNT + 0;

  /**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROVER_SYMPHONY_SYSTEM_API_ADAPTER___INIT__ENVIRONMENT_TYPE_EOBJECT = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER___INIT__ENVIRONMENT_TYPE_EOBJECT;

		/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROVER_SYMPHONY_SYSTEM_API_ADAPTER___APPLY__ABSTRACTINITIALIZATIONDATA = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER___APPLY__ABSTRACTINITIALIZATIONDATA;

		/**
	 * The operation id for the '<em>Create Initialization Data</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROVER_SYMPHONY_SYSTEM_API_ADAPTER___CREATE_INITIALIZATION_DATA = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER___CREATE_INITIALIZATION_DATA;

		/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROVER_SYMPHONY_SYSTEM_API_ADAPTER___COLLECT__ABSTRACTINITIALIZATIONDATA = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER___COLLECT__ABSTRACTINITIALIZATIONDATA;

		/**
	 * The operation id for the '<em>Create Result</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROVER_SYMPHONY_SYSTEM_API_ADAPTER___CREATE_RESULT__OPERATIONCALL = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER___CREATE_RESULT__OPERATIONCALL;

		/**
	 * The operation id for the '<em>Create Result</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROVER_SYMPHONY_SYSTEM_API_ADAPTER___CREATE_RESULT__OPERATIONCALL_LONG_OBJECT_EXCEPTION = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER___CREATE_RESULT__OPERATIONCALL_LONG_OBJECT_EXCEPTION;

		/**
	 * The operation id for the '<em>Invoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROVER_SYMPHONY_SYSTEM_API_ADAPTER___INVOKE__EOBJECT_OPERATIONCALL_BOOLEAN = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER___INVOKE__EOBJECT_OPERATIONCALL_BOOLEAN;

		/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROVER_SYMPHONY_SYSTEM_API_ADAPTER___DISPOSE = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER___DISPOSE;

		/**
	 * The operation id for the '<em>Create Result Matrix</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROVER_SYMPHONY_SYSTEM_API_ADAPTER___CREATE_RESULT_MATRIX__OPERATIONCALL = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER___CREATE_RESULT_MATRIX__OPERATIONCALL;

		/**
	 * The number of operations of the '<em>Rover Symphony System Api Adapter</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROVER_SYMPHONY_SYSTEM_API_ADAPTER_OPERATION_COUNT = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER_OPERATION_COUNT + 0;


  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.symphony.examples.rover.impl.RoverDataImpl <em>Rover Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.symphony.examples.rover.impl.RoverDataImpl
	 * @see ca.gc.asc_csa.symphony.examples.rover.impl.SymphonyExampleRoverPackageImpl#getRoverData()
	 * @generated
	 */
	int ROVER_DATA = 1;

		/**
	 * The feature id for the '<em><b>Initial Pose Transform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROVER_DATA__INITIAL_POSE_TRANSFORM = SymphonyCorePackage.SYMPHONY_INITIALIZATION_DATA__INITIAL_POSE_TRANSFORM;

		/**
	 * The feature id for the '<em><b>Initialized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROVER_DATA__INITIALIZED = SymphonyCorePackage.SYMPHONY_INITIALIZATION_DATA_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Disposed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROVER_DATA__DISPOSED = SymphonyCorePackage.SYMPHONY_INITIALIZATION_DATA_FEATURE_COUNT + 1;

		/**
	 * The number of structural features of the '<em>Rover Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROVER_DATA_FEATURE_COUNT = SymphonyCorePackage.SYMPHONY_INITIALIZATION_DATA_FEATURE_COUNT + 2;

		/**
	 * The number of operations of the '<em>Rover Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROVER_DATA_OPERATION_COUNT = SymphonyCorePackage.SYMPHONY_INITIALIZATION_DATA_OPERATION_COUNT + 0;


		/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.symphony.examples.rover.RoverSymphonySystemApiAdapter <em>Rover Symphony System Api Adapter</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rover Symphony System Api Adapter</em>'.
	 * @see ca.gc.asc_csa.symphony.examples.rover.RoverSymphonySystemApiAdapter
	 * @generated
	 */
  EClass getRoverSymphonySystemApiAdapter();

  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.symphony.examples.rover.RoverData <em>Rover Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rover Data</em>'.
	 * @see ca.gc.asc_csa.symphony.examples.rover.RoverData
	 * @generated
	 */
	EClass getRoverData();

		/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.symphony.examples.rover.RoverData#isInitialized <em>Initialized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initialized</em>'.
	 * @see ca.gc.asc_csa.symphony.examples.rover.RoverData#isInitialized()
	 * @see #getRoverData()
	 * @generated
	 */
	EAttribute getRoverData_Initialized();

		/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.symphony.examples.rover.RoverData#isDisposed <em>Disposed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disposed</em>'.
	 * @see ca.gc.asc_csa.symphony.examples.rover.RoverData#isDisposed()
	 * @see #getRoverData()
	 * @generated
	 */
	EAttribute getRoverData_Disposed();

		/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
  SymphonyExampleRoverFactory getSymphonyExampleRoverFactory();

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
		 * The meta object literal for the '{@link ca.gc.asc_csa.symphony.examples.rover.impl.RoverSymphonySystemApiAdapterImpl <em>Rover Symphony System Api Adapter</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.symphony.examples.rover.impl.RoverSymphonySystemApiAdapterImpl
		 * @see ca.gc.asc_csa.symphony.examples.rover.impl.SymphonyExampleRoverPackageImpl#getRoverSymphonySystemApiAdapter()
		 * @generated
		 */
    EClass ROVER_SYMPHONY_SYSTEM_API_ADAPTER = eINSTANCE.getRoverSymphonySystemApiAdapter();
				/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.symphony.examples.rover.impl.RoverDataImpl <em>Rover Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.symphony.examples.rover.impl.RoverDataImpl
		 * @see ca.gc.asc_csa.symphony.examples.rover.impl.SymphonyExampleRoverPackageImpl#getRoverData()
		 * @generated
		 */
		EClass ROVER_DATA = eINSTANCE.getRoverData();
				/**
		 * The meta object literal for the '<em><b>Initialized</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROVER_DATA__INITIALIZED = eINSTANCE.getRoverData_Initialized();
				/**
		 * The meta object literal for the '<em><b>Disposed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROVER_DATA__DISPOSED = eINSTANCE.getRoverData_Disposed();

  }

} //SymphonyExampleRoverPackage
