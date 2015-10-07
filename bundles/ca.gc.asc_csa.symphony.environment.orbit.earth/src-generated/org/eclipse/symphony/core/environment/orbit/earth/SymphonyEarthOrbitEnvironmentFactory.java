/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.orbit.earth;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.symphony.core.environment.orbit.earth.SymphonyEarthOrbitEnvironmentPackage
 * @generated
 */
public interface SymphonyEarthOrbitEnvironmentFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SymphonyEarthOrbitEnvironmentFactory eINSTANCE = org.eclipse.symphony.core.environment.orbit.earth.impl.SymphonyEarthOrbitEnvironmentFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Ore Kit Backed Spacecraft State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ore Kit Backed Spacecraft State</em>'.
	 * @generated
	 */
	OreKitBackedSpacecraftState createOreKitBackedSpacecraftState();

	/**
	 * Returns a new object of class '<em>Ore Kit Backed Frame</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ore Kit Backed Frame</em>'.
	 * @generated
	 */
	OreKitBackedFrame createOreKitBackedFrame();

	/**
	 * Returns a new object of class '<em>Nadir Pointing Attitude Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nadir Pointing Attitude Provider</em>'.
	 * @generated
	 */
	NadirPointingAttitudeProvider createNadirPointingAttitudeProvider();

	/**
	 * Returns a new object of class '<em>Earth Orbit Worksite</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Earth Orbit Worksite</em>'.
	 * @generated
	 */
	EarthOrbitWorksite createEarthOrbitWorksite();

	/**
	 * Returns a new object of class '<em>Earth Orbit Sky</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Earth Orbit Sky</em>'.
	 * @generated
	 */
	EarthOrbitSky createEarthOrbitSky();

	/**
	 * Returns a new object of class '<em>Keplerian Earth Orbit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Keplerian Earth Orbit</em>'.
	 * @generated
	 */
	KeplerianEarthOrbit createKeplerianEarthOrbit();

	/**
	 * Returns a new object of class '<em>Cartesian Earth Orbit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cartesian Earth Orbit</em>'.
	 * @generated
	 */
	CartesianEarthOrbit createCartesianEarthOrbit();

	/**
	 * Returns a new object of class '<em>Constant Elevation Mask</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constant Elevation Mask</em>'.
	 * @generated
	 */
	ConstantElevationMask createConstantElevationMask();

	/**
	 * Returns a new object of class '<em>Keplerian Earth Orbit Propagator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Keplerian Earth Orbit Propagator</em>'.
	 * @generated
	 */
	KeplerianEarthOrbitPropagator createKeplerianEarthOrbitPropagator();

	/**
	 * Returns a new object of class '<em>TLE Earth Orbit Propagator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TLE Earth Orbit Propagator</em>'.
	 * @generated
	 */
	TLEEarthOrbitPropagator createTLEEarthOrbitPropagator();

	/**
	 * Returns a new object of class '<em>URL Based TLE Earth Orbit Propagator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>URL Based TLE Earth Orbit Propagator</em>'.
	 * @generated
	 */
	URLBasedTLEEarthOrbitPropagator createURLBasedTLEEarthOrbitPropagator();

	/**
	 * Returns a new object of class '<em>TLE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TLE</em>'.
	 * @generated
	 */
	TLE createTLE();

	/**
	 * Returns a new object of class '<em>Earth Surface Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Earth Surface Location</em>'.
	 * @generated
	 */
	EarthSurfaceLocation createEarthSurfaceLocation();

	/**
	 * Returns a new object of class '<em>Earth Surface Location List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Earth Surface Location List</em>'.
	 * @generated
	 */
	EarthSurfaceLocationList createEarthSurfaceLocationList();

	/**
	 * Returns a new object of class '<em>Ground Station</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ground Station</em>'.
	 * @generated
	 */
	GroundStation createGroundStation();

	/**
	 * Returns a new object of class '<em>Ground Station List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ground Station List</em>'.
	 * @generated
	 */
	GroundStationList createGroundStationList();

	/**
	 * Returns a new object of class '<em>Visibility Pass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Visibility Pass</em>'.
	 * @generated
	 */
	VisibilityPass createVisibilityPass();

	/**
	 * Returns a new object of class '<em>Visibility Pass Spacecraft Position History</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Visibility Pass Spacecraft Position History</em>'.
	 * @generated
	 */
	VisibilityPassSpacecraftPositionHistory createVisibilityPassSpacecraftPositionHistory();

	/**
	 * Returns a new object of class '<em>Visibility Pass Spacecraft Position</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Visibility Pass Spacecraft Position</em>'.
	 * @generated
	 */
	VisibilityPassSpacecraftPosition createVisibilityPassSpacecraftPosition();

	/**
	 * Returns a new object of class '<em>Spacecrafts Visibility Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spacecrafts Visibility Set</em>'.
	 * @generated
	 */
	SpacecraftsVisibilitySet createSpacecraftsVisibilitySet();

	/**
	 * Returns a new object of class '<em>Corridor Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Corridor Point</em>'.
	 * @generated
	 */
	CorridorPoint createCorridorPoint();

	/**
	 * Returns a new object of class '<em>Corridor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Corridor</em>'.
	 * @generated
	 */
	Corridor createCorridor();

	/**
	 * Returns a new object of class '<em>Spacecraft Swath Corridor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spacecraft Swath Corridor</em>'.
	 * @generated
	 */
	SpacecraftSwathCorridor createSpacecraftSwathCorridor();

	/**
	 * Returns a new object of class '<em>Earth Orbit Facade</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Earth Orbit Facade</em>'.
	 * @generated
	 */
	EarthOrbitFacade createEarthOrbitFacade();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SymphonyEarthOrbitEnvironmentPackage getSymphonyEarthOrbitEnvironmentPackage();

} //SymphonyEarthOrbitEnvironmentFactory
