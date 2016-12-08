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
package ca.gc.asc_csa.apogy.core.environment.earth.impl;

import ca.gc.asc_csa.apogy.common.math.ApogyCommonMathPackage;
import ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyPackage;
import ca.gc.asc_csa.apogy.core.ApogyCorePackage;
import ca.gc.asc_csa.apogy.core.environment.earth.ApogyEarthEnvironmentFactory;
import ca.gc.asc_csa.apogy.core.environment.earth.ApogyEarthEnvironmentPackage;
import ca.gc.asc_csa.apogy.core.environment.earth.ApogyEarthFacade;
import ca.gc.asc_csa.apogy.core.environment.earth.EclipticCoordinates;
import ca.gc.asc_csa.apogy.core.environment.earth.GeographicCoordinates;
import ca.gc.asc_csa.apogy.core.environment.earth.HorizontalCoordinates;

import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyEarthEnvironmentPackageImpl extends EPackageImpl implements ApogyEarthEnvironmentPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geographicCoordinatesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass horizontalCoordinatesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eclipticCoordinatesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apogyEarthFacadeEClass = null;

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
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.ApogyEarthEnvironmentPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ApogyEarthEnvironmentPackageImpl() {
		super(eNS_URI, ApogyEarthEnvironmentFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ApogyEarthEnvironmentPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ApogyEarthEnvironmentPackage init() {
		if (isInited) return (ApogyEarthEnvironmentPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyEarthEnvironmentPackage.eNS_URI);

		// Obtain or create and register package
		ApogyEarthEnvironmentPackageImpl theApogyEarthEnvironmentPackage = (ApogyEarthEnvironmentPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ApogyEarthEnvironmentPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ApogyEarthEnvironmentPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ApogyCorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theApogyEarthEnvironmentPackage.createPackageContents();

		// Initialize created meta-data
		theApogyEarthEnvironmentPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theApogyEarthEnvironmentPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ApogyEarthEnvironmentPackage.eNS_URI, theApogyEarthEnvironmentPackage);
		return theApogyEarthEnvironmentPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeographicCoordinates() {
		return geographicCoordinatesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeographicCoordinates_Longitude() {
		return (EAttribute)geographicCoordinatesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeographicCoordinates_Latitude() {
		return (EAttribute)geographicCoordinatesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeographicCoordinates_Elevation() {
		return (EAttribute)geographicCoordinatesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHorizontalCoordinates() {
		return horizontalCoordinatesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHorizontalCoordinates_Altitude() {
		return (EAttribute)horizontalCoordinatesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHorizontalCoordinates_Azimuth() {
		return (EAttribute)horizontalCoordinatesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHorizontalCoordinates_Radius() {
		return (EAttribute)horizontalCoordinatesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEclipticCoordinates() {
		return eclipticCoordinatesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEclipticCoordinates_Longitude() {
		return (EAttribute)eclipticCoordinatesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEclipticCoordinates_Latitude() {
		return (EAttribute)eclipticCoordinatesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEclipticCoordinates_Radius() {
		return (EAttribute)eclipticCoordinatesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApogyEarthFacade() {
		return apogyEarthFacadeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyEarthFacade__GetMoonVector__ApogySystem_String_Environment() {
		return apogyEarthFacadeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyEarthFacade__GetMoonVector__Node_Environment() {
		return apogyEarthFacadeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyEarthEnvironmentFactory getApogyEarthEnvironmentFactory() {
		return (ApogyEarthEnvironmentFactory)getEFactoryInstance();
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
		geographicCoordinatesEClass = createEClass(GEOGRAPHIC_COORDINATES);
		createEAttribute(geographicCoordinatesEClass, GEOGRAPHIC_COORDINATES__LONGITUDE);
		createEAttribute(geographicCoordinatesEClass, GEOGRAPHIC_COORDINATES__LATITUDE);
		createEAttribute(geographicCoordinatesEClass, GEOGRAPHIC_COORDINATES__ELEVATION);

		horizontalCoordinatesEClass = createEClass(HORIZONTAL_COORDINATES);
		createEAttribute(horizontalCoordinatesEClass, HORIZONTAL_COORDINATES__ALTITUDE);
		createEAttribute(horizontalCoordinatesEClass, HORIZONTAL_COORDINATES__AZIMUTH);
		createEAttribute(horizontalCoordinatesEClass, HORIZONTAL_COORDINATES__RADIUS);

		eclipticCoordinatesEClass = createEClass(ECLIPTIC_COORDINATES);
		createEAttribute(eclipticCoordinatesEClass, ECLIPTIC_COORDINATES__LONGITUDE);
		createEAttribute(eclipticCoordinatesEClass, ECLIPTIC_COORDINATES__LATITUDE);
		createEAttribute(eclipticCoordinatesEClass, ECLIPTIC_COORDINATES__RADIUS);

		apogyEarthFacadeEClass = createEClass(APOGY_EARTH_FACADE);
		createEOperation(apogyEarthFacadeEClass, APOGY_EARTH_FACADE___GET_MOON_VECTOR__APOGYSYSTEM_STRING_ENVIRONMENT);
		createEOperation(apogyEarthFacadeEClass, APOGY_EARTH_FACADE___GET_MOON_VECTOR__NODE_ENVIRONMENT);
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
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		ApogyCommonMathPackage theApogyCommonMathPackage = (ApogyCommonMathPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCommonMathPackage.eNS_URI);
		ApogyCorePackage theApogyCorePackage = (ApogyCorePackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCorePackage.eNS_URI);
		ApogyCoreInvocatorPackage theApogyCoreInvocatorPackage = (ApogyCoreInvocatorPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCoreInvocatorPackage.eNS_URI);
		ApogyCommonTopologyPackage theApogyCommonTopologyPackage = (ApogyCommonTopologyPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCommonTopologyPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(geographicCoordinatesEClass, GeographicCoordinates.class, "GeographicCoordinates", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGeographicCoordinates_Longitude(), theEcorePackage.getEDouble(), "longitude", null, 0, 1, GeographicCoordinates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeographicCoordinates_Latitude(), theEcorePackage.getEDouble(), "latitude", null, 0, 1, GeographicCoordinates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeographicCoordinates_Elevation(), theEcorePackage.getEDouble(), "elevation", null, 0, 1, GeographicCoordinates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(horizontalCoordinatesEClass, HorizontalCoordinates.class, "HorizontalCoordinates", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHorizontalCoordinates_Altitude(), theEcorePackage.getEDouble(), "altitude", null, 0, 1, HorizontalCoordinates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHorizontalCoordinates_Azimuth(), theEcorePackage.getEDouble(), "azimuth", null, 0, 1, HorizontalCoordinates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHorizontalCoordinates_Radius(), theEcorePackage.getEDouble(), "radius", null, 0, 1, HorizontalCoordinates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eclipticCoordinatesEClass, EclipticCoordinates.class, "EclipticCoordinates", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEclipticCoordinates_Longitude(), theEcorePackage.getEDouble(), "longitude", null, 0, 1, EclipticCoordinates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEclipticCoordinates_Latitude(), theEcorePackage.getEDouble(), "latitude", null, 0, 1, EclipticCoordinates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEclipticCoordinates_Radius(), theEcorePackage.getEDouble(), "radius", null, 0, 1, EclipticCoordinates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(apogyEarthFacadeEClass, ApogyEarthFacade.class, "ApogyEarthFacade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getApogyEarthFacade__GetMoonVector__ApogySystem_String_Environment(), theApogyCommonMathPackage.getTuple3d(), "getMoonVector", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCorePackage.getApogySystem(), "apogySystem", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "nodeID", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCoreInvocatorPackage.getEnvironment(), "environment", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyEarthFacade__GetMoonVector__Node_Environment(), theApogyCommonMathPackage.getTuple3d(), "getMoonVector", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCommonTopologyPackage.getNode(), "node", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCoreInvocatorPackage.getEnvironment(), "environment", 0, 1, !IS_UNIQUE, IS_ORDERED);

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
			 "prefix", "ApogyEarthEnvironment",
			 "childCreationExtenders", "true",
			 "extensibleProviderFactory", "true",
			 "multipleEditorPages", "false",
			 "copyrightText", "Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Pierre Allard (Pierre.Allard@canada.ca), \n    Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n    Sebastien Gemme (Sebastien.Gemme@canada.ca),\n    Canadian Space Agency (CSA) - Initial API and implementation",
			 "modelName", "ApogyCoreEnvironment",
			 "complianceLevel", "6.0",
			 "suppressGenModelAnnotations", "false",
			 "dynamicTemplates", "true",
			 "templateDirectory", "platform:/plugin/ca.gc.asc_csa.apogy.common.emf.templates",
			 "modelDirectory", "/ca.gc.asc_csa.apogy.core.environment.earth/src-generated",
			 "editDirectory", "/ca.gc.asc_csa.apogy.core.environment.earth.edit/src-generated",
			 "basePackage", "ca.gc.asc_csa.apogy.core.environment"
		   });	
		addAnnotation
		  (geographicCoordinatesEClass, 
		   source, 
		   new String[] {
			 "documentation", "A location on Earth."
		   });	
		addAnnotation
		  (getGeographicCoordinates_Longitude(), 
		   source, 
		   new String[] {
			 "documentation", "The longitude, in radians. Longitude east of Greenwich, UK  are positive\nwhile those west of Greenwich are negative.",
			 "propertyCategory", "GEOGRAPHIC_COORDINATES",
			 "apogy_units", "rad"
		   });	
		addAnnotation
		  (getGeographicCoordinates_Latitude(), 
		   source, 
		   new String[] {
			 "documentation", "The latitude, in radians. Latitude north of the equator are positive while those\nsouth of the equator are negative.",
			 "propertyCategory", "GEOGRAPHIC_COORDINATES",
			 "apogy_units", "rad"
		   });	
		addAnnotation
		  (getGeographicCoordinates_Elevation(), 
		   source, 
		   new String[] {
			 "documentation", "Height above the Earth\'s sea level, in meters.",
			 "propertyCategory", "GEOGRAPHIC_COORDINATES",
			 "apogy_units", "m"
		   });	
		addAnnotation
		  (horizontalCoordinatesEClass, 
		   source, 
		   new String[] {
			 "documentation", "The horizontal coordinate system is a celestial coordinate system that uses the\nobserver\'s local horizon as the fundamental plane. This conveniently divides the\nsky into the upper hemisphere that you can see, and the lower hemisphere that you\ncannot (because the Earth is in the way). The pole of the upper hemisphere is called\nthe zenith. The pole of the lower hemisphere is called the nadir.\n\nThe horizontal coordinates are:\n\n- altitude (Alt): sometimes referred to as elevation, that is the angle between the\n                  object and the observer\'s local horizon\n\n- azimuth (Az): the angle of the object around the horizon, usually measured from the\n                north point towards the east. In former times, it was common to refer\n                to azimuth from the south, as it was then zero at the same time the hour\n                angle of a star was zero. This assumes, however, that the star (upper)\n                culminates in the south, which is only true for most stars in the\n                Northern Hemisphere"
		   });	
		addAnnotation
		  (eclipticCoordinatesEClass, 
		   source, 
		   new String[] {
			 "documentation", "The ecliptic coordinate system is a celestial coordinate system that uses the ecliptic\nfor its fundamental plane. The ecliptic is the path that the sun appears to follow across\nthe sky over the course of a year. It is also the projection of the Earth\'s orbital plane\nonto the celestial sphere. The latitudinal angle is called the ecliptic latitude or celestial\nlatitude (denoted \u03b2), measured positive towards the north. The longitudinal angle is called\nthe ecliptic longitude or celestial longitude (denoted \u03bb), measured eastwards from 0\u00b0 to 360\u00b0.\nLike right ascension in the equatorial coordinate system, 0\u00b0 ecliptic longitude is pointing\ntowards the Sun from the Earth at the Northern hemisphere vernal equinox. This choice makes\nthe coordinates of the fixed stars subject to shifts due to the precession, so that always a\nreference epoch should be specified. Usually epoch J2000.0 is taken, but the instantaneous\nequinox of the day (called the epoch of date) is possible too. This coordinate system can be\nparticularly useful for charting solar system objects. Most planets (except Mercury), and many\nsmall solar system bodies have orbits with small inclinations to the ecliptic plane, and therefore\ntheir ecliptic latitude \u03b2 is always small. Because of the planets\' small deviation from the plane\nof the ecliptic, ecliptic coordinates were used historically to compute their positions. (Aaboe 2001, 17-19)"
		   });
	}

} //ApogyEarthEnvironmentPackageImpl
