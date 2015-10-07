/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.orbit.earth.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.symphony.core.AbstractWorksite;
import org.eclipse.symphony.core.Updatable;
import org.eclipse.symphony.core.environment.Sky;
import org.eclipse.symphony.core.environment.Worksite;
import org.eclipse.symphony.core.environment.orbit.AbstractFrame;
import org.eclipse.symphony.core.environment.orbit.AbstractOrbitPropagator;
import org.eclipse.symphony.core.environment.orbit.AttitudeProvider;
import org.eclipse.symphony.core.environment.orbit.Orbit;
import org.eclipse.symphony.core.environment.orbit.OrbitWorksite;
import org.eclipse.symphony.core.environment.orbit.SpacecraftState;
import org.eclipse.symphony.core.environment.orbit.earth.*;

import ca.gc.asc_csa.eclipse.emf.ecore.Described;
import ca.gc.asc_csa.eclipse.emf.ecore.Named;
import ca.gc.asc_csa.eclipse.emf.ecore.Timed;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.symphony.core.environment.orbit.earth.SymphonyEarthOrbitEnvironmentPackage
 * @generated
 */
public class SymphonyEarthOrbitEnvironmentAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SymphonyEarthOrbitEnvironmentPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymphonyEarthOrbitEnvironmentAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SymphonyEarthOrbitEnvironmentPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SymphonyEarthOrbitEnvironmentSwitch<Adapter> modelSwitch =
		new SymphonyEarthOrbitEnvironmentSwitch<Adapter>() {
			@Override
			public Adapter caseOreKitBackedSpacecraftState(OreKitBackedSpacecraftState object) {
				return createOreKitBackedSpacecraftStateAdapter();
			}
			@Override
			public Adapter caseOreKitBackedFrame(OreKitBackedFrame object) {
				return createOreKitBackedFrameAdapter();
			}
			@Override
			public Adapter caseOreKitBackedAttitudeProvider(OreKitBackedAttitudeProvider object) {
				return createOreKitBackedAttitudeProviderAdapter();
			}
			@Override
			public Adapter caseNadirPointingAttitudeProvider(NadirPointingAttitudeProvider object) {
				return createNadirPointingAttitudeProviderAdapter();
			}
			@Override
			public Adapter caseEarthOrbitWorksite(EarthOrbitWorksite object) {
				return createEarthOrbitWorksiteAdapter();
			}
			@Override
			public Adapter caseEarthOrbitSky(EarthOrbitSky object) {
				return createEarthOrbitSkyAdapter();
			}
			@Override
			public Adapter caseEarthOrbit(EarthOrbit object) {
				return createEarthOrbitAdapter();
			}
			@Override
			public Adapter caseKeplerianEarthOrbit(KeplerianEarthOrbit object) {
				return createKeplerianEarthOrbitAdapter();
			}
			@Override
			public Adapter caseCartesianEarthOrbit(CartesianEarthOrbit object) {
				return createCartesianEarthOrbitAdapter();
			}
			@Override
			public Adapter caseElevationMask(ElevationMask object) {
				return createElevationMaskAdapter();
			}
			@Override
			public Adapter caseConstantElevationMask(ConstantElevationMask object) {
				return createConstantElevationMaskAdapter();
			}
			@Override
			public Adapter caseEarthOrbitPropagator(EarthOrbitPropagator object) {
				return createEarthOrbitPropagatorAdapter();
			}
			@Override
			public Adapter caseKeplerianEarthOrbitPropagator(KeplerianEarthOrbitPropagator object) {
				return createKeplerianEarthOrbitPropagatorAdapter();
			}
			@Override
			public Adapter caseTLEEarthOrbitPropagator(TLEEarthOrbitPropagator object) {
				return createTLEEarthOrbitPropagatorAdapter();
			}
			@Override
			public Adapter caseURLBasedTLEEarthOrbitPropagator(URLBasedTLEEarthOrbitPropagator object) {
				return createURLBasedTLEEarthOrbitPropagatorAdapter();
			}
			@Override
			public Adapter caseTLE(TLE object) {
				return createTLEAdapter();
			}
			@Override
			public Adapter caseEarthSurfaceLocation(EarthSurfaceLocation object) {
				return createEarthSurfaceLocationAdapter();
			}
			@Override
			public Adapter caseEarthSurfaceLocationList(EarthSurfaceLocationList object) {
				return createEarthSurfaceLocationListAdapter();
			}
			@Override
			public Adapter caseGroundStation(GroundStation object) {
				return createGroundStationAdapter();
			}
			@Override
			public Adapter caseGroundStationList(GroundStationList object) {
				return createGroundStationListAdapter();
			}
			@Override
			public Adapter caseVisibilityPass(VisibilityPass object) {
				return createVisibilityPassAdapter();
			}
			@Override
			public Adapter caseVisibilityPassSpacecraftPositionHistory(VisibilityPassSpacecraftPositionHistory object) {
				return createVisibilityPassSpacecraftPositionHistoryAdapter();
			}
			@Override
			public Adapter caseVisibilityPassSpacecraftPosition(VisibilityPassSpacecraftPosition object) {
				return createVisibilityPassSpacecraftPositionAdapter();
			}
			@Override
			public Adapter caseSpacecraftsVisibilitySet(SpacecraftsVisibilitySet object) {
				return createSpacecraftsVisibilitySetAdapter();
			}
			@Override
			public Adapter caseCorridorPoint(CorridorPoint object) {
				return createCorridorPointAdapter();
			}
			@Override
			public Adapter caseCorridor(Corridor object) {
				return createCorridorAdapter();
			}
			@Override
			public Adapter caseSpacecraftSwathCorridor(SpacecraftSwathCorridor object) {
				return createSpacecraftSwathCorridorAdapter();
			}
			@Override
			public Adapter caseEarthOrbitFacade(EarthOrbitFacade object) {
				return createEarthOrbitFacadeAdapter();
			}
			@Override
			public Adapter caseTimed(Timed object) {
				return createTimedAdapter();
			}
			@Override
			public Adapter caseSpacecraftState(SpacecraftState object) {
				return createSpacecraftStateAdapter();
			}
			@Override
			public Adapter caseNamed(Named object) {
				return createNamedAdapter();
			}
			@Override
			public Adapter caseDescribed(Described object) {
				return createDescribedAdapter();
			}
			@Override
			public Adapter caseAbstractFrame(AbstractFrame object) {
				return createAbstractFrameAdapter();
			}
			@Override
			public Adapter caseAttitudeProvider(AttitudeProvider object) {
				return createAttitudeProviderAdapter();
			}
			@Override
			public Adapter caseAbstractWorksite(AbstractWorksite object) {
				return createAbstractWorksiteAdapter();
			}
			@Override
			public Adapter caseWorksite(Worksite object) {
				return createWorksiteAdapter();
			}
			@Override
			public Adapter caseOrbitWorksite(OrbitWorksite object) {
				return createOrbitWorksiteAdapter();
			}
			@Override
			public Adapter caseSky(Sky object) {
				return createSkyAdapter();
			}
			@Override
			public Adapter caseOrbit(Orbit object) {
				return createOrbitAdapter();
			}
			@Override
			public Adapter caseAbstractOrbitPropagator(AbstractOrbitPropagator object) {
				return createAbstractOrbitPropagatorAdapter();
			}
			@Override
			public Adapter caseUpdatable(Updatable object) {
				return createUpdatableAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.core.environment.orbit.earth.OreKitBackedSpacecraftState <em>Ore Kit Backed Spacecraft State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.core.environment.orbit.earth.OreKitBackedSpacecraftState
	 * @generated
	 */
	public Adapter createOreKitBackedSpacecraftStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.core.environment.orbit.earth.OreKitBackedFrame <em>Ore Kit Backed Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.core.environment.orbit.earth.OreKitBackedFrame
	 * @generated
	 */
	public Adapter createOreKitBackedFrameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.core.environment.orbit.earth.OreKitBackedAttitudeProvider <em>Ore Kit Backed Attitude Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.core.environment.orbit.earth.OreKitBackedAttitudeProvider
	 * @generated
	 */
	public Adapter createOreKitBackedAttitudeProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.core.environment.orbit.earth.NadirPointingAttitudeProvider <em>Nadir Pointing Attitude Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.core.environment.orbit.earth.NadirPointingAttitudeProvider
	 * @generated
	 */
	public Adapter createNadirPointingAttitudeProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.core.environment.orbit.earth.EarthOrbitWorksite <em>Earth Orbit Worksite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.core.environment.orbit.earth.EarthOrbitWorksite
	 * @generated
	 */
	public Adapter createEarthOrbitWorksiteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.core.environment.orbit.earth.EarthOrbitSky <em>Earth Orbit Sky</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.core.environment.orbit.earth.EarthOrbitSky
	 * @generated
	 */
	public Adapter createEarthOrbitSkyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.core.environment.orbit.earth.EarthOrbit <em>Earth Orbit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.core.environment.orbit.earth.EarthOrbit
	 * @generated
	 */
	public Adapter createEarthOrbitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.core.environment.orbit.earth.KeplerianEarthOrbit <em>Keplerian Earth Orbit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.core.environment.orbit.earth.KeplerianEarthOrbit
	 * @generated
	 */
	public Adapter createKeplerianEarthOrbitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.core.environment.orbit.earth.CartesianEarthOrbit <em>Cartesian Earth Orbit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.core.environment.orbit.earth.CartesianEarthOrbit
	 * @generated
	 */
	public Adapter createCartesianEarthOrbitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.core.environment.orbit.earth.ElevationMask <em>Elevation Mask</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.core.environment.orbit.earth.ElevationMask
	 * @generated
	 */
	public Adapter createElevationMaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.core.environment.orbit.earth.ConstantElevationMask <em>Constant Elevation Mask</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.core.environment.orbit.earth.ConstantElevationMask
	 * @generated
	 */
	public Adapter createConstantElevationMaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.core.environment.orbit.earth.EarthOrbitPropagator <em>Earth Orbit Propagator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.core.environment.orbit.earth.EarthOrbitPropagator
	 * @generated
	 */
	public Adapter createEarthOrbitPropagatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.core.environment.orbit.earth.KeplerianEarthOrbitPropagator <em>Keplerian Earth Orbit Propagator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.core.environment.orbit.earth.KeplerianEarthOrbitPropagator
	 * @generated
	 */
	public Adapter createKeplerianEarthOrbitPropagatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.core.environment.orbit.earth.TLEEarthOrbitPropagator <em>TLE Earth Orbit Propagator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.core.environment.orbit.earth.TLEEarthOrbitPropagator
	 * @generated
	 */
	public Adapter createTLEEarthOrbitPropagatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.core.environment.orbit.earth.URLBasedTLEEarthOrbitPropagator <em>URL Based TLE Earth Orbit Propagator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.core.environment.orbit.earth.URLBasedTLEEarthOrbitPropagator
	 * @generated
	 */
	public Adapter createURLBasedTLEEarthOrbitPropagatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.core.environment.orbit.earth.TLE <em>TLE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.core.environment.orbit.earth.TLE
	 * @generated
	 */
	public Adapter createTLEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.core.environment.orbit.earth.EarthSurfaceLocation <em>Earth Surface Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.core.environment.orbit.earth.EarthSurfaceLocation
	 * @generated
	 */
	public Adapter createEarthSurfaceLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.core.environment.orbit.earth.EarthSurfaceLocationList <em>Earth Surface Location List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.core.environment.orbit.earth.EarthSurfaceLocationList
	 * @generated
	 */
	public Adapter createEarthSurfaceLocationListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.core.environment.orbit.earth.GroundStation <em>Ground Station</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.core.environment.orbit.earth.GroundStation
	 * @generated
	 */
	public Adapter createGroundStationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.core.environment.orbit.earth.GroundStationList <em>Ground Station List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.core.environment.orbit.earth.GroundStationList
	 * @generated
	 */
	public Adapter createGroundStationListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.core.environment.orbit.earth.VisibilityPass <em>Visibility Pass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.core.environment.orbit.earth.VisibilityPass
	 * @generated
	 */
	public Adapter createVisibilityPassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.core.environment.orbit.earth.VisibilityPassSpacecraftPositionHistory <em>Visibility Pass Spacecraft Position History</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.core.environment.orbit.earth.VisibilityPassSpacecraftPositionHistory
	 * @generated
	 */
	public Adapter createVisibilityPassSpacecraftPositionHistoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.core.environment.orbit.earth.VisibilityPassSpacecraftPosition <em>Visibility Pass Spacecraft Position</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.core.environment.orbit.earth.VisibilityPassSpacecraftPosition
	 * @generated
	 */
	public Adapter createVisibilityPassSpacecraftPositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.core.environment.orbit.earth.SpacecraftsVisibilitySet <em>Spacecrafts Visibility Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.core.environment.orbit.earth.SpacecraftsVisibilitySet
	 * @generated
	 */
	public Adapter createSpacecraftsVisibilitySetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.core.environment.orbit.earth.CorridorPoint <em>Corridor Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.core.environment.orbit.earth.CorridorPoint
	 * @generated
	 */
	public Adapter createCorridorPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.core.environment.orbit.earth.Corridor <em>Corridor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.core.environment.orbit.earth.Corridor
	 * @generated
	 */
	public Adapter createCorridorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.core.environment.orbit.earth.SpacecraftSwathCorridor <em>Spacecraft Swath Corridor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.core.environment.orbit.earth.SpacecraftSwathCorridor
	 * @generated
	 */
	public Adapter createSpacecraftSwathCorridorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.core.environment.orbit.earth.EarthOrbitFacade <em>Earth Orbit Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.core.environment.orbit.earth.EarthOrbitFacade
	 * @generated
	 */
	public Adapter createEarthOrbitFacadeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.emf.ecore.Named <em>Named</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.Named
	 * @generated
	 */
	public Adapter createNamedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.emf.ecore.Described <em>Described</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.Described
	 * @generated
	 */
	public Adapter createDescribedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.core.environment.orbit.AbstractFrame <em>Abstract Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.core.environment.orbit.AbstractFrame
	 * @generated
	 */
	public Adapter createAbstractFrameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.core.environment.orbit.AttitudeProvider <em>Attitude Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.core.environment.orbit.AttitudeProvider
	 * @generated
	 */
	public Adapter createAttitudeProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.core.AbstractWorksite <em>Abstract Worksite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.core.AbstractWorksite
	 * @generated
	 */
	public Adapter createAbstractWorksiteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.emf.ecore.Timed <em>Timed</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.Timed
	 * @generated
	 */
	public Adapter createTimedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.core.environment.orbit.SpacecraftState <em>Spacecraft State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.core.environment.orbit.SpacecraftState
	 * @generated
	 */
	public Adapter createSpacecraftStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.core.environment.Worksite <em>Worksite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.core.environment.Worksite
	 * @generated
	 */
	public Adapter createWorksiteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.core.environment.orbit.OrbitWorksite <em>Orbit Worksite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.core.environment.orbit.OrbitWorksite
	 * @generated
	 */
	public Adapter createOrbitWorksiteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.core.environment.Sky <em>Sky</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.core.environment.Sky
	 * @generated
	 */
	public Adapter createSkyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.core.environment.orbit.Orbit <em>Orbit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.core.environment.orbit.Orbit
	 * @generated
	 */
	public Adapter createOrbitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.core.environment.orbit.AbstractOrbitPropagator <em>Abstract Orbit Propagator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.core.environment.orbit.AbstractOrbitPropagator
	 * @generated
	 */
	public Adapter createAbstractOrbitPropagatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.core.Updatable <em>Updatable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.core.Updatable
	 * @generated
	 */
	public Adapter createUpdatableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SymphonyEarthOrbitEnvironmentAdapterFactory
