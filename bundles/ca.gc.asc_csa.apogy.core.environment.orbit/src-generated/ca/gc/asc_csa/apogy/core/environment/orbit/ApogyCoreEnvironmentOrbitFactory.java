package ca.gc.asc_csa.apogy.core.environment.orbit;
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
 * @see ca.gc.asc_csa.apogy.core.environment.orbit.ApogyCoreEnvironmentOrbitPackage
 * @generated
 */
public interface ApogyCoreEnvironmentOrbitFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApogyCoreEnvironmentOrbitFactory eINSTANCE = ca.gc.asc_csa.apogy.core.environment.orbit.impl.ApogyCoreEnvironmentOrbitFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>PVA Coordinates</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PVA Coordinates</em>'.
	 * @generated
	 */
	PVACoordinates createPVACoordinates();

	/**
	 * Returns a new object of class '<em>Timed Stamped PVA Coordinates</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Timed Stamped PVA Coordinates</em>'.
	 * @generated
	 */
	TimedStampedPVACoordinates createTimedStampedPVACoordinates();

	/**
	 * Returns a new object of class '<em>Angular Coordinates</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Angular Coordinates</em>'.
	 * @generated
	 */
	AngularCoordinates createAngularCoordinates();

	/**
	 * Returns a new object of class '<em>Timed Stamped Angular Coordinates</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Timed Stamped Angular Coordinates</em>'.
	 * @generated
	 */
	TimedStampedAngularCoordinates createTimedStampedAngularCoordinates();

	/**
	 * Returns a new object of class '<em>Spacecraft Attitude</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spacecraft Attitude</em>'.
	 * @generated
	 */
	SpacecraftAttitude createSpacecraftAttitude();

	/**
	 * Returns a new object of class '<em>Spacecraft State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spacecraft State</em>'.
	 * @generated
	 */
	SpacecraftState createSpacecraftState();

	/**
	 * Returns a new object of class '<em>Initial Orbit Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Initial Orbit Container</em>'.
	 * @generated
	 */
	InitialOrbitContainer createInitialOrbitContainer();

	/**
	 * Returns a new object of class '<em>Orbit Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Orbit Model</em>'.
	 * @generated
	 */
	OrbitModel createOrbitModel();

	/**
	 * Returns a new object of class '<em>Facade</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Facade</em>'.
	 * @generated
	 */
	ApogyCoreEnvironmentOrbitFacade createApogyCoreEnvironmentOrbitFacade();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ApogyCoreEnvironmentOrbitPackage getApogyCoreEnvironmentOrbitPackage();

} //ApogyCoreEnvironmentOrbitFactory
