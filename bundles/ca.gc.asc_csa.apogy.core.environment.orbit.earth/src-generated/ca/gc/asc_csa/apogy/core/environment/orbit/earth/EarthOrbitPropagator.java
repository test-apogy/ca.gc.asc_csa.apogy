package ca.gc.asc_csa.apogy.core.environment.orbit.earth;
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

import java.util.Date;
import java.util.List;

import ca.gc.asc_csa.apogy.core.environment.orbit.AbstractOrbitPropagator;
import ca.gc.asc_csa.apogy.core.environment.orbit.InitialOrbitProvider;
import ca.gc.asc_csa.apogy.core.environment.orbit.Orbit;
import org.orekit.propagation.Propagator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Earth Orbit Propagator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines an Orbit propagator for Earth orbits.
 * <!-- end-model-doc -->
 *
 *
 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getEarthOrbitPropagator()
 * @model abstract="true"
 * @generated
 */
public interface EarthOrbitPropagator extends AbstractOrbitPropagator, InitialOrbitProvider {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="ca.gc.asc_csa.apogy.core.environment.orbit.earth.OreKitPropagator" unique="false"
	 * @generated
	 */
	Propagator getOreKitPropagator();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Returns the list of passes for a given target.
	 * <!-- end-model-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.core.environment.orbit.earth.List<ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPass>" unique="false" many="false" exceptions="ca.gc.asc_csa.apogy.core.environment.orbit.earth.Exception" earthSurfaceLocationUnique="false" startDateUnique="false" endDateUnique="false" elevationMaskUnique="false"
	 * @generated
	 */
	List<VisibilityPass> getTargetPasses(EarthSurfaceLocation earthSurfaceLocation, Date startDate, Date endDate, ElevationMask elevationMask) throws Exception;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Returns the list of passes for a given Ground Station (and its Field Of View) during a specified interval.
	 * <!-- end-model-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.core.environment.orbit.earth.List<ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPass>" unique="false" many="false" exceptions="ca.gc.asc_csa.apogy.core.environment.orbit.earth.Exception" groundStationUnique="false" startDateUnique="false" endDateUnique="false"
	 * @generated
	 */
	List<VisibilityPass> getGroundStationPasses(GroundStation groundStation, Date startDate, Date endDate) throws Exception;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Return the init
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	Orbit getInitialOrbit();
} // EarthOrbitPropagator
