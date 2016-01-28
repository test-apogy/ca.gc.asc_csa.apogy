/**
 * Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015
 */
package ca.gc.asc_csa.apogy.examples.lidar.apogy.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import ca.gc.asc_csa.apogy.addons.sensors.fov.ApogyAddonsSensorsFOVPackage;
import ca.gc.asc_csa.apogy.core.ApogyCorePackage;
import ca.gc.asc_csa.apogy.examples.lidar.apogy.LidarData;
import ca.gc.asc_csa.apogy.examples.lidar.apogy.LidarApogySystemApiAdapter;
import ca.gc.asc_csa.apogy.examples.lidar.apogy.ApogyExamplesLidarApogyFactory;
import ca.gc.asc_csa.apogy.examples.lidar.apogy.ApogyExamplesLidarApogyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyExamplesLidarApogyPackageImpl extends EPackageImpl implements ApogyExamplesLidarApogyPackage
{
  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lidarApogySystemApiAdapterEClass = null;
		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lidarDataEClass = null;
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
	 * @see ca.gc.asc_csa.apogy.examples.lidar.apogy.ApogyExamplesLidarApogyPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
  private ApogyExamplesLidarApogyPackageImpl()
  {
		super(eNS_URI, ApogyExamplesLidarApogyFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ApogyExamplesLidarApogyPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
  public static ApogyExamplesLidarApogyPackage init()
  {
		if (isInited) return (ApogyExamplesLidarApogyPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyExamplesLidarApogyPackage.eNS_URI);

		// Obtain or create and register package
		ApogyExamplesLidarApogyPackageImpl theApogyExamplesLidarApogyPackage = (ApogyExamplesLidarApogyPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ApogyExamplesLidarApogyPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ApogyExamplesLidarApogyPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ApogyCorePackage.eINSTANCE.eClass();
		ApogyAddonsSensorsFOVPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theApogyExamplesLidarApogyPackage.createPackageContents();

		// Initialize created meta-data
		theApogyExamplesLidarApogyPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theApogyExamplesLidarApogyPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ApogyExamplesLidarApogyPackage.eNS_URI, theApogyExamplesLidarApogyPackage);
		return theApogyExamplesLidarApogyPackage;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLidarApogySystemApiAdapter() {
		return lidarApogySystemApiAdapterEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLidarData() {
		return lidarDataEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLidarData_Fov() {
		return (EReference)lidarDataEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLidarData_Initialized() {
		return (EAttribute)lidarDataEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyExamplesLidarApogyFactory getApogyExamplesLidarApogyFactory() {
		return (ApogyExamplesLidarApogyFactory)getEFactoryInstance();
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
		lidarApogySystemApiAdapterEClass = createEClass(LIDAR_APOGY_SYSTEM_API_ADAPTER);

		lidarDataEClass = createEClass(LIDAR_DATA);
		createEReference(lidarDataEClass, LIDAR_DATA__FOV);
		createEAttribute(lidarDataEClass, LIDAR_DATA__INITIALIZED);
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
		ApogyAddonsSensorsFOVPackage theApogyAddonsSensorsFOVPackage = (ApogyAddonsSensorsFOVPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyAddonsSensorsFOVPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		lidarApogySystemApiAdapterEClass.getESuperTypes().add(theApogyCorePackage.getApogySystemApiAdapter());
		lidarDataEClass.getESuperTypes().add(theApogyCorePackage.getApogyInitializationData());

		// Initialize classes, features, and operations; add parameters
		initEClass(lidarApogySystemApiAdapterEClass, LidarApogySystemApiAdapter.class, "LidarApogySystemApiAdapter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lidarDataEClass, LidarData.class, "LidarData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLidarData_Fov(), theApogyAddonsSensorsFOVPackage.getRectangularFrustrumFieldOfView(), null, "fov", null, 1, 1, LidarData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLidarData_Initialized(), theEcorePackage.getEBoolean(), "initialized", "false", 0, 1, LidarData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ApogyExamplesLidarApogyPackageImpl
