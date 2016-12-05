package ca.gc.asc_csa.apogy.core.environment;
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
 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage
 * @generated
 */
public interface ApogyCoreEnvironmentFactory extends EFactory
{
  /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  ApogyCoreEnvironmentFactory eINSTANCE = ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentFactoryImpl.init();

  /**
	 * Returns a new object of class '<em>Apogy Environment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Apogy Environment</em>'.
	 * @generated
	 */
	ApogyEnvironment createApogyEnvironment();

		/**
	 * Returns a new object of class '<em>Time Sources List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Sources List</em>'.
	 * @generated
	 */
	TimeSourcesList createTimeSourcesList();

		/**
	 * Returns a new object of class '<em>Worksites List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Worksites List</em>'.
	 * @generated
	 */
	WorksitesList createWorksitesList();

		/**
	 * Returns a new object of class '<em>Surface Locations List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Surface Locations List</em>'.
	 * @generated
	 */
	SurfaceLocationsList createSurfaceLocationsList();

		/**
	 * Returns a new object of class '<em>Equatorial Coordinates</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Equatorial Coordinates</em>'.
	 * @generated
	 */
  EquatorialCoordinates createEquatorialCoordinates();

  /**
	 * Returns a new object of class '<em>Sky</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sky</em>'.
	 * @generated
	 */
  Sky createSky();

  /**
	 * Returns a new object of class '<em>Sun</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sun</em>'.
	 * @generated
	 */
  Sun createSun();

  /**
	 * Returns a new object of class '<em>Earth</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Earth</em>'.
	 * @generated
	 */
	Earth createEarth();

		/**
	 * Returns a new object of class '<em>Moon</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Moon</em>'.
	 * @generated
	 */
  Moon createMoon();

  /**
	 * Returns a new object of class '<em>Environment Utilities</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Environment Utilities</em>'.
	 * @generated
	 */
  EnvironmentUtilities createEnvironmentUtilities();

  /**
	 * Returns a new object of class '<em>Facade</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Facade</em>'.
	 * @generated
	 */
	ApogyCoreEnvironmentFacade createApogyCoreEnvironmentFacade();

		/**
	 * Returns a new object of class '<em>Star</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Star</em>'.
	 * @generated
	 */
  Star createStar();

  /**
	 * Returns a new object of class '<em>Star Field</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Star Field</em>'.
	 * @generated
	 */
  StarField createStarField();

  /**
	 * Returns a new object of class '<em>Worksite Node</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Worksite Node</em>'.
	 * @generated
	 */
  WorksiteNode createWorksiteNode();

  /**
	 * Returns a new object of class '<em>Sky Node</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sky Node</em>'.
	 * @generated
	 */
  SkyNode createSkyNode();

  /**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ApogyCoreEnvironmentPackage getApogyCoreEnvironmentPackage();

} //ApogyCoreEnvironmentFactory
