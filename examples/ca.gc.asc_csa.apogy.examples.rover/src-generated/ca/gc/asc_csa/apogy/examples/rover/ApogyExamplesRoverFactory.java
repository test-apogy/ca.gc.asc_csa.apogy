package ca.gc.asc_csa.apogy.examples.rover;
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
 * @see ca.gc.asc_csa.apogy.examples.rover.ApogyExamplesRoverPackage
 * @generated
 */
public interface ApogyExamplesRoverFactory extends EFactory
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApogyExamplesRoverFactory eINSTANCE = ca.gc.asc_csa.apogy.examples.rover.impl.ApogyExamplesRoverFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Battery</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Battery</em>'.
	 * @generated
	 */
	Battery createBattery();

	/**
	 * Returns a new object of class '<em>Power System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Power System</em>'.
	 * @generated
	 */
	PowerSystem createPowerSystem();

	/**
	 * Returns a new Rover object, which has the same type as
	 * the given rover arm.
	 * 
	 * @param rover The rover with a particular implementation. 
	 * @return The new rover, which has the same type as the old one
	 * @generated_NOT
	 */
	Rover makeRoverSameType(Rover rover);

	/**
	 * Returns a new object of class '<em>Rover Stub</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rover Stub</em>'.
	 * @generated
	 */
	RoverStub createRoverStub();

	/**
	 * Returns a new object of class '<em>Rover Simulated</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rover Simulated</em>'.
	 * @generated
	 */
	RoverSimulated createRoverSimulated();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ApogyExamplesRoverPackage getApogyExamplesRoverPackage();

} //ApogyExamplesRoverFactory
