/**
 * Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015
 */
package org.eclipse.symphony.examples.rover.symphony.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.symphony.core.Symphony__CorePackage;
import org.eclipse.symphony.examples.rover.symphony.RoverData;
import org.eclipse.symphony.examples.rover.symphony.RoverSymphonySystemApiAdapter;
import org.eclipse.symphony.examples.rover.symphony.Symphony__ExamplesRoverSymphonyFactory;
import org.eclipse.symphony.examples.rover.symphony.Symphony__ExamplesRoverSymphonyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Symphony__ExamplesRoverSymphonyPackageImpl extends EPackageImpl implements Symphony__ExamplesRoverSymphonyPackage
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
	 * @see org.eclipse.symphony.examples.rover.symphony.Symphony__ExamplesRoverSymphonyPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
  private Symphony__ExamplesRoverSymphonyPackageImpl()
  {
		super(eNS_URI, Symphony__ExamplesRoverSymphonyFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Symphony__ExamplesRoverSymphonyPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
  public static Symphony__ExamplesRoverSymphonyPackage init()
  {
		if (isInited) return (Symphony__ExamplesRoverSymphonyPackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__ExamplesRoverSymphonyPackage.eNS_URI);

		// Obtain or create and register package
		Symphony__ExamplesRoverSymphonyPackageImpl theSymphony__ExamplesRoverSymphonyPackage = (Symphony__ExamplesRoverSymphonyPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Symphony__ExamplesRoverSymphonyPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Symphony__ExamplesRoverSymphonyPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		Symphony__CorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSymphony__ExamplesRoverSymphonyPackage.createPackageContents();

		// Initialize created meta-data
		theSymphony__ExamplesRoverSymphonyPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSymphony__ExamplesRoverSymphonyPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Symphony__ExamplesRoverSymphonyPackage.eNS_URI, theSymphony__ExamplesRoverSymphonyPackage);
		return theSymphony__ExamplesRoverSymphonyPackage;
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
	public Symphony__ExamplesRoverSymphonyFactory getSymphony__ExamplesRoverSymphonyFactory() {
		return (Symphony__ExamplesRoverSymphonyFactory)getEFactoryInstance();
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
		Symphony__CorePackage theSymphony__CorePackage = (Symphony__CorePackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__CorePackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		roverSymphonySystemApiAdapterEClass.getESuperTypes().add(theSymphony__CorePackage.getSymphonySystemApiAdapter());
		roverDataEClass.getESuperTypes().add(theSymphony__CorePackage.getSymphonyInitializationData());

		// Initialize classes, features, and operations; add parameters
		initEClass(roverSymphonySystemApiAdapterEClass, RoverSymphonySystemApiAdapter.class, "RoverSymphonySystemApiAdapter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(roverDataEClass, RoverData.class, "RoverData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoverData_Initialized(), theEcorePackage.getEBoolean(), "initialized", "false", 0, 1, RoverData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoverData_Disposed(), theEcorePackage.getEBoolean(), "disposed", "false", 0, 1, RoverData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Symphony__ExamplesRoverSymphonyPackageImpl
