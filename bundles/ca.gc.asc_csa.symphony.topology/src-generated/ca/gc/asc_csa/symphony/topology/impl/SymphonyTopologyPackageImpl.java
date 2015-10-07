/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.topology.impl;

import ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorPackage;

import java.util.SortedSet;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.symphony.core.SymphonyCorePackage;

import ca.gc.asc_csa.symphony.environment.SymphonyEnvironmentPackage;
import ca.gc.asc_csa.symphony.topology.SymphonyEnvironmentNode;
import ca.gc.asc_csa.symphony.topology.SymphonySystemAPIsNode;
import ca.gc.asc_csa.symphony.topology.SymphonyTopologyFacade;
import ca.gc.asc_csa.symphony.topology.SymphonyTopologyFactory;
import ca.gc.asc_csa.symphony.topology.SymphonyTopologyPackage;
import ca.gc.asc_csa.symphony.topology.SystemsTopologyAdapter;
import ca.gc.space.topology.TopologyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SymphonyTopologyPackageImpl extends EPackageImpl implements SymphonyTopologyPackage
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass systemsTopologyAdapterEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass symphonyEnvironmentNodeEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass symphonySystemAPIsNodeEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass symphonyTopologyFacadeEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EDataType sortedSetEDataType = null;

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
	 * @see ca.gc.asc_csa.symphony.topology.SymphonyTopologyPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
  private SymphonyTopologyPackageImpl()
  {
		super(eNS_URI, SymphonyTopologyFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SymphonyTopologyPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
  public static SymphonyTopologyPackage init()
  {
		if (isInited) return (SymphonyTopologyPackage)EPackage.Registry.INSTANCE.getEPackage(SymphonyTopologyPackage.eNS_URI);

		// Obtain or create and register package
		SymphonyTopologyPackageImpl theSymphonyTopologyPackage = (SymphonyTopologyPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SymphonyTopologyPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SymphonyTopologyPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SymphonyEnvironmentPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSymphonyTopologyPackage.createPackageContents();

		// Initialize created meta-data
		theSymphonyTopologyPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSymphonyTopologyPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SymphonyTopologyPackage.eNS_URI, theSymphonyTopologyPackage);
		return theSymphonyTopologyPackage;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getSystemsTopologyAdapter()
  {
		return systemsTopologyAdapterEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getSystemsTopologyAdapter_Deployment()
  {
		return (EReference)systemsTopologyAdapterEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getSystemsTopologyAdapter_SystemsGroup()
  {
		return (EReference)systemsTopologyAdapterEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getSymphonyEnvironmentNode()
  {
		return symphonyEnvironmentNodeEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getSymphonyEnvironmentNode_SymphonyEnvironment()
  {
		return (EReference)symphonyEnvironmentNodeEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getSymphonyEnvironmentNode_WorksiteNode()
  {
		return (EReference)symphonyEnvironmentNodeEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getSymphonyEnvironmentNode_ResultsListNode()
  {
		return (EReference)symphonyEnvironmentNodeEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getSymphonyEnvironmentNode_SymphonySystemAPIsNode()
  {
		return (EReference)symphonyEnvironmentNodeEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getSymphonyEnvironmentNode__Dispose()
  {
		return symphonyEnvironmentNodeEClass.getEOperations().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getSymphonySystemAPIsNode()
  {
		return symphonySystemAPIsNodeEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getSymphonySystemAPIsNode_SymphonyEnvironment()
  {
		return (EReference)symphonySystemAPIsNodeEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getSymphonyTopologyFacade()
  {
		return symphonyTopologyFacadeEClass;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymphonyTopologyFacade__GetVariableOriginNode__Variable() {
		return symphonyTopologyFacadeEClass.getEOperations().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymphonyTopologyFacade__GetAbstractTypeImplementationOriginNode__AbstractTypeImplementation() {
		return symphonyTopologyFacadeEClass.getEOperations().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymphonyTopologyFacade__CreateSymphonyEnvironmentNode__SymphonyEnvironment() {
		return symphonyTopologyFacadeEClass.getEOperations().get(2);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getSortedSet()
  {
		return sortedSetEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SymphonyTopologyFactory getSymphonyTopologyFactory()
  {
		return (SymphonyTopologyFactory)getEFactoryInstance();
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
		systemsTopologyAdapterEClass = createEClass(SYSTEMS_TOPOLOGY_ADAPTER);
		createEReference(systemsTopologyAdapterEClass, SYSTEMS_TOPOLOGY_ADAPTER__DEPLOYMENT);
		createEReference(systemsTopologyAdapterEClass, SYSTEMS_TOPOLOGY_ADAPTER__SYSTEMS_GROUP);

		symphonyEnvironmentNodeEClass = createEClass(SYMPHONY_ENVIRONMENT_NODE);
		createEReference(symphonyEnvironmentNodeEClass, SYMPHONY_ENVIRONMENT_NODE__SYMPHONY_ENVIRONMENT);
		createEReference(symphonyEnvironmentNodeEClass, SYMPHONY_ENVIRONMENT_NODE__WORKSITE_NODE);
		createEReference(symphonyEnvironmentNodeEClass, SYMPHONY_ENVIRONMENT_NODE__RESULTS_LIST_NODE);
		createEReference(symphonyEnvironmentNodeEClass, SYMPHONY_ENVIRONMENT_NODE__SYMPHONY_SYSTEM_AP_IS_NODE);
		createEOperation(symphonyEnvironmentNodeEClass, SYMPHONY_ENVIRONMENT_NODE___DISPOSE);

		symphonySystemAPIsNodeEClass = createEClass(SYMPHONY_SYSTEM_AP_IS_NODE);
		createEReference(symphonySystemAPIsNodeEClass, SYMPHONY_SYSTEM_AP_IS_NODE__SYMPHONY_ENVIRONMENT);

		symphonyTopologyFacadeEClass = createEClass(SYMPHONY_TOPOLOGY_FACADE);
		createEOperation(symphonyTopologyFacadeEClass, SYMPHONY_TOPOLOGY_FACADE___GET_VARIABLE_ORIGIN_NODE__VARIABLE);
		createEOperation(symphonyTopologyFacadeEClass, SYMPHONY_TOPOLOGY_FACADE___GET_ABSTRACT_TYPE_IMPLEMENTATION_ORIGIN_NODE__ABSTRACTTYPEIMPLEMENTATION);
		createEOperation(symphonyTopologyFacadeEClass, SYMPHONY_TOPOLOGY_FACADE___CREATE_SYMPHONY_ENVIRONMENT_NODE__SYMPHONYENVIRONMENT);

		// Create data types
		sortedSetEDataType = createEDataType(SORTED_SET);
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
		TopologyPackage theTopologyPackage = (TopologyPackage)EPackage.Registry.INSTANCE.getEPackage(TopologyPackage.eNS_URI);
		SymphonyEnvironmentPackage theSymphonyEnvironmentPackage = (SymphonyEnvironmentPackage)EPackage.Registry.INSTANCE.getEPackage(SymphonyEnvironmentPackage.eNS_URI);
		EMFEcoreInvocatorPackage theEMFEcoreInvocatorPackage = (EMFEcoreInvocatorPackage)EPackage.Registry.INSTANCE.getEPackage(EMFEcoreInvocatorPackage.eNS_URI);

		// Create type parameters
		addETypeParameter(sortedSetEDataType, "T");

		// Set bounds for type parameters

		// Add supertypes to classes
		symphonyEnvironmentNodeEClass.getESuperTypes().add(theTopologyPackage.getReferencedGroupNode());
		symphonySystemAPIsNodeEClass.getESuperTypes().add(theTopologyPackage.getReferencedGroupNode());

		// Initialize classes, features, and operations; add parameters
		initEClass(systemsTopologyAdapterEClass, SystemsTopologyAdapter.class, "SystemsTopologyAdapter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemsTopologyAdapter_Deployment(), theSymphonyCorePackage.getSymphonyEnvironment(), null, "deployment", null, 0, 1, SystemsTopologyAdapter.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemsTopologyAdapter_SystemsGroup(), theTopologyPackage.getReferencedGroupNode(), null, "systemsGroup", null, 0, 1, SystemsTopologyAdapter.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(symphonyEnvironmentNodeEClass, SymphonyEnvironmentNode.class, "SymphonyEnvironmentNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSymphonyEnvironmentNode_SymphonyEnvironment(), theSymphonyCorePackage.getSymphonyEnvironment(), null, "symphonyEnvironment", null, 0, 1, SymphonyEnvironmentNode.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSymphonyEnvironmentNode_WorksiteNode(), theSymphonyEnvironmentPackage.getWorksiteNode(), null, "worksiteNode", null, 1, 1, SymphonyEnvironmentNode.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSymphonyEnvironmentNode_ResultsListNode(), theSymphonyCorePackage.getResultsListNode(), null, "resultsListNode", null, 1, 1, SymphonyEnvironmentNode.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSymphonyEnvironmentNode_SymphonySystemAPIsNode(), this.getSymphonySystemAPIsNode(), null, "symphonySystemAPIsNode", null, 1, 1, SymphonyEnvironmentNode.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEOperation(getSymphonyEnvironmentNode__Dispose(), null, "dispose", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(symphonySystemAPIsNodeEClass, SymphonySystemAPIsNode.class, "SymphonySystemAPIsNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSymphonySystemAPIsNode_SymphonyEnvironment(), theSymphonyCorePackage.getSymphonyEnvironment(), null, "symphonyEnvironment", null, 0, 1, SymphonySystemAPIsNode.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(symphonyTopologyFacadeEClass, SymphonyTopologyFacade.class, "SymphonyTopologyFacade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getSymphonyTopologyFacade__GetVariableOriginNode__Variable(), theTopologyPackage.getNode(), "getVariableOriginNode", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEMFEcoreInvocatorPackage.getVariable(), "variable", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSymphonyTopologyFacade__GetAbstractTypeImplementationOriginNode__AbstractTypeImplementation(), theTopologyPackage.getNode(), "getAbstractTypeImplementationOriginNode", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEMFEcoreInvocatorPackage.getAbstractTypeImplementation(), "abstractTypeImplementation", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSymphonyTopologyFacade__CreateSymphonyEnvironmentNode__SymphonyEnvironment(), this.getSymphonyEnvironmentNode(), "createSymphonyEnvironmentNode", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSymphonyCorePackage.getSymphonyEnvironment(), "symphonyEnvironment", 0, 1, !IS_UNIQUE, IS_ORDERED);

		// Initialize data types
		initEDataType(sortedSetEDataType, SortedSet.class, "SortedSet", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //SymphonyTopologyPackageImpl
