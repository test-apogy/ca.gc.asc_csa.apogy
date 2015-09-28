/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.environment.orbit.earth.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import ca.gc.asc_csa.eclipse.emf.ecore.Described;
import ca.gc.asc_csa.eclipse.emf.ecore.Named;
import ca.gc.asc_csa.eclipse.emf.ecore.Timed;
import ca.gc.asc_csa.symphony.core.AbstractWorksite;
import ca.gc.asc_csa.symphony.core.Updatable;
import ca.gc.asc_csa.symphony.environment.Sky;
import ca.gc.asc_csa.symphony.environment.Worksite;
import ca.gc.asc_csa.symphony.environment.orbit.AbstractFrame;
import ca.gc.asc_csa.symphony.environment.orbit.AbstractOrbitPropagator;
import ca.gc.asc_csa.symphony.environment.orbit.AttitudeProvider;
import ca.gc.asc_csa.symphony.environment.orbit.Orbit;
import ca.gc.asc_csa.symphony.environment.orbit.OrbitWorksite;
import ca.gc.asc_csa.symphony.environment.orbit.SpacecraftState;
import ca.gc.asc_csa.symphony.environment.orbit.earth.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.SymphonyEarthOrbitEnvironmentPackage
 * @generated
 */
public class SymphonyEarthOrbitEnvironmentSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SymphonyEarthOrbitEnvironmentPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymphonyEarthOrbitEnvironmentSwitch() {
		if (modelPackage == null) {
			modelPackage = SymphonyEarthOrbitEnvironmentPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SymphonyEarthOrbitEnvironmentPackage.ORE_KIT_BACKED_SPACECRAFT_STATE: {
				OreKitBackedSpacecraftState oreKitBackedSpacecraftState = (OreKitBackedSpacecraftState)theEObject;
				T result = caseOreKitBackedSpacecraftState(oreKitBackedSpacecraftState);
				if (result == null) result = caseSpacecraftState(oreKitBackedSpacecraftState);
				if (result == null) result = caseTimed(oreKitBackedSpacecraftState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SymphonyEarthOrbitEnvironmentPackage.ORE_KIT_BACKED_FRAME: {
				OreKitBackedFrame oreKitBackedFrame = (OreKitBackedFrame)theEObject;
				T result = caseOreKitBackedFrame(oreKitBackedFrame);
				if (result == null) result = caseAbstractFrame(oreKitBackedFrame);
				if (result == null) result = caseNamed(oreKitBackedFrame);
				if (result == null) result = caseDescribed(oreKitBackedFrame);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SymphonyEarthOrbitEnvironmentPackage.ORE_KIT_BACKED_ATTITUDE_PROVIDER: {
				OreKitBackedAttitudeProvider oreKitBackedAttitudeProvider = (OreKitBackedAttitudeProvider)theEObject;
				T result = caseOreKitBackedAttitudeProvider(oreKitBackedAttitudeProvider);
				if (result == null) result = caseAttitudeProvider(oreKitBackedAttitudeProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SymphonyEarthOrbitEnvironmentPackage.NADIR_POINTING_ATTITUDE_PROVIDER: {
				NadirPointingAttitudeProvider nadirPointingAttitudeProvider = (NadirPointingAttitudeProvider)theEObject;
				T result = caseNadirPointingAttitudeProvider(nadirPointingAttitudeProvider);
				if (result == null) result = caseOreKitBackedAttitudeProvider(nadirPointingAttitudeProvider);
				if (result == null) result = caseAttitudeProvider(nadirPointingAttitudeProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SymphonyEarthOrbitEnvironmentPackage.EARTH_ORBIT_WORKSITE: {
				EarthOrbitWorksite earthOrbitWorksite = (EarthOrbitWorksite)theEObject;
				T result = caseEarthOrbitWorksite(earthOrbitWorksite);
				if (result == null) result = caseOrbitWorksite(earthOrbitWorksite);
				if (result == null) result = caseWorksite(earthOrbitWorksite);
				if (result == null) result = caseAbstractWorksite(earthOrbitWorksite);
				if (result == null) result = caseNamed(earthOrbitWorksite);
				if (result == null) result = caseDescribed(earthOrbitWorksite);
				if (result == null) result = caseTimed(earthOrbitWorksite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SymphonyEarthOrbitEnvironmentPackage.EARTH_ORBIT_SKY: {
				EarthOrbitSky earthOrbitSky = (EarthOrbitSky)theEObject;
				T result = caseEarthOrbitSky(earthOrbitSky);
				if (result == null) result = caseSky(earthOrbitSky);
				if (result == null) result = caseTimed(earthOrbitSky);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SymphonyEarthOrbitEnvironmentPackage.EARTH_ORBIT: {
				EarthOrbit earthOrbit = (EarthOrbit)theEObject;
				T result = caseEarthOrbit(earthOrbit);
				if (result == null) result = caseOrbit(earthOrbit);
				if (result == null) result = caseNamed(earthOrbit);
				if (result == null) result = caseDescribed(earthOrbit);
				if (result == null) result = caseTimed(earthOrbit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SymphonyEarthOrbitEnvironmentPackage.KEPLERIAN_EARTH_ORBIT: {
				KeplerianEarthOrbit keplerianEarthOrbit = (KeplerianEarthOrbit)theEObject;
				T result = caseKeplerianEarthOrbit(keplerianEarthOrbit);
				if (result == null) result = caseEarthOrbit(keplerianEarthOrbit);
				if (result == null) result = caseOrbit(keplerianEarthOrbit);
				if (result == null) result = caseNamed(keplerianEarthOrbit);
				if (result == null) result = caseDescribed(keplerianEarthOrbit);
				if (result == null) result = caseTimed(keplerianEarthOrbit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SymphonyEarthOrbitEnvironmentPackage.CARTESIAN_EARTH_ORBIT: {
				CartesianEarthOrbit cartesianEarthOrbit = (CartesianEarthOrbit)theEObject;
				T result = caseCartesianEarthOrbit(cartesianEarthOrbit);
				if (result == null) result = caseEarthOrbit(cartesianEarthOrbit);
				if (result == null) result = caseOrbit(cartesianEarthOrbit);
				if (result == null) result = caseNamed(cartesianEarthOrbit);
				if (result == null) result = caseDescribed(cartesianEarthOrbit);
				if (result == null) result = caseTimed(cartesianEarthOrbit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SymphonyEarthOrbitEnvironmentPackage.ELEVATION_MASK: {
				ElevationMask elevationMask = (ElevationMask)theEObject;
				T result = caseElevationMask(elevationMask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SymphonyEarthOrbitEnvironmentPackage.CONSTANT_ELEVATION_MASK: {
				ConstantElevationMask constantElevationMask = (ConstantElevationMask)theEObject;
				T result = caseConstantElevationMask(constantElevationMask);
				if (result == null) result = caseElevationMask(constantElevationMask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SymphonyEarthOrbitEnvironmentPackage.EARTH_ORBIT_PROPAGATOR: {
				EarthOrbitPropagator earthOrbitPropagator = (EarthOrbitPropagator)theEObject;
				T result = caseEarthOrbitPropagator(earthOrbitPropagator);
				if (result == null) result = caseAbstractOrbitPropagator(earthOrbitPropagator);
				if (result == null) result = caseNamed(earthOrbitPropagator);
				if (result == null) result = caseDescribed(earthOrbitPropagator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SymphonyEarthOrbitEnvironmentPackage.KEPLERIAN_EARTH_ORBIT_PROPAGATOR: {
				KeplerianEarthOrbitPropagator keplerianEarthOrbitPropagator = (KeplerianEarthOrbitPropagator)theEObject;
				T result = caseKeplerianEarthOrbitPropagator(keplerianEarthOrbitPropagator);
				if (result == null) result = caseEarthOrbitPropagator(keplerianEarthOrbitPropagator);
				if (result == null) result = caseAbstractOrbitPropagator(keplerianEarthOrbitPropagator);
				if (result == null) result = caseNamed(keplerianEarthOrbitPropagator);
				if (result == null) result = caseDescribed(keplerianEarthOrbitPropagator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SymphonyEarthOrbitEnvironmentPackage.TLE_EARTH_ORBIT_PROPAGATOR: {
				TLEEarthOrbitPropagator tleEarthOrbitPropagator = (TLEEarthOrbitPropagator)theEObject;
				T result = caseTLEEarthOrbitPropagator(tleEarthOrbitPropagator);
				if (result == null) result = caseEarthOrbitPropagator(tleEarthOrbitPropagator);
				if (result == null) result = caseAbstractOrbitPropagator(tleEarthOrbitPropagator);
				if (result == null) result = caseNamed(tleEarthOrbitPropagator);
				if (result == null) result = caseDescribed(tleEarthOrbitPropagator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SymphonyEarthOrbitEnvironmentPackage.URL_BASED_TLE_EARTH_ORBIT_PROPAGATOR: {
				URLBasedTLEEarthOrbitPropagator urlBasedTLEEarthOrbitPropagator = (URLBasedTLEEarthOrbitPropagator)theEObject;
				T result = caseURLBasedTLEEarthOrbitPropagator(urlBasedTLEEarthOrbitPropagator);
				if (result == null) result = caseTLEEarthOrbitPropagator(urlBasedTLEEarthOrbitPropagator);
				if (result == null) result = caseEarthOrbitPropagator(urlBasedTLEEarthOrbitPropagator);
				if (result == null) result = caseAbstractOrbitPropagator(urlBasedTLEEarthOrbitPropagator);
				if (result == null) result = caseNamed(urlBasedTLEEarthOrbitPropagator);
				if (result == null) result = caseDescribed(urlBasedTLEEarthOrbitPropagator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SymphonyEarthOrbitEnvironmentPackage.TLE: {
				TLE tle = (TLE)theEObject;
				T result = caseTLE(tle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SymphonyEarthOrbitEnvironmentPackage.EARTH_SURFACE_LOCATION: {
				EarthSurfaceLocation earthSurfaceLocation = (EarthSurfaceLocation)theEObject;
				T result = caseEarthSurfaceLocation(earthSurfaceLocation);
				if (result == null) result = caseNamed(earthSurfaceLocation);
				if (result == null) result = caseDescribed(earthSurfaceLocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SymphonyEarthOrbitEnvironmentPackage.EARTH_SURFACE_LOCATION_LIST: {
				EarthSurfaceLocationList earthSurfaceLocationList = (EarthSurfaceLocationList)theEObject;
				T result = caseEarthSurfaceLocationList(earthSurfaceLocationList);
				if (result == null) result = caseNamed(earthSurfaceLocationList);
				if (result == null) result = caseDescribed(earthSurfaceLocationList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SymphonyEarthOrbitEnvironmentPackage.GROUND_STATION: {
				GroundStation groundStation = (GroundStation)theEObject;
				T result = caseGroundStation(groundStation);
				if (result == null) result = caseEarthSurfaceLocation(groundStation);
				if (result == null) result = caseNamed(groundStation);
				if (result == null) result = caseDescribed(groundStation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SymphonyEarthOrbitEnvironmentPackage.GROUND_STATION_LIST: {
				GroundStationList groundStationList = (GroundStationList)theEObject;
				T result = caseGroundStationList(groundStationList);
				if (result == null) result = caseNamed(groundStationList);
				if (result == null) result = caseDescribed(groundStationList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SymphonyEarthOrbitEnvironmentPackage.VISIBILITY_PASS: {
				VisibilityPass visibilityPass = (VisibilityPass)theEObject;
				T result = caseVisibilityPass(visibilityPass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SymphonyEarthOrbitEnvironmentPackage.VISIBILITY_PASS_SPACECRAFT_POSITION_HISTORY: {
				VisibilityPassSpacecraftPositionHistory visibilityPassSpacecraftPositionHistory = (VisibilityPassSpacecraftPositionHistory)theEObject;
				T result = caseVisibilityPassSpacecraftPositionHistory(visibilityPassSpacecraftPositionHistory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SymphonyEarthOrbitEnvironmentPackage.VISIBILITY_PASS_SPACECRAFT_POSITION: {
				VisibilityPassSpacecraftPosition visibilityPassSpacecraftPosition = (VisibilityPassSpacecraftPosition)theEObject;
				T result = caseVisibilityPassSpacecraftPosition(visibilityPassSpacecraftPosition);
				if (result == null) result = caseTimed(visibilityPassSpacecraftPosition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFTS_VISIBILITY_SET: {
				SpacecraftsVisibilitySet spacecraftsVisibilitySet = (SpacecraftsVisibilitySet)theEObject;
				T result = caseSpacecraftsVisibilitySet(spacecraftsVisibilitySet);
				if (result == null) result = caseNamed(spacecraftsVisibilitySet);
				if (result == null) result = caseDescribed(spacecraftsVisibilitySet);
				if (result == null) result = caseUpdatable(spacecraftsVisibilitySet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SymphonyEarthOrbitEnvironmentPackage.CORRIDOR_POINT: {
				CorridorPoint corridorPoint = (CorridorPoint)theEObject;
				T result = caseCorridorPoint(corridorPoint);
				if (result == null) result = caseTimed(corridorPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SymphonyEarthOrbitEnvironmentPackage.CORRIDOR: {
				Corridor corridor = (Corridor)theEObject;
				T result = caseCorridor(corridor);
				if (result == null) result = caseNamed(corridor);
				if (result == null) result = caseDescribed(corridor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFT_SWATH_CORRIDOR: {
				SpacecraftSwathCorridor spacecraftSwathCorridor = (SpacecraftSwathCorridor)theEObject;
				T result = caseSpacecraftSwathCorridor(spacecraftSwathCorridor);
				if (result == null) result = caseNamed(spacecraftSwathCorridor);
				if (result == null) result = caseDescribed(spacecraftSwathCorridor);
				if (result == null) result = caseUpdatable(spacecraftSwathCorridor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SymphonyEarthOrbitEnvironmentPackage.EARTH_ORBIT_FACADE: {
				EarthOrbitFacade earthOrbitFacade = (EarthOrbitFacade)theEObject;
				T result = caseEarthOrbitFacade(earthOrbitFacade);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ore Kit Backed Spacecraft State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ore Kit Backed Spacecraft State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOreKitBackedSpacecraftState(OreKitBackedSpacecraftState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ore Kit Backed Frame</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ore Kit Backed Frame</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOreKitBackedFrame(OreKitBackedFrame object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ore Kit Backed Attitude Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ore Kit Backed Attitude Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOreKitBackedAttitudeProvider(OreKitBackedAttitudeProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nadir Pointing Attitude Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nadir Pointing Attitude Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNadirPointingAttitudeProvider(NadirPointingAttitudeProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Earth Orbit Worksite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Earth Orbit Worksite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEarthOrbitWorksite(EarthOrbitWorksite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Earth Orbit Sky</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Earth Orbit Sky</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEarthOrbitSky(EarthOrbitSky object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Earth Orbit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Earth Orbit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEarthOrbit(EarthOrbit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Keplerian Earth Orbit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Keplerian Earth Orbit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeplerianEarthOrbit(KeplerianEarthOrbit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cartesian Earth Orbit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cartesian Earth Orbit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCartesianEarthOrbit(CartesianEarthOrbit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elevation Mask</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elevation Mask</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElevationMask(ElevationMask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constant Elevation Mask</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constant Elevation Mask</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstantElevationMask(ConstantElevationMask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Earth Orbit Propagator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Earth Orbit Propagator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEarthOrbitPropagator(EarthOrbitPropagator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Keplerian Earth Orbit Propagator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Keplerian Earth Orbit Propagator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeplerianEarthOrbitPropagator(KeplerianEarthOrbitPropagator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TLE Earth Orbit Propagator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TLE Earth Orbit Propagator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTLEEarthOrbitPropagator(TLEEarthOrbitPropagator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>URL Based TLE Earth Orbit Propagator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>URL Based TLE Earth Orbit Propagator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseURLBasedTLEEarthOrbitPropagator(URLBasedTLEEarthOrbitPropagator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TLE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TLE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTLE(TLE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Earth Surface Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Earth Surface Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEarthSurfaceLocation(EarthSurfaceLocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Earth Surface Location List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Earth Surface Location List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEarthSurfaceLocationList(EarthSurfaceLocationList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ground Station</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ground Station</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroundStation(GroundStation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ground Station List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ground Station List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroundStationList(GroundStationList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Visibility Pass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Visibility Pass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVisibilityPass(VisibilityPass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Visibility Pass Spacecraft Position History</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Visibility Pass Spacecraft Position History</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVisibilityPassSpacecraftPositionHistory(VisibilityPassSpacecraftPositionHistory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Visibility Pass Spacecraft Position</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Visibility Pass Spacecraft Position</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVisibilityPassSpacecraftPosition(VisibilityPassSpacecraftPosition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spacecrafts Visibility Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spacecrafts Visibility Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpacecraftsVisibilitySet(SpacecraftsVisibilitySet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Corridor Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Corridor Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCorridorPoint(CorridorPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Corridor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Corridor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCorridor(Corridor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spacecraft Swath Corridor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spacecraft Swath Corridor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpacecraftSwathCorridor(SpacecraftSwathCorridor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Earth Orbit Facade</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Earth Orbit Facade</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEarthOrbitFacade(EarthOrbitFacade object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamed(Named object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Described</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Described</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDescribed(Described object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Frame</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Frame</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractFrame(AbstractFrame object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attitude Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attitude Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttitudeProvider(AttitudeProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Worksite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Worksite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractWorksite(AbstractWorksite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timed</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimed(Timed object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spacecraft State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spacecraft State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpacecraftState(SpacecraftState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Worksite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Worksite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorksite(Worksite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Orbit Worksite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Orbit Worksite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrbitWorksite(OrbitWorksite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sky</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sky</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSky(Sky object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Orbit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Orbit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrbit(Orbit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Orbit Propagator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Orbit Propagator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractOrbitPropagator(AbstractOrbitPropagator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Updatable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Updatable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdatable(Updatable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SymphonyEarthOrbitEnvironmentSwitch
