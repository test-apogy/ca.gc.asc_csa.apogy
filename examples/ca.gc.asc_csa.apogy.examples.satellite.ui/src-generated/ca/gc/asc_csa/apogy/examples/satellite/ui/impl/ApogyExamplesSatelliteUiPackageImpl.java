package ca.gc.asc_csa.apogy.examples.satellite.ui.impl;
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
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.examples.satellite.ui.ApogyExamplesSatelliteUiFacade;
import ca.gc.asc_csa.apogy.examples.satellite.ui.ApogyExamplesSatelliteUiFactory;
import ca.gc.asc_csa.apogy.examples.satellite.ui.ApogyExamplesSatelliteUiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyExamplesSatelliteUiPackageImpl extends EPackageImpl implements ApogyExamplesSatelliteUiPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apogyExamplesSatelliteUiFacadeEClass = null;
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
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ui.ApogyExamplesSatelliteUiPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ApogyExamplesSatelliteUiPackageImpl() {
		super(eNS_URI, ApogyExamplesSatelliteUiFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ApogyExamplesSatelliteUiPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ApogyExamplesSatelliteUiPackage init() {
		if (isInited) return (ApogyExamplesSatelliteUiPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyExamplesSatelliteUiPackage.eNS_URI);

		// Obtain or create and register package
		ApogyExamplesSatelliteUiPackageImpl theApogyExamplesSatelliteUiPackage = (ApogyExamplesSatelliteUiPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ApogyExamplesSatelliteUiPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ApogyExamplesSatelliteUiPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ApogyCoreInvocatorPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theApogyExamplesSatelliteUiPackage.createPackageContents();

		// Initialize created meta-data
		theApogyExamplesSatelliteUiPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theApogyExamplesSatelliteUiPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ApogyExamplesSatelliteUiPackage.eNS_URI, theApogyExamplesSatelliteUiPackage);
		return theApogyExamplesSatelliteUiPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApogyExamplesSatelliteUiFacade() {
		return apogyExamplesSatelliteUiFacadeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApogyExamplesSatelliteUiFacade_ConstellationVariableName() {
		return (EAttribute)apogyExamplesSatelliteUiFacadeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyExamplesSatelliteUiFacade__GetConstellationVariable() {
		return apogyExamplesSatelliteUiFacadeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyExamplesSatelliteUiFacade__GetOperationCallResultsList() {
		return apogyExamplesSatelliteUiFacadeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyExamplesSatelliteUiFactory getApogyExamplesSatelliteUiFactory() {
		return (ApogyExamplesSatelliteUiFactory)getEFactoryInstance();
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
		apogyExamplesSatelliteUiFacadeEClass = createEClass(APOGY_EXAMPLES_SATELLITE_UI_FACADE);
		createEAttribute(apogyExamplesSatelliteUiFacadeEClass, APOGY_EXAMPLES_SATELLITE_UI_FACADE__CONSTELLATION_VARIABLE_NAME);
		createEOperation(apogyExamplesSatelliteUiFacadeEClass, APOGY_EXAMPLES_SATELLITE_UI_FACADE___GET_CONSTELLATION_VARIABLE);
		createEOperation(apogyExamplesSatelliteUiFacadeEClass, APOGY_EXAMPLES_SATELLITE_UI_FACADE___GET_OPERATION_CALL_RESULTS_LIST);
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
		ApogyCoreInvocatorPackage theApogyCoreInvocatorPackage = (ApogyCoreInvocatorPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCoreInvocatorPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(apogyExamplesSatelliteUiFacadeEClass, ApogyExamplesSatelliteUiFacade.class, "ApogyExamplesSatelliteUiFacade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getApogyExamplesSatelliteUiFacade_ConstellationVariableName(), theEcorePackage.getEString(), "constellationVariableName", "constellation", 0, 1, ApogyExamplesSatelliteUiFacade.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getApogyExamplesSatelliteUiFacade__GetConstellationVariable(), theApogyCoreInvocatorPackage.getVariable(), "getConstellationVariable", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getApogyExamplesSatelliteUiFacade__GetOperationCallResultsList(), theApogyCoreInvocatorPackage.getOperationCallResultsList(), "getOperationCallResultsList", 0, 1, !IS_UNIQUE, IS_ORDERED);

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
			 "prefix", "ApogyExamplesSatelliteUi",
			 "copyrightText", "Copyright (c) 2015-2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Pierre Allard (Pierre.Allard@canada.ca), \n    Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n    Sebastien Gemme (Sebastien.Gemme@canada.ca),\n    Canadian Space Agency (CSA) - Initial API and implementation",
			 "modelName", "ApogyExamplesSatelliteUi",
			 "childCreationExtenders", "true",
			 "extensibleProviderFactory", "true",
			 "suppressGenModelAnnotations", "false",
			 "modelDirectory", "/ca.gc.asc_csa.apogy.examples.satellite.ui/src-generated",
			 "editDirectory", "/ca.gc.asc_csa.apogy.examples.satellite.ui.edit/src-generated",
			 "basePackage", "ca.gc.asc_csa.apogy.examples.satellite"
		   });	
		addAnnotation
		  (apogyExamplesSatelliteUiFacadeEClass, 
		   source, 
		   new String[] {
			 "documentation", "Constellation Facade.  This class provides utility methods."
		   });	
		addAnnotation
		  (getApogyExamplesSatelliteUiFacade__GetConstellationVariable(), 
		   source, 
		   new String[] {
			 "documentation", "Returns the reference to the Constellation {@link Variable} in the active session.\n@return Reference to the Constellation {@link Variable}."
		   });	
		addAnnotation
		  (getApogyExamplesSatelliteUiFacade__GetOperationCallResultsList(), 
		   source, 
		   new String[] {
			 "documentation", "Returns the reference to the {@link OperationCallResultsList} in the active session that may contain\nconstellation data products.\n@return Reference to the {@link OperationCallResultsList}."
		   });	
		addAnnotation
		  (getApogyExamplesSatelliteUiFacade_ConstellationVariableName(), 
		   source, 
		   new String[] {
			 "documentation", "Returns the name of the constellation {@link Variable}."
		   });
	}

} //ApogyExamplesSatelliteUiPackageImpl
