/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.processors.impl;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.symphony.common.processors.JobProcessorsChain;
import org.eclipse.symphony.common.processors.Symphony__CommonProcessorsFactory;
import org.eclipse.symphony.common.processors.Symphony__CommonProcessorsPackage;
import org.eclipse.symphony.common.processors.Monitorable;
import org.eclipse.symphony.common.processors.Processor;
import org.eclipse.symphony.common.processors.ProcessorsChain;
import org.eclipse.symphony.common.processors.VerboseProvider;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Symphony__CommonProcessorsPackageImpl extends EPackageImpl implements Symphony__CommonProcessorsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass monitorableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processorsChainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jobProcessorsChainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass verboseProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType iProgressMonitorEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType exceptionEDataType = null;

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
	 * @see org.eclipse.symphony.common.processors.Symphony__CommonProcessorsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Symphony__CommonProcessorsPackageImpl() {
		super(eNS_URI, Symphony__CommonProcessorsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Symphony__CommonProcessorsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Symphony__CommonProcessorsPackage init() {
		if (isInited) return (Symphony__CommonProcessorsPackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__CommonProcessorsPackage.eNS_URI);

		// Obtain or create and register package
		Symphony__CommonProcessorsPackageImpl theSymphony__CommonProcessorsPackage = (Symphony__CommonProcessorsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Symphony__CommonProcessorsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Symphony__CommonProcessorsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSymphony__CommonProcessorsPackage.createPackageContents();

		// Initialize created meta-data
		theSymphony__CommonProcessorsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSymphony__CommonProcessorsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Symphony__CommonProcessorsPackage.eNS_URI, theSymphony__CommonProcessorsPackage);
		return theSymphony__CommonProcessorsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMonitorable() {
		return monitorableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMonitorable_ProgressMonitor() {
		return (EAttribute)monitorableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessor() {
		return processorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessor_Input() {
		return (EAttribute)processorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessor_Output() {
		return (EAttribute)processorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcessor__Process__Object() {
		return processorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessorsChain() {
		return processorsChainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessorsChain_IntermediateResult() {
		return (EAttribute)processorsChainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessorsChain_RunningProcessor() {
		return (EReference)processorsChainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessorsChain_Processors() {
		return (EReference)processorsChainEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJobProcessorsChain() {
		return jobProcessorsChainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVerboseProvider() {
		return verboseProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVerboseProvider_Verbose() {
		return (EAttribute)verboseProviderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVerboseProvider__PrintVerbose__String() {
		return verboseProviderEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIProgressMonitor() {
		return iProgressMonitorEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getException() {
		return exceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__CommonProcessorsFactory getSymphony__CommonProcessorsFactory() {
		return (Symphony__CommonProcessorsFactory)getEFactoryInstance();
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
		verboseProviderEClass = createEClass(VERBOSE_PROVIDER);
		createEAttribute(verboseProviderEClass, VERBOSE_PROVIDER__VERBOSE);
		createEOperation(verboseProviderEClass, VERBOSE_PROVIDER___PRINT_VERBOSE__STRING);

		monitorableEClass = createEClass(MONITORABLE);
		createEAttribute(monitorableEClass, MONITORABLE__PROGRESS_MONITOR);

		processorEClass = createEClass(PROCESSOR);
		createEAttribute(processorEClass, PROCESSOR__INPUT);
		createEAttribute(processorEClass, PROCESSOR__OUTPUT);
		createEOperation(processorEClass, PROCESSOR___PROCESS__OBJECT);

		processorsChainEClass = createEClass(PROCESSORS_CHAIN);
		createEAttribute(processorsChainEClass, PROCESSORS_CHAIN__INTERMEDIATE_RESULT);
		createEReference(processorsChainEClass, PROCESSORS_CHAIN__RUNNING_PROCESSOR);
		createEReference(processorsChainEClass, PROCESSORS_CHAIN__PROCESSORS);

		jobProcessorsChainEClass = createEClass(JOB_PROCESSORS_CHAIN);

		// Create data types
		iProgressMonitorEDataType = createEDataType(IPROGRESS_MONITOR);
		exceptionEDataType = createEDataType(EXCEPTION);
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

		// Create type parameters
		ETypeParameter processorEClass_I = addETypeParameter(processorEClass, "I");
		ETypeParameter processorEClass_O = addETypeParameter(processorEClass, "O");
		ETypeParameter processorsChainEClass_I = addETypeParameter(processorsChainEClass, "I");
		ETypeParameter processorsChainEClass_O = addETypeParameter(processorsChainEClass, "O");
		ETypeParameter jobProcessorsChainEClass_I = addETypeParameter(jobProcessorsChainEClass, "I");
		ETypeParameter jobProcessorsChainEClass_O = addETypeParameter(jobProcessorsChainEClass, "O");

		// Set bounds for type parameters

		// Add supertypes to classes
		processorEClass.getESuperTypes().add(this.getMonitorable());
		EGenericType g1 = createEGenericType(this.getProcessor());
		EGenericType g2 = createEGenericType(processorsChainEClass_I);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(processorsChainEClass_O);
		g1.getETypeArguments().add(g2);
		processorsChainEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getProcessorsChain());
		g2 = createEGenericType(jobProcessorsChainEClass_I);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(jobProcessorsChainEClass_O);
		g1.getETypeArguments().add(g2);
		jobProcessorsChainEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes, features, and operations; add parameters
		initEClass(verboseProviderEClass, VerboseProvider.class, "VerboseProvider", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVerboseProvider_Verbose(), theEcorePackage.getEBoolean(), "verbose", null, 0, 1, VerboseProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getVerboseProvider__PrintVerbose__String(), null, "printVerbose", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "message", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(monitorableEClass, Monitorable.class, "Monitorable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMonitorable_ProgressMonitor(), this.getIProgressMonitor(), "progressMonitor", null, 0, 1, Monitorable.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processorEClass, Processor.class, "Processor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(processorEClass_I);
		initEAttribute(getProcessor_Input(), g1, "input", null, 0, 1, Processor.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(processorEClass_O);
		initEAttribute(getProcessor_Output(), g1, "output", null, 0, 1, Processor.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getProcessor__Process__Object(), null, "process", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(processorEClass_I);
		addEParameter(op, g1, "input", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());
		g1 = createEGenericType(processorEClass_O);
		initEOperation(op, g1);

		initEClass(processorsChainEClass, ProcessorsChain.class, "ProcessorsChain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcessorsChain_IntermediateResult(), theEcorePackage.getEJavaObject(), "intermediateResult", null, 0, 1, ProcessorsChain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getProcessor());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEReference(getProcessorsChain_RunningProcessor(), g1, null, "runningProcessor", null, 1, 1, ProcessorsChain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getProcessor());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEReference(getProcessorsChain_Processors(), g1, null, "processors", null, 0, -1, ProcessorsChain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jobProcessorsChainEClass, JobProcessorsChain.class, "JobProcessorsChain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize data types
		initEDataType(iProgressMonitorEDataType, IProgressMonitor.class, "IProgressMonitor", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(exceptionEDataType, Exception.class, "Exception", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

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
			 "prefix", "Symphony__CommonProcessors",
			 "childCreationExtenders", "true",
			 "extensibleProviderFactory", "true",
			 "multipleEditorPages", "false",
			 "copyrightText", "Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)",
			 "modelName", "Symphony__CommonProcessors",
			 "suppressGenModelAnnotations", "false",
			 "modelDirectory", "/org.eclipse.symphony.common.processors/src-generated",
			 "editDirectory", "/org.eclipse.symphony.common.processors.edit/src-generated",
			 "basePackage", "org.eclipse.symphony.common"
		   });	
		addAnnotation
		  (monitorableEClass, 
		   source, 
		   new String[] {
			 "documentation", "Represent a object for which operation progress can be reported."
		   });	
		addAnnotation
		  (getMonitorable_ProgressMonitor(), 
		   source, 
		   new String[] {
			 "property", "None"
		   });	
		addAnnotation
		  (processorEClass, 
		   source, 
		   new String[] {
			 "documentation", "Defines an object that can process an input to get an output."
		   });
	}

} //Symphony__CommonProcessorsPackageImpl
