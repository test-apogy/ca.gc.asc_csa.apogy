/**
 * <copyright>
 * </copyright>
 *
 * $Id: SimPackageImpl.java,v 1.2.4.2 2015/05/21 15:50:11 pallard Exp $
 */
package ca.gc.space.mrt.sensors.gps.sim.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import ca.gc.space.mrt.geometry.data3d.Data3dPackage;
import ca.gc.space.mrt.sensors.gps.GpsPackage;
import ca.gc.space.mrt.sensors.gps.sim.SimFacade;
import ca.gc.space.mrt.sensors.gps.sim.SimFactory;
import ca.gc.space.mrt.sensors.gps.sim.SimPackage;
import ca.gc.space.mrt.sensors.gps.sim.SimulatedConnection;
import ca.gc.space.mrt.sensors.gps.sim.SimulatedDataInterpreter;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class SimPackageImpl extends EPackageImpl implements SimPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simulatedConnectionEClass = null;
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simulatedDataInterpreterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simFacadeEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the
	 * package package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory
	 * method {@link #init init()}, which also performs initialization of the
	 * package, or returns the registered package, if one already exists. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ca.gc.space.mrt.sensors.gps.sim.SimPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SimPackageImpl() {
		super(eNS_URI, SimFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model,
	 * and for any others upon which it depends.
	 * 
	 * <p>
	 * This method is used to initialize {@link SimPackage#eINSTANCE} when that
	 * field is accessed. Clients should not invoke it directly. Instead, they
	 * should simply access that field to obtain the package. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SimPackage init() {
		if (isInited) return (SimPackage)EPackage.Registry.INSTANCE.getEPackage(SimPackage.eNS_URI);

		// Obtain or create and register package
		SimPackageImpl theSimPackage = (SimPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SimPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SimPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		GpsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSimPackage.createPackageContents();

		// Initialize created meta-data
		theSimPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSimPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SimPackage.eNS_URI, theSimPackage);
		return theSimPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimulatedConnection() {
		return simulatedConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimulatedDataInterpreter() {
		return simulatedDataInterpreterEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulatedDataInterpreter_UpdateFrequency() {
		return (EAttribute)simulatedDataInterpreterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulatedDataInterpreter_StartLatitude() {
		return (EAttribute)simulatedDataInterpreterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulatedDataInterpreter_StartLongitude() {
		return (EAttribute)simulatedDataInterpreterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulatedDataInterpreter_LatitudeIncrement() {
		return (EAttribute)simulatedDataInterpreterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulatedDataInterpreter_LongitudeIncrement() {
		return (EAttribute)simulatedDataInterpreterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimFacade() {
		return simFacadeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SimFactory getSimFactory() {
		return (SimFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		simulatedConnectionEClass = createEClass(SIMULATED_CONNECTION);

		simulatedDataInterpreterEClass = createEClass(SIMULATED_DATA_INTERPRETER);
		createEAttribute(simulatedDataInterpreterEClass, SIMULATED_DATA_INTERPRETER__UPDATE_FREQUENCY);
		createEAttribute(simulatedDataInterpreterEClass, SIMULATED_DATA_INTERPRETER__START_LATITUDE);
		createEAttribute(simulatedDataInterpreterEClass, SIMULATED_DATA_INTERPRETER__START_LONGITUDE);
		createEAttribute(simulatedDataInterpreterEClass, SIMULATED_DATA_INTERPRETER__LATITUDE_INCREMENT);
		createEAttribute(simulatedDataInterpreterEClass, SIMULATED_DATA_INTERPRETER__LONGITUDE_INCREMENT);

		simFacadeEClass = createEClass(SIM_FACADE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model. This
	 * method is guarded to have no affect on any invocation but its first. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		GpsPackage theGpsPackage = (GpsPackage)EPackage.Registry.INSTANCE.getEPackage(GpsPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		Data3dPackage theData3dPackage = (Data3dPackage)EPackage.Registry.INSTANCE.getEPackage(Data3dPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		simulatedConnectionEClass.getESuperTypes().add(theGpsPackage.getGPSConnection());
		simulatedDataInterpreterEClass.getESuperTypes().add(theGpsPackage.getGPSDataInterpreter());

		// Initialize classes and features; add operations and parameters
		initEClass(simulatedConnectionEClass, SimulatedConnection.class, "SimulatedConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(simulatedDataInterpreterEClass, SimulatedDataInterpreter.class, "SimulatedDataInterpreter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimulatedDataInterpreter_UpdateFrequency(), theEcorePackage.getEInt(), "updateFrequency", "1000", 0, 1, SimulatedDataInterpreter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulatedDataInterpreter_StartLatitude(), theEcorePackage.getEDouble(), "startLatitude", null, 0, 1, SimulatedDataInterpreter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulatedDataInterpreter_StartLongitude(), theEcorePackage.getEDouble(), "startLongitude", null, 0, 1, SimulatedDataInterpreter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulatedDataInterpreter_LatitudeIncrement(), theEcorePackage.getEDouble(), "latitudeIncrement", "0.000001", 0, 1, SimulatedDataInterpreter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulatedDataInterpreter_LongitudeIncrement(), theEcorePackage.getEDouble(), "longitudeIncrement", "0.000001", 0, 1, SimulatedDataInterpreter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simFacadeEClass, SimFacade.class, "SimFacade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(simFacadeEClass, theGpsPackage.getMarkedGPS(), "createSimulatedGPS", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "initialLatitude", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "initialLongitude", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theData3dPackage.getPositionMarker(), "marker", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} // SimPackageImpl
