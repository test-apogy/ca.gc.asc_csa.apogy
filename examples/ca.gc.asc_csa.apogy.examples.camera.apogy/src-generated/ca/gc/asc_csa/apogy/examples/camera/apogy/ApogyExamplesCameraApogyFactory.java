package ca.gc.asc_csa.apogy.examples.camera.apogy;
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
 * @see ca.gc.asc_csa.apogy.examples.camera.apogy.ApogyExamplesCameraApogyPackage
 * @generated
 */
public interface ApogyExamplesCameraApogyFactory extends EFactory
{
  /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  ApogyExamplesCameraApogyFactory eINSTANCE = ca.gc.asc_csa.apogy.examples.camera.apogy.impl.ApogyExamplesCameraApogyFactoryImpl.init();

  /**
	 * Returns a new object of class '<em>Camera Apogy System Api Adapter</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Camera Apogy System Api Adapter</em>'.
	 * @generated
	 */
  CameraApogySystemApiAdapter createCameraApogySystemApiAdapter();

  /**
	 * Returns a new object of class '<em>Camera Data</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Camera Data</em>'.
	 * @generated
	 */
  CameraData createCameraData();

  /**
	 * Returns a new object of class '<em>PTU Camera Apogy System Api Adapter</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>PTU Camera Apogy System Api Adapter</em>'.
	 * @generated
	 */
  PTUCameraApogySystemApiAdapter createPTUCameraApogySystemApiAdapter();

  /**
	 * Returns a new object of class '<em>PTU Camera Data</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>PTU Camera Data</em>'.
	 * @generated
	 */
  PTUCameraData createPTUCameraData();

  /**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ApogyExamplesCameraApogyPackage getApogyExamplesCameraApogyPackage();

} //ApogyExamplesCameraApogyFactory
