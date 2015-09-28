/**
 * Canadian Space Agency / Agence spatiale canadienne 2013 Copyrights (c)
 */
package ca.gc.asc_csa.eclipse.ros;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.ros.node.ConnectedNode;
import org.ros.node.topic.Publisher;

import ca.gc.asc_csa.eclipse.ros.utilities.NullRequestHandler;
import ca.gc.asc_csa.eclipse.ros.utilities.NullResponseHandler;
import ca.gc.asc_csa.eclipse.ros.utilities.ResponseLogger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.eclipse.ros.RosNode#getConnectedNode <em>Connected Node</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.ros.RosNode#getModules <em>Modules</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.ros.RosNode#getServiceManagers <em>Service Managers</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.ros.RosNode#getTopicLaunchers <em>Topic Launchers</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.ros.RosNode#getPublisherManagers <em>Publisher Managers</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.ros.RosNode#isInitialized <em>Initialized</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.ros.RosNode#isConnected <em>Connected</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.ros.RosNode#isRestarting <em>Restarting</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.ros.RosNode#isEnableAutoRestartOnConnectionLost <em>Enable Auto Restart On Connection Lost</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.ros.RosNode#getNodeName <em>Node Name</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.ros.RosNode#getResponseLogger <em>Response Logger</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.ros.RosNode#getNullResponseHandler <em>Null Response Handler</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.ros.RosNode#getNullRequestHandler <em>Null Request Handler</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.eclipse.ros.RosPackage#getRosNode()
 * @model
 * @generated
 */
public interface RosNode extends EObject
{
  /**
	 * Returns the value of the '<em><b>Connected Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Connected Node</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Connected Node</em>' attribute.
	 * @see #setConnectedNode(ConnectedNode)
	 * @see ca.gc.asc_csa.eclipse.ros.RosPackage#getRosNode_ConnectedNode()
	 * @model unique="false" dataType="ca.gc.asc_csa.eclipse.ros.ConnectedNode"
	 * @generated
	 */
  ConnectedNode getConnectedNode();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.ros.RosNode#getConnectedNode <em>Connected Node</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connected Node</em>' attribute.
	 * @see #getConnectedNode()
	 * @generated
	 */
  void setConnectedNode(ConnectedNode value);

  /**
	 * Returns the value of the '<em><b>Modules</b></em>' reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.eclipse.ros.RosInterface}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modules</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Modules</em>' reference list.
	 * @see ca.gc.asc_csa.eclipse.ros.RosPackage#getRosNode_Modules()
	 * @model
	 * @generated
	 */
  EList<RosInterface> getModules();

  /**
	 * Returns the value of the '<em><b>Service Managers</b></em>' reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.eclipse.ros.RosServiceManager}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Service Managers</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Managers</em>' reference list.
	 * @see ca.gc.asc_csa.eclipse.ros.RosPackage#getRosNode_ServiceManagers()
	 * @model
	 * @generated
	 */
  EList<RosServiceManager> getServiceManagers();

  /**
	 * Returns the value of the '<em><b>Topic Launchers</b></em>' reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.eclipse.ros.RosTopicLauncher}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Topic Launchers</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Topic Launchers</em>' reference list.
	 * @see ca.gc.asc_csa.eclipse.ros.RosPackage#getRosNode_TopicLaunchers()
	 * @model
	 * @generated
	 */
  EList<RosTopicLauncher> getTopicLaunchers();

  /**
	 * Returns the value of the '<em><b>Publisher Managers</b></em>' reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.eclipse.ros.RosPublisherManager}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Publisher Managers</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Publisher Managers</em>' reference list.
	 * @see ca.gc.asc_csa.eclipse.ros.RosPackage#getRosNode_PublisherManagers()
	 * @model
	 * @generated
	 */
  EList<RosPublisherManager> getPublisherManagers();

  /**
	 * Returns the value of the '<em><b>Initialized</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Initialized</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Node initialized
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Initialized</em>' attribute.
	 * @see #setInitialized(boolean)
	 * @see ca.gc.asc_csa.eclipse.ros.RosPackage#getRosNode_Initialized()
	 * @model default="false" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly' notify='true' propertyCategory='ROS_NODE'"
	 * @generated
	 */
  boolean isInitialized();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.ros.RosNode#isInitialized <em>Initialized</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initialized</em>' attribute.
	 * @see #isInitialized()
	 * @generated
	 */
  void setInitialized(boolean value);

  /**
	 * Returns the value of the '<em><b>Connected</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Connected</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Node connected
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connected</em>' attribute.
	 * @see #setConnected(boolean)
	 * @see ca.gc.asc_csa.eclipse.ros.RosPackage#getRosNode_Connected()
	 * @model default="false" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly' notify='true' propertyCategory='ROS_NODE'"
	 * @generated
	 */
  boolean isConnected();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.ros.RosNode#isConnected <em>Connected</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connected</em>' attribute.
	 * @see #isConnected()
	 * @generated
	 */
  void setConnected(boolean value);

  /**
	 * Returns the value of the '<em><b>Restarting</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Restarting</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Node restarting
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Restarting</em>' attribute.
	 * @see #setRestarting(boolean)
	 * @see ca.gc.asc_csa.eclipse.ros.RosPackage#getRosNode_Restarting()
	 * @model default="false" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly' notify='true' propertyCategory='ROS_NODE'"
	 * @generated
	 */
  boolean isRestarting();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.ros.RosNode#isRestarting <em>Restarting</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Restarting</em>' attribute.
	 * @see #isRestarting()
	 * @generated
	 */
  void setRestarting(boolean value);

  /**
	 * Returns the value of the '<em><b>Enable Auto Restart On Connection Lost</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enables auto restart of node on connection lost.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enable Auto Restart On Connection Lost</em>' attribute.
	 * @see #setEnableAutoRestartOnConnectionLost(boolean)
	 * @see ca.gc.asc_csa.eclipse.ros.RosPackage#getRosNode_EnableAutoRestartOnConnectionLost()
	 * @model default="false" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly' notify='true' propertyCategory='ROS_NODE'"
	 * @generated
	 */
	boolean isEnableAutoRestartOnConnectionLost();

		/**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.ros.RosNode#isEnableAutoRestartOnConnectionLost <em>Enable Auto Restart On Connection Lost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable Auto Restart On Connection Lost</em>' attribute.
	 * @see #isEnableAutoRestartOnConnectionLost()
	 * @generated
	 */
	void setEnableAutoRestartOnConnectionLost(boolean value);

		/**
	 * Returns the value of the '<em><b>Node Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Node Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Node name
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Node Name</em>' attribute.
	 * @see #setNodeName(String)
	 * @see ca.gc.asc_csa.eclipse.ros.RosPackage#getRosNode_NodeName()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly' notify='true' propertyCategory='ROS_NODE'"
	 * @generated
	 */
  String getNodeName();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.ros.RosNode#getNodeName <em>Node Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Name</em>' attribute.
	 * @see #getNodeName()
	 * @generated
	 */
  void setNodeName(String value);

  /**
	 * Returns the value of the '<em><b>Response Logger</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Strategy to log the new responses
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Response Logger</em>' attribute.
	 * @see #setResponseLogger(ResponseLogger)
	 * @see ca.gc.asc_csa.eclipse.ros.RosPackage#getRosNode_ResponseLogger()
	 * @model unique="false" dataType="ca.gc.asc_csa.eclipse.ros.ResponseLogger"
	 * @generated
	 */
  ResponseLogger getResponseLogger();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.ros.RosNode#getResponseLogger <em>Response Logger</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Logger</em>' attribute.
	 * @see #getResponseLogger()
	 * @generated
	 */
  void setResponseLogger(ResponseLogger value);

  /**
	 * Returns the value of the '<em><b>Null Response Handler</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Strategy to handle null responses
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Null Response Handler</em>' attribute.
	 * @see #setNullResponseHandler(NullResponseHandler)
	 * @see ca.gc.asc_csa.eclipse.ros.RosPackage#getRosNode_NullResponseHandler()
	 * @model unique="false" dataType="ca.gc.asc_csa.eclipse.ros.NullResponseHandler"
	 * @generated
	 */
  NullResponseHandler getNullResponseHandler();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.ros.RosNode#getNullResponseHandler <em>Null Response Handler</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Null Response Handler</em>' attribute.
	 * @see #getNullResponseHandler()
	 * @generated
	 */
  void setNullResponseHandler(NullResponseHandler value);

  /**
	 * Returns the value of the '<em><b>Null Request Handler</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Strategy to handle null requests
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Null Request Handler</em>' attribute.
	 * @see #setNullRequestHandler(NullRequestHandler)
	 * @see ca.gc.asc_csa.eclipse.ros.RosPackage#getRosNode_NullRequestHandler()
	 * @model unique="false" dataType="ca.gc.asc_csa.eclipse.ros.NullRequestHandler"
	 * @generated
	 */
  NullRequestHandler getNullRequestHandler();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.ros.RosNode#getNullRequestHandler <em>Null Request Handler</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Null Request Handler</em>' attribute.
	 * @see #getNullRequestHandler()
	 * @generated
	 */
  void setNullRequestHandler(NullRequestHandler value);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Starts the ROS node
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
  void start();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model exceptions="ca.gc.asc_csa.eclipse.ros.Exception"
	 * @generated
	 */
  void initialize() throws Exception;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Event called when the node is connected to the ROS master <br><br>Start the subscriber handler and the service clients handler
	 * <!-- end-model-doc -->
	 * @model connectedNodeDataType="ca.gc.asc_csa.eclipse.ros.ConnectedNode" connectedNodeUnique="false"
	 * @generated
	 */
  void onStart(ConnectedNode connectedNode);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Resets the ROS connection
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
  void restart();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Registers and initializes a new module
	 * <!-- end-model-doc -->
	 * @model moduleUnique="false" initializeUnique="false"
	 * @generated
	 */
  void register(RosInterface module, boolean initialize);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Registers and initializes a new module
	 * <!-- end-model-doc -->
	 * @model moduleUnique="false"
	 * @generated
	 */
  void register(RosInterface module);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a new variable from a given type
	 * <!-- end-model-doc -->
	 * @model unique="false" messageTypeUnique="false"
	 * @generated
	 */
  <T> T newFromType(String messageType);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Shuts down the ROS node
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
  void shutdown();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a new publisher
	 * <!-- end-model-doc -->
	 * @model dataType="ca.gc.asc_csa.eclipse.ros.Publisher<T>" unique="false" topicNameUnique="false" messageTypeUnique="false"
	 * @generated
	 */
  <T> Publisher<T> createPublisher(String topicName, String messageType);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a new service manager
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 * @generated
	 */
  RosServiceManager createServiceManager();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a new topic launcher
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 * @generated
	 */
  RosTopicLauncher createTopicLauncher();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a new publisher manager
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 * @generated
	 */
  RosPublisherManager createPublisherManager();

} // RosNode
