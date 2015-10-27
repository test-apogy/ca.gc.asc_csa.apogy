/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.programs.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.symphony.common.emf.Symphony__CommonEMFPackage;
import org.eclipse.symphony.core.invocator.Symphony__CoreInvocatorPackage;
import org.eclipse.symphony.core.programs.AbstractProgramRuntime;
import org.eclipse.symphony.core.programs.Symphony__CoreProgramsFactory;
import org.eclipse.symphony.core.programs.Symphony__CoreProgramsPackage;
import org.eclipse.symphony.core.programs.ProgramFacade;
import org.eclipse.symphony.core.programs.TimeInterval;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Symphony__CoreProgramsPackageImpl extends EPackageImpl implements Symphony__CoreProgramsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractProgramRuntimeEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programFacadeEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeIntervalEClass = null;

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
	 * @see org.eclipse.symphony.core.programs.Symphony__CoreProgramsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Symphony__CoreProgramsPackageImpl() {
		super(eNS_URI, Symphony__CoreProgramsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Symphony__CoreProgramsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Symphony__CoreProgramsPackage init() {
		if (isInited) return (Symphony__CoreProgramsPackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__CoreProgramsPackage.eNS_URI);

		// Obtain or create and register package
		Symphony__CoreProgramsPackageImpl theSymphony__CoreProgramsPackage = (Symphony__CoreProgramsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Symphony__CoreProgramsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Symphony__CoreProgramsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		Symphony__CoreInvocatorPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSymphony__CoreProgramsPackage.createPackageContents();

		// Initialize created meta-data
		theSymphony__CoreProgramsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSymphony__CoreProgramsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Symphony__CoreProgramsPackage.eNS_URI, theSymphony__CoreProgramsPackage);
		return theSymphony__CoreProgramsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractProgramRuntime() {
		return abstractProgramRuntimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractProgramRuntime_Program() {
		return (EReference)abstractProgramRuntimeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractProgramRuntime__Resume() {
		return abstractProgramRuntimeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractProgramRuntime__Suspend() {
		return abstractProgramRuntimeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractProgramRuntime__Terminate() {
		return abstractProgramRuntimeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractProgramRuntime__StepInto() {
		return abstractProgramRuntimeEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractProgramRuntime__StepOver() {
		return abstractProgramRuntimeEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractProgramRuntime__StepReturn() {
		return abstractProgramRuntimeEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProgramFacade() {
		return programFacadeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgramFacade_Session() {
		return (EReference)programFacadeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgramFacade_Variables() {
		return (EReference)programFacadeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProgramFacade__Exec__OperationCall() {
		return programFacadeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeInterval() {
		return timeIntervalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeInterval_StartTime() {
		return (EAttribute)timeIntervalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeInterval_EndTime() {
		return (EAttribute)timeIntervalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeInterval_Duration() {
		return (EAttribute)timeIntervalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__CoreProgramsFactory getSymphony__CoreProgramsFactory() {
		return (Symphony__CoreProgramsFactory)getEFactoryInstance();
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
		abstractProgramRuntimeEClass = createEClass(ABSTRACT_PROGRAM_RUNTIME);
		createEReference(abstractProgramRuntimeEClass, ABSTRACT_PROGRAM_RUNTIME__PROGRAM);
		createEOperation(abstractProgramRuntimeEClass, ABSTRACT_PROGRAM_RUNTIME___RESUME);
		createEOperation(abstractProgramRuntimeEClass, ABSTRACT_PROGRAM_RUNTIME___SUSPEND);
		createEOperation(abstractProgramRuntimeEClass, ABSTRACT_PROGRAM_RUNTIME___TERMINATE);
		createEOperation(abstractProgramRuntimeEClass, ABSTRACT_PROGRAM_RUNTIME___STEP_INTO);
		createEOperation(abstractProgramRuntimeEClass, ABSTRACT_PROGRAM_RUNTIME___STEP_OVER);
		createEOperation(abstractProgramRuntimeEClass, ABSTRACT_PROGRAM_RUNTIME___STEP_RETURN);

		programFacadeEClass = createEClass(PROGRAM_FACADE);
		createEReference(programFacadeEClass, PROGRAM_FACADE__SESSION);
		createEReference(programFacadeEClass, PROGRAM_FACADE__VARIABLES);
		createEOperation(programFacadeEClass, PROGRAM_FACADE___EXEC__OPERATIONCALL);

		timeIntervalEClass = createEClass(TIME_INTERVAL);
		createEAttribute(timeIntervalEClass, TIME_INTERVAL__START_TIME);
		createEAttribute(timeIntervalEClass, TIME_INTERVAL__END_TIME);
		createEAttribute(timeIntervalEClass, TIME_INTERVAL__DURATION);
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
		Symphony__CoreInvocatorPackage theSymphony__CoreInvocatorPackage = (Symphony__CoreInvocatorPackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__CoreInvocatorPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		Symphony__CommonEMFPackage theSymphony__CommonEMFPackage = (Symphony__CommonEMFPackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__CommonEMFPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(abstractProgramRuntimeEClass, AbstractProgramRuntime.class, "AbstractProgramRuntime", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractProgramRuntime_Program(), theSymphony__CoreInvocatorPackage.getProgram(), null, "program", null, 0, 1, AbstractProgramRuntime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getAbstractProgramRuntime__Resume(), null, "resume", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getAbstractProgramRuntime__Suspend(), null, "suspend", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getAbstractProgramRuntime__Terminate(), null, "terminate", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getAbstractProgramRuntime__StepInto(), null, "stepInto", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getAbstractProgramRuntime__StepOver(), null, "stepOver", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getAbstractProgramRuntime__StepReturn(), null, "stepReturn", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(programFacadeEClass, ProgramFacade.class, "ProgramFacade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProgramFacade_Session(), theSymphony__CoreInvocatorPackage.getInvocatorSession(), null, "session", null, 0, 1, ProgramFacade.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProgramFacade_Variables(), theSymphony__CoreInvocatorPackage.getVariable(), null, "variables", null, 0, -1, ProgramFacade.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getProgramFacade__Exec__OperationCall(), theEcorePackage.getEJavaObject(), "exec", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSymphony__CoreInvocatorPackage.getOperationCall(), "operationCall", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, theSymphony__CommonEMFPackage.getException());

		initEClass(timeIntervalEClass, TimeInterval.class, "TimeInterval", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeInterval_StartTime(), theEcorePackage.getELong(), "startTime", null, 0, 1, TimeInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeInterval_EndTime(), theEcorePackage.getELong(), "endTime", null, 0, 1, TimeInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeInterval_Duration(), theEcorePackage.getELong(), "duration", null, 0, 1, TimeInterval.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Symphony__CoreProgramsPackageImpl
