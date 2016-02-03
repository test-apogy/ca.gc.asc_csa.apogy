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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
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
 * <!-- end-model-doc -->
 * @see ca.gc.asc_csa.apogy.addons.ros.ApogyAddonsROSFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='ApogyAddonsROS' modelName='ApogyAddonsROS' operationReflection='true' childCreationExtenders='true' extensibleProviderFactory='true' multipleEditorPages='false' copyrightText='Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)' suppressGenModelAnnotations='false' modelDirectory='/ca.gc.asc_csa.apogy.addons.ros/src-generated' editDirectory='/ca.gc.asc_csa.apogy.addons.ros.edit/src-generated' basePackage='ca.gc.asc_csa.apogy.addons'"
 * @generated
 */
public interface ApogyAddonsROSPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ros";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ca.gc.asc_csa.apogy.addons.ros";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ros";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApogyAddonsROSPackage eINSTANCE = ca.gc.asc_csa.apogy.addons.ros.impl.ApogyAddonsROSPackageImpl.init();

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.addons.ros.impl.ROSNodeImpl <em>ROS Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.addons.ros.impl.ROSNodeImpl
	 * @see ca.gc.asc_csa.apogy.addons.ros.impl.ApogyAddonsROSPackageImpl#getROSNode()
	 * @generated
	 */
	int ROS_NODE = 0;

	/**
	 * The feature id for the '<em><b>Connected Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_NODE__CONNECTED_NODE = 0;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_NODE__MODULES = 1;

	/**
	 * The feature id for the '<em><b>Service Managers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_NODE__SERVICE_MANAGERS = 2;

	/**
	 * The feature id for the '<em><b>Topic Launchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_NODE__TOPIC_LAUNCHERS = 3;

	/**
	 * The feature id for the '<em><b>Publisher Managers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_NODE__PUBLISHER_MANAGERS = 4;

	/**
	 * The feature id for the '<em><b>Initialized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_NODE__INITIALIZED = 5;

	/**
	 * The feature id for the '<em><b>Connected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_NODE__CONNECTED = 6;

	/**
	 * The feature id for the '<em><b>Restarting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_NODE__RESTARTING = 7;

	/**
	 * The feature id for the '<em><b>Enable Auto Restart On Connection Lost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_NODE__ENABLE_AUTO_RESTART_ON_CONNECTION_LOST = 8;

	/**
	 * The feature id for the '<em><b>Node Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_NODE__NODE_NAME = 9;

	/**
	 * The feature id for the '<em><b>Response Logger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_NODE__RESPONSE_LOGGER = 10;

	/**
	 * The feature id for the '<em><b>Null Response Handler</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_NODE__NULL_RESPONSE_HANDLER = 11;

	/**
	 * The feature id for the '<em><b>Null Request Handler</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_NODE__NULL_REQUEST_HANDLER = 12;

	/**
	 * The number of structural features of the '<em>ROS Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_NODE_FEATURE_COUNT = 13;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_NODE___START = 0;

	/**
	 * The operation id for the '<em>Initialize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_NODE___INITIALIZE = 1;

	/**
	 * The operation id for the '<em>On Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_NODE___ON_START__CONNECTEDNODE = 2;

	/**
	 * The operation id for the '<em>Restart</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_NODE___RESTART = 3;

	/**
	 * The operation id for the '<em>Register</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_NODE___REGISTER__ROSINTERFACE_BOOLEAN = 4;

	/**
	 * The operation id for the '<em>Register</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_NODE___REGISTER__ROSINTERFACE = 5;

	/**
	 * The operation id for the '<em>New From Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_NODE___NEW_FROM_TYPE__STRING = 6;

	/**
	 * The operation id for the '<em>Shutdown</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_NODE___SHUTDOWN = 7;

	/**
	 * The operation id for the '<em>Create Publisher</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_NODE___CREATE_PUBLISHER__STRING_STRING = 8;

	/**
	 * The operation id for the '<em>Create Service Manager</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_NODE___CREATE_SERVICE_MANAGER = 9;

	/**
	 * The operation id for the '<em>Create Topic Launcher</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_NODE___CREATE_TOPIC_LAUNCHER = 10;

	/**
	 * The operation id for the '<em>Create Publisher Manager</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_NODE___CREATE_PUBLISHER_MANAGER = 11;

	/**
	 * The number of operations of the '<em>ROS Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_NODE_OPERATION_COUNT = 12;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.addons.ros.ROSInterface <em>ROS Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.addons.ros.ROSInterface
	 * @see ca.gc.asc_csa.apogy.addons.ros.impl.ApogyAddonsROSPackageImpl#getROSInterface()
	 * @generated
	 */
	int ROS_INTERFACE = 1;

	/**
	 * The feature id for the '<em><b>Service Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_INTERFACE__SERVICE_MANAGER = 0;

	/**
	 * The feature id for the '<em><b>Topic Launcher</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_INTERFACE__TOPIC_LAUNCHER = 1;

	/**
	 * The feature id for the '<em><b>Publisher Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_INTERFACE__PUBLISHER_MANAGER = 2;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_INTERFACE__NODE = 3;

	/**
	 * The number of structural features of the '<em>ROS Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_INTERFACE_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Ros Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_INTERFACE___ROS_INIT = 0;

	/**
	 * The number of operations of the '<em>ROS Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_INTERFACE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.addons.ros.impl.ROSPublisherManagerImpl <em>ROS Publisher Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.addons.ros.impl.ROSPublisherManagerImpl
	 * @see ca.gc.asc_csa.apogy.addons.ros.impl.ApogyAddonsROSPackageImpl#getROSPublisherManager()
	 * @generated
	 */
	int ROS_PUBLISHER_MANAGER = 2;

	/**
	 * The feature id for the '<em><b>Publishers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_PUBLISHER_MANAGER__PUBLISHERS = 0;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_PUBLISHER_MANAGER__NODE = 1;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_PUBLISHER_MANAGER__RUNNING = 2;

	/**
	 * The number of structural features of the '<em>ROS Publisher Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_PUBLISHER_MANAGER_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Create Publisher</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_PUBLISHER_MANAGER___CREATE_PUBLISHER__STRING_STRING = 0;

	/**
	 * The operation id for the '<em>Launch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_PUBLISHER_MANAGER___LAUNCH = 1;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_PUBLISHER_MANAGER___STOP = 2;

	/**
	 * The operation id for the '<em>Create Message</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_PUBLISHER_MANAGER___CREATE_MESSAGE__STRING = 3;

	/**
	 * The operation id for the '<em>Publish</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_PUBLISHER_MANAGER___PUBLISH__STRING_MESSAGE = 4;

	/**
	 * The operation id for the '<em>Get Publisher</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_PUBLISHER_MANAGER___GET_PUBLISHER__STRING = 5;

	/**
	 * The number of operations of the '<em>ROS Publisher Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_PUBLISHER_MANAGER_OPERATION_COUNT = 6;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.addons.ros.impl.ROSPublisherImpl <em>ROS Publisher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.addons.ros.impl.ROSPublisherImpl
	 * @see ca.gc.asc_csa.apogy.addons.ros.impl.ApogyAddonsROSPackageImpl#getROSPublisher()
	 * @generated
	 */
	int ROS_PUBLISHER = 3;

	/**
	 * The feature id for the '<em><b>Launched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_PUBLISHER__LAUNCHED = 0;

	/**
	 * The feature id for the '<em><b>Topic Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_PUBLISHER__TOPIC_NAME = 1;

	/**
	 * The feature id for the '<em><b>Message Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_PUBLISHER__MESSAGE_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Publisher</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_PUBLISHER__PUBLISHER = 3;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_PUBLISHER__NODE = 4;

	/**
	 * The number of structural features of the '<em>ROS Publisher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_PUBLISHER_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Launch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_PUBLISHER___LAUNCH__ROSNODE = 0;

	/**
	 * The operation id for the '<em>Publish</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_PUBLISHER___PUBLISH__MESSAGE = 1;

	/**
	 * The operation id for the '<em>New Message</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_PUBLISHER___NEW_MESSAGE = 2;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_PUBLISHER___STOP = 3;

	/**
	 * The number of operations of the '<em>ROS Publisher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_PUBLISHER_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.addons.ros.impl.ROSServiceManagerImpl <em>ROS Service Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.addons.ros.impl.ROSServiceManagerImpl
	 * @see ca.gc.asc_csa.apogy.addons.ros.impl.ApogyAddonsROSPackageImpl#getROSServiceManager()
	 * @generated
	 */
	int ROS_SERVICE_MANAGER = 4;

	/**
	 * The feature id for the '<em><b>Services</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SERVICE_MANAGER__SERVICES = 0;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SERVICE_MANAGER__NODE = 1;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SERVICE_MANAGER__RUNNING = 2;

	/**
	 * The number of structural features of the '<em>ROS Service Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SERVICE_MANAGER_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Create Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SERVICE_MANAGER___CREATE_SERVICE__STRING_STRING = 0;

	/**
	 * The operation id for the '<em>Create Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SERVICE_MANAGER___CREATE_SERVICE__STRING_STRING_BOOLEAN = 1;

	/**
	 * The operation id for the '<em>Get Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SERVICE_MANAGER___GET_SERVICE__STRING = 2;

	/**
	 * The operation id for the '<em>Create Request Message</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SERVICE_MANAGER___CREATE_REQUEST_MESSAGE__STRING = 3;

	/**
	 * The operation id for the '<em>Call Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SERVICE_MANAGER___CALL_SERVICE__STRING_MESSAGE = 4;

	/**
	 * The operation id for the '<em>Call Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SERVICE_MANAGER___CALL_SERVICE__STRING = 5;

	/**
	 * The operation id for the '<em>Call Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SERVICE_MANAGER___CALL_SERVICE__STRING_MESSAGE_BOOLEAN = 6;

	/**
	 * The operation id for the '<em>Call Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SERVICE_MANAGER___CALL_SERVICE__STRING_BOOLEAN = 7;

	/**
	 * The operation id for the '<em>Launch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SERVICE_MANAGER___LAUNCH = 8;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SERVICE_MANAGER___STOP = 9;

	/**
	 * The number of operations of the '<em>ROS Service Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SERVICE_MANAGER_OPERATION_COUNT = 10;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.addons.ros.impl.ROSServiceImpl <em>ROS Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.addons.ros.impl.ROSServiceImpl
	 * @see ca.gc.asc_csa.apogy.addons.ros.impl.ApogyAddonsROSPackageImpl#getROSService()
	 * @generated
	 */
	int ROS_SERVICE = 5;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SERVICE__SERVICE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Service Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SERVICE__SERVICE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Launched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SERVICE__LAUNCHED = 2;

	/**
	 * The feature id for the '<em><b>Service Client</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SERVICE__SERVICE_CLIENT = 3;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SERVICE__NODE = 4;

	/**
	 * The feature id for the '<em><b>Disconnect On Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SERVICE__DISCONNECT_ON_TIMEOUT = 5;

	/**
	 * The number of structural features of the '<em>ROS Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SERVICE_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Launch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SERVICE___LAUNCH__ROSNODE = 0;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SERVICE___STOP = 1;

	/**
	 * The operation id for the '<em>New Request Message</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SERVICE___NEW_REQUEST_MESSAGE = 2;

	/**
	 * The operation id for the '<em>Call</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SERVICE___CALL__MESSAGE = 3;

	/**
	 * The operation id for the '<em>Call</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SERVICE___CALL__MESSAGE_BOOLEAN = 4;

	/**
	 * The number of operations of the '<em>ROS Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SERVICE_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.addons.ros.impl.ROSTopicLauncherImpl <em>ROS Topic Launcher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.addons.ros.impl.ROSTopicLauncherImpl
	 * @see ca.gc.asc_csa.apogy.addons.ros.impl.ApogyAddonsROSPackageImpl#getROSTopicLauncher()
	 * @generated
	 */
	int ROS_TOPIC_LAUNCHER = 6;

	/**
	 * The feature id for the '<em><b>Listener List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_TOPIC_LAUNCHER__LISTENER_LIST = 0;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_TOPIC_LAUNCHER__NODE = 1;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_TOPIC_LAUNCHER__RUNNING = 2;

	/**
	 * The number of structural features of the '<em>ROS Topic Launcher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_TOPIC_LAUNCHER_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Create Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_TOPIC_LAUNCHER___CREATE_LISTENER__STRING_STRING_MESSAGELISTENER = 0;

	/**
	 * The operation id for the '<em>Launch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_TOPIC_LAUNCHER___LAUNCH = 1;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_TOPIC_LAUNCHER___STOP = 2;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_TOPIC_LAUNCHER___RESET = 3;

	/**
	 * The number of operations of the '<em>ROS Topic Launcher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_TOPIC_LAUNCHER_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.addons.ros.impl.ROSListenerImpl <em>ROS Listener</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.addons.ros.impl.ROSListenerImpl
	 * @see ca.gc.asc_csa.apogy.addons.ros.impl.ApogyAddonsROSPackageImpl#getROSListener()
	 * @generated
	 */
	int ROS_LISTENER = 7;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_LISTENER__RUNNING = 0;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_LISTENER__NODE = 1;

	/**
	 * The feature id for the '<em><b>Ros Subscriber</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_LISTENER__ROS_SUBSCRIBER = 2;

	/**
	 * The feature id for the '<em><b>Topic Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_LISTENER__TOPIC_NAME = 3;

	/**
	 * The feature id for the '<em><b>Message Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_LISTENER__MESSAGE_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Message Listener</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_LISTENER__MESSAGE_LISTENER = 5;

	/**
	 * The number of structural features of the '<em>ROS Listener</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_LISTENER_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Start With Locks</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_LISTENER___START_WITH_LOCKS__ROSNODE = 0;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_LISTENER___START__ROSNODE = 1;

	/**
	 * The operation id for the '<em>Connect Subscriber</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_LISTENER___CONNECT_SUBSCRIBER__CONNECTEDNODE = 2;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_LISTENER___STOP = 3;

	/**
	 * The number of operations of the '<em>ROS Listener</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_LISTENER_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.addons.ros.impl.ApogyAddonsROSFacadeImpl <em>Facade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.addons.ros.impl.ApogyAddonsROSFacadeImpl
	 * @see ca.gc.asc_csa.apogy.addons.ros.impl.ApogyAddonsROSPackageImpl#getApogyAddonsROSFacade()
	 * @generated
	 */
	int APOGY_ADDONS_ROS_FACADE = 8;

	/**
	 * The number of structural features of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_ADDONS_ROS_FACADE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Node Name Prefix</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_ADDONS_ROS_FACADE___GET_NODE_NAME_PREFIX = 0;

	/**
	 * The operation id for the '<em>Get ROS Master URI</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_ADDONS_ROS_FACADE___GET_ROS_MASTER_URI = 1;

	/**
	 * The operation id for the '<em>Get ROS Hostname</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_ADDONS_ROS_FACADE___GET_ROS_HOSTNAME = 2;

	/**
	 * The operation id for the '<em>Get ROS Ip</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_ADDONS_ROS_FACADE___GET_ROS_IP = 3;

	/**
	 * The number of operations of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_ADDONS_ROS_FACADE_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '<em>Response Logger</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.addons.ros.utilities.ResponseLogger
	 * @see ca.gc.asc_csa.apogy.addons.ros.impl.ApogyAddonsROSPackageImpl#getResponseLogger()
	 * @generated
	 */
	int RESPONSE_LOGGER = 9;

	/**
	 * The meta object id for the '<em>Null Response Handler</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.addons.ros.utilities.NullResponseHandler
	 * @see ca.gc.asc_csa.apogy.addons.ros.impl.ApogyAddonsROSPackageImpl#getNullResponseHandler()
	 * @generated
	 */
	int NULL_RESPONSE_HANDLER = 10;

	/**
	 * The meta object id for the '<em>Null Request Handler</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.addons.ros.utilities.NullRequestHandler
	 * @see ca.gc.asc_csa.apogy.addons.ros.impl.ApogyAddonsROSPackageImpl#getNullRequestHandler()
	 * @generated
	 */
	int NULL_REQUEST_HANDLER = 11;

	/**
	 * The meta object id for the '<em>Connected Node</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ros.node.ConnectedNode
	 * @see ca.gc.asc_csa.apogy.addons.ros.impl.ApogyAddonsROSPackageImpl#getConnectedNode()
	 * @generated
	 */
	int CONNECTED_NODE = 12;

	/**
	 * The meta object id for the '<em>Service Not Found Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ros.exception.ServiceNotFoundException
	 * @see ca.gc.asc_csa.apogy.addons.ros.impl.ApogyAddonsROSPackageImpl#getServiceNotFoundException()
	 * @generated
	 */
	int SERVICE_NOT_FOUND_EXCEPTION = 13;

	/**
	 * The meta object id for the '<em>Message</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ros.internal.message.Message
	 * @see ca.gc.asc_csa.apogy.addons.ros.impl.ApogyAddonsROSPackageImpl#getMessage()
	 * @generated
	 */
	int MESSAGE = 14;

	/**
	 * The meta object id for the '<em>Message Listener</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ros.message.MessageListener
	 * @see ca.gc.asc_csa.apogy.addons.ros.impl.ApogyAddonsROSPackageImpl#getMessageListener()
	 * @generated
	 */
	int MESSAGE_LISTENER = 15;

	/**
	 * The meta object id for the '<em>Abstract Node Main</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ros.node.AbstractNodeMain
	 * @see ca.gc.asc_csa.apogy.addons.ros.impl.ApogyAddonsROSPackageImpl#getAbstractNodeMain()
	 * @generated
	 */
	int ABSTRACT_NODE_MAIN = 16;

	/**
	 * The meta object id for the '<em>Service Client</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ros.node.service.ServiceClient
	 * @see ca.gc.asc_csa.apogy.addons.ros.impl.ApogyAddonsROSPackageImpl#getServiceClient()
	 * @generated
	 */
	int SERVICE_CLIENT = 17;

	/**
	 * The meta object id for the '<em>Publisher</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ros.node.topic.Publisher
	 * @see ca.gc.asc_csa.apogy.addons.ros.impl.ApogyAddonsROSPackageImpl#getPublisher()
	 * @generated
	 */
	int PUBLISHER = 18;

	/**
	 * The meta object id for the '<em>Subscriber</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ros.node.topic.Subscriber
	 * @see ca.gc.asc_csa.apogy.addons.ros.impl.ApogyAddonsROSPackageImpl#getSubscriber()
	 * @generated
	 */
	int SUBSCRIBER = 19;

	/**
	 * The meta object id for the '<em>Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Exception
	 * @see ca.gc.asc_csa.apogy.addons.ros.impl.ApogyAddonsROSPackageImpl#getException()
	 * @generated
	 */
	int EXCEPTION = 20;

	/**
	 * The meta object id for the '<em>Hash Map</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.HashMap
	 * @see ca.gc.asc_csa.apogy.addons.ros.impl.ApogyAddonsROSPackageImpl#getHashMap()
	 * @generated
	 */
	int HASH_MAP = 21;


	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.addons.ros.ROSNode <em>ROS Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ROS Node</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ROSNode
	 * @generated
	 */
	EClass getROSNode();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.ros.ROSNode#getConnectedNode <em>Connected Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connected Node</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ROSNode#getConnectedNode()
	 * @see #getROSNode()
	 * @generated
	 */
	EAttribute getROSNode_ConnectedNode();

	/**
	 * Returns the meta object for the reference list '{@link ca.gc.asc_csa.apogy.addons.ros.ROSNode#getModules <em>Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Modules</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ROSNode#getModules()
	 * @see #getROSNode()
	 * @generated
	 */
	EReference getROSNode_Modules();

	/**
	 * Returns the meta object for the reference list '{@link ca.gc.asc_csa.apogy.addons.ros.ROSNode#getServiceManagers <em>Service Managers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Service Managers</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ROSNode#getServiceManagers()
	 * @see #getROSNode()
	 * @generated
	 */
	EReference getROSNode_ServiceManagers();

	/**
	 * Returns the meta object for the reference list '{@link ca.gc.asc_csa.apogy.addons.ros.ROSNode#getTopicLaunchers <em>Topic Launchers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Topic Launchers</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ROSNode#getTopicLaunchers()
	 * @see #getROSNode()
	 * @generated
	 */
	EReference getROSNode_TopicLaunchers();

	/**
	 * Returns the meta object for the reference list '{@link ca.gc.asc_csa.apogy.addons.ros.ROSNode#getPublisherManagers <em>Publisher Managers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Publisher Managers</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ROSNode#getPublisherManagers()
	 * @see #getROSNode()
	 * @generated
	 */
	EReference getROSNode_PublisherManagers();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.ros.ROSNode#isInitialized <em>Initialized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initialized</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ROSNode#isInitialized()
	 * @see #getROSNode()
	 * @generated
	 */
	EAttribute getROSNode_Initialized();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.ros.ROSNode#isConnected <em>Connected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connected</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ROSNode#isConnected()
	 * @see #getROSNode()
	 * @generated
	 */
	EAttribute getROSNode_Connected();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.ros.ROSNode#isRestarting <em>Restarting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Restarting</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ROSNode#isRestarting()
	 * @see #getROSNode()
	 * @generated
	 */
	EAttribute getROSNode_Restarting();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.ros.ROSNode#isEnableAutoRestartOnConnectionLost <em>Enable Auto Restart On Connection Lost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable Auto Restart On Connection Lost</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ROSNode#isEnableAutoRestartOnConnectionLost()
	 * @see #getROSNode()
	 * @generated
	 */
	EAttribute getROSNode_EnableAutoRestartOnConnectionLost();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.ros.ROSNode#getNodeName <em>Node Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node Name</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ROSNode#getNodeName()
	 * @see #getROSNode()
	 * @generated
	 */
	EAttribute getROSNode_NodeName();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.ros.ROSNode#getResponseLogger <em>Response Logger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Response Logger</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ROSNode#getResponseLogger()
	 * @see #getROSNode()
	 * @generated
	 */
	EAttribute getROSNode_ResponseLogger();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.ros.ROSNode#getNullResponseHandler <em>Null Response Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Response Handler</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ROSNode#getNullResponseHandler()
	 * @see #getROSNode()
	 * @generated
	 */
	EAttribute getROSNode_NullResponseHandler();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.ros.ROSNode#getNullRequestHandler <em>Null Request Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Request Handler</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ROSNode#getNullRequestHandler()
	 * @see #getROSNode()
	 * @generated
	 */
	EAttribute getROSNode_NullRequestHandler();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.ros.ROSNode#start() <em>Start</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Start</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ROSNode#start()
	 * @generated
	 */
	EOperation getROSNode__Start();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.ros.ROSNode#initialize() <em>Initialize</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Initialize</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ROSNode#initialize()
	 * @generated
	 */
	EOperation getROSNode__Initialize();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.ros.ROSNode#onStart(org.ros.node.ConnectedNode) <em>On Start</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>On Start</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ROSNode#onStart(org.ros.node.ConnectedNode)
	 * @generated
	 */
	EOperation getROSNode__OnStart__ConnectedNode();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.ros.ROSNode#restart() <em>Restart</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Restart</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ROSNode#restart()
	 * @generated
	 */
	EOperation getROSNode__Restart();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.ros.ROSNode#register(ca.gc.asc_csa.apogy.addons.ros.ROSInterface, boolean) <em>Register</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ROSNode#register(ca.gc.asc_csa.apogy.addons.ros.ROSInterface, boolean)
	 * @generated
	 */
	EOperation getROSNode__Register__ROSInterface_boolean();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.ros.ROSNode#register(ca.gc.asc_csa.apogy.addons.ros.ROSInterface) <em>Register</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ROSNode#register(ca.gc.asc_csa.apogy.addons.ros.ROSInterface)
	 * @generated
	 */
	EOperation getROSNode__Register__ROSInterface();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.ros.ROSNode#newFromType(java.lang.String) <em>New From Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New From Type</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ROSNode#newFromType(java.lang.String)
	 * @generated
	 */
	EOperation getROSNode__NewFromType__String();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.ros.ROSNode#shutdown() <em>Shutdown</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Shutdown</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ROSNode#shutdown()
	 * @generated
	 */
	EOperation getROSNode__Shutdown();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.ros.ROSNode#createPublisher(java.lang.String, java.lang.String) <em>Create Publisher</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Publisher</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ROSNode#createPublisher(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getROSNode__CreatePublisher__String_String();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.ros.ROSNode#createServiceManager() <em>Create Service Manager</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Service Manager</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ROSNode#createServiceManager()
	 * @generated
	 */
	EOperation getROSNode__CreateServiceManager();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.ros.ROSNode#createTopicLauncher() <em>Create Topic Launcher</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Topic Launcher</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ROSNode#createTopicLauncher()
	 * @generated
	 */
	EOperation getROSNode__CreateTopicLauncher();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.ros.ROSNode#createPublisherManager() <em>Create Publisher Manager</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Publisher Manager</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ROSNode#createPublisherManager()
	 * @generated
	 */
	EOperation getROSNode__CreatePublisherManager();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.addons.ros.ROSInterface <em>ROS Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ROS Interface</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ROSInterface
	 * @generated
	 */
	EClass getROSInterface();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.addons.ros.ROSInterface#getServiceManager <em>Service Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service Manager</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ROSInterface#getServiceManager()
	 * @see #getROSInterface()
	 * @generated
	 */
	EReference getROSInterface_ServiceManager();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.addons.ros.ROSInterface#getTopicLauncher <em>Topic Launcher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Topic Launcher</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ROSInterface#getTopicLauncher()
	 * @see #getROSInterface()
	 * @generated
	 */
	EReference getROSInterface_TopicLauncher();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.addons.ros.ROSInterface#getPublisherManager <em>Publisher Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Publisher Manager</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ROSInterface#getPublisherManager()
	 * @see #getROSInterface()
	 * @generated
	 */
	EReference getROSInterface_PublisherManager();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.addons.ros.ROSInterface#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Node</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ROSInterface#getNode()
	 * @see #getROSInterface()
	 * @generated
	 */
	EReference getROSInterface_Node();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.ros.ROSInterface#rosInit() <em>Ros Init</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Ros Init</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ROSInterface#rosInit()
	 * @generated
	 */
	EOperation getROSInterface__RosInit();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.addons.ros.ROSPublisherManager <em>ROS Publisher Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ROS Publisher Manager</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ROSPublisherManager
	 * @generated
	 */
	EClass getROSPublisherManager();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.ros.ROSPublisherManager#getPublishers <em>Publishers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Publishers</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ROSPublisherManager#getPublishers()
	 * @see #getROSPublisherManager()
	 * @generated
	 */
	EAttribute getROSPublisherManager_Publishers();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.addons.ros.ROSPublisherManager#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Node</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ROSPublisherManager#getNode()
	 * @see #getROSPublisherManager()
	 * @generated
	 */
	EReference getROSPublisherManager_Node();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.ros.ROSPublisherManager#isRunning <em>Running</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Running</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ROSPublisherManager#isRunning()
	 * @see #getROSPublisherManager()
	 * @generated
	 */
	EAttribute getROSPublisherManager_Running();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.ros.ROSPublisherManager#createPublisher(java.lang.String, java.lang.String) <em>Create Publisher</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Publisher</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ROSPublisherManager#createPublisher(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getROSPublisherManager__CreatePublisher__String_String();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.ros.ROSPublisherManager#launch() <em>Launch</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Launch</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ROSPublisherManager#launch()
	 * @generated
	 */
	EOperation getROSPublisherManager__Launch();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.ros.ROSPublisherManager#stop() <em>Stop</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Stop</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ROSPublisherManager#stop()
	 * @generated
	 */
	EOperation getROSPublisherManager__Stop();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.ros.ROSPublisherManager#createMessage(java.lang.String) <em>Create Message</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Message</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ROSPublisherManager#createMessage(java.lang.String)
	 * @generated
	 */
	EOperation getROSPublisherManager__CreateMessage__String();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.ros.ROSPublisherManager#publish(java.lang.String, org.ros.internal.message.Message) <em>Publish</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Publish</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ROSPublisherManager#publish(java.lang.String, org.ros.internal.message.Message)
	 * @generated
	 */
	EOperation getROSPublisherManager__Publish__String_Message();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.ros.ROSPublisherManager#getPublisher(java.lang.String) <em>Get Publisher</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Publisher</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ROSPublisherManager#getPublisher(java.lang.String)
	 * @generated
	 */
	EOperation getROSPublisherManager__GetPublisher__String();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.addons.ros.ROSPublisher <em>ROS Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ROS Publisher</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ROSPublisher
	 * @generated
	 */
	EClass getROSPublisher();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.ros.ROSPublisher#isLaunched <em>Launched</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Launched</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ROSPublisher#isLaunched()
	 * @see #getROSPublisher()
	 * @generated
	 */
	EAttribute getROSPublisher_Launched();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.ros.ROSPublisher#getTopicName <em>Topic Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Topic Name</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ROSPublisher#getTopicName()
	 * @see #getROSPublisher()
	 * @generated
	 */
	EAttribute getROSPublisher_TopicName();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.ros.ROSPublisher#getMessageType <em>Message Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Type</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ROSPublisher#getMessageType()
	 * @see #getROSPublisher()
	 * @generated
	 */
	EAttribute getROSPublisher_MessageType();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.ros.ROSPublisher#getPublisher <em>Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Publisher</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ROSPublisher#getPublisher()
	 * @see #getROSPublisher()
	 * @generated
	 */
	EAttribute getROSPublisher_Publisher();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.addons.ros.ROSPublisher#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Node</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ROSPublisher#getNode()
	 * @see #getROSPublisher()
	 * @generated
	 */
	EReference getROSPublisher_Node();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.ros.ROSPublisher#launch(ca.gc.asc_csa.apogy.addons.ros.ROSNode) <em>Launch</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Launch</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ROSPublisher#launch(ca.gc.asc_csa.apogy.addons.ros.ROSNode)
	 * @generated
	 */
	EOperation getROSPublisher__Launch__ROSNode();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.ros.ROSPublisher#publish(org.ros.internal.message.Message) <em>Publish</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Publish</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ROSPublisher#publish(org.ros.internal.message.Message)
	 * @generated
	 */
	EOperation getROSPublisher__Publish__Message();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.ros.ROSPublisher#newMessage() <em>New Message</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New Message</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ROSPublisher#newMessage()
	 * @generated
	 */
	EOperation getROSPublisher__NewMessage();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.ros.ROSPublisher#stop() <em>Stop</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Stop</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ROSPublisher#stop()
	 * @generated
	 */
	EOperation getROSPublisher__Stop();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.addons.ros.ROSServiceManager <em>ROS Service Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ROS Service Manager</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ROSServiceManager
	 * @generated
	 */
	EClass getROSServiceManager();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.ros.ROSServiceManager#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Services</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ROSServiceManager#getServices()
	 * @see #getROSServiceManager()
	 * @generated
	 */
	EAttribute getROSServiceManager_Services();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.addons.ros.ROSServiceManager#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Node</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ROSServiceManager#getNode()
	 * @see #getROSServiceManager()
	 * @generated
	 */
	EReference getROSServiceManager_Node();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.ros.ROSServiceManager#isRunning <em>Running</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Running</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ROSServiceManager#isRunning()
	 * @see #getROSServiceManager()
	 * @generated
	 */
	EAttribute getROSServiceManager_Running();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.ros.ROSServiceManager#createService(java.lang.String, java.lang.String) <em>Create Service</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Service</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ROSServiceManager#createService(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getROSServiceManager__CreateService__String_String();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.ros.ROSServiceManager#createService(java.lang.String, java.lang.String, boolean) <em>Create Service</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Service</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ROSServiceManager#createService(java.lang.String, java.lang.String, boolean)
	 * @generated
	 */
	EOperation getROSServiceManager__CreateService__String_String_boolean();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.ros.ROSServiceManager#getService(java.lang.String) <em>Get Service</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Service</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ROSServiceManager#getService(java.lang.String)
	 * @generated
	 */
	EOperation getROSServiceManager__GetService__String();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.ros.ROSServiceManager#createRequestMessage(java.lang.String) <em>Create Request Message</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Request Message</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ROSServiceManager#createRequestMessage(java.lang.String)
	 * @generated
	 */
	EOperation getROSServiceManager__CreateRequestMessage__String();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.ros.ROSServiceManager#callService(java.lang.String, org.ros.internal.message.Message) <em>Call Service</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Call Service</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ROSServiceManager#callService(java.lang.String, org.ros.internal.message.Message)
	 * @generated
	 */
	EOperation getROSServiceManager__CallService__String_Message();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.ros.ROSServiceManager#callService(java.lang.String) <em>Call Service</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Call Service</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ROSServiceManager#callService(java.lang.String)
	 * @generated
	 */
	EOperation getROSServiceManager__CallService__String();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.ros.ROSServiceManager#callService(java.lang.String, org.ros.internal.message.Message, boolean) <em>Call Service</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Call Service</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ROSServiceManager#callService(java.lang.String, org.ros.internal.message.Message, boolean)
	 * @generated
	 */
	EOperation getROSServiceManager__CallService__String_Message_boolean();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.ros.ROSServiceManager#callService(java.lang.String, boolean) <em>Call Service</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Call Service</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ROSServiceManager#callService(java.lang.String, boolean)
	 * @generated
	 */
	EOperation getROSServiceManager__CallService__String_boolean();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.ros.ROSServiceManager#launch() <em>Launch</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Launch</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ROSServiceManager#launch()
	 * @generated
	 */
	EOperation getROSServiceManager__Launch();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.ros.ROSServiceManager#stop() <em>Stop</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Stop</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ROSServiceManager#stop()
	 * @generated
	 */
	EOperation getROSServiceManager__Stop();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.addons.ros.ROSService <em>ROS Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ROS Service</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ROSService
	 * @generated
	 */
	EClass getROSService();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.ros.ROSService#getServiceName <em>Service Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Name</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ROSService#getServiceName()
	 * @see #getROSService()
	 * @generated
	 */
	EAttribute getROSService_ServiceName();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.ros.ROSService#getServiceType <em>Service Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Type</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ROSService#getServiceType()
	 * @see #getROSService()
	 * @generated
	 */
	EAttribute getROSService_ServiceType();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.ros.ROSService#isLaunched <em>Launched</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Launched</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ROSService#isLaunched()
	 * @see #getROSService()
	 * @generated
	 */
	EAttribute getROSService_Launched();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.ros.ROSService#getServiceClient <em>Service Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Client</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ROSService#getServiceClient()
	 * @see #getROSService()
	 * @generated
	 */
	EAttribute getROSService_ServiceClient();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.addons.ros.ROSService#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Node</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ROSService#getNode()
	 * @see #getROSService()
	 * @generated
	 */
	EReference getROSService_Node();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.ros.ROSService#isDisconnectOnTimeout <em>Disconnect On Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disconnect On Timeout</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ROSService#isDisconnectOnTimeout()
	 * @see #getROSService()
	 * @generated
	 */
	EAttribute getROSService_DisconnectOnTimeout();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.ros.ROSService#launch(ca.gc.asc_csa.apogy.addons.ros.ROSNode) <em>Launch</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Launch</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ROSService#launch(ca.gc.asc_csa.apogy.addons.ros.ROSNode)
	 * @generated
	 */
	EOperation getROSService__Launch__ROSNode();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.ros.ROSService#stop() <em>Stop</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Stop</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ROSService#stop()
	 * @generated
	 */
	EOperation getROSService__Stop();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.ros.ROSService#newRequestMessage() <em>New Request Message</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New Request Message</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ROSService#newRequestMessage()
	 * @generated
	 */
	EOperation getROSService__NewRequestMessage();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.ros.ROSService#call(org.ros.internal.message.Message) <em>Call</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Call</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ROSService#call(org.ros.internal.message.Message)
	 * @generated
	 */
	EOperation getROSService__Call__Message();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.ros.ROSService#call(org.ros.internal.message.Message, boolean) <em>Call</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Call</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ROSService#call(org.ros.internal.message.Message, boolean)
	 * @generated
	 */
	EOperation getROSService__Call__Message_boolean();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.addons.ros.ROSTopicLauncher <em>ROS Topic Launcher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ROS Topic Launcher</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ROSTopicLauncher
	 * @generated
	 */
	EClass getROSTopicLauncher();

	/**
	 * Returns the meta object for the reference list '{@link ca.gc.asc_csa.apogy.addons.ros.ROSTopicLauncher#getListenerList <em>Listener List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Listener List</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ROSTopicLauncher#getListenerList()
	 * @see #getROSTopicLauncher()
	 * @generated
	 */
	EReference getROSTopicLauncher_ListenerList();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.addons.ros.ROSTopicLauncher#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Node</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ROSTopicLauncher#getNode()
	 * @see #getROSTopicLauncher()
	 * @generated
	 */
	EReference getROSTopicLauncher_Node();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.ros.ROSTopicLauncher#isRunning <em>Running</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Running</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ROSTopicLauncher#isRunning()
	 * @see #getROSTopicLauncher()
	 * @generated
	 */
	EAttribute getROSTopicLauncher_Running();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.ros.ROSTopicLauncher#createListener(java.lang.String, java.lang.String, org.ros.message.MessageListener) <em>Create Listener</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Listener</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ROSTopicLauncher#createListener(java.lang.String, java.lang.String, org.ros.message.MessageListener)
	 * @generated
	 */
	EOperation getROSTopicLauncher__CreateListener__String_String_MessageListener();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.ros.ROSTopicLauncher#launch() <em>Launch</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Launch</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ROSTopicLauncher#launch()
	 * @generated
	 */
	EOperation getROSTopicLauncher__Launch();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.ros.ROSTopicLauncher#stop() <em>Stop</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Stop</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ROSTopicLauncher#stop()
	 * @generated
	 */
	EOperation getROSTopicLauncher__Stop();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.ros.ROSTopicLauncher#reset() <em>Reset</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Reset</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ROSTopicLauncher#reset()
	 * @generated
	 */
	EOperation getROSTopicLauncher__Reset();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.addons.ros.ROSListener <em>ROS Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ROS Listener</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ROSListener
	 * @generated
	 */
	EClass getROSListener();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.ros.ROSListener#isRunning <em>Running</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Running</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ROSListener#isRunning()
	 * @see #getROSListener()
	 * @generated
	 */
	EAttribute getROSListener_Running();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.addons.ros.ROSListener#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Node</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ROSListener#getNode()
	 * @see #getROSListener()
	 * @generated
	 */
	EReference getROSListener_Node();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.ros.ROSListener#getRosSubscriber <em>Ros Subscriber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ros Subscriber</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ROSListener#getRosSubscriber()
	 * @see #getROSListener()
	 * @generated
	 */
	EAttribute getROSListener_RosSubscriber();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.ros.ROSListener#getTopicName <em>Topic Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Topic Name</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ROSListener#getTopicName()
	 * @see #getROSListener()
	 * @generated
	 */
	EAttribute getROSListener_TopicName();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.ros.ROSListener#getMessageType <em>Message Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Type</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ROSListener#getMessageType()
	 * @see #getROSListener()
	 * @generated
	 */
	EAttribute getROSListener_MessageType();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.ros.ROSListener#getMessageListener <em>Message Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Listener</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ROSListener#getMessageListener()
	 * @see #getROSListener()
	 * @generated
	 */
	EAttribute getROSListener_MessageListener();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.ros.ROSListener#startWithLocks(ca.gc.asc_csa.apogy.addons.ros.ROSNode) <em>Start With Locks</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Start With Locks</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ROSListener#startWithLocks(ca.gc.asc_csa.apogy.addons.ros.ROSNode)
	 * @generated
	 */
	EOperation getROSListener__StartWithLocks__ROSNode();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.ros.ROSListener#start(ca.gc.asc_csa.apogy.addons.ros.ROSNode) <em>Start</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Start</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ROSListener#start(ca.gc.asc_csa.apogy.addons.ros.ROSNode)
	 * @generated
	 */
	EOperation getROSListener__Start__ROSNode();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.ros.ROSListener#connectSubscriber(org.ros.node.ConnectedNode) <em>Connect Subscriber</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Connect Subscriber</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ROSListener#connectSubscriber(org.ros.node.ConnectedNode)
	 * @generated
	 */
	EOperation getROSListener__ConnectSubscriber__ConnectedNode();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.ros.ROSListener#stop() <em>Stop</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Stop</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ROSListener#stop()
	 * @generated
	 */
	EOperation getROSListener__Stop();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.addons.ros.ApogyAddonsROSFacade <em>Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facade</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ApogyAddonsROSFacade
	 * @generated
	 */
	EClass getApogyAddonsROSFacade();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.ros.ApogyAddonsROSFacade#getNodeNamePrefix() <em>Get Node Name Prefix</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Node Name Prefix</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ApogyAddonsROSFacade#getNodeNamePrefix()
	 * @generated
	 */
	EOperation getApogyAddonsROSFacade__GetNodeNamePrefix();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.ros.ApogyAddonsROSFacade#getROSMasterURI() <em>Get ROS Master URI</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get ROS Master URI</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ApogyAddonsROSFacade#getROSMasterURI()
	 * @generated
	 */
	EOperation getApogyAddonsROSFacade__GetROSMasterURI();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.ros.ApogyAddonsROSFacade#getROSHostname() <em>Get ROS Hostname</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get ROS Hostname</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ApogyAddonsROSFacade#getROSHostname()
	 * @generated
	 */
	EOperation getApogyAddonsROSFacade__GetROSHostname();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.ros.ApogyAddonsROSFacade#getROSIp() <em>Get ROS Ip</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get ROS Ip</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ApogyAddonsROSFacade#getROSIp()
	 * @generated
	 */
	EOperation getApogyAddonsROSFacade__GetROSIp();

	/**
	 * Returns the meta object for data type '{@link ca.gc.asc_csa.apogy.addons.ros.utilities.ResponseLogger <em>Response Logger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Response Logger</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.ros.utilities.ResponseLogger
	 * @model instanceClass="ca.gc.asc_csa.apogy.addons.ros.utilities.ResponseLogger"
	 * @generated
	 */
	EDataType getResponseLogger();

	/**
	 * Returns the meta object for data type '{@link ca.gc.asc_csa.apogy.addons.ros.utilities.NullResponseHandler <em>Null Response Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Null Response Handler</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.ros.utilities.NullResponseHandler
	 * @model instanceClass="ca.gc.asc_csa.apogy.addons.ros.utilities.NullResponseHandler"
	 * @generated
	 */
	EDataType getNullResponseHandler();

	/**
	 * Returns the meta object for data type '{@link ca.gc.asc_csa.apogy.addons.ros.utilities.NullRequestHandler <em>Null Request Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Null Request Handler</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.ros.utilities.NullRequestHandler
	 * @model instanceClass="ca.gc.asc_csa.apogy.addons.ros.utilities.NullRequestHandler"
	 * @generated
	 */
	EDataType getNullRequestHandler();

	/**
	 * Returns the meta object for data type '{@link org.ros.node.ConnectedNode <em>Connected Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Connected Node</em>'.
	 * @see org.ros.node.ConnectedNode
	 * @model instanceClass="org.ros.node.ConnectedNode"
	 * @generated
	 */
	EDataType getConnectedNode();

	/**
	 * Returns the meta object for data type '{@link org.ros.exception.ServiceNotFoundException <em>Service Not Found Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Service Not Found Exception</em>'.
	 * @see org.ros.exception.ServiceNotFoundException
	 * @model instanceClass="org.ros.exception.ServiceNotFoundException"
	 * @generated
	 */
	EDataType getServiceNotFoundException();

	/**
	 * Returns the meta object for data type '{@link org.ros.internal.message.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Message</em>'.
	 * @see org.ros.internal.message.Message
	 * @model instanceClass="org.ros.internal.message.Message"
	 * @generated
	 */
	EDataType getMessage();

	/**
	 * Returns the meta object for data type '{@link org.ros.message.MessageListener <em>Message Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Message Listener</em>'.
	 * @see org.ros.message.MessageListener
	 * @model instanceClass="org.ros.message.MessageListener" typeParameters="T"
	 * @generated
	 */
	EDataType getMessageListener();

	/**
	 * Returns the meta object for data type '{@link org.ros.node.AbstractNodeMain <em>Abstract Node Main</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Abstract Node Main</em>'.
	 * @see org.ros.node.AbstractNodeMain
	 * @model instanceClass="org.ros.node.AbstractNodeMain"
	 * @generated
	 */
	EDataType getAbstractNodeMain();

	/**
	 * Returns the meta object for data type '{@link org.ros.node.service.ServiceClient <em>Service Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Service Client</em>'.
	 * @see org.ros.node.service.ServiceClient
	 * @model instanceClass="org.ros.node.service.ServiceClient" typeParameters="Request Response"
	 * @generated
	 */
	EDataType getServiceClient();

	/**
	 * Returns the meta object for data type '{@link org.ros.node.topic.Publisher <em>Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Publisher</em>'.
	 * @see org.ros.node.topic.Publisher
	 * @model instanceClass="org.ros.node.topic.Publisher" typeParameters="T"
	 * @generated
	 */
	EDataType getPublisher();

	/**
	 * Returns the meta object for data type '{@link org.ros.node.topic.Subscriber <em>Subscriber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Subscriber</em>'.
	 * @see org.ros.node.topic.Subscriber
	 * @model instanceClass="org.ros.node.topic.Subscriber" typeParameters="T"
	 * @generated
	 */
	EDataType getSubscriber();

	/**
	 * Returns the meta object for data type '{@link java.lang.Exception <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Exception</em>'.
	 * @see java.lang.Exception
	 * @model instanceClass="java.lang.Exception"
	 * @generated
	 */
	EDataType getException();

	/**
	 * Returns the meta object for data type '{@link java.util.HashMap <em>Hash Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Hash Map</em>'.
	 * @see java.util.HashMap
	 * @model instanceClass="java.util.HashMap" typeParameters="Key Value"
	 * @generated
	 */
	EDataType getHashMap();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ApogyAddonsROSFactory getApogyAddonsROSFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.addons.ros.impl.ROSNodeImpl <em>ROS Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.addons.ros.impl.ROSNodeImpl
		 * @see ca.gc.asc_csa.apogy.addons.ros.impl.ApogyAddonsROSPackageImpl#getROSNode()
		 * @generated
		 */
		EClass ROS_NODE = eINSTANCE.getROSNode();

		/**
		 * The meta object literal for the '<em><b>Connected Node</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROS_NODE__CONNECTED_NODE = eINSTANCE.getROSNode_ConnectedNode();

		/**
		 * The meta object literal for the '<em><b>Modules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_NODE__MODULES = eINSTANCE.getROSNode_Modules();

		/**
		 * The meta object literal for the '<em><b>Service Managers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_NODE__SERVICE_MANAGERS = eINSTANCE.getROSNode_ServiceManagers();

		/**
		 * The meta object literal for the '<em><b>Topic Launchers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_NODE__TOPIC_LAUNCHERS = eINSTANCE.getROSNode_TopicLaunchers();

		/**
		 * The meta object literal for the '<em><b>Publisher Managers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_NODE__PUBLISHER_MANAGERS = eINSTANCE.getROSNode_PublisherManagers();

		/**
		 * The meta object literal for the '<em><b>Initialized</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROS_NODE__INITIALIZED = eINSTANCE.getROSNode_Initialized();

		/**
		 * The meta object literal for the '<em><b>Connected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROS_NODE__CONNECTED = eINSTANCE.getROSNode_Connected();

		/**
		 * The meta object literal for the '<em><b>Restarting</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROS_NODE__RESTARTING = eINSTANCE.getROSNode_Restarting();

		/**
		 * The meta object literal for the '<em><b>Enable Auto Restart On Connection Lost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROS_NODE__ENABLE_AUTO_RESTART_ON_CONNECTION_LOST = eINSTANCE.getROSNode_EnableAutoRestartOnConnectionLost();

		/**
		 * The meta object literal for the '<em><b>Node Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROS_NODE__NODE_NAME = eINSTANCE.getROSNode_NodeName();

		/**
		 * The meta object literal for the '<em><b>Response Logger</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROS_NODE__RESPONSE_LOGGER = eINSTANCE.getROSNode_ResponseLogger();

		/**
		 * The meta object literal for the '<em><b>Null Response Handler</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROS_NODE__NULL_RESPONSE_HANDLER = eINSTANCE.getROSNode_NullResponseHandler();

		/**
		 * The meta object literal for the '<em><b>Null Request Handler</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROS_NODE__NULL_REQUEST_HANDLER = eINSTANCE.getROSNode_NullRequestHandler();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROS_NODE___START = eINSTANCE.getROSNode__Start();

		/**
		 * The meta object literal for the '<em><b>Initialize</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROS_NODE___INITIALIZE = eINSTANCE.getROSNode__Initialize();

		/**
		 * The meta object literal for the '<em><b>On Start</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROS_NODE___ON_START__CONNECTEDNODE = eINSTANCE.getROSNode__OnStart__ConnectedNode();

		/**
		 * The meta object literal for the '<em><b>Restart</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROS_NODE___RESTART = eINSTANCE.getROSNode__Restart();

		/**
		 * The meta object literal for the '<em><b>Register</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROS_NODE___REGISTER__ROSINTERFACE_BOOLEAN = eINSTANCE.getROSNode__Register__ROSInterface_boolean();

		/**
		 * The meta object literal for the '<em><b>Register</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROS_NODE___REGISTER__ROSINTERFACE = eINSTANCE.getROSNode__Register__ROSInterface();

		/**
		 * The meta object literal for the '<em><b>New From Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROS_NODE___NEW_FROM_TYPE__STRING = eINSTANCE.getROSNode__NewFromType__String();

		/**
		 * The meta object literal for the '<em><b>Shutdown</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROS_NODE___SHUTDOWN = eINSTANCE.getROSNode__Shutdown();

		/**
		 * The meta object literal for the '<em><b>Create Publisher</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROS_NODE___CREATE_PUBLISHER__STRING_STRING = eINSTANCE.getROSNode__CreatePublisher__String_String();

		/**
		 * The meta object literal for the '<em><b>Create Service Manager</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROS_NODE___CREATE_SERVICE_MANAGER = eINSTANCE.getROSNode__CreateServiceManager();

		/**
		 * The meta object literal for the '<em><b>Create Topic Launcher</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROS_NODE___CREATE_TOPIC_LAUNCHER = eINSTANCE.getROSNode__CreateTopicLauncher();

		/**
		 * The meta object literal for the '<em><b>Create Publisher Manager</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROS_NODE___CREATE_PUBLISHER_MANAGER = eINSTANCE.getROSNode__CreatePublisherManager();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.addons.ros.ROSInterface <em>ROS Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.addons.ros.ROSInterface
		 * @see ca.gc.asc_csa.apogy.addons.ros.impl.ApogyAddonsROSPackageImpl#getROSInterface()
		 * @generated
		 */
		EClass ROS_INTERFACE = eINSTANCE.getROSInterface();

		/**
		 * The meta object literal for the '<em><b>Service Manager</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_INTERFACE__SERVICE_MANAGER = eINSTANCE.getROSInterface_ServiceManager();

		/**
		 * The meta object literal for the '<em><b>Topic Launcher</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_INTERFACE__TOPIC_LAUNCHER = eINSTANCE.getROSInterface_TopicLauncher();

		/**
		 * The meta object literal for the '<em><b>Publisher Manager</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_INTERFACE__PUBLISHER_MANAGER = eINSTANCE.getROSInterface_PublisherManager();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_INTERFACE__NODE = eINSTANCE.getROSInterface_Node();

		/**
		 * The meta object literal for the '<em><b>Ros Init</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROS_INTERFACE___ROS_INIT = eINSTANCE.getROSInterface__RosInit();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.addons.ros.impl.ROSPublisherManagerImpl <em>ROS Publisher Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.addons.ros.impl.ROSPublisherManagerImpl
		 * @see ca.gc.asc_csa.apogy.addons.ros.impl.ApogyAddonsROSPackageImpl#getROSPublisherManager()
		 * @generated
		 */
		EClass ROS_PUBLISHER_MANAGER = eINSTANCE.getROSPublisherManager();

		/**
		 * The meta object literal for the '<em><b>Publishers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROS_PUBLISHER_MANAGER__PUBLISHERS = eINSTANCE.getROSPublisherManager_Publishers();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_PUBLISHER_MANAGER__NODE = eINSTANCE.getROSPublisherManager_Node();

		/**
		 * The meta object literal for the '<em><b>Running</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROS_PUBLISHER_MANAGER__RUNNING = eINSTANCE.getROSPublisherManager_Running();

		/**
		 * The meta object literal for the '<em><b>Create Publisher</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROS_PUBLISHER_MANAGER___CREATE_PUBLISHER__STRING_STRING = eINSTANCE.getROSPublisherManager__CreatePublisher__String_String();

		/**
		 * The meta object literal for the '<em><b>Launch</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROS_PUBLISHER_MANAGER___LAUNCH = eINSTANCE.getROSPublisherManager__Launch();

		/**
		 * The meta object literal for the '<em><b>Stop</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROS_PUBLISHER_MANAGER___STOP = eINSTANCE.getROSPublisherManager__Stop();

		/**
		 * The meta object literal for the '<em><b>Create Message</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROS_PUBLISHER_MANAGER___CREATE_MESSAGE__STRING = eINSTANCE.getROSPublisherManager__CreateMessage__String();

		/**
		 * The meta object literal for the '<em><b>Publish</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROS_PUBLISHER_MANAGER___PUBLISH__STRING_MESSAGE = eINSTANCE.getROSPublisherManager__Publish__String_Message();

		/**
		 * The meta object literal for the '<em><b>Get Publisher</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROS_PUBLISHER_MANAGER___GET_PUBLISHER__STRING = eINSTANCE.getROSPublisherManager__GetPublisher__String();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.addons.ros.impl.ROSPublisherImpl <em>ROS Publisher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.addons.ros.impl.ROSPublisherImpl
		 * @see ca.gc.asc_csa.apogy.addons.ros.impl.ApogyAddonsROSPackageImpl#getROSPublisher()
		 * @generated
		 */
		EClass ROS_PUBLISHER = eINSTANCE.getROSPublisher();

		/**
		 * The meta object literal for the '<em><b>Launched</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROS_PUBLISHER__LAUNCHED = eINSTANCE.getROSPublisher_Launched();

		/**
		 * The meta object literal for the '<em><b>Topic Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROS_PUBLISHER__TOPIC_NAME = eINSTANCE.getROSPublisher_TopicName();

		/**
		 * The meta object literal for the '<em><b>Message Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROS_PUBLISHER__MESSAGE_TYPE = eINSTANCE.getROSPublisher_MessageType();

		/**
		 * The meta object literal for the '<em><b>Publisher</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROS_PUBLISHER__PUBLISHER = eINSTANCE.getROSPublisher_Publisher();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_PUBLISHER__NODE = eINSTANCE.getROSPublisher_Node();

		/**
		 * The meta object literal for the '<em><b>Launch</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROS_PUBLISHER___LAUNCH__ROSNODE = eINSTANCE.getROSPublisher__Launch__ROSNode();

		/**
		 * The meta object literal for the '<em><b>Publish</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROS_PUBLISHER___PUBLISH__MESSAGE = eINSTANCE.getROSPublisher__Publish__Message();

		/**
		 * The meta object literal for the '<em><b>New Message</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROS_PUBLISHER___NEW_MESSAGE = eINSTANCE.getROSPublisher__NewMessage();

		/**
		 * The meta object literal for the '<em><b>Stop</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROS_PUBLISHER___STOP = eINSTANCE.getROSPublisher__Stop();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.addons.ros.impl.ROSServiceManagerImpl <em>ROS Service Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.addons.ros.impl.ROSServiceManagerImpl
		 * @see ca.gc.asc_csa.apogy.addons.ros.impl.ApogyAddonsROSPackageImpl#getROSServiceManager()
		 * @generated
		 */
		EClass ROS_SERVICE_MANAGER = eINSTANCE.getROSServiceManager();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROS_SERVICE_MANAGER__SERVICES = eINSTANCE.getROSServiceManager_Services();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_SERVICE_MANAGER__NODE = eINSTANCE.getROSServiceManager_Node();

		/**
		 * The meta object literal for the '<em><b>Running</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROS_SERVICE_MANAGER__RUNNING = eINSTANCE.getROSServiceManager_Running();

		/**
		 * The meta object literal for the '<em><b>Create Service</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROS_SERVICE_MANAGER___CREATE_SERVICE__STRING_STRING = eINSTANCE.getROSServiceManager__CreateService__String_String();

		/**
		 * The meta object literal for the '<em><b>Create Service</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROS_SERVICE_MANAGER___CREATE_SERVICE__STRING_STRING_BOOLEAN = eINSTANCE.getROSServiceManager__CreateService__String_String_boolean();

		/**
		 * The meta object literal for the '<em><b>Get Service</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROS_SERVICE_MANAGER___GET_SERVICE__STRING = eINSTANCE.getROSServiceManager__GetService__String();

		/**
		 * The meta object literal for the '<em><b>Create Request Message</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROS_SERVICE_MANAGER___CREATE_REQUEST_MESSAGE__STRING = eINSTANCE.getROSServiceManager__CreateRequestMessage__String();

		/**
		 * The meta object literal for the '<em><b>Call Service</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROS_SERVICE_MANAGER___CALL_SERVICE__STRING_MESSAGE = eINSTANCE.getROSServiceManager__CallService__String_Message();

		/**
		 * The meta object literal for the '<em><b>Call Service</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROS_SERVICE_MANAGER___CALL_SERVICE__STRING = eINSTANCE.getROSServiceManager__CallService__String();

		/**
		 * The meta object literal for the '<em><b>Call Service</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROS_SERVICE_MANAGER___CALL_SERVICE__STRING_MESSAGE_BOOLEAN = eINSTANCE.getROSServiceManager__CallService__String_Message_boolean();

		/**
		 * The meta object literal for the '<em><b>Call Service</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROS_SERVICE_MANAGER___CALL_SERVICE__STRING_BOOLEAN = eINSTANCE.getROSServiceManager__CallService__String_boolean();

		/**
		 * The meta object literal for the '<em><b>Launch</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROS_SERVICE_MANAGER___LAUNCH = eINSTANCE.getROSServiceManager__Launch();

		/**
		 * The meta object literal for the '<em><b>Stop</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROS_SERVICE_MANAGER___STOP = eINSTANCE.getROSServiceManager__Stop();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.addons.ros.impl.ROSServiceImpl <em>ROS Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.addons.ros.impl.ROSServiceImpl
		 * @see ca.gc.asc_csa.apogy.addons.ros.impl.ApogyAddonsROSPackageImpl#getROSService()
		 * @generated
		 */
		EClass ROS_SERVICE = eINSTANCE.getROSService();

		/**
		 * The meta object literal for the '<em><b>Service Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROS_SERVICE__SERVICE_NAME = eINSTANCE.getROSService_ServiceName();

		/**
		 * The meta object literal for the '<em><b>Service Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROS_SERVICE__SERVICE_TYPE = eINSTANCE.getROSService_ServiceType();

		/**
		 * The meta object literal for the '<em><b>Launched</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROS_SERVICE__LAUNCHED = eINSTANCE.getROSService_Launched();

		/**
		 * The meta object literal for the '<em><b>Service Client</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROS_SERVICE__SERVICE_CLIENT = eINSTANCE.getROSService_ServiceClient();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_SERVICE__NODE = eINSTANCE.getROSService_Node();

		/**
		 * The meta object literal for the '<em><b>Disconnect On Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROS_SERVICE__DISCONNECT_ON_TIMEOUT = eINSTANCE.getROSService_DisconnectOnTimeout();

		/**
		 * The meta object literal for the '<em><b>Launch</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROS_SERVICE___LAUNCH__ROSNODE = eINSTANCE.getROSService__Launch__ROSNode();

		/**
		 * The meta object literal for the '<em><b>Stop</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROS_SERVICE___STOP = eINSTANCE.getROSService__Stop();

		/**
		 * The meta object literal for the '<em><b>New Request Message</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROS_SERVICE___NEW_REQUEST_MESSAGE = eINSTANCE.getROSService__NewRequestMessage();

		/**
		 * The meta object literal for the '<em><b>Call</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROS_SERVICE___CALL__MESSAGE = eINSTANCE.getROSService__Call__Message();

		/**
		 * The meta object literal for the '<em><b>Call</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROS_SERVICE___CALL__MESSAGE_BOOLEAN = eINSTANCE.getROSService__Call__Message_boolean();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.addons.ros.impl.ROSTopicLauncherImpl <em>ROS Topic Launcher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.addons.ros.impl.ROSTopicLauncherImpl
		 * @see ca.gc.asc_csa.apogy.addons.ros.impl.ApogyAddonsROSPackageImpl#getROSTopicLauncher()
		 * @generated
		 */
		EClass ROS_TOPIC_LAUNCHER = eINSTANCE.getROSTopicLauncher();

		/**
		 * The meta object literal for the '<em><b>Listener List</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_TOPIC_LAUNCHER__LISTENER_LIST = eINSTANCE.getROSTopicLauncher_ListenerList();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_TOPIC_LAUNCHER__NODE = eINSTANCE.getROSTopicLauncher_Node();

		/**
		 * The meta object literal for the '<em><b>Running</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROS_TOPIC_LAUNCHER__RUNNING = eINSTANCE.getROSTopicLauncher_Running();

		/**
		 * The meta object literal for the '<em><b>Create Listener</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROS_TOPIC_LAUNCHER___CREATE_LISTENER__STRING_STRING_MESSAGELISTENER = eINSTANCE.getROSTopicLauncher__CreateListener__String_String_MessageListener();

		/**
		 * The meta object literal for the '<em><b>Launch</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROS_TOPIC_LAUNCHER___LAUNCH = eINSTANCE.getROSTopicLauncher__Launch();

		/**
		 * The meta object literal for the '<em><b>Stop</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROS_TOPIC_LAUNCHER___STOP = eINSTANCE.getROSTopicLauncher__Stop();

		/**
		 * The meta object literal for the '<em><b>Reset</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROS_TOPIC_LAUNCHER___RESET = eINSTANCE.getROSTopicLauncher__Reset();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.addons.ros.impl.ROSListenerImpl <em>ROS Listener</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.addons.ros.impl.ROSListenerImpl
		 * @see ca.gc.asc_csa.apogy.addons.ros.impl.ApogyAddonsROSPackageImpl#getROSListener()
		 * @generated
		 */
		EClass ROS_LISTENER = eINSTANCE.getROSListener();

		/**
		 * The meta object literal for the '<em><b>Running</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROS_LISTENER__RUNNING = eINSTANCE.getROSListener_Running();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_LISTENER__NODE = eINSTANCE.getROSListener_Node();

		/**
		 * The meta object literal for the '<em><b>Ros Subscriber</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROS_LISTENER__ROS_SUBSCRIBER = eINSTANCE.getROSListener_RosSubscriber();

		/**
		 * The meta object literal for the '<em><b>Topic Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROS_LISTENER__TOPIC_NAME = eINSTANCE.getROSListener_TopicName();

		/**
		 * The meta object literal for the '<em><b>Message Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROS_LISTENER__MESSAGE_TYPE = eINSTANCE.getROSListener_MessageType();

		/**
		 * The meta object literal for the '<em><b>Message Listener</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROS_LISTENER__MESSAGE_LISTENER = eINSTANCE.getROSListener_MessageListener();

		/**
		 * The meta object literal for the '<em><b>Start With Locks</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROS_LISTENER___START_WITH_LOCKS__ROSNODE = eINSTANCE.getROSListener__StartWithLocks__ROSNode();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROS_LISTENER___START__ROSNODE = eINSTANCE.getROSListener__Start__ROSNode();

		/**
		 * The meta object literal for the '<em><b>Connect Subscriber</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROS_LISTENER___CONNECT_SUBSCRIBER__CONNECTEDNODE = eINSTANCE.getROSListener__ConnectSubscriber__ConnectedNode();

		/**
		 * The meta object literal for the '<em><b>Stop</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROS_LISTENER___STOP = eINSTANCE.getROSListener__Stop();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.addons.ros.impl.ApogyAddonsROSFacadeImpl <em>Facade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.addons.ros.impl.ApogyAddonsROSFacadeImpl
		 * @see ca.gc.asc_csa.apogy.addons.ros.impl.ApogyAddonsROSPackageImpl#getApogyAddonsROSFacade()
		 * @generated
		 */
		EClass APOGY_ADDONS_ROS_FACADE = eINSTANCE.getApogyAddonsROSFacade();

		/**
		 * The meta object literal for the '<em><b>Get Node Name Prefix</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_ADDONS_ROS_FACADE___GET_NODE_NAME_PREFIX = eINSTANCE.getApogyAddonsROSFacade__GetNodeNamePrefix();

		/**
		 * The meta object literal for the '<em><b>Get ROS Master URI</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_ADDONS_ROS_FACADE___GET_ROS_MASTER_URI = eINSTANCE.getApogyAddonsROSFacade__GetROSMasterURI();

		/**
		 * The meta object literal for the '<em><b>Get ROS Hostname</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_ADDONS_ROS_FACADE___GET_ROS_HOSTNAME = eINSTANCE.getApogyAddonsROSFacade__GetROSHostname();

		/**
		 * The meta object literal for the '<em><b>Get ROS Ip</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_ADDONS_ROS_FACADE___GET_ROS_IP = eINSTANCE.getApogyAddonsROSFacade__GetROSIp();

		/**
		 * The meta object literal for the '<em>Response Logger</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.addons.ros.utilities.ResponseLogger
		 * @see ca.gc.asc_csa.apogy.addons.ros.impl.ApogyAddonsROSPackageImpl#getResponseLogger()
		 * @generated
		 */
		EDataType RESPONSE_LOGGER = eINSTANCE.getResponseLogger();

		/**
		 * The meta object literal for the '<em>Null Response Handler</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.addons.ros.utilities.NullResponseHandler
		 * @see ca.gc.asc_csa.apogy.addons.ros.impl.ApogyAddonsROSPackageImpl#getNullResponseHandler()
		 * @generated
		 */
		EDataType NULL_RESPONSE_HANDLER = eINSTANCE.getNullResponseHandler();

		/**
		 * The meta object literal for the '<em>Null Request Handler</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.addons.ros.utilities.NullRequestHandler
		 * @see ca.gc.asc_csa.apogy.addons.ros.impl.ApogyAddonsROSPackageImpl#getNullRequestHandler()
		 * @generated
		 */
		EDataType NULL_REQUEST_HANDLER = eINSTANCE.getNullRequestHandler();

		/**
		 * The meta object literal for the '<em>Connected Node</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ros.node.ConnectedNode
		 * @see ca.gc.asc_csa.apogy.addons.ros.impl.ApogyAddonsROSPackageImpl#getConnectedNode()
		 * @generated
		 */
		EDataType CONNECTED_NODE = eINSTANCE.getConnectedNode();

		/**
		 * The meta object literal for the '<em>Service Not Found Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ros.exception.ServiceNotFoundException
		 * @see ca.gc.asc_csa.apogy.addons.ros.impl.ApogyAddonsROSPackageImpl#getServiceNotFoundException()
		 * @generated
		 */
		EDataType SERVICE_NOT_FOUND_EXCEPTION = eINSTANCE.getServiceNotFoundException();

		/**
		 * The meta object literal for the '<em>Message</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ros.internal.message.Message
		 * @see ca.gc.asc_csa.apogy.addons.ros.impl.ApogyAddonsROSPackageImpl#getMessage()
		 * @generated
		 */
		EDataType MESSAGE = eINSTANCE.getMessage();

		/**
		 * The meta object literal for the '<em>Message Listener</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ros.message.MessageListener
		 * @see ca.gc.asc_csa.apogy.addons.ros.impl.ApogyAddonsROSPackageImpl#getMessageListener()
		 * @generated
		 */
		EDataType MESSAGE_LISTENER = eINSTANCE.getMessageListener();

		/**
		 * The meta object literal for the '<em>Abstract Node Main</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ros.node.AbstractNodeMain
		 * @see ca.gc.asc_csa.apogy.addons.ros.impl.ApogyAddonsROSPackageImpl#getAbstractNodeMain()
		 * @generated
		 */
		EDataType ABSTRACT_NODE_MAIN = eINSTANCE.getAbstractNodeMain();

		/**
		 * The meta object literal for the '<em>Service Client</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ros.node.service.ServiceClient
		 * @see ca.gc.asc_csa.apogy.addons.ros.impl.ApogyAddonsROSPackageImpl#getServiceClient()
		 * @generated
		 */
		EDataType SERVICE_CLIENT = eINSTANCE.getServiceClient();

		/**
		 * The meta object literal for the '<em>Publisher</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ros.node.topic.Publisher
		 * @see ca.gc.asc_csa.apogy.addons.ros.impl.ApogyAddonsROSPackageImpl#getPublisher()
		 * @generated
		 */
		EDataType PUBLISHER = eINSTANCE.getPublisher();

		/**
		 * The meta object literal for the '<em>Subscriber</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ros.node.topic.Subscriber
		 * @see ca.gc.asc_csa.apogy.addons.ros.impl.ApogyAddonsROSPackageImpl#getSubscriber()
		 * @generated
		 */
		EDataType SUBSCRIBER = eINSTANCE.getSubscriber();

		/**
		 * The meta object literal for the '<em>Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Exception
		 * @see ca.gc.asc_csa.apogy.addons.ros.impl.ApogyAddonsROSPackageImpl#getException()
		 * @generated
		 */
		EDataType EXCEPTION = eINSTANCE.getException();

		/**
		 * The meta object literal for the '<em>Hash Map</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.HashMap
		 * @see ca.gc.asc_csa.apogy.addons.ros.impl.ApogyAddonsROSPackageImpl#getHashMap()
		 * @generated
		 */
		EDataType HASH_MAP = eINSTANCE.getHashMap();

	}

} //ApogyAddonsROSPackage
