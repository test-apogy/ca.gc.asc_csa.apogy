/**
 * Canadian Space Agency / Agence spatiale canadienne 2013 Copyrights (c)
 */
package org.eclipse.symphony.addons.ros.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.ros.internal.message.Message;

import org.eclipse.symphony.addons.ros.Symphony__AddonsROSPackage;
import org.eclipse.symphony.addons.ros.Symphony__AddonsROSFactory;
import org.eclipse.symphony.addons.ros.Activator;
import org.eclipse.symphony.addons.ros.ROSNode;
import org.eclipse.symphony.addons.ros.ROSPublisher;
import org.eclipse.symphony.addons.ros.ROSPublisherManager;

import org.eclipse.symphony.common.log.EventSeverity;
import org.eclipse.symphony.common.log.Logger;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Publisher Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.ros.impl.ROSPublisherManagerImpl#getPublishers <em>Publishers</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.ros.impl.ROSPublisherManagerImpl#getNode <em>Node</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.ros.impl.ROSPublisherManagerImpl#isRunning <em>Running</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ROSPublisherManagerImpl extends MinimalEObjectImpl.Container implements ROSPublisherManager
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
	protected HashMap<String, ROSPublisher<?>> publishers;
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
	protected ROSPublisherManagerImpl()
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
		return Symphony__AddonsROSPackage.Literals.ROS_PUBLISHER_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public HashMap<String, ROSPublisher<?>> getPublishers()
	{
		if ( publishers == null )
			publishers = new HashMap<String, ROSPublisher<?>>();
		return publishers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublishers(HashMap<String, ROSPublisher<?>> newPublishers)
	{
		HashMap<String, ROSPublisher<?>> oldPublishers = publishers;
		publishers = newPublishers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__AddonsROSPackage.ROS_PUBLISHER_MANAGER__PUBLISHERS, oldPublishers, publishers));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Symphony__AddonsROSPackage.ROS_PUBLISHER_MANAGER__NODE, oldNode, node));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__AddonsROSPackage.ROS_PUBLISHER_MANAGER__NODE, oldNode, node));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__AddonsROSPackage.ROS_PUBLISHER_MANAGER__RUNNING, oldRunning, running));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void createPublisher(String topicName, String messageType)
	{
		ROSPublisher<Message> publisher = Symphony__AddonsROSFactory.eINSTANCE.createROSPublisher();
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
		for (ROSPublisher<?> publisher : getPublishers().values())
		{
			try
			{
				publisher.launch(getNode());
			}
			catch ( Exception e )
			{
				
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
		for (ROSPublisher<?> publisher : getPublishers().values())
			publisher.stop();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public <T extends Message> T createMessage(String topicName)
	{
		ROSPublisher<T> publisher = getPublisher(topicName);
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
	public <T extends Message> ROSPublisher<T> getPublisher(String topicName)
	{
		if ( getPublishers().containsKey(topicName))
		{ 
			ROSPublisher<T> publisher = (ROSPublisher<T>)((Object)getPublishers().get(topicName));
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
			case Symphony__AddonsROSPackage.ROS_PUBLISHER_MANAGER__PUBLISHERS:
				return getPublishers();
			case Symphony__AddonsROSPackage.ROS_PUBLISHER_MANAGER__NODE:
				if (resolve) return getNode();
				return basicGetNode();
			case Symphony__AddonsROSPackage.ROS_PUBLISHER_MANAGER__RUNNING:
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
			case Symphony__AddonsROSPackage.ROS_PUBLISHER_MANAGER__PUBLISHERS:
				setPublishers((HashMap<String, ROSPublisher<?>>)newValue);
				return;
			case Symphony__AddonsROSPackage.ROS_PUBLISHER_MANAGER__NODE:
				setNode((ROSNode)newValue);
				return;
			case Symphony__AddonsROSPackage.ROS_PUBLISHER_MANAGER__RUNNING:
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
			case Symphony__AddonsROSPackage.ROS_PUBLISHER_MANAGER__PUBLISHERS:
				setPublishers((HashMap<String, ROSPublisher<?>>)null);
				return;
			case Symphony__AddonsROSPackage.ROS_PUBLISHER_MANAGER__NODE:
				setNode((ROSNode)null);
				return;
			case Symphony__AddonsROSPackage.ROS_PUBLISHER_MANAGER__RUNNING:
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
			case Symphony__AddonsROSPackage.ROS_PUBLISHER_MANAGER__PUBLISHERS:
				return publishers != null;
			case Symphony__AddonsROSPackage.ROS_PUBLISHER_MANAGER__NODE:
				return node != null;
			case Symphony__AddonsROSPackage.ROS_PUBLISHER_MANAGER__RUNNING:
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
			case Symphony__AddonsROSPackage.ROS_PUBLISHER_MANAGER___CREATE_PUBLISHER__STRING_STRING:
				createPublisher((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case Symphony__AddonsROSPackage.ROS_PUBLISHER_MANAGER___LAUNCH:
				launch();
				return null;
			case Symphony__AddonsROSPackage.ROS_PUBLISHER_MANAGER___STOP:
				stop();
				return null;
			case Symphony__AddonsROSPackage.ROS_PUBLISHER_MANAGER___CREATE_MESSAGE__STRING:
				return createMessage((String)arguments.get(0));
			case Symphony__AddonsROSPackage.ROS_PUBLISHER_MANAGER___PUBLISH__STRING_MESSAGE:
				publish((String)arguments.get(0), (Message)arguments.get(1));
				return null;
			case Symphony__AddonsROSPackage.ROS_PUBLISHER_MANAGER___GET_PUBLISHER__STRING:
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

} //ROSPublisherManagerImpl
