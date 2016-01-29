/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.topology.impl;

import java.util.SortedSet;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyPackage;
import ca.gc.asc_csa.apogy.core.ApogyCorePackage;
import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.topology.ApogyEnvironmentNode;
import ca.gc.asc_csa.apogy.core.topology.ApogySystemAPIsNode;
import ca.gc.asc_csa.apogy.core.topology.ApogyCoreTopologyFacade;
import ca.gc.asc_csa.apogy.core.topology.ApogyCoreTopologyFactory;
import ca.gc.asc_csa.apogy.core.topology.ApogyCoreTopologyPackage;
import ca.gc.asc_csa.apogy.core.topology.SystemsTopologyAdapter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyCoreTopologyPackageImpl extends EPackageImpl implements ApogyCoreTopologyPackage
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
  private EClass apogyEnvironmentNodeEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass apogySystemAPIsNodeEClass = null;

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apogyCoreTopologyFacadeEClass = null;

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
	 * @see ca.gc.asc_csa.apogy.core.topology.ApogyCoreTopologyPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
  private ApogyCoreTopologyPackageImpl()
  {
		super(eNS_URI, ApogyCoreTopologyFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ApogyCoreTopologyPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
  public static ApogyCoreTopologyPackage init()
  {
		if (isInited) return (ApogyCoreTopologyPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCoreTopologyPackage.eNS_URI);

		// Obtain or create and register package
		ApogyCoreTopologyPackageImpl theApogyCoreTopologyPackage = (ApogyCoreTopologyPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ApogyCoreTopologyPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ApogyCoreTopologyPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ApogyCoreEnvironmentPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theApogyCoreTopologyPackage.createPackageContents();

		// Initialize created meta-data
		theApogyCoreTopologyPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theApogyCoreTopologyPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ApogyCoreTopologyPackage.eNS_URI, theApogyCoreTopologyPackage);
		return theApogyCoreTopologyPackage;
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
  public EClass getApogyEnvironmentNode()
  {
		return apogyEnvironmentNodeEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getApogyEnvironmentNode_ApogyEnvironment()
  {
		return (EReference)apogyEnvironmentNodeEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getApogyEnvironmentNode_WorksiteNode()
  {
		return (EReference)apogyEnvironmentNodeEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getApogyEnvironmentNode_ResultsListNode()
  {
		return (EReference)apogyEnvironmentNodeEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getApogyEnvironmentNode_ApogySystemAPIsNode()
  {
		return (EReference)apogyEnvironmentNodeEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getApogyEnvironmentNode__Dispose()
  {
		return apogyEnvironmentNodeEClass.getEOperations().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getApogySystemAPIsNode()
  {
		return apogySystemAPIsNodeEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getApogySystemAPIsNode_ApogyEnvironment()
  {
		return (EReference)apogySystemAPIsNodeEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApogyCoreTopologyFacade() {
		return apogyCoreTopologyFacadeEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreTopologyFacade__GetVariableOriginNode__Variable() {
		return apogyCoreTopologyFacadeEClass.getEOperations().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreTopologyFacade__GetAbstractTypeImplementationOriginNode__AbstractTypeImplementation() {
		return apogyCoreTopologyFacadeEClass.getEOperations().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreTopologyFacade__CreateApogyEnvironmentNode__ApogyEnvironment() {
		return apogyCoreTopologyFacadeEClass.getEOperations().get(2);
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
	public ApogyCoreTopologyFactory getApogyCoreTopologyFactory() {
		return (ApogyCoreTopologyFactory)getEFactoryInstance();
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

		apogyEnvironmentNodeEClass = createEClass(APOGY_ENVIRONMENT_NODE);
		createEReference(apogyEnvironmentNodeEClass, APOGY_ENVIRONMENT_NODE__APOGY_ENVIRONMENT);
		createEReference(apogyEnvironmentNodeEClass, APOGY_ENVIRONMENT_NODE__WORKSITE_NODE);
		createEReference(apogyEnvironmentNodeEClass, APOGY_ENVIRONMENT_NODE__RESULTS_LIST_NODE);
		createEReference(apogyEnvironmentNodeEClass, APOGY_ENVIRONMENT_NODE__APOGY_SYSTEM_AP_IS_NODE);
		createEOperation(apogyEnvironmentNodeEClass, APOGY_ENVIRONMENT_NODE___DISPOSE);

		apogySystemAPIsNodeEClass = createEClass(APOGY_SYSTEM_AP_IS_NODE);
		createEReference(apogySystemAPIsNodeEClass, APOGY_SYSTEM_AP_IS_NODE__APOGY_ENVIRONMENT);

		apogyCoreTopologyFacadeEClass = createEClass(APOGY_CORE_TOPOLOGY_FACADE);
		createEOperation(apogyCoreTopologyFacadeEClass, APOGY_CORE_TOPOLOGY_FACADE___GET_VARIABLE_ORIGIN_NODE__VARIABLE);
		createEOperation(apogyCoreTopologyFacadeEClass, APOGY_CORE_TOPOLOGY_FACADE___GET_ABSTRACT_TYPE_IMPLEMENTATION_ORIGIN_NODE__ABSTRACTTYPEIMPLEMENTATION);
		createEOperation(apogyCoreTopologyFacadeEClass, APOGY_CORE_TOPOLOGY_FACADE___CREATE_APOGY_ENVIRONMENT_NODE__APOGYENVIRONMENT);

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
		ApogyCorePackage theApogyCorePackage = (ApogyCorePackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCorePackage.eNS_URI);
		ApogyCommonTopologyPackage theApogyCommonTopologyPackage = (ApogyCommonTopologyPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCommonTopologyPackage.eNS_URI);
		ApogyCoreEnvironmentPackage theApogyCoreEnvironmentPackage = (ApogyCoreEnvironmentPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCoreEnvironmentPackage.eNS_URI);
		ApogyCoreInvocatorPackage theApogyCoreInvocatorPackage = (ApogyCoreInvocatorPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCoreInvocatorPackage.eNS_URI);

		// Create type parameters
		addETypeParameter(sortedSetEDataType, "T");

		// Set bounds for type parameters

		// Add supertypes to classes
		apogyEnvironmentNodeEClass.getESuperTypes().add(theApogyCommonTopologyPackage.getReferencedGroupNode());
		apogySystemAPIsNodeEClass.getESuperTypes().add(theApogyCommonTopologyPackage.getReferencedGroupNode());

		// Initialize classes, features, and operations; add parameters
		initEClass(systemsTopologyAdapterEClass, SystemsTopologyAdapter.class, "SystemsTopologyAdapter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemsTopologyAdapter_Deployment(), theApogyCorePackage.getApogyEnvironment(), null, "deployment", null, 0, 1, SystemsTopologyAdapter.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemsTopologyAdapter_SystemsGroup(), theApogyCommonTopologyPackage.getReferencedGroupNode(), null, "systemsGroup", null, 0, 1, SystemsTopologyAdapter.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(apogyEnvironmentNodeEClass, ApogyEnvironmentNode.class, "ApogyEnvironmentNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getApogyEnvironmentNode_ApogyEnvironment(), theApogyCorePackage.getApogyEnvironment(), null, "apogyEnvironment", null, 0, 1, ApogyEnvironmentNode.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApogyEnvironmentNode_WorksiteNode(), theApogyCoreEnvironmentPackage.getWorksiteNode(), null, "worksiteNode", null, 1, 1, ApogyEnvironmentNode.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getApogyEnvironmentNode_ResultsListNode(), theApogyCorePackage.getResultsListNode(), null, "resultsListNode", null, 1, 1, ApogyEnvironmentNode.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getApogyEnvironmentNode_ApogySystemAPIsNode(), this.getApogySystemAPIsNode(), null, "apogySystemAPIsNode", null, 1, 1, ApogyEnvironmentNode.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEOperation(getApogyEnvironmentNode__Dispose(), null, "dispose", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(apogySystemAPIsNodeEClass, ApogySystemAPIsNode.class, "ApogySystemAPIsNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getApogySystemAPIsNode_ApogyEnvironment(), theApogyCorePackage.getApogyEnvironment(), null, "apogyEnvironment", null, 0, 1, ApogySystemAPIsNode.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(apogyCoreTopologyFacadeEClass, ApogyCoreTopologyFacade.class, "ApogyCoreTopologyFacade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getApogyCoreTopologyFacade__GetVariableOriginNode__Variable(), theApogyCommonTopologyPackage.getNode(), "getVariableOriginNode", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCoreInvocatorPackage.getVariable(), "variable", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCoreTopologyFacade__GetAbstractTypeImplementationOriginNode__AbstractTypeImplementation(), theApogyCommonTopologyPackage.getNode(), "getAbstractTypeImplementationOriginNode", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCoreInvocatorPackage.getAbstractTypeImplementation(), "abstractTypeImplementation", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCoreTopologyFacade__CreateApogyEnvironmentNode__ApogyEnvironment(), this.getApogyEnvironmentNode(), "createApogyEnvironmentNode", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCorePackage.getApogyEnvironment(), "apogyEnvironment", 0, 1, !IS_UNIQUE, IS_ORDERED);

		// Initialize data types
		initEDataType(sortedSetEDataType, SortedSet.class, "SortedSet", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ApogyCoreTopologyPackageImpl
