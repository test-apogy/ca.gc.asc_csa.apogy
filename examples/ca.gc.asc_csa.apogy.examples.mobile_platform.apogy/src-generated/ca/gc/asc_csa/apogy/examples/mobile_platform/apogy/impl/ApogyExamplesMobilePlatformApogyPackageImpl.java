/**
 * Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015
 */
package org.eclipse.symphony.examples.mobile_platform.symphony.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.symphony.core.Symphony__CorePackage;
import org.eclipse.symphony.core.environment.ui.Symphony__CoreEnvironmentUIPackage;
import org.eclipse.symphony.examples.mobile_platform.symphony.MobilePlatformData;
import org.eclipse.symphony.examples.mobile_platform.symphony.MobilePlatformSymphonySystemAnnotation;
import org.eclipse.symphony.examples.mobile_platform.symphony.MobilePlatformSymphonySystemApiAdapter;
import org.eclipse.symphony.examples.mobile_platform.symphony.Symphony__ExamplesMobilePlatformSymphonyFactory;
import org.eclipse.symphony.examples.mobile_platform.symphony.Symphony__ExamplesMobilePlatformSymphonyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Symphony__ExamplesMobilePlatformSymphonyPackageImpl extends EPackageImpl implements Symphony__ExamplesMobilePlatformSymphonyPackage
{
  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mobilePlatformSymphonySystemApiAdapterEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mobilePlatformDataEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mobilePlatformSymphonySystemAnnotationEClass = null;
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
	 * @see org.eclipse.symphony.examples.mobile_platform.symphony.Symphony__ExamplesMobilePlatformSymphonyPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
  private Symphony__ExamplesMobilePlatformSymphonyPackageImpl()
  {
		super(eNS_URI, Symphony__ExamplesMobilePlatformSymphonyFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Symphony__ExamplesMobilePlatformSymphonyPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
  public static Symphony__ExamplesMobilePlatformSymphonyPackage init()
  {
		if (isInited) return (Symphony__ExamplesMobilePlatformSymphonyPackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__ExamplesMobilePlatformSymphonyPackage.eNS_URI);

		// Obtain or create and register package
		Symphony__ExamplesMobilePlatformSymphonyPackageImpl theSymphony__ExamplesMobilePlatformSymphonyPackage = (Symphony__ExamplesMobilePlatformSymphonyPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Symphony__ExamplesMobilePlatformSymphonyPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Symphony__ExamplesMobilePlatformSymphonyPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		Symphony__CoreEnvironmentUIPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSymphony__ExamplesMobilePlatformSymphonyPackage.createPackageContents();

		// Initialize created meta-data
		theSymphony__ExamplesMobilePlatformSymphonyPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSymphony__ExamplesMobilePlatformSymphonyPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Symphony__ExamplesMobilePlatformSymphonyPackage.eNS_URI, theSymphony__ExamplesMobilePlatformSymphonyPackage);
		return theSymphony__ExamplesMobilePlatformSymphonyPackage;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMobilePlatformSymphonySystemApiAdapter() {
		return mobilePlatformSymphonySystemApiAdapterEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMobilePlatformData() {
		return mobilePlatformDataEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobilePlatformData_Initialized() {
		return (EAttribute)mobilePlatformDataEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobilePlatformData_Disposed() {
		return (EAttribute)mobilePlatformDataEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobilePlatformData_LinearVelocity() {
		return (EAttribute)mobilePlatformDataEClass.getEStructuralFeatures().get(2);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobilePlatformData_AngularVelocity() {
		return (EAttribute)mobilePlatformDataEClass.getEStructuralFeatures().get(3);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMobilePlatformSymphonySystemAnnotation() {
		return mobilePlatformSymphonySystemAnnotationEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__ExamplesMobilePlatformSymphonyFactory getSymphony__ExamplesMobilePlatformSymphonyFactory() {
		return (Symphony__ExamplesMobilePlatformSymphonyFactory)getEFactoryInstance();
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
		mobilePlatformSymphonySystemApiAdapterEClass = createEClass(MOBILE_PLATFORM_SYMPHONY_SYSTEM_API_ADAPTER);

		mobilePlatformDataEClass = createEClass(MOBILE_PLATFORM_DATA);
		createEAttribute(mobilePlatformDataEClass, MOBILE_PLATFORM_DATA__INITIALIZED);
		createEAttribute(mobilePlatformDataEClass, MOBILE_PLATFORM_DATA__DISPOSED);
		createEAttribute(mobilePlatformDataEClass, MOBILE_PLATFORM_DATA__LINEAR_VELOCITY);
		createEAttribute(mobilePlatformDataEClass, MOBILE_PLATFORM_DATA__ANGULAR_VELOCITY);

		mobilePlatformSymphonySystemAnnotationEClass = createEClass(MOBILE_PLATFORM_SYMPHONY_SYSTEM_ANNOTATION);
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
		Symphony__CoreEnvironmentUIPackage theSymphony__CoreEnvironmentUIPackage = (Symphony__CoreEnvironmentUIPackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__CoreEnvironmentUIPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		mobilePlatformSymphonySystemApiAdapterEClass.getESuperTypes().add(theSymphony__CorePackage.getSymphonySystemApiAdapter());
		mobilePlatformDataEClass.getESuperTypes().add(theSymphony__CorePackage.getSymphonyInitializationData());
		mobilePlatformSymphonySystemAnnotationEClass.getESuperTypes().add(theSymphony__CoreEnvironmentUIPackage.getPoseVariableAnnotation());

		// Initialize classes, features, and operations; add parameters
		initEClass(mobilePlatformSymphonySystemApiAdapterEClass, MobilePlatformSymphonySystemApiAdapter.class, "MobilePlatformSymphonySystemApiAdapter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mobilePlatformDataEClass, MobilePlatformData.class, "MobilePlatformData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMobilePlatformData_Initialized(), theEcorePackage.getEBoolean(), "initialized", "false", 0, 1, MobilePlatformData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobilePlatformData_Disposed(), theEcorePackage.getEBoolean(), "disposed", "false", 0, 1, MobilePlatformData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobilePlatformData_LinearVelocity(), theEcorePackage.getEDouble(), "linearVelocity", "0.0", 0, 1, MobilePlatformData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobilePlatformData_AngularVelocity(), theEcorePackage.getEDouble(), "angularVelocity", "0.0", 0, 1, MobilePlatformData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mobilePlatformSymphonySystemAnnotationEClass, MobilePlatformSymphonySystemAnnotation.class, "MobilePlatformSymphonySystemAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //Symphony__ExamplesMobilePlatformSymphonyPackageImpl
