/**
 * Canadian Space Agency / Agence spatiale canadienne 2013 Copyrights (c)
 */
package ca.gc.asc_csa.eclipse.ros;

import org.eclipse.emf.ecore.EObject;
import org.ros.exception.ServiceNotFoundException;
import org.ros.internal.message.Message;
import org.ros.node.service.ServiceClient;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.eclipse.ros.RosService#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.ros.RosService#getServiceType <em>Service Type</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.ros.RosService#isLaunched <em>Launched</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.ros.RosService#getServiceClient <em>Service Client</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.ros.RosService#getNode <em>Node</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.ros.RosService#isDisconnectOnTimeout <em>Disconnect On Timeout</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.eclipse.ros.RosPackage#getRosService()
 * @model RequestBounds="ca.gc.asc_csa.eclipse.ros.Message" ResponseBounds="ca.gc.asc_csa.eclipse.ros.Message"
 * @generated
 */
public interface RosService<Request extends Message, Response extends Message> extends EObject
{
  /**
	 * Returns the value of the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Service Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Name</em>' attribute.
	 * @see #setServiceName(String)
	 * @see ca.gc.asc_csa.eclipse.ros.RosPackage#getRosService_ServiceName()
	 * @model unique="false"
	 * @generated
	 */
  String getServiceName();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.ros.RosService#getServiceName <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Name</em>' attribute.
	 * @see #getServiceName()
	 * @generated
	 */
  void setServiceName(String value);

  /**
	 * Returns the value of the '<em><b>Service Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Service Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Type</em>' attribute.
	 * @see #setServiceType(String)
	 * @see ca.gc.asc_csa.eclipse.ros.RosPackage#getRosService_ServiceType()
	 * @model unique="false"
	 * @generated
	 */
  String getServiceType();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.ros.RosService#getServiceType <em>Service Type</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Type</em>' attribute.
	 * @see #getServiceType()
	 * @generated
	 */
  void setServiceType(String value);

  /**
	 * Returns the value of the '<em><b>Launched</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Launched</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Launched</em>' attribute.
	 * @see #setLaunched(boolean)
	 * @see ca.gc.asc_csa.eclipse.ros.RosPackage#getRosService_Launched()
	 * @model default="false" unique="false"
	 * @generated
	 */
  boolean isLaunched();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.ros.RosService#isLaunched <em>Launched</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Launched</em>' attribute.
	 * @see #isLaunched()
	 * @generated
	 */
  void setLaunched(boolean value);

  /**
	 * Returns the value of the '<em><b>Service Client</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Service Client</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Client</em>' attribute.
	 * @see #setServiceClient(ServiceClient)
	 * @see ca.gc.asc_csa.eclipse.ros.RosPackage#getRosService_ServiceClient()
	 * @model unique="false" dataType="ca.gc.asc_csa.eclipse.ros.ServiceClient<Request, Response>"
	 * @generated
	 */
  ServiceClient<Request, Response> getServiceClient();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.ros.RosService#getServiceClient <em>Service Client</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Client</em>' attribute.
	 * @see #getServiceClient()
	 * @generated
	 */
  void setServiceClient(ServiceClient<Request, Response> value);

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
	 * @see ca.gc.asc_csa.eclipse.ros.RosPackage#getRosService_Node()
	 * @model
	 * @generated
	 */
  RosNode getNode();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.ros.RosService#getNode <em>Node</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node</em>' reference.
	 * @see #getNode()
	 * @generated
	 */
  void setNode(RosNode value);

  /**
	 * Returns the value of the '<em><b>Disconnect On Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Disconnect On Timeout</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Disconnect On Timeout</em>' attribute.
	 * @see #setDisconnectOnTimeout(boolean)
	 * @see ca.gc.asc_csa.eclipse.ros.RosPackage#getRosService_DisconnectOnTimeout()
	 * @model unique="false"
	 * @generated
	 */
  boolean isDisconnectOnTimeout();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.ros.RosService#isDisconnectOnTimeout <em>Disconnect On Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disconnect On Timeout</em>' attribute.
	 * @see #isDisconnectOnTimeout()
	 * @generated
	 */
  void setDisconnectOnTimeout(boolean value);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model exceptions="ca.gc.asc_csa.eclipse.ros.ServiceNotFoundException" nodeUnique="false"
	 * @generated
	 */
  void launch(RosNode node) throws ServiceNotFoundException;

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
	 * @model unique="false"
	 * @generated
	 */
  Request newRequestMessage();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model unique="false" requestUnique="false"
	 * @generated
	 */
  Response call(Request request);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model unique="false" requestUnique="false" enableLoggingUnique="false"
	 * @generated
	 */
  Response call(Request request, boolean enableLogging);

} // RosService
