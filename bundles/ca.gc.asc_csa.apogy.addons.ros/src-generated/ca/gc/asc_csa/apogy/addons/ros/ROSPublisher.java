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

import org.eclipse.emf.ecore.EObject;

import org.ros.internal.message.Message;

import org.ros.node.topic.Publisher;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ros Publisher</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.ros.ROSPublisher#isLaunched <em>Launched</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.ros.ROSPublisher#getTopicName <em>Topic Name</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.ros.ROSPublisher#getMessageType <em>Message Type</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.ros.ROSPublisher#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.ros.ROSPublisher#getNode <em>Node</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.addons.ros.ApogyAddonsROSPackage#getROSPublisher()
 * @model TBounds="ca.gc.asc_csa.apogy.addons.ros.Message"
 * @generated
 */
public interface ROSPublisher<T extends Message> extends EObject {
	/**
	 * Returns the value of the '<em><b>Launched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether or not the publisher has been launched
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Launched</em>' attribute.
	 * @see #isSetLaunched()
	 * @see ca.gc.asc_csa.apogy.addons.ros.ApogyAddonsROSPackage#getROSPublisher_Launched()
	 * @model unique="false" unsettable="true" changeable="false" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly' notify='true' propertyCategory='ROS_PUBLISHER'"
	 * @generated
	 */
	boolean isLaunched();

	/**
	 * Returns whether the value of the '{@link ca.gc.asc_csa.apogy.addons.ros.ROSPublisher#isLaunched <em>Launched</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Launched</em>' attribute is set.
	 * @see #isLaunched()
	 * @generated
	 */
	boolean isSetLaunched();

	/**
	 * Returns the value of the '<em><b>Topic Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name for the publisher's topic
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Topic Name</em>' attribute.
	 * @see #setTopicName(String)
	 * @see ca.gc.asc_csa.apogy.addons.ros.ApogyAddonsROSPackage#getROSPublisher_TopicName()
	 * @model unique="false"
	 * @generated
	 */
	String getTopicName();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.ros.ROSPublisher#getTopicName <em>Topic Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topic Name</em>' attribute.
	 * @see #getTopicName()
	 * @generated
	 */
	void setTopicName(String value);

	/**
	 * Returns the value of the '<em><b>Message Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string specifying the type of the publisher's messages
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Type</em>' attribute.
	 * @see #setMessageType(String)
	 * @see ca.gc.asc_csa.apogy.addons.ros.ApogyAddonsROSPackage#getROSPublisher_MessageType()
	 * @model unique="false"
	 * @generated
	 */
	String getMessageType();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.ros.ROSPublisher#getMessageType <em>Message Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Type</em>' attribute.
	 * @see #getMessageType()
	 * @generated
	 */
	void setMessageType(String value);

	/**
	 * Returns the value of the '<em><b>Publisher</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The underlying ROS publisher
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Publisher</em>' attribute.
	 * @see #setPublisher(Publisher)
	 * @see ca.gc.asc_csa.apogy.addons.ros.ApogyAddonsROSPackage#getROSPublisher_Publisher()
	 * @model unique="false" dataType="ca.gc.asc_csa.apogy.addons.ros.Publisher<T>"
	 * @generated
	 */
	Publisher<T> getPublisher();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.ros.ROSPublisher#getPublisher <em>Publisher</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publisher</em>' attribute.
	 * @see #getPublisher()
	 * @generated
	 */
	void setPublisher(Publisher<T> value);

	/**
	 * Returns the value of the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When launched, the node that publisher is
	 * publishing messages on behalf of
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Node</em>' reference.
	 * @see #setNode(ROSNode)
	 * @see ca.gc.asc_csa.apogy.addons.ros.ApogyAddonsROSPackage#getROSPublisher_Node()
	 * @model
	 * @generated
	 */
	ROSNode getNode();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.ros.ROSPublisher#getNode <em>Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node</em>' reference.
	 * @see #getNode()
	 * @generated
	 */
	void setNode(ROSNode value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Launches the topic publishing capability for the
	 * given underlying ROS node
	 * 
	 * @param node The underlying node that this publisher is launching on behalf of
	 * <!-- end-model-doc -->
	 * @model nodeUnique="false"
	 * @generated
	 */
	void launch(ROSNode node);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Publishes the given message to the publisher's topic
	 * 
	 * @param message The message to be published to the topic
	 * <!-- end-model-doc -->
	 * @model messageUnique="false"
	 * @generated
	 */
	void publish(T message);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a new message of the correct type for this publisher
	 * 
	 * @return The newly created message
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 * @generated
	 */
	T newMessage();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Stops the publishing of new messages
	 * on behalf of the previously-launched ROS node
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void stop();

} // ROSPublisher
