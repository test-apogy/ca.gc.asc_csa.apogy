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

import org.eclipse.emf.ecore.EFactory;

import org.ros.internal.message.Message;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.apogy.addons.ros.ApogyAddonsROSPackage
 * @generated
 */
public interface ApogyAddonsROSFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApogyAddonsROSFactory eINSTANCE = ca.gc.asc_csa.apogy.addons.ros.impl.ApogyAddonsROSFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>ROS Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ROS Node</em>'.
	 * @generated
	 */
	ROSNode createROSNode();

	/**
	 * Returns a new object of class '<em>ROS Publisher Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ROS Publisher Manager</em>'.
	 * @generated
	 */
	ROSPublisherManager createROSPublisherManager();

	/**
	 * Returns a new object of class '<em>ROS Publisher</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ROS Publisher</em>'.
	 * @generated
	 */
	<T extends Message> ROSPublisher<T> createROSPublisher();

	/**
	 * Returns a new object of class '<em>ROS Service Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ROS Service Manager</em>'.
	 * @generated
	 */
	ROSServiceManager createROSServiceManager();

	/**
	 * Returns a new object of class '<em>ROS Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ROS Service</em>'.
	 * @generated
	 */
	<Request extends Message, Response extends Message> ROSService<Request, Response> createROSService();

	/**
	 * Returns a new object of class '<em>ROS Topic Launcher</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ROS Topic Launcher</em>'.
	 * @generated
	 */
	ROSTopicLauncher createROSTopicLauncher();

	/**
	 * Returns a new object of class '<em>ROS Listener</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ROS Listener</em>'.
	 * @generated
	 */
	<T extends Message> ROSListener<T> createROSListener();

	/**
	 * Returns a new object of class '<em>Facade</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Facade</em>'.
	 * @generated
	 */
	ApogyAddonsROSFacade createApogyAddonsROSFacade();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ApogyAddonsROSPackage getApogyAddonsROSPackage();

} //ApogyAddonsROSFactory
