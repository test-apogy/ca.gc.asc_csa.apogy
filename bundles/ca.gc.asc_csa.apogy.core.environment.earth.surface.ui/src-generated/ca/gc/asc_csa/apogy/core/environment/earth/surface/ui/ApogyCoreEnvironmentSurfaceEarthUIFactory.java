/**
 * Copyright (c) 2015-2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
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
package ca.gc.asc_csa.apogy.core.environment.earth.surface.ui;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.ApogyCoreEnvironmentSurfaceEarthUIPackage
 * @generated
 */
public interface ApogyCoreEnvironmentSurfaceEarthUIFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApogyCoreEnvironmentSurfaceEarthUIFactory eINSTANCE = ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.impl.ApogyCoreEnvironmentSurfaceEarthUIFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Earth Surface Worksite Presentation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Earth Surface Worksite Presentation</em>'.
	 * @generated
	 */
	EarthSurfaceWorksitePresentation createEarthSurfaceWorksitePresentation();

	/**
	 * Returns a new object of class '<em>Earth Sky Presentation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Earth Sky Presentation</em>'.
	 * @generated
	 */
	EarthSkyPresentation createEarthSkyPresentation();

	/**
	 * Returns a new object of class '<em>Moon Presentation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Moon Presentation</em>'.
	 * @generated
	 */
	MoonPresentation createMoonPresentation();

	/**
	 * Returns a new object of class '<em>Earth Surface UI Utilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Earth Surface UI Utilities</em>'.
	 * @generated
	 */
	EarthSurfaceUIUtilities createEarthSurfaceUIUtilities();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ApogyCoreEnvironmentSurfaceEarthUIPackage getApogyCoreEnvironmentSurfaceEarthUIPackage();

} //ApogyCoreEnvironmentSurfaceEarthUIFactory
