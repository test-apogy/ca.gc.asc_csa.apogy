/**
 * Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015
 */
package ca.gc.asc_csa.symphony.examples.rover.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import ca.gc.asc_csa.symphony.core.SymphonyCorePackage;
import ca.gc.asc_csa.symphony.examples.rover.RoverData;
import ca.gc.asc_csa.symphony.examples.rover.RoverSymphonySystemApiAdapter;
import ca.gc.asc_csa.symphony.examples.rover.SymphonyExampleRoverFactory;
import ca.gc.asc_csa.symphony.examples.rover.SymphonyExampleRoverPackage;
import org.eclipse.emf.ecore.EAttribute;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SymphonyExampleRoverPackageImpl extends EPackageImpl implements SymphonyExampleRoverPackage
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass roverSymphonySystemApiAdapterEClass = null;

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roverDataEClass = null;

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
	 * @see ca.gc.asc_csa.symphony.examples.rover.SymphonyExampleRoverPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
  private SymphonyExampleRoverPackageImpl()
  {
		super(eNS_URI, SymphonyExampleRoverFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SymphonyExampleRoverPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
  public static SymphonyExampleRoverPackage init()
  {
		if (isInited) return (SymphonyExampleRoverPackage)EPackage.Registry.INSTANCE.getEPackage(SymphonyExampleRoverPackage.eNS_URI);

		// Obtain or create and register package
		SymphonyExampleRoverPackageImpl theSymphonyExampleRoverPackage = (SymphonyExampleRoverPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SymphonyExampleRoverPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SymphonyExampleRoverPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SymphonyCorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSymphonyExampleRoverPackage.createPackageContents();

		// Initialize created meta-data
		theSymphonyExampleRoverPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSymphonyExampleRoverPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SymphonyExampleRoverPackage.eNS_URI, theSymphonyExampleRoverPackage);
		return theSymphonyExampleRoverPackage;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getRoverSymphonySystemApiAdapter()
  {
		return roverSymphonySystemApiAdapterEClass;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoverData() {
		return roverDataEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoverData_Initialized() {
		return (EAttribute)roverDataEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoverData_Disposed() {
		return (EAttribute)roverDataEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SymphonyExampleRoverFactory getSymphonyExampleRoverFactory()
  {
		return (SymphonyExampleRoverFactory)getEFactoryInstance();
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
		roverSymphonySystemApiAdapterEClass = createEClass(ROVER_SYMPHONY_SYSTEM_API_ADAPTER);

		roverDataEClass = createEClass(ROVER_DATA);
		createEAttribute(roverDataEClass, ROVER_DATA__INITIALIZED);
		createEAttribute(roverDataEClass, ROVER_DATA__DISPOSED);
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
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		roverSymphonySystemApiAdapterEClass.getESuperTypes().add(theSymphonyCorePackage.getSymphonySystemApiAdapter());
		roverDataEClass.getESuperTypes().add(theSymphonyCorePackage.getSymphonyInitializationData());

		// Initialize classes, features, and operations; add parameters
		initEClass(roverSymphonySystemApiAdapterEClass, RoverSymphonySystemApiAdapter.class, "RoverSymphonySystemApiAdapter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(roverDataEClass, RoverData.class, "RoverData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoverData_Initialized(), theEcorePackage.getEBoolean(), "initialized", "false", 0, 1, RoverData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoverData_Disposed(), theEcorePackage.getEBoolean(), "disposed", "false", 0, 1, RoverData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SymphonyExampleRoverPackageImpl
