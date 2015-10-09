/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.pose.ui.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.symphony.addons.sensors.pose.ui.OrientationSensorPresentation;
import org.eclipse.symphony.addons.sensors.pose.ui.PoseSensorPresentation;
import org.eclipse.symphony.addons.sensors.pose.ui.PositionSensorPresentation;
import org.eclipse.symphony.addons.sensors.pose.ui.SensorsPoseUIFactory;
import org.eclipse.symphony.addons.sensors.pose.ui.SensorsPoseUIPackage;
import org.eclipse.symphony.common.topology.ui.TopologyUIPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SensorsPoseUIPackageImpl extends EPackageImpl implements SensorsPoseUIPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positionSensorPresentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orientationSensorPresentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass poseSensorPresentationEClass = null;

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
	 * @see org.eclipse.symphony.addons.sensors.pose.ui.SensorsPoseUIPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SensorsPoseUIPackageImpl() {
		super(eNS_URI, SensorsPoseUIFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SensorsPoseUIPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SensorsPoseUIPackage init() {
		if (isInited) return (SensorsPoseUIPackage)EPackage.Registry.INSTANCE.getEPackage(SensorsPoseUIPackage.eNS_URI);

		// Obtain or create and register package
		SensorsPoseUIPackageImpl theSensorsPoseUIPackage = (SensorsPoseUIPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SensorsPoseUIPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SensorsPoseUIPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TopologyUIPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSensorsPoseUIPackage.createPackageContents();

		// Initialize created meta-data
		theSensorsPoseUIPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSensorsPoseUIPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SensorsPoseUIPackage.eNS_URI, theSensorsPoseUIPackage);
		return theSensorsPoseUIPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPositionSensorPresentation() {
		return positionSensorPresentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPositionSensorPresentation_FrameVisible() {
		return (EAttribute)positionSensorPresentationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrientationSensorPresentation() {
		return orientationSensorPresentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrientationSensorPresentation_FrameVisible() {
		return (EAttribute)orientationSensorPresentationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPoseSensorPresentation() {
		return poseSensorPresentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPoseSensorPresentation_FrameVisible() {
		return (EAttribute)poseSensorPresentationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorsPoseUIFactory getSensorsPoseUIFactory() {
		return (SensorsPoseUIFactory)getEFactoryInstance();
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
		positionSensorPresentationEClass = createEClass(POSITION_SENSOR_PRESENTATION);
		createEAttribute(positionSensorPresentationEClass, POSITION_SENSOR_PRESENTATION__FRAME_VISIBLE);

		orientationSensorPresentationEClass = createEClass(ORIENTATION_SENSOR_PRESENTATION);
		createEAttribute(orientationSensorPresentationEClass, ORIENTATION_SENSOR_PRESENTATION__FRAME_VISIBLE);

		poseSensorPresentationEClass = createEClass(POSE_SENSOR_PRESENTATION);
		createEAttribute(poseSensorPresentationEClass, POSE_SENSOR_PRESENTATION__FRAME_VISIBLE);
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
		TopologyUIPackage theTopologyUIPackage = (TopologyUIPackage)EPackage.Registry.INSTANCE.getEPackage(TopologyUIPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		positionSensorPresentationEClass.getESuperTypes().add(theTopologyUIPackage.getNodePresentation());
		orientationSensorPresentationEClass.getESuperTypes().add(theTopologyUIPackage.getNodePresentation());
		poseSensorPresentationEClass.getESuperTypes().add(theTopologyUIPackage.getNodePresentation());

		// Initialize classes, features, and operations; add parameters
		initEClass(positionSensorPresentationEClass, PositionSensorPresentation.class, "PositionSensorPresentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPositionSensorPresentation_FrameVisible(), theEcorePackage.getEBoolean(), "frameVisible", "true", 0, 1, PositionSensorPresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orientationSensorPresentationEClass, OrientationSensorPresentation.class, "OrientationSensorPresentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrientationSensorPresentation_FrameVisible(), theEcorePackage.getEBoolean(), "frameVisible", "true", 0, 1, OrientationSensorPresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(poseSensorPresentationEClass, PoseSensorPresentation.class, "PoseSensorPresentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPoseSensorPresentation_FrameVisible(), theEcorePackage.getEBoolean(), "frameVisible", "true", 0, 1, PoseSensorPresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SensorsPoseUIPackageImpl
