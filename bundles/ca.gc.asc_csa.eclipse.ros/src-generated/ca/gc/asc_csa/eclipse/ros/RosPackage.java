/**
 * Canadian Space Agency / Agence spatiale canadienne 2013 Copyrights (c)
 */
package ca.gc.asc_csa.eclipse.ros;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see ca.gc.asc_csa.eclipse.ros.RosFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='Ros' childCreationExtenders='true' extensibleProviderFactory='true' multipleEditorPages='false' copyrightText='Canadian Space Agency / Agence spatiale canadienne 2013 Copyrights (c)' modelName='Ros' suppressGenModelAnnotations='false' modelDirectory='/ca.gc.asc_csa.eclipse.ros/src-generated' editDirectory='/ca.gc.asc_csa.eclipse.ros.edit/src-generated' basePackage='ca.gc.asc_csa.eclipse'"
 * @generated
 */
public interface RosPackage extends EPackage
{
  /**
	 * The package name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNAME = "ros";

  /**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_URI = "ca.gc.asc_csa.eclipse.ros";

  /**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_PREFIX = "ros";

  /**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  RosPackage eINSTANCE = ca.gc.asc_csa.eclipse.ros.impl.RosPackageImpl.init();

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.eclipse.ros.RosInterface <em>Interface</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.eclipse.ros.RosInterface
	 * @see ca.gc.asc_csa.eclipse.ros.impl.RosPackageImpl#getRosInterface()
	 * @generated
	 */
  int ROS_INTERFACE = 1;

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.eclipse.ros.impl.RosPublisherImpl <em>Publisher</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.eclipse.ros.impl.RosPublisherImpl
	 * @see ca.gc.asc_csa.eclipse.ros.impl.RosPackageImpl#getRosPublisher()
	 * @generated
	 */
  int ROS_PUBLISHER = 3;

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.eclipse.ros.impl.RosServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.eclipse.ros.impl.RosServiceImpl
	 * @see ca.gc.asc_csa.eclipse.ros.impl.RosPackageImpl#getRosService()
	 * @generated
	 */
  int ROS_SERVICE = 5;

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.eclipse.ros.impl.RosListenerImpl <em>Listener</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.eclipse.ros.impl.RosListenerImpl
	 * @see ca.gc.asc_csa.eclipse.ros.impl.RosPackageImpl#getRosListener()
	 * @generated
	 */
  int ROS_LISTENER = 7;

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.eclipse.ros.impl.RosNodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.eclipse.ros.impl.RosNodeImpl
	 * @see ca.gc.asc_csa.eclipse.ros.impl.RosPackageImpl#getRosNode()
	 * @generated
	 */
  int ROS_NODE = 0;

  /**
	 * The feature id for the '<em><b>Connected Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_NODE__CONNECTED_NODE = 0;

  /**
	 * The meta object id for the '<em>Response Logger</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.eclipse.ros.utilities.ResponseLogger
	 * @see ca.gc.asc_csa.eclipse.ros.impl.RosPackageImpl#getResponseLogger()
	 * @generated
	 */
  int RESPONSE_LOGGER = 9;

  /**
	 * The meta object id for the '<em>Null Response Handler</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.eclipse.ros.utilities.NullResponseHandler
	 * @see ca.gc.asc_csa.eclipse.ros.impl.RosPackageImpl#getNullResponseHandler()
	 * @generated
	 */
  int NULL_RESPONSE_HANDLER = 10;

  /**
	 * The meta object id for the '<em>Null Request Handler</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.eclipse.ros.utilities.NullRequestHandler
	 * @see ca.gc.asc_csa.eclipse.ros.impl.RosPackageImpl#getNullRequestHandler()
	 * @generated
	 */
  int NULL_REQUEST_HANDLER = 11;

  /**
	 * The meta object id for the '<em>Message</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.ros.internal.message.Message
	 * @see ca.gc.asc_csa.eclipse.ros.impl.RosPackageImpl#getMessage()
	 * @generated
	 */
  int MESSAGE = 14;

  /**
	 * The meta object id for the '<em>Publisher</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.ros.node.topic.Publisher
	 * @see ca.gc.asc_csa.eclipse.ros.impl.RosPackageImpl#getPublisher()
	 * @generated
	 */
  int PUBLISHER = 18;

  /**
	 * The meta object id for the '<em>Subscriber</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.ros.node.topic.Subscriber
	 * @see ca.gc.asc_csa.eclipse.ros.impl.RosPackageImpl#getSubscriber()
	 * @generated
	 */
  int SUBSCRIBER = 19;

  /**
	 * The meta object id for the '<em>Message Listener</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.ros.message.MessageListener
	 * @see ca.gc.asc_csa.eclipse.ros.impl.RosPackageImpl#getMessageListener()
	 * @generated
	 */
  int MESSAGE_LISTENER = 15;

  /**
	 * The meta object id for the '<em>Service Client</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.ros.node.service.ServiceClient
	 * @see ca.gc.asc_csa.eclipse.ros.impl.RosPackageImpl#getServiceClient()
	 * @generated
	 */
  int SERVICE_CLIENT = 17;

  /**
	 * The meta object id for the '<em>Service Not Found Exception</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.ros.exception.ServiceNotFoundException
	 * @see ca.gc.asc_csa.eclipse.ros.impl.RosPackageImpl#getServiceNotFoundException()
	 * @generated
	 */
  int SERVICE_NOT_FOUND_EXCEPTION = 13;

  /**
	 * The meta object id for the '<em>Exception</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see java.lang.Exception
	 * @see ca.gc.asc_csa.eclipse.ros.impl.RosPackageImpl#getException()
	 * @generated
	 */
  int EXCEPTION = 20;

  /**
	 * The meta object id for the '<em>Hash Map</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see java.util.HashMap
	 * @see ca.gc.asc_csa.eclipse.ros.impl.RosPackageImpl#getHashMap()
	 * @generated
	 */
  int HASH_MAP = 21;

  /**
	 * The meta object id for the '<em>Connected Node</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.ros.node.ConnectedNode
	 * @see ca.gc.asc_csa.eclipse.ros.impl.RosPackageImpl#getConnectedNode()
	 * @generated
	 */
  int CONNECTED_NODE = 12;

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.eclipse.ros.impl.RosServiceManagerImpl <em>Service Manager</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.eclipse.ros.impl.RosServiceManagerImpl
	 * @see ca.gc.asc_csa.eclipse.ros.impl.RosPackageImpl#getRosServiceManager()
	 * @generated
	 */
  int ROS_SERVICE_MANAGER = 4;

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.eclipse.ros.impl.RosTopicLauncherImpl <em>Topic Launcher</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.eclipse.ros.impl.RosTopicLauncherImpl
	 * @see ca.gc.asc_csa.eclipse.ros.impl.RosPackageImpl#getRosTopicLauncher()
	 * @generated
	 */
  int ROS_TOPIC_LAUNCHER = 6;

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.eclipse.ros.impl.RosPublisherManagerImpl <em>Publisher Manager</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.eclipse.ros.impl.RosPublisherManagerImpl
	 * @see ca.gc.asc_csa.eclipse.ros.impl.RosPackageImpl#getRosPublisherManager()
	 * @generated
	 */
  int ROS_PUBLISHER_MANAGER = 2;

  /**
	 * The feature id for the '<em><b>Modules</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_NODE__MODULES = 1;

  /**
	 * The feature id for the '<em><b>Service Managers</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_NODE__SERVICE_MANAGERS = 2;

  /**
	 * The feature id for the '<em><b>Topic Launchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_NODE__TOPIC_LAUNCHERS = 3;

  /**
	 * The feature id for the '<em><b>Publisher Managers</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_NODE__PUBLISHER_MANAGERS = 4;

  /**
	 * The feature id for the '<em><b>Initialized</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_NODE__INITIALIZED = 5;

  /**
	 * The feature id for the '<em><b>Connected</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_NODE__CONNECTED = 6;

  /**
	 * The feature id for the '<em><b>Restarting</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_NODE__RESTARTING = 7;

  /**
	 * The feature id for the '<em><b>Enable Auto Restart On Connection Lost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_NODE__ENABLE_AUTO_RESTART_ON_CONNECTION_LOST = 8;

		/**
	 * The feature id for the '<em><b>Node Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_NODE__NODE_NAME = 9;

  /**
	 * The feature id for the '<em><b>Response Logger</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_NODE__RESPONSE_LOGGER = 10;

  /**
	 * The feature id for the '<em><b>Null Response Handler</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_NODE__NULL_RESPONSE_HANDLER = 11;

  /**
	 * The feature id for the '<em><b>Null Request Handler</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_NODE__NULL_REQUEST_HANDLER = 12;

  /**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_NODE_FEATURE_COUNT = 13;

  /**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_NODE___START = 0;

  /**
	 * The operation id for the '<em>Initialize</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_NODE___INITIALIZE = 1;

  /**
	 * The operation id for the '<em>On Start</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_NODE___ON_START__CONNECTEDNODE = 2;

  /**
	 * The operation id for the '<em>Restart</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_NODE___RESTART = 3;

  /**
	 * The operation id for the '<em>Register</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_NODE___REGISTER__ROSINTERFACE_BOOLEAN = 4;

  /**
	 * The operation id for the '<em>Register</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_NODE___REGISTER__ROSINTERFACE = 5;

  /**
	 * The operation id for the '<em>New From Type</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_NODE___NEW_FROM_TYPE__STRING = 6;

  /**
	 * The operation id for the '<em>Shutdown</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_NODE___SHUTDOWN = 7;

  /**
	 * The operation id for the '<em>Create Publisher</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_NODE___CREATE_PUBLISHER__STRING_STRING = 8;

  /**
	 * The operation id for the '<em>Create Service Manager</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_NODE___CREATE_SERVICE_MANAGER = 9;

  /**
	 * The operation id for the '<em>Create Topic Launcher</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_NODE___CREATE_TOPIC_LAUNCHER = 10;

  /**
	 * The operation id for the '<em>Create Publisher Manager</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_NODE___CREATE_PUBLISHER_MANAGER = 11;

  /**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_NODE_OPERATION_COUNT = 12;

  /**
	 * The feature id for the '<em><b>Service Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_INTERFACE__SERVICE_MANAGER = 0;

  /**
	 * The feature id for the '<em><b>Topic Launcher</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_INTERFACE__TOPIC_LAUNCHER = 1;

  /**
	 * The feature id for the '<em><b>Publisher Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_INTERFACE__PUBLISHER_MANAGER = 2;

  /**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_INTERFACE__NODE = 3;

  /**
	 * The number of structural features of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_INTERFACE_FEATURE_COUNT = 4;

  /**
	 * The operation id for the '<em>Ros Init</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_INTERFACE___ROS_INIT = 0;

  /**
	 * The number of operations of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_INTERFACE_OPERATION_COUNT = 1;

  /**
	 * The feature id for the '<em><b>Publishers</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_PUBLISHER_MANAGER__PUBLISHERS = 0;

  /**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_PUBLISHER_MANAGER__NODE = 1;

  /**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_PUBLISHER_MANAGER__RUNNING = 2;

  /**
	 * The number of structural features of the '<em>Publisher Manager</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_PUBLISHER_MANAGER_FEATURE_COUNT = 3;

  /**
	 * The operation id for the '<em>Create Publisher</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_PUBLISHER_MANAGER___CREATE_PUBLISHER__STRING_STRING = 0;

  /**
	 * The operation id for the '<em>Launch</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_PUBLISHER_MANAGER___LAUNCH = 1;

  /**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_PUBLISHER_MANAGER___STOP = 2;

  /**
	 * The operation id for the '<em>Create Message</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_PUBLISHER_MANAGER___CREATE_MESSAGE__STRING = 3;

  /**
	 * The operation id for the '<em>Publish</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_PUBLISHER_MANAGER___PUBLISH__STRING_MESSAGE = 4;

  /**
	 * The operation id for the '<em>Get Publisher</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_PUBLISHER_MANAGER___GET_PUBLISHER__STRING = 5;

  /**
	 * The number of operations of the '<em>Publisher Manager</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_PUBLISHER_MANAGER_OPERATION_COUNT = 6;

  /**
	 * The feature id for the '<em><b>Launched</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_PUBLISHER__LAUNCHED = 0;

  /**
	 * The feature id for the '<em><b>Topic Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_PUBLISHER__TOPIC_NAME = 1;

  /**
	 * The feature id for the '<em><b>Message Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_PUBLISHER__MESSAGE_TYPE = 2;

  /**
	 * The feature id for the '<em><b>Publisher</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_PUBLISHER__PUBLISHER = 3;

  /**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_PUBLISHER__NODE = 4;

  /**
	 * The number of structural features of the '<em>Publisher</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_PUBLISHER_FEATURE_COUNT = 5;

  /**
	 * The operation id for the '<em>Launch</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_PUBLISHER___LAUNCH__ROSNODE = 0;

  /**
	 * The operation id for the '<em>Publish</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_PUBLISHER___PUBLISH__MESSAGE = 1;

  /**
	 * The operation id for the '<em>New Message</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_PUBLISHER___NEW_MESSAGE = 2;

  /**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_PUBLISHER___STOP = 3;

  /**
	 * The number of operations of the '<em>Publisher</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_PUBLISHER_OPERATION_COUNT = 4;

  /**
	 * The feature id for the '<em><b>Services</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_SERVICE_MANAGER__SERVICES = 0;

  /**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_SERVICE_MANAGER__NODE = 1;

  /**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_SERVICE_MANAGER__RUNNING = 2;

  /**
	 * The number of structural features of the '<em>Service Manager</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_SERVICE_MANAGER_FEATURE_COUNT = 3;

  /**
	 * The operation id for the '<em>Create Service</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_SERVICE_MANAGER___CREATE_SERVICE__STRING_STRING = 0;

  /**
	 * The operation id for the '<em>Create Service</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_SERVICE_MANAGER___CREATE_SERVICE__STRING_STRING_BOOLEAN = 1;

  /**
	 * The operation id for the '<em>Get Service</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_SERVICE_MANAGER___GET_SERVICE__STRING = 2;

  /**
	 * The operation id for the '<em>Create Request Message</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_SERVICE_MANAGER___CREATE_REQUEST_MESSAGE__STRING = 3;

  /**
	 * The operation id for the '<em>Call Service</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_SERVICE_MANAGER___CALL_SERVICE__STRING_MESSAGE = 4;

  /**
	 * The operation id for the '<em>Call Service</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_SERVICE_MANAGER___CALL_SERVICE__STRING = 5;

  /**
	 * The operation id for the '<em>Call Service</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_SERVICE_MANAGER___CALL_SERVICE__STRING_MESSAGE_BOOLEAN = 6;

  /**
	 * The operation id for the '<em>Call Service</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_SERVICE_MANAGER___CALL_SERVICE__STRING_BOOLEAN = 7;

  /**
	 * The operation id for the '<em>Launch</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_SERVICE_MANAGER___LAUNCH = 8;

  /**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_SERVICE_MANAGER___STOP = 9;

  /**
	 * The number of operations of the '<em>Service Manager</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_SERVICE_MANAGER_OPERATION_COUNT = 10;

  /**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_SERVICE__SERVICE_NAME = 0;

  /**
	 * The feature id for the '<em><b>Service Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_SERVICE__SERVICE_TYPE = 1;

  /**
	 * The feature id for the '<em><b>Launched</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_SERVICE__LAUNCHED = 2;

  /**
	 * The feature id for the '<em><b>Service Client</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_SERVICE__SERVICE_CLIENT = 3;

  /**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_SERVICE__NODE = 4;

  /**
	 * The feature id for the '<em><b>Disconnect On Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_SERVICE__DISCONNECT_ON_TIMEOUT = 5;

  /**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_SERVICE_FEATURE_COUNT = 6;

  /**
	 * The operation id for the '<em>Launch</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_SERVICE___LAUNCH__ROSNODE = 0;

  /**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_SERVICE___STOP = 1;

  /**
	 * The operation id for the '<em>New Request Message</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_SERVICE___NEW_REQUEST_MESSAGE = 2;

  /**
	 * The operation id for the '<em>Call</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_SERVICE___CALL__MESSAGE = 3;

  /**
	 * The operation id for the '<em>Call</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_SERVICE___CALL__MESSAGE_BOOLEAN = 4;

  /**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_SERVICE_OPERATION_COUNT = 5;

  /**
	 * The feature id for the '<em><b>Listener List</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_TOPIC_LAUNCHER__LISTENER_LIST = 0;

  /**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_TOPIC_LAUNCHER__NODE = 1;

		/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_TOPIC_LAUNCHER__RUNNING = 2;

  /**
	 * The number of structural features of the '<em>Topic Launcher</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_TOPIC_LAUNCHER_FEATURE_COUNT = 3;

  /**
	 * The operation id for the '<em>Create Listener</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_TOPIC_LAUNCHER___CREATE_LISTENER__STRING_STRING_MESSAGELISTENER = 0;

  /**
	 * The operation id for the '<em>Launch</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_TOPIC_LAUNCHER___LAUNCH = 1;

  /**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_TOPIC_LAUNCHER___STOP = 2;

  /**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_TOPIC_LAUNCHER___RESET = 3;

  /**
	 * The number of operations of the '<em>Topic Launcher</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_TOPIC_LAUNCHER_OPERATION_COUNT = 4;

  /**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_LISTENER__RUNNING = 0;

  /**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_LISTENER__NODE = 1;

  /**
	 * The feature id for the '<em><b>Ros Subscriber</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_LISTENER__ROS_SUBSCRIBER = 2;

  /**
	 * The feature id for the '<em><b>Topic Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_LISTENER__TOPIC_NAME = 3;

  /**
	 * The feature id for the '<em><b>Message Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_LISTENER__MESSAGE_TYPE = 4;

  /**
	 * The feature id for the '<em><b>Message Listener</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_LISTENER__MESSAGE_LISTENER = 5;

  /**
	 * The number of structural features of the '<em>Listener</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_LISTENER_FEATURE_COUNT = 6;

  /**
	 * The operation id for the '<em>Start With Locks</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_LISTENER___START_WITH_LOCKS__ROSNODE = 0;

  /**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_LISTENER___START__ROSNODE = 1;

  /**
	 * The operation id for the '<em>Connect Subscriber</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_LISTENER___CONNECT_SUBSCRIBER__CONNECTEDNODE = 2;

  /**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_LISTENER___STOP = 3;

  /**
	 * The number of operations of the '<em>Listener</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROS_LISTENER_OPERATION_COUNT = 4;

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.eclipse.ros.impl.RosFacadeImpl <em>Facade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.eclipse.ros.impl.RosFacadeImpl
	 * @see ca.gc.asc_csa.eclipse.ros.impl.RosPackageImpl#getRosFacade()
	 * @generated
	 */
	int ROS_FACADE = 8;

		/**
	 * The number of structural features of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_FACADE_FEATURE_COUNT = 0;

		/**
	 * The operation id for the '<em>Get Node Name Prefix</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_FACADE___GET_NODE_NAME_PREFIX = 0;

		/**
	 * The operation id for the '<em>Get ROS Master URI</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_FACADE___GET_ROS_MASTER_URI = 1;

		/**
	 * The operation id for the '<em>Get ROS Hostname</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_FACADE___GET_ROS_HOSTNAME = 2;

		/**
	 * The operation id for the '<em>Get ROS Ip</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_FACADE___GET_ROS_IP = 3;

		/**
	 * The number of operations of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_FACADE_OPERATION_COUNT = 4;

		/**
	 * The meta object id for the '<em>Abstract Node Main</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.ros.node.AbstractNodeMain
	 * @see ca.gc.asc_csa.eclipse.ros.impl.RosPackageImpl#getAbstractNodeMain()
	 * @generated
	 */
  int ABSTRACT_NODE_MAIN = 16;

  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.eclipse.ros.RosInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface</em>'.
	 * @see ca.gc.asc_csa.eclipse.ros.RosInterface
	 * @generated
	 */
  EClass getRosInterface();

  /**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.eclipse.ros.RosInterface#getServiceManager <em>Service Manager</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service Manager</em>'.
	 * @see ca.gc.asc_csa.eclipse.ros.RosInterface#getServiceManager()
	 * @see #getRosInterface()
	 * @generated
	 */
  EReference getRosInterface_ServiceManager();

  /**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.eclipse.ros.RosInterface#getTopicLauncher <em>Topic Launcher</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Topic Launcher</em>'.
	 * @see ca.gc.asc_csa.eclipse.ros.RosInterface#getTopicLauncher()
	 * @see #getRosInterface()
	 * @generated
	 */
  EReference getRosInterface_TopicLauncher();

  /**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.eclipse.ros.RosInterface#getPublisherManager <em>Publisher Manager</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Publisher Manager</em>'.
	 * @see ca.gc.asc_csa.eclipse.ros.RosInterface#getPublisherManager()
	 * @see #getRosInterface()
	 * @generated
	 */
  EReference getRosInterface_PublisherManager();

  /**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.eclipse.ros.RosInterface#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Node</em>'.
	 * @see ca.gc.asc_csa.eclipse.ros.RosInterface#getNode()
	 * @see #getRosInterface()
	 * @generated
	 */
  EReference getRosInterface_Node();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.eclipse.ros.RosInterface#rosInit() <em>Ros Init</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Ros Init</em>' operation.
	 * @see ca.gc.asc_csa.eclipse.ros.RosInterface#rosInit()
	 * @generated
	 */
  EOperation getRosInterface__RosInit();

  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.eclipse.ros.RosPublisher <em>Publisher</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Publisher</em>'.
	 * @see ca.gc.asc_csa.eclipse.ros.RosPublisher
	 * @generated
	 */
  EClass getRosPublisher();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.eclipse.ros.RosPublisher#isLaunched <em>Launched</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Launched</em>'.
	 * @see ca.gc.asc_csa.eclipse.ros.RosPublisher#isLaunched()
	 * @see #getRosPublisher()
	 * @generated
	 */
  EAttribute getRosPublisher_Launched();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.eclipse.ros.RosPublisher#getTopicName <em>Topic Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Topic Name</em>'.
	 * @see ca.gc.asc_csa.eclipse.ros.RosPublisher#getTopicName()
	 * @see #getRosPublisher()
	 * @generated
	 */
  EAttribute getRosPublisher_TopicName();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.eclipse.ros.RosPublisher#getMessageType <em>Message Type</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Type</em>'.
	 * @see ca.gc.asc_csa.eclipse.ros.RosPublisher#getMessageType()
	 * @see #getRosPublisher()
	 * @generated
	 */
  EAttribute getRosPublisher_MessageType();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.eclipse.ros.RosPublisher#getPublisher <em>Publisher</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Publisher</em>'.
	 * @see ca.gc.asc_csa.eclipse.ros.RosPublisher#getPublisher()
	 * @see #getRosPublisher()
	 * @generated
	 */
  EAttribute getRosPublisher_Publisher();

  /**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.eclipse.ros.RosPublisher#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Node</em>'.
	 * @see ca.gc.asc_csa.eclipse.ros.RosPublisher#getNode()
	 * @see #getRosPublisher()
	 * @generated
	 */
  EReference getRosPublisher_Node();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.eclipse.ros.RosPublisher#launch(ca.gc.asc_csa.eclipse.ros.RosNode) <em>Launch</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Launch</em>' operation.
	 * @see ca.gc.asc_csa.eclipse.ros.RosPublisher#launch(ca.gc.asc_csa.eclipse.ros.RosNode)
	 * @generated
	 */
  EOperation getRosPublisher__Launch__RosNode();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.eclipse.ros.RosPublisher#publish(org.ros.internal.message.Message) <em>Publish</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Publish</em>' operation.
	 * @see ca.gc.asc_csa.eclipse.ros.RosPublisher#publish(org.ros.internal.message.Message)
	 * @generated
	 */
  EOperation getRosPublisher__Publish__Message();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.eclipse.ros.RosPublisher#newMessage() <em>New Message</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New Message</em>' operation.
	 * @see ca.gc.asc_csa.eclipse.ros.RosPublisher#newMessage()
	 * @generated
	 */
  EOperation getRosPublisher__NewMessage();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.eclipse.ros.RosPublisher#stop() <em>Stop</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Stop</em>' operation.
	 * @see ca.gc.asc_csa.eclipse.ros.RosPublisher#stop()
	 * @generated
	 */
  EOperation getRosPublisher__Stop();

  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.eclipse.ros.RosService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see ca.gc.asc_csa.eclipse.ros.RosService
	 * @generated
	 */
  EClass getRosService();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.eclipse.ros.RosService#getServiceName <em>Service Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Name</em>'.
	 * @see ca.gc.asc_csa.eclipse.ros.RosService#getServiceName()
	 * @see #getRosService()
	 * @generated
	 */
  EAttribute getRosService_ServiceName();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.eclipse.ros.RosService#getServiceType <em>Service Type</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Type</em>'.
	 * @see ca.gc.asc_csa.eclipse.ros.RosService#getServiceType()
	 * @see #getRosService()
	 * @generated
	 */
  EAttribute getRosService_ServiceType();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.eclipse.ros.RosService#isLaunched <em>Launched</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Launched</em>'.
	 * @see ca.gc.asc_csa.eclipse.ros.RosService#isLaunched()
	 * @see #getRosService()
	 * @generated
	 */
  EAttribute getRosService_Launched();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.eclipse.ros.RosService#getServiceClient <em>Service Client</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Client</em>'.
	 * @see ca.gc.asc_csa.eclipse.ros.RosService#getServiceClient()
	 * @see #getRosService()
	 * @generated
	 */
  EAttribute getRosService_ServiceClient();

  /**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.eclipse.ros.RosService#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Node</em>'.
	 * @see ca.gc.asc_csa.eclipse.ros.RosService#getNode()
	 * @see #getRosService()
	 * @generated
	 */
  EReference getRosService_Node();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.eclipse.ros.RosService#isDisconnectOnTimeout <em>Disconnect On Timeout</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disconnect On Timeout</em>'.
	 * @see ca.gc.asc_csa.eclipse.ros.RosService#isDisconnectOnTimeout()
	 * @see #getRosService()
	 * @generated
	 */
  EAttribute getRosService_DisconnectOnTimeout();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.eclipse.ros.RosService#launch(ca.gc.asc_csa.eclipse.ros.RosNode) <em>Launch</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Launch</em>' operation.
	 * @see ca.gc.asc_csa.eclipse.ros.RosService#launch(ca.gc.asc_csa.eclipse.ros.RosNode)
	 * @generated
	 */
  EOperation getRosService__Launch__RosNode();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.eclipse.ros.RosService#stop() <em>Stop</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Stop</em>' operation.
	 * @see ca.gc.asc_csa.eclipse.ros.RosService#stop()
	 * @generated
	 */
  EOperation getRosService__Stop();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.eclipse.ros.RosService#newRequestMessage() <em>New Request Message</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New Request Message</em>' operation.
	 * @see ca.gc.asc_csa.eclipse.ros.RosService#newRequestMessage()
	 * @generated
	 */
  EOperation getRosService__NewRequestMessage();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.eclipse.ros.RosService#call(org.ros.internal.message.Message) <em>Call</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Call</em>' operation.
	 * @see ca.gc.asc_csa.eclipse.ros.RosService#call(org.ros.internal.message.Message)
	 * @generated
	 */
  EOperation getRosService__Call__Message();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.eclipse.ros.RosService#call(org.ros.internal.message.Message, boolean) <em>Call</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Call</em>' operation.
	 * @see ca.gc.asc_csa.eclipse.ros.RosService#call(org.ros.internal.message.Message, boolean)
	 * @generated
	 */
  EOperation getRosService__Call__Message_boolean();

  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.eclipse.ros.RosListener <em>Listener</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Listener</em>'.
	 * @see ca.gc.asc_csa.eclipse.ros.RosListener
	 * @generated
	 */
  EClass getRosListener();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.eclipse.ros.RosListener#isRunning <em>Running</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Running</em>'.
	 * @see ca.gc.asc_csa.eclipse.ros.RosListener#isRunning()
	 * @see #getRosListener()
	 * @generated
	 */
  EAttribute getRosListener_Running();

  /**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.eclipse.ros.RosListener#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Node</em>'.
	 * @see ca.gc.asc_csa.eclipse.ros.RosListener#getNode()
	 * @see #getRosListener()
	 * @generated
	 */
  EReference getRosListener_Node();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.eclipse.ros.RosListener#getRosSubscriber <em>Ros Subscriber</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ros Subscriber</em>'.
	 * @see ca.gc.asc_csa.eclipse.ros.RosListener#getRosSubscriber()
	 * @see #getRosListener()
	 * @generated
	 */
  EAttribute getRosListener_RosSubscriber();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.eclipse.ros.RosListener#getTopicName <em>Topic Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Topic Name</em>'.
	 * @see ca.gc.asc_csa.eclipse.ros.RosListener#getTopicName()
	 * @see #getRosListener()
	 * @generated
	 */
  EAttribute getRosListener_TopicName();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.eclipse.ros.RosListener#getMessageType <em>Message Type</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Type</em>'.
	 * @see ca.gc.asc_csa.eclipse.ros.RosListener#getMessageType()
	 * @see #getRosListener()
	 * @generated
	 */
  EAttribute getRosListener_MessageType();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.eclipse.ros.RosListener#getMessageListener <em>Message Listener</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Listener</em>'.
	 * @see ca.gc.asc_csa.eclipse.ros.RosListener#getMessageListener()
	 * @see #getRosListener()
	 * @generated
	 */
  EAttribute getRosListener_MessageListener();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.eclipse.ros.RosListener#startWithLocks(ca.gc.asc_csa.eclipse.ros.RosNode) <em>Start With Locks</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Start With Locks</em>' operation.
	 * @see ca.gc.asc_csa.eclipse.ros.RosListener#startWithLocks(ca.gc.asc_csa.eclipse.ros.RosNode)
	 * @generated
	 */
  EOperation getRosListener__StartWithLocks__RosNode();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.eclipse.ros.RosListener#start(ca.gc.asc_csa.eclipse.ros.RosNode) <em>Start</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Start</em>' operation.
	 * @see ca.gc.asc_csa.eclipse.ros.RosListener#start(ca.gc.asc_csa.eclipse.ros.RosNode)
	 * @generated
	 */
  EOperation getRosListener__Start__RosNode();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.eclipse.ros.RosListener#connectSubscriber(org.ros.node.ConnectedNode) <em>Connect Subscriber</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Connect Subscriber</em>' operation.
	 * @see ca.gc.asc_csa.eclipse.ros.RosListener#connectSubscriber(org.ros.node.ConnectedNode)
	 * @generated
	 */
  EOperation getRosListener__ConnectSubscriber__ConnectedNode();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.eclipse.ros.RosListener#stop() <em>Stop</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Stop</em>' operation.
	 * @see ca.gc.asc_csa.eclipse.ros.RosListener#stop()
	 * @generated
	 */
  EOperation getRosListener__Stop();

  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.eclipse.ros.RosFacade <em>Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facade</em>'.
	 * @see ca.gc.asc_csa.eclipse.ros.RosFacade
	 * @generated
	 */
	EClass getRosFacade();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.eclipse.ros.RosFacade#getNodeNamePrefix() <em>Get Node Name Prefix</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Node Name Prefix</em>' operation.
	 * @see ca.gc.asc_csa.eclipse.ros.RosFacade#getNodeNamePrefix()
	 * @generated
	 */
	EOperation getRosFacade__GetNodeNamePrefix();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.eclipse.ros.RosFacade#getROSMasterURI() <em>Get ROS Master URI</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get ROS Master URI</em>' operation.
	 * @see ca.gc.asc_csa.eclipse.ros.RosFacade#getROSMasterURI()
	 * @generated
	 */
	EOperation getRosFacade__GetROSMasterURI();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.eclipse.ros.RosFacade#getROSHostname() <em>Get ROS Hostname</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get ROS Hostname</em>' operation.
	 * @see ca.gc.asc_csa.eclipse.ros.RosFacade#getROSHostname()
	 * @generated
	 */
	EOperation getRosFacade__GetROSHostname();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.eclipse.ros.RosFacade#getROSIp() <em>Get ROS Ip</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get ROS Ip</em>' operation.
	 * @see ca.gc.asc_csa.eclipse.ros.RosFacade#getROSIp()
	 * @generated
	 */
	EOperation getRosFacade__GetROSIp();

		/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.eclipse.ros.RosNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see ca.gc.asc_csa.eclipse.ros.RosNode
	 * @generated
	 */
  EClass getRosNode();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.eclipse.ros.RosNode#getConnectedNode <em>Connected Node</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connected Node</em>'.
	 * @see ca.gc.asc_csa.eclipse.ros.RosNode#getConnectedNode()
	 * @see #getRosNode()
	 * @generated
	 */
  EAttribute getRosNode_ConnectedNode();

  /**
	 * Returns the meta object for the reference list '{@link ca.gc.asc_csa.eclipse.ros.RosNode#getModules <em>Modules</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Modules</em>'.
	 * @see ca.gc.asc_csa.eclipse.ros.RosNode#getModules()
	 * @see #getRosNode()
	 * @generated
	 */
  EReference getRosNode_Modules();

  /**
	 * Returns the meta object for the reference list '{@link ca.gc.asc_csa.eclipse.ros.RosNode#getServiceManagers <em>Service Managers</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Service Managers</em>'.
	 * @see ca.gc.asc_csa.eclipse.ros.RosNode#getServiceManagers()
	 * @see #getRosNode()
	 * @generated
	 */
  EReference getRosNode_ServiceManagers();

  /**
	 * Returns the meta object for the reference list '{@link ca.gc.asc_csa.eclipse.ros.RosNode#getTopicLaunchers <em>Topic Launchers</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Topic Launchers</em>'.
	 * @see ca.gc.asc_csa.eclipse.ros.RosNode#getTopicLaunchers()
	 * @see #getRosNode()
	 * @generated
	 */
  EReference getRosNode_TopicLaunchers();

  /**
	 * Returns the meta object for the reference list '{@link ca.gc.asc_csa.eclipse.ros.RosNode#getPublisherManagers <em>Publisher Managers</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Publisher Managers</em>'.
	 * @see ca.gc.asc_csa.eclipse.ros.RosNode#getPublisherManagers()
	 * @see #getRosNode()
	 * @generated
	 */
  EReference getRosNode_PublisherManagers();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.eclipse.ros.RosNode#isInitialized <em>Initialized</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initialized</em>'.
	 * @see ca.gc.asc_csa.eclipse.ros.RosNode#isInitialized()
	 * @see #getRosNode()
	 * @generated
	 */
  EAttribute getRosNode_Initialized();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.eclipse.ros.RosNode#isConnected <em>Connected</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connected</em>'.
	 * @see ca.gc.asc_csa.eclipse.ros.RosNode#isConnected()
	 * @see #getRosNode()
	 * @generated
	 */
  EAttribute getRosNode_Connected();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.eclipse.ros.RosNode#isRestarting <em>Restarting</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Restarting</em>'.
	 * @see ca.gc.asc_csa.eclipse.ros.RosNode#isRestarting()
	 * @see #getRosNode()
	 * @generated
	 */
  EAttribute getRosNode_Restarting();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.eclipse.ros.RosNode#isEnableAutoRestartOnConnectionLost <em>Enable Auto Restart On Connection Lost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable Auto Restart On Connection Lost</em>'.
	 * @see ca.gc.asc_csa.eclipse.ros.RosNode#isEnableAutoRestartOnConnectionLost()
	 * @see #getRosNode()
	 * @generated
	 */
	EAttribute getRosNode_EnableAutoRestartOnConnectionLost();

		/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.eclipse.ros.RosNode#getNodeName <em>Node Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node Name</em>'.
	 * @see ca.gc.asc_csa.eclipse.ros.RosNode#getNodeName()
	 * @see #getRosNode()
	 * @generated
	 */
  EAttribute getRosNode_NodeName();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.eclipse.ros.RosNode#getResponseLogger <em>Response Logger</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Response Logger</em>'.
	 * @see ca.gc.asc_csa.eclipse.ros.RosNode#getResponseLogger()
	 * @see #getRosNode()
	 * @generated
	 */
  EAttribute getRosNode_ResponseLogger();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.eclipse.ros.RosNode#getNullResponseHandler <em>Null Response Handler</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Response Handler</em>'.
	 * @see ca.gc.asc_csa.eclipse.ros.RosNode#getNullResponseHandler()
	 * @see #getRosNode()
	 * @generated
	 */
  EAttribute getRosNode_NullResponseHandler();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.eclipse.ros.RosNode#getNullRequestHandler <em>Null Request Handler</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Request Handler</em>'.
	 * @see ca.gc.asc_csa.eclipse.ros.RosNode#getNullRequestHandler()
	 * @see #getRosNode()
	 * @generated
	 */
  EAttribute getRosNode_NullRequestHandler();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.eclipse.ros.RosNode#start() <em>Start</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Start</em>' operation.
	 * @see ca.gc.asc_csa.eclipse.ros.RosNode#start()
	 * @generated
	 */
  EOperation getRosNode__Start();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.eclipse.ros.RosNode#initialize() <em>Initialize</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Initialize</em>' operation.
	 * @see ca.gc.asc_csa.eclipse.ros.RosNode#initialize()
	 * @generated
	 */
  EOperation getRosNode__Initialize();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.eclipse.ros.RosNode#onStart(org.ros.node.ConnectedNode) <em>On Start</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>On Start</em>' operation.
	 * @see ca.gc.asc_csa.eclipse.ros.RosNode#onStart(org.ros.node.ConnectedNode)
	 * @generated
	 */
  EOperation getRosNode__OnStart__ConnectedNode();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.eclipse.ros.RosNode#restart() <em>Restart</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Restart</em>' operation.
	 * @see ca.gc.asc_csa.eclipse.ros.RosNode#restart()
	 * @generated
	 */
  EOperation getRosNode__Restart();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.eclipse.ros.RosNode#register(ca.gc.asc_csa.eclipse.ros.RosInterface, boolean) <em>Register</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register</em>' operation.
	 * @see ca.gc.asc_csa.eclipse.ros.RosNode#register(ca.gc.asc_csa.eclipse.ros.RosInterface, boolean)
	 * @generated
	 */
  EOperation getRosNode__Register__RosInterface_boolean();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.eclipse.ros.RosNode#register(ca.gc.asc_csa.eclipse.ros.RosInterface) <em>Register</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register</em>' operation.
	 * @see ca.gc.asc_csa.eclipse.ros.RosNode#register(ca.gc.asc_csa.eclipse.ros.RosInterface)
	 * @generated
	 */
  EOperation getRosNode__Register__RosInterface();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.eclipse.ros.RosNode#newFromType(java.lang.String) <em>New From Type</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New From Type</em>' operation.
	 * @see ca.gc.asc_csa.eclipse.ros.RosNode#newFromType(java.lang.String)
	 * @generated
	 */
  EOperation getRosNode__NewFromType__String();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.eclipse.ros.RosNode#shutdown() <em>Shutdown</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Shutdown</em>' operation.
	 * @see ca.gc.asc_csa.eclipse.ros.RosNode#shutdown()
	 * @generated
	 */
  EOperation getRosNode__Shutdown();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.eclipse.ros.RosNode#createPublisher(java.lang.String, java.lang.String) <em>Create Publisher</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Publisher</em>' operation.
	 * @see ca.gc.asc_csa.eclipse.ros.RosNode#createPublisher(java.lang.String, java.lang.String)
	 * @generated
	 */
  EOperation getRosNode__CreatePublisher__String_String();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.eclipse.ros.RosNode#createServiceManager() <em>Create Service Manager</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Service Manager</em>' operation.
	 * @see ca.gc.asc_csa.eclipse.ros.RosNode#createServiceManager()
	 * @generated
	 */
  EOperation getRosNode__CreateServiceManager();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.eclipse.ros.RosNode#createTopicLauncher() <em>Create Topic Launcher</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Topic Launcher</em>' operation.
	 * @see ca.gc.asc_csa.eclipse.ros.RosNode#createTopicLauncher()
	 * @generated
	 */
  EOperation getRosNode__CreateTopicLauncher();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.eclipse.ros.RosNode#createPublisherManager() <em>Create Publisher Manager</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Publisher Manager</em>' operation.
	 * @see ca.gc.asc_csa.eclipse.ros.RosNode#createPublisherManager()
	 * @generated
	 */
  EOperation getRosNode__CreatePublisherManager();

  /**
	 * Returns the meta object for data type '{@link ca.gc.asc_csa.eclipse.ros.utilities.ResponseLogger <em>Response Logger</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Response Logger</em>'.
	 * @see ca.gc.asc_csa.eclipse.ros.utilities.ResponseLogger
	 * @model instanceClass="ca.gc.asc_csa.eclipse.ros.utilities.ResponseLogger"
	 * @generated
	 */
  EDataType getResponseLogger();

  /**
	 * Returns the meta object for data type '{@link ca.gc.asc_csa.eclipse.ros.utilities.NullResponseHandler <em>Null Response Handler</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Null Response Handler</em>'.
	 * @see ca.gc.asc_csa.eclipse.ros.utilities.NullResponseHandler
	 * @model instanceClass="ca.gc.asc_csa.eclipse.ros.utilities.NullResponseHandler"
	 * @generated
	 */
  EDataType getNullResponseHandler();

  /**
	 * Returns the meta object for data type '{@link ca.gc.asc_csa.eclipse.ros.utilities.NullRequestHandler <em>Null Request Handler</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Null Request Handler</em>'.
	 * @see ca.gc.asc_csa.eclipse.ros.utilities.NullRequestHandler
	 * @model instanceClass="ca.gc.asc_csa.eclipse.ros.utilities.NullRequestHandler"
	 * @generated
	 */
  EDataType getNullRequestHandler();

  /**
	 * Returns the meta object for data type '{@link org.ros.internal.message.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Message</em>'.
	 * @see org.ros.internal.message.Message
	 * @model instanceClass="org.ros.internal.message.Message"
	 * @generated
	 */
  EDataType getMessage();

  /**
	 * Returns the meta object for data type '{@link org.ros.node.topic.Publisher <em>Publisher</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Publisher</em>'.
	 * @see org.ros.node.topic.Publisher
	 * @model instanceClass="org.ros.node.topic.Publisher" typeParameters="T"
	 * @generated
	 */
  EDataType getPublisher();

  /**
	 * Returns the meta object for data type '{@link org.ros.node.topic.Subscriber <em>Subscriber</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Subscriber</em>'.
	 * @see org.ros.node.topic.Subscriber
	 * @model instanceClass="org.ros.node.topic.Subscriber" typeParameters="T"
	 * @generated
	 */
  EDataType getSubscriber();

  /**
	 * Returns the meta object for data type '{@link org.ros.message.MessageListener <em>Message Listener</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Message Listener</em>'.
	 * @see org.ros.message.MessageListener
	 * @model instanceClass="org.ros.message.MessageListener" typeParameters="T"
	 * @generated
	 */
  EDataType getMessageListener();

  /**
	 * Returns the meta object for data type '{@link org.ros.node.service.ServiceClient <em>Service Client</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Service Client</em>'.
	 * @see org.ros.node.service.ServiceClient
	 * @model instanceClass="org.ros.node.service.ServiceClient" typeParameters="Request Response"
	 * @generated
	 */
  EDataType getServiceClient();

  /**
	 * Returns the meta object for data type '{@link org.ros.exception.ServiceNotFoundException <em>Service Not Found Exception</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Service Not Found Exception</em>'.
	 * @see org.ros.exception.ServiceNotFoundException
	 * @model instanceClass="org.ros.exception.ServiceNotFoundException"
	 * @generated
	 */
  EDataType getServiceNotFoundException();

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
	 * Returns the meta object for data type '{@link java.util.HashMap <em>Hash Map</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Hash Map</em>'.
	 * @see java.util.HashMap
	 * @model instanceClass="java.util.HashMap" typeParameters="Key Value"
	 * @generated
	 */
  EDataType getHashMap();

  /**
	 * Returns the meta object for data type '{@link org.ros.node.ConnectedNode <em>Connected Node</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Connected Node</em>'.
	 * @see org.ros.node.ConnectedNode
	 * @model instanceClass="org.ros.node.ConnectedNode"
	 * @generated
	 */
  EDataType getConnectedNode();

  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.eclipse.ros.RosServiceManager <em>Service Manager</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Manager</em>'.
	 * @see ca.gc.asc_csa.eclipse.ros.RosServiceManager
	 * @generated
	 */
  EClass getRosServiceManager();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.eclipse.ros.RosServiceManager#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Services</em>'.
	 * @see ca.gc.asc_csa.eclipse.ros.RosServiceManager#getServices()
	 * @see #getRosServiceManager()
	 * @generated
	 */
  EAttribute getRosServiceManager_Services();

  /**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.eclipse.ros.RosServiceManager#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Node</em>'.
	 * @see ca.gc.asc_csa.eclipse.ros.RosServiceManager#getNode()
	 * @see #getRosServiceManager()
	 * @generated
	 */
  EReference getRosServiceManager_Node();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.eclipse.ros.RosServiceManager#isRunning <em>Running</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Running</em>'.
	 * @see ca.gc.asc_csa.eclipse.ros.RosServiceManager#isRunning()
	 * @see #getRosServiceManager()
	 * @generated
	 */
  EAttribute getRosServiceManager_Running();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.eclipse.ros.RosServiceManager#createService(java.lang.String, java.lang.String) <em>Create Service</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Service</em>' operation.
	 * @see ca.gc.asc_csa.eclipse.ros.RosServiceManager#createService(java.lang.String, java.lang.String)
	 * @generated
	 */
  EOperation getRosServiceManager__CreateService__String_String();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.eclipse.ros.RosServiceManager#createService(java.lang.String, java.lang.String, boolean) <em>Create Service</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Service</em>' operation.
	 * @see ca.gc.asc_csa.eclipse.ros.RosServiceManager#createService(java.lang.String, java.lang.String, boolean)
	 * @generated
	 */
  EOperation getRosServiceManager__CreateService__String_String_boolean();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.eclipse.ros.RosServiceManager#getService(java.lang.String) <em>Get Service</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Service</em>' operation.
	 * @see ca.gc.asc_csa.eclipse.ros.RosServiceManager#getService(java.lang.String)
	 * @generated
	 */
  EOperation getRosServiceManager__GetService__String();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.eclipse.ros.RosServiceManager#createRequestMessage(java.lang.String) <em>Create Request Message</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Request Message</em>' operation.
	 * @see ca.gc.asc_csa.eclipse.ros.RosServiceManager#createRequestMessage(java.lang.String)
	 * @generated
	 */
  EOperation getRosServiceManager__CreateRequestMessage__String();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.eclipse.ros.RosServiceManager#callService(java.lang.String, org.ros.internal.message.Message) <em>Call Service</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Call Service</em>' operation.
	 * @see ca.gc.asc_csa.eclipse.ros.RosServiceManager#callService(java.lang.String, org.ros.internal.message.Message)
	 * @generated
	 */
  EOperation getRosServiceManager__CallService__String_Message();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.eclipse.ros.RosServiceManager#callService(java.lang.String) <em>Call Service</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Call Service</em>' operation.
	 * @see ca.gc.asc_csa.eclipse.ros.RosServiceManager#callService(java.lang.String)
	 * @generated
	 */
  EOperation getRosServiceManager__CallService__String();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.eclipse.ros.RosServiceManager#callService(java.lang.String, org.ros.internal.message.Message, boolean) <em>Call Service</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Call Service</em>' operation.
	 * @see ca.gc.asc_csa.eclipse.ros.RosServiceManager#callService(java.lang.String, org.ros.internal.message.Message, boolean)
	 * @generated
	 */
  EOperation getRosServiceManager__CallService__String_Message_boolean();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.eclipse.ros.RosServiceManager#callService(java.lang.String, boolean) <em>Call Service</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Call Service</em>' operation.
	 * @see ca.gc.asc_csa.eclipse.ros.RosServiceManager#callService(java.lang.String, boolean)
	 * @generated
	 */
  EOperation getRosServiceManager__CallService__String_boolean();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.eclipse.ros.RosServiceManager#launch() <em>Launch</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Launch</em>' operation.
	 * @see ca.gc.asc_csa.eclipse.ros.RosServiceManager#launch()
	 * @generated
	 */
  EOperation getRosServiceManager__Launch();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.eclipse.ros.RosServiceManager#stop() <em>Stop</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Stop</em>' operation.
	 * @see ca.gc.asc_csa.eclipse.ros.RosServiceManager#stop()
	 * @generated
	 */
  EOperation getRosServiceManager__Stop();

  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.eclipse.ros.RosTopicLauncher <em>Topic Launcher</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Topic Launcher</em>'.
	 * @see ca.gc.asc_csa.eclipse.ros.RosTopicLauncher
	 * @generated
	 */
  EClass getRosTopicLauncher();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.eclipse.ros.RosTopicLauncher#isRunning <em>Running</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Running</em>'.
	 * @see ca.gc.asc_csa.eclipse.ros.RosTopicLauncher#isRunning()
	 * @see #getRosTopicLauncher()
	 * @generated
	 */
  EAttribute getRosTopicLauncher_Running();

  /**
	 * Returns the meta object for the reference list '{@link ca.gc.asc_csa.eclipse.ros.RosTopicLauncher#getListenerList <em>Listener List</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Listener List</em>'.
	 * @see ca.gc.asc_csa.eclipse.ros.RosTopicLauncher#getListenerList()
	 * @see #getRosTopicLauncher()
	 * @generated
	 */
  EReference getRosTopicLauncher_ListenerList();

  /**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.eclipse.ros.RosTopicLauncher#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Node</em>'.
	 * @see ca.gc.asc_csa.eclipse.ros.RosTopicLauncher#getNode()
	 * @see #getRosTopicLauncher()
	 * @generated
	 */
  EReference getRosTopicLauncher_Node();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.eclipse.ros.RosTopicLauncher#createListener(java.lang.String, java.lang.String, org.ros.message.MessageListener) <em>Create Listener</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Listener</em>' operation.
	 * @see ca.gc.asc_csa.eclipse.ros.RosTopicLauncher#createListener(java.lang.String, java.lang.String, org.ros.message.MessageListener)
	 * @generated
	 */
  EOperation getRosTopicLauncher__CreateListener__String_String_MessageListener();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.eclipse.ros.RosTopicLauncher#launch() <em>Launch</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Launch</em>' operation.
	 * @see ca.gc.asc_csa.eclipse.ros.RosTopicLauncher#launch()
	 * @generated
	 */
  EOperation getRosTopicLauncher__Launch();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.eclipse.ros.RosTopicLauncher#stop() <em>Stop</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Stop</em>' operation.
	 * @see ca.gc.asc_csa.eclipse.ros.RosTopicLauncher#stop()
	 * @generated
	 */
  EOperation getRosTopicLauncher__Stop();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.eclipse.ros.RosTopicLauncher#reset() <em>Reset</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Reset</em>' operation.
	 * @see ca.gc.asc_csa.eclipse.ros.RosTopicLauncher#reset()
	 * @generated
	 */
  EOperation getRosTopicLauncher__Reset();

  /**
	 * Returns the meta object for data type '{@link org.ros.node.AbstractNodeMain <em>Abstract Node Main</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Abstract Node Main</em>'.
	 * @see org.ros.node.AbstractNodeMain
	 * @model instanceClass="org.ros.node.AbstractNodeMain"
	 * @generated
	 */
  EDataType getAbstractNodeMain();

  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.eclipse.ros.RosPublisherManager <em>Publisher Manager</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Publisher Manager</em>'.
	 * @see ca.gc.asc_csa.eclipse.ros.RosPublisherManager
	 * @generated
	 */
  EClass getRosPublisherManager();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.eclipse.ros.RosPublisherManager#getPublishers <em>Publishers</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Publishers</em>'.
	 * @see ca.gc.asc_csa.eclipse.ros.RosPublisherManager#getPublishers()
	 * @see #getRosPublisherManager()
	 * @generated
	 */
  EAttribute getRosPublisherManager_Publishers();

  /**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.eclipse.ros.RosPublisherManager#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Node</em>'.
	 * @see ca.gc.asc_csa.eclipse.ros.RosPublisherManager#getNode()
	 * @see #getRosPublisherManager()
	 * @generated
	 */
  EReference getRosPublisherManager_Node();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.eclipse.ros.RosPublisherManager#isRunning <em>Running</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Running</em>'.
	 * @see ca.gc.asc_csa.eclipse.ros.RosPublisherManager#isRunning()
	 * @see #getRosPublisherManager()
	 * @generated
	 */
  EAttribute getRosPublisherManager_Running();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.eclipse.ros.RosPublisherManager#createPublisher(java.lang.String, java.lang.String) <em>Create Publisher</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Publisher</em>' operation.
	 * @see ca.gc.asc_csa.eclipse.ros.RosPublisherManager#createPublisher(java.lang.String, java.lang.String)
	 * @generated
	 */
  EOperation getRosPublisherManager__CreatePublisher__String_String();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.eclipse.ros.RosPublisherManager#launch() <em>Launch</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Launch</em>' operation.
	 * @see ca.gc.asc_csa.eclipse.ros.RosPublisherManager#launch()
	 * @generated
	 */
  EOperation getRosPublisherManager__Launch();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.eclipse.ros.RosPublisherManager#stop() <em>Stop</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Stop</em>' operation.
	 * @see ca.gc.asc_csa.eclipse.ros.RosPublisherManager#stop()
	 * @generated
	 */
  EOperation getRosPublisherManager__Stop();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.eclipse.ros.RosPublisherManager#createMessage(java.lang.String) <em>Create Message</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Message</em>' operation.
	 * @see ca.gc.asc_csa.eclipse.ros.RosPublisherManager#createMessage(java.lang.String)
	 * @generated
	 */
  EOperation getRosPublisherManager__CreateMessage__String();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.eclipse.ros.RosPublisherManager#publish(java.lang.String, org.ros.internal.message.Message) <em>Publish</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Publish</em>' operation.
	 * @see ca.gc.asc_csa.eclipse.ros.RosPublisherManager#publish(java.lang.String, org.ros.internal.message.Message)
	 * @generated
	 */
  EOperation getRosPublisherManager__Publish__String_Message();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.eclipse.ros.RosPublisherManager#getPublisher(java.lang.String) <em>Get Publisher</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Publisher</em>' operation.
	 * @see ca.gc.asc_csa.eclipse.ros.RosPublisherManager#getPublisher(java.lang.String)
	 * @generated
	 */
  EOperation getRosPublisherManager__GetPublisher__String();

  /**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
  RosFactory getRosFactory();

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
		 * The meta object literal for the '{@link ca.gc.asc_csa.eclipse.ros.RosInterface <em>Interface</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.eclipse.ros.RosInterface
		 * @see ca.gc.asc_csa.eclipse.ros.impl.RosPackageImpl#getRosInterface()
		 * @generated
		 */
    EClass ROS_INTERFACE = eINSTANCE.getRosInterface();

    /**
		 * The meta object literal for the '<em><b>Service Manager</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ROS_INTERFACE__SERVICE_MANAGER = eINSTANCE.getRosInterface_ServiceManager();

    /**
		 * The meta object literal for the '<em><b>Topic Launcher</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ROS_INTERFACE__TOPIC_LAUNCHER = eINSTANCE.getRosInterface_TopicLauncher();

    /**
		 * The meta object literal for the '<em><b>Publisher Manager</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ROS_INTERFACE__PUBLISHER_MANAGER = eINSTANCE.getRosInterface_PublisherManager();

    /**
		 * The meta object literal for the '<em><b>Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ROS_INTERFACE__NODE = eINSTANCE.getRosInterface_Node();

    /**
		 * The meta object literal for the '<em><b>Ros Init</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation ROS_INTERFACE___ROS_INIT = eINSTANCE.getRosInterface__RosInit();

    /**
		 * The meta object literal for the '{@link ca.gc.asc_csa.eclipse.ros.impl.RosPublisherImpl <em>Publisher</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.eclipse.ros.impl.RosPublisherImpl
		 * @see ca.gc.asc_csa.eclipse.ros.impl.RosPackageImpl#getRosPublisher()
		 * @generated
		 */
    EClass ROS_PUBLISHER = eINSTANCE.getRosPublisher();

    /**
		 * The meta object literal for the '<em><b>Launched</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ROS_PUBLISHER__LAUNCHED = eINSTANCE.getRosPublisher_Launched();

    /**
		 * The meta object literal for the '<em><b>Topic Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ROS_PUBLISHER__TOPIC_NAME = eINSTANCE.getRosPublisher_TopicName();

    /**
		 * The meta object literal for the '<em><b>Message Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ROS_PUBLISHER__MESSAGE_TYPE = eINSTANCE.getRosPublisher_MessageType();

    /**
		 * The meta object literal for the '<em><b>Publisher</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ROS_PUBLISHER__PUBLISHER = eINSTANCE.getRosPublisher_Publisher();

    /**
		 * The meta object literal for the '<em><b>Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ROS_PUBLISHER__NODE = eINSTANCE.getRosPublisher_Node();

    /**
		 * The meta object literal for the '<em><b>Launch</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation ROS_PUBLISHER___LAUNCH__ROSNODE = eINSTANCE.getRosPublisher__Launch__RosNode();

    /**
		 * The meta object literal for the '<em><b>Publish</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation ROS_PUBLISHER___PUBLISH__MESSAGE = eINSTANCE.getRosPublisher__Publish__Message();

    /**
		 * The meta object literal for the '<em><b>New Message</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation ROS_PUBLISHER___NEW_MESSAGE = eINSTANCE.getRosPublisher__NewMessage();

    /**
		 * The meta object literal for the '<em><b>Stop</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation ROS_PUBLISHER___STOP = eINSTANCE.getRosPublisher__Stop();

    /**
		 * The meta object literal for the '{@link ca.gc.asc_csa.eclipse.ros.impl.RosServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.eclipse.ros.impl.RosServiceImpl
		 * @see ca.gc.asc_csa.eclipse.ros.impl.RosPackageImpl#getRosService()
		 * @generated
		 */
    EClass ROS_SERVICE = eINSTANCE.getRosService();

    /**
		 * The meta object literal for the '<em><b>Service Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ROS_SERVICE__SERVICE_NAME = eINSTANCE.getRosService_ServiceName();

    /**
		 * The meta object literal for the '<em><b>Service Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ROS_SERVICE__SERVICE_TYPE = eINSTANCE.getRosService_ServiceType();

    /**
		 * The meta object literal for the '<em><b>Launched</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ROS_SERVICE__LAUNCHED = eINSTANCE.getRosService_Launched();

    /**
		 * The meta object literal for the '<em><b>Service Client</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ROS_SERVICE__SERVICE_CLIENT = eINSTANCE.getRosService_ServiceClient();

    /**
		 * The meta object literal for the '<em><b>Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ROS_SERVICE__NODE = eINSTANCE.getRosService_Node();

    /**
		 * The meta object literal for the '<em><b>Disconnect On Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ROS_SERVICE__DISCONNECT_ON_TIMEOUT = eINSTANCE.getRosService_DisconnectOnTimeout();

    /**
		 * The meta object literal for the '<em><b>Launch</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation ROS_SERVICE___LAUNCH__ROSNODE = eINSTANCE.getRosService__Launch__RosNode();

    /**
		 * The meta object literal for the '<em><b>Stop</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation ROS_SERVICE___STOP = eINSTANCE.getRosService__Stop();

    /**
		 * The meta object literal for the '<em><b>New Request Message</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation ROS_SERVICE___NEW_REQUEST_MESSAGE = eINSTANCE.getRosService__NewRequestMessage();

    /**
		 * The meta object literal for the '<em><b>Call</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation ROS_SERVICE___CALL__MESSAGE = eINSTANCE.getRosService__Call__Message();

    /**
		 * The meta object literal for the '<em><b>Call</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation ROS_SERVICE___CALL__MESSAGE_BOOLEAN = eINSTANCE.getRosService__Call__Message_boolean();

    /**
		 * The meta object literal for the '{@link ca.gc.asc_csa.eclipse.ros.impl.RosListenerImpl <em>Listener</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.eclipse.ros.impl.RosListenerImpl
		 * @see ca.gc.asc_csa.eclipse.ros.impl.RosPackageImpl#getRosListener()
		 * @generated
		 */
    EClass ROS_LISTENER = eINSTANCE.getRosListener();

    /**
		 * The meta object literal for the '<em><b>Running</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ROS_LISTENER__RUNNING = eINSTANCE.getRosListener_Running();

    /**
		 * The meta object literal for the '<em><b>Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ROS_LISTENER__NODE = eINSTANCE.getRosListener_Node();

    /**
		 * The meta object literal for the '<em><b>Ros Subscriber</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ROS_LISTENER__ROS_SUBSCRIBER = eINSTANCE.getRosListener_RosSubscriber();

    /**
		 * The meta object literal for the '<em><b>Topic Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ROS_LISTENER__TOPIC_NAME = eINSTANCE.getRosListener_TopicName();

    /**
		 * The meta object literal for the '<em><b>Message Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ROS_LISTENER__MESSAGE_TYPE = eINSTANCE.getRosListener_MessageType();

    /**
		 * The meta object literal for the '<em><b>Message Listener</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ROS_LISTENER__MESSAGE_LISTENER = eINSTANCE.getRosListener_MessageListener();

    /**
		 * The meta object literal for the '<em><b>Start With Locks</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation ROS_LISTENER___START_WITH_LOCKS__ROSNODE = eINSTANCE.getRosListener__StartWithLocks__RosNode();

    /**
		 * The meta object literal for the '<em><b>Start</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation ROS_LISTENER___START__ROSNODE = eINSTANCE.getRosListener__Start__RosNode();

    /**
		 * The meta object literal for the '<em><b>Connect Subscriber</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation ROS_LISTENER___CONNECT_SUBSCRIBER__CONNECTEDNODE = eINSTANCE.getRosListener__ConnectSubscriber__ConnectedNode();

    /**
		 * The meta object literal for the '<em><b>Stop</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation ROS_LISTENER___STOP = eINSTANCE.getRosListener__Stop();

    /**
		 * The meta object literal for the '{@link ca.gc.asc_csa.eclipse.ros.impl.RosFacadeImpl <em>Facade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.eclipse.ros.impl.RosFacadeImpl
		 * @see ca.gc.asc_csa.eclipse.ros.impl.RosPackageImpl#getRosFacade()
		 * @generated
		 */
		EClass ROS_FACADE = eINSTANCE.getRosFacade();

				/**
		 * The meta object literal for the '<em><b>Get Node Name Prefix</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROS_FACADE___GET_NODE_NAME_PREFIX = eINSTANCE.getRosFacade__GetNodeNamePrefix();

				/**
		 * The meta object literal for the '<em><b>Get ROS Master URI</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROS_FACADE___GET_ROS_MASTER_URI = eINSTANCE.getRosFacade__GetROSMasterURI();

				/**
		 * The meta object literal for the '<em><b>Get ROS Hostname</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROS_FACADE___GET_ROS_HOSTNAME = eINSTANCE.getRosFacade__GetROSHostname();

				/**
		 * The meta object literal for the '<em><b>Get ROS Ip</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROS_FACADE___GET_ROS_IP = eINSTANCE.getRosFacade__GetROSIp();

				/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.eclipse.ros.impl.RosNodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.eclipse.ros.impl.RosNodeImpl
		 * @see ca.gc.asc_csa.eclipse.ros.impl.RosPackageImpl#getRosNode()
		 * @generated
		 */
    EClass ROS_NODE = eINSTANCE.getRosNode();

    /**
		 * The meta object literal for the '<em><b>Connected Node</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ROS_NODE__CONNECTED_NODE = eINSTANCE.getRosNode_ConnectedNode();

    /**
		 * The meta object literal for the '<em><b>Modules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ROS_NODE__MODULES = eINSTANCE.getRosNode_Modules();

    /**
		 * The meta object literal for the '<em><b>Service Managers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ROS_NODE__SERVICE_MANAGERS = eINSTANCE.getRosNode_ServiceManagers();

    /**
		 * The meta object literal for the '<em><b>Topic Launchers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ROS_NODE__TOPIC_LAUNCHERS = eINSTANCE.getRosNode_TopicLaunchers();

    /**
		 * The meta object literal for the '<em><b>Publisher Managers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ROS_NODE__PUBLISHER_MANAGERS = eINSTANCE.getRosNode_PublisherManagers();

    /**
		 * The meta object literal for the '<em><b>Initialized</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ROS_NODE__INITIALIZED = eINSTANCE.getRosNode_Initialized();

    /**
		 * The meta object literal for the '<em><b>Connected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ROS_NODE__CONNECTED = eINSTANCE.getRosNode_Connected();

    /**
		 * The meta object literal for the '<em><b>Restarting</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ROS_NODE__RESTARTING = eINSTANCE.getRosNode_Restarting();

    /**
		 * The meta object literal for the '<em><b>Enable Auto Restart On Connection Lost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROS_NODE__ENABLE_AUTO_RESTART_ON_CONNECTION_LOST = eINSTANCE.getRosNode_EnableAutoRestartOnConnectionLost();

				/**
		 * The meta object literal for the '<em><b>Node Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ROS_NODE__NODE_NAME = eINSTANCE.getRosNode_NodeName();

    /**
		 * The meta object literal for the '<em><b>Response Logger</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ROS_NODE__RESPONSE_LOGGER = eINSTANCE.getRosNode_ResponseLogger();

    /**
		 * The meta object literal for the '<em><b>Null Response Handler</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ROS_NODE__NULL_RESPONSE_HANDLER = eINSTANCE.getRosNode_NullResponseHandler();

    /**
		 * The meta object literal for the '<em><b>Null Request Handler</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ROS_NODE__NULL_REQUEST_HANDLER = eINSTANCE.getRosNode_NullRequestHandler();

    /**
		 * The meta object literal for the '<em><b>Start</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation ROS_NODE___START = eINSTANCE.getRosNode__Start();

    /**
		 * The meta object literal for the '<em><b>Initialize</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation ROS_NODE___INITIALIZE = eINSTANCE.getRosNode__Initialize();

    /**
		 * The meta object literal for the '<em><b>On Start</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation ROS_NODE___ON_START__CONNECTEDNODE = eINSTANCE.getRosNode__OnStart__ConnectedNode();

    /**
		 * The meta object literal for the '<em><b>Restart</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation ROS_NODE___RESTART = eINSTANCE.getRosNode__Restart();

    /**
		 * The meta object literal for the '<em><b>Register</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation ROS_NODE___REGISTER__ROSINTERFACE_BOOLEAN = eINSTANCE.getRosNode__Register__RosInterface_boolean();

    /**
		 * The meta object literal for the '<em><b>Register</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation ROS_NODE___REGISTER__ROSINTERFACE = eINSTANCE.getRosNode__Register__RosInterface();

    /**
		 * The meta object literal for the '<em><b>New From Type</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation ROS_NODE___NEW_FROM_TYPE__STRING = eINSTANCE.getRosNode__NewFromType__String();

    /**
		 * The meta object literal for the '<em><b>Shutdown</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation ROS_NODE___SHUTDOWN = eINSTANCE.getRosNode__Shutdown();

    /**
		 * The meta object literal for the '<em><b>Create Publisher</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation ROS_NODE___CREATE_PUBLISHER__STRING_STRING = eINSTANCE.getRosNode__CreatePublisher__String_String();

    /**
		 * The meta object literal for the '<em><b>Create Service Manager</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation ROS_NODE___CREATE_SERVICE_MANAGER = eINSTANCE.getRosNode__CreateServiceManager();

    /**
		 * The meta object literal for the '<em><b>Create Topic Launcher</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation ROS_NODE___CREATE_TOPIC_LAUNCHER = eINSTANCE.getRosNode__CreateTopicLauncher();

    /**
		 * The meta object literal for the '<em><b>Create Publisher Manager</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation ROS_NODE___CREATE_PUBLISHER_MANAGER = eINSTANCE.getRosNode__CreatePublisherManager();

    /**
		 * The meta object literal for the '<em>Response Logger</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.eclipse.ros.utilities.ResponseLogger
		 * @see ca.gc.asc_csa.eclipse.ros.impl.RosPackageImpl#getResponseLogger()
		 * @generated
		 */
    EDataType RESPONSE_LOGGER = eINSTANCE.getResponseLogger();

    /**
		 * The meta object literal for the '<em>Null Response Handler</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.eclipse.ros.utilities.NullResponseHandler
		 * @see ca.gc.asc_csa.eclipse.ros.impl.RosPackageImpl#getNullResponseHandler()
		 * @generated
		 */
    EDataType NULL_RESPONSE_HANDLER = eINSTANCE.getNullResponseHandler();

    /**
		 * The meta object literal for the '<em>Null Request Handler</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.eclipse.ros.utilities.NullRequestHandler
		 * @see ca.gc.asc_csa.eclipse.ros.impl.RosPackageImpl#getNullRequestHandler()
		 * @generated
		 */
    EDataType NULL_REQUEST_HANDLER = eINSTANCE.getNullRequestHandler();

    /**
		 * The meta object literal for the '<em>Message</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.ros.internal.message.Message
		 * @see ca.gc.asc_csa.eclipse.ros.impl.RosPackageImpl#getMessage()
		 * @generated
		 */
    EDataType MESSAGE = eINSTANCE.getMessage();

    /**
		 * The meta object literal for the '<em>Publisher</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.ros.node.topic.Publisher
		 * @see ca.gc.asc_csa.eclipse.ros.impl.RosPackageImpl#getPublisher()
		 * @generated
		 */
    EDataType PUBLISHER = eINSTANCE.getPublisher();

    /**
		 * The meta object literal for the '<em>Subscriber</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.ros.node.topic.Subscriber
		 * @see ca.gc.asc_csa.eclipse.ros.impl.RosPackageImpl#getSubscriber()
		 * @generated
		 */
    EDataType SUBSCRIBER = eINSTANCE.getSubscriber();

    /**
		 * The meta object literal for the '<em>Message Listener</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.ros.message.MessageListener
		 * @see ca.gc.asc_csa.eclipse.ros.impl.RosPackageImpl#getMessageListener()
		 * @generated
		 */
    EDataType MESSAGE_LISTENER = eINSTANCE.getMessageListener();

    /**
		 * The meta object literal for the '<em>Service Client</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.ros.node.service.ServiceClient
		 * @see ca.gc.asc_csa.eclipse.ros.impl.RosPackageImpl#getServiceClient()
		 * @generated
		 */
    EDataType SERVICE_CLIENT = eINSTANCE.getServiceClient();

    /**
		 * The meta object literal for the '<em>Service Not Found Exception</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.ros.exception.ServiceNotFoundException
		 * @see ca.gc.asc_csa.eclipse.ros.impl.RosPackageImpl#getServiceNotFoundException()
		 * @generated
		 */
    EDataType SERVICE_NOT_FOUND_EXCEPTION = eINSTANCE.getServiceNotFoundException();

    /**
		 * The meta object literal for the '<em>Exception</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see java.lang.Exception
		 * @see ca.gc.asc_csa.eclipse.ros.impl.RosPackageImpl#getException()
		 * @generated
		 */
    EDataType EXCEPTION = eINSTANCE.getException();

    /**
		 * The meta object literal for the '<em>Hash Map</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see java.util.HashMap
		 * @see ca.gc.asc_csa.eclipse.ros.impl.RosPackageImpl#getHashMap()
		 * @generated
		 */
    EDataType HASH_MAP = eINSTANCE.getHashMap();

    /**
		 * The meta object literal for the '<em>Connected Node</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.ros.node.ConnectedNode
		 * @see ca.gc.asc_csa.eclipse.ros.impl.RosPackageImpl#getConnectedNode()
		 * @generated
		 */
    EDataType CONNECTED_NODE = eINSTANCE.getConnectedNode();

    /**
		 * The meta object literal for the '{@link ca.gc.asc_csa.eclipse.ros.impl.RosServiceManagerImpl <em>Service Manager</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.eclipse.ros.impl.RosServiceManagerImpl
		 * @see ca.gc.asc_csa.eclipse.ros.impl.RosPackageImpl#getRosServiceManager()
		 * @generated
		 */
    EClass ROS_SERVICE_MANAGER = eINSTANCE.getRosServiceManager();

    /**
		 * The meta object literal for the '<em><b>Services</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ROS_SERVICE_MANAGER__SERVICES = eINSTANCE.getRosServiceManager_Services();

    /**
		 * The meta object literal for the '<em><b>Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ROS_SERVICE_MANAGER__NODE = eINSTANCE.getRosServiceManager_Node();

    /**
		 * The meta object literal for the '<em><b>Running</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ROS_SERVICE_MANAGER__RUNNING = eINSTANCE.getRosServiceManager_Running();

    /**
		 * The meta object literal for the '<em><b>Create Service</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation ROS_SERVICE_MANAGER___CREATE_SERVICE__STRING_STRING = eINSTANCE.getRosServiceManager__CreateService__String_String();

    /**
		 * The meta object literal for the '<em><b>Create Service</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation ROS_SERVICE_MANAGER___CREATE_SERVICE__STRING_STRING_BOOLEAN = eINSTANCE.getRosServiceManager__CreateService__String_String_boolean();

    /**
		 * The meta object literal for the '<em><b>Get Service</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation ROS_SERVICE_MANAGER___GET_SERVICE__STRING = eINSTANCE.getRosServiceManager__GetService__String();

    /**
		 * The meta object literal for the '<em><b>Create Request Message</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation ROS_SERVICE_MANAGER___CREATE_REQUEST_MESSAGE__STRING = eINSTANCE.getRosServiceManager__CreateRequestMessage__String();

    /**
		 * The meta object literal for the '<em><b>Call Service</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation ROS_SERVICE_MANAGER___CALL_SERVICE__STRING_MESSAGE = eINSTANCE.getRosServiceManager__CallService__String_Message();

    /**
		 * The meta object literal for the '<em><b>Call Service</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation ROS_SERVICE_MANAGER___CALL_SERVICE__STRING = eINSTANCE.getRosServiceManager__CallService__String();

    /**
		 * The meta object literal for the '<em><b>Call Service</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation ROS_SERVICE_MANAGER___CALL_SERVICE__STRING_MESSAGE_BOOLEAN = eINSTANCE.getRosServiceManager__CallService__String_Message_boolean();

    /**
		 * The meta object literal for the '<em><b>Call Service</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation ROS_SERVICE_MANAGER___CALL_SERVICE__STRING_BOOLEAN = eINSTANCE.getRosServiceManager__CallService__String_boolean();

    /**
		 * The meta object literal for the '<em><b>Launch</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation ROS_SERVICE_MANAGER___LAUNCH = eINSTANCE.getRosServiceManager__Launch();

    /**
		 * The meta object literal for the '<em><b>Stop</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation ROS_SERVICE_MANAGER___STOP = eINSTANCE.getRosServiceManager__Stop();

    /**
		 * The meta object literal for the '{@link ca.gc.asc_csa.eclipse.ros.impl.RosTopicLauncherImpl <em>Topic Launcher</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.eclipse.ros.impl.RosTopicLauncherImpl
		 * @see ca.gc.asc_csa.eclipse.ros.impl.RosPackageImpl#getRosTopicLauncher()
		 * @generated
		 */
    EClass ROS_TOPIC_LAUNCHER = eINSTANCE.getRosTopicLauncher();

    /**
		 * The meta object literal for the '<em><b>Running</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ROS_TOPIC_LAUNCHER__RUNNING = eINSTANCE.getRosTopicLauncher_Running();

    /**
		 * The meta object literal for the '<em><b>Listener List</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ROS_TOPIC_LAUNCHER__LISTENER_LIST = eINSTANCE.getRosTopicLauncher_ListenerList();

    /**
		 * The meta object literal for the '<em><b>Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ROS_TOPIC_LAUNCHER__NODE = eINSTANCE.getRosTopicLauncher_Node();

    /**
		 * The meta object literal for the '<em><b>Create Listener</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation ROS_TOPIC_LAUNCHER___CREATE_LISTENER__STRING_STRING_MESSAGELISTENER = eINSTANCE.getRosTopicLauncher__CreateListener__String_String_MessageListener();

    /**
		 * The meta object literal for the '<em><b>Launch</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation ROS_TOPIC_LAUNCHER___LAUNCH = eINSTANCE.getRosTopicLauncher__Launch();

    /**
		 * The meta object literal for the '<em><b>Stop</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation ROS_TOPIC_LAUNCHER___STOP = eINSTANCE.getRosTopicLauncher__Stop();

    /**
		 * The meta object literal for the '<em><b>Reset</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation ROS_TOPIC_LAUNCHER___RESET = eINSTANCE.getRosTopicLauncher__Reset();

    /**
		 * The meta object literal for the '<em>Abstract Node Main</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.ros.node.AbstractNodeMain
		 * @see ca.gc.asc_csa.eclipse.ros.impl.RosPackageImpl#getAbstractNodeMain()
		 * @generated
		 */
    EDataType ABSTRACT_NODE_MAIN = eINSTANCE.getAbstractNodeMain();

    /**
		 * The meta object literal for the '{@link ca.gc.asc_csa.eclipse.ros.impl.RosPublisherManagerImpl <em>Publisher Manager</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.eclipse.ros.impl.RosPublisherManagerImpl
		 * @see ca.gc.asc_csa.eclipse.ros.impl.RosPackageImpl#getRosPublisherManager()
		 * @generated
		 */
    EClass ROS_PUBLISHER_MANAGER = eINSTANCE.getRosPublisherManager();

    /**
		 * The meta object literal for the '<em><b>Publishers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ROS_PUBLISHER_MANAGER__PUBLISHERS = eINSTANCE.getRosPublisherManager_Publishers();

    /**
		 * The meta object literal for the '<em><b>Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ROS_PUBLISHER_MANAGER__NODE = eINSTANCE.getRosPublisherManager_Node();

    /**
		 * The meta object literal for the '<em><b>Running</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ROS_PUBLISHER_MANAGER__RUNNING = eINSTANCE.getRosPublisherManager_Running();

    /**
		 * The meta object literal for the '<em><b>Create Publisher</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation ROS_PUBLISHER_MANAGER___CREATE_PUBLISHER__STRING_STRING = eINSTANCE.getRosPublisherManager__CreatePublisher__String_String();

    /**
		 * The meta object literal for the '<em><b>Launch</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation ROS_PUBLISHER_MANAGER___LAUNCH = eINSTANCE.getRosPublisherManager__Launch();

    /**
		 * The meta object literal for the '<em><b>Stop</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation ROS_PUBLISHER_MANAGER___STOP = eINSTANCE.getRosPublisherManager__Stop();

    /**
		 * The meta object literal for the '<em><b>Create Message</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation ROS_PUBLISHER_MANAGER___CREATE_MESSAGE__STRING = eINSTANCE.getRosPublisherManager__CreateMessage__String();

    /**
		 * The meta object literal for the '<em><b>Publish</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation ROS_PUBLISHER_MANAGER___PUBLISH__STRING_MESSAGE = eINSTANCE.getRosPublisherManager__Publish__String_Message();

    /**
		 * The meta object literal for the '<em><b>Get Publisher</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation ROS_PUBLISHER_MANAGER___GET_PUBLISHER__STRING = eINSTANCE.getRosPublisherManager__GetPublisher__String();

  }

} //RosPackage
