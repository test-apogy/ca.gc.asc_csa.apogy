/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.addons.ros;

import org.eclipse.emf.ecore.EObject;

import org.ros.exception.ServiceNotFoundException;

import org.ros.internal.message.Message;

import org.ros.node.service.ServiceClient;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ros Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.ros.ROSService#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.ros.ROSService#getServiceType <em>Service Type</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.ros.ROSService#isLaunched <em>Launched</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.ros.ROSService#getServiceClient <em>Service Client</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.ros.ROSService#getNode <em>Node</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.ros.ROSService#isDisconnectOnTimeout <em>Disconnect On Timeout</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.addons.ros.ApogyAddonsROSPackage#getROSService()
 * @model RequestBounds="ca.gc.asc_csa.apogy.addons.ros.Message" ResponseBounds="ca.gc.asc_csa.apogy.addons.ros.Message"
 * @generated
 */
public interface ROSService<Request extends Message, Response extends Message> extends EObject {
	/**
	 * Returns the value of the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The service's name
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Name</em>' attribute.
	 * @see #setServiceName(String)
	 * @see ca.gc.asc_csa.apogy.addons.ros.ApogyAddonsROSPackage#getROSService_ServiceName()
	 * @model unique="false"
	 * @generated
	 */
	String getServiceName();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.ros.ROSService#getServiceName <em>Service Name</em>}' attribute.
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
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of the service
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Type</em>' attribute.
	 * @see #setServiceType(String)
	 * @see ca.gc.asc_csa.apogy.addons.ros.ApogyAddonsROSPackage#getROSService_ServiceType()
	 * @model unique="false"
	 * @generated
	 */
	String getServiceType();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.ros.ROSService#getServiceType <em>Service Type</em>}' attribute.
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
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether or not the service has been launched
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Launched</em>' attribute.
	 * @see #setLaunched(boolean)
	 * @see ca.gc.asc_csa.apogy.addons.ros.ApogyAddonsROSPackage#getROSService_Launched()
	 * @model default="false" unique="false"
	 * @generated
	 */
	boolean isLaunched();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.ros.ROSService#isLaunched <em>Launched</em>}' attribute.
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
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The underlying ROS service client
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Client</em>' attribute.
	 * @see #setServiceClient(ServiceClient)
	 * @see ca.gc.asc_csa.apogy.addons.ros.ApogyAddonsROSPackage#getROSService_ServiceClient()
	 * @model unique="false" dataType="ca.gc.asc_csa.apogy.addons.ros.ServiceClient<Request, Response>"
	 * @generated
	 */
	ServiceClient<Request, Response> getServiceClient();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.ros.ROSService#getServiceClient <em>Service Client</em>}' attribute.
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
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The underlying ROS node
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Node</em>' reference.
	 * @see #setNode(ROSNode)
	 * @see ca.gc.asc_csa.apogy.addons.ros.ApogyAddonsROSPackage#getROSService_Node()
	 * @model
	 * @generated
	 */
	ROSNode getNode();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.ros.ROSService#getNode <em>Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node</em>' reference.
	 * @see #getNode()
	 * @generated
	 */
	void setNode(ROSNode value);

	/**
	 * Returns the value of the '<em><b>Disconnect On Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether or not the service should disconnect
	 * if it times out
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Disconnect On Timeout</em>' attribute.
	 * @see #setDisconnectOnTimeout(boolean)
	 * @see ca.gc.asc_csa.apogy.addons.ros.ApogyAddonsROSPackage#getROSService_DisconnectOnTimeout()
	 * @model unique="false"
	 * @generated
	 */
	boolean isDisconnectOnTimeout();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.ros.ROSService#isDisconnectOnTimeout <em>Disconnect On Timeout</em>}' attribute.
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
	 * <!-- begin-model-doc -->
	 * Launches the service for the given underlying ROS node,
	 * allowing it to receive requests.
	 * 
	 * @param node The ROS node that this service corresponds to
	 * @throws ServiceNotFoundException Thrown if the service could not be resolved to the given ROS node.
	 * <!-- end-model-doc -->
	 * @model exceptions="ca.gc.asc_csa.apogy.addons.ros.ServiceNotFoundException" nodeUnique="false"
	 * @generated
	 */
	void launch(ROSNode node) throws ServiceNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Stops the service from processing anymore requests.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void stop();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns a new request message, whose type is valid for
	 * use in calls to this service.
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 * @generated
	 */
	Request newRequestMessage();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Calls the service with the given request and the
	 * response of that call is returned.
	 * 
	 * Note: The service's logging is enabled for this call
	 * 
	 * @param request The request to send to this service
	 * @return The service's response to the call
	 * <!-- end-model-doc -->
	 * @model unique="false" requestUnique="false"
	 * @generated
	 */
	Response call(Request request);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Calls the service with the given request and the
	 * response of that call is returned.  The enable logging
	 * value will determine whether or not logging should be
	 * enabled for this call.
	 * 
	 * @param request The rrequest to send to this service
	 * @param enableLogging Whether or not this call should be logged
	 * @return The service's response to the call
	 * <!-- end-model-doc -->
	 * @model unique="false" requestUnique="false" enableLoggingUnique="false"
	 * @generated
	 */
	Response call(Request request, boolean enableLogging);

} // ROSService
