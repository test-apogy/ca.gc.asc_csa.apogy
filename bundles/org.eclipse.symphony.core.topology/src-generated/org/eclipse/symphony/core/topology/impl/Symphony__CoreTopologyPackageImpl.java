/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.topology.impl;

import java.util.SortedSet;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.symphony.common.topology.Symphony__CommonTopologyPackage;
import org.eclipse.symphony.core.Symphony__CorePackage;
import org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentPackage;
import org.eclipse.symphony.core.invocator.Symphony__CoreInvocatorPackage;
import org.eclipse.symphony.core.topology.SymphonyEnvironmentNode;
import org.eclipse.symphony.core.topology.SymphonySystemAPIsNode;
import org.eclipse.symphony.core.topology.Symphony__CoreTopologyFacade;
import org.eclipse.symphony.core.topology.Symphony__CoreTopologyFactory;
import org.eclipse.symphony.core.topology.Symphony__CoreTopologyPackage;
import org.eclipse.symphony.core.topology.SystemsTopologyAdapter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Symphony__CoreTopologyPackageImpl extends EPackageImpl implements Symphony__CoreTopologyPackage
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
	private EClass symphony__CoreTopologyFacadeEClass = null;

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
	 * @see org.eclipse.symphony.core.topology.Symphony__CoreTopologyPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
  private Symphony__CoreTopologyPackageImpl()
  {
		super(eNS_URI, Symphony__CoreTopologyFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Symphony__CoreTopologyPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
  public static Symphony__CoreTopologyPackage init()
  {
		if (isInited) return (Symphony__CoreTopologyPackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__CoreTopologyPackage.eNS_URI);

		// Obtain or create and register package
		Symphony__CoreTopologyPackageImpl theSymphony__CoreTopologyPackage = (Symphony__CoreTopologyPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Symphony__CoreTopologyPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Symphony__CoreTopologyPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		Symphony__CoreEnvironmentPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSymphony__CoreTopologyPackage.createPackageContents();

		// Initialize created meta-data
		theSymphony__CoreTopologyPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSymphony__CoreTopologyPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Symphony__CoreTopologyPackage.eNS_URI, theSymphony__CoreTopologyPackage);
		return theSymphony__CoreTopologyPackage;
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
	public EClass getSymphony__CoreTopologyFacade() {
		return symphony__CoreTopologyFacadeEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymphony__CoreTopologyFacade__GetVariableOriginNode__Variable() {
		return symphony__CoreTopologyFacadeEClass.getEOperations().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymphony__CoreTopologyFacade__GetAbstractTypeImplementationOriginNode__AbstractTypeImplementation() {
		return symphony__CoreTopologyFacadeEClass.getEOperations().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymphony__CoreTopologyFacade__CreateSymphonyEnvironmentNode__SymphonyEnvironment() {
		return symphony__CoreTopologyFacadeEClass.getEOperations().get(2);
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
	public Symphony__CoreTopologyFactory getSymphony__CoreTopologyFactory() {
		return (Symphony__CoreTopologyFactory)getEFactoryInstance();
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

		symphony__CoreTopologyFacadeEClass = createEClass(SYMPHONY_CORE_TOPOLOGY_FACADE);
		createEOperation(symphony__CoreTopologyFacadeEClass, SYMPHONY_CORE_TOPOLOGY_FACADE___GET_VARIABLE_ORIGIN_NODE__VARIABLE);
		createEOperation(symphony__CoreTopologyFacadeEClass, SYMPHONY_CORE_TOPOLOGY_FACADE___GET_ABSTRACT_TYPE_IMPLEMENTATION_ORIGIN_NODE__ABSTRACTTYPEIMPLEMENTATION);
		createEOperation(symphony__CoreTopologyFacadeEClass, SYMPHONY_CORE_TOPOLOGY_FACADE___CREATE_SYMPHONY_ENVIRONMENT_NODE__SYMPHONYENVIRONMENT);

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
		Symphony__CorePackage theSymphony__CorePackage = (Symphony__CorePackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__CorePackage.eNS_URI);
		Symphony__CommonTopologyPackage theSymphony__CommonTopologyPackage = (Symphony__CommonTopologyPackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__CommonTopologyPackage.eNS_URI);
		Symphony__CoreEnvironmentPackage theSymphony__CoreEnvironmentPackage = (Symphony__CoreEnvironmentPackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__CoreEnvironmentPackage.eNS_URI);
		Symphony__CoreInvocatorPackage theSymphony__CoreInvocatorPackage = (Symphony__CoreInvocatorPackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__CoreInvocatorPackage.eNS_URI);

		// Create type parameters
		addETypeParameter(sortedSetEDataType, "T");

		// Set bounds for type parameters

		// Add supertypes to classes
		symphonyEnvironmentNodeEClass.getESuperTypes().add(theSymphony__CommonTopologyPackage.getReferencedGroupNode());
		symphonySystemAPIsNodeEClass.getESuperTypes().add(theSymphony__CommonTopologyPackage.getReferencedGroupNode());

		// Initialize classes, features, and operations; add parameters
		initEClass(systemsTopologyAdapterEClass, SystemsTopologyAdapter.class, "SystemsTopologyAdapter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemsTopologyAdapter_Deployment(), theSymphony__CorePackage.getSymphonyEnvironment(), null, "deployment", null, 0, 1, SystemsTopologyAdapter.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemsTopologyAdapter_SystemsGroup(), theSymphony__CommonTopologyPackage.getReferencedGroupNode(), null, "systemsGroup", null, 0, 1, SystemsTopologyAdapter.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(symphonyEnvironmentNodeEClass, SymphonyEnvironmentNode.class, "SymphonyEnvironmentNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSymphonyEnvironmentNode_SymphonyEnvironment(), theSymphony__CorePackage.getSymphonyEnvironment(), null, "symphonyEnvironment", null, 0, 1, SymphonyEnvironmentNode.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSymphonyEnvironmentNode_WorksiteNode(), theSymphony__CoreEnvironmentPackage.getWorksiteNode(), null, "worksiteNode", null, 1, 1, SymphonyEnvironmentNode.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSymphonyEnvironmentNode_ResultsListNode(), theSymphony__CorePackage.getResultsListNode(), null, "resultsListNode", null, 1, 1, SymphonyEnvironmentNode.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSymphonyEnvironmentNode_SymphonySystemAPIsNode(), this.getSymphonySystemAPIsNode(), null, "symphonySystemAPIsNode", null, 1, 1, SymphonyEnvironmentNode.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEOperation(getSymphonyEnvironmentNode__Dispose(), null, "dispose", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(symphonySystemAPIsNodeEClass, SymphonySystemAPIsNode.class, "SymphonySystemAPIsNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSymphonySystemAPIsNode_SymphonyEnvironment(), theSymphony__CorePackage.getSymphonyEnvironment(), null, "symphonyEnvironment", null, 0, 1, SymphonySystemAPIsNode.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(symphony__CoreTopologyFacadeEClass, Symphony__CoreTopologyFacade.class, "Symphony__CoreTopologyFacade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getSymphony__CoreTopologyFacade__GetVariableOriginNode__Variable(), theSymphony__CommonTopologyPackage.getNode(), "getVariableOriginNode", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSymphony__CoreInvocatorPackage.getVariable(), "variable", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSymphony__CoreTopologyFacade__GetAbstractTypeImplementationOriginNode__AbstractTypeImplementation(), theSymphony__CommonTopologyPackage.getNode(), "getAbstractTypeImplementationOriginNode", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSymphony__CoreInvocatorPackage.getAbstractTypeImplementation(), "abstractTypeImplementation", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSymphony__CoreTopologyFacade__CreateSymphonyEnvironmentNode__SymphonyEnvironment(), this.getSymphonyEnvironmentNode(), "createSymphonyEnvironmentNode", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSymphony__CorePackage.getSymphonyEnvironment(), "symphonyEnvironment", 0, 1, !IS_UNIQUE, IS_ORDERED);

		// Initialize data types
		initEDataType(sortedSetEDataType, SortedSet.class, "SortedSet", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //Symphony__CoreTopologyPackageImpl
