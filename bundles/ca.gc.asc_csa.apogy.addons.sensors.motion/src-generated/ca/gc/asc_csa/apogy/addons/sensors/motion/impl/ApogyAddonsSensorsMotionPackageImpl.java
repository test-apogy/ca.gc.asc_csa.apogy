/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.motion.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.symphony.addons.sensors.Symphony__AddonsSensorsPackage;

import org.eclipse.symphony.addons.sensors.motion.AngularVelocitySensor;
import org.eclipse.symphony.addons.sensors.motion.LinearAccelerationSensor;
import org.eclipse.symphony.addons.sensors.motion.LinearVelocitySensor;
import org.eclipse.symphony.addons.sensors.motion.Symphony__AddonsSensorsMotionFactory;
import org.eclipse.symphony.addons.sensors.motion.Symphony__AddonsSensorsMotionPackage;
import org.eclipse.symphony.addons.sensors.motion.SelfMotionSensor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Symphony__AddonsSensorsMotionPackageImpl extends EPackageImpl implements Symphony__AddonsSensorsMotionPackage {
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
	 * @see org.eclipse.symphony.addons.sensors.motion.Symphony__AddonsSensorsMotionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Symphony__AddonsSensorsMotionPackageImpl() {
		super(eNS_URI, Symphony__AddonsSensorsMotionFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Symphony__AddonsSensorsMotionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Symphony__AddonsSensorsMotionPackage init() {
		if (isInited) return (Symphony__AddonsSensorsMotionPackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__AddonsSensorsMotionPackage.eNS_URI);

		// Obtain or create and register package
		Symphony__AddonsSensorsMotionPackageImpl theSymphony__AddonsSensorsMotionPackage = (Symphony__AddonsSensorsMotionPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Symphony__AddonsSensorsMotionPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Symphony__AddonsSensorsMotionPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		Symphony__AddonsSensorsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSymphony__AddonsSensorsMotionPackage.createPackageContents();

		// Initialize created meta-data
		theSymphony__AddonsSensorsMotionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSymphony__AddonsSensorsMotionPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Symphony__AddonsSensorsMotionPackage.eNS_URI, theSymphony__AddonsSensorsMotionPackage);
		return theSymphony__AddonsSensorsMotionPackage;
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
	public Symphony__AddonsSensorsMotionFactory getSymphony__AddonsSensorsMotionFactory() {
		return (Symphony__AddonsSensorsMotionFactory)getEFactoryInstance();
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
		Symphony__AddonsSensorsPackage theSymphony__AddonsSensorsPackage = (Symphony__AddonsSensorsPackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__AddonsSensorsPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		selfMotionSensorEClass.getESuperTypes().add(theSymphony__AddonsSensorsPackage.getSensor());
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
			 "prefix", "Symphony__AddonsSensorsMotion",
			 "childCreationExtenders", "true",
			 "extensibleProviderFactory", "true",
			 "multipleEditorPages", "false",
			 "copyrightText", "Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)",
			 "modelName", "Symphony__AddonsSensorsMotion",
			 "suppressGenModelAnnotations", "false",
			 "modelDirectory", "/org.eclipse.symphony.addons.sensors.motion/src-generated",
			 "editDirectory", "/org.eclipse.symphony.addons.sensors.motion.edit/src-generated",
			 "basePackage", "org.eclipse.symphony.addons.sensors"
		   });
	}

} //Symphony__AddonsSensorsMotionPackageImpl
