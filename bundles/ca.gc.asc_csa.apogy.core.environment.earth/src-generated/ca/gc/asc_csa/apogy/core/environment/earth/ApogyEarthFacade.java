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

import org.eclipse.emf.ecore.EObject;

import ca.gc.asc_csa.apogy.common.math.Tuple3d;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.core.ApogySystem;
import ca.gc.asc_csa.apogy.core.environment.earth.impl.ApogyEarthFacadeImpl;
import ca.gc.asc_csa.apogy.core.invocator.Environment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Apogy Earth Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ca.gc.asc_csa.apogy.core.environment.earth.ApogyEarthEnvironmentPackage#getApogyEarthFacade()
 * @model
 * @generated
 */
public interface ApogyEarthFacade extends EObject 
{
	public static ApogyEarthFacade INSTANCE = ApogyEarthFacadeImpl.getInstance();
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" apogySystemUnique="false" nodeIDUnique="false" environmentUnique="false"
	 * @generated
	 */
	Tuple3d getMoonVector(ApogySystem apogySystem, String nodeID, Environment environment);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" nodeUnique="false" environmentUnique="false"
	 * @generated
	 */
	Tuple3d getMoonVector(Node node, Environment environment);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Create a GeographicCoordinates.
	 * @param longitude The longitude, in radians.
	 * @param latitude The latitude, in radians.
	 * @param altitude The altitude, in meters.
	 * <!-- end-model-doc -->
	 * @model unique="false" longitudeUnique="false" latitudeUnique="false" altitudeUnique="false"
	 * @generated
	 */
	GeographicCoordinates createGeographicCoordinates(double longitude, double latitude, double altitude);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates an EarthSurfaceLocation from parameters.
	 * @param name The name of the location.
	 * @param description The description of the location.
	 * @param longitude The longitude of the location, in radians.
	 * @param latitude The latitude of the location, in radians.
	 * @param elevation The elevation of the location, in meters.
	 * @return The EarthSurfaceLocation.
	 * <!-- end-model-doc -->
	 * @model unique="false" nameUnique="false" descriptionUnique="false" longitudeUnique="false"
	 *        longitudeAnnotation="http://www.eclipse.org/emf/2002/GenModel apogy_units='rad'" latitudeUnique="false"
	 *        latitudeAnnotation="http://www.eclipse.org/emf/2002/GenModel apogy_units='rad'" elevationUnique="false"
	 *        elevationAnnotation="http://www.eclipse.org/emf/2002/GenModel apogy_units='m'"
	 * @generated
	 */
	EarthSurfaceLocation createEarthSurfaceLocation(String name, String description, double longitude, double latitude, double elevation);
} // ApogyEarthFacade
