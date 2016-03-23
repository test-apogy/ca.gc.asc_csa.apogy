package ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui;
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
 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.ApogyCoreEnvironmentOrbitEarthUIPackage
 * @generated
 */
public interface ApogyCoreEnvironmentOrbitEarthUIFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApogyCoreEnvironmentOrbitEarthUIFactory eINSTANCE = ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.impl.ApogyCoreEnvironmentOrbitEarthUIFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Earth View Configuration List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Earth View Configuration List</em>'.
	 * @generated
	 */
	EarthViewConfigurationList createEarthViewConfigurationList();

	/**
	 * Returns a new object of class '<em>Earth View Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Earth View Configuration</em>'.
	 * @generated
	 */
	EarthViewConfiguration createEarthViewConfiguration();

	/**
	 * Returns a new object of class '<em>Spacecraft Location World Wind Layer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spacecraft Location World Wind Layer</em>'.
	 * @generated
	 */
	SpacecraftLocationWorldWindLayer createSpacecraftLocationWorldWindLayer();

	/**
	 * Returns a new object of class '<em>Orbit Model World Wind Layer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Orbit Model World Wind Layer</em>'.
	 * @generated
	 */
	OrbitModelWorldWindLayer createOrbitModelWorldWindLayer();

	/**
	 * Returns a new object of class '<em>Spacecraft Swath World Wind Layer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spacecraft Swath World Wind Layer</em>'.
	 * @generated
	 */
	SpacecraftSwathWorldWindLayer createSpacecraftSwathWorldWindLayer();

	/**
	 * Returns a new object of class '<em>Earth Surface Location World Wind Layer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Earth Surface Location World Wind Layer</em>'.
	 * @generated
	 */
	EarthSurfaceLocationWorldWindLayer createEarthSurfaceLocationWorldWindLayer();

	/**
	 * Returns a new object of class '<em>Ground Station World Wind Layer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ground Station World Wind Layer</em>'.
	 * @generated
	 */
	GroundStationWorldWindLayer createGroundStationWorldWindLayer();

	/**
	 * Returns a new object of class '<em>Geographic Coordinates World Wind Layer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Geographic Coordinates World Wind Layer</em>'.
	 * @generated
	 */
	GeographicCoordinatesWorldWindLayer createGeographicCoordinatesWorldWindLayer();

	/**
	 * Returns a new object of class '<em>Spacecraft Visibility Pass View Configuration List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spacecraft Visibility Pass View Configuration List</em>'.
	 * @generated
	 */
	SpacecraftVisibilityPassViewConfigurationList createSpacecraftVisibilityPassViewConfigurationList();

	/**
	 * Returns a new object of class '<em>Spacecraft Visibility Pass View Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spacecraft Visibility Pass View Configuration</em>'.
	 * @generated
	 */
	SpacecraftVisibilityPassViewConfiguration createSpacecraftVisibilityPassViewConfiguration();

	/**
	 * Returns a new object of class '<em>Earth View Utilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Earth View Utilities</em>'.
	 * @generated
	 */
	EarthViewUtilities createEarthViewUtilities();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ApogyCoreEnvironmentOrbitEarthUIPackage getApogyCoreEnvironmentOrbitEarthUIPackage();

} //ApogyCoreEnvironmentOrbitEarthUIFactory
