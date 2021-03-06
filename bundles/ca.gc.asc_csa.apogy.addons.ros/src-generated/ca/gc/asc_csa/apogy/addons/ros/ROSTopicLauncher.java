package ca.gc.asc_csa.apogy.addons.ros;
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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.ros.internal.message.Message;

import org.ros.message.MessageListener;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ros Topic Launcher</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.ros.ROSTopicLauncher#getListenerList <em>Listener List</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.ros.ROSTopicLauncher#getNode <em>Node</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.ros.ROSTopicLauncher#isRunning <em>Running</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.addons.ros.ApogyAddonsROSPackage#getROSTopicLauncher()
 * @model
 * @generated
 */
public interface ROSTopicLauncher extends EObject {
	/**
	 * Returns the value of the '<em><b>Listener List</b></em>' reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.apogy.addons.ros.ROSListener}&lt;?>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The internal list of associated listeners
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Listener List</em>' reference list.
	 * @see ca.gc.asc_csa.apogy.addons.ros.ApogyAddonsROSPackage#getROSTopicLauncher_ListenerList()
	 * @model
	 * @generated
	 */
	EList<ROSListener<?>> getListenerList();

	/**
	 * Returns the value of the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The underlying ROS node
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Node</em>' reference.
	 * @see #setNode(ROSNode)
	 * @see ca.gc.asc_csa.apogy.addons.ros.ApogyAddonsROSPackage#getROSTopicLauncher_Node()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly' children='true' notify='true' propertyCategory='ROS_TOPIC_LAUNCHER'"
	 * @generated
	 */
	ROSNode getNode();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.ros.ROSTopicLauncher#getNode <em>Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node</em>' reference.
	 * @see #getNode()
	 * @generated
	 */
	void setNode(ROSNode value);

	/**
	 * Returns the value of the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether or not the topic launcher is currently running (i.e. launched)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Running</em>' attribute.
	 * @see #setRunning(boolean)
	 * @see ca.gc.asc_csa.apogy.addons.ros.ApogyAddonsROSPackage#getROSTopicLauncher_Running()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly' notify='true' propertyCategory='ROS_TOPIC_LAUNCHER'"
	 * @generated
	 */
	boolean isRunning();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.ros.ROSTopicLauncher#isRunning <em>Running</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Running</em>' attribute.
	 * @see #isRunning()
	 * @generated
	 */
	void setRunning(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a listener, given the topic's name,
	 * message type and its underlying ROS message listener.
	 * 
	 * @param topicName The name of the topic to create the listener for
	 * @param messageType The type of the messages for the specified topic
	 * @param messageListener The underlying ROS message listener for that topic
	 * <!-- end-model-doc -->
	 * @model topicNameUnique="false" messageTypeUnique="false" messageListenerDataType="ca.gc.asc_csa.apogy.addons.ros.MessageListener<M>" messageListenerUnique="false" MBounds="ca.gc.asc_csa.apogy.addons.ros.Message"
	 * @generated
	 */
	<M extends Message> void createListener(String topicName, String messageType, MessageListener<M> messageListener);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Launches the topic launcher and implicitly, all of
	 * its registered topics
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void launch();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Stops the topic launcher and implicitly, all of its
	 * registered topics
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void stop();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Resets the topic launcher and its registered topics
	 * by stopping them and then launching them again.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void reset();

} // ROSTopicLauncher
