/**
 * Canadian Space Agency / Agence spatiale canadienne 2016 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.addons.ros.paths.impl;

import ca.gc.asc_csa.apogy.addons.geometry.paths.ApogyAddonsGeometryPathsPackage;

import ca.gc.asc_csa.apogy.addons.ros.paths.ApogyAddonsROSPathFacade;
import ca.gc.asc_csa.apogy.addons.ros.paths.ApogyAddonsROSPathsFactory;
import ca.gc.asc_csa.apogy.addons.ros.paths.ApogyAddonsROSPathsPackage;

import nav_msgs.Path;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.ros.message.MessageFactory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyAddonsROSPathsPackageImpl extends EPackageImpl implements ApogyAddonsROSPathsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apogyAddonsROSPathFacadeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType rosPathEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType messageFactoryEDataType = null;

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
	 * @see ca.gc.asc_csa.apogy.addons.ros.paths.ApogyAddonsROSPathsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ApogyAddonsROSPathsPackageImpl() {
		super(eNS_URI, ApogyAddonsROSPathsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ApogyAddonsROSPathsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ApogyAddonsROSPathsPackage init() {
		if (isInited) return (ApogyAddonsROSPathsPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyAddonsROSPathsPackage.eNS_URI);

		// Obtain or create and register package
		ApogyAddonsROSPathsPackageImpl theApogyAddonsROSPathsPackage = (ApogyAddonsROSPathsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ApogyAddonsROSPathsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ApogyAddonsROSPathsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ApogyAddonsGeometryPathsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theApogyAddonsROSPathsPackage.createPackageContents();

		// Initialize created meta-data
		theApogyAddonsROSPathsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theApogyAddonsROSPathsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ApogyAddonsROSPathsPackage.eNS_URI, theApogyAddonsROSPathsPackage);
		return theApogyAddonsROSPathsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApogyAddonsROSPathFacade() {
		return apogyAddonsROSPathFacadeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyAddonsROSPathFacade__ConvertToWayPointPath__Path() {
		return apogyAddonsROSPathFacadeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyAddonsROSPathFacade__ConvertToROSPath__WayPointPath_MessageFactory() {
		return apogyAddonsROSPathFacadeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getROSPath() {
		return rosPathEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMessageFactory() {
		return messageFactoryEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyAddonsROSPathsFactory getApogyAddonsROSPathsFactory() {
		return (ApogyAddonsROSPathsFactory)getEFactoryInstance();
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
		apogyAddonsROSPathFacadeEClass = createEClass(APOGY_ADDONS_ROS_PATH_FACADE);
		createEOperation(apogyAddonsROSPathFacadeEClass, APOGY_ADDONS_ROS_PATH_FACADE___CONVERT_TO_WAY_POINT_PATH__PATH);
		createEOperation(apogyAddonsROSPathFacadeEClass, APOGY_ADDONS_ROS_PATH_FACADE___CONVERT_TO_ROS_PATH__WAYPOINTPATH_MESSAGEFACTORY);

		// Create data types
		rosPathEDataType = createEDataType(ROS_PATH);
		messageFactoryEDataType = createEDataType(MESSAGE_FACTORY);
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
		ApogyAddonsGeometryPathsPackage theApogyAddonsGeometryPathsPackage = (ApogyAddonsGeometryPathsPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyAddonsGeometryPathsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(apogyAddonsROSPathFacadeEClass, ApogyAddonsROSPathFacade.class, "ApogyAddonsROSPathFacade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getApogyAddonsROSPathFacade__ConvertToWayPointPath__Path(), theApogyAddonsGeometryPathsPackage.getWayPointPath(), "convertToWayPointPath", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getROSPath(), "rosPath", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyAddonsROSPathFacade__ConvertToROSPath__WayPointPath_MessageFactory(), this.getROSPath(), "convertToROSPath", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyAddonsGeometryPathsPackage.getWayPointPath(), "wayPointPath", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMessageFactory(), "messageFactory", 0, 1, !IS_UNIQUE, IS_ORDERED);

		// Initialize data types
		initEDataType(rosPathEDataType, Path.class, "ROSPath", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(messageFactoryEDataType, MessageFactory.class, "MessageFactory", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ApogyAddonsROSPathsPackageImpl
