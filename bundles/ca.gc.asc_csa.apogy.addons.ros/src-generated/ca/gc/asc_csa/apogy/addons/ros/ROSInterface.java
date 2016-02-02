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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ros Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.ros.ROSInterface#getServiceManager <em>Service Manager</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.ros.ROSInterface#getTopicLauncher <em>Topic Launcher</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.ros.ROSInterface#getPublisherManager <em>Publisher Manager</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.ros.ROSInterface#getNode <em>Node</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.addons.ros.ApogyAddonsROSPackage#getROSInterface()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ROSInterface extends EObject {
	/**
	 * Returns the value of the '<em><b>Service Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The service manager associated with this module
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Manager</em>' reference.
	 * @see #setServiceManager(ROSServiceManager)
	 * @see ca.gc.asc_csa.apogy.addons.ros.ApogyAddonsROSPackage#getROSInterface_ServiceManager()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly' children='true' notify='true' propertyCategory='ROS_INTERFACE'"
	 * @generated
	 */
	ROSServiceManager getServiceManager();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.ros.ROSInterface#getServiceManager <em>Service Manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Manager</em>' reference.
	 * @see #getServiceManager()
	 * @generated
	 */
	void setServiceManager(ROSServiceManager value);

	/**
	 * Returns the value of the '<em><b>Topic Launcher</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The topic launcher associated with this module
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Topic Launcher</em>' reference.
	 * @see #setTopicLauncher(ROSTopicLauncher)
	 * @see ca.gc.asc_csa.apogy.addons.ros.ApogyAddonsROSPackage#getROSInterface_TopicLauncher()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly' children='true' notify='true' propertyCategory='ROS_INTERFACE'"
	 * @generated
	 */
	ROSTopicLauncher getTopicLauncher();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.ros.ROSInterface#getTopicLauncher <em>Topic Launcher</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topic Launcher</em>' reference.
	 * @see #getTopicLauncher()
	 * @generated
	 */
	void setTopicLauncher(ROSTopicLauncher value);

	/**
	 * Returns the value of the '<em><b>Publisher Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The publisher launcher associated with this module
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Publisher Manager</em>' reference.
	 * @see #setPublisherManager(ROSPublisherManager)
	 * @see ca.gc.asc_csa.apogy.addons.ros.ApogyAddonsROSPackage#getROSInterface_PublisherManager()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly' children='true' notify='true' propertyCategory='ROS_INTERFACE'"
	 * @generated
	 */
	ROSPublisherManager getPublisherManager();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.ros.ROSInterface#getPublisherManager <em>Publisher Manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publisher Manager</em>' reference.
	 * @see #getPublisherManager()
	 * @generated
	 */
	void setPublisherManager(ROSPublisherManager value);

	/**
	 * Returns the value of the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The underlying ROS node for this module
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Node</em>' reference.
	 * @see #setNode(ROSNode)
	 * @see ca.gc.asc_csa.apogy.addons.ros.ApogyAddonsROSPackage#getROSInterface_Node()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly' children='true' notify='true' propertyCategory='ROS_INTERFACE'"
	 * @generated
	 */
	ROSNode getNode();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.ros.ROSInterface#getNode <em>Node</em>}' reference.
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
	 * Initializes this module / interface
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void rosInit();

} // ROSInterface
