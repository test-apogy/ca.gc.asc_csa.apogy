package ca.gc.asc_csa.apogy.examples.lidar;
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
 * @see ca.gc.asc_csa.apogy.examples.lidar.ApogyExamplesLidarPackage
 * @generated
 */
public interface ApogyExamplesLidarFactory extends EFactory
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApogyExamplesLidarFactory eINSTANCE = ca.gc.asc_csa.apogy.examples.lidar.impl.ApogyExamplesLidarFactoryImpl.init();

	/**
	 * Returns a new Lidar object, which has the same type as
	 * the given Lidar unit.
	 * 
	 * @param lidar The Lidar unit with a particular implementation. 
	 * @return The new Lidar instance, which has the same type as the other one
	 * @generated_NOT
	 */
	Lidar makeLidarSameType(Lidar lidar);
	
	/**
	 * Returns a new object of class '<em>Lidar Stub</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lidar Stub</em>'.
	 * @generated
	 */
	LidarStub createLidarStub();

	/**
	 * Returns a new object of class '<em>Lidar Simulated</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lidar Simulated</em>'.
	 * @generated
	 */
	LidarSimulated createLidarSimulated();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ApogyExamplesLidarPackage getApogyExamplesLidarPackage();

} //ApogyExamplesLidarFactory
