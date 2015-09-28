/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.topology;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import ca.gc.space.topology.TopologyPackage;

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
 * @see ca.gc.asc_csa.symphony.topology.SymphonyTopologyFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='SymphonyTopology' childCreationExtenders='true' extensibleProviderFactory='true' multipleEditorPages='false' copyrightText='Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)' modelName='SymphonyTopology' modelDirectory='/ca.gc.asc_csa.symphony.topology/src-generated' editDirectory='/ca.gc.asc_csa.symphony.topology.edit/src-generated' basePackage='ca.gc.asc_csa.symphony'"
 * @generated
 */
public interface SymphonyTopologyPackage extends EPackage
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
  String eNS_URI = "ca.gc.asc_csa.symphony.topology";

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
  SymphonyTopologyPackage eINSTANCE = ca.gc.asc_csa.symphony.topology.impl.SymphonyTopologyPackageImpl.init();

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.symphony.topology.impl.SystemsTopologyAdapterImpl <em>Systems Topology Adapter</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.symphony.topology.impl.SystemsTopologyAdapterImpl
	 * @see ca.gc.asc_csa.symphony.topology.impl.SymphonyTopologyPackageImpl#getSystemsTopologyAdapter()
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
	 * The meta object id for the '{@link ca.gc.asc_csa.symphony.topology.impl.SymphonyEnvironmentNodeImpl <em>Symphony Environment Node</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.symphony.topology.impl.SymphonyEnvironmentNodeImpl
	 * @see ca.gc.asc_csa.symphony.topology.impl.SymphonyTopologyPackageImpl#getSymphonyEnvironmentNode()
	 * @generated
	 */
  int SYMPHONY_ENVIRONMENT_NODE = 1;

  /**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SYMPHONY_ENVIRONMENT_NODE__PARENT = TopologyPackage.REFERENCED_GROUP_NODE__PARENT;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SYMPHONY_ENVIRONMENT_NODE__DESCRIPTION = TopologyPackage.REFERENCED_GROUP_NODE__DESCRIPTION;

  /**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SYMPHONY_ENVIRONMENT_NODE__NODE_ID = TopologyPackage.REFERENCED_GROUP_NODE__NODE_ID;

  /**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SYMPHONY_ENVIRONMENT_NODE__CHILDREN = TopologyPackage.REFERENCED_GROUP_NODE__CHILDREN;

  /**
	 * The feature id for the '<em><b>Referenced Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SYMPHONY_ENVIRONMENT_NODE__REFERENCED_CHILDREN = TopologyPackage.REFERENCED_GROUP_NODE__REFERENCED_CHILDREN;

  /**
	 * The feature id for the '<em><b>Symphony Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SYMPHONY_ENVIRONMENT_NODE__SYMPHONY_ENVIRONMENT = TopologyPackage.REFERENCED_GROUP_NODE_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Worksite Node</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SYMPHONY_ENVIRONMENT_NODE__WORKSITE_NODE = TopologyPackage.REFERENCED_GROUP_NODE_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Results List Node</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SYMPHONY_ENVIRONMENT_NODE__RESULTS_LIST_NODE = TopologyPackage.REFERENCED_GROUP_NODE_FEATURE_COUNT + 2;

  /**
	 * The feature id for the '<em><b>Symphony System AP Is Node</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SYMPHONY_ENVIRONMENT_NODE__SYMPHONY_SYSTEM_AP_IS_NODE = TopologyPackage.REFERENCED_GROUP_NODE_FEATURE_COUNT + 3;

  /**
	 * The number of structural features of the '<em>Symphony Environment Node</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SYMPHONY_ENVIRONMENT_NODE_FEATURE_COUNT = TopologyPackage.REFERENCED_GROUP_NODE_FEATURE_COUNT + 4;

  /**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SYMPHONY_ENVIRONMENT_NODE___ACCEPT__INODEVISITOR = TopologyPackage.REFERENCED_GROUP_NODE___ACCEPT__INODEVISITOR;

  /**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SYMPHONY_ENVIRONMENT_NODE___DISPOSE = TopologyPackage.REFERENCED_GROUP_NODE_OPERATION_COUNT + 0;

  /**
	 * The number of operations of the '<em>Symphony Environment Node</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SYMPHONY_ENVIRONMENT_NODE_OPERATION_COUNT = TopologyPackage.REFERENCED_GROUP_NODE_OPERATION_COUNT + 1;

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.symphony.topology.impl.SymphonySystemAPIsNodeImpl <em>Symphony System AP Is Node</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.symphony.topology.impl.SymphonySystemAPIsNodeImpl
	 * @see ca.gc.asc_csa.symphony.topology.impl.SymphonyTopologyPackageImpl#getSymphonySystemAPIsNode()
	 * @generated
	 */
  int SYMPHONY_SYSTEM_AP_IS_NODE = 2;

  /**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SYMPHONY_SYSTEM_AP_IS_NODE__PARENT = TopologyPackage.REFERENCED_GROUP_NODE__PARENT;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SYMPHONY_SYSTEM_AP_IS_NODE__DESCRIPTION = TopologyPackage.REFERENCED_GROUP_NODE__DESCRIPTION;

  /**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SYMPHONY_SYSTEM_AP_IS_NODE__NODE_ID = TopologyPackage.REFERENCED_GROUP_NODE__NODE_ID;

  /**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SYMPHONY_SYSTEM_AP_IS_NODE__CHILDREN = TopologyPackage.REFERENCED_GROUP_NODE__CHILDREN;

  /**
	 * The feature id for the '<em><b>Referenced Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SYMPHONY_SYSTEM_AP_IS_NODE__REFERENCED_CHILDREN = TopologyPackage.REFERENCED_GROUP_NODE__REFERENCED_CHILDREN;

  /**
	 * The feature id for the '<em><b>Symphony Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SYMPHONY_SYSTEM_AP_IS_NODE__SYMPHONY_ENVIRONMENT = TopologyPackage.REFERENCED_GROUP_NODE_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Symphony System AP Is Node</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SYMPHONY_SYSTEM_AP_IS_NODE_FEATURE_COUNT = TopologyPackage.REFERENCED_GROUP_NODE_FEATURE_COUNT + 1;

  /**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SYMPHONY_SYSTEM_AP_IS_NODE___ACCEPT__INODEVISITOR = TopologyPackage.REFERENCED_GROUP_NODE___ACCEPT__INODEVISITOR;

  /**
	 * The number of operations of the '<em>Symphony System AP Is Node</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SYMPHONY_SYSTEM_AP_IS_NODE_OPERATION_COUNT = TopologyPackage.REFERENCED_GROUP_NODE_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.symphony.topology.impl.SymphonyTopologyFacadeImpl <em>Facade</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.symphony.topology.impl.SymphonyTopologyFacadeImpl
	 * @see ca.gc.asc_csa.symphony.topology.impl.SymphonyTopologyPackageImpl#getSymphonyTopologyFacade()
	 * @generated
	 */
  int SYMPHONY_TOPOLOGY_FACADE = 3;

  /**
	 * The number of structural features of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SYMPHONY_TOPOLOGY_FACADE_FEATURE_COUNT = 0;

  /**
	 * The operation id for the '<em>Get Variable Origin Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_TOPOLOGY_FACADE___GET_VARIABLE_ORIGIN_NODE__VARIABLE = 0;

		/**
	 * The operation id for the '<em>Get Abstract Type Implementation Origin Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_TOPOLOGY_FACADE___GET_ABSTRACT_TYPE_IMPLEMENTATION_ORIGIN_NODE__ABSTRACTTYPEIMPLEMENTATION = 1;

		/**
	 * The operation id for the '<em>Create Symphony Environment Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_TOPOLOGY_FACADE___CREATE_SYMPHONY_ENVIRONMENT_NODE__SYMPHONYENVIRONMENT = 2;

		/**
	 * The number of operations of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SYMPHONY_TOPOLOGY_FACADE_OPERATION_COUNT = 3;

  /**
	 * The meta object id for the '<em>Sorted Set</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see java.util.SortedSet
	 * @see ca.gc.asc_csa.symphony.topology.impl.SymphonyTopologyPackageImpl#getSortedSet()
	 * @generated
	 */
  int SORTED_SET = 4;


  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.symphony.topology.SystemsTopologyAdapter <em>Systems Topology Adapter</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Systems Topology Adapter</em>'.
	 * @see ca.gc.asc_csa.symphony.topology.SystemsTopologyAdapter
	 * @generated
	 */
  EClass getSystemsTopologyAdapter();

  /**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.symphony.topology.SystemsTopologyAdapter#getDeployment <em>Deployment</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Deployment</em>'.
	 * @see ca.gc.asc_csa.symphony.topology.SystemsTopologyAdapter#getDeployment()
	 * @see #getSystemsTopologyAdapter()
	 * @generated
	 */
  EReference getSystemsTopologyAdapter_Deployment();

  /**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.symphony.topology.SystemsTopologyAdapter#getSystemsGroup <em>Systems Group</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Systems Group</em>'.
	 * @see ca.gc.asc_csa.symphony.topology.SystemsTopologyAdapter#getSystemsGroup()
	 * @see #getSystemsTopologyAdapter()
	 * @generated
	 */
  EReference getSystemsTopologyAdapter_SystemsGroup();

  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.symphony.topology.SymphonyEnvironmentNode <em>Symphony Environment Node</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Symphony Environment Node</em>'.
	 * @see ca.gc.asc_csa.symphony.topology.SymphonyEnvironmentNode
	 * @generated
	 */
  EClass getSymphonyEnvironmentNode();

  /**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.symphony.topology.SymphonyEnvironmentNode#getSymphonyEnvironment <em>Symphony Environment</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Symphony Environment</em>'.
	 * @see ca.gc.asc_csa.symphony.topology.SymphonyEnvironmentNode#getSymphonyEnvironment()
	 * @see #getSymphonyEnvironmentNode()
	 * @generated
	 */
  EReference getSymphonyEnvironmentNode_SymphonyEnvironment();

  /**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.symphony.topology.SymphonyEnvironmentNode#getWorksiteNode <em>Worksite Node</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Worksite Node</em>'.
	 * @see ca.gc.asc_csa.symphony.topology.SymphonyEnvironmentNode#getWorksiteNode()
	 * @see #getSymphonyEnvironmentNode()
	 * @generated
	 */
  EReference getSymphonyEnvironmentNode_WorksiteNode();

  /**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.symphony.topology.SymphonyEnvironmentNode#getResultsListNode <em>Results List Node</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Results List Node</em>'.
	 * @see ca.gc.asc_csa.symphony.topology.SymphonyEnvironmentNode#getResultsListNode()
	 * @see #getSymphonyEnvironmentNode()
	 * @generated
	 */
  EReference getSymphonyEnvironmentNode_ResultsListNode();

  /**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.symphony.topology.SymphonyEnvironmentNode#getSymphonySystemAPIsNode <em>Symphony System AP Is Node</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Symphony System AP Is Node</em>'.
	 * @see ca.gc.asc_csa.symphony.topology.SymphonyEnvironmentNode#getSymphonySystemAPIsNode()
	 * @see #getSymphonyEnvironmentNode()
	 * @generated
	 */
  EReference getSymphonyEnvironmentNode_SymphonySystemAPIsNode();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.symphony.topology.SymphonyEnvironmentNode#dispose() <em>Dispose</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Dispose</em>' operation.
	 * @see ca.gc.asc_csa.symphony.topology.SymphonyEnvironmentNode#dispose()
	 * @generated
	 */
  EOperation getSymphonyEnvironmentNode__Dispose();

  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.symphony.topology.SymphonySystemAPIsNode <em>Symphony System AP Is Node</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Symphony System AP Is Node</em>'.
	 * @see ca.gc.asc_csa.symphony.topology.SymphonySystemAPIsNode
	 * @generated
	 */
  EClass getSymphonySystemAPIsNode();

  /**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.symphony.topology.SymphonySystemAPIsNode#getSymphonyEnvironment <em>Symphony Environment</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Symphony Environment</em>'.
	 * @see ca.gc.asc_csa.symphony.topology.SymphonySystemAPIsNode#getSymphonyEnvironment()
	 * @see #getSymphonySystemAPIsNode()
	 * @generated
	 */
  EReference getSymphonySystemAPIsNode_SymphonyEnvironment();

  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.symphony.topology.SymphonyTopologyFacade <em>Facade</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facade</em>'.
	 * @see ca.gc.asc_csa.symphony.topology.SymphonyTopologyFacade
	 * @generated
	 */
  EClass getSymphonyTopologyFacade();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.symphony.topology.SymphonyTopologyFacade#getVariableOriginNode(ca.gc.asc_csa.eclipse.emf.ecore.invocator.Variable) <em>Get Variable Origin Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Variable Origin Node</em>' operation.
	 * @see ca.gc.asc_csa.symphony.topology.SymphonyTopologyFacade#getVariableOriginNode(ca.gc.asc_csa.eclipse.emf.ecore.invocator.Variable)
	 * @generated
	 */
	EOperation getSymphonyTopologyFacade__GetVariableOriginNode__Variable();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.symphony.topology.SymphonyTopologyFacade#getAbstractTypeImplementationOriginNode(ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractTypeImplementation) <em>Get Abstract Type Implementation Origin Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Abstract Type Implementation Origin Node</em>' operation.
	 * @see ca.gc.asc_csa.symphony.topology.SymphonyTopologyFacade#getAbstractTypeImplementationOriginNode(ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractTypeImplementation)
	 * @generated
	 */
	EOperation getSymphonyTopologyFacade__GetAbstractTypeImplementationOriginNode__AbstractTypeImplementation();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.symphony.topology.SymphonyTopologyFacade#createSymphonyEnvironmentNode(ca.gc.asc_csa.symphony.core.SymphonyEnvironment) <em>Create Symphony Environment Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Symphony Environment Node</em>' operation.
	 * @see ca.gc.asc_csa.symphony.topology.SymphonyTopologyFacade#createSymphonyEnvironmentNode(ca.gc.asc_csa.symphony.core.SymphonyEnvironment)
	 * @generated
	 */
	EOperation getSymphonyTopologyFacade__CreateSymphonyEnvironmentNode__SymphonyEnvironment();

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
  SymphonyTopologyFactory getSymphonyTopologyFactory();

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
		 * The meta object literal for the '{@link ca.gc.asc_csa.symphony.topology.impl.SystemsTopologyAdapterImpl <em>Systems Topology Adapter</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.symphony.topology.impl.SystemsTopologyAdapterImpl
		 * @see ca.gc.asc_csa.symphony.topology.impl.SymphonyTopologyPackageImpl#getSystemsTopologyAdapter()
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
		 * The meta object literal for the '{@link ca.gc.asc_csa.symphony.topology.impl.SymphonyEnvironmentNodeImpl <em>Symphony Environment Node</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.symphony.topology.impl.SymphonyEnvironmentNodeImpl
		 * @see ca.gc.asc_csa.symphony.topology.impl.SymphonyTopologyPackageImpl#getSymphonyEnvironmentNode()
		 * @generated
		 */
    EClass SYMPHONY_ENVIRONMENT_NODE = eINSTANCE.getSymphonyEnvironmentNode();

    /**
		 * The meta object literal for the '<em><b>Symphony Environment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference SYMPHONY_ENVIRONMENT_NODE__SYMPHONY_ENVIRONMENT = eINSTANCE.getSymphonyEnvironmentNode_SymphonyEnvironment();

    /**
		 * The meta object literal for the '<em><b>Worksite Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference SYMPHONY_ENVIRONMENT_NODE__WORKSITE_NODE = eINSTANCE.getSymphonyEnvironmentNode_WorksiteNode();

    /**
		 * The meta object literal for the '<em><b>Results List Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference SYMPHONY_ENVIRONMENT_NODE__RESULTS_LIST_NODE = eINSTANCE.getSymphonyEnvironmentNode_ResultsListNode();

    /**
		 * The meta object literal for the '<em><b>Symphony System AP Is Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference SYMPHONY_ENVIRONMENT_NODE__SYMPHONY_SYSTEM_AP_IS_NODE = eINSTANCE.getSymphonyEnvironmentNode_SymphonySystemAPIsNode();

    /**
		 * The meta object literal for the '<em><b>Dispose</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation SYMPHONY_ENVIRONMENT_NODE___DISPOSE = eINSTANCE.getSymphonyEnvironmentNode__Dispose();

    /**
		 * The meta object literal for the '{@link ca.gc.asc_csa.symphony.topology.impl.SymphonySystemAPIsNodeImpl <em>Symphony System AP Is Node</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.symphony.topology.impl.SymphonySystemAPIsNodeImpl
		 * @see ca.gc.asc_csa.symphony.topology.impl.SymphonyTopologyPackageImpl#getSymphonySystemAPIsNode()
		 * @generated
		 */
    EClass SYMPHONY_SYSTEM_AP_IS_NODE = eINSTANCE.getSymphonySystemAPIsNode();

    /**
		 * The meta object literal for the '<em><b>Symphony Environment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference SYMPHONY_SYSTEM_AP_IS_NODE__SYMPHONY_ENVIRONMENT = eINSTANCE.getSymphonySystemAPIsNode_SymphonyEnvironment();

    /**
		 * The meta object literal for the '{@link ca.gc.asc_csa.symphony.topology.impl.SymphonyTopologyFacadeImpl <em>Facade</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.symphony.topology.impl.SymphonyTopologyFacadeImpl
		 * @see ca.gc.asc_csa.symphony.topology.impl.SymphonyTopologyPackageImpl#getSymphonyTopologyFacade()
		 * @generated
		 */
    EClass SYMPHONY_TOPOLOGY_FACADE = eINSTANCE.getSymphonyTopologyFacade();

    /**
		 * The meta object literal for the '<em><b>Get Variable Origin Node</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMPHONY_TOPOLOGY_FACADE___GET_VARIABLE_ORIGIN_NODE__VARIABLE = eINSTANCE.getSymphonyTopologyFacade__GetVariableOriginNode__Variable();

				/**
		 * The meta object literal for the '<em><b>Get Abstract Type Implementation Origin Node</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMPHONY_TOPOLOGY_FACADE___GET_ABSTRACT_TYPE_IMPLEMENTATION_ORIGIN_NODE__ABSTRACTTYPEIMPLEMENTATION = eINSTANCE.getSymphonyTopologyFacade__GetAbstractTypeImplementationOriginNode__AbstractTypeImplementation();

				/**
		 * The meta object literal for the '<em><b>Create Symphony Environment Node</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMPHONY_TOPOLOGY_FACADE___CREATE_SYMPHONY_ENVIRONMENT_NODE__SYMPHONYENVIRONMENT = eINSTANCE.getSymphonyTopologyFacade__CreateSymphonyEnvironmentNode__SymphonyEnvironment();

				/**
		 * The meta object literal for the '<em>Sorted Set</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see java.util.SortedSet
		 * @see ca.gc.asc_csa.symphony.topology.impl.SymphonyTopologyPackageImpl#getSortedSet()
		 * @generated
		 */
    EDataType SORTED_SET = eINSTANCE.getSortedSet();

  }

} //SymphonyTopologyPackage
