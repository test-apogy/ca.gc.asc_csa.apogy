/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package org.eclipse.symphony.core;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.symphony.common.emf.Symphony__CommonEMFPackage;
import org.eclipse.symphony.common.topology.Symphony__CommonTopologyPackage;
import org.eclipse.symphony.core.invocator.Symphony__CoreInvocatorPackage;

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
 * @see org.eclipse.symphony.core.Symphony__CoreFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='Symphony__Core' childCreationExtenders='true' extensibleProviderFactory='true' copyrightText='Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)' modelName='Symphony__Core' multipleEditorPages='false' fileExtensions='sym' modelDirectory='/org.eclipse.symphony.core/src-generated' editDirectory='/org.eclipse.symphony.core.edit/src-generated' basePackage='org.eclipse.symphony'"
 * @generated
 */
public interface Symphony__CorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "core";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.eclipse.symphony.core";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "core";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Symphony__CorePackage eINSTANCE = org.eclipse.symphony.core.impl.Symphony__CorePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.core.impl.Symphony__CoreFacadeImpl <em>Facade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.impl.Symphony__CoreFacadeImpl
	 * @see org.eclipse.symphony.core.impl.Symphony__CorePackageImpl#getSymphony__CoreFacade()
	 * @generated
	 */
	int SYMPHONY_CORE_FACADE = 0;

	/**
	 * The number of structural features of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_CORE_FACADE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Compute Absolute Pose Matrix</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_CORE_FACADE___COMPUTE_ABSOLUTE_POSE_MATRIX__SYMPHONYSYSTEM_MATRIX4X4 = 0;

	/**
	 * The operation id for the '<em>Create Result Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_CORE_FACADE___CREATE_RESULT_NODE__POSITIONEDRESULT = 1;

	/**
	 * The operation id for the '<em>Create Symphony Session</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_CORE_FACADE___CREATE_SYMPHONY_SESSION__BOOLEAN_BOOLEAN_BOOLEAN_BOOLEAN = 2;

	/**
	 * The operation id for the '<em>Get Symphony System</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_CORE_FACADE___GET_SYMPHONY_SYSTEM__ENVIRONMENT_STRING = 3;

	/**
	 * The operation id for the '<em>Load Feature Of Interest From File</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_CORE_FACADE___LOAD_FEATURE_OF_INTEREST_FROM_FILE__STRING = 4;

	/**
	 * The operation id for the '<em>Save Feature Of Interest To File</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_CORE_FACADE___SAVE_FEATURE_OF_INTEREST_TO_FILE__STRING_LIST = 5;

	/**
	 * The number of operations of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_CORE_FACADE_OPERATION_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.core.impl.SymphonyEnvironmentImpl <em>Symphony Environment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.impl.SymphonyEnvironmentImpl
	 * @see org.eclipse.symphony.core.impl.Symphony__CorePackageImpl#getSymphonyEnvironment()
	 * @generated
	 */
	int SYMPHONY_ENVIRONMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_ENVIRONMENT__NAME = Symphony__CoreInvocatorPackage.ENVIRONMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_ENVIRONMENT__DESCRIPTION = Symphony__CoreInvocatorPackage.ENVIRONMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Invocator Session</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_ENVIRONMENT__INVOCATOR_SESSION = Symphony__CoreInvocatorPackage.ENVIRONMENT__INVOCATOR_SESSION;

	/**
	 * The feature id for the '<em><b>Types List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_ENVIRONMENT__TYPES_LIST = Symphony__CoreInvocatorPackage.ENVIRONMENT__TYPES_LIST;

	/**
	 * The feature id for the '<em><b>Variables List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_ENVIRONMENT__VARIABLES_LIST = Symphony__CoreInvocatorPackage.ENVIRONMENT__VARIABLES_LIST;

	/**
	 * The feature id for the '<em><b>Contexts List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_ENVIRONMENT__CONTEXTS_LIST = Symphony__CoreInvocatorPackage.ENVIRONMENT__CONTEXTS_LIST;

	/**
	 * The feature id for the '<em><b>Active Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_ENVIRONMENT__ACTIVE_CONTEXT = Symphony__CoreInvocatorPackage.ENVIRONMENT__ACTIVE_CONTEXT;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_ENVIRONMENT__TIME = Symphony__CoreInvocatorPackage.ENVIRONMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Worksites List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_ENVIRONMENT__WORKSITES_LIST = Symphony__CoreInvocatorPackage.ENVIRONMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Active Worksite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_ENVIRONMENT__ACTIVE_WORKSITE = Symphony__CoreInvocatorPackage.ENVIRONMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Symphony Topology</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_ENVIRONMENT__SYMPHONY_TOPOLOGY = Symphony__CoreInvocatorPackage.ENVIRONMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Time Sources List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_ENVIRONMENT__TIME_SOURCES_LIST = Symphony__CoreInvocatorPackage.ENVIRONMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Active Time Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_ENVIRONMENT__ACTIVE_TIME_SOURCE = Symphony__CoreInvocatorPackage.ENVIRONMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Symphony Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_ENVIRONMENT_FEATURE_COUNT = Symphony__CoreInvocatorPackage.ENVIRONMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Symphony Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_ENVIRONMENT_OPERATION_COUNT = Symphony__CoreInvocatorPackage.ENVIRONMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.core.impl.TimeSourcesListImpl <em>Time Sources List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.impl.TimeSourcesListImpl
	 * @see org.eclipse.symphony.core.impl.Symphony__CorePackageImpl#getTimeSourcesList()
	 * @generated
	 */
	int TIME_SOURCES_LIST = 2;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SOURCES_LIST__ENVIRONMENT = 0;

	/**
	 * The feature id for the '<em><b>Time Sources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SOURCES_LIST__TIME_SOURCES = 1;

	/**
	 * The number of structural features of the '<em>Time Sources List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SOURCES_LIST_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Time Sources List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SOURCES_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.core.impl.SymphonyTopologyImpl <em>Symphony Topology</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.impl.SymphonyTopologyImpl
	 * @see org.eclipse.symphony.core.impl.Symphony__CorePackageImpl#getSymphonyTopology()
	 * @generated
	 */
	int SYMPHONY_TOPOLOGY = 3;

	/**
	 * The feature id for the '<em><b>Root Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_TOPOLOGY__ROOT_NODE = 0;

	/**
	 * The number of structural features of the '<em>Symphony Topology</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_TOPOLOGY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Symphony Topology</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_TOPOLOGY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.core.impl.SymphonySystemImpl <em>Symphony System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.impl.SymphonySystemImpl
	 * @see org.eclipse.symphony.core.impl.Symphony__CorePackageImpl#getSymphonySystem()
	 * @generated
	 */
	int SYMPHONY_SYSTEM = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_SYSTEM__NAME = Symphony__CoreInvocatorPackage.TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_SYSTEM__MEMBERS = Symphony__CoreInvocatorPackage.TYPE__MEMBERS;

	/**
	 * The feature id for the '<em><b>Interface Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_SYSTEM__INTERFACE_CLASS = Symphony__CoreInvocatorPackage.TYPE__INTERFACE_CLASS;

	/**
	 * The feature id for the '<em><b>Type Api Adapter Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_SYSTEM__TYPE_API_ADAPTER_CLASS = Symphony__CoreInvocatorPackage.TYPE__TYPE_API_ADAPTER_CLASS;

	/**
	 * The feature id for the '<em><b>Topology Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_SYSTEM__TOPOLOGY_ROOT = Symphony__CoreInvocatorPackage.TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Binding Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_SYSTEM__BINDING_SET = Symphony__CoreInvocatorPackage.TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Connection Points List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_SYSTEM__CONNECTION_POINTS_LIST = Symphony__CoreInvocatorPackage.TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Assembly Links List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_SYSTEM__ASSEMBLY_LINKS_LIST = Symphony__CoreInvocatorPackage.TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Pose Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_SYSTEM__POSE_PROVIDER = Symphony__CoreInvocatorPackage.TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Pose Provider Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_SYSTEM__POSE_PROVIDER_INSTANCE = Symphony__CoreInvocatorPackage.TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Symphony System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_SYSTEM_FEATURE_COUNT = Symphony__CoreInvocatorPackage.TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Symphony System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_SYSTEM_OPERATION_COUNT = Symphony__CoreInvocatorPackage.TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.core.impl.SymphonySystemApiAdapterImpl <em>Symphony System Api Adapter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.impl.SymphonySystemApiAdapterImpl
	 * @see org.eclipse.symphony.core.impl.Symphony__CorePackageImpl#getSymphonySystemApiAdapter()
	 * @generated
	 */
	int SYMPHONY_SYSTEM_API_ADAPTER = 5;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_SYSTEM_API_ADAPTER__ENVIRONMENT = Symphony__CoreInvocatorPackage.TYPE_API_ADAPTER__ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_SYSTEM_API_ADAPTER__INSTANCE = Symphony__CoreInvocatorPackage.TYPE_API_ADAPTER__INSTANCE;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_SYSTEM_API_ADAPTER__ELEMENT_TYPE = Symphony__CoreInvocatorPackage.TYPE_API_ADAPTER__ELEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Pose Transform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_SYSTEM_API_ADAPTER__POSE_TRANSFORM = Symphony__CoreInvocatorPackage.TYPE_API_ADAPTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pose Corrector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_SYSTEM_API_ADAPTER__POSE_CORRECTOR = Symphony__CoreInvocatorPackage.TYPE_API_ADAPTER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Symphony System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_SYSTEM_API_ADAPTER__SYMPHONY_SYSTEM = Symphony__CoreInvocatorPackage.TYPE_API_ADAPTER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Symphony System Api Adapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_SYSTEM_API_ADAPTER_FEATURE_COUNT = Symphony__CoreInvocatorPackage.TYPE_API_ADAPTER_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_SYSTEM_API_ADAPTER___INIT__ENVIRONMENT_TYPE_EOBJECT = Symphony__CoreInvocatorPackage.TYPE_API_ADAPTER___INIT__ENVIRONMENT_TYPE_EOBJECT;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_SYSTEM_API_ADAPTER___APPLY__ABSTRACTINITIALIZATIONDATA = Symphony__CoreInvocatorPackage.TYPE_API_ADAPTER___APPLY__ABSTRACTINITIALIZATIONDATA;

	/**
	 * The operation id for the '<em>Create Initialization Data</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_SYSTEM_API_ADAPTER___CREATE_INITIALIZATION_DATA = Symphony__CoreInvocatorPackage.TYPE_API_ADAPTER___CREATE_INITIALIZATION_DATA;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_SYSTEM_API_ADAPTER___COLLECT__ABSTRACTINITIALIZATIONDATA = Symphony__CoreInvocatorPackage.TYPE_API_ADAPTER___COLLECT__ABSTRACTINITIALIZATIONDATA;

	/**
	 * The operation id for the '<em>Create Result</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_SYSTEM_API_ADAPTER___CREATE_RESULT__OPERATIONCALL = Symphony__CoreInvocatorPackage.TYPE_API_ADAPTER___CREATE_RESULT__OPERATIONCALL;

	/**
	 * The operation id for the '<em>Create Result</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_SYSTEM_API_ADAPTER___CREATE_RESULT__OPERATIONCALL_LONG_OBJECT_EXCEPTION = Symphony__CoreInvocatorPackage.TYPE_API_ADAPTER___CREATE_RESULT__OPERATIONCALL_LONG_OBJECT_EXCEPTION;

	/**
	 * The operation id for the '<em>Invoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_SYSTEM_API_ADAPTER___INVOKE__EOBJECT_OPERATIONCALL_BOOLEAN = Symphony__CoreInvocatorPackage.TYPE_API_ADAPTER___INVOKE__EOBJECT_OPERATIONCALL_BOOLEAN;

	/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_SYSTEM_API_ADAPTER___DISPOSE = Symphony__CoreInvocatorPackage.TYPE_API_ADAPTER___DISPOSE;

	/**
	 * The operation id for the '<em>Create Result Matrix</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_SYSTEM_API_ADAPTER___CREATE_RESULT_MATRIX__OPERATIONCALL = Symphony__CoreInvocatorPackage.TYPE_API_ADAPTER_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Symphony System Api Adapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_SYSTEM_API_ADAPTER_OPERATION_COUNT = Symphony__CoreInvocatorPackage.TYPE_API_ADAPTER_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.core.impl.ConnectionPointsListImpl <em>Connection Points List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.impl.ConnectionPointsListImpl
	 * @see org.eclipse.symphony.core.impl.Symphony__CorePackageImpl#getConnectionPointsList()
	 * @generated
	 */
	int CONNECTION_POINTS_LIST = 6;

	/**
	 * The feature id for the '<em><b>Symphony System</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINTS_LIST__SYMPHONY_SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Connection Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINTS_LIST__CONNECTION_POINTS = 1;

	/**
	 * The number of structural features of the '<em>Connection Points List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINTS_LIST_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Connection Points List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINTS_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.core.impl.ConnectionPointImpl <em>Connection Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.impl.ConnectionPointImpl
	 * @see org.eclipse.symphony.core.impl.Symphony__CorePackageImpl#getConnectionPoint()
	 * @generated
	 */
	int CONNECTION_POINT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT__NAME = Symphony__CommonEMFPackage.NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT__DESCRIPTION = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Points List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT__POINTS_LIST = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT__NODE = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Connection Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_FEATURE_COUNT = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Connection Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_OPERATION_COUNT = Symphony__CommonEMFPackage.NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.core.impl.AssemblyLinkImpl <em>Assembly Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.impl.AssemblyLinkImpl
	 * @see org.eclipse.symphony.core.impl.Symphony__CorePackageImpl#getAssemblyLink()
	 * @generated
	 */
	int ASSEMBLY_LINK = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_LINK__NAME = Symphony__CommonEMFPackage.NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_LINK__DESCRIPTION = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent Type Member</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_LINK__PARENT_TYPE_MEMBER = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sub System Type Member</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_LINK__SUB_SYSTEM_TYPE_MEMBER = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent Connection Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_LINK__PARENT_CONNECTION_POINT = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Transformation Matrix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_LINK__TRANSFORMATION_MATRIX = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Geometry Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_LINK__GEOMETRY_NODE = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Parent Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_LINK__PARENT_INSTANCE = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Sub System Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_LINK__SUB_SYSTEM_INSTANCE = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Assembly Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_LINK_FEATURE_COUNT = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Assembly Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_LINK_OPERATION_COUNT = Symphony__CommonEMFPackage.NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.core.impl.AssemblyLinksListImpl <em>Assembly Links List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.impl.AssemblyLinksListImpl
	 * @see org.eclipse.symphony.core.impl.Symphony__CorePackageImpl#getAssemblyLinksList()
	 * @generated
	 */
	int ASSEMBLY_LINKS_LIST = 9;

	/**
	 * The feature id for the '<em><b>Assembly Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_LINKS_LIST__ASSEMBLY_LINKS = 0;

	/**
	 * The number of structural features of the '<em>Assembly Links List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_LINKS_LIST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Assembly Links List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_LINKS_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.core.impl.PoseProviderImpl <em>Pose Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.impl.PoseProviderImpl
	 * @see org.eclipse.symphony.core.impl.Symphony__CorePackageImpl#getPoseProvider()
	 * @generated
	 */
	int POSE_PROVIDER = 10;

	/**
	 * The feature id for the '<em><b>Pose Transform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSE_PROVIDER__POSE_TRANSFORM = 0;

	/**
	 * The number of structural features of the '<em>Pose Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSE_PROVIDER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Pose Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSE_PROVIDER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.core.impl.AbsolutePoseProviderImpl <em>Absolute Pose Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.impl.AbsolutePoseProviderImpl
	 * @see org.eclipse.symphony.core.impl.Symphony__CorePackageImpl#getAbsolutePoseProvider()
	 * @generated
	 */
	int ABSOLUTE_POSE_PROVIDER = 11;

	/**
	 * The feature id for the '<em><b>Pose Transform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_POSE_PROVIDER__POSE_TRANSFORM = POSE_PROVIDER__POSE_TRANSFORM;

	/**
	 * The number of structural features of the '<em>Absolute Pose Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_POSE_PROVIDER_FEATURE_COUNT = POSE_PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Absolute Pose Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_POSE_PROVIDER_OPERATION_COUNT = POSE_PROVIDER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.core.impl.PoseCorrectorImpl <em>Pose Corrector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.impl.PoseCorrectorImpl
	 * @see org.eclipse.symphony.core.impl.Symphony__CorePackageImpl#getPoseCorrector()
	 * @generated
	 */
	int POSE_CORRECTOR = 12;

	/**
	 * The feature id for the '<em><b>Symphony System Api Adapter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSE_CORRECTOR__SYMPHONY_SYSTEM_API_ADAPTER = 0;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSE_CORRECTOR__ENABLED = 1;

	/**
	 * The number of structural features of the '<em>Pose Corrector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSE_CORRECTOR_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Apply Correction</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSE_CORRECTOR___APPLY_CORRECTION__MATRIX4X4 = 0;

	/**
	 * The number of operations of the '<em>Pose Corrector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSE_CORRECTOR_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.core.impl.SymphonyInitializationDataImpl <em>Symphony Initialization Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.impl.SymphonyInitializationDataImpl
	 * @see org.eclipse.symphony.core.impl.Symphony__CorePackageImpl#getSymphonyInitializationData()
	 * @generated
	 */
	int SYMPHONY_INITIALIZATION_DATA = 13;

	/**
	 * The feature id for the '<em><b>Initial Pose Transform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_INITIALIZATION_DATA__INITIAL_POSE_TRANSFORM = Symphony__CoreInvocatorPackage.INITIALIZATION_DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Symphony Initialization Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_INITIALIZATION_DATA_FEATURE_COUNT = Symphony__CoreInvocatorPackage.INITIALIZATION_DATA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Symphony Initialization Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_INITIALIZATION_DATA_OPERATION_COUNT = Symphony__CoreInvocatorPackage.INITIALIZATION_DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.core.impl.WorksitesListImpl <em>Worksites List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.impl.WorksitesListImpl
	 * @see org.eclipse.symphony.core.impl.Symphony__CorePackageImpl#getWorksitesList()
	 * @generated
	 */
	int WORKSITES_LIST = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSITES_LIST__NAME = Symphony__CommonEMFPackage.NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSITES_LIST__DESCRIPTION = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Worksites</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSITES_LIST__WORKSITES = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Orbits Models</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSITES_LIST__ORBITS_MODELS = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Worksites List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSITES_LIST_FEATURE_COUNT = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Worksites List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSITES_LIST_OPERATION_COUNT = Symphony__CommonEMFPackage.NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.core.impl.AbstractWorksiteImpl <em>Abstract Worksite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.impl.AbstractWorksiteImpl
	 * @see org.eclipse.symphony.core.impl.Symphony__CorePackageImpl#getAbstractWorksite()
	 * @generated
	 */
	int ABSTRACT_WORKSITE = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_WORKSITE__NAME = Symphony__CommonEMFPackage.NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_WORKSITE__DESCRIPTION = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_WORKSITE__TIME = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Worksites List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_WORKSITE__WORKSITES_LIST = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Abstract Worksite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_WORKSITE_FEATURE_COUNT = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Abstract Worksite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_WORKSITE_OPERATION_COUNT = Symphony__CommonEMFPackage.NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.core.impl.OrbitModelsListImpl <em>Orbit Models List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.impl.OrbitModelsListImpl
	 * @see org.eclipse.symphony.core.impl.Symphony__CorePackageImpl#getOrbitModelsList()
	 * @generated
	 */
	int ORBIT_MODELS_LIST = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORBIT_MODELS_LIST__NAME = Symphony__CommonEMFPackage.NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORBIT_MODELS_LIST__DESCRIPTION = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Orbit Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORBIT_MODELS_LIST__ORBIT_MODELS = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Orbit Models List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORBIT_MODELS_LIST_FEATURE_COUNT = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Orbit Models List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORBIT_MODELS_LIST_OPERATION_COUNT = Symphony__CommonEMFPackage.NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.core.impl.AbstractOrbitModelImpl <em>Abstract Orbit Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.impl.AbstractOrbitModelImpl
	 * @see org.eclipse.symphony.core.impl.Symphony__CorePackageImpl#getAbstractOrbitModel()
	 * @generated
	 */
	int ABSTRACT_ORBIT_MODEL = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ORBIT_MODEL__NAME = Symphony__CommonEMFPackage.NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ORBIT_MODEL__DESCRIPTION = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Orbit Models List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ORBIT_MODEL__ORBIT_MODELS_LIST = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Abstract Orbit Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ORBIT_MODEL_FEATURE_COUNT = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Abstract Orbit Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ORBIT_MODEL_OPERATION_COUNT = Symphony__CommonEMFPackage.NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.core.impl.PositionedImpl <em>Positioned</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.impl.PositionedImpl
	 * @see org.eclipse.symphony.core.impl.Symphony__CorePackageImpl#getPositioned()
	 * @generated
	 */
	int POSITIONED = 18;

	/**
	 * The feature id for the '<em><b>Pose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONED__POSE = 0;

	/**
	 * The number of structural features of the '<em>Positioned</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONED_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Positioned</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONED_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.core.impl.TopologyRootImpl <em>Topology Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.impl.TopologyRootImpl
	 * @see org.eclipse.symphony.core.impl.Symphony__CorePackageImpl#getTopologyRoot()
	 * @generated
	 */
	int TOPOLOGY_ROOT = 21;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.core.impl.FeatureOfInterestListImpl <em>Feature Of Interest List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.impl.FeatureOfInterestListImpl
	 * @see org.eclipse.symphony.core.impl.Symphony__CorePackageImpl#getFeatureOfInterestList()
	 * @generated
	 */
	int FEATURE_OF_INTEREST_LIST = 20;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.core.impl.FeatureOfInterestImpl <em>Feature Of Interest</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.impl.FeatureOfInterestImpl
	 * @see org.eclipse.symphony.core.impl.Symphony__CorePackageImpl#getFeatureOfInterest()
	 * @generated
	 */
	int FEATURE_OF_INTEREST = 19;

	/**
	 * The feature id for the '<em><b>Pose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST__POSE = POSITIONED__POSE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST__NAME = POSITIONED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST__DESCRIPTION = POSITIONED_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Feature Of Interest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_FEATURE_COUNT = POSITIONED_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Feature Of Interest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_OPERATION_COUNT = POSITIONED_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_LIST__NAME = Symphony__CommonEMFPackage.NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_LIST__DESCRIPTION = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Features Of Interest</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_LIST__FEATURES_OF_INTEREST = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Feature Of Interest List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_LIST_FEATURE_COUNT = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Feature Of Interest List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_LIST_OPERATION_COUNT = Symphony__CommonEMFPackage.NAMED_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Origin Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_ROOT__ORIGIN_NODE = 0;

	/**
	 * The number of structural features of the '<em>Topology Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_ROOT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Topology Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.core.impl.PositionedResultImpl <em>Positioned Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.impl.PositionedResultImpl
	 * @see org.eclipse.symphony.core.impl.Symphony__CorePackageImpl#getPositionedResult()
	 * @generated
	 */
	int POSITIONED_RESULT = 22;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONED_RESULT__TIME = Symphony__CoreInvocatorPackage.ABSTRACT_RESULT__TIME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONED_RESULT__DESCRIPTION = Symphony__CoreInvocatorPackage.ABSTRACT_RESULT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Results List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONED_RESULT__RESULTS_LIST = Symphony__CoreInvocatorPackage.ABSTRACT_RESULT__RESULTS_LIST;

	/**
	 * The feature id for the '<em><b>Invocator Session</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONED_RESULT__INVOCATOR_SESSION = Symphony__CoreInvocatorPackage.ABSTRACT_RESULT__INVOCATOR_SESSION;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONED_RESULT__CONTEXT = Symphony__CoreInvocatorPackage.ABSTRACT_RESULT__CONTEXT;

	/**
	 * The feature id for the '<em><b>Result Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONED_RESULT__RESULT_VALUE = Symphony__CoreInvocatorPackage.ABSTRACT_RESULT__RESULT_VALUE;

	/**
	 * The feature id for the '<em><b>Pose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONED_RESULT__POSE = Symphony__CoreInvocatorPackage.ABSTRACT_RESULT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Positioned Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONED_RESULT_FEATURE_COUNT = Symphony__CoreInvocatorPackage.ABSTRACT_RESULT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Positioned Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONED_RESULT_OPERATION_COUNT = Symphony__CoreInvocatorPackage.ABSTRACT_RESULT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.core.impl.OperationCallPositionedResultImpl <em>Operation Call Positioned Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.impl.OperationCallPositionedResultImpl
	 * @see org.eclipse.symphony.core.impl.Symphony__CorePackageImpl#getOperationCallPositionedResult()
	 * @generated
	 */
	int OPERATION_CALL_POSITIONED_RESULT = 23;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_POSITIONED_RESULT__TIME = Symphony__CoreInvocatorPackage.OPERATION_CALL_RESULT__TIME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_POSITIONED_RESULT__DESCRIPTION = Symphony__CoreInvocatorPackage.OPERATION_CALL_RESULT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Results List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_POSITIONED_RESULT__RESULTS_LIST = Symphony__CoreInvocatorPackage.OPERATION_CALL_RESULT__RESULTS_LIST;

	/**
	 * The feature id for the '<em><b>Invocator Session</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_POSITIONED_RESULT__INVOCATOR_SESSION = Symphony__CoreInvocatorPackage.OPERATION_CALL_RESULT__INVOCATOR_SESSION;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_POSITIONED_RESULT__CONTEXT = Symphony__CoreInvocatorPackage.OPERATION_CALL_RESULT__CONTEXT;

	/**
	 * The feature id for the '<em><b>Result Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_POSITIONED_RESULT__RESULT_VALUE = Symphony__CoreInvocatorPackage.OPERATION_CALL_RESULT__RESULT_VALUE;

	/**
	 * The feature id for the '<em><b>Operation Calls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_POSITIONED_RESULT__OPERATION_CALLS = Symphony__CoreInvocatorPackage.OPERATION_CALL_RESULT__OPERATION_CALLS;

	/**
	 * The feature id for the '<em><b>Operation Call</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_POSITIONED_RESULT__OPERATION_CALL = Symphony__CoreInvocatorPackage.OPERATION_CALL_RESULT__OPERATION_CALL;

	/**
	 * The feature id for the '<em><b>Exception Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_POSITIONED_RESULT__EXCEPTION_CONTAINER = Symphony__CoreInvocatorPackage.OPERATION_CALL_RESULT__EXCEPTION_CONTAINER;

	/**
	 * The feature id for the '<em><b>Pose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_POSITIONED_RESULT__POSE = Symphony__CoreInvocatorPackage.OPERATION_CALL_RESULT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Relative Pose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_POSITIONED_RESULT__RELATIVE_POSE = Symphony__CoreInvocatorPackage.OPERATION_CALL_RESULT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Operation Call Positioned Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_POSITIONED_RESULT_FEATURE_COUNT = Symphony__CoreInvocatorPackage.OPERATION_CALL_RESULT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Invocator Session</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_POSITIONED_RESULT___GET_INVOCATOR_SESSION = Symphony__CoreInvocatorPackage.OPERATION_CALL_RESULT___GET_INVOCATOR_SESSION;

	/**
	 * The number of operations of the '<em>Operation Call Positioned Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_POSITIONED_RESULT_OPERATION_COUNT = Symphony__CoreInvocatorPackage.OPERATION_CALL_RESULT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.core.impl.UserDefinedResultImpl <em>User Defined Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.impl.UserDefinedResultImpl
	 * @see org.eclipse.symphony.core.impl.Symphony__CorePackageImpl#getUserDefinedResult()
	 * @generated
	 */
	int USER_DEFINED_RESULT = 24;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED_RESULT__TIME = POSITIONED_RESULT__TIME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED_RESULT__DESCRIPTION = POSITIONED_RESULT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Results List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED_RESULT__RESULTS_LIST = POSITIONED_RESULT__RESULTS_LIST;

	/**
	 * The feature id for the '<em><b>Invocator Session</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED_RESULT__INVOCATOR_SESSION = POSITIONED_RESULT__INVOCATOR_SESSION;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED_RESULT__CONTEXT = POSITIONED_RESULT__CONTEXT;

	/**
	 * The feature id for the '<em><b>Result Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED_RESULT__RESULT_VALUE = POSITIONED_RESULT__RESULT_VALUE;

	/**
	 * The feature id for the '<em><b>Pose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED_RESULT__POSE = POSITIONED_RESULT__POSE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED_RESULT__NAME = POSITIONED_RESULT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>User Defined Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED_RESULT_FEATURE_COUNT = POSITIONED_RESULT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>User Defined Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED_RESULT_OPERATION_COUNT = POSITIONED_RESULT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.core.impl.ResultNodeImpl <em>Result Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.impl.ResultNodeImpl
	 * @see org.eclipse.symphony.core.impl.Symphony__CorePackageImpl#getResultNode()
	 * @generated
	 */
	int RESULT_NODE = 25;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_NODE__PARENT = Symphony__CommonTopologyPackage.AGGREGATE_GROUP_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_NODE__DESCRIPTION = Symphony__CommonTopologyPackage.AGGREGATE_GROUP_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_NODE__NODE_ID = Symphony__CommonTopologyPackage.AGGREGATE_GROUP_NODE__NODE_ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_NODE__CHILDREN = Symphony__CommonTopologyPackage.AGGREGATE_GROUP_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Aggregated Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_NODE__AGGREGATED_CHILDREN = Symphony__CommonTopologyPackage.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_NODE__RESULT = Symphony__CommonTopologyPackage.AGGREGATE_GROUP_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Result Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_NODE_FEATURE_COUNT = Symphony__CommonTopologyPackage.AGGREGATE_GROUP_NODE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_NODE___ACCEPT__INODEVISITOR = Symphony__CommonTopologyPackage.AGGREGATE_GROUP_NODE___ACCEPT__INODEVISITOR;

	/**
	 * The number of operations of the '<em>Result Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_NODE_OPERATION_COUNT = Symphony__CommonTopologyPackage.AGGREGATE_GROUP_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.core.impl.ResultsListNodeImpl <em>Results List Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.impl.ResultsListNodeImpl
	 * @see org.eclipse.symphony.core.impl.Symphony__CorePackageImpl#getResultsListNode()
	 * @generated
	 */
	int RESULTS_LIST_NODE = 26;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_LIST_NODE__PARENT = Symphony__CommonTopologyPackage.AGGREGATE_GROUP_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_LIST_NODE__DESCRIPTION = Symphony__CommonTopologyPackage.AGGREGATE_GROUP_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_LIST_NODE__NODE_ID = Symphony__CommonTopologyPackage.AGGREGATE_GROUP_NODE__NODE_ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_LIST_NODE__CHILDREN = Symphony__CommonTopologyPackage.AGGREGATE_GROUP_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Aggregated Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_LIST_NODE__AGGREGATED_CHILDREN = Symphony__CommonTopologyPackage.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Results List</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_LIST_NODE__RESULTS_LIST = Symphony__CommonTopologyPackage.AGGREGATE_GROUP_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Results List Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_LIST_NODE_FEATURE_COUNT = Symphony__CommonTopologyPackage.AGGREGATE_GROUP_NODE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_LIST_NODE___ACCEPT__INODEVISITOR = Symphony__CommonTopologyPackage.AGGREGATE_GROUP_NODE___ACCEPT__INODEVISITOR;

	/**
	 * The number of operations of the '<em>Results List Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_LIST_NODE_OPERATION_COUNT = Symphony__CommonTopologyPackage.AGGREGATE_GROUP_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.core.impl.FeatureOfInterestNodeImpl <em>Feature Of Interest Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.impl.FeatureOfInterestNodeImpl
	 * @see org.eclipse.symphony.core.impl.Symphony__CorePackageImpl#getFeatureOfInterestNode()
	 * @generated
	 */
	int FEATURE_OF_INTEREST_NODE = 27;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_NODE__PARENT = Symphony__CommonTopologyPackage.TRANSFORM_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_NODE__DESCRIPTION = Symphony__CommonTopologyPackage.TRANSFORM_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_NODE__NODE_ID = Symphony__CommonTopologyPackage.TRANSFORM_NODE__NODE_ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_NODE__CHILDREN = Symphony__CommonTopologyPackage.TRANSFORM_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Aggregated Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_NODE__AGGREGATED_CHILDREN = Symphony__CommonTopologyPackage.TRANSFORM_NODE__AGGREGATED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_NODE__POSITION = Symphony__CommonTopologyPackage.TRANSFORM_NODE__POSITION;

	/**
	 * The feature id for the '<em><b>Rotation Matrix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_NODE__ROTATION_MATRIX = Symphony__CommonTopologyPackage.TRANSFORM_NODE__ROTATION_MATRIX;

	/**
	 * The feature id for the '<em><b>Feature Of Interest</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_NODE__FEATURE_OF_INTEREST = Symphony__CommonTopologyPackage.TRANSFORM_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Feature Of Interest Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_NODE_FEATURE_COUNT = Symphony__CommonTopologyPackage.TRANSFORM_NODE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_NODE___ACCEPT__INODEVISITOR = Symphony__CommonTopologyPackage.TRANSFORM_NODE___ACCEPT__INODEVISITOR;

	/**
	 * The operation id for the '<em>As Matrix4d</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_NODE___AS_MATRIX4D = Symphony__CommonTopologyPackage.TRANSFORM_NODE___AS_MATRIX4D;

	/**
	 * The operation id for the '<em>Set Transformation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_NODE___SET_TRANSFORMATION__MATRIX4D = Symphony__CommonTopologyPackage.TRANSFORM_NODE___SET_TRANSFORMATION__MATRIX4D;

	/**
	 * The number of operations of the '<em>Feature Of Interest Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_NODE_OPERATION_COUNT = Symphony__CommonTopologyPackage.TRANSFORM_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.core.impl.FeatureOfInterestListNodeImpl <em>Feature Of Interest List Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.impl.FeatureOfInterestListNodeImpl
	 * @see org.eclipse.symphony.core.impl.Symphony__CorePackageImpl#getFeatureOfInterestListNode()
	 * @generated
	 */
	int FEATURE_OF_INTEREST_LIST_NODE = 28;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_LIST_NODE__PARENT = Symphony__CommonTopologyPackage.AGGREGATE_GROUP_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_LIST_NODE__DESCRIPTION = Symphony__CommonTopologyPackage.AGGREGATE_GROUP_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_LIST_NODE__NODE_ID = Symphony__CommonTopologyPackage.AGGREGATE_GROUP_NODE__NODE_ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_LIST_NODE__CHILDREN = Symphony__CommonTopologyPackage.AGGREGATE_GROUP_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Aggregated Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_LIST_NODE__AGGREGATED_CHILDREN = Symphony__CommonTopologyPackage.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Feature Of Interest List</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_LIST_NODE__FEATURE_OF_INTEREST_LIST = Symphony__CommonTopologyPackage.AGGREGATE_GROUP_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Feature Of Interest List Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_LIST_NODE_FEATURE_COUNT = Symphony__CommonTopologyPackage.AGGREGATE_GROUP_NODE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_LIST_NODE___ACCEPT__INODEVISITOR = Symphony__CommonTopologyPackage.AGGREGATE_GROUP_NODE___ACCEPT__INODEVISITOR;

	/**
	 * The number of operations of the '<em>Feature Of Interest List Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_LIST_NODE_OPERATION_COUNT = Symphony__CommonTopologyPackage.AGGREGATE_GROUP_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.core.impl.UpdatableImpl <em>Updatable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.impl.UpdatableImpl
	 * @see org.eclipse.symphony.core.impl.Symphony__CorePackageImpl#getUpdatable()
	 * @generated
	 */
	int UPDATABLE = 29;

	/**
	 * The feature id for the '<em><b>Updating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATABLE__UPDATING = 0;

	/**
	 * The feature id for the '<em><b>Auto Update Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATABLE__AUTO_UPDATE_ENABLED = 1;

	/**
	 * The number of structural features of the '<em>Updatable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATABLE_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Get Default Auto Update Enabled</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATABLE___GET_DEFAULT_AUTO_UPDATE_ENABLED = 0;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATABLE___UPDATE = 1;

	/**
	 * The number of operations of the '<em>Updatable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATABLE_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '<em>Map</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Map
	 * @see org.eclipse.symphony.core.impl.Symphony__CorePackageImpl#getMap()
	 * @generated
	 */
	int MAP = 30;

	/**
	 * The meta object id for the '<em>List</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.eclipse.symphony.core.impl.Symphony__CorePackageImpl#getList()
	 * @generated
	 */
	int LIST = 31;


	/**
	 * The meta object id for the '<em>Collection</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Collection
	 * @see org.eclipse.symphony.core.impl.Symphony__CorePackageImpl#getCollection()
	 * @generated
	 */
	int COLLECTION = 32;


	/**
	 * The meta object id for the '<em>Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Exception
	 * @see org.eclipse.symphony.core.impl.Symphony__CorePackageImpl#getException()
	 * @generated
	 */
	int EXCEPTION = 33;


	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.Symphony__CoreFacade <em>Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facade</em>'.
	 * @see org.eclipse.symphony.core.Symphony__CoreFacade
	 * @generated
	 */
	EClass getSymphony__CoreFacade();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.Symphony__CoreFacade#computeAbsolutePoseMatrix(org.eclipse.symphony.core.SymphonySystem, org.eclipse.symphony.common.math.Matrix4x4) <em>Compute Absolute Pose Matrix</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compute Absolute Pose Matrix</em>' operation.
	 * @see org.eclipse.symphony.core.Symphony__CoreFacade#computeAbsolutePoseMatrix(org.eclipse.symphony.core.SymphonySystem, org.eclipse.symphony.common.math.Matrix4x4)
	 * @generated
	 */
	EOperation getSymphony__CoreFacade__ComputeAbsolutePoseMatrix__SymphonySystem_Matrix4x4();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.Symphony__CoreFacade#createResultNode(org.eclipse.symphony.core.PositionedResult) <em>Create Result Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Result Node</em>' operation.
	 * @see org.eclipse.symphony.core.Symphony__CoreFacade#createResultNode(org.eclipse.symphony.core.PositionedResult)
	 * @generated
	 */
	EOperation getSymphony__CoreFacade__CreateResultNode__PositionedResult();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.Symphony__CoreFacade#createSymphonySession(boolean, boolean, boolean, boolean) <em>Create Symphony Session</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Symphony Session</em>' operation.
	 * @see org.eclipse.symphony.core.Symphony__CoreFacade#createSymphonySession(boolean, boolean, boolean, boolean)
	 * @generated
	 */
	EOperation getSymphony__CoreFacade__CreateSymphonySession__boolean_boolean_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.Symphony__CoreFacade#getSymphonySystem(org.eclipse.symphony.core.invocator.Environment, java.lang.String) <em>Get Symphony System</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Symphony System</em>' operation.
	 * @see org.eclipse.symphony.core.Symphony__CoreFacade#getSymphonySystem(org.eclipse.symphony.core.invocator.Environment, java.lang.String)
	 * @generated
	 */
	EOperation getSymphony__CoreFacade__GetSymphonySystem__Environment_String();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.Symphony__CoreFacade#loadFeatureOfInterestFromFile(java.lang.String) <em>Load Feature Of Interest From File</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Load Feature Of Interest From File</em>' operation.
	 * @see org.eclipse.symphony.core.Symphony__CoreFacade#loadFeatureOfInterestFromFile(java.lang.String)
	 * @generated
	 */
	EOperation getSymphony__CoreFacade__LoadFeatureOfInterestFromFile__String();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.Symphony__CoreFacade#saveFeatureOfInterestToFile(java.lang.String, java.util.List) <em>Save Feature Of Interest To File</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Save Feature Of Interest To File</em>' operation.
	 * @see org.eclipse.symphony.core.Symphony__CoreFacade#saveFeatureOfInterestToFile(java.lang.String, java.util.List)
	 * @generated
	 */
	EOperation getSymphony__CoreFacade__SaveFeatureOfInterestToFile__String_List();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.SymphonyEnvironment <em>Symphony Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Symphony Environment</em>'.
	 * @see org.eclipse.symphony.core.SymphonyEnvironment
	 * @generated
	 */
	EClass getSymphonyEnvironment();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.core.SymphonyEnvironment#getWorksitesList <em>Worksites List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Worksites List</em>'.
	 * @see org.eclipse.symphony.core.SymphonyEnvironment#getWorksitesList()
	 * @see #getSymphonyEnvironment()
	 * @generated
	 */
	EReference getSymphonyEnvironment_WorksitesList();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.core.SymphonyEnvironment#getActiveWorksite <em>Active Worksite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Active Worksite</em>'.
	 * @see org.eclipse.symphony.core.SymphonyEnvironment#getActiveWorksite()
	 * @see #getSymphonyEnvironment()
	 * @generated
	 */
	EReference getSymphonyEnvironment_ActiveWorksite();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.core.SymphonyEnvironment#getSymphonyTopology <em>Symphony Topology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Symphony Topology</em>'.
	 * @see org.eclipse.symphony.core.SymphonyEnvironment#getSymphonyTopology()
	 * @see #getSymphonyEnvironment()
	 * @generated
	 */
	EReference getSymphonyEnvironment_SymphonyTopology();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.core.SymphonyEnvironment#getTimeSourcesList <em>Time Sources List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Sources List</em>'.
	 * @see org.eclipse.symphony.core.SymphonyEnvironment#getTimeSourcesList()
	 * @see #getSymphonyEnvironment()
	 * @generated
	 */
	EReference getSymphonyEnvironment_TimeSourcesList();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.core.SymphonyEnvironment#getActiveTimeSource <em>Active Time Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Active Time Source</em>'.
	 * @see org.eclipse.symphony.core.SymphonyEnvironment#getActiveTimeSource()
	 * @see #getSymphonyEnvironment()
	 * @generated
	 */
	EReference getSymphonyEnvironment_ActiveTimeSource();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.TimeSourcesList <em>Time Sources List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Sources List</em>'.
	 * @see org.eclipse.symphony.core.TimeSourcesList
	 * @generated
	 */
	EClass getTimeSourcesList();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.symphony.core.TimeSourcesList#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Environment</em>'.
	 * @see org.eclipse.symphony.core.TimeSourcesList#getEnvironment()
	 * @see #getTimeSourcesList()
	 * @generated
	 */
	EReference getTimeSourcesList_Environment();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.symphony.core.TimeSourcesList#getTimeSources <em>Time Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Time Sources</em>'.
	 * @see org.eclipse.symphony.core.TimeSourcesList#getTimeSources()
	 * @see #getTimeSourcesList()
	 * @generated
	 */
	EReference getTimeSourcesList_TimeSources();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.SymphonyTopology <em>Symphony Topology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Symphony Topology</em>'.
	 * @see org.eclipse.symphony.core.SymphonyTopology
	 * @generated
	 */
	EClass getSymphonyTopology();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.core.SymphonyTopology#getRootNode <em>Root Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Root Node</em>'.
	 * @see org.eclipse.symphony.core.SymphonyTopology#getRootNode()
	 * @see #getSymphonyTopology()
	 * @generated
	 */
	EReference getSymphonyTopology_RootNode();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.SymphonySystem <em>Symphony System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Symphony System</em>'.
	 * @see org.eclipse.symphony.core.SymphonySystem
	 * @generated
	 */
	EClass getSymphonySystem();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.core.SymphonySystem#getTopologyRoot <em>Topology Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Topology Root</em>'.
	 * @see org.eclipse.symphony.core.SymphonySystem#getTopologyRoot()
	 * @see #getSymphonySystem()
	 * @generated
	 */
	EReference getSymphonySystem_TopologyRoot();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.core.SymphonySystem#getBindingSet <em>Binding Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Binding Set</em>'.
	 * @see org.eclipse.symphony.core.SymphonySystem#getBindingSet()
	 * @see #getSymphonySystem()
	 * @generated
	 */
	EReference getSymphonySystem_BindingSet();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.core.SymphonySystem#getConnectionPointsList <em>Connection Points List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connection Points List</em>'.
	 * @see org.eclipse.symphony.core.SymphonySystem#getConnectionPointsList()
	 * @see #getSymphonySystem()
	 * @generated
	 */
	EReference getSymphonySystem_ConnectionPointsList();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.core.SymphonySystem#getAssemblyLinksList <em>Assembly Links List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Assembly Links List</em>'.
	 * @see org.eclipse.symphony.core.SymphonySystem#getAssemblyLinksList()
	 * @see #getSymphonySystem()
	 * @generated
	 */
	EReference getSymphonySystem_AssemblyLinksList();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.core.SymphonySystem#getPoseProvider <em>Pose Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pose Provider</em>'.
	 * @see org.eclipse.symphony.core.SymphonySystem#getPoseProvider()
	 * @see #getSymphonySystem()
	 * @generated
	 */
	EReference getSymphonySystem_PoseProvider();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.core.SymphonySystem#getPoseProviderInstance <em>Pose Provider Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pose Provider Instance</em>'.
	 * @see org.eclipse.symphony.core.SymphonySystem#getPoseProviderInstance()
	 * @see #getSymphonySystem()
	 * @generated
	 */
	EReference getSymphonySystem_PoseProviderInstance();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.SymphonySystemApiAdapter <em>Symphony System Api Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Symphony System Api Adapter</em>'.
	 * @see org.eclipse.symphony.core.SymphonySystemApiAdapter
	 * @generated
	 */
	EClass getSymphonySystemApiAdapter();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.core.SymphonySystemApiAdapter#getPoseCorrector <em>Pose Corrector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pose Corrector</em>'.
	 * @see org.eclipse.symphony.core.SymphonySystemApiAdapter#getPoseCorrector()
	 * @see #getSymphonySystemApiAdapter()
	 * @generated
	 */
	EReference getSymphonySystemApiAdapter_PoseCorrector();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.core.SymphonySystemApiAdapter#getSymphonySystem <em>Symphony System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Symphony System</em>'.
	 * @see org.eclipse.symphony.core.SymphonySystemApiAdapter#getSymphonySystem()
	 * @see #getSymphonySystemApiAdapter()
	 * @generated
	 */
	EReference getSymphonySystemApiAdapter_SymphonySystem();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.SymphonySystemApiAdapter#createResultMatrix(org.eclipse.symphony.core.invocator.OperationCall) <em>Create Result Matrix</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Result Matrix</em>' operation.
	 * @see org.eclipse.symphony.core.SymphonySystemApiAdapter#createResultMatrix(org.eclipse.symphony.core.invocator.OperationCall)
	 * @generated
	 */
	EOperation getSymphonySystemApiAdapter__CreateResultMatrix__OperationCall();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.ConnectionPointsList <em>Connection Points List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Points List</em>'.
	 * @see org.eclipse.symphony.core.ConnectionPointsList
	 * @generated
	 */
	EClass getConnectionPointsList();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.symphony.core.ConnectionPointsList#getSymphonySystem <em>Symphony System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Symphony System</em>'.
	 * @see org.eclipse.symphony.core.ConnectionPointsList#getSymphonySystem()
	 * @see #getConnectionPointsList()
	 * @generated
	 */
	EReference getConnectionPointsList_SymphonySystem();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.symphony.core.ConnectionPointsList#getConnectionPoints <em>Connection Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connection Points</em>'.
	 * @see org.eclipse.symphony.core.ConnectionPointsList#getConnectionPoints()
	 * @see #getConnectionPointsList()
	 * @generated
	 */
	EReference getConnectionPointsList_ConnectionPoints();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.ConnectionPoint <em>Connection Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Point</em>'.
	 * @see org.eclipse.symphony.core.ConnectionPoint
	 * @generated
	 */
	EClass getConnectionPoint();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.symphony.core.ConnectionPoint#getPointsList <em>Points List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Points List</em>'.
	 * @see org.eclipse.symphony.core.ConnectionPoint#getPointsList()
	 * @see #getConnectionPoint()
	 * @generated
	 */
	EReference getConnectionPoint_PointsList();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.core.ConnectionPoint#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Node</em>'.
	 * @see org.eclipse.symphony.core.ConnectionPoint#getNode()
	 * @see #getConnectionPoint()
	 * @generated
	 */
	EReference getConnectionPoint_Node();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.AssemblyLink <em>Assembly Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assembly Link</em>'.
	 * @see org.eclipse.symphony.core.AssemblyLink
	 * @generated
	 */
	EClass getAssemblyLink();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.core.AssemblyLink#getParentTypeMember <em>Parent Type Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type Member</em>'.
	 * @see org.eclipse.symphony.core.AssemblyLink#getParentTypeMember()
	 * @see #getAssemblyLink()
	 * @generated
	 */
	EReference getAssemblyLink_ParentTypeMember();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.core.AssemblyLink#getSubSystemTypeMember <em>Sub System Type Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sub System Type Member</em>'.
	 * @see org.eclipse.symphony.core.AssemblyLink#getSubSystemTypeMember()
	 * @see #getAssemblyLink()
	 * @generated
	 */
	EReference getAssemblyLink_SubSystemTypeMember();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.core.AssemblyLink#getParentConnectionPoint <em>Parent Connection Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Connection Point</em>'.
	 * @see org.eclipse.symphony.core.AssemblyLink#getParentConnectionPoint()
	 * @see #getAssemblyLink()
	 * @generated
	 */
	EReference getAssemblyLink_ParentConnectionPoint();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.core.AssemblyLink#getTransformationMatrix <em>Transformation Matrix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transformation Matrix</em>'.
	 * @see org.eclipse.symphony.core.AssemblyLink#getTransformationMatrix()
	 * @see #getAssemblyLink()
	 * @generated
	 */
	EReference getAssemblyLink_TransformationMatrix();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.core.AssemblyLink#getGeometryNode <em>Geometry Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geometry Node</em>'.
	 * @see org.eclipse.symphony.core.AssemblyLink#getGeometryNode()
	 * @see #getAssemblyLink()
	 * @generated
	 */
	EReference getAssemblyLink_GeometryNode();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.core.AssemblyLink#getParentInstance <em>Parent Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Instance</em>'.
	 * @see org.eclipse.symphony.core.AssemblyLink#getParentInstance()
	 * @see #getAssemblyLink()
	 * @generated
	 */
	EReference getAssemblyLink_ParentInstance();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.core.AssemblyLink#getSubSystemInstance <em>Sub System Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sub System Instance</em>'.
	 * @see org.eclipse.symphony.core.AssemblyLink#getSubSystemInstance()
	 * @see #getAssemblyLink()
	 * @generated
	 */
	EReference getAssemblyLink_SubSystemInstance();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.AssemblyLinksList <em>Assembly Links List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assembly Links List</em>'.
	 * @see org.eclipse.symphony.core.AssemblyLinksList
	 * @generated
	 */
	EClass getAssemblyLinksList();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.symphony.core.AssemblyLinksList#getAssemblyLinks <em>Assembly Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assembly Links</em>'.
	 * @see org.eclipse.symphony.core.AssemblyLinksList#getAssemblyLinks()
	 * @see #getAssemblyLinksList()
	 * @generated
	 */
	EReference getAssemblyLinksList_AssemblyLinks();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.PoseProvider <em>Pose Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pose Provider</em>'.
	 * @see org.eclipse.symphony.core.PoseProvider
	 * @generated
	 */
	EClass getPoseProvider();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.core.PoseProvider#getPoseTransform <em>Pose Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pose Transform</em>'.
	 * @see org.eclipse.symphony.core.PoseProvider#getPoseTransform()
	 * @see #getPoseProvider()
	 * @generated
	 */
	EReference getPoseProvider_PoseTransform();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.AbsolutePoseProvider <em>Absolute Pose Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Absolute Pose Provider</em>'.
	 * @see org.eclipse.symphony.core.AbsolutePoseProvider
	 * @generated
	 */
	EClass getAbsolutePoseProvider();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.PoseCorrector <em>Pose Corrector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pose Corrector</em>'.
	 * @see org.eclipse.symphony.core.PoseCorrector
	 * @generated
	 */
	EClass getPoseCorrector();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.symphony.core.PoseCorrector#getSymphonySystemApiAdapter <em>Symphony System Api Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Symphony System Api Adapter</em>'.
	 * @see org.eclipse.symphony.core.PoseCorrector#getSymphonySystemApiAdapter()
	 * @see #getPoseCorrector()
	 * @generated
	 */
	EReference getPoseCorrector_SymphonySystemApiAdapter();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.PoseCorrector#isEnabled <em>Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enabled</em>'.
	 * @see org.eclipse.symphony.core.PoseCorrector#isEnabled()
	 * @see #getPoseCorrector()
	 * @generated
	 */
	EAttribute getPoseCorrector_Enabled();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.PoseCorrector#applyCorrection(org.eclipse.symphony.common.math.Matrix4x4) <em>Apply Correction</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Apply Correction</em>' operation.
	 * @see org.eclipse.symphony.core.PoseCorrector#applyCorrection(org.eclipse.symphony.common.math.Matrix4x4)
	 * @generated
	 */
	EOperation getPoseCorrector__ApplyCorrection__Matrix4x4();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.SymphonyInitializationData <em>Symphony Initialization Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Symphony Initialization Data</em>'.
	 * @see org.eclipse.symphony.core.SymphonyInitializationData
	 * @generated
	 */
	EClass getSymphonyInitializationData();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.core.SymphonyInitializationData#getInitialPoseTransform <em>Initial Pose Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initial Pose Transform</em>'.
	 * @see org.eclipse.symphony.core.SymphonyInitializationData#getInitialPoseTransform()
	 * @see #getSymphonyInitializationData()
	 * @generated
	 */
	EReference getSymphonyInitializationData_InitialPoseTransform();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.WorksitesList <em>Worksites List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Worksites List</em>'.
	 * @see org.eclipse.symphony.core.WorksitesList
	 * @generated
	 */
	EClass getWorksitesList();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.symphony.core.WorksitesList#getWorksites <em>Worksites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Worksites</em>'.
	 * @see org.eclipse.symphony.core.WorksitesList#getWorksites()
	 * @see #getWorksitesList()
	 * @generated
	 */
	EReference getWorksitesList_Worksites();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.core.WorksitesList#getOrbitsModels <em>Orbits Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Orbits Models</em>'.
	 * @see org.eclipse.symphony.core.WorksitesList#getOrbitsModels()
	 * @see #getWorksitesList()
	 * @generated
	 */
	EReference getWorksitesList_OrbitsModels();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.AbstractWorksite <em>Abstract Worksite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Worksite</em>'.
	 * @see org.eclipse.symphony.core.AbstractWorksite
	 * @generated
	 */
	EClass getAbstractWorksite();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.symphony.core.AbstractWorksite#getWorksitesList <em>Worksites List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Worksites List</em>'.
	 * @see org.eclipse.symphony.core.AbstractWorksite#getWorksitesList()
	 * @see #getAbstractWorksite()
	 * @generated
	 */
	EReference getAbstractWorksite_WorksitesList();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.OrbitModelsList <em>Orbit Models List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orbit Models List</em>'.
	 * @see org.eclipse.symphony.core.OrbitModelsList
	 * @generated
	 */
	EClass getOrbitModelsList();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.symphony.core.OrbitModelsList#getOrbitModels <em>Orbit Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Orbit Models</em>'.
	 * @see org.eclipse.symphony.core.OrbitModelsList#getOrbitModels()
	 * @see #getOrbitModelsList()
	 * @generated
	 */
	EReference getOrbitModelsList_OrbitModels();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.AbstractOrbitModel <em>Abstract Orbit Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Orbit Model</em>'.
	 * @see org.eclipse.symphony.core.AbstractOrbitModel
	 * @generated
	 */
	EClass getAbstractOrbitModel();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.symphony.core.AbstractOrbitModel#getOrbitModelsList <em>Orbit Models List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Orbit Models List</em>'.
	 * @see org.eclipse.symphony.core.AbstractOrbitModel#getOrbitModelsList()
	 * @see #getAbstractOrbitModel()
	 * @generated
	 */
	EReference getAbstractOrbitModel_OrbitModelsList();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.Positioned <em>Positioned</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Positioned</em>'.
	 * @see org.eclipse.symphony.core.Positioned
	 * @generated
	 */
	EClass getPositioned();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.core.Positioned#getPose <em>Pose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pose</em>'.
	 * @see org.eclipse.symphony.core.Positioned#getPose()
	 * @see #getPositioned()
	 * @generated
	 */
	EReference getPositioned_Pose();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.TopologyRoot <em>Topology Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Topology Root</em>'.
	 * @see org.eclipse.symphony.core.TopologyRoot
	 * @generated
	 */
	EClass getTopologyRoot();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.core.TopologyRoot#getOriginNode <em>Origin Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Origin Node</em>'.
	 * @see org.eclipse.symphony.core.TopologyRoot#getOriginNode()
	 * @see #getTopologyRoot()
	 * @generated
	 */
	EReference getTopologyRoot_OriginNode();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.FeatureOfInterestList <em>Feature Of Interest List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Of Interest List</em>'.
	 * @see org.eclipse.symphony.core.FeatureOfInterestList
	 * @generated
	 */
	EClass getFeatureOfInterestList();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.symphony.core.FeatureOfInterestList#getFeaturesOfInterest <em>Features Of Interest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features Of Interest</em>'.
	 * @see org.eclipse.symphony.core.FeatureOfInterestList#getFeaturesOfInterest()
	 * @see #getFeatureOfInterestList()
	 * @generated
	 */
	EReference getFeatureOfInterestList_FeaturesOfInterest();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.FeatureOfInterest <em>Feature Of Interest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Of Interest</em>'.
	 * @see org.eclipse.symphony.core.FeatureOfInterest
	 * @generated
	 */
	EClass getFeatureOfInterest();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.PositionedResult <em>Positioned Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Positioned Result</em>'.
	 * @see org.eclipse.symphony.core.PositionedResult
	 * @generated
	 */
	EClass getPositionedResult();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.OperationCallPositionedResult <em>Operation Call Positioned Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Call Positioned Result</em>'.
	 * @see org.eclipse.symphony.core.OperationCallPositionedResult
	 * @generated
	 */
	EClass getOperationCallPositionedResult();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.core.OperationCallPositionedResult#getRelativePose <em>Relative Pose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Relative Pose</em>'.
	 * @see org.eclipse.symphony.core.OperationCallPositionedResult#getRelativePose()
	 * @see #getOperationCallPositionedResult()
	 * @generated
	 */
	EReference getOperationCallPositionedResult_RelativePose();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.UserDefinedResult <em>User Defined Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Defined Result</em>'.
	 * @see org.eclipse.symphony.core.UserDefinedResult
	 * @generated
	 */
	EClass getUserDefinedResult();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.ResultNode <em>Result Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Result Node</em>'.
	 * @see org.eclipse.symphony.core.ResultNode
	 * @generated
	 */
	EClass getResultNode();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.core.ResultNode#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Result</em>'.
	 * @see org.eclipse.symphony.core.ResultNode#getResult()
	 * @see #getResultNode()
	 * @generated
	 */
	EReference getResultNode_Result();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.ResultsListNode <em>Results List Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Results List Node</em>'.
	 * @see org.eclipse.symphony.core.ResultsListNode
	 * @generated
	 */
	EClass getResultsListNode();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.core.ResultsListNode#getResultsList <em>Results List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Results List</em>'.
	 * @see org.eclipse.symphony.core.ResultsListNode#getResultsList()
	 * @see #getResultsListNode()
	 * @generated
	 */
	EReference getResultsListNode_ResultsList();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.FeatureOfInterestNode <em>Feature Of Interest Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Of Interest Node</em>'.
	 * @see org.eclipse.symphony.core.FeatureOfInterestNode
	 * @generated
	 */
	EClass getFeatureOfInterestNode();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.core.FeatureOfInterestNode#getFeatureOfInterest <em>Feature Of Interest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature Of Interest</em>'.
	 * @see org.eclipse.symphony.core.FeatureOfInterestNode#getFeatureOfInterest()
	 * @see #getFeatureOfInterestNode()
	 * @generated
	 */
	EReference getFeatureOfInterestNode_FeatureOfInterest();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.FeatureOfInterestListNode <em>Feature Of Interest List Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Of Interest List Node</em>'.
	 * @see org.eclipse.symphony.core.FeatureOfInterestListNode
	 * @generated
	 */
	EClass getFeatureOfInterestListNode();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.core.FeatureOfInterestListNode#getFeatureOfInterestList <em>Feature Of Interest List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature Of Interest List</em>'.
	 * @see org.eclipse.symphony.core.FeatureOfInterestListNode#getFeatureOfInterestList()
	 * @see #getFeatureOfInterestListNode()
	 * @generated
	 */
	EReference getFeatureOfInterestListNode_FeatureOfInterestList();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.Updatable <em>Updatable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Updatable</em>'.
	 * @see org.eclipse.symphony.core.Updatable
	 * @generated
	 */
	EClass getUpdatable();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.Updatable#isUpdating <em>Updating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Updating</em>'.
	 * @see org.eclipse.symphony.core.Updatable#isUpdating()
	 * @see #getUpdatable()
	 * @generated
	 */
	EAttribute getUpdatable_Updating();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.Updatable#isAutoUpdateEnabled <em>Auto Update Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Update Enabled</em>'.
	 * @see org.eclipse.symphony.core.Updatable#isAutoUpdateEnabled()
	 * @see #getUpdatable()
	 * @generated
	 */
	EAttribute getUpdatable_AutoUpdateEnabled();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.Updatable#getDefaultAutoUpdateEnabled() <em>Get Default Auto Update Enabled</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Default Auto Update Enabled</em>' operation.
	 * @see org.eclipse.symphony.core.Updatable#getDefaultAutoUpdateEnabled()
	 * @generated
	 */
	EOperation getUpdatable__GetDefaultAutoUpdateEnabled();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.Updatable#update() <em>Update</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update</em>' operation.
	 * @see org.eclipse.symphony.core.Updatable#update()
	 * @generated
	 */
	EOperation getUpdatable__Update();

	/**
	 * Returns the meta object for data type '{@link java.util.Map <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Map</em>'.
	 * @see java.util.Map
	 * @model instanceClass="java.util.Map" typeParameters="K V"
	 * @generated
	 */
	EDataType getMap();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>List</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List" typeParameters="T"
	 * @generated
	 */
	EDataType getList();

	/**
	 * Returns the meta object for data type '{@link java.util.Collection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Collection</em>'.
	 * @see java.util.Collection
	 * @model instanceClass="java.util.Collection" typeParameters="T"
	 * @generated
	 */
	EDataType getCollection();

	/**
	 * Returns the meta object for data type '{@link java.lang.Exception <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Exception</em>'.
	 * @see java.lang.Exception
	 * @model instanceClass="java.lang.Exception"
	 * @generated
	 */
	EDataType getException();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Symphony__CoreFactory getSymphony__CoreFactory();

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
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.impl.Symphony__CoreFacadeImpl <em>Facade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.impl.Symphony__CoreFacadeImpl
		 * @see org.eclipse.symphony.core.impl.Symphony__CorePackageImpl#getSymphony__CoreFacade()
		 * @generated
		 */
		EClass SYMPHONY_CORE_FACADE = eINSTANCE.getSymphony__CoreFacade();

		/**
		 * The meta object literal for the '<em><b>Compute Absolute Pose Matrix</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMPHONY_CORE_FACADE___COMPUTE_ABSOLUTE_POSE_MATRIX__SYMPHONYSYSTEM_MATRIX4X4 = eINSTANCE.getSymphony__CoreFacade__ComputeAbsolutePoseMatrix__SymphonySystem_Matrix4x4();

		/**
		 * The meta object literal for the '<em><b>Create Result Node</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMPHONY_CORE_FACADE___CREATE_RESULT_NODE__POSITIONEDRESULT = eINSTANCE.getSymphony__CoreFacade__CreateResultNode__PositionedResult();

		/**
		 * The meta object literal for the '<em><b>Create Symphony Session</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMPHONY_CORE_FACADE___CREATE_SYMPHONY_SESSION__BOOLEAN_BOOLEAN_BOOLEAN_BOOLEAN = eINSTANCE.getSymphony__CoreFacade__CreateSymphonySession__boolean_boolean_boolean_boolean();

		/**
		 * The meta object literal for the '<em><b>Get Symphony System</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMPHONY_CORE_FACADE___GET_SYMPHONY_SYSTEM__ENVIRONMENT_STRING = eINSTANCE.getSymphony__CoreFacade__GetSymphonySystem__Environment_String();

		/**
		 * The meta object literal for the '<em><b>Load Feature Of Interest From File</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMPHONY_CORE_FACADE___LOAD_FEATURE_OF_INTEREST_FROM_FILE__STRING = eINSTANCE.getSymphony__CoreFacade__LoadFeatureOfInterestFromFile__String();

		/**
		 * The meta object literal for the '<em><b>Save Feature Of Interest To File</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMPHONY_CORE_FACADE___SAVE_FEATURE_OF_INTEREST_TO_FILE__STRING_LIST = eINSTANCE.getSymphony__CoreFacade__SaveFeatureOfInterestToFile__String_List();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.impl.SymphonyEnvironmentImpl <em>Symphony Environment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.impl.SymphonyEnvironmentImpl
		 * @see org.eclipse.symphony.core.impl.Symphony__CorePackageImpl#getSymphonyEnvironment()
		 * @generated
		 */
		EClass SYMPHONY_ENVIRONMENT = eINSTANCE.getSymphonyEnvironment();

		/**
		 * The meta object literal for the '<em><b>Worksites List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYMPHONY_ENVIRONMENT__WORKSITES_LIST = eINSTANCE.getSymphonyEnvironment_WorksitesList();

		/**
		 * The meta object literal for the '<em><b>Active Worksite</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYMPHONY_ENVIRONMENT__ACTIVE_WORKSITE = eINSTANCE.getSymphonyEnvironment_ActiveWorksite();

		/**
		 * The meta object literal for the '<em><b>Symphony Topology</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYMPHONY_ENVIRONMENT__SYMPHONY_TOPOLOGY = eINSTANCE.getSymphonyEnvironment_SymphonyTopology();

		/**
		 * The meta object literal for the '<em><b>Time Sources List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYMPHONY_ENVIRONMENT__TIME_SOURCES_LIST = eINSTANCE.getSymphonyEnvironment_TimeSourcesList();

		/**
		 * The meta object literal for the '<em><b>Active Time Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYMPHONY_ENVIRONMENT__ACTIVE_TIME_SOURCE = eINSTANCE.getSymphonyEnvironment_ActiveTimeSource();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.impl.TimeSourcesListImpl <em>Time Sources List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.impl.TimeSourcesListImpl
		 * @see org.eclipse.symphony.core.impl.Symphony__CorePackageImpl#getTimeSourcesList()
		 * @generated
		 */
		EClass TIME_SOURCES_LIST = eINSTANCE.getTimeSourcesList();

		/**
		 * The meta object literal for the '<em><b>Environment</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_SOURCES_LIST__ENVIRONMENT = eINSTANCE.getTimeSourcesList_Environment();

		/**
		 * The meta object literal for the '<em><b>Time Sources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_SOURCES_LIST__TIME_SOURCES = eINSTANCE.getTimeSourcesList_TimeSources();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.impl.SymphonyTopologyImpl <em>Symphony Topology</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.impl.SymphonyTopologyImpl
		 * @see org.eclipse.symphony.core.impl.Symphony__CorePackageImpl#getSymphonyTopology()
		 * @generated
		 */
		EClass SYMPHONY_TOPOLOGY = eINSTANCE.getSymphonyTopology();

		/**
		 * The meta object literal for the '<em><b>Root Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYMPHONY_TOPOLOGY__ROOT_NODE = eINSTANCE.getSymphonyTopology_RootNode();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.impl.SymphonySystemImpl <em>Symphony System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.impl.SymphonySystemImpl
		 * @see org.eclipse.symphony.core.impl.Symphony__CorePackageImpl#getSymphonySystem()
		 * @generated
		 */
		EClass SYMPHONY_SYSTEM = eINSTANCE.getSymphonySystem();

		/**
		 * The meta object literal for the '<em><b>Topology Root</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYMPHONY_SYSTEM__TOPOLOGY_ROOT = eINSTANCE.getSymphonySystem_TopologyRoot();

		/**
		 * The meta object literal for the '<em><b>Binding Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYMPHONY_SYSTEM__BINDING_SET = eINSTANCE.getSymphonySystem_BindingSet();

		/**
		 * The meta object literal for the '<em><b>Connection Points List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYMPHONY_SYSTEM__CONNECTION_POINTS_LIST = eINSTANCE.getSymphonySystem_ConnectionPointsList();

		/**
		 * The meta object literal for the '<em><b>Assembly Links List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYMPHONY_SYSTEM__ASSEMBLY_LINKS_LIST = eINSTANCE.getSymphonySystem_AssemblyLinksList();

		/**
		 * The meta object literal for the '<em><b>Pose Provider</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYMPHONY_SYSTEM__POSE_PROVIDER = eINSTANCE.getSymphonySystem_PoseProvider();

		/**
		 * The meta object literal for the '<em><b>Pose Provider Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYMPHONY_SYSTEM__POSE_PROVIDER_INSTANCE = eINSTANCE.getSymphonySystem_PoseProviderInstance();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.impl.SymphonySystemApiAdapterImpl <em>Symphony System Api Adapter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.impl.SymphonySystemApiAdapterImpl
		 * @see org.eclipse.symphony.core.impl.Symphony__CorePackageImpl#getSymphonySystemApiAdapter()
		 * @generated
		 */
		EClass SYMPHONY_SYSTEM_API_ADAPTER = eINSTANCE.getSymphonySystemApiAdapter();

		/**
		 * The meta object literal for the '<em><b>Pose Corrector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYMPHONY_SYSTEM_API_ADAPTER__POSE_CORRECTOR = eINSTANCE.getSymphonySystemApiAdapter_PoseCorrector();

		/**
		 * The meta object literal for the '<em><b>Symphony System</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYMPHONY_SYSTEM_API_ADAPTER__SYMPHONY_SYSTEM = eINSTANCE.getSymphonySystemApiAdapter_SymphonySystem();

		/**
		 * The meta object literal for the '<em><b>Create Result Matrix</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMPHONY_SYSTEM_API_ADAPTER___CREATE_RESULT_MATRIX__OPERATIONCALL = eINSTANCE.getSymphonySystemApiAdapter__CreateResultMatrix__OperationCall();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.impl.ConnectionPointsListImpl <em>Connection Points List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.impl.ConnectionPointsListImpl
		 * @see org.eclipse.symphony.core.impl.Symphony__CorePackageImpl#getConnectionPointsList()
		 * @generated
		 */
		EClass CONNECTION_POINTS_LIST = eINSTANCE.getConnectionPointsList();

		/**
		 * The meta object literal for the '<em><b>Symphony System</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_POINTS_LIST__SYMPHONY_SYSTEM = eINSTANCE.getConnectionPointsList_SymphonySystem();

		/**
		 * The meta object literal for the '<em><b>Connection Points</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_POINTS_LIST__CONNECTION_POINTS = eINSTANCE.getConnectionPointsList_ConnectionPoints();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.impl.ConnectionPointImpl <em>Connection Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.impl.ConnectionPointImpl
		 * @see org.eclipse.symphony.core.impl.Symphony__CorePackageImpl#getConnectionPoint()
		 * @generated
		 */
		EClass CONNECTION_POINT = eINSTANCE.getConnectionPoint();

		/**
		 * The meta object literal for the '<em><b>Points List</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_POINT__POINTS_LIST = eINSTANCE.getConnectionPoint_PointsList();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_POINT__NODE = eINSTANCE.getConnectionPoint_Node();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.impl.AssemblyLinkImpl <em>Assembly Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.impl.AssemblyLinkImpl
		 * @see org.eclipse.symphony.core.impl.Symphony__CorePackageImpl#getAssemblyLink()
		 * @generated
		 */
		EClass ASSEMBLY_LINK = eINSTANCE.getAssemblyLink();

		/**
		 * The meta object literal for the '<em><b>Parent Type Member</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_LINK__PARENT_TYPE_MEMBER = eINSTANCE.getAssemblyLink_ParentTypeMember();

		/**
		 * The meta object literal for the '<em><b>Sub System Type Member</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_LINK__SUB_SYSTEM_TYPE_MEMBER = eINSTANCE.getAssemblyLink_SubSystemTypeMember();

		/**
		 * The meta object literal for the '<em><b>Parent Connection Point</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_LINK__PARENT_CONNECTION_POINT = eINSTANCE.getAssemblyLink_ParentConnectionPoint();

		/**
		 * The meta object literal for the '<em><b>Transformation Matrix</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_LINK__TRANSFORMATION_MATRIX = eINSTANCE.getAssemblyLink_TransformationMatrix();

		/**
		 * The meta object literal for the '<em><b>Geometry Node</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_LINK__GEOMETRY_NODE = eINSTANCE.getAssemblyLink_GeometryNode();

		/**
		 * The meta object literal for the '<em><b>Parent Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_LINK__PARENT_INSTANCE = eINSTANCE.getAssemblyLink_ParentInstance();

		/**
		 * The meta object literal for the '<em><b>Sub System Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_LINK__SUB_SYSTEM_INSTANCE = eINSTANCE.getAssemblyLink_SubSystemInstance();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.impl.AssemblyLinksListImpl <em>Assembly Links List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.impl.AssemblyLinksListImpl
		 * @see org.eclipse.symphony.core.impl.Symphony__CorePackageImpl#getAssemblyLinksList()
		 * @generated
		 */
		EClass ASSEMBLY_LINKS_LIST = eINSTANCE.getAssemblyLinksList();

		/**
		 * The meta object literal for the '<em><b>Assembly Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_LINKS_LIST__ASSEMBLY_LINKS = eINSTANCE.getAssemblyLinksList_AssemblyLinks();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.impl.PoseProviderImpl <em>Pose Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.impl.PoseProviderImpl
		 * @see org.eclipse.symphony.core.impl.Symphony__CorePackageImpl#getPoseProvider()
		 * @generated
		 */
		EClass POSE_PROVIDER = eINSTANCE.getPoseProvider();

		/**
		 * The meta object literal for the '<em><b>Pose Transform</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSE_PROVIDER__POSE_TRANSFORM = eINSTANCE.getPoseProvider_PoseTransform();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.impl.AbsolutePoseProviderImpl <em>Absolute Pose Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.impl.AbsolutePoseProviderImpl
		 * @see org.eclipse.symphony.core.impl.Symphony__CorePackageImpl#getAbsolutePoseProvider()
		 * @generated
		 */
		EClass ABSOLUTE_POSE_PROVIDER = eINSTANCE.getAbsolutePoseProvider();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.impl.PoseCorrectorImpl <em>Pose Corrector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.impl.PoseCorrectorImpl
		 * @see org.eclipse.symphony.core.impl.Symphony__CorePackageImpl#getPoseCorrector()
		 * @generated
		 */
		EClass POSE_CORRECTOR = eINSTANCE.getPoseCorrector();

		/**
		 * The meta object literal for the '<em><b>Symphony System Api Adapter</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSE_CORRECTOR__SYMPHONY_SYSTEM_API_ADAPTER = eINSTANCE.getPoseCorrector_SymphonySystemApiAdapter();

		/**
		 * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSE_CORRECTOR__ENABLED = eINSTANCE.getPoseCorrector_Enabled();

		/**
		 * The meta object literal for the '<em><b>Apply Correction</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POSE_CORRECTOR___APPLY_CORRECTION__MATRIX4X4 = eINSTANCE.getPoseCorrector__ApplyCorrection__Matrix4x4();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.impl.SymphonyInitializationDataImpl <em>Symphony Initialization Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.impl.SymphonyInitializationDataImpl
		 * @see org.eclipse.symphony.core.impl.Symphony__CorePackageImpl#getSymphonyInitializationData()
		 * @generated
		 */
		EClass SYMPHONY_INITIALIZATION_DATA = eINSTANCE.getSymphonyInitializationData();

		/**
		 * The meta object literal for the '<em><b>Initial Pose Transform</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYMPHONY_INITIALIZATION_DATA__INITIAL_POSE_TRANSFORM = eINSTANCE.getSymphonyInitializationData_InitialPoseTransform();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.impl.WorksitesListImpl <em>Worksites List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.impl.WorksitesListImpl
		 * @see org.eclipse.symphony.core.impl.Symphony__CorePackageImpl#getWorksitesList()
		 * @generated
		 */
		EClass WORKSITES_LIST = eINSTANCE.getWorksitesList();

		/**
		 * The meta object literal for the '<em><b>Worksites</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKSITES_LIST__WORKSITES = eINSTANCE.getWorksitesList_Worksites();

		/**
		 * The meta object literal for the '<em><b>Orbits Models</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKSITES_LIST__ORBITS_MODELS = eINSTANCE.getWorksitesList_OrbitsModels();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.impl.AbstractWorksiteImpl <em>Abstract Worksite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.impl.AbstractWorksiteImpl
		 * @see org.eclipse.symphony.core.impl.Symphony__CorePackageImpl#getAbstractWorksite()
		 * @generated
		 */
		EClass ABSTRACT_WORKSITE = eINSTANCE.getAbstractWorksite();

		/**
		 * The meta object literal for the '<em><b>Worksites List</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_WORKSITE__WORKSITES_LIST = eINSTANCE.getAbstractWorksite_WorksitesList();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.impl.OrbitModelsListImpl <em>Orbit Models List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.impl.OrbitModelsListImpl
		 * @see org.eclipse.symphony.core.impl.Symphony__CorePackageImpl#getOrbitModelsList()
		 * @generated
		 */
		EClass ORBIT_MODELS_LIST = eINSTANCE.getOrbitModelsList();

		/**
		 * The meta object literal for the '<em><b>Orbit Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORBIT_MODELS_LIST__ORBIT_MODELS = eINSTANCE.getOrbitModelsList_OrbitModels();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.impl.AbstractOrbitModelImpl <em>Abstract Orbit Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.impl.AbstractOrbitModelImpl
		 * @see org.eclipse.symphony.core.impl.Symphony__CorePackageImpl#getAbstractOrbitModel()
		 * @generated
		 */
		EClass ABSTRACT_ORBIT_MODEL = eINSTANCE.getAbstractOrbitModel();

		/**
		 * The meta object literal for the '<em><b>Orbit Models List</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_ORBIT_MODEL__ORBIT_MODELS_LIST = eINSTANCE.getAbstractOrbitModel_OrbitModelsList();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.impl.PositionedImpl <em>Positioned</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.impl.PositionedImpl
		 * @see org.eclipse.symphony.core.impl.Symphony__CorePackageImpl#getPositioned()
		 * @generated
		 */
		EClass POSITIONED = eINSTANCE.getPositioned();

		/**
		 * The meta object literal for the '<em><b>Pose</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSITIONED__POSE = eINSTANCE.getPositioned_Pose();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.impl.TopologyRootImpl <em>Topology Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.impl.TopologyRootImpl
		 * @see org.eclipse.symphony.core.impl.Symphony__CorePackageImpl#getTopologyRoot()
		 * @generated
		 */
		EClass TOPOLOGY_ROOT = eINSTANCE.getTopologyRoot();

		/**
		 * The meta object literal for the '<em><b>Origin Node</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOPOLOGY_ROOT__ORIGIN_NODE = eINSTANCE.getTopologyRoot_OriginNode();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.impl.FeatureOfInterestListImpl <em>Feature Of Interest List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.impl.FeatureOfInterestListImpl
		 * @see org.eclipse.symphony.core.impl.Symphony__CorePackageImpl#getFeatureOfInterestList()
		 * @generated
		 */
		EClass FEATURE_OF_INTEREST_LIST = eINSTANCE.getFeatureOfInterestList();

		/**
		 * The meta object literal for the '<em><b>Features Of Interest</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_OF_INTEREST_LIST__FEATURES_OF_INTEREST = eINSTANCE.getFeatureOfInterestList_FeaturesOfInterest();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.impl.FeatureOfInterestImpl <em>Feature Of Interest</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.impl.FeatureOfInterestImpl
		 * @see org.eclipse.symphony.core.impl.Symphony__CorePackageImpl#getFeatureOfInterest()
		 * @generated
		 */
		EClass FEATURE_OF_INTEREST = eINSTANCE.getFeatureOfInterest();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.impl.PositionedResultImpl <em>Positioned Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.impl.PositionedResultImpl
		 * @see org.eclipse.symphony.core.impl.Symphony__CorePackageImpl#getPositionedResult()
		 * @generated
		 */
		EClass POSITIONED_RESULT = eINSTANCE.getPositionedResult();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.impl.OperationCallPositionedResultImpl <em>Operation Call Positioned Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.impl.OperationCallPositionedResultImpl
		 * @see org.eclipse.symphony.core.impl.Symphony__CorePackageImpl#getOperationCallPositionedResult()
		 * @generated
		 */
		EClass OPERATION_CALL_POSITIONED_RESULT = eINSTANCE.getOperationCallPositionedResult();

		/**
		 * The meta object literal for the '<em><b>Relative Pose</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_CALL_POSITIONED_RESULT__RELATIVE_POSE = eINSTANCE.getOperationCallPositionedResult_RelativePose();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.impl.UserDefinedResultImpl <em>User Defined Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.impl.UserDefinedResultImpl
		 * @see org.eclipse.symphony.core.impl.Symphony__CorePackageImpl#getUserDefinedResult()
		 * @generated
		 */
		EClass USER_DEFINED_RESULT = eINSTANCE.getUserDefinedResult();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.impl.ResultNodeImpl <em>Result Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.impl.ResultNodeImpl
		 * @see org.eclipse.symphony.core.impl.Symphony__CorePackageImpl#getResultNode()
		 * @generated
		 */
		EClass RESULT_NODE = eINSTANCE.getResultNode();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULT_NODE__RESULT = eINSTANCE.getResultNode_Result();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.impl.ResultsListNodeImpl <em>Results List Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.impl.ResultsListNodeImpl
		 * @see org.eclipse.symphony.core.impl.Symphony__CorePackageImpl#getResultsListNode()
		 * @generated
		 */
		EClass RESULTS_LIST_NODE = eINSTANCE.getResultsListNode();

		/**
		 * The meta object literal for the '<em><b>Results List</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULTS_LIST_NODE__RESULTS_LIST = eINSTANCE.getResultsListNode_ResultsList();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.impl.FeatureOfInterestNodeImpl <em>Feature Of Interest Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.impl.FeatureOfInterestNodeImpl
		 * @see org.eclipse.symphony.core.impl.Symphony__CorePackageImpl#getFeatureOfInterestNode()
		 * @generated
		 */
		EClass FEATURE_OF_INTEREST_NODE = eINSTANCE.getFeatureOfInterestNode();

		/**
		 * The meta object literal for the '<em><b>Feature Of Interest</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_OF_INTEREST_NODE__FEATURE_OF_INTEREST = eINSTANCE.getFeatureOfInterestNode_FeatureOfInterest();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.impl.FeatureOfInterestListNodeImpl <em>Feature Of Interest List Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.impl.FeatureOfInterestListNodeImpl
		 * @see org.eclipse.symphony.core.impl.Symphony__CorePackageImpl#getFeatureOfInterestListNode()
		 * @generated
		 */
		EClass FEATURE_OF_INTEREST_LIST_NODE = eINSTANCE.getFeatureOfInterestListNode();

		/**
		 * The meta object literal for the '<em><b>Feature Of Interest List</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_OF_INTEREST_LIST_NODE__FEATURE_OF_INTEREST_LIST = eINSTANCE.getFeatureOfInterestListNode_FeatureOfInterestList();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.impl.UpdatableImpl <em>Updatable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.impl.UpdatableImpl
		 * @see org.eclipse.symphony.core.impl.Symphony__CorePackageImpl#getUpdatable()
		 * @generated
		 */
		EClass UPDATABLE = eINSTANCE.getUpdatable();

		/**
		 * The meta object literal for the '<em><b>Updating</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATABLE__UPDATING = eINSTANCE.getUpdatable_Updating();

		/**
		 * The meta object literal for the '<em><b>Auto Update Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATABLE__AUTO_UPDATE_ENABLED = eINSTANCE.getUpdatable_AutoUpdateEnabled();

		/**
		 * The meta object literal for the '<em><b>Get Default Auto Update Enabled</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UPDATABLE___GET_DEFAULT_AUTO_UPDATE_ENABLED = eINSTANCE.getUpdatable__GetDefaultAutoUpdateEnabled();

		/**
		 * The meta object literal for the '<em><b>Update</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UPDATABLE___UPDATE = eINSTANCE.getUpdatable__Update();

		/**
		 * The meta object literal for the '<em>Map</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Map
		 * @see org.eclipse.symphony.core.impl.Symphony__CorePackageImpl#getMap()
		 * @generated
		 */
		EDataType MAP = eINSTANCE.getMap();

		/**
		 * The meta object literal for the '<em>List</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see org.eclipse.symphony.core.impl.Symphony__CorePackageImpl#getList()
		 * @generated
		 */
		EDataType LIST = eINSTANCE.getList();

		/**
		 * The meta object literal for the '<em>Collection</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Collection
		 * @see org.eclipse.symphony.core.impl.Symphony__CorePackageImpl#getCollection()
		 * @generated
		 */
		EDataType COLLECTION = eINSTANCE.getCollection();

		/**
		 * The meta object literal for the '<em>Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Exception
		 * @see org.eclipse.symphony.core.impl.Symphony__CorePackageImpl#getException()
		 * @generated
		 */
		EDataType EXCEPTION = eINSTANCE.getException();

	}

} //Symphony__CorePackage
