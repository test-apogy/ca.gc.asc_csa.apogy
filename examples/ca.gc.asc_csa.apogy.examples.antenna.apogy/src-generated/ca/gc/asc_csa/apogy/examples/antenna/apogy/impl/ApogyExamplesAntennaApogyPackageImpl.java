package ca.gc.asc_csa.apogy.examples.antenna.apogy.impl;
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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import ca.gc.asc_csa.apogy.addons.sensors.fov.ApogyAddonsSensorsFOVPackage;
import ca.gc.asc_csa.apogy.core.ApogyCorePackage;
import ca.gc.asc_csa.apogy.examples.antenna.apogy.PTUDishAntennaData;
import ca.gc.asc_csa.apogy.examples.antenna.apogy.PTUDishAntennaApogySystemApiAdapter;
import ca.gc.asc_csa.apogy.examples.antenna.apogy.ApogyExamplesAntennaApogyFactory;
import ca.gc.asc_csa.apogy.examples.antenna.apogy.ApogyExamplesAntennaApogyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyExamplesAntennaApogyPackageImpl extends EPackageImpl implements ApogyExamplesAntennaApogyPackage
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass ptuDishAntennaApogySystemApiAdapterEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass ptuDishAntennaDataEClass = null;

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
	 * @see ca.gc.asc_csa.apogy.examples.antenna.apogy.ApogyExamplesAntennaApogyPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
  private ApogyExamplesAntennaApogyPackageImpl()
  {
		super(eNS_URI, ApogyExamplesAntennaApogyFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ApogyExamplesAntennaApogyPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
  public static ApogyExamplesAntennaApogyPackage init()
  {
		if (isInited) return (ApogyExamplesAntennaApogyPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyExamplesAntennaApogyPackage.eNS_URI);

		// Obtain or create and register package
		ApogyExamplesAntennaApogyPackageImpl theApogyExamplesAntennaApogyPackage = (ApogyExamplesAntennaApogyPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ApogyExamplesAntennaApogyPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ApogyExamplesAntennaApogyPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ApogyCorePackage.eINSTANCE.eClass();
		ApogyAddonsSensorsFOVPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theApogyExamplesAntennaApogyPackage.createPackageContents();

		// Initialize created meta-data
		theApogyExamplesAntennaApogyPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theApogyExamplesAntennaApogyPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ApogyExamplesAntennaApogyPackage.eNS_URI, theApogyExamplesAntennaApogyPackage);
		return theApogyExamplesAntennaApogyPackage;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getPTUDishAntennaApogySystemApiAdapter()
  {
		return ptuDishAntennaApogySystemApiAdapterEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getPTUDishAntennaData()
  {
		return ptuDishAntennaDataEClass;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPTUDishAntennaData_Fov() {
		return (EReference)ptuDishAntennaDataEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getPTUDishAntennaData_PanAngle()
  {
		return (EAttribute)ptuDishAntennaDataEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getPTUDishAntennaData_TiltAngle()
  {
		return (EAttribute)ptuDishAntennaDataEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPTUDishAntennaData_TrackingSun() {
		return (EAttribute)ptuDishAntennaDataEClass.getEStructuralFeatures().get(3);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPTUDishAntennaData_Initialized() {
		return (EAttribute)ptuDishAntennaDataEClass.getEStructuralFeatures().get(4);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyExamplesAntennaApogyFactory getApogyExamplesAntennaApogyFactory() {
		return (ApogyExamplesAntennaApogyFactory)getEFactoryInstance();
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
  public void createPackageContents()
  {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		ptuDishAntennaApogySystemApiAdapterEClass = createEClass(PTU_DISH_ANTENNA_APOGY_SYSTEM_API_ADAPTER);

		ptuDishAntennaDataEClass = createEClass(PTU_DISH_ANTENNA_DATA);
		createEReference(ptuDishAntennaDataEClass, PTU_DISH_ANTENNA_DATA__FOV);
		createEAttribute(ptuDishAntennaDataEClass, PTU_DISH_ANTENNA_DATA__PAN_ANGLE);
		createEAttribute(ptuDishAntennaDataEClass, PTU_DISH_ANTENNA_DATA__TILT_ANGLE);
		createEAttribute(ptuDishAntennaDataEClass, PTU_DISH_ANTENNA_DATA__TRACKING_SUN);
		createEAttribute(ptuDishAntennaDataEClass, PTU_DISH_ANTENNA_DATA__INITIALIZED);
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
  public void initializePackageContents()
  {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ApogyCorePackage theApogyCorePackage = (ApogyCorePackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCorePackage.eNS_URI);
		ApogyAddonsSensorsFOVPackage theApogyAddonsSensorsFOVPackage = (ApogyAddonsSensorsFOVPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyAddonsSensorsFOVPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		ptuDishAntennaApogySystemApiAdapterEClass.getESuperTypes().add(theApogyCorePackage.getApogySystemApiAdapter());
		ptuDishAntennaDataEClass.getESuperTypes().add(theApogyCorePackage.getApogyInitializationData());

		// Initialize classes, features, and operations; add parameters
		initEClass(ptuDishAntennaApogySystemApiAdapterEClass, PTUDishAntennaApogySystemApiAdapter.class, "PTUDishAntennaApogySystemApiAdapter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ptuDishAntennaDataEClass, PTUDishAntennaData.class, "PTUDishAntennaData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPTUDishAntennaData_Fov(), theApogyAddonsSensorsFOVPackage.getConicalFieldOfView(), null, "fov", null, 1, 1, PTUDishAntennaData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPTUDishAntennaData_PanAngle(), theEcorePackage.getEDouble(), "panAngle", null, 0, 1, PTUDishAntennaData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPTUDishAntennaData_TiltAngle(), theEcorePackage.getEDouble(), "tiltAngle", null, 0, 1, PTUDishAntennaData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPTUDishAntennaData_TrackingSun(), theEcorePackage.getEBoolean(), "trackingSun", "false", 0, 1, PTUDishAntennaData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPTUDishAntennaData_Initialized(), theEcorePackage.getEBoolean(), "initialized", "false", 0, 1, PTUDishAntennaData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
			 "prefix", "ApogyExamplesAntennaApogy",
			 "copyrightText", "Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015",
			 "modelName", "ApogyExamplesAntennaApogy",
			 "childCreationExtenders", "true",
			 "extensibleProviderFactory", "true",
			 "suppressGenModelAnnotations", "false",
			 "modelDirectory", "/ca.gc.asc_csa.apogy.examples.antenna.apogy/src-generated",
			 "editDirectory", "/ca.gc.asc_csa.apogy.examples.antenna.apogy.edit/src-generated",
			 "basePackage", "ca.gc.asc_csa.apogy.examples.antenna"
		   });	
		addAnnotation
		  (ptuDishAntennaApogySystemApiAdapterEClass, 
		   source, 
		   new String[] {
			 "documentation", "This class is the specialized Apogy API adapter, used for connecting\nthe existing PTU dish antenna example, located at\n{@link ca.gc.asc_csa.apogy.examples.antenna.PTUDishAntenna},\nto Apogy; one can override the well-known callback functions to make\nApogy perform a variety of useful functions, including initialization,\ndisposal and other features."
		   });	
		addAnnotation
		  (ptuDishAntennaDataEClass, 
		   source, 
		   new String[] {
			 "documentation", "This class specifies the initialization data that Apogy\nshould be interested in when (re)initializing the PTU dish\nantenna with the API Adapter (which in this case is\n{ca.gc.asc_csa.apogy.examples.antenna.apogy.PTUDishAntennaApogySystemApiAdapter})"
		   });	
		addAnnotation
		  (getPTUDishAntennaData_Fov(), 
		   source, 
		   new String[] {
			 "documentation", "This is the dish antenna\'s current field of view (FOV).",
			 "notify", "true",
			 "property", "Editable",
			 "propertyCategory", "Field Of View"
		   });	
		addAnnotation
		  (getPTUDishAntennaData_PanAngle(), 
		   source, 
		   new String[] {
			 "documentation", "This is the current pan angle of the dish antenna\'s\nPan-Tilt Unit (PTU).",
			 "apogy_units", "rad",
			 "notify", "true",
			 "property", "Editable",
			 "propertyCategory", "Pan-Tilt Unit"
		   });	
		addAnnotation
		  (getPTUDishAntennaData_TiltAngle(), 
		   source, 
		   new String[] {
			 "documentation", "This is the current tilt angle of the dish antenna\'s\nPan-Tilt Unit (PTU).",
			 "apogy_units", "rad",
			 "notify", "true",
			 "property", "Editable",
			 "propertyCategory", "Pan-Tilt Unit"
		   });	
		addAnnotation
		  (getPTUDishAntennaData_TrackingSun(), 
		   source, 
		   new String[] {
			 "documentation", "This is whether or not the dish antenna\'s Pan-Tilt Unit (PTU)\nis tracking the sun",
			 "notify", "true",
			 "property", "Editable",
			 "propertyCategory", "Status"
		   });	
		addAnnotation
		  (getPTUDishAntennaData_Initialized(), 
		   source, 
		   new String[] {
			 "documentation", "This is whether or not the dish antenna has been initialized",
			 "notify", "true",
			 "property", "Editable",
			 "propertyCategory", "Status"
		   });
	}

} //ApogyExamplesAntennaApogyPackageImpl
