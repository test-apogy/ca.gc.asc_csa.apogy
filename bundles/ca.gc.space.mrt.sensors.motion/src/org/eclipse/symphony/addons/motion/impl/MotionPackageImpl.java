/**
 * <copyright>
 * </copyright>
 *
 * $Id: MotionPackageImpl.java,v 1.3.4.2 2015/05/21 15:50:25 pallard Exp $
 */
package org.eclipse.symphony.addons.motion.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.symphony.addons.motion.AngularVelocitySensor;
import org.eclipse.symphony.addons.motion.LinearAccelerationSensor;
import org.eclipse.symphony.addons.motion.LinearVelocitySensor;
import org.eclipse.symphony.addons.motion.MotionFactory;
import org.eclipse.symphony.addons.motion.MotionPackage;
import org.eclipse.symphony.addons.motion.SelfMotionSensor;
import org.eclipse.symphony.addons.sensors.SensorsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MotionPackageImpl extends EPackageImpl implements MotionPackage {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selfMotionSensorEClass = null;

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
	 * @see org.eclipse.symphony.addons.motion.MotionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MotionPackageImpl() {
		super(eNS_URI, MotionFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MotionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MotionPackage init() {
		if (isInited) return (MotionPackage)EPackage.Registry.INSTANCE.getEPackage(MotionPackage.eNS_URI);

		// Obtain or create and register package
		MotionPackageImpl theMotionPackage = (MotionPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MotionPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MotionPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SensorsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theMotionPackage.createPackageContents();

		// Initialize created meta-data
		theMotionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMotionPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MotionPackage.eNS_URI, theMotionPackage);
		return theMotionPackage;
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
	public EClass getSelfMotionSensor() {
		return selfMotionSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MotionFactory getMotionFactory() {
		return (MotionFactory)getEFactoryInstance();
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

		selfMotionSensorEClass = createEClass(SELF_MOTION_SENSOR);
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
		SensorsPackage theSensorsPackage = (SensorsPackage)EPackage.Registry.INSTANCE.getEPackage(SensorsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		angularVelocitySensorEClass.getESuperTypes().add(this.getSelfMotionSensor());
		linearAccelerationSensorEClass.getESuperTypes().add(this.getSelfMotionSensor());
		linearVelocitySensorEClass.getESuperTypes().add(this.getSelfMotionSensor());
		selfMotionSensorEClass.getESuperTypes().add(theSensorsPackage.getSensor());

		// Initialize classes, features, and operations; add parameters
		initEClass(angularVelocitySensorEClass, AngularVelocitySensor.class, "AngularVelocitySensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAngularVelocitySensor_XAngularVelocity(), ecorePackage.getEDouble(), "xAngularVelocity", null, 1, 1, AngularVelocitySensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAngularVelocitySensor_YAngularVelocity(), ecorePackage.getEDouble(), "yAngularVelocity", null, 1, 1, AngularVelocitySensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAngularVelocitySensor_ZAngularVelocity(), ecorePackage.getEDouble(), "zAngularVelocity", null, 1, 1, AngularVelocitySensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linearAccelerationSensorEClass, LinearAccelerationSensor.class, "LinearAccelerationSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLinearAccelerationSensor_XAcceleration(), ecorePackage.getEDouble(), "xAcceleration", null, 1, 1, LinearAccelerationSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinearAccelerationSensor_YAcceleration(), ecorePackage.getEDouble(), "yAcceleration", null, 1, 1, LinearAccelerationSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinearAccelerationSensor_ZAcceleration(), ecorePackage.getEDouble(), "zAcceleration", null, 1, 1, LinearAccelerationSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linearVelocitySensorEClass, LinearVelocitySensor.class, "LinearVelocitySensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLinearVelocitySensor_XVelocity(), ecorePackage.getEDouble(), "xVelocity", null, 1, 1, LinearVelocitySensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinearVelocitySensor_YVelocity(), ecorePackage.getEDouble(), "yVelocity", null, 1, 1, LinearVelocitySensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinearVelocitySensor_ZVelocity(), ecorePackage.getEDouble(), "zVelocity", null, 1, 1, LinearVelocitySensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(selfMotionSensorEClass, SelfMotionSensor.class, "SelfMotionSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //MotionPackageImpl
