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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.ros.internal.message.Message;
import org.ros.node.topic.Publisher;

import ca.gc.asc_csa.apogy.addons.ros.ROSNode;
import ca.gc.asc_csa.apogy.addons.ros.ApogyAddonsROSPackage;
import ca.gc.asc_csa.apogy.addons.ros.utilities.AsynchronousShutdowner;
import ca.gc.asc_csa.apogy.addons.ros.ROSPublisher;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Publisher</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.ros.impl.ROSPublisherImpl#isLaunched <em>Launched</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.ros.impl.ROSPublisherImpl#getTopicName <em>Topic Name</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.ros.impl.ROSPublisherImpl#getMessageType <em>Message Type</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.ros.impl.ROSPublisherImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.ros.impl.ROSPublisherImpl#getNode <em>Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ROSPublisherImpl<T extends Message> extends MinimalEObjectImpl.Container implements ROSPublisher<T>
{
	/**
	 * The default value of the '{@link #isLaunched() <em>Launched</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLaunched()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LAUNCHED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLaunched() <em>Launched</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLaunched()
	 * @generated
	 * @ordered
	 */
	protected boolean launched = LAUNCHED_EDEFAULT;

	/**
	 * This is true if the Launched attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean launchedESet;

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
	 * The cached value of the '{@link #getPublisher() <em>Publisher</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublisher()
	 * @generated
	 * @ordered
	 */
	protected Publisher<T> publisher;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ROSPublisherImpl()
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
		return ApogyAddonsROSPackage.Literals.ROS_PUBLISHER;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public boolean isLaunched()
	{
		launched = (publisher != null);
		return launched;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLaunched()
	{
		return launchedESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsROSPackage.ROS_PUBLISHER__TOPIC_NAME, oldTopicName, topicName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsROSPackage.ROS_PUBLISHER__MESSAGE_TYPE, oldMessageType, messageType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Publisher<T> getPublisher()
	{
		return publisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublisher(Publisher<T> newPublisher)
	{
		Publisher<T> oldPublisher = publisher;
		publisher = newPublisher;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsROSPackage.ROS_PUBLISHER__PUBLISHER, oldPublisher, publisher));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyAddonsROSPackage.ROS_PUBLISHER__NODE, oldNode, node));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsROSPackage.ROS_PUBLISHER__NODE, oldNode, node));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	@SuppressWarnings("unchecked")
	public void launch(ROSNode node)
	{
		setNode(node);
		setPublisher((Publisher<T>)node.createPublisher(getTopicName(), getMessageType()));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void publish(T message)
	{
		if ( isLaunched() )
			getPublisher().publish(message);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public T newMessage()
	{
		if (isLaunched())
			return getPublisher().newMessage();
		else
			return null;
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
			AsynchronousShutdowner.add(getPublisher());
		} 
		catch (Exception e)
		{
		}

		setPublisher(null);
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
			case ApogyAddonsROSPackage.ROS_PUBLISHER__LAUNCHED:
				return isLaunched();
			case ApogyAddonsROSPackage.ROS_PUBLISHER__TOPIC_NAME:
				return getTopicName();
			case ApogyAddonsROSPackage.ROS_PUBLISHER__MESSAGE_TYPE:
				return getMessageType();
			case ApogyAddonsROSPackage.ROS_PUBLISHER__PUBLISHER:
				return getPublisher();
			case ApogyAddonsROSPackage.ROS_PUBLISHER__NODE:
				if (resolve) return getNode();
				return basicGetNode();
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
			case ApogyAddonsROSPackage.ROS_PUBLISHER__TOPIC_NAME:
				setTopicName((String)newValue);
				return;
			case ApogyAddonsROSPackage.ROS_PUBLISHER__MESSAGE_TYPE:
				setMessageType((String)newValue);
				return;
			case ApogyAddonsROSPackage.ROS_PUBLISHER__PUBLISHER:
				setPublisher((Publisher<T>)newValue);
				return;
			case ApogyAddonsROSPackage.ROS_PUBLISHER__NODE:
				setNode((ROSNode)newValue);
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
			case ApogyAddonsROSPackage.ROS_PUBLISHER__TOPIC_NAME:
				setTopicName(TOPIC_NAME_EDEFAULT);
				return;
			case ApogyAddonsROSPackage.ROS_PUBLISHER__MESSAGE_TYPE:
				setMessageType(MESSAGE_TYPE_EDEFAULT);
				return;
			case ApogyAddonsROSPackage.ROS_PUBLISHER__PUBLISHER:
				setPublisher((Publisher<T>)null);
				return;
			case ApogyAddonsROSPackage.ROS_PUBLISHER__NODE:
				setNode((ROSNode)null);
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
			case ApogyAddonsROSPackage.ROS_PUBLISHER__LAUNCHED:
				return isSetLaunched();
			case ApogyAddonsROSPackage.ROS_PUBLISHER__TOPIC_NAME:
				return TOPIC_NAME_EDEFAULT == null ? topicName != null : !TOPIC_NAME_EDEFAULT.equals(topicName);
			case ApogyAddonsROSPackage.ROS_PUBLISHER__MESSAGE_TYPE:
				return MESSAGE_TYPE_EDEFAULT == null ? messageType != null : !MESSAGE_TYPE_EDEFAULT.equals(messageType);
			case ApogyAddonsROSPackage.ROS_PUBLISHER__PUBLISHER:
				return publisher != null;
			case ApogyAddonsROSPackage.ROS_PUBLISHER__NODE:
				return node != null;
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
			case ApogyAddonsROSPackage.ROS_PUBLISHER___LAUNCH__ROSNODE:
				launch((ROSNode)arguments.get(0));
				return null;
			case ApogyAddonsROSPackage.ROS_PUBLISHER___PUBLISH__MESSAGE:
				publish((T)arguments.get(0));
				return null;
			case ApogyAddonsROSPackage.ROS_PUBLISHER___NEW_MESSAGE:
				return newMessage();
			case ApogyAddonsROSPackage.ROS_PUBLISHER___STOP:
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
		result.append(" (launched: ");
		if (launchedESet) result.append(launched); else result.append("<unset>");
		result.append(", topicName: ");
		result.append(topicName);
		result.append(", messageType: ");
		result.append(messageType);
		result.append(", publisher: ");
		result.append(publisher);
		result.append(')');
		return result.toString();
	}

} //ROSPublisherImpl
