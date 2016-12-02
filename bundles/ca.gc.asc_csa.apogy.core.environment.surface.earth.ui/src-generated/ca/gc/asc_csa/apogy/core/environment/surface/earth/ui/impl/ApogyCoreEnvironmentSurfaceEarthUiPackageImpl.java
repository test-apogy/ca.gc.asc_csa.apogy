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
package ca.gc.asc_csa.apogy.core.environment.surface.earth.ui.impl;

import ca.gc.asc_csa.apogy.core.environment.surface.earth.ui.ApogyCoreEnvironmentSurfaceEarthUiFacade;
import ca.gc.asc_csa.apogy.core.environment.surface.earth.ui.ApogyCoreEnvironmentSurfaceEarthUiFactory;
import ca.gc.asc_csa.apogy.core.environment.surface.earth.ui.ApogyCoreEnvironmentSurfaceEarthUiPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyCoreEnvironmentSurfaceEarthUiPackageImpl extends EPackageImpl implements ApogyCoreEnvironmentSurfaceEarthUiPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apogyCoreEnvironmentSurfaceEarthUiFacadeEClass = null;

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
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.earth.ui.ApogyCoreEnvironmentSurfaceEarthUiPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ApogyCoreEnvironmentSurfaceEarthUiPackageImpl() {
		super(eNS_URI, ApogyCoreEnvironmentSurfaceEarthUiFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ApogyCoreEnvironmentSurfaceEarthUiPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ApogyCoreEnvironmentSurfaceEarthUiPackage init() {
		if (isInited) return (ApogyCoreEnvironmentSurfaceEarthUiPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCoreEnvironmentSurfaceEarthUiPackage.eNS_URI);

		// Obtain or create and register package
		ApogyCoreEnvironmentSurfaceEarthUiPackageImpl theApogyCoreEnvironmentSurfaceEarthUiPackage = (ApogyCoreEnvironmentSurfaceEarthUiPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ApogyCoreEnvironmentSurfaceEarthUiPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ApogyCoreEnvironmentSurfaceEarthUiPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theApogyCoreEnvironmentSurfaceEarthUiPackage.createPackageContents();

		// Initialize created meta-data
		theApogyCoreEnvironmentSurfaceEarthUiPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theApogyCoreEnvironmentSurfaceEarthUiPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ApogyCoreEnvironmentSurfaceEarthUiPackage.eNS_URI, theApogyCoreEnvironmentSurfaceEarthUiPackage);
		return theApogyCoreEnvironmentSurfaceEarthUiPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApogyCoreEnvironmentSurfaceEarthUiFacade() {
		return apogyCoreEnvironmentSurfaceEarthUiFacadeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCoreEnvironmentSurfaceEarthUiFactory getApogyCoreEnvironmentSurfaceEarthUiFactory() {
		return (ApogyCoreEnvironmentSurfaceEarthUiFactory)getEFactoryInstance();
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
		apogyCoreEnvironmentSurfaceEarthUiFacadeEClass = createEClass(APOGY_CORE_ENVIRONMENT_SURFACE_EARTH_UI_FACADE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(apogyCoreEnvironmentSurfaceEarthUiFacadeEClass, ApogyCoreEnvironmentSurfaceEarthUiFacade.class, "ApogyCoreEnvironmentSurfaceEarthUiFacade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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
			 "prefix", "ApogyCoreEnvironmentSurfaceEarthUi",
			 "childCreationExtenders", "true",
			 "extensibleProviderFactory", "true",
			 "multipleEditorPages", "false",
			 "copyrightText", "Copyright (c) 2015-2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Pierre Allard (Pierre.Allard@canada.ca), \n    Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n    Sebastien Gemme (Sebastien.Gemme@canada.ca),\n    Canadian Space Agency (CSA) - Initial API and implementation",
			 "modelName", "ApogyCoreEnvironmentSurfaceEarthUi",
			 "complianceLevel", "8.0",
			 "suppressGenModelAnnotations", "false",
			 "dynamicTemplates", "true",
			 "templateDirectory", "platform:/plugin/ca.gc.asc_csa.apogy.common.emf.templates",
			 "modelDirectory", "/ca.gc.asc_csa.apogy.core.environment.surface.earth.ui/src-generated",
			 "editDirectory", "/ca.gc.asc_csa.apogy.core.environment.surface.earth.ui/src-generated",
			 "basePackage", "ca.gc.asc_csa.apogy.core.environment.surface.earth"
		   });	
		addAnnotation
		  (apogyCoreEnvironmentSurfaceEarthUiFacadeEClass, 
		   source, 
		   new String[] {
			 "documentation", "Apogy Environment Surface Earth UI Facade (Singleton)."
		   });
	}

} //ApogyCoreEnvironmentSurfaceEarthUiPackageImpl
