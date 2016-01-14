/**
 * Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015-2016
 */
package org.eclipse.symphony.examples.satellite.symphony.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.symphony.core.Symphony__CorePackage;

import org.eclipse.symphony.core.environment.orbit.earth.Symphony__CoreEnvironmentOrbitEarthPackage;
import org.eclipse.symphony.examples.satellite.Symphony__ExamplesSatellitePackage;
import org.eclipse.symphony.examples.satellite.symphony.ConstellationData;
import org.eclipse.symphony.examples.satellite.symphony.ConstellationSystemApiAdapter;
import org.eclipse.symphony.examples.satellite.symphony.Symphony__ExamplesSatelliteSymphonyFactory;
import org.eclipse.symphony.examples.satellite.symphony.Symphony__ExamplesSatelliteSymphonyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Symphony__ExamplesSatelliteSymphonyPackageImpl extends EPackageImpl implements Symphony__ExamplesSatelliteSymphonyPackage {
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
	 * @see org.eclipse.symphony.examples.satellite.symphony.Symphony__ExamplesSatelliteSymphonyPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Symphony__ExamplesSatelliteSymphonyPackageImpl() {
		super(eNS_URI, Symphony__ExamplesSatelliteSymphonyFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Symphony__ExamplesSatelliteSymphonyPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Symphony__ExamplesSatelliteSymphonyPackage init() {
		if (isInited) return (Symphony__ExamplesSatelliteSymphonyPackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__ExamplesSatelliteSymphonyPackage.eNS_URI);

		// Obtain or create and register package
		Symphony__ExamplesSatelliteSymphonyPackageImpl theSymphony__ExamplesSatelliteSymphonyPackage = (Symphony__ExamplesSatelliteSymphonyPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Symphony__ExamplesSatelliteSymphonyPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Symphony__ExamplesSatelliteSymphonyPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		Symphony__ExamplesSatellitePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSymphony__ExamplesSatelliteSymphonyPackage.createPackageContents();

		// Initialize created meta-data
		theSymphony__ExamplesSatelliteSymphonyPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSymphony__ExamplesSatelliteSymphonyPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Symphony__ExamplesSatelliteSymphonyPackage.eNS_URI, theSymphony__ExamplesSatelliteSymphonyPackage);
		return theSymphony__ExamplesSatelliteSymphonyPackage;
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
	public Symphony__ExamplesSatelliteSymphonyFactory getSymphony__ExamplesSatelliteSymphonyFactory() {
		return (Symphony__ExamplesSatelliteSymphonyFactory)getEFactoryInstance();
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
		Symphony__CorePackage theSymphony__CorePackage = (Symphony__CorePackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__CorePackage.eNS_URI);
		Symphony__ExamplesSatellitePackage theSymphony__ExamplesSatellitePackage = (Symphony__ExamplesSatellitePackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__ExamplesSatellitePackage.eNS_URI);
		Symphony__CoreEnvironmentOrbitEarthPackage theSymphony__CoreEnvironmentOrbitEarthPackage = (Symphony__CoreEnvironmentOrbitEarthPackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__CoreEnvironmentOrbitEarthPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		constellationSystemApiAdapterEClass.getESuperTypes().add(theSymphony__CorePackage.getSymphonySystemApiAdapter());
		constellationDataEClass.getESuperTypes().add(theSymphony__CorePackage.getSymphonyInitializationData());

		// Initialize classes, features, and operations; add parameters
		initEClass(constellationSystemApiAdapterEClass, ConstellationSystemApiAdapter.class, "ConstellationSystemApiAdapter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(constellationDataEClass, ConstellationData.class, "ConstellationData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstellationData_SatellitesList(), theSymphony__ExamplesSatellitePackage.getSatellitesList(), null, "satellitesList", null, 0, 1, ConstellationData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstellationData_GroundStationsReferencesList(), theSymphony__CoreEnvironmentOrbitEarthPackage.getGroundStationReferencesList(), null, "groundStationsReferencesList", null, 0, 1, ConstellationData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstellationData_DownlinksLists(), theSymphony__ExamplesSatellitePackage.getConstellationDownlinksList(), null, "downlinksLists", null, 0, 1, ConstellationData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstellationData_ConstellationRequestsList(), theSymphony__ExamplesSatellitePackage.getConstellationRequestsList(), null, "constellationRequestsList", null, 0, 1, ConstellationData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
			 "prefix", "Symphony__ExamplesSatelliteSymphony",
			 "copyrightText", "Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015-2016",
			 "modelName", "Symphony__ExamplesSatelliteSymphony",
			 "childCreationExtenders", "true",
			 "extensibleProviderFactory", "true",
			 "suppressGenModelAnnotations", "false",
			 "modelDirectory", "/org.eclipse.symphony.examples.satellite.symphony/src-generated",
			 "editDirectory", "/org.eclipse.symphony.examples.satellite.symphony.edit/src-generated",
			 "basePackage", "org.eclipse.symphony.examples.satellite"
		   });	
		addAnnotation
		  (constellationSystemApiAdapterEClass, 
		   source, 
		   new String[] {
			 "documentation", "This class is the specialized Symphony API adapter, used for connecting\nthe existing constellation example, located at\n{@link org.eclipse.symphony.examples.satellite.AbstractConstellation},\nto Symphony; one can override the well-known callback functions to make\nSymphony perform a variety of useful functions, including initialization,\ndisposal and other features."
		   });	
		addAnnotation
		  (constellationDataEClass, 
		   source, 
		   new String[] {
			 "documentation", "This class is the specialized data structure which is used to essentially\nsave and later restore the state of the component; this functionality is\nimplemented by the apply() (load) and collect() (save) methods of the constellation\'s\nAPI adapter,\nwhich is {@link org.eclipse.symphony.examples.satellite.symphony.ConstellationSymphonySystemApiAdapter}."
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

} //Symphony__ExamplesSatelliteSymphonyPackageImpl
