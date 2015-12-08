/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.ros.impl;

import java.util.HashMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.symphony.addons.ros.*;
import org.eclipse.symphony.addons.ros.utilities.NullRequestHandler;
import org.eclipse.symphony.addons.ros.utilities.NullResponseHandler;
import org.eclipse.symphony.addons.ros.utilities.ResponseLogger;
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
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Symphony__AddonsROSFactoryImpl extends EFactoryImpl implements Symphony__AddonsROSFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Symphony__AddonsROSFactory init() {
		try {
			Symphony__AddonsROSFactory theSymphony__AddonsROSFactory = (Symphony__AddonsROSFactory)EPackage.Registry.INSTANCE.getEFactory(Symphony__AddonsROSPackage.eNS_URI);
			if (theSymphony__AddonsROSFactory != null) {
				return theSymphony__AddonsROSFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Symphony__AddonsROSFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__AddonsROSFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Symphony__AddonsROSPackage.ROS_NODE: return createROSNode();
			case Symphony__AddonsROSPackage.ROS_PUBLISHER_MANAGER: return createROSPublisherManager();
			case Symphony__AddonsROSPackage.ROS_PUBLISHER: return createROSPublisher();
			case Symphony__AddonsROSPackage.ROS_SERVICE_MANAGER: return createROSServiceManager();
			case Symphony__AddonsROSPackage.ROS_SERVICE: return createROSService();
			case Symphony__AddonsROSPackage.ROS_TOPIC_LAUNCHER: return createROSTopicLauncher();
			case Symphony__AddonsROSPackage.ROS_LISTENER: return createROSListener();
			case Symphony__AddonsROSPackage.SYMPHONY_ADDONS_ROS_FACADE: return createSymphony__AddonsROSFacade();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case Symphony__AddonsROSPackage.RESPONSE_LOGGER:
				return createResponseLoggerFromString(eDataType, initialValue);
			case Symphony__AddonsROSPackage.NULL_RESPONSE_HANDLER:
				return createNullResponseHandlerFromString(eDataType, initialValue);
			case Symphony__AddonsROSPackage.NULL_REQUEST_HANDLER:
				return createNullRequestHandlerFromString(eDataType, initialValue);
			case Symphony__AddonsROSPackage.CONNECTED_NODE:
				return createConnectedNodeFromString(eDataType, initialValue);
			case Symphony__AddonsROSPackage.SERVICE_NOT_FOUND_EXCEPTION:
				return createServiceNotFoundExceptionFromString(eDataType, initialValue);
			case Symphony__AddonsROSPackage.MESSAGE:
				return createMessageFromString(eDataType, initialValue);
			case Symphony__AddonsROSPackage.MESSAGE_LISTENER:
				return createMessageListenerFromString(eDataType, initialValue);
			case Symphony__AddonsROSPackage.ABSTRACT_NODE_MAIN:
				return createAbstractNodeMainFromString(eDataType, initialValue);
			case Symphony__AddonsROSPackage.SERVICE_CLIENT:
				return createServiceClientFromString(eDataType, initialValue);
			case Symphony__AddonsROSPackage.PUBLISHER:
				return createPublisherFromString(eDataType, initialValue);
			case Symphony__AddonsROSPackage.SUBSCRIBER:
				return createSubscriberFromString(eDataType, initialValue);
			case Symphony__AddonsROSPackage.EXCEPTION:
				return createExceptionFromString(eDataType, initialValue);
			case Symphony__AddonsROSPackage.HASH_MAP:
				return createHashMapFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case Symphony__AddonsROSPackage.RESPONSE_LOGGER:
				return convertResponseLoggerToString(eDataType, instanceValue);
			case Symphony__AddonsROSPackage.NULL_RESPONSE_HANDLER:
				return convertNullResponseHandlerToString(eDataType, instanceValue);
			case Symphony__AddonsROSPackage.NULL_REQUEST_HANDLER:
				return convertNullRequestHandlerToString(eDataType, instanceValue);
			case Symphony__AddonsROSPackage.CONNECTED_NODE:
				return convertConnectedNodeToString(eDataType, instanceValue);
			case Symphony__AddonsROSPackage.SERVICE_NOT_FOUND_EXCEPTION:
				return convertServiceNotFoundExceptionToString(eDataType, instanceValue);
			case Symphony__AddonsROSPackage.MESSAGE:
				return convertMessageToString(eDataType, instanceValue);
			case Symphony__AddonsROSPackage.MESSAGE_LISTENER:
				return convertMessageListenerToString(eDataType, instanceValue);
			case Symphony__AddonsROSPackage.ABSTRACT_NODE_MAIN:
				return convertAbstractNodeMainToString(eDataType, instanceValue);
			case Symphony__AddonsROSPackage.SERVICE_CLIENT:
				return convertServiceClientToString(eDataType, instanceValue);
			case Symphony__AddonsROSPackage.PUBLISHER:
				return convertPublisherToString(eDataType, instanceValue);
			case Symphony__AddonsROSPackage.SUBSCRIBER:
				return convertSubscriberToString(eDataType, instanceValue);
			case Symphony__AddonsROSPackage.EXCEPTION:
				return convertExceptionToString(eDataType, instanceValue);
			case Symphony__AddonsROSPackage.HASH_MAP:
				return convertHashMapToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ROSNode createROSNode() {
		ROSNodeImpl rosNode = new ROSNodeImpl();
		return rosNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ROSPublisherManager createROSPublisherManager() {
		ROSPublisherManagerImpl rosPublisherManager = new ROSPublisherManagerImpl();
		return rosPublisherManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends Message> ROSPublisher<T> createROSPublisher() {
		ROSPublisherImpl<T> rosPublisher = new ROSPublisherImpl<T>();
		return rosPublisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ROSServiceManager createROSServiceManager() {
		ROSServiceManagerImpl rosServiceManager = new ROSServiceManagerImpl();
		return rosServiceManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <Request extends Message, Response extends Message> ROSService<Request, Response> createROSService() {
		ROSServiceImpl<Request, Response> rosService = new ROSServiceImpl<Request, Response>();
		return rosService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ROSTopicLauncher createROSTopicLauncher() {
		ROSTopicLauncherImpl rosTopicLauncher = new ROSTopicLauncherImpl();
		return rosTopicLauncher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends Message> ROSListener<T> createROSListener() {
		ROSListenerImpl<T> rosListener = new ROSListenerImpl<T>();
		return rosListener;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__AddonsROSFacade createSymphony__AddonsROSFacade() {
		Symphony__AddonsROSFacadeImpl symphony__AddonsROSFacade = new Symphony__AddonsROSFacadeImpl();
		return symphony__AddonsROSFacade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseLogger createResponseLoggerFromString(EDataType eDataType, String initialValue) {
		return (ResponseLogger)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResponseLoggerToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NullResponseHandler createNullResponseHandlerFromString(EDataType eDataType, String initialValue) {
		return (NullResponseHandler)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNullResponseHandlerToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NullRequestHandler createNullRequestHandlerFromString(EDataType eDataType, String initialValue) {
		return (NullRequestHandler)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNullRequestHandlerToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectedNode createConnectedNodeFromString(EDataType eDataType, String initialValue) {
		return (ConnectedNode)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConnectedNodeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceNotFoundException createServiceNotFoundExceptionFromString(EDataType eDataType, String initialValue) {
		return (ServiceNotFoundException)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertServiceNotFoundExceptionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message createMessageFromString(EDataType eDataType, String initialValue) {
		return (Message)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageListener<?> createMessageListenerFromString(EDataType eDataType, String initialValue) {
		return (MessageListener<?>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageListenerToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractNodeMain createAbstractNodeMainFromString(EDataType eDataType, String initialValue) {
		return (AbstractNodeMain)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAbstractNodeMainToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceClient<?, ?> createServiceClientFromString(EDataType eDataType, String initialValue) {
		return (ServiceClient<?, ?>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertServiceClientToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Publisher<?> createPublisherFromString(EDataType eDataType, String initialValue) {
		return (Publisher<?>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPublisherToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subscriber<?> createSubscriberFromString(EDataType eDataType, String initialValue) {
		return (Subscriber<?>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSubscriberToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exception createExceptionFromString(EDataType eDataType, String initialValue) {
		return (Exception)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExceptionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HashMap<?, ?> createHashMapFromString(EDataType eDataType, String initialValue) {
		return (HashMap<?, ?>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHashMapToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__AddonsROSPackage getSymphony__AddonsROSPackage() {
		return (Symphony__AddonsROSPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Symphony__AddonsROSPackage getPackage() {
		return Symphony__AddonsROSPackage.eINSTANCE;
	}

} //Symphony__AddonsROSFactoryImpl
