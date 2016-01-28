/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.common.topology.ui.viewer.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import ca.gc.asc_csa.apogy.common.topology.ui.ApogyCommonTopologyUIPackage;
import ca.gc.asc_csa.apogy.common.topology.ui.viewer.ITopologyViewer;
import ca.gc.asc_csa.apogy.common.topology.ui.viewer.ApogyCommonTopologyUIViewerFactory;
import ca.gc.asc_csa.apogy.common.topology.ui.viewer.ApogyCommonTopologyUIViewerPackage;
import ca.gc.asc_csa.apogy.common.topology.ui.viewer.TopologyViewerRegistry;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyCommonTopologyUIViewerPackageImpl extends EPackageImpl implements ApogyCommonTopologyUIViewerPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass topologyViewerRegistryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType iTopologyViewerEDataType = null;

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
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.viewer.ApogyCommonTopologyUIViewerPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ApogyCommonTopologyUIViewerPackageImpl() {
		super(eNS_URI, ApogyCommonTopologyUIViewerFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ApogyCommonTopologyUIViewerPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ApogyCommonTopologyUIViewerPackage init() {
		if (isInited) return (ApogyCommonTopologyUIViewerPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCommonTopologyUIViewerPackage.eNS_URI);

		// Obtain or create and register package
		ApogyCommonTopologyUIViewerPackageImpl theApogyCommonTopologyUIViewerPackage = (ApogyCommonTopologyUIViewerPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ApogyCommonTopologyUIViewerPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ApogyCommonTopologyUIViewerPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ApogyCommonTopologyUIPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theApogyCommonTopologyUIViewerPackage.createPackageContents();

		// Initialize created meta-data
		theApogyCommonTopologyUIViewerPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theApogyCommonTopologyUIViewerPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ApogyCommonTopologyUIViewerPackage.eNS_URI, theApogyCommonTopologyUIViewerPackage);
		return theApogyCommonTopologyUIViewerPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTopologyViewerRegistry() {
		return topologyViewerRegistryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTopologyViewerRegistry_Verbose() {
		return (EAttribute)topologyViewerRegistryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTopologyViewerRegistry_ITopologyViewers() {
		return (EAttribute)topologyViewerRegistryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTopologyViewerRegistry_LatestNodeSelection() {
		return (EReference)topologyViewerRegistryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTopologyViewerRegistry__RegisterITopologyViewer__ITopologyViewer() {
		return topologyViewerRegistryEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTopologyViewerRegistry__UnRegisterITopologyViewer__ITopologyViewer() {
		return topologyViewerRegistryEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getITopologyViewer() {
		return iTopologyViewerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCommonTopologyUIViewerFactory getApogyCommonTopologyUIViewerFactory() {
		return (ApogyCommonTopologyUIViewerFactory)getEFactoryInstance();
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
		topologyViewerRegistryEClass = createEClass(TOPOLOGY_VIEWER_REGISTRY);
		createEAttribute(topologyViewerRegistryEClass, TOPOLOGY_VIEWER_REGISTRY__VERBOSE);
		createEAttribute(topologyViewerRegistryEClass, TOPOLOGY_VIEWER_REGISTRY__ITOPOLOGY_VIEWERS);
		createEReference(topologyViewerRegistryEClass, TOPOLOGY_VIEWER_REGISTRY__LATEST_NODE_SELECTION);
		createEOperation(topologyViewerRegistryEClass, TOPOLOGY_VIEWER_REGISTRY___REGISTER_ITOPOLOGY_VIEWER__ITOPOLOGYVIEWER);
		createEOperation(topologyViewerRegistryEClass, TOPOLOGY_VIEWER_REGISTRY___UN_REGISTER_ITOPOLOGY_VIEWER__ITOPOLOGYVIEWER);

		// Create data types
		iTopologyViewerEDataType = createEDataType(ITOPOLOGY_VIEWER);
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
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		ApogyCommonTopologyUIPackage theApogyCommonTopologyUIPackage = (ApogyCommonTopologyUIPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCommonTopologyUIPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(topologyViewerRegistryEClass, TopologyViewerRegistry.class, "TopologyViewerRegistry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTopologyViewerRegistry_Verbose(), theEcorePackage.getEBoolean(), "verbose", "false", 0, 1, TopologyViewerRegistry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTopologyViewerRegistry_ITopologyViewers(), this.getITopologyViewer(), "iTopologyViewers", null, 0, -1, TopologyViewerRegistry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTopologyViewerRegistry_LatestNodeSelection(), theApogyCommonTopologyUIPackage.getNodeSelection(), null, "latestNodeSelection", null, 0, 1, TopologyViewerRegistry.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getTopologyViewerRegistry__RegisterITopologyViewer__ITopologyViewer(), null, "registerITopologyViewer", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getITopologyViewer(), "iTopologyViewer", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTopologyViewerRegistry__UnRegisterITopologyViewer__ITopologyViewer(), null, "unRegisterITopologyViewer", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getITopologyViewer(), "iTopologyViewer", 0, 1, !IS_UNIQUE, IS_ORDERED);

		// Initialize data types
		initEDataType(iTopologyViewerEDataType, ITopologyViewer.class, "ITopologyViewer", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ApogyCommonTopologyUIViewerPackageImpl
