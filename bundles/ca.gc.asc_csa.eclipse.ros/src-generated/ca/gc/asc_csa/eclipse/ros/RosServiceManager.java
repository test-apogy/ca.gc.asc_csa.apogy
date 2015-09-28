/**
 * Canadian Space Agency / Agence spatiale canadienne 2013 Copyrights (c)
 */
package ca.gc.asc_csa.eclipse.ros;

import java.util.HashMap;

import org.eclipse.emf.ecore.EObject;
import org.ros.internal.message.Message;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.eclipse.ros.RosServiceManager#getServices <em>Services</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.ros.RosServiceManager#getNode <em>Node</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.ros.RosServiceManager#isRunning <em>Running</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.eclipse.ros.RosPackage#getRosServiceManager()
 * @model
 * @generated
 */
public interface RosServiceManager extends EObject
{
  /**
	 * Returns the value of the '<em><b>Services</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Services</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' attribute.
	 * @see #setServices(HashMap)
	 * @see ca.gc.asc_csa.eclipse.ros.RosPackage#getRosServiceManager_Services()
	 * @model unique="false" dataType="ca.gc.asc_csa.eclipse.ros.HashMap<org.eclipse.emf.ecore.EString, ca.gc.asc_csa.eclipse.ros.RosService<?, ?>>"
	 * @generated
	 */
  HashMap<String, RosService<?, ?>> getServices();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.ros.RosServiceManager#getServices <em>Services</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Services</em>' attribute.
	 * @see #getServices()
	 * @generated
	 */
  void setServices(HashMap<String, RosService<?, ?>> value);

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
	 * @see ca.gc.asc_csa.eclipse.ros.RosPackage#getRosServiceManager_Node()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly' children='true' notify='true' propertyCategory='ROS_SERVICE_MANAGER'"
	 * @generated
	 */
  RosNode getNode();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.ros.RosServiceManager#getNode <em>Node</em>}' reference.
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
	 * @see ca.gc.asc_csa.eclipse.ros.RosPackage#getRosServiceManager_Running()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly' notify='true' propertyCategory='ROS_SERVICE_MANAGER'"
	 * @generated
	 */
  boolean isRunning();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.ros.RosServiceManager#isRunning <em>Running</em>}' attribute.
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
	 * @model serviceNameUnique="false" serviceTypeUnique="false"
	 * @generated
	 */
  void createService(String serviceName, String serviceType);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model serviceNameUnique="false" serviceTypeUnique="false" disconnectOnTimeoutUnique="false"
	 * @generated
	 */
  void createService(String serviceName, String serviceType, boolean disconnectOnTimeout);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model unique="false" serviceNameUnique="false" RequestBounds="ca.gc.asc_csa.eclipse.ros.Message" ResponseBounds="ca.gc.asc_csa.eclipse.ros.Message"
	 * @generated
	 */
  <Request extends Message, Response extends Message> RosService<Request, Response> getService(String serviceName);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model unique="false" serviceNameUnique="false" RequestBounds="ca.gc.asc_csa.eclipse.ros.Message" ResponseBounds="ca.gc.asc_csa.eclipse.ros.Message"
	 * @generated
	 */
  <Request extends Message, Response extends Message> Request createRequestMessage(String serviceName);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model unique="false" serviceNameUnique="false" requestUnique="false" RequestBounds="ca.gc.asc_csa.eclipse.ros.Message" ResponseBounds="ca.gc.asc_csa.eclipse.ros.Message"
	 * @generated
	 */
  <Request extends Message, Response extends Message> Response callService(String serviceName, Request request);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model unique="false" serviceNameUnique="false" RequestBounds="ca.gc.asc_csa.eclipse.ros.Message" ResponseBounds="ca.gc.asc_csa.eclipse.ros.Message"
	 * @generated
	 */
  <Request extends Message, Response extends Message> Response callService(String serviceName);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model unique="false" serviceNameUnique="false" requestUnique="false" enableLoggingUnique="false" RequestBounds="ca.gc.asc_csa.eclipse.ros.Message" ResponseBounds="ca.gc.asc_csa.eclipse.ros.Message"
	 * @generated
	 */
  <Request extends Message, Response extends Message> Response callService(String serviceName, Request request, boolean enableLogging);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model unique="false" serviceNameUnique="false" enableLoggingUnique="false" RequestBounds="ca.gc.asc_csa.eclipse.ros.Message" ResponseBounds="ca.gc.asc_csa.eclipse.ros.Message"
	 * @generated
	 */
  <Request extends Message, Response extends Message> Response callService(String serviceName, boolean enableLogging);

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

} // RosServiceManager
