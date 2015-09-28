/**
 * Canadian Space Agency / Agence spatiale canadienne 2013 Copyrights (c)
 */
package ca.gc.asc_csa.eclipse.ros;

import org.eclipse.emf.ecore.EObject;
import org.ros.internal.message.Message;
import org.ros.message.MessageListener;
import org.ros.node.ConnectedNode;
import org.ros.node.topic.Subscriber;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Listener</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.eclipse.ros.RosListener#isRunning <em>Running</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.ros.RosListener#getNode <em>Node</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.ros.RosListener#getRosSubscriber <em>Ros Subscriber</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.ros.RosListener#getTopicName <em>Topic Name</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.ros.RosListener#getMessageType <em>Message Type</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.ros.RosListener#getMessageListener <em>Message Listener</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.eclipse.ros.RosPackage#getRosListener()
 * @model TBounds="ca.gc.asc_csa.eclipse.ros.Message"
 * @generated
 */
public interface RosListener<T extends Message> extends EObject
{
  /**
	 * Returns the value of the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Running</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Running</em>' attribute.
	 * @see #setRunning(boolean)
	 * @see ca.gc.asc_csa.eclipse.ros.RosPackage#getRosListener_Running()
	 * @model unique="false"
	 * @generated
	 */
  boolean isRunning();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.ros.RosListener#isRunning <em>Running</em>}' attribute.
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
   * <p>
   * If the meaning of the '<em>Node</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' reference.
	 * @see #setNode(RosNode)
	 * @see ca.gc.asc_csa.eclipse.ros.RosPackage#getRosListener_Node()
	 * @model
	 * @generated
	 */
  RosNode getNode();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.ros.RosListener#getNode <em>Node</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node</em>' reference.
	 * @see #getNode()
	 * @generated
	 */
  void setNode(RosNode value);

  /**
	 * Returns the value of the '<em><b>Ros Subscriber</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ros Subscriber</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Ros Subscriber</em>' attribute.
	 * @see #setRosSubscriber(Subscriber)
	 * @see ca.gc.asc_csa.eclipse.ros.RosPackage#getRosListener_RosSubscriber()
	 * @model unique="false" dataType="ca.gc.asc_csa.eclipse.ros.Subscriber<T>"
	 * @generated
	 */
  Subscriber<T> getRosSubscriber();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.ros.RosListener#getRosSubscriber <em>Ros Subscriber</em>}' attribute.
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
   * <p>
   * If the meaning of the '<em>Topic Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Topic Name</em>' attribute.
	 * @see #setTopicName(String)
	 * @see ca.gc.asc_csa.eclipse.ros.RosPackage#getRosListener_TopicName()
	 * @model unique="false"
	 * @generated
	 */
  String getTopicName();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.ros.RosListener#getTopicName <em>Topic Name</em>}' attribute.
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
   * <p>
   * If the meaning of the '<em>Message Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Type</em>' attribute.
	 * @see #setMessageType(String)
	 * @see ca.gc.asc_csa.eclipse.ros.RosPackage#getRosListener_MessageType()
	 * @model unique="false"
	 * @generated
	 */
  String getMessageType();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.ros.RosListener#getMessageType <em>Message Type</em>}' attribute.
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
   * <p>
   * If the meaning of the '<em>Message Listener</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Listener</em>' attribute.
	 * @see #setMessageListener(MessageListener)
	 * @see ca.gc.asc_csa.eclipse.ros.RosPackage#getRosListener_MessageListener()
	 * @model unique="false" dataType="ca.gc.asc_csa.eclipse.ros.MessageListener<T>"
	 * @generated
	 */
  MessageListener<T> getMessageListener();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.ros.RosListener#getMessageListener <em>Message Listener</em>}' attribute.
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
	 * Start the subscriber <br>
	 * Note : needed to lock because of a bug on Windows =( <br>
	 * The bug was that the program couldn't start multiple subscribers at once.
	 * <!-- end-model-doc -->
	 * @model unique="false" exceptions="ca.gc.asc_csa.eclipse.ros.Exception" nodeUnique="false"
	 * @generated
	 */
  boolean startWithLocks(RosNode node) throws Exception;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Start the subscriber <br>
	 * Note : For Linux there's no need to lock, subscribers can subscribe at the same time
	 * <!-- end-model-doc -->
	 * @model exceptions="ca.gc.asc_csa.eclipse.ros.Exception" nodeUnique="false"
	 * @generated
	 */
  void start(RosNode node) throws Exception;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model connectedNodeDataType="ca.gc.asc_csa.eclipse.ros.ConnectedNode" connectedNodeUnique="false"
	 * @generated
	 */
  void connectSubscriber(ConnectedNode connectedNode);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
  void stop();

} // RosListener
