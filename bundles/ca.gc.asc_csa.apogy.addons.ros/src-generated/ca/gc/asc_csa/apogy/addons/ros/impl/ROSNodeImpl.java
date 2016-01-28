/**
 * Canadian Space Agency / Agence spatiale canadienne 2013 Copyrights (c)
 */
package org.eclipse.symphony.addons.ros.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.ros.node.ConnectedNode;
import org.ros.node.topic.Publisher;

import org.eclipse.symphony.addons.ros.Symphony__AddonsROSFacade;
import org.eclipse.symphony.addons.ros.Symphony__AddonsROSFactory;
import org.eclipse.symphony.addons.ros.Symphony__AddonsROSPackage;
import org.eclipse.symphony.addons.ros.utilities.AsynchronousShutdowner;
import org.eclipse.symphony.addons.ros.utilities.NullRequestHandler;
import org.eclipse.symphony.addons.ros.utilities.NullResponseHandler;
import org.eclipse.symphony.addons.ros.utilities.ResponseLogger;
import org.eclipse.symphony.addons.ros.utilities.ROSNodeMain;
import org.eclipse.symphony.addons.ros.utilities.ROSNodeMain.NodeStartedListener;
import org.eclipse.symphony.addons.ros.Activator;
import org.eclipse.symphony.addons.ros.ROSInterface;
import org.eclipse.symphony.addons.ros.ROSNode;
import org.eclipse.symphony.addons.ros.ROSPublisherManager;
import org.eclipse.symphony.addons.ros.ROSServiceManager;
import org.eclipse.symphony.addons.ros.ROSTopicLauncher;

import org.eclipse.symphony.common.log.EventSeverity;
import org.eclipse.symphony.common.log.Logger;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.ros.impl.ROSNodeImpl#getConnectedNode <em>Connected Node</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.ros.impl.ROSNodeImpl#getModules <em>Modules</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.ros.impl.ROSNodeImpl#getServiceManagers <em>Service Managers</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.ros.impl.ROSNodeImpl#getTopicLaunchers <em>Topic Launchers</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.ros.impl.ROSNodeImpl#getPublisherManagers <em>Publisher Managers</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.ros.impl.ROSNodeImpl#isInitialized <em>Initialized</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.ros.impl.ROSNodeImpl#isConnected <em>Connected</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.ros.impl.ROSNodeImpl#isRestarting <em>Restarting</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.ros.impl.ROSNodeImpl#isEnableAutoRestartOnConnectionLost <em>Enable Auto Restart On Connection Lost</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.ros.impl.ROSNodeImpl#getNodeName <em>Node Name</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.ros.impl.ROSNodeImpl#getResponseLogger <em>Response Logger</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.ros.impl.ROSNodeImpl#getNullResponseHandler <em>Null Response Handler</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.ros.impl.ROSNodeImpl#getNullRequestHandler <em>Null Request Handler</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ROSNodeImpl extends MinimalEObjectImpl.Container implements ROSNode
{
  /**
	 * The default value of the '{@link #getConnectedNode() <em>Connected Node</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getConnectedNode()
	 * @generated
	 * @ordered
	 */
  protected static final ConnectedNode CONNECTED_NODE_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getConnectedNode() <em>Connected Node</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getConnectedNode()
	 * @generated
	 * @ordered
	 */
  protected ConnectedNode connectedNode = CONNECTED_NODE_EDEFAULT;

  /**
	 * The cached value of the '{@link #getModules() <em>Modules</em>}' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getModules()
	 * @generated
	 * @ordered
	 */
  protected EList<ROSInterface> modules;

  /**
	 * The cached value of the '{@link #getServiceManagers() <em>Service Managers</em>}' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getServiceManagers()
	 * @generated
	 * @ordered
	 */
  protected EList<ROSServiceManager> serviceManagers;

  /**
	 * The cached value of the '{@link #getTopicLaunchers() <em>Topic Launchers</em>}' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTopicLaunchers()
	 * @generated
	 * @ordered
	 */
  protected EList<ROSTopicLauncher> topicLaunchers;

  /**
	 * The cached value of the '{@link #getPublisherManagers() <em>Publisher Managers</em>}' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getPublisherManagers()
	 * @generated
	 * @ordered
	 */
  protected EList<ROSPublisherManager> publisherManagers;

  /**
	 * The default value of the '{@link #isInitialized() <em>Initialized</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isInitialized()
	 * @generated
	 * @ordered
	 */
  protected static final boolean INITIALIZED_EDEFAULT = false;

  /**
	 * The cached value of the '{@link #isInitialized() <em>Initialized</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isInitialized()
	 * @generated
	 * @ordered
	 */
  protected boolean initialized = INITIALIZED_EDEFAULT;

  /**
	 * The default value of the '{@link #isConnected() <em>Connected</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isConnected()
	 * @generated
	 * @ordered
	 */
  protected static final boolean CONNECTED_EDEFAULT = false;

  /**
	 * The cached value of the '{@link #isConnected() <em>Connected</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isConnected()
	 * @generated
	 * @ordered
	 */
  protected boolean connected = CONNECTED_EDEFAULT;

  /**
	 * The default value of the '{@link #isRestarting() <em>Restarting</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isRestarting()
	 * @generated
	 * @ordered
	 */
  protected static final boolean RESTARTING_EDEFAULT = false;

  /**
	 * The cached value of the '{@link #isRestarting() <em>Restarting</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isRestarting()
	 * @generated
	 * @ordered
	 */
  protected boolean restarting = RESTARTING_EDEFAULT;

  /**
	 * The default value of the '{@link #isEnableAutoRestartOnConnectionLost() <em>Enable Auto Restart On Connection Lost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnableAutoRestartOnConnectionLost()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLE_AUTO_RESTART_ON_CONNECTION_LOST_EDEFAULT = false;

		/**
	 * The cached value of the '{@link #isEnableAutoRestartOnConnectionLost() <em>Enable Auto Restart On Connection Lost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnableAutoRestartOnConnectionLost()
	 * @generated
	 * @ordered
	 */
	protected boolean enableAutoRestartOnConnectionLost = ENABLE_AUTO_RESTART_ON_CONNECTION_LOST_EDEFAULT;

		/**
	 * The default value of the '{@link #getNodeName() <em>Node Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getNodeName()
	 * @generated
	 * @ordered
	 */
  protected static final String NODE_NAME_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getNodeName() <em>Node Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getNodeName()
	 * @generated
	 * @ordered
	 */
  protected String nodeName = NODE_NAME_EDEFAULT;

  /**
	 * The default value of the '{@link #getResponseLogger() <em>Response Logger</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getResponseLogger()
	 * @generated
	 * @ordered
	 */
  protected static final ResponseLogger RESPONSE_LOGGER_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getResponseLogger() <em>Response Logger</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getResponseLogger()
	 * @generated
	 * @ordered
	 */
  protected ResponseLogger responseLogger = RESPONSE_LOGGER_EDEFAULT;

  /**
	 * The default value of the '{@link #getNullResponseHandler() <em>Null Response Handler</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getNullResponseHandler()
	 * @generated
	 * @ordered
	 */
  protected static final NullResponseHandler NULL_RESPONSE_HANDLER_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getNullResponseHandler() <em>Null Response Handler</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getNullResponseHandler()
	 * @generated
	 * @ordered
	 */
  protected NullResponseHandler nullResponseHandler = NULL_RESPONSE_HANDLER_EDEFAULT;

  /**
	 * The default value of the '{@link #getNullRequestHandler() <em>Null Request Handler</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getNullRequestHandler()
	 * @generated
	 * @ordered
	 */
  protected static final NullRequestHandler NULL_REQUEST_HANDLER_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getNullRequestHandler() <em>Null Request Handler</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getNullRequestHandler()
	 * @generated
	 * @ordered
	 */
  protected NullRequestHandler nullRequestHandler = NULL_REQUEST_HANDLER_EDEFAULT;

  private ROSNodeMain rosNodeMain;
  private Thread watchdogThread = null;  
  
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ROSNodeImpl()
  {
		super();
	}
  
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public void initialize () throws Exception
  {
	  String rosMasterURI = Symphony__AddonsROSFacade.INSTANCE.getROSMasterURI();
	  String rosHostName = Symphony__AddonsROSFacade.INSTANCE.getROSHostname();
	  String rosIP = Symphony__AddonsROSFacade.INSTANCE.getROSIp();
	  
	  Logger.INSTANCE.log(Activator.ID, this, "initialize() : ROS_MASTER_URI = <" + rosMasterURI + ">, ROS_HOSTNAME=<" + rosHostName + ">, ROS_IP=<" + rosIP + ">." , EventSeverity.INFO);

	  if(rosMasterURI != null && rosMasterURI.length() > 0)
	  {
		  if(rosHostName != null && rosHostName.length() > 0)
		  {
			  this.rosNodeMain = new ROSNodeMain(getNodeName());	
			  this.rosNodeMain.addNodeStartedListener(new NodeStartedListener()
			  {		
				  @Override
				  public void nodeStarted(ConnectedNode connectedNode)
				  {
					  onStart(connectedNode);			
				  }
			  });  
		  }
		  else
		  {
			  Logger.INSTANCE.log(Activator.ID, this, "ROS_HOSTNAME is undefined !", EventSeverity.ERROR);
			  throw new Exception("ROS_HOSTNAME is undefined !");
		  }
	  }
	  else
	  {
		  Logger.INSTANCE.log(Activator.ID, this, "ROS_MASTER_URI is undefined !", EventSeverity.ERROR);
		  throw new Exception("ROS_MASTER_URI is undefined !");
	  }	  		  	  
  }

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass()
  {
		return Symphony__AddonsROSPackage.Literals.ROS_NODE;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ConnectedNode getConnectedNode()
  {
		return connectedNode;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setConnectedNode(ConnectedNode newConnectedNode)
  {
		ConnectedNode oldConnectedNode = connectedNode;
		connectedNode = newConnectedNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__AddonsROSPackage.ROS_NODE__CONNECTED_NODE, oldConnectedNode, connectedNode));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<ROSInterface> getModules()
  {
		if (modules == null) {
			modules = new EObjectResolvingEList<ROSInterface>(ROSInterface.class, this, Symphony__AddonsROSPackage.ROS_NODE__MODULES);
		}
		return modules;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<ROSServiceManager> getServiceManagers()
  {
		if (serviceManagers == null) {
			serviceManagers = new EObjectResolvingEList<ROSServiceManager>(ROSServiceManager.class, this, Symphony__AddonsROSPackage.ROS_NODE__SERVICE_MANAGERS);
		}
		return serviceManagers;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<ROSTopicLauncher> getTopicLaunchers()
  {
		if (topicLaunchers == null) {
			topicLaunchers = new EObjectResolvingEList<ROSTopicLauncher>(ROSTopicLauncher.class, this, Symphony__AddonsROSPackage.ROS_NODE__TOPIC_LAUNCHERS);
		}
		return topicLaunchers;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<ROSPublisherManager> getPublisherManagers()
  {
		if (publisherManagers == null) {
			publisherManagers = new EObjectResolvingEList<ROSPublisherManager>(ROSPublisherManager.class, this, Symphony__AddonsROSPackage.ROS_NODE__PUBLISHER_MANAGERS);
		}
		return publisherManagers;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean isInitialized()
  {
		return initialized;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setInitialized(boolean newInitialized)
  {
		boolean oldInitialized = initialized;
		initialized = newInitialized;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__AddonsROSPackage.ROS_NODE__INITIALIZED, oldInitialized, initialized));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean isConnected()
  {
		return connected;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setConnected(boolean newConnected)
  {
		boolean oldConnected = connected;
		connected = newConnected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__AddonsROSPackage.ROS_NODE__CONNECTED, oldConnected, connected));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean isRestarting()
  {
		return restarting;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setRestarting(boolean newRestarting)
  {
		boolean oldRestarting = restarting;
		restarting = newRestarting;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__AddonsROSPackage.ROS_NODE__RESTARTING, oldRestarting, restarting));
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnableAutoRestartOnConnectionLost() {
		return enableAutoRestartOnConnectionLost;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnableAutoRestartOnConnectionLost(boolean newEnableAutoRestartOnConnectionLost) {
		boolean oldEnableAutoRestartOnConnectionLost = enableAutoRestartOnConnectionLost;
		enableAutoRestartOnConnectionLost = newEnableAutoRestartOnConnectionLost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__AddonsROSPackage.ROS_NODE__ENABLE_AUTO_RESTART_ON_CONNECTION_LOST, oldEnableAutoRestartOnConnectionLost, enableAutoRestartOnConnectionLost));
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getNodeName()
  {
		return nodeName;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setNodeName(String newNodeName)
  {
		String oldNodeName = nodeName;
		nodeName = newNodeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__AddonsROSPackage.ROS_NODE__NODE_NAME, oldNodeName, nodeName));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ResponseLogger getResponseLogger()
  {
		return responseLogger;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setResponseLogger(ResponseLogger newResponseLogger)
  {
		ResponseLogger oldResponseLogger = responseLogger;
		responseLogger = newResponseLogger;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__AddonsROSPackage.ROS_NODE__RESPONSE_LOGGER, oldResponseLogger, responseLogger));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NullResponseHandler getNullResponseHandler()
  {
		return nullResponseHandler;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setNullResponseHandler(NullResponseHandler newNullResponseHandler)
  {
		NullResponseHandler oldNullResponseHandler = nullResponseHandler;
		nullResponseHandler = newNullResponseHandler;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__AddonsROSPackage.ROS_NODE__NULL_RESPONSE_HANDLER, oldNullResponseHandler, nullResponseHandler));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NullRequestHandler getNullRequestHandler()
  {
		return nullRequestHandler;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setNullRequestHandler(NullRequestHandler newNullRequestHandler)
  {
		NullRequestHandler oldNullRequestHandler = nullRequestHandler;
		nullRequestHandler = newNullRequestHandler;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__AddonsROSPackage.ROS_NODE__NULL_REQUEST_HANDLER, oldNullRequestHandler, nullRequestHandler));
	}

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public void start()
  {
	  rosNodeMain.start();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public void onStart(ConnectedNode connectedNode)
  {
	  synchronized ( getModules() )
	  {
		  /* Set the node in the object */
		  setConnectedNode(connectedNode);
		  
		  // Restarting connection
		  if ( isRestarting() )
		  {			
			  setRestarting(false);

			  Logger.INSTANCE.log(Activator.ID, this, "Resetting topics...", EventSeverity.INFO);
			  launchTopics();
			  Logger.INSTANCE.log(Activator.ID, this, "Resetting publishers...", EventSeverity.INFO);
			  launchPublishers();
			  
			  setConnected(true);
		  }
		  // New connection
		  else
		  {
			  // Initialize all modules
			  for ( ROSInterface module : getModules() )
				  initializeModule(module);

			  setConnected(true);
			  
			  startWatchDog();
		  }
	  }

	  setInitialized(true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public void restart()
  {
	  Logger.INSTANCE.log(Activator.ID, this, "Restarting....", EventSeverity.WARNING);
	  shutdown();
	  setRestarting(true);
	  try
	  {
		  initialize();
		  start( );
	  }
	  catch(Exception e)
	  {
		  e.printStackTrace();
	  }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public void register(ROSInterface module)
  {
	  register(module, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public <T> T newFromType(String messageType)
  {
	  return getConnectedNode().getTopicMessageFactory().newFromType(messageType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public void shutdown()
  {
	  Logger.INSTANCE.log(Activator.ID, this, "Shutting down...", EventSeverity.WARNING);
	  stopServices();
	  stopPublishers();
	  stopTopics();
	  AsynchronousShutdowner.add(getConnectedNode());	  
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public <T> Publisher<T> createPublisher(String topicName, String messageType)
  {
	  return getConnectedNode().newPublisher(topicName, messageType); 
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public ROSServiceManager createServiceManager()
  {
	  ROSServiceManager mgr = Symphony__AddonsROSFactory.eINSTANCE.createROSServiceManager();
	  mgr.setNode(this);

	  getServiceManagers().add(mgr);

	  return mgr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public ROSTopicLauncher createTopicLauncher()
  {
	  ROSTopicLauncher launcher = Symphony__AddonsROSFactory.eINSTANCE.createROSTopicLauncher();
	  launcher.setNode(this);
	  
	  getTopicLaunchers().add(launcher);

	  return launcher;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public ROSPublisherManager createPublisherManager()
  {
	  ROSPublisherManager manager = Symphony__AddonsROSFactory.eINSTANCE.createROSPublisherManager();
	  manager.setNode(this);
	  getPublisherManagers().add(manager);
	  return manager;
  }

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
		switch (featureID) {
			case Symphony__AddonsROSPackage.ROS_NODE__CONNECTED_NODE:
				return getConnectedNode();
			case Symphony__AddonsROSPackage.ROS_NODE__MODULES:
				return getModules();
			case Symphony__AddonsROSPackage.ROS_NODE__SERVICE_MANAGERS:
				return getServiceManagers();
			case Symphony__AddonsROSPackage.ROS_NODE__TOPIC_LAUNCHERS:
				return getTopicLaunchers();
			case Symphony__AddonsROSPackage.ROS_NODE__PUBLISHER_MANAGERS:
				return getPublisherManagers();
			case Symphony__AddonsROSPackage.ROS_NODE__INITIALIZED:
				return isInitialized();
			case Symphony__AddonsROSPackage.ROS_NODE__CONNECTED:
				return isConnected();
			case Symphony__AddonsROSPackage.ROS_NODE__RESTARTING:
				return isRestarting();
			case Symphony__AddonsROSPackage.ROS_NODE__ENABLE_AUTO_RESTART_ON_CONNECTION_LOST:
				return isEnableAutoRestartOnConnectionLost();
			case Symphony__AddonsROSPackage.ROS_NODE__NODE_NAME:
				return getNodeName();
			case Symphony__AddonsROSPackage.ROS_NODE__RESPONSE_LOGGER:
				return getResponseLogger();
			case Symphony__AddonsROSPackage.ROS_NODE__NULL_RESPONSE_HANDLER:
				return getNullResponseHandler();
			case Symphony__AddonsROSPackage.ROS_NODE__NULL_REQUEST_HANDLER:
				return getNullRequestHandler();
		}
		return super.eGet(featureID, resolve, coreType);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case Symphony__AddonsROSPackage.ROS_NODE__CONNECTED_NODE:
				setConnectedNode((ConnectedNode)newValue);
				return;
			case Symphony__AddonsROSPackage.ROS_NODE__MODULES:
				getModules().clear();
				getModules().addAll((Collection<? extends ROSInterface>)newValue);
				return;
			case Symphony__AddonsROSPackage.ROS_NODE__SERVICE_MANAGERS:
				getServiceManagers().clear();
				getServiceManagers().addAll((Collection<? extends ROSServiceManager>)newValue);
				return;
			case Symphony__AddonsROSPackage.ROS_NODE__TOPIC_LAUNCHERS:
				getTopicLaunchers().clear();
				getTopicLaunchers().addAll((Collection<? extends ROSTopicLauncher>)newValue);
				return;
			case Symphony__AddonsROSPackage.ROS_NODE__PUBLISHER_MANAGERS:
				getPublisherManagers().clear();
				getPublisherManagers().addAll((Collection<? extends ROSPublisherManager>)newValue);
				return;
			case Symphony__AddonsROSPackage.ROS_NODE__INITIALIZED:
				setInitialized((Boolean)newValue);
				return;
			case Symphony__AddonsROSPackage.ROS_NODE__CONNECTED:
				setConnected((Boolean)newValue);
				return;
			case Symphony__AddonsROSPackage.ROS_NODE__RESTARTING:
				setRestarting((Boolean)newValue);
				return;
			case Symphony__AddonsROSPackage.ROS_NODE__ENABLE_AUTO_RESTART_ON_CONNECTION_LOST:
				setEnableAutoRestartOnConnectionLost((Boolean)newValue);
				return;
			case Symphony__AddonsROSPackage.ROS_NODE__NODE_NAME:
				setNodeName((String)newValue);
				return;
			case Symphony__AddonsROSPackage.ROS_NODE__RESPONSE_LOGGER:
				setResponseLogger((ResponseLogger)newValue);
				return;
			case Symphony__AddonsROSPackage.ROS_NODE__NULL_RESPONSE_HANDLER:
				setNullResponseHandler((NullResponseHandler)newValue);
				return;
			case Symphony__AddonsROSPackage.ROS_NODE__NULL_REQUEST_HANDLER:
				setNullRequestHandler((NullRequestHandler)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void eUnset(int featureID)
  {
		switch (featureID) {
			case Symphony__AddonsROSPackage.ROS_NODE__CONNECTED_NODE:
				setConnectedNode(CONNECTED_NODE_EDEFAULT);
				return;
			case Symphony__AddonsROSPackage.ROS_NODE__MODULES:
				getModules().clear();
				return;
			case Symphony__AddonsROSPackage.ROS_NODE__SERVICE_MANAGERS:
				getServiceManagers().clear();
				return;
			case Symphony__AddonsROSPackage.ROS_NODE__TOPIC_LAUNCHERS:
				getTopicLaunchers().clear();
				return;
			case Symphony__AddonsROSPackage.ROS_NODE__PUBLISHER_MANAGERS:
				getPublisherManagers().clear();
				return;
			case Symphony__AddonsROSPackage.ROS_NODE__INITIALIZED:
				setInitialized(INITIALIZED_EDEFAULT);
				return;
			case Symphony__AddonsROSPackage.ROS_NODE__CONNECTED:
				setConnected(CONNECTED_EDEFAULT);
				return;
			case Symphony__AddonsROSPackage.ROS_NODE__RESTARTING:
				setRestarting(RESTARTING_EDEFAULT);
				return;
			case Symphony__AddonsROSPackage.ROS_NODE__ENABLE_AUTO_RESTART_ON_CONNECTION_LOST:
				setEnableAutoRestartOnConnectionLost(ENABLE_AUTO_RESTART_ON_CONNECTION_LOST_EDEFAULT);
				return;
			case Symphony__AddonsROSPackage.ROS_NODE__NODE_NAME:
				setNodeName(NODE_NAME_EDEFAULT);
				return;
			case Symphony__AddonsROSPackage.ROS_NODE__RESPONSE_LOGGER:
				setResponseLogger(RESPONSE_LOGGER_EDEFAULT);
				return;
			case Symphony__AddonsROSPackage.ROS_NODE__NULL_RESPONSE_HANDLER:
				setNullResponseHandler(NULL_RESPONSE_HANDLER_EDEFAULT);
				return;
			case Symphony__AddonsROSPackage.ROS_NODE__NULL_REQUEST_HANDLER:
				setNullRequestHandler(NULL_REQUEST_HANDLER_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public boolean eIsSet(int featureID)
  {
		switch (featureID) {
			case Symphony__AddonsROSPackage.ROS_NODE__CONNECTED_NODE:
				return CONNECTED_NODE_EDEFAULT == null ? connectedNode != null : !CONNECTED_NODE_EDEFAULT.equals(connectedNode);
			case Symphony__AddonsROSPackage.ROS_NODE__MODULES:
				return modules != null && !modules.isEmpty();
			case Symphony__AddonsROSPackage.ROS_NODE__SERVICE_MANAGERS:
				return serviceManagers != null && !serviceManagers.isEmpty();
			case Symphony__AddonsROSPackage.ROS_NODE__TOPIC_LAUNCHERS:
				return topicLaunchers != null && !topicLaunchers.isEmpty();
			case Symphony__AddonsROSPackage.ROS_NODE__PUBLISHER_MANAGERS:
				return publisherManagers != null && !publisherManagers.isEmpty();
			case Symphony__AddonsROSPackage.ROS_NODE__INITIALIZED:
				return initialized != INITIALIZED_EDEFAULT;
			case Symphony__AddonsROSPackage.ROS_NODE__CONNECTED:
				return connected != CONNECTED_EDEFAULT;
			case Symphony__AddonsROSPackage.ROS_NODE__RESTARTING:
				return restarting != RESTARTING_EDEFAULT;
			case Symphony__AddonsROSPackage.ROS_NODE__ENABLE_AUTO_RESTART_ON_CONNECTION_LOST:
				return enableAutoRestartOnConnectionLost != ENABLE_AUTO_RESTART_ON_CONNECTION_LOST_EDEFAULT;
			case Symphony__AddonsROSPackage.ROS_NODE__NODE_NAME:
				return NODE_NAME_EDEFAULT == null ? nodeName != null : !NODE_NAME_EDEFAULT.equals(nodeName);
			case Symphony__AddonsROSPackage.ROS_NODE__RESPONSE_LOGGER:
				return RESPONSE_LOGGER_EDEFAULT == null ? responseLogger != null : !RESPONSE_LOGGER_EDEFAULT.equals(responseLogger);
			case Symphony__AddonsROSPackage.ROS_NODE__NULL_RESPONSE_HANDLER:
				return NULL_RESPONSE_HANDLER_EDEFAULT == null ? nullResponseHandler != null : !NULL_RESPONSE_HANDLER_EDEFAULT.equals(nullResponseHandler);
			case Symphony__AddonsROSPackage.ROS_NODE__NULL_REQUEST_HANDLER:
				return NULL_REQUEST_HANDLER_EDEFAULT == null ? nullRequestHandler != null : !NULL_REQUEST_HANDLER_EDEFAULT.equals(nullRequestHandler);
		}
		return super.eIsSet(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException
  {
		switch (operationID) {
			case Symphony__AddonsROSPackage.ROS_NODE___START:
				start();
				return null;
			case Symphony__AddonsROSPackage.ROS_NODE___INITIALIZE:
				try {
					initialize();
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case Symphony__AddonsROSPackage.ROS_NODE___ON_START__CONNECTEDNODE:
				onStart((ConnectedNode)arguments.get(0));
				return null;
			case Symphony__AddonsROSPackage.ROS_NODE___RESTART:
				restart();
				return null;
			case Symphony__AddonsROSPackage.ROS_NODE___REGISTER__ROSINTERFACE_BOOLEAN:
				register((ROSInterface)arguments.get(0), (Boolean)arguments.get(1));
				return null;
			case Symphony__AddonsROSPackage.ROS_NODE___REGISTER__ROSINTERFACE:
				register((ROSInterface)arguments.get(0));
				return null;
			case Symphony__AddonsROSPackage.ROS_NODE___NEW_FROM_TYPE__STRING:
				return newFromType((String)arguments.get(0));
			case Symphony__AddonsROSPackage.ROS_NODE___SHUTDOWN:
				shutdown();
				return null;
			case Symphony__AddonsROSPackage.ROS_NODE___CREATE_PUBLISHER__STRING_STRING:
				return createPublisher((String)arguments.get(0), (String)arguments.get(1));
			case Symphony__AddonsROSPackage.ROS_NODE___CREATE_SERVICE_MANAGER:
				return createServiceManager();
			case Symphony__AddonsROSPackage.ROS_NODE___CREATE_TOPIC_LAUNCHER:
				return createTopicLauncher();
			case Symphony__AddonsROSPackage.ROS_NODE___CREATE_PUBLISHER_MANAGER:
				return createPublisherManager();
		}
		return super.eInvoke(operationID, arguments);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String toString()
  {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (connectedNode: ");
		result.append(connectedNode);
		result.append(", initialized: ");
		result.append(initialized);
		result.append(", connected: ");
		result.append(connected);
		result.append(", restarting: ");
		result.append(restarting);
		result.append(", enableAutoRestartOnConnectionLost: ");
		result.append(enableAutoRestartOnConnectionLost);
		result.append(", nodeName: ");
		result.append(nodeName);
		result.append(", responseLogger: ");
		result.append(responseLogger);
		result.append(", nullResponseHandler: ");
		result.append(nullResponseHandler);
		result.append(", nullRequestHandler: ");
		result.append(nullRequestHandler);
		result.append(')');
		return result.toString();
	}
  
  /**
   * Initializes a ros module.
   * @param module
   * @generated_NOT
   */
  private void initializeModule ( ROSInterface module )
  {	 	  	  
	  String rosMasterURI = Symphony__AddonsROSFacade.INSTANCE.getROSMasterURI();
	  String rosHostName = Symphony__AddonsROSFacade.INSTANCE.getROSHostname();
	  String rosIP = Symphony__AddonsROSFacade.INSTANCE.getROSIp();
	  
	  Logger.INSTANCE.log(Activator.ID, this, "initializeModule : ROS_MASTER_URI = <" + rosMasterURI + ">, ROS_HOSTNAME=<" + rosHostName + ">, ROS_IP=<" + rosIP + ">." , EventSeverity.INFO);
	  
	  // Check that all required environment variable are set.
	  if(rosMasterURI != null && rosMasterURI.length() > 0)
	  {
		  if(rosHostName != null && rosHostName.length() > 0)
		  {
			  module.rosInit();
		  }
		  else
		  {
			  Logger.INSTANCE.log(Activator.ID, this, "ROS_HOSTNAME is undefined !", EventSeverity.ERROR);
		  }
	  }
	  else
	  {
		  Logger.INSTANCE.log(Activator.ID, this, "ROS_MASTER_URI is undefined !", EventSeverity.ERROR);
	  }	  	
  }

  /**
   * Method to call to register and initialize a new module
   * @param module
   * @param initialize
   * @generated_NOT
   */
  public void register ( ROSInterface module, boolean initialize )
  {
	  synchronized ( getModules() )
	  {
		  ROSServiceManager serviceManager = createServiceManager();
		  ROSPublisherManager publisherManager = createPublisherManager();
		  ROSTopicLauncher topicLauncher = createTopicLauncher();

		  module.setServiceManager(serviceManager);
		  module.setPublisherManager(publisherManager);
		  module.setTopicLauncher(topicLauncher);			

		  getModules().add(module);
		  module.setNode(this);

		  if ( getConnectedNode() != null && initialize )
			  initializeModule(module);
	  }
  }

	/**
	 * Stops all the services
	 * @generated_NOT
	 */
	private void stopServices()
	{
		Logger.INSTANCE.log(Activator.ID, this, "Stopping ServiceManagers...", EventSeverity.WARNING);
		for(ROSServiceManager manager : getServiceManagers())
		{
			manager.stop();
		}
	}

	/**
	 * Stops all the topics
	 * @generated_NOT
	 */
	private void stopTopics()
	{
		Logger.INSTANCE.log(Activator.ID, this, "Stopping TopicLaunchers...", EventSeverity.WARNING);
		for ( ROSTopicLauncher launcher : getTopicLaunchers())
		{
			launcher.stop();
		}
	}

	/**
	 * Launches the topics
	 * @generated_NOT
	 */
	private void launchTopics ()
	{
		Logger.INSTANCE.log(Activator.ID, this, "Launching TopicLaunchers...", EventSeverity.WARNING);
		for ( ROSTopicLauncher launcher : getTopicLaunchers())
		{
			launcher.launch();
		}
	}

	/**
	 * Stops all the publishers
	 * @generated_NOT
	 */
	private void stopPublishers()
	{
		Logger.INSTANCE.log(Activator.ID, this, "Stopping PublisherManagers...", EventSeverity.WARNING);
		for ( ROSPublisherManager manager : getPublisherManagers())
		{
			manager.stop();
		}
	}

	/**
	 * Launches the publishers
	 * @generated_NOT
	 */
	private void launchPublishers ( )
	{
		Logger.INSTANCE.log(Activator.ID, this, "Launching PublisherManagers...", EventSeverity.WARNING);
		for ( ROSPublisherManager manager : getPublisherManagers())
		{
			manager.launch();
		}
	}

	/**
	 * Watches if the connection with the ROS node was lost and restarts it
	 * @generated_NOT
	 */
	private void startWatchDog ( )
	{
		if ( watchdogThread == null )
		{
			watchdogThread = new Thread()
			{
				public void run()
				{
					try
					{
						while(isAlive())
						{
							if ( ! isConnected() && ! isRestarting() && isInitialized() )
							{
								Logger.INSTANCE.log(Activator.ID, ROSNodeImpl.this, "Lost connection to server !", EventSeverity.WARNING);
								Thread.sleep(5000);
								
								if(isEnableAutoRestartOnConnectionLost())
								{								
									Logger.INSTANCE.log(Activator.ID, ROSNodeImpl.this, "Restarting...", EventSeverity.INFO);
									restart();
								}
							}

							Thread.sleep(1000);
						}
					}
					catch(Exception e){}
				}
			};
			watchdogThread.start();
		}
	}

} //ROSNodeImpl
