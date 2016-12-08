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

import org.eclipse.emf.ecore.EObject;

import ca.gc.asc_csa.apogy.common.topology.TransformNode;
import ca.gc.asc_csa.apogy.core.environment.earth.GeographicCoordinates;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.impl.ApogyEarthSurfaceEnvironmentFacadeImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  -------------------------------------------------------------------------
 * 
 * Facade
 * 
 * -------------------------------------------------------------------------
 * <!-- end-model-doc -->
 *
 *
 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.ApogyEarthSurfaceEnvironmentPackage#getApogyEarthSurfaceEnvironmentFacade()
 * @model
 * @generated
 */
public interface ApogyEarthSurfaceEnvironmentFacade extends EObject 
{
	public static ApogyEarthSurfaceEnvironmentFacade INSTANCE = ApogyEarthSurfaceEnvironmentFacadeImpl.getInstance();

	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Create an empty EarthSurfaceWorksite with the CSA Mars Yard coordinates.
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 * @generated
	 */
	EarthSurfaceWorksite createAndInitializeDefaultCSAWorksite();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Initialize a EarthSkyNode using an EarthSky.
	 * <!-- end-model-doc -->
	 * @model earthSkyUnique="false" earthSkyNodeUnique="false"
	 * @generated
	 */
	void initializeEarthSkyNode(EarthSky earthSky, EarthSkyNode earthSkyNode);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Return the GeographicCoordinates of the CSA Mars Yard.
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	GeographicCoordinates getMarsYardGeographicalCoordinates();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	TransformNode getMarsYardTransformNode();

} // ApogyEarthSurfaceEnvironmentFacade
