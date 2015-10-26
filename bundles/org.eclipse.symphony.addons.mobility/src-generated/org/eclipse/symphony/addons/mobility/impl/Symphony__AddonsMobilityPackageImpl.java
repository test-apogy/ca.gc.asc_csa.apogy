/**
 * Canadian Space Agency 2007.
 *
 * $Id: Symphony__AddonsMobilityPackageImpl.java,v 1.4.4.2 2015/05/21 15:51:27 pallard Exp $
 */
package org.eclipse.symphony.addons.mobility.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.symphony.addons.mobility.MobilePlatform;
import org.eclipse.symphony.addons.mobility.MobilePlatformStatus;
import org.eclipse.symphony.addons.mobility.Symphony__AddonsMobilityFactory;
import org.eclipse.symphony.addons.mobility.Symphony__AddonsMobilityPackage;
import org.eclipse.symphony.addons.mobility.SkidSteeredMobilePlatform;
import org.eclipse.symphony.common.topology.TopologyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Symphony__AddonsMobilityPackageImpl extends EPackageImpl implements Symphony__AddonsMobilityPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mobilePlatformEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass skidSteeredMobilePlatformEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum mobilePlatformStatusEEnum = null;

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
	 * @see org.eclipse.symphony.addons.mobility.Symphony__AddonsMobilityPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Symphony__AddonsMobilityPackageImpl() {
		super(eNS_URI, Symphony__AddonsMobilityFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Symphony__AddonsMobilityPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Symphony__AddonsMobilityPackage init() {
		if (isInited) return (Symphony__AddonsMobilityPackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__AddonsMobilityPackage.eNS_URI);

		// Obtain or create and register package
		Symphony__AddonsMobilityPackageImpl theSymphony__AddonsMobilityPackage = (Symphony__AddonsMobilityPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Symphony__AddonsMobilityPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Symphony__AddonsMobilityPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TopologyPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSymphony__AddonsMobilityPackage.createPackageContents();

		// Initialize created meta-data
		theSymphony__AddonsMobilityPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSymphony__AddonsMobilityPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Symphony__AddonsMobilityPackage.eNS_URI, theSymphony__AddonsMobilityPackage);
		return theSymphony__AddonsMobilityPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMobilePlatform() {
		return mobilePlatformEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobilePlatform_Moving() {
		return (EAttribute)mobilePlatformEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobilePlatform_MobilePlatformStatus() {
		return (EAttribute)mobilePlatformEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSkidSteeredMobilePlatform() {
		return skidSteeredMobilePlatformEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSkidSteeredMobilePlatform_CommandedRightWheelsVelocity() {
		return (EAttribute)skidSteeredMobilePlatformEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSkidSteeredMobilePlatform_ActualRightWheelsVelocity() {
		return (EAttribute)skidSteeredMobilePlatformEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSkidSteeredMobilePlatform_CommandedLeftWheelsVelocity() {
		return (EAttribute)skidSteeredMobilePlatformEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSkidSteeredMobilePlatform_ActualLeftWheelsVelocity() {
		return (EAttribute)skidSteeredMobilePlatformEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSkidSteeredMobilePlatform_CommandedAngularVelocity() {
		return (EAttribute)skidSteeredMobilePlatformEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSkidSteeredMobilePlatform_ActualAngularVelocity() {
		return (EAttribute)skidSteeredMobilePlatformEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSkidSteeredMobilePlatform_CommandedTranslationVelocity() {
		return (EAttribute)skidSteeredMobilePlatformEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSkidSteeredMobilePlatform_ActualTranslationVelocity() {
		return (EAttribute)skidSteeredMobilePlatformEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSkidSteeredMobilePlatform_EffectiveSteeringWidth() {
		return (EAttribute)skidSteeredMobilePlatformEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMobilePlatformStatus() {
		return mobilePlatformStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__AddonsMobilityFactory getSymphony__AddonsMobilityFactory() {
		return (Symphony__AddonsMobilityFactory)getEFactoryInstance();
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
		mobilePlatformEClass = createEClass(MOBILE_PLATFORM);
		createEAttribute(mobilePlatformEClass, MOBILE_PLATFORM__MOVING);
		createEAttribute(mobilePlatformEClass, MOBILE_PLATFORM__MOBILE_PLATFORM_STATUS);

		skidSteeredMobilePlatformEClass = createEClass(SKID_STEERED_MOBILE_PLATFORM);
		createEAttribute(skidSteeredMobilePlatformEClass, SKID_STEERED_MOBILE_PLATFORM__COMMANDED_RIGHT_WHEELS_VELOCITY);
		createEAttribute(skidSteeredMobilePlatformEClass, SKID_STEERED_MOBILE_PLATFORM__ACTUAL_RIGHT_WHEELS_VELOCITY);
		createEAttribute(skidSteeredMobilePlatformEClass, SKID_STEERED_MOBILE_PLATFORM__COMMANDED_LEFT_WHEELS_VELOCITY);
		createEAttribute(skidSteeredMobilePlatformEClass, SKID_STEERED_MOBILE_PLATFORM__ACTUAL_LEFT_WHEELS_VELOCITY);
		createEAttribute(skidSteeredMobilePlatformEClass, SKID_STEERED_MOBILE_PLATFORM__COMMANDED_ANGULAR_VELOCITY);
		createEAttribute(skidSteeredMobilePlatformEClass, SKID_STEERED_MOBILE_PLATFORM__ACTUAL_ANGULAR_VELOCITY);
		createEAttribute(skidSteeredMobilePlatformEClass, SKID_STEERED_MOBILE_PLATFORM__COMMANDED_TRANSLATION_VELOCITY);
		createEAttribute(skidSteeredMobilePlatformEClass, SKID_STEERED_MOBILE_PLATFORM__ACTUAL_TRANSLATION_VELOCITY);
		createEAttribute(skidSteeredMobilePlatformEClass, SKID_STEERED_MOBILE_PLATFORM__EFFECTIVE_STEERING_WIDTH);

		// Create enums
		mobilePlatformStatusEEnum = createEEnum(MOBILE_PLATFORM_STATUS);
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
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		mobilePlatformEClass.getESuperTypes().add(theTopologyPackage.getAggregateGroupNode());
		skidSteeredMobilePlatformEClass.getESuperTypes().add(this.getMobilePlatform());

		// Initialize classes, features, and operations; add parameters
		initEClass(mobilePlatformEClass, MobilePlatform.class, "MobilePlatform", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMobilePlatform_Moving(), theEcorePackage.getEBoolean(), "moving", null, 0, 1, MobilePlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobilePlatform_MobilePlatformStatus(), this.getMobilePlatformStatus(), "mobilePlatformStatus", "OFF", 0, 1, MobilePlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(skidSteeredMobilePlatformEClass, SkidSteeredMobilePlatform.class, "SkidSteeredMobilePlatform", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSkidSteeredMobilePlatform_CommandedRightWheelsVelocity(), theEcorePackage.getEDouble(), "commandedRightWheelsVelocity", null, 0, 1, SkidSteeredMobilePlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSkidSteeredMobilePlatform_ActualRightWheelsVelocity(), theEcorePackage.getEDouble(), "actualRightWheelsVelocity", null, 0, 1, SkidSteeredMobilePlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSkidSteeredMobilePlatform_CommandedLeftWheelsVelocity(), theEcorePackage.getEDouble(), "commandedLeftWheelsVelocity", null, 0, 1, SkidSteeredMobilePlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSkidSteeredMobilePlatform_ActualLeftWheelsVelocity(), theEcorePackage.getEDouble(), "actualLeftWheelsVelocity", null, 0, 1, SkidSteeredMobilePlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSkidSteeredMobilePlatform_CommandedAngularVelocity(), theEcorePackage.getEDouble(), "commandedAngularVelocity", null, 0, 1, SkidSteeredMobilePlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSkidSteeredMobilePlatform_ActualAngularVelocity(), theEcorePackage.getEDouble(), "actualAngularVelocity", null, 0, 1, SkidSteeredMobilePlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSkidSteeredMobilePlatform_CommandedTranslationVelocity(), theEcorePackage.getEDouble(), "commandedTranslationVelocity", null, 0, 1, SkidSteeredMobilePlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSkidSteeredMobilePlatform_ActualTranslationVelocity(), theEcorePackage.getEDouble(), "actualTranslationVelocity", null, 0, 1, SkidSteeredMobilePlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSkidSteeredMobilePlatform_EffectiveSteeringWidth(), theEcorePackage.getEDouble(), "effectiveSteeringWidth", "0.5", 0, 1, SkidSteeredMobilePlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(mobilePlatformStatusEEnum, MobilePlatformStatus.class, "MobilePlatformStatus");
		addEEnumLiteral(mobilePlatformStatusEEnum, MobilePlatformStatus.OFF);
		addEEnumLiteral(mobilePlatformStatusEEnum, MobilePlatformStatus.READY);
		addEEnumLiteral(mobilePlatformStatusEEnum, MobilePlatformStatus.BUSY);
		addEEnumLiteral(mobilePlatformStatusEEnum, MobilePlatformStatus.FAILED);

		// Create resource
		createResource(eNS_URI);
	}

} //Symphony__AddonsMobilityPackageImpl
