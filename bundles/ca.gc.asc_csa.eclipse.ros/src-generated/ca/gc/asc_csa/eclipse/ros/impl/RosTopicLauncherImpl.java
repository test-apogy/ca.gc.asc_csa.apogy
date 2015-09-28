/**
 * Canadian Space Agency / Agence spatiale canadienne 2013 Copyrights (c)
 */
package ca.gc.asc_csa.eclipse.ros.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.ros.internal.message.Message;
import org.ros.message.MessageListener;

import ca.gc.asc_csa.eclipse.ros.Activator;
import ca.gc.asc_csa.eclipse.ros.RosFactory;
import ca.gc.asc_csa.eclipse.ros.RosListener;
import ca.gc.asc_csa.eclipse.ros.RosNode;
import ca.gc.asc_csa.eclipse.ros.RosPackage;
import ca.gc.asc_csa.eclipse.ros.RosTopicLauncher;
import ca.gc.asc_csa.eclipse.utils.log.EventSeverity;
import ca.gc.asc_csa.eclipse.utils.log.Logger;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Topic Launcher</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.eclipse.ros.impl.RosTopicLauncherImpl#getListenerList <em>Listener List</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.ros.impl.RosTopicLauncherImpl#getNode <em>Node</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.ros.impl.RosTopicLauncherImpl#isRunning <em>Running</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RosTopicLauncherImpl extends MinimalEObjectImpl.Container implements RosTopicLauncher
{
	public static int MAX_LISTENER_TRIES = 1;
	
  /**
	 * The cached value of the '{@link #getListenerList() <em>Listener List</em>}' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getListenerList()
	 * @generated
	 * @ordered
	 */
  protected EList<RosListener<?>> listenerList;

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
  protected RosTopicLauncherImpl()
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
		return RosPackage.Literals.ROS_TOPIC_LAUNCHER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RosPackage.ROS_TOPIC_LAUNCHER__RUNNING, oldRunning, running));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<RosListener<?>> getListenerList()
  {
		if (listenerList == null) {
			listenerList = new EObjectResolvingEList<RosListener<?>>(RosListener.class, this, RosPackage.ROS_TOPIC_LAUNCHER__LISTENER_LIST);
		}
		return listenerList;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RosPackage.ROS_TOPIC_LAUNCHER__NODE, oldNode, node));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RosPackage.ROS_TOPIC_LAUNCHER__NODE, oldNode, node));
	}

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public <M extends Message> void createListener(String topicName, String messageType, MessageListener<M> messageListener)
  {
	  RosListener<M> listener = RosFactory.eINSTANCE.createRosListener();
	  listener.setTopicName(topicName);
	  listener.setMessageType(messageType);
	  listener.setMessageListener(messageListener);
	  getListenerList().add(listener);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public void launch()
  {
	  for (RosListener<?> listener : getListenerList())
	  {
		  try
		  {
			 listener.start(getNode());				  
		  }
		  catch (Exception e)
		  {
			  e.printStackTrace();
			  Logger.INSTANCE.log(Activator.ID, this, "Failed to launch listener for topic <" + listener.getTopicName() + "> !", EventSeverity.ERROR, e);			 
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
	  for (RosListener<?> listener : getListenerList())
		  listener.stop();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public void reset()
  {
	  stop();
	  launch();
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
			case RosPackage.ROS_TOPIC_LAUNCHER__LISTENER_LIST:
				return getListenerList();
			case RosPackage.ROS_TOPIC_LAUNCHER__NODE:
				if (resolve) return getNode();
				return basicGetNode();
			case RosPackage.ROS_TOPIC_LAUNCHER__RUNNING:
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
			case RosPackage.ROS_TOPIC_LAUNCHER__LISTENER_LIST:
				getListenerList().clear();
				getListenerList().addAll((Collection<? extends RosListener<?>>)newValue);
				return;
			case RosPackage.ROS_TOPIC_LAUNCHER__NODE:
				setNode((RosNode)newValue);
				return;
			case RosPackage.ROS_TOPIC_LAUNCHER__RUNNING:
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
			case RosPackage.ROS_TOPIC_LAUNCHER__LISTENER_LIST:
				getListenerList().clear();
				return;
			case RosPackage.ROS_TOPIC_LAUNCHER__NODE:
				setNode((RosNode)null);
				return;
			case RosPackage.ROS_TOPIC_LAUNCHER__RUNNING:
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
			case RosPackage.ROS_TOPIC_LAUNCHER__LISTENER_LIST:
				return listenerList != null && !listenerList.isEmpty();
			case RosPackage.ROS_TOPIC_LAUNCHER__NODE:
				return node != null;
			case RosPackage.ROS_TOPIC_LAUNCHER__RUNNING:
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
  @SuppressWarnings({"rawtypes", "unchecked" })
  public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException
  {
		switch (operationID) {
			case RosPackage.ROS_TOPIC_LAUNCHER___CREATE_LISTENER__STRING_STRING_MESSAGELISTENER:
				createListener((String)arguments.get(0), (String)arguments.get(1), (MessageListener)arguments.get(2));
				return null;
			case RosPackage.ROS_TOPIC_LAUNCHER___LAUNCH:
				launch();
				return null;
			case RosPackage.ROS_TOPIC_LAUNCHER___STOP:
				stop();
				return null;
			case RosPackage.ROS_TOPIC_LAUNCHER___RESET:
				reset();
				return null;
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
		result.append(" (running: ");
		result.append(running);
		result.append(')');
		return result.toString();
	}

} //RosTopicLauncherImpl
