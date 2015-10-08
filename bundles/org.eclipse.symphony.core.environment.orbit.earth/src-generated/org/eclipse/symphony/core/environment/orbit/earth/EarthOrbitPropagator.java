/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.orbit.earth;

import java.util.Date;
import java.util.List;

import org.eclipse.symphony.core.environment.orbit.AbstractOrbitPropagator;
import org.orekit.propagation.Propagator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Earth Orbit Propagator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Defines an Orbit propagator for Earth orbits.
 * <!-- end-model-doc -->
 *
 *
 * @see org.eclipse.symphony.core.environment.orbit.earth.SymphonyEarthOrbitEnvironmentPackage#getEarthOrbitPropagator()
 * @model abstract="true"
 * @generated
 */
public interface EarthOrbitPropagator extends AbstractOrbitPropagator {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.symphony.core.environment.orbit.earth.OreKitPropagator" unique="false"
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
	 * @model dataType="org.eclipse.symphony.core.environment.orbit.earth.List<org.eclipse.symphony.core.environment.orbit.earth.VisibilityPass>" unique="false" many="false" exceptions="org.eclipse.symphony.core.environment.orbit.earth.Exception" earthSurfaceLocationUnique="false" startDateUnique="false" endDateUnique="false" elevationMaskUnique="false"
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
	 * @model dataType="org.eclipse.symphony.core.environment.orbit.earth.List<org.eclipse.symphony.core.environment.orbit.earth.VisibilityPass>" unique="false" many="false" exceptions="org.eclipse.symphony.core.environment.orbit.earth.Exception" groundStationUnique="false" startDateUnique="false" endDateUnique="false"
	 * @generated
	 */
	List<VisibilityPass> getGroundStationPasses(GroundStation groundStation, Date startDate, Date endDate) throws Exception;
} // EarthOrbitPropagator
