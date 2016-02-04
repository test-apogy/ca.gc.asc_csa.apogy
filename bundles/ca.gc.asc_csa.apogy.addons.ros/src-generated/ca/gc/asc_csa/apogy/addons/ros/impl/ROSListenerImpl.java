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

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import ca.gc.asc_csa.apogy.addons.ros.ROSListener;
import org.ros.internal.message.Message;
import org.ros.message.MessageListener;
import org.ros.node.ConnectedNode;
import org.ros.node.topic.Subscriber;
import ca.gc.asc_csa.apogy.addons.ros.ROSNode;
import ca.gc.asc_csa.apogy.addons.ros.ApogyAddonsROSPackage;
import ca.gc.asc_csa.apogy.addons.ros.utilities.AsynchronousShutdowner;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Listener</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.ros.impl.ROSListenerImpl#isRunning <em>Running</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.ros.impl.ROSListenerImpl#getNode <em>Node</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.ros.impl.ROSListenerImpl#getRosSubscriber <em>Ros Subscriber</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.ros.impl.ROSListenerImpl#getTopicName <em>Topic Name</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.ros.impl.ROSListenerImpl#getMessageType <em>Message Type</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.ros.impl.ROSListenerImpl#getMessageListener <em>Message Listener</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ROSListenerImpl<T extends Message> extends MinimalEObjectImpl.Container implements ROSListener<T>
{
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
	 * The cached value of the '{@link #getNode() <em>Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode()
	 * @generated
	 * @ordered
	 */
	protected ROSNode node;

	/**
	 * The cached value of the '{@link #getRosSubscriber() <em>Ros Subscriber</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRosSubscriber()
	 * @generated
	 * @ordered
	 */
	protected Subscriber<T> rosSubscriber;

	/**
	 * The default value of the '{@link #getTopicName() <em>Topic Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopicName()
	 * @generated
	 * @ordered
	 */
	protected static final String TOPIC_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTopicName() <em>Topic Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopicName()
	 * @generated
	 * @ordered
	 */
	protected String topicName = TOPIC_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMessageType() <em>Message Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageType()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessageType() <em>Message Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageType()
	 * @generated
	 * @ordered
	 */
	protected String messageType = MESSAGE_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMessageListener() <em>Message Listener</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageListener()
	 * @generated
	 * @ordered
	 */
	protected MessageListener<T> messageListener;


	private static final int MAX_WAIT_CONNECTION = 10000; // millisecond
	private ReentrantLock lock;
	private Condition condition; 

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected ROSListenerImpl()
	{
		super();
		this.lock = new ReentrantLock();
		this.condition = lock.newCondition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return ApogyAddonsROSPackage.Literals.ROS_LISTENER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsROSPackage.ROS_LISTENER__RUNNING, oldRunning, running));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyAddonsROSPackage.ROS_LISTENER__NODE, oldNode, node));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsROSPackage.ROS_LISTENER__NODE, oldNode, node));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subscriber<T> getRosSubscriber()
	{
		return rosSubscriber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRosSubscriber(Subscriber<T> newRosSubscriber)
	{
		Subscriber<T> oldRosSubscriber = rosSubscriber;
		rosSubscriber = newRosSubscriber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsROSPackage.ROS_LISTENER__ROS_SUBSCRIBER, oldRosSubscriber, rosSubscriber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTopicName()
	{
		return topicName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopicName(String newTopicName)
	{
		String oldTopicName = topicName;
		topicName = newTopicName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsROSPackage.ROS_LISTENER__TOPIC_NAME, oldTopicName, topicName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMessageType()
	{
		return messageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageType(String newMessageType)
	{
		String oldMessageType = messageType;
		messageType = newMessageType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsROSPackage.ROS_LISTENER__MESSAGE_TYPE, oldMessageType, messageType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageListener<T> getMessageListener()
	{
		return messageListener;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageListener(MessageListener<T> newMessageListener)
	{
		MessageListener<T> oldMessageListener = messageListener;
		messageListener = newMessageListener;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsROSPackage.ROS_LISTENER__MESSAGE_LISTENER, oldMessageListener, messageListener));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public boolean startWithLocks(ROSNode node) throws Exception
	{
		boolean timeElapsed = false;
		lock.lock();
		try
		{
			setNode(node);
			connectSubscriber(node.getConnectedNode());

			while (!timeElapsed && ! isRunning())
			{
				try
				{
					timeElapsed = !condition.await(MAX_WAIT_CONNECTION, TimeUnit.MILLISECONDS);
				} 
				catch (InterruptedException e)
				{
					e.printStackTrace();
				}
			}
			if (timeElapsed)
			{
				throw new Exception("Cannot connect to the topic " + getTopicName() + " (connection timeout)");
			}
		} 
		finally
		{
			lock.unlock();
		}
		return isRunning();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void start(ROSNode node) throws Exception
	{
		setNode(node);
		connectSubscriber(node.getConnectedNode());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void connectSubscriber(ConnectedNode connectedNode)
	{
		Subscriber<T> rosSubscriber = connectedNode.newSubscriber(getTopicName(), getMessageType());
		rosSubscriber.addMessageListener(getMessageListener());
		rosSubscriber.addMessageListener(new ConnectionStateListener());
		setRosSubscriber(rosSubscriber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void stop()
	{
		try
		{
			AsynchronousShutdowner.add(getRosSubscriber());
		} 
		catch (Exception e)
		{
		}

		setRosSubscriber(null);
		setRunning(false);
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
			case ApogyAddonsROSPackage.ROS_LISTENER__RUNNING:
				return isRunning();
			case ApogyAddonsROSPackage.ROS_LISTENER__NODE:
				if (resolve) return getNode();
				return basicGetNode();
			case ApogyAddonsROSPackage.ROS_LISTENER__ROS_SUBSCRIBER:
				return getRosSubscriber();
			case ApogyAddonsROSPackage.ROS_LISTENER__TOPIC_NAME:
				return getTopicName();
			case ApogyAddonsROSPackage.ROS_LISTENER__MESSAGE_TYPE:
				return getMessageType();
			case ApogyAddonsROSPackage.ROS_LISTENER__MESSAGE_LISTENER:
				return getMessageListener();
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
			case ApogyAddonsROSPackage.ROS_LISTENER__RUNNING:
				setRunning((Boolean)newValue);
				return;
			case ApogyAddonsROSPackage.ROS_LISTENER__NODE:
				setNode((ROSNode)newValue);
				return;
			case ApogyAddonsROSPackage.ROS_LISTENER__ROS_SUBSCRIBER:
				setRosSubscriber((Subscriber<T>)newValue);
				return;
			case ApogyAddonsROSPackage.ROS_LISTENER__TOPIC_NAME:
				setTopicName((String)newValue);
				return;
			case ApogyAddonsROSPackage.ROS_LISTENER__MESSAGE_TYPE:
				setMessageType((String)newValue);
				return;
			case ApogyAddonsROSPackage.ROS_LISTENER__MESSAGE_LISTENER:
				setMessageListener((MessageListener<T>)newValue);
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
			case ApogyAddonsROSPackage.ROS_LISTENER__RUNNING:
				setRunning(RUNNING_EDEFAULT);
				return;
			case ApogyAddonsROSPackage.ROS_LISTENER__NODE:
				setNode((ROSNode)null);
				return;
			case ApogyAddonsROSPackage.ROS_LISTENER__ROS_SUBSCRIBER:
				setRosSubscriber((Subscriber<T>)null);
				return;
			case ApogyAddonsROSPackage.ROS_LISTENER__TOPIC_NAME:
				setTopicName(TOPIC_NAME_EDEFAULT);
				return;
			case ApogyAddonsROSPackage.ROS_LISTENER__MESSAGE_TYPE:
				setMessageType(MESSAGE_TYPE_EDEFAULT);
				return;
			case ApogyAddonsROSPackage.ROS_LISTENER__MESSAGE_LISTENER:
				setMessageListener((MessageListener<T>)null);
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
			case ApogyAddonsROSPackage.ROS_LISTENER__RUNNING:
				return running != RUNNING_EDEFAULT;
			case ApogyAddonsROSPackage.ROS_LISTENER__NODE:
				return node != null;
			case ApogyAddonsROSPackage.ROS_LISTENER__ROS_SUBSCRIBER:
				return rosSubscriber != null;
			case ApogyAddonsROSPackage.ROS_LISTENER__TOPIC_NAME:
				return TOPIC_NAME_EDEFAULT == null ? topicName != null : !TOPIC_NAME_EDEFAULT.equals(topicName);
			case ApogyAddonsROSPackage.ROS_LISTENER__MESSAGE_TYPE:
				return MESSAGE_TYPE_EDEFAULT == null ? messageType != null : !MESSAGE_TYPE_EDEFAULT.equals(messageType);
			case ApogyAddonsROSPackage.ROS_LISTENER__MESSAGE_LISTENER:
				return messageListener != null;
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
			case ApogyAddonsROSPackage.ROS_LISTENER___START_WITH_LOCKS__ROSNODE:
				try {
					return startWithLocks((ROSNode)arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case ApogyAddonsROSPackage.ROS_LISTENER___START__ROSNODE:
				try {
					start((ROSNode)arguments.get(0));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case ApogyAddonsROSPackage.ROS_LISTENER___CONNECT_SUBSCRIBER__CONNECTEDNODE:
				connectSubscriber((ConnectedNode)arguments.get(0));
				return null;
			case ApogyAddonsROSPackage.ROS_LISTENER___STOP:
				stop();
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
		result.append(", rosSubscriber: ");
		result.append(rosSubscriber);
		result.append(", topicName: ");
		result.append(topicName);
		result.append(", messageType: ");
		result.append(messageType);
		result.append(", messageListener: ");
		result.append(messageListener);
		result.append(')');
		return result.toString();
	}

	/**
	 * Inner class
	 * 
	 * Listener that set the state of the subscriber when it receives a new
	 * message
	 * @generated_NOT
	 */
	private class ConnectionStateListener implements MessageListener<T>
	{

		@Override
		public void onNewMessage(T message)
		{
			if (!isRunning())
			{
				lock.lock();
				try
				{
					System.out.println("Listener for the topic " + getTopicName() + " is running");
					setRunning(true);
					condition.signal();
				} finally
				{
					lock.unlock();
				}
			}
		}
	}

} //ROSListenerImpl
