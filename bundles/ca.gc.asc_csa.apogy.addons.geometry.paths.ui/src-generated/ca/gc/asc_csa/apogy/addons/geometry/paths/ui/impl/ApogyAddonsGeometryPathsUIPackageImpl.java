/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.addons.geometry.paths.ui.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import ca.gc.asc_csa.apogy.addons.geometry.paths.ui.PathPresentationMode;
import ca.gc.asc_csa.apogy.addons.geometry.paths.ui.ApogyAddonsGeometryPathsUIFactory;
import ca.gc.asc_csa.apogy.addons.geometry.paths.ui.ApogyAddonsGeometryPathsUIPackage;
import ca.gc.asc_csa.apogy.addons.geometry.paths.ui.WayPointPathPresentation;
import ca.gc.asc_csa.apogy.addons.geometry.paths.ui.WayPointPresentation;
import ca.gc.asc_csa.apogy.common.topology.ui.ApogyCommonTopologyUIPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyAddonsGeometryPathsUIPackageImpl extends EPackageImpl implements ApogyAddonsGeometryPathsUIPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wayPointPathPresentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wayPointPresentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum pathPresentationModeEEnum = null;

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
	 * @see ca.gc.asc_csa.apogy.addons.geometry.paths.ui.ApogyAddonsGeometryPathsUIPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ApogyAddonsGeometryPathsUIPackageImpl() {
		super(eNS_URI, ApogyAddonsGeometryPathsUIFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ApogyAddonsGeometryPathsUIPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ApogyAddonsGeometryPathsUIPackage init() {
		if (isInited) return (ApogyAddonsGeometryPathsUIPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyAddonsGeometryPathsUIPackage.eNS_URI);

		// Obtain or create and register package
		ApogyAddonsGeometryPathsUIPackageImpl theApogyAddonsGeometryPathsUIPackage = (ApogyAddonsGeometryPathsUIPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ApogyAddonsGeometryPathsUIPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ApogyAddonsGeometryPathsUIPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ApogyCommonTopologyUIPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theApogyAddonsGeometryPathsUIPackage.createPackageContents();

		// Initialize created meta-data
		theApogyAddonsGeometryPathsUIPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theApogyAddonsGeometryPathsUIPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ApogyAddonsGeometryPathsUIPackage.eNS_URI, theApogyAddonsGeometryPathsUIPackage);
		return theApogyAddonsGeometryPathsUIPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWayPointPathPresentation() {
		return wayPointPathPresentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWayPointPathPresentation_PointSize() {
		return (EAttribute)wayPointPathPresentationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWayPointPathPresentation_PresentationMode() {
		return (EAttribute)wayPointPathPresentationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWayPointPathPresentation_EndPointsRadius() {
		return (EAttribute)wayPointPathPresentationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWayPointPresentation() {
		return wayPointPresentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPathPresentationMode() {
		return pathPresentationModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyAddonsGeometryPathsUIFactory getApogyAddonsGeometryPathsUIFactory() {
		return (ApogyAddonsGeometryPathsUIFactory)getEFactoryInstance();
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
		wayPointPathPresentationEClass = createEClass(WAY_POINT_PATH_PRESENTATION);
		createEAttribute(wayPointPathPresentationEClass, WAY_POINT_PATH_PRESENTATION__POINT_SIZE);
		createEAttribute(wayPointPathPresentationEClass, WAY_POINT_PATH_PRESENTATION__PRESENTATION_MODE);
		createEAttribute(wayPointPathPresentationEClass, WAY_POINT_PATH_PRESENTATION__END_POINTS_RADIUS);

		wayPointPresentationEClass = createEClass(WAY_POINT_PRESENTATION);

		// Create enums
		pathPresentationModeEEnum = createEEnum(PATH_PRESENTATION_MODE);
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
		ApogyCommonTopologyUIPackage theApogyCommonTopologyUIPackage = (ApogyCommonTopologyUIPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCommonTopologyUIPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		wayPointPathPresentationEClass.getESuperTypes().add(theApogyCommonTopologyUIPackage.getNodePresentation());
		wayPointPresentationEClass.getESuperTypes().add(theApogyCommonTopologyUIPackage.getNodePresentation());

		// Initialize classes, features, and operations; add parameters
		initEClass(wayPointPathPresentationEClass, WayPointPathPresentation.class, "WayPointPathPresentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWayPointPathPresentation_PointSize(), theEcorePackage.getEInt(), "pointSize", "2", 0, 1, WayPointPathPresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWayPointPathPresentation_PresentationMode(), this.getPathPresentationMode(), "presentationMode", "Points Lines", 0, 1, WayPointPathPresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWayPointPathPresentation_EndPointsRadius(), theEcorePackage.getEFloat(), "endPointsRadius", "0.02", 0, 1, WayPointPathPresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wayPointPresentationEClass, WayPointPresentation.class, "WayPointPresentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(pathPresentationModeEEnum, PathPresentationMode.class, "PathPresentationMode");
		addEEnumLiteral(pathPresentationModeEEnum, PathPresentationMode.POINTS);
		addEEnumLiteral(pathPresentationModeEEnum, PathPresentationMode.LINES);
		addEEnumLiteral(pathPresentationModeEEnum, PathPresentationMode.POINTS_LINES);

		// Create resource
		createResource(eNS_URI);
	}

} //ApogyAddonsGeometryPathsUIPackageImpl
