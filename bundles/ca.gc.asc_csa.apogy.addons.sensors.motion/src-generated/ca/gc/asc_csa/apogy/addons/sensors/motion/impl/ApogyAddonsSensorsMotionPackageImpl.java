/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.addons.sensors.motion.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import ca.gc.asc_csa.apogy.addons.sensors.ApogyAddonsSensorsPackage;

import ca.gc.asc_csa.apogy.addons.sensors.motion.AngularVelocitySensor;
import ca.gc.asc_csa.apogy.addons.sensors.motion.LinearAccelerationSensor;
import ca.gc.asc_csa.apogy.addons.sensors.motion.LinearVelocitySensor;
import ca.gc.asc_csa.apogy.addons.sensors.motion.ApogyAddonsSensorsMotionFactory;
import ca.gc.asc_csa.apogy.addons.sensors.motion.ApogyAddonsSensorsMotionPackage;
import ca.gc.asc_csa.apogy.addons.sensors.motion.SelfMotionSensor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyAddonsSensorsMotionPackageImpl extends EPackageImpl implements ApogyAddonsSensorsMotionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selfMotionSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass angularVelocitySensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linearAccelerationSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linearVelocitySensorEClass = null;

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
	 * @see ca.gc.asc_csa.apogy.addons.sensors.motion.ApogyAddonsSensorsMotionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ApogyAddonsSensorsMotionPackageImpl() {
		super(eNS_URI, ApogyAddonsSensorsMotionFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ApogyAddonsSensorsMotionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ApogyAddonsSensorsMotionPackage init() {
		if (isInited) return (ApogyAddonsSensorsMotionPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyAddonsSensorsMotionPackage.eNS_URI);

		// Obtain or create and register package
		ApogyAddonsSensorsMotionPackageImpl theApogyAddonsSensorsMotionPackage = (ApogyAddonsSensorsMotionPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ApogyAddonsSensorsMotionPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ApogyAddonsSensorsMotionPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ApogyAddonsSensorsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theApogyAddonsSensorsMotionPackage.createPackageContents();

		// Initialize created meta-data
		theApogyAddonsSensorsMotionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theApogyAddonsSensorsMotionPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ApogyAddonsSensorsMotionPackage.eNS_URI, theApogyAddonsSensorsMotionPackage);
		return theApogyAddonsSensorsMotionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelfMotionSensor() {
		return selfMotionSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAngularVelocitySensor() {
		return angularVelocitySensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAngularVelocitySensor_XAngularVelocity() {
		return (EAttribute)angularVelocitySensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAngularVelocitySensor_YAngularVelocity() {
		return (EAttribute)angularVelocitySensorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAngularVelocitySensor_ZAngularVelocity() {
		return (EAttribute)angularVelocitySensorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinearAccelerationSensor() {
		return linearAccelerationSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinearAccelerationSensor_XAcceleration() {
		return (EAttribute)linearAccelerationSensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinearAccelerationSensor_YAcceleration() {
		return (EAttribute)linearAccelerationSensorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinearAccelerationSensor_ZAcceleration() {
		return (EAttribute)linearAccelerationSensorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinearVelocitySensor() {
		return linearVelocitySensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinearVelocitySensor_XVelocity() {
		return (EAttribute)linearVelocitySensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinearVelocitySensor_YVelocity() {
		return (EAttribute)linearVelocitySensorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinearVelocitySensor_ZVelocity() {
		return (EAttribute)linearVelocitySensorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyAddonsSensorsMotionFactory getApogyAddonsSensorsMotionFactory() {
		return (ApogyAddonsSensorsMotionFactory)getEFactoryInstance();
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
		selfMotionSensorEClass = createEClass(SELF_MOTION_SENSOR);

		angularVelocitySensorEClass = createEClass(ANGULAR_VELOCITY_SENSOR);
		createEAttribute(angularVelocitySensorEClass, ANGULAR_VELOCITY_SENSOR__XANGULAR_VELOCITY);
		createEAttribute(angularVelocitySensorEClass, ANGULAR_VELOCITY_SENSOR__YANGULAR_VELOCITY);
		createEAttribute(angularVelocitySensorEClass, ANGULAR_VELOCITY_SENSOR__ZANGULAR_VELOCITY);

		linearAccelerationSensorEClass = createEClass(LINEAR_ACCELERATION_SENSOR);
		createEAttribute(linearAccelerationSensorEClass, LINEAR_ACCELERATION_SENSOR__XACCELERATION);
		createEAttribute(linearAccelerationSensorEClass, LINEAR_ACCELERATION_SENSOR__YACCELERATION);
		createEAttribute(linearAccelerationSensorEClass, LINEAR_ACCELERATION_SENSOR__ZACCELERATION);

		linearVelocitySensorEClass = createEClass(LINEAR_VELOCITY_SENSOR);
		createEAttribute(linearVelocitySensorEClass, LINEAR_VELOCITY_SENSOR__XVELOCITY);
		createEAttribute(linearVelocitySensorEClass, LINEAR_VELOCITY_SENSOR__YVELOCITY);
		createEAttribute(linearVelocitySensorEClass, LINEAR_VELOCITY_SENSOR__ZVELOCITY);
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
		ApogyAddonsSensorsPackage theApogyAddonsSensorsPackage = (ApogyAddonsSensorsPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyAddonsSensorsPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		selfMotionSensorEClass.getESuperTypes().add(theApogyAddonsSensorsPackage.getSensor());
		angularVelocitySensorEClass.getESuperTypes().add(this.getSelfMotionSensor());
		linearAccelerationSensorEClass.getESuperTypes().add(this.getSelfMotionSensor());
		linearVelocitySensorEClass.getESuperTypes().add(this.getSelfMotionSensor());

		// Initialize classes, features, and operations; add parameters
		initEClass(selfMotionSensorEClass, SelfMotionSensor.class, "SelfMotionSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(angularVelocitySensorEClass, AngularVelocitySensor.class, "AngularVelocitySensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAngularVelocitySensor_XAngularVelocity(), theEcorePackage.getEDouble(), "xAngularVelocity", null, 0, 1, AngularVelocitySensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAngularVelocitySensor_YAngularVelocity(), theEcorePackage.getEDouble(), "yAngularVelocity", null, 0, 1, AngularVelocitySensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAngularVelocitySensor_ZAngularVelocity(), theEcorePackage.getEDouble(), "zAngularVelocity", null, 0, 1, AngularVelocitySensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linearAccelerationSensorEClass, LinearAccelerationSensor.class, "LinearAccelerationSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLinearAccelerationSensor_XAcceleration(), theEcorePackage.getEDouble(), "xAcceleration", null, 0, 1, LinearAccelerationSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinearAccelerationSensor_YAcceleration(), theEcorePackage.getEDouble(), "yAcceleration", null, 0, 1, LinearAccelerationSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinearAccelerationSensor_ZAcceleration(), theEcorePackage.getEDouble(), "zAcceleration", null, 0, 1, LinearAccelerationSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linearVelocitySensorEClass, LinearVelocitySensor.class, "LinearVelocitySensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLinearVelocitySensor_XVelocity(), theEcorePackage.getEDouble(), "xVelocity", null, 0, 1, LinearVelocitySensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinearVelocitySensor_YVelocity(), theEcorePackage.getEDouble(), "yVelocity", null, 0, 1, LinearVelocitySensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinearVelocitySensor_ZVelocity(), theEcorePackage.getEDouble(), "zVelocity", null, 0, 1, LinearVelocitySensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "prefix", "ApogyAddonsSensorsMotion",
			 "childCreationExtenders", "true",
			 "extensibleProviderFactory", "true",
			 "multipleEditorPages", "false",
			 "copyrightText", "Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)",
			 "modelName", "ApogyAddonsSensorsMotion",
			 "suppressGenModelAnnotations", "false",
			 "modelDirectory", "/ca.gc.asc_csa.apogy.addons.sensors.motion/src-generated",
			 "editDirectory", "/ca.gc.asc_csa.apogy.addons.sensors.motion.edit/src-generated",
			 "basePackage", "ca.gc.asc_csa.apogy.addons.sensors"
		   });
	}

} //ApogyAddonsSensorsMotionPackageImpl
