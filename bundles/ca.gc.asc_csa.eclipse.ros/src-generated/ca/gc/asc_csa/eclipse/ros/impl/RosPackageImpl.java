/**
 * Canadian Space Agency / Agence spatiale canadienne 2013 Copyrights (c)
 */
package ca.gc.asc_csa.eclipse.ros.impl;

import ca.gc.asc_csa.eclipse.ros.RosFacade;
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
import org.ros.exception.ServiceNotFoundException;
import org.ros.internal.message.Message;
import org.ros.message.MessageListener;
import org.ros.node.AbstractNodeMain;
import org.ros.node.ConnectedNode;
import org.ros.node.service.ServiceClient;
import org.ros.node.topic.Publisher;
import org.ros.node.topic.Subscriber;

import ca.gc.asc_csa.eclipse.ros.RosFactory;
import ca.gc.asc_csa.eclipse.ros.RosInterface;
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
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RosPackageImpl extends EPackageImpl implements RosPackage
{
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
  private EClass rosPublisherEClass = null;

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
  private EClass rosListenerEClass = null;

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rosFacadeEClass = null;

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
  private EClass rosServiceManagerEClass = null;

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
  private EClass rosNodeEClass = null;

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
  private EDataType messageEDataType = null;

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
  private EDataType messageListenerEDataType = null;

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
  private EDataType serviceNotFoundExceptionEDataType = null;

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
  private EDataType connectedNodeEDataType = null;

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
	 * @see ca.gc.asc_csa.eclipse.ros.RosPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
  private RosPackageImpl()
  {
		super(eNS_URI, RosFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RosPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
  public static RosPackage init()
  {
		if (isInited) return (RosPackage)EPackage.Registry.INSTANCE.getEPackage(RosPackage.eNS_URI);

		// Obtain or create and register package
		RosPackageImpl theRosPackage = (RosPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RosPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RosPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theRosPackage.createPackageContents();

		// Initialize created meta-data
		theRosPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRosPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RosPackage.eNS_URI, theRosPackage);
		return theRosPackage;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getRosInterface()
  {
		return rosInterfaceEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getRosInterface_ServiceManager()
  {
		return (EReference)rosInterfaceEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getRosInterface_TopicLauncher()
  {
		return (EReference)rosInterfaceEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getRosInterface_PublisherManager()
  {
		return (EReference)rosInterfaceEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getRosInterface_Node()
  {
		return (EReference)rosInterfaceEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getRosInterface__RosInit()
  {
		return rosInterfaceEClass.getEOperations().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getRosPublisher()
  {
		return rosPublisherEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getRosPublisher_Launched()
  {
		return (EAttribute)rosPublisherEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getRosPublisher_TopicName()
  {
		return (EAttribute)rosPublisherEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getRosPublisher_MessageType()
  {
		return (EAttribute)rosPublisherEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getRosPublisher_Publisher()
  {
		return (EAttribute)rosPublisherEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getRosPublisher_Node()
  {
		return (EReference)rosPublisherEClass.getEStructuralFeatures().get(4);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getRosPublisher__Launch__RosNode()
  {
		return rosPublisherEClass.getEOperations().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getRosPublisher__Publish__Message()
  {
		return rosPublisherEClass.getEOperations().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getRosPublisher__NewMessage()
  {
		return rosPublisherEClass.getEOperations().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getRosPublisher__Stop()
  {
		return rosPublisherEClass.getEOperations().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getRosService()
  {
		return rosServiceEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getRosService_ServiceName()
  {
		return (EAttribute)rosServiceEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getRosService_ServiceType()
  {
		return (EAttribute)rosServiceEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getRosService_Launched()
  {
		return (EAttribute)rosServiceEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getRosService_ServiceClient()
  {
		return (EAttribute)rosServiceEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getRosService_Node()
  {
		return (EReference)rosServiceEClass.getEStructuralFeatures().get(4);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getRosService_DisconnectOnTimeout()
  {
		return (EAttribute)rosServiceEClass.getEStructuralFeatures().get(5);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getRosService__Launch__RosNode()
  {
		return rosServiceEClass.getEOperations().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getRosService__Stop()
  {
		return rosServiceEClass.getEOperations().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getRosService__NewRequestMessage()
  {
		return rosServiceEClass.getEOperations().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getRosService__Call__Message()
  {
		return rosServiceEClass.getEOperations().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getRosService__Call__Message_boolean()
  {
		return rosServiceEClass.getEOperations().get(4);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getRosListener()
  {
		return rosListenerEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getRosListener_Running()
  {
		return (EAttribute)rosListenerEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getRosListener_Node()
  {
		return (EReference)rosListenerEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getRosListener_RosSubscriber()
  {
		return (EAttribute)rosListenerEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getRosListener_TopicName()
  {
		return (EAttribute)rosListenerEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getRosListener_MessageType()
  {
		return (EAttribute)rosListenerEClass.getEStructuralFeatures().get(4);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getRosListener_MessageListener()
  {
		return (EAttribute)rosListenerEClass.getEStructuralFeatures().get(5);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getRosListener__StartWithLocks__RosNode()
  {
		return rosListenerEClass.getEOperations().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getRosListener__Start__RosNode()
  {
		return rosListenerEClass.getEOperations().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getRosListener__ConnectSubscriber__ConnectedNode()
  {
		return rosListenerEClass.getEOperations().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getRosListener__Stop()
  {
		return rosListenerEClass.getEOperations().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRosFacade() {
		return rosFacadeEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRosFacade__GetNodeNamePrefix() {
		return rosFacadeEClass.getEOperations().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRosFacade__GetROSMasterURI() {
		return rosFacadeEClass.getEOperations().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRosFacade__GetROSHostname() {
		return rosFacadeEClass.getEOperations().get(2);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRosFacade__GetROSIp() {
		return rosFacadeEClass.getEOperations().get(3);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getRosNode()
  {
		return rosNodeEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getRosNode_ConnectedNode()
  {
		return (EAttribute)rosNodeEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getRosNode_Modules()
  {
		return (EReference)rosNodeEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getRosNode_ServiceManagers()
  {
		return (EReference)rosNodeEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getRosNode_TopicLaunchers()
  {
		return (EReference)rosNodeEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getRosNode_PublisherManagers()
  {
		return (EReference)rosNodeEClass.getEStructuralFeatures().get(4);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getRosNode_Initialized()
  {
		return (EAttribute)rosNodeEClass.getEStructuralFeatures().get(5);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getRosNode_Connected()
  {
		return (EAttribute)rosNodeEClass.getEStructuralFeatures().get(6);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getRosNode_Restarting()
  {
		return (EAttribute)rosNodeEClass.getEStructuralFeatures().get(7);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRosNode_EnableAutoRestartOnConnectionLost() {
		return (EAttribute)rosNodeEClass.getEStructuralFeatures().get(8);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getRosNode_NodeName()
  {
		return (EAttribute)rosNodeEClass.getEStructuralFeatures().get(9);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getRosNode_ResponseLogger()
  {
		return (EAttribute)rosNodeEClass.getEStructuralFeatures().get(10);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getRosNode_NullResponseHandler()
  {
		return (EAttribute)rosNodeEClass.getEStructuralFeatures().get(11);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getRosNode_NullRequestHandler()
  {
		return (EAttribute)rosNodeEClass.getEStructuralFeatures().get(12);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getRosNode__Start()
  {
		return rosNodeEClass.getEOperations().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getRosNode__Initialize()
  {
		return rosNodeEClass.getEOperations().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getRosNode__OnStart__ConnectedNode()
  {
		return rosNodeEClass.getEOperations().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getRosNode__Restart()
  {
		return rosNodeEClass.getEOperations().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getRosNode__Register__RosInterface_boolean()
  {
		return rosNodeEClass.getEOperations().get(4);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getRosNode__Register__RosInterface()
  {
		return rosNodeEClass.getEOperations().get(5);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getRosNode__NewFromType__String()
  {
		return rosNodeEClass.getEOperations().get(6);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getRosNode__Shutdown()
  {
		return rosNodeEClass.getEOperations().get(7);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getRosNode__CreatePublisher__String_String()
  {
		return rosNodeEClass.getEOperations().get(8);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getRosNode__CreateServiceManager()
  {
		return rosNodeEClass.getEOperations().get(9);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getRosNode__CreateTopicLauncher()
  {
		return rosNodeEClass.getEOperations().get(10);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getRosNode__CreatePublisherManager()
  {
		return rosNodeEClass.getEOperations().get(11);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getResponseLogger()
  {
		return responseLoggerEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getNullResponseHandler()
  {
		return nullResponseHandlerEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getNullRequestHandler()
  {
		return nullRequestHandlerEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getMessage()
  {
		return messageEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getPublisher()
  {
		return publisherEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getSubscriber()
  {
		return subscriberEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getMessageListener()
  {
		return messageListenerEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getServiceClient()
  {
		return serviceClientEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getServiceNotFoundException()
  {
		return serviceNotFoundExceptionEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getException()
  {
		return exceptionEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getHashMap()
  {
		return hashMapEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getConnectedNode()
  {
		return connectedNodeEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getRosServiceManager()
  {
		return rosServiceManagerEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getRosServiceManager_Services()
  {
		return (EAttribute)rosServiceManagerEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getRosServiceManager_Node()
  {
		return (EReference)rosServiceManagerEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getRosServiceManager_Running()
  {
		return (EAttribute)rosServiceManagerEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getRosServiceManager__CreateService__String_String()
  {
		return rosServiceManagerEClass.getEOperations().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getRosServiceManager__CreateService__String_String_boolean()
  {
		return rosServiceManagerEClass.getEOperations().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getRosServiceManager__GetService__String()
  {
		return rosServiceManagerEClass.getEOperations().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getRosServiceManager__CreateRequestMessage__String()
  {
		return rosServiceManagerEClass.getEOperations().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getRosServiceManager__CallService__String_Message()
  {
		return rosServiceManagerEClass.getEOperations().get(4);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getRosServiceManager__CallService__String()
  {
		return rosServiceManagerEClass.getEOperations().get(5);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getRosServiceManager__CallService__String_Message_boolean()
  {
		return rosServiceManagerEClass.getEOperations().get(6);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getRosServiceManager__CallService__String_boolean()
  {
		return rosServiceManagerEClass.getEOperations().get(7);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getRosServiceManager__Launch()
  {
		return rosServiceManagerEClass.getEOperations().get(8);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getRosServiceManager__Stop()
  {
		return rosServiceManagerEClass.getEOperations().get(9);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getRosTopicLauncher()
  {
		return rosTopicLauncherEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getRosTopicLauncher_Running()
  {
		return (EAttribute)rosTopicLauncherEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getRosTopicLauncher_ListenerList()
  {
		return (EReference)rosTopicLauncherEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getRosTopicLauncher_Node()
  {
		return (EReference)rosTopicLauncherEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getRosTopicLauncher__CreateListener__String_String_MessageListener()
  {
		return rosTopicLauncherEClass.getEOperations().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getRosTopicLauncher__Launch()
  {
		return rosTopicLauncherEClass.getEOperations().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getRosTopicLauncher__Stop()
  {
		return rosTopicLauncherEClass.getEOperations().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getRosTopicLauncher__Reset()
  {
		return rosTopicLauncherEClass.getEOperations().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getAbstractNodeMain()
  {
		return abstractNodeMainEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getRosPublisherManager()
  {
		return rosPublisherManagerEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getRosPublisherManager_Publishers()
  {
		return (EAttribute)rosPublisherManagerEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getRosPublisherManager_Node()
  {
		return (EReference)rosPublisherManagerEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getRosPublisherManager_Running()
  {
		return (EAttribute)rosPublisherManagerEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getRosPublisherManager__CreatePublisher__String_String()
  {
		return rosPublisherManagerEClass.getEOperations().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getRosPublisherManager__Launch()
  {
		return rosPublisherManagerEClass.getEOperations().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getRosPublisherManager__Stop()
  {
		return rosPublisherManagerEClass.getEOperations().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getRosPublisherManager__CreateMessage__String()
  {
		return rosPublisherManagerEClass.getEOperations().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getRosPublisherManager__Publish__String_Message()
  {
		return rosPublisherManagerEClass.getEOperations().get(4);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getRosPublisherManager__GetPublisher__String()
  {
		return rosPublisherManagerEClass.getEOperations().get(5);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public RosFactory getRosFactory()
  {
		return (RosFactory)getEFactoryInstance();
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
  public void createPackageContents()
  {
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
		createEOperation(rosServiceManagerEClass, ROS_SERVICE_MANAGER___CALL_SERVICE__STRING);
		createEOperation(rosServiceManagerEClass, ROS_SERVICE_MANAGER___CALL_SERVICE__STRING_MESSAGE_BOOLEAN);
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

		rosFacadeEClass = createEClass(ROS_FACADE);
		createEOperation(rosFacadeEClass, ROS_FACADE___GET_NODE_NAME_PREFIX);
		createEOperation(rosFacadeEClass, ROS_FACADE___GET_ROS_MASTER_URI);
		createEOperation(rosFacadeEClass, ROS_FACADE___GET_ROS_HOSTNAME);
		createEOperation(rosFacadeEClass, ROS_FACADE___GET_ROS_IP);

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
  public void initializePackageContents()
  {
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
		initEClass(rosNodeEClass, RosNode.class, "RosNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRosNode_ConnectedNode(), this.getConnectedNode(), "connectedNode", null, 0, 1, RosNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRosNode_Modules(), this.getRosInterface(), null, "modules", null, 0, -1, RosNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRosNode_ServiceManagers(), this.getRosServiceManager(), null, "serviceManagers", null, 0, -1, RosNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRosNode_TopicLaunchers(), this.getRosTopicLauncher(), null, "topicLaunchers", null, 0, -1, RosNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRosNode_PublisherManagers(), this.getRosPublisherManager(), null, "publisherManagers", null, 0, -1, RosNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRosNode_Initialized(), theEcorePackage.getEBoolean(), "initialized", "false", 0, 1, RosNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRosNode_Connected(), theEcorePackage.getEBoolean(), "connected", "false", 0, 1, RosNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRosNode_Restarting(), theEcorePackage.getEBoolean(), "restarting", "false", 0, 1, RosNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRosNode_EnableAutoRestartOnConnectionLost(), theEcorePackage.getEBoolean(), "enableAutoRestartOnConnectionLost", "false", 0, 1, RosNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRosNode_NodeName(), theEcorePackage.getEString(), "nodeName", null, 0, 1, RosNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRosNode_ResponseLogger(), this.getResponseLogger(), "responseLogger", null, 0, 1, RosNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRosNode_NullResponseHandler(), this.getNullResponseHandler(), "nullResponseHandler", null, 0, 1, RosNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRosNode_NullRequestHandler(), this.getNullRequestHandler(), "nullRequestHandler", null, 0, 1, RosNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getRosNode__Start(), null, "start", 0, 1, !IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getRosNode__Initialize(), null, "initialize", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		op = initEOperation(getRosNode__OnStart__ConnectedNode(), null, "onStart", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getConnectedNode(), "connectedNode", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getRosNode__Restart(), null, "restart", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRosNode__Register__RosInterface_boolean(), null, "register", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRosInterface(), "module", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEBoolean(), "initialize", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRosNode__Register__RosInterface(), null, "register", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRosInterface(), "module", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRosNode__NewFromType__String(), null, "newFromType", 0, 1, !IS_UNIQUE, IS_ORDERED);
		ETypeParameter t1 = addETypeParameter(op, "T");
		addEParameter(op, theEcorePackage.getEString(), "messageType", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		initEOperation(getRosNode__Shutdown(), null, "shutdown", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRosNode__CreatePublisher__String_String(), null, "createPublisher", 0, 1, !IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		addEParameter(op, theEcorePackage.getEString(), "topicName", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "messageType", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getPublisher());
		EGenericType g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEOperation(getRosNode__CreateServiceManager(), this.getRosServiceManager(), "createServiceManager", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getRosNode__CreateTopicLauncher(), this.getRosTopicLauncher(), "createTopicLauncher", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getRosNode__CreatePublisherManager(), this.getRosPublisherManager(), "createPublisherManager", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(rosInterfaceEClass, RosInterface.class, "RosInterface", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRosInterface_ServiceManager(), this.getRosServiceManager(), null, "serviceManager", null, 0, 1, RosInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRosInterface_TopicLauncher(), this.getRosTopicLauncher(), null, "topicLauncher", null, 0, 1, RosInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRosInterface_PublisherManager(), this.getRosPublisherManager(), null, "publisherManager", null, 0, 1, RosInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRosInterface_Node(), this.getRosNode(), null, "node", null, 0, 1, RosInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getRosInterface__RosInit(), null, "rosInit", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(rosPublisherManagerEClass, RosPublisherManager.class, "RosPublisherManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(this.getHashMap());
		g2 = createEGenericType(theEcorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getRosPublisher());
		g1.getETypeArguments().add(g2);
		EGenericType g3 = createEGenericType();
		g2.getETypeArguments().add(g3);
		initEAttribute(getRosPublisherManager_Publishers(), g1, "publishers", null, 0, 1, RosPublisherManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRosPublisherManager_Node(), this.getRosNode(), null, "node", null, 0, 1, RosPublisherManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRosPublisherManager_Running(), theEcorePackage.getEBoolean(), "running", null, 0, 1, RosPublisherManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getRosPublisherManager__CreatePublisher__String_String(), null, "createPublisher", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "topicName", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "messageType", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getRosPublisherManager__Launch(), null, "launch", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getRosPublisherManager__Stop(), null, "stop", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRosPublisherManager__CreateMessage__String(), null, "createMessage", 0, 1, !IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(this.getMessage());
		t1.getEBounds().add(g1);
		addEParameter(op, theEcorePackage.getEString(), "topicName", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = initEOperation(getRosPublisherManager__Publish__String_Message(), null, "publish", 0, 1, !IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(this.getMessage());
		t1.getEBounds().add(g1);
		addEParameter(op, theEcorePackage.getEString(), "topicName", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "message", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRosPublisherManager__GetPublisher__String(), null, "getPublisher", 0, 1, !IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(this.getMessage());
		t1.getEBounds().add(g1);
		addEParameter(op, theEcorePackage.getEString(), "topicName", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getRosPublisher());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(rosPublisherEClass, RosPublisher.class, "RosPublisher", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRosPublisher_Launched(), theEcorePackage.getEBoolean(), "launched", null, 0, 1, RosPublisher.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getRosPublisher_TopicName(), theEcorePackage.getEString(), "topicName", null, 0, 1, RosPublisher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRosPublisher_MessageType(), theEcorePackage.getEString(), "messageType", null, 0, 1, RosPublisher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getPublisher());
		g2 = createEGenericType(rosPublisherEClass_T);
		g1.getETypeArguments().add(g2);
		initEAttribute(getRosPublisher_Publisher(), g1, "publisher", null, 0, 1, RosPublisher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRosPublisher_Node(), this.getRosNode(), null, "node", null, 0, 1, RosPublisher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getRosPublisher__Launch__RosNode(), null, "launch", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRosNode(), "node", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRosPublisher__Publish__Message(), null, "publish", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(rosPublisherEClass_T);
		addEParameter(op, g1, "message", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRosPublisher__NewMessage(), null, "newMessage", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(rosPublisherEClass_T);
		initEOperation(op, g1);

		initEOperation(getRosPublisher__Stop(), null, "stop", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(rosServiceManagerEClass, RosServiceManager.class, "RosServiceManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(this.getHashMap());
		g2 = createEGenericType(theEcorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getRosService());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType();
		g2.getETypeArguments().add(g3);
		g3 = createEGenericType();
		g2.getETypeArguments().add(g3);
		initEAttribute(getRosServiceManager_Services(), g1, "services", null, 0, 1, RosServiceManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRosServiceManager_Node(), this.getRosNode(), null, "node", null, 0, 1, RosServiceManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRosServiceManager_Running(), theEcorePackage.getEBoolean(), "running", null, 0, 1, RosServiceManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getRosServiceManager__CreateService__String_String(), null, "createService", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "serviceName", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "serviceType", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRosServiceManager__CreateService__String_String_boolean(), null, "createService", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "serviceName", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "serviceType", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEBoolean(), "disconnectOnTimeout", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRosServiceManager__GetService__String(), null, "getService", 0, 1, !IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "Request");
		g1 = createEGenericType(this.getMessage());
		t1.getEBounds().add(g1);
		ETypeParameter t2 = addETypeParameter(op, "Response");
		g1 = createEGenericType(this.getMessage());
		t2.getEBounds().add(g1);
		addEParameter(op, theEcorePackage.getEString(), "serviceName", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getRosService());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(t2);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getRosServiceManager__CreateRequestMessage__String(), null, "createRequestMessage", 0, 1, !IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "Request");
		g1 = createEGenericType(this.getMessage());
		t1.getEBounds().add(g1);
		t2 = addETypeParameter(op, "Response");
		g1 = createEGenericType(this.getMessage());
		t2.getEBounds().add(g1);
		addEParameter(op, theEcorePackage.getEString(), "serviceName", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = initEOperation(getRosServiceManager__CallService__String_Message(), null, "callService", 0, 1, !IS_UNIQUE, IS_ORDERED);
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

		op = initEOperation(getRosServiceManager__CallService__String(), null, "callService", 0, 1, !IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "Request");
		g1 = createEGenericType(this.getMessage());
		t1.getEBounds().add(g1);
		t2 = addETypeParameter(op, "Response");
		g1 = createEGenericType(this.getMessage());
		t2.getEBounds().add(g1);
		addEParameter(op, theEcorePackage.getEString(), "serviceName", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t2);
		initEOperation(op, g1);

		op = initEOperation(getRosServiceManager__CallService__String_Message_boolean(), null, "callService", 0, 1, !IS_UNIQUE, IS_ORDERED);
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

		op = initEOperation(getRosServiceManager__CallService__String_boolean(), null, "callService", 0, 1, !IS_UNIQUE, IS_ORDERED);
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

		initEOperation(getRosServiceManager__Launch(), null, "launch", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getRosServiceManager__Stop(), null, "stop", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(rosServiceEClass, RosService.class, "RosService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRosService_ServiceName(), theEcorePackage.getEString(), "serviceName", null, 0, 1, RosService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRosService_ServiceType(), theEcorePackage.getEString(), "serviceType", null, 0, 1, RosService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRosService_Launched(), theEcorePackage.getEBoolean(), "launched", "false", 0, 1, RosService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getServiceClient());
		g2 = createEGenericType(rosServiceEClass_Request);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(rosServiceEClass_Response);
		g1.getETypeArguments().add(g2);
		initEAttribute(getRosService_ServiceClient(), g1, "serviceClient", null, 0, 1, RosService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRosService_Node(), this.getRosNode(), null, "node", null, 0, 1, RosService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRosService_DisconnectOnTimeout(), theEcorePackage.getEBoolean(), "disconnectOnTimeout", null, 0, 1, RosService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getRosService__Launch__RosNode(), null, "launch", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRosNode(), "node", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getServiceNotFoundException());

		initEOperation(getRosService__Stop(), null, "stop", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRosService__NewRequestMessage(), null, "newRequestMessage", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(rosServiceEClass_Request);
		initEOperation(op, g1);

		op = initEOperation(getRosService__Call__Message(), null, "call", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(rosServiceEClass_Request);
		addEParameter(op, g1, "request", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(rosServiceEClass_Response);
		initEOperation(op, g1);

		op = initEOperation(getRosService__Call__Message_boolean(), null, "call", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(rosServiceEClass_Request);
		addEParameter(op, g1, "request", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEBoolean(), "enableLogging", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(rosServiceEClass_Response);
		initEOperation(op, g1);

		initEClass(rosTopicLauncherEClass, RosTopicLauncher.class, "RosTopicLauncher", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(this.getRosListener());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEReference(getRosTopicLauncher_ListenerList(), g1, null, "listenerList", null, 0, -1, RosTopicLauncher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRosTopicLauncher_Node(), this.getRosNode(), null, "node", null, 0, 1, RosTopicLauncher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRosTopicLauncher_Running(), theEcorePackage.getEBoolean(), "running", null, 0, 1, RosTopicLauncher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getRosTopicLauncher__CreateListener__String_String_MessageListener(), null, "createListener", 0, 1, !IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "M");
		g1 = createEGenericType(this.getMessage());
		t1.getEBounds().add(g1);
		addEParameter(op, theEcorePackage.getEString(), "topicName", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "messageType", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getMessageListener());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "messageListener", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getRosTopicLauncher__Launch(), null, "launch", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getRosTopicLauncher__Stop(), null, "stop", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getRosTopicLauncher__Reset(), null, "reset", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(rosListenerEClass, RosListener.class, "RosListener", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRosListener_Running(), theEcorePackage.getEBoolean(), "running", null, 0, 1, RosListener.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRosListener_Node(), this.getRosNode(), null, "node", null, 0, 1, RosListener.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getSubscriber());
		g2 = createEGenericType(rosListenerEClass_T);
		g1.getETypeArguments().add(g2);
		initEAttribute(getRosListener_RosSubscriber(), g1, "rosSubscriber", null, 0, 1, RosListener.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRosListener_TopicName(), theEcorePackage.getEString(), "topicName", null, 0, 1, RosListener.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRosListener_MessageType(), theEcorePackage.getEString(), "messageType", null, 0, 1, RosListener.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getMessageListener());
		g2 = createEGenericType(rosListenerEClass_T);
		g1.getETypeArguments().add(g2);
		initEAttribute(getRosListener_MessageListener(), g1, "messageListener", null, 0, 1, RosListener.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getRosListener__StartWithLocks__RosNode(), theEcorePackage.getEBoolean(), "startWithLocks", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRosNode(), "node", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		op = initEOperation(getRosListener__Start__RosNode(), null, "start", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRosNode(), "node", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		op = initEOperation(getRosListener__ConnectSubscriber__ConnectedNode(), null, "connectSubscriber", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getConnectedNode(), "connectedNode", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getRosListener__Stop(), null, "stop", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(rosFacadeEClass, RosFacade.class, "RosFacade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getRosFacade__GetNodeNamePrefix(), theEcorePackage.getEString(), "getNodeNamePrefix", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getRosFacade__GetROSMasterURI(), theEcorePackage.getEString(), "getROSMasterURI", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getRosFacade__GetROSHostname(), theEcorePackage.getEString(), "getROSHostname", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getRosFacade__GetROSIp(), theEcorePackage.getEString(), "getROSIp", 0, 1, !IS_UNIQUE, IS_ORDERED);

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
  protected void createGenModelAnnotations()
  {
		String source = "http://www.eclipse.org/emf/2002/GenModel";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "prefix", "Ros",
			 "childCreationExtenders", "true",
			 "extensibleProviderFactory", "true",
			 "multipleEditorPages", "false",
			 "copyrightText", "Canadian Space Agency / Agence spatiale canadienne 2013 Copyrights (c)",
			 "modelName", "Ros",
			 "suppressGenModelAnnotations", "false",
			 "modelDirectory", "/ca.gc.asc_csa.eclipse.ros/src-generated",
			 "editDirectory", "/ca.gc.asc_csa.eclipse.ros.edit/src-generated",
			 "basePackage", "ca.gc.asc_csa.eclipse"
		   });	
		addAnnotation
		  (getRosNode__Start(), 
		   source, 
		   new String[] {
			 "documentation", "Starts the ROS node"
		   });	
		addAnnotation
		  (getRosNode__OnStart__ConnectedNode(), 
		   source, 
		   new String[] {
			 "documentation", "Event called when the node is connected to the ROS master <br><br>Start the subscriber handler and the service clients handler"
		   });	
		addAnnotation
		  (getRosNode__Restart(), 
		   source, 
		   new String[] {
			 "documentation", "Resets the ROS connection"
		   });	
		addAnnotation
		  (getRosNode__Register__RosInterface_boolean(), 
		   source, 
		   new String[] {
			 "documentation", "Registers and initializes a new module"
		   });	
		addAnnotation
		  (getRosNode__Register__RosInterface(), 
		   source, 
		   new String[] {
			 "documentation", "Registers and initializes a new module"
		   });	
		addAnnotation
		  (getRosNode__NewFromType__String(), 
		   source, 
		   new String[] {
			 "documentation", "Creates a new variable from a given type"
		   });	
		addAnnotation
		  (getRosNode__Shutdown(), 
		   source, 
		   new String[] {
			 "documentation", "Shuts down the ROS node"
		   });	
		addAnnotation
		  (getRosNode__CreatePublisher__String_String(), 
		   source, 
		   new String[] {
			 "documentation", "Creates a new publisher"
		   });	
		addAnnotation
		  (getRosNode__CreateServiceManager(), 
		   source, 
		   new String[] {
			 "documentation", "Creates a new service manager"
		   });	
		addAnnotation
		  (getRosNode__CreateTopicLauncher(), 
		   source, 
		   new String[] {
			 "documentation", "Creates a new topic launcher"
		   });	
		addAnnotation
		  (getRosNode__CreatePublisherManager(), 
		   source, 
		   new String[] {
			 "documentation", "Creates a new publisher manager"
		   });	
		addAnnotation
		  (getRosNode_Initialized(), 
		   source, 
		   new String[] {
			 "documentation", "Node initialized",
			 "property", "Readonly",
			 "notify", "true",
			 "propertyCategory", "ROS_NODE"
		   });	
		addAnnotation
		  (getRosNode_Connected(), 
		   source, 
		   new String[] {
			 "documentation", "Node connected",
			 "property", "Readonly",
			 "notify", "true",
			 "propertyCategory", "ROS_NODE"
		   });	
		addAnnotation
		  (getRosNode_Restarting(), 
		   source, 
		   new String[] {
			 "documentation", "Node restarting",
			 "property", "Readonly",
			 "notify", "true",
			 "propertyCategory", "ROS_NODE"
		   });	
		addAnnotation
		  (getRosNode_EnableAutoRestartOnConnectionLost(), 
		   source, 
		   new String[] {
			 "documentation", "Enables auto restart of node on connection lost.",
			 "property", "Readonly",
			 "notify", "true",
			 "propertyCategory", "ROS_NODE"
		   });	
		addAnnotation
		  (getRosNode_NodeName(), 
		   source, 
		   new String[] {
			 "documentation", "Node name",
			 "property", "Readonly",
			 "notify", "true",
			 "propertyCategory", "ROS_NODE"
		   });	
		addAnnotation
		  (getRosNode_ResponseLogger(), 
		   source, 
		   new String[] {
			 "documentation", "Strategy to log the new responses"
		   });	
		addAnnotation
		  (getRosNode_NullResponseHandler(), 
		   source, 
		   new String[] {
			 "documentation", "Strategy to handle null responses"
		   });	
		addAnnotation
		  (getRosNode_NullRequestHandler(), 
		   source, 
		   new String[] {
			 "documentation", "Strategy to handle null requests"
		   });	
		addAnnotation
		  (getRosInterface_ServiceManager(), 
		   source, 
		   new String[] {
			 "documentation", "Service Manager",
			 "property", "Readonly",
			 "children", "true",
			 "notify", "true",
			 "propertyCategory", "ROS_INTERFACE"
		   });	
		addAnnotation
		  (getRosInterface_TopicLauncher(), 
		   source, 
		   new String[] {
			 "documentation", "Topic Launcher",
			 "property", "Readonly",
			 "children", "true",
			 "notify", "true",
			 "propertyCategory", "ROS_INTERFACE"
		   });	
		addAnnotation
		  (getRosInterface_PublisherManager(), 
		   source, 
		   new String[] {
			 "documentation", "Publisher Manager",
			 "property", "Readonly",
			 "children", "true",
			 "notify", "true",
			 "propertyCategory", "ROS_INTERFACE"
		   });	
		addAnnotation
		  (getRosInterface_Node(), 
		   source, 
		   new String[] {
			 "documentation", "ROS Node",
			 "property", "Readonly",
			 "children", "true",
			 "notify", "true",
			 "propertyCategory", "ROS_INTERFACE"
		   });	
		addAnnotation
		  (getRosPublisherManager_Node(), 
		   source, 
		   new String[] {
			 "documentation", "ROS Node",
			 "property", "Readonly",
			 "children", "true",
			 "notify", "true",
			 "propertyCategory", "ROS_PUBLISHER_MANAGER"
		   });	
		addAnnotation
		  (getRosPublisherManager_Running(), 
		   source, 
		   new String[] {
			 "documentation", "Publisher Manager Running",
			 "property", "Readonly",
			 "notify", "true",
			 "propertyCategory", "ROS_PUBLISHER_MANAGER"
		   });	
		addAnnotation
		  (getRosPublisher_Launched(), 
		   source, 
		   new String[] {
			 "documentation", "Publisher Manager Launched",
			 "property", "Readonly",
			 "notify", "true",
			 "propertyCategory", "ROS_PUBLISHER"
		   });	
		addAnnotation
		  (getRosServiceManager_Node(), 
		   source, 
		   new String[] {
			 "documentation", "ROS Node",
			 "property", "Readonly",
			 "children", "true",
			 "notify", "true",
			 "propertyCategory", "ROS_SERVICE_MANAGER"
		   });	
		addAnnotation
		  (getRosServiceManager_Running(), 
		   source, 
		   new String[] {
			 "documentation", "Publisher Manager Running",
			 "property", "Readonly",
			 "notify", "true",
			 "propertyCategory", "ROS_SERVICE_MANAGER"
		   });	
		addAnnotation
		  (getRosTopicLauncher_Node(), 
		   source, 
		   new String[] {
			 "documentation", "ROS Node",
			 "property", "Readonly",
			 "children", "true",
			 "notify", "true",
			 "propertyCategory", "ROS_TOPIC_LAUNCHER"
		   });	
		addAnnotation
		  (getRosTopicLauncher_Running(), 
		   source, 
		   new String[] {
			 "documentation", "Topic Manager Running",
			 "property", "Readonly",
			 "notify", "true",
			 "propertyCategory", "ROS_TOPIC_LAUNCHER"
		   });	
		addAnnotation
		  (getRosListener__StartWithLocks__RosNode(), 
		   source, 
		   new String[] {
			 "documentation", "Start the subscriber <br>\nNote : needed to lock because of a bug on Windows =( <br>\nThe bug was that the program couldn\'t start multiple subscribers at once."
		   });	
		addAnnotation
		  (getRosListener__Start__RosNode(), 
		   source, 
		   new String[] {
			 "documentation", "Start the subscriber <br>\nNote : For Linux there\'s no need to lock, subscribers can subscribe at the same time"
		   });	
		addAnnotation
		  (getRosFacade__GetNodeNamePrefix(), 
		   source, 
		   new String[] {
			 "documentation", "Returns a prefix for a Node name (typically used for client node) that contains the user and machine name.\n@return The node name prefix."
		   });	
		addAnnotation
		  (getRosFacade__GetROSMasterURI(), 
		   source, 
		   new String[] {
			 "documentation", "*\nReturns the ROS Master URI value.\n@return The ROS_MASTER_URI environment variable value."
		   });	
		addAnnotation
		  (getRosFacade__GetROSHostname(), 
		   source, 
		   new String[] {
			 "documentation", "*\nReturns the ROS Host Name value.\n@return The ROS_HOSTNAME environment variable value."
		   });	
		addAnnotation
		  (getRosFacade__GetROSIp(), 
		   source, 
		   new String[] {
			 "documentation", "*\nReturns the ROS IP value.\n@return The ROS_IP environment variable value."
		   });
	}

} //RosPackageImpl
