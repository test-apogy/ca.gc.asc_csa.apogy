/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.addons.ros;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import ca.gc.asc_csa.apogy.addons.ros.utilities.NullRequestHandler;
import ca.gc.asc_csa.apogy.addons.ros.utilities.NullResponseHandler;
import ca.gc.asc_csa.apogy.addons.ros.utilities.ResponseLogger;
import org.ros.node.ConnectedNode;

import org.ros.node.topic.Publisher;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ros Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.ros.ROSNode#getConnectedNode <em>Connected Node</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.ros.ROSNode#getModules <em>Modules</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.ros.ROSNode#getServiceManagers <em>Service Managers</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.ros.ROSNode#getTopicLaunchers <em>Topic Launchers</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.ros.ROSNode#getPublisherManagers <em>Publisher Managers</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.ros.ROSNode#isInitialized <em>Initialized</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.ros.ROSNode#isConnected <em>Connected</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.ros.ROSNode#isRestarting <em>Restarting</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.ros.ROSNode#isEnableAutoRestartOnConnectionLost <em>Enable Auto Restart On Connection Lost</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.ros.ROSNode#getNodeName <em>Node Name</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.ros.ROSNode#getResponseLogger <em>Response Logger</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.ros.ROSNode#getNullResponseHandler <em>Null Response Handler</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.ros.ROSNode#getNullRequestHandler <em>Null Request Handler</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.addons.ros.ApogyAddonsROSPackage#getROSNode()
 * @model
 * @generated
 */
public interface ROSNode extends EObject {
	/**
	 * Returns the value of the '<em><b>Connected Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The underlying ROS node
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connected Node</em>' attribute.
	 * @see #setConnectedNode(ConnectedNode)
	 * @see ca.gc.asc_csa.apogy.addons.ros.ApogyAddonsROSPackage#getROSNode_ConnectedNode()
	 * @model unique="false" dataType="ca.gc.asc_csa.apogy.addons.ros.ConnectedNode"
	 * @generated
	 */
	ConnectedNode getConnectedNode();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.ros.ROSNode#getConnectedNode <em>Connected Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connected Node</em>' attribute.
	 * @see #getConnectedNode()
	 * @generated
	 */
	void setConnectedNode(ConnectedNode value);

	/**
	 * Returns the value of the '<em><b>Modules</b></em>' reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.apogy.addons.ros.ROSInterface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The modules that have been registered with this node
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Modules</em>' reference list.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ApogyAddonsROSPackage#getROSNode_Modules()
	 * @model
	 * @generated
	 */
	EList<ROSInterface> getModules();

	/**
	 * Returns the value of the '<em><b>Service Managers</b></em>' reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.apogy.addons.ros.ROSServiceManager}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The service managers that have been associated with this node
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Managers</em>' reference list.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ApogyAddonsROSPackage#getROSNode_ServiceManagers()
	 * @model
	 * @generated
	 */
	EList<ROSServiceManager> getServiceManagers();

	/**
	 * Returns the value of the '<em><b>Topic Launchers</b></em>' reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.apogy.addons.ros.ROSTopicLauncher}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The topic launchers that have been associated with this node
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Topic Launchers</em>' reference list.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ApogyAddonsROSPackage#getROSNode_TopicLaunchers()
	 * @model
	 * @generated
	 */
	EList<ROSTopicLauncher> getTopicLaunchers();

	/**
	 * Returns the value of the '<em><b>Publisher Managers</b></em>' reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.apogy.addons.ros.ROSPublisherManager}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The publisher managers that have been associated with this node
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Publisher Managers</em>' reference list.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ApogyAddonsROSPackage#getROSNode_PublisherManagers()
	 * @model
	 * @generated
	 */
	EList<ROSPublisherManager> getPublisherManagers();

	/**
	 * Returns the value of the '<em><b>Initialized</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether or not the node is currently initialized
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Initialized</em>' attribute.
	 * @see #setInitialized(boolean)
	 * @see ca.gc.asc_csa.apogy.addons.ros.ApogyAddonsROSPackage#getROSNode_Initialized()
	 * @model default="false" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly' notify='true' propertyCategory='ROS_NODE'"
	 * @generated
	 */
	boolean isInitialized();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.ros.ROSNode#isInitialized <em>Initialized</em>}' attribute.
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
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether or not the node is currently connected
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connected</em>' attribute.
	 * @see #setConnected(boolean)
	 * @see ca.gc.asc_csa.apogy.addons.ros.ApogyAddonsROSPackage#getROSNode_Connected()
	 * @model default="false" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly' notify='true' propertyCategory='ROS_NODE'"
	 * @generated
	 */
	boolean isConnected();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.ros.ROSNode#isConnected <em>Connected</em>}' attribute.
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
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether or not the node is currently in the process of restarting
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Restarting</em>' attribute.
	 * @see #setRestarting(boolean)
	 * @see ca.gc.asc_csa.apogy.addons.ros.ApogyAddonsROSPackage#getROSNode_Restarting()
	 * @model default="false" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly' notify='true' propertyCategory='ROS_NODE'"
	 * @generated
	 */
	boolean isRestarting();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.ros.ROSNode#isRestarting <em>Restarting</em>}' attribute.
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
	 * Whether or not the node should automatically restart if the connection
	 * was lost.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enable Auto Restart On Connection Lost</em>' attribute.
	 * @see #setEnableAutoRestartOnConnectionLost(boolean)
	 * @see ca.gc.asc_csa.apogy.addons.ros.ApogyAddonsROSPackage#getROSNode_EnableAutoRestartOnConnectionLost()
	 * @model default="false" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly' notify='true' propertyCategory='ROS_NODE'"
	 * @generated
	 */
	boolean isEnableAutoRestartOnConnectionLost();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.ros.ROSNode#isEnableAutoRestartOnConnectionLost <em>Enable Auto Restart On Connection Lost</em>}' attribute.
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
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The node's name
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Node Name</em>' attribute.
	 * @see #setNodeName(String)
	 * @see ca.gc.asc_csa.apogy.addons.ros.ApogyAddonsROSPackage#getROSNode_NodeName()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly' notify='true' propertyCategory='ROS_NODE'"
	 * @generated
	 */
	String getNodeName();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.ros.ROSNode#getNodeName <em>Node Name</em>}' attribute.
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
	 * The strategy to log the new responses
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Response Logger</em>' attribute.
	 * @see #setResponseLogger(ResponseLogger)
	 * @see ca.gc.asc_csa.apogy.addons.ros.ApogyAddonsROSPackage#getROSNode_ResponseLogger()
	 * @model unique="false" dataType="ca.gc.asc_csa.apogy.addons.ros.ResponseLogger"
	 * @generated
	 */
	ResponseLogger getResponseLogger();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.ros.ROSNode#getResponseLogger <em>Response Logger</em>}' attribute.
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
	 * The strategy to log the null responses
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Null Response Handler</em>' attribute.
	 * @see #setNullResponseHandler(NullResponseHandler)
	 * @see ca.gc.asc_csa.apogy.addons.ros.ApogyAddonsROSPackage#getROSNode_NullResponseHandler()
	 * @model unique="false" dataType="ca.gc.asc_csa.apogy.addons.ros.NullResponseHandler"
	 * @generated
	 */
	NullResponseHandler getNullResponseHandler();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.ros.ROSNode#getNullResponseHandler <em>Null Response Handler</em>}' attribute.
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
	 * The strategy to log the null requests
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Null Request Handler</em>' attribute.
	 * @see #setNullRequestHandler(NullRequestHandler)
	 * @see ca.gc.asc_csa.apogy.addons.ros.ApogyAddonsROSPackage#getROSNode_NullRequestHandler()
	 * @model unique="false" dataType="ca.gc.asc_csa.apogy.addons.ros.NullRequestHandler"
	 * @generated
	 */
	NullRequestHandler getNullRequestHandler();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.ros.ROSNode#getNullRequestHandler <em>Null Request Handler</em>}' attribute.
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
	 * <!-- begin-model-doc -->
	 * Initializes the ROS node
	 * <!-- end-model-doc -->
	 * @model exceptions="ca.gc.asc_csa.apogy.addons.ros.Exception"
	 * @generated
	 */
	void initialize() throws Exception;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Event called when the node is connected to the ROS master;
	 * starts the subscriber handler and the service client's handler.
	 * 
	 * @param connectedNode The relevant connected node
	 * <!-- end-model-doc -->
	 * @model connectedNodeDataType="ca.gc.asc_csa.apogy.addons.ros.ConnectedNode" connectedNodeUnique="false"
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
	 * Registers a new module; if the given initialization parameter
	 * is true, the module will also be initialized.
	 * 
	 * @param module The ROS interface / module to be registered
	 * @param initialize Whether or not that module should also be initialized
	 * <!-- end-model-doc -->
	 * @model moduleUnique="false" initializeUnique="false"
	 * @generated
	 */
	void register(ROSInterface module, boolean initialize);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Registers and initializes a new module.
	 * 
	 * @param module The ROS interface / module to be registered and initialized
	 * <!-- end-model-doc -->
	 * @model moduleUnique="false"
	 * @generated
	 */
	void register(ROSInterface module);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a new variable from a given type
	 * 
	 * @param messageType The type for the new variable
	 * @reeturn The newly created variable
	 * <!-- end-model-doc -->
	 * @model unique="false" messageTypeUnique="false"
	 * @generated
	 */
	<T> T newFromType(String messageType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Shuts down this ROS node
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void shutdown();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a new publisher with the
	 * given name and message type
	 * 
	 * @param topicName The topic name for the newly created publisher
	 * @param messageType The type for the publisher's messages
	 * @return The newly created publisher
	 * <!-- end-model-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.addons.ros.Publisher<T>" unique="false" topicNameUnique="false" messageTypeUnique="false"
	 * @generated
	 */
	<T> Publisher<T> createPublisher(String topicName, String messageType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a new service manager
	 * 
	 * @return The newly created service manager
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 * @generated
	 */
	ROSServiceManager createServiceManager();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a new topic launcher
	 * 
	 * @return The newly created topic launcher
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 * @generated
	 */
	ROSTopicLauncher createTopicLauncher();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a new publisher manager
	 * 
	 * @return The newly created publisher manager
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 * @generated
	 */
	ROSPublisherManager createPublisherManager();

} // ROSNode
