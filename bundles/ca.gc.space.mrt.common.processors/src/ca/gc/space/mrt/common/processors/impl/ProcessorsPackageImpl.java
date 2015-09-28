/**
 * Canadian Space Agency 2007.
 *
 * $Id: ProcessorsPackageImpl.java,v 1.6.4.3 2015/06/01 17:21:48 pallard Exp $
 */
package ca.gc.space.mrt.common.processors.impl;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import ca.gc.space.mrt.common.processors.JobProcessorsChain;
import ca.gc.space.mrt.common.processors.Monitorable;
import ca.gc.space.mrt.common.processors.Processor;
import ca.gc.space.mrt.common.processors.ProcessorsChain;
import ca.gc.space.mrt.common.processors.ProcessorsFactory;
import ca.gc.space.mrt.common.processors.ProcessorsPackage;
import ca.gc.space.mrt.common.processors.VerboseProvider;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProcessorsPackageImpl extends EPackageImpl implements ProcessorsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Canadian Space Agency 2007.";

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
	 * @see ca.gc.space.mrt.common.processors.ProcessorsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ProcessorsPackageImpl() {
		super(eNS_URI, ProcessorsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ProcessorsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ProcessorsPackage init() {
		if (isInited) return (ProcessorsPackage)EPackage.Registry.INSTANCE.getEPackage(ProcessorsPackage.eNS_URI);

		// Obtain or create and register package
		ProcessorsPackageImpl theProcessorsPackage = (ProcessorsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ProcessorsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ProcessorsPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theProcessorsPackage.createPackageContents();

		// Initialize created meta-data
		theProcessorsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theProcessorsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ProcessorsPackage.eNS_URI, theProcessorsPackage);
		return theProcessorsPackage;
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
  public EOperation getProcessor__Process__Object()
  {
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
	public EReference getProcessorsChain_Processors() {
		return (EReference)processorsChainEClass.getEStructuralFeatures().get(2);
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
  public EOperation getVerboseProvider__PrintVerbose__String()
  {
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
	public ProcessorsFactory getProcessorsFactory() {
		return (ProcessorsFactory)getEFactoryInstance();
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

		verboseProviderEClass = createEClass(VERBOSE_PROVIDER);
		createEAttribute(verboseProviderEClass, VERBOSE_PROVIDER__VERBOSE);
		createEOperation(verboseProviderEClass, VERBOSE_PROVIDER___PRINT_VERBOSE__STRING);

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
		initEClass(monitorableEClass, Monitorable.class, "Monitorable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMonitorable_ProgressMonitor(), this.getIProgressMonitor(), "progressMonitor", null, 0, 1, Monitorable.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processorEClass, Processor.class, "Processor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(processorEClass_I);
		initEAttribute(getProcessor_Input(), g1, "input", null, 0, 1, Processor.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(processorEClass_O);
		initEAttribute(getProcessor_Output(), g1, "output", null, 0, 1, Processor.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getProcessor__Process__Object(), null, "process", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(processorEClass_I);
		addEParameter(op, g1, "input", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());
		g1 = createEGenericType(processorEClass_O);
		initEOperation(op, g1);

		initEClass(processorsChainEClass, ProcessorsChain.class, "ProcessorsChain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcessorsChain_IntermediateResult(), ecorePackage.getEJavaObject(), "intermediateResult", null, 0, 1, ProcessorsChain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
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

		initEClass(verboseProviderEClass, VerboseProvider.class, "VerboseProvider", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVerboseProvider_Verbose(), ecorePackage.getEBoolean(), "verbose", null, 0, 1, VerboseProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getVerboseProvider__PrintVerbose__String(), null, "printVerbose", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 0, 1, !IS_UNIQUE, IS_ORDERED);

		// Initialize data types
		initEDataType(iProgressMonitorEDataType, IProgressMonitor.class, "IProgressMonitor", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(exceptionEDataType, Exception.class, "Exception", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ProcessorsPackageImpl
