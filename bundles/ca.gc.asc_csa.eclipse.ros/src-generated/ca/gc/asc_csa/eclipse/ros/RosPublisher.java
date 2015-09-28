/**
 * Canadian Space Agency / Agence spatiale canadienne 2013 Copyrights (c)
 */
package ca.gc.asc_csa.eclipse.ros;

import org.eclipse.emf.ecore.EObject;
import org.ros.internal.message.Message;
import org.ros.node.topic.Publisher;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Publisher</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.eclipse.ros.RosPublisher#isLaunched <em>Launched</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.ros.RosPublisher#getTopicName <em>Topic Name</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.ros.RosPublisher#getMessageType <em>Message Type</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.ros.RosPublisher#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.ros.RosPublisher#getNode <em>Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.eclipse.ros.RosPackage#getRosPublisher()
 * @model TBounds="ca.gc.asc_csa.eclipse.ros.Message"
 * @generated
 */
public interface RosPublisher<T extends Message> extends EObject
{
  /**
	 * Returns the value of the '<em><b>Launched</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Launched</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Publisher Manager Launched
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Launched</em>' attribute.
	 * @see #isSetLaunched()
	 * @see ca.gc.asc_csa.eclipse.ros.RosPackage#getRosPublisher_Launched()
	 * @model unique="false" unsettable="true" changeable="false" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly' notify='true' propertyCategory='ROS_PUBLISHER'"
	 * @generated
	 */
  boolean isLaunched();

  /**
	 * Returns whether the value of the '{@link ca.gc.asc_csa.eclipse.ros.RosPublisher#isLaunched <em>Launched</em>}' attribute is set.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Launched</em>' attribute is set.
	 * @see #isLaunched()
	 * @generated
	 */
  boolean isSetLaunched();

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
	 * @see ca.gc.asc_csa.eclipse.ros.RosPackage#getRosPublisher_TopicName()
	 * @model unique="false"
	 * @generated
	 */
  String getTopicName();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.ros.RosPublisher#getTopicName <em>Topic Name</em>}' attribute.
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
	 * @see ca.gc.asc_csa.eclipse.ros.RosPackage#getRosPublisher_MessageType()
	 * @model unique="false"
	 * @generated
	 */
  String getMessageType();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.ros.RosPublisher#getMessageType <em>Message Type</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Type</em>' attribute.
	 * @see #getMessageType()
	 * @generated
	 */
  void setMessageType(String value);

  /**
	 * Returns the value of the '<em><b>Publisher</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Publisher</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Publisher</em>' attribute.
	 * @see #setPublisher(Publisher)
	 * @see ca.gc.asc_csa.eclipse.ros.RosPackage#getRosPublisher_Publisher()
	 * @model unique="false" dataType="ca.gc.asc_csa.eclipse.ros.Publisher<T>"
	 * @generated
	 */
  Publisher<T> getPublisher();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.ros.RosPublisher#getPublisher <em>Publisher</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publisher</em>' attribute.
	 * @see #getPublisher()
	 * @generated
	 */
  void setPublisher(Publisher<T> value);

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
	 * @see ca.gc.asc_csa.eclipse.ros.RosPackage#getRosPublisher_Node()
	 * @model
	 * @generated
	 */
  RosNode getNode();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.ros.RosPublisher#getNode <em>Node</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node</em>' reference.
	 * @see #getNode()
	 * @generated
	 */
  void setNode(RosNode value);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model nodeUnique="false"
	 * @generated
	 */
  void launch(RosNode node);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model messageUnique="false"
	 * @generated
	 */
  void publish(T message);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model unique="false"
	 * @generated
	 */
  T newMessage();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
  void stop();

} // RosPublisher
