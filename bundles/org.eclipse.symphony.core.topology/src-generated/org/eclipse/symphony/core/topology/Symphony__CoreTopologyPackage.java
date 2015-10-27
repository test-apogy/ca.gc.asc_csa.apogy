/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.topology;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.symphony.common.topology.Symphony__CommonTopologyPackage;

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
 * @see org.eclipse.symphony.core.topology.Symphony__CoreTopologyFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='Symphony__CoreTopology' childCreationExtenders='true' extensibleProviderFactory='true' multipleEditorPages='false' copyrightText='Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)' modelName='Symphony__CoreTopology' modelDirectory='/org.eclipse.symphony.core.topology/src-generated' editDirectory='/org.eclipse.symphony.core.topology.edit/src-generated' basePackage='org.eclipse.symphony.core'"
 * @generated
 */
public interface Symphony__CoreTopologyPackage extends EPackage
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
  String eNS_URI = "org.eclipse.symphony.core.topology";

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
  Symphony__CoreTopologyPackage eINSTANCE = org.eclipse.symphony.core.topology.impl.Symphony__CoreTopologyPackageImpl.init();

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.core.topology.impl.SystemsTopologyAdapterImpl <em>Systems Topology Adapter</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.topology.impl.SystemsTopologyAdapterImpl
	 * @see org.eclipse.symphony.core.topology.impl.Symphony__CoreTopologyPackageImpl#getSystemsTopologyAdapter()
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
	 * The meta object id for the '{@link org.eclipse.symphony.core.topology.impl.SymphonyEnvironmentNodeImpl <em>Symphony Environment Node</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.topology.impl.SymphonyEnvironmentNodeImpl
	 * @see org.eclipse.symphony.core.topology.impl.Symphony__CoreTopologyPackageImpl#getSymphonyEnvironmentNode()
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
  int SYMPHONY_ENVIRONMENT_NODE__PARENT = Symphony__CommonTopologyPackage.REFERENCED_GROUP_NODE__PARENT;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SYMPHONY_ENVIRONMENT_NODE__DESCRIPTION = Symphony__CommonTopologyPackage.REFERENCED_GROUP_NODE__DESCRIPTION;

  /**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SYMPHONY_ENVIRONMENT_NODE__NODE_ID = Symphony__CommonTopologyPackage.REFERENCED_GROUP_NODE__NODE_ID;

  /**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SYMPHONY_ENVIRONMENT_NODE__CHILDREN = Symphony__CommonTopologyPackage.REFERENCED_GROUP_NODE__CHILDREN;

  /**
	 * The feature id for the '<em><b>Referenced Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SYMPHONY_ENVIRONMENT_NODE__REFERENCED_CHILDREN = Symphony__CommonTopologyPackage.REFERENCED_GROUP_NODE__REFERENCED_CHILDREN;

  /**
	 * The feature id for the '<em><b>Symphony Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SYMPHONY_ENVIRONMENT_NODE__SYMPHONY_ENVIRONMENT = Symphony__CommonTopologyPackage.REFERENCED_GROUP_NODE_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Worksite Node</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SYMPHONY_ENVIRONMENT_NODE__WORKSITE_NODE = Symphony__CommonTopologyPackage.REFERENCED_GROUP_NODE_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Results List Node</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SYMPHONY_ENVIRONMENT_NODE__RESULTS_LIST_NODE = Symphony__CommonTopologyPackage.REFERENCED_GROUP_NODE_FEATURE_COUNT + 2;

  /**
	 * The feature id for the '<em><b>Symphony System AP Is Node</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SYMPHONY_ENVIRONMENT_NODE__SYMPHONY_SYSTEM_AP_IS_NODE = Symphony__CommonTopologyPackage.REFERENCED_GROUP_NODE_FEATURE_COUNT + 3;

  /**
	 * The number of structural features of the '<em>Symphony Environment Node</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SYMPHONY_ENVIRONMENT_NODE_FEATURE_COUNT = Symphony__CommonTopologyPackage.REFERENCED_GROUP_NODE_FEATURE_COUNT + 4;

  /**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SYMPHONY_ENVIRONMENT_NODE___ACCEPT__INODEVISITOR = Symphony__CommonTopologyPackage.REFERENCED_GROUP_NODE___ACCEPT__INODEVISITOR;

  /**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SYMPHONY_ENVIRONMENT_NODE___DISPOSE = Symphony__CommonTopologyPackage.REFERENCED_GROUP_NODE_OPERATION_COUNT + 0;

  /**
	 * The number of operations of the '<em>Symphony Environment Node</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SYMPHONY_ENVIRONMENT_NODE_OPERATION_COUNT = Symphony__CommonTopologyPackage.REFERENCED_GROUP_NODE_OPERATION_COUNT + 1;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.core.topology.impl.SymphonySystemAPIsNodeImpl <em>Symphony System AP Is Node</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.topology.impl.SymphonySystemAPIsNodeImpl
	 * @see org.eclipse.symphony.core.topology.impl.Symphony__CoreTopologyPackageImpl#getSymphonySystemAPIsNode()
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
  int SYMPHONY_SYSTEM_AP_IS_NODE__PARENT = Symphony__CommonTopologyPackage.REFERENCED_GROUP_NODE__PARENT;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SYMPHONY_SYSTEM_AP_IS_NODE__DESCRIPTION = Symphony__CommonTopologyPackage.REFERENCED_GROUP_NODE__DESCRIPTION;

  /**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SYMPHONY_SYSTEM_AP_IS_NODE__NODE_ID = Symphony__CommonTopologyPackage.REFERENCED_GROUP_NODE__NODE_ID;

  /**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SYMPHONY_SYSTEM_AP_IS_NODE__CHILDREN = Symphony__CommonTopologyPackage.REFERENCED_GROUP_NODE__CHILDREN;

  /**
	 * The feature id for the '<em><b>Referenced Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SYMPHONY_SYSTEM_AP_IS_NODE__REFERENCED_CHILDREN = Symphony__CommonTopologyPackage.REFERENCED_GROUP_NODE__REFERENCED_CHILDREN;

  /**
	 * The feature id for the '<em><b>Symphony Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SYMPHONY_SYSTEM_AP_IS_NODE__SYMPHONY_ENVIRONMENT = Symphony__CommonTopologyPackage.REFERENCED_GROUP_NODE_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Symphony System AP Is Node</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SYMPHONY_SYSTEM_AP_IS_NODE_FEATURE_COUNT = Symphony__CommonTopologyPackage.REFERENCED_GROUP_NODE_FEATURE_COUNT + 1;

  /**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SYMPHONY_SYSTEM_AP_IS_NODE___ACCEPT__INODEVISITOR = Symphony__CommonTopologyPackage.REFERENCED_GROUP_NODE___ACCEPT__INODEVISITOR;

  /**
	 * The number of operations of the '<em>Symphony System AP Is Node</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SYMPHONY_SYSTEM_AP_IS_NODE_OPERATION_COUNT = Symphony__CommonTopologyPackage.REFERENCED_GROUP_NODE_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.core.topology.impl.Symphony__CoreTopologyFacadeImpl <em>Facade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.topology.impl.Symphony__CoreTopologyFacadeImpl
	 * @see org.eclipse.symphony.core.topology.impl.Symphony__CoreTopologyPackageImpl#getSymphony__CoreTopologyFacade()
	 * @generated
	 */
	int SYMPHONY_CORE_TOPOLOGY_FACADE = 3;

		/**
	 * The number of structural features of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_CORE_TOPOLOGY_FACADE_FEATURE_COUNT = 0;

		/**
	 * The operation id for the '<em>Get Variable Origin Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_CORE_TOPOLOGY_FACADE___GET_VARIABLE_ORIGIN_NODE__VARIABLE = 0;

		/**
	 * The operation id for the '<em>Get Abstract Type Implementation Origin Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_CORE_TOPOLOGY_FACADE___GET_ABSTRACT_TYPE_IMPLEMENTATION_ORIGIN_NODE__ABSTRACTTYPEIMPLEMENTATION = 1;

		/**
	 * The operation id for the '<em>Create Symphony Environment Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_CORE_TOPOLOGY_FACADE___CREATE_SYMPHONY_ENVIRONMENT_NODE__SYMPHONYENVIRONMENT = 2;

		/**
	 * The number of operations of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_CORE_TOPOLOGY_FACADE_OPERATION_COUNT = 3;

		/**
	 * The meta object id for the '<em>Sorted Set</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see java.util.SortedSet
	 * @see org.eclipse.symphony.core.topology.impl.Symphony__CoreTopologyPackageImpl#getSortedSet()
	 * @generated
	 */
  int SORTED_SET = 4;


  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.topology.SystemsTopologyAdapter <em>Systems Topology Adapter</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Systems Topology Adapter</em>'.
	 * @see org.eclipse.symphony.core.topology.SystemsTopologyAdapter
	 * @generated
	 */
  EClass getSystemsTopologyAdapter();

  /**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.core.topology.SystemsTopologyAdapter#getDeployment <em>Deployment</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Deployment</em>'.
	 * @see org.eclipse.symphony.core.topology.SystemsTopologyAdapter#getDeployment()
	 * @see #getSystemsTopologyAdapter()
	 * @generated
	 */
  EReference getSystemsTopologyAdapter_Deployment();

  /**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.core.topology.SystemsTopologyAdapter#getSystemsGroup <em>Systems Group</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Systems Group</em>'.
	 * @see org.eclipse.symphony.core.topology.SystemsTopologyAdapter#getSystemsGroup()
	 * @see #getSystemsTopologyAdapter()
	 * @generated
	 */
  EReference getSystemsTopologyAdapter_SystemsGroup();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.topology.SymphonyEnvironmentNode <em>Symphony Environment Node</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Symphony Environment Node</em>'.
	 * @see org.eclipse.symphony.core.topology.SymphonyEnvironmentNode
	 * @generated
	 */
  EClass getSymphonyEnvironmentNode();

  /**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.core.topology.SymphonyEnvironmentNode#getSymphonyEnvironment <em>Symphony Environment</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Symphony Environment</em>'.
	 * @see org.eclipse.symphony.core.topology.SymphonyEnvironmentNode#getSymphonyEnvironment()
	 * @see #getSymphonyEnvironmentNode()
	 * @generated
	 */
  EReference getSymphonyEnvironmentNode_SymphonyEnvironment();

  /**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.core.topology.SymphonyEnvironmentNode#getWorksiteNode <em>Worksite Node</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Worksite Node</em>'.
	 * @see org.eclipse.symphony.core.topology.SymphonyEnvironmentNode#getWorksiteNode()
	 * @see #getSymphonyEnvironmentNode()
	 * @generated
	 */
  EReference getSymphonyEnvironmentNode_WorksiteNode();

  /**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.core.topology.SymphonyEnvironmentNode#getResultsListNode <em>Results List Node</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Results List Node</em>'.
	 * @see org.eclipse.symphony.core.topology.SymphonyEnvironmentNode#getResultsListNode()
	 * @see #getSymphonyEnvironmentNode()
	 * @generated
	 */
  EReference getSymphonyEnvironmentNode_ResultsListNode();

  /**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.core.topology.SymphonyEnvironmentNode#getSymphonySystemAPIsNode <em>Symphony System AP Is Node</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Symphony System AP Is Node</em>'.
	 * @see org.eclipse.symphony.core.topology.SymphonyEnvironmentNode#getSymphonySystemAPIsNode()
	 * @see #getSymphonyEnvironmentNode()
	 * @generated
	 */
  EReference getSymphonyEnvironmentNode_SymphonySystemAPIsNode();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.topology.SymphonyEnvironmentNode#dispose() <em>Dispose</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Dispose</em>' operation.
	 * @see org.eclipse.symphony.core.topology.SymphonyEnvironmentNode#dispose()
	 * @generated
	 */
  EOperation getSymphonyEnvironmentNode__Dispose();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.topology.SymphonySystemAPIsNode <em>Symphony System AP Is Node</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Symphony System AP Is Node</em>'.
	 * @see org.eclipse.symphony.core.topology.SymphonySystemAPIsNode
	 * @generated
	 */
  EClass getSymphonySystemAPIsNode();

  /**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.core.topology.SymphonySystemAPIsNode#getSymphonyEnvironment <em>Symphony Environment</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Symphony Environment</em>'.
	 * @see org.eclipse.symphony.core.topology.SymphonySystemAPIsNode#getSymphonyEnvironment()
	 * @see #getSymphonySystemAPIsNode()
	 * @generated
	 */
  EReference getSymphonySystemAPIsNode_SymphonyEnvironment();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.topology.Symphony__CoreTopologyFacade <em>Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facade</em>'.
	 * @see org.eclipse.symphony.core.topology.Symphony__CoreTopologyFacade
	 * @generated
	 */
	EClass getSymphony__CoreTopologyFacade();

		/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.topology.Symphony__CoreTopologyFacade#getVariableOriginNode(org.eclipse.symphony.core.invocator.Variable) <em>Get Variable Origin Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Variable Origin Node</em>' operation.
	 * @see org.eclipse.symphony.core.topology.Symphony__CoreTopologyFacade#getVariableOriginNode(org.eclipse.symphony.core.invocator.Variable)
	 * @generated
	 */
	EOperation getSymphony__CoreTopologyFacade__GetVariableOriginNode__Variable();

		/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.topology.Symphony__CoreTopologyFacade#getAbstractTypeImplementationOriginNode(org.eclipse.symphony.core.invocator.AbstractTypeImplementation) <em>Get Abstract Type Implementation Origin Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Abstract Type Implementation Origin Node</em>' operation.
	 * @see org.eclipse.symphony.core.topology.Symphony__CoreTopologyFacade#getAbstractTypeImplementationOriginNode(org.eclipse.symphony.core.invocator.AbstractTypeImplementation)
	 * @generated
	 */
	EOperation getSymphony__CoreTopologyFacade__GetAbstractTypeImplementationOriginNode__AbstractTypeImplementation();

		/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.topology.Symphony__CoreTopologyFacade#createSymphonyEnvironmentNode(org.eclipse.symphony.core.SymphonyEnvironment) <em>Create Symphony Environment Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Symphony Environment Node</em>' operation.
	 * @see org.eclipse.symphony.core.topology.Symphony__CoreTopologyFacade#createSymphonyEnvironmentNode(org.eclipse.symphony.core.SymphonyEnvironment)
	 * @generated
	 */
	EOperation getSymphony__CoreTopologyFacade__CreateSymphonyEnvironmentNode__SymphonyEnvironment();

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
	Symphony__CoreTopologyFactory getSymphony__CoreTopologyFactory();

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
		 * The meta object literal for the '{@link org.eclipse.symphony.core.topology.impl.SystemsTopologyAdapterImpl <em>Systems Topology Adapter</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.topology.impl.SystemsTopologyAdapterImpl
		 * @see org.eclipse.symphony.core.topology.impl.Symphony__CoreTopologyPackageImpl#getSystemsTopologyAdapter()
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
		 * The meta object literal for the '{@link org.eclipse.symphony.core.topology.impl.SymphonyEnvironmentNodeImpl <em>Symphony Environment Node</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.topology.impl.SymphonyEnvironmentNodeImpl
		 * @see org.eclipse.symphony.core.topology.impl.Symphony__CoreTopologyPackageImpl#getSymphonyEnvironmentNode()
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
		 * The meta object literal for the '{@link org.eclipse.symphony.core.topology.impl.SymphonySystemAPIsNodeImpl <em>Symphony System AP Is Node</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.topology.impl.SymphonySystemAPIsNodeImpl
		 * @see org.eclipse.symphony.core.topology.impl.Symphony__CoreTopologyPackageImpl#getSymphonySystemAPIsNode()
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
		 * The meta object literal for the '{@link org.eclipse.symphony.core.topology.impl.Symphony__CoreTopologyFacadeImpl <em>Facade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.topology.impl.Symphony__CoreTopologyFacadeImpl
		 * @see org.eclipse.symphony.core.topology.impl.Symphony__CoreTopologyPackageImpl#getSymphony__CoreTopologyFacade()
		 * @generated
		 */
		EClass SYMPHONY_CORE_TOPOLOGY_FACADE = eINSTANCE.getSymphony__CoreTopologyFacade();

				/**
		 * The meta object literal for the '<em><b>Get Variable Origin Node</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMPHONY_CORE_TOPOLOGY_FACADE___GET_VARIABLE_ORIGIN_NODE__VARIABLE = eINSTANCE.getSymphony__CoreTopologyFacade__GetVariableOriginNode__Variable();

				/**
		 * The meta object literal for the '<em><b>Get Abstract Type Implementation Origin Node</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMPHONY_CORE_TOPOLOGY_FACADE___GET_ABSTRACT_TYPE_IMPLEMENTATION_ORIGIN_NODE__ABSTRACTTYPEIMPLEMENTATION = eINSTANCE.getSymphony__CoreTopologyFacade__GetAbstractTypeImplementationOriginNode__AbstractTypeImplementation();

				/**
		 * The meta object literal for the '<em><b>Create Symphony Environment Node</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMPHONY_CORE_TOPOLOGY_FACADE___CREATE_SYMPHONY_ENVIRONMENT_NODE__SYMPHONYENVIRONMENT = eINSTANCE.getSymphony__CoreTopologyFacade__CreateSymphonyEnvironmentNode__SymphonyEnvironment();

				/**
		 * The meta object literal for the '<em>Sorted Set</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see java.util.SortedSet
		 * @see org.eclipse.symphony.core.topology.impl.Symphony__CoreTopologyPackageImpl#getSortedSet()
		 * @generated
		 */
    EDataType SORTED_SET = eINSTANCE.getSortedSet();

  }

} //Symphony__CoreTopologyPackage
