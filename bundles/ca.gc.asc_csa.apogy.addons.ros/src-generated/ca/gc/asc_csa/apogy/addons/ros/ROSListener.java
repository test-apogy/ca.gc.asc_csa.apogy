/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.addons.ros;

import org.eclipse.emf.ecore.EObject;

import org.ros.internal.message.Message;

import org.ros.message.MessageListener;

import org.ros.node.ConnectedNode;

import org.ros.node.topic.Subscriber;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ros Listener</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.ros.ROSListener#isRunning <em>Running</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.ros.ROSListener#getNode <em>Node</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.ros.ROSListener#getRosSubscriber <em>Ros Subscriber</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.ros.ROSListener#getTopicName <em>Topic Name</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.ros.ROSListener#getMessageType <em>Message Type</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.ros.ROSListener#getMessageListener <em>Message Listener</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.addons.ros.ApogyAddonsROSPackage#getROSListener()
 * @model TBounds="ca.gc.asc_csa.apogy.addons.ros.Message"
 * @generated
 */
public interface ROSListener<T extends Message> extends EObject {
	/**
	 * Returns the value of the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether or not the listener is currently running
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Running</em>' attribute.
	 * @see #setRunning(boolean)
	 * @see ca.gc.asc_csa.apogy.addons.ros.ApogyAddonsROSPackage#getROSListener_Running()
	 * @model unique="false"
	 * @generated
	 */
	boolean isRunning();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.ros.ROSListener#isRunning <em>Running</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Running</em>' attribute.
	 * @see #isRunning()
	 * @generated
	 */
	void setRunning(boolean value);

	/**
	 * Returns the value of the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The underlying ROS node
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Node</em>' reference.
	 * @see #setNode(ROSNode)
	 * @see ca.gc.asc_csa.apogy.addons.ros.ApogyAddonsROSPackage#getROSListener_Node()
	 * @model
	 * @generated
	 */
	ROSNode getNode();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.ros.ROSListener#getNode <em>Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node</em>' reference.
	 * @see #getNode()
	 * @generated
	 */
	void setNode(ROSNode value);

	/**
	 * Returns the value of the '<em><b>Ros Subscriber</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The subscriber for this listener's events
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ros Subscriber</em>' attribute.
	 * @see #setRosSubscriber(Subscriber)
	 * @see ca.gc.asc_csa.apogy.addons.ros.ApogyAddonsROSPackage#getROSListener_RosSubscriber()
	 * @model unique="false" dataType="ca.gc.asc_csa.apogy.addons.ros.Subscriber<T>"
	 * @generated
	 */
	Subscriber<T> getRosSubscriber();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.ros.ROSListener#getRosSubscriber <em>Ros Subscriber</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ros Subscriber</em>' attribute.
	 * @see #getRosSubscriber()
	 * @generated
	 */
	void setRosSubscriber(Subscriber<T> value);

	/**
	 * Returns the value of the '<em><b>Topic Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The topic this listener is subscribed to
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Topic Name</em>' attribute.
	 * @see #setTopicName(String)
	 * @see ca.gc.asc_csa.apogy.addons.ros.ApogyAddonsROSPackage#getROSListener_TopicName()
	 * @model unique="false"
	 * @generated
	 */
	String getTopicName();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.ros.ROSListener#getTopicName <em>Topic Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topic Name</em>' attribute.
	 * @see #getTopicName()
	 * @generated
	 */
	void setTopicName(String value);

	/**
	 * Returns the value of the '<em><b>Message Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of messages this listener is subscribed to
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Type</em>' attribute.
	 * @see #setMessageType(String)
	 * @see ca.gc.asc_csa.apogy.addons.ros.ApogyAddonsROSPackage#getROSListener_MessageType()
	 * @model unique="false"
	 * @generated
	 */
	String getMessageType();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.ros.ROSListener#getMessageType <em>Message Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Type</em>' attribute.
	 * @see #getMessageType()
	 * @generated
	 */
	void setMessageType(String value);

	/**
	 * Returns the value of the '<em><b>Message Listener</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The underlying ROS message listener
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Listener</em>' attribute.
	 * @see #setMessageListener(MessageListener)
	 * @see ca.gc.asc_csa.apogy.addons.ros.ApogyAddonsROSPackage#getROSListener_MessageListener()
	 * @model unique="false" dataType="ca.gc.asc_csa.apogy.addons.ros.MessageListener<T>"
	 * @generated
	 */
	MessageListener<T> getMessageListener();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.ros.ROSListener#getMessageListener <em>Message Listener</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Listener</em>' attribute.
	 * @see #getMessageListener()
	 * @generated
	 */
	void setMessageListener(MessageListener<T> value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Starts the subscriber, with it initially locked
	 * 
	 * Note : Needed to lock because of a bug on Windows =(
	 *        The bug was that the program couldn't start
	 *        multiple subscribers at once.
	 * 
	 * @param node The underlying ROS node to listen on
	 * @return Whether or not the listener started running
	 * @throws Exception Thrown if any underlying exception occurs
	 * <!-- end-model-doc -->
	 * @model unique="false" exceptions="ca.gc.asc_csa.apogy.addons.ros.Exception" nodeUnique="false"
	 * @generated
	 */
	boolean startWithLocks(ROSNode node) throws Exception;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Starts the subscriber
	 * 
	 * Note : For Linux there's no need to lock, subscribers
	 *        can subscribe at the same time.
	 * 
	 * @param node The underlying ROS node to listen on
	 * @throws Exception Thrown if any underlying exception occurs
	 * <!-- end-model-doc -->
	 * @model exceptions="ca.gc.asc_csa.apogy.addons.ros.Exception" nodeUnique="false"
	 * @generated
	 */
	void start(ROSNode node) throws Exception;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Connects this subscriber to this listener's events
	 * 
	 * @ param connectedNode The node to subscribe to this listener
	 * <!-- end-model-doc -->
	 * @model connectedNodeDataType="ca.gc.asc_csa.apogy.addons.ros.ConnectedNode" connectedNodeUnique="false"
	 * @generated
	 */
	void connectSubscriber(ConnectedNode connectedNode);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Stops the subscriber
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void stop();

} // ROSListener
