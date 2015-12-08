/**
 * Canadian Space Agency / Agence spatiale canadienne 2013 Copyrights (c)
 */
package org.eclipse.symphony.addons.ros.impl;

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

import org.eclipse.symphony.addons.ros.Symphony__AddonsROSPackage;
import org.eclipse.symphony.addons.ros.Symphony__AddonsROSFactory;
import org.eclipse.symphony.addons.ros.Activator;
import org.eclipse.symphony.addons.ros.ROSListener;
import org.eclipse.symphony.addons.ros.ROSNode;
import org.eclipse.symphony.addons.ros.ROSTopicLauncher;

import org.eclipse.symphony.common.log.EventSeverity;
import org.eclipse.symphony.common.log.Logger;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Topic Launcher</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.ros.impl.ROSTopicLauncherImpl#getListenerList <em>Listener List</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.ros.impl.ROSTopicLauncherImpl#getNode <em>Node</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.ros.impl.ROSTopicLauncherImpl#isRunning <em>Running</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ROSTopicLauncherImpl extends MinimalEObjectImpl.Container implements ROSTopicLauncher
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
  protected EList<ROSListener<?>> listenerList;

  /**
	 * The cached value of the '{@link #getNode() <em>Node</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getNode()
	 * @generated
	 * @ordered
	 */
  protected ROSNode node;

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
  protected ROSTopicLauncherImpl()
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
		return Symphony__AddonsROSPackage.Literals.ROS_TOPIC_LAUNCHER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__AddonsROSPackage.ROS_TOPIC_LAUNCHER__RUNNING, oldRunning, running));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<ROSListener<?>> getListenerList()
  {
		if (listenerList == null) {
			listenerList = new EObjectResolvingEList<ROSListener<?>>(ROSListener.class, this, Symphony__AddonsROSPackage.ROS_TOPIC_LAUNCHER__LISTENER_LIST);
		}
		return listenerList;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ROSNode getNode()
  {
		if (node != null && node.eIsProxy()) {
			InternalEObject oldNode = (InternalEObject)node;
			node = (ROSNode)eResolveProxy(oldNode);
			if (node != oldNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Symphony__AddonsROSPackage.ROS_TOPIC_LAUNCHER__NODE, oldNode, node));
			}
		}
		return node;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ROSNode basicGetNode()
  {
		return node;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setNode(ROSNode newNode)
  {
		ROSNode oldNode = node;
		node = newNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__AddonsROSPackage.ROS_TOPIC_LAUNCHER__NODE, oldNode, node));
	}

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public <M extends Message> void createListener(String topicName, String messageType, MessageListener<M> messageListener)
  {
	  ROSListener<M> listener = Symphony__AddonsROSFactory.eINSTANCE.createROSListener();
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
	  for (ROSListener<?> listener : getListenerList())
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
	  for (ROSListener<?> listener : getListenerList())
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
			case Symphony__AddonsROSPackage.ROS_TOPIC_LAUNCHER__LISTENER_LIST:
				return getListenerList();
			case Symphony__AddonsROSPackage.ROS_TOPIC_LAUNCHER__NODE:
				if (resolve) return getNode();
				return basicGetNode();
			case Symphony__AddonsROSPackage.ROS_TOPIC_LAUNCHER__RUNNING:
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
			case Symphony__AddonsROSPackage.ROS_TOPIC_LAUNCHER__LISTENER_LIST:
				getListenerList().clear();
				getListenerList().addAll((Collection<? extends ROSListener<?>>)newValue);
				return;
			case Symphony__AddonsROSPackage.ROS_TOPIC_LAUNCHER__NODE:
				setNode((ROSNode)newValue);
				return;
			case Symphony__AddonsROSPackage.ROS_TOPIC_LAUNCHER__RUNNING:
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
			case Symphony__AddonsROSPackage.ROS_TOPIC_LAUNCHER__LISTENER_LIST:
				getListenerList().clear();
				return;
			case Symphony__AddonsROSPackage.ROS_TOPIC_LAUNCHER__NODE:
				setNode((ROSNode)null);
				return;
			case Symphony__AddonsROSPackage.ROS_TOPIC_LAUNCHER__RUNNING:
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
			case Symphony__AddonsROSPackage.ROS_TOPIC_LAUNCHER__LISTENER_LIST:
				return listenerList != null && !listenerList.isEmpty();
			case Symphony__AddonsROSPackage.ROS_TOPIC_LAUNCHER__NODE:
				return node != null;
			case Symphony__AddonsROSPackage.ROS_TOPIC_LAUNCHER__RUNNING:
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
			case Symphony__AddonsROSPackage.ROS_TOPIC_LAUNCHER___CREATE_LISTENER__STRING_STRING_MESSAGELISTENER:
				createListener((String)arguments.get(0), (String)arguments.get(1), (MessageListener)arguments.get(2));
				return null;
			case Symphony__AddonsROSPackage.ROS_TOPIC_LAUNCHER___LAUNCH:
				launch();
				return null;
			case Symphony__AddonsROSPackage.ROS_TOPIC_LAUNCHER___STOP:
				stop();
				return null;
			case Symphony__AddonsROSPackage.ROS_TOPIC_LAUNCHER___RESET:
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

} //ROSTopicLauncherImpl
