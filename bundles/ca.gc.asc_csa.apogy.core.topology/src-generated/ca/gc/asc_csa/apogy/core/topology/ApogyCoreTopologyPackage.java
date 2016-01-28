/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.topology;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.apogy.core.topology.ApogyCoreTopologyFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='ApogyCoreTopology' childCreationExtenders='true' extensibleProviderFactory='true' multipleEditorPages='false' copyrightText='Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)' modelName='ApogyCoreTopology' modelDirectory='/ca.gc.asc_csa.apogy.core.topology/src-generated' editDirectory='/ca.gc.asc_csa.apogy.core.topology.edit/src-generated' basePackage='ca.gc.asc_csa.apogy.core'"
 * @generated
 */
public interface ApogyCoreTopologyPackage extends EPackage
{
  /**
	 * The package name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNAME = "topology";

  /**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_URI = "ca.gc.asc_csa.apogy.core.topology";

  /**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_PREFIX = "topology";

  /**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  ApogyCoreTopologyPackage eINSTANCE = ca.gc.asc_csa.apogy.core.topology.impl.ApogyCoreTopologyPackageImpl.init();

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.topology.impl.SystemsTopologyAdapterImpl <em>Systems Topology Adapter</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.topology.impl.SystemsTopologyAdapterImpl
	 * @see ca.gc.asc_csa.apogy.core.topology.impl.ApogyCoreTopologyPackageImpl#getSystemsTopologyAdapter()
	 * @generated
	 */
  int SYSTEMS_TOPOLOGY_ADAPTER = 0;

  /**
	 * The feature id for the '<em><b>Deployment</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SYSTEMS_TOPOLOGY_ADAPTER__DEPLOYMENT = 0;

  /**
	 * The feature id for the '<em><b>Systems Group</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SYSTEMS_TOPOLOGY_ADAPTER__SYSTEMS_GROUP = 1;

  /**
	 * The number of structural features of the '<em>Systems Topology Adapter</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SYSTEMS_TOPOLOGY_ADAPTER_FEATURE_COUNT = 2;

  /**
	 * The number of operations of the '<em>Systems Topology Adapter</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SYSTEMS_TOPOLOGY_ADAPTER_OPERATION_COUNT = 0;

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.topology.impl.ApogyEnvironmentNodeImpl <em>Apogy Environment Node</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.topology.impl.ApogyEnvironmentNodeImpl
	 * @see ca.gc.asc_csa.apogy.core.topology.impl.ApogyCoreTopologyPackageImpl#getApogyEnvironmentNode()
	 * @generated
	 */
  int APOGY_ENVIRONMENT_NODE = 1;

  /**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int APOGY_ENVIRONMENT_NODE__PARENT = ApogyCommonTopologyPackage.REFERENCED_GROUP_NODE__PARENT;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int APOGY_ENVIRONMENT_NODE__DESCRIPTION = ApogyCommonTopologyPackage.REFERENCED_GROUP_NODE__DESCRIPTION;

  /**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int APOGY_ENVIRONMENT_NODE__NODE_ID = ApogyCommonTopologyPackage.REFERENCED_GROUP_NODE__NODE_ID;

  /**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int APOGY_ENVIRONMENT_NODE__CHILDREN = ApogyCommonTopologyPackage.REFERENCED_GROUP_NODE__CHILDREN;

  /**
	 * The feature id for the '<em><b>Referenced Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int APOGY_ENVIRONMENT_NODE__REFERENCED_CHILDREN = ApogyCommonTopologyPackage.REFERENCED_GROUP_NODE__REFERENCED_CHILDREN;

  /**
	 * The feature id for the '<em><b>Apogy Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int APOGY_ENVIRONMENT_NODE__APOGY_ENVIRONMENT = ApogyCommonTopologyPackage.REFERENCED_GROUP_NODE_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Worksite Node</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int APOGY_ENVIRONMENT_NODE__WORKSITE_NODE = ApogyCommonTopologyPackage.REFERENCED_GROUP_NODE_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Results List Node</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int APOGY_ENVIRONMENT_NODE__RESULTS_LIST_NODE = ApogyCommonTopologyPackage.REFERENCED_GROUP_NODE_FEATURE_COUNT + 2;

  /**
	 * The feature id for the '<em><b>Apogy System AP Is Node</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int APOGY_ENVIRONMENT_NODE__APOGY_SYSTEM_AP_IS_NODE = ApogyCommonTopologyPackage.REFERENCED_GROUP_NODE_FEATURE_COUNT + 3;

  /**
	 * The number of structural features of the '<em>Apogy Environment Node</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int APOGY_ENVIRONMENT_NODE_FEATURE_COUNT = ApogyCommonTopologyPackage.REFERENCED_GROUP_NODE_FEATURE_COUNT + 4;

  /**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int APOGY_ENVIRONMENT_NODE___ACCEPT__INODEVISITOR = ApogyCommonTopologyPackage.REFERENCED_GROUP_NODE___ACCEPT__INODEVISITOR;

  /**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int APOGY_ENVIRONMENT_NODE___DISPOSE = ApogyCommonTopologyPackage.REFERENCED_GROUP_NODE_OPERATION_COUNT + 0;

  /**
	 * The number of operations of the '<em>Apogy Environment Node</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int APOGY_ENVIRONMENT_NODE_OPERATION_COUNT = ApogyCommonTopologyPackage.REFERENCED_GROUP_NODE_OPERATION_COUNT + 1;

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.topology.impl.ApogySystemAPIsNodeImpl <em>Apogy System AP Is Node</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.topology.impl.ApogySystemAPIsNodeImpl
	 * @see ca.gc.asc_csa.apogy.core.topology.impl.ApogyCoreTopologyPackageImpl#getApogySystemAPIsNode()
	 * @generated
	 */
  int APOGY_SYSTEM_AP_IS_NODE = 2;

  /**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int APOGY_SYSTEM_AP_IS_NODE__PARENT = ApogyCommonTopologyPackage.REFERENCED_GROUP_NODE__PARENT;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int APOGY_SYSTEM_AP_IS_NODE__DESCRIPTION = ApogyCommonTopologyPackage.REFERENCED_GROUP_NODE__DESCRIPTION;

  /**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int APOGY_SYSTEM_AP_IS_NODE__NODE_ID = ApogyCommonTopologyPackage.REFERENCED_GROUP_NODE__NODE_ID;

  /**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int APOGY_SYSTEM_AP_IS_NODE__CHILDREN = ApogyCommonTopologyPackage.REFERENCED_GROUP_NODE__CHILDREN;

  /**
	 * The feature id for the '<em><b>Referenced Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int APOGY_SYSTEM_AP_IS_NODE__REFERENCED_CHILDREN = ApogyCommonTopologyPackage.REFERENCED_GROUP_NODE__REFERENCED_CHILDREN;

  /**
	 * The feature id for the '<em><b>Apogy Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int APOGY_SYSTEM_AP_IS_NODE__APOGY_ENVIRONMENT = ApogyCommonTopologyPackage.REFERENCED_GROUP_NODE_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Apogy System AP Is Node</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int APOGY_SYSTEM_AP_IS_NODE_FEATURE_COUNT = ApogyCommonTopologyPackage.REFERENCED_GROUP_NODE_FEATURE_COUNT + 1;

  /**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int APOGY_SYSTEM_AP_IS_NODE___ACCEPT__INODEVISITOR = ApogyCommonTopologyPackage.REFERENCED_GROUP_NODE___ACCEPT__INODEVISITOR;

  /**
	 * The number of operations of the '<em>Apogy System AP Is Node</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int APOGY_SYSTEM_AP_IS_NODE_OPERATION_COUNT = ApogyCommonTopologyPackage.REFERENCED_GROUP_NODE_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.topology.impl.ApogyCoreTopologyFacadeImpl <em>Facade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.topology.impl.ApogyCoreTopologyFacadeImpl
	 * @see ca.gc.asc_csa.apogy.core.topology.impl.ApogyCoreTopologyPackageImpl#getApogyCoreTopologyFacade()
	 * @generated
	 */
	int APOGY_CORE_TOPOLOGY_FACADE = 3;

		/**
	 * The number of structural features of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_TOPOLOGY_FACADE_FEATURE_COUNT = 0;

		/**
	 * The operation id for the '<em>Get Variable Origin Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_TOPOLOGY_FACADE___GET_VARIABLE_ORIGIN_NODE__VARIABLE = 0;

		/**
	 * The operation id for the '<em>Get Abstract Type Implementation Origin Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_TOPOLOGY_FACADE___GET_ABSTRACT_TYPE_IMPLEMENTATION_ORIGIN_NODE__ABSTRACTTYPEIMPLEMENTATION = 1;

		/**
	 * The operation id for the '<em>Create Apogy Environment Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_TOPOLOGY_FACADE___CREATE_APOGY_ENVIRONMENT_NODE__SYMPHONYENVIRONMENT = 2;

		/**
	 * The number of operations of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_TOPOLOGY_FACADE_OPERATION_COUNT = 3;

		/**
	 * The meta object id for the '<em>Sorted Set</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see java.util.SortedSet
	 * @see ca.gc.asc_csa.apogy.core.topology.impl.ApogyCoreTopologyPackageImpl#getSortedSet()
	 * @generated
	 */
  int SORTED_SET = 4;


  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.topology.SystemsTopologyAdapter <em>Systems Topology Adapter</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Systems Topology Adapter</em>'.
	 * @see ca.gc.asc_csa.apogy.core.topology.SystemsTopologyAdapter
	 * @generated
	 */
  EClass getSystemsTopologyAdapter();

  /**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.topology.SystemsTopologyAdapter#getDeployment <em>Deployment</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Deployment</em>'.
	 * @see ca.gc.asc_csa.apogy.core.topology.SystemsTopologyAdapter#getDeployment()
	 * @see #getSystemsTopologyAdapter()
	 * @generated
	 */
  EReference getSystemsTopologyAdapter_Deployment();

  /**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.topology.SystemsTopologyAdapter#getSystemsGroup <em>Systems Group</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Systems Group</em>'.
	 * @see ca.gc.asc_csa.apogy.core.topology.SystemsTopologyAdapter#getSystemsGroup()
	 * @see #getSystemsTopologyAdapter()
	 * @generated
	 */
  EReference getSystemsTopologyAdapter_SystemsGroup();

  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.topology.ApogyEnvironmentNode <em>Apogy Environment Node</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Apogy Environment Node</em>'.
	 * @see ca.gc.asc_csa.apogy.core.topology.ApogyEnvironmentNode
	 * @generated
	 */
  EClass getApogyEnvironmentNode();

  /**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.topology.ApogyEnvironmentNode#getApogyEnvironment <em>Apogy Environment</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Apogy Environment</em>'.
	 * @see ca.gc.asc_csa.apogy.core.topology.ApogyEnvironmentNode#getApogyEnvironment()
	 * @see #getApogyEnvironmentNode()
	 * @generated
	 */
  EReference getApogyEnvironmentNode_ApogyEnvironment();

  /**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.topology.ApogyEnvironmentNode#getWorksiteNode <em>Worksite Node</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Worksite Node</em>'.
	 * @see ca.gc.asc_csa.apogy.core.topology.ApogyEnvironmentNode#getWorksiteNode()
	 * @see #getApogyEnvironmentNode()
	 * @generated
	 */
  EReference getApogyEnvironmentNode_WorksiteNode();

  /**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.topology.ApogyEnvironmentNode#getResultsListNode <em>Results List Node</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Results List Node</em>'.
	 * @see ca.gc.asc_csa.apogy.core.topology.ApogyEnvironmentNode#getResultsListNode()
	 * @see #getApogyEnvironmentNode()
	 * @generated
	 */
  EReference getApogyEnvironmentNode_ResultsListNode();

  /**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.topology.ApogyEnvironmentNode#getApogySystemAPIsNode <em>Apogy System AP Is Node</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Apogy System AP Is Node</em>'.
	 * @see ca.gc.asc_csa.apogy.core.topology.ApogyEnvironmentNode#getApogySystemAPIsNode()
	 * @see #getApogyEnvironmentNode()
	 * @generated
	 */
  EReference getApogyEnvironmentNode_ApogySystemAPIsNode();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.topology.ApogyEnvironmentNode#dispose() <em>Dispose</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Dispose</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.topology.ApogyEnvironmentNode#dispose()
	 * @generated
	 */
  EOperation getApogyEnvironmentNode__Dispose();

  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.topology.ApogySystemAPIsNode <em>Apogy System AP Is Node</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Apogy System AP Is Node</em>'.
	 * @see ca.gc.asc_csa.apogy.core.topology.ApogySystemAPIsNode
	 * @generated
	 */
  EClass getApogySystemAPIsNode();

  /**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.topology.ApogySystemAPIsNode#getApogyEnvironment <em>Apogy Environment</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Apogy Environment</em>'.
	 * @see ca.gc.asc_csa.apogy.core.topology.ApogySystemAPIsNode#getApogyEnvironment()
	 * @see #getApogySystemAPIsNode()
	 * @generated
	 */
  EReference getApogySystemAPIsNode_ApogyEnvironment();

  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.topology.ApogyCoreTopologyFacade <em>Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facade</em>'.
	 * @see ca.gc.asc_csa.apogy.core.topology.ApogyCoreTopologyFacade
	 * @generated
	 */
	EClass getApogyCoreTopologyFacade();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.topology.ApogyCoreTopologyFacade#getVariableOriginNode(ca.gc.asc_csa.apogy.core.invocator.Variable) <em>Get Variable Origin Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Variable Origin Node</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.topology.ApogyCoreTopologyFacade#getVariableOriginNode(ca.gc.asc_csa.apogy.core.invocator.Variable)
	 * @generated
	 */
	EOperation getApogyCoreTopologyFacade__GetVariableOriginNode__Variable();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.topology.ApogyCoreTopologyFacade#getAbstractTypeImplementationOriginNode(ca.gc.asc_csa.apogy.core.invocator.AbstractTypeImplementation) <em>Get Abstract Type Implementation Origin Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Abstract Type Implementation Origin Node</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.topology.ApogyCoreTopologyFacade#getAbstractTypeImplementationOriginNode(ca.gc.asc_csa.apogy.core.invocator.AbstractTypeImplementation)
	 * @generated
	 */
	EOperation getApogyCoreTopologyFacade__GetAbstractTypeImplementationOriginNode__AbstractTypeImplementation();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.topology.ApogyCoreTopologyFacade#createApogyEnvironmentNode(ca.gc.asc_csa.apogy.core.ApogyEnvironment) <em>Create Apogy Environment Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Apogy Environment Node</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.topology.ApogyCoreTopologyFacade#createApogyEnvironmentNode(ca.gc.asc_csa.apogy.core.ApogyEnvironment)
	 * @generated
	 */
	EOperation getApogyCoreTopologyFacade__CreateApogyEnvironmentNode__ApogyEnvironment();

		/**
	 * Returns the meta object for data type '{@link java.util.SortedSet <em>Sorted Set</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Sorted Set</em>'.
	 * @see java.util.SortedSet
	 * @model instanceClass="java.util.SortedSet" typeParameters="T"
	 * @generated
	 */
  EDataType getSortedSet();

  /**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ApogyCoreTopologyFactory getApogyCoreTopologyFactory();

		/**
	 * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each operation of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
	 * @generated
	 */
  interface Literals
  {
    /**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.topology.impl.SystemsTopologyAdapterImpl <em>Systems Topology Adapter</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.topology.impl.SystemsTopologyAdapterImpl
		 * @see ca.gc.asc_csa.apogy.core.topology.impl.ApogyCoreTopologyPackageImpl#getSystemsTopologyAdapter()
		 * @generated
		 */
    EClass SYSTEMS_TOPOLOGY_ADAPTER = eINSTANCE.getSystemsTopologyAdapter();

    /**
		 * The meta object literal for the '<em><b>Deployment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference SYSTEMS_TOPOLOGY_ADAPTER__DEPLOYMENT = eINSTANCE.getSystemsTopologyAdapter_Deployment();

    /**
		 * The meta object literal for the '<em><b>Systems Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference SYSTEMS_TOPOLOGY_ADAPTER__SYSTEMS_GROUP = eINSTANCE.getSystemsTopologyAdapter_SystemsGroup();

    /**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.topology.impl.ApogyEnvironmentNodeImpl <em>Apogy Environment Node</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.topology.impl.ApogyEnvironmentNodeImpl
		 * @see ca.gc.asc_csa.apogy.core.topology.impl.ApogyCoreTopologyPackageImpl#getApogyEnvironmentNode()
		 * @generated
		 */
    EClass APOGY_ENVIRONMENT_NODE = eINSTANCE.getApogyEnvironmentNode();

    /**
		 * The meta object literal for the '<em><b>Apogy Environment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference APOGY_ENVIRONMENT_NODE__APOGY_ENVIRONMENT = eINSTANCE.getApogyEnvironmentNode_ApogyEnvironment();

    /**
		 * The meta object literal for the '<em><b>Worksite Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference APOGY_ENVIRONMENT_NODE__WORKSITE_NODE = eINSTANCE.getApogyEnvironmentNode_WorksiteNode();

    /**
		 * The meta object literal for the '<em><b>Results List Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference APOGY_ENVIRONMENT_NODE__RESULTS_LIST_NODE = eINSTANCE.getApogyEnvironmentNode_ResultsListNode();

    /**
		 * The meta object literal for the '<em><b>Apogy System AP Is Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference APOGY_ENVIRONMENT_NODE__APOGY_SYSTEM_AP_IS_NODE = eINSTANCE.getApogyEnvironmentNode_ApogySystemAPIsNode();

    /**
		 * The meta object literal for the '<em><b>Dispose</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation APOGY_ENVIRONMENT_NODE___DISPOSE = eINSTANCE.getApogyEnvironmentNode__Dispose();

    /**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.topology.impl.ApogySystemAPIsNodeImpl <em>Apogy System AP Is Node</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.topology.impl.ApogySystemAPIsNodeImpl
		 * @see ca.gc.asc_csa.apogy.core.topology.impl.ApogyCoreTopologyPackageImpl#getApogySystemAPIsNode()
		 * @generated
		 */
    EClass APOGY_SYSTEM_AP_IS_NODE = eINSTANCE.getApogySystemAPIsNode();

    /**
		 * The meta object literal for the '<em><b>Apogy Environment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference APOGY_SYSTEM_AP_IS_NODE__APOGY_ENVIRONMENT = eINSTANCE.getApogySystemAPIsNode_ApogyEnvironment();

    /**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.topology.impl.ApogyCoreTopologyFacadeImpl <em>Facade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.topology.impl.ApogyCoreTopologyFacadeImpl
		 * @see ca.gc.asc_csa.apogy.core.topology.impl.ApogyCoreTopologyPackageImpl#getApogyCoreTopologyFacade()
		 * @generated
		 */
		EClass APOGY_CORE_TOPOLOGY_FACADE = eINSTANCE.getApogyCoreTopologyFacade();

				/**
		 * The meta object literal for the '<em><b>Get Variable Origin Node</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_TOPOLOGY_FACADE___GET_VARIABLE_ORIGIN_NODE__VARIABLE = eINSTANCE.getApogyCoreTopologyFacade__GetVariableOriginNode__Variable();

				/**
		 * The meta object literal for the '<em><b>Get Abstract Type Implementation Origin Node</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_TOPOLOGY_FACADE___GET_ABSTRACT_TYPE_IMPLEMENTATION_ORIGIN_NODE__ABSTRACTTYPEIMPLEMENTATION = eINSTANCE.getApogyCoreTopologyFacade__GetAbstractTypeImplementationOriginNode__AbstractTypeImplementation();

				/**
		 * The meta object literal for the '<em><b>Create Apogy Environment Node</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_TOPOLOGY_FACADE___CREATE_APOGY_ENVIRONMENT_NODE__SYMPHONYENVIRONMENT = eINSTANCE.getApogyCoreTopologyFacade__CreateApogyEnvironmentNode__ApogyEnvironment();

				/**
		 * The meta object literal for the '<em>Sorted Set</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see java.util.SortedSet
		 * @see ca.gc.asc_csa.apogy.core.topology.impl.ApogyCoreTopologyPackageImpl#getSortedSet()
		 * @generated
		 */
    EDataType SORTED_SET = eINSTANCE.getSortedSet();

  }

} //ApogyCoreTopologyPackage
