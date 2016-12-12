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
package ca.gc.asc_csa.apogy.core.environment.orbit.earth;

import ca.gc.asc_csa.apogy.core.environment.earth.EarthSurfaceLocation;
import ca.gc.asc_csa.apogy.core.environment.orbit.OrbitModel;

import java.util.Date;
import java.util.List;
import org.orekit.propagation.Propagator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Earth Orbit Model</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getEarthOrbitModel()
 * @model abstract="true"
 * @generated
 */
public interface EarthOrbitModel extends OrbitModel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Return the OreKit propagator associated with the EarthOrbitModel.
	 * <!-- end-model-doc -->
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
	 * Returns the list of {@link Eclipse}.
	 * <!-- end-model-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.core.environment.orbit.earth.List<ca.gc.asc_csa.apogy.core.environment.orbit.earth.Eclipse>" unique="false" many="false" exceptions="ca.gc.asc_csa.apogy.core.environment.orbit.earth.Exception" startDateUnique="false" endDateUnique="false"
	 * @generated
	 */
	List<Eclipse> getEclipses(Date startDate, Date endDate) throws Exception;

} // EarthOrbitModel
