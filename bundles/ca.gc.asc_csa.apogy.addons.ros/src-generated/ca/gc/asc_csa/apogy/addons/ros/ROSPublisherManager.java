/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.ros;

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
 *   <li>{@link org.eclipse.symphony.addons.ros.ROSPublisherManager#getPublishers <em>Publishers</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.ros.ROSPublisherManager#getNode <em>Node</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.ros.ROSPublisherManager#isRunning <em>Running</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.addons.ros.Symphony__AddonsROSPackage#getROSPublisherManager()
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
	 * @see org.eclipse.symphony.addons.ros.Symphony__AddonsROSPackage#getROSPublisherManager_Publishers()
	 * @model unique="false" dataType="org.eclipse.symphony.addons.ros.HashMap<org.eclipse.emf.ecore.EString, org.eclipse.symphony.addons.ros.ROSPublisher<?>>"
	 * @generated
	 */
	HashMap<String, ROSPublisher<?>> getPublishers();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.ros.ROSPublisherManager#getPublishers <em>Publishers</em>}' attribute.
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
	 * @see org.eclipse.symphony.addons.ros.Symphony__AddonsROSPackage#getROSPublisherManager_Node()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly' children='true' notify='true' propertyCategory='ROS_PUBLISHER_MANAGER'"
	 * @generated
	 */
	ROSNode getNode();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.ros.ROSPublisherManager#getNode <em>Node</em>}' reference.
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
	 * @see org.eclipse.symphony.addons.ros.Symphony__AddonsROSPackage#getROSPublisherManager_Running()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly' notify='true' propertyCategory='ROS_PUBLISHER_MANAGER'"
	 * @generated
	 */
	boolean isRunning();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.ros.ROSPublisherManager#isRunning <em>Running</em>}' attribute.
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
	 * @model unique="false" topicNameUnique="false" TBounds="org.eclipse.symphony.addons.ros.Message"
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
	 * @model topicNameUnique="false" messageUnique="false" TBounds="org.eclipse.symphony.addons.ros.Message"
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
	 * @model unique="false" topicNameUnique="false" TBounds="org.eclipse.symphony.addons.ros.Message"
	 * @generated
	 */
	<T extends Message> ROSPublisher<T> getPublisher(String topicName);

} // ROSPublisherManager
