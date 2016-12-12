/**
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
package ca.gc.asc_csa.apogy.core.environment.earth;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.apogy.core.environment.earth.ApogyEarthEnvironmentPackage
 * @generated
 */
public interface ApogyEarthEnvironmentFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApogyEarthEnvironmentFactory eINSTANCE = ca.gc.asc_csa.apogy.core.environment.earth.impl.ApogyEarthEnvironmentFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Geographic Coordinates</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Geographic Coordinates</em>'.
	 * @generated
	 */
	GeographicCoordinates createGeographicCoordinates();

	/**
	 * Returns a new object of class '<em>Earth Surface Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Earth Surface Location</em>'.
	 * @generated
	 */
	EarthSurfaceLocation createEarthSurfaceLocation();

	/**
	 * Returns a new object of class '<em>Horizontal Coordinates</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Horizontal Coordinates</em>'.
	 * @generated
	 */
	HorizontalCoordinates createHorizontalCoordinates();

	/**
	 * Returns a new object of class '<em>Ecliptic Coordinates</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ecliptic Coordinates</em>'.
	 * @generated
	 */
	EclipticCoordinates createEclipticCoordinates();

	/**
	 * Returns a new object of class '<em>Apogy Earth Facade</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Apogy Earth Facade</em>'.
	 * @generated
	 */
	ApogyEarthFacade createApogyEarthFacade();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ApogyEarthEnvironmentPackage getApogyEarthEnvironmentPackage();

} //ApogyEarthEnvironmentFactory
