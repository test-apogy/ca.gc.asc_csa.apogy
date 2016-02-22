package ca.gc.asc_csa.apogy.addons.ros;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import java.util.HashMap;

import org.eclipse.emf.ecore.EObject;

import org.ros.internal.message.Message;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ros Service Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.ros.ROSServiceManager#getServices <em>Services</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.ros.ROSServiceManager#getNode <em>Node</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.ros.ROSServiceManager#isRunning <em>Running</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.addons.ros.ApogyAddonsROSPackage#getROSServiceManager()
 * @model
 * @generated
 */
public interface ROSServiceManager extends EObject {
	/**
	 * Returns the value of the '<em><b>Services</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The internal collection of registered services.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Services</em>' attribute.
	 * @see #setServices(HashMap)
	 * @see ca.gc.asc_csa.apogy.addons.ros.ApogyAddonsROSPackage#getROSServiceManager_Services()
	 * @model unique="false" dataType="ca.gc.asc_csa.apogy.addons.ros.HashMap<org.eclipse.emf.ecore.EString, ca.gc.asc_csa.apogy.addons.ros.ROSService<?, ?>>"
	 * @generated
	 */
	HashMap<String, ROSService<?, ?>> getServices();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.ros.ROSServiceManager#getServices <em>Services</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Services</em>' attribute.
	 * @see #getServices()
	 * @generated
	 */
	void setServices(HashMap<String, ROSService<?, ?>> value);

	/**
	 * Returns the value of the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The underlying ROS node for this service manager.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Node</em>' reference.
	 * @see #setNode(ROSNode)
	 * @see ca.gc.asc_csa.apogy.addons.ros.ApogyAddonsROSPackage#getROSServiceManager_Node()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly' children='true' notify='true' propertyCategory='ROS_SERVICE_MANAGER'"
	 * @generated
	 */
	ROSNode getNode();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.ros.ROSServiceManager#getNode <em>Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node</em>' reference.
	 * @see #getNode()
	 * @generated
	 */
	void setNode(ROSNode value);

	/**
	 * Returns the value of the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether or not the service manager is currently running (i.e. launched)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Running</em>' attribute.
	 * @see #setRunning(boolean)
	 * @see ca.gc.asc_csa.apogy.addons.ros.ApogyAddonsROSPackage#getROSServiceManager_Running()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly' notify='true' propertyCategory='ROS_SERVICE_MANAGER'"
	 * @generated
	 */
	boolean isRunning();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.ros.ROSServiceManager#isRunning <em>Running</em>}' attribute.
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
	 * <!-- begin-model-doc -->
	 * Creates a service with the given name and type, which
	 * will automatically disconnect when a timeout occurs.
	 * 
	 * @param serviceName The name of the new service
	 * @param serviceType The type of the new service
	 * <!-- end-model-doc -->
	 * @model serviceNameUnique="false" serviceTypeUnique="false"
	 * @generated
	 */
	void createService(String serviceName, String serviceType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a service with the given name and type.  The
	 * given disconnectOnTimeout value will determine whether or
	 * not the service should disconnect if it time's out.
	 * 
	 * @param serviceName The name of the new service
	 * @param serviceType The type of the new service
	 * @param disconnectOnTimeout Whether or not the service should disconnect when it times out
	 * <!-- end-model-doc -->
	 * @model serviceNameUnique="false" serviceTypeUnique="false" disconnectOnTimeoutUnique="false"
	 * @generated
	 */
	void createService(String serviceName, String serviceType, boolean disconnectOnTimeout);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determines and returns the service with the given name
	 * (if one exists.)
	 * 
	 * @param serviceName The name of the desired service
	 * @return The corresponding service (if one exists)
	 * <!-- end-model-doc -->
	 * @model unique="false" serviceNameUnique="false" RequestBounds="ca.gc.asc_csa.apogy.addons.ros.Message" ResponseBounds="ca.gc.asc_csa.apogy.addons.ros.Message"
	 * @generated
	 */
	<Request extends Message, Response extends Message> ROSService<Request, Response> getService(String serviceName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Given the name of a service, the corresponding service
	 * is determined and if one exists, a new request message
	 * of the correct type for that service is created.
	 * 
	 * @param serviceName The name of the service, whose request message type determines the type of the new request message
	 * @return The newly created request message
	 * <!-- end-model-doc -->
	 * @model unique="false" serviceNameUnique="false" RequestBounds="ca.gc.asc_csa.apogy.addons.ros.Message" ResponseBounds="ca.gc.asc_csa.apogy.addons.ros.Message"
	 * @generated
	 */
	<Request extends Message, Response extends Message> Request createRequestMessage(String serviceName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determines the service that corresponds to the given
	 * service name; if it exists, the request is made to the
	 * service and its corresponding response is returned.
	 * 
	 * Note: The service's logging is enabled for this call.
	 * 
	 * @param serviceName The name of the service to call
	 * @param request The request to send to the service
	 * @return The service's response to this call
	 * <!-- end-model-doc -->
	 * @model unique="false" serviceNameUnique="false" requestUnique="false" RequestBounds="ca.gc.asc_csa.apogy.addons.ros.Message" ResponseBounds="ca.gc.asc_csa.apogy.addons.ros.Message"
	 * @generated
	 */
	<Request extends Message, Response extends Message> Response callService(String serviceName, Request request);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determines the service that corresponds to the given
	 * service name; if it exists, the request is made to the
	 * service and its corresponding response is returned.
	 * If the service call takes more than the timeout value,
	 * a null response is returned.
	 * 
	 * Note: The service's logging is enabled for this call.
	 * 
	 * @param serviceName The name of the service to call
	 * @param request The request to send to the service
	 * @param timeout, in milliseconds. A negative value means no timeout.
	 * @return The service's response to this call
	 * @throws A TimeoutException if the call fails to return within the specified timeout.
	 * <!-- end-model-doc -->
	 * @model unique="false" exceptions="ca.gc.asc_csa.apogy.addons.ros.Exception" serviceNameUnique="false" requestUnique="false" timeoutUnique="false" RequestBounds="ca.gc.asc_csa.apogy.addons.ros.Message" ResponseBounds="ca.gc.asc_csa.apogy.addons.ros.Message"
	 * @generated
	 */
	<Request extends Message, Response extends Message> Response callService(String serviceName, Request request, int timeout) throws Exception;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determines the service that corresponds to the given
	 * service name; if it exists, the service is called and
	 * the corresponding response is returned.
	 * 
	 * Note: The service's logging is enabled for this call.
	 * 
	 * @param serviceName The name of the service to call
	 * @return The service's response to this call
	 * <!-- end-model-doc -->
	 * @model unique="false" serviceNameUnique="false" RequestBounds="ca.gc.asc_csa.apogy.addons.ros.Message" ResponseBounds="ca.gc.asc_csa.apogy.addons.ros.Message"
	 * @generated
	 */
	<Request extends Message, Response extends Message> Response callService(String serviceName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determines the service that corresponds to the given
	 * service name; if it exists, the request is made to the
	 * service and its corresponding response is returned.  The
	 * enable logging value determines whether or not logging
	 * should be enabled for this service call.
	 * 
	 * @param serviceName The name of the service to call
	 * @param request The request to send to the service
	 * @param enableLogging Whether or not logging should be enabled for this service call
	 * @return The service's response to this call
	 * <!-- end-model-doc -->
	 * @model unique="false" serviceNameUnique="false" requestUnique="false" enableLoggingUnique="false" RequestBounds="ca.gc.asc_csa.apogy.addons.ros.Message" ResponseBounds="ca.gc.asc_csa.apogy.addons.ros.Message"
	 * @generated
	 */
	<Request extends Message, Response extends Message> Response callService(String serviceName, Request request, boolean enableLogging);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determines the service that corresponds to the given
	 * service name; if it exists, the request is made to the
	 * service and its corresponding response is returned.  The
	 * enable logging value determines whether or not logging
	 * should be enabled for this service call. If the service
	 * call takes more than the timeout value, a null response
	 * is returned.
	 * 
	 * @param serviceName The name of the service to call
	 * @param request The request to send to the service
	 * @param enableLogging Whether or not logging should be enabled for this service call
	 * @param timeout, in milliseconds. A negative value means no timeout.
	 * @return The service's response to this call
	 * @throws A TimeoutException if the call fails to return within the specified timeout.
	 * <!-- end-model-doc -->
	 * @model unique="false" exceptions="ca.gc.asc_csa.apogy.addons.ros.Exception" serviceNameUnique="false" requestUnique="false" enableLoggingUnique="false" timeoutUnique="false" RequestBounds="ca.gc.asc_csa.apogy.addons.ros.Message" ResponseBounds="ca.gc.asc_csa.apogy.addons.ros.Message"
	 * @generated
	 */
	<Request extends Message, Response extends Message> Response callService(String serviceName, Request request, boolean enableLogging, int timeout) throws Exception;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determines the service that corresponds to the given
	 * service name; if it exists, the call is made to the
	 * service and the corresponding response is returned.
	 * The enable logging value determines whether or not
	 * logging should be enabled for this service call.
	 * 
	 * @param serviceName The name of the service to call
	 * @param enableLogging Whether or not logging should be enabled for this service call
	 * @return The service's response to this call
	 * <!-- end-model-doc -->
	 * @model unique="false" serviceNameUnique="false" enableLoggingUnique="false" RequestBounds="ca.gc.asc_csa.apogy.addons.ros.Message" ResponseBounds="ca.gc.asc_csa.apogy.addons.ros.Message"
	 * @generated
	 */
	<Request extends Message, Response extends Message> Response callService(String serviceName, boolean enableLogging);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Launches the service manager and implicitly, launches
	 * all of the manager's associated services.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void launch();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Stops the service manager and implicitly, stops
	 * all of the manager's associated services.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void stop();

} // ROSServiceManager
