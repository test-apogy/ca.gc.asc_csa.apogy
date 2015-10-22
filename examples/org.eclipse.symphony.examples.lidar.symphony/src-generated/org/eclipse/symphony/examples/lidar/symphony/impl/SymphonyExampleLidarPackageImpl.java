/**
 * Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015
 */
package org.eclipse.symphony.examples.lidar.symphony.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.symphony.addons.sensors.fov.FovPackage;
import org.eclipse.symphony.core.SymphonyCorePackage;
import org.eclipse.symphony.examples.lidar.symphony.LidarData;
import org.eclipse.symphony.examples.lidar.symphony.LidarSymphonySystemApiAdapter;
import org.eclipse.symphony.examples.lidar.symphony.SymphonyExampleLidarFactory;
import org.eclipse.symphony.examples.lidar.symphony.SymphonyExampleLidarPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SymphonyExampleLidarPackageImpl extends EPackageImpl implements SymphonyExampleLidarPackage
{
  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lidarSymphonySystemApiAdapterEClass = null;
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
	 * @see org.eclipse.symphony.examples.lidar.symphony.SymphonyExampleLidarPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
  private SymphonyExampleLidarPackageImpl()
  {
		super(eNS_URI, SymphonyExampleLidarFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SymphonyExampleLidarPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
  public static SymphonyExampleLidarPackage init()
  {
		if (isInited) return (SymphonyExampleLidarPackage)EPackage.Registry.INSTANCE.getEPackage(SymphonyExampleLidarPackage.eNS_URI);

		// Obtain or create and register package
		SymphonyExampleLidarPackageImpl theSymphonyExampleLidarPackage = (SymphonyExampleLidarPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SymphonyExampleLidarPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SymphonyExampleLidarPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		FovPackage.eINSTANCE.eClass();
		SymphonyCorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSymphonyExampleLidarPackage.createPackageContents();

		// Initialize created meta-data
		theSymphonyExampleLidarPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSymphonyExampleLidarPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SymphonyExampleLidarPackage.eNS_URI, theSymphonyExampleLidarPackage);
		return theSymphonyExampleLidarPackage;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLidarSymphonySystemApiAdapter() {
		return lidarSymphonySystemApiAdapterEClass;
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
  public SymphonyExampleLidarFactory getSymphonyExampleLidarFactory()
  {
		return (SymphonyExampleLidarFactory)getEFactoryInstance();
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
		lidarSymphonySystemApiAdapterEClass = createEClass(LIDAR_SYMPHONY_SYSTEM_API_ADAPTER);

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
		SymphonyCorePackage theSymphonyCorePackage = (SymphonyCorePackage)EPackage.Registry.INSTANCE.getEPackage(SymphonyCorePackage.eNS_URI);
		FovPackage theFovPackage = (FovPackage)EPackage.Registry.INSTANCE.getEPackage(FovPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		lidarSymphonySystemApiAdapterEClass.getESuperTypes().add(theSymphonyCorePackage.getSymphonySystemApiAdapter());
		lidarDataEClass.getESuperTypes().add(theSymphonyCorePackage.getSymphonyInitializationData());

		// Initialize classes, features, and operations; add parameters
		initEClass(lidarSymphonySystemApiAdapterEClass, LidarSymphonySystemApiAdapter.class, "LidarSymphonySystemApiAdapter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lidarDataEClass, LidarData.class, "LidarData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLidarData_Fov(), theFovPackage.getRectangularFrustrumFieldOfView(), null, "fov", null, 1, 1, LidarData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLidarData_Initialized(), theEcorePackage.getEBoolean(), "initialized", "false", 0, 1, LidarData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SymphonyExampleLidarPackageImpl
