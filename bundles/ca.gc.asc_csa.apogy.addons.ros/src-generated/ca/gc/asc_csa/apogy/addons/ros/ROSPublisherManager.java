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

import java.util.HashMap;

import org.eclipse.emf.ecore.EObject;

import org.ros.internal.message.Message;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ros Publisher Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.ros.ROSPublisherManager#getPublishers <em>Publishers</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.ros.ROSPublisherManager#getNode <em>Node</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.ros.ROSPublisherManager#isRunning <em>Running</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.addons.ros.ApogyAddonsROSPackage#getROSPublisherManager()
 * @model
 * @generated
 */
public interface ROSPublisherManager extends EObject {
	/**
	 * Returns the value of the '<em><b>Publishers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The internal collection of registered publishers
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Publishers</em>' attribute.
	 * @see #setPublishers(HashMap)
	 * @see ca.gc.asc_csa.apogy.addons.ros.ApogyAddonsROSPackage#getROSPublisherManager_Publishers()
	 * @model unique="false" dataType="ca.gc.asc_csa.apogy.addons.ros.HashMap<org.eclipse.emf.ecore.EString, ca.gc.asc_csa.apogy.addons.ros.ROSPublisher<?>>"
	 * @generated
	 */
	HashMap<String, ROSPublisher<?>> getPublishers();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.ros.ROSPublisherManager#getPublishers <em>Publishers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publishers</em>' attribute.
	 * @see #getPublishers()
	 * @generated
	 */
	void setPublishers(HashMap<String, ROSPublisher<?>> value);

	/**
	 * Returns the value of the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The underlying ROS node for the publisher manager
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Node</em>' reference.
	 * @see #setNode(ROSNode)
	 * @see ca.gc.asc_csa.apogy.addons.ros.ApogyAddonsROSPackage#getROSPublisherManager_Node()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly' children='true' notify='true' propertyCategory='ROS_PUBLISHER_MANAGER'"
	 * @generated
	 */
	ROSNode getNode();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.ros.ROSPublisherManager#getNode <em>Node</em>}' reference.
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
	 * Whether or not the publisher manager is running (i.e. launched)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Running</em>' attribute.
	 * @see #setRunning(boolean)
	 * @see ca.gc.asc_csa.apogy.addons.ros.ApogyAddonsROSPackage#getROSPublisherManager_Running()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly' notify='true' propertyCategory='ROS_PUBLISHER_MANAGER'"
	 * @generated
	 */
	boolean isRunning();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.ros.ROSPublisherManager#isRunning <em>Running</em>}' attribute.
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
	 * Creates a publisher for the given topic with messages
	 * of the specified type.
	 * 
	 * @param topicName The topic that the new publisher will be publishing messages to
	 * @param messageType The type of the messages the publisher will be posting
	 * <!-- end-model-doc -->
	 * @model topicNameUnique="false" messageTypeUnique="false"
	 * @generated
	 */
	void createPublisher(String topicName, String messageType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Launch the topic publishing capability for the publisher manager,
	 * and implicitly, all of the associated publishers
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void launch();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Stop the topic publishing for the publisher manager,
	 * and implicitly, all of the associated publishers
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void stop();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Given a particular topic, this determines the associated
	 * publisher and returns a message of the appropriate type
	 * for that publisher.
	 * 
	 * @param topicName The topic that the new message is to be created for
	 * @return The newly created message.
	 * <!-- end-model-doc -->
	 * @model unique="false" topicNameUnique="false" TBounds="ca.gc.asc_csa.apogy.addons.ros.Message"
	 * @generated
	 */
	<T extends Message> T createMessage(String topicName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Given a particular topic, this determines the associated
	 * publisher and publishes the given message to that topic.
	 * 
	 * @param topicName The topic that the given message is to be published to
	 * @param message The message to be published
	 * <!-- end-model-doc -->
	 * @model topicNameUnique="false" messageUnique="false" TBounds="ca.gc.asc_csa.apogy.addons.ros.Message"
	 * @generated
	 */
	<T extends Message> void publish(String topicName, T message);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This extracts the associated publisher for the given topic.
	 * 
	 * @param topicName The topic whose publisher should be extracted
	 * @return The publisher for that topic (if one exists)
	 * <!-- end-model-doc -->
	 * @model unique="false" topicNameUnique="false" TBounds="ca.gc.asc_csa.apogy.addons.ros.Message"
	 * @generated
	 */
	<T extends Message> ROSPublisher<T> getPublisher(String topicName);

} // ROSPublisherManager
