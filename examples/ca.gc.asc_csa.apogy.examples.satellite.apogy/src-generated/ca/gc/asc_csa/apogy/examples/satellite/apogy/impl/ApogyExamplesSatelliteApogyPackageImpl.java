package ca.gc.asc_csa.apogy.examples.satellite.apogy.impl;
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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import ca.gc.asc_csa.apogy.core.ApogyCorePackage;

import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage;
import ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage;
import ca.gc.asc_csa.apogy.examples.satellite.apogy.ConstellationData;
import ca.gc.asc_csa.apogy.examples.satellite.apogy.ConstellationSystemApiAdapter;
import ca.gc.asc_csa.apogy.examples.satellite.apogy.ApogyExamplesSatelliteApogyFactory;
import ca.gc.asc_csa.apogy.examples.satellite.apogy.ApogyExamplesSatelliteApogyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyExamplesSatelliteApogyPackageImpl extends EPackageImpl implements ApogyExamplesSatelliteApogyPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constellationSystemApiAdapterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constellationDataEClass = null;

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
	 * @see ca.gc.asc_csa.apogy.examples.satellite.apogy.ApogyExamplesSatelliteApogyPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ApogyExamplesSatelliteApogyPackageImpl() {
		super(eNS_URI, ApogyExamplesSatelliteApogyFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ApogyExamplesSatelliteApogyPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ApogyExamplesSatelliteApogyPackage init() {
		if (isInited) return (ApogyExamplesSatelliteApogyPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyExamplesSatelliteApogyPackage.eNS_URI);

		// Obtain or create and register package
		ApogyExamplesSatelliteApogyPackageImpl theApogyExamplesSatelliteApogyPackage = (ApogyExamplesSatelliteApogyPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ApogyExamplesSatelliteApogyPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ApogyExamplesSatelliteApogyPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ApogyExamplesSatellitePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theApogyExamplesSatelliteApogyPackage.createPackageContents();

		// Initialize created meta-data
		theApogyExamplesSatelliteApogyPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theApogyExamplesSatelliteApogyPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ApogyExamplesSatelliteApogyPackage.eNS_URI, theApogyExamplesSatelliteApogyPackage);
		return theApogyExamplesSatelliteApogyPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstellationSystemApiAdapter() {
		return constellationSystemApiAdapterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstellationData() {
		return constellationDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstellationData_SatellitesList() {
		return (EReference)constellationDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstellationData_GroundStationsReferencesList() {
		return (EReference)constellationDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstellationData_DownlinksLists() {
		return (EReference)constellationDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstellationData_ConstellationRequestsList() {
		return (EReference)constellationDataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyExamplesSatelliteApogyFactory getApogyExamplesSatelliteApogyFactory() {
		return (ApogyExamplesSatelliteApogyFactory)getEFactoryInstance();
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
		constellationSystemApiAdapterEClass = createEClass(CONSTELLATION_SYSTEM_API_ADAPTER);

		constellationDataEClass = createEClass(CONSTELLATION_DATA);
		createEReference(constellationDataEClass, CONSTELLATION_DATA__SATELLITES_LIST);
		createEReference(constellationDataEClass, CONSTELLATION_DATA__GROUND_STATIONS_REFERENCES_LIST);
		createEReference(constellationDataEClass, CONSTELLATION_DATA__DOWNLINKS_LISTS);
		createEReference(constellationDataEClass, CONSTELLATION_DATA__CONSTELLATION_REQUESTS_LIST);
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
		ApogyCorePackage theApogyCorePackage = (ApogyCorePackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCorePackage.eNS_URI);
		ApogyExamplesSatellitePackage theApogyExamplesSatellitePackage = (ApogyExamplesSatellitePackage)EPackage.Registry.INSTANCE.getEPackage(ApogyExamplesSatellitePackage.eNS_URI);
		ApogyCoreEnvironmentOrbitEarthPackage theApogyCoreEnvironmentOrbitEarthPackage = (ApogyCoreEnvironmentOrbitEarthPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCoreEnvironmentOrbitEarthPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		constellationSystemApiAdapterEClass.getESuperTypes().add(theApogyCorePackage.getApogySystemApiAdapter());
		constellationDataEClass.getESuperTypes().add(theApogyCorePackage.getApogyInitializationData());

		// Initialize classes, features, and operations; add parameters
		initEClass(constellationSystemApiAdapterEClass, ConstellationSystemApiAdapter.class, "ConstellationSystemApiAdapter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(constellationDataEClass, ConstellationData.class, "ConstellationData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstellationData_SatellitesList(), theApogyExamplesSatellitePackage.getSatellitesList(), null, "satellitesList", null, 0, 1, ConstellationData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstellationData_GroundStationsReferencesList(), theApogyCoreEnvironmentOrbitEarthPackage.getGroundStationReferencesList(), null, "groundStationsReferencesList", null, 0, 1, ConstellationData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstellationData_DownlinksLists(), theApogyExamplesSatellitePackage.getConstellationDownlinksList(), null, "downlinksLists", null, 0, 1, ConstellationData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstellationData_ConstellationRequestsList(), theApogyExamplesSatellitePackage.getConstellationRequestsList(), null, "constellationRequestsList", null, 0, 1, ConstellationData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
			 "prefix", "ApogyExamplesSatelliteApogy",
			 "copyrightText", "Copyright (c) 2015-2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Pierre Allard (Pierre.Allard@canada.ca), \n    Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n    Sebastien Gemme (Sebastien.Gemme@canada.ca),\n    Canadian Space Agency (CSA) - Initial API and implementation",
			 "modelName", "ApogyExamplesSatelliteApogy",
			 "childCreationExtenders", "true",
			 "extensibleProviderFactory", "true",
			 "suppressGenModelAnnotations", "false",
			 "dynamicTemplates", "true",
			 "templateDirectory", "platform:/plugin/ca.gc.asc_csa.apogy.common.emf/templates",
			 "modelDirectory", "/ca.gc.asc_csa.apogy.examples.satellite.apogy/src-generated",
			 "editDirectory", "/ca.gc.asc_csa.apogy.examples.satellite.apogy.edit/src-generated",
			 "basePackage", "ca.gc.asc_csa.apogy.examples.satellite"
		   });	
		addAnnotation
		  (constellationSystemApiAdapterEClass, 
		   source, 
		   new String[] {
			 "documentation", "This class is the specialized Apogy API adapter, used for connecting\nthe existing constellation example, located at\n{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellation},\nto Apogy; one can override the well-known callback functions to make\nApogy perform a variety of useful functions, including initialization,\ndisposal and other features."
		   });	
		addAnnotation
		  (constellationDataEClass, 
		   source, 
		   new String[] {
			 "documentation", "This class is the specialized data structure which is used to essentially\nsave and later restore the state of the component; this functionality is\nimplemented by the apply() (load) and collect() (save) methods of the constellation\'s\nAPI adapter,\nwhich is {@link ca.gc.asc_csa.apogy.examples.satellite.apogy.ConstellationApogySystemApiAdapter}."
		   });	
		addAnnotation
		  (getConstellationData_SatellitesList(), 
		   source, 
		   new String[] {
			 "documentation", "List of the constellation {@link Satellite}."
		   });	
		addAnnotation
		  (getConstellationData_GroundStationsReferencesList(), 
		   source, 
		   new String[] {
			 "documentation", "List of the {@link GroundStation}."
		   });	
		addAnnotation
		  (getConstellationData_DownlinksLists(), 
		   source, 
		   new String[] {
			 "documentation", "List of {@link ConstellationDownlinkList} used to store {@link ConstellationDownlink}."
		   });	
		addAnnotation
		  (getConstellationData_ConstellationRequestsList(), 
		   source, 
		   new String[] {
			 "documentation", "List of {@link AbstractConstellationRequest}."
		   });
	}

} //ApogyExamplesSatelliteApogyPackageImpl
