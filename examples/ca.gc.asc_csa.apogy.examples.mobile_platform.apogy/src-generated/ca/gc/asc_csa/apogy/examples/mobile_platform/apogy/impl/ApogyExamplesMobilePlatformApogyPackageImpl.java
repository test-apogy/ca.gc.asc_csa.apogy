/**
 * Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015
 */
package ca.gc.asc_csa.apogy.examples.mobile_platform.apogy.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.EAttribute;
import ca.gc.asc_csa.apogy.core.ApogyCorePackage;
import ca.gc.asc_csa.apogy.core.environment.ui.ApogyCoreEnvironmentUIPackage;
import ca.gc.asc_csa.apogy.examples.mobile_platform.apogy.MobilePlatformData;
import ca.gc.asc_csa.apogy.examples.mobile_platform.apogy.MobilePlatformApogySystemAnnotation;
import ca.gc.asc_csa.apogy.examples.mobile_platform.apogy.MobilePlatformApogySystemApiAdapter;
import ca.gc.asc_csa.apogy.examples.mobile_platform.apogy.ApogyExamplesMobilePlatformApogyFactory;
import ca.gc.asc_csa.apogy.examples.mobile_platform.apogy.ApogyExamplesMobilePlatformApogyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyExamplesMobilePlatformApogyPackageImpl extends EPackageImpl implements ApogyExamplesMobilePlatformApogyPackage
{
  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mobilePlatformApogySystemApiAdapterEClass = null;
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
	private EClass mobilePlatformApogySystemAnnotationEClass = null;
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
	 * @see ca.gc.asc_csa.apogy.examples.mobile_platform.apogy.ApogyExamplesMobilePlatformApogyPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
  private ApogyExamplesMobilePlatformApogyPackageImpl()
  {
		super(eNS_URI, ApogyExamplesMobilePlatformApogyFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ApogyExamplesMobilePlatformApogyPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
  public static ApogyExamplesMobilePlatformApogyPackage init()
  {
		if (isInited) return (ApogyExamplesMobilePlatformApogyPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyExamplesMobilePlatformApogyPackage.eNS_URI);

		// Obtain or create and register package
		ApogyExamplesMobilePlatformApogyPackageImpl theApogyExamplesMobilePlatformApogyPackage = (ApogyExamplesMobilePlatformApogyPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ApogyExamplesMobilePlatformApogyPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ApogyExamplesMobilePlatformApogyPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ApogyCoreEnvironmentUIPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theApogyExamplesMobilePlatformApogyPackage.createPackageContents();

		// Initialize created meta-data
		theApogyExamplesMobilePlatformApogyPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theApogyExamplesMobilePlatformApogyPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ApogyExamplesMobilePlatformApogyPackage.eNS_URI, theApogyExamplesMobilePlatformApogyPackage);
		return theApogyExamplesMobilePlatformApogyPackage;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMobilePlatformApogySystemApiAdapter() {
		return mobilePlatformApogySystemApiAdapterEClass;
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
	public EClass getMobilePlatformApogySystemAnnotation() {
		return mobilePlatformApogySystemAnnotationEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyExamplesMobilePlatformApogyFactory getApogyExamplesMobilePlatformApogyFactory() {
		return (ApogyExamplesMobilePlatformApogyFactory)getEFactoryInstance();
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
		mobilePlatformApogySystemApiAdapterEClass = createEClass(MOBILE_PLATFORM_APOGY_SYSTEM_API_ADAPTER);

		mobilePlatformDataEClass = createEClass(MOBILE_PLATFORM_DATA);
		createEAttribute(mobilePlatformDataEClass, MOBILE_PLATFORM_DATA__INITIALIZED);
		createEAttribute(mobilePlatformDataEClass, MOBILE_PLATFORM_DATA__DISPOSED);
		createEAttribute(mobilePlatformDataEClass, MOBILE_PLATFORM_DATA__LINEAR_VELOCITY);
		createEAttribute(mobilePlatformDataEClass, MOBILE_PLATFORM_DATA__ANGULAR_VELOCITY);

		mobilePlatformApogySystemAnnotationEClass = createEClass(MOBILE_PLATFORM_APOGY_SYSTEM_ANNOTATION);
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
		ApogyCorePackage theApogyCorePackage = (ApogyCorePackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCorePackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		ApogyCoreEnvironmentUIPackage theApogyCoreEnvironmentUIPackage = (ApogyCoreEnvironmentUIPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCoreEnvironmentUIPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		mobilePlatformApogySystemApiAdapterEClass.getESuperTypes().add(theApogyCorePackage.getApogySystemApiAdapter());
		mobilePlatformDataEClass.getESuperTypes().add(theApogyCorePackage.getApogyInitializationData());
		mobilePlatformApogySystemAnnotationEClass.getESuperTypes().add(theApogyCoreEnvironmentUIPackage.getPoseVariableAnnotation());

		// Initialize classes, features, and operations; add parameters
		initEClass(mobilePlatformApogySystemApiAdapterEClass, MobilePlatformApogySystemApiAdapter.class, "MobilePlatformApogySystemApiAdapter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mobilePlatformDataEClass, MobilePlatformData.class, "MobilePlatformData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMobilePlatformData_Initialized(), theEcorePackage.getEBoolean(), "initialized", "false", 0, 1, MobilePlatformData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobilePlatformData_Disposed(), theEcorePackage.getEBoolean(), "disposed", "false", 0, 1, MobilePlatformData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobilePlatformData_LinearVelocity(), theEcorePackage.getEDouble(), "linearVelocity", "0.0", 0, 1, MobilePlatformData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobilePlatformData_AngularVelocity(), theEcorePackage.getEDouble(), "angularVelocity", "0.0", 0, 1, MobilePlatformData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mobilePlatformApogySystemAnnotationEClass, MobilePlatformApogySystemAnnotation.class, "MobilePlatformApogySystemAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ApogyExamplesMobilePlatformApogyPackageImpl
