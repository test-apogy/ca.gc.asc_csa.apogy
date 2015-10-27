/**
 * Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015
 */
package org.eclipse.symphony.examples.lander.symphony.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.symphony.core.Symphony__CorePackage;
import org.eclipse.symphony.examples.lander.Symphony__ExamplesLanderPackage;
import org.eclipse.symphony.examples.lander.symphony.LanderData;
import org.eclipse.symphony.examples.lander.symphony.LanderSymphonySystemApiAdapter;
import org.eclipse.symphony.examples.lander.symphony.Symphony__ExamplesLanderSymphonyFactory;
import org.eclipse.symphony.examples.lander.symphony.Symphony__ExamplesLanderSymphonyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Symphony__ExamplesLanderSymphonyPackageImpl extends EPackageImpl implements Symphony__ExamplesLanderSymphonyPackage
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass landerSymphonySystemApiAdapterEClass = null;

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass landerDataEClass = null;

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
	 * @see org.eclipse.symphony.examples.lander.symphony.Symphony__ExamplesLanderSymphonyPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
  private Symphony__ExamplesLanderSymphonyPackageImpl()
  {
		super(eNS_URI, Symphony__ExamplesLanderSymphonyFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Symphony__ExamplesLanderSymphonyPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
  public static Symphony__ExamplesLanderSymphonyPackage init()
  {
		if (isInited) return (Symphony__ExamplesLanderSymphonyPackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__ExamplesLanderSymphonyPackage.eNS_URI);

		// Obtain or create and register package
		Symphony__ExamplesLanderSymphonyPackageImpl theSymphony__ExamplesLanderSymphonyPackage = (Symphony__ExamplesLanderSymphonyPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Symphony__ExamplesLanderSymphonyPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Symphony__ExamplesLanderSymphonyPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		Symphony__ExamplesLanderPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSymphony__ExamplesLanderSymphonyPackage.createPackageContents();

		// Initialize created meta-data
		theSymphony__ExamplesLanderSymphonyPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSymphony__ExamplesLanderSymphonyPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Symphony__ExamplesLanderSymphonyPackage.eNS_URI, theSymphony__ExamplesLanderSymphonyPackage);
		return theSymphony__ExamplesLanderSymphonyPackage;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getLanderSymphonySystemApiAdapter()
  {
		return landerSymphonySystemApiAdapterEClass;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLanderData() {
		return landerDataEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLanderData_Initialized() {
		return (EAttribute)landerDataEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLanderData_Disposed() {
		return (EAttribute)landerDataEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLanderData_FlyingEnabled() {
		return (EAttribute)landerDataEClass.getEStructuralFeatures().get(2);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLanderData_LegAExtension() {
		return (EAttribute)landerDataEClass.getEStructuralFeatures().get(3);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLanderData_LegBExtension() {
		return (EAttribute)landerDataEClass.getEStructuralFeatures().get(4);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLanderData_LegCExtension() {
		return (EAttribute)landerDataEClass.getEStructuralFeatures().get(5);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLanderData_CurrThrustLevel() {
		return (EAttribute)landerDataEClass.getEStructuralFeatures().get(6);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLanderData_MinThrustLevel() {
		return (EAttribute)landerDataEClass.getEStructuralFeatures().get(7);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLanderData_MaxThrustLevel() {
		return (EAttribute)landerDataEClass.getEStructuralFeatures().get(8);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLanderData_XAngularVelocity() {
		return (EAttribute)landerDataEClass.getEStructuralFeatures().get(9);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLanderData_YAngularVelocity() {
		return (EAttribute)landerDataEClass.getEStructuralFeatures().get(10);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__ExamplesLanderSymphonyFactory getSymphony__ExamplesLanderSymphonyFactory() {
		return (Symphony__ExamplesLanderSymphonyFactory)getEFactoryInstance();
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
  public void createPackageContents()
  {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		landerSymphonySystemApiAdapterEClass = createEClass(LANDER_SYMPHONY_SYSTEM_API_ADAPTER);

		landerDataEClass = createEClass(LANDER_DATA);
		createEAttribute(landerDataEClass, LANDER_DATA__INITIALIZED);
		createEAttribute(landerDataEClass, LANDER_DATA__DISPOSED);
		createEAttribute(landerDataEClass, LANDER_DATA__FLYING_ENABLED);
		createEAttribute(landerDataEClass, LANDER_DATA__LEG_AEXTENSION);
		createEAttribute(landerDataEClass, LANDER_DATA__LEG_BEXTENSION);
		createEAttribute(landerDataEClass, LANDER_DATA__LEG_CEXTENSION);
		createEAttribute(landerDataEClass, LANDER_DATA__CURR_THRUST_LEVEL);
		createEAttribute(landerDataEClass, LANDER_DATA__MIN_THRUST_LEVEL);
		createEAttribute(landerDataEClass, LANDER_DATA__MAX_THRUST_LEVEL);
		createEAttribute(landerDataEClass, LANDER_DATA__XANGULAR_VELOCITY);
		createEAttribute(landerDataEClass, LANDER_DATA__YANGULAR_VELOCITY);
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
  public void initializePackageContents()
  {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		Symphony__CorePackage theSymphony__CorePackage = (Symphony__CorePackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__CorePackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		Symphony__ExamplesLanderPackage theSymphony__ExamplesLanderPackage = (Symphony__ExamplesLanderPackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__ExamplesLanderPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		landerSymphonySystemApiAdapterEClass.getESuperTypes().add(theSymphony__CorePackage.getSymphonySystemApiAdapter());
		landerDataEClass.getESuperTypes().add(theSymphony__CorePackage.getSymphonyInitializationData());

		// Initialize classes, features, and operations; add parameters
		initEClass(landerSymphonySystemApiAdapterEClass, LanderSymphonySystemApiAdapter.class, "LanderSymphonySystemApiAdapter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(landerDataEClass, LanderData.class, "LanderData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLanderData_Initialized(), theEcorePackage.getEBoolean(), "initialized", "false", 0, 1, LanderData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLanderData_Disposed(), theEcorePackage.getEBoolean(), "disposed", "false", 0, 1, LanderData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLanderData_FlyingEnabled(), theEcorePackage.getEBoolean(), "flyingEnabled", "false", 0, 1, LanderData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLanderData_LegAExtension(), theSymphony__ExamplesLanderPackage.getLanderLegExtension(), "legAExtension", null, 0, 1, LanderData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLanderData_LegBExtension(), theSymphony__ExamplesLanderPackage.getLanderLegExtension(), "legBExtension", null, 0, 1, LanderData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLanderData_LegCExtension(), theSymphony__ExamplesLanderPackage.getLanderLegExtension(), "legCExtension", null, 0, 1, LanderData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLanderData_CurrThrustLevel(), theEcorePackage.getEDouble(), "currThrustLevel", "0.0", 0, 1, LanderData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLanderData_MinThrustLevel(), theEcorePackage.getEDouble(), "minThrustLevel", "0.0", 0, 1, LanderData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLanderData_MaxThrustLevel(), theEcorePackage.getEDouble(), "maxThrustLevel", "0.0", 0, 1, LanderData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLanderData_XAngularVelocity(), theEcorePackage.getEDouble(), "xAngularVelocity", "0.0", 0, 1, LanderData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLanderData_YAngularVelocity(), theEcorePackage.getEDouble(), "yAngularVelocity", "0.0", 0, 1, LanderData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Symphony__ExamplesLanderSymphonyPackageImpl
