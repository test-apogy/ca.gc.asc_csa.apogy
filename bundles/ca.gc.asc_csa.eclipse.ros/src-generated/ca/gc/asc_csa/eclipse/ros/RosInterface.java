/**
 * Canadian Space Agency / Agence spatiale canadienne 2013 Copyrights (c)
 */
package ca.gc.asc_csa.eclipse.ros;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.eclipse.ros.RosInterface#getServiceManager <em>Service Manager</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.ros.RosInterface#getTopicLauncher <em>Topic Launcher</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.ros.RosInterface#getPublisherManager <em>Publisher Manager</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.ros.RosInterface#getNode <em>Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.eclipse.ros.RosPackage#getRosInterface()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface RosInterface extends EObject
{
  /**
	 * Returns the value of the '<em><b>Service Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Service Manager</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Service Manager
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Manager</em>' reference.
	 * @see #setServiceManager(RosServiceManager)
	 * @see ca.gc.asc_csa.eclipse.ros.RosPackage#getRosInterface_ServiceManager()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly' children='true' notify='true' propertyCategory='ROS_INTERFACE'"
	 * @generated
	 */
  RosServiceManager getServiceManager();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.ros.RosInterface#getServiceManager <em>Service Manager</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Manager</em>' reference.
	 * @see #getServiceManager()
	 * @generated
	 */
  void setServiceManager(RosServiceManager value);

  /**
	 * Returns the value of the '<em><b>Topic Launcher</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Topic Launcher</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Topic Launcher
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Topic Launcher</em>' reference.
	 * @see #setTopicLauncher(RosTopicLauncher)
	 * @see ca.gc.asc_csa.eclipse.ros.RosPackage#getRosInterface_TopicLauncher()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly' children='true' notify='true' propertyCategory='ROS_INTERFACE'"
	 * @generated
	 */
  RosTopicLauncher getTopicLauncher();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.ros.RosInterface#getTopicLauncher <em>Topic Launcher</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topic Launcher</em>' reference.
	 * @see #getTopicLauncher()
	 * @generated
	 */
  void setTopicLauncher(RosTopicLauncher value);

  /**
	 * Returns the value of the '<em><b>Publisher Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Publisher Manager</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Publisher Manager
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Publisher Manager</em>' reference.
	 * @see #setPublisherManager(RosPublisherManager)
	 * @see ca.gc.asc_csa.eclipse.ros.RosPackage#getRosInterface_PublisherManager()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly' children='true' notify='true' propertyCategory='ROS_INTERFACE'"
	 * @generated
	 */
  RosPublisherManager getPublisherManager();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.ros.RosInterface#getPublisherManager <em>Publisher Manager</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publisher Manager</em>' reference.
	 * @see #getPublisherManager()
	 * @generated
	 */
  void setPublisherManager(RosPublisherManager value);

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
	 * @see ca.gc.asc_csa.eclipse.ros.RosPackage#getRosInterface_Node()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly' children='true' notify='true' propertyCategory='ROS_INTERFACE'"
	 * @generated
	 */
  RosNode getNode();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.ros.RosInterface#getNode <em>Node</em>}' reference.
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
	 * @model
	 * @generated
	 */
  void rosInit();

} // RosInterface
