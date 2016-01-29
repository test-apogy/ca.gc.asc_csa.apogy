/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl;

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
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.*;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.CartesianEarthOrbit;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ConstantElevationMask;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.Corridor;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.CorridorPoint;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbitSky;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbitWorksite;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthSurfaceLocation;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthSurfaceLocationList;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.EphemerisType;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.GroundStation;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.GroundStationList;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.KeplerianEarthOrbit;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.KeplerianEarthOrbitPropagator;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.NadirPointingAttitudeProvider;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.OreKitBackedFrame;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.OreKitBackedSpacecraftState;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.SpacecraftSwathCorridor;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.SpacecraftsVisibilitySet;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFactory;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLE;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLEEarthOrbitPropagator;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.URLBasedTLEEarthOrbitPropagator;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPass;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPassSpacecraftPosition;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPassSpacecraftPositionHistory;
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
public class ApogyCoreEnvironmentOrbitEarthFactoryImpl extends EFactoryImpl implements ApogyCoreEnvironmentOrbitEarthFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ApogyCoreEnvironmentOrbitEarthFactory init() {
		try {
			ApogyCoreEnvironmentOrbitEarthFactory theApogyCoreEnvironmentOrbitEarthFactory = (ApogyCoreEnvironmentOrbitEarthFactory)EPackage.Registry.INSTANCE.getEFactory(ApogyCoreEnvironmentOrbitEarthPackage.eNS_URI);
			if (theApogyCoreEnvironmentOrbitEarthFactory != null) {
				return theApogyCoreEnvironmentOrbitEarthFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApogyCoreEnvironmentOrbitEarthFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCoreEnvironmentOrbitEarthFactoryImpl() {
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
			case ApogyCoreEnvironmentOrbitEarthPackage.ORE_KIT_BACKED_SPACECRAFT_STATE: return createOreKitBackedSpacecraftState();
			case ApogyCoreEnvironmentOrbitEarthPackage.ORE_KIT_BACKED_FRAME: return createOreKitBackedFrame();
			case ApogyCoreEnvironmentOrbitEarthPackage.NADIR_POINTING_ATTITUDE_PROVIDER: return createNadirPointingAttitudeProvider();
			case ApogyCoreEnvironmentOrbitEarthPackage.EARTH_ORBIT_WORKSITE: return createEarthOrbitWorksite();
			case ApogyCoreEnvironmentOrbitEarthPackage.EARTH_ORBIT_SKY: return createEarthOrbitSky();
			case ApogyCoreEnvironmentOrbitEarthPackage.KEPLERIAN_EARTH_ORBIT: return createKeplerianEarthOrbit();
			case ApogyCoreEnvironmentOrbitEarthPackage.CARTESIAN_EARTH_ORBIT: return createCartesianEarthOrbit();
			case ApogyCoreEnvironmentOrbitEarthPackage.CONSTANT_ELEVATION_MASK: return createConstantElevationMask();
			case ApogyCoreEnvironmentOrbitEarthPackage.KEPLERIAN_EARTH_ORBIT_PROPAGATOR: return createKeplerianEarthOrbitPropagator();
			case ApogyCoreEnvironmentOrbitEarthPackage.TLE_EARTH_ORBIT_PROPAGATOR: return createTLEEarthOrbitPropagator();
			case ApogyCoreEnvironmentOrbitEarthPackage.URL_BASED_TLE_EARTH_ORBIT_PROPAGATOR: return createURLBasedTLEEarthOrbitPropagator();
			case ApogyCoreEnvironmentOrbitEarthPackage.TLE: return createTLE();
			case ApogyCoreEnvironmentOrbitEarthPackage.EARTH_SURFACE_LOCATION: return createEarthSurfaceLocation();
			case ApogyCoreEnvironmentOrbitEarthPackage.EARTH_SURFACE_LOCATION_LIST: return createEarthSurfaceLocationList();
			case ApogyCoreEnvironmentOrbitEarthPackage.GROUND_STATION_REFERENCES_LIST: return createGroundStationReferencesList();
			case ApogyCoreEnvironmentOrbitEarthPackage.GROUND_STATION: return createGroundStation();
			case ApogyCoreEnvironmentOrbitEarthPackage.GROUND_STATION_LIST: return createGroundStationList();
			case ApogyCoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS: return createVisibilityPass();
			case ApogyCoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS_SPACECRAFT_POSITION_HISTORY: return createVisibilityPassSpacecraftPositionHistory();
			case ApogyCoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS_SPACECRAFT_POSITION: return createVisibilityPassSpacecraftPosition();
			case ApogyCoreEnvironmentOrbitEarthPackage.SPACECRAFTS_VISIBILITY_SET: return createSpacecraftsVisibilitySet();
			case ApogyCoreEnvironmentOrbitEarthPackage.CORRIDOR_POINT: return createCorridorPoint();
			case ApogyCoreEnvironmentOrbitEarthPackage.CORRIDOR: return createCorridor();
			case ApogyCoreEnvironmentOrbitEarthPackage.SPACECRAFT_SWATH_CORRIDOR: return createSpacecraftSwathCorridor();
			case ApogyCoreEnvironmentOrbitEarthPackage.APOGY_CORE_ENVIRONMENT_ORBIT_EARTH_FACADE: return createApogyCoreEnvironmentOrbitEarthFacade();
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
			case ApogyCoreEnvironmentOrbitEarthPackage.EPHEMERIS_TYPE:
				return createEphemerisTypeFromString(eDataType, initialValue);
			case ApogyCoreEnvironmentOrbitEarthPackage.LIST:
				return createListFromString(eDataType, initialValue);
			case ApogyCoreEnvironmentOrbitEarthPackage.MAP:
				return createMapFromString(eDataType, initialValue);
			case ApogyCoreEnvironmentOrbitEarthPackage.EXCEPTION:
				return createExceptionFromString(eDataType, initialValue);
			case ApogyCoreEnvironmentOrbitEarthPackage.SORTED_SET:
				return createSortedSetFromString(eDataType, initialValue);
			case ApogyCoreEnvironmentOrbitEarthPackage.ROTATION:
				return createRotationFromString(eDataType, initialValue);
			case ApogyCoreEnvironmentOrbitEarthPackage.ORE_KIT_FRAME:
				return createOreKitFrameFromString(eDataType, initialValue);
			case ApogyCoreEnvironmentOrbitEarthPackage.ORE_KIT_TIME_STAMPED_ANGULAR_COORDINATES:
				return createOreKitTimeStampedAngularCoordinatesFromString(eDataType, initialValue);
			case ApogyCoreEnvironmentOrbitEarthPackage.ORE_KIT_TIME_STAMPED_PV_COORDINATES:
				return createOreKitTimeStampedPVCoordinatesFromString(eDataType, initialValue);
			case ApogyCoreEnvironmentOrbitEarthPackage.ORE_KIT_SPACECRAFT_STATE:
				return createOreKitSpacecraftStateFromString(eDataType, initialValue);
			case ApogyCoreEnvironmentOrbitEarthPackage.ABSOLUTE_DATE:
				return createAbsoluteDateFromString(eDataType, initialValue);
			case ApogyCoreEnvironmentOrbitEarthPackage.ORE_KIT_ORBIT:
				return createOreKitOrbitFromString(eDataType, initialValue);
			case ApogyCoreEnvironmentOrbitEarthPackage.ORE_KIT_KEPLERIAN_ORBIT:
				return createOreKitKeplerianOrbitFromString(eDataType, initialValue);
			case ApogyCoreEnvironmentOrbitEarthPackage.ORE_KIT_CARTESIAN_ORBIT:
				return createOreKitCartesianOrbitFromString(eDataType, initialValue);
			case ApogyCoreEnvironmentOrbitEarthPackage.ORE_KIT_ELEVATION_MASK:
				return createOreKitElevationMaskFromString(eDataType, initialValue);
			case ApogyCoreEnvironmentOrbitEarthPackage.ORE_KIT_ATTITUDE_PROVIDER:
				return createOreKitAttitudeProviderFromString(eDataType, initialValue);
			case ApogyCoreEnvironmentOrbitEarthPackage.ORE_KIT_PROPAGATOR:
				return createOreKitPropagatorFromString(eDataType, initialValue);
			case ApogyCoreEnvironmentOrbitEarthPackage.ORE_KIT_DSST_PROPAGATOR:
				return createOreKitDSSTPropagatorFromString(eDataType, initialValue);
			case ApogyCoreEnvironmentOrbitEarthPackage.ORE_KIT_ECKSTEIN_HECHLER_PROPAGATOR:
				return createOreKitEcksteinHechlerPropagatorFromString(eDataType, initialValue);
			case ApogyCoreEnvironmentOrbitEarthPackage.ORE_KIT_EPHEMERIS_PROGATOR:
				return createOreKitEphemerisProgatorFromString(eDataType, initialValue);
			case ApogyCoreEnvironmentOrbitEarthPackage.ORE_KIT_KEPLERIAN_PROPAGATOR:
				return createOreKitKeplerianPropagatorFromString(eDataType, initialValue);
			case ApogyCoreEnvironmentOrbitEarthPackage.ORE_KIT_NUMERICAL_PROPAGATOR:
				return createOreKitNumericalPropagatorFromString(eDataType, initialValue);
			case ApogyCoreEnvironmentOrbitEarthPackage.ORE_KIT_TLE_PROPAGATOR:
				return createOreKitTLEPropagatorFromString(eDataType, initialValue);
			case ApogyCoreEnvironmentOrbitEarthPackage.ORE_KIT_TLE:
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
			case ApogyCoreEnvironmentOrbitEarthPackage.EPHEMERIS_TYPE:
				return convertEphemerisTypeToString(eDataType, instanceValue);
			case ApogyCoreEnvironmentOrbitEarthPackage.LIST:
				return convertListToString(eDataType, instanceValue);
			case ApogyCoreEnvironmentOrbitEarthPackage.MAP:
				return convertMapToString(eDataType, instanceValue);
			case ApogyCoreEnvironmentOrbitEarthPackage.EXCEPTION:
				return convertExceptionToString(eDataType, instanceValue);
			case ApogyCoreEnvironmentOrbitEarthPackage.SORTED_SET:
				return convertSortedSetToString(eDataType, instanceValue);
			case ApogyCoreEnvironmentOrbitEarthPackage.ROTATION:
				return convertRotationToString(eDataType, instanceValue);
			case ApogyCoreEnvironmentOrbitEarthPackage.ORE_KIT_FRAME:
				return convertOreKitFrameToString(eDataType, instanceValue);
			case ApogyCoreEnvironmentOrbitEarthPackage.ORE_KIT_TIME_STAMPED_ANGULAR_COORDINATES:
				return convertOreKitTimeStampedAngularCoordinatesToString(eDataType, instanceValue);
			case ApogyCoreEnvironmentOrbitEarthPackage.ORE_KIT_TIME_STAMPED_PV_COORDINATES:
				return convertOreKitTimeStampedPVCoordinatesToString(eDataType, instanceValue);
			case ApogyCoreEnvironmentOrbitEarthPackage.ORE_KIT_SPACECRAFT_STATE:
				return convertOreKitSpacecraftStateToString(eDataType, instanceValue);
			case ApogyCoreEnvironmentOrbitEarthPackage.ABSOLUTE_DATE:
				return convertAbsoluteDateToString(eDataType, instanceValue);
			case ApogyCoreEnvironmentOrbitEarthPackage.ORE_KIT_ORBIT:
				return convertOreKitOrbitToString(eDataType, instanceValue);
			case ApogyCoreEnvironmentOrbitEarthPackage.ORE_KIT_KEPLERIAN_ORBIT:
				return convertOreKitKeplerianOrbitToString(eDataType, instanceValue);
			case ApogyCoreEnvironmentOrbitEarthPackage.ORE_KIT_CARTESIAN_ORBIT:
				return convertOreKitCartesianOrbitToString(eDataType, instanceValue);
			case ApogyCoreEnvironmentOrbitEarthPackage.ORE_KIT_ELEVATION_MASK:
				return convertOreKitElevationMaskToString(eDataType, instanceValue);
			case ApogyCoreEnvironmentOrbitEarthPackage.ORE_KIT_ATTITUDE_PROVIDER:
				return convertOreKitAttitudeProviderToString(eDataType, instanceValue);
			case ApogyCoreEnvironmentOrbitEarthPackage.ORE_KIT_PROPAGATOR:
				return convertOreKitPropagatorToString(eDataType, instanceValue);
			case ApogyCoreEnvironmentOrbitEarthPackage.ORE_KIT_DSST_PROPAGATOR:
				return convertOreKitDSSTPropagatorToString(eDataType, instanceValue);
			case ApogyCoreEnvironmentOrbitEarthPackage.ORE_KIT_ECKSTEIN_HECHLER_PROPAGATOR:
				return convertOreKitEcksteinHechlerPropagatorToString(eDataType, instanceValue);
			case ApogyCoreEnvironmentOrbitEarthPackage.ORE_KIT_EPHEMERIS_PROGATOR:
				return convertOreKitEphemerisProgatorToString(eDataType, instanceValue);
			case ApogyCoreEnvironmentOrbitEarthPackage.ORE_KIT_KEPLERIAN_PROPAGATOR:
				return convertOreKitKeplerianPropagatorToString(eDataType, instanceValue);
			case ApogyCoreEnvironmentOrbitEarthPackage.ORE_KIT_NUMERICAL_PROPAGATOR:
				return convertOreKitNumericalPropagatorToString(eDataType, instanceValue);
			case ApogyCoreEnvironmentOrbitEarthPackage.ORE_KIT_TLE_PROPAGATOR:
				return convertOreKitTLEPropagatorToString(eDataType, instanceValue);
			case ApogyCoreEnvironmentOrbitEarthPackage.ORE_KIT_TLE:
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
	public GroundStationReferencesList createGroundStationReferencesList() {
		GroundStationReferencesListImpl groundStationReferencesList = new GroundStationReferencesListImpl();
		return groundStationReferencesList;
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
	public ApogyCoreEnvironmentOrbitEarthFacade createApogyCoreEnvironmentOrbitEarthFacade() {
		ApogyCoreEnvironmentOrbitEarthFacadeImpl apogyCoreEnvironmentOrbitEarthFacade = new ApogyCoreEnvironmentOrbitEarthFacadeImpl();
		return apogyCoreEnvironmentOrbitEarthFacade;
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
	public ApogyCoreEnvironmentOrbitEarthPackage getApogyCoreEnvironmentOrbitEarthPackage() {
		return (ApogyCoreEnvironmentOrbitEarthPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ApogyCoreEnvironmentOrbitEarthPackage getPackage() {
		return ApogyCoreEnvironmentOrbitEarthPackage.eINSTANCE;
	}

} //ApogyCoreEnvironmentOrbitEarthFactoryImpl
