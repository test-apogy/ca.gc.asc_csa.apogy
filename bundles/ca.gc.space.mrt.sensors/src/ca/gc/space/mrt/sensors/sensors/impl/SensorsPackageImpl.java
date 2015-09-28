/**
 * Canadian Space Agency 2007.
 *
 * $Id: SensorsPackageImpl.java,v 1.4.4.2 2015/05/21 15:49:36 pallard Exp $
 */
package ca.gc.space.mrt.sensors.sensors.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import ca.gc.space.mrt.sensors.sensors.Referenceable;
import ca.gc.space.mrt.sensors.sensors.Sensor;
import ca.gc.space.mrt.sensors.sensors.SensorStatus;
import ca.gc.space.mrt.sensors.sensors.SensorsFactory;
import ca.gc.space.mrt.sensors.sensors.SensorsPackage;
import ca.gc.space.topology.TopologyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SensorsPackageImpl extends EPackageImpl implements SensorsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Canadian Space Agency 2007.";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sensorStatusEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ca.gc.space.mrt.sensors.sensors.SensorsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SensorsPackageImpl() {
		super(eNS_URI, SensorsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SensorsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SensorsPackage init() {
		if (isInited) return (SensorsPackage)EPackage.Registry.INSTANCE.getEPackage(SensorsPackage.eNS_URI);

		// Obtain or create and register package
		SensorsPackageImpl theSensorsPackage = (SensorsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SensorsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SensorsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TopologyPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSensorsPackage.createPackageContents();

		// Initialize created meta-data
		theSensorsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSensorsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SensorsPackage.eNS_URI, theSensorsPackage);
		return theSensorsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSensor() {
		return sensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSensor_Status() {
		return (EAttribute)sensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferenceable() {
		return referenceableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferenceable_ReferenceFrame() {
		return (EReference)referenceableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSensorStatus()
	{
		return sensorStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorsFactory getSensorsFactory() {
		return (SensorsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
		sensorEClass = createEClass(SENSOR);
		createEAttribute(sensorEClass, SENSOR__STATUS);

		referenceableEClass = createEClass(REFERENCEABLE);
		createEReference(referenceableEClass, REFERENCEABLE__REFERENCE_FRAME);

		// Create enums
		sensorStatusEEnum = createEEnum(SENSOR_STATUS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
		TopologyPackage theTopologyPackage = (TopologyPackage)EPackage.Registry.INSTANCE.getEPackage(TopologyPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		sensorEClass.getESuperTypes().add(theTopologyPackage.getAggregateGroupNode());

		// Initialize classes, features, and operations; add parameters
		initEClass(sensorEClass, Sensor.class, "Sensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSensor_Status(), this.getSensorStatus(), "status", "OFF", 0, 1, Sensor.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referenceableEClass, Referenceable.class, "Referenceable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReferenceable_ReferenceFrame(), theTopologyPackage.getNode(), null, "referenceFrame", null, 0, 1, Referenceable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(sensorStatusEEnum, SensorStatus.class, "SensorStatus");
		addEEnumLiteral(sensorStatusEEnum, SensorStatus.OFF);
		addEEnumLiteral(sensorStatusEEnum, SensorStatus.READY);
		addEEnumLiteral(sensorStatusEEnum, SensorStatus.BUSY);
		addEEnumLiteral(sensorStatusEEnum, SensorStatus.FAILED);

		// Create resource
		createResource(eNS_URI);
	}

} //SensorsPackageImpl
