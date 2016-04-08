package ca.gc.asc_csa.apogy.addons.ros.impl;
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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;
import ca.gc.asc_csa.apogy.addons.ros.ROSInterface;
import ca.gc.asc_csa.apogy.addons.ros.ROSListener;
import ca.gc.asc_csa.apogy.addons.ros.ROSNode;
import ca.gc.asc_csa.apogy.addons.ros.ROSPublisher;
import ca.gc.asc_csa.apogy.addons.ros.ROSPublisherManager;
import ca.gc.asc_csa.apogy.addons.ros.ROSService;
import ca.gc.asc_csa.apogy.addons.ros.ROSServiceManager;
import ca.gc.asc_csa.apogy.addons.ros.ROSTopicLauncher;
import ca.gc.asc_csa.apogy.addons.ros.ApogyAddonsROSFacade;
import ca.gc.asc_csa.apogy.addons.ros.ApogyAddonsROSFactory;
import ca.gc.asc_csa.apogy.addons.ros.ApogyAddonsROSPackage;
import ca.gc.asc_csa.apogy.addons.ros.utilities.NullRequestHandler;
import ca.gc.asc_csa.apogy.addons.ros.utilities.NullResponseHandler;
import ca.gc.asc_csa.apogy.addons.ros.utilities.ResponseLogger;
import org.ros.exception.ServiceNotFoundException;

import org.ros.internal.message.Message;

import org.ros.message.MessageListener;

import org.ros.node.AbstractNodeMain;
import org.ros.node.ConnectedNode;

import org.ros.node.service.ServiceClient;

import org.ros.node.topic.Publisher;
import org.ros.node.topic.Subscriber;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyAddonsROSPackageImpl extends EPackageImpl implements ApogyAddonsROSPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rosNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rosInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rosPublisherManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rosPublisherEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rosServiceManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rosServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rosTopicLauncherEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rosListenerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apogyAddonsROSFacadeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType responseLoggerEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nullResponseHandlerEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nullRequestHandlerEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType connectedNodeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType serviceNotFoundExceptionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType messageEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType messageListenerEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType abstractNodeMainEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType serviceClientEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType publisherEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType subscriberEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType exceptionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType hashMapEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ca.gc.asc_csa.apogy.addons.ros.ApogyAddonsROSPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ApogyAddonsROSPackageImpl() {
		super(eNS_URI, ApogyAddonsROSFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ApogyAddonsROSPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ApogyAddonsROSPackage init() {
		if (isInited) return (ApogyAddonsROSPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyAddonsROSPackage.eNS_URI);

		// Obtain or create and register package
		ApogyAddonsROSPackageImpl theApogyAddonsROSPackage = (ApogyAddonsROSPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ApogyAddonsROSPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ApogyAddonsROSPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theApogyAddonsROSPackage.createPackageContents();

		// Initialize created meta-data
		theApogyAddonsROSPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theApogyAddonsROSPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ApogyAddonsROSPackage.eNS_URI, theApogyAddonsROSPackage);
		return theApogyAddonsROSPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getROSNode() {
		return rosNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROSNode_ConnectedNode() {
		return (EAttribute)rosNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getROSNode_Modules() {
		return (EReference)rosNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getROSNode_ServiceManagers() {
		return (EReference)rosNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getROSNode_TopicLaunchers() {
		return (EReference)rosNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getROSNode_PublisherManagers() {
		return (EReference)rosNodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROSNode_Initialized() {
		return (EAttribute)rosNodeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROSNode_Connected() {
		return (EAttribute)rosNodeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROSNode_Restarting() {
		return (EAttribute)rosNodeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROSNode_EnableAutoRestartOnConnectionLost() {
		return (EAttribute)rosNodeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROSNode_NodeName() {
		return (EAttribute)rosNodeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROSNode_ResponseLogger() {
		return (EAttribute)rosNodeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROSNode_NullResponseHandler() {
		return (EAttribute)rosNodeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROSNode_NullRequestHandler() {
		return (EAttribute)rosNodeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getROSNode__Start() {
		return rosNodeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getROSNode__Initialize() {
		return rosNodeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getROSNode__OnStart__ConnectedNode() {
		return rosNodeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getROSNode__Restart() {
		return rosNodeEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getROSNode__Register__ROSInterface_boolean() {
		return rosNodeEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getROSNode__Register__ROSInterface() {
		return rosNodeEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getROSNode__NewFromType__String() {
		return rosNodeEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getROSNode__Shutdown() {
		return rosNodeEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getROSNode__CreatePublisher__String_String() {
		return rosNodeEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getROSNode__CreateServiceManager() {
		return rosNodeEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getROSNode__CreateTopicLauncher() {
		return rosNodeEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getROSNode__CreatePublisherManager() {
		return rosNodeEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getROSInterface() {
		return rosInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getROSInterface_ServiceManager() {
		return (EReference)rosInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getROSInterface_TopicLauncher() {
		return (EReference)rosInterfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getROSInterface_PublisherManager() {
		return (EReference)rosInterfaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getROSInterface_Node() {
		return (EReference)rosInterfaceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getROSInterface__RosInit() {
		return rosInterfaceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getROSPublisherManager() {
		return rosPublisherManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROSPublisherManager_Publishers() {
		return (EAttribute)rosPublisherManagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getROSPublisherManager_Node() {
		return (EReference)rosPublisherManagerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROSPublisherManager_Running() {
		return (EAttribute)rosPublisherManagerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getROSPublisherManager__CreatePublisher__String_String() {
		return rosPublisherManagerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getROSPublisherManager__Launch() {
		return rosPublisherManagerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getROSPublisherManager__Stop() {
		return rosPublisherManagerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getROSPublisherManager__CreateMessage__String() {
		return rosPublisherManagerEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getROSPublisherManager__Publish__String_Message() {
		return rosPublisherManagerEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getROSPublisherManager__GetPublisher__String() {
		return rosPublisherManagerEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getROSPublisher() {
		return rosPublisherEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROSPublisher_Launched() {
		return (EAttribute)rosPublisherEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROSPublisher_TopicName() {
		return (EAttribute)rosPublisherEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROSPublisher_MessageType() {
		return (EAttribute)rosPublisherEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROSPublisher_Publisher() {
		return (EAttribute)rosPublisherEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getROSPublisher_Node() {
		return (EReference)rosPublisherEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getROSPublisher__Launch__ROSNode() {
		return rosPublisherEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getROSPublisher__Publish__Message() {
		return rosPublisherEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getROSPublisher__NewMessage() {
		return rosPublisherEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getROSPublisher__Stop() {
		return rosPublisherEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getROSServiceManager() {
		return rosServiceManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROSServiceManager_Services() {
		return (EAttribute)rosServiceManagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getROSServiceManager_Node() {
		return (EReference)rosServiceManagerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROSServiceManager_Running() {
		return (EAttribute)rosServiceManagerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getROSServiceManager__CreateService__String_String() {
		return rosServiceManagerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getROSServiceManager__CreateService__String_String_boolean() {
		return rosServiceManagerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getROSServiceManager__GetService__String() {
		return rosServiceManagerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getROSServiceManager__CreateRequestMessage__String() {
		return rosServiceManagerEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getROSServiceManager__CallService__String_Message() {
		return rosServiceManagerEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getROSServiceManager__CallService__String_Message_int() {
		return rosServiceManagerEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getROSServiceManager__CallService__String() {
		return rosServiceManagerEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getROSServiceManager__CallService__String_Message_boolean() {
		return rosServiceManagerEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getROSServiceManager__CallService__String_Message_boolean_int() {
		return rosServiceManagerEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getROSServiceManager__CallService__String_boolean() {
		return rosServiceManagerEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getROSServiceManager__Launch() {
		return rosServiceManagerEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getROSServiceManager__Stop() {
		return rosServiceManagerEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getROSService() {
		return rosServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROSService_ServiceName() {
		return (EAttribute)rosServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROSService_ServiceType() {
		return (EAttribute)rosServiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROSService_Launched() {
		return (EAttribute)rosServiceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROSService_ServiceClient() {
		return (EAttribute)rosServiceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getROSService_Node() {
		return (EReference)rosServiceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROSService_DisconnectOnTimeout() {
		return (EAttribute)rosServiceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getROSService__Launch__ROSNode() {
		return rosServiceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getROSService__Stop() {
		return rosServiceEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getROSService__NewRequestMessage() {
		return rosServiceEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getROSService__Call__Message() {
		return rosServiceEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getROSService__Call__Message_boolean() {
		return rosServiceEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getROSService__Call__Message_boolean_int() {
		return rosServiceEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getROSTopicLauncher() {
		return rosTopicLauncherEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getROSTopicLauncher_ListenerList() {
		return (EReference)rosTopicLauncherEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getROSTopicLauncher_Node() {
		return (EReference)rosTopicLauncherEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROSTopicLauncher_Running() {
		return (EAttribute)rosTopicLauncherEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getROSTopicLauncher__CreateListener__String_String_MessageListener() {
		return rosTopicLauncherEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getROSTopicLauncher__Launch() {
		return rosTopicLauncherEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getROSTopicLauncher__Stop() {
		return rosTopicLauncherEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getROSTopicLauncher__Reset() {
		return rosTopicLauncherEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getROSListener() {
		return rosListenerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROSListener_Running() {
		return (EAttribute)rosListenerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getROSListener_Node() {
		return (EReference)rosListenerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROSListener_RosSubscriber() {
		return (EAttribute)rosListenerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROSListener_TopicName() {
		return (EAttribute)rosListenerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROSListener_MessageType() {
		return (EAttribute)rosListenerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROSListener_MessageListener() {
		return (EAttribute)rosListenerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getROSListener__StartWithLocks__ROSNode() {
		return rosListenerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getROSListener__Start__ROSNode() {
		return rosListenerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getROSListener__ConnectSubscriber__ConnectedNode() {
		return rosListenerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getROSListener__Stop() {
		return rosListenerEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApogyAddonsROSFacade() {
		return apogyAddonsROSFacadeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyAddonsROSFacade__GetNodeNamePrefix() {
		return apogyAddonsROSFacadeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyAddonsROSFacade__GetROSMasterURI() {
		return apogyAddonsROSFacadeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyAddonsROSFacade__GetROSHostname() {
		return apogyAddonsROSFacadeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyAddonsROSFacade__GetROSIp() {
		return apogyAddonsROSFacadeEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getResponseLogger() {
		return responseLoggerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNullResponseHandler() {
		return nullResponseHandlerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNullRequestHandler() {
		return nullRequestHandlerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getConnectedNode() {
		return connectedNodeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getServiceNotFoundException() {
		return serviceNotFoundExceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMessage() {
		return messageEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMessageListener() {
		return messageListenerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAbstractNodeMain() {
		return abstractNodeMainEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getServiceClient() {
		return serviceClientEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPublisher() {
		return publisherEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSubscriber() {
		return subscriberEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getException() {
		return exceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getHashMap() {
		return hashMapEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyAddonsROSFactory getApogyAddonsROSFactory() {
		return (ApogyAddonsROSFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		rosNodeEClass = createEClass(ROS_NODE);
		createEAttribute(rosNodeEClass, ROS_NODE__CONNECTED_NODE);
		createEReference(rosNodeEClass, ROS_NODE__MODULES);
		createEReference(rosNodeEClass, ROS_NODE__SERVICE_MANAGERS);
		createEReference(rosNodeEClass, ROS_NODE__TOPIC_LAUNCHERS);
		createEReference(rosNodeEClass, ROS_NODE__PUBLISHER_MANAGERS);
		createEAttribute(rosNodeEClass, ROS_NODE__INITIALIZED);
		createEAttribute(rosNodeEClass, ROS_NODE__CONNECTED);
		createEAttribute(rosNodeEClass, ROS_NODE__RESTARTING);
		createEAttribute(rosNodeEClass, ROS_NODE__ENABLE_AUTO_RESTART_ON_CONNECTION_LOST);
		createEAttribute(rosNodeEClass, ROS_NODE__NODE_NAME);
		createEAttribute(rosNodeEClass, ROS_NODE__RESPONSE_LOGGER);
		createEAttribute(rosNodeEClass, ROS_NODE__NULL_RESPONSE_HANDLER);
		createEAttribute(rosNodeEClass, ROS_NODE__NULL_REQUEST_HANDLER);
		createEOperation(rosNodeEClass, ROS_NODE___START);
		createEOperation(rosNodeEClass, ROS_NODE___INITIALIZE);
		createEOperation(rosNodeEClass, ROS_NODE___ON_START__CONNECTEDNODE);
		createEOperation(rosNodeEClass, ROS_NODE___RESTART);
		createEOperation(rosNodeEClass, ROS_NODE___REGISTER__ROSINTERFACE_BOOLEAN);
		createEOperation(rosNodeEClass, ROS_NODE___REGISTER__ROSINTERFACE);
		createEOperation(rosNodeEClass, ROS_NODE___NEW_FROM_TYPE__STRING);
		createEOperation(rosNodeEClass, ROS_NODE___SHUTDOWN);
		createEOperation(rosNodeEClass, ROS_NODE___CREATE_PUBLISHER__STRING_STRING);
		createEOperation(rosNodeEClass, ROS_NODE___CREATE_SERVICE_MANAGER);
		createEOperation(rosNodeEClass, ROS_NODE___CREATE_TOPIC_LAUNCHER);
		createEOperation(rosNodeEClass, ROS_NODE___CREATE_PUBLISHER_MANAGER);

		rosInterfaceEClass = createEClass(ROS_INTERFACE);
		createEReference(rosInterfaceEClass, ROS_INTERFACE__SERVICE_MANAGER);
		createEReference(rosInterfaceEClass, ROS_INTERFACE__TOPIC_LAUNCHER);
		createEReference(rosInterfaceEClass, ROS_INTERFACE__PUBLISHER_MANAGER);
		createEReference(rosInterfaceEClass, ROS_INTERFACE__NODE);
		createEOperation(rosInterfaceEClass, ROS_INTERFACE___ROS_INIT);

		rosPublisherManagerEClass = createEClass(ROS_PUBLISHER_MANAGER);
		createEAttribute(rosPublisherManagerEClass, ROS_PUBLISHER_MANAGER__PUBLISHERS);
		createEReference(rosPublisherManagerEClass, ROS_PUBLISHER_MANAGER__NODE);
		createEAttribute(rosPublisherManagerEClass, ROS_PUBLISHER_MANAGER__RUNNING);
		createEOperation(rosPublisherManagerEClass, ROS_PUBLISHER_MANAGER___CREATE_PUBLISHER__STRING_STRING);
		createEOperation(rosPublisherManagerEClass, ROS_PUBLISHER_MANAGER___LAUNCH);
		createEOperation(rosPublisherManagerEClass, ROS_PUBLISHER_MANAGER___STOP);
		createEOperation(rosPublisherManagerEClass, ROS_PUBLISHER_MANAGER___CREATE_MESSAGE__STRING);
		createEOperation(rosPublisherManagerEClass, ROS_PUBLISHER_MANAGER___PUBLISH__STRING_MESSAGE);
		createEOperation(rosPublisherManagerEClass, ROS_PUBLISHER_MANAGER___GET_PUBLISHER__STRING);

		rosPublisherEClass = createEClass(ROS_PUBLISHER);
		createEAttribute(rosPublisherEClass, ROS_PUBLISHER__LAUNCHED);
		createEAttribute(rosPublisherEClass, ROS_PUBLISHER__TOPIC_NAME);
		createEAttribute(rosPublisherEClass, ROS_PUBLISHER__MESSAGE_TYPE);
		createEAttribute(rosPublisherEClass, ROS_PUBLISHER__PUBLISHER);
		createEReference(rosPublisherEClass, ROS_PUBLISHER__NODE);
		createEOperation(rosPublisherEClass, ROS_PUBLISHER___LAUNCH__ROSNODE);
		createEOperation(rosPublisherEClass, ROS_PUBLISHER___PUBLISH__MESSAGE);
		createEOperation(rosPublisherEClass, ROS_PUBLISHER___NEW_MESSAGE);
		createEOperation(rosPublisherEClass, ROS_PUBLISHER___STOP);

		rosServiceManagerEClass = createEClass(ROS_SERVICE_MANAGER);
		createEAttribute(rosServiceManagerEClass, ROS_SERVICE_MANAGER__SERVICES);
		createEReference(rosServiceManagerEClass, ROS_SERVICE_MANAGER__NODE);
		createEAttribute(rosServiceManagerEClass, ROS_SERVICE_MANAGER__RUNNING);
		createEOperation(rosServiceManagerEClass, ROS_SERVICE_MANAGER___CREATE_SERVICE__STRING_STRING);
		createEOperation(rosServiceManagerEClass, ROS_SERVICE_MANAGER___CREATE_SERVICE__STRING_STRING_BOOLEAN);
		createEOperation(rosServiceManagerEClass, ROS_SERVICE_MANAGER___GET_SERVICE__STRING);
		createEOperation(rosServiceManagerEClass, ROS_SERVICE_MANAGER___CREATE_REQUEST_MESSAGE__STRING);
		createEOperation(rosServiceManagerEClass, ROS_SERVICE_MANAGER___CALL_SERVICE__STRING_MESSAGE);
		createEOperation(rosServiceManagerEClass, ROS_SERVICE_MANAGER___CALL_SERVICE__STRING_MESSAGE_INT);
		createEOperation(rosServiceManagerEClass, ROS_SERVICE_MANAGER___CALL_SERVICE__STRING);
		createEOperation(rosServiceManagerEClass, ROS_SERVICE_MANAGER___CALL_SERVICE__STRING_MESSAGE_BOOLEAN);
		createEOperation(rosServiceManagerEClass, ROS_SERVICE_MANAGER___CALL_SERVICE__STRING_MESSAGE_BOOLEAN_INT);
		createEOperation(rosServiceManagerEClass, ROS_SERVICE_MANAGER___CALL_SERVICE__STRING_BOOLEAN);
		createEOperation(rosServiceManagerEClass, ROS_SERVICE_MANAGER___LAUNCH);
		createEOperation(rosServiceManagerEClass, ROS_SERVICE_MANAGER___STOP);

		rosServiceEClass = createEClass(ROS_SERVICE);
		createEAttribute(rosServiceEClass, ROS_SERVICE__SERVICE_NAME);
		createEAttribute(rosServiceEClass, ROS_SERVICE__SERVICE_TYPE);
		createEAttribute(rosServiceEClass, ROS_SERVICE__LAUNCHED);
		createEAttribute(rosServiceEClass, ROS_SERVICE__SERVICE_CLIENT);
		createEReference(rosServiceEClass, ROS_SERVICE__NODE);
		createEAttribute(rosServiceEClass, ROS_SERVICE__DISCONNECT_ON_TIMEOUT);
		createEOperation(rosServiceEClass, ROS_SERVICE___LAUNCH__ROSNODE);
		createEOperation(rosServiceEClass, ROS_SERVICE___STOP);
		createEOperation(rosServiceEClass, ROS_SERVICE___NEW_REQUEST_MESSAGE);
		createEOperation(rosServiceEClass, ROS_SERVICE___CALL__MESSAGE);
		createEOperation(rosServiceEClass, ROS_SERVICE___CALL__MESSAGE_BOOLEAN);
		createEOperation(rosServiceEClass, ROS_SERVICE___CALL__MESSAGE_BOOLEAN_INT);

		rosTopicLauncherEClass = createEClass(ROS_TOPIC_LAUNCHER);
		createEReference(rosTopicLauncherEClass, ROS_TOPIC_LAUNCHER__LISTENER_LIST);
		createEReference(rosTopicLauncherEClass, ROS_TOPIC_LAUNCHER__NODE);
		createEAttribute(rosTopicLauncherEClass, ROS_TOPIC_LAUNCHER__RUNNING);
		createEOperation(rosTopicLauncherEClass, ROS_TOPIC_LAUNCHER___CREATE_LISTENER__STRING_STRING_MESSAGELISTENER);
		createEOperation(rosTopicLauncherEClass, ROS_TOPIC_LAUNCHER___LAUNCH);
		createEOperation(rosTopicLauncherEClass, ROS_TOPIC_LAUNCHER___STOP);
		createEOperation(rosTopicLauncherEClass, ROS_TOPIC_LAUNCHER___RESET);

		rosListenerEClass = createEClass(ROS_LISTENER);
		createEAttribute(rosListenerEClass, ROS_LISTENER__RUNNING);
		createEReference(rosListenerEClass, ROS_LISTENER__NODE);
		createEAttribute(rosListenerEClass, ROS_LISTENER__ROS_SUBSCRIBER);
		createEAttribute(rosListenerEClass, ROS_LISTENER__TOPIC_NAME);
		createEAttribute(rosListenerEClass, ROS_LISTENER__MESSAGE_TYPE);
		createEAttribute(rosListenerEClass, ROS_LISTENER__MESSAGE_LISTENER);
		createEOperation(rosListenerEClass, ROS_LISTENER___START_WITH_LOCKS__ROSNODE);
		createEOperation(rosListenerEClass, ROS_LISTENER___START__ROSNODE);
		createEOperation(rosListenerEClass, ROS_LISTENER___CONNECT_SUBSCRIBER__CONNECTEDNODE);
		createEOperation(rosListenerEClass, ROS_LISTENER___STOP);

		apogyAddonsROSFacadeEClass = createEClass(APOGY_ADDONS_ROS_FACADE);
		createEOperation(apogyAddonsROSFacadeEClass, APOGY_ADDONS_ROS_FACADE___GET_NODE_NAME_PREFIX);
		createEOperation(apogyAddonsROSFacadeEClass, APOGY_ADDONS_ROS_FACADE___GET_ROS_MASTER_URI);
		createEOperation(apogyAddonsROSFacadeEClass, APOGY_ADDONS_ROS_FACADE___GET_ROS_HOSTNAME);
		createEOperation(apogyAddonsROSFacadeEClass, APOGY_ADDONS_ROS_FACADE___GET_ROS_IP);

		// Create data types
		responseLoggerEDataType = createEDataType(RESPONSE_LOGGER);
		nullResponseHandlerEDataType = createEDataType(NULL_RESPONSE_HANDLER);
		nullRequestHandlerEDataType = createEDataType(NULL_REQUEST_HANDLER);
		connectedNodeEDataType = createEDataType(CONNECTED_NODE);
		serviceNotFoundExceptionEDataType = createEDataType(SERVICE_NOT_FOUND_EXCEPTION);
		messageEDataType = createEDataType(MESSAGE);
		messageListenerEDataType = createEDataType(MESSAGE_LISTENER);
		abstractNodeMainEDataType = createEDataType(ABSTRACT_NODE_MAIN);
		serviceClientEDataType = createEDataType(SERVICE_CLIENT);
		publisherEDataType = createEDataType(PUBLISHER);
		subscriberEDataType = createEDataType(SUBSCRIBER);
		exceptionEDataType = createEDataType(EXCEPTION);
		hashMapEDataType = createEDataType(HASH_MAP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters
		ETypeParameter rosPublisherEClass_T = addETypeParameter(rosPublisherEClass, "T");
		ETypeParameter rosServiceEClass_Request = addETypeParameter(rosServiceEClass, "Request");
		ETypeParameter rosServiceEClass_Response = addETypeParameter(rosServiceEClass, "Response");
		ETypeParameter rosListenerEClass_T = addETypeParameter(rosListenerEClass, "T");
		addETypeParameter(messageListenerEDataType, "T");
		addETypeParameter(serviceClientEDataType, "Request");
		addETypeParameter(serviceClientEDataType, "Response");
		addETypeParameter(publisherEDataType, "T");
		addETypeParameter(subscriberEDataType, "T");
		addETypeParameter(hashMapEDataType, "Key");
		addETypeParameter(hashMapEDataType, "Value");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(this.getMessage());
		rosPublisherEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(this.getMessage());
		rosServiceEClass_Request.getEBounds().add(g1);
		g1 = createEGenericType(this.getMessage());
		rosServiceEClass_Response.getEBounds().add(g1);
		g1 = createEGenericType(this.getMessage());
		rosListenerEClass_T.getEBounds().add(g1);

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(rosNodeEClass, ROSNode.class, "ROSNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getROSNode_ConnectedNode(), this.getConnectedNode(), "connectedNode", null, 0, 1, ROSNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getROSNode_Modules(), this.getROSInterface(), null, "modules", null, 0, -1, ROSNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getROSNode_ServiceManagers(), this.getROSServiceManager(), null, "serviceManagers", null, 0, -1, ROSNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getROSNode_TopicLaunchers(), this.getROSTopicLauncher(), null, "topicLaunchers", null, 0, -1, ROSNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getROSNode_PublisherManagers(), this.getROSPublisherManager(), null, "publisherManagers", null, 0, -1, ROSNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROSNode_Initialized(), theEcorePackage.getEBoolean(), "initialized", "false", 0, 1, ROSNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROSNode_Connected(), theEcorePackage.getEBoolean(), "connected", "false", 0, 1, ROSNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROSNode_Restarting(), theEcorePackage.getEBoolean(), "restarting", "false", 0, 1, ROSNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROSNode_EnableAutoRestartOnConnectionLost(), theEcorePackage.getEBoolean(), "enableAutoRestartOnConnectionLost", "false", 0, 1, ROSNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROSNode_NodeName(), theEcorePackage.getEString(), "nodeName", null, 0, 1, ROSNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROSNode_ResponseLogger(), this.getResponseLogger(), "responseLogger", null, 0, 1, ROSNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROSNode_NullResponseHandler(), this.getNullResponseHandler(), "nullResponseHandler", null, 0, 1, ROSNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROSNode_NullRequestHandler(), this.getNullRequestHandler(), "nullRequestHandler", null, 0, 1, ROSNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getROSNode__Start(), null, "start", 0, 1, !IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getROSNode__Initialize(), null, "initialize", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		op = initEOperation(getROSNode__OnStart__ConnectedNode(), null, "onStart", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getConnectedNode(), "connectedNode", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getROSNode__Restart(), null, "restart", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getROSNode__Register__ROSInterface_boolean(), null, "register", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getROSInterface(), "module", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEBoolean(), "initialize", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getROSNode__Register__ROSInterface(), null, "register", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getROSInterface(), "module", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getROSNode__NewFromType__String(), null, "newFromType", 0, 1, !IS_UNIQUE, IS_ORDERED);
		ETypeParameter t1 = addETypeParameter(op, "T");
		addEParameter(op, theEcorePackage.getEString(), "messageType", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		initEOperation(getROSNode__Shutdown(), null, "shutdown", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getROSNode__CreatePublisher__String_String(), null, "createPublisher", 0, 1, !IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		addEParameter(op, theEcorePackage.getEString(), "topicName", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "messageType", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getPublisher());
		EGenericType g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEOperation(getROSNode__CreateServiceManager(), this.getROSServiceManager(), "createServiceManager", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getROSNode__CreateTopicLauncher(), this.getROSTopicLauncher(), "createTopicLauncher", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getROSNode__CreatePublisherManager(), this.getROSPublisherManager(), "createPublisherManager", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(rosInterfaceEClass, ROSInterface.class, "ROSInterface", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getROSInterface_ServiceManager(), this.getROSServiceManager(), null, "serviceManager", null, 0, 1, ROSInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getROSInterface_TopicLauncher(), this.getROSTopicLauncher(), null, "topicLauncher", null, 0, 1, ROSInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getROSInterface_PublisherManager(), this.getROSPublisherManager(), null, "publisherManager", null, 0, 1, ROSInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getROSInterface_Node(), this.getROSNode(), null, "node", null, 0, 1, ROSInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getROSInterface__RosInit(), null, "rosInit", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(rosPublisherManagerEClass, ROSPublisherManager.class, "ROSPublisherManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(this.getHashMap());
		g2 = createEGenericType(theEcorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getROSPublisher());
		g1.getETypeArguments().add(g2);
		EGenericType g3 = createEGenericType();
		g2.getETypeArguments().add(g3);
		initEAttribute(getROSPublisherManager_Publishers(), g1, "publishers", null, 0, 1, ROSPublisherManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getROSPublisherManager_Node(), this.getROSNode(), null, "node", null, 0, 1, ROSPublisherManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROSPublisherManager_Running(), theEcorePackage.getEBoolean(), "running", null, 0, 1, ROSPublisherManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getROSPublisherManager__CreatePublisher__String_String(), null, "createPublisher", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "topicName", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "messageType", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getROSPublisherManager__Launch(), null, "launch", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getROSPublisherManager__Stop(), null, "stop", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getROSPublisherManager__CreateMessage__String(), null, "createMessage", 0, 1, !IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(this.getMessage());
		t1.getEBounds().add(g1);
		addEParameter(op, theEcorePackage.getEString(), "topicName", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = initEOperation(getROSPublisherManager__Publish__String_Message(), null, "publish", 0, 1, !IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(this.getMessage());
		t1.getEBounds().add(g1);
		addEParameter(op, theEcorePackage.getEString(), "topicName", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "message", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getROSPublisherManager__GetPublisher__String(), null, "getPublisher", 0, 1, !IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(this.getMessage());
		t1.getEBounds().add(g1);
		addEParameter(op, theEcorePackage.getEString(), "topicName", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getROSPublisher());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(rosPublisherEClass, ROSPublisher.class, "ROSPublisher", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getROSPublisher_Launched(), theEcorePackage.getEBoolean(), "launched", null, 0, 1, ROSPublisher.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getROSPublisher_TopicName(), theEcorePackage.getEString(), "topicName", null, 0, 1, ROSPublisher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROSPublisher_MessageType(), theEcorePackage.getEString(), "messageType", null, 0, 1, ROSPublisher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getPublisher());
		g2 = createEGenericType(rosPublisherEClass_T);
		g1.getETypeArguments().add(g2);
		initEAttribute(getROSPublisher_Publisher(), g1, "publisher", null, 0, 1, ROSPublisher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getROSPublisher_Node(), this.getROSNode(), null, "node", null, 0, 1, ROSPublisher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getROSPublisher__Launch__ROSNode(), null, "launch", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getROSNode(), "node", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getROSPublisher__Publish__Message(), null, "publish", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(rosPublisherEClass_T);
		addEParameter(op, g1, "message", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getROSPublisher__NewMessage(), null, "newMessage", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(rosPublisherEClass_T);
		initEOperation(op, g1);

		initEOperation(getROSPublisher__Stop(), null, "stop", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(rosServiceManagerEClass, ROSServiceManager.class, "ROSServiceManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(this.getHashMap());
		g2 = createEGenericType(theEcorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getROSService());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType();
		g2.getETypeArguments().add(g3);
		g3 = createEGenericType();
		g2.getETypeArguments().add(g3);
		initEAttribute(getROSServiceManager_Services(), g1, "services", null, 0, 1, ROSServiceManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getROSServiceManager_Node(), this.getROSNode(), null, "node", null, 0, 1, ROSServiceManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROSServiceManager_Running(), theEcorePackage.getEBoolean(), "running", null, 0, 1, ROSServiceManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getROSServiceManager__CreateService__String_String(), null, "createService", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "serviceName", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "serviceType", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getROSServiceManager__CreateService__String_String_boolean(), null, "createService", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "serviceName", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "serviceType", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEBoolean(), "disconnectOnTimeout", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getROSServiceManager__GetService__String(), null, "getService", 0, 1, !IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "Request");
		g1 = createEGenericType(this.getMessage());
		t1.getEBounds().add(g1);
		ETypeParameter t2 = addETypeParameter(op, "Response");
		g1 = createEGenericType(this.getMessage());
		t2.getEBounds().add(g1);
		addEParameter(op, theEcorePackage.getEString(), "serviceName", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getROSService());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(t2);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getROSServiceManager__CreateRequestMessage__String(), null, "createRequestMessage", 0, 1, !IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "Request");
		g1 = createEGenericType(this.getMessage());
		t1.getEBounds().add(g1);
		t2 = addETypeParameter(op, "Response");
		g1 = createEGenericType(this.getMessage());
		t2.getEBounds().add(g1);
		addEParameter(op, theEcorePackage.getEString(), "serviceName", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = initEOperation(getROSServiceManager__CallService__String_Message(), null, "callService", 0, 1, !IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "Request");
		g1 = createEGenericType(this.getMessage());
		t1.getEBounds().add(g1);
		t2 = addETypeParameter(op, "Response");
		g1 = createEGenericType(this.getMessage());
		t2.getEBounds().add(g1);
		addEParameter(op, theEcorePackage.getEString(), "serviceName", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "request", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t2);
		initEOperation(op, g1);

		op = initEOperation(getROSServiceManager__CallService__String_Message_int(), null, "callService", 0, 1, !IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "Request");
		g1 = createEGenericType(this.getMessage());
		t1.getEBounds().add(g1);
		t2 = addETypeParameter(op, "Response");
		g1 = createEGenericType(this.getMessage());
		t2.getEBounds().add(g1);
		addEParameter(op, theEcorePackage.getEString(), "serviceName", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "request", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "timeout", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());
		g1 = createEGenericType(t2);
		initEOperation(op, g1);

		op = initEOperation(getROSServiceManager__CallService__String(), null, "callService", 0, 1, !IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "Request");
		g1 = createEGenericType(this.getMessage());
		t1.getEBounds().add(g1);
		t2 = addETypeParameter(op, "Response");
		g1 = createEGenericType(this.getMessage());
		t2.getEBounds().add(g1);
		addEParameter(op, theEcorePackage.getEString(), "serviceName", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t2);
		initEOperation(op, g1);

		op = initEOperation(getROSServiceManager__CallService__String_Message_boolean(), null, "callService", 0, 1, !IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "Request");
		g1 = createEGenericType(this.getMessage());
		t1.getEBounds().add(g1);
		t2 = addETypeParameter(op, "Response");
		g1 = createEGenericType(this.getMessage());
		t2.getEBounds().add(g1);
		addEParameter(op, theEcorePackage.getEString(), "serviceName", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "request", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEBoolean(), "enableLogging", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t2);
		initEOperation(op, g1);

		op = initEOperation(getROSServiceManager__CallService__String_Message_boolean_int(), null, "callService", 0, 1, !IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "Request");
		g1 = createEGenericType(this.getMessage());
		t1.getEBounds().add(g1);
		t2 = addETypeParameter(op, "Response");
		g1 = createEGenericType(this.getMessage());
		t2.getEBounds().add(g1);
		addEParameter(op, theEcorePackage.getEString(), "serviceName", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "request", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEBoolean(), "enableLogging", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "timeout", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());
		g1 = createEGenericType(t2);
		initEOperation(op, g1);

		op = initEOperation(getROSServiceManager__CallService__String_boolean(), null, "callService", 0, 1, !IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "Request");
		g1 = createEGenericType(this.getMessage());
		t1.getEBounds().add(g1);
		t2 = addETypeParameter(op, "Response");
		g1 = createEGenericType(this.getMessage());
		t2.getEBounds().add(g1);
		addEParameter(op, theEcorePackage.getEString(), "serviceName", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEBoolean(), "enableLogging", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t2);
		initEOperation(op, g1);

		initEOperation(getROSServiceManager__Launch(), null, "launch", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getROSServiceManager__Stop(), null, "stop", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(rosServiceEClass, ROSService.class, "ROSService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getROSService_ServiceName(), theEcorePackage.getEString(), "serviceName", null, 0, 1, ROSService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROSService_ServiceType(), theEcorePackage.getEString(), "serviceType", null, 0, 1, ROSService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROSService_Launched(), theEcorePackage.getEBoolean(), "launched", "false", 0, 1, ROSService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getServiceClient());
		g2 = createEGenericType(rosServiceEClass_Request);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(rosServiceEClass_Response);
		g1.getETypeArguments().add(g2);
		initEAttribute(getROSService_ServiceClient(), g1, "serviceClient", null, 0, 1, ROSService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getROSService_Node(), this.getROSNode(), null, "node", null, 0, 1, ROSService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROSService_DisconnectOnTimeout(), theEcorePackage.getEBoolean(), "disconnectOnTimeout", null, 0, 1, ROSService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getROSService__Launch__ROSNode(), null, "launch", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getROSNode(), "node", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getServiceNotFoundException());

		initEOperation(getROSService__Stop(), null, "stop", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getROSService__NewRequestMessage(), null, "newRequestMessage", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(rosServiceEClass_Request);
		initEOperation(op, g1);

		op = initEOperation(getROSService__Call__Message(), null, "call", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(rosServiceEClass_Request);
		addEParameter(op, g1, "request", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(rosServiceEClass_Response);
		initEOperation(op, g1);

		op = initEOperation(getROSService__Call__Message_boolean(), null, "call", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(rosServiceEClass_Request);
		addEParameter(op, g1, "request", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEBoolean(), "enableLogging", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(rosServiceEClass_Response);
		initEOperation(op, g1);

		op = initEOperation(getROSService__Call__Message_boolean_int(), null, "call", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(rosServiceEClass_Request);
		addEParameter(op, g1, "request", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEBoolean(), "enableLogging", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "timeout", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(rosServiceEClass_Response);
		initEOperation(op, g1);

		initEClass(rosTopicLauncherEClass, ROSTopicLauncher.class, "ROSTopicLauncher", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(this.getROSListener());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEReference(getROSTopicLauncher_ListenerList(), g1, null, "listenerList", null, 0, -1, ROSTopicLauncher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getROSTopicLauncher_Node(), this.getROSNode(), null, "node", null, 0, 1, ROSTopicLauncher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROSTopicLauncher_Running(), theEcorePackage.getEBoolean(), "running", null, 0, 1, ROSTopicLauncher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getROSTopicLauncher__CreateListener__String_String_MessageListener(), null, "createListener", 0, 1, !IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "M");
		g1 = createEGenericType(this.getMessage());
		t1.getEBounds().add(g1);
		addEParameter(op, theEcorePackage.getEString(), "topicName", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "messageType", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getMessageListener());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "messageListener", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getROSTopicLauncher__Launch(), null, "launch", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getROSTopicLauncher__Stop(), null, "stop", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getROSTopicLauncher__Reset(), null, "reset", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(rosListenerEClass, ROSListener.class, "ROSListener", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getROSListener_Running(), theEcorePackage.getEBoolean(), "running", null, 0, 1, ROSListener.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getROSListener_Node(), this.getROSNode(), null, "node", null, 0, 1, ROSListener.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getSubscriber());
		g2 = createEGenericType(rosListenerEClass_T);
		g1.getETypeArguments().add(g2);
		initEAttribute(getROSListener_RosSubscriber(), g1, "rosSubscriber", null, 0, 1, ROSListener.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROSListener_TopicName(), theEcorePackage.getEString(), "topicName", null, 0, 1, ROSListener.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROSListener_MessageType(), theEcorePackage.getEString(), "messageType", null, 0, 1, ROSListener.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getMessageListener());
		g2 = createEGenericType(rosListenerEClass_T);
		g1.getETypeArguments().add(g2);
		initEAttribute(getROSListener_MessageListener(), g1, "messageListener", null, 0, 1, ROSListener.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getROSListener__StartWithLocks__ROSNode(), theEcorePackage.getEBoolean(), "startWithLocks", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getROSNode(), "node", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		op = initEOperation(getROSListener__Start__ROSNode(), null, "start", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getROSNode(), "node", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		op = initEOperation(getROSListener__ConnectSubscriber__ConnectedNode(), null, "connectSubscriber", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getConnectedNode(), "connectedNode", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getROSListener__Stop(), null, "stop", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(apogyAddonsROSFacadeEClass, ApogyAddonsROSFacade.class, "ApogyAddonsROSFacade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getApogyAddonsROSFacade__GetNodeNamePrefix(), theEcorePackage.getEString(), "getNodeNamePrefix", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getApogyAddonsROSFacade__GetROSMasterURI(), theEcorePackage.getEString(), "getROSMasterURI", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getApogyAddonsROSFacade__GetROSHostname(), theEcorePackage.getEString(), "getROSHostname", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getApogyAddonsROSFacade__GetROSIp(), theEcorePackage.getEString(), "getROSIp", 0, 1, !IS_UNIQUE, IS_ORDERED);

		// Initialize data types
		initEDataType(responseLoggerEDataType, ResponseLogger.class, "ResponseLogger", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(nullResponseHandlerEDataType, NullResponseHandler.class, "NullResponseHandler", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(nullRequestHandlerEDataType, NullRequestHandler.class, "NullRequestHandler", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(connectedNodeEDataType, ConnectedNode.class, "ConnectedNode", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(serviceNotFoundExceptionEDataType, ServiceNotFoundException.class, "ServiceNotFoundException", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(messageEDataType, Message.class, "Message", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(messageListenerEDataType, MessageListener.class, "MessageListener", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(abstractNodeMainEDataType, AbstractNodeMain.class, "AbstractNodeMain", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(serviceClientEDataType, ServiceClient.class, "ServiceClient", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(publisherEDataType, Publisher.class, "Publisher", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(subscriberEDataType, Subscriber.class, "Subscriber", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(exceptionEDataType, Exception.class, "Exception", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(hashMapEDataType, HashMap.class, "HashMap", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "documentation", "Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Pierre Allard (Pierre.Allard@canada.ca),\n    Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n    Sebastien Gemme (Sebastien.Gemme@canada.ca),\n    Canadian Space Agency (CSA) - Initial API and implementation",
			 "prefix", "ApogyAddonsROS",
			 "modelName", "ApogyAddonsROS",
			 "operationReflection", "true",
			 "childCreationExtenders", "true",
			 "extensibleProviderFactory", "true",
			 "multipleEditorPages", "false",
			 "copyrightText", "Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Pierre Allard (Pierre.Allard@canada.ca), \n    Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n    Sebastien Gemme (Sebastien.Gemme@canada.ca),\n    Canadian Space Agency (CSA) - Initial API and implementation",
			 "suppressGenModelAnnotations", "false",
			 "dynamicTemplates", "true",
			 "templateDirectory", "platform:/plugin/ca.gc.asc_csa.apogy.common.emf/templates",
			 "modelDirectory", "/ca.gc.asc_csa.apogy.addons.ros/src-generated",
			 "editDirectory", "/ca.gc.asc_csa.apogy.addons.ros.edit/src-generated",
			 "basePackage", "ca.gc.asc_csa.apogy.addons"
		   });	
		addAnnotation
		  (getROSNode__Start(), 
		   source, 
		   new String[] {
			 "documentation", "Starts the ROS node"
		   });	
		addAnnotation
		  (getROSNode__Initialize(), 
		   source, 
		   new String[] {
			 "documentation", "Initializes the ROS node"
		   });	
		addAnnotation
		  (getROSNode__OnStart__ConnectedNode(), 
		   source, 
		   new String[] {
			 "documentation", "Event called when the node is connected to the ROS master;\nstarts the subscriber handler and the service client\'s handler.\n\n@param connectedNode The relevant connected node"
		   });	
		addAnnotation
		  (getROSNode__Restart(), 
		   source, 
		   new String[] {
			 "documentation", "Resets the ROS connection"
		   });	
		addAnnotation
		  (getROSNode__Register__ROSInterface_boolean(), 
		   source, 
		   new String[] {
			 "documentation", "Registers a new module; if the given initialization parameter\nis true, the module will also be initialized.\n\n@param module The ROS interface / module to be registered\n@param initialize Whether or not that module should also be initialized"
		   });	
		addAnnotation
		  (getROSNode__Register__ROSInterface(), 
		   source, 
		   new String[] {
			 "documentation", "Registers and initializes a new module.\n\n@param module The ROS interface / module to be registered and initialized"
		   });	
		addAnnotation
		  (getROSNode__NewFromType__String(), 
		   source, 
		   new String[] {
			 "documentation", "Creates a new variable from a given type\n\n@param messageType The type for the new variable\n@reeturn The newly created variable"
		   });	
		addAnnotation
		  (getROSNode__Shutdown(), 
		   source, 
		   new String[] {
			 "documentation", "Shuts down this ROS node"
		   });	
		addAnnotation
		  (getROSNode__CreatePublisher__String_String(), 
		   source, 
		   new String[] {
			 "documentation", "Creates a new publisher with the\ngiven name and message type\n\n@param topicName The topic name for the newly created publisher\n@param messageType The type for the publisher\'s messages\n@return The newly created publisher"
		   });	
		addAnnotation
		  (getROSNode__CreateServiceManager(), 
		   source, 
		   new String[] {
			 "documentation", "Creates a new service manager\n\n@return The newly created service manager"
		   });	
		addAnnotation
		  (getROSNode__CreateTopicLauncher(), 
		   source, 
		   new String[] {
			 "documentation", "Creates a new topic launcher\n\n@return The newly created topic launcher"
		   });	
		addAnnotation
		  (getROSNode__CreatePublisherManager(), 
		   source, 
		   new String[] {
			 "documentation", "Creates a new publisher manager\n\n@return The newly created publisher manager"
		   });	
		addAnnotation
		  (getROSNode_ConnectedNode(), 
		   source, 
		   new String[] {
			 "documentation", "The underlying ROS node"
		   });	
		addAnnotation
		  (getROSNode_Modules(), 
		   source, 
		   new String[] {
			 "documentation", "The modules that have been registered with this node"
		   });	
		addAnnotation
		  (getROSNode_ServiceManagers(), 
		   source, 
		   new String[] {
			 "documentation", "The service managers that have been associated with this node"
		   });	
		addAnnotation
		  (getROSNode_TopicLaunchers(), 
		   source, 
		   new String[] {
			 "documentation", "The topic launchers that have been associated with this node"
		   });	
		addAnnotation
		  (getROSNode_PublisherManagers(), 
		   source, 
		   new String[] {
			 "documentation", "The publisher managers that have been associated with this node"
		   });	
		addAnnotation
		  (getROSNode_Initialized(), 
		   source, 
		   new String[] {
			 "documentation", "Whether or not the node is currently initialized",
			 "property", "Readonly",
			 "notify", "true",
			 "propertyCategory", "ROS_NODE"
		   });	
		addAnnotation
		  (getROSNode_Connected(), 
		   source, 
		   new String[] {
			 "documentation", "Whether or not the node is currently connected",
			 "property", "Readonly",
			 "notify", "true",
			 "propertyCategory", "ROS_NODE"
		   });	
		addAnnotation
		  (getROSNode_Restarting(), 
		   source, 
		   new String[] {
			 "documentation", "Whether or not the node is currently in the process of restarting",
			 "property", "Readonly",
			 "notify", "true",
			 "propertyCategory", "ROS_NODE"
		   });	
		addAnnotation
		  (getROSNode_EnableAutoRestartOnConnectionLost(), 
		   source, 
		   new String[] {
			 "documentation", "Whether or not the node should automatically restart if the connection\nwas lost.",
			 "property", "Readonly",
			 "notify", "true",
			 "propertyCategory", "ROS_NODE"
		   });	
		addAnnotation
		  (getROSNode_NodeName(), 
		   source, 
		   new String[] {
			 "documentation", "The node\'s name",
			 "property", "Readonly",
			 "notify", "true",
			 "propertyCategory", "ROS_NODE"
		   });	
		addAnnotation
		  (getROSNode_ResponseLogger(), 
		   source, 
		   new String[] {
			 "documentation", "The strategy to log the new responses"
		   });	
		addAnnotation
		  (getROSNode_NullResponseHandler(), 
		   source, 
		   new String[] {
			 "documentation", "The strategy to log the null responses"
		   });	
		addAnnotation
		  (getROSNode_NullRequestHandler(), 
		   source, 
		   new String[] {
			 "documentation", "The strategy to log the null requests"
		   });	
		addAnnotation
		  (getROSInterface__RosInit(), 
		   source, 
		   new String[] {
			 "documentation", "Initializes this module / interface"
		   });	
		addAnnotation
		  (getROSInterface_ServiceManager(), 
		   source, 
		   new String[] {
			 "documentation", "The service manager associated with this module",
			 "property", "Readonly",
			 "children", "true",
			 "notify", "true",
			 "propertyCategory", "ROS_INTERFACE"
		   });	
		addAnnotation
		  (getROSInterface_TopicLauncher(), 
		   source, 
		   new String[] {
			 "documentation", "The topic launcher associated with this module",
			 "property", "Readonly",
			 "children", "true",
			 "notify", "true",
			 "propertyCategory", "ROS_INTERFACE"
		   });	
		addAnnotation
		  (getROSInterface_PublisherManager(), 
		   source, 
		   new String[] {
			 "documentation", "The publisher launcher associated with this module",
			 "property", "Readonly",
			 "children", "true",
			 "notify", "true",
			 "propertyCategory", "ROS_INTERFACE"
		   });	
		addAnnotation
		  (getROSInterface_Node(), 
		   source, 
		   new String[] {
			 "documentation", "The underlying ROS node for this module",
			 "property", "Readonly",
			 "children", "true",
			 "notify", "true",
			 "propertyCategory", "ROS_INTERFACE"
		   });	
		addAnnotation
		  (getROSPublisherManager__CreatePublisher__String_String(), 
		   source, 
		   new String[] {
			 "documentation", "Creates a publisher for the given topic with messages\nof the specified type.\n\n@param topicName The topic that the new publisher will be publishing messages to\n@param messageType The type of the messages the publisher will be posting"
		   });	
		addAnnotation
		  (getROSPublisherManager__Launch(), 
		   source, 
		   new String[] {
			 "documentation", "Launch the topic publishing capability for the publisher manager,\nand implicitly, all of the associated publishers"
		   });	
		addAnnotation
		  (getROSPublisherManager__Stop(), 
		   source, 
		   new String[] {
			 "documentation", "Stop the topic publishing for the publisher manager,\nand implicitly, all of the associated publishers"
		   });	
		addAnnotation
		  (getROSPublisherManager__CreateMessage__String(), 
		   source, 
		   new String[] {
			 "documentation", "Given a particular topic, this determines the associated\npublisher and returns a message of the appropriate type\nfor that publisher.\n\n@param topicName The topic that the new message is to be created for\n@return The newly created message."
		   });	
		addAnnotation
		  (getROSPublisherManager__Publish__String_Message(), 
		   source, 
		   new String[] {
			 "documentation", "Given a particular topic, this determines the associated\npublisher and publishes the given message to that topic.\n\n@param topicName The topic that the given message is to be published to\n@param message The message to be published"
		   });	
		addAnnotation
		  (getROSPublisherManager__GetPublisher__String(), 
		   source, 
		   new String[] {
			 "documentation", "This extracts the associated publisher for the given topic.\n\n@param topicName The topic whose publisher should be extracted\n@return The publisher for that topic (if one exists)"
		   });	
		addAnnotation
		  (getROSPublisherManager_Publishers(), 
		   source, 
		   new String[] {
			 "documentation", "The internal collection of registered publishers"
		   });	
		addAnnotation
		  (getROSPublisherManager_Node(), 
		   source, 
		   new String[] {
			 "documentation", "The underlying ROS node for the publisher manager",
			 "property", "Readonly",
			 "children", "true",
			 "notify", "true",
			 "propertyCategory", "ROS_PUBLISHER_MANAGER"
		   });	
		addAnnotation
		  (getROSPublisherManager_Running(), 
		   source, 
		   new String[] {
			 "documentation", "Whether or not the publisher manager is running (i.e. launched)",
			 "property", "Readonly",
			 "notify", "true",
			 "propertyCategory", "ROS_PUBLISHER_MANAGER"
		   });	
		addAnnotation
		  (getROSPublisher__Launch__ROSNode(), 
		   source, 
		   new String[] {
			 "documentation", "Launches the topic publishing capability for the\ngiven underlying ROS node\n\n@param node The underlying node that this publisher is launching on behalf of"
		   });	
		addAnnotation
		  (getROSPublisher__Publish__Message(), 
		   source, 
		   new String[] {
			 "documentation", "Publishes the given message to the publisher\'s topic\n\n@param message The message to be published to the topic"
		   });	
		addAnnotation
		  (getROSPublisher__NewMessage(), 
		   source, 
		   new String[] {
			 "documentation", "Creates a new message of the correct type for this publisher\n\n@return The newly created message"
		   });	
		addAnnotation
		  (getROSPublisher__Stop(), 
		   source, 
		   new String[] {
			 "documentation", "Stops the publishing of new messages\non behalf of the previously-launched ROS node"
		   });	
		addAnnotation
		  (getROSPublisher_Launched(), 
		   source, 
		   new String[] {
			 "documentation", "Whether or not the publisher has been launched",
			 "property", "Readonly",
			 "notify", "true",
			 "propertyCategory", "ROS_PUBLISHER"
		   });	
		addAnnotation
		  (getROSPublisher_TopicName(), 
		   source, 
		   new String[] {
			 "documentation", "The name for the publisher\'s topic"
		   });	
		addAnnotation
		  (getROSPublisher_MessageType(), 
		   source, 
		   new String[] {
			 "documentation", "A string specifying the type of the publisher\'s messages"
		   });	
		addAnnotation
		  (getROSPublisher_Publisher(), 
		   source, 
		   new String[] {
			 "documentation", "The underlying ROS publisher"
		   });	
		addAnnotation
		  (getROSPublisher_Node(), 
		   source, 
		   new String[] {
			 "documentation", "When launched, the node that publisher is\npublishing messages on behalf of"
		   });	
		addAnnotation
		  (getROSServiceManager__CreateService__String_String(), 
		   source, 
		   new String[] {
			 "documentation", "Creates a service with the given name and type, which\nwill automatically disconnect when a timeout occurs.\n\n@param serviceName The name of the new service\n@param serviceType The type of the new service"
		   });	
		addAnnotation
		  (getROSServiceManager__CreateService__String_String_boolean(), 
		   source, 
		   new String[] {
			 "documentation", "Creates a service with the given name and type.  The\ngiven disconnectOnTimeout value will determine whether or\nnot the service should disconnect if it time\'s out.\n\n@param serviceName The name of the new service\n@param serviceType The type of the new service\n@param disconnectOnTimeout Whether or not the service should disconnect when it times out"
		   });	
		addAnnotation
		  (getROSServiceManager__GetService__String(), 
		   source, 
		   new String[] {
			 "documentation", "Determines and returns the service with the given name\n(if one exists.)\n\n@param serviceName The name of the desired service\n@return The corresponding service (if one exists)"
		   });	
		addAnnotation
		  (getROSServiceManager__CreateRequestMessage__String(), 
		   source, 
		   new String[] {
			 "documentation", "Given the name of a service, the corresponding service\nis determined and if one exists, a new request message\nof the correct type for that service is created.\n\n@param serviceName The name of the service, whose request message type determines the type of the new request message\n@return The newly created request message"
		   });	
		addAnnotation
		  (getROSServiceManager__CallService__String_Message(), 
		   source, 
		   new String[] {
			 "documentation", "Determines the service that corresponds to the given\nservice name; if it exists, the request is made to the\nservice and its corresponding response is returned.\n\nNote: The service\'s logging is enabled for this call.\n\n@param serviceName The name of the service to call\n@param request The request to send to the service\n@return The service\'s response to this call"
		   });	
		addAnnotation
		  (getROSServiceManager__CallService__String_Message_int(), 
		   source, 
		   new String[] {
			 "documentation", "Determines the service that corresponds to the given\nservice name; if it exists, the request is made to the\nservice and its corresponding response is returned.\nIf the service call takes more than the timeout value,\na null response is returned.\n\nNote: The service\'s logging is enabled for this call.\n\n@param serviceName The name of the service to call\n@param request The request to send to the service\n@param timeout, in milliseconds. A negative value means no timeout.\n@return The service\'s response to this call\n@throws A TimeoutException if the call fails to return within the specified timeout."
		   });	
		addAnnotation
		  (getROSServiceManager__CallService__String(), 
		   source, 
		   new String[] {
			 "documentation", "Determines the service that corresponds to the given\nservice name; if it exists, the service is called and\nthe corresponding response is returned.\n\nNote: The service\'s logging is enabled for this call.\n\n@param serviceName The name of the service to call\n@return The service\'s response to this call"
		   });	
		addAnnotation
		  (getROSServiceManager__CallService__String_Message_boolean(), 
		   source, 
		   new String[] {
			 "documentation", "Determines the service that corresponds to the given\nservice name; if it exists, the request is made to the\nservice and its corresponding response is returned.  The\nenable logging value determines whether or not logging\nshould be enabled for this service call.\n\n@param serviceName The name of the service to call\n@param request The request to send to the service\n@param enableLogging Whether or not logging should be enabled for this service call\n@return The service\'s response to this call"
		   });	
		addAnnotation
		  (getROSServiceManager__CallService__String_Message_boolean_int(), 
		   source, 
		   new String[] {
			 "documentation", "Determines the service that corresponds to the given\nservice name; if it exists, the request is made to the\nservice and its corresponding response is returned.  The\nenable logging value determines whether or not logging\nshould be enabled for this service call. If the service\ncall takes more than the timeout value, a null response\nis returned.\n\n@param serviceName The name of the service to call\n@param request The request to send to the service\n@param enableLogging Whether or not logging should be enabled for this service call\n@param timeout, in milliseconds. A negative value means no timeout.\n@return The service\'s response to this call\n@throws A TimeoutException if the call fails to return within the specified timeout."
		   });	
		addAnnotation
		  (getROSServiceManager__CallService__String_boolean(), 
		   source, 
		   new String[] {
			 "documentation", "Determines the service that corresponds to the given\nservice name; if it exists, the call is made to the\nservice and the corresponding response is returned.\nThe enable logging value determines whether or not\nlogging should be enabled for this service call.\n\n@param serviceName The name of the service to call\n@param enableLogging Whether or not logging should be enabled for this service call\n@return The service\'s response to this call"
		   });	
		addAnnotation
		  (getROSServiceManager__Launch(), 
		   source, 
		   new String[] {
			 "documentation", "Launches the service manager and implicitly, launches\nall of the manager\'s associated services."
		   });	
		addAnnotation
		  (getROSServiceManager__Stop(), 
		   source, 
		   new String[] {
			 "documentation", "Stops the service manager and implicitly, stops\nall of the manager\'s associated services."
		   });	
		addAnnotation
		  (getROSServiceManager_Services(), 
		   source, 
		   new String[] {
			 "documentation", "The internal collection of registered services."
		   });	
		addAnnotation
		  (getROSServiceManager_Node(), 
		   source, 
		   new String[] {
			 "documentation", "The underlying ROS node for this service manager.",
			 "property", "Readonly",
			 "children", "true",
			 "notify", "true",
			 "propertyCategory", "ROS_SERVICE_MANAGER"
		   });	
		addAnnotation
		  (getROSServiceManager_Running(), 
		   source, 
		   new String[] {
			 "documentation", "Whether or not the service manager is currently running (i.e. launched)",
			 "property", "Readonly",
			 "notify", "true",
			 "propertyCategory", "ROS_SERVICE_MANAGER"
		   });	
		addAnnotation
		  (getROSService__Launch__ROSNode(), 
		   source, 
		   new String[] {
			 "documentation", "Launches the service for the given underlying ROS node,\nallowing it to receive requests.\n\n@param node The ROS node that this service corresponds to\n@throws ServiceNotFoundException Thrown if the service could not be resolved to the given ROS node."
		   });	
		addAnnotation
		  (getROSService__Stop(), 
		   source, 
		   new String[] {
			 "documentation", "Stops the service from processing anymore requests."
		   });	
		addAnnotation
		  (getROSService__NewRequestMessage(), 
		   source, 
		   new String[] {
			 "documentation", "Returns a new request message, whose type is valid for\nuse in calls to this service."
		   });	
		addAnnotation
		  (getROSService__Call__Message(), 
		   source, 
		   new String[] {
			 "documentation", "Calls the service with the given request and the\nresponse of that call is returned.\n\nNote: The service\'s logging is enabled for this call\n\n@param request The request to send to this service\n@return The service\'s response to the call"
		   });	
		addAnnotation
		  (getROSService__Call__Message_boolean(), 
		   source, 
		   new String[] {
			 "documentation", "Calls the service with the given request and the\nresponse of that call is returned.  The enable logging\nvalue will determine whether or not logging should be\nenabled for this call.\n\n@param request The rrequest to send to this service\n@param enableLogging Whether or not this call should be logged\n@return The service\'s response to the call"
		   });	
		addAnnotation
		  (getROSService__Call__Message_boolean_int(), 
		   source, 
		   new String[] {
			 "documentation", "Calls the service with the given request and the\nresponse of that call is returned.  The enable logging\nvalue will determine whether or not logging should be\nenabled for this call. If the service call takes more\nthan the timeout value, a null response is returned.\n\n@param request The rrequest to send to this service\n@param enableLogging Whether or not this call should be logged\n@param timeout, in milliseconds. A negative value means no timeout.\n@return The service\'s response to the call"
		   });	
		addAnnotation
		  (getROSService_ServiceName(), 
		   source, 
		   new String[] {
			 "documentation", "The service\'s name"
		   });	
		addAnnotation
		  (getROSService_ServiceType(), 
		   source, 
		   new String[] {
			 "documentation", "The type of the service"
		   });	
		addAnnotation
		  (getROSService_Launched(), 
		   source, 
		   new String[] {
			 "documentation", "Whether or not the service has been launched"
		   });	
		addAnnotation
		  (getROSService_ServiceClient(), 
		   source, 
		   new String[] {
			 "documentation", "The underlying ROS service client"
		   });	
		addAnnotation
		  (getROSService_Node(), 
		   source, 
		   new String[] {
			 "documentation", "The underlying ROS node"
		   });	
		addAnnotation
		  (getROSService_DisconnectOnTimeout(), 
		   source, 
		   new String[] {
			 "documentation", "Whether or not the service should disconnect\nif it times out"
		   });	
		addAnnotation
		  (getROSTopicLauncher__CreateListener__String_String_MessageListener(), 
		   source, 
		   new String[] {
			 "documentation", "Creates a listener, given the topic\'s name,\nmessage type and its underlying ROS message listener.\n\n@param topicName The name of the topic to create the listener for\n@param messageType The type of the messages for the specified topic\n@param messageListener The underlying ROS message listener for that topic"
		   });	
		addAnnotation
		  (getROSTopicLauncher__Launch(), 
		   source, 
		   new String[] {
			 "documentation", "Launches the topic launcher and implicitly, all of\nits registered topics"
		   });	
		addAnnotation
		  (getROSTopicLauncher__Stop(), 
		   source, 
		   new String[] {
			 "documentation", "Stops the topic launcher and implicitly, all of its\nregistered topics"
		   });	
		addAnnotation
		  (getROSTopicLauncher__Reset(), 
		   source, 
		   new String[] {
			 "documentation", "Resets the topic launcher and its registered topics\nby stopping them and then launching them again."
		   });	
		addAnnotation
		  (getROSTopicLauncher_ListenerList(), 
		   source, 
		   new String[] {
			 "documentation", "The internal list of associated listeners"
		   });	
		addAnnotation
		  (getROSTopicLauncher_Node(), 
		   source, 
		   new String[] {
			 "documentation", "The underlying ROS node",
			 "property", "Readonly",
			 "children", "true",
			 "notify", "true",
			 "propertyCategory", "ROS_TOPIC_LAUNCHER"
		   });	
		addAnnotation
		  (getROSTopicLauncher_Running(), 
		   source, 
		   new String[] {
			 "documentation", "Whether or not the topic launcher is currently running (i.e. launched)",
			 "property", "Readonly",
			 "notify", "true",
			 "propertyCategory", "ROS_TOPIC_LAUNCHER"
		   });	
		addAnnotation
		  (getROSListener__StartWithLocks__ROSNode(), 
		   source, 
		   new String[] {
			 "documentation", "Starts the subscriber, with it initially locked\n\nNote : Needed to lock because of a bug on Windows =(\n       The bug was that the program couldn\'t start\n       multiple subscribers at once.\n\n@param node The underlying ROS node to listen on\n@return Whether or not the listener started running\n@throws Exception Thrown if any underlying exception occurs"
		   });	
		addAnnotation
		  (getROSListener__Start__ROSNode(), 
		   source, 
		   new String[] {
			 "documentation", "Starts the subscriber\n\nNote : For Linux there\'s no need to lock, subscribers\n       can subscribe at the same time.\n\n@param node The underlying ROS node to listen on\n@throws Exception Thrown if any underlying exception occurs"
		   });	
		addAnnotation
		  (getROSListener__ConnectSubscriber__ConnectedNode(), 
		   source, 
		   new String[] {
			 "documentation", "Connects this subscriber to this listener\'s events\n\n@ param connectedNode The node to subscribe to this listener"
		   });	
		addAnnotation
		  (getROSListener__Stop(), 
		   source, 
		   new String[] {
			 "documentation", "Stops the subscriber"
		   });	
		addAnnotation
		  (getROSListener_Running(), 
		   source, 
		   new String[] {
			 "documentation", "Whether or not the listener is currently running"
		   });	
		addAnnotation
		  (getROSListener_Node(), 
		   source, 
		   new String[] {
			 "documentation", "The underlying ROS node"
		   });	
		addAnnotation
		  (getROSListener_RosSubscriber(), 
		   source, 
		   new String[] {
			 "documentation", "The subscriber for this listener\'s events"
		   });	
		addAnnotation
		  (getROSListener_TopicName(), 
		   source, 
		   new String[] {
			 "documentation", "The topic this listener is subscribed to"
		   });	
		addAnnotation
		  (getROSListener_MessageType(), 
		   source, 
		   new String[] {
			 "documentation", "The type of messages this listener is subscribed to"
		   });	
		addAnnotation
		  (getROSListener_MessageListener(), 
		   source, 
		   new String[] {
			 "documentation", "The underlying ROS message listener"
		   });	
		addAnnotation
		  (getApogyAddonsROSFacade__GetNodeNamePrefix(), 
		   source, 
		   new String[] {
			 "documentation", "Returns a prefix for a Node name (typically used for client node)\nthat contains the user and machine name.\n@return The node name prefix."
		   });	
		addAnnotation
		  (getApogyAddonsROSFacade__GetROSMasterURI(), 
		   source, 
		   new String[] {
			 "documentation", "*\nReturns the ROS Master URI value.\n@return The ROS_MASTER_URI environment variable value."
		   });	
		addAnnotation
		  (getApogyAddonsROSFacade__GetROSHostname(), 
		   source, 
		   new String[] {
			 "documentation", "*\nReturns the ROS Host Name value.\n@return The ROS_HOSTNAME environment variable value."
		   });	
		addAnnotation
		  (getApogyAddonsROSFacade__GetROSIp(), 
		   source, 
		   new String[] {
			 "documentation", "*\nReturns the ROS IP value.\n@return The ROS_IP environment variable value."
		   });
	}

} //ApogyAddonsROSPackageImpl
