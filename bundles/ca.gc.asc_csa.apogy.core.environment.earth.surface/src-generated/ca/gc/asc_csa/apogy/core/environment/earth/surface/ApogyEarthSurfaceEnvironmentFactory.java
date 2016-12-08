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
package ca.gc.asc_csa.apogy.core.environment.earth.surface;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.ApogyEarthSurfaceEnvironmentPackage
 * @generated
 */
public interface ApogyEarthSurfaceEnvironmentFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApogyEarthSurfaceEnvironmentFactory eINSTANCE = ca.gc.asc_csa.apogy.core.environment.earth.surface.impl.ApogyEarthSurfaceEnvironmentFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Earth Surface Worksite</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Earth Surface Worksite</em>'.
	 * @generated
	 */
	EarthSurfaceWorksite createEarthSurfaceWorksite();

	/**
	 * Returns a new object of class '<em>Earth Sky</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Earth Sky</em>'.
	 * @generated
	 */
	EarthSky createEarthSky();

	/**
	 * Returns a new object of class '<em>Earth Surface Worksite Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Earth Surface Worksite Node</em>'.
	 * @generated
	 */
	EarthSurfaceWorksiteNode createEarthSurfaceWorksiteNode();

	/**
	 * Returns a new object of class '<em>Earth Sky Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Earth Sky Node</em>'.
	 * @generated
	 */
	EarthSkyNode createEarthSkyNode();

	/**
	 * Returns a new object of class '<em>Facade</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Facade</em>'.
	 * @generated
	 */
	ApogyEarthSurfaceEnvironmentFacade createApogyEarthSurfaceEnvironmentFacade();

	/**
	 * Returns a new object of class '<em>Atmosphere Utils</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Atmosphere Utils</em>'.
	 * @generated
	 */
	AtmosphereUtils createAtmosphereUtils();

	/**
	 * Returns a new object of class '<em>Astronomy Utils</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Astronomy Utils</em>'.
	 * @generated
	 */
	AstronomyUtils createAstronomyUtils();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ApogyEarthSurfaceEnvironmentPackage getApogyEarthSurfaceEnvironmentPackage();

} //ApogyEarthSurfaceEnvironmentFactory
