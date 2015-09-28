/**
 * <copyright>
 * </copyright>
 *
 * $Id: SimPackage.java,v 1.2.4.2 2015/05/21 15:50:11 pallard Exp $
 */
package ca.gc.space.mrt.sensors.gps.sim;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import ca.gc.space.mrt.sensors.gps.GpsPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ca.gc.space.mrt.sensors.gps.sim.SimFactory
 * @model kind="package"
 * @generated
 */
public interface SimPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sim";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///ca/gc/space/mrt/sensors/gps/sim.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ca.gc.space.mrt.sensors.gps";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SimPackage eINSTANCE = ca.gc.space.mrt.sensors.gps.sim.impl.SimPackageImpl.init();

	/**
	 * The meta object id for the '{@link ca.gc.space.mrt.sensors.gps.sim.impl.SimulatedConnectionImpl <em>Simulated Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.space.mrt.sensors.gps.sim.impl.SimulatedConnectionImpl
	 * @see ca.gc.space.mrt.sensors.gps.sim.impl.SimPackageImpl#getSimulatedConnection()
	 * @generated
	 */
	int SIMULATED_CONNECTION = 0;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATED_CONNECTION__INPUT = GpsPackage.GPS_CONNECTION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATED_CONNECTION__OUTPUT = GpsPackage.GPS_CONNECTION__OUTPUT;

	/**
	 * The number of structural features of the '<em>Simulated Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATED_CONNECTION_FEATURE_COUNT = GpsPackage.GPS_CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.space.mrt.sensors.gps.sim.impl.SimulatedDataInterpreterImpl <em>Simulated Data Interpreter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.space.mrt.sensors.gps.sim.impl.SimulatedDataInterpreterImpl
	 * @see ca.gc.space.mrt.sensors.gps.sim.impl.SimPackageImpl#getSimulatedDataInterpreter()
	 * @generated
	 */
	int SIMULATED_DATA_INTERPRETER = 1;

	/**
	 * The feature id for the '<em><b>Gps</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATED_DATA_INTERPRETER__GPS = GpsPackage.GPS_DATA_INTERPRETER__GPS;

	/**
	 * The feature id for the '<em><b>Update Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATED_DATA_INTERPRETER__UPDATE_FREQUENCY = GpsPackage.GPS_DATA_INTERPRETER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Start Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATED_DATA_INTERPRETER__START_LATITUDE = GpsPackage.GPS_DATA_INTERPRETER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Start Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATED_DATA_INTERPRETER__START_LONGITUDE = GpsPackage.GPS_DATA_INTERPRETER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Latitude Increment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATED_DATA_INTERPRETER__LATITUDE_INCREMENT = GpsPackage.GPS_DATA_INTERPRETER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Longitude Increment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATED_DATA_INTERPRETER__LONGITUDE_INCREMENT = GpsPackage.GPS_DATA_INTERPRETER_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Simulated Data Interpreter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATED_DATA_INTERPRETER_FEATURE_COUNT = GpsPackage.GPS_DATA_INTERPRETER_FEATURE_COUNT + 5;


	/**
	 * The meta object id for the '{@link ca.gc.space.mrt.sensors.gps.sim.impl.SimFacadeImpl <em>Facade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.space.mrt.sensors.gps.sim.impl.SimFacadeImpl
	 * @see ca.gc.space.mrt.sensors.gps.sim.impl.SimPackageImpl#getSimFacade()
	 * @generated
	 */
	int SIM_FACADE = 2;

	/**
	 * The number of structural features of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIM_FACADE_FEATURE_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link ca.gc.space.mrt.sensors.gps.sim.SimulatedConnection <em>Simulated Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simulated Connection</em>'.
	 * @see ca.gc.space.mrt.sensors.gps.sim.SimulatedConnection
	 * @generated
	 */
	EClass getSimulatedConnection();

	/**
	 * Returns the meta object for class '{@link ca.gc.space.mrt.sensors.gps.sim.SimulatedDataInterpreter <em>Simulated Data Interpreter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simulated Data Interpreter</em>'.
	 * @see ca.gc.space.mrt.sensors.gps.sim.SimulatedDataInterpreter
	 * @generated
	 */
	EClass getSimulatedDataInterpreter();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.mrt.sensors.gps.sim.SimulatedDataInterpreter#getUpdateFrequency <em>Update Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Update Frequency</em>'.
	 * @see ca.gc.space.mrt.sensors.gps.sim.SimulatedDataInterpreter#getUpdateFrequency()
	 * @see #getSimulatedDataInterpreter()
	 * @generated
	 */
	EAttribute getSimulatedDataInterpreter_UpdateFrequency();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.mrt.sensors.gps.sim.SimulatedDataInterpreter#getStartLatitude <em>Start Latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Latitude</em>'.
	 * @see ca.gc.space.mrt.sensors.gps.sim.SimulatedDataInterpreter#getStartLatitude()
	 * @see #getSimulatedDataInterpreter()
	 * @generated
	 */
	EAttribute getSimulatedDataInterpreter_StartLatitude();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.mrt.sensors.gps.sim.SimulatedDataInterpreter#getStartLongitude <em>Start Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Longitude</em>'.
	 * @see ca.gc.space.mrt.sensors.gps.sim.SimulatedDataInterpreter#getStartLongitude()
	 * @see #getSimulatedDataInterpreter()
	 * @generated
	 */
	EAttribute getSimulatedDataInterpreter_StartLongitude();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.mrt.sensors.gps.sim.SimulatedDataInterpreter#getLatitudeIncrement <em>Latitude Increment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latitude Increment</em>'.
	 * @see ca.gc.space.mrt.sensors.gps.sim.SimulatedDataInterpreter#getLatitudeIncrement()
	 * @see #getSimulatedDataInterpreter()
	 * @generated
	 */
	EAttribute getSimulatedDataInterpreter_LatitudeIncrement();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.mrt.sensors.gps.sim.SimulatedDataInterpreter#getLongitudeIncrement <em>Longitude Increment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Longitude Increment</em>'.
	 * @see ca.gc.space.mrt.sensors.gps.sim.SimulatedDataInterpreter#getLongitudeIncrement()
	 * @see #getSimulatedDataInterpreter()
	 * @generated
	 */
	EAttribute getSimulatedDataInterpreter_LongitudeIncrement();

	/**
	 * Returns the meta object for class '{@link ca.gc.space.mrt.sensors.gps.sim.SimFacade <em>Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facade</em>'.
	 * @see ca.gc.space.mrt.sensors.gps.sim.SimFacade
	 * @generated
	 */
	EClass getSimFacade();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SimFactory getSimFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ca.gc.space.mrt.sensors.gps.sim.impl.SimulatedConnectionImpl <em>Simulated Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.space.mrt.sensors.gps.sim.impl.SimulatedConnectionImpl
		 * @see ca.gc.space.mrt.sensors.gps.sim.impl.SimPackageImpl#getSimulatedConnection()
		 * @generated
		 */
		EClass SIMULATED_CONNECTION = eINSTANCE.getSimulatedConnection();

		/**
		 * The meta object literal for the '{@link ca.gc.space.mrt.sensors.gps.sim.impl.SimulatedDataInterpreterImpl <em>Simulated Data Interpreter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.space.mrt.sensors.gps.sim.impl.SimulatedDataInterpreterImpl
		 * @see ca.gc.space.mrt.sensors.gps.sim.impl.SimPackageImpl#getSimulatedDataInterpreter()
		 * @generated
		 */
		EClass SIMULATED_DATA_INTERPRETER = eINSTANCE.getSimulatedDataInterpreter();

		/**
		 * The meta object literal for the '<em><b>Update Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATED_DATA_INTERPRETER__UPDATE_FREQUENCY = eINSTANCE.getSimulatedDataInterpreter_UpdateFrequency();

		/**
		 * The meta object literal for the '<em><b>Start Latitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATED_DATA_INTERPRETER__START_LATITUDE = eINSTANCE.getSimulatedDataInterpreter_StartLatitude();

		/**
		 * The meta object literal for the '<em><b>Start Longitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATED_DATA_INTERPRETER__START_LONGITUDE = eINSTANCE.getSimulatedDataInterpreter_StartLongitude();

		/**
		 * The meta object literal for the '<em><b>Latitude Increment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATED_DATA_INTERPRETER__LATITUDE_INCREMENT = eINSTANCE.getSimulatedDataInterpreter_LatitudeIncrement();

		/**
		 * The meta object literal for the '<em><b>Longitude Increment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATED_DATA_INTERPRETER__LONGITUDE_INCREMENT = eINSTANCE.getSimulatedDataInterpreter_LongitudeIncrement();

		/**
		 * The meta object literal for the '{@link ca.gc.space.mrt.sensors.gps.sim.impl.SimFacadeImpl <em>Facade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.space.mrt.sensors.gps.sim.impl.SimFacadeImpl
		 * @see ca.gc.space.mrt.sensors.gps.sim.impl.SimPackageImpl#getSimFacade()
		 * @generated
		 */
		EClass SIM_FACADE = eINSTANCE.getSimFacade();

	}

} //SimPackage
