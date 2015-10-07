/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.orbit.earth.impl;

import java.util.List;
import java.util.Map;
import java.util.SortedSet;

import org.apache.commons.math3.geometry.euclidean.threed.Rotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.symphony.common.math.MathPackage;
import org.eclipse.symphony.core.SymphonyCorePackage;
import org.eclipse.symphony.core.environment.orbit.earth.CartesianEarthOrbit;
import org.eclipse.symphony.core.environment.orbit.earth.ConstantElevationMask;
import org.eclipse.symphony.core.environment.orbit.earth.Corridor;
import org.eclipse.symphony.core.environment.orbit.earth.CorridorPoint;
import org.eclipse.symphony.core.environment.orbit.earth.EarthOrbit;
import org.eclipse.symphony.core.environment.orbit.earth.EarthOrbitFacade;
import org.eclipse.symphony.core.environment.orbit.earth.EarthOrbitPropagator;
import org.eclipse.symphony.core.environment.orbit.earth.EarthOrbitSky;
import org.eclipse.symphony.core.environment.orbit.earth.EarthOrbitWorksite;
import org.eclipse.symphony.core.environment.orbit.earth.EarthSurfaceLocation;
import org.eclipse.symphony.core.environment.orbit.earth.EarthSurfaceLocationList;
import org.eclipse.symphony.core.environment.orbit.earth.ElevationMask;
import org.eclipse.symphony.core.environment.orbit.earth.EphemerisType;
import org.eclipse.symphony.core.environment.orbit.earth.GroundStation;
import org.eclipse.symphony.core.environment.orbit.earth.GroundStationList;
import org.eclipse.symphony.core.environment.orbit.earth.KeplerianEarthOrbit;
import org.eclipse.symphony.core.environment.orbit.earth.KeplerianEarthOrbitPropagator;
import org.eclipse.symphony.core.environment.orbit.earth.NadirPointingAttitudeProvider;
import org.eclipse.symphony.core.environment.orbit.earth.OreKitBackedAttitudeProvider;
import org.eclipse.symphony.core.environment.orbit.earth.OreKitBackedFrame;
import org.eclipse.symphony.core.environment.orbit.earth.OreKitBackedSpacecraftState;
import org.eclipse.symphony.core.environment.orbit.earth.SpacecraftSwathCorridor;
import org.eclipse.symphony.core.environment.orbit.earth.SpacecraftsVisibilitySet;
import org.eclipse.symphony.core.environment.orbit.earth.SymphonyEarthOrbitEnvironmentFactory;
import org.eclipse.symphony.core.environment.orbit.earth.SymphonyEarthOrbitEnvironmentPackage;
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
import org.orekit.utils.TimeStampedAngularCoordinates;
import org.orekit.utils.TimeStampedPVCoordinates;

import ca.gc.asc_csa.eclipse.emf.ecore.EMFEcorePackage;
import ca.gc.asc_csa.symphony.environment.SymphonyEnvironmentPackage;
import ca.gc.asc_csa.symphony.environment.orbit.SymphonyOrbitEnvironmentPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SymphonyEarthOrbitEnvironmentPackageImpl extends EPackageImpl implements SymphonyEarthOrbitEnvironmentPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oreKitBackedSpacecraftStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oreKitBackedFrameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oreKitBackedAttitudeProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nadirPointingAttitudeProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass earthOrbitWorksiteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass earthOrbitSkyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass earthOrbitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keplerianEarthOrbitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cartesianEarthOrbitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elevationMaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constantElevationMaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass earthOrbitPropagatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keplerianEarthOrbitPropagatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tleEarthOrbitPropagatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass urlBasedTLEEarthOrbitPropagatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass earthSurfaceLocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass earthSurfaceLocationListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groundStationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groundStationListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass visibilityPassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass visibilityPassSpacecraftPositionHistoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass visibilityPassSpacecraftPositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spacecraftsVisibilitySetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass corridorPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass corridorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spacecraftSwathCorridorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass earthOrbitFacadeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ephemerisTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType listEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType mapEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType exceptionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sortedSetEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType rotationEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType oreKitFrameEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType oreKitTimeStampedAngularCoordinatesEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType oreKitTimeStampedPVCoordinatesEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType oreKitSpacecraftStateEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType absoluteDateEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType oreKitOrbitEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType oreKitKeplerianOrbitEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType oreKitCartesianOrbitEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType oreKitElevationMaskEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType oreKitAttitudeProviderEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType oreKitPropagatorEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType oreKitDSSTPropagatorEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType oreKitEcksteinHechlerPropagatorEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType oreKitEphemerisProgatorEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType oreKitKeplerianPropagatorEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType oreKitNumericalPropagatorEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType oreKitTLEPropagatorEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType oreKitTLEEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.symphony.core.environment.orbit.earth.SymphonyEarthOrbitEnvironmentPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SymphonyEarthOrbitEnvironmentPackageImpl() {
		super(eNS_URI, SymphonyEarthOrbitEnvironmentFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SymphonyEarthOrbitEnvironmentPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SymphonyEarthOrbitEnvironmentPackage init() {
		if (isInited) return (SymphonyEarthOrbitEnvironmentPackage)EPackage.Registry.INSTANCE.getEPackage(SymphonyEarthOrbitEnvironmentPackage.eNS_URI);

		// Obtain or create and register package
		SymphonyEarthOrbitEnvironmentPackageImpl theSymphonyEarthOrbitEnvironmentPackage = (SymphonyEarthOrbitEnvironmentPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SymphonyEarthOrbitEnvironmentPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SymphonyEarthOrbitEnvironmentPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SymphonyOrbitEnvironmentPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSymphonyEarthOrbitEnvironmentPackage.createPackageContents();

		// Initialize created meta-data
		theSymphonyEarthOrbitEnvironmentPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSymphonyEarthOrbitEnvironmentPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SymphonyEarthOrbitEnvironmentPackage.eNS_URI, theSymphonyEarthOrbitEnvironmentPackage);
		return theSymphonyEarthOrbitEnvironmentPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOreKitBackedSpacecraftState() {
		return oreKitBackedSpacecraftStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOreKitBackedSpacecraftState_OreKitSpacecraftState() {
		return (EAttribute)oreKitBackedSpacecraftStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOreKitBackedFrame() {
		return oreKitBackedFrameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOreKitBackedFrame__GetOreKitFrame() {
		return oreKitBackedFrameEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOreKitBackedAttitudeProvider() {
		return oreKitBackedAttitudeProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOreKitBackedAttitudeProvider__GetOreKitAttitudeProvider() {
		return oreKitBackedAttitudeProviderEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNadirPointingAttitudeProvider() {
		return nadirPointingAttitudeProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEarthOrbitWorksite() {
		return earthOrbitWorksiteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEarthOrbitWorksite_Sky() {
		return (EReference)earthOrbitWorksiteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEarthOrbitWorksite_EarthLocations() {
		return (EReference)earthOrbitWorksiteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEarthOrbitSky() {
		return earthOrbitSkyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEarthOrbitSky_EarthOrbitWorksite() {
		return (EReference)earthOrbitSkyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEarthOrbitSky_Moon() {
		return (EReference)earthOrbitSkyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEarthOrbitSky_Earth() {
		return (EReference)earthOrbitSkyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEarthOrbitSky__GetMoonAngularDiameter() {
		return earthOrbitSkyEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEarthOrbitSky__GetEarthAngularDiameter() {
		return earthOrbitSkyEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEarthOrbit() {
		return earthOrbitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEarthOrbit__GetOreKitOrbit() {
		return earthOrbitEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKeplerianEarthOrbit() {
		return keplerianEarthOrbitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeplerianEarthOrbit_SemiMajorAxis() {
		return (EAttribute)keplerianEarthOrbitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeplerianEarthOrbit_Eccentricity() {
		return (EAttribute)keplerianEarthOrbitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeplerianEarthOrbit_Inclination() {
		return (EAttribute)keplerianEarthOrbitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeplerianEarthOrbit_PerigeeArgument() {
		return (EAttribute)keplerianEarthOrbitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeplerianEarthOrbit_RightAscentionOfAscendingNode() {
		return (EAttribute)keplerianEarthOrbitEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeplerianEarthOrbit_MeanAnomaly() {
		return (EAttribute)keplerianEarthOrbitEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeplerianEarthOrbit_TrueAnomaly() {
		return (EAttribute)keplerianEarthOrbitEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getKeplerianEarthOrbit__GetOreKitKeplerianOrbit() {
		return keplerianEarthOrbitEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCartesianEarthOrbit() {
		return cartesianEarthOrbitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCartesianEarthOrbit_PvaCoordinates() {
		return (EReference)cartesianEarthOrbitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCartesianEarthOrbit__GetOreKitCartesianOrbit() {
		return cartesianEarthOrbitEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElevationMask() {
		return elevationMaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getElevationMask__GetElevation__double() {
		return elevationMaskEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getElevationMask__GetOreKitElevationMask() {
		return elevationMaskEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstantElevationMask() {
		return constantElevationMaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstantElevationMask_ConstantElevation() {
		return (EAttribute)constantElevationMaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEarthOrbitPropagator() {
		return earthOrbitPropagatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEarthOrbitPropagator__GetOreKitPropagator() {
		return earthOrbitPropagatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEarthOrbitPropagator__GetTargetPasses__EarthSurfaceLocation_Date_Date_ElevationMask() {
		return earthOrbitPropagatorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEarthOrbitPropagator__GetGroundStationPasses__GroundStation_Date_Date() {
		return earthOrbitPropagatorEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKeplerianEarthOrbitPropagator() {
		return keplerianEarthOrbitPropagatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getKeplerianEarthOrbitPropagator__GetOreKitKeplerianPropagator() {
		return keplerianEarthOrbitPropagatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTLEEarthOrbitPropagator() {
		return tleEarthOrbitPropagatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTLEEarthOrbitPropagator_Tle() {
		return (EReference)tleEarthOrbitPropagatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTLEEarthOrbitPropagator__GetOreKitTLEPropagator() {
		return tleEarthOrbitPropagatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getURLBasedTLEEarthOrbitPropagator() {
		return urlBasedTLEEarthOrbitPropagatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getURLBasedTLEEarthOrbitPropagator_TleURL() {
		return (EAttribute)urlBasedTLEEarthOrbitPropagatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTLE() {
		return tleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTLE_Line1() {
		return (EAttribute)tleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTLE_Line2() {
		return (EAttribute)tleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTLE_EphemerisType() {
		return (EAttribute)tleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTLE_Inclination() {
		return (EAttribute)tleEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTLE_MeanAnomaly() {
		return (EAttribute)tleEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTLE_MeanMotion() {
		return (EAttribute)tleEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTLE_RevolutionPerDay() {
		return (EAttribute)tleEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTLE_MeanMotionFirstDerivative() {
		return (EAttribute)tleEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTLE_MeanMotionSecondDerivative() {
		return (EAttribute)tleEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTLE_ArgumentOfPerigee() {
		return (EAttribute)tleEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTLE_RightAscentionOfAscendingNode() {
		return (EAttribute)tleEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTLE_RevolutionNumberAtEpoch() {
		return (EAttribute)tleEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTLE_SatelliteNumber() {
		return (EAttribute)tleEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTLE_BStar() {
		return (EAttribute)tleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTLE_Epoch() {
		return (EAttribute)tleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTLE_Eccentricity() {
		return (EAttribute)tleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTLE_ElementNumber() {
		return (EAttribute)tleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTLE__GetOreKitTLE() {
		return tleEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEarthSurfaceLocation() {
		return earthSurfaceLocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEarthSurfaceLocation_GeographicalCoordinates() {
		return (EReference)earthSurfaceLocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEarthSurfaceLocationList() {
		return earthSurfaceLocationListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEarthSurfaceLocationList_EarthSurfaceLocations() {
		return (EReference)earthSurfaceLocationListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroundStation() {
		return groundStationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroundStation_FieldOfViewOrientation() {
		return (EReference)groundStationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroundStation_ElevationMask() {
		return (EReference)groundStationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroundStationList() {
		return groundStationListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroundStationList_GroundStations() {
		return (EReference)groundStationListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVisibilityPass() {
		return visibilityPassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisibilityPass_OrbitModel() {
		return (EReference)visibilityPassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisibilityPass_SurfaceLocation() {
		return (EReference)visibilityPassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVisibilityPass_StartTime() {
		return (EAttribute)visibilityPassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVisibilityPass_EndTime() {
		return (EAttribute)visibilityPassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisibilityPass_PositionHistory() {
		return (EReference)visibilityPassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVisibilityPass_Duration() {
		return (EAttribute)visibilityPassEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVisibilityPassSpacecraftPositionHistory() {
		return visibilityPassSpacecraftPositionHistoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVisibilityPassSpacecraftPositionHistory_TimeInterval() {
		return (EAttribute)visibilityPassSpacecraftPositionHistoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisibilityPassSpacecraftPositionHistory_VisibilityPass() {
		return (EReference)visibilityPassSpacecraftPositionHistoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisibilityPassSpacecraftPositionHistory_Positions() {
		return (EReference)visibilityPassSpacecraftPositionHistoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVisibilityPassSpacecraftPositionHistory__GetHighestElevationPosition() {
		return visibilityPassSpacecraftPositionHistoryEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVisibilityPassSpacecraftPositionHistory__GetSmallestSpacecraftCrossTrackAnglePosition() {
		return visibilityPassSpacecraftPositionHistoryEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVisibilityPassSpacecraftPositionHistory__UpdateHistory() {
		return visibilityPassSpacecraftPositionHistoryEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVisibilityPassSpacecraftPosition() {
		return visibilityPassSpacecraftPositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVisibilityPassSpacecraftPosition_Azimuth() {
		return (EAttribute)visibilityPassSpacecraftPositionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVisibilityPassSpacecraftPosition_Elevation() {
		return (EAttribute)visibilityPassSpacecraftPositionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVisibilityPassSpacecraftPosition_Range() {
		return (EAttribute)visibilityPassSpacecraftPositionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVisibilityPassSpacecraftPosition_RangeRate() {
		return (EAttribute)visibilityPassSpacecraftPositionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVisibilityPassSpacecraftPosition_SpacecraftCrossTrackAngle() {
		return (EAttribute)visibilityPassSpacecraftPositionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpacecraftsVisibilitySet() {
		return spacecraftsVisibilitySetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpacecraftsVisibilitySet_StartTime() {
		return (EAttribute)spacecraftsVisibilitySetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpacecraftsVisibilitySet_EndTime() {
		return (EAttribute)spacecraftsVisibilitySetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpacecraftsVisibilitySet_OrbitModels() {
		return (EReference)spacecraftsVisibilitySetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpacecraftsVisibilitySet_GroundStations() {
		return (EReference)spacecraftsVisibilitySetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpacecraftsVisibilitySet_Passes() {
		return (EReference)spacecraftsVisibilitySetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpacecraftsVisibilitySet_GroundStationToVisibilityMap() {
		return (EAttribute)spacecraftsVisibilitySetEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCorridorPoint() {
		return corridorPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCorridorPoint_Left() {
		return (EReference)corridorPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCorridorPoint_Center() {
		return (EReference)corridorPointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCorridorPoint_Right() {
		return (EReference)corridorPointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCorridor() {
		return corridorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCorridor_Points() {
		return (EReference)corridorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpacecraftSwathCorridor() {
		return spacecraftSwathCorridorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpacecraftSwathCorridor_StartTime() {
		return (EAttribute)spacecraftSwathCorridorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpacecraftSwathCorridor_EndTime() {
		return (EAttribute)spacecraftSwathCorridorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpacecraftSwathCorridor_TimeInterval() {
		return (EAttribute)spacecraftSwathCorridorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpacecraftSwathCorridor_OrbitModel() {
		return (EReference)spacecraftSwathCorridorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpacecraftSwathCorridor_LeftSwathAngle() {
		return (EAttribute)spacecraftSwathCorridorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpacecraftSwathCorridor_RightSwathAngle() {
		return (EAttribute)spacecraftSwathCorridorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpacecraftSwathCorridor_Corridor() {
		return (EReference)spacecraftSwathCorridorEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEarthOrbitFacade() {
		return earthOrbitFacadeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEarthOrbitFacade__GetMu() {
		return earthOrbitFacadeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEarthOrbitFacade__CreateAbsoluteDate__Date() {
		return earthOrbitFacadeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEarthOrbitFacade__CreateDate__AbsoluteDate() {
		return earthOrbitFacadeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEarthOrbitFacade__CreateEarthSurfaceLocation__String_String_double_double_double() {
		return earthOrbitFacadeEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEarthOrbitFacade__CreateOreKitBackedFrame__Frame() {
		return earthOrbitFacadeEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEarthOrbitFacade__GetSpacecraftEarthSubPoint__OreKitBackedSpacecraftState() {
		return earthOrbitFacadeEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEarthOrbitFacade__GetSpacecraftElevationAngle__SpacecraftState_EarthSurfaceLocation() {
		return earthOrbitFacadeEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEarthOrbitFacade__GetSpacecraftAzimuthAngle__SpacecraftState_EarthSurfaceLocation() {
		return earthOrbitFacadeEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEarthOrbitFacade__GetRange__SpacecraftState_EarthSurfaceLocation() {
		return earthOrbitFacadeEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEarthOrbitFacade__CreateSpacecraftState__Orbit_SpacecraftState() {
		return earthOrbitFacadeEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEarthOrbitFacade__CreateOreKitBackedSpacecraftState__Orbit_SpacecraftState() {
		return earthOrbitFacadeEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEarthOrbitFacade__CreateTimedStampedPVACoordinates__TimeStampedPVCoordinates() {
		return earthOrbitFacadeEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEarthOrbitFacade__CreateTimedStampedAngularCoordinates__TimeStampedAngularCoordinates() {
		return earthOrbitFacadeEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEarthOrbitFacade__CreateMatrix3x3__Rotation() {
		return earthOrbitFacadeEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEarthOrbitFacade__CreateRotation__Matrix3x3() {
		return earthOrbitFacadeEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEarthOrbitFacade__CreateKeplerianOrbit__EarthOrbitPropagator() {
		return earthOrbitFacadeEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEarthOrbitFacade__CreateCartesianEarthOrbit__EarthOrbitPropagator() {
		return earthOrbitFacadeEClass.getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEarthOrbitFacade__CreateKeplerianOrbit__KeplerianOrbit() {
		return earthOrbitFacadeEClass.getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEarthOrbitFacade__CreateCartesianEarthOrbit__CartesianOrbit() {
		return earthOrbitFacadeEClass.getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEarthOrbitFacade__ConvertToGeographicCoordinates__OreKitBackedSpacecraftState() {
		return earthOrbitFacadeEClass.getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEarthOrbitFacade__GetVisibilityPassSortedByStartDate__List() {
		return earthOrbitFacadeEClass.getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEarthOrbitFacade__GetVisibilityPassSortedByDuration__List() {
		return earthOrbitFacadeEClass.getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEarthOrbitFacade__GetVisibilityPassSpacecraftPositionSortedByElevation__List() {
		return earthOrbitFacadeEClass.getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEarthOrbitFacade__GetVisibilityPassSpacecraftPositionSortedBySpacecraftCrossTrackAngle__List() {
		return earthOrbitFacadeEClass.getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEarthOrbitFacade__LoadTLE__String() {
		return earthOrbitFacadeEClass.getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEarthOrbitFacade__CreateTLEEarthOrbitPropagator__TLE() {
		return earthOrbitFacadeEClass.getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEphemerisType() {
		return ephemerisTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getList() {
		return listEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMap() {
		return mapEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getException() {
		return exceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSortedSet() {
		return sortedSetEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRotation() {
		return rotationEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOreKitFrame() {
		return oreKitFrameEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOreKitTimeStampedAngularCoordinates() {
		return oreKitTimeStampedAngularCoordinatesEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOreKitTimeStampedPVCoordinates() {
		return oreKitTimeStampedPVCoordinatesEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOreKitSpacecraftState() {
		return oreKitSpacecraftStateEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAbsoluteDate() {
		return absoluteDateEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOreKitOrbit() {
		return oreKitOrbitEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOreKitKeplerianOrbit() {
		return oreKitKeplerianOrbitEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOreKitCartesianOrbit() {
		return oreKitCartesianOrbitEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOreKitElevationMask() {
		return oreKitElevationMaskEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOreKitAttitudeProvider() {
		return oreKitAttitudeProviderEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOreKitPropagator() {
		return oreKitPropagatorEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOreKitDSSTPropagator() {
		return oreKitDSSTPropagatorEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOreKitEcksteinHechlerPropagator() {
		return oreKitEcksteinHechlerPropagatorEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOreKitEphemerisProgator() {
		return oreKitEphemerisProgatorEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOreKitKeplerianPropagator() {
		return oreKitKeplerianPropagatorEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOreKitNumericalPropagator() {
		return oreKitNumericalPropagatorEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOreKitTLEPropagator() {
		return oreKitTLEPropagatorEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOreKitTLE() {
		return oreKitTLEEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymphonyEarthOrbitEnvironmentFactory getSymphonyEarthOrbitEnvironmentFactory() {
		return (SymphonyEarthOrbitEnvironmentFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		oreKitBackedSpacecraftStateEClass = createEClass(ORE_KIT_BACKED_SPACECRAFT_STATE);
		createEAttribute(oreKitBackedSpacecraftStateEClass, ORE_KIT_BACKED_SPACECRAFT_STATE__ORE_KIT_SPACECRAFT_STATE);

		oreKitBackedFrameEClass = createEClass(ORE_KIT_BACKED_FRAME);
		createEOperation(oreKitBackedFrameEClass, ORE_KIT_BACKED_FRAME___GET_ORE_KIT_FRAME);

		oreKitBackedAttitudeProviderEClass = createEClass(ORE_KIT_BACKED_ATTITUDE_PROVIDER);
		createEOperation(oreKitBackedAttitudeProviderEClass, ORE_KIT_BACKED_ATTITUDE_PROVIDER___GET_ORE_KIT_ATTITUDE_PROVIDER);

		nadirPointingAttitudeProviderEClass = createEClass(NADIR_POINTING_ATTITUDE_PROVIDER);

		earthOrbitWorksiteEClass = createEClass(EARTH_ORBIT_WORKSITE);
		createEReference(earthOrbitWorksiteEClass, EARTH_ORBIT_WORKSITE__SKY);
		createEReference(earthOrbitWorksiteEClass, EARTH_ORBIT_WORKSITE__EARTH_LOCATIONS);

		earthOrbitSkyEClass = createEClass(EARTH_ORBIT_SKY);
		createEReference(earthOrbitSkyEClass, EARTH_ORBIT_SKY__EARTH_ORBIT_WORKSITE);
		createEReference(earthOrbitSkyEClass, EARTH_ORBIT_SKY__MOON);
		createEReference(earthOrbitSkyEClass, EARTH_ORBIT_SKY__EARTH);
		createEOperation(earthOrbitSkyEClass, EARTH_ORBIT_SKY___GET_MOON_ANGULAR_DIAMETER);
		createEOperation(earthOrbitSkyEClass, EARTH_ORBIT_SKY___GET_EARTH_ANGULAR_DIAMETER);

		earthOrbitEClass = createEClass(EARTH_ORBIT);
		createEOperation(earthOrbitEClass, EARTH_ORBIT___GET_ORE_KIT_ORBIT);

		keplerianEarthOrbitEClass = createEClass(KEPLERIAN_EARTH_ORBIT);
		createEAttribute(keplerianEarthOrbitEClass, KEPLERIAN_EARTH_ORBIT__SEMI_MAJOR_AXIS);
		createEAttribute(keplerianEarthOrbitEClass, KEPLERIAN_EARTH_ORBIT__ECCENTRICITY);
		createEAttribute(keplerianEarthOrbitEClass, KEPLERIAN_EARTH_ORBIT__INCLINATION);
		createEAttribute(keplerianEarthOrbitEClass, KEPLERIAN_EARTH_ORBIT__PERIGEE_ARGUMENT);
		createEAttribute(keplerianEarthOrbitEClass, KEPLERIAN_EARTH_ORBIT__RIGHT_ASCENTION_OF_ASCENDING_NODE);
		createEAttribute(keplerianEarthOrbitEClass, KEPLERIAN_EARTH_ORBIT__MEAN_ANOMALY);
		createEAttribute(keplerianEarthOrbitEClass, KEPLERIAN_EARTH_ORBIT__TRUE_ANOMALY);
		createEOperation(keplerianEarthOrbitEClass, KEPLERIAN_EARTH_ORBIT___GET_ORE_KIT_KEPLERIAN_ORBIT);

		cartesianEarthOrbitEClass = createEClass(CARTESIAN_EARTH_ORBIT);
		createEReference(cartesianEarthOrbitEClass, CARTESIAN_EARTH_ORBIT__PVA_COORDINATES);
		createEOperation(cartesianEarthOrbitEClass, CARTESIAN_EARTH_ORBIT___GET_ORE_KIT_CARTESIAN_ORBIT);

		elevationMaskEClass = createEClass(ELEVATION_MASK);
		createEOperation(elevationMaskEClass, ELEVATION_MASK___GET_ELEVATION__DOUBLE);
		createEOperation(elevationMaskEClass, ELEVATION_MASK___GET_ORE_KIT_ELEVATION_MASK);

		constantElevationMaskEClass = createEClass(CONSTANT_ELEVATION_MASK);
		createEAttribute(constantElevationMaskEClass, CONSTANT_ELEVATION_MASK__CONSTANT_ELEVATION);

		earthOrbitPropagatorEClass = createEClass(EARTH_ORBIT_PROPAGATOR);
		createEOperation(earthOrbitPropagatorEClass, EARTH_ORBIT_PROPAGATOR___GET_ORE_KIT_PROPAGATOR);
		createEOperation(earthOrbitPropagatorEClass, EARTH_ORBIT_PROPAGATOR___GET_TARGET_PASSES__EARTHSURFACELOCATION_DATE_DATE_ELEVATIONMASK);
		createEOperation(earthOrbitPropagatorEClass, EARTH_ORBIT_PROPAGATOR___GET_GROUND_STATION_PASSES__GROUNDSTATION_DATE_DATE);

		keplerianEarthOrbitPropagatorEClass = createEClass(KEPLERIAN_EARTH_ORBIT_PROPAGATOR);
		createEOperation(keplerianEarthOrbitPropagatorEClass, KEPLERIAN_EARTH_ORBIT_PROPAGATOR___GET_ORE_KIT_KEPLERIAN_PROPAGATOR);

		tleEarthOrbitPropagatorEClass = createEClass(TLE_EARTH_ORBIT_PROPAGATOR);
		createEReference(tleEarthOrbitPropagatorEClass, TLE_EARTH_ORBIT_PROPAGATOR__TLE);
		createEOperation(tleEarthOrbitPropagatorEClass, TLE_EARTH_ORBIT_PROPAGATOR___GET_ORE_KIT_TLE_PROPAGATOR);

		urlBasedTLEEarthOrbitPropagatorEClass = createEClass(URL_BASED_TLE_EARTH_ORBIT_PROPAGATOR);
		createEAttribute(urlBasedTLEEarthOrbitPropagatorEClass, URL_BASED_TLE_EARTH_ORBIT_PROPAGATOR__TLE_URL);

		tleEClass = createEClass(TLE);
		createEAttribute(tleEClass, TLE__LINE1);
		createEAttribute(tleEClass, TLE__LINE2);
		createEAttribute(tleEClass, TLE__BSTAR);
		createEAttribute(tleEClass, TLE__EPOCH);
		createEAttribute(tleEClass, TLE__ECCENTRICITY);
		createEAttribute(tleEClass, TLE__ELEMENT_NUMBER);
		createEAttribute(tleEClass, TLE__EPHEMERIS_TYPE);
		createEAttribute(tleEClass, TLE__INCLINATION);
		createEAttribute(tleEClass, TLE__MEAN_ANOMALY);
		createEAttribute(tleEClass, TLE__MEAN_MOTION);
		createEAttribute(tleEClass, TLE__REVOLUTION_PER_DAY);
		createEAttribute(tleEClass, TLE__MEAN_MOTION_FIRST_DERIVATIVE);
		createEAttribute(tleEClass, TLE__MEAN_MOTION_SECOND_DERIVATIVE);
		createEAttribute(tleEClass, TLE__ARGUMENT_OF_PERIGEE);
		createEAttribute(tleEClass, TLE__RIGHT_ASCENTION_OF_ASCENDING_NODE);
		createEAttribute(tleEClass, TLE__REVOLUTION_NUMBER_AT_EPOCH);
		createEAttribute(tleEClass, TLE__SATELLITE_NUMBER);
		createEOperation(tleEClass, TLE___GET_ORE_KIT_TLE);

		earthSurfaceLocationEClass = createEClass(EARTH_SURFACE_LOCATION);
		createEReference(earthSurfaceLocationEClass, EARTH_SURFACE_LOCATION__GEOGRAPHICAL_COORDINATES);

		earthSurfaceLocationListEClass = createEClass(EARTH_SURFACE_LOCATION_LIST);
		createEReference(earthSurfaceLocationListEClass, EARTH_SURFACE_LOCATION_LIST__EARTH_SURFACE_LOCATIONS);

		groundStationEClass = createEClass(GROUND_STATION);
		createEReference(groundStationEClass, GROUND_STATION__FIELD_OF_VIEW_ORIENTATION);
		createEReference(groundStationEClass, GROUND_STATION__ELEVATION_MASK);

		groundStationListEClass = createEClass(GROUND_STATION_LIST);
		createEReference(groundStationListEClass, GROUND_STATION_LIST__GROUND_STATIONS);

		visibilityPassEClass = createEClass(VISIBILITY_PASS);
		createEReference(visibilityPassEClass, VISIBILITY_PASS__ORBIT_MODEL);
		createEReference(visibilityPassEClass, VISIBILITY_PASS__SURFACE_LOCATION);
		createEAttribute(visibilityPassEClass, VISIBILITY_PASS__START_TIME);
		createEAttribute(visibilityPassEClass, VISIBILITY_PASS__END_TIME);
		createEReference(visibilityPassEClass, VISIBILITY_PASS__POSITION_HISTORY);
		createEAttribute(visibilityPassEClass, VISIBILITY_PASS__DURATION);

		visibilityPassSpacecraftPositionHistoryEClass = createEClass(VISIBILITY_PASS_SPACECRAFT_POSITION_HISTORY);
		createEAttribute(visibilityPassSpacecraftPositionHistoryEClass, VISIBILITY_PASS_SPACECRAFT_POSITION_HISTORY__TIME_INTERVAL);
		createEReference(visibilityPassSpacecraftPositionHistoryEClass, VISIBILITY_PASS_SPACECRAFT_POSITION_HISTORY__VISIBILITY_PASS);
		createEReference(visibilityPassSpacecraftPositionHistoryEClass, VISIBILITY_PASS_SPACECRAFT_POSITION_HISTORY__POSITIONS);
		createEOperation(visibilityPassSpacecraftPositionHistoryEClass, VISIBILITY_PASS_SPACECRAFT_POSITION_HISTORY___GET_HIGHEST_ELEVATION_POSITION);
		createEOperation(visibilityPassSpacecraftPositionHistoryEClass, VISIBILITY_PASS_SPACECRAFT_POSITION_HISTORY___GET_SMALLEST_SPACECRAFT_CROSS_TRACK_ANGLE_POSITION);
		createEOperation(visibilityPassSpacecraftPositionHistoryEClass, VISIBILITY_PASS_SPACECRAFT_POSITION_HISTORY___UPDATE_HISTORY);

		visibilityPassSpacecraftPositionEClass = createEClass(VISIBILITY_PASS_SPACECRAFT_POSITION);
		createEAttribute(visibilityPassSpacecraftPositionEClass, VISIBILITY_PASS_SPACECRAFT_POSITION__AZIMUTH);
		createEAttribute(visibilityPassSpacecraftPositionEClass, VISIBILITY_PASS_SPACECRAFT_POSITION__ELEVATION);
		createEAttribute(visibilityPassSpacecraftPositionEClass, VISIBILITY_PASS_SPACECRAFT_POSITION__RANGE);
		createEAttribute(visibilityPassSpacecraftPositionEClass, VISIBILITY_PASS_SPACECRAFT_POSITION__RANGE_RATE);
		createEAttribute(visibilityPassSpacecraftPositionEClass, VISIBILITY_PASS_SPACECRAFT_POSITION__SPACECRAFT_CROSS_TRACK_ANGLE);

		spacecraftsVisibilitySetEClass = createEClass(SPACECRAFTS_VISIBILITY_SET);
		createEAttribute(spacecraftsVisibilitySetEClass, SPACECRAFTS_VISIBILITY_SET__START_TIME);
		createEAttribute(spacecraftsVisibilitySetEClass, SPACECRAFTS_VISIBILITY_SET__END_TIME);
		createEReference(spacecraftsVisibilitySetEClass, SPACECRAFTS_VISIBILITY_SET__ORBIT_MODELS);
		createEReference(spacecraftsVisibilitySetEClass, SPACECRAFTS_VISIBILITY_SET__GROUND_STATIONS);
		createEReference(spacecraftsVisibilitySetEClass, SPACECRAFTS_VISIBILITY_SET__PASSES);
		createEAttribute(spacecraftsVisibilitySetEClass, SPACECRAFTS_VISIBILITY_SET__GROUND_STATION_TO_VISIBILITY_MAP);

		corridorPointEClass = createEClass(CORRIDOR_POINT);
		createEReference(corridorPointEClass, CORRIDOR_POINT__LEFT);
		createEReference(corridorPointEClass, CORRIDOR_POINT__CENTER);
		createEReference(corridorPointEClass, CORRIDOR_POINT__RIGHT);

		corridorEClass = createEClass(CORRIDOR);
		createEReference(corridorEClass, CORRIDOR__POINTS);

		spacecraftSwathCorridorEClass = createEClass(SPACECRAFT_SWATH_CORRIDOR);
		createEAttribute(spacecraftSwathCorridorEClass, SPACECRAFT_SWATH_CORRIDOR__START_TIME);
		createEAttribute(spacecraftSwathCorridorEClass, SPACECRAFT_SWATH_CORRIDOR__END_TIME);
		createEAttribute(spacecraftSwathCorridorEClass, SPACECRAFT_SWATH_CORRIDOR__TIME_INTERVAL);
		createEReference(spacecraftSwathCorridorEClass, SPACECRAFT_SWATH_CORRIDOR__ORBIT_MODEL);
		createEAttribute(spacecraftSwathCorridorEClass, SPACECRAFT_SWATH_CORRIDOR__LEFT_SWATH_ANGLE);
		createEAttribute(spacecraftSwathCorridorEClass, SPACECRAFT_SWATH_CORRIDOR__RIGHT_SWATH_ANGLE);
		createEReference(spacecraftSwathCorridorEClass, SPACECRAFT_SWATH_CORRIDOR__CORRIDOR);

		earthOrbitFacadeEClass = createEClass(EARTH_ORBIT_FACADE);
		createEOperation(earthOrbitFacadeEClass, EARTH_ORBIT_FACADE___GET_MU);
		createEOperation(earthOrbitFacadeEClass, EARTH_ORBIT_FACADE___CREATE_ABSOLUTE_DATE__DATE);
		createEOperation(earthOrbitFacadeEClass, EARTH_ORBIT_FACADE___CREATE_DATE__ABSOLUTEDATE);
		createEOperation(earthOrbitFacadeEClass, EARTH_ORBIT_FACADE___CREATE_EARTH_SURFACE_LOCATION__STRING_STRING_DOUBLE_DOUBLE_DOUBLE);
		createEOperation(earthOrbitFacadeEClass, EARTH_ORBIT_FACADE___CREATE_ORE_KIT_BACKED_FRAME__FRAME);
		createEOperation(earthOrbitFacadeEClass, EARTH_ORBIT_FACADE___GET_SPACECRAFT_EARTH_SUB_POINT__OREKITBACKEDSPACECRAFTSTATE);
		createEOperation(earthOrbitFacadeEClass, EARTH_ORBIT_FACADE___GET_SPACECRAFT_ELEVATION_ANGLE__SPACECRAFTSTATE_EARTHSURFACELOCATION);
		createEOperation(earthOrbitFacadeEClass, EARTH_ORBIT_FACADE___GET_SPACECRAFT_AZIMUTH_ANGLE__SPACECRAFTSTATE_EARTHSURFACELOCATION);
		createEOperation(earthOrbitFacadeEClass, EARTH_ORBIT_FACADE___GET_RANGE__SPACECRAFTSTATE_EARTHSURFACELOCATION);
		createEOperation(earthOrbitFacadeEClass, EARTH_ORBIT_FACADE___CREATE_SPACECRAFT_STATE__ORBIT_SPACECRAFTSTATE);
		createEOperation(earthOrbitFacadeEClass, EARTH_ORBIT_FACADE___CREATE_ORE_KIT_BACKED_SPACECRAFT_STATE__ORBIT_SPACECRAFTSTATE);
		createEOperation(earthOrbitFacadeEClass, EARTH_ORBIT_FACADE___CREATE_TIMED_STAMPED_PVA_COORDINATES__TIMESTAMPEDPVCOORDINATES);
		createEOperation(earthOrbitFacadeEClass, EARTH_ORBIT_FACADE___CREATE_TIMED_STAMPED_ANGULAR_COORDINATES__TIMESTAMPEDANGULARCOORDINATES);
		createEOperation(earthOrbitFacadeEClass, EARTH_ORBIT_FACADE___CREATE_MATRIX3X3__ROTATION);
		createEOperation(earthOrbitFacadeEClass, EARTH_ORBIT_FACADE___CREATE_ROTATION__MATRIX3X3);
		createEOperation(earthOrbitFacadeEClass, EARTH_ORBIT_FACADE___CREATE_KEPLERIAN_ORBIT__EARTHORBITPROPAGATOR);
		createEOperation(earthOrbitFacadeEClass, EARTH_ORBIT_FACADE___CREATE_CARTESIAN_EARTH_ORBIT__EARTHORBITPROPAGATOR);
		createEOperation(earthOrbitFacadeEClass, EARTH_ORBIT_FACADE___CREATE_KEPLERIAN_ORBIT__KEPLERIANORBIT);
		createEOperation(earthOrbitFacadeEClass, EARTH_ORBIT_FACADE___CREATE_CARTESIAN_EARTH_ORBIT__CARTESIANORBIT);
		createEOperation(earthOrbitFacadeEClass, EARTH_ORBIT_FACADE___CONVERT_TO_GEOGRAPHIC_COORDINATES__OREKITBACKEDSPACECRAFTSTATE);
		createEOperation(earthOrbitFacadeEClass, EARTH_ORBIT_FACADE___GET_VISIBILITY_PASS_SORTED_BY_START_DATE__LIST);
		createEOperation(earthOrbitFacadeEClass, EARTH_ORBIT_FACADE___GET_VISIBILITY_PASS_SORTED_BY_DURATION__LIST);
		createEOperation(earthOrbitFacadeEClass, EARTH_ORBIT_FACADE___GET_VISIBILITY_PASS_SPACECRAFT_POSITION_SORTED_BY_ELEVATION__LIST);
		createEOperation(earthOrbitFacadeEClass, EARTH_ORBIT_FACADE___GET_VISIBILITY_PASS_SPACECRAFT_POSITION_SORTED_BY_SPACECRAFT_CROSS_TRACK_ANGLE__LIST);
		createEOperation(earthOrbitFacadeEClass, EARTH_ORBIT_FACADE___LOAD_TLE__STRING);
		createEOperation(earthOrbitFacadeEClass, EARTH_ORBIT_FACADE___CREATE_TLE_EARTH_ORBIT_PROPAGATOR__TLE);

		// Create enums
		ephemerisTypeEEnum = createEEnum(EPHEMERIS_TYPE);

		// Create data types
		listEDataType = createEDataType(LIST);
		mapEDataType = createEDataType(MAP);
		exceptionEDataType = createEDataType(EXCEPTION);
		sortedSetEDataType = createEDataType(SORTED_SET);
		rotationEDataType = createEDataType(ROTATION);
		oreKitFrameEDataType = createEDataType(ORE_KIT_FRAME);
		oreKitTimeStampedAngularCoordinatesEDataType = createEDataType(ORE_KIT_TIME_STAMPED_ANGULAR_COORDINATES);
		oreKitTimeStampedPVCoordinatesEDataType = createEDataType(ORE_KIT_TIME_STAMPED_PV_COORDINATES);
		oreKitSpacecraftStateEDataType = createEDataType(ORE_KIT_SPACECRAFT_STATE);
		absoluteDateEDataType = createEDataType(ABSOLUTE_DATE);
		oreKitOrbitEDataType = createEDataType(ORE_KIT_ORBIT);
		oreKitKeplerianOrbitEDataType = createEDataType(ORE_KIT_KEPLERIAN_ORBIT);
		oreKitCartesianOrbitEDataType = createEDataType(ORE_KIT_CARTESIAN_ORBIT);
		oreKitElevationMaskEDataType = createEDataType(ORE_KIT_ELEVATION_MASK);
		oreKitAttitudeProviderEDataType = createEDataType(ORE_KIT_ATTITUDE_PROVIDER);
		oreKitPropagatorEDataType = createEDataType(ORE_KIT_PROPAGATOR);
		oreKitDSSTPropagatorEDataType = createEDataType(ORE_KIT_DSST_PROPAGATOR);
		oreKitEcksteinHechlerPropagatorEDataType = createEDataType(ORE_KIT_ECKSTEIN_HECHLER_PROPAGATOR);
		oreKitEphemerisProgatorEDataType = createEDataType(ORE_KIT_EPHEMERIS_PROGATOR);
		oreKitKeplerianPropagatorEDataType = createEDataType(ORE_KIT_KEPLERIAN_PROPAGATOR);
		oreKitNumericalPropagatorEDataType = createEDataType(ORE_KIT_NUMERICAL_PROPAGATOR);
		oreKitTLEPropagatorEDataType = createEDataType(ORE_KIT_TLE_PROPAGATOR);
		oreKitTLEEDataType = createEDataType(ORE_KIT_TLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		SymphonyOrbitEnvironmentPackage theSymphonyOrbitEnvironmentPackage = (SymphonyOrbitEnvironmentPackage)EPackage.Registry.INSTANCE.getEPackage(SymphonyOrbitEnvironmentPackage.eNS_URI);
		SymphonyEnvironmentPackage theSymphonyEnvironmentPackage = (SymphonyEnvironmentPackage)EPackage.Registry.INSTANCE.getEPackage(SymphonyEnvironmentPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		EMFEcorePackage theEMFEcorePackage = (EMFEcorePackage)EPackage.Registry.INSTANCE.getEPackage(EMFEcorePackage.eNS_URI);
		MathPackage theMathPackage = (MathPackage)EPackage.Registry.INSTANCE.getEPackage(MathPackage.eNS_URI);
		SymphonyCorePackage theSymphonyCorePackage = (SymphonyCorePackage)EPackage.Registry.INSTANCE.getEPackage(SymphonyCorePackage.eNS_URI);

		// Create type parameters
		addETypeParameter(listEDataType, "T");
		addETypeParameter(mapEDataType, "K");
		addETypeParameter(mapEDataType, "V");
		addETypeParameter(sortedSetEDataType, "T");

		// Set bounds for type parameters

		// Add supertypes to classes
		oreKitBackedSpacecraftStateEClass.getESuperTypes().add(theSymphonyOrbitEnvironmentPackage.getSpacecraftState());
		oreKitBackedFrameEClass.getESuperTypes().add(theSymphonyOrbitEnvironmentPackage.getAbstractFrame());
		oreKitBackedAttitudeProviderEClass.getESuperTypes().add(theSymphonyOrbitEnvironmentPackage.getAttitudeProvider());
		nadirPointingAttitudeProviderEClass.getESuperTypes().add(this.getOreKitBackedAttitudeProvider());
		earthOrbitWorksiteEClass.getESuperTypes().add(theSymphonyOrbitEnvironmentPackage.getOrbitWorksite());
		earthOrbitSkyEClass.getESuperTypes().add(theSymphonyEnvironmentPackage.getSky());
		earthOrbitEClass.getESuperTypes().add(theSymphonyOrbitEnvironmentPackage.getOrbit());
		keplerianEarthOrbitEClass.getESuperTypes().add(this.getEarthOrbit());
		cartesianEarthOrbitEClass.getESuperTypes().add(this.getEarthOrbit());
		constantElevationMaskEClass.getESuperTypes().add(this.getElevationMask());
		earthOrbitPropagatorEClass.getESuperTypes().add(theSymphonyOrbitEnvironmentPackage.getAbstractOrbitPropagator());
		keplerianEarthOrbitPropagatorEClass.getESuperTypes().add(this.getEarthOrbitPropagator());
		tleEarthOrbitPropagatorEClass.getESuperTypes().add(this.getEarthOrbitPropagator());
		urlBasedTLEEarthOrbitPropagatorEClass.getESuperTypes().add(this.getTLEEarthOrbitPropagator());
		earthSurfaceLocationEClass.getESuperTypes().add(theEMFEcorePackage.getNamed());
		earthSurfaceLocationEClass.getESuperTypes().add(theEMFEcorePackage.getDescribed());
		earthSurfaceLocationListEClass.getESuperTypes().add(theEMFEcorePackage.getNamed());
		earthSurfaceLocationListEClass.getESuperTypes().add(theEMFEcorePackage.getDescribed());
		groundStationEClass.getESuperTypes().add(this.getEarthSurfaceLocation());
		groundStationListEClass.getESuperTypes().add(theEMFEcorePackage.getNamed());
		groundStationListEClass.getESuperTypes().add(theEMFEcorePackage.getDescribed());
		visibilityPassSpacecraftPositionEClass.getESuperTypes().add(theEMFEcorePackage.getTimed());
		spacecraftsVisibilitySetEClass.getESuperTypes().add(theEMFEcorePackage.getNamed());
		spacecraftsVisibilitySetEClass.getESuperTypes().add(theEMFEcorePackage.getDescribed());
		spacecraftsVisibilitySetEClass.getESuperTypes().add(theSymphonyCorePackage.getUpdatable());
		corridorPointEClass.getESuperTypes().add(theEMFEcorePackage.getTimed());
		corridorEClass.getESuperTypes().add(theEMFEcorePackage.getNamed());
		corridorEClass.getESuperTypes().add(theEMFEcorePackage.getDescribed());
		spacecraftSwathCorridorEClass.getESuperTypes().add(theEMFEcorePackage.getNamed());
		spacecraftSwathCorridorEClass.getESuperTypes().add(theEMFEcorePackage.getDescribed());
		spacecraftSwathCorridorEClass.getESuperTypes().add(theSymphonyCorePackage.getUpdatable());

		// Initialize classes, features, and operations; add parameters
		initEClass(oreKitBackedSpacecraftStateEClass, OreKitBackedSpacecraftState.class, "OreKitBackedSpacecraftState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOreKitBackedSpacecraftState_OreKitSpacecraftState(), this.getOreKitSpacecraftState(), "oreKitSpacecraftState", null, 0, 1, OreKitBackedSpacecraftState.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oreKitBackedFrameEClass, OreKitBackedFrame.class, "OreKitBackedFrame", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getOreKitBackedFrame__GetOreKitFrame(), this.getOreKitFrame(), "getOreKitFrame", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(oreKitBackedAttitudeProviderEClass, OreKitBackedAttitudeProvider.class, "OreKitBackedAttitudeProvider", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getOreKitBackedAttitudeProvider__GetOreKitAttitudeProvider(), this.getOreKitAttitudeProvider(), "getOreKitAttitudeProvider", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(nadirPointingAttitudeProviderEClass, NadirPointingAttitudeProvider.class, "NadirPointingAttitudeProvider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(earthOrbitWorksiteEClass, EarthOrbitWorksite.class, "EarthOrbitWorksite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEarthOrbitWorksite_Sky(), this.getEarthOrbitSky(), this.getEarthOrbitSky_EarthOrbitWorksite(), "sky", null, 1, 1, EarthOrbitWorksite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEarthOrbitWorksite_EarthLocations(), this.getEarthSurfaceLocationList(), null, "earthLocations", null, 0, 1, EarthOrbitWorksite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(earthOrbitSkyEClass, EarthOrbitSky.class, "EarthOrbitSky", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEarthOrbitSky_EarthOrbitWorksite(), this.getEarthOrbitWorksite(), this.getEarthOrbitWorksite_Sky(), "earthOrbitWorksite", null, 0, 1, EarthOrbitSky.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEarthOrbitSky_Moon(), theSymphonyEnvironmentPackage.getMoon(), null, "moon", null, 0, 1, EarthOrbitSky.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEarthOrbitSky_Earth(), theSymphonyEnvironmentPackage.getEarth(), null, "earth", null, 0, 1, EarthOrbitSky.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEOperation(getEarthOrbitSky__GetMoonAngularDiameter(), theEcorePackage.getEDouble(), "getMoonAngularDiameter", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getEarthOrbitSky__GetEarthAngularDiameter(), theEcorePackage.getEDouble(), "getEarthAngularDiameter", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(earthOrbitEClass, EarthOrbit.class, "EarthOrbit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getEarthOrbit__GetOreKitOrbit(), this.getOreKitOrbit(), "getOreKitOrbit", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(keplerianEarthOrbitEClass, KeplerianEarthOrbit.class, "KeplerianEarthOrbit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKeplerianEarthOrbit_SemiMajorAxis(), theEcorePackage.getEDouble(), "semiMajorAxis", null, 0, 1, KeplerianEarthOrbit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeplerianEarthOrbit_Eccentricity(), theEcorePackage.getEDouble(), "eccentricity", null, 0, 1, KeplerianEarthOrbit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeplerianEarthOrbit_Inclination(), theEcorePackage.getEDouble(), "inclination", null, 0, 1, KeplerianEarthOrbit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeplerianEarthOrbit_PerigeeArgument(), theEcorePackage.getEDouble(), "perigeeArgument", null, 0, 1, KeplerianEarthOrbit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeplerianEarthOrbit_RightAscentionOfAscendingNode(), theEcorePackage.getEDouble(), "rightAscentionOfAscendingNode", null, 0, 1, KeplerianEarthOrbit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeplerianEarthOrbit_MeanAnomaly(), theEcorePackage.getEDouble(), "meanAnomaly", null, 0, 1, KeplerianEarthOrbit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeplerianEarthOrbit_TrueAnomaly(), theEcorePackage.getEDouble(), "trueAnomaly", null, 0, 1, KeplerianEarthOrbit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getKeplerianEarthOrbit__GetOreKitKeplerianOrbit(), this.getOreKitKeplerianOrbit(), "getOreKitKeplerianOrbit", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(cartesianEarthOrbitEClass, CartesianEarthOrbit.class, "CartesianEarthOrbit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCartesianEarthOrbit_PvaCoordinates(), theSymphonyOrbitEnvironmentPackage.getTimedStampedPVACoordinates(), null, "pvaCoordinates", null, 1, 1, CartesianEarthOrbit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getCartesianEarthOrbit__GetOreKitCartesianOrbit(), this.getOreKitCartesianOrbit(), "getOreKitCartesianOrbit", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(elevationMaskEClass, ElevationMask.class, "ElevationMask", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getElevationMask__GetElevation__double(), theEcorePackage.getEDouble(), "getElevation", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "azimuth", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getElevationMask__GetOreKitElevationMask(), this.getOreKitElevationMask(), "getOreKitElevationMask", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(constantElevationMaskEClass, ConstantElevationMask.class, "ConstantElevationMask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConstantElevationMask_ConstantElevation(), theEcorePackage.getEDouble(), "constantElevation", "0", 0, 1, ConstantElevationMask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(earthOrbitPropagatorEClass, EarthOrbitPropagator.class, "EarthOrbitPropagator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getEarthOrbitPropagator__GetOreKitPropagator(), this.getOreKitPropagator(), "getOreKitPropagator", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEarthOrbitPropagator__GetTargetPasses__EarthSurfaceLocation_Date_Date_ElevationMask(), null, "getTargetPasses", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEarthSurfaceLocation(), "earthSurfaceLocation", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDate(), "startDate", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDate(), "endDate", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getElevationMask(), "elevationMask", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());
		EGenericType g1 = createEGenericType(this.getList());
		EGenericType g2 = createEGenericType(this.getVisibilityPass());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getEarthOrbitPropagator__GetGroundStationPasses__GroundStation_Date_Date(), null, "getGroundStationPasses", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getGroundStation(), "groundStation", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDate(), "startDate", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDate(), "endDate", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getVisibilityPass());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(keplerianEarthOrbitPropagatorEClass, KeplerianEarthOrbitPropagator.class, "KeplerianEarthOrbitPropagator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getKeplerianEarthOrbitPropagator__GetOreKitKeplerianPropagator(), this.getOreKitKeplerianPropagator(), "getOreKitKeplerianPropagator", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(tleEarthOrbitPropagatorEClass, TLEEarthOrbitPropagator.class, "TLEEarthOrbitPropagator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTLEEarthOrbitPropagator_Tle(), this.getTLE(), null, "tle", null, 1, 1, TLEEarthOrbitPropagator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getTLEEarthOrbitPropagator__GetOreKitTLEPropagator(), this.getOreKitTLEPropagator(), "getOreKitTLEPropagator", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(urlBasedTLEEarthOrbitPropagatorEClass, URLBasedTLEEarthOrbitPropagator.class, "URLBasedTLEEarthOrbitPropagator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getURLBasedTLEEarthOrbitPropagator_TleURL(), theEcorePackage.getEString(), "tleURL", null, 0, 1, URLBasedTLEEarthOrbitPropagator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tleEClass, org.eclipse.symphony.core.environment.orbit.earth.TLE.class, "TLE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTLE_Line1(), theEcorePackage.getEString(), "line1", null, 0, 1, org.eclipse.symphony.core.environment.orbit.earth.TLE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTLE_Line2(), theEcorePackage.getEString(), "line2", null, 0, 1, org.eclipse.symphony.core.environment.orbit.earth.TLE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTLE_BStar(), theEcorePackage.getEDouble(), "bStar", null, 0, 1, org.eclipse.symphony.core.environment.orbit.earth.TLE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTLE_Epoch(), theEcorePackage.getEDate(), "epoch", null, 0, 1, org.eclipse.symphony.core.environment.orbit.earth.TLE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTLE_Eccentricity(), theEcorePackage.getEDouble(), "eccentricity", null, 0, 1, org.eclipse.symphony.core.environment.orbit.earth.TLE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTLE_ElementNumber(), theEcorePackage.getEInt(), "elementNumber", null, 0, 1, org.eclipse.symphony.core.environment.orbit.earth.TLE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTLE_EphemerisType(), this.getEphemerisType(), "ephemerisType", null, 0, 1, org.eclipse.symphony.core.environment.orbit.earth.TLE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTLE_Inclination(), theEcorePackage.getEDouble(), "inclination", null, 0, 1, org.eclipse.symphony.core.environment.orbit.earth.TLE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTLE_MeanAnomaly(), theEcorePackage.getEDouble(), "meanAnomaly", null, 0, 1, org.eclipse.symphony.core.environment.orbit.earth.TLE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTLE_MeanMotion(), theEcorePackage.getEDouble(), "meanMotion", null, 0, 1, org.eclipse.symphony.core.environment.orbit.earth.TLE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTLE_RevolutionPerDay(), theEcorePackage.getEDouble(), "revolutionPerDay", null, 0, 1, org.eclipse.symphony.core.environment.orbit.earth.TLE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTLE_MeanMotionFirstDerivative(), theEcorePackage.getEDouble(), "meanMotionFirstDerivative", null, 0, 1, org.eclipse.symphony.core.environment.orbit.earth.TLE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTLE_MeanMotionSecondDerivative(), theEcorePackage.getEDouble(), "meanMotionSecondDerivative", null, 0, 1, org.eclipse.symphony.core.environment.orbit.earth.TLE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTLE_ArgumentOfPerigee(), theEcorePackage.getEDouble(), "argumentOfPerigee", null, 0, 1, org.eclipse.symphony.core.environment.orbit.earth.TLE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTLE_RightAscentionOfAscendingNode(), theEcorePackage.getEDouble(), "rightAscentionOfAscendingNode", null, 0, 1, org.eclipse.symphony.core.environment.orbit.earth.TLE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTLE_RevolutionNumberAtEpoch(), theEcorePackage.getEInt(), "revolutionNumberAtEpoch", null, 0, 1, org.eclipse.symphony.core.environment.orbit.earth.TLE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTLE_SatelliteNumber(), theEcorePackage.getEInt(), "satelliteNumber", null, 0, 1, org.eclipse.symphony.core.environment.orbit.earth.TLE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getTLE__GetOreKitTLE(), this.getOreKitTLE(), "getOreKitTLE", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		initEClass(earthSurfaceLocationEClass, EarthSurfaceLocation.class, "EarthSurfaceLocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEarthSurfaceLocation_GeographicalCoordinates(), theSymphonyEnvironmentPackage.getGeographicCoordinates(), null, "geographicalCoordinates", null, 0, 1, EarthSurfaceLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(earthSurfaceLocationListEClass, EarthSurfaceLocationList.class, "EarthSurfaceLocationList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEarthSurfaceLocationList_EarthSurfaceLocations(), this.getEarthSurfaceLocation(), null, "earthSurfaceLocations", null, 0, -1, EarthSurfaceLocationList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(groundStationEClass, GroundStation.class, "GroundStation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGroundStation_FieldOfViewOrientation(), theMathPackage.getMatrix3x3(), null, "fieldOfViewOrientation", null, 0, 1, GroundStation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGroundStation_ElevationMask(), this.getElevationMask(), null, "elevationMask", null, 0, 1, GroundStation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(groundStationListEClass, GroundStationList.class, "GroundStationList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGroundStationList_GroundStations(), this.getGroundStation(), null, "groundStations", null, 0, -1, GroundStationList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(visibilityPassEClass, VisibilityPass.class, "VisibilityPass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVisibilityPass_OrbitModel(), theSymphonyOrbitEnvironmentPackage.getOrbitModel(), null, "orbitModel", null, 0, 1, VisibilityPass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVisibilityPass_SurfaceLocation(), this.getEarthSurfaceLocation(), null, "surfaceLocation", null, 0, 1, VisibilityPass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVisibilityPass_StartTime(), theEcorePackage.getEDate(), "startTime", null, 0, 1, VisibilityPass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVisibilityPass_EndTime(), theEcorePackage.getEDate(), "endTime", null, 0, 1, VisibilityPass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVisibilityPass_PositionHistory(), this.getVisibilityPassSpacecraftPositionHistory(), this.getVisibilityPassSpacecraftPositionHistory_VisibilityPass(), "positionHistory", null, 0, 1, VisibilityPass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVisibilityPass_Duration(), theEcorePackage.getEDouble(), "duration", null, 0, 1, VisibilityPass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(visibilityPassSpacecraftPositionHistoryEClass, VisibilityPassSpacecraftPositionHistory.class, "VisibilityPassSpacecraftPositionHistory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVisibilityPassSpacecraftPositionHistory_TimeInterval(), theEcorePackage.getEDouble(), "timeInterval", "30.0", 0, 1, VisibilityPassSpacecraftPositionHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVisibilityPassSpacecraftPositionHistory_VisibilityPass(), this.getVisibilityPass(), this.getVisibilityPass_PositionHistory(), "visibilityPass", null, 0, 1, VisibilityPassSpacecraftPositionHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVisibilityPassSpacecraftPositionHistory_Positions(), this.getVisibilityPassSpacecraftPosition(), null, "positions", null, 0, -1, VisibilityPassSpacecraftPositionHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getVisibilityPassSpacecraftPositionHistory__GetHighestElevationPosition(), this.getVisibilityPassSpacecraftPosition(), "getHighestElevationPosition", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getVisibilityPassSpacecraftPositionHistory__GetSmallestSpacecraftCrossTrackAnglePosition(), this.getVisibilityPassSpacecraftPosition(), "getSmallestSpacecraftCrossTrackAnglePosition", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getVisibilityPassSpacecraftPositionHistory__UpdateHistory(), null, "updateHistory", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(visibilityPassSpacecraftPositionEClass, VisibilityPassSpacecraftPosition.class, "VisibilityPassSpacecraftPosition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVisibilityPassSpacecraftPosition_Azimuth(), theEcorePackage.getEDouble(), "azimuth", "0", 0, 1, VisibilityPassSpacecraftPosition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVisibilityPassSpacecraftPosition_Elevation(), theEcorePackage.getEDouble(), "elevation", "0", 0, 1, VisibilityPassSpacecraftPosition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVisibilityPassSpacecraftPosition_Range(), theEcorePackage.getEDouble(), "range", "0", 0, 1, VisibilityPassSpacecraftPosition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVisibilityPassSpacecraftPosition_RangeRate(), theEcorePackage.getEDouble(), "rangeRate", "0", 0, 1, VisibilityPassSpacecraftPosition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVisibilityPassSpacecraftPosition_SpacecraftCrossTrackAngle(), theEcorePackage.getEDouble(), "spacecraftCrossTrackAngle", "0", 0, 1, VisibilityPassSpacecraftPosition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(spacecraftsVisibilitySetEClass, SpacecraftsVisibilitySet.class, "SpacecraftsVisibilitySet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpacecraftsVisibilitySet_StartTime(), theEcorePackage.getEDate(), "startTime", null, 0, 1, SpacecraftsVisibilitySet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpacecraftsVisibilitySet_EndTime(), theEcorePackage.getEDate(), "endTime", null, 0, 1, SpacecraftsVisibilitySet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpacecraftsVisibilitySet_OrbitModels(), theSymphonyOrbitEnvironmentPackage.getOrbitModel(), null, "orbitModels", null, 0, -1, SpacecraftsVisibilitySet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpacecraftsVisibilitySet_GroundStations(), this.getGroundStation(), null, "groundStations", null, 0, -1, SpacecraftsVisibilitySet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpacecraftsVisibilitySet_Passes(), this.getVisibilityPass(), null, "passes", null, 0, -1, SpacecraftsVisibilitySet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getMap());
		g2 = createEGenericType(this.getGroundStation());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getList());
		g1.getETypeArguments().add(g2);
		EGenericType g3 = createEGenericType(this.getVisibilityPass());
		g2.getETypeArguments().add(g3);
		initEAttribute(getSpacecraftsVisibilitySet_GroundStationToVisibilityMap(), g1, "groundStationToVisibilityMap", null, 0, 1, SpacecraftsVisibilitySet.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(corridorPointEClass, CorridorPoint.class, "CorridorPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCorridorPoint_Left(), theSymphonyEnvironmentPackage.getGeographicCoordinates(), null, "left", null, 0, 1, CorridorPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCorridorPoint_Center(), theSymphonyEnvironmentPackage.getGeographicCoordinates(), null, "center", null, 0, 1, CorridorPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCorridorPoint_Right(), theSymphonyEnvironmentPackage.getGeographicCoordinates(), null, "right", null, 0, 1, CorridorPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(corridorEClass, Corridor.class, "Corridor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCorridor_Points(), this.getCorridorPoint(), null, "points", null, 0, -1, Corridor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(spacecraftSwathCorridorEClass, SpacecraftSwathCorridor.class, "SpacecraftSwathCorridor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpacecraftSwathCorridor_StartTime(), theEcorePackage.getEDate(), "startTime", null, 0, 1, SpacecraftSwathCorridor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpacecraftSwathCorridor_EndTime(), theEcorePackage.getEDate(), "endTime", null, 0, 1, SpacecraftSwathCorridor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpacecraftSwathCorridor_TimeInterval(), theEcorePackage.getEDouble(), "timeInterval", "1.0", 0, 1, SpacecraftSwathCorridor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpacecraftSwathCorridor_OrbitModel(), theSymphonyOrbitEnvironmentPackage.getOrbitModel(), null, "orbitModel", null, 0, 1, SpacecraftSwathCorridor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpacecraftSwathCorridor_LeftSwathAngle(), theEcorePackage.getEDouble(), "leftSwathAngle", "0", 0, 1, SpacecraftSwathCorridor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpacecraftSwathCorridor_RightSwathAngle(), theEcorePackage.getEDouble(), "rightSwathAngle", "0", 0, 1, SpacecraftSwathCorridor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpacecraftSwathCorridor_Corridor(), this.getCorridor(), null, "corridor", null, 0, 1, SpacecraftSwathCorridor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(earthOrbitFacadeEClass, EarthOrbitFacade.class, "EarthOrbitFacade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getEarthOrbitFacade__GetMu(), theEcorePackage.getEDouble(), "getMu", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEarthOrbitFacade__CreateAbsoluteDate__Date(), this.getAbsoluteDate(), "createAbsoluteDate", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDate(), "date", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEarthOrbitFacade__CreateDate__AbsoluteDate(), theEcorePackage.getEDate(), "createDate", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAbsoluteDate(), "absoluteDate", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEarthOrbitFacade__CreateEarthSurfaceLocation__String_String_double_double_double(), this.getEarthSurfaceLocation(), "createEarthSurfaceLocation", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "description", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "longitude", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "latitude", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "elevation", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEarthOrbitFacade__CreateOreKitBackedFrame__Frame(), this.getOreKitBackedFrame(), "createOreKitBackedFrame", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOreKitFrame(), "oreKitFrame", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEarthOrbitFacade__GetSpacecraftEarthSubPoint__OreKitBackedSpacecraftState(), theSymphonyEnvironmentPackage.getGeographicCoordinates(), "getSpacecraftEarthSubPoint", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOreKitBackedSpacecraftState(), "oreKitBackedSpacecraftState", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		op = initEOperation(getEarthOrbitFacade__GetSpacecraftElevationAngle__SpacecraftState_EarthSurfaceLocation(), theEcorePackage.getEDouble(), "getSpacecraftElevationAngle", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSymphonyOrbitEnvironmentPackage.getSpacecraftState(), "spacecraftState", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEarthSurfaceLocation(), "earthSurfaceLocation", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		op = initEOperation(getEarthOrbitFacade__GetSpacecraftAzimuthAngle__SpacecraftState_EarthSurfaceLocation(), theEcorePackage.getEDouble(), "getSpacecraftAzimuthAngle", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSymphonyOrbitEnvironmentPackage.getSpacecraftState(), "spacecraftState", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEarthSurfaceLocation(), "earthSurfaceLocation", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		op = initEOperation(getEarthOrbitFacade__GetRange__SpacecraftState_EarthSurfaceLocation(), theEcorePackage.getEDouble(), "getRange", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSymphonyOrbitEnvironmentPackage.getSpacecraftState(), "spacecraftState", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEarthSurfaceLocation(), "earthSurfaceLocation", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		op = initEOperation(getEarthOrbitFacade__CreateSpacecraftState__Orbit_SpacecraftState(), theSymphonyOrbitEnvironmentPackage.getSpacecraftState(), "createSpacecraftState", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSymphonyOrbitEnvironmentPackage.getOrbit(), "orbit", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOreKitSpacecraftState(), "oreKitSpacecraftState", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEarthOrbitFacade__CreateOreKitBackedSpacecraftState__Orbit_SpacecraftState(), this.getOreKitBackedSpacecraftState(), "createOreKitBackedSpacecraftState", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSymphonyOrbitEnvironmentPackage.getOrbit(), "orbit", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOreKitSpacecraftState(), "oreKitSpacecraftState", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEarthOrbitFacade__CreateTimedStampedPVACoordinates__TimeStampedPVCoordinates(), theSymphonyOrbitEnvironmentPackage.getTimedStampedPVACoordinates(), "createTimedStampedPVACoordinates", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOreKitTimeStampedPVCoordinates(), "oreKitTimeStampedPVCoordinates", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEarthOrbitFacade__CreateTimedStampedAngularCoordinates__TimeStampedAngularCoordinates(), theSymphonyOrbitEnvironmentPackage.getTimedStampedAngularCoordinates(), "createTimedStampedAngularCoordinates", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOreKitTimeStampedAngularCoordinates(), "oreKitTimeStampedAngularCoordinates", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEarthOrbitFacade__CreateMatrix3x3__Rotation(), theMathPackage.getMatrix3x3(), "createMatrix3x3", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRotation(), "rotation", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEarthOrbitFacade__CreateRotation__Matrix3x3(), this.getRotation(), "createRotation", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMathPackage.getMatrix3x3(), "matrix3x3", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEarthOrbitFacade__CreateKeplerianOrbit__EarthOrbitPropagator(), this.getKeplerianEarthOrbit(), "createKeplerianOrbit", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEarthOrbitPropagator(), "earthOrbitPropagator", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		op = initEOperation(getEarthOrbitFacade__CreateCartesianEarthOrbit__EarthOrbitPropagator(), this.getCartesianEarthOrbit(), "createCartesianEarthOrbit", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEarthOrbitPropagator(), "earthOrbitPropagator", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		op = initEOperation(getEarthOrbitFacade__CreateKeplerianOrbit__KeplerianOrbit(), this.getKeplerianEarthOrbit(), "createKeplerianOrbit", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOreKitKeplerianOrbit(), "oreKitKeplerianOrbit", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		op = initEOperation(getEarthOrbitFacade__CreateCartesianEarthOrbit__CartesianOrbit(), this.getCartesianEarthOrbit(), "createCartesianEarthOrbit", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOreKitCartesianOrbit(), "oreKitCartesianOrbit", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		op = initEOperation(getEarthOrbitFacade__ConvertToGeographicCoordinates__OreKitBackedSpacecraftState(), theSymphonyEnvironmentPackage.getGeographicCoordinates(), "convertToGeographicCoordinates", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOreKitBackedSpacecraftState(), "oreKitBackedSpacecraftState", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		op = initEOperation(getEarthOrbitFacade__GetVisibilityPassSortedByStartDate__List(), null, "getVisibilityPassSortedByStartDate", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getVisibilityPass());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "passes", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getSortedSet());
		g2 = createEGenericType(this.getVisibilityPass());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getEarthOrbitFacade__GetVisibilityPassSortedByDuration__List(), null, "getVisibilityPassSortedByDuration", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getVisibilityPass());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "passes", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getSortedSet());
		g2 = createEGenericType(this.getVisibilityPass());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getEarthOrbitFacade__GetVisibilityPassSpacecraftPositionSortedByElevation__List(), null, "getVisibilityPassSpacecraftPositionSortedByElevation", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getVisibilityPassSpacecraftPosition());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "positions", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getSortedSet());
		g2 = createEGenericType(this.getVisibilityPassSpacecraftPosition());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getEarthOrbitFacade__GetVisibilityPassSpacecraftPositionSortedBySpacecraftCrossTrackAngle__List(), null, "getVisibilityPassSpacecraftPositionSortedBySpacecraftCrossTrackAngle", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getVisibilityPassSpacecraftPosition());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "positions", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getSortedSet());
		g2 = createEGenericType(this.getVisibilityPassSpacecraftPosition());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getEarthOrbitFacade__LoadTLE__String(), this.getTLE(), "loadTLE", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "url", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		op = initEOperation(getEarthOrbitFacade__CreateTLEEarthOrbitPropagator__TLE(), this.getTLEEarthOrbitPropagator(), "createTLEEarthOrbitPropagator", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTLE(), "tle", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		// Initialize enums and add enum literals
		initEEnum(ephemerisTypeEEnum, EphemerisType.class, "EphemerisType");
		addEEnumLiteral(ephemerisTypeEEnum, EphemerisType.DEFAULT);
		addEEnumLiteral(ephemerisTypeEEnum, EphemerisType.SGP);
		addEEnumLiteral(ephemerisTypeEEnum, EphemerisType.SGP4);
		addEEnumLiteral(ephemerisTypeEEnum, EphemerisType.SDP4);
		addEEnumLiteral(ephemerisTypeEEnum, EphemerisType.SGP8);
		addEEnumLiteral(ephemerisTypeEEnum, EphemerisType.SDP8);

		// Initialize data types
		initEDataType(listEDataType, List.class, "List", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(mapEDataType, Map.class, "Map", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(exceptionEDataType, Exception.class, "Exception", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(sortedSetEDataType, SortedSet.class, "SortedSet", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(rotationEDataType, Rotation.class, "Rotation", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(oreKitFrameEDataType, Frame.class, "OreKitFrame", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(oreKitTimeStampedAngularCoordinatesEDataType, TimeStampedAngularCoordinates.class, "OreKitTimeStampedAngularCoordinates", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(oreKitTimeStampedPVCoordinatesEDataType, TimeStampedPVCoordinates.class, "OreKitTimeStampedPVCoordinates", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(oreKitSpacecraftStateEDataType, SpacecraftState.class, "OreKitSpacecraftState", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(absoluteDateEDataType, AbsoluteDate.class, "AbsoluteDate", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(oreKitOrbitEDataType, Orbit.class, "OreKitOrbit", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(oreKitKeplerianOrbitEDataType, KeplerianOrbit.class, "OreKitKeplerianOrbit", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(oreKitCartesianOrbitEDataType, CartesianOrbit.class, "OreKitCartesianOrbit", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(oreKitElevationMaskEDataType, org.orekit.utils.ElevationMask.class, "OreKitElevationMask", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(oreKitAttitudeProviderEDataType, AttitudeProvider.class, "OreKitAttitudeProvider", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(oreKitPropagatorEDataType, Propagator.class, "OreKitPropagator", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(oreKitDSSTPropagatorEDataType, DSSTPropagator.class, "OreKitDSSTPropagator", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(oreKitEcksteinHechlerPropagatorEDataType, EcksteinHechlerPropagator.class, "OreKitEcksteinHechlerPropagator", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(oreKitEphemerisProgatorEDataType, Ephemeris.class, "OreKitEphemerisProgator", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(oreKitKeplerianPropagatorEDataType, KeplerianPropagator.class, "OreKitKeplerianPropagator", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(oreKitNumericalPropagatorEDataType, NumericalPropagator.class, "OreKitNumericalPropagator", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(oreKitTLEPropagatorEDataType, TLEPropagator.class, "OreKitTLEPropagator", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(oreKitTLEEDataType, org.orekit.propagation.analytical.tle.TLE.class, "OreKitTLE", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "prefix", "SymphonyEarthOrbitEnvironment",
			 "childCreationExtenders", "true",
			 "extensibleProviderFactory", "true",
			 "multipleEditorPages", "false",
			 "copyrightText", "Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)",
			 "modelName", "SymphonyEarthOrbitEnvironment",
			 "complianceLevel", "8.0",
			 "suppressGenModelAnnotations", "false",
			 "modelDirectory", "/org.eclipse.symphony.core.environment.orbit.earth/src-generated",
			 "editDirectory", "/org.eclipse.symphony.core.environment.orbit.earth.edit/src-generated",
			 "basePackage", "org.eclipse.symphony.core.environment.orbit"
		   });	
		addAnnotation
		  (ephemerisTypeEEnum, 
		   source, 
		   new String[] {
			 "documentation", " Ephemeris types defined for Two-Lines Elements"
		   });	
		addAnnotation
		  (oreKitBackedSpacecraftStateEClass, 
		   source, 
		   new String[] {
			 "documentation", "*\nA SpacecraftState that is backed by an OreKit SpacecraftState."
		   });	
		addAnnotation
		  (oreKitBackedAttitudeProviderEClass, 
		   source, 
		   new String[] {
			 "documentation", "*\nA specialization of AttitudeProvider that uses an OreKit org.orekit.attitudes.AttitudeProvider."
		   });	
		addAnnotation
		  (nadirPointingAttitudeProviderEClass, 
		   source, 
		   new String[] {
			 "documentation", "*\nThis class represents the attitude provider where the satellite z axis is pointing to the vertical of the ground point under satellite.\nIt is backed by a org.orekit.attitudes.NadirPointing AttitudeProvider."
		   });	
		addAnnotation
		  (earthOrbitWorksiteEClass, 
		   source, 
		   new String[] {
			 "documentation", "*\nDefines a worksite in orbit. The reference frame used is inertial (J2000), with its origin at the current orbital position."
		   });	
		addAnnotation
		  (getEarthOrbitWorksite_EarthLocations(), 
		   source, 
		   new String[] {
			 "documentation", "The list of surface location associated with the site.",
			 "children", "true"
		   });	
		addAnnotation
		  (earthOrbitSkyEClass, 
		   source, 
		   new String[] {
			 "documentation", "*\nDefines the Sky as seen from an EarthOrbitWorksite."
		   });	
		addAnnotation
		  (getEarthOrbitSky__GetMoonAngularDiameter(), 
		   source, 
		   new String[] {
			 "documentation", "Returns the Moon angular diameter, in radians.",
			 "propertyCategory", "MOON",
			 "csa_units", "rad"
		   });	
		addAnnotation
		  (getEarthOrbitSky__GetEarthAngularDiameter(), 
		   source, 
		   new String[] {
			 "documentation", "Returns the Earth angular diameter, in radians.",
			 "propertyCategory", "EARTH",
			 "csa_units", "rad"
		   });	
		addAnnotation
		  (getEarthOrbitSky_EarthOrbitWorksite(), 
		   source, 
		   new String[] {
			 "documentation", "The worksite to which the sky is associated."
		   });	
		addAnnotation
		  (getEarthOrbitSky_Moon(), 
		   source, 
		   new String[] {
			 "documentation", "The Moon in the sky.",
			 "propertyCategory", "MOON"
		   });	
		addAnnotation
		  (getEarthOrbitSky_Earth(), 
		   source, 
		   new String[] {
			 "documentation", "The Earth in the sky.",
			 "propertyCategory", "EARTH"
		   });	
		addAnnotation
		  (earthOrbitEClass, 
		   source, 
		   new String[] {
			 "documentation", "*\nDefines an Orbit around the Earth."
		   });	
		addAnnotation
		  (getEarthOrbit__GetOreKitOrbit(), 
		   source, 
		   new String[] {
			 "documentation", "Returns the underlying OreKit Orbit."
		   });	
		addAnnotation
		  (keplerianEarthOrbitEClass, 
		   source, 
		   new String[] {
			 "documentation", "*\nAn Earth orbit represented by Keplerian Elements.\n@see http://en.wikipedia.org/wiki/Orbital_elements"
		   });	
		addAnnotation
		  (getKeplerianEarthOrbit__GetOreKitKeplerianOrbit(), 
		   source, 
		   new String[] {
			 "documentation", "Returns the underlying OreKit KeplerianOrbit."
		   });	
		addAnnotation
		  (getKeplerianEarthOrbit_SemiMajorAxis(), 
		   source, 
		   new String[] {
			 "documentation", "Semi-major axis, in meters",
			 "csa_units", "m"
		   });	
		addAnnotation
		  (getKeplerianEarthOrbit_Eccentricity(), 
		   source, 
		   new String[] {
			 "documentation", "Eccentricity"
		   });	
		addAnnotation
		  (getKeplerianEarthOrbit_Inclination(), 
		   source, 
		   new String[] {
			 "documentation", "Inclination, in radians.",
			 "csa_units", "rad"
		   });	
		addAnnotation
		  (getKeplerianEarthOrbit_PerigeeArgument(), 
		   source, 
		   new String[] {
			 "documentation", "Argument of perigee, in radians.",
			 "csa_units", "rad"
		   });	
		addAnnotation
		  (getKeplerianEarthOrbit_RightAscentionOfAscendingNode(), 
		   source, 
		   new String[] {
			 "documentation", "Right ascension of ascending node, in radians.",
			 "csa_units", "rad"
		   });	
		addAnnotation
		  (getKeplerianEarthOrbit_MeanAnomaly(), 
		   source, 
		   new String[] {
			 "documentation", "Mean anomaly."
		   });	
		addAnnotation
		  (getKeplerianEarthOrbit_TrueAnomaly(), 
		   source, 
		   new String[] {
			 "documentation", "True anomaly."
		   });	
		addAnnotation
		  (getConstantElevationMask_ConstantElevation(), 
		   source, 
		   new String[] {
			 "documentation", "The elevation, in radians.",
			 "property", "Editable",
			 "csa_units", "rad"
		   });	
		addAnnotation
		  (earthOrbitPropagatorEClass, 
		   source, 
		   new String[] {
			 "documentation", "*\nDefines an Orbit propagator for Earth orbits."
		   });	
		addAnnotation
		  (getEarthOrbitPropagator__GetTargetPasses__EarthSurfaceLocation_Date_Date_ElevationMask(), 
		   source, 
		   new String[] {
			 "documentation", "*\nReturns the list of passes for a given target."
		   });	
		addAnnotation
		  (getEarthOrbitPropagator__GetGroundStationPasses__GroundStation_Date_Date(), 
		   source, 
		   new String[] {
			 "documentation", "*\nReturns the list of passes for a given Ground Station (and its Field Of View) during a specified interval."
		   });	
		addAnnotation
		  (keplerianEarthOrbitPropagatorEClass, 
		   source, 
		   new String[] {
			 "documentation", "*\nSimple keplerian orbit propagator for Earth orbits."
		   });	
		addAnnotation
		  (getKeplerianEarthOrbitPropagator__GetOreKitKeplerianPropagator(), 
		   source, 
		   new String[] {
			 "documentation", "Gets the underlying OreKit KeplerianPropagator used to do computations.",
			 "notify", "true",
			 "property", "Readonly"
		   });	
		addAnnotation
		  (getTLEEarthOrbitPropagator_Tle(), 
		   source, 
		   new String[] {
			 "documentation", "*\nThe Two-Line Elements used by this propagator."
		   });	
		addAnnotation
		  (getURLBasedTLEEarthOrbitPropagator_TleURL(), 
		   source, 
		   new String[] {
			 "documentation", "The URl pointing to the source of the TLE.",
			 "property", "Editable",
			 "propertyCategory", "TLE_RAW_DATA",
			 "notify", "true"
		   });	
		addAnnotation
		  (tleEClass, 
		   source, 
		   new String[] {
			 "documentation", " Defines a Two-Line Elements definition.\n@see http://en.wikipedia.org/wiki/Two-line_element_set"
		   });	
		addAnnotation
		  (getTLE__GetOreKitTLE(), 
		   source, 
		   new String[] {
			 "documentation", "*\nReturn the OreKit implementation backing this TLE."
		   });	
		addAnnotation
		  (getTLE_Line1(), 
		   source, 
		   new String[] {
			 "documentation", "The first line of the TLE in text form.",
			 "property", "Editable",
			 "propertyCategory", "TLE_RAW_DATA",
			 "notify", "true"
		   });	
		addAnnotation
		  (getTLE_Line2(), 
		   source, 
		   new String[] {
			 "documentation", "The second line of the TLE in text form.",
			 "property", "Editable",
			 "propertyCategory", "TLE_RAW_DATA",
			 "notify", "true"
		   });	
		addAnnotation
		  (getTLE_BStar(), 
		   source, 
		   new String[] {
			 "documentation", "The ballistic coefficient.",
			 "property", "Readonly",
			 "notify", "true",
			 "propertyCategory", "TLE_ORBITAL_PARAMETERS"
		   });	
		addAnnotation
		  (getTLE_Epoch(), 
		   source, 
		   new String[] {
			 "documentation", "The epoch.",
			 "property", "Readonly",
			 "notify", "true"
		   });	
		addAnnotation
		  (getTLE_Eccentricity(), 
		   source, 
		   new String[] {
			 "documentation", "The eccentricity.",
			 "property", "Readonly",
			 "notify", "true",
			 "propertyCategory", "TLE_ORBITAL_PARAMETERS"
		   });	
		addAnnotation
		  (getTLE_ElementNumber(), 
		   source, 
		   new String[] {
			 "documentation", "The element number.",
			 "property", "Readonly",
			 "notify", "true"
		   });	
		addAnnotation
		  (getTLE_EphemerisType(), 
		   source, 
		   new String[] {
			 "documentation", "The Ephemeris type.",
			 "property", "Readonly",
			 "notify", "true"
		   });	
		addAnnotation
		  (getTLE_Inclination(), 
		   source, 
		   new String[] {
			 "documentation", "The inclination.",
			 "property", "Readonly",
			 "notify", "true",
			 "csa_units", "rad",
			 "propertyCategory", "TLE_ORBITAL_PARAMETERS"
		   });	
		addAnnotation
		  (getTLE_MeanAnomaly(), 
		   source, 
		   new String[] {
			 "documentation", "The mean anomaly.",
			 "property", "Readonly",
			 "notify", "true",
			 "csa_units", "rad",
			 "propertyCategory", "TLE_ORBITAL_PARAMETERS"
		   });	
		addAnnotation
		  (getTLE_MeanMotion(), 
		   source, 
		   new String[] {
			 "documentation", "The mean motion.",
			 "property", "Readonly",
			 "notify", "true",
			 "csa_units", "rad/s",
			 "propertyCategory", "TLE_ORBITAL_PARAMETERS"
		   });	
		addAnnotation
		  (getTLE_RevolutionPerDay(), 
		   source, 
		   new String[] {
			 "documentation", "The mean motion, expressed as revolution per day.",
			 "property", "Readonly",
			 "notify", "true",
			 "csa_units", "rev/day",
			 "propertyCategory", "TLE_ORBITAL_PARAMETERS"
		   });	
		addAnnotation
		  (getTLE_MeanMotionFirstDerivative(), 
		   source, 
		   new String[] {
			 "documentation", "The mean motion first derivative.",
			 "property", "Readonly",
			 "notify", "true",
			 "csa_units", "rad/s\u00b2",
			 "propertyCategory", "TLE_ORBITAL_PARAMETERS"
		   });	
		addAnnotation
		  (getTLE_MeanMotionSecondDerivative(), 
		   source, 
		   new String[] {
			 "documentation", "The mean motion second derivative.",
			 "property", "Readonly",
			 "notify", "true",
			 "csa_units", "rad/s\u00b3",
			 "propertyCategory", "TLE_ORBITAL_PARAMETERS"
		   });	
		addAnnotation
		  (getTLE_ArgumentOfPerigee(), 
		   source, 
		   new String[] {
			 "documentation", "The argument of perigee.",
			 "property", "Readonly",
			 "notify", "true",
			 "csa_units", "rad",
			 "propertyCategory", "TLE_ORBITAL_PARAMETERS"
		   });	
		addAnnotation
		  (getTLE_RightAscentionOfAscendingNode(), 
		   source, 
		   new String[] {
			 "documentation", "Right ascension of ascending node, in radians.",
			 "property", "Readonly",
			 "csa_units", "rad",
			 "propertyCategory", "TLE_ORBITAL_PARAMETERS"
		   });	
		addAnnotation
		  (getTLE_RevolutionNumberAtEpoch(), 
		   source, 
		   new String[] {
			 "documentation", "The revolution number at epoch.",
			 "property", "Readonly",
			 "propertyCategory", "TLE_ORBITAL_PARAMETERS"
		   });	
		addAnnotation
		  (getTLE_SatelliteNumber(), 
		   source, 
		   new String[] {
			 "documentation", "The satellite id number.",
			 "property", "Readonly"
		   });	
		addAnnotation
		  (earthSurfaceLocationEClass, 
		   source, 
		   new String[] {
			 "documentation", "*\nDefines a location on the surface of the Earth."
		   });	
		addAnnotation
		  (groundStationEClass, 
		   source, 
		   new String[] {
			 "documentation", "*\nDefines a ground station and its associated Field Of View."
		   });	
		addAnnotation
		  (getGroundStation_FieldOfViewOrientation(), 
		   source, 
		   new String[] {
			 "documentation", "The orientation of the field of view relative to the Ground Station frame.",
			 "notify", "true"
		   });	
		addAnnotation
		  (getGroundStation_ElevationMask(), 
		   source, 
		   new String[] {
			 "documentation", "The elevation mask of the Ground Station.",
			 "notify", "true"
		   });	
		addAnnotation
		  (visibilityPassEClass, 
		   source, 
		   new String[] {
			 "documentation", "*\nClass that defines a visibility pass."
		   });	
		addAnnotation
		  (getVisibilityPass_OrbitModel(), 
		   source, 
		   new String[] {
			 "documentation", "The Orbit Model that was used to compute the visibility.",
			 "notify", "true",
			 "property", "Readonly"
		   });	
		addAnnotation
		  (getVisibilityPass_SurfaceLocation(), 
		   source, 
		   new String[] {
			 "documentation", "The surface locations.",
			 "notify", "true",
			 "property", "Readonly"
		   });	
		addAnnotation
		  (getVisibilityPass_StartTime(), 
		   source, 
		   new String[] {
			 "documentation", "The start time of the pass.",
			 "notify", "true",
			 "property", "Readonly"
		   });	
		addAnnotation
		  (getVisibilityPass_EndTime(), 
		   source, 
		   new String[] {
			 "documentation", "The end time of the pass.",
			 "notify", "true",
			 "property", "Readonly"
		   });	
		addAnnotation
		  (getVisibilityPass_PositionHistory(), 
		   source, 
		   new String[] {
			 "documentation", "The end time of the pass.",
			 "notify", "true",
			 "property", "Readonly",
			 "children", "true"
		   });	
		addAnnotation
		  (getVisibilityPass_Duration(), 
		   source, 
		   new String[] {
			 "documentation", "Pass duration, in seconds.",
			 "csa_unit", "s"
		   });	
		addAnnotation
		  (getVisibilityPassSpacecraftPositionHistory__GetHighestElevationPosition(), 
		   source, 
		   new String[] {
			 "documentation", "*\nReturns the VisibilityPassSpacecraftPosition with the highest elevation in the position history.\n@return The VisibilityPassSpacecraftPosition with the highest elevation, null if the history position is empty."
		   });	
		addAnnotation
		  (getVisibilityPassSpacecraftPositionHistory__GetSmallestSpacecraftCrossTrackAnglePosition(), 
		   source, 
		   new String[] {
			 "documentation", "*\nReturns the VisibilityPassSpacecraftPosition with the smallest spacecraft cross-track angle in the position history.\n@return The VisibilityPassSpacecraftPosition with the smallest spacecraft cross-track angle, null if the history position is empty."
		   });	
		addAnnotation
		  (getVisibilityPassSpacecraftPositionHistory__UpdateHistory(), 
		   source, 
		   new String[] {
			 "documentation", "*\nForce the update of VisibilityPassSpacecraftPositionHistory."
		   });	
		addAnnotation
		  (getVisibilityPassSpacecraftPositionHistory_TimeInterval(), 
		   source, 
		   new String[] {
			 "documentation", "The time interval separating positions.",
			 "notify", "true",
			 "property", "Editable",
			 "csa_unit", "s"
		   });	
		addAnnotation
		  (getVisibilityPassSpacecraftPositionHistory_VisibilityPass(), 
		   source, 
		   new String[] {
			 "documentation", "The visibility pass containing the position history.",
			 "notify", "true",
			 "property", "None",
			 "children", "false"
		   });	
		addAnnotation
		  (getVisibilityPassSpacecraftPositionHistory_Positions(), 
		   source, 
		   new String[] {
			 "documentation", "The position history.",
			 "notify", "true",
			 "property", "Readonly",
			 "children", "true"
		   });	
		addAnnotation
		  (getVisibilityPassSpacecraftPosition_Azimuth(), 
		   source, 
		   new String[] {
			 "documentation", "The azimuth of the spacecraft relative to the North.",
			 "notify", "true",
			 "property", "Readonly",
			 "csa_units", "rad"
		   });	
		addAnnotation
		  (getVisibilityPassSpacecraftPosition_Elevation(), 
		   source, 
		   new String[] {
			 "documentation", "The elevation of the spacecraft relative to the local horizontal plane.",
			 "notify", "true",
			 "property", "Readonly",
			 "csa_units", "rad"
		   });	
		addAnnotation
		  (getVisibilityPassSpacecraftPosition_Range(), 
		   source, 
		   new String[] {
			 "documentation", "The range to the spacecraft.",
			 "notify", "true",
			 "property", "Readonly",
			 "csa_units", "m"
		   });	
		addAnnotation
		  (getVisibilityPassSpacecraftPosition_RangeRate(), 
		   source, 
		   new String[] {
			 "documentation", "The relative speed of the spacecraft.",
			 "notify", "true",
			 "property", "Readonly",
			 "csa_units", "m/s"
		   });	
		addAnnotation
		  (getVisibilityPassSpacecraftPosition_SpacecraftCrossTrackAngle(), 
		   source, 
		   new String[] {
			 "documentation", "The angle of the surface location relative to the spacecraft nadir.",
			 "notify", "true",
			 "property", "Readonly",
			 "csa_units", "rad"
		   });	
		addAnnotation
		  (getSpacecraftsVisibilitySet_StartTime(), 
		   source, 
		   new String[] {
			 "documentation", "The start time of prediction period.",
			 "notify", "true",
			 "property", "Editable",
			 "propertyCategory", "TIME_PERIOD"
		   });	
		addAnnotation
		  (getSpacecraftsVisibilitySet_EndTime(), 
		   source, 
		   new String[] {
			 "documentation", "The end time of the prediction period.",
			 "notify", "true",
			 "property", "Editable",
			 "propertyCategory", "TIME_PERIOD"
		   });	
		addAnnotation
		  (getSpacecraftsVisibilitySet_OrbitModels(), 
		   source, 
		   new String[] {
			 "documentation", "*\nThe OrbitModel of the Spacecraft(s) to use for visibility calculation.",
			 "children", "true",
			 "notify", "true",
			 "property", "Editable"
		   });	
		addAnnotation
		  (getSpacecraftsVisibilitySet_GroundStations(), 
		   source, 
		   new String[] {
			 "documentation", "*\nThe ground station (s) for which to display Spacecraft visibility status.",
			 "children", "true",
			 "notify", "true",
			 "property", "Editable"
		   });	
		addAnnotation
		  (getSpacecraftsVisibilitySet_Passes(), 
		   source, 
		   new String[] {
			 "children", "true",
			 "notify", "true",
			 "property", "Readonly"
		   });	
		addAnnotation
		  (getSpacecraftsVisibilitySet_GroundStationToVisibilityMap(), 
		   source, 
		   new String[] {
			 "documentation", "*\nA map that contains the GroundStation to VisibilityPass relationships.",
			 "children", "false",
			 "notify", "true",
			 "property", "None"
		   });	
		addAnnotation
		  (getCorridor_Points(), 
		   source, 
		   new String[] {
			 "children", "true",
			 "notify", "true",
			 "property", "Readonly"
		   });	
		addAnnotation
		  (getSpacecraftSwathCorridor_StartTime(), 
		   source, 
		   new String[] {
			 "documentation", "The start time of prediction period.",
			 "notify", "true",
			 "property", "Editable",
			 "propertyCategory", "TIME_PERIOD"
		   });	
		addAnnotation
		  (getSpacecraftSwathCorridor_EndTime(), 
		   source, 
		   new String[] {
			 "documentation", "The end time of the prediction period.",
			 "notify", "true",
			 "property", "Editable",
			 "propertyCategory", "TIME_PERIOD"
		   });	
		addAnnotation
		  (getSpacecraftSwathCorridor_TimeInterval(), 
		   source, 
		   new String[] {
			 "notify", "true",
			 "property", "Editable",
			 "propertyCategory", "TIME_PERIOD",
			 "csa_unit", "s"
		   });	
		addAnnotation
		  (getSpacecraftSwathCorridor_OrbitModel(), 
		   source, 
		   new String[] {
			 "documentation", "The OrbitModel to use to predict the corridor.",
			 "propertyCategory", "ORBIT_MODEL"
		   });	
		addAnnotation
		  (getSpacecraftSwathCorridor_LeftSwathAngle(), 
		   source, 
		   new String[] {
			 "notify", "true",
			 "property", "Editable",
			 "propertyCategory", "SWATH",
			 "csa_units", "rad"
		   });	
		addAnnotation
		  (getSpacecraftSwathCorridor_RightSwathAngle(), 
		   source, 
		   new String[] {
			 "notify", "true",
			 "property", "Editable",
			 "propertyCategory", "SWATH",
			 "csa_units", "rad"
		   });	
		addAnnotation
		  (getSpacecraftSwathCorridor_Corridor(), 
		   source, 
		   new String[] {
			 "documentation", "*\nThe corridor."
		   });	
		addAnnotation
		  (getEarthOrbitFacade__GetMu(), 
		   source, 
		   new String[] {
			 "documentation", "*\nReturns the Earth gravitational constant from GRIM5C1 model: 3.986004415e14 m\u00b3/s\u00b2.",
			 "csa_unit", "m\u00b3/s\u00b2"
		   });	
		addAnnotation
		  (getEarthOrbitFacade__CreateAbsoluteDate__Date(), 
		   source, 
		   new String[] {
			 "documentation", "*\nCreates an AbsoluteDate from a Date.\n@param date A date.\n@return The AbsoluteDate (OreKit type) for the specified date."
		   });	
		addAnnotation
		  (getEarthOrbitFacade__CreateDate__AbsoluteDate(), 
		   source, 
		   new String[] {
			 "documentation", "Creates an Date from a AbsoluteDate."
		   });	
		addAnnotation
		  (getEarthOrbitFacade__CreateEarthSurfaceLocation__String_String_double_double_double(), 
		   source, 
		   new String[] {
			 "documentation", "*\nCreates an EarthSurfaceLocation from parameters.\n@param name The name of the location.\n@param description The description of the location.\n@param longitude The longitude of the location, in radians.\n@param latitude The latitude of the location, in radians.\n@param elevation The elevation of the location, in meters.\n@return The EarthSurfaceLocation."
		   });	
		addAnnotation
		  ((getEarthOrbitFacade__CreateEarthSurfaceLocation__String_String_double_double_double()).getEParameters().get(2), 
		   source, 
		   new String[] {
			 "csa_unit", "rad"
		   });	
		addAnnotation
		  ((getEarthOrbitFacade__CreateEarthSurfaceLocation__String_String_double_double_double()).getEParameters().get(3), 
		   source, 
		   new String[] {
			 "csa_unit", "rad"
		   });	
		addAnnotation
		  ((getEarthOrbitFacade__CreateEarthSurfaceLocation__String_String_double_double_double()).getEParameters().get(4), 
		   source, 
		   new String[] {
			 "csa_unit", "m"
		   });	
		addAnnotation
		  (getEarthOrbitFacade__CreateOreKitBackedFrame__Frame(), 
		   source, 
		   new String[] {
			 "documentation", "*\nCreate an OreKitBackedFrame based on an OreKit frame."
		   });	
		addAnnotation
		  (getEarthOrbitFacade__GetSpacecraftEarthSubPoint__OreKitBackedSpacecraftState(), 
		   source, 
		   new String[] {
			 "documentation", "Returns the geographic sub-point for a given spacecraft state."
		   });	
		addAnnotation
		  (getEarthOrbitFacade__GetSpacecraftElevationAngle__SpacecraftState_EarthSurfaceLocation(), 
		   source, 
		   new String[] {
			 "documentation", "Returns the elevation angle of a spacecraft relative to a Earth surface location.",
			 "csa_unit", "rad"
		   });	
		addAnnotation
		  (getEarthOrbitFacade__GetSpacecraftAzimuthAngle__SpacecraftState_EarthSurfaceLocation(), 
		   source, 
		   new String[] {
			 "documentation", "Returns the azimuth angle (relative to North) of a spacecraft at a Earth surface location.",
			 "csa_unit", "rad"
		   });	
		addAnnotation
		  (getEarthOrbitFacade__GetRange__SpacecraftState_EarthSurfaceLocation(), 
		   source, 
		   new String[] {
			 "documentation", "Returns the distance between spacecraft and a specified target.",
			 "csa_unit", "m"
		   });	
		addAnnotation
		  (getEarthOrbitFacade__CreateKeplerianOrbit__EarthOrbitPropagator(), 
		   source, 
		   new String[] {
			 "documentation", "*\nCreates a Keplerian Orbit based on a EarthOrbitPropagator.\n@param earthOrbitPropagator The EarthOrbitPropagator.\n@return A KeplerianEarthOrbit representing the initial orbit of the propagator."
		   });	
		addAnnotation
		  (getEarthOrbitFacade__CreateCartesianEarthOrbit__EarthOrbitPropagator(), 
		   source, 
		   new String[] {
			 "documentation", "*\nCreates a CartesianEarthOrbit Orbit based on a EarthOrbitPropagator.\n@param earthOrbitPropagator The EarthOrbitPropagator.\n@return A CartesianEarthOrbit representing the initial orbit of the propagator."
		   });	
		addAnnotation
		  (getEarthOrbitFacade__CreateKeplerianOrbit__KeplerianOrbit(), 
		   source, 
		   new String[] {
			 "documentation", "*\nCreates a KeplerianEarthOrbit from an OreKit KeplerianOrbit.\n@param oreKitKeplerianOrbit The OreKit Keplerian Orbit.\n@return the associated KeplerianEarthOrbit."
		   });	
		addAnnotation
		  (getEarthOrbitFacade__CreateCartesianEarthOrbit__CartesianOrbit(), 
		   source, 
		   new String[] {
			 "documentation", "*\nCreates a CartesianEarthOrbit from an OreKit CartesianOrbit.\n@param oreKitKeplerianOrbit The OreKit Cartesian Orbit.\n@return the associated CartesianEarthOrbit."
		   });	
		addAnnotation
		  (getEarthOrbitFacade__ConvertToGeographicCoordinates__OreKitBackedSpacecraftState(), 
		   source, 
		   new String[] {
			 "documentation", "*\nConverts an OreKit SpacecraftState to GeographicCoordinates. The conversion uses the IERS_2010 frame with a WGS84 equatorial radius and earth flatenning.\n@param oreKitBackedSpacecraftState The OreKit SpacecraftState.\n@return the associated GeographicCoordinates."
		   });	
		addAnnotation
		  (getEarthOrbitFacade__GetVisibilityPassSortedByStartDate__List(), 
		   source, 
		   new String[] {
			 "documentation", "*\nSorts a list of VisibilityPass by increasing date order (form earlier to later). If two or more VisibilityPass\nhave the same start date, they are ordered by duration.\n@param passes The list of VisibilityPass.\n@return the SortedSet of VisibilityPass."
		   });	
		addAnnotation
		  (getEarthOrbitFacade__GetVisibilityPassSortedByDuration__List(), 
		   source, 
		   new String[] {
			 "documentation", "*\nSorts a list of VisibilityPass by increasing duration. If two or more VisibilityPass\nhave the same duration, they are ordered by start date.\n@param passes The list of VisibilityPass.\n@return the SortedSet of VisibilityPass."
		   });	
		addAnnotation
		  (getEarthOrbitFacade__GetVisibilityPassSpacecraftPositionSortedByElevation__List(), 
		   source, 
		   new String[] {
			 "documentation", "*\nSorts a list of VisibilityPassSpacecraftPosition by increasing elevation.\n@param passes The list of VisibilityPassSpacecraftPosition.\n@return the SortedSet of VisibilityPassSpacecraftPosition."
		   });	
		addAnnotation
		  (getEarthOrbitFacade__GetVisibilityPassSpacecraftPositionSortedBySpacecraftCrossTrackAngle__List(), 
		   source, 
		   new String[] {
			 "documentation", "*\nSorts a list of VisibilityPassSpacecraftPosition by increasing spacecraft cross-track angle.\n@param passes The list of VisibilityPassSpacecraftPosition.\n@return the SortedSet of VisibilityPassSpacecraftPosition."
		   });	
		addAnnotation
		  (getEarthOrbitFacade__LoadTLE__String(), 
		   source, 
		   new String[] {
			 "documentation", "*\nLoads a TLE from a URL.\n@param url The URL as a String.\n@return The loaded TLE"
		   });	
		addAnnotation
		  (getEarthOrbitFacade__CreateTLEEarthOrbitPropagator__TLE(), 
		   source, 
		   new String[] {
			 "documentation", "*\nCreate a TLEEarthOrbitPropagator using a TLE.\n@param tle The Two-Line Element defining the propagator.\n@return The TLEEarthOrbitPropagator."
		   });
	}

} //SymphonyEarthOrbitEnvironmentPackageImpl
