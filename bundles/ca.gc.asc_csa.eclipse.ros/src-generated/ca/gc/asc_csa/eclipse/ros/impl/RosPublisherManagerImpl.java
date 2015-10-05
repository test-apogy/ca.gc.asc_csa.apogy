/**
 * Canadian Space Agency / Agence spatiale canadienne 2013 Copyrights (c)
 */
package ca.gc.asc_csa.eclipse.ros.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.symphony.common.log.EventSeverity;
import org.eclipse.symphony.common.log.Logger;
import org.ros.internal.message.Message;

import ca.gc.asc_csa.eclipse.ros.Activator;
import ca.gc.asc_csa.eclipse.ros.RosFactory;
import ca.gc.asc_csa.eclipse.ros.RosNode;
import ca.gc.asc_csa.eclipse.ros.RosPackage;
import ca.gc.asc_csa.eclipse.ros.RosPublisher;
import ca.gc.asc_csa.eclipse.ros.RosPublisherManager;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Publisher Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.eclipse.ros.impl.RosPublisherManagerImpl#getPublishers <em>Publishers</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.ros.impl.RosPublisherManagerImpl#getNode <em>Node</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.ros.impl.RosPublisherManagerImpl#isRunning <em>Running</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RosPublisherManagerImpl extends MinimalEObjectImpl.Container implements RosPublisherManager
{
	public static int PUBLISHER_LAUNCH_MAX_TRIES = 5;
	
  /**
	 * The cached value of the '{@link #getPublishers() <em>Publishers</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getPublishers()
	 * @generated
	 * @ordered
	 */
  protected HashMap<String, RosPublisher<?>> publishers;
  /**
	 * The cached value of the '{@link #getNode() <em>Node</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getNode()
	 * @generated
	 * @ordered
	 */
  protected RosNode node;
  /**
	 * The default value of the '{@link #isRunning() <em>Running</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isRunning()
	 * @generated
	 * @ordered
	 */
  protected static final boolean RUNNING_EDEFAULT = false;
  /**
	 * The cached value of the '{@link #isRunning() <em>Running</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isRunning()
	 * @generated
	 * @ordered
	 */
  protected boolean running = RUNNING_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected RosPublisherManagerImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass()
  {
		return RosPackage.Literals.ROS_PUBLISHER_MANAGER;
	}

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public HashMap<String, RosPublisher<?>> getPublishers()
  {
	  if ( publishers == null )
		  publishers = new HashMap<String, RosPublisher<?>>();
      return publishers;
  }

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setPublishers(HashMap<String, RosPublisher<?>> newPublishers)
  {
		HashMap<String, RosPublisher<?>> oldPublishers = publishers;
		publishers = newPublishers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RosPackage.ROS_PUBLISHER_MANAGER__PUBLISHERS, oldPublishers, publishers));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public RosNode getNode()
  {
		if (node != null && node.eIsProxy()) {
			InternalEObject oldNode = (InternalEObject)node;
			node = (RosNode)eResolveProxy(oldNode);
			if (node != oldNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RosPackage.ROS_PUBLISHER_MANAGER__NODE, oldNode, node));
			}
		}
		return node;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public RosNode basicGetNode()
  {
		return node;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setNode(RosNode newNode)
  {
		RosNode oldNode = node;
		node = newNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RosPackage.ROS_PUBLISHER_MANAGER__NODE, oldNode, node));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean isRunning()
  {
		return running;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setRunning(boolean newRunning)
  {
		boolean oldRunning = running;
		running = newRunning;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RosPackage.ROS_PUBLISHER_MANAGER__RUNNING, oldRunning, running));
	}

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public void createPublisher(String topicName, String messageType)
  {
	  RosPublisher<Message> publisher = RosFactory.eINSTANCE.createRosPublisher();
	  publisher.setTopicName(topicName);
	  publisher.setMessageType(messageType);
	  getPublishers().put(topicName, publisher);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public void launch()
  {
	  for (RosPublisher<?> publisher : getPublishers().values())
	  {
		  try
		  {
			  publisher.launch(getNode());
		  }
		  catch ( Exception e )
		  {
			  // TODO getNode().setConnected(false);
		  }
	  }
	  setRunning(true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public void stop()
  {
	  for (RosPublisher<?> publisher : getPublishers().values())
		  publisher.stop();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public <T extends Message> T createMessage(String topicName)
  {
	  RosPublisher<T> publisher = getPublisher(topicName);
	  if ( publisher != null )
		  return publisher.newMessage();
	  else
		  return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public <T extends Message> void publish(String topicName, T message)
  {
	  getPublisher(topicName).publish(message);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  @SuppressWarnings("unchecked")
  public <T extends Message> RosPublisher<T> getPublisher(String topicName)
  {
	  if ( getPublishers().containsKey(topicName))
	  { 
		  RosPublisher<T> publisher = (RosPublisher<T>)((Object)getPublishers().get(topicName));
		  if ( ! publisher.isLaunched() )
		  {						  
			  int tries = 0;			  
			  while(!publisher.isLaunched() && tries <= PUBLISHER_LAUNCH_MAX_TRIES)
			  {
				  try 
				  {
					  publisher.launch(getNode());
					  tries++;
				  }
				  catch (Exception ex)
				  {
					  Logger.INSTANCE.log(Activator.ID, this, "Could not launch Publisher <" + topicName + "> !", EventSeverity.ERROR);
					  // TODO getNode().setConnected(false);
				  }
				  
				  // Wait before we try again.
				  if(!publisher.isLaunched())
				  {
					  try 
					  {
						Thread.sleep(1000);
					  } 
					  catch (InterruptedException e) 
					  {						
						e.printStackTrace();
					  }
				  }
			  }
		  }

		  return publisher;			
	  }		

	  return null;
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
			case RosPackage.ROS_PUBLISHER_MANAGER__PUBLISHERS:
				return getPublishers();
			case RosPackage.ROS_PUBLISHER_MANAGER__NODE:
				if (resolve) return getNode();
				return basicGetNode();
			case RosPackage.ROS_PUBLISHER_MANAGER__RUNNING:
				return isRunning();
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
			case RosPackage.ROS_PUBLISHER_MANAGER__PUBLISHERS:
				setPublishers((HashMap<String, RosPublisher<?>>)newValue);
				return;
			case RosPackage.ROS_PUBLISHER_MANAGER__NODE:
				setNode((RosNode)newValue);
				return;
			case RosPackage.ROS_PUBLISHER_MANAGER__RUNNING:
				setRunning((Boolean)newValue);
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
			case RosPackage.ROS_PUBLISHER_MANAGER__PUBLISHERS:
				setPublishers((HashMap<String, RosPublisher<?>>)null);
				return;
			case RosPackage.ROS_PUBLISHER_MANAGER__NODE:
				setNode((RosNode)null);
				return;
			case RosPackage.ROS_PUBLISHER_MANAGER__RUNNING:
				setRunning(RUNNING_EDEFAULT);
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
			case RosPackage.ROS_PUBLISHER_MANAGER__PUBLISHERS:
				return publishers != null;
			case RosPackage.ROS_PUBLISHER_MANAGER__NODE:
				return node != null;
			case RosPackage.ROS_PUBLISHER_MANAGER__RUNNING:
				return running != RUNNING_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		@SuppressWarnings("unchecked")
  public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException
  {
		switch (operationID) {
			case RosPackage.ROS_PUBLISHER_MANAGER___CREATE_PUBLISHER__STRING_STRING:
				createPublisher((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case RosPackage.ROS_PUBLISHER_MANAGER___LAUNCH:
				launch();
				return null;
			case RosPackage.ROS_PUBLISHER_MANAGER___STOP:
				stop();
				return null;
			case RosPackage.ROS_PUBLISHER_MANAGER___CREATE_MESSAGE__STRING:
				return createMessage((String)arguments.get(0));
			case RosPackage.ROS_PUBLISHER_MANAGER___PUBLISH__STRING_MESSAGE:
				publish((String)arguments.get(0), (Message)arguments.get(1));
				return null;
			case RosPackage.ROS_PUBLISHER_MANAGER___GET_PUBLISHER__STRING:
				return getPublisher((String)arguments.get(0));
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
		result.append(" (publishers: ");
		result.append(publishers);
		result.append(", running: ");
		result.append(running);
		result.append(')');
		return result.toString();
	}

} //RosPublisherManagerImpl
