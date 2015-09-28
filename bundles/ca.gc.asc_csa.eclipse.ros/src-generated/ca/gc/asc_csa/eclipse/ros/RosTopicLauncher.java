/**
 * Canadian Space Agency / Agence spatiale canadienne 2013 Copyrights (c)
 */
package ca.gc.asc_csa.eclipse.ros;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.ros.internal.message.Message;
import org.ros.message.MessageListener;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Topic Launcher</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.eclipse.ros.RosTopicLauncher#getListenerList <em>Listener List</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.ros.RosTopicLauncher#getNode <em>Node</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.ros.RosTopicLauncher#isRunning <em>Running</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.eclipse.ros.RosPackage#getRosTopicLauncher()
 * @model
 * @generated
 */
public interface RosTopicLauncher extends EObject
{
  /**
	 * Returns the value of the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Running</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Topic Manager Running
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Running</em>' attribute.
	 * @see #setRunning(boolean)
	 * @see ca.gc.asc_csa.eclipse.ros.RosPackage#getRosTopicLauncher_Running()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly' notify='true' propertyCategory='ROS_TOPIC_LAUNCHER'"
	 * @generated
	 */
  boolean isRunning();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.ros.RosTopicLauncher#isRunning <em>Running</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Running</em>' attribute.
	 * @see #isRunning()
	 * @generated
	 */
  void setRunning(boolean value);

  /**
	 * Returns the value of the '<em><b>Listener List</b></em>' reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.eclipse.ros.RosListener}&lt;?>.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Listener List</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Listener List</em>' reference list.
	 * @see ca.gc.asc_csa.eclipse.ros.RosPackage#getRosTopicLauncher_ListenerList()
	 * @model
	 * @generated
	 */
  EList<RosListener<?>> getListenerList();

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
	 * @see ca.gc.asc_csa.eclipse.ros.RosPackage#getRosTopicLauncher_Node()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly' children='true' notify='true' propertyCategory='ROS_TOPIC_LAUNCHER'"
	 * @generated
	 */
  RosNode getNode();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.ros.RosTopicLauncher#getNode <em>Node</em>}' reference.
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
	 * @model topicNameUnique="false" messageTypeUnique="false" messageListenerDataType="ca.gc.asc_csa.eclipse.ros.MessageListener<M>" messageListenerUnique="false" MBounds="ca.gc.asc_csa.eclipse.ros.Message"
	 * @generated
	 */
  <M extends Message> void createListener(String topicName, String messageType, MessageListener<M> messageListener);

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
	 * @model
	 * @generated
	 */
  void reset();

} // RosTopicLauncher
