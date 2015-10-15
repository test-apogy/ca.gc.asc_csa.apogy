/**
 * Canadian Space Agency 2007.
 *
 * $Id: MobilityPackageImpl.java,v 1.4.4.2 2015/05/21 15:51:27 pallard Exp $
 */
package org.eclipse.symphony.addons.mobility.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.symphony.addons.mobility.MobilePlateform;
import org.eclipse.symphony.addons.mobility.MobilePlateformStatus;
import org.eclipse.symphony.addons.mobility.MobilityFactory;
import org.eclipse.symphony.addons.mobility.MobilityPackage;
import org.eclipse.symphony.addons.mobility.SkidSteeredMobilePlateform;
import org.eclipse.symphony.common.topology.TopologyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MobilityPackageImpl extends EPackageImpl implements MobilityPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mobilePlateformEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass skidSteeredMobilePlateformEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum mobilePlateformStatusEEnum = null;

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
	 * @see org.eclipse.symphony.addons.mobility.MobilityPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MobilityPackageImpl() {
		super(eNS_URI, MobilityFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MobilityPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MobilityPackage init() {
		if (isInited) return (MobilityPackage)EPackage.Registry.INSTANCE.getEPackage(MobilityPackage.eNS_URI);

		// Obtain or create and register package
		MobilityPackageImpl theMobilityPackage = (MobilityPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MobilityPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MobilityPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TopologyPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theMobilityPackage.createPackageContents();

		// Initialize created meta-data
		theMobilityPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMobilityPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MobilityPackage.eNS_URI, theMobilityPackage);
		return theMobilityPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMobilePlateform() {
		return mobilePlateformEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobilePlateform_Moving() {
		return (EAttribute)mobilePlateformEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobilePlateform_MobilePlateformStatus()
	{
		return (EAttribute)mobilePlateformEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSkidSteeredMobilePlateform() {
		return skidSteeredMobilePlateformEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSkidSteeredMobilePlateform_CommandedRightWheelsVelocity() {
		return (EAttribute)skidSteeredMobilePlateformEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSkidSteeredMobilePlateform_ActualRightWheelsVelocity()
	{
		return (EAttribute)skidSteeredMobilePlateformEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSkidSteeredMobilePlateform_CommandedLeftWheelsVelocity() {
		return (EAttribute)skidSteeredMobilePlateformEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSkidSteeredMobilePlateform_ActualLeftWheelsVelocity()
	{
		return (EAttribute)skidSteeredMobilePlateformEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSkidSteeredMobilePlateform_CommandedAngularVelocity()
	{
		return (EAttribute)skidSteeredMobilePlateformEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSkidSteeredMobilePlateform_ActualAngularVelocity()
	{
		return (EAttribute)skidSteeredMobilePlateformEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSkidSteeredMobilePlateform_CommandedTranslationVelocity()
	{
		return (EAttribute)skidSteeredMobilePlateformEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSkidSteeredMobilePlateform_ActualTranslationVelocity()
	{
		return (EAttribute)skidSteeredMobilePlateformEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSkidSteeredMobilePlateform_EffectiveSteeringWidth()
	{
		return (EAttribute)skidSteeredMobilePlateformEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMobilePlateformStatus()
	{
		return mobilePlateformStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobilityFactory getMobilityFactory() {
		return (MobilityFactory)getEFactoryInstance();
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
		mobilePlateformEClass = createEClass(MOBILE_PLATEFORM);
		createEAttribute(mobilePlateformEClass, MOBILE_PLATEFORM__MOVING);
		createEAttribute(mobilePlateformEClass, MOBILE_PLATEFORM__MOBILE_PLATEFORM_STATUS);

		skidSteeredMobilePlateformEClass = createEClass(SKID_STEERED_MOBILE_PLATEFORM);
		createEAttribute(skidSteeredMobilePlateformEClass, SKID_STEERED_MOBILE_PLATEFORM__COMMANDED_RIGHT_WHEELS_VELOCITY);
		createEAttribute(skidSteeredMobilePlateformEClass, SKID_STEERED_MOBILE_PLATEFORM__ACTUAL_RIGHT_WHEELS_VELOCITY);
		createEAttribute(skidSteeredMobilePlateformEClass, SKID_STEERED_MOBILE_PLATEFORM__COMMANDED_LEFT_WHEELS_VELOCITY);
		createEAttribute(skidSteeredMobilePlateformEClass, SKID_STEERED_MOBILE_PLATEFORM__ACTUAL_LEFT_WHEELS_VELOCITY);
		createEAttribute(skidSteeredMobilePlateformEClass, SKID_STEERED_MOBILE_PLATEFORM__COMMANDED_ANGULAR_VELOCITY);
		createEAttribute(skidSteeredMobilePlateformEClass, SKID_STEERED_MOBILE_PLATEFORM__ACTUAL_ANGULAR_VELOCITY);
		createEAttribute(skidSteeredMobilePlateformEClass, SKID_STEERED_MOBILE_PLATEFORM__COMMANDED_TRANSLATION_VELOCITY);
		createEAttribute(skidSteeredMobilePlateformEClass, SKID_STEERED_MOBILE_PLATEFORM__ACTUAL_TRANSLATION_VELOCITY);
		createEAttribute(skidSteeredMobilePlateformEClass, SKID_STEERED_MOBILE_PLATEFORM__EFFECTIVE_STEERING_WIDTH);

		// Create enums
		mobilePlateformStatusEEnum = createEEnum(MOBILE_PLATEFORM_STATUS);
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
		mobilePlateformEClass.getESuperTypes().add(theTopologyPackage.getAggregateGroupNode());
		skidSteeredMobilePlateformEClass.getESuperTypes().add(this.getMobilePlateform());

		// Initialize classes, features, and operations; add parameters
		initEClass(mobilePlateformEClass, MobilePlateform.class, "MobilePlateform", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMobilePlateform_Moving(), theEcorePackage.getEBoolean(), "moving", null, 0, 1, MobilePlateform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobilePlateform_MobilePlateformStatus(), this.getMobilePlateformStatus(), "mobilePlateformStatus", "OFF", 0, 1, MobilePlateform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(skidSteeredMobilePlateformEClass, SkidSteeredMobilePlateform.class, "SkidSteeredMobilePlateform", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSkidSteeredMobilePlateform_CommandedRightWheelsVelocity(), theEcorePackage.getEDouble(), "commandedRightWheelsVelocity", null, 0, 1, SkidSteeredMobilePlateform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSkidSteeredMobilePlateform_ActualRightWheelsVelocity(), theEcorePackage.getEDouble(), "actualRightWheelsVelocity", null, 0, 1, SkidSteeredMobilePlateform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSkidSteeredMobilePlateform_CommandedLeftWheelsVelocity(), theEcorePackage.getEDouble(), "commandedLeftWheelsVelocity", null, 0, 1, SkidSteeredMobilePlateform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSkidSteeredMobilePlateform_ActualLeftWheelsVelocity(), theEcorePackage.getEDouble(), "actualLeftWheelsVelocity", null, 0, 1, SkidSteeredMobilePlateform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSkidSteeredMobilePlateform_CommandedAngularVelocity(), theEcorePackage.getEDouble(), "commandedAngularVelocity", null, 0, 1, SkidSteeredMobilePlateform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSkidSteeredMobilePlateform_ActualAngularVelocity(), theEcorePackage.getEDouble(), "actualAngularVelocity", null, 0, 1, SkidSteeredMobilePlateform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSkidSteeredMobilePlateform_CommandedTranslationVelocity(), theEcorePackage.getEDouble(), "commandedTranslationVelocity", null, 0, 1, SkidSteeredMobilePlateform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSkidSteeredMobilePlateform_ActualTranslationVelocity(), theEcorePackage.getEDouble(), "actualTranslationVelocity", null, 0, 1, SkidSteeredMobilePlateform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSkidSteeredMobilePlateform_EffectiveSteeringWidth(), theEcorePackage.getEDouble(), "effectiveSteeringWidth", "0.5", 0, 1, SkidSteeredMobilePlateform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(mobilePlateformStatusEEnum, MobilePlateformStatus.class, "MobilePlateformStatus");
		addEEnumLiteral(mobilePlateformStatusEEnum, MobilePlateformStatus.OFF);
		addEEnumLiteral(mobilePlateformStatusEEnum, MobilePlateformStatus.READY);
		addEEnumLiteral(mobilePlateformStatusEEnum, MobilePlateformStatus.BUSY);
		addEEnumLiteral(mobilePlateformStatusEEnum, MobilePlateformStatus.FAILED);

		// Create resource
		createResource(eNS_URI);
	}

} //MobilityPackageImpl
