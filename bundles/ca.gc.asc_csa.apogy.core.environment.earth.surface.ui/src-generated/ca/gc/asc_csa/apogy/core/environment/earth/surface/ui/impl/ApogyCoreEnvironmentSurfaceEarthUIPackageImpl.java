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

import ca.gc.asc_csa.apogy.addons.ApogyAddonsPackage;
import ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyPackage;
import javax.vecmath.Color3f;
import javax.vecmath.Point3f;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import ca.gc.asc_csa.apogy.common.topology.ui.ApogyCommonTopologyUIPackage;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.ApogyCoreEnvironmentSurfaceEarthUIFactory;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.ApogyCoreEnvironmentSurfaceEarthUIPackage;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.EarthSkyPresentation;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.EarthSurfaceWorksitePresentation;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.EarthSurfaceUIUtilities;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.MoonPresentation;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.SunVector3DTool;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.SunVector3DToolNode;
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
	private EClass sunVector3DToolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sunVector3DToolNodeEClass = null;

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
		ApogyAddonsPackage.eINSTANCE.eClass();

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
	public EClass getSunVector3DTool() {
		return sunVector3DToolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSunVector3DTool_VectorColor() {
		return (EAttribute)sunVector3DToolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSunVector3DTool_VectorLength() {
		return (EAttribute)sunVector3DToolEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSunVector3DTool_EndPointRadius() {
		return (EAttribute)sunVector3DToolEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSunVector3DTool_SunIntensity() {
		return (EAttribute)sunVector3DToolEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSunVector3DTool_CurrentDayMaximumSunIntensity() {
		return (EAttribute)sunVector3DToolEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSunVector3DTool_CurrentSunIntensityPercentage() {
		return (EAttribute)sunVector3DToolEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSunVector3DTool_SunVector3DToolNode() {
		return (EReference)sunVector3DToolEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSunVector3DToolNode() {
		return sunVector3DToolNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSunVector3DToolNode_SunVector3DTool() {
		return (EReference)sunVector3DToolNodeEClass.getEStructuralFeatures().get(0);
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
	public EOperation getEarthSurfaceUIUtilities__GetSunLightColor__double() {
		return earthSurfaceUIUtilitiesEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEarthSurfaceUIUtilities__GetSkyTransparency__double() {
		return earthSurfaceUIUtilitiesEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEarthSurfaceUIUtilities__GetSkyColor__double() {
		return earthSurfaceUIUtilitiesEClass.getEOperations().get(2);
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

		sunVector3DToolEClass = createEClass(SUN_VECTOR3_DTOOL);
		createEAttribute(sunVector3DToolEClass, SUN_VECTOR3_DTOOL__VECTOR_COLOR);
		createEAttribute(sunVector3DToolEClass, SUN_VECTOR3_DTOOL__VECTOR_LENGTH);
		createEAttribute(sunVector3DToolEClass, SUN_VECTOR3_DTOOL__END_POINT_RADIUS);
		createEAttribute(sunVector3DToolEClass, SUN_VECTOR3_DTOOL__SUN_INTENSITY);
		createEAttribute(sunVector3DToolEClass, SUN_VECTOR3_DTOOL__CURRENT_DAY_MAXIMUM_SUN_INTENSITY);
		createEAttribute(sunVector3DToolEClass, SUN_VECTOR3_DTOOL__CURRENT_SUN_INTENSITY_PERCENTAGE);
		createEReference(sunVector3DToolEClass, SUN_VECTOR3_DTOOL__SUN_VECTOR3_DTOOL_NODE);

		sunVector3DToolNodeEClass = createEClass(SUN_VECTOR3_DTOOL_NODE);
		createEReference(sunVector3DToolNodeEClass, SUN_VECTOR3_DTOOL_NODE__SUN_VECTOR3_DTOOL);

		earthSurfaceUIUtilitiesEClass = createEClass(EARTH_SURFACE_UI_UTILITIES);
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
		ApogyAddonsPackage theApogyAddonsPackage = (ApogyAddonsPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyAddonsPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		ApogyCommonTopologyPackage theApogyCommonTopologyPackage = (ApogyCommonTopologyPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCommonTopologyPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		earthSurfaceWorksitePresentationEClass.getESuperTypes().add(theApogySurfaceEnvironmentUIPackage.getAbstractSurfaceWorksitePresentation());
		earthSkyPresentationEClass.getESuperTypes().add(theApogySurfaceEnvironmentUIPackage.getAbstractSurfaceWorksiteSkyPresentation());
		moonPresentationEClass.getESuperTypes().add(theApogyCommonTopologyUIPackage.getNodePresentation());
		sunVector3DToolEClass.getESuperTypes().add(theApogyAddonsPackage.getAbstractTwoPoints3DTool());
		sunVector3DToolNodeEClass.getESuperTypes().add(theApogyCommonTopologyPackage.getNode());

		// Initialize classes, features, and operations; add parameters
		initEClass(earthSurfaceWorksitePresentationEClass, EarthSurfaceWorksitePresentation.class, "EarthSurfaceWorksitePresentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(earthSkyPresentationEClass, EarthSkyPresentation.class, "EarthSkyPresentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(moonPresentationEClass, MoonPresentation.class, "MoonPresentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sunVector3DToolEClass, SunVector3DTool.class, "SunVector3DTool", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSunVector3DTool_VectorColor(), this.getColor3f(), "vectorColor", "1.0,1.0,0.0", 0, 1, SunVector3DTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSunVector3DTool_VectorLength(), theEcorePackage.getEDouble(), "vectorLength", "10.0", 0, 1, SunVector3DTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSunVector3DTool_EndPointRadius(), theEcorePackage.getEDouble(), "endPointRadius", "0.01", 0, 1, SunVector3DTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSunVector3DTool_SunIntensity(), theEcorePackage.getEDouble(), "sunIntensity", "0.0", 0, 1, SunVector3DTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSunVector3DTool_CurrentDayMaximumSunIntensity(), theEcorePackage.getEDouble(), "currentDayMaximumSunIntensity", "0.0", 0, 1, SunVector3DTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSunVector3DTool_CurrentSunIntensityPercentage(), theEcorePackage.getEDouble(), "currentSunIntensityPercentage", "0.0", 0, 1, SunVector3DTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSunVector3DTool_SunVector3DToolNode(), this.getSunVector3DToolNode(), this.getSunVector3DToolNode_SunVector3DTool(), "sunVector3DToolNode", null, 0, 1, SunVector3DTool.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sunVector3DToolNodeEClass, SunVector3DToolNode.class, "SunVector3DToolNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSunVector3DToolNode_SunVector3DTool(), this.getSunVector3DTool(), this.getSunVector3DTool_SunVector3DToolNode(), "sunVector3DTool", null, 0, 1, SunVector3DToolNode.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(earthSurfaceUIUtilitiesEClass, EarthSurfaceUIUtilities.class, "EarthSurfaceUIUtilities", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getEarthSurfaceUIUtilities__GetSunLightColor__double(), this.getColor3f(), "getSunLightColor", 0, 1, !IS_UNIQUE, IS_ORDERED);
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
		  (sunVector3DToolEClass, 
		   source, 
		   new String[] {
			 "documentation", "*\nA 3D tool used to show the direction and intensity of the Sun."
		   });	
		addAnnotation
		  (getSunVector3DTool_VectorColor(), 
		   source, 
		   new String[] {
			 "documentation", " The vector color.",
			 "propertyCategory", "SUN_VECTOR_PROPERTIES"
		   });	
		addAnnotation
		  (getSunVector3DTool_VectorLength(), 
		   source, 
		   new String[] {
			 "documentation", " Length of the vector.",
			 "notify", "true",
			 "apogy_units", "m",
			 "propertyCategory", "SUN_VECTOR_PROPERTIES"
		   });	
		addAnnotation
		  (getSunVector3DTool_EndPointRadius(), 
		   source, 
		   new String[] {
			 "documentation", " Radius of sphere used as end point to vector.",
			 "notify", "true",
			 "apogy_units", "m",
			 "propertyCategory", "SUN_VECTOR_PROPERTIES"
		   });	
		addAnnotation
		  (getSunVector3DTool_SunIntensity(), 
		   source, 
		   new String[] {
			 "documentation", " The current sun intensity.",
			 "notify", "true",
			 "apogy_units", "W/m*m",
			 "property", "Readonly",
			 "propertyCategory", "SUN_VECTOR_LIGHT_PROPERTIES"
		   });	
		addAnnotation
		  (getSunVector3DTool_CurrentDayMaximumSunIntensity(), 
		   source, 
		   new String[] {
			 "documentation", " The current day maximum sun intensity.",
			 "notify", "true",
			 "apogy_units", "W/m*m",
			 "property", "Readonly",
			 "propertyCategory", "SUN_VECTOR_LIGHT_PROPERTIES"
		   });	
		addAnnotation
		  (getSunVector3DTool_CurrentSunIntensityPercentage(), 
		   source, 
		   new String[] {
			 "documentation", " The current sun intensity.",
			 "notify", "true",
			 "apogy_units", "%",
			 "property", "Readonly",
			 "propertyCategory", "SUN_VECTOR_LIGHT_PROPERTIES"
		   });	
		addAnnotation
		  (getSunVector3DTool_SunVector3DToolNode(), 
		   source, 
		   new String[] {
			 "documentation", " Topology Node associated with the tool.",
			 "notify", "true",
			 "children", "true",
			 "property", "Readonly",
			 "propertyCategory", "SUN_VECTOR_PROPERTIES"
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
