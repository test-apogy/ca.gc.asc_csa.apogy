/**
 * <copyright>
 * </copyright>
 *
 * $Id: PersistencePackageImpl.java,v 1.3.4.2 2015/05/21 15:51:05 pallard Exp $
 */
package ca.gc.space.mrt.geometry.data3d.persistence.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import ca.gc.space.mrt.geometry.data3d.Data3dPackage;
import ca.gc.space.mrt.geometry.data3d.persistence.CartesianCoordinatesSetSource;
import ca.gc.space.mrt.geometry.data3d.persistence.FileCartesianCoordinatesSetSource;
import ca.gc.space.mrt.geometry.data3d.persistence.MemoryCartesianCoordinatesSetSource;
import ca.gc.space.mrt.geometry.data3d.persistence.PersistenceFacade;
import ca.gc.space.mrt.geometry.data3d.persistence.PersistenceFactory;
import ca.gc.space.mrt.geometry.data3d.persistence.PersistencePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PersistencePackageImpl extends EPackageImpl implements PersistencePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cartesianCoordinatesSetSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memoryCartesianCoordinatesSetSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileCartesianCoordinatesSetSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass persistenceFacadeEClass = null;

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
	 * @see ca.gc.space.mrt.geometry.data3d.persistence.PersistencePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PersistencePackageImpl() {
		super(eNS_URI, PersistenceFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PersistencePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PersistencePackage init() {
		if (isInited) return (PersistencePackage)EPackage.Registry.INSTANCE.getEPackage(PersistencePackage.eNS_URI);

		// Obtain or create and register package
		PersistencePackageImpl thePersistencePackage = (PersistencePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PersistencePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PersistencePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		Data3dPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thePersistencePackage.createPackageContents();

		// Initialize created meta-data
		thePersistencePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePersistencePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PersistencePackage.eNS_URI, thePersistencePackage);
		return thePersistencePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCartesianCoordinatesSetSource() {
		return cartesianCoordinatesSetSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCartesianCoordinatesSetSource_DataSet() {
		return (EReference)cartesianCoordinatesSetSourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMemoryCartesianCoordinatesSetSource() {
		return memoryCartesianCoordinatesSetSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMemoryCartesianCoordinatesSetSource_InternalDataSet() {
		return (EReference)memoryCartesianCoordinatesSetSourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileCartesianCoordinatesSetSource() {
		return fileCartesianCoordinatesSetSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileCartesianCoordinatesSetSource_FileName() {
		return (EAttribute)fileCartesianCoordinatesSetSourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersistenceFacade() {
		return persistenceFacadeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersistenceFactory getPersistenceFactory() {
		return (PersistenceFactory)getEFactoryInstance();
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
		cartesianCoordinatesSetSourceEClass = createEClass(CARTESIAN_COORDINATES_SET_SOURCE);
		createEReference(cartesianCoordinatesSetSourceEClass, CARTESIAN_COORDINATES_SET_SOURCE__DATA_SET);

		memoryCartesianCoordinatesSetSourceEClass = createEClass(MEMORY_CARTESIAN_COORDINATES_SET_SOURCE);
		createEReference(memoryCartesianCoordinatesSetSourceEClass, MEMORY_CARTESIAN_COORDINATES_SET_SOURCE__INTERNAL_DATA_SET);

		fileCartesianCoordinatesSetSourceEClass = createEClass(FILE_CARTESIAN_COORDINATES_SET_SOURCE);
		createEAttribute(fileCartesianCoordinatesSetSourceEClass, FILE_CARTESIAN_COORDINATES_SET_SOURCE__FILE_NAME);

		persistenceFacadeEClass = createEClass(PERSISTENCE_FACADE);
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
		Data3dPackage theData3dPackage = (Data3dPackage)EPackage.Registry.INSTANCE.getEPackage(Data3dPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		memoryCartesianCoordinatesSetSourceEClass.getESuperTypes().add(this.getCartesianCoordinatesSetSource());
		fileCartesianCoordinatesSetSourceEClass.getESuperTypes().add(this.getCartesianCoordinatesSetSource());

		// Initialize classes and features; add operations and parameters
		initEClass(cartesianCoordinatesSetSourceEClass, CartesianCoordinatesSetSource.class, "CartesianCoordinatesSetSource", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCartesianCoordinatesSetSource_DataSet(), theData3dPackage.getCartesianCoordinatesSet(), null, "dataSet", null, 0, 1, CartesianCoordinatesSetSource.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(memoryCartesianCoordinatesSetSourceEClass, MemoryCartesianCoordinatesSetSource.class, "MemoryCartesianCoordinatesSetSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMemoryCartesianCoordinatesSetSource_InternalDataSet(), theData3dPackage.getCartesianCoordinatesSet(), null, "internalDataSet", null, 0, 1, MemoryCartesianCoordinatesSetSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fileCartesianCoordinatesSetSourceEClass, FileCartesianCoordinatesSetSource.class, "FileCartesianCoordinatesSetSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFileCartesianCoordinatesSetSource_FileName(), theEcorePackage.getEString(), "fileName", null, 0, 1, FileCartesianCoordinatesSetSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(persistenceFacadeEClass, PersistenceFacade.class, "PersistenceFacade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(persistenceFacadeEClass, this.getFileCartesianCoordinatesSetSource(), "createFileCartesianCoordinatesSetSource", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "fileName", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(persistenceFacadeEClass, this.getMemoryCartesianCoordinatesSetSource(), "createMemoryCoordinatesSetSource", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theData3dPackage.getCartesianCoordinatesSet(), "dataSet", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //PersistencePackageImpl
