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
import ca.gc.asc_csa.apogy.core.environment.Moon;
import ca.gc.asc_csa.apogy.core.environment.earth.GeographicCoordinates;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.impl.ApogyEarthSurfaceEnvironmentFacadeImpl;
import ca.gc.asc_csa.apogy.core.invocator.InvocatorSession;

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
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.earth.surface.ApogyEarthSurfaceEnvironmentFacade#getActiveEarthSurfaceWorksite <em>Active Earth Surface Worksite</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.earth.surface.ApogyEarthSurfaceEnvironmentFacade#getActiveMoon <em>Active Moon</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.ApogyEarthSurfaceEnvironmentPackage#getApogyEarthSurfaceEnvironmentFacade()
 * @model
 * @generated
 */
public interface ApogyEarthSurfaceEnvironmentFacade extends EObject 
{
	/**
	 * Returns the value of the '<em><b>Active Earth Surface Worksite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to the active EarthSurfaceWorksite. May be null.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Active Earth Surface Worksite</em>' reference.
	 * @see #setActiveEarthSurfaceWorksite(EarthSurfaceWorksite)
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.ApogyEarthSurfaceEnvironmentPackage#getApogyEarthSurfaceEnvironmentFacade_ActiveEarthSurfaceWorksite()
	 * @model transient="true"
	 * @generated
	 */
	EarthSurfaceWorksite getActiveEarthSurfaceWorksite();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.earth.surface.ApogyEarthSurfaceEnvironmentFacade#getActiveEarthSurfaceWorksite <em>Active Earth Surface Worksite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active Earth Surface Worksite</em>' reference.
	 * @see #getActiveEarthSurfaceWorksite()
	 * @generated
	 */
	void setActiveEarthSurfaceWorksite(EarthSurfaceWorksite value);

	/**
	 * Returns the value of the '<em><b>Active Moon</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to the active Moon. May be null.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Active Moon</em>' reference.
	 * @see #setActiveMoon(Moon)
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.ApogyEarthSurfaceEnvironmentPackage#getApogyEarthSurfaceEnvironmentFacade_ActiveMoon()
	 * @model transient="true"
	 * @generated
	 */
	Moon getActiveMoon();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.earth.surface.ApogyEarthSurfaceEnvironmentFacade#getActiveMoon <em>Active Moon</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active Moon</em>' reference.
	 * @see #getActiveMoon()
	 * @generated
	 */
	void setActiveMoon(Moon value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Creates an EarthSky
	 * <!-- end-model-doc -->
	 * @model unique="false" gsiteGeographicCoordinatesUnique="false"
	 * @generated
	 */
	EarthSky createEarthSky(GeographicCoordinates gsiteGeographicCoordinates);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Creates an EarthSkyNode
	 * <!-- end-model-doc -->
	 * @model unique="false" gsiteGeographicCoordinatesUnique="false"
	 * @generated
	 */
	EarthSkyNode createEarthSkyNode(GeographicCoordinates gsiteGeographicCoordinates);

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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Creates an invocator session containing a fully initialized EarthSurfaceWorksite.
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 * @generated
	 */
	InvocatorSession createApogySession();

} // ApogyEarthSurfaceEnvironmentFacade
