/**
 * Canadian Space Agency / Agence spatiale canadienne 2013 Copyrights (c)
 */
package ca.gc.asc_csa.eclipse.ros.impl;

import ca.gc.asc_csa.eclipse.ros.*;
import java.util.HashMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.ros.exception.ServiceNotFoundException;
import org.ros.internal.message.Message;
import org.ros.message.MessageListener;
import org.ros.node.AbstractNodeMain;
import org.ros.node.ConnectedNode;
import org.ros.node.service.ServiceClient;
import org.ros.node.topic.Publisher;
import org.ros.node.topic.Subscriber;
import ca.gc.asc_csa.eclipse.ros.RosFactory;
import ca.gc.asc_csa.eclipse.ros.RosListener;
import ca.gc.asc_csa.eclipse.ros.RosNode;
import ca.gc.asc_csa.eclipse.ros.RosPackage;
import ca.gc.asc_csa.eclipse.ros.RosPublisher;
import ca.gc.asc_csa.eclipse.ros.RosPublisherManager;
import ca.gc.asc_csa.eclipse.ros.RosService;
import ca.gc.asc_csa.eclipse.ros.RosServiceManager;
import ca.gc.asc_csa.eclipse.ros.RosTopicLauncher;
import ca.gc.asc_csa.eclipse.ros.utilities.NullRequestHandler;
import ca.gc.asc_csa.eclipse.ros.utilities.NullResponseHandler;
import ca.gc.asc_csa.eclipse.ros.utilities.ResponseLogger;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RosFactoryImpl extends EFactoryImpl implements RosFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static RosFactory init()
  {
		try {
			RosFactory theRosFactory = (RosFactory)EPackage.Registry.INSTANCE.getEFactory(RosPackage.eNS_URI);
			if (theRosFactory != null) {
				return theRosFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RosFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public RosFactoryImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public EObject create(EClass eClass)
  {
		switch (eClass.getClassifierID()) {
			case RosPackage.ROS_NODE: return createRosNode();
			case RosPackage.ROS_PUBLISHER_MANAGER: return createRosPublisherManager();
			case RosPackage.ROS_PUBLISHER: return createRosPublisher();
			case RosPackage.ROS_SERVICE_MANAGER: return createRosServiceManager();
			case RosPackage.ROS_SERVICE: return createRosService();
			case RosPackage.ROS_TOPIC_LAUNCHER: return createRosTopicLauncher();
			case RosPackage.ROS_LISTENER: return createRosListener();
			case RosPackage.ROS_FACADE: return createRosFacade();
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
  public Object createFromString(EDataType eDataType, String initialValue)
  {
		switch (eDataType.getClassifierID()) {
			case RosPackage.RESPONSE_LOGGER:
				return createResponseLoggerFromString(eDataType, initialValue);
			case RosPackage.NULL_RESPONSE_HANDLER:
				return createNullResponseHandlerFromString(eDataType, initialValue);
			case RosPackage.NULL_REQUEST_HANDLER:
				return createNullRequestHandlerFromString(eDataType, initialValue);
			case RosPackage.CONNECTED_NODE:
				return createConnectedNodeFromString(eDataType, initialValue);
			case RosPackage.SERVICE_NOT_FOUND_EXCEPTION:
				return createServiceNotFoundExceptionFromString(eDataType, initialValue);
			case RosPackage.MESSAGE:
				return createMessageFromString(eDataType, initialValue);
			case RosPackage.MESSAGE_LISTENER:
				return createMessageListenerFromString(eDataType, initialValue);
			case RosPackage.ABSTRACT_NODE_MAIN:
				return createAbstractNodeMainFromString(eDataType, initialValue);
			case RosPackage.SERVICE_CLIENT:
				return createServiceClientFromString(eDataType, initialValue);
			case RosPackage.PUBLISHER:
				return createPublisherFromString(eDataType, initialValue);
			case RosPackage.SUBSCRIBER:
				return createSubscriberFromString(eDataType, initialValue);
			case RosPackage.EXCEPTION:
				return createExceptionFromString(eDataType, initialValue);
			case RosPackage.HASH_MAP:
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
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
		switch (eDataType.getClassifierID()) {
			case RosPackage.RESPONSE_LOGGER:
				return convertResponseLoggerToString(eDataType, instanceValue);
			case RosPackage.NULL_RESPONSE_HANDLER:
				return convertNullResponseHandlerToString(eDataType, instanceValue);
			case RosPackage.NULL_REQUEST_HANDLER:
				return convertNullRequestHandlerToString(eDataType, instanceValue);
			case RosPackage.CONNECTED_NODE:
				return convertConnectedNodeToString(eDataType, instanceValue);
			case RosPackage.SERVICE_NOT_FOUND_EXCEPTION:
				return convertServiceNotFoundExceptionToString(eDataType, instanceValue);
			case RosPackage.MESSAGE:
				return convertMessageToString(eDataType, instanceValue);
			case RosPackage.MESSAGE_LISTENER:
				return convertMessageListenerToString(eDataType, instanceValue);
			case RosPackage.ABSTRACT_NODE_MAIN:
				return convertAbstractNodeMainToString(eDataType, instanceValue);
			case RosPackage.SERVICE_CLIENT:
				return convertServiceClientToString(eDataType, instanceValue);
			case RosPackage.PUBLISHER:
				return convertPublisherToString(eDataType, instanceValue);
			case RosPackage.SUBSCRIBER:
				return convertSubscriberToString(eDataType, instanceValue);
			case RosPackage.EXCEPTION:
				return convertExceptionToString(eDataType, instanceValue);
			case RosPackage.HASH_MAP:
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
  public <T extends Message> RosPublisher<T> createRosPublisher()
  {
		RosPublisherImpl<T> rosPublisher = new RosPublisherImpl<T>();
		return rosPublisher;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public <Request extends Message, Response extends Message> RosService<Request, Response> createRosService()
  {
		RosServiceImpl<Request, Response> rosService = new RosServiceImpl<Request, Response>();
		return rosService;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public <T extends Message> RosListener<T> createRosListener()
  {
		RosListenerImpl<T> rosListener = new RosListenerImpl<T>();
		return rosListener;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RosFacade createRosFacade() {
		RosFacadeImpl rosFacade = new RosFacadeImpl();
		return rosFacade;
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public RosPublisherManager createRosPublisherManager()
  {
		RosPublisherManagerImpl rosPublisherManager = new RosPublisherManagerImpl();
		return rosPublisherManager;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public RosServiceManager createRosServiceManager()
  {
		RosServiceManagerImpl rosServiceManager = new RosServiceManagerImpl();
		return rosServiceManager;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public RosTopicLauncher createRosTopicLauncher()
  {
		RosTopicLauncherImpl rosTopicLauncher = new RosTopicLauncherImpl();
		return rosTopicLauncher;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public RosNode createRosNode()
  {
		RosNodeImpl rosNode = new RosNodeImpl();
		return rosNode;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ResponseLogger createResponseLoggerFromString(EDataType eDataType, String initialValue)
  {
		return (ResponseLogger)super.createFromString(eDataType, initialValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertResponseLoggerToString(EDataType eDataType, Object instanceValue)
  {
		return super.convertToString(eDataType, instanceValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NullResponseHandler createNullResponseHandlerFromString(EDataType eDataType, String initialValue)
  {
		return (NullResponseHandler)super.createFromString(eDataType, initialValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertNullResponseHandlerToString(EDataType eDataType, Object instanceValue)
  {
		return super.convertToString(eDataType, instanceValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NullRequestHandler createNullRequestHandlerFromString(EDataType eDataType, String initialValue)
  {
		return (NullRequestHandler)super.createFromString(eDataType, initialValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertNullRequestHandlerToString(EDataType eDataType, Object instanceValue)
  {
		return super.convertToString(eDataType, instanceValue);
	}
  
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Message createMessageFromString(EDataType eDataType, String initialValue)
  {
		return (Message)super.createFromString(eDataType, initialValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertMessageToString(EDataType eDataType, Object instanceValue)
  {
		return super.convertToString(eDataType, instanceValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Publisher<?> createPublisherFromString(EDataType eDataType, String initialValue)
  {
		return (Publisher<?>)super.createFromString(initialValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertPublisherToString(EDataType eDataType, Object instanceValue)
  {
		return super.convertToString(instanceValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Subscriber<?> createSubscriberFromString(EDataType eDataType, String initialValue)
  {
		return (Subscriber<?>)super.createFromString(initialValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertSubscriberToString(EDataType eDataType, Object instanceValue)
  {
		return super.convertToString(instanceValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public MessageListener<?> createMessageListenerFromString(EDataType eDataType, String initialValue)
  {
		return (MessageListener<?>)super.createFromString(initialValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertMessageListenerToString(EDataType eDataType, Object instanceValue)
  {
		return super.convertToString(instanceValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ServiceClient<?, ?> createServiceClientFromString(EDataType eDataType, String initialValue)
  {
		return (ServiceClient<?, ?>)super.createFromString(initialValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertServiceClientToString(EDataType eDataType, Object instanceValue)
  {
		return super.convertToString(instanceValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ServiceNotFoundException createServiceNotFoundExceptionFromString(EDataType eDataType, String initialValue)
  {
		return (ServiceNotFoundException)super.createFromString(eDataType, initialValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertServiceNotFoundExceptionToString(EDataType eDataType, Object instanceValue)
  {
		return super.convertToString(eDataType, instanceValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Exception createExceptionFromString(EDataType eDataType, String initialValue)
  {
		return (Exception)super.createFromString(eDataType, initialValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertExceptionToString(EDataType eDataType, Object instanceValue)
  {
		return super.convertToString(eDataType, instanceValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public HashMap<?, ?> createHashMapFromString(EDataType eDataType, String initialValue)
  {
		return (HashMap<?, ?>)super.createFromString(initialValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertHashMapToString(EDataType eDataType, Object instanceValue)
  {
		return super.convertToString(instanceValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public AbstractNodeMain createAbstractNodeMainFromString(EDataType eDataType, String initialValue)
  {
		return (AbstractNodeMain)super.createFromString(eDataType, initialValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertAbstractNodeMainToString(EDataType eDataType, Object instanceValue)
  {
		return super.convertToString(eDataType, instanceValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ConnectedNode createConnectedNodeFromString(EDataType eDataType, String initialValue)
  {
		return (ConnectedNode)super.createFromString(eDataType, initialValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertConnectedNodeToString(EDataType eDataType, Object instanceValue)
  {
		return super.convertToString(eDataType, instanceValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public RosPackage getRosPackage()
  {
		return (RosPackage)getEPackage();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static RosPackage getPackage()
  {
		return RosPackage.eINSTANCE;
	}

} //RosFactoryImpl
