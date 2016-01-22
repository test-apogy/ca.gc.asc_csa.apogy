/**
 * Canadian Space Agency / Agence spatiale canadienne 2015-2016 Copyrights (c)
 */
package org.eclipse.symphony.examples.satellite.ui.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.symphony.core.invocator.Symphony__CoreInvocatorPackage;
import org.eclipse.symphony.examples.satellite.ui.Symphony__ExamplesSatelliteUiFacade;
import org.eclipse.symphony.examples.satellite.ui.Symphony__ExamplesSatelliteUiFactory;
import org.eclipse.symphony.examples.satellite.ui.Symphony__ExamplesSatelliteUiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Symphony__ExamplesSatelliteUiPackageImpl extends EPackageImpl implements Symphony__ExamplesSatelliteUiPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass symphony__ExamplesSatelliteUiFacadeEClass = null;

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
	 * @see org.eclipse.symphony.examples.satellite.ui.Symphony__ExamplesSatelliteUiPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Symphony__ExamplesSatelliteUiPackageImpl() {
		super(eNS_URI, Symphony__ExamplesSatelliteUiFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Symphony__ExamplesSatelliteUiPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Symphony__ExamplesSatelliteUiPackage init() {
		if (isInited) return (Symphony__ExamplesSatelliteUiPackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__ExamplesSatelliteUiPackage.eNS_URI);

		// Obtain or create and register package
		Symphony__ExamplesSatelliteUiPackageImpl theSymphony__ExamplesSatelliteUiPackage = (Symphony__ExamplesSatelliteUiPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Symphony__ExamplesSatelliteUiPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Symphony__ExamplesSatelliteUiPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		Symphony__CoreInvocatorPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSymphony__ExamplesSatelliteUiPackage.createPackageContents();

		// Initialize created meta-data
		theSymphony__ExamplesSatelliteUiPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSymphony__ExamplesSatelliteUiPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Symphony__ExamplesSatelliteUiPackage.eNS_URI, theSymphony__ExamplesSatelliteUiPackage);
		return theSymphony__ExamplesSatelliteUiPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSymphony__ExamplesSatelliteUiFacade() {
		return symphony__ExamplesSatelliteUiFacadeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSymphony__ExamplesSatelliteUiFacade_ConstellationVariableName() {
		return (EAttribute)symphony__ExamplesSatelliteUiFacadeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymphony__ExamplesSatelliteUiFacade__GetConstellationVariable() {
		return symphony__ExamplesSatelliteUiFacadeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymphony__ExamplesSatelliteUiFacade__GetOperationCallResultsList() {
		return symphony__ExamplesSatelliteUiFacadeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__ExamplesSatelliteUiFactory getSymphony__ExamplesSatelliteUiFactory() {
		return (Symphony__ExamplesSatelliteUiFactory)getEFactoryInstance();
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
		symphony__ExamplesSatelliteUiFacadeEClass = createEClass(SYMPHONY_EXAMPLES_SATELLITE_UI_FACADE);
		createEAttribute(symphony__ExamplesSatelliteUiFacadeEClass, SYMPHONY_EXAMPLES_SATELLITE_UI_FACADE__CONSTELLATION_VARIABLE_NAME);
		createEOperation(symphony__ExamplesSatelliteUiFacadeEClass, SYMPHONY_EXAMPLES_SATELLITE_UI_FACADE___GET_CONSTELLATION_VARIABLE);
		createEOperation(symphony__ExamplesSatelliteUiFacadeEClass, SYMPHONY_EXAMPLES_SATELLITE_UI_FACADE___GET_OPERATION_CALL_RESULTS_LIST);
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
		Symphony__CoreInvocatorPackage theSymphony__CoreInvocatorPackage = (Symphony__CoreInvocatorPackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__CoreInvocatorPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(symphony__ExamplesSatelliteUiFacadeEClass, Symphony__ExamplesSatelliteUiFacade.class, "Symphony__ExamplesSatelliteUiFacade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSymphony__ExamplesSatelliteUiFacade_ConstellationVariableName(), theEcorePackage.getEString(), "constellationVariableName", "constellation", 0, 1, Symphony__ExamplesSatelliteUiFacade.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getSymphony__ExamplesSatelliteUiFacade__GetConstellationVariable(), theSymphony__CoreInvocatorPackage.getVariable(), "getConstellationVariable", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getSymphony__ExamplesSatelliteUiFacade__GetOperationCallResultsList(), theSymphony__CoreInvocatorPackage.getOperationCallResultsList(), "getOperationCallResultsList", 0, 1, !IS_UNIQUE, IS_ORDERED);

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
			 "prefix", "Symphony__ExamplesSatelliteUi",
			 "copyrightText", "Canadian Space Agency / Agence spatiale canadienne 2015-2016 Copyrights (c)",
			 "modelName", "Symphony__ExamplesSatelliteUi",
			 "childCreationExtenders", "true",
			 "extensibleProviderFactory", "true",
			 "suppressGenModelAnnotations", "false",
			 "modelDirectory", "/org.eclipse.symphony.examples.satellite.ui/src-generated",
			 "editDirectory", "/org.eclipse.symphony.examples.satellite.ui.edit/src-generated",
			 "basePackage", "org.eclipse.symphony.examples.satellite"
		   });	
		addAnnotation
		  (symphony__ExamplesSatelliteUiFacadeEClass, 
		   source, 
		   new String[] {
			 "documentation", "Constellation Facade.  This class provides utility methods."
		   });	
		addAnnotation
		  (getSymphony__ExamplesSatelliteUiFacade__GetConstellationVariable(), 
		   source, 
		   new String[] {
			 "documentation", "Returns the reference to the Constellation {@link Variable} in the active session.\n@return Reference to the Constellation {@link Variable}."
		   });	
		addAnnotation
		  (getSymphony__ExamplesSatelliteUiFacade__GetOperationCallResultsList(), 
		   source, 
		   new String[] {
			 "documentation", "Returns the reference to the {@link OperationCallResultsList} in the active session that may contain\nconstellation data products.\n@return Reference to the {@link OperationCallResultsList}."
		   });	
		addAnnotation
		  (getSymphony__ExamplesSatelliteUiFacade_ConstellationVariableName(), 
		   source, 
		   new String[] {
			 "documentation", "Returns the name of the constellation {@link Variable}."
		   });
	}

} //Symphony__ExamplesSatelliteUiPackageImpl
