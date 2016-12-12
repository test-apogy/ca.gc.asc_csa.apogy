/**
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
package ca.gc.asc_csa.apogy.core.environment.earth.surface.impl;

import ca.gc.asc_csa.apogy.common.math.ApogyCommonMathPackage;

import ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyPackage;

import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage;

import ca.gc.asc_csa.apogy.core.environment.earth.ApogyEarthEnvironmentPackage;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.ApogyEarthSurfaceEnvironmentFacade;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.ApogyEarthSurfaceEnvironmentFactory;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.ApogyEarthSurfaceEnvironmentPackage;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.AstronomyUtils;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.AtmosphereUtils;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.EarthSky;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.EarthSkyNode;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.EarthSurfaceWorksite;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.EarthSurfaceWorksiteNode;
import ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentPackage;

import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import javax.vecmath.Point3d;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyEarthSurfaceEnvironmentPackageImpl extends EPackageImpl implements ApogyEarthSurfaceEnvironmentPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass earthSurfaceWorksiteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass earthSkyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass earthSurfaceWorksiteNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass earthSkyNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apogyEarthSurfaceEnvironmentFacadeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atmosphereUtilsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass astronomyUtilsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType point3dEDataType = null;

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
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.ApogyEarthSurfaceEnvironmentPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ApogyEarthSurfaceEnvironmentPackageImpl() {
		super(eNS_URI, ApogyEarthSurfaceEnvironmentFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ApogyEarthSurfaceEnvironmentPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ApogyEarthSurfaceEnvironmentPackage init() {
		if (isInited) return (ApogyEarthSurfaceEnvironmentPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyEarthSurfaceEnvironmentPackage.eNS_URI);

		// Obtain or create and register package
		ApogyEarthSurfaceEnvironmentPackageImpl theApogyEarthSurfaceEnvironmentPackage = (ApogyEarthSurfaceEnvironmentPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ApogyEarthSurfaceEnvironmentPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ApogyEarthSurfaceEnvironmentPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ApogySurfaceEnvironmentPackage.eINSTANCE.eClass();
		ApogyEarthEnvironmentPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theApogyEarthSurfaceEnvironmentPackage.createPackageContents();

		// Initialize created meta-data
		theApogyEarthSurfaceEnvironmentPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theApogyEarthSurfaceEnvironmentPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ApogyEarthSurfaceEnvironmentPackage.eNS_URI, theApogyEarthSurfaceEnvironmentPackage);
		return theApogyEarthSurfaceEnvironmentPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEarthSurfaceWorksite() {
		return earthSurfaceWorksiteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEarthSurfaceWorksite_GeographicalCoordinates() {
		return (EReference)earthSurfaceWorksiteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEarthSurfaceWorksite_XAxisAzimuth() {
		return (EAttribute)earthSurfaceWorksiteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEarthSurfaceWorksite_EarthSky() {
		return (EReference)earthSurfaceWorksiteEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEarthSurfaceWorksite__ConvertToGeographicCoordinates__Tuple3d() {
		return earthSurfaceWorksiteEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEarthSurfaceWorksite__ConvertToXYZPosition__GeographicCoordinates() {
		return earthSurfaceWorksiteEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEarthSky() {
		return earthSkyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEarthSky_SunHorizontalCoordinates() {
		return (EReference)earthSkyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEarthSky_Moon() {
		return (EReference)earthSkyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEarthSky_MoonHorizontalCoordinates() {
		return (EReference)earthSkyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEarthSky__GetMoonAngularDiameter() {
		return earthSkyEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEarthSurfaceWorksiteNode() {
		return earthSurfaceWorksiteNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEarthSurfaceWorksiteNode_SkyTransformNode() {
		return (EReference)earthSurfaceWorksiteNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEarthSkyNode() {
		return earthSkyNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApogyEarthSurfaceEnvironmentFacade() {
		return apogyEarthSurfaceEnvironmentFacadeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyEarthSurfaceEnvironmentFacade__CreateAndInitializeDefaultCSAWorksite() {
		return apogyEarthSurfaceEnvironmentFacadeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyEarthSurfaceEnvironmentFacade__InitializeEarthSkyNode__EarthSky_EarthSkyNode() {
		return apogyEarthSurfaceEnvironmentFacadeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyEarthSurfaceEnvironmentFacade__GetMarsYardGeographicalCoordinates() {
		return apogyEarthSurfaceEnvironmentFacadeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyEarthSurfaceEnvironmentFacade__GetMarsYardTransformNode() {
		return apogyEarthSurfaceEnvironmentFacadeEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyEarthSurfaceEnvironmentFacade__CreateApogySession() {
		return apogyEarthSurfaceEnvironmentFacadeEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtmosphereUtils() {
		return atmosphereUtilsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAtmosphereUtils__GetAirMass__double() {
		return atmosphereUtilsEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAtmosphereUtils__GetDirectSunIntensity__double_double() {
		return atmosphereUtilsEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAtmosphereUtils__GetDiffuseSunIntensity__double_double() {
		return atmosphereUtilsEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAtmosphereUtils__GetAtmosphereRefractionCorrection__double() {
		return atmosphereUtilsEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAstronomyUtils() {
		return astronomyUtilsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAstronomyUtils__GetSunEquatorialPosition__double() {
		return astronomyUtilsEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAstronomyUtils__GetHorizontalSunPosition__Date_double_double() {
		return astronomyUtilsEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAstronomyUtils__GetMoonEquatorialPosition__double() {
		return astronomyUtilsEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAstronomyUtils__GetMoonTopocentricEquatorialPosition__Date_double_double() {
		return astronomyUtilsEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAstronomyUtils__GetHorizontalMoonPosition__Date_double_double() {
		return astronomyUtilsEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAstronomyUtils__GetTimeSinceJ2000__double() {
		return astronomyUtilsEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAstronomyUtils__GetLocalSideralTime__Date_double() {
		return astronomyUtilsEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAstronomyUtils__GetUTCDecimalHours__Date() {
		return astronomyUtilsEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAstronomyUtils__ConvertToHorizontalCoordinates__EquatorialCoordinates_double_double_Date() {
		return astronomyUtilsEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAstronomyUtils__ConvertTimeToAngle__int_int_int() {
		return astronomyUtilsEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAstronomyUtils__ClampAngleToZero2PI__double() {
		return astronomyUtilsEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAstronomyUtils__ConvertToEquatorialCoordinates__EclipticCoordinates() {
		return astronomyUtilsEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAstronomyUtils__ConvertToEclipticCoordinates__EquatorialCoordinates() {
		return astronomyUtilsEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAstronomyUtils__ConvertFromEquatorialRectangularToEclipticRectangular__Point3d() {
		return astronomyUtilsEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAstronomyUtils__ConvertFromEclipticRectangularToEquatorialRectangular__Point3d() {
		return astronomyUtilsEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAstronomyUtils__ConvertFromEclipticRectangularToEclipticCoordinates__Point3d() {
		return astronomyUtilsEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAstronomyUtils__ConvertFromEquatorialRectangularToEquatorialCoordinates__Point3d() {
		return astronomyUtilsEClass.getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAstronomyUtils__ConvertFromHorizontalCoordinatesToHorizontalRectangular__HorizontalCoordinates() {
		return astronomyUtilsEClass.getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAstronomyUtils__ConvertFromEquatorialCoordinatesToEquatorialRectangular__EquatorialCoordinates() {
		return astronomyUtilsEClass.getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAstronomyUtils__ConvertAUtoMeters__double() {
		return astronomyUtilsEClass.getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAstronomyUtils__GetMaximumSunAltitude__double() {
		return astronomyUtilsEClass.getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAstronomyUtils__ConvertToHHmmssString__double() {
		return astronomyUtilsEClass.getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAstronomyUtils__GetSunRiseTime__Date_double_double() {
		return astronomyUtilsEClass.getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAstronomyUtils__GetSunSetTime__Date_double_double() {
		return astronomyUtilsEClass.getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAstronomyUtils__GetSunHighestElevationTime__Date_double_double() {
		return astronomyUtilsEClass.getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPoint3d() {
		return point3dEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyEarthSurfaceEnvironmentFactory getApogyEarthSurfaceEnvironmentFactory() {
		return (ApogyEarthSurfaceEnvironmentFactory)getEFactoryInstance();
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
		earthSurfaceWorksiteEClass = createEClass(EARTH_SURFACE_WORKSITE);
		createEReference(earthSurfaceWorksiteEClass, EARTH_SURFACE_WORKSITE__GEOGRAPHICAL_COORDINATES);
		createEAttribute(earthSurfaceWorksiteEClass, EARTH_SURFACE_WORKSITE__XAXIS_AZIMUTH);
		createEReference(earthSurfaceWorksiteEClass, EARTH_SURFACE_WORKSITE__EARTH_SKY);
		createEOperation(earthSurfaceWorksiteEClass, EARTH_SURFACE_WORKSITE___CONVERT_TO_GEOGRAPHIC_COORDINATES__TUPLE3D);
		createEOperation(earthSurfaceWorksiteEClass, EARTH_SURFACE_WORKSITE___CONVERT_TO_XYZ_POSITION__GEOGRAPHICCOORDINATES);

		earthSkyEClass = createEClass(EARTH_SKY);
		createEReference(earthSkyEClass, EARTH_SKY__SUN_HORIZONTAL_COORDINATES);
		createEReference(earthSkyEClass, EARTH_SKY__MOON);
		createEReference(earthSkyEClass, EARTH_SKY__MOON_HORIZONTAL_COORDINATES);
		createEOperation(earthSkyEClass, EARTH_SKY___GET_MOON_ANGULAR_DIAMETER);

		earthSurfaceWorksiteNodeEClass = createEClass(EARTH_SURFACE_WORKSITE_NODE);
		createEReference(earthSurfaceWorksiteNodeEClass, EARTH_SURFACE_WORKSITE_NODE__SKY_TRANSFORM_NODE);

		earthSkyNodeEClass = createEClass(EARTH_SKY_NODE);

		apogyEarthSurfaceEnvironmentFacadeEClass = createEClass(APOGY_EARTH_SURFACE_ENVIRONMENT_FACADE);
		createEOperation(apogyEarthSurfaceEnvironmentFacadeEClass, APOGY_EARTH_SURFACE_ENVIRONMENT_FACADE___CREATE_AND_INITIALIZE_DEFAULT_CSA_WORKSITE);
		createEOperation(apogyEarthSurfaceEnvironmentFacadeEClass, APOGY_EARTH_SURFACE_ENVIRONMENT_FACADE___INITIALIZE_EARTH_SKY_NODE__EARTHSKY_EARTHSKYNODE);
		createEOperation(apogyEarthSurfaceEnvironmentFacadeEClass, APOGY_EARTH_SURFACE_ENVIRONMENT_FACADE___GET_MARS_YARD_GEOGRAPHICAL_COORDINATES);
		createEOperation(apogyEarthSurfaceEnvironmentFacadeEClass, APOGY_EARTH_SURFACE_ENVIRONMENT_FACADE___GET_MARS_YARD_TRANSFORM_NODE);
		createEOperation(apogyEarthSurfaceEnvironmentFacadeEClass, APOGY_EARTH_SURFACE_ENVIRONMENT_FACADE___CREATE_APOGY_SESSION);

		atmosphereUtilsEClass = createEClass(ATMOSPHERE_UTILS);
		createEOperation(atmosphereUtilsEClass, ATMOSPHERE_UTILS___GET_AIR_MASS__DOUBLE);
		createEOperation(atmosphereUtilsEClass, ATMOSPHERE_UTILS___GET_DIRECT_SUN_INTENSITY__DOUBLE_DOUBLE);
		createEOperation(atmosphereUtilsEClass, ATMOSPHERE_UTILS___GET_DIFFUSE_SUN_INTENSITY__DOUBLE_DOUBLE);
		createEOperation(atmosphereUtilsEClass, ATMOSPHERE_UTILS___GET_ATMOSPHERE_REFRACTION_CORRECTION__DOUBLE);

		astronomyUtilsEClass = createEClass(ASTRONOMY_UTILS);
		createEOperation(astronomyUtilsEClass, ASTRONOMY_UTILS___GET_SUN_EQUATORIAL_POSITION__DOUBLE);
		createEOperation(astronomyUtilsEClass, ASTRONOMY_UTILS___GET_HORIZONTAL_SUN_POSITION__DATE_DOUBLE_DOUBLE);
		createEOperation(astronomyUtilsEClass, ASTRONOMY_UTILS___GET_MOON_EQUATORIAL_POSITION__DOUBLE);
		createEOperation(astronomyUtilsEClass, ASTRONOMY_UTILS___GET_MOON_TOPOCENTRIC_EQUATORIAL_POSITION__DATE_DOUBLE_DOUBLE);
		createEOperation(astronomyUtilsEClass, ASTRONOMY_UTILS___GET_HORIZONTAL_MOON_POSITION__DATE_DOUBLE_DOUBLE);
		createEOperation(astronomyUtilsEClass, ASTRONOMY_UTILS___GET_TIME_SINCE_J2000__DOUBLE);
		createEOperation(astronomyUtilsEClass, ASTRONOMY_UTILS___GET_LOCAL_SIDERAL_TIME__DATE_DOUBLE);
		createEOperation(astronomyUtilsEClass, ASTRONOMY_UTILS___GET_UTC_DECIMAL_HOURS__DATE);
		createEOperation(astronomyUtilsEClass, ASTRONOMY_UTILS___CONVERT_TO_HORIZONTAL_COORDINATES__EQUATORIALCOORDINATES_DOUBLE_DOUBLE_DATE);
		createEOperation(astronomyUtilsEClass, ASTRONOMY_UTILS___CONVERT_TIME_TO_ANGLE__INT_INT_INT);
		createEOperation(astronomyUtilsEClass, ASTRONOMY_UTILS___CLAMP_ANGLE_TO_ZERO2_PI__DOUBLE);
		createEOperation(astronomyUtilsEClass, ASTRONOMY_UTILS___CONVERT_TO_EQUATORIAL_COORDINATES__ECLIPTICCOORDINATES);
		createEOperation(astronomyUtilsEClass, ASTRONOMY_UTILS___CONVERT_TO_ECLIPTIC_COORDINATES__EQUATORIALCOORDINATES);
		createEOperation(astronomyUtilsEClass, ASTRONOMY_UTILS___CONVERT_FROM_EQUATORIAL_RECTANGULAR_TO_ECLIPTIC_RECTANGULAR__POINT3D);
		createEOperation(astronomyUtilsEClass, ASTRONOMY_UTILS___CONVERT_FROM_ECLIPTIC_RECTANGULAR_TO_EQUATORIAL_RECTANGULAR__POINT3D);
		createEOperation(astronomyUtilsEClass, ASTRONOMY_UTILS___CONVERT_FROM_ECLIPTIC_RECTANGULAR_TO_ECLIPTIC_COORDINATES__POINT3D);
		createEOperation(astronomyUtilsEClass, ASTRONOMY_UTILS___CONVERT_FROM_EQUATORIAL_RECTANGULAR_TO_EQUATORIAL_COORDINATES__POINT3D);
		createEOperation(astronomyUtilsEClass, ASTRONOMY_UTILS___CONVERT_FROM_HORIZONTAL_COORDINATES_TO_HORIZONTAL_RECTANGULAR__HORIZONTALCOORDINATES);
		createEOperation(astronomyUtilsEClass, ASTRONOMY_UTILS___CONVERT_FROM_EQUATORIAL_COORDINATES_TO_EQUATORIAL_RECTANGULAR__EQUATORIALCOORDINATES);
		createEOperation(astronomyUtilsEClass, ASTRONOMY_UTILS___CONVERT_AUTO_METERS__DOUBLE);
		createEOperation(astronomyUtilsEClass, ASTRONOMY_UTILS___GET_MAXIMUM_SUN_ALTITUDE__DOUBLE);
		createEOperation(astronomyUtilsEClass, ASTRONOMY_UTILS___CONVERT_TO_HHMMSS_STRING__DOUBLE);
		createEOperation(astronomyUtilsEClass, ASTRONOMY_UTILS___GET_SUN_RISE_TIME__DATE_DOUBLE_DOUBLE);
		createEOperation(astronomyUtilsEClass, ASTRONOMY_UTILS___GET_SUN_SET_TIME__DATE_DOUBLE_DOUBLE);
		createEOperation(astronomyUtilsEClass, ASTRONOMY_UTILS___GET_SUN_HIGHEST_ELEVATION_TIME__DATE_DOUBLE_DOUBLE);

		// Create data types
		point3dEDataType = createEDataType(POINT3D);
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
		ApogySurfaceEnvironmentPackage theApogySurfaceEnvironmentPackage = (ApogySurfaceEnvironmentPackage)EPackage.Registry.INSTANCE.getEPackage(ApogySurfaceEnvironmentPackage.eNS_URI);
		ApogyEarthEnvironmentPackage theApogyEarthEnvironmentPackage = (ApogyEarthEnvironmentPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyEarthEnvironmentPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		ApogyCommonMathPackage theApogyCommonMathPackage = (ApogyCommonMathPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCommonMathPackage.eNS_URI);
		ApogyCoreEnvironmentPackage theApogyCoreEnvironmentPackage = (ApogyCoreEnvironmentPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCoreEnvironmentPackage.eNS_URI);
		ApogyCommonTopologyPackage theApogyCommonTopologyPackage = (ApogyCommonTopologyPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCommonTopologyPackage.eNS_URI);
		ApogyCoreInvocatorPackage theApogyCoreInvocatorPackage = (ApogyCoreInvocatorPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCoreInvocatorPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		earthSurfaceWorksiteEClass.getESuperTypes().add(theApogySurfaceEnvironmentPackage.getSurfaceWorksite());
		earthSkyEClass.getESuperTypes().add(theApogyCoreEnvironmentPackage.getSky());
		earthSurfaceWorksiteNodeEClass.getESuperTypes().add(theApogySurfaceEnvironmentPackage.getSurfaceWorksiteNode());
		earthSkyNodeEClass.getESuperTypes().add(theApogyCoreEnvironmentPackage.getSkyNode());

		// Initialize classes, features, and operations; add parameters
		initEClass(earthSurfaceWorksiteEClass, EarthSurfaceWorksite.class, "EarthSurfaceWorksite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEarthSurfaceWorksite_GeographicalCoordinates(), theApogyEarthEnvironmentPackage.getGeographicCoordinates(), null, "geographicalCoordinates", null, 1, 1, EarthSurfaceWorksite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEarthSurfaceWorksite_XAxisAzimuth(), theEcorePackage.getEDouble(), "xAxisAzimuth", "0", 0, 1, EarthSurfaceWorksite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEarthSurfaceWorksite_EarthSky(), this.getEarthSky(), null, "earthSky", null, 1, 1, EarthSurfaceWorksite.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getEarthSurfaceWorksite__ConvertToGeographicCoordinates__Tuple3d(), theApogyEarthEnvironmentPackage.getGeographicCoordinates(), "convertToGeographicCoordinates", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCommonMathPackage.getTuple3d(), "position", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEarthSurfaceWorksite__ConvertToXYZPosition__GeographicCoordinates(), theApogyCommonMathPackage.getTuple3d(), "convertToXYZPosition", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyEarthEnvironmentPackage.getGeographicCoordinates(), "geographicalCoordinates", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(earthSkyEClass, EarthSky.class, "EarthSky", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEarthSky_SunHorizontalCoordinates(), theApogyEarthEnvironmentPackage.getHorizontalCoordinates(), null, "sunHorizontalCoordinates", null, 0, 1, EarthSky.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEarthSky_Moon(), theApogyCoreEnvironmentPackage.getMoon(), null, "moon", null, 0, 1, EarthSky.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEarthSky_MoonHorizontalCoordinates(), theApogyEarthEnvironmentPackage.getHorizontalCoordinates(), null, "moonHorizontalCoordinates", null, 0, 1, EarthSky.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEOperation(getEarthSky__GetMoonAngularDiameter(), theEcorePackage.getEDouble(), "getMoonAngularDiameter", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(earthSurfaceWorksiteNodeEClass, EarthSurfaceWorksiteNode.class, "EarthSurfaceWorksiteNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEarthSurfaceWorksiteNode_SkyTransformNode(), theApogyCommonTopologyPackage.getTransformNode(), null, "skyTransformNode", null, 0, 1, EarthSurfaceWorksiteNode.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(earthSkyNodeEClass, EarthSkyNode.class, "EarthSkyNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(apogyEarthSurfaceEnvironmentFacadeEClass, ApogyEarthSurfaceEnvironmentFacade.class, "ApogyEarthSurfaceEnvironmentFacade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getApogyEarthSurfaceEnvironmentFacade__CreateAndInitializeDefaultCSAWorksite(), this.getEarthSurfaceWorksite(), "createAndInitializeDefaultCSAWorksite", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyEarthSurfaceEnvironmentFacade__InitializeEarthSkyNode__EarthSky_EarthSkyNode(), null, "initializeEarthSkyNode", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEarthSky(), "earthSky", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEarthSkyNode(), "earthSkyNode", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getApogyEarthSurfaceEnvironmentFacade__GetMarsYardGeographicalCoordinates(), theApogyEarthEnvironmentPackage.getGeographicCoordinates(), "getMarsYardGeographicalCoordinates", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getApogyEarthSurfaceEnvironmentFacade__GetMarsYardTransformNode(), theApogyCommonTopologyPackage.getTransformNode(), "getMarsYardTransformNode", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getApogyEarthSurfaceEnvironmentFacade__CreateApogySession(), theApogyCoreInvocatorPackage.getInvocatorSession(), "createApogySession", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(atmosphereUtilsEClass, AtmosphereUtils.class, "AtmosphereUtils", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getAtmosphereUtils__GetAirMass__double(), theEcorePackage.getEDouble(), "getAirMass", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "sunAltitudeAngle", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAtmosphereUtils__GetDirectSunIntensity__double_double(), theEcorePackage.getEDouble(), "getDirectSunIntensity", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "sunAltitudeAngle", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "heightAboveSeaLevel", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAtmosphereUtils__GetDiffuseSunIntensity__double_double(), theEcorePackage.getEDouble(), "getDiffuseSunIntensity", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "sunAltitudeAngle", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "heightAboveSeaLevel", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAtmosphereUtils__GetAtmosphereRefractionCorrection__double(), theEcorePackage.getEDouble(), "getAtmosphereRefractionCorrection", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "geometricAltitude", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(astronomyUtilsEClass, AstronomyUtils.class, "AstronomyUtils", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getAstronomyUtils__GetSunEquatorialPosition__double(), theApogyCoreEnvironmentPackage.getEquatorialCoordinates(), "getSunEquatorialPosition", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "julianDay", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAstronomyUtils__GetHorizontalSunPosition__Date_double_double(), theApogyEarthEnvironmentPackage.getHorizontalCoordinates(), "getHorizontalSunPosition", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDate(), "date", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "observerLongitude", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "observerLatitude", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAstronomyUtils__GetMoonEquatorialPosition__double(), theApogyCoreEnvironmentPackage.getEquatorialCoordinates(), "getMoonEquatorialPosition", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "julianDay", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAstronomyUtils__GetMoonTopocentricEquatorialPosition__Date_double_double(), theApogyCoreEnvironmentPackage.getEquatorialCoordinates(), "getMoonTopocentricEquatorialPosition", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDate(), "date", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "observerLongitude", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "observerLatitude", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAstronomyUtils__GetHorizontalMoonPosition__Date_double_double(), theApogyEarthEnvironmentPackage.getHorizontalCoordinates(), "getHorizontalMoonPosition", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDate(), "date", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "observerLongitude", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "observerLatitude", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAstronomyUtils__GetTimeSinceJ2000__double(), theEcorePackage.getEDouble(), "getTimeSinceJ2000", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "julianDay", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAstronomyUtils__GetLocalSideralTime__Date_double(), theEcorePackage.getEDouble(), "getLocalSideralTime", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDate(), "date", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "observerLongitude", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAstronomyUtils__GetUTCDecimalHours__Date(), theEcorePackage.getEDouble(), "getUTCDecimalHours", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDate(), "date", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAstronomyUtils__ConvertToHorizontalCoordinates__EquatorialCoordinates_double_double_Date(), theApogyEarthEnvironmentPackage.getHorizontalCoordinates(), "convertToHorizontalCoordinates", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCoreEnvironmentPackage.getEquatorialCoordinates(), "equatorialCoordinates", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "observerLongitude", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "observerLatitude", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDate(), "date", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAstronomyUtils__ConvertTimeToAngle__int_int_int(), theEcorePackage.getEDouble(), "convertTimeToAngle", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "hours", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "minutes", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "seconds", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAstronomyUtils__ClampAngleToZero2PI__double(), theEcorePackage.getEDouble(), "clampAngleToZero2PI", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "angleInRadians", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAstronomyUtils__ConvertToEquatorialCoordinates__EclipticCoordinates(), theApogyCoreEnvironmentPackage.getEquatorialCoordinates(), "convertToEquatorialCoordinates", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyEarthEnvironmentPackage.getEclipticCoordinates(), "eclipticCoordinates", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAstronomyUtils__ConvertToEclipticCoordinates__EquatorialCoordinates(), theApogyEarthEnvironmentPackage.getEclipticCoordinates(), "convertToEclipticCoordinates", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCoreEnvironmentPackage.getEquatorialCoordinates(), "equatorialCoordinates", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAstronomyUtils__ConvertFromEquatorialRectangularToEclipticRectangular__Point3d(), this.getPoint3d(), "convertFromEquatorialRectangularToEclipticRectangular", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPoint3d(), "equatorialRectangularCoordinates", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAstronomyUtils__ConvertFromEclipticRectangularToEquatorialRectangular__Point3d(), this.getPoint3d(), "convertFromEclipticRectangularToEquatorialRectangular", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPoint3d(), "eclipticCoordinates", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAstronomyUtils__ConvertFromEclipticRectangularToEclipticCoordinates__Point3d(), theApogyEarthEnvironmentPackage.getEclipticCoordinates(), "convertFromEclipticRectangularToEclipticCoordinates", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPoint3d(), "eclipticCoordinates", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAstronomyUtils__ConvertFromEquatorialRectangularToEquatorialCoordinates__Point3d(), theApogyCoreEnvironmentPackage.getEquatorialCoordinates(), "convertFromEquatorialRectangularToEquatorialCoordinates", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPoint3d(), "equatorialCoordinates", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAstronomyUtils__ConvertFromHorizontalCoordinatesToHorizontalRectangular__HorizontalCoordinates(), this.getPoint3d(), "convertFromHorizontalCoordinatesToHorizontalRectangular", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyEarthEnvironmentPackage.getHorizontalCoordinates(), "horizontalCoordinates", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAstronomyUtils__ConvertFromEquatorialCoordinatesToEquatorialRectangular__EquatorialCoordinates(), this.getPoint3d(), "convertFromEquatorialCoordinatesToEquatorialRectangular", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCoreEnvironmentPackage.getEquatorialCoordinates(), "equatorialCoordinates", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAstronomyUtils__ConvertAUtoMeters__double(), theEcorePackage.getEDouble(), "convertAUtoMeters", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "astronomicalUnits", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAstronomyUtils__GetMaximumSunAltitude__double(), theEcorePackage.getEDouble(), "getMaximumSunAltitude", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "observerLatitude", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAstronomyUtils__ConvertToHHmmssString__double(), theEcorePackage.getEString(), "convertToHHmmssString", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "sideralTime", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAstronomyUtils__GetSunRiseTime__Date_double_double(), theEcorePackage.getEDate(), "getSunRiseTime", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDate(), "day", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "observerLongitude", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "observerLatitude", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAstronomyUtils__GetSunSetTime__Date_double_double(), theEcorePackage.getEDate(), "getSunSetTime", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDate(), "day", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "observerLongitude", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "observerLatitude", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAstronomyUtils__GetSunHighestElevationTime__Date_double_double(), theEcorePackage.getEDate(), "getSunHighestElevationTime", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDate(), "day", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "observerLongitude", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "observerLatitude", 0, 1, !IS_UNIQUE, IS_ORDERED);

		// Initialize data types
		initEDataType(point3dEDataType, Point3d.class, "Point3d", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

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
			 "prefix", "ApogyEarthSurfaceEnvironment",
			 "childCreationExtenders", "true",
			 "extensibleProviderFactory", "true",
			 "multipleEditorPages", "false",
			 "copyrightText", "Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Pierre Allard (Pierre.Allard@canada.ca), \n    Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n    Sebastien Gemme (Sebastien.Gemme@canada.ca),\n    Canadian Space Agency (CSA) - Initial API and implementation",
			 "modelName", "ApogyCoreEnvironment",
			 "complianceLevel", "6.0",
			 "suppressGenModelAnnotations", "false",
			 "dynamicTemplates", "true",
			 "templateDirectory", "platform:/plugin/ca.gc.asc_csa.apogy.common.emf.templates",
			 "modelDirectory", "/ca.gc.asc_csa.apogy.core.environment.earth.surface/src-generated",
			 "editDirectory", "/ca.gc.asc_csa.apogy.core.environment.earth.surface.edit/src-generated",
			 "basePackage", "ca.gc.asc_csa.apogy.core.environment.earth"
		   });	
		addAnnotation
		  (earthSurfaceWorksiteEClass, 
		   source, 
		   new String[] {
			 "documentation", "A specialization of Worksite defining a are or volume at the Earth surface."
		   });	
		addAnnotation
		  (getEarthSurfaceWorksite__ConvertToGeographicCoordinates__Tuple3d(), 
		   source, 
		   new String[] {
			 "documentation", "Converts a position expressed as XYZ in the EarthSurfaceWorksite frame\nto a WS84 GeographicCoordinates.\n@param position The position in the worksite coordinates system.\n@return The GeographicCoordinates of the position, in the WS84 datum."
		   });	
		addAnnotation
		  (getEarthSurfaceWorksite__ConvertToXYZPosition__GeographicCoordinates(), 
		   source, 
		   new String[] {
			 "documentation", "Converts a WS84 GeographicCoordinates to a XYZ position in the EarthSurfaceWorksite frame.\n@param geographicalCoordinates The geographical coordinates expressed in the WS84 datum.\n@return The XYZ position in the worksite coordinates system."
		   });	
		addAnnotation
		  (getEarthSurfaceWorksite_GeographicalCoordinates(), 
		   source, 
		   new String[] {
			 "documentation", "The geographical coordinates of the origin of the worksite, in the WS84 datum."
		   });	
		addAnnotation
		  (getEarthSurfaceWorksite_XAxisAzimuth(), 
		   source, 
		   new String[] {
			 "documentation", "Azimuth, relative to true North, of the X axis of the worksite\ncoordinates system. Follows the right hand rule.\nNote that the Z axis is pointing up (toward zenith).",
			 "apogy_units", "rad"
		   });	
		addAnnotation
		  (getEarthSurfaceWorksite_EarthSky(), 
		   source, 
		   new String[] {
			 "documentation", "The EarthSky associated with the worksite,"
		   });	
		addAnnotation
		  (earthSkyEClass, 
		   source, 
		   new String[] {
			 "documentation", "A specialization of the Sky for Earth use that adds the Moon. The position of the Moon is\nupdated, along with the Sun and stars, when the time is changed."
		   });	
		addAnnotation
		  (getEarthSky__GetMoonAngularDiameter(), 
		   source, 
		   new String[] {
			 "documentation", "Returns the Moon angular diameter, in radians.",
			 "propertyCategory", "MOON",
			 "apogy_units", "rad"
		   });	
		addAnnotation
		  (getEarthSky_SunHorizontalCoordinates(), 
		   source, 
		   new String[] {
			 "documentation", "The current HorizontalCordinates of the Sun.",
			 "propertyCategory", "SUN"
		   });	
		addAnnotation
		  (getEarthSky_Moon(), 
		   source, 
		   new String[] {
			 "documentation", "The Moon in the sky.",
			 "propertyCategory", "MOON"
		   });	
		addAnnotation
		  (getEarthSky_MoonHorizontalCoordinates(), 
		   source, 
		   new String[] {
			 "documentation", "The current HorizontalCordinates of the Moon.",
			 "propertyCategory", "MOON"
		   });	
		addAnnotation
		  (earthSurfaceWorksiteNodeEClass, 
		   source, 
		   new String[] {
			 "documentation", " -------------------------------------------------------------------------\n\nSpecific Topology Nodes.\n\n-------------------------------------------------------------------------"
		   });	
		addAnnotation
		  (earthSkyNodeEClass, 
		   source, 
		   new String[] {
			 "documentation", "SkyNode specialized for the Earth Sky."
		   });	
		addAnnotation
		  (apogyEarthSurfaceEnvironmentFacadeEClass, 
		   source, 
		   new String[] {
			 "documentation", " -------------------------------------------------------------------------\n\nFacade\n\n-------------------------------------------------------------------------"
		   });	
		addAnnotation
		  (getApogyEarthSurfaceEnvironmentFacade__CreateAndInitializeDefaultCSAWorksite(), 
		   source, 
		   new String[] {
			 "documentation", "Create an empty EarthSurfaceWorksite with the CSA Mars Yard coordinates."
		   });	
		addAnnotation
		  (getApogyEarthSurfaceEnvironmentFacade__InitializeEarthSkyNode__EarthSky_EarthSkyNode(), 
		   source, 
		   new String[] {
			 "documentation", "*\nInitialize a EarthSkyNode using an EarthSky."
		   });	
		addAnnotation
		  (getApogyEarthSurfaceEnvironmentFacade__GetMarsYardGeographicalCoordinates(), 
		   source, 
		   new String[] {
			 "documentation", "*\nReturn the GeographicCoordinates of the CSA Mars Yard."
		   });	
		addAnnotation
		  (getApogyEarthSurfaceEnvironmentFacade__CreateApogySession(), 
		   source, 
		   new String[] {
			 "documentation", "*\nCreates an invocator session containing a fully initialized EarthSurfaceWorksite."
		   });	
		addAnnotation
		  (atmosphereUtilsEClass, 
		   source, 
		   new String[] {
			 "documentation", " -------------------------------------------------------------------------\n\nUtilities classes.\n\n-------------------------------------------------------------------------"
		   });	
		addAnnotation
		  (getAtmosphereUtils__GetAirMass__double(), 
		   source, 
		   new String[] {
			 "documentation", "Computes the air mass. The Air Mass is the path length which light\ntakes through the atmosphere normalized to the shortest possible path\nlength (that is, when the sun is directly overhead). The Air Mass\nquantifies the reduction in the power of light as it passes through\nthe atmosphere and is absorbed by air and dust.\n@param sunAltitudeAngle The sun elevation angle above the horizon, in radians.\n@see http://pvcdrom.pveducation.org/SUNLIGHT/AIRMASS.HTM."
		   });	
		addAnnotation
		  ((getAtmosphereUtils__GetAirMass__double()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "apogy_units", "rad"
		   });	
		addAnnotation
		  (getAtmosphereUtils__GetDirectSunIntensity__double_double(), 
		   source, 
		   new String[] {
			 "documentation", "Computes the intensity of the direct component of sunlight, in Watts/m^2.\n@param sunAltitudeAngle The sun elevation angle above the horizon, in radians.\n@param heightAboveSeaLevel Height above sea level, in meters.\n@see http://pvcdrom.pveducation.org/SUNLIGHT/AIRMASS.HTM",
			 "apogy_units", "W/m\u00b2"
		   });	
		addAnnotation
		  ((getAtmosphereUtils__GetDirectSunIntensity__double_double()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "apogy_units", "rad"
		   });	
		addAnnotation
		  ((getAtmosphereUtils__GetDirectSunIntensity__double_double()).getEParameters().get(1), 
		   source, 
		   new String[] {
			 "apogy_units", "m"
		   });	
		addAnnotation
		  (getAtmosphereUtils__GetDiffuseSunIntensity__double_double(), 
		   source, 
		   new String[] {
			 "documentation", "Computes the intensity of the diffuse component of sunlight, in Watts/m^2.\n@param sunAltitudeAngle The sun elevation angle above the horizon, in radians.\n@param heightAboveSeaLevel Height above sea level, in meters.\n@see http://pvcdrom.pveducation.org/SUNLIGHT/AIRMASS.HTM",
			 "apogy_units", "W/m\u00b2"
		   });	
		addAnnotation
		  ((getAtmosphereUtils__GetDiffuseSunIntensity__double_double()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "apogy_units", "rad"
		   });	
		addAnnotation
		  ((getAtmosphereUtils__GetDiffuseSunIntensity__double_double()).getEParameters().get(1), 
		   source, 
		   new String[] {
			 "apogy_units", "m"
		   });	
		addAnnotation
		  (getAtmosphereUtils__GetAtmosphereRefractionCorrection__double(), 
		   source, 
		   new String[] {
			 "documentation", "Computes the change in altitude that needs to be added to the altitude of\nHorizontalCoordinates to take into account the Earth\'s atmosphere refraction.\nThe calculations in the NOAA Sunrise/Sunset and Solar Position Calculators are\nbased on equations from Astronomical Algorithms, by Jean Meeus. The sunrise and\nsunset results have been verified to be accurate to within a minute for locations\nbetween +/- 72\u00b0 latitude, and within 10 minutes outside of those latitudes.\n@param geometricAltitude The true altitude (as defined in HorizontalCoordinates) of the object, in radians.\n@see ../doc/AtmosphereRefractionCalculations.html or http://www.srrb.noaa.gov/highlights/sunrise/calcdetails.html."
		   });	
		addAnnotation
		  ((getAtmosphereUtils__GetAtmosphereRefractionCorrection__double()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "apogy_units", "rad"
		   });	
		addAnnotation
		  (astronomyUtilsEClass, 
		   source, 
		   new String[] {
			 "documentation", "Class that provides methods to find the position of the Moon and Sun in the sky."
		   });	
		addAnnotation
		  (getAstronomyUtils__GetSunEquatorialPosition__double(), 
		   source, 
		   new String[] {
			 "documentation", "Computes the Sun\'s equatorial coordinates for a given Julian date.\nThe calculation are based on page C24 of the 1996 Astronomical Almanac\nwhich provides a method for finding the position of the Sun in the sky\nto an accuracy of 0.01 degree between the years 1950 and 2050. The\nformulas are based on an elliptical orbit for the Earth, using mean\norbital elements and a two term approximation for the \'equation of centre\'.\n\nThere is also an approximate allowance made for the change in obliquity of\nthe ecliptic with time, needed when converting to right ascension and\ndeclination. The positions are thus apparent positions, they are referred to\nthe mean ecliptic and equinox of date. The positions found using this low\nprecision formula with values referred to the mean ecliptic and equinox of\ndate from a more accurate program. The results (for the whole 1950 to 2050 range)\nhave been found to be accurate within 3 seconds of RA and 15 arc seconds in declination.\n\n@see http://www.stargazing.net/kepler/sun.html#twig02"
		   });	
		addAnnotation
		  (getAstronomyUtils__GetHorizontalSunPosition__Date_double_double(), 
		   source, 
		   new String[] {
			 "documentation", "Computes the Sun\'s horizontal coordinates for a date and location on\nthe surface of the Earth.\n@param observerLongitude The observer longitude, in radians. Longitude east of Greenwich are positive, west of Greenwich are negative.\n@param observerLatitude The observer latitude, in radians. Latitude North of the equator are positive, Southe of the equator are negative."
		   });	
		addAnnotation
		  ((getAstronomyUtils__GetHorizontalSunPosition__Date_double_double()).getEParameters().get(1), 
		   source, 
		   new String[] {
			 "apogy_units", "rad"
		   });	
		addAnnotation
		  ((getAstronomyUtils__GetHorizontalSunPosition__Date_double_double()).getEParameters().get(2), 
		   source, 
		   new String[] {
			 "apogy_units", "rad"
		   });	
		addAnnotation
		  (getAstronomyUtils__GetMoonEquatorialPosition__double(), 
		   source, 
		   new String[] {
			 "documentation", "Computes the Moon\'s equatorial coordinates for a given Julian date for\nan observer a the center of the Earth.\nSee doc/tutorial.html for more details."
		   });	
		addAnnotation
		  (getAstronomyUtils__GetMoonTopocentricEquatorialPosition__Date_double_double(), 
		   source, 
		   new String[] {
			 "documentation", "Computes the Moon\'s equatorial coordinates for a date and location on\nthe surface of the Earth. This position take into account the radius of\nthe Earth.\n@param observerLongitude The observer longitude, in radians. Longitude east of Greenwich are positive, west of Greenwich are negative.\n@param observerLatitude The observer latitude, in radians. Latitude North of the equator are positive, Southe of the equator are negative."
		   });	
		addAnnotation
		  ((getAstronomyUtils__GetMoonTopocentricEquatorialPosition__Date_double_double()).getEParameters().get(1), 
		   source, 
		   new String[] {
			 "apogy_units", "rad"
		   });	
		addAnnotation
		  ((getAstronomyUtils__GetMoonTopocentricEquatorialPosition__Date_double_double()).getEParameters().get(2), 
		   source, 
		   new String[] {
			 "apogy_units", "rad"
		   });	
		addAnnotation
		  (getAstronomyUtils__GetHorizontalMoonPosition__Date_double_double(), 
		   source, 
		   new String[] {
			 "documentation", "Computes the Moon\'s horizontal coordinates.\n@param observerLongitude The observer longitude, in radians. Longitude east of Greenwich are positive, west of Greenwich are negative.\n@param observerLatitude The observer latitude, in radians. Latitude North of the equator are positive, Southe of the equator are negative."
		   });	
		addAnnotation
		  ((getAstronomyUtils__GetHorizontalMoonPosition__Date_double_double()).getEParameters().get(1), 
		   source, 
		   new String[] {
			 "apogy_units", "rad"
		   });	
		addAnnotation
		  ((getAstronomyUtils__GetHorizontalMoonPosition__Date_double_double()).getEParameters().get(2), 
		   source, 
		   new String[] {
			 "apogy_units", "rad"
		   });	
		addAnnotation
		  (getAstronomyUtils__GetTimeSinceJ2000__double(), 
		   source, 
		   new String[] {
			 "documentation", "Return the number of days since epoch J2000."
		   });	
		addAnnotation
		  (getAstronomyUtils__GetLocalSideralTime__Date_double(), 
		   source, 
		   new String[] {
			 "documentation", "Return the local sideral time, in radians, clamped between 0 and 2\u03c0 (360 degrees).\n\nSidereal time is a system of timekeeping based on the rotation of the Earth with respect\nto the fixed stars in the sky. More specifically, it is the measure of the hour angle of\nthe vernal equinox. If the hour angle is measured with respect to the true equinox, apparent\nsidereal time is being measured. If the hour angle is measured with respect to the mean\nequinox, mean sidereal time is being measured. When the measurements are made with respect to\nthe meridian at Greenwich, the times are referred to as Greenwich mean sidereal time (GMST)\nand Greenwich apparent sidereal time (GAST). Given below is a simple algorithm for computing\napparent sidereal time to an accuracy of about 0.1 second, equivalent to about 1.5 arcseconds\non the sky. The input time required by the algorithm is represented as a Julian date (Julian\ndates can be used to determine Universal Time.)Let JD be the Julian date of the time of interest.\nLet JD0 be the Julian date of the previous midnight (0h) UT (the value of JD0 will end in .5\nexactly), and let H be the hours of UT elapsed since that time. Thus we have JD = JD0 + H/24.\n\nFor both of these Julian dates, compute the number of days and fraction (+ or -) from 2000\nJanuary 1, 12h UT, Julian date 2451545.0:\n\nD = JD - 2451545.0\nD0 = JD0 - 2451545.0\n\nThen the Greenwich mean sidereal time in hours is:\n\nGMST = 6.697374558 + 0.06570982441908 D0 + 1.00273790935 H + 0.000026 T\n\t * where T = D/36525 is the number of centuries since the year 2000; thus the\nlast term can be omitted in most applications. It will be necessary to\nreduce GMST to the range 0h to 24h. Setting H = 0 in the above formula yields\nthe Greenwich mean sidereal time at 0h UT, which is tabulated in The Astronomical Almanac.\n\nThe following alternative formula can be used with a loss of precision of 0.1 second per century:\n\nGMST = 18.697374558 + 24.06570982441908 D\n\t * where, as above, GMST must be reduced to the range 0h to 24h. The equations for GMST given\nabove are adapted from those given in Appendix A of USNO Circular No. 163 (1981).\n\t * The Greenwich apparent sidereal time is obtained by adding a correction to the Greenwich\nmean sidereal time computed above. The correction term is called the nutation in right\nascension or the equation of the equinoxes. Thus,\n\nGAST = GMST + eqeq.\n\nThe equation of the equinoxes is given as eqeq = \u0394\u03c8 cos \u03b5 where \u0394\u03c8, the nutation in longitude,\nis given in hours approximately by:\n\n \u0394\u03c8 \u2248 -0.000319 sin \u03a9 - 0.000024 sin 2L\n\nwith \u03a9,  the Longitude of the ascending node of the Moon, given as:\n\n\u03a9 = 125.04 - 0.052954 D,\n\t * and L, the Mean Longitude of the Sun, given as:\n\nL = 280.47 + 0.98565 D.\n\n \u03b5 is the obliquity and is given as:\n\n \u03b5 = 23.4393 - 0.0000004 D.\n\nThe above expressions for \u03a9, L, and \u03b5 are all expressed in degrees.\n\t * The mean or apparent sidereal time locally is found by obtaining the local longitude in degrees,\nconverting it to hours by dividing by 15, and then adding it to or subtracting it from the Greenwich\ntime depending on whether the local position is east (add) or west (subtract) of Greenwich.\n\n@param date The date\n@param observerLongitude The observer longitude, in radians. Longitude East of Greenwich are positive, West of Greenwich are negative."
		   });	
		addAnnotation
		  ((getAstronomyUtils__GetLocalSideralTime__Date_double()).getEParameters().get(1), 
		   source, 
		   new String[] {
			 "apogy_units", "rad"
		   });	
		addAnnotation
		  (getAstronomyUtils__GetUTCDecimalHours__Date(), 
		   source, 
		   new String[] {
			 "documentation", "Return the decimal time of day in UTC for a given date."
		   });	
		addAnnotation
		  (getAstronomyUtils__ConvertToHorizontalCoordinates__EquatorialCoordinates_double_double_Date(), 
		   source, 
		   new String[] {
			 "documentation", "Converts Equatorial Coordinates to HorizontalCoordinates for a given geographic location and date.\n@param equatorialCoordinates The location, in equatorial coordinates\n@param observerLongitude The observer longitude, in radians. Longitude east of Greenwich are positive, west of Greenwich are negative.\n@param observerLatitude The observer latitude, in radians. Latitude North of the equator are positive, Southe of the equator are negative.\n@param date The date"
		   });	
		addAnnotation
		  ((getAstronomyUtils__ConvertToHorizontalCoordinates__EquatorialCoordinates_double_double_Date()).getEParameters().get(1), 
		   source, 
		   new String[] {
			 "apogy_units", "rad"
		   });	
		addAnnotation
		  ((getAstronomyUtils__ConvertToHorizontalCoordinates__EquatorialCoordinates_double_double_Date()).getEParameters().get(2), 
		   source, 
		   new String[] {
			 "apogy_units", "rad"
		   });	
		addAnnotation
		  (getAstronomyUtils__ConvertTimeToAngle__int_int_int(), 
		   source, 
		   new String[] {
			 "documentation", "Convert a day\'s hour, minutes and seconds to an angle, in radians. 24 hours converts to 2\u03c0 (360 degrees).",
			 "apogy_units", "rad"
		   });	
		addAnnotation
		  (getAstronomyUtils__ClampAngleToZero2PI__double(), 
		   source, 
		   new String[] {
			 "documentation", "Clamps the specified angle between 0 and 2\u03c0 (360 degrees).",
			 "apogy_units", "rad"
		   });	
		addAnnotation
		  ((getAstronomyUtils__ClampAngleToZero2PI__double()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "apogy_units", "rad"
		   });	
		addAnnotation
		  (getAstronomyUtils__ConvertToEquatorialCoordinates__EclipticCoordinates(), 
		   source, 
		   new String[] {
			 "documentation", "Converts Ecliptic Coordinates to Equatorial Coordinates."
		   });	
		addAnnotation
		  (getAstronomyUtils__ConvertToEclipticCoordinates__EquatorialCoordinates(), 
		   source, 
		   new String[] {
			 "documentation", "Converts Equatorial Coordinates to Ecliptic Coordinates."
		   });	
		addAnnotation
		  (getAstronomyUtils__ConvertFromEquatorialRectangularToEclipticRectangular__Point3d(), 
		   source, 
		   new String[] {
			 "documentation", "Converts Rectangular (x,y,z) Equatorial Coordinates to Equatorial Coordinates\n(Right Ascension and Declination)."
		   });	
		addAnnotation
		  (getAstronomyUtils__ConvertFromEclipticRectangularToEquatorialRectangular__Point3d(), 
		   source, 
		   new String[] {
			 "documentation", "Converts Rectangular (x,y,z) Ecliptic Coordinates to Rectangular (x,y,z) Equatorial Coordinates."
		   });	
		addAnnotation
		  (getAstronomyUtils__ConvertFromEclipticRectangularToEclipticCoordinates__Point3d(), 
		   source, 
		   new String[] {
			 "documentation", "Converts Rectangular (x,y,z) Ecliptic Coordinates to Ecliptic Coordinates (longitude, latitude, radius)."
		   });	
		addAnnotation
		  (getAstronomyUtils__ConvertFromEquatorialRectangularToEquatorialCoordinates__Point3d(), 
		   source, 
		   new String[] {
			 "documentation", "Converts Rectangular (x,y,z) Equatorial Coordinates to Equatorial Coordinates (Right Ascension, Declination)."
		   });	
		addAnnotation
		  (getAstronomyUtils__ConvertFromHorizontalCoordinatesToHorizontalRectangular__HorizontalCoordinates(), 
		   source, 
		   new String[] {
			 "documentation", "Converts HorizontalCoordinates () to Rectangular Horizontal (x,y,z) coordinates. Rectangular\nHorizontal coordinates are defined as followed:\n- X point to True North.\n- Y points West.\n- Z point toward nadir (up)"
		   });	
		addAnnotation
		  (getAstronomyUtils__ConvertAUtoMeters__double(), 
		   source, 
		   new String[] {
			 "documentation", "Convert Astronomical Units (A.U.) to meters.",
			 "apogy_units", "m"
		   });	
		addAnnotation
		  (getAstronomyUtils__GetMaximumSunAltitude__double(), 
		   source, 
		   new String[] {
			 "documentation", "Return the maximum altitude angle that the sun could reach at the specified latitude, in radians.",
			 "apogy_units", "rad"
		   });	
		addAnnotation
		  ((getAstronomyUtils__GetMaximumSunAltitude__double()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "apogy_units", "rad"
		   });	
		addAnnotation
		  (getAstronomyUtils__ConvertToHHmmssString__double(), 
		   source, 
		   new String[] {
			 "documentation", "Converts a sidreal time in HH:mm:ss string"
		   });	
		addAnnotation
		  (getAstronomyUtils__GetSunRiseTime__Date_double_double(), 
		   source, 
		   new String[] {
			 "documentation", "Computes the sun rise time for a given day and location.\n@param day The date of the day\n@param observerLongitude The observer longitude, in radians. Longitude east of Greenwich are positive, west of Greenwich are negative.\n@param observerLatitude The observer latitude, in radians. Latitude North of the equator are positive, Southe of the equator are negative."
		   });	
		addAnnotation
		  ((getAstronomyUtils__GetSunRiseTime__Date_double_double()).getEParameters().get(1), 
		   source, 
		   new String[] {
			 "apogy_units", "rad"
		   });	
		addAnnotation
		  ((getAstronomyUtils__GetSunRiseTime__Date_double_double()).getEParameters().get(2), 
		   source, 
		   new String[] {
			 "apogy_units", "rad"
		   });	
		addAnnotation
		  (getAstronomyUtils__GetSunSetTime__Date_double_double(), 
		   source, 
		   new String[] {
			 "documentation", "Computes the sun set time for a given day and location.\n@param day The date of the day\n@param observerLongitude The observer longitude, in radians. Longitude east of Greenwich are positive, west of Greenwich are negative.\n@param observerLatitude The observer latitude, in radians. Latitude North of the equator are positive, Southe of the equator are negative."
		   });	
		addAnnotation
		  ((getAstronomyUtils__GetSunSetTime__Date_double_double()).getEParameters().get(1), 
		   source, 
		   new String[] {
			 "apogy_units", "rad"
		   });	
		addAnnotation
		  ((getAstronomyUtils__GetSunSetTime__Date_double_double()).getEParameters().get(2), 
		   source, 
		   new String[] {
			 "apogy_units", "rad"
		   });	
		addAnnotation
		  (getAstronomyUtils__GetSunHighestElevationTime__Date_double_double(), 
		   source, 
		   new String[] {
			 "documentation", "Computes the time of maximum sun elevation for a given day and location.\n@param day The date of the day\n@param observerLongitude The observer longitude, in radians. Longitude east of Greenwich are positive, west of Greenwich are negative.\n@param observerLatitude The observer latitude, in radians. Latitude North of the equator are positive, Southe of the equator are negative."
		   });	
		addAnnotation
		  ((getAstronomyUtils__GetSunHighestElevationTime__Date_double_double()).getEParameters().get(1), 
		   source, 
		   new String[] {
			 "apogy_units", "rad"
		   });	
		addAnnotation
		  ((getAstronomyUtils__GetSunHighestElevationTime__Date_double_double()).getEParameters().get(2), 
		   source, 
		   new String[] {
			 "apogy_units", "rad"
		   });
	}

} //ApogyEarthSurfaceEnvironmentPackageImpl
