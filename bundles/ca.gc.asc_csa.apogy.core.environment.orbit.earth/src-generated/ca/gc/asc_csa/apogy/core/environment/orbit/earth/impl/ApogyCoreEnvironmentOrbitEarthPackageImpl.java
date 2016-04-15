package ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl;
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

import java.util.List;
import java.util.Map;
import java.util.SortedSet;

import org.apache.commons.math3.geometry.euclidean.threed.Rotation;
import org.eclipse.core.runtime.IProgressMonitor;
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
import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;
import ca.gc.asc_csa.apogy.common.math.ApogyCommonMathPackage;
import ca.gc.asc_csa.apogy.core.ApogyCorePackage;
import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage;
import ca.gc.asc_csa.apogy.core.environment.orbit.ApogyCoreEnvironmentOrbitPackage;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.AbstractTLE;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.CartesianEarthOrbit;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ConstantElevationMask;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.Corridor;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.CorridorPoint;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbit;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbitModel;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbitPropagator;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbitSky;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbitWorksite;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthSurfaceLocation;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.Eclipse;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.EclipseEvent;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.EclipseEventType;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ElevationMask;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.EphemerisType;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.GroundStation;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.GroundStationList;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.GroundStationReferencesList;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.InitialOrbitBasedEarthOrbitModel;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.KeplerianEarthOrbit;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.KeplerianEarthOrbitPropagator;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.NadirPointingAttitudeProvider;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.OreKitBackedAttitudeProvider;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.OreKitBackedFrame;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.OreKitBackedSpacecraftState;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.SpacecraftSwathCorridor;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.SpacecraftsVisibilitySet;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLEEarthOrbitModel;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFactory;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage;
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
import org.orekit.utils.TimeStampedAngularCoordinates;
import org.orekit.utils.TimeStampedPVCoordinates;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyCoreEnvironmentOrbitEarthPackageImpl extends EPackageImpl implements ApogyCoreEnvironmentOrbitEarthPackage {
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
	private EClass earthOrbitModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialOrbitBasedEarthOrbitModelEClass = null;

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
	private EClass tleEarthOrbitModelEClass = null;

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
	private EClass abstractTLEEClass = null;

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
	private EClass groundStationReferencesListEClass = null;

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
	private EClass apogyCoreEnvironmentOrbitEarthFacadeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eclipseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eclipseEventEClass = null;

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
	private EEnum eclipseEventTypeEEnum = null;

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
	private EDataType iProgressMonitorEDataType = null;

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
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ApogyCoreEnvironmentOrbitEarthPackageImpl() {
		super(eNS_URI, ApogyCoreEnvironmentOrbitEarthFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ApogyCoreEnvironmentOrbitEarthPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ApogyCoreEnvironmentOrbitEarthPackage init() {
		if (isInited) return (ApogyCoreEnvironmentOrbitEarthPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCoreEnvironmentOrbitEarthPackage.eNS_URI);

		// Obtain or create and register package
		ApogyCoreEnvironmentOrbitEarthPackageImpl theApogyCoreEnvironmentOrbitEarthPackage = (ApogyCoreEnvironmentOrbitEarthPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ApogyCoreEnvironmentOrbitEarthPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ApogyCoreEnvironmentOrbitEarthPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ApogyCoreEnvironmentOrbitPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theApogyCoreEnvironmentOrbitEarthPackage.createPackageContents();

		// Initialize created meta-data
		theApogyCoreEnvironmentOrbitEarthPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theApogyCoreEnvironmentOrbitEarthPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ApogyCoreEnvironmentOrbitEarthPackage.eNS_URI, theApogyCoreEnvironmentOrbitEarthPackage);
		return theApogyCoreEnvironmentOrbitEarthPackage;
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
	public EClass getEarthOrbitModel() {
		return earthOrbitModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEarthOrbitModel__GetOreKitPropagator() {
		return earthOrbitModelEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEarthOrbitModel__GetTargetPasses__EarthSurfaceLocation_Date_Date_ElevationMask() {
		return earthOrbitModelEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEarthOrbitModel__GetGroundStationPasses__GroundStation_Date_Date() {
		return earthOrbitModelEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEarthOrbitModel__GetEclipses__Date_Date() {
		return earthOrbitModelEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInitialOrbitBasedEarthOrbitModel() {
		return initialOrbitBasedEarthOrbitModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitialOrbitBasedEarthOrbitModel_InitalOrbit() {
		return (EReference)initialOrbitBasedEarthOrbitModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitialOrbitBasedEarthOrbitModel_Propagator() {
		return (EReference)initialOrbitBasedEarthOrbitModelEClass.getEStructuralFeatures().get(1);
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
	public EReference getEarthOrbit_InitialOrbitBasedEarthOrbitModel() {
		return (EReference)earthOrbitEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getEarthOrbitPropagator_ValidFromDate() {
		return (EAttribute)earthOrbitPropagatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEarthOrbitPropagator_ValidToDate() {
		return (EAttribute)earthOrbitPropagatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEarthOrbitPropagator_InitialOrbitBasedEarthOrbitModel() {
		return (EReference)earthOrbitPropagatorEClass.getEStructuralFeatures().get(2);
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
	public EOperation getEarthOrbitPropagator__Propagate__Date() {
		return earthOrbitPropagatorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEarthOrbitPropagator__GetSpacecraftStates__Date_Date_double() {
		return earthOrbitPropagatorEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEarthOrbitPropagator__GetTargetPasses__EarthSurfaceLocation_Date_Date_ElevationMask() {
		return earthOrbitPropagatorEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEarthOrbitPropagator__GetGroundStationPasses__GroundStation_Date_Date() {
		return earthOrbitPropagatorEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEarthOrbitPropagator__GetEclipses__Date_Date() {
		return earthOrbitPropagatorEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEarthOrbitPropagator__GetInitialOrbit() {
		return earthOrbitPropagatorEClass.getEOperations().get(6);
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
	public EClass getTLEEarthOrbitModel() {
		return tleEarthOrbitModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTLEEarthOrbitModel_Tle() {
		return (EReference)tleEarthOrbitModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTLEEarthOrbitModel_TleValidityPeriod() {
		return (EAttribute)tleEarthOrbitModelEClass.getEStructuralFeatures().get(1);
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
	public EClass getAbstractTLE() {
		return abstractTLEEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractTLE_BStar() {
		return (EAttribute)abstractTLEEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractTLE_Epoch() {
		return (EAttribute)abstractTLEEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractTLE_Eccentricity() {
		return (EAttribute)abstractTLEEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractTLE_ElementNumber() {
		return (EAttribute)abstractTLEEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractTLE_EphemerisType() {
		return (EAttribute)abstractTLEEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractTLE_Inclination() {
		return (EAttribute)abstractTLEEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractTLE_MeanAnomaly() {
		return (EAttribute)abstractTLEEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractTLE_MeanMotion() {
		return (EAttribute)abstractTLEEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractTLE_RevolutionPerDay() {
		return (EAttribute)abstractTLEEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractTLE_MeanMotionFirstDerivative() {
		return (EAttribute)abstractTLEEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractTLE_MeanMotionSecondDerivative() {
		return (EAttribute)abstractTLEEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractTLE_ArgumentOfPerigee() {
		return (EAttribute)abstractTLEEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractTLE_RightAscentionOfAscendingNode() {
		return (EAttribute)abstractTLEEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractTLE_RevolutionNumberAtEpoch() {
		return (EAttribute)abstractTLEEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractTLE_SatelliteNumber() {
		return (EAttribute)abstractTLEEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractTLE__GetOreKitTLE() {
		return abstractTLEEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractTLE__GetLine1() {
		return abstractTLEEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractTLE__GetLine2() {
		return abstractTLEEClass.getEOperations().get(2);
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
	public EAttribute getTLE_FirstLine() {
		return (EAttribute)tleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTLE_SecondLine() {
		return (EAttribute)tleEClass.getEStructuralFeatures().get(1);
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
	public EClass getGroundStationReferencesList() {
		return groundStationReferencesListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroundStationReferencesList_GroundStations() {
		return (EReference)groundStationReferencesListEClass.getEStructuralFeatures().get(0);
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
	public EOperation getVisibilityPassSpacecraftPositionHistory__GetClosestRangePosition() {
		return visibilityPassSpacecraftPositionHistoryEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVisibilityPassSpacecraftPositionHistory__GetHighestElevationPosition() {
		return visibilityPassSpacecraftPositionHistoryEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVisibilityPassSpacecraftPositionHistory__GetSmallestSpacecraftCrossTrackAnglePosition() {
		return visibilityPassSpacecraftPositionHistoryEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVisibilityPassSpacecraftPositionHistory__UpdateHistory() {
		return visibilityPassSpacecraftPositionHistoryEClass.getEOperations().get(3);
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
	public EAttribute getVisibilityPassSpacecraftPosition_SpacecraftAlongTrackAngle() {
		return (EAttribute)visibilityPassSpacecraftPositionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisibilityPassSpacecraftPosition_SpacecraftCoordinates() {
		return (EReference)visibilityPassSpacecraftPositionEClass.getEStructuralFeatures().get(6);
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
	public EClass getApogyCoreEnvironmentOrbitEarthFacade() {
		return apogyCoreEnvironmentOrbitEarthFacadeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreEnvironmentOrbitEarthFacade__GetMu() {
		return apogyCoreEnvironmentOrbitEarthFacadeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreEnvironmentOrbitEarthFacade__CreateAbsoluteDate__Date() {
		return apogyCoreEnvironmentOrbitEarthFacadeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreEnvironmentOrbitEarthFacade__CreateDate__AbsoluteDate() {
		return apogyCoreEnvironmentOrbitEarthFacadeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreEnvironmentOrbitEarthFacade__CreateEarthSurfaceLocation__String_String_double_double_double() {
		return apogyCoreEnvironmentOrbitEarthFacadeEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreEnvironmentOrbitEarthFacade__CreateOreKitBackedFrame__Frame() {
		return apogyCoreEnvironmentOrbitEarthFacadeEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreEnvironmentOrbitEarthFacade__GetSpacecraftEarthSubPoint__OreKitBackedSpacecraftState() {
		return apogyCoreEnvironmentOrbitEarthFacadeEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreEnvironmentOrbitEarthFacade__GetSpacecraftElevationAngle__SpacecraftState_EarthSurfaceLocation() {
		return apogyCoreEnvironmentOrbitEarthFacadeEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreEnvironmentOrbitEarthFacade__GetSpacecraftAzimuthAngle__SpacecraftState_EarthSurfaceLocation() {
		return apogyCoreEnvironmentOrbitEarthFacadeEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreEnvironmentOrbitEarthFacade__GetRange__SpacecraftState_EarthSurfaceLocation() {
		return apogyCoreEnvironmentOrbitEarthFacadeEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreEnvironmentOrbitEarthFacade__CreateSpacecraftState__Orbit_SpacecraftState() {
		return apogyCoreEnvironmentOrbitEarthFacadeEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreEnvironmentOrbitEarthFacade__CreateOreKitBackedSpacecraftState__Orbit_SpacecraftState() {
		return apogyCoreEnvironmentOrbitEarthFacadeEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreEnvironmentOrbitEarthFacade__CreateTimedStampedPVACoordinates__TimeStampedPVCoordinates() {
		return apogyCoreEnvironmentOrbitEarthFacadeEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreEnvironmentOrbitEarthFacade__CreateTimedStampedAngularCoordinates__TimeStampedAngularCoordinates() {
		return apogyCoreEnvironmentOrbitEarthFacadeEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreEnvironmentOrbitEarthFacade__CreateMatrix3x3__Rotation() {
		return apogyCoreEnvironmentOrbitEarthFacadeEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreEnvironmentOrbitEarthFacade__CreateRotation__Matrix3x3() {
		return apogyCoreEnvironmentOrbitEarthFacadeEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreEnvironmentOrbitEarthFacade__CreateKeplerianOrbit__EarthOrbitPropagator() {
		return apogyCoreEnvironmentOrbitEarthFacadeEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreEnvironmentOrbitEarthFacade__CreateCartesianEarthOrbit__EarthOrbitPropagator() {
		return apogyCoreEnvironmentOrbitEarthFacadeEClass.getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreEnvironmentOrbitEarthFacade__CreateKeplerianOrbit__KeplerianOrbit() {
		return apogyCoreEnvironmentOrbitEarthFacadeEClass.getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreEnvironmentOrbitEarthFacade__CreateCartesianEarthOrbit__CartesianOrbit() {
		return apogyCoreEnvironmentOrbitEarthFacadeEClass.getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreEnvironmentOrbitEarthFacade__ConvertToGeographicCoordinates__OreKitBackedSpacecraftState() {
		return apogyCoreEnvironmentOrbitEarthFacadeEClass.getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreEnvironmentOrbitEarthFacade__GetSpacecraftStates__Propagator_Date_Date_double() {
		return apogyCoreEnvironmentOrbitEarthFacadeEClass.getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreEnvironmentOrbitEarthFacade__GetTargetPasses__EarthOrbitModel_EarthSurfaceLocation_Date_Date_ElevationMask() {
		return apogyCoreEnvironmentOrbitEarthFacadeEClass.getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreEnvironmentOrbitEarthFacade__GetTargetPasses__EarthOrbitModel_List_Date_Date_ElevationMask_IProgressMonitor() {
		return apogyCoreEnvironmentOrbitEarthFacadeEClass.getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreEnvironmentOrbitEarthFacade__GetGroundStationPasses__EarthOrbitModel_GroundStation_Date_Date() {
		return apogyCoreEnvironmentOrbitEarthFacadeEClass.getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreEnvironmentOrbitEarthFacade__GetGroundStationPasses__EarthOrbitModel_List_Date_Date_IProgressMonitor() {
		return apogyCoreEnvironmentOrbitEarthFacadeEClass.getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreEnvironmentOrbitEarthFacade__GetEclipses__EarthOrbitModel_Date_Date() {
		return apogyCoreEnvironmentOrbitEarthFacadeEClass.getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreEnvironmentOrbitEarthFacade__GetVisibilityPassSortedByStartDate__List() {
		return apogyCoreEnvironmentOrbitEarthFacadeEClass.getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreEnvironmentOrbitEarthFacade__GetVisibilityPassSortedByDuration__List() {
		return apogyCoreEnvironmentOrbitEarthFacadeEClass.getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreEnvironmentOrbitEarthFacade__GetVisibilityPassSpacecraftPositionSortedByElevation__List() {
		return apogyCoreEnvironmentOrbitEarthFacadeEClass.getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreEnvironmentOrbitEarthFacade__GetVisibilityPassSpacecraftPositionSortedBySpacecraftCrossTrackAngle__List() {
		return apogyCoreEnvironmentOrbitEarthFacadeEClass.getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreEnvironmentOrbitEarthFacade__LoadTLE__String() {
		return apogyCoreEnvironmentOrbitEarthFacadeEClass.getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreEnvironmentOrbitEarthFacade__ExportTLE__TLE_String() {
		return apogyCoreEnvironmentOrbitEarthFacadeEClass.getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreEnvironmentOrbitEarthFacade__CreateTLEEarthOrbitModel__TLE() {
		return apogyCoreEnvironmentOrbitEarthFacadeEClass.getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreEnvironmentOrbitEarthFacade__ExportAsCSV__VisibilityPassSpacecraftPositionHistory_boolean() {
		return apogyCoreEnvironmentOrbitEarthFacadeEClass.getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEclipse() {
		return eclipseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEclipse_PenumbraEntry() {
		return (EReference)eclipseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEclipse_UmbraEntry() {
		return (EReference)eclipseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEclipse_UmbraExit() {
		return (EReference)eclipseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEclipse_PenumbraExit() {
		return (EReference)eclipseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEclipseEvent() {
		return eclipseEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEclipseEvent_Type() {
		return (EAttribute)eclipseEventEClass.getEStructuralFeatures().get(0);
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
	public EEnum getEclipseEventType() {
		return eclipseEventTypeEEnum;
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
	public EDataType getIProgressMonitor() {
		return iProgressMonitorEDataType;
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
	public ApogyCoreEnvironmentOrbitEarthFactory getApogyCoreEnvironmentOrbitEarthFactory() {
		return (ApogyCoreEnvironmentOrbitEarthFactory)getEFactoryInstance();
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

		earthOrbitSkyEClass = createEClass(EARTH_ORBIT_SKY);
		createEReference(earthOrbitSkyEClass, EARTH_ORBIT_SKY__EARTH_ORBIT_WORKSITE);
		createEReference(earthOrbitSkyEClass, EARTH_ORBIT_SKY__MOON);
		createEReference(earthOrbitSkyEClass, EARTH_ORBIT_SKY__EARTH);
		createEOperation(earthOrbitSkyEClass, EARTH_ORBIT_SKY___GET_MOON_ANGULAR_DIAMETER);
		createEOperation(earthOrbitSkyEClass, EARTH_ORBIT_SKY___GET_EARTH_ANGULAR_DIAMETER);

		earthOrbitModelEClass = createEClass(EARTH_ORBIT_MODEL);
		createEOperation(earthOrbitModelEClass, EARTH_ORBIT_MODEL___GET_ORE_KIT_PROPAGATOR);
		createEOperation(earthOrbitModelEClass, EARTH_ORBIT_MODEL___GET_TARGET_PASSES__EARTHSURFACELOCATION_DATE_DATE_ELEVATIONMASK);
		createEOperation(earthOrbitModelEClass, EARTH_ORBIT_MODEL___GET_GROUND_STATION_PASSES__GROUNDSTATION_DATE_DATE);
		createEOperation(earthOrbitModelEClass, EARTH_ORBIT_MODEL___GET_ECLIPSES__DATE_DATE);

		initialOrbitBasedEarthOrbitModelEClass = createEClass(INITIAL_ORBIT_BASED_EARTH_ORBIT_MODEL);
		createEReference(initialOrbitBasedEarthOrbitModelEClass, INITIAL_ORBIT_BASED_EARTH_ORBIT_MODEL__INITAL_ORBIT);
		createEReference(initialOrbitBasedEarthOrbitModelEClass, INITIAL_ORBIT_BASED_EARTH_ORBIT_MODEL__PROPAGATOR);

		earthOrbitEClass = createEClass(EARTH_ORBIT);
		createEReference(earthOrbitEClass, EARTH_ORBIT__INITIAL_ORBIT_BASED_EARTH_ORBIT_MODEL);
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
		createEAttribute(earthOrbitPropagatorEClass, EARTH_ORBIT_PROPAGATOR__VALID_FROM_DATE);
		createEAttribute(earthOrbitPropagatorEClass, EARTH_ORBIT_PROPAGATOR__VALID_TO_DATE);
		createEReference(earthOrbitPropagatorEClass, EARTH_ORBIT_PROPAGATOR__INITIAL_ORBIT_BASED_EARTH_ORBIT_MODEL);
		createEOperation(earthOrbitPropagatorEClass, EARTH_ORBIT_PROPAGATOR___GET_ORE_KIT_PROPAGATOR);
		createEOperation(earthOrbitPropagatorEClass, EARTH_ORBIT_PROPAGATOR___PROPAGATE__DATE);
		createEOperation(earthOrbitPropagatorEClass, EARTH_ORBIT_PROPAGATOR___GET_SPACECRAFT_STATES__DATE_DATE_DOUBLE);
		createEOperation(earthOrbitPropagatorEClass, EARTH_ORBIT_PROPAGATOR___GET_TARGET_PASSES__EARTHSURFACELOCATION_DATE_DATE_ELEVATIONMASK);
		createEOperation(earthOrbitPropagatorEClass, EARTH_ORBIT_PROPAGATOR___GET_GROUND_STATION_PASSES__GROUNDSTATION_DATE_DATE);
		createEOperation(earthOrbitPropagatorEClass, EARTH_ORBIT_PROPAGATOR___GET_ECLIPSES__DATE_DATE);
		createEOperation(earthOrbitPropagatorEClass, EARTH_ORBIT_PROPAGATOR___GET_INITIAL_ORBIT);

		keplerianEarthOrbitPropagatorEClass = createEClass(KEPLERIAN_EARTH_ORBIT_PROPAGATOR);
		createEOperation(keplerianEarthOrbitPropagatorEClass, KEPLERIAN_EARTH_ORBIT_PROPAGATOR___GET_ORE_KIT_KEPLERIAN_PROPAGATOR);

		tleEarthOrbitModelEClass = createEClass(TLE_EARTH_ORBIT_MODEL);
		createEReference(tleEarthOrbitModelEClass, TLE_EARTH_ORBIT_MODEL__TLE);
		createEAttribute(tleEarthOrbitModelEClass, TLE_EARTH_ORBIT_MODEL__TLE_VALIDITY_PERIOD);

		urlBasedTLEEarthOrbitPropagatorEClass = createEClass(URL_BASED_TLE_EARTH_ORBIT_PROPAGATOR);
		createEAttribute(urlBasedTLEEarthOrbitPropagatorEClass, URL_BASED_TLE_EARTH_ORBIT_PROPAGATOR__TLE_URL);

		abstractTLEEClass = createEClass(ABSTRACT_TLE);
		createEAttribute(abstractTLEEClass, ABSTRACT_TLE__BSTAR);
		createEAttribute(abstractTLEEClass, ABSTRACT_TLE__EPOCH);
		createEAttribute(abstractTLEEClass, ABSTRACT_TLE__ECCENTRICITY);
		createEAttribute(abstractTLEEClass, ABSTRACT_TLE__ELEMENT_NUMBER);
		createEAttribute(abstractTLEEClass, ABSTRACT_TLE__EPHEMERIS_TYPE);
		createEAttribute(abstractTLEEClass, ABSTRACT_TLE__INCLINATION);
		createEAttribute(abstractTLEEClass, ABSTRACT_TLE__MEAN_ANOMALY);
		createEAttribute(abstractTLEEClass, ABSTRACT_TLE__MEAN_MOTION);
		createEAttribute(abstractTLEEClass, ABSTRACT_TLE__REVOLUTION_PER_DAY);
		createEAttribute(abstractTLEEClass, ABSTRACT_TLE__MEAN_MOTION_FIRST_DERIVATIVE);
		createEAttribute(abstractTLEEClass, ABSTRACT_TLE__MEAN_MOTION_SECOND_DERIVATIVE);
		createEAttribute(abstractTLEEClass, ABSTRACT_TLE__ARGUMENT_OF_PERIGEE);
		createEAttribute(abstractTLEEClass, ABSTRACT_TLE__RIGHT_ASCENTION_OF_ASCENDING_NODE);
		createEAttribute(abstractTLEEClass, ABSTRACT_TLE__REVOLUTION_NUMBER_AT_EPOCH);
		createEAttribute(abstractTLEEClass, ABSTRACT_TLE__SATELLITE_NUMBER);
		createEOperation(abstractTLEEClass, ABSTRACT_TLE___GET_ORE_KIT_TLE);
		createEOperation(abstractTLEEClass, ABSTRACT_TLE___GET_LINE1);
		createEOperation(abstractTLEEClass, ABSTRACT_TLE___GET_LINE2);

		tleEClass = createEClass(TLE);
		createEAttribute(tleEClass, TLE__FIRST_LINE);
		createEAttribute(tleEClass, TLE__SECOND_LINE);

		earthSurfaceLocationEClass = createEClass(EARTH_SURFACE_LOCATION);

		groundStationReferencesListEClass = createEClass(GROUND_STATION_REFERENCES_LIST);
		createEReference(groundStationReferencesListEClass, GROUND_STATION_REFERENCES_LIST__GROUND_STATIONS);

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
		createEOperation(visibilityPassSpacecraftPositionHistoryEClass, VISIBILITY_PASS_SPACECRAFT_POSITION_HISTORY___GET_CLOSEST_RANGE_POSITION);
		createEOperation(visibilityPassSpacecraftPositionHistoryEClass, VISIBILITY_PASS_SPACECRAFT_POSITION_HISTORY___GET_HIGHEST_ELEVATION_POSITION);
		createEOperation(visibilityPassSpacecraftPositionHistoryEClass, VISIBILITY_PASS_SPACECRAFT_POSITION_HISTORY___GET_SMALLEST_SPACECRAFT_CROSS_TRACK_ANGLE_POSITION);
		createEOperation(visibilityPassSpacecraftPositionHistoryEClass, VISIBILITY_PASS_SPACECRAFT_POSITION_HISTORY___UPDATE_HISTORY);

		visibilityPassSpacecraftPositionEClass = createEClass(VISIBILITY_PASS_SPACECRAFT_POSITION);
		createEAttribute(visibilityPassSpacecraftPositionEClass, VISIBILITY_PASS_SPACECRAFT_POSITION__AZIMUTH);
		createEAttribute(visibilityPassSpacecraftPositionEClass, VISIBILITY_PASS_SPACECRAFT_POSITION__ELEVATION);
		createEAttribute(visibilityPassSpacecraftPositionEClass, VISIBILITY_PASS_SPACECRAFT_POSITION__RANGE);
		createEAttribute(visibilityPassSpacecraftPositionEClass, VISIBILITY_PASS_SPACECRAFT_POSITION__RANGE_RATE);
		createEAttribute(visibilityPassSpacecraftPositionEClass, VISIBILITY_PASS_SPACECRAFT_POSITION__SPACECRAFT_CROSS_TRACK_ANGLE);
		createEAttribute(visibilityPassSpacecraftPositionEClass, VISIBILITY_PASS_SPACECRAFT_POSITION__SPACECRAFT_ALONG_TRACK_ANGLE);
		createEReference(visibilityPassSpacecraftPositionEClass, VISIBILITY_PASS_SPACECRAFT_POSITION__SPACECRAFT_COORDINATES);

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

		apogyCoreEnvironmentOrbitEarthFacadeEClass = createEClass(APOGY_CORE_ENVIRONMENT_ORBIT_EARTH_FACADE);
		createEOperation(apogyCoreEnvironmentOrbitEarthFacadeEClass, APOGY_CORE_ENVIRONMENT_ORBIT_EARTH_FACADE___GET_MU);
		createEOperation(apogyCoreEnvironmentOrbitEarthFacadeEClass, APOGY_CORE_ENVIRONMENT_ORBIT_EARTH_FACADE___CREATE_ABSOLUTE_DATE__DATE);
		createEOperation(apogyCoreEnvironmentOrbitEarthFacadeEClass, APOGY_CORE_ENVIRONMENT_ORBIT_EARTH_FACADE___CREATE_DATE__ABSOLUTEDATE);
		createEOperation(apogyCoreEnvironmentOrbitEarthFacadeEClass, APOGY_CORE_ENVIRONMENT_ORBIT_EARTH_FACADE___CREATE_EARTH_SURFACE_LOCATION__STRING_STRING_DOUBLE_DOUBLE_DOUBLE);
		createEOperation(apogyCoreEnvironmentOrbitEarthFacadeEClass, APOGY_CORE_ENVIRONMENT_ORBIT_EARTH_FACADE___CREATE_ORE_KIT_BACKED_FRAME__FRAME);
		createEOperation(apogyCoreEnvironmentOrbitEarthFacadeEClass, APOGY_CORE_ENVIRONMENT_ORBIT_EARTH_FACADE___GET_SPACECRAFT_EARTH_SUB_POINT__OREKITBACKEDSPACECRAFTSTATE);
		createEOperation(apogyCoreEnvironmentOrbitEarthFacadeEClass, APOGY_CORE_ENVIRONMENT_ORBIT_EARTH_FACADE___GET_SPACECRAFT_ELEVATION_ANGLE__SPACECRAFTSTATE_EARTHSURFACELOCATION);
		createEOperation(apogyCoreEnvironmentOrbitEarthFacadeEClass, APOGY_CORE_ENVIRONMENT_ORBIT_EARTH_FACADE___GET_SPACECRAFT_AZIMUTH_ANGLE__SPACECRAFTSTATE_EARTHSURFACELOCATION);
		createEOperation(apogyCoreEnvironmentOrbitEarthFacadeEClass, APOGY_CORE_ENVIRONMENT_ORBIT_EARTH_FACADE___GET_RANGE__SPACECRAFTSTATE_EARTHSURFACELOCATION);
		createEOperation(apogyCoreEnvironmentOrbitEarthFacadeEClass, APOGY_CORE_ENVIRONMENT_ORBIT_EARTH_FACADE___CREATE_SPACECRAFT_STATE__ORBIT_SPACECRAFTSTATE);
		createEOperation(apogyCoreEnvironmentOrbitEarthFacadeEClass, APOGY_CORE_ENVIRONMENT_ORBIT_EARTH_FACADE___CREATE_ORE_KIT_BACKED_SPACECRAFT_STATE__ORBIT_SPACECRAFTSTATE);
		createEOperation(apogyCoreEnvironmentOrbitEarthFacadeEClass, APOGY_CORE_ENVIRONMENT_ORBIT_EARTH_FACADE___CREATE_TIMED_STAMPED_PVA_COORDINATES__TIMESTAMPEDPVCOORDINATES);
		createEOperation(apogyCoreEnvironmentOrbitEarthFacadeEClass, APOGY_CORE_ENVIRONMENT_ORBIT_EARTH_FACADE___CREATE_TIMED_STAMPED_ANGULAR_COORDINATES__TIMESTAMPEDANGULARCOORDINATES);
		createEOperation(apogyCoreEnvironmentOrbitEarthFacadeEClass, APOGY_CORE_ENVIRONMENT_ORBIT_EARTH_FACADE___CREATE_MATRIX3X3__ROTATION);
		createEOperation(apogyCoreEnvironmentOrbitEarthFacadeEClass, APOGY_CORE_ENVIRONMENT_ORBIT_EARTH_FACADE___CREATE_ROTATION__MATRIX3X3);
		createEOperation(apogyCoreEnvironmentOrbitEarthFacadeEClass, APOGY_CORE_ENVIRONMENT_ORBIT_EARTH_FACADE___CREATE_KEPLERIAN_ORBIT__EARTHORBITPROPAGATOR);
		createEOperation(apogyCoreEnvironmentOrbitEarthFacadeEClass, APOGY_CORE_ENVIRONMENT_ORBIT_EARTH_FACADE___CREATE_CARTESIAN_EARTH_ORBIT__EARTHORBITPROPAGATOR);
		createEOperation(apogyCoreEnvironmentOrbitEarthFacadeEClass, APOGY_CORE_ENVIRONMENT_ORBIT_EARTH_FACADE___CREATE_KEPLERIAN_ORBIT__KEPLERIANORBIT);
		createEOperation(apogyCoreEnvironmentOrbitEarthFacadeEClass, APOGY_CORE_ENVIRONMENT_ORBIT_EARTH_FACADE___CREATE_CARTESIAN_EARTH_ORBIT__CARTESIANORBIT);
		createEOperation(apogyCoreEnvironmentOrbitEarthFacadeEClass, APOGY_CORE_ENVIRONMENT_ORBIT_EARTH_FACADE___CONVERT_TO_GEOGRAPHIC_COORDINATES__OREKITBACKEDSPACECRAFTSTATE);
		createEOperation(apogyCoreEnvironmentOrbitEarthFacadeEClass, APOGY_CORE_ENVIRONMENT_ORBIT_EARTH_FACADE___GET_SPACECRAFT_STATES__PROPAGATOR_DATE_DATE_DOUBLE);
		createEOperation(apogyCoreEnvironmentOrbitEarthFacadeEClass, APOGY_CORE_ENVIRONMENT_ORBIT_EARTH_FACADE___GET_TARGET_PASSES__EARTHORBITMODEL_EARTHSURFACELOCATION_DATE_DATE_ELEVATIONMASK);
		createEOperation(apogyCoreEnvironmentOrbitEarthFacadeEClass, APOGY_CORE_ENVIRONMENT_ORBIT_EARTH_FACADE___GET_TARGET_PASSES__EARTHORBITMODEL_LIST_DATE_DATE_ELEVATIONMASK_IPROGRESSMONITOR);
		createEOperation(apogyCoreEnvironmentOrbitEarthFacadeEClass, APOGY_CORE_ENVIRONMENT_ORBIT_EARTH_FACADE___GET_GROUND_STATION_PASSES__EARTHORBITMODEL_GROUNDSTATION_DATE_DATE);
		createEOperation(apogyCoreEnvironmentOrbitEarthFacadeEClass, APOGY_CORE_ENVIRONMENT_ORBIT_EARTH_FACADE___GET_GROUND_STATION_PASSES__EARTHORBITMODEL_LIST_DATE_DATE_IPROGRESSMONITOR);
		createEOperation(apogyCoreEnvironmentOrbitEarthFacadeEClass, APOGY_CORE_ENVIRONMENT_ORBIT_EARTH_FACADE___GET_ECLIPSES__EARTHORBITMODEL_DATE_DATE);
		createEOperation(apogyCoreEnvironmentOrbitEarthFacadeEClass, APOGY_CORE_ENVIRONMENT_ORBIT_EARTH_FACADE___GET_VISIBILITY_PASS_SORTED_BY_START_DATE__LIST);
		createEOperation(apogyCoreEnvironmentOrbitEarthFacadeEClass, APOGY_CORE_ENVIRONMENT_ORBIT_EARTH_FACADE___GET_VISIBILITY_PASS_SORTED_BY_DURATION__LIST);
		createEOperation(apogyCoreEnvironmentOrbitEarthFacadeEClass, APOGY_CORE_ENVIRONMENT_ORBIT_EARTH_FACADE___GET_VISIBILITY_PASS_SPACECRAFT_POSITION_SORTED_BY_ELEVATION__LIST);
		createEOperation(apogyCoreEnvironmentOrbitEarthFacadeEClass, APOGY_CORE_ENVIRONMENT_ORBIT_EARTH_FACADE___GET_VISIBILITY_PASS_SPACECRAFT_POSITION_SORTED_BY_SPACECRAFT_CROSS_TRACK_ANGLE__LIST);
		createEOperation(apogyCoreEnvironmentOrbitEarthFacadeEClass, APOGY_CORE_ENVIRONMENT_ORBIT_EARTH_FACADE___LOAD_TLE__STRING);
		createEOperation(apogyCoreEnvironmentOrbitEarthFacadeEClass, APOGY_CORE_ENVIRONMENT_ORBIT_EARTH_FACADE___EXPORT_TLE__TLE_STRING);
		createEOperation(apogyCoreEnvironmentOrbitEarthFacadeEClass, APOGY_CORE_ENVIRONMENT_ORBIT_EARTH_FACADE___CREATE_TLE_EARTH_ORBIT_MODEL__TLE);
		createEOperation(apogyCoreEnvironmentOrbitEarthFacadeEClass, APOGY_CORE_ENVIRONMENT_ORBIT_EARTH_FACADE___EXPORT_AS_CSV__VISIBILITYPASSSPACECRAFTPOSITIONHISTORY_BOOLEAN);

		eclipseEClass = createEClass(ECLIPSE);
		createEReference(eclipseEClass, ECLIPSE__PENUMBRA_ENTRY);
		createEReference(eclipseEClass, ECLIPSE__UMBRA_ENTRY);
		createEReference(eclipseEClass, ECLIPSE__UMBRA_EXIT);
		createEReference(eclipseEClass, ECLIPSE__PENUMBRA_EXIT);

		eclipseEventEClass = createEClass(ECLIPSE_EVENT);
		createEAttribute(eclipseEventEClass, ECLIPSE_EVENT__TYPE);

		// Create enums
		ephemerisTypeEEnum = createEEnum(EPHEMERIS_TYPE);
		eclipseEventTypeEEnum = createEEnum(ECLIPSE_EVENT_TYPE);

		// Create data types
		listEDataType = createEDataType(LIST);
		mapEDataType = createEDataType(MAP);
		exceptionEDataType = createEDataType(EXCEPTION);
		sortedSetEDataType = createEDataType(SORTED_SET);
		iProgressMonitorEDataType = createEDataType(IPROGRESS_MONITOR);
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
		ApogyCoreEnvironmentOrbitPackage theApogyCoreEnvironmentOrbitPackage = (ApogyCoreEnvironmentOrbitPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCoreEnvironmentOrbitPackage.eNS_URI);
		ApogyCoreEnvironmentPackage theApogyCoreEnvironmentPackage = (ApogyCoreEnvironmentPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCoreEnvironmentPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		ApogyCorePackage theApogyCorePackage = (ApogyCorePackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCorePackage.eNS_URI);
		ApogyCommonMathPackage theApogyCommonMathPackage = (ApogyCommonMathPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCommonMathPackage.eNS_URI);
		ApogyCommonEMFPackage theApogyCommonEMFPackage = (ApogyCommonEMFPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCommonEMFPackage.eNS_URI);

		// Create type parameters
		addETypeParameter(listEDataType, "T");
		addETypeParameter(mapEDataType, "K");
		addETypeParameter(mapEDataType, "V");
		addETypeParameter(sortedSetEDataType, "T");

		// Set bounds for type parameters

		// Add supertypes to classes
		oreKitBackedSpacecraftStateEClass.getESuperTypes().add(theApogyCoreEnvironmentOrbitPackage.getSpacecraftState());
		oreKitBackedFrameEClass.getESuperTypes().add(theApogyCoreEnvironmentOrbitPackage.getAbstractFrame());
		oreKitBackedAttitudeProviderEClass.getESuperTypes().add(theApogyCoreEnvironmentOrbitPackage.getAttitudeProvider());
		nadirPointingAttitudeProviderEClass.getESuperTypes().add(this.getOreKitBackedAttitudeProvider());
		earthOrbitWorksiteEClass.getESuperTypes().add(theApogyCoreEnvironmentOrbitPackage.getOrbitWorksite());
		earthOrbitSkyEClass.getESuperTypes().add(theApogyCoreEnvironmentPackage.getSky());
		earthOrbitModelEClass.getESuperTypes().add(theApogyCoreEnvironmentOrbitPackage.getOrbitModel());
		initialOrbitBasedEarthOrbitModelEClass.getESuperTypes().add(this.getEarthOrbitModel());
		earthOrbitEClass.getESuperTypes().add(theApogyCoreEnvironmentOrbitPackage.getOrbit());
		keplerianEarthOrbitEClass.getESuperTypes().add(this.getEarthOrbit());
		cartesianEarthOrbitEClass.getESuperTypes().add(this.getEarthOrbit());
		constantElevationMaskEClass.getESuperTypes().add(this.getElevationMask());
		earthOrbitPropagatorEClass.getESuperTypes().add(theApogyCoreEnvironmentOrbitPackage.getValidityRangeProvider());
		keplerianEarthOrbitPropagatorEClass.getESuperTypes().add(this.getEarthOrbitPropagator());
		tleEarthOrbitModelEClass.getESuperTypes().add(this.getEarthOrbitModel());
		tleEarthOrbitModelEClass.getESuperTypes().add(theApogyCoreEnvironmentOrbitPackage.getValidityRangeProvider());
		urlBasedTLEEarthOrbitPropagatorEClass.getESuperTypes().add(this.getTLEEarthOrbitModel());
		tleEClass.getESuperTypes().add(this.getAbstractTLE());
		earthSurfaceLocationEClass.getESuperTypes().add(theApogyCoreEnvironmentPackage.getGeographicCoordinates());
		earthSurfaceLocationEClass.getESuperTypes().add(theApogyCorePackage.getAbstractSurfaceLocation());
		groundStationEClass.getESuperTypes().add(this.getEarthSurfaceLocation());
		groundStationListEClass.getESuperTypes().add(theApogyCommonEMFPackage.getNamed());
		groundStationListEClass.getESuperTypes().add(theApogyCommonEMFPackage.getDescribed());
		visibilityPassSpacecraftPositionEClass.getESuperTypes().add(theApogyCommonEMFPackage.getTimed());
		spacecraftsVisibilitySetEClass.getESuperTypes().add(theApogyCommonEMFPackage.getNamed());
		spacecraftsVisibilitySetEClass.getESuperTypes().add(theApogyCommonEMFPackage.getDescribed());
		spacecraftsVisibilitySetEClass.getESuperTypes().add(theApogyCorePackage.getUpdatable());
		corridorPointEClass.getESuperTypes().add(theApogyCommonEMFPackage.getTimed());
		corridorEClass.getESuperTypes().add(theApogyCommonEMFPackage.getNamed());
		corridorEClass.getESuperTypes().add(theApogyCommonEMFPackage.getDescribed());
		spacecraftSwathCorridorEClass.getESuperTypes().add(theApogyCommonEMFPackage.getNamed());
		spacecraftSwathCorridorEClass.getESuperTypes().add(theApogyCommonEMFPackage.getDescribed());
		spacecraftSwathCorridorEClass.getESuperTypes().add(theApogyCorePackage.getUpdatable());
		eclipseEventEClass.getESuperTypes().add(theApogyCoreEnvironmentPackage.getGeographicCoordinates());
		eclipseEventEClass.getESuperTypes().add(theApogyCommonEMFPackage.getTimed());

		// Initialize classes, features, and operations; add parameters
		initEClass(oreKitBackedSpacecraftStateEClass, OreKitBackedSpacecraftState.class, "OreKitBackedSpacecraftState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOreKitBackedSpacecraftState_OreKitSpacecraftState(), this.getOreKitSpacecraftState(), "oreKitSpacecraftState", null, 0, 1, OreKitBackedSpacecraftState.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oreKitBackedFrameEClass, OreKitBackedFrame.class, "OreKitBackedFrame", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getOreKitBackedFrame__GetOreKitFrame(), this.getOreKitFrame(), "getOreKitFrame", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(oreKitBackedAttitudeProviderEClass, OreKitBackedAttitudeProvider.class, "OreKitBackedAttitudeProvider", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getOreKitBackedAttitudeProvider__GetOreKitAttitudeProvider(), this.getOreKitAttitudeProvider(), "getOreKitAttitudeProvider", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(nadirPointingAttitudeProviderEClass, NadirPointingAttitudeProvider.class, "NadirPointingAttitudeProvider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(earthOrbitWorksiteEClass, EarthOrbitWorksite.class, "EarthOrbitWorksite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEarthOrbitWorksite_Sky(), this.getEarthOrbitSky(), this.getEarthOrbitSky_EarthOrbitWorksite(), "sky", null, 0, 1, EarthOrbitWorksite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(earthOrbitSkyEClass, EarthOrbitSky.class, "EarthOrbitSky", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEarthOrbitSky_EarthOrbitWorksite(), this.getEarthOrbitWorksite(), this.getEarthOrbitWorksite_Sky(), "earthOrbitWorksite", null, 0, 1, EarthOrbitSky.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEarthOrbitSky_Moon(), theApogyCoreEnvironmentPackage.getMoon(), null, "moon", null, 0, 1, EarthOrbitSky.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEarthOrbitSky_Earth(), theApogyCoreEnvironmentPackage.getEarth(), null, "earth", null, 0, 1, EarthOrbitSky.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEOperation(getEarthOrbitSky__GetMoonAngularDiameter(), theEcorePackage.getEDouble(), "getMoonAngularDiameter", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getEarthOrbitSky__GetEarthAngularDiameter(), theEcorePackage.getEDouble(), "getEarthAngularDiameter", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(earthOrbitModelEClass, EarthOrbitModel.class, "EarthOrbitModel", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getEarthOrbitModel__GetOreKitPropagator(), this.getOreKitPropagator(), "getOreKitPropagator", 0, 1, !IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getEarthOrbitModel__GetTargetPasses__EarthSurfaceLocation_Date_Date_ElevationMask(), null, "getTargetPasses", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEarthSurfaceLocation(), "earthSurfaceLocation", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDate(), "startDate", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDate(), "endDate", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getElevationMask(), "elevationMask", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());
		EGenericType g1 = createEGenericType(this.getList());
		EGenericType g2 = createEGenericType(this.getVisibilityPass());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getEarthOrbitModel__GetGroundStationPasses__GroundStation_Date_Date(), null, "getGroundStationPasses", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getGroundStation(), "groundStation", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDate(), "startDate", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDate(), "endDate", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getVisibilityPass());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getEarthOrbitModel__GetEclipses__Date_Date(), null, "getEclipses", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDate(), "startDate", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDate(), "endDate", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getEclipse());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(initialOrbitBasedEarthOrbitModelEClass, InitialOrbitBasedEarthOrbitModel.class, "InitialOrbitBasedEarthOrbitModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInitialOrbitBasedEarthOrbitModel_InitalOrbit(), this.getEarthOrbit(), this.getEarthOrbit_InitialOrbitBasedEarthOrbitModel(), "initalOrbit", null, 0, 1, InitialOrbitBasedEarthOrbitModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInitialOrbitBasedEarthOrbitModel_Propagator(), this.getEarthOrbitPropagator(), this.getEarthOrbitPropagator_InitialOrbitBasedEarthOrbitModel(), "propagator", null, 0, 1, InitialOrbitBasedEarthOrbitModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(earthOrbitEClass, EarthOrbit.class, "EarthOrbit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEarthOrbit_InitialOrbitBasedEarthOrbitModel(), this.getInitialOrbitBasedEarthOrbitModel(), this.getInitialOrbitBasedEarthOrbitModel_InitalOrbit(), "initialOrbitBasedEarthOrbitModel", null, 0, 1, EarthOrbit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		initEReference(getCartesianEarthOrbit_PvaCoordinates(), theApogyCoreEnvironmentOrbitPackage.getTimedStampedPVACoordinates(), null, "pvaCoordinates", null, 1, 1, CartesianEarthOrbit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getCartesianEarthOrbit__GetOreKitCartesianOrbit(), this.getOreKitCartesianOrbit(), "getOreKitCartesianOrbit", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(elevationMaskEClass, ElevationMask.class, "ElevationMask", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getElevationMask__GetElevation__double(), theEcorePackage.getEDouble(), "getElevation", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "azimuth", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getElevationMask__GetOreKitElevationMask(), this.getOreKitElevationMask(), "getOreKitElevationMask", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(constantElevationMaskEClass, ConstantElevationMask.class, "ConstantElevationMask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConstantElevationMask_ConstantElevation(), theEcorePackage.getEDouble(), "constantElevation", "0", 0, 1, ConstantElevationMask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(earthOrbitPropagatorEClass, EarthOrbitPropagator.class, "EarthOrbitPropagator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEarthOrbitPropagator_ValidFromDate(), theEcorePackage.getEDate(), "validFromDate", null, 1, 1, EarthOrbitPropagator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEarthOrbitPropagator_ValidToDate(), theEcorePackage.getEDate(), "validToDate", null, 1, 1, EarthOrbitPropagator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEarthOrbitPropagator_InitialOrbitBasedEarthOrbitModel(), this.getInitialOrbitBasedEarthOrbitModel(), this.getInitialOrbitBasedEarthOrbitModel_Propagator(), "initialOrbitBasedEarthOrbitModel", null, 0, 1, EarthOrbitPropagator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getEarthOrbitPropagator__GetOreKitPropagator(), this.getOreKitPropagator(), "getOreKitPropagator", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEarthOrbitPropagator__Propagate__Date(), theApogyCoreEnvironmentOrbitPackage.getSpacecraftState(), "propagate", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDate(), "targetDate", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		op = initEOperation(getEarthOrbitPropagator__GetSpacecraftStates__Date_Date_double(), null, "getSpacecraftStates", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDate(), "startDate", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDate(), "endDate", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "timeInterval", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(theApogyCoreEnvironmentOrbitPackage.getSpacecraftState());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getEarthOrbitPropagator__GetTargetPasses__EarthSurfaceLocation_Date_Date_ElevationMask(), null, "getTargetPasses", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEarthSurfaceLocation(), "earthSurfaceLocation", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDate(), "startDate", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDate(), "endDate", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getElevationMask(), "elevationMask", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getVisibilityPass());
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

		op = initEOperation(getEarthOrbitPropagator__GetEclipses__Date_Date(), null, "getEclipses", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDate(), "startDate", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDate(), "endDate", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getEclipse());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEOperation(getEarthOrbitPropagator__GetInitialOrbit(), theApogyCoreEnvironmentOrbitPackage.getOrbit(), "getInitialOrbit", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(keplerianEarthOrbitPropagatorEClass, KeplerianEarthOrbitPropagator.class, "KeplerianEarthOrbitPropagator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getKeplerianEarthOrbitPropagator__GetOreKitKeplerianPropagator(), this.getOreKitKeplerianPropagator(), "getOreKitKeplerianPropagator", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(tleEarthOrbitModelEClass, TLEEarthOrbitModel.class, "TLEEarthOrbitModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTLEEarthOrbitModel_Tle(), this.getTLE(), null, "tle", null, 1, 1, TLEEarthOrbitModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTLEEarthOrbitModel_TleValidityPeriod(), theEcorePackage.getELong(), "tleValidityPeriod", "86400000", 0, 1, TLEEarthOrbitModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(urlBasedTLEEarthOrbitPropagatorEClass, URLBasedTLEEarthOrbitPropagator.class, "URLBasedTLEEarthOrbitPropagator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getURLBasedTLEEarthOrbitPropagator_TleURL(), theEcorePackage.getEString(), "tleURL", null, 0, 1, URLBasedTLEEarthOrbitPropagator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractTLEEClass, AbstractTLE.class, "AbstractTLE", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractTLE_BStar(), theEcorePackage.getEDouble(), "bStar", null, 0, 1, AbstractTLE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractTLE_Epoch(), theEcorePackage.getEDate(), "epoch", null, 0, 1, AbstractTLE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractTLE_Eccentricity(), theEcorePackage.getEDouble(), "eccentricity", null, 0, 1, AbstractTLE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractTLE_ElementNumber(), theEcorePackage.getEInt(), "elementNumber", null, 0, 1, AbstractTLE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractTLE_EphemerisType(), this.getEphemerisType(), "ephemerisType", null, 0, 1, AbstractTLE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractTLE_Inclination(), theEcorePackage.getEDouble(), "inclination", null, 0, 1, AbstractTLE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractTLE_MeanAnomaly(), theEcorePackage.getEDouble(), "meanAnomaly", null, 0, 1, AbstractTLE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractTLE_MeanMotion(), theEcorePackage.getEDouble(), "meanMotion", null, 0, 1, AbstractTLE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractTLE_RevolutionPerDay(), theEcorePackage.getEDouble(), "revolutionPerDay", null, 0, 1, AbstractTLE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractTLE_MeanMotionFirstDerivative(), theEcorePackage.getEDouble(), "meanMotionFirstDerivative", null, 0, 1, AbstractTLE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractTLE_MeanMotionSecondDerivative(), theEcorePackage.getEDouble(), "meanMotionSecondDerivative", null, 0, 1, AbstractTLE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractTLE_ArgumentOfPerigee(), theEcorePackage.getEDouble(), "argumentOfPerigee", null, 0, 1, AbstractTLE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractTLE_RightAscentionOfAscendingNode(), theEcorePackage.getEDouble(), "rightAscentionOfAscendingNode", null, 0, 1, AbstractTLE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractTLE_RevolutionNumberAtEpoch(), theEcorePackage.getEInt(), "revolutionNumberAtEpoch", null, 0, 1, AbstractTLE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractTLE_SatelliteNumber(), theEcorePackage.getEInt(), "satelliteNumber", null, 0, 1, AbstractTLE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getAbstractTLE__GetOreKitTLE(), this.getOreKitTLE(), "getOreKitTLE", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		initEOperation(getAbstractTLE__GetLine1(), theEcorePackage.getEString(), "getLine1", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getAbstractTLE__GetLine2(), theEcorePackage.getEString(), "getLine2", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(tleEClass, ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLE.class, "TLE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTLE_FirstLine(), theEcorePackage.getEString(), "firstLine", null, 1, 1, ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTLE_SecondLine(), theEcorePackage.getEString(), "secondLine", null, 1, 1, ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(earthSurfaceLocationEClass, EarthSurfaceLocation.class, "EarthSurfaceLocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(groundStationReferencesListEClass, GroundStationReferencesList.class, "GroundStationReferencesList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGroundStationReferencesList_GroundStations(), this.getGroundStation(), null, "groundStations", null, 0, -1, GroundStationReferencesList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(groundStationEClass, GroundStation.class, "GroundStation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGroundStation_FieldOfViewOrientation(), theApogyCommonMathPackage.getMatrix3x3(), null, "fieldOfViewOrientation", null, 0, 1, GroundStation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGroundStation_ElevationMask(), this.getElevationMask(), null, "elevationMask", null, 0, 1, GroundStation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(groundStationListEClass, GroundStationList.class, "GroundStationList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGroundStationList_GroundStations(), this.getGroundStation(), null, "groundStations", null, 0, -1, GroundStationList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(visibilityPassEClass, VisibilityPass.class, "VisibilityPass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVisibilityPass_OrbitModel(), this.getEarthOrbitModel(), null, "orbitModel", null, 0, 1, VisibilityPass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVisibilityPass_SurfaceLocation(), this.getEarthSurfaceLocation(), null, "surfaceLocation", null, 0, 1, VisibilityPass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVisibilityPass_StartTime(), theEcorePackage.getEDate(), "startTime", null, 0, 1, VisibilityPass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVisibilityPass_EndTime(), theEcorePackage.getEDate(), "endTime", null, 0, 1, VisibilityPass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVisibilityPass_PositionHistory(), this.getVisibilityPassSpacecraftPositionHistory(), this.getVisibilityPassSpacecraftPositionHistory_VisibilityPass(), "positionHistory", null, 0, 1, VisibilityPass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVisibilityPass_Duration(), theEcorePackage.getEDouble(), "duration", null, 0, 1, VisibilityPass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(visibilityPassSpacecraftPositionHistoryEClass, VisibilityPassSpacecraftPositionHistory.class, "VisibilityPassSpacecraftPositionHistory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVisibilityPassSpacecraftPositionHistory_TimeInterval(), theEcorePackage.getEDouble(), "timeInterval", "30.0", 0, 1, VisibilityPassSpacecraftPositionHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVisibilityPassSpacecraftPositionHistory_VisibilityPass(), this.getVisibilityPass(), this.getVisibilityPass_PositionHistory(), "visibilityPass", null, 0, 1, VisibilityPassSpacecraftPositionHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVisibilityPassSpacecraftPositionHistory_Positions(), this.getVisibilityPassSpacecraftPosition(), null, "positions", null, 0, -1, VisibilityPassSpacecraftPositionHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getVisibilityPassSpacecraftPositionHistory__GetClosestRangePosition(), this.getVisibilityPassSpacecraftPosition(), "getClosestRangePosition", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getVisibilityPassSpacecraftPositionHistory__GetHighestElevationPosition(), this.getVisibilityPassSpacecraftPosition(), "getHighestElevationPosition", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getVisibilityPassSpacecraftPositionHistory__GetSmallestSpacecraftCrossTrackAnglePosition(), this.getVisibilityPassSpacecraftPosition(), "getSmallestSpacecraftCrossTrackAnglePosition", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getVisibilityPassSpacecraftPositionHistory__UpdateHistory(), null, "updateHistory", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(visibilityPassSpacecraftPositionEClass, VisibilityPassSpacecraftPosition.class, "VisibilityPassSpacecraftPosition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVisibilityPassSpacecraftPosition_Azimuth(), theEcorePackage.getEDouble(), "azimuth", "0", 0, 1, VisibilityPassSpacecraftPosition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVisibilityPassSpacecraftPosition_Elevation(), theEcorePackage.getEDouble(), "elevation", "0", 0, 1, VisibilityPassSpacecraftPosition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVisibilityPassSpacecraftPosition_Range(), theEcorePackage.getEDouble(), "range", "0", 0, 1, VisibilityPassSpacecraftPosition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVisibilityPassSpacecraftPosition_RangeRate(), theEcorePackage.getEDouble(), "rangeRate", "0", 0, 1, VisibilityPassSpacecraftPosition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVisibilityPassSpacecraftPosition_SpacecraftCrossTrackAngle(), theEcorePackage.getEDouble(), "spacecraftCrossTrackAngle", "0", 0, 1, VisibilityPassSpacecraftPosition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVisibilityPassSpacecraftPosition_SpacecraftAlongTrackAngle(), theEcorePackage.getEDouble(), "spacecraftAlongTrackAngle", "0", 0, 1, VisibilityPassSpacecraftPosition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVisibilityPassSpacecraftPosition_SpacecraftCoordinates(), theApogyCoreEnvironmentPackage.getGeographicCoordinates(), null, "spacecraftCoordinates", null, 0, 1, VisibilityPassSpacecraftPosition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(spacecraftsVisibilitySetEClass, SpacecraftsVisibilitySet.class, "SpacecraftsVisibilitySet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpacecraftsVisibilitySet_StartTime(), theEcorePackage.getEDate(), "startTime", null, 0, 1, SpacecraftsVisibilitySet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpacecraftsVisibilitySet_EndTime(), theEcorePackage.getEDate(), "endTime", null, 0, 1, SpacecraftsVisibilitySet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpacecraftsVisibilitySet_OrbitModels(), theApogyCoreEnvironmentOrbitPackage.getOrbitModel(), null, "orbitModels", null, 0, -1, SpacecraftsVisibilitySet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
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
		initEReference(getCorridorPoint_Left(), theApogyCoreEnvironmentPackage.getGeographicCoordinates(), null, "left", null, 0, 1, CorridorPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCorridorPoint_Center(), theApogyCoreEnvironmentPackage.getGeographicCoordinates(), null, "center", null, 0, 1, CorridorPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCorridorPoint_Right(), theApogyCoreEnvironmentPackage.getGeographicCoordinates(), null, "right", null, 0, 1, CorridorPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(corridorEClass, Corridor.class, "Corridor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCorridor_Points(), this.getCorridorPoint(), null, "points", null, 0, -1, Corridor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(spacecraftSwathCorridorEClass, SpacecraftSwathCorridor.class, "SpacecraftSwathCorridor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpacecraftSwathCorridor_StartTime(), theEcorePackage.getEDate(), "startTime", null, 0, 1, SpacecraftSwathCorridor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpacecraftSwathCorridor_EndTime(), theEcorePackage.getEDate(), "endTime", null, 0, 1, SpacecraftSwathCorridor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpacecraftSwathCorridor_TimeInterval(), theEcorePackage.getEDouble(), "timeInterval", "1.0", 0, 1, SpacecraftSwathCorridor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpacecraftSwathCorridor_OrbitModel(), theApogyCoreEnvironmentOrbitPackage.getOrbitModel(), null, "orbitModel", null, 0, 1, SpacecraftSwathCorridor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpacecraftSwathCorridor_LeftSwathAngle(), theEcorePackage.getEDouble(), "leftSwathAngle", "0", 0, 1, SpacecraftSwathCorridor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpacecraftSwathCorridor_RightSwathAngle(), theEcorePackage.getEDouble(), "rightSwathAngle", "0", 0, 1, SpacecraftSwathCorridor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpacecraftSwathCorridor_Corridor(), this.getCorridor(), null, "corridor", null, 0, 1, SpacecraftSwathCorridor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(apogyCoreEnvironmentOrbitEarthFacadeEClass, ApogyCoreEnvironmentOrbitEarthFacade.class, "ApogyCoreEnvironmentOrbitEarthFacade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getApogyCoreEnvironmentOrbitEarthFacade__GetMu(), theEcorePackage.getEDouble(), "getMu", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCoreEnvironmentOrbitEarthFacade__CreateAbsoluteDate__Date(), this.getAbsoluteDate(), "createAbsoluteDate", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDate(), "date", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCoreEnvironmentOrbitEarthFacade__CreateDate__AbsoluteDate(), theEcorePackage.getEDate(), "createDate", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAbsoluteDate(), "absoluteDate", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCoreEnvironmentOrbitEarthFacade__CreateEarthSurfaceLocation__String_String_double_double_double(), this.getEarthSurfaceLocation(), "createEarthSurfaceLocation", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "description", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "longitude", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "latitude", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "elevation", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCoreEnvironmentOrbitEarthFacade__CreateOreKitBackedFrame__Frame(), this.getOreKitBackedFrame(), "createOreKitBackedFrame", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOreKitFrame(), "oreKitFrame", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCoreEnvironmentOrbitEarthFacade__GetSpacecraftEarthSubPoint__OreKitBackedSpacecraftState(), theApogyCoreEnvironmentPackage.getGeographicCoordinates(), "getSpacecraftEarthSubPoint", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOreKitBackedSpacecraftState(), "oreKitBackedSpacecraftState", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		op = initEOperation(getApogyCoreEnvironmentOrbitEarthFacade__GetSpacecraftElevationAngle__SpacecraftState_EarthSurfaceLocation(), theEcorePackage.getEDouble(), "getSpacecraftElevationAngle", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCoreEnvironmentOrbitPackage.getSpacecraftState(), "spacecraftState", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEarthSurfaceLocation(), "earthSurfaceLocation", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		op = initEOperation(getApogyCoreEnvironmentOrbitEarthFacade__GetSpacecraftAzimuthAngle__SpacecraftState_EarthSurfaceLocation(), theEcorePackage.getEDouble(), "getSpacecraftAzimuthAngle", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCoreEnvironmentOrbitPackage.getSpacecraftState(), "spacecraftState", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEarthSurfaceLocation(), "earthSurfaceLocation", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		op = initEOperation(getApogyCoreEnvironmentOrbitEarthFacade__GetRange__SpacecraftState_EarthSurfaceLocation(), theEcorePackage.getEDouble(), "getRange", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCoreEnvironmentOrbitPackage.getSpacecraftState(), "spacecraftState", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEarthSurfaceLocation(), "earthSurfaceLocation", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		op = initEOperation(getApogyCoreEnvironmentOrbitEarthFacade__CreateSpacecraftState__Orbit_SpacecraftState(), theApogyCoreEnvironmentOrbitPackage.getSpacecraftState(), "createSpacecraftState", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCoreEnvironmentOrbitPackage.getOrbit(), "orbit", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOreKitSpacecraftState(), "oreKitSpacecraftState", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCoreEnvironmentOrbitEarthFacade__CreateOreKitBackedSpacecraftState__Orbit_SpacecraftState(), this.getOreKitBackedSpacecraftState(), "createOreKitBackedSpacecraftState", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCoreEnvironmentOrbitPackage.getOrbit(), "orbit", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOreKitSpacecraftState(), "oreKitSpacecraftState", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCoreEnvironmentOrbitEarthFacade__CreateTimedStampedPVACoordinates__TimeStampedPVCoordinates(), theApogyCoreEnvironmentOrbitPackage.getTimedStampedPVACoordinates(), "createTimedStampedPVACoordinates", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOreKitTimeStampedPVCoordinates(), "oreKitTimeStampedPVCoordinates", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCoreEnvironmentOrbitEarthFacade__CreateTimedStampedAngularCoordinates__TimeStampedAngularCoordinates(), theApogyCoreEnvironmentOrbitPackage.getTimedStampedAngularCoordinates(), "createTimedStampedAngularCoordinates", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOreKitTimeStampedAngularCoordinates(), "oreKitTimeStampedAngularCoordinates", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCoreEnvironmentOrbitEarthFacade__CreateMatrix3x3__Rotation(), theApogyCommonMathPackage.getMatrix3x3(), "createMatrix3x3", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRotation(), "rotation", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCoreEnvironmentOrbitEarthFacade__CreateRotation__Matrix3x3(), this.getRotation(), "createRotation", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCommonMathPackage.getMatrix3x3(), "matrix3x3", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCoreEnvironmentOrbitEarthFacade__CreateKeplerianOrbit__EarthOrbitPropagator(), this.getKeplerianEarthOrbit(), "createKeplerianOrbit", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEarthOrbitPropagator(), "earthOrbitPropagator", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		op = initEOperation(getApogyCoreEnvironmentOrbitEarthFacade__CreateCartesianEarthOrbit__EarthOrbitPropagator(), this.getCartesianEarthOrbit(), "createCartesianEarthOrbit", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEarthOrbitPropagator(), "earthOrbitPropagator", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		op = initEOperation(getApogyCoreEnvironmentOrbitEarthFacade__CreateKeplerianOrbit__KeplerianOrbit(), this.getKeplerianEarthOrbit(), "createKeplerianOrbit", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOreKitKeplerianOrbit(), "oreKitKeplerianOrbit", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		op = initEOperation(getApogyCoreEnvironmentOrbitEarthFacade__CreateCartesianEarthOrbit__CartesianOrbit(), this.getCartesianEarthOrbit(), "createCartesianEarthOrbit", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOreKitCartesianOrbit(), "oreKitCartesianOrbit", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		op = initEOperation(getApogyCoreEnvironmentOrbitEarthFacade__ConvertToGeographicCoordinates__OreKitBackedSpacecraftState(), theApogyCoreEnvironmentPackage.getGeographicCoordinates(), "convertToGeographicCoordinates", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOreKitBackedSpacecraftState(), "oreKitBackedSpacecraftState", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		op = initEOperation(getApogyCoreEnvironmentOrbitEarthFacade__GetSpacecraftStates__Propagator_Date_Date_double(), null, "getSpacecraftStates", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOreKitPropagator(), "propagator", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDate(), "startDate", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDate(), "endDate", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "timeInterval", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(theApogyCoreEnvironmentOrbitPackage.getSpacecraftState());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getApogyCoreEnvironmentOrbitEarthFacade__GetTargetPasses__EarthOrbitModel_EarthSurfaceLocation_Date_Date_ElevationMask(), null, "getTargetPasses", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEarthOrbitModel(), "earthOrbitModel", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEarthSurfaceLocation(), "earthSurfaceLocation", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDate(), "startDate", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDate(), "endDate", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getElevationMask(), "elevationMask", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getVisibilityPass());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getApogyCoreEnvironmentOrbitEarthFacade__GetTargetPasses__EarthOrbitModel_List_Date_Date_ElevationMask_IProgressMonitor(), null, "getTargetPasses", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEarthOrbitModel(), "earthOrbitModel", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getEarthSurfaceLocation());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "earthSurfaceLocations", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDate(), "startDate", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDate(), "endDate", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getElevationMask(), "elevationMask", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIProgressMonitor(), "monitor", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getVisibilityPass());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getApogyCoreEnvironmentOrbitEarthFacade__GetGroundStationPasses__EarthOrbitModel_GroundStation_Date_Date(), null, "getGroundStationPasses", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEarthOrbitModel(), "earthOrbitModel", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getGroundStation(), "groundStation", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDate(), "startDate", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDate(), "endDate", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getVisibilityPass());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getApogyCoreEnvironmentOrbitEarthFacade__GetGroundStationPasses__EarthOrbitModel_List_Date_Date_IProgressMonitor(), null, "getGroundStationPasses", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEarthOrbitModel(), "earthOrbitModel", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getGroundStation());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "groundStations", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDate(), "startDate", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDate(), "endDate", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIProgressMonitor(), "monitor", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getVisibilityPass());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getApogyCoreEnvironmentOrbitEarthFacade__GetEclipses__EarthOrbitModel_Date_Date(), null, "getEclipses", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEarthOrbitModel(), "earthOrbitModel", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDate(), "startDate", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDate(), "endDate", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getEclipse());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getApogyCoreEnvironmentOrbitEarthFacade__GetVisibilityPassSortedByStartDate__List(), null, "getVisibilityPassSortedByStartDate", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getVisibilityPass());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "passes", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getSortedSet());
		g2 = createEGenericType(this.getVisibilityPass());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getApogyCoreEnvironmentOrbitEarthFacade__GetVisibilityPassSortedByDuration__List(), null, "getVisibilityPassSortedByDuration", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getVisibilityPass());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "passes", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getSortedSet());
		g2 = createEGenericType(this.getVisibilityPass());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getApogyCoreEnvironmentOrbitEarthFacade__GetVisibilityPassSpacecraftPositionSortedByElevation__List(), null, "getVisibilityPassSpacecraftPositionSortedByElevation", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getVisibilityPassSpacecraftPosition());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "positions", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getSortedSet());
		g2 = createEGenericType(this.getVisibilityPassSpacecraftPosition());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getApogyCoreEnvironmentOrbitEarthFacade__GetVisibilityPassSpacecraftPositionSortedBySpacecraftCrossTrackAngle__List(), null, "getVisibilityPassSpacecraftPositionSortedBySpacecraftCrossTrackAngle", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getVisibilityPassSpacecraftPosition());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "positions", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getSortedSet());
		g2 = createEGenericType(this.getVisibilityPassSpacecraftPosition());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getApogyCoreEnvironmentOrbitEarthFacade__LoadTLE__String(), this.getTLE(), "loadTLE", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "url", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		op = initEOperation(getApogyCoreEnvironmentOrbitEarthFacade__ExportTLE__TLE_String(), null, "exportTLE", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTLE(), "tle", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "url", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		op = initEOperation(getApogyCoreEnvironmentOrbitEarthFacade__CreateTLEEarthOrbitModel__TLE(), this.getTLEEarthOrbitModel(), "createTLEEarthOrbitModel", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTLE(), "tle", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		op = initEOperation(getApogyCoreEnvironmentOrbitEarthFacade__ExportAsCSV__VisibilityPassSpacecraftPositionHistory_boolean(), theEcorePackage.getEString(), "exportAsCSV", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVisibilityPassSpacecraftPositionHistory(), "visibilityPassSpacecraftPositionHistory", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEBoolean(), "includeHeader", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(eclipseEClass, Eclipse.class, "Eclipse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEclipse_PenumbraEntry(), this.getEclipseEvent(), null, "penumbraEntry", null, 0, 1, Eclipse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEclipse_UmbraEntry(), this.getEclipseEvent(), null, "umbraEntry", null, 0, 1, Eclipse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEclipse_UmbraExit(), this.getEclipseEvent(), null, "umbraExit", null, 0, 1, Eclipse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEclipse_PenumbraExit(), this.getEclipseEvent(), null, "penumbraExit", null, 0, 1, Eclipse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eclipseEventEClass, EclipseEvent.class, "EclipseEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEclipseEvent_Type(), this.getEclipseEventType(), "type", null, 0, 1, EclipseEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(ephemerisTypeEEnum, EphemerisType.class, "EphemerisType");
		addEEnumLiteral(ephemerisTypeEEnum, EphemerisType.DEFAULT);
		addEEnumLiteral(ephemerisTypeEEnum, EphemerisType.SGP);
		addEEnumLiteral(ephemerisTypeEEnum, EphemerisType.SGP4);
		addEEnumLiteral(ephemerisTypeEEnum, EphemerisType.SDP4);
		addEEnumLiteral(ephemerisTypeEEnum, EphemerisType.SGP8);
		addEEnumLiteral(ephemerisTypeEEnum, EphemerisType.SDP8);

		initEEnum(eclipseEventTypeEEnum, EclipseEventType.class, "EclipseEventType");
		addEEnumLiteral(eclipseEventTypeEEnum, EclipseEventType.PENUMBRA_ENTRY);
		addEEnumLiteral(eclipseEventTypeEEnum, EclipseEventType.PENUMBRA_EXIT);
		addEEnumLiteral(eclipseEventTypeEEnum, EclipseEventType.UMBRA_ENTRY);
		addEEnumLiteral(eclipseEventTypeEEnum, EclipseEventType.UMBRA_EXIT);

		// Initialize data types
		initEDataType(listEDataType, List.class, "List", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(mapEDataType, Map.class, "Map", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(exceptionEDataType, Exception.class, "Exception", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(sortedSetEDataType, SortedSet.class, "SortedSet", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(iProgressMonitorEDataType, IProgressMonitor.class, "IProgressMonitor", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
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
			 "documentation", "Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Pierre Allard (Pierre.Allard@canada.ca),\n    Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n    Sebastien Gemme (Sebastien.Gemme@canada.ca),\n    Canadian Space Agency (CSA) - Initial API and implementation",
			 "prefix", "ApogyCoreEnvironmentOrbitEarth",
			 "childCreationExtenders", "true",
			 "extensibleProviderFactory", "true",
			 "multipleEditorPages", "false",
			 "copyrightText", "Copyright (c) 2015-2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Pierre Allard (Pierre.Allard@canada.ca), \n    Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n    Sebastien Gemme (Sebastien.Gemme@canada.ca),\n    Canadian Space Agency (CSA) - Initial API and implementation",
			 "modelName", "ApogyCoreEnvironmentOrbitEarth",
			 "complianceLevel", "8.0",
			 "suppressGenModelAnnotations", "false",
			 "dynamicTemplates", "true",
			 "templateDirectory", "platform:/plugin/ca.gc.asc_csa.apogy.common.emf.templates",
			 "modelDirectory", "/ca.gc.asc_csa.apogy.core.environment.orbit.earth/src-generated",
			 "editDirectory", "/ca.gc.asc_csa.apogy.core.environment.orbit.earth.edit/src-generated",
			 "testsDirectory", "/ca.gc.asc_csa.apogy.core.environment.orbit.earth.tests/src-generated",
			 "basePackage", "ca.gc.asc_csa.apogy.core.environment.orbit"
		   });	
		addAnnotation
		  (oreKitBackedSpacecraftStateEClass, 
		   source, 
		   new String[] {
			 "documentation", "A SpacecraftState that is backed by an OreKit SpacecraftState."
		   });	
		addAnnotation
		  (oreKitBackedAttitudeProviderEClass, 
		   source, 
		   new String[] {
			 "documentation", "A specialization of AttitudeProvider that uses an OreKit org.orekit.attitudes.AttitudeProvider."
		   });	
		addAnnotation
		  (nadirPointingAttitudeProviderEClass, 
		   source, 
		   new String[] {
			 "documentation", "This class represents the attitude provider where the satellite z axis is pointing to the vertical of the ground point under satellite.\nIt is backed by a org.orekit.attitudes.NadirPointing AttitudeProvider."
		   });	
		addAnnotation
		  (earthOrbitWorksiteEClass, 
		   source, 
		   new String[] {
			 "documentation", "Defines a worksite in orbit. The reference frame used is inertial (J2000), with its origin at the current orbital position."
		   });	
		addAnnotation
		  (earthOrbitSkyEClass, 
		   source, 
		   new String[] {
			 "documentation", "Defines the Sky as seen from an EarthOrbitWorksite."
		   });	
		addAnnotation
		  (getEarthOrbitSky__GetMoonAngularDiameter(), 
		   source, 
		   new String[] {
			 "documentation", "Returns the Moon angular diameter, in radians.",
			 "propertyCategory", "MOON",
			 "apogy_units", "rad"
		   });	
		addAnnotation
		  (getEarthOrbitSky__GetEarthAngularDiameter(), 
		   source, 
		   new String[] {
			 "documentation", "Returns the Earth angular diameter, in radians.",
			 "propertyCategory", "EARTH",
			 "apogy_units", "rad"
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
		  (getEarthOrbitModel__GetOreKitPropagator(), 
		   source, 
		   new String[] {
			 "documentation", "*\nReturn the OreKit propagator associated with the EarthOrbitModel."
		   });	
		addAnnotation
		  (getEarthOrbitModel__GetTargetPasses__EarthSurfaceLocation_Date_Date_ElevationMask(), 
		   source, 
		   new String[] {
			 "documentation", "*\nReturns the list of passes for a given target."
		   });	
		addAnnotation
		  (getEarthOrbitModel__GetGroundStationPasses__GroundStation_Date_Date(), 
		   source, 
		   new String[] {
			 "documentation", "*\nReturns the list of passes for a given Ground Station (and its Field Of View) during a specified interval."
		   });	
		addAnnotation
		  (getEarthOrbitModel__GetEclipses__Date_Date(), 
		   source, 
		   new String[] {
			 "documentation", "*\nReturns the list of {@link Eclipse}."
		   });	
		addAnnotation
		  (earthOrbitEClass, 
		   source, 
		   new String[] {
			 "documentation", "Defines an Orbit around the Earth."
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
			 "documentation", "An Earth orbit represented by Keplerian Elements.\n@see http://en.wikipedia.org/wiki/Orbital_elements"
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
			 "apogy_units", "m",
			 "propertyCategory", "KEPLER_ORBITAL_PARAMETERS"
		   });	
		addAnnotation
		  (getKeplerianEarthOrbit_Eccentricity(), 
		   source, 
		   new String[] {
			 "documentation", "Eccentricity",
			 "propertyCategory", "KEPLER_ORBITAL_PARAMETERS"
		   });	
		addAnnotation
		  (getKeplerianEarthOrbit_Inclination(), 
		   source, 
		   new String[] {
			 "documentation", "Inclination, in radians.",
			 "apogy_units", "rad",
			 "propertyCategory", "KEPLER_ORBITAL_PARAMETERS"
		   });	
		addAnnotation
		  (getKeplerianEarthOrbit_PerigeeArgument(), 
		   source, 
		   new String[] {
			 "documentation", "Argument of perigee, in radians.",
			 "apogy_units", "rad",
			 "propertyCategory", "KEPLER_ORBITAL_PARAMETERS"
		   });	
		addAnnotation
		  (getKeplerianEarthOrbit_RightAscentionOfAscendingNode(), 
		   source, 
		   new String[] {
			 "documentation", "Right ascension of ascending node, in radians.",
			 "apogy_units", "rad",
			 "propertyCategory", "KEPLER_ORBITAL_PARAMETERS"
		   });	
		addAnnotation
		  (getKeplerianEarthOrbit_MeanAnomaly(), 
		   source, 
		   new String[] {
			 "documentation", "Mean anomaly.",
			 "propertyCategory", "KEPLER_ORBITAL_PARAMETERS"
		   });	
		addAnnotation
		  (getKeplerianEarthOrbit_TrueAnomaly(), 
		   source, 
		   new String[] {
			 "documentation", "True anomaly.",
			 "propertyCategory", "KEPLER_ORBITAL_PARAMETERS"
		   });	
		addAnnotation
		  (getConstantElevationMask_ConstantElevation(), 
		   source, 
		   new String[] {
			 "documentation", "The elevation, in radians.",
			 "property", "Editable",
			 "apogy_units", "rad"
		   });	
		addAnnotation
		  (earthOrbitPropagatorEClass, 
		   source, 
		   new String[] {
			 "documentation", "Defines an Orbit propagator for Earth orbits."
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
		  (getEarthOrbitPropagator__GetEclipses__Date_Date(), 
		   source, 
		   new String[] {
			 "documentation", "*\nReturns the list of {@link Eclipse}."
		   });	
		addAnnotation
		  (getEarthOrbitPropagator__GetInitialOrbit(), 
		   source, 
		   new String[] {
			 "documentation", "*\nReturn the init"
		   });	
		addAnnotation
		  (keplerianEarthOrbitPropagatorEClass, 
		   source, 
		   new String[] {
			 "documentation", "Simple keplerian orbit propagator for Earth orbits."
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
		  (getTLEEarthOrbitModel_Tle(), 
		   source, 
		   new String[] {
			 "documentation", "The Two-Line Elements used by this propagator."
		   });	
		addAnnotation
		  (getTLEEarthOrbitModel_TleValidityPeriod(), 
		   source, 
		   new String[] {
			 "documentation", "TLE Validity Period in ms."
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
		  (getAbstractTLE__GetOreKitTLE(), 
		   source, 
		   new String[] {
			 "documentation", "Return the OreKit implementation backing this TLE."
		   });	
		addAnnotation
		  (getAbstractTLE__GetLine1(), 
		   source, 
		   new String[] {
			 "documentation", "*\nReturns the first line of the TLE.\n@return The first line of the TLE."
		   });	
		addAnnotation
		  (getAbstractTLE__GetLine2(), 
		   source, 
		   new String[] {
			 "documentation", "*\nReturns the second line of the TLE.\n@return The first line of the TLE."
		   });	
		addAnnotation
		  (getAbstractTLE_BStar(), 
		   source, 
		   new String[] {
			 "documentation", "The ballistic coefficient.",
			 "property", "Readonly",
			 "notify", "true",
			 "propertyCategory", "TLE_ORBITAL_PARAMETERS"
		   });	
		addAnnotation
		  (getAbstractTLE_Epoch(), 
		   source, 
		   new String[] {
			 "documentation", "The epoch.",
			 "property", "Readonly",
			 "notify", "true"
		   });	
		addAnnotation
		  (getAbstractTLE_Eccentricity(), 
		   source, 
		   new String[] {
			 "documentation", "The eccentricity.",
			 "property", "Readonly",
			 "notify", "true",
			 "propertyCategory", "TLE_ORBITAL_PARAMETERS"
		   });	
		addAnnotation
		  (getAbstractTLE_ElementNumber(), 
		   source, 
		   new String[] {
			 "documentation", "The element number.",
			 "property", "Readonly",
			 "notify", "true"
		   });	
		addAnnotation
		  (getAbstractTLE_EphemerisType(), 
		   source, 
		   new String[] {
			 "documentation", "The Ephemeris type.",
			 "property", "Readonly",
			 "notify", "true"
		   });	
		addAnnotation
		  (getAbstractTLE_Inclination(), 
		   source, 
		   new String[] {
			 "documentation", "The inclination.",
			 "property", "Readonly",
			 "notify", "true",
			 "apogy_units", "rad",
			 "propertyCategory", "TLE_ORBITAL_PARAMETERS"
		   });	
		addAnnotation
		  (getAbstractTLE_MeanAnomaly(), 
		   source, 
		   new String[] {
			 "documentation", "The mean anomaly.",
			 "property", "Readonly",
			 "notify", "true",
			 "apogy_units", "rad",
			 "propertyCategory", "TLE_ORBITAL_PARAMETERS"
		   });	
		addAnnotation
		  (getAbstractTLE_MeanMotion(), 
		   source, 
		   new String[] {
			 "documentation", "The mean motion.",
			 "property", "Readonly",
			 "notify", "true",
			 "apogy_units", "rad/s",
			 "propertyCategory", "TLE_ORBITAL_PARAMETERS"
		   });	
		addAnnotation
		  (getAbstractTLE_RevolutionPerDay(), 
		   source, 
		   new String[] {
			 "documentation", "The mean motion, expressed as revolution per day.",
			 "property", "Readonly",
			 "notify", "true",
			 "apogy_units", "rev/day",
			 "propertyCategory", "TLE_ORBITAL_PARAMETERS"
		   });	
		addAnnotation
		  (getAbstractTLE_MeanMotionFirstDerivative(), 
		   source, 
		   new String[] {
			 "documentation", "The mean motion first derivative.",
			 "property", "Readonly",
			 "notify", "true",
			 "apogy_units", "rad/s\u00b2",
			 "propertyCategory", "TLE_ORBITAL_PARAMETERS"
		   });	
		addAnnotation
		  (getAbstractTLE_MeanMotionSecondDerivative(), 
		   source, 
		   new String[] {
			 "documentation", "The mean motion second derivative.",
			 "property", "Readonly",
			 "notify", "true",
			 "apogy_units", "rad/s\u00b3",
			 "propertyCategory", "TLE_ORBITAL_PARAMETERS"
		   });	
		addAnnotation
		  (getAbstractTLE_ArgumentOfPerigee(), 
		   source, 
		   new String[] {
			 "documentation", "The argument of perigee.",
			 "property", "Readonly",
			 "notify", "true",
			 "apogy_units", "rad",
			 "propertyCategory", "TLE_ORBITAL_PARAMETERS"
		   });	
		addAnnotation
		  (getAbstractTLE_RightAscentionOfAscendingNode(), 
		   source, 
		   new String[] {
			 "documentation", "Right ascension of ascending node, in radians.",
			 "property", "Readonly",
			 "apogy_units", "rad",
			 "propertyCategory", "TLE_ORBITAL_PARAMETERS"
		   });	
		addAnnotation
		  (getAbstractTLE_RevolutionNumberAtEpoch(), 
		   source, 
		   new String[] {
			 "documentation", "The revolution number at epoch.",
			 "property", "Readonly",
			 "propertyCategory", "TLE_ORBITAL_PARAMETERS"
		   });	
		addAnnotation
		  (getAbstractTLE_SatelliteNumber(), 
		   source, 
		   new String[] {
			 "documentation", "The satellite id number.",
			 "property", "Readonly"
		   });	
		addAnnotation
		  (tleEClass, 
		   source, 
		   new String[] {
			 "documentation", "Defines a Two-Line Elements orbit and propagation definition.\n@see http://en.wikipedia.org/wiki/Two-line_element_set"
		   });	
		addAnnotation
		  (getTLE_FirstLine(), 
		   source, 
		   new String[] {
			 "documentation", "The first line of the TLE in text form.",
			 "property", "Editable",
			 "propertyCategory", "TLE_RAW_DATA",
			 "notify", "true"
		   });	
		addAnnotation
		  (getTLE_SecondLine(), 
		   source, 
		   new String[] {
			 "documentation", "The second line of the TLE in text form.",
			 "property", "Editable",
			 "propertyCategory", "TLE_RAW_DATA",
			 "notify", "true"
		   });	
		addAnnotation
		  (earthSurfaceLocationEClass, 
		   source, 
		   new String[] {
			 "documentation", "Defines a location on the surface of the Earth."
		   });	
		addAnnotation
		  (groundStationReferencesListEClass, 
		   source, 
		   new String[] {
			 "documentation", "List that refers {@link GroundStation}."
		   });	
		addAnnotation
		  (getGroundStationReferencesList_GroundStations(), 
		   source, 
		   new String[] {
			 "documentation", "{@link GroundStation} container."
		   });	
		addAnnotation
		  (groundStationEClass, 
		   source, 
		   new String[] {
			 "documentation", "Defines a ground station and its associated Field Of View."
		   });	
		addAnnotation
		  (getGroundStation_FieldOfViewOrientation(), 
		   source, 
		   new String[] {
			 "documentation", "The orientation of the field of view relative\nto the Ground Station frame.",
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
			 "documentation", "The Earth Orbit Model that was used to compute the visibility.",
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
			 "apogy_units", "s"
		   });	
		addAnnotation
		  (getVisibilityPassSpacecraftPositionHistory__GetClosestRangePosition(), 
		   source, 
		   new String[] {
			 "documentation", "Returns the VisibilityPassSpacecraftPosition with the smallest range in the position history.\n@return The VisibilityPassSpacecraftPosition with the smallest range, null if the history position is empty."
		   });	
		addAnnotation
		  (getVisibilityPassSpacecraftPositionHistory__GetHighestElevationPosition(), 
		   source, 
		   new String[] {
			 "documentation", "Returns the VisibilityPassSpacecraftPosition with the highest elevation in the position history.\n@return The VisibilityPassSpacecraftPosition with the highest elevation, null if the history position is empty."
		   });	
		addAnnotation
		  (getVisibilityPassSpacecraftPositionHistory__GetSmallestSpacecraftCrossTrackAnglePosition(), 
		   source, 
		   new String[] {
			 "documentation", "Returns the VisibilityPassSpacecraftPosition with the smallest spacecraft cross-track angle in the position history.\n@return The VisibilityPassSpacecraftPosition with the smallest spacecraft cross-track angle, null if the history position is empty."
		   });	
		addAnnotation
		  (getVisibilityPassSpacecraftPositionHistory__UpdateHistory(), 
		   source, 
		   new String[] {
			 "documentation", "Force the update of VisibilityPassSpacecraftPositionHistory."
		   });	
		addAnnotation
		  (getVisibilityPassSpacecraftPositionHistory_TimeInterval(), 
		   source, 
		   new String[] {
			 "documentation", "The time interval separating positions.",
			 "notify", "true",
			 "property", "Editable",
			 "apogy_units", "s"
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
			 "apogy_units", "rad"
		   });	
		addAnnotation
		  (getVisibilityPassSpacecraftPosition_Elevation(), 
		   source, 
		   new String[] {
			 "documentation", "The elevation of the spacecraft relative to the local horizontal plane.",
			 "notify", "true",
			 "property", "Readonly",
			 "apogy_units", "rad"
		   });	
		addAnnotation
		  (getVisibilityPassSpacecraftPosition_Range(), 
		   source, 
		   new String[] {
			 "documentation", "The range to the spacecraft.",
			 "notify", "true",
			 "property", "Readonly",
			 "apogy_units", "m"
		   });	
		addAnnotation
		  (getVisibilityPassSpacecraftPosition_RangeRate(), 
		   source, 
		   new String[] {
			 "documentation", "The relative speed of the spacecraft.",
			 "notify", "true",
			 "property", "Readonly",
			 "apogy_units", "m/s"
		   });	
		addAnnotation
		  (getVisibilityPassSpacecraftPosition_SpacecraftCrossTrackAngle(), 
		   source, 
		   new String[] {
			 "documentation", "The cross track angle of the surface location relative to the spacecraft nadir.",
			 "notify", "true",
			 "property", "Readonly",
			 "apogy_units", "rad"
		   });	
		addAnnotation
		  (getVisibilityPassSpacecraftPosition_SpacecraftAlongTrackAngle(), 
		   source, 
		   new String[] {
			 "documentation", "The along track angle of the surface location relative to the spacecraft nadir.",
			 "notify", "true",
			 "property", "Readonly",
			 "apogy_units", "rad"
		   });	
		addAnnotation
		  (getVisibilityPassSpacecraftPosition_SpacecraftCoordinates(), 
		   source, 
		   new String[] {
			 "documentation", "Spacecraft Geographical Coordinates.",
			 "notify", "true",
			 "property", "None"
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
			 "documentation", "The OrbitModel of the Spacecraft(s) to use for visibility calculation.",
			 "children", "true",
			 "notify", "true",
			 "property", "Editable"
		   });	
		addAnnotation
		  (getSpacecraftsVisibilitySet_GroundStations(), 
		   source, 
		   new String[] {
			 "documentation", "The ground station (s) for which to display Spacecraft visibility status.",
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
			 "documentation", "A map that contains the GroundStation to VisibilityPass relationships.",
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
			 "documentation", "The start time of the prediction period.",
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
			 "apogy_units", "s"
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
			 "apogy_units", "rad"
		   });	
		addAnnotation
		  (getSpacecraftSwathCorridor_RightSwathAngle(), 
		   source, 
		   new String[] {
			 "notify", "true",
			 "property", "Editable",
			 "propertyCategory", "SWATH",
			 "apogy_units", "rad"
		   });	
		addAnnotation
		  (getSpacecraftSwathCorridor_Corridor(), 
		   source, 
		   new String[] {
			 "documentation", "*\nThe corridor."
		   });	
		addAnnotation
		  (getApogyCoreEnvironmentOrbitEarthFacade__GetMu(), 
		   source, 
		   new String[] {
			 "documentation", "Returns the Earth gravitational constant from GRIM5C1 model: 3.986004415e14 m\u00b3/s\u00b2.",
			 "apogy_units", "m\u00b3/s\u00b2"
		   });	
		addAnnotation
		  (getApogyCoreEnvironmentOrbitEarthFacade__CreateAbsoluteDate__Date(), 
		   source, 
		   new String[] {
			 "documentation", "Creates an AbsoluteDate from a Date.\n@param date A date.\n@return The AbsoluteDate (OreKit type) for the specified date."
		   });	
		addAnnotation
		  (getApogyCoreEnvironmentOrbitEarthFacade__CreateDate__AbsoluteDate(), 
		   source, 
		   new String[] {
			 "documentation", "Creates an Date from a AbsoluteDate."
		   });	
		addAnnotation
		  (getApogyCoreEnvironmentOrbitEarthFacade__CreateEarthSurfaceLocation__String_String_double_double_double(), 
		   source, 
		   new String[] {
			 "documentation", "Creates an EarthSurfaceLocation from parameters.\n@param name The name of the location.\n@param description The description of the location.\n@param longitude The longitude of the location, in radians.\n@param latitude The latitude of the location, in radians.\n@param elevation The elevation of the location, in meters.\n@return The EarthSurfaceLocation."
		   });	
		addAnnotation
		  ((getApogyCoreEnvironmentOrbitEarthFacade__CreateEarthSurfaceLocation__String_String_double_double_double()).getEParameters().get(2), 
		   source, 
		   new String[] {
			 "apogy_units", "rad"
		   });	
		addAnnotation
		  ((getApogyCoreEnvironmentOrbitEarthFacade__CreateEarthSurfaceLocation__String_String_double_double_double()).getEParameters().get(3), 
		   source, 
		   new String[] {
			 "apogy_units", "rad"
		   });	
		addAnnotation
		  ((getApogyCoreEnvironmentOrbitEarthFacade__CreateEarthSurfaceLocation__String_String_double_double_double()).getEParameters().get(4), 
		   source, 
		   new String[] {
			 "apogy_units", "m"
		   });	
		addAnnotation
		  (getApogyCoreEnvironmentOrbitEarthFacade__CreateOreKitBackedFrame__Frame(), 
		   source, 
		   new String[] {
			 "documentation", "Create an OreKitBackedFrame based on an OreKit frame."
		   });	
		addAnnotation
		  (getApogyCoreEnvironmentOrbitEarthFacade__GetSpacecraftEarthSubPoint__OreKitBackedSpacecraftState(), 
		   source, 
		   new String[] {
			 "documentation", "Returns the geographic sub-point for a given spacecraft state."
		   });	
		addAnnotation
		  (getApogyCoreEnvironmentOrbitEarthFacade__GetSpacecraftElevationAngle__SpacecraftState_EarthSurfaceLocation(), 
		   source, 
		   new String[] {
			 "documentation", "Returns the elevation angle of a spacecraft relative\nto a Earth surface location.",
			 "apogy_units", "rad"
		   });	
		addAnnotation
		  (getApogyCoreEnvironmentOrbitEarthFacade__GetSpacecraftAzimuthAngle__SpacecraftState_EarthSurfaceLocation(), 
		   source, 
		   new String[] {
			 "documentation", "Returns the azimuth angle (relative to North) of a\nspacecraft at a Earth surface location.",
			 "apogy_units", "rad"
		   });	
		addAnnotation
		  (getApogyCoreEnvironmentOrbitEarthFacade__GetRange__SpacecraftState_EarthSurfaceLocation(), 
		   source, 
		   new String[] {
			 "documentation", "Returns the distance between spacecraft and a specified target.",
			 "apogy_units", "m"
		   });	
		addAnnotation
		  (getApogyCoreEnvironmentOrbitEarthFacade__CreateKeplerianOrbit__EarthOrbitPropagator(), 
		   source, 
		   new String[] {
			 "documentation", "Creates a Keplerian Orbit based on a EarthOrbitPropagator.\n@param earthOrbitPropagator The EarthOrbitPropagator.\n@return A KeplerianEarthOrbit representing the initial orbit of the propagator."
		   });	
		addAnnotation
		  (getApogyCoreEnvironmentOrbitEarthFacade__CreateCartesianEarthOrbit__EarthOrbitPropagator(), 
		   source, 
		   new String[] {
			 "documentation", "Creates a CartesianEarthOrbit Orbit based on a EarthOrbitPropagator.\n@param earthOrbitPropagator The EarthOrbitPropagator.\n@return A CartesianEarthOrbit representing the initial orbit of the propagator."
		   });	
		addAnnotation
		  (getApogyCoreEnvironmentOrbitEarthFacade__CreateKeplerianOrbit__KeplerianOrbit(), 
		   source, 
		   new String[] {
			 "documentation", "Creates a KeplerianEarthOrbit from an OreKit KeplerianOrbit.\n@param oreKitKeplerianOrbit The OreKit Keplerian Orbit.\n@return the associated KeplerianEarthOrbit."
		   });	
		addAnnotation
		  (getApogyCoreEnvironmentOrbitEarthFacade__CreateCartesianEarthOrbit__CartesianOrbit(), 
		   source, 
		   new String[] {
			 "documentation", "Creates a CartesianEarthOrbit from an OreKit CartesianOrbit.\n@param oreKitKeplerianOrbit The OreKit Cartesian Orbit.\n@return the associated CartesianEarthOrbit."
		   });	
		addAnnotation
		  (getApogyCoreEnvironmentOrbitEarthFacade__ConvertToGeographicCoordinates__OreKitBackedSpacecraftState(), 
		   source, 
		   new String[] {
			 "documentation", "Converts an OreKit SpacecraftState to GeographicCoordinates. The conversion uses the IERS_2010 frame with a WGS84 equatorial radius and earth flatenning.\n@param oreKitBackedSpacecraftState The OreKit SpacecraftState.\n@return the associated GeographicCoordinates."
		   });	
		addAnnotation
		  (getApogyCoreEnvironmentOrbitEarthFacade__GetSpacecraftStates__Propagator_Date_Date_double(), 
		   source, 
		   new String[] {
			 "documentation", "*\nReturn the list of spacecraft state a at given time interval.\n@param earthOrbitModel The EarthOrbitModel used.\n@param propagator The OreKit propagator to use.\n@param startDate The start time of the propagation.\n@param endDate The end time of the propagation.\n@param timeInterval The time interval between spacecraft state evaluation, in seconds.\nThe list of SpacecraftState. Never null, but can be empty."
		   });	
		addAnnotation
		  (getApogyCoreEnvironmentOrbitEarthFacade__GetTargetPasses__EarthOrbitModel_EarthSurfaceLocation_Date_Date_ElevationMask(), 
		   source, 
		   new String[] {
			 "documentation", "*\nReturns the list of passes for a given target.\n@param earthOrbitModel The EarthOrbitModel used.\n@param propagator The OreKit propagator to use.\n@param earthSurfaceLocation The location of the target.\n@param startDate The start time of the propagation.\n@param endDate The end time of the propagation.\n@param elevationMaks The elevation mask used to determine the visibility of the spacecraft at the target location.\n@param The list of VisibilityPass. Never null, but can be empty."
		   });	
		addAnnotation
		  (getApogyCoreEnvironmentOrbitEarthFacade__GetTargetPasses__EarthOrbitModel_List_Date_Date_ElevationMask_IProgressMonitor(), 
		   source, 
		   new String[] {
			 "documentation", "*\nReturns the list of passes for a list of targets.\n@param earthOrbitModel The EarthOrbitModel used.\n@param propagator The OreKit propagator to use.\n@param earthSurfaceLocations The list of the targets.\n@param startDate The start time of the propagation.\n@param endDate The end time of the propagation.\n@param elevationMaks The elevation mask used to determine the visibility of the spacecraft at the target locations.\n@param monitor A progress monitor, can be null.\n@return The list of VisibilityPass. Never null, but can be empty."
		   });	
		addAnnotation
		  (getApogyCoreEnvironmentOrbitEarthFacade__GetGroundStationPasses__EarthOrbitModel_GroundStation_Date_Date(), 
		   source, 
		   new String[] {
			 "documentation", "*\nReturns the list of passes for a given Ground Station (and its Field Of View) during a specified interval.\n@param propagator The OreKit propagator to use.\n@param groundStation The location of the target.\n@param startDate The start time of the propagation.\n@param endDate The end time of the propagation.\n@return The list of VisibilityPass. Never null, but can be empty."
		   });	
		addAnnotation
		  (getApogyCoreEnvironmentOrbitEarthFacade__GetGroundStationPasses__EarthOrbitModel_List_Date_Date_IProgressMonitor(), 
		   source, 
		   new String[] {
			 "documentation", "*\nReturns the list of passes for a list of Ground Station (and its Field Of View) during a specified interval.\n@param propagator The OreKit propagator to use.\n@param groundStation The list of targets.\n@param startDate The start time of the propagation.\n@param endDate The end time of the propagation.\n@return The list of VisibilityPass. Never null, but can be empty."
		   });	
		addAnnotation
		  (getApogyCoreEnvironmentOrbitEarthFacade__GetEclipses__EarthOrbitModel_Date_Date(), 
		   source, 
		   new String[] {
			 "documentation", "*\nReturns the list of {@link Eclipse} that will be experienced by the spacecraft within a specified time period.\n@param propagator The OreKit propagator to use.\n@param startDate The start time of the propagation.\n@param endDate The end time of the propagation.\n@return The list of Eclipse. Never null, but can be empty."
		   });	
		addAnnotation
		  (getApogyCoreEnvironmentOrbitEarthFacade__GetVisibilityPassSortedByStartDate__List(), 
		   source, 
		   new String[] {
			 "documentation", "Sorts a list of VisibilityPass by increasing date order (form earlier to later). If two or more VisibilityPass\nhave the same start date, they are ordered by duration.\n@param passes The list of VisibilityPass.\n@return the SortedSet of VisibilityPass."
		   });	
		addAnnotation
		  (getApogyCoreEnvironmentOrbitEarthFacade__GetVisibilityPassSortedByDuration__List(), 
		   source, 
		   new String[] {
			 "documentation", "Sorts a list of VisibilityPass by increasing duration. If two or more VisibilityPass\nhave the same duration, they are ordered by start date.\n@param passes The list of VisibilityPass.\n@return the SortedSet of VisibilityPass."
		   });	
		addAnnotation
		  (getApogyCoreEnvironmentOrbitEarthFacade__GetVisibilityPassSpacecraftPositionSortedByElevation__List(), 
		   source, 
		   new String[] {
			 "documentation", "Sorts a list of VisibilityPassSpacecraftPosition by increasing elevation.\n@param passes The list of VisibilityPassSpacecraftPosition.\n@return the SortedSet of VisibilityPassSpacecraftPosition."
		   });	
		addAnnotation
		  (getApogyCoreEnvironmentOrbitEarthFacade__GetVisibilityPassSpacecraftPositionSortedBySpacecraftCrossTrackAngle__List(), 
		   source, 
		   new String[] {
			 "documentation", "Sorts a list of VisibilityPassSpacecraftPosition by increasing spacecraft cross-track angle.\n@param passes The list of VisibilityPassSpacecraftPosition.\n@return the SortedSet of VisibilityPassSpacecraftPosition."
		   });	
		addAnnotation
		  (getApogyCoreEnvironmentOrbitEarthFacade__LoadTLE__String(), 
		   source, 
		   new String[] {
			 "documentation", "Loads a TLE from a URL.\n@param url The URL as a String.\n@return The loaded TLE"
		   });	
		addAnnotation
		  (getApogyCoreEnvironmentOrbitEarthFacade__ExportTLE__TLE_String(), 
		   source, 
		   new String[] {
			 "documentation", "Exports a TLE to a URL.\n@param tle The TLE to export\n@param url The URL as a String.\n@throws An exception if the export fails."
		   });	
		addAnnotation
		  (getApogyCoreEnvironmentOrbitEarthFacade__CreateTLEEarthOrbitModel__TLE(), 
		   source, 
		   new String[] {
			 "documentation", "Create a TLEEarthOrbitModel using a TLE.\n@param tle The Two-Line Element defining the propagator.\n@return The TLEEarthOrbitModel."
		   });	
		addAnnotation
		  (getApogyCoreEnvironmentOrbitEarthFacade__ExportAsCSV__VisibilityPassSpacecraftPositionHistory_boolean(), 
		   source, 
		   new String[] {
			 "documentation", "*\nExports a VisibilityPassSpacecraftPositionHistory as a comma separated file (.csv).\n@param visibilityPassSpacecraftPositionHistory The VisibilityPassSpacecraftPositionHistory to export.\n@param includeHeader Whether or not to include a header line in the format."
		   });	
		addAnnotation
		  (eclipseEClass, 
		   source, 
		   new String[] {
			 "documentation", "Defines an Eclipse for spacecrafts."
		   });	
		addAnnotation
		  (getEclipse_PenumbraEntry(), 
		   source, 
		   new String[] {
			 "documentation", "Entry in Penumbra.",
			 "notify", "true",
			 "property", "None"
		   });	
		addAnnotation
		  (getEclipse_UmbraEntry(), 
		   source, 
		   new String[] {
			 "documentation", "Entry in Umbra, can be null.",
			 "notify", "true",
			 "property", "None"
		   });	
		addAnnotation
		  (getEclipse_UmbraExit(), 
		   source, 
		   new String[] {
			 "documentation", "Exit from Umbra, can be null.",
			 "notify", "true",
			 "property", "None"
		   });	
		addAnnotation
		  (getEclipse_PenumbraExit(), 
		   source, 
		   new String[] {
			 "documentation", "Exit from Penumbra, can be null.",
			 "notify", "true",
			 "property", "None"
		   });	
		addAnnotation
		  (eclipseEventEClass, 
		   source, 
		   new String[] {
			 "documentation", "Eclipse Event."
		   });	
		addAnnotation
		  (eclipseEventTypeEEnum, 
		   source, 
		   new String[] {
			 "documentation", "Eclipse Event Type."
		   });
	}

} //ApogyCoreEnvironmentOrbitEarthPackageImpl
