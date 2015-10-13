/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.orbit.earth.impl;

import java.util.List;
import java.util.Map;
import java.util.SortedSet;

import org.apache.commons.math3.geometry.euclidean.threed.Rotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.symphony.core.environment.orbit.earth.CartesianEarthOrbit;
import org.eclipse.symphony.core.environment.orbit.earth.ConstantElevationMask;
import org.eclipse.symphony.core.environment.orbit.earth.Corridor;
import org.eclipse.symphony.core.environment.orbit.earth.CorridorPoint;
import org.eclipse.symphony.core.environment.orbit.earth.EarthOrbitFacade;
import org.eclipse.symphony.core.environment.orbit.earth.EarthOrbitSky;
import org.eclipse.symphony.core.environment.orbit.earth.EarthOrbitWorksite;
import org.eclipse.symphony.core.environment.orbit.earth.EarthSurfaceLocation;
import org.eclipse.symphony.core.environment.orbit.earth.EarthSurfaceLocationList;
import org.eclipse.symphony.core.environment.orbit.earth.EphemerisType;
import org.eclipse.symphony.core.environment.orbit.earth.GroundStation;
import org.eclipse.symphony.core.environment.orbit.earth.GroundStationList;
import org.eclipse.symphony.core.environment.orbit.earth.KeplerianEarthOrbit;
import org.eclipse.symphony.core.environment.orbit.earth.KeplerianEarthOrbitPropagator;
import org.eclipse.symphony.core.environment.orbit.earth.NadirPointingAttitudeProvider;
import org.eclipse.symphony.core.environment.orbit.earth.OreKitBackedFrame;
import org.eclipse.symphony.core.environment.orbit.earth.OreKitBackedSpacecraftState;
import org.eclipse.symphony.core.environment.orbit.earth.SpacecraftSwathCorridor;
import org.eclipse.symphony.core.environment.orbit.earth.SpacecraftsVisibilitySet;
import org.eclipse.symphony.core.environment.orbit.earth.SymphonyEarthOrbitEnvironmentFactory;
import org.eclipse.symphony.core.environment.orbit.earth.SymphonyEarthOrbitEnvironmentPackage;
import org.eclipse.symphony.core.environment.orbit.earth.TLE;
import org.eclipse.symphony.core.environment.orbit.earth.TLEEarthOrbitPropagator;
import org.eclipse.symphony.core.environment.orbit.earth.URLBasedTLEEarthOrbitPropagator;
import org.eclipse.symphony.core.environment.orbit.earth.VisibilityPass;
import org.eclipse.symphony.core.environment.orbit.earth.VisibilityPassSpacecraftPosition;
import org.eclipse.symphony.core.environment.orbit.earth.VisibilityPassSpacecraftPositionHistory;
import org.orekit.attitudes.AttitudeProvider;
import org.orekit.frames.Frame;
import org.orekit.orbits.CartesianOrbit;
import org.orekit.orbits.KeplerianOrbit;
import org.orekit.orbits.Orbit;
import org.orekit.propagation.Propagator;
import org.orekit.propagation.SpacecraftState;
import org.orekit.propagation.analytical.EcksteinHechlerPropagator;
import org.orekit.propagation.analytical.Ephemeris;
import org.orekit.propagation.analytical.KeplerianPropagator;
import org.orekit.propagation.analytical.tle.TLEPropagator;
import org.orekit.propagation.numerical.NumericalPropagator;
import org.orekit.propagation.semianalytical.dsst.DSSTPropagator;
import org.orekit.time.AbsoluteDate;
import org.orekit.utils.ElevationMask;
import org.orekit.utils.TimeStampedAngularCoordinates;
import org.orekit.utils.TimeStampedPVCoordinates;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SymphonyEarthOrbitEnvironmentFactoryImpl extends EFactoryImpl implements SymphonyEarthOrbitEnvironmentFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SymphonyEarthOrbitEnvironmentFactory init() {
		try {
			SymphonyEarthOrbitEnvironmentFactory theSymphonyEarthOrbitEnvironmentFactory = (SymphonyEarthOrbitEnvironmentFactory)EPackage.Registry.INSTANCE.getEFactory(SymphonyEarthOrbitEnvironmentPackage.eNS_URI);
			if (theSymphonyEarthOrbitEnvironmentFactory != null) {
				return theSymphonyEarthOrbitEnvironmentFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SymphonyEarthOrbitEnvironmentFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymphonyEarthOrbitEnvironmentFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SymphonyEarthOrbitEnvironmentPackage.ORE_KIT_BACKED_SPACECRAFT_STATE: return createOreKitBackedSpacecraftState();
			case SymphonyEarthOrbitEnvironmentPackage.ORE_KIT_BACKED_FRAME: return createOreKitBackedFrame();
			case SymphonyEarthOrbitEnvironmentPackage.NADIR_POINTING_ATTITUDE_PROVIDER: return createNadirPointingAttitudeProvider();
			case SymphonyEarthOrbitEnvironmentPackage.EARTH_ORBIT_WORKSITE: return createEarthOrbitWorksite();
			case SymphonyEarthOrbitEnvironmentPackage.EARTH_ORBIT_SKY: return createEarthOrbitSky();
			case SymphonyEarthOrbitEnvironmentPackage.KEPLERIAN_EARTH_ORBIT: return createKeplerianEarthOrbit();
			case SymphonyEarthOrbitEnvironmentPackage.CARTESIAN_EARTH_ORBIT: return createCartesianEarthOrbit();
			case SymphonyEarthOrbitEnvironmentPackage.CONSTANT_ELEVATION_MASK: return createConstantElevationMask();
			case SymphonyEarthOrbitEnvironmentPackage.KEPLERIAN_EARTH_ORBIT_PROPAGATOR: return createKeplerianEarthOrbitPropagator();
			case SymphonyEarthOrbitEnvironmentPackage.TLE_EARTH_ORBIT_PROPAGATOR: return createTLEEarthOrbitPropagator();
			case SymphonyEarthOrbitEnvironmentPackage.URL_BASED_TLE_EARTH_ORBIT_PROPAGATOR: return createURLBasedTLEEarthOrbitPropagator();
			case SymphonyEarthOrbitEnvironmentPackage.TLE: return createTLE();
			case SymphonyEarthOrbitEnvironmentPackage.EARTH_SURFACE_LOCATION: return createEarthSurfaceLocation();
			case SymphonyEarthOrbitEnvironmentPackage.EARTH_SURFACE_LOCATION_LIST: return createEarthSurfaceLocationList();
			case SymphonyEarthOrbitEnvironmentPackage.GROUND_STATION: return createGroundStation();
			case SymphonyEarthOrbitEnvironmentPackage.GROUND_STATION_LIST: return createGroundStationList();
			case SymphonyEarthOrbitEnvironmentPackage.VISIBILITY_PASS: return createVisibilityPass();
			case SymphonyEarthOrbitEnvironmentPackage.VISIBILITY_PASS_SPACECRAFT_POSITION_HISTORY: return createVisibilityPassSpacecraftPositionHistory();
			case SymphonyEarthOrbitEnvironmentPackage.VISIBILITY_PASS_SPACECRAFT_POSITION: return createVisibilityPassSpacecraftPosition();
			case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFTS_VISIBILITY_SET: return createSpacecraftsVisibilitySet();
			case SymphonyEarthOrbitEnvironmentPackage.CORRIDOR_POINT: return createCorridorPoint();
			case SymphonyEarthOrbitEnvironmentPackage.CORRIDOR: return createCorridor();
			case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFT_SWATH_CORRIDOR: return createSpacecraftSwathCorridor();
			case SymphonyEarthOrbitEnvironmentPackage.EARTH_ORBIT_FACADE: return createEarthOrbitFacade();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case SymphonyEarthOrbitEnvironmentPackage.EPHEMERIS_TYPE:
				return createEphemerisTypeFromString(eDataType, initialValue);
			case SymphonyEarthOrbitEnvironmentPackage.LIST:
				return createListFromString(eDataType, initialValue);
			case SymphonyEarthOrbitEnvironmentPackage.MAP:
				return createMapFromString(eDataType, initialValue);
			case SymphonyEarthOrbitEnvironmentPackage.EXCEPTION:
				return createExceptionFromString(eDataType, initialValue);
			case SymphonyEarthOrbitEnvironmentPackage.SORTED_SET:
				return createSortedSetFromString(eDataType, initialValue);
			case SymphonyEarthOrbitEnvironmentPackage.ROTATION:
				return createRotationFromString(eDataType, initialValue);
			case SymphonyEarthOrbitEnvironmentPackage.ORE_KIT_FRAME:
				return createOreKitFrameFromString(eDataType, initialValue);
			case SymphonyEarthOrbitEnvironmentPackage.ORE_KIT_TIME_STAMPED_ANGULAR_COORDINATES:
				return createOreKitTimeStampedAngularCoordinatesFromString(eDataType, initialValue);
			case SymphonyEarthOrbitEnvironmentPackage.ORE_KIT_TIME_STAMPED_PV_COORDINATES:
				return createOreKitTimeStampedPVCoordinatesFromString(eDataType, initialValue);
			case SymphonyEarthOrbitEnvironmentPackage.ORE_KIT_SPACECRAFT_STATE:
				return createOreKitSpacecraftStateFromString(eDataType, initialValue);
			case SymphonyEarthOrbitEnvironmentPackage.ABSOLUTE_DATE:
				return createAbsoluteDateFromString(eDataType, initialValue);
			case SymphonyEarthOrbitEnvironmentPackage.ORE_KIT_ORBIT:
				return createOreKitOrbitFromString(eDataType, initialValue);
			case SymphonyEarthOrbitEnvironmentPackage.ORE_KIT_KEPLERIAN_ORBIT:
				return createOreKitKeplerianOrbitFromString(eDataType, initialValue);
			case SymphonyEarthOrbitEnvironmentPackage.ORE_KIT_CARTESIAN_ORBIT:
				return createOreKitCartesianOrbitFromString(eDataType, initialValue);
			case SymphonyEarthOrbitEnvironmentPackage.ORE_KIT_ELEVATION_MASK:
				return createOreKitElevationMaskFromString(eDataType, initialValue);
			case SymphonyEarthOrbitEnvironmentPackage.ORE_KIT_ATTITUDE_PROVIDER:
				return createOreKitAttitudeProviderFromString(eDataType, initialValue);
			case SymphonyEarthOrbitEnvironmentPackage.ORE_KIT_PROPAGATOR:
				return createOreKitPropagatorFromString(eDataType, initialValue);
			case SymphonyEarthOrbitEnvironmentPackage.ORE_KIT_DSST_PROPAGATOR:
				return createOreKitDSSTPropagatorFromString(eDataType, initialValue);
			case SymphonyEarthOrbitEnvironmentPackage.ORE_KIT_ECKSTEIN_HECHLER_PROPAGATOR:
				return createOreKitEcksteinHechlerPropagatorFromString(eDataType, initialValue);
			case SymphonyEarthOrbitEnvironmentPackage.ORE_KIT_EPHEMERIS_PROGATOR:
				return createOreKitEphemerisProgatorFromString(eDataType, initialValue);
			case SymphonyEarthOrbitEnvironmentPackage.ORE_KIT_KEPLERIAN_PROPAGATOR:
				return createOreKitKeplerianPropagatorFromString(eDataType, initialValue);
			case SymphonyEarthOrbitEnvironmentPackage.ORE_KIT_NUMERICAL_PROPAGATOR:
				return createOreKitNumericalPropagatorFromString(eDataType, initialValue);
			case SymphonyEarthOrbitEnvironmentPackage.ORE_KIT_TLE_PROPAGATOR:
				return createOreKitTLEPropagatorFromString(eDataType, initialValue);
			case SymphonyEarthOrbitEnvironmentPackage.ORE_KIT_TLE:
				return createOreKitTLEFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case SymphonyEarthOrbitEnvironmentPackage.EPHEMERIS_TYPE:
				return convertEphemerisTypeToString(eDataType, instanceValue);
			case SymphonyEarthOrbitEnvironmentPackage.LIST:
				return convertListToString(eDataType, instanceValue);
			case SymphonyEarthOrbitEnvironmentPackage.MAP:
				return convertMapToString(eDataType, instanceValue);
			case SymphonyEarthOrbitEnvironmentPackage.EXCEPTION:
				return convertExceptionToString(eDataType, instanceValue);
			case SymphonyEarthOrbitEnvironmentPackage.SORTED_SET:
				return convertSortedSetToString(eDataType, instanceValue);
			case SymphonyEarthOrbitEnvironmentPackage.ROTATION:
				return convertRotationToString(eDataType, instanceValue);
			case SymphonyEarthOrbitEnvironmentPackage.ORE_KIT_FRAME:
				return convertOreKitFrameToString(eDataType, instanceValue);
			case SymphonyEarthOrbitEnvironmentPackage.ORE_KIT_TIME_STAMPED_ANGULAR_COORDINATES:
				return convertOreKitTimeStampedAngularCoordinatesToString(eDataType, instanceValue);
			case SymphonyEarthOrbitEnvironmentPackage.ORE_KIT_TIME_STAMPED_PV_COORDINATES:
				return convertOreKitTimeStampedPVCoordinatesToString(eDataType, instanceValue);
			case SymphonyEarthOrbitEnvironmentPackage.ORE_KIT_SPACECRAFT_STATE:
				return convertOreKitSpacecraftStateToString(eDataType, instanceValue);
			case SymphonyEarthOrbitEnvironmentPackage.ABSOLUTE_DATE:
				return convertAbsoluteDateToString(eDataType, instanceValue);
			case SymphonyEarthOrbitEnvironmentPackage.ORE_KIT_ORBIT:
				return convertOreKitOrbitToString(eDataType, instanceValue);
			case SymphonyEarthOrbitEnvironmentPackage.ORE_KIT_KEPLERIAN_ORBIT:
				return convertOreKitKeplerianOrbitToString(eDataType, instanceValue);
			case SymphonyEarthOrbitEnvironmentPackage.ORE_KIT_CARTESIAN_ORBIT:
				return convertOreKitCartesianOrbitToString(eDataType, instanceValue);
			case SymphonyEarthOrbitEnvironmentPackage.ORE_KIT_ELEVATION_MASK:
				return convertOreKitElevationMaskToString(eDataType, instanceValue);
			case SymphonyEarthOrbitEnvironmentPackage.ORE_KIT_ATTITUDE_PROVIDER:
				return convertOreKitAttitudeProviderToString(eDataType, instanceValue);
			case SymphonyEarthOrbitEnvironmentPackage.ORE_KIT_PROPAGATOR:
				return convertOreKitPropagatorToString(eDataType, instanceValue);
			case SymphonyEarthOrbitEnvironmentPackage.ORE_KIT_DSST_PROPAGATOR:
				return convertOreKitDSSTPropagatorToString(eDataType, instanceValue);
			case SymphonyEarthOrbitEnvironmentPackage.ORE_KIT_ECKSTEIN_HECHLER_PROPAGATOR:
				return convertOreKitEcksteinHechlerPropagatorToString(eDataType, instanceValue);
			case SymphonyEarthOrbitEnvironmentPackage.ORE_KIT_EPHEMERIS_PROGATOR:
				return convertOreKitEphemerisProgatorToString(eDataType, instanceValue);
			case SymphonyEarthOrbitEnvironmentPackage.ORE_KIT_KEPLERIAN_PROPAGATOR:
				return convertOreKitKeplerianPropagatorToString(eDataType, instanceValue);
			case SymphonyEarthOrbitEnvironmentPackage.ORE_KIT_NUMERICAL_PROPAGATOR:
				return convertOreKitNumericalPropagatorToString(eDataType, instanceValue);
			case SymphonyEarthOrbitEnvironmentPackage.ORE_KIT_TLE_PROPAGATOR:
				return convertOreKitTLEPropagatorToString(eDataType, instanceValue);
			case SymphonyEarthOrbitEnvironmentPackage.ORE_KIT_TLE:
				return convertOreKitTLEToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OreKitBackedSpacecraftState createOreKitBackedSpacecraftState() {
		OreKitBackedSpacecraftStateImpl oreKitBackedSpacecraftState = new OreKitBackedSpacecraftStateImpl();
		return oreKitBackedSpacecraftState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OreKitBackedFrame createOreKitBackedFrame() {
		OreKitBackedFrameImpl oreKitBackedFrame = new OreKitBackedFrameImpl();
		return oreKitBackedFrame;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NadirPointingAttitudeProvider createNadirPointingAttitudeProvider() {
		NadirPointingAttitudeProviderImpl nadirPointingAttitudeProvider = new NadirPointingAttitudeProviderImpl();
		return nadirPointingAttitudeProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EarthOrbitWorksite createEarthOrbitWorksite() {
		EarthOrbitWorksiteImpl earthOrbitWorksite = new EarthOrbitWorksiteImpl();
		return earthOrbitWorksite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EarthOrbitSky createEarthOrbitSky() {
		EarthOrbitSkyImpl earthOrbitSky = new EarthOrbitSkyImpl();
		return earthOrbitSky;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeplerianEarthOrbit createKeplerianEarthOrbit() {
		KeplerianEarthOrbitImpl keplerianEarthOrbit = new KeplerianEarthOrbitImpl();
		return keplerianEarthOrbit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianEarthOrbit createCartesianEarthOrbit() {
		CartesianEarthOrbitImpl cartesianEarthOrbit = new CartesianEarthOrbitImpl();
		return cartesianEarthOrbit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstantElevationMask createConstantElevationMask() {
		ConstantElevationMaskImpl constantElevationMask = new ConstantElevationMaskImpl();
		return constantElevationMask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeplerianEarthOrbitPropagator createKeplerianEarthOrbitPropagator() {
		KeplerianEarthOrbitPropagatorImpl keplerianEarthOrbitPropagator = new KeplerianEarthOrbitPropagatorImpl();
		return keplerianEarthOrbitPropagator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TLEEarthOrbitPropagator createTLEEarthOrbitPropagator() {
		TLEEarthOrbitPropagatorImpl tleEarthOrbitPropagator = new TLEEarthOrbitPropagatorImpl();
		return tleEarthOrbitPropagator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URLBasedTLEEarthOrbitPropagator createURLBasedTLEEarthOrbitPropagator() {
		URLBasedTLEEarthOrbitPropagatorImpl urlBasedTLEEarthOrbitPropagator = new URLBasedTLEEarthOrbitPropagatorImpl();
		return urlBasedTLEEarthOrbitPropagator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TLE createTLE() {
		TLEImpl tle = new TLEImpl();
		return tle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EarthSurfaceLocation createEarthSurfaceLocation() {
		EarthSurfaceLocationImpl earthSurfaceLocation = new EarthSurfaceLocationImpl();
		return earthSurfaceLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EarthSurfaceLocationList createEarthSurfaceLocationList() {
		EarthSurfaceLocationListImpl earthSurfaceLocationList = new EarthSurfaceLocationListImpl();
		return earthSurfaceLocationList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroundStation createGroundStation() {
		GroundStationImpl groundStation = new GroundStationImpl();
		return groundStation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroundStationList createGroundStationList() {
		GroundStationListImpl groundStationList = new GroundStationListImpl();
		return groundStationList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibilityPass createVisibilityPass() {
		VisibilityPassImpl visibilityPass = new VisibilityPassImpl();
		return visibilityPass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibilityPassSpacecraftPositionHistory createVisibilityPassSpacecraftPositionHistory() {
		VisibilityPassSpacecraftPositionHistoryImpl visibilityPassSpacecraftPositionHistory = new VisibilityPassSpacecraftPositionHistoryImpl();
		return visibilityPassSpacecraftPositionHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibilityPassSpacecraftPosition createVisibilityPassSpacecraftPosition() {
		VisibilityPassSpacecraftPositionImpl visibilityPassSpacecraftPosition = new VisibilityPassSpacecraftPositionImpl();
		return visibilityPassSpacecraftPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpacecraftsVisibilitySet createSpacecraftsVisibilitySet() {
		SpacecraftsVisibilitySetImpl spacecraftsVisibilitySet = new SpacecraftsVisibilitySetImpl();
		return spacecraftsVisibilitySet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorridorPoint createCorridorPoint() {
		CorridorPointImpl corridorPoint = new CorridorPointImpl();
		return corridorPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Corridor createCorridor() {
		CorridorImpl corridor = new CorridorImpl();
		return corridor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpacecraftSwathCorridor createSpacecraftSwathCorridor() {
		SpacecraftSwathCorridorImpl spacecraftSwathCorridor = new SpacecraftSwathCorridorImpl();
		return spacecraftSwathCorridor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EarthOrbitFacade createEarthOrbitFacade() {
		EarthOrbitFacadeImpl earthOrbitFacade = new EarthOrbitFacadeImpl();
		return earthOrbitFacade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EphemerisType createEphemerisTypeFromString(EDataType eDataType, String initialValue) {
		EphemerisType result = EphemerisType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEphemerisTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<?> createListFromString(EDataType eDataType, String initialValue) {
		return (List<?>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertListToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map<?, ?> createMapFromString(EDataType eDataType, String initialValue) {
		return (Map<?, ?>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMapToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exception createExceptionFromString(EDataType eDataType, String initialValue) {
		return (Exception)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExceptionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortedSet<?> createSortedSetFromString(EDataType eDataType, String initialValue) {
		return (SortedSet<?>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSortedSetToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rotation createRotationFromString(EDataType eDataType, String initialValue) {
		return (Rotation)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRotationToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Frame createOreKitFrameFromString(EDataType eDataType, String initialValue) {
		return (Frame)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOreKitFrameToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeStampedAngularCoordinates createOreKitTimeStampedAngularCoordinatesFromString(EDataType eDataType, String initialValue) {
		return (TimeStampedAngularCoordinates)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOreKitTimeStampedAngularCoordinatesToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeStampedPVCoordinates createOreKitTimeStampedPVCoordinatesFromString(EDataType eDataType, String initialValue) {
		return (TimeStampedPVCoordinates)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOreKitTimeStampedPVCoordinatesToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpacecraftState createOreKitSpacecraftStateFromString(EDataType eDataType, String initialValue) {
		return (SpacecraftState)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOreKitSpacecraftStateToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbsoluteDate createAbsoluteDateFromString(EDataType eDataType, String initialValue) {
		return (AbsoluteDate)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAbsoluteDateToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Orbit createOreKitOrbitFromString(EDataType eDataType, String initialValue) {
		return (Orbit)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOreKitOrbitToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeplerianOrbit createOreKitKeplerianOrbitFromString(EDataType eDataType, String initialValue) {
		return (KeplerianOrbit)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOreKitKeplerianOrbitToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianOrbit createOreKitCartesianOrbitFromString(EDataType eDataType, String initialValue) {
		return (CartesianOrbit)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOreKitCartesianOrbitToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElevationMask createOreKitElevationMaskFromString(EDataType eDataType, String initialValue) {
		return (ElevationMask)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOreKitElevationMaskToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttitudeProvider createOreKitAttitudeProviderFromString(EDataType eDataType, String initialValue) {
		return (AttitudeProvider)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOreKitAttitudeProviderToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Propagator createOreKitPropagatorFromString(EDataType eDataType, String initialValue) {
		return (Propagator)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOreKitPropagatorToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSSTPropagator createOreKitDSSTPropagatorFromString(EDataType eDataType, String initialValue) {
		return (DSSTPropagator)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOreKitDSSTPropagatorToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcksteinHechlerPropagator createOreKitEcksteinHechlerPropagatorFromString(EDataType eDataType, String initialValue) {
		return (EcksteinHechlerPropagator)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOreKitEcksteinHechlerPropagatorToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ephemeris createOreKitEphemerisProgatorFromString(EDataType eDataType, String initialValue) {
		return (Ephemeris)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOreKitEphemerisProgatorToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeplerianPropagator createOreKitKeplerianPropagatorFromString(EDataType eDataType, String initialValue) {
		return (KeplerianPropagator)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOreKitKeplerianPropagatorToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericalPropagator createOreKitNumericalPropagatorFromString(EDataType eDataType, String initialValue) {
		return (NumericalPropagator)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOreKitNumericalPropagatorToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TLEPropagator createOreKitTLEPropagatorFromString(EDataType eDataType, String initialValue) {
		return (TLEPropagator)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOreKitTLEPropagatorToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.orekit.propagation.analytical.tle.TLE createOreKitTLEFromString(EDataType eDataType, String initialValue) {
		return (org.orekit.propagation.analytical.tle.TLE)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOreKitTLEToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymphonyEarthOrbitEnvironmentPackage getSymphonyEarthOrbitEnvironmentPackage() {
		return (SymphonyEarthOrbitEnvironmentPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SymphonyEarthOrbitEnvironmentPackage getPackage() {
		return SymphonyEarthOrbitEnvironmentPackage.eINSTANCE;
	}

} //SymphonyEarthOrbitEnvironmentFactoryImpl
