package ca.gc.asc_csa.apogy.addons.sensors.impl;
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
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import ca.gc.asc_csa.apogy.addons.sensors.Referenceable;
import ca.gc.asc_csa.apogy.addons.sensors.Sensor;
import ca.gc.asc_csa.apogy.addons.sensors.SensorStatus;
import ca.gc.asc_csa.apogy.addons.sensors.ApogyAddonsSensorsFactory;
import ca.gc.asc_csa.apogy.addons.sensors.ApogyAddonsSensorsPackage;

import ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyAddonsSensorsPackageImpl extends EPackageImpl implements ApogyAddonsSensorsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sensorStatusEEnum = null;

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
	 * @see ca.gc.asc_csa.apogy.addons.sensors.ApogyAddonsSensorsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ApogyAddonsSensorsPackageImpl() {
		super(eNS_URI, ApogyAddonsSensorsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ApogyAddonsSensorsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ApogyAddonsSensorsPackage init() {
		if (isInited) return (ApogyAddonsSensorsPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyAddonsSensorsPackage.eNS_URI);

		// Obtain or create and register package
		ApogyAddonsSensorsPackageImpl theApogyAddonsSensorsPackage = (ApogyAddonsSensorsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ApogyAddonsSensorsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ApogyAddonsSensorsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ApogyCommonTopologyPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theApogyAddonsSensorsPackage.createPackageContents();

		// Initialize created meta-data
		theApogyAddonsSensorsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theApogyAddonsSensorsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ApogyAddonsSensorsPackage.eNS_URI, theApogyAddonsSensorsPackage);
		return theApogyAddonsSensorsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSensor() {
		return sensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSensor_Status() {
		return (EAttribute)sensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferenceable() {
		return referenceableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferenceable_ReferenceFrame() {
		return (EReference)referenceableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSensorStatus() {
		return sensorStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyAddonsSensorsFactory getApogyAddonsSensorsFactory() {
		return (ApogyAddonsSensorsFactory)getEFactoryInstance();
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
		sensorEClass = createEClass(SENSOR);
		createEAttribute(sensorEClass, SENSOR__STATUS);

		referenceableEClass = createEClass(REFERENCEABLE);
		createEReference(referenceableEClass, REFERENCEABLE__REFERENCE_FRAME);

		// Create enums
		sensorStatusEEnum = createEEnum(SENSOR_STATUS);
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
		ApogyCommonTopologyPackage theApogyCommonTopologyPackage = (ApogyCommonTopologyPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCommonTopologyPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		sensorEClass.getESuperTypes().add(theApogyCommonTopologyPackage.getAggregateGroupNode());

		// Initialize classes, features, and operations; add parameters
		initEClass(sensorEClass, Sensor.class, "Sensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSensor_Status(), this.getSensorStatus(), "status", "OFF", 0, 1, Sensor.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referenceableEClass, Referenceable.class, "Referenceable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReferenceable_ReferenceFrame(), theApogyCommonTopologyPackage.getNode(), null, "referenceFrame", null, 0, 1, Referenceable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(sensorStatusEEnum, SensorStatus.class, "SensorStatus");
		addEEnumLiteral(sensorStatusEEnum, SensorStatus.OFF);
		addEEnumLiteral(sensorStatusEEnum, SensorStatus.READY);
		addEEnumLiteral(sensorStatusEEnum, SensorStatus.BUSY);
		addEEnumLiteral(sensorStatusEEnum, SensorStatus.FAILED);

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
			 "prefix", "ApogyAddonsSensors",
			 "childCreationExtenders", "true",
			 "extensibleProviderFactory", "true",
			 "multipleEditorPages", "false",
			 "copyrightText", "Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Pierre Allard (Pierre.Allard@canada.ca), \n    Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n    Sebastien Gemme (Sebastien.Gemme@canada.ca),\n    Canadian Space Agency (CSA) - Initial API and implementation",
			 "modelName", "ApogyAddonsSensors",
			 "suppressGenModelAnnotations", "false",
			 "modelDirectory", "/ca.gc.asc_csa.apogy.addons.sensors/src-generated",
			 "editDirectory", "/ca.gc.asc_csa.apogy.addons.sensors.edit/src-generated",
			 "basePackage", "ca.gc.asc_csa.apogy.addons"
		   });	
		addAnnotation
		  (sensorStatusEEnum, 
		   source, 
		   new String[] {
			 "documentation", "Represents the various states that a sensor could be in.\n * Typical status transitions :\n * Power up (nominal) : OFF -> BUSY (initialization) -> READY\nPower up (off-nominal) : OFF -> BUSY (initialization) -> FAILED\n * Data acquition (nominal): READY -> BUSY (Acquisition) -> READY\nData acquition (off-nominal): READY -> BUSY (Acquisition) -> FAILED"
		   });
	}

} //ApogyAddonsSensorsPackageImpl
