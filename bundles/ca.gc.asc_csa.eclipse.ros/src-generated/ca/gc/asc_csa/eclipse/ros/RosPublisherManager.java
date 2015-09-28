/**
 * Canadian Space Agency / Agence spatiale canadienne 2013 Copyrights (c)
 */
package ca.gc.asc_csa.eclipse.ros;

import java.util.HashMap;

import org.eclipse.emf.ecore.EObject;
import org.ros.internal.message.Message;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Publisher Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.eclipse.ros.RosPublisherManager#getPublishers <em>Publishers</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.ros.RosPublisherManager#getNode <em>Node</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.ros.RosPublisherManager#isRunning <em>Running</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.eclipse.ros.RosPackage#getRosPublisherManager()
 * @model
 * @generated
 */
public interface RosPublisherManager extends EObject
{

  /**
	 * Returns the value of the '<em><b>Publishers</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Publishers</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Publishers</em>' attribute.
	 * @see #setPublishers(HashMap)
	 * @see ca.gc.asc_csa.eclipse.ros.RosPackage#getRosPublisherManager_Publishers()
	 * @model unique="false" dataType="ca.gc.asc_csa.eclipse.ros.HashMap<org.eclipse.emf.ecore.EString, ca.gc.asc_csa.eclipse.ros.RosPublisher<?>>"
	 * @generated
	 */
  HashMap<String, RosPublisher<?>> getPublishers();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.ros.RosPublisherManager#getPublishers <em>Publishers</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publishers</em>' attribute.
	 * @see #getPublishers()
	 * @generated
	 */
  void setPublishers(HashMap<String, RosPublisher<?>> value);

  /**
	 * Returns the value of the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Node</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ROS Node
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Node</em>' reference.
	 * @see #setNode(RosNode)
	 * @see ca.gc.asc_csa.eclipse.ros.RosPackage#getRosPublisherManager_Node()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly' children='true' notify='true' propertyCategory='ROS_PUBLISHER_MANAGER'"
	 * @generated
	 */
  RosNode getNode();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.ros.RosPublisherManager#getNode <em>Node</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node</em>' reference.
	 * @see #getNode()
	 * @generated
	 */
  void setNode(RosNode value);

  /**
	 * Returns the value of the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Running</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Publisher Manager Running
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Running</em>' attribute.
	 * @see #setRunning(boolean)
	 * @see ca.gc.asc_csa.eclipse.ros.RosPackage#getRosPublisherManager_Running()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly' notify='true' propertyCategory='ROS_PUBLISHER_MANAGER'"
	 * @generated
	 */
  boolean isRunning();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.ros.RosPublisherManager#isRunning <em>Running</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Running</em>' attribute.
	 * @see #isRunning()
	 * @generated
	 */
  void setRunning(boolean value);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model topicNameUnique="false" messageTypeUnique="false"
	 * @generated
	 */
  void createPublisher(String topicName, String messageType);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
  void launch();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
  void stop();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model unique="false" topicNameUnique="false" TBounds="ca.gc.asc_csa.eclipse.ros.Message"
	 * @generated
	 */
  <T extends Message> T createMessage(String topicName);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model topicNameUnique="false" messageUnique="false" TBounds="ca.gc.asc_csa.eclipse.ros.Message"
	 * @generated
	 */
  <T extends Message> void publish(String topicName, T message);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model unique="false" topicNameUnique="false" TBounds="ca.gc.asc_csa.eclipse.ros.Message"
	 * @generated
	 */
  <T extends Message> RosPublisher<T> getPublisher(String topicName);
} // RosPublisherManager
