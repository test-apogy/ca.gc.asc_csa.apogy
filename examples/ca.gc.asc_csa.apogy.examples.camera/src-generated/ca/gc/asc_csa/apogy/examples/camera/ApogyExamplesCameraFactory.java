package ca.gc.asc_csa.apogy.examples.camera;
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

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.apogy.examples.camera.ApogyExamplesCameraPackage
 * @generated
 */
public interface ApogyExamplesCameraFactory extends EFactory
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApogyExamplesCameraFactory eINSTANCE = ca.gc.asc_csa.apogy.examples.camera.impl.ApogyExamplesCameraFactoryImpl.init();

	/**
	 * Returns a new Camera object, which has the same type as
	 * the given camera.
	 * 
	 * @param camera The camera with a particular implementation. 
	 * @return The new camera, which has the same type as the old one
	 * @generated_NOT
	 */
	Camera makeCameraSameType(Camera camera);
	
	/**
	 * Returns a new PTUCamera object, which has the same type as
	 * the given PTU camera.
	 * 
	 * @param ptuCamera The PTU camera with a particular implementation. 
	 * @return The new PTU camera, which has the same type as the old one.
	 * @generated_NOT
	 */
	PTUCamera makePTUCameraSameType(PTUCamera ptuCamera);
	
	/**
	 * Returns a new object of class '<em>Camera Stub</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Camera Stub</em>'.
	 * @generated
	 */
	CameraStub createCameraStub();

	/**
	 * Returns a new object of class '<em>Camera Simulated</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Camera Simulated</em>'.
	 * @generated
	 */
	CameraSimulated createCameraSimulated();

	/**
	 * Returns a new object of class '<em>PTU Camera Stub</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PTU Camera Stub</em>'.
	 * @generated
	 */
	PTUCameraStub createPTUCameraStub();

	/**
	 * Returns a new object of class '<em>PTU Camera Simulated</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PTU Camera Simulated</em>'.
	 * @generated
	 */
	PTUCameraSimulated createPTUCameraSimulated();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ApogyExamplesCameraPackage getApogyExamplesCameraPackage();

} //ApogyExamplesCameraFactory
