/**
 * Canadian Space Agency / Agence spatiale canadienne 2016 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.programs.javascript.impl;

import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;

import ca.gc.asc_csa.apogy.core.programs.javascript.ApogyCoreJavaScriptProgramsFactory;
import ca.gc.asc_csa.apogy.core.programs.javascript.ApogyCoreJavaScriptProgramsPackage;
import ca.gc.asc_csa.apogy.core.programs.javascript.JavaScriptProgram;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyCoreJavaScriptProgramsPackageImpl extends EPackageImpl implements ApogyCoreJavaScriptProgramsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaScriptProgramEClass = null;
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
	 * @see ca.gc.asc_csa.apogy.core.programs.javascript.ApogyCoreJavaScriptProgramsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ApogyCoreJavaScriptProgramsPackageImpl() {
		super(eNS_URI, ApogyCoreJavaScriptProgramsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ApogyCoreJavaScriptProgramsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ApogyCoreJavaScriptProgramsPackage init() {
		if (isInited) return (ApogyCoreJavaScriptProgramsPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCoreJavaScriptProgramsPackage.eNS_URI);

		// Obtain or create and register package
		ApogyCoreJavaScriptProgramsPackageImpl theApogyCoreJavaScriptProgramsPackage = (ApogyCoreJavaScriptProgramsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ApogyCoreJavaScriptProgramsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ApogyCoreJavaScriptProgramsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ApogyCoreInvocatorPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theApogyCoreJavaScriptProgramsPackage.createPackageContents();

		// Initialize created meta-data
		theApogyCoreJavaScriptProgramsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theApogyCoreJavaScriptProgramsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ApogyCoreJavaScriptProgramsPackage.eNS_URI, theApogyCoreJavaScriptProgramsPackage);
		return theApogyCoreJavaScriptProgramsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJavaScriptProgram() {
		return javaScriptProgramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJavaScriptProgram_ScriptPath() {
		return (EAttribute)javaScriptProgramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCoreJavaScriptProgramsFactory getApogyCoreJavaScriptProgramsFactory() {
		return (ApogyCoreJavaScriptProgramsFactory)getEFactoryInstance();
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
		javaScriptProgramEClass = createEClass(JAVA_SCRIPT_PROGRAM);
		createEAttribute(javaScriptProgramEClass, JAVA_SCRIPT_PROGRAM__SCRIPT_PATH);
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
		ApogyCoreInvocatorPackage theApogyCoreInvocatorPackage = (ApogyCoreInvocatorPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCoreInvocatorPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		javaScriptProgramEClass.getESuperTypes().add(theApogyCoreInvocatorPackage.getProgram());
		javaScriptProgramEClass.getESuperTypes().add(theApogyCoreInvocatorPackage.getOperationCallContainer());

		// Initialize classes, features, and operations; add parameters
		initEClass(javaScriptProgramEClass, JavaScriptProgram.class, "JavaScriptProgram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJavaScriptProgram_ScriptPath(), theEcorePackage.getEString(), "scriptPath", null, 0, 1, JavaScriptProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
			 "documentation", "Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Steve Monnier (steve.monnier@obeo.fr),\n    OBEO - Initial API and implementation",
			 "prefix", "ApogyCoreJavaScriptPrograms",
			 "childCreationExtenders", "true",
			 "extensibleProviderFactory", "true",
			 "multipleEditorPages", "false",
			 "copyrightText", "Canadian Space Agency / Agence spatiale canadienne 2016 Copyrights (c)",
			 "modelName", "ApogyCoreJavaScriptPrograms",
			 "suppressGenModelAnnotations", "false",
			 "modelDirectory", "/ca.gc.asc_csa.apogy.core.programs.javascript/src-generated",
			 "editDirectory", "/ca.gc.asc_csa.apogy.core.programs.javascript.edit/src-generated",
			 "basePackage", "ca.gc.asc_csa.apogy.core.programs"
		   });	
		addAnnotation
		  (javaScriptProgramEClass, 
		   source, 
		   new String[] {
			 "documentation", "A JavaScriptProgram is an entity that invokes Operation Calls on Variables through a JavaScript program file."
		   });
	}

} //ApogyCoreJavaScriptProgramsPackageImpl
