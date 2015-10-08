/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package org.eclipse.symphony.addons.ui.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.symphony.addons.ui.Ruler3dToolNodePresentation;
import org.eclipse.symphony.addons.ui.SunVector3DToolNodePresentation;
import org.eclipse.symphony.addons.ui.SymphonyToolsUIFactory;
import org.eclipse.symphony.addons.ui.SymphonyToolsUIPackage;
import org.eclipse.symphony.addons.ui.Trajectory3DToolNodePresentation;

import ca.gc.space.topology.ui.TopologyUIPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SymphonyToolsUIPackageImpl extends EPackageImpl implements SymphonyToolsUIPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruler3dToolNodePresentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sunVector3DToolNodePresentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trajectory3DToolNodePresentationEClass = null;

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
	 * @see org.eclipse.symphony.addons.ui.SymphonyToolsUIPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SymphonyToolsUIPackageImpl() {
		super(eNS_URI, SymphonyToolsUIFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SymphonyToolsUIPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SymphonyToolsUIPackage init() {
		if (isInited) return (SymphonyToolsUIPackage)EPackage.Registry.INSTANCE.getEPackage(SymphonyToolsUIPackage.eNS_URI);

		// Obtain or create and register package
		SymphonyToolsUIPackageImpl theSymphonyToolsUIPackage = (SymphonyToolsUIPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SymphonyToolsUIPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SymphonyToolsUIPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TopologyUIPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSymphonyToolsUIPackage.createPackageContents();

		// Initialize created meta-data
		theSymphonyToolsUIPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSymphonyToolsUIPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SymphonyToolsUIPackage.eNS_URI, theSymphonyToolsUIPackage);
		return theSymphonyToolsUIPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuler3dToolNodePresentation() {
		return ruler3dToolNodePresentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSunVector3DToolNodePresentation() {
		return sunVector3DToolNodePresentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrajectory3DToolNodePresentation() {
		return trajectory3DToolNodePresentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymphonyToolsUIFactory getSymphonyToolsUIFactory() {
		return (SymphonyToolsUIFactory)getEFactoryInstance();
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
		ruler3dToolNodePresentationEClass = createEClass(RULER3D_TOOL_NODE_PRESENTATION);

		sunVector3DToolNodePresentationEClass = createEClass(SUN_VECTOR3_DTOOL_NODE_PRESENTATION);

		trajectory3DToolNodePresentationEClass = createEClass(TRAJECTORY3_DTOOL_NODE_PRESENTATION);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		ruler3dToolNodePresentationEClass.getESuperTypes().add(theTopologyUIPackage.getNodePresentation());
		sunVector3DToolNodePresentationEClass.getESuperTypes().add(theTopologyUIPackage.getNodePresentation());
		trajectory3DToolNodePresentationEClass.getESuperTypes().add(theTopologyUIPackage.getNodePresentation());

		// Initialize classes, features, and operations; add parameters
		initEClass(ruler3dToolNodePresentationEClass, Ruler3dToolNodePresentation.class, "Ruler3dToolNodePresentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sunVector3DToolNodePresentationEClass, SunVector3DToolNodePresentation.class, "SunVector3DToolNodePresentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(trajectory3DToolNodePresentationEClass, Trajectory3DToolNodePresentation.class, "Trajectory3DToolNodePresentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //SymphonyToolsUIPackageImpl
