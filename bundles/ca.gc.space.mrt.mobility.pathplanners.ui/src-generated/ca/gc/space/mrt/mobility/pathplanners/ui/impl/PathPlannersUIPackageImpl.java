/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.space.mrt.mobility.pathplanners.ui.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.symphony.common.topology.ui.TopologyUIPackage;

import ca.gc.space.mrt.mobility.pathplanners.ui.CircularExclusionZonePresentation;
import ca.gc.space.mrt.mobility.pathplanners.ui.PathPlannersUIFactory;
import ca.gc.space.mrt.mobility.pathplanners.ui.PathPlannersUIPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PathPlannersUIPackageImpl extends EPackageImpl implements PathPlannersUIPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass circularExclusionZonePresentationEClass = null;

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
	 * @see ca.gc.space.mrt.mobility.pathplanners.ui.PathPlannersUIPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PathPlannersUIPackageImpl() {
		super(eNS_URI, PathPlannersUIFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PathPlannersUIPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PathPlannersUIPackage init() {
		if (isInited) return (PathPlannersUIPackage)EPackage.Registry.INSTANCE.getEPackage(PathPlannersUIPackage.eNS_URI);

		// Obtain or create and register package
		PathPlannersUIPackageImpl thePathPlannersUIPackage = (PathPlannersUIPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PathPlannersUIPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PathPlannersUIPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TopologyUIPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thePathPlannersUIPackage.createPackageContents();

		// Initialize created meta-data
		thePathPlannersUIPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePathPlannersUIPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PathPlannersUIPackage.eNS_URI, thePathPlannersUIPackage);
		return thePathPlannersUIPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCircularExclusionZonePresentation() {
		return circularExclusionZonePresentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCircularExclusionZonePresentation_Transparency() {
		return (EAttribute)circularExclusionZonePresentationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCircularExclusionZonePresentation_PresentationMode() {
		return (EAttribute)circularExclusionZonePresentationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCircularExclusionZonePresentation_Height() {
		return (EAttribute)circularExclusionZonePresentationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathPlannersUIFactory getPathPlannersUIFactory() {
		return (PathPlannersUIFactory)getEFactoryInstance();
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
		circularExclusionZonePresentationEClass = createEClass(CIRCULAR_EXCLUSION_ZONE_PRESENTATION);
		createEAttribute(circularExclusionZonePresentationEClass, CIRCULAR_EXCLUSION_ZONE_PRESENTATION__TRANSPARENCY);
		createEAttribute(circularExclusionZonePresentationEClass, CIRCULAR_EXCLUSION_ZONE_PRESENTATION__PRESENTATION_MODE);
		createEAttribute(circularExclusionZonePresentationEClass, CIRCULAR_EXCLUSION_ZONE_PRESENTATION__HEIGHT);
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
		TopologyUIPackage theTopologyUIPackage = (TopologyUIPackage)EPackage.Registry.INSTANCE.getEPackage(TopologyUIPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		circularExclusionZonePresentationEClass.getESuperTypes().add(theTopologyUIPackage.getNodePresentation());

		// Initialize classes, features, and operations; add parameters
		initEClass(circularExclusionZonePresentationEClass, CircularExclusionZonePresentation.class, "CircularExclusionZonePresentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCircularExclusionZonePresentation_Transparency(), theEcorePackage.getEFloat(), "transparency", null, 0, 1, CircularExclusionZonePresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCircularExclusionZonePresentation_PresentationMode(), theTopologyUIPackage.getMeshPresentationMode(), "presentationMode", "SURFACE", 0, 1, CircularExclusionZonePresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCircularExclusionZonePresentation_Height(), theEcorePackage.getEDouble(), "height", "10.0", 0, 1, CircularExclusionZonePresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //PathPlannersUIPackageImpl
