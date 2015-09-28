/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.core;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import ca.gc.asc_csa.eclipse.emf.ecore.EMFEcorePackage;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorPackage;
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
 * @see ca.gc.asc_csa.symphony.core.SymphonyCoreFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='SymphonyCore' childCreationExtenders='true' extensibleProviderFactory='true' copyrightText='Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)' modelName='SymphonyCore' multipleEditorPages='false' fileExtensions='sym' modelDirectory='/ca.gc.asc_csa.symphony.core/src-generated' editDirectory='/ca.gc.asc_csa.symphony.core.edit/src-generated' basePackage='ca.gc.asc_csa.symphony'"
 * @generated
 */
public interface SymphonyCorePackage extends EPackage {
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
	String eNS_URI = "ca.gc.asc_csa.symphony.core";

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
	SymphonyCorePackage eINSTANCE = ca.gc.asc_csa.symphony.core.impl.SymphonyCorePackageImpl.init();

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.symphony.core.impl.SymphonyCoreFacadeImpl <em>Facade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.symphony.core.impl.SymphonyCoreFacadeImpl
	 * @see ca.gc.asc_csa.symphony.core.impl.SymphonyCorePackageImpl#getSymphonyCoreFacade()
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
	 * The meta object id for the '{@link ca.gc.asc_csa.symphony.core.impl.SymphonyEnvironmentImpl <em>Symphony Environment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.symphony.core.impl.SymphonyEnvironmentImpl
	 * @see ca.gc.asc_csa.symphony.core.impl.SymphonyCorePackageImpl#getSymphonyEnvironment()
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
	int SYMPHONY_ENVIRONMENT__NAME = EMFEcoreInvocatorPackage.ENVIRONMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_ENVIRONMENT__DESCRIPTION = EMFEcoreInvocatorPackage.ENVIRONMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Invocator Session</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_ENVIRONMENT__INVOCATOR_SESSION = EMFEcoreInvocatorPackage.ENVIRONMENT__INVOCATOR_SESSION;

	/**
	 * The feature id for the '<em><b>Types List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_ENVIRONMENT__TYPES_LIST = EMFEcoreInvocatorPackage.ENVIRONMENT__TYPES_LIST;

	/**
	 * The feature id for the '<em><b>Variables List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_ENVIRONMENT__VARIABLES_LIST = EMFEcoreInvocatorPackage.ENVIRONMENT__VARIABLES_LIST;

	/**
	 * The feature id for the '<em><b>Contexts List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_ENVIRONMENT__CONTEXTS_LIST = EMFEcoreInvocatorPackage.ENVIRONMENT__CONTEXTS_LIST;

	/**
	 * The feature id for the '<em><b>Active Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_ENVIRONMENT__ACTIVE_CONTEXT = EMFEcoreInvocatorPackage.ENVIRONMENT__ACTIVE_CONTEXT;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_ENVIRONMENT__TIME = EMFEcoreInvocatorPackage.ENVIRONMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Worksites List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_ENVIRONMENT__WORKSITES_LIST = EMFEcoreInvocatorPackage.ENVIRONMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Active Worksite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_ENVIRONMENT__ACTIVE_WORKSITE = EMFEcoreInvocatorPackage.ENVIRONMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Symphony Topology</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_ENVIRONMENT__SYMPHONY_TOPOLOGY = EMFEcoreInvocatorPackage.ENVIRONMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Time Sources List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_ENVIRONMENT__TIME_SOURCES_LIST = EMFEcoreInvocatorPackage.ENVIRONMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Active Time Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_ENVIRONMENT__ACTIVE_TIME_SOURCE = EMFEcoreInvocatorPackage.ENVIRONMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Symphony Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_ENVIRONMENT_FEATURE_COUNT = EMFEcoreInvocatorPackage.ENVIRONMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Symphony Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_ENVIRONMENT_OPERATION_COUNT = EMFEcoreInvocatorPackage.ENVIRONMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.symphony.core.impl.SymphonyTopologyImpl <em>Symphony Topology</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.symphony.core.impl.SymphonyTopologyImpl
	 * @see ca.gc.asc_csa.symphony.core.impl.SymphonyCorePackageImpl#getSymphonyTopology()
	 * @generated
	 */
	int SYMPHONY_TOPOLOGY = 2;

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
	 * The meta object id for the '{@link ca.gc.asc_csa.symphony.core.impl.SymphonySystemImpl <em>Symphony System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.symphony.core.impl.SymphonySystemImpl
	 * @see ca.gc.asc_csa.symphony.core.impl.SymphonyCorePackageImpl#getSymphonySystem()
	 * @generated
	 */
	int SYMPHONY_SYSTEM = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_SYSTEM__NAME = EMFEcoreInvocatorPackage.TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_SYSTEM__MEMBERS = EMFEcoreInvocatorPackage.TYPE__MEMBERS;

	/**
	 * The feature id for the '<em><b>Interface Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_SYSTEM__INTERFACE_CLASS = EMFEcoreInvocatorPackage.TYPE__INTERFACE_CLASS;

	/**
	 * The feature id for the '<em><b>Type Api Adapter Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_SYSTEM__TYPE_API_ADAPTER_CLASS = EMFEcoreInvocatorPackage.TYPE__TYPE_API_ADAPTER_CLASS;

	/**
	 * The feature id for the '<em><b>Topology Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_SYSTEM__TOPOLOGY_ROOT = EMFEcoreInvocatorPackage.TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Binding Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_SYSTEM__BINDING_SET = EMFEcoreInvocatorPackage.TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Connection Points List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_SYSTEM__CONNECTION_POINTS_LIST = EMFEcoreInvocatorPackage.TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Assembly Links List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_SYSTEM__ASSEMBLY_LINKS_LIST = EMFEcoreInvocatorPackage.TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Pose Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_SYSTEM__POSE_PROVIDER = EMFEcoreInvocatorPackage.TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Pose Provider Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_SYSTEM__POSE_PROVIDER_INSTANCE = EMFEcoreInvocatorPackage.TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Symphony System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_SYSTEM_FEATURE_COUNT = EMFEcoreInvocatorPackage.TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Symphony System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_SYSTEM_OPERATION_COUNT = EMFEcoreInvocatorPackage.TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.symphony.core.impl.SymphonySystemApiAdapterImpl <em>Symphony System Api Adapter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.symphony.core.impl.SymphonySystemApiAdapterImpl
	 * @see ca.gc.asc_csa.symphony.core.impl.SymphonyCorePackageImpl#getSymphonySystemApiAdapter()
	 * @generated
	 */
	int SYMPHONY_SYSTEM_API_ADAPTER = 4;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_SYSTEM_API_ADAPTER__ENVIRONMENT = EMFEcoreInvocatorPackage.TYPE_API_ADAPTER__ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_SYSTEM_API_ADAPTER__INSTANCE = EMFEcoreInvocatorPackage.TYPE_API_ADAPTER__INSTANCE;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_SYSTEM_API_ADAPTER__ELEMENT_TYPE = EMFEcoreInvocatorPackage.TYPE_API_ADAPTER__ELEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Pose Transform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_SYSTEM_API_ADAPTER__POSE_TRANSFORM = EMFEcoreInvocatorPackage.TYPE_API_ADAPTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pose Corrector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_SYSTEM_API_ADAPTER__POSE_CORRECTOR = EMFEcoreInvocatorPackage.TYPE_API_ADAPTER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Symphony System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_SYSTEM_API_ADAPTER__SYMPHONY_SYSTEM = EMFEcoreInvocatorPackage.TYPE_API_ADAPTER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Symphony System Api Adapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_SYSTEM_API_ADAPTER_FEATURE_COUNT = EMFEcoreInvocatorPackage.TYPE_API_ADAPTER_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_SYSTEM_API_ADAPTER___INIT__ENVIRONMENT_TYPE_EOBJECT = EMFEcoreInvocatorPackage.TYPE_API_ADAPTER___INIT__ENVIRONMENT_TYPE_EOBJECT;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_SYSTEM_API_ADAPTER___APPLY__ABSTRACTINITIALIZATIONDATA = EMFEcoreInvocatorPackage.TYPE_API_ADAPTER___APPLY__ABSTRACTINITIALIZATIONDATA;

	/**
	 * The operation id for the '<em>Create Initialization Data</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_SYSTEM_API_ADAPTER___CREATE_INITIALIZATION_DATA = EMFEcoreInvocatorPackage.TYPE_API_ADAPTER___CREATE_INITIALIZATION_DATA;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_SYSTEM_API_ADAPTER___COLLECT__ABSTRACTINITIALIZATIONDATA = EMFEcoreInvocatorPackage.TYPE_API_ADAPTER___COLLECT__ABSTRACTINITIALIZATIONDATA;

	/**
	 * The operation id for the '<em>Create Result</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_SYSTEM_API_ADAPTER___CREATE_RESULT__OPERATIONCALL = EMFEcoreInvocatorPackage.TYPE_API_ADAPTER___CREATE_RESULT__OPERATIONCALL;

	/**
	 * The operation id for the '<em>Create Result</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_SYSTEM_API_ADAPTER___CREATE_RESULT__OPERATIONCALL_LONG_OBJECT_EXCEPTION = EMFEcoreInvocatorPackage.TYPE_API_ADAPTER___CREATE_RESULT__OPERATIONCALL_LONG_OBJECT_EXCEPTION;

	/**
	 * The operation id for the '<em>Invoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_SYSTEM_API_ADAPTER___INVOKE__EOBJECT_OPERATIONCALL_BOOLEAN = EMFEcoreInvocatorPackage.TYPE_API_ADAPTER___INVOKE__EOBJECT_OPERATIONCALL_BOOLEAN;

	/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_SYSTEM_API_ADAPTER___DISPOSE = EMFEcoreInvocatorPackage.TYPE_API_ADAPTER___DISPOSE;

	/**
	 * The operation id for the '<em>Create Result Matrix</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_SYSTEM_API_ADAPTER___CREATE_RESULT_MATRIX__OPERATIONCALL = EMFEcoreInvocatorPackage.TYPE_API_ADAPTER_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Symphony System Api Adapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_SYSTEM_API_ADAPTER_OPERATION_COUNT = EMFEcoreInvocatorPackage.TYPE_API_ADAPTER_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.symphony.core.impl.ConnectionPointsListImpl <em>Connection Points List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.symphony.core.impl.ConnectionPointsListImpl
	 * @see ca.gc.asc_csa.symphony.core.impl.SymphonyCorePackageImpl#getConnectionPointsList()
	 * @generated
	 */
	int CONNECTION_POINTS_LIST = 5;

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
	 * The meta object id for the '{@link ca.gc.asc_csa.symphony.core.impl.ConnectionPointImpl <em>Connection Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.symphony.core.impl.ConnectionPointImpl
	 * @see ca.gc.asc_csa.symphony.core.impl.SymphonyCorePackageImpl#getConnectionPoint()
	 * @generated
	 */
	int CONNECTION_POINT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT__NAME = EMFEcorePackage.NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT__DESCRIPTION = EMFEcorePackage.NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Points List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT__POINTS_LIST = EMFEcorePackage.NAMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT__NODE = EMFEcorePackage.NAMED_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Connection Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_FEATURE_COUNT = EMFEcorePackage.NAMED_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Connection Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_OPERATION_COUNT = EMFEcorePackage.NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.symphony.core.impl.AssemblyLinkImpl <em>Assembly Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.symphony.core.impl.AssemblyLinkImpl
	 * @see ca.gc.asc_csa.symphony.core.impl.SymphonyCorePackageImpl#getAssemblyLink()
	 * @generated
	 */
	int ASSEMBLY_LINK = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_LINK__NAME = EMFEcorePackage.NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_LINK__DESCRIPTION = EMFEcorePackage.NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent Type Member</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_LINK__PARENT_TYPE_MEMBER = EMFEcorePackage.NAMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sub System Type Member</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_LINK__SUB_SYSTEM_TYPE_MEMBER = EMFEcorePackage.NAMED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent Connection Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_LINK__PARENT_CONNECTION_POINT = EMFEcorePackage.NAMED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Transformation Matrix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_LINK__TRANSFORMATION_MATRIX = EMFEcorePackage.NAMED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Geometry Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_LINK__GEOMETRY_NODE = EMFEcorePackage.NAMED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Parent Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_LINK__PARENT_INSTANCE = EMFEcorePackage.NAMED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Sub System Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_LINK__SUB_SYSTEM_INSTANCE = EMFEcorePackage.NAMED_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Assembly Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_LINK_FEATURE_COUNT = EMFEcorePackage.NAMED_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Assembly Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_LINK_OPERATION_COUNT = EMFEcorePackage.NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.symphony.core.impl.AssemblyLinksListImpl <em>Assembly Links List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.symphony.core.impl.AssemblyLinksListImpl
	 * @see ca.gc.asc_csa.symphony.core.impl.SymphonyCorePackageImpl#getAssemblyLinksList()
	 * @generated
	 */
	int ASSEMBLY_LINKS_LIST = 8;

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
	 * The meta object id for the '{@link ca.gc.asc_csa.symphony.core.impl.PoseProviderImpl <em>Pose Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.symphony.core.impl.PoseProviderImpl
	 * @see ca.gc.asc_csa.symphony.core.impl.SymphonyCorePackageImpl#getPoseProvider()
	 * @generated
	 */
	int POSE_PROVIDER = 9;

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
	 * The meta object id for the '{@link ca.gc.asc_csa.symphony.core.impl.AbsolutePoseProviderImpl <em>Absolute Pose Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.symphony.core.impl.AbsolutePoseProviderImpl
	 * @see ca.gc.asc_csa.symphony.core.impl.SymphonyCorePackageImpl#getAbsolutePoseProvider()
	 * @generated
	 */
	int ABSOLUTE_POSE_PROVIDER = 10;

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
	 * The meta object id for the '{@link ca.gc.asc_csa.symphony.core.impl.PoseCorrectorImpl <em>Pose Corrector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.symphony.core.impl.PoseCorrectorImpl
	 * @see ca.gc.asc_csa.symphony.core.impl.SymphonyCorePackageImpl#getPoseCorrector()
	 * @generated
	 */
	int POSE_CORRECTOR = 11;

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
	 * The meta object id for the '{@link ca.gc.asc_csa.symphony.core.impl.SymphonyInitializationDataImpl <em>Symphony Initialization Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.symphony.core.impl.SymphonyInitializationDataImpl
	 * @see ca.gc.asc_csa.symphony.core.impl.SymphonyCorePackageImpl#getSymphonyInitializationData()
	 * @generated
	 */
	int SYMPHONY_INITIALIZATION_DATA = 12;

	/**
	 * The feature id for the '<em><b>Initial Pose Transform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_INITIALIZATION_DATA__INITIAL_POSE_TRANSFORM = EMFEcoreInvocatorPackage.INITIALIZATION_DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Symphony Initialization Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_INITIALIZATION_DATA_FEATURE_COUNT = EMFEcoreInvocatorPackage.INITIALIZATION_DATA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Symphony Initialization Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_INITIALIZATION_DATA_OPERATION_COUNT = EMFEcoreInvocatorPackage.INITIALIZATION_DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.symphony.core.impl.WorksitesListImpl <em>Worksites List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.symphony.core.impl.WorksitesListImpl
	 * @see ca.gc.asc_csa.symphony.core.impl.SymphonyCorePackageImpl#getWorksitesList()
	 * @generated
	 */
	int WORKSITES_LIST = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSITES_LIST__NAME = EMFEcorePackage.NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSITES_LIST__DESCRIPTION = EMFEcorePackage.NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Worksites</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSITES_LIST__WORKSITES = EMFEcorePackage.NAMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Orbits Models</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSITES_LIST__ORBITS_MODELS = EMFEcorePackage.NAMED_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Worksites List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSITES_LIST_FEATURE_COUNT = EMFEcorePackage.NAMED_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Worksites List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSITES_LIST_OPERATION_COUNT = EMFEcorePackage.NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.symphony.core.impl.AbstractWorksiteImpl <em>Abstract Worksite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.symphony.core.impl.AbstractWorksiteImpl
	 * @see ca.gc.asc_csa.symphony.core.impl.SymphonyCorePackageImpl#getAbstractWorksite()
	 * @generated
	 */
	int ABSTRACT_WORKSITE = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_WORKSITE__NAME = EMFEcorePackage.NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_WORKSITE__DESCRIPTION = EMFEcorePackage.NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_WORKSITE__TIME = EMFEcorePackage.NAMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Worksites List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_WORKSITE__WORKSITES_LIST = EMFEcorePackage.NAMED_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Abstract Worksite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_WORKSITE_FEATURE_COUNT = EMFEcorePackage.NAMED_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Abstract Worksite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_WORKSITE_OPERATION_COUNT = EMFEcorePackage.NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.symphony.core.impl.OrbitModelsListImpl <em>Orbit Models List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.symphony.core.impl.OrbitModelsListImpl
	 * @see ca.gc.asc_csa.symphony.core.impl.SymphonyCorePackageImpl#getOrbitModelsList()
	 * @generated
	 */
	int ORBIT_MODELS_LIST = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORBIT_MODELS_LIST__NAME = EMFEcorePackage.NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORBIT_MODELS_LIST__DESCRIPTION = EMFEcorePackage.NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Orbit Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORBIT_MODELS_LIST__ORBIT_MODELS = EMFEcorePackage.NAMED_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Orbit Models List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORBIT_MODELS_LIST_FEATURE_COUNT = EMFEcorePackage.NAMED_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Orbit Models List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORBIT_MODELS_LIST_OPERATION_COUNT = EMFEcorePackage.NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.symphony.core.impl.AbstractOrbitModelImpl <em>Abstract Orbit Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.symphony.core.impl.AbstractOrbitModelImpl
	 * @see ca.gc.asc_csa.symphony.core.impl.SymphonyCorePackageImpl#getAbstractOrbitModel()
	 * @generated
	 */
	int ABSTRACT_ORBIT_MODEL = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ORBIT_MODEL__NAME = EMFEcorePackage.NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ORBIT_MODEL__DESCRIPTION = EMFEcorePackage.NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Orbit Models List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ORBIT_MODEL__ORBIT_MODELS_LIST = EMFEcorePackage.NAMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Variable Feature Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ORBIT_MODEL__VARIABLE_FEATURE_REFERENCE = EMFEcorePackage.NAMED_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Abstract Orbit Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ORBIT_MODEL_FEATURE_COUNT = EMFEcorePackage.NAMED_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Abstract Orbit Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ORBIT_MODEL_OPERATION_COUNT = EMFEcorePackage.NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.symphony.core.impl.PositionedImpl <em>Positioned</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.symphony.core.impl.PositionedImpl
	 * @see ca.gc.asc_csa.symphony.core.impl.SymphonyCorePackageImpl#getPositioned()
	 * @generated
	 */
	int POSITIONED = 17;

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
	 * The meta object id for the '{@link ca.gc.asc_csa.symphony.core.impl.TopologyRootImpl <em>Topology Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.symphony.core.impl.TopologyRootImpl
	 * @see ca.gc.asc_csa.symphony.core.impl.SymphonyCorePackageImpl#getTopologyRoot()
	 * @generated
	 */
	int TOPOLOGY_ROOT = 20;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.symphony.core.impl.FeatureOfInterestListImpl <em>Feature Of Interest List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.symphony.core.impl.FeatureOfInterestListImpl
	 * @see ca.gc.asc_csa.symphony.core.impl.SymphonyCorePackageImpl#getFeatureOfInterestList()
	 * @generated
	 */
	int FEATURE_OF_INTEREST_LIST = 19;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.symphony.core.impl.FeatureOfInterestImpl <em>Feature Of Interest</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.symphony.core.impl.FeatureOfInterestImpl
	 * @see ca.gc.asc_csa.symphony.core.impl.SymphonyCorePackageImpl#getFeatureOfInterest()
	 * @generated
	 */
	int FEATURE_OF_INTEREST = 18;

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
	int FEATURE_OF_INTEREST_LIST__NAME = EMFEcorePackage.NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_LIST__DESCRIPTION = EMFEcorePackage.NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Features Of Interest</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_LIST__FEATURES_OF_INTEREST = EMFEcorePackage.NAMED_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Feature Of Interest List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_LIST_FEATURE_COUNT = EMFEcorePackage.NAMED_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Feature Of Interest List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_LIST_OPERATION_COUNT = EMFEcorePackage.NAMED_OPERATION_COUNT + 0;

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
	 * The meta object id for the '{@link ca.gc.asc_csa.symphony.core.impl.PositionedResultImpl <em>Positioned Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.symphony.core.impl.PositionedResultImpl
	 * @see ca.gc.asc_csa.symphony.core.impl.SymphonyCorePackageImpl#getPositionedResult()
	 * @generated
	 */
	int POSITIONED_RESULT = 21;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONED_RESULT__TIME = EMFEcoreInvocatorPackage.ABSTRACT_RESULT__TIME;

	/**
	 * The feature id for the '<em><b>Results List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONED_RESULT__RESULTS_LIST = EMFEcoreInvocatorPackage.ABSTRACT_RESULT__RESULTS_LIST;

	/**
	 * The feature id for the '<em><b>Invocator Session</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONED_RESULT__INVOCATOR_SESSION = EMFEcoreInvocatorPackage.ABSTRACT_RESULT__INVOCATOR_SESSION;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONED_RESULT__CONTEXT = EMFEcoreInvocatorPackage.ABSTRACT_RESULT__CONTEXT;

	/**
	 * The feature id for the '<em><b>Result Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONED_RESULT__RESULT_VALUE = EMFEcoreInvocatorPackage.ABSTRACT_RESULT__RESULT_VALUE;

	/**
	 * The feature id for the '<em><b>Pose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONED_RESULT__POSE = EMFEcoreInvocatorPackage.ABSTRACT_RESULT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Positioned Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONED_RESULT_FEATURE_COUNT = EMFEcoreInvocatorPackage.ABSTRACT_RESULT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Positioned Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONED_RESULT_OPERATION_COUNT = EMFEcoreInvocatorPackage.ABSTRACT_RESULT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.symphony.core.impl.OperationCallPositionedResultImpl <em>Operation Call Positioned Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.symphony.core.impl.OperationCallPositionedResultImpl
	 * @see ca.gc.asc_csa.symphony.core.impl.SymphonyCorePackageImpl#getOperationCallPositionedResult()
	 * @generated
	 */
	int OPERATION_CALL_POSITIONED_RESULT = 22;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_POSITIONED_RESULT__TIME = EMFEcoreInvocatorPackage.OPERATION_CALL_RESULT__TIME;

	/**
	 * The feature id for the '<em><b>Results List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_POSITIONED_RESULT__RESULTS_LIST = EMFEcoreInvocatorPackage.OPERATION_CALL_RESULT__RESULTS_LIST;

	/**
	 * The feature id for the '<em><b>Invocator Session</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_POSITIONED_RESULT__INVOCATOR_SESSION = EMFEcoreInvocatorPackage.OPERATION_CALL_RESULT__INVOCATOR_SESSION;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_POSITIONED_RESULT__CONTEXT = EMFEcoreInvocatorPackage.OPERATION_CALL_RESULT__CONTEXT;

	/**
	 * The feature id for the '<em><b>Result Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_POSITIONED_RESULT__RESULT_VALUE = EMFEcoreInvocatorPackage.OPERATION_CALL_RESULT__RESULT_VALUE;

	/**
	 * The feature id for the '<em><b>Operation Calls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_POSITIONED_RESULT__OPERATION_CALLS = EMFEcoreInvocatorPackage.OPERATION_CALL_RESULT__OPERATION_CALLS;

	/**
	 * The feature id for the '<em><b>Operation Call</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_POSITIONED_RESULT__OPERATION_CALL = EMFEcoreInvocatorPackage.OPERATION_CALL_RESULT__OPERATION_CALL;

	/**
	 * The feature id for the '<em><b>Exception Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_POSITIONED_RESULT__EXCEPTION_CONTAINER = EMFEcoreInvocatorPackage.OPERATION_CALL_RESULT__EXCEPTION_CONTAINER;

	/**
	 * The feature id for the '<em><b>Pose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_POSITIONED_RESULT__POSE = EMFEcoreInvocatorPackage.OPERATION_CALL_RESULT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Relative Pose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_POSITIONED_RESULT__RELATIVE_POSE = EMFEcoreInvocatorPackage.OPERATION_CALL_RESULT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Operation Call Positioned Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_POSITIONED_RESULT_FEATURE_COUNT = EMFEcoreInvocatorPackage.OPERATION_CALL_RESULT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Invocator Session</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_POSITIONED_RESULT___GET_INVOCATOR_SESSION = EMFEcoreInvocatorPackage.OPERATION_CALL_RESULT___GET_INVOCATOR_SESSION;

	/**
	 * The number of operations of the '<em>Operation Call Positioned Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_POSITIONED_RESULT_OPERATION_COUNT = EMFEcoreInvocatorPackage.OPERATION_CALL_RESULT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.symphony.core.impl.UserDefinedResultImpl <em>User Defined Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.symphony.core.impl.UserDefinedResultImpl
	 * @see ca.gc.asc_csa.symphony.core.impl.SymphonyCorePackageImpl#getUserDefinedResult()
	 * @generated
	 */
	int USER_DEFINED_RESULT = 23;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED_RESULT__TIME = POSITIONED_RESULT__TIME;

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
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED_RESULT__DESCRIPTION = POSITIONED_RESULT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>User Defined Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED_RESULT_FEATURE_COUNT = POSITIONED_RESULT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>User Defined Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED_RESULT_OPERATION_COUNT = POSITIONED_RESULT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.symphony.core.impl.ResultNodeImpl <em>Result Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.symphony.core.impl.ResultNodeImpl
	 * @see ca.gc.asc_csa.symphony.core.impl.SymphonyCorePackageImpl#getResultNode()
	 * @generated
	 */
	int RESULT_NODE = 24;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_NODE__PARENT = TopologyPackage.AGGREGATE_GROUP_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_NODE__DESCRIPTION = TopologyPackage.AGGREGATE_GROUP_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_NODE__NODE_ID = TopologyPackage.AGGREGATE_GROUP_NODE__NODE_ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_NODE__CHILDREN = TopologyPackage.AGGREGATE_GROUP_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Aggregated Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_NODE__AGGREGATED_CHILDREN = TopologyPackage.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_NODE__RESULT = TopologyPackage.AGGREGATE_GROUP_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Result Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_NODE_FEATURE_COUNT = TopologyPackage.AGGREGATE_GROUP_NODE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_NODE___ACCEPT__INODEVISITOR = TopologyPackage.AGGREGATE_GROUP_NODE___ACCEPT__INODEVISITOR;

	/**
	 * The number of operations of the '<em>Result Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_NODE_OPERATION_COUNT = TopologyPackage.AGGREGATE_GROUP_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.symphony.core.impl.ResultsListNodeImpl <em>Results List Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.symphony.core.impl.ResultsListNodeImpl
	 * @see ca.gc.asc_csa.symphony.core.impl.SymphonyCorePackageImpl#getResultsListNode()
	 * @generated
	 */
	int RESULTS_LIST_NODE = 25;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_LIST_NODE__PARENT = TopologyPackage.AGGREGATE_GROUP_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_LIST_NODE__DESCRIPTION = TopologyPackage.AGGREGATE_GROUP_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_LIST_NODE__NODE_ID = TopologyPackage.AGGREGATE_GROUP_NODE__NODE_ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_LIST_NODE__CHILDREN = TopologyPackage.AGGREGATE_GROUP_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Aggregated Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_LIST_NODE__AGGREGATED_CHILDREN = TopologyPackage.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Results List</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_LIST_NODE__RESULTS_LIST = TopologyPackage.AGGREGATE_GROUP_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Results List Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_LIST_NODE_FEATURE_COUNT = TopologyPackage.AGGREGATE_GROUP_NODE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_LIST_NODE___ACCEPT__INODEVISITOR = TopologyPackage.AGGREGATE_GROUP_NODE___ACCEPT__INODEVISITOR;

	/**
	 * The number of operations of the '<em>Results List Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_LIST_NODE_OPERATION_COUNT = TopologyPackage.AGGREGATE_GROUP_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.symphony.core.impl.FeatureOfInterestNodeImpl <em>Feature Of Interest Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.symphony.core.impl.FeatureOfInterestNodeImpl
	 * @see ca.gc.asc_csa.symphony.core.impl.SymphonyCorePackageImpl#getFeatureOfInterestNode()
	 * @generated
	 */
	int FEATURE_OF_INTEREST_NODE = 26;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_NODE__PARENT = TopologyPackage.TRANSFORM_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_NODE__DESCRIPTION = TopologyPackage.TRANSFORM_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_NODE__NODE_ID = TopologyPackage.TRANSFORM_NODE__NODE_ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_NODE__CHILDREN = TopologyPackage.TRANSFORM_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Aggregated Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_NODE__AGGREGATED_CHILDREN = TopologyPackage.TRANSFORM_NODE__AGGREGATED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_NODE__POSITION = TopologyPackage.TRANSFORM_NODE__POSITION;

	/**
	 * The feature id for the '<em><b>Rotation Matrix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_NODE__ROTATION_MATRIX = TopologyPackage.TRANSFORM_NODE__ROTATION_MATRIX;

	/**
	 * The feature id for the '<em><b>Feature Of Interest</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_NODE__FEATURE_OF_INTEREST = TopologyPackage.TRANSFORM_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Feature Of Interest Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_NODE_FEATURE_COUNT = TopologyPackage.TRANSFORM_NODE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_NODE___ACCEPT__INODEVISITOR = TopologyPackage.TRANSFORM_NODE___ACCEPT__INODEVISITOR;

	/**
	 * The operation id for the '<em>As Matrix4d</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_NODE___AS_MATRIX4D = TopologyPackage.TRANSFORM_NODE___AS_MATRIX4D;

	/**
	 * The operation id for the '<em>Set Transformation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_NODE___SET_TRANSFORMATION__MATRIX4D = TopologyPackage.TRANSFORM_NODE___SET_TRANSFORMATION__MATRIX4D;

	/**
	 * The number of operations of the '<em>Feature Of Interest Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_NODE_OPERATION_COUNT = TopologyPackage.TRANSFORM_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.symphony.core.impl.FeatureOfInterestListNodeImpl <em>Feature Of Interest List Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.symphony.core.impl.FeatureOfInterestListNodeImpl
	 * @see ca.gc.asc_csa.symphony.core.impl.SymphonyCorePackageImpl#getFeatureOfInterestListNode()
	 * @generated
	 */
	int FEATURE_OF_INTEREST_LIST_NODE = 27;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_LIST_NODE__PARENT = TopologyPackage.AGGREGATE_GROUP_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_LIST_NODE__DESCRIPTION = TopologyPackage.AGGREGATE_GROUP_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_LIST_NODE__NODE_ID = TopologyPackage.AGGREGATE_GROUP_NODE__NODE_ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_LIST_NODE__CHILDREN = TopologyPackage.AGGREGATE_GROUP_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Aggregated Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_LIST_NODE__AGGREGATED_CHILDREN = TopologyPackage.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Feature Of Interest List</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_LIST_NODE__FEATURE_OF_INTEREST_LIST = TopologyPackage.AGGREGATE_GROUP_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Feature Of Interest List Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_LIST_NODE_FEATURE_COUNT = TopologyPackage.AGGREGATE_GROUP_NODE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_LIST_NODE___ACCEPT__INODEVISITOR = TopologyPackage.AGGREGATE_GROUP_NODE___ACCEPT__INODEVISITOR;

	/**
	 * The number of operations of the '<em>Feature Of Interest List Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_LIST_NODE_OPERATION_COUNT = TopologyPackage.AGGREGATE_GROUP_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.symphony.core.impl.UpdatableImpl <em>Updatable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.symphony.core.impl.UpdatableImpl
	 * @see ca.gc.asc_csa.symphony.core.impl.SymphonyCorePackageImpl#getUpdatable()
	 * @generated
	 */
	int UPDATABLE = 28;

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
	 * @see ca.gc.asc_csa.symphony.core.impl.SymphonyCorePackageImpl#getMap()
	 * @generated
	 */
	int MAP = 29;

	/**
	 * The meta object id for the '<em>List</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see ca.gc.asc_csa.symphony.core.impl.SymphonyCorePackageImpl#getList()
	 * @generated
	 */
	int LIST = 30;


	/**
	 * The meta object id for the '<em>Collection</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Collection
	 * @see ca.gc.asc_csa.symphony.core.impl.SymphonyCorePackageImpl#getCollection()
	 * @generated
	 */
	int COLLECTION = 31;


	/**
	 * The meta object id for the '<em>Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Exception
	 * @see ca.gc.asc_csa.symphony.core.impl.SymphonyCorePackageImpl#getException()
	 * @generated
	 */
	int EXCEPTION = 32;


	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.symphony.core.SymphonyCoreFacade <em>Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facade</em>'.
	 * @see ca.gc.asc_csa.symphony.core.SymphonyCoreFacade
	 * @generated
	 */
	EClass getSymphonyCoreFacade();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.symphony.core.SymphonyCoreFacade#computeAbsolutePoseMatrix(ca.gc.asc_csa.symphony.core.SymphonySystem, ca.gc.space.math.Matrix4x4) <em>Compute Absolute Pose Matrix</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compute Absolute Pose Matrix</em>' operation.
	 * @see ca.gc.asc_csa.symphony.core.SymphonyCoreFacade#computeAbsolutePoseMatrix(ca.gc.asc_csa.symphony.core.SymphonySystem, ca.gc.space.math.Matrix4x4)
	 * @generated
	 */
	EOperation getSymphonyCoreFacade__ComputeAbsolutePoseMatrix__SymphonySystem_Matrix4x4();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.symphony.core.SymphonyCoreFacade#createResultNode(ca.gc.asc_csa.symphony.core.PositionedResult) <em>Create Result Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Result Node</em>' operation.
	 * @see ca.gc.asc_csa.symphony.core.SymphonyCoreFacade#createResultNode(ca.gc.asc_csa.symphony.core.PositionedResult)
	 * @generated
	 */
	EOperation getSymphonyCoreFacade__CreateResultNode__PositionedResult();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.symphony.core.SymphonyCoreFacade#createSymphonySession(boolean, boolean, boolean, boolean) <em>Create Symphony Session</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Symphony Session</em>' operation.
	 * @see ca.gc.asc_csa.symphony.core.SymphonyCoreFacade#createSymphonySession(boolean, boolean, boolean, boolean)
	 * @generated
	 */
	EOperation getSymphonyCoreFacade__CreateSymphonySession__boolean_boolean_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.symphony.core.SymphonyCoreFacade#getSymphonySystem(ca.gc.asc_csa.eclipse.emf.ecore.invocator.Environment, java.lang.String) <em>Get Symphony System</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Symphony System</em>' operation.
	 * @see ca.gc.asc_csa.symphony.core.SymphonyCoreFacade#getSymphonySystem(ca.gc.asc_csa.eclipse.emf.ecore.invocator.Environment, java.lang.String)
	 * @generated
	 */
	EOperation getSymphonyCoreFacade__GetSymphonySystem__Environment_String();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.symphony.core.SymphonyCoreFacade#loadFeatureOfInterestFromFile(java.lang.String) <em>Load Feature Of Interest From File</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Load Feature Of Interest From File</em>' operation.
	 * @see ca.gc.asc_csa.symphony.core.SymphonyCoreFacade#loadFeatureOfInterestFromFile(java.lang.String)
	 * @generated
	 */
	EOperation getSymphonyCoreFacade__LoadFeatureOfInterestFromFile__String();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.symphony.core.SymphonyCoreFacade#saveFeatureOfInterestToFile(java.lang.String, java.util.List) <em>Save Feature Of Interest To File</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Save Feature Of Interest To File</em>' operation.
	 * @see ca.gc.asc_csa.symphony.core.SymphonyCoreFacade#saveFeatureOfInterestToFile(java.lang.String, java.util.List)
	 * @generated
	 */
	EOperation getSymphonyCoreFacade__SaveFeatureOfInterestToFile__String_List();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.symphony.core.SymphonyEnvironment <em>Symphony Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Symphony Environment</em>'.
	 * @see ca.gc.asc_csa.symphony.core.SymphonyEnvironment
	 * @generated
	 */
	EClass getSymphonyEnvironment();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.symphony.core.SymphonyEnvironment#getWorksitesList <em>Worksites List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Worksites List</em>'.
	 * @see ca.gc.asc_csa.symphony.core.SymphonyEnvironment#getWorksitesList()
	 * @see #getSymphonyEnvironment()
	 * @generated
	 */
	EReference getSymphonyEnvironment_WorksitesList();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.symphony.core.SymphonyEnvironment#getActiveWorksite <em>Active Worksite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Active Worksite</em>'.
	 * @see ca.gc.asc_csa.symphony.core.SymphonyEnvironment#getActiveWorksite()
	 * @see #getSymphonyEnvironment()
	 * @generated
	 */
	EReference getSymphonyEnvironment_ActiveWorksite();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.symphony.core.SymphonyEnvironment#getSymphonyTopology <em>Symphony Topology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Symphony Topology</em>'.
	 * @see ca.gc.asc_csa.symphony.core.SymphonyEnvironment#getSymphonyTopology()
	 * @see #getSymphonyEnvironment()
	 * @generated
	 */
	EReference getSymphonyEnvironment_SymphonyTopology();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.symphony.core.SymphonyEnvironment#getTimeSourcesList <em>Time Sources List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Sources List</em>'.
	 * @see ca.gc.asc_csa.symphony.core.SymphonyEnvironment#getTimeSourcesList()
	 * @see #getSymphonyEnvironment()
	 * @generated
	 */
	EReference getSymphonyEnvironment_TimeSourcesList();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.symphony.core.SymphonyEnvironment#getActiveTimeSource <em>Active Time Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Active Time Source</em>'.
	 * @see ca.gc.asc_csa.symphony.core.SymphonyEnvironment#getActiveTimeSource()
	 * @see #getSymphonyEnvironment()
	 * @generated
	 */
	EReference getSymphonyEnvironment_ActiveTimeSource();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.symphony.core.SymphonyTopology <em>Symphony Topology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Symphony Topology</em>'.
	 * @see ca.gc.asc_csa.symphony.core.SymphonyTopology
	 * @generated
	 */
	EClass getSymphonyTopology();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.symphony.core.SymphonyTopology#getRootNode <em>Root Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Root Node</em>'.
	 * @see ca.gc.asc_csa.symphony.core.SymphonyTopology#getRootNode()
	 * @see #getSymphonyTopology()
	 * @generated
	 */
	EReference getSymphonyTopology_RootNode();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.symphony.core.SymphonySystem <em>Symphony System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Symphony System</em>'.
	 * @see ca.gc.asc_csa.symphony.core.SymphonySystem
	 * @generated
	 */
	EClass getSymphonySystem();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.symphony.core.SymphonySystem#getTopologyRoot <em>Topology Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Topology Root</em>'.
	 * @see ca.gc.asc_csa.symphony.core.SymphonySystem#getTopologyRoot()
	 * @see #getSymphonySystem()
	 * @generated
	 */
	EReference getSymphonySystem_TopologyRoot();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.symphony.core.SymphonySystem#getBindingSet <em>Binding Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Binding Set</em>'.
	 * @see ca.gc.asc_csa.symphony.core.SymphonySystem#getBindingSet()
	 * @see #getSymphonySystem()
	 * @generated
	 */
	EReference getSymphonySystem_BindingSet();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.symphony.core.SymphonySystem#getConnectionPointsList <em>Connection Points List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connection Points List</em>'.
	 * @see ca.gc.asc_csa.symphony.core.SymphonySystem#getConnectionPointsList()
	 * @see #getSymphonySystem()
	 * @generated
	 */
	EReference getSymphonySystem_ConnectionPointsList();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.symphony.core.SymphonySystem#getAssemblyLinksList <em>Assembly Links List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Assembly Links List</em>'.
	 * @see ca.gc.asc_csa.symphony.core.SymphonySystem#getAssemblyLinksList()
	 * @see #getSymphonySystem()
	 * @generated
	 */
	EReference getSymphonySystem_AssemblyLinksList();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.symphony.core.SymphonySystem#getPoseProvider <em>Pose Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pose Provider</em>'.
	 * @see ca.gc.asc_csa.symphony.core.SymphonySystem#getPoseProvider()
	 * @see #getSymphonySystem()
	 * @generated
	 */
	EReference getSymphonySystem_PoseProvider();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.symphony.core.SymphonySystem#getPoseProviderInstance <em>Pose Provider Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pose Provider Instance</em>'.
	 * @see ca.gc.asc_csa.symphony.core.SymphonySystem#getPoseProviderInstance()
	 * @see #getSymphonySystem()
	 * @generated
	 */
	EReference getSymphonySystem_PoseProviderInstance();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.symphony.core.SymphonySystemApiAdapter <em>Symphony System Api Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Symphony System Api Adapter</em>'.
	 * @see ca.gc.asc_csa.symphony.core.SymphonySystemApiAdapter
	 * @generated
	 */
	EClass getSymphonySystemApiAdapter();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.symphony.core.SymphonySystemApiAdapter#getPoseCorrector <em>Pose Corrector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pose Corrector</em>'.
	 * @see ca.gc.asc_csa.symphony.core.SymphonySystemApiAdapter#getPoseCorrector()
	 * @see #getSymphonySystemApiAdapter()
	 * @generated
	 */
	EReference getSymphonySystemApiAdapter_PoseCorrector();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.symphony.core.SymphonySystemApiAdapter#getSymphonySystem <em>Symphony System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Symphony System</em>'.
	 * @see ca.gc.asc_csa.symphony.core.SymphonySystemApiAdapter#getSymphonySystem()
	 * @see #getSymphonySystemApiAdapter()
	 * @generated
	 */
	EReference getSymphonySystemApiAdapter_SymphonySystem();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.symphony.core.SymphonySystemApiAdapter#createResultMatrix(ca.gc.asc_csa.eclipse.emf.ecore.invocator.OperationCall) <em>Create Result Matrix</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Result Matrix</em>' operation.
	 * @see ca.gc.asc_csa.symphony.core.SymphonySystemApiAdapter#createResultMatrix(ca.gc.asc_csa.eclipse.emf.ecore.invocator.OperationCall)
	 * @generated
	 */
	EOperation getSymphonySystemApiAdapter__CreateResultMatrix__OperationCall();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.symphony.core.ConnectionPointsList <em>Connection Points List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Points List</em>'.
	 * @see ca.gc.asc_csa.symphony.core.ConnectionPointsList
	 * @generated
	 */
	EClass getConnectionPointsList();

	/**
	 * Returns the meta object for the container reference '{@link ca.gc.asc_csa.symphony.core.ConnectionPointsList#getSymphonySystem <em>Symphony System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Symphony System</em>'.
	 * @see ca.gc.asc_csa.symphony.core.ConnectionPointsList#getSymphonySystem()
	 * @see #getConnectionPointsList()
	 * @generated
	 */
	EReference getConnectionPointsList_SymphonySystem();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.gc.asc_csa.symphony.core.ConnectionPointsList#getConnectionPoints <em>Connection Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connection Points</em>'.
	 * @see ca.gc.asc_csa.symphony.core.ConnectionPointsList#getConnectionPoints()
	 * @see #getConnectionPointsList()
	 * @generated
	 */
	EReference getConnectionPointsList_ConnectionPoints();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.symphony.core.ConnectionPoint <em>Connection Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Point</em>'.
	 * @see ca.gc.asc_csa.symphony.core.ConnectionPoint
	 * @generated
	 */
	EClass getConnectionPoint();

	/**
	 * Returns the meta object for the container reference '{@link ca.gc.asc_csa.symphony.core.ConnectionPoint#getPointsList <em>Points List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Points List</em>'.
	 * @see ca.gc.asc_csa.symphony.core.ConnectionPoint#getPointsList()
	 * @see #getConnectionPoint()
	 * @generated
	 */
	EReference getConnectionPoint_PointsList();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.symphony.core.ConnectionPoint#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Node</em>'.
	 * @see ca.gc.asc_csa.symphony.core.ConnectionPoint#getNode()
	 * @see #getConnectionPoint()
	 * @generated
	 */
	EReference getConnectionPoint_Node();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.symphony.core.AssemblyLink <em>Assembly Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assembly Link</em>'.
	 * @see ca.gc.asc_csa.symphony.core.AssemblyLink
	 * @generated
	 */
	EClass getAssemblyLink();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.symphony.core.AssemblyLink#getParentTypeMember <em>Parent Type Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type Member</em>'.
	 * @see ca.gc.asc_csa.symphony.core.AssemblyLink#getParentTypeMember()
	 * @see #getAssemblyLink()
	 * @generated
	 */
	EReference getAssemblyLink_ParentTypeMember();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.symphony.core.AssemblyLink#getSubSystemTypeMember <em>Sub System Type Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sub System Type Member</em>'.
	 * @see ca.gc.asc_csa.symphony.core.AssemblyLink#getSubSystemTypeMember()
	 * @see #getAssemblyLink()
	 * @generated
	 */
	EReference getAssemblyLink_SubSystemTypeMember();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.symphony.core.AssemblyLink#getParentConnectionPoint <em>Parent Connection Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Connection Point</em>'.
	 * @see ca.gc.asc_csa.symphony.core.AssemblyLink#getParentConnectionPoint()
	 * @see #getAssemblyLink()
	 * @generated
	 */
	EReference getAssemblyLink_ParentConnectionPoint();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.symphony.core.AssemblyLink#getTransformationMatrix <em>Transformation Matrix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transformation Matrix</em>'.
	 * @see ca.gc.asc_csa.symphony.core.AssemblyLink#getTransformationMatrix()
	 * @see #getAssemblyLink()
	 * @generated
	 */
	EReference getAssemblyLink_TransformationMatrix();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.symphony.core.AssemblyLink#getGeometryNode <em>Geometry Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geometry Node</em>'.
	 * @see ca.gc.asc_csa.symphony.core.AssemblyLink#getGeometryNode()
	 * @see #getAssemblyLink()
	 * @generated
	 */
	EReference getAssemblyLink_GeometryNode();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.symphony.core.AssemblyLink#getParentInstance <em>Parent Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Instance</em>'.
	 * @see ca.gc.asc_csa.symphony.core.AssemblyLink#getParentInstance()
	 * @see #getAssemblyLink()
	 * @generated
	 */
	EReference getAssemblyLink_ParentInstance();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.symphony.core.AssemblyLink#getSubSystemInstance <em>Sub System Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sub System Instance</em>'.
	 * @see ca.gc.asc_csa.symphony.core.AssemblyLink#getSubSystemInstance()
	 * @see #getAssemblyLink()
	 * @generated
	 */
	EReference getAssemblyLink_SubSystemInstance();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.symphony.core.AssemblyLinksList <em>Assembly Links List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assembly Links List</em>'.
	 * @see ca.gc.asc_csa.symphony.core.AssemblyLinksList
	 * @generated
	 */
	EClass getAssemblyLinksList();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.gc.asc_csa.symphony.core.AssemblyLinksList#getAssemblyLinks <em>Assembly Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assembly Links</em>'.
	 * @see ca.gc.asc_csa.symphony.core.AssemblyLinksList#getAssemblyLinks()
	 * @see #getAssemblyLinksList()
	 * @generated
	 */
	EReference getAssemblyLinksList_AssemblyLinks();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.symphony.core.PoseProvider <em>Pose Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pose Provider</em>'.
	 * @see ca.gc.asc_csa.symphony.core.PoseProvider
	 * @generated
	 */
	EClass getPoseProvider();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.symphony.core.PoseProvider#getPoseTransform <em>Pose Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pose Transform</em>'.
	 * @see ca.gc.asc_csa.symphony.core.PoseProvider#getPoseTransform()
	 * @see #getPoseProvider()
	 * @generated
	 */
	EReference getPoseProvider_PoseTransform();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.symphony.core.AbsolutePoseProvider <em>Absolute Pose Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Absolute Pose Provider</em>'.
	 * @see ca.gc.asc_csa.symphony.core.AbsolutePoseProvider
	 * @generated
	 */
	EClass getAbsolutePoseProvider();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.symphony.core.PoseCorrector <em>Pose Corrector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pose Corrector</em>'.
	 * @see ca.gc.asc_csa.symphony.core.PoseCorrector
	 * @generated
	 */
	EClass getPoseCorrector();

	/**
	 * Returns the meta object for the container reference '{@link ca.gc.asc_csa.symphony.core.PoseCorrector#getSymphonySystemApiAdapter <em>Symphony System Api Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Symphony System Api Adapter</em>'.
	 * @see ca.gc.asc_csa.symphony.core.PoseCorrector#getSymphonySystemApiAdapter()
	 * @see #getPoseCorrector()
	 * @generated
	 */
	EReference getPoseCorrector_SymphonySystemApiAdapter();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.symphony.core.PoseCorrector#isEnabled <em>Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enabled</em>'.
	 * @see ca.gc.asc_csa.symphony.core.PoseCorrector#isEnabled()
	 * @see #getPoseCorrector()
	 * @generated
	 */
	EAttribute getPoseCorrector_Enabled();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.symphony.core.PoseCorrector#applyCorrection(ca.gc.space.math.Matrix4x4) <em>Apply Correction</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Apply Correction</em>' operation.
	 * @see ca.gc.asc_csa.symphony.core.PoseCorrector#applyCorrection(ca.gc.space.math.Matrix4x4)
	 * @generated
	 */
	EOperation getPoseCorrector__ApplyCorrection__Matrix4x4();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.symphony.core.SymphonyInitializationData <em>Symphony Initialization Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Symphony Initialization Data</em>'.
	 * @see ca.gc.asc_csa.symphony.core.SymphonyInitializationData
	 * @generated
	 */
	EClass getSymphonyInitializationData();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.symphony.core.SymphonyInitializationData#getInitialPoseTransform <em>Initial Pose Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initial Pose Transform</em>'.
	 * @see ca.gc.asc_csa.symphony.core.SymphonyInitializationData#getInitialPoseTransform()
	 * @see #getSymphonyInitializationData()
	 * @generated
	 */
	EReference getSymphonyInitializationData_InitialPoseTransform();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.symphony.core.WorksitesList <em>Worksites List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Worksites List</em>'.
	 * @see ca.gc.asc_csa.symphony.core.WorksitesList
	 * @generated
	 */
	EClass getWorksitesList();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.gc.asc_csa.symphony.core.WorksitesList#getWorksites <em>Worksites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Worksites</em>'.
	 * @see ca.gc.asc_csa.symphony.core.WorksitesList#getWorksites()
	 * @see #getWorksitesList()
	 * @generated
	 */
	EReference getWorksitesList_Worksites();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.symphony.core.WorksitesList#getOrbitsModels <em>Orbits Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Orbits Models</em>'.
	 * @see ca.gc.asc_csa.symphony.core.WorksitesList#getOrbitsModels()
	 * @see #getWorksitesList()
	 * @generated
	 */
	EReference getWorksitesList_OrbitsModels();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.symphony.core.AbstractWorksite <em>Abstract Worksite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Worksite</em>'.
	 * @see ca.gc.asc_csa.symphony.core.AbstractWorksite
	 * @generated
	 */
	EClass getAbstractWorksite();

	/**
	 * Returns the meta object for the container reference '{@link ca.gc.asc_csa.symphony.core.AbstractWorksite#getWorksitesList <em>Worksites List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Worksites List</em>'.
	 * @see ca.gc.asc_csa.symphony.core.AbstractWorksite#getWorksitesList()
	 * @see #getAbstractWorksite()
	 * @generated
	 */
	EReference getAbstractWorksite_WorksitesList();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.symphony.core.OrbitModelsList <em>Orbit Models List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orbit Models List</em>'.
	 * @see ca.gc.asc_csa.symphony.core.OrbitModelsList
	 * @generated
	 */
	EClass getOrbitModelsList();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.gc.asc_csa.symphony.core.OrbitModelsList#getOrbitModels <em>Orbit Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Orbit Models</em>'.
	 * @see ca.gc.asc_csa.symphony.core.OrbitModelsList#getOrbitModels()
	 * @see #getOrbitModelsList()
	 * @generated
	 */
	EReference getOrbitModelsList_OrbitModels();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.symphony.core.AbstractOrbitModel <em>Abstract Orbit Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Orbit Model</em>'.
	 * @see ca.gc.asc_csa.symphony.core.AbstractOrbitModel
	 * @generated
	 */
	EClass getAbstractOrbitModel();

	/**
	 * Returns the meta object for the container reference '{@link ca.gc.asc_csa.symphony.core.AbstractOrbitModel#getOrbitModelsList <em>Orbit Models List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Orbit Models List</em>'.
	 * @see ca.gc.asc_csa.symphony.core.AbstractOrbitModel#getOrbitModelsList()
	 * @see #getAbstractOrbitModel()
	 * @generated
	 */
	EReference getAbstractOrbitModel_OrbitModelsList();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.symphony.core.AbstractOrbitModel#getVariableFeatureReference <em>Variable Feature Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable Feature Reference</em>'.
	 * @see ca.gc.asc_csa.symphony.core.AbstractOrbitModel#getVariableFeatureReference()
	 * @see #getAbstractOrbitModel()
	 * @generated
	 */
	EReference getAbstractOrbitModel_VariableFeatureReference();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.symphony.core.Positioned <em>Positioned</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Positioned</em>'.
	 * @see ca.gc.asc_csa.symphony.core.Positioned
	 * @generated
	 */
	EClass getPositioned();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.symphony.core.Positioned#getPose <em>Pose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pose</em>'.
	 * @see ca.gc.asc_csa.symphony.core.Positioned#getPose()
	 * @see #getPositioned()
	 * @generated
	 */
	EReference getPositioned_Pose();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.symphony.core.TopologyRoot <em>Topology Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Topology Root</em>'.
	 * @see ca.gc.asc_csa.symphony.core.TopologyRoot
	 * @generated
	 */
	EClass getTopologyRoot();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.symphony.core.TopologyRoot#getOriginNode <em>Origin Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Origin Node</em>'.
	 * @see ca.gc.asc_csa.symphony.core.TopologyRoot#getOriginNode()
	 * @see #getTopologyRoot()
	 * @generated
	 */
	EReference getTopologyRoot_OriginNode();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.symphony.core.FeatureOfInterestList <em>Feature Of Interest List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Of Interest List</em>'.
	 * @see ca.gc.asc_csa.symphony.core.FeatureOfInterestList
	 * @generated
	 */
	EClass getFeatureOfInterestList();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.gc.asc_csa.symphony.core.FeatureOfInterestList#getFeaturesOfInterest <em>Features Of Interest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features Of Interest</em>'.
	 * @see ca.gc.asc_csa.symphony.core.FeatureOfInterestList#getFeaturesOfInterest()
	 * @see #getFeatureOfInterestList()
	 * @generated
	 */
	EReference getFeatureOfInterestList_FeaturesOfInterest();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.symphony.core.FeatureOfInterest <em>Feature Of Interest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Of Interest</em>'.
	 * @see ca.gc.asc_csa.symphony.core.FeatureOfInterest
	 * @generated
	 */
	EClass getFeatureOfInterest();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.symphony.core.PositionedResult <em>Positioned Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Positioned Result</em>'.
	 * @see ca.gc.asc_csa.symphony.core.PositionedResult
	 * @generated
	 */
	EClass getPositionedResult();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.symphony.core.OperationCallPositionedResult <em>Operation Call Positioned Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Call Positioned Result</em>'.
	 * @see ca.gc.asc_csa.symphony.core.OperationCallPositionedResult
	 * @generated
	 */
	EClass getOperationCallPositionedResult();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.symphony.core.OperationCallPositionedResult#getRelativePose <em>Relative Pose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Relative Pose</em>'.
	 * @see ca.gc.asc_csa.symphony.core.OperationCallPositionedResult#getRelativePose()
	 * @see #getOperationCallPositionedResult()
	 * @generated
	 */
	EReference getOperationCallPositionedResult_RelativePose();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.symphony.core.UserDefinedResult <em>User Defined Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Defined Result</em>'.
	 * @see ca.gc.asc_csa.symphony.core.UserDefinedResult
	 * @generated
	 */
	EClass getUserDefinedResult();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.symphony.core.ResultNode <em>Result Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Result Node</em>'.
	 * @see ca.gc.asc_csa.symphony.core.ResultNode
	 * @generated
	 */
	EClass getResultNode();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.symphony.core.ResultNode#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Result</em>'.
	 * @see ca.gc.asc_csa.symphony.core.ResultNode#getResult()
	 * @see #getResultNode()
	 * @generated
	 */
	EReference getResultNode_Result();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.symphony.core.ResultsListNode <em>Results List Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Results List Node</em>'.
	 * @see ca.gc.asc_csa.symphony.core.ResultsListNode
	 * @generated
	 */
	EClass getResultsListNode();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.symphony.core.ResultsListNode#getResultsList <em>Results List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Results List</em>'.
	 * @see ca.gc.asc_csa.symphony.core.ResultsListNode#getResultsList()
	 * @see #getResultsListNode()
	 * @generated
	 */
	EReference getResultsListNode_ResultsList();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.symphony.core.FeatureOfInterestNode <em>Feature Of Interest Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Of Interest Node</em>'.
	 * @see ca.gc.asc_csa.symphony.core.FeatureOfInterestNode
	 * @generated
	 */
	EClass getFeatureOfInterestNode();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.symphony.core.FeatureOfInterestNode#getFeatureOfInterest <em>Feature Of Interest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature Of Interest</em>'.
	 * @see ca.gc.asc_csa.symphony.core.FeatureOfInterestNode#getFeatureOfInterest()
	 * @see #getFeatureOfInterestNode()
	 * @generated
	 */
	EReference getFeatureOfInterestNode_FeatureOfInterest();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.symphony.core.FeatureOfInterestListNode <em>Feature Of Interest List Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Of Interest List Node</em>'.
	 * @see ca.gc.asc_csa.symphony.core.FeatureOfInterestListNode
	 * @generated
	 */
	EClass getFeatureOfInterestListNode();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.symphony.core.FeatureOfInterestListNode#getFeatureOfInterestList <em>Feature Of Interest List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature Of Interest List</em>'.
	 * @see ca.gc.asc_csa.symphony.core.FeatureOfInterestListNode#getFeatureOfInterestList()
	 * @see #getFeatureOfInterestListNode()
	 * @generated
	 */
	EReference getFeatureOfInterestListNode_FeatureOfInterestList();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.symphony.core.Updatable <em>Updatable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Updatable</em>'.
	 * @see ca.gc.asc_csa.symphony.core.Updatable
	 * @generated
	 */
	EClass getUpdatable();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.symphony.core.Updatable#isUpdating <em>Updating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Updating</em>'.
	 * @see ca.gc.asc_csa.symphony.core.Updatable#isUpdating()
	 * @see #getUpdatable()
	 * @generated
	 */
	EAttribute getUpdatable_Updating();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.symphony.core.Updatable#isAutoUpdateEnabled <em>Auto Update Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Update Enabled</em>'.
	 * @see ca.gc.asc_csa.symphony.core.Updatable#isAutoUpdateEnabled()
	 * @see #getUpdatable()
	 * @generated
	 */
	EAttribute getUpdatable_AutoUpdateEnabled();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.symphony.core.Updatable#getDefaultAutoUpdateEnabled() <em>Get Default Auto Update Enabled</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Default Auto Update Enabled</em>' operation.
	 * @see ca.gc.asc_csa.symphony.core.Updatable#getDefaultAutoUpdateEnabled()
	 * @generated
	 */
	EOperation getUpdatable__GetDefaultAutoUpdateEnabled();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.symphony.core.Updatable#update() <em>Update</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update</em>' operation.
	 * @see ca.gc.asc_csa.symphony.core.Updatable#update()
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
	SymphonyCoreFactory getSymphonyCoreFactory();

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
		 * The meta object literal for the '{@link ca.gc.asc_csa.symphony.core.impl.SymphonyCoreFacadeImpl <em>Facade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.symphony.core.impl.SymphonyCoreFacadeImpl
		 * @see ca.gc.asc_csa.symphony.core.impl.SymphonyCorePackageImpl#getSymphonyCoreFacade()
		 * @generated
		 */
		EClass SYMPHONY_CORE_FACADE = eINSTANCE.getSymphonyCoreFacade();

		/**
		 * The meta object literal for the '<em><b>Compute Absolute Pose Matrix</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMPHONY_CORE_FACADE___COMPUTE_ABSOLUTE_POSE_MATRIX__SYMPHONYSYSTEM_MATRIX4X4 = eINSTANCE.getSymphonyCoreFacade__ComputeAbsolutePoseMatrix__SymphonySystem_Matrix4x4();

		/**
		 * The meta object literal for the '<em><b>Create Result Node</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMPHONY_CORE_FACADE___CREATE_RESULT_NODE__POSITIONEDRESULT = eINSTANCE.getSymphonyCoreFacade__CreateResultNode__PositionedResult();

		/**
		 * The meta object literal for the '<em><b>Create Symphony Session</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMPHONY_CORE_FACADE___CREATE_SYMPHONY_SESSION__BOOLEAN_BOOLEAN_BOOLEAN_BOOLEAN = eINSTANCE.getSymphonyCoreFacade__CreateSymphonySession__boolean_boolean_boolean_boolean();

		/**
		 * The meta object literal for the '<em><b>Get Symphony System</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMPHONY_CORE_FACADE___GET_SYMPHONY_SYSTEM__ENVIRONMENT_STRING = eINSTANCE.getSymphonyCoreFacade__GetSymphonySystem__Environment_String();

		/**
		 * The meta object literal for the '<em><b>Load Feature Of Interest From File</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMPHONY_CORE_FACADE___LOAD_FEATURE_OF_INTEREST_FROM_FILE__STRING = eINSTANCE.getSymphonyCoreFacade__LoadFeatureOfInterestFromFile__String();

		/**
		 * The meta object literal for the '<em><b>Save Feature Of Interest To File</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMPHONY_CORE_FACADE___SAVE_FEATURE_OF_INTEREST_TO_FILE__STRING_LIST = eINSTANCE.getSymphonyCoreFacade__SaveFeatureOfInterestToFile__String_List();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.symphony.core.impl.SymphonyEnvironmentImpl <em>Symphony Environment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.symphony.core.impl.SymphonyEnvironmentImpl
		 * @see ca.gc.asc_csa.symphony.core.impl.SymphonyCorePackageImpl#getSymphonyEnvironment()
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
		 * The meta object literal for the '{@link ca.gc.asc_csa.symphony.core.impl.SymphonyTopologyImpl <em>Symphony Topology</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.symphony.core.impl.SymphonyTopologyImpl
		 * @see ca.gc.asc_csa.symphony.core.impl.SymphonyCorePackageImpl#getSymphonyTopology()
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
		 * The meta object literal for the '{@link ca.gc.asc_csa.symphony.core.impl.SymphonySystemImpl <em>Symphony System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.symphony.core.impl.SymphonySystemImpl
		 * @see ca.gc.asc_csa.symphony.core.impl.SymphonyCorePackageImpl#getSymphonySystem()
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
		 * The meta object literal for the '{@link ca.gc.asc_csa.symphony.core.impl.SymphonySystemApiAdapterImpl <em>Symphony System Api Adapter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.symphony.core.impl.SymphonySystemApiAdapterImpl
		 * @see ca.gc.asc_csa.symphony.core.impl.SymphonyCorePackageImpl#getSymphonySystemApiAdapter()
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
		 * The meta object literal for the '{@link ca.gc.asc_csa.symphony.core.impl.ConnectionPointsListImpl <em>Connection Points List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.symphony.core.impl.ConnectionPointsListImpl
		 * @see ca.gc.asc_csa.symphony.core.impl.SymphonyCorePackageImpl#getConnectionPointsList()
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
		 * The meta object literal for the '{@link ca.gc.asc_csa.symphony.core.impl.ConnectionPointImpl <em>Connection Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.symphony.core.impl.ConnectionPointImpl
		 * @see ca.gc.asc_csa.symphony.core.impl.SymphonyCorePackageImpl#getConnectionPoint()
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
		 * The meta object literal for the '{@link ca.gc.asc_csa.symphony.core.impl.AssemblyLinkImpl <em>Assembly Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.symphony.core.impl.AssemblyLinkImpl
		 * @see ca.gc.asc_csa.symphony.core.impl.SymphonyCorePackageImpl#getAssemblyLink()
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
		 * The meta object literal for the '{@link ca.gc.asc_csa.symphony.core.impl.AssemblyLinksListImpl <em>Assembly Links List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.symphony.core.impl.AssemblyLinksListImpl
		 * @see ca.gc.asc_csa.symphony.core.impl.SymphonyCorePackageImpl#getAssemblyLinksList()
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
		 * The meta object literal for the '{@link ca.gc.asc_csa.symphony.core.impl.PoseProviderImpl <em>Pose Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.symphony.core.impl.PoseProviderImpl
		 * @see ca.gc.asc_csa.symphony.core.impl.SymphonyCorePackageImpl#getPoseProvider()
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
		 * The meta object literal for the '{@link ca.gc.asc_csa.symphony.core.impl.AbsolutePoseProviderImpl <em>Absolute Pose Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.symphony.core.impl.AbsolutePoseProviderImpl
		 * @see ca.gc.asc_csa.symphony.core.impl.SymphonyCorePackageImpl#getAbsolutePoseProvider()
		 * @generated
		 */
		EClass ABSOLUTE_POSE_PROVIDER = eINSTANCE.getAbsolutePoseProvider();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.symphony.core.impl.PoseCorrectorImpl <em>Pose Corrector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.symphony.core.impl.PoseCorrectorImpl
		 * @see ca.gc.asc_csa.symphony.core.impl.SymphonyCorePackageImpl#getPoseCorrector()
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
		 * The meta object literal for the '{@link ca.gc.asc_csa.symphony.core.impl.SymphonyInitializationDataImpl <em>Symphony Initialization Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.symphony.core.impl.SymphonyInitializationDataImpl
		 * @see ca.gc.asc_csa.symphony.core.impl.SymphonyCorePackageImpl#getSymphonyInitializationData()
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
		 * The meta object literal for the '{@link ca.gc.asc_csa.symphony.core.impl.WorksitesListImpl <em>Worksites List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.symphony.core.impl.WorksitesListImpl
		 * @see ca.gc.asc_csa.symphony.core.impl.SymphonyCorePackageImpl#getWorksitesList()
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
		 * The meta object literal for the '{@link ca.gc.asc_csa.symphony.core.impl.AbstractWorksiteImpl <em>Abstract Worksite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.symphony.core.impl.AbstractWorksiteImpl
		 * @see ca.gc.asc_csa.symphony.core.impl.SymphonyCorePackageImpl#getAbstractWorksite()
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
		 * The meta object literal for the '{@link ca.gc.asc_csa.symphony.core.impl.OrbitModelsListImpl <em>Orbit Models List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.symphony.core.impl.OrbitModelsListImpl
		 * @see ca.gc.asc_csa.symphony.core.impl.SymphonyCorePackageImpl#getOrbitModelsList()
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
		 * The meta object literal for the '{@link ca.gc.asc_csa.symphony.core.impl.AbstractOrbitModelImpl <em>Abstract Orbit Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.symphony.core.impl.AbstractOrbitModelImpl
		 * @see ca.gc.asc_csa.symphony.core.impl.SymphonyCorePackageImpl#getAbstractOrbitModel()
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
		 * The meta object literal for the '<em><b>Variable Feature Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_ORBIT_MODEL__VARIABLE_FEATURE_REFERENCE = eINSTANCE.getAbstractOrbitModel_VariableFeatureReference();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.symphony.core.impl.PositionedImpl <em>Positioned</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.symphony.core.impl.PositionedImpl
		 * @see ca.gc.asc_csa.symphony.core.impl.SymphonyCorePackageImpl#getPositioned()
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
		 * The meta object literal for the '{@link ca.gc.asc_csa.symphony.core.impl.TopologyRootImpl <em>Topology Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.symphony.core.impl.TopologyRootImpl
		 * @see ca.gc.asc_csa.symphony.core.impl.SymphonyCorePackageImpl#getTopologyRoot()
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
		 * The meta object literal for the '{@link ca.gc.asc_csa.symphony.core.impl.FeatureOfInterestListImpl <em>Feature Of Interest List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.symphony.core.impl.FeatureOfInterestListImpl
		 * @see ca.gc.asc_csa.symphony.core.impl.SymphonyCorePackageImpl#getFeatureOfInterestList()
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
		 * The meta object literal for the '{@link ca.gc.asc_csa.symphony.core.impl.FeatureOfInterestImpl <em>Feature Of Interest</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.symphony.core.impl.FeatureOfInterestImpl
		 * @see ca.gc.asc_csa.symphony.core.impl.SymphonyCorePackageImpl#getFeatureOfInterest()
		 * @generated
		 */
		EClass FEATURE_OF_INTEREST = eINSTANCE.getFeatureOfInterest();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.symphony.core.impl.PositionedResultImpl <em>Positioned Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.symphony.core.impl.PositionedResultImpl
		 * @see ca.gc.asc_csa.symphony.core.impl.SymphonyCorePackageImpl#getPositionedResult()
		 * @generated
		 */
		EClass POSITIONED_RESULT = eINSTANCE.getPositionedResult();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.symphony.core.impl.OperationCallPositionedResultImpl <em>Operation Call Positioned Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.symphony.core.impl.OperationCallPositionedResultImpl
		 * @see ca.gc.asc_csa.symphony.core.impl.SymphonyCorePackageImpl#getOperationCallPositionedResult()
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
		 * The meta object literal for the '{@link ca.gc.asc_csa.symphony.core.impl.UserDefinedResultImpl <em>User Defined Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.symphony.core.impl.UserDefinedResultImpl
		 * @see ca.gc.asc_csa.symphony.core.impl.SymphonyCorePackageImpl#getUserDefinedResult()
		 * @generated
		 */
		EClass USER_DEFINED_RESULT = eINSTANCE.getUserDefinedResult();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.symphony.core.impl.ResultNodeImpl <em>Result Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.symphony.core.impl.ResultNodeImpl
		 * @see ca.gc.asc_csa.symphony.core.impl.SymphonyCorePackageImpl#getResultNode()
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
		 * The meta object literal for the '{@link ca.gc.asc_csa.symphony.core.impl.ResultsListNodeImpl <em>Results List Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.symphony.core.impl.ResultsListNodeImpl
		 * @see ca.gc.asc_csa.symphony.core.impl.SymphonyCorePackageImpl#getResultsListNode()
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
		 * The meta object literal for the '{@link ca.gc.asc_csa.symphony.core.impl.FeatureOfInterestNodeImpl <em>Feature Of Interest Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.symphony.core.impl.FeatureOfInterestNodeImpl
		 * @see ca.gc.asc_csa.symphony.core.impl.SymphonyCorePackageImpl#getFeatureOfInterestNode()
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
		 * The meta object literal for the '{@link ca.gc.asc_csa.symphony.core.impl.FeatureOfInterestListNodeImpl <em>Feature Of Interest List Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.symphony.core.impl.FeatureOfInterestListNodeImpl
		 * @see ca.gc.asc_csa.symphony.core.impl.SymphonyCorePackageImpl#getFeatureOfInterestListNode()
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
		 * The meta object literal for the '{@link ca.gc.asc_csa.symphony.core.impl.UpdatableImpl <em>Updatable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.symphony.core.impl.UpdatableImpl
		 * @see ca.gc.asc_csa.symphony.core.impl.SymphonyCorePackageImpl#getUpdatable()
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
		 * @see ca.gc.asc_csa.symphony.core.impl.SymphonyCorePackageImpl#getMap()
		 * @generated
		 */
		EDataType MAP = eINSTANCE.getMap();

		/**
		 * The meta object literal for the '<em>List</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see ca.gc.asc_csa.symphony.core.impl.SymphonyCorePackageImpl#getList()
		 * @generated
		 */
		EDataType LIST = eINSTANCE.getList();

		/**
		 * The meta object literal for the '<em>Collection</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Collection
		 * @see ca.gc.asc_csa.symphony.core.impl.SymphonyCorePackageImpl#getCollection()
		 * @generated
		 */
		EDataType COLLECTION = eINSTANCE.getCollection();

		/**
		 * The meta object literal for the '<em>Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Exception
		 * @see ca.gc.asc_csa.symphony.core.impl.SymphonyCorePackageImpl#getException()
		 * @generated
		 */
		EDataType EXCEPTION = eINSTANCE.getException();

	}

} //SymphonyCorePackage
