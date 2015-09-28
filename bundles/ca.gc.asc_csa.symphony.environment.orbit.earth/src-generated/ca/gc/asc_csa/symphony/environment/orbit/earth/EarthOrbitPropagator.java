/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.environment.orbit.earth;

import java.util.Date;
import java.util.List;

import org.orekit.propagation.Propagator;

import ca.gc.asc_csa.symphony.environment.orbit.AbstractOrbitPropagator;

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
 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.SymphonyEarthOrbitEnvironmentPackage#getEarthOrbitPropagator()
 * @model abstract="true"
 * @generated
 */
public interface EarthOrbitPropagator extends AbstractOrbitPropagator {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="ca.gc.asc_csa.symphony.environment.orbit.earth.OreKitPropagator" unique="false"
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
	 * @model dataType="ca.gc.asc_csa.symphony.environment.orbit.earth.List<ca.gc.asc_csa.symphony.environment.orbit.earth.VisibilityPass>" unique="false" many="false" exceptions="ca.gc.asc_csa.symphony.environment.orbit.earth.Exception" earthSurfaceLocationUnique="false" startDateUnique="false" endDateUnique="false" elevationMaskUnique="false"
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
	 * @model dataType="ca.gc.asc_csa.symphony.environment.orbit.earth.List<ca.gc.asc_csa.symphony.environment.orbit.earth.VisibilityPass>" unique="false" many="false" exceptions="ca.gc.asc_csa.symphony.environment.orbit.earth.Exception" groundStationUnique="false" startDateUnique="false" endDateUnique="false"
	 * @generated
	 */
	List<VisibilityPass> getGroundStationPasses(GroundStation groundStation, Date startDate, Date endDate) throws Exception;
} // EarthOrbitPropagator
