/**
 * Copyright (c) 2015-2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
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
package ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.impl;

import javax.vecmath.Color3f;
import javax.vecmath.Point3f;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import ca.gc.asc_csa.apogy.common.topology.ui.ApogyCommonTopologyUIPackage;
import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.ApogyCoreEnvironmentSurfaceEarthUIFactory;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.ApogyCoreEnvironmentSurfaceEarthUIPackage;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.EarthSkyPresentation;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.EarthSurfaceWorksitePresentation;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.EarthSurfaceUIUtilities;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.MoonPresentation;
import ca.gc.asc_csa.apogy.core.environment.surface.ui.ApogySurfaceEnvironmentUIPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyCoreEnvironmentSurfaceEarthUIPackageImpl extends EPackageImpl implements ApogyCoreEnvironmentSurfaceEarthUIPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass earthSurfaceWorksitePresentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass earthSkyPresentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moonPresentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass earthSurfaceUIUtilitiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType color3fEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType point3fEDataType = null;

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
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.ApogyCoreEnvironmentSurfaceEarthUIPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ApogyCoreEnvironmentSurfaceEarthUIPackageImpl() {
		super(eNS_URI, ApogyCoreEnvironmentSurfaceEarthUIFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ApogyCoreEnvironmentSurfaceEarthUIPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ApogyCoreEnvironmentSurfaceEarthUIPackage init() {
		if (isInited) return (ApogyCoreEnvironmentSurfaceEarthUIPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCoreEnvironmentSurfaceEarthUIPackage.eNS_URI);

		// Obtain or create and register package
		ApogyCoreEnvironmentSurfaceEarthUIPackageImpl theApogyCoreEnvironmentSurfaceEarthUIPackage = (ApogyCoreEnvironmentSurfaceEarthUIPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ApogyCoreEnvironmentSurfaceEarthUIPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ApogyCoreEnvironmentSurfaceEarthUIPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ApogySurfaceEnvironmentUIPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theApogyCoreEnvironmentSurfaceEarthUIPackage.createPackageContents();

		// Initialize created meta-data
		theApogyCoreEnvironmentSurfaceEarthUIPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theApogyCoreEnvironmentSurfaceEarthUIPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ApogyCoreEnvironmentSurfaceEarthUIPackage.eNS_URI, theApogyCoreEnvironmentSurfaceEarthUIPackage);
		return theApogyCoreEnvironmentSurfaceEarthUIPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEarthSurfaceWorksitePresentation() {
		return earthSurfaceWorksitePresentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEarthSkyPresentation() {
		return earthSkyPresentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMoonPresentation() {
		return moonPresentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEarthSurfaceUIUtilities() {
		return earthSurfaceUIUtilitiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEarthSurfaceUIUtilities__ToPoint3f__Star() {
		return earthSurfaceUIUtilitiesEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEarthSurfaceUIUtilities__GetPointSizeForMagnitude__float_float_float_float_float() {
		return earthSurfaceUIUtilitiesEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEarthSurfaceUIUtilities__GetSunLightColor__double() {
		return earthSurfaceUIUtilitiesEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEarthSurfaceUIUtilities__GetSkyTransparency__double() {
		return earthSurfaceUIUtilitiesEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEarthSurfaceUIUtilities__GetSkyColor__double() {
		return earthSurfaceUIUtilitiesEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getColor3f() {
		return color3fEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPoint3f() {
		return point3fEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCoreEnvironmentSurfaceEarthUIFactory getApogyCoreEnvironmentSurfaceEarthUIFactory() {
		return (ApogyCoreEnvironmentSurfaceEarthUIFactory)getEFactoryInstance();
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
		earthSurfaceWorksitePresentationEClass = createEClass(EARTH_SURFACE_WORKSITE_PRESENTATION);

		earthSkyPresentationEClass = createEClass(EARTH_SKY_PRESENTATION);

		moonPresentationEClass = createEClass(MOON_PRESENTATION);

		earthSurfaceUIUtilitiesEClass = createEClass(EARTH_SURFACE_UI_UTILITIES);
		createEOperation(earthSurfaceUIUtilitiesEClass, EARTH_SURFACE_UI_UTILITIES___TO_POINT3F__STAR);
		createEOperation(earthSurfaceUIUtilitiesEClass, EARTH_SURFACE_UI_UTILITIES___GET_POINT_SIZE_FOR_MAGNITUDE__FLOAT_FLOAT_FLOAT_FLOAT_FLOAT);
		createEOperation(earthSurfaceUIUtilitiesEClass, EARTH_SURFACE_UI_UTILITIES___GET_SUN_LIGHT_COLOR__DOUBLE);
		createEOperation(earthSurfaceUIUtilitiesEClass, EARTH_SURFACE_UI_UTILITIES___GET_SKY_TRANSPARENCY__DOUBLE);
		createEOperation(earthSurfaceUIUtilitiesEClass, EARTH_SURFACE_UI_UTILITIES___GET_SKY_COLOR__DOUBLE);

		// Create data types
		color3fEDataType = createEDataType(COLOR3F);
		point3fEDataType = createEDataType(POINT3F);
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
		ApogySurfaceEnvironmentUIPackage theApogySurfaceEnvironmentUIPackage = (ApogySurfaceEnvironmentUIPackage)EPackage.Registry.INSTANCE.getEPackage(ApogySurfaceEnvironmentUIPackage.eNS_URI);
		ApogyCommonTopologyUIPackage theApogyCommonTopologyUIPackage = (ApogyCommonTopologyUIPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCommonTopologyUIPackage.eNS_URI);
		ApogyCoreEnvironmentPackage theApogyCoreEnvironmentPackage = (ApogyCoreEnvironmentPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCoreEnvironmentPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		earthSurfaceWorksitePresentationEClass.getESuperTypes().add(theApogySurfaceEnvironmentUIPackage.getAbstractSurfaceWorksitePresentation());
		earthSkyPresentationEClass.getESuperTypes().add(theApogySurfaceEnvironmentUIPackage.getAbstractSurfaceWorksiteSkyPresentation());
		moonPresentationEClass.getESuperTypes().add(theApogyCommonTopologyUIPackage.getNodePresentation());

		// Initialize classes, features, and operations; add parameters
		initEClass(earthSurfaceWorksitePresentationEClass, EarthSurfaceWorksitePresentation.class, "EarthSurfaceWorksitePresentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(earthSkyPresentationEClass, EarthSkyPresentation.class, "EarthSkyPresentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(moonPresentationEClass, MoonPresentation.class, "MoonPresentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(earthSurfaceUIUtilitiesEClass, EarthSurfaceUIUtilities.class, "EarthSurfaceUIUtilities", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getEarthSurfaceUIUtilities__ToPoint3f__Star(), this.getPoint3f(), "toPoint3f", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCoreEnvironmentPackage.getStar(), "star", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEarthSurfaceUIUtilities__GetPointSizeForMagnitude__float_float_float_float_float(), theEcorePackage.getEFloat(), "getPointSizeForMagnitude", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEFloat(), "magnitude", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEFloat(), "magnitudeRangeMinimum", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEFloat(), "magnitudeRangeMaximum", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEFloat(), "minimumPointSize", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEFloat(), "maximumPointSize", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEarthSurfaceUIUtilities__GetSunLightColor__double(), this.getColor3f(), "getSunLightColor", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "sunAltitude", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEarthSurfaceUIUtilities__GetSkyTransparency__double(), theEcorePackage.getEDouble(), "getSkyTransparency", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "sunAltitude", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEarthSurfaceUIUtilities__GetSkyColor__double(), this.getColor3f(), "getSkyColor", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "sunAltitude", 0, 1, !IS_UNIQUE, IS_ORDERED);

		// Initialize data types
		initEDataType(color3fEDataType, Color3f.class, "Color3f", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(point3fEDataType, Point3f.class, "Point3f", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

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
			 "prefix", "ApogyCoreEnvironmentSurfaceEarthUI",
			 "childCreationExtenders", "true",
			 "extensibleProviderFactory", "true",
			 "multipleEditorPages", "false",
			 "copyrightText", "Copyright (c) 2015-2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Pierre Allard (Pierre.Allard@canada.ca), \n    Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n    Sebastien Gemme (Sebastien.Gemme@canada.ca),\n    Canadian Space Agency (CSA) - Initial API and implementation",
			 "modelName", "ApogyCoreEnvironmentUI",
			 "complianceLevel", "6.0",
			 "suppressGenModelAnnotations", "false",
			 "dynamicTemplates", "true",
			 "templateDirectory", "platform:/plugin/ca.gc.asc_csa.apogy.common.emf.templates",
			 "modelDirectory", "/ca.gc.asc_csa.apogy.core.environment.earth.surface.ui/src-generated",
			 "editDirectory", "/ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.edit/src-generated",
			 "basePackage", "ca.gc.asc_csa.apogy.core.environment.earth.surface"
		   });	
		addAnnotation
		  (earthSurfaceWorksitePresentationEClass, 
		   source, 
		   new String[] {
			 "documentation", "*\nDefines the display properties associated with an EarthSurfaceWorksite."
		   });	
		addAnnotation
		  (earthSkyPresentationEClass, 
		   source, 
		   new String[] {
			 "documentation", "*\nDefines the display properties associated with an EarthSky."
		   });	
		addAnnotation
		  (moonPresentationEClass, 
		   source, 
		   new String[] {
			 "documentation", "*\nDefines the display properties associated with the Moon in the EarthSky."
		   });	
		addAnnotation
		  (getEarthSurfaceUIUtilities__GetSunLightColor__double(), 
		   source, 
		   new String[] {
			 "documentation", "Return the sun color for a given altitude above the horizon.\n@param sunAltitude The altitude above the horizon, in radians."
		   });	
		addAnnotation
		  ((getEarthSurfaceUIUtilities__GetSunLightColor__double()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "apogy_units", "rad"
		   });	
		addAnnotation
		  (getEarthSurfaceUIUtilities__GetSkyTransparency__double(), 
		   source, 
		   new String[] {
			 "documentation", "Return the transparency value (between no transparency 0 and full transparency 1.0)\nto be used for the blus sky as a function of the sun altitude angle.\n@param sunAltitude The altitude above the horizon, in radians."
		   });	
		addAnnotation
		  ((getEarthSurfaceUIUtilities__GetSkyTransparency__double()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "apogy_units", "rad"
		   });	
		addAnnotation
		  (getEarthSurfaceUIUtilities__GetSkyColor__double(), 
		   source, 
		   new String[] {
			 "documentation", "Return the sky color for a given altitude above the horizon.\n@param sunAltitude The altitude above the horizon, in radians."
		   });	
		addAnnotation
		  ((getEarthSurfaceUIUtilities__GetSkyColor__double()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "apogy_units", "rad"
		   });
	}

} //ApogyCoreEnvironmentSurfaceEarthUIPackageImpl
